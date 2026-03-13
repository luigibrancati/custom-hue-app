package com.cloudwebrtc.webrtc.record;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Log;
import android.view.Surface;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import org.webrtc.audio.JavaAudioDeviceModule;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
class AudioFileRenderer implements JavaAudioDeviceModule.SamplesReadyCallback {
    private static final String TAG = "AudioFileRenderer";
    private MediaCodec.BufferInfo audioBufferInfo;
    private MediaCodec audioEncoder;
    private ByteBuffer[] audioInputBuffers;
    private ByteBuffer[] audioOutputBuffers;
    private final HandlerThread audioThread;
    private final Handler audioThreadHandler;
    private final MediaMuxer mediaMuxer;
    private int audioTrackIndex = -1;
    private boolean isRunning = true;
    private boolean audioEncoderStarted = false;
    private volatile boolean muxerStarted = false;
    private long presTime = 0;

    public AudioFileRenderer(String str) {
        HandlerThread handlerThread = new HandlerThread("AudioFileRendererAudioThread");
        this.audioThread = handlerThread;
        handlerThread.start();
        this.audioThreadHandler = new Handler(handlerThread.getLooper());
        this.mediaMuxer = new MediaMuxer(str, 0);
    }

    public static /* synthetic */ void a(AudioFileRenderer audioFileRenderer, JavaAudioDeviceModule.AudioSamples audioSamples) {
        audioFileRenderer.getClass();
        try {
            if (audioFileRenderer.isRunning) {
                if (audioFileRenderer.audioEncoder == null) {
                    audioFileRenderer.initializeAudioEncoder(audioSamples);
                }
                MediaCodec mediaCodec = audioFileRenderer.audioEncoder;
                if (mediaCodec != null && audioFileRenderer.audioEncoderStarted) {
                    int iDequeueInputBuffer = mediaCodec.dequeueInputBuffer(100L);
                    if (iDequeueInputBuffer >= 0) {
                        ByteBuffer byteBuffer = audioFileRenderer.audioInputBuffers[iDequeueInputBuffer];
                        byteBuffer.clear();
                        byte[] data = audioSamples.getData();
                        if (data.length <= byteBuffer.remaining()) {
                            byteBuffer.put(data);
                            long length = (((long) data.length) * 1000000) / ((long) ((audioSamples.getSampleRate() * 2) * audioSamples.getChannelCount()));
                            audioFileRenderer.audioEncoder.queueInputBuffer(iDequeueInputBuffer, 0, data.length, audioFileRenderer.presTime, 0);
                            audioFileRenderer.presTime += length;
                        } else {
                            Log.w(TAG, "Audio data too large for buffer: " + data.length + " bytes, buffer capacity: " + byteBuffer.remaining());
                            audioFileRenderer.audioEncoder.queueInputBuffer(iDequeueInputBuffer, 0, 0, audioFileRenderer.presTime, 0);
                        }
                    } else {
                        Log.w(TAG, "No input buffer available for audio data");
                    }
                    if (audioFileRenderer.isRunning) {
                        audioFileRenderer.drainAudio();
                        return;
                    }
                    return;
                }
                Log.e(TAG, "Failed to initialize audio encoder or encoder not started");
            }
        } catch (Exception e10) {
            Log.e(TAG, "Error processing audio samples", e10);
        }
    }

    public static /* synthetic */ void b(AudioFileRenderer audioFileRenderer, CountDownLatch countDownLatch) {
        Exception exc;
        audioFileRenderer.getClass();
        try {
            try {
                MediaCodec mediaCodec = audioFileRenderer.audioEncoder;
                if (mediaCodec != null && audioFileRenderer.audioEncoderStarted) {
                    try {
                        int iDequeueInputBuffer = mediaCodec.dequeueInputBuffer(10000L);
                        if (iDequeueInputBuffer >= 0) {
                            audioFileRenderer.audioEncoder.queueInputBuffer(iDequeueInputBuffer, 0, 0, 0L, 4);
                        }
                        audioFileRenderer.drainAudio();
                        audioFileRenderer.audioEncoder.stop();
                        audioFileRenderer.audioEncoderStarted = false;
                    } catch (Exception e10) {
                        Log.e(TAG, "Error stopping audio encoder", e10);
                    }
                }
                MediaCodec mediaCodec2 = audioFileRenderer.audioEncoder;
                if (mediaCodec2 != null) {
                    try {
                        mediaCodec2.release();
                    } catch (Exception e11) {
                        Log.e(TAG, "Error releasing audio encoder", e11);
                    }
                    audioFileRenderer.audioEncoder = null;
                }
                try {
                    if (audioFileRenderer.muxerStarted && audioFileRenderer.audioTrackIndex != -1) {
                        audioFileRenderer.mediaMuxer.stop();
                        audioFileRenderer.muxerStarted = false;
                    }
                    audioFileRenderer.mediaMuxer.release();
                } catch (Exception e12) {
                    Log.e(TAG, "Error stopping/releasing MediaMuxer", e12);
                }
                try {
                    audioFileRenderer.audioThread.quit();
                } catch (Exception e13) {
                    exc = e13;
                    Log.e(TAG, "Error quitting audio thread", exc);
                }
            } catch (Exception e14) {
                Log.e(TAG, "Error during release", e14);
                try {
                    audioFileRenderer.audioThread.quit();
                } catch (Exception e15) {
                    exc = e15;
                    Log.e(TAG, "Error quitting audio thread", exc);
                }
            }
            countDownLatch.countDown();
        } catch (Throwable th) {
            try {
                audioFileRenderer.audioThread.quit();
            } catch (Exception e16) {
                Log.e(TAG, "Error quitting audio thread", e16);
            }
            countDownLatch.countDown();
            throw th;
        }
    }

    private void drainAudio() {
        MediaCodec mediaCodec;
        int iDequeueOutputBuffer;
        int i10;
        if (this.audioBufferInfo == null) {
            this.audioBufferInfo = new MediaCodec.BufferInfo();
        }
        while (this.isRunning && (mediaCodec = this.audioEncoder) != null && (iDequeueOutputBuffer = mediaCodec.dequeueOutputBuffer(this.audioBufferInfo, 100L)) != -1) {
            if (iDequeueOutputBuffer == -3) {
                this.audioOutputBuffers = this.audioEncoder.getOutputBuffers();
                Log.w(TAG, "audio encoder output buffers changed");
            } else if (iDequeueOutputBuffer == -2) {
                MediaFormat outputFormat = this.audioEncoder.getOutputFormat();
                Log.i(TAG, "audio encoder output format changed: " + outputFormat);
                if (this.audioTrackIndex == -1) {
                    int iAddTrack = this.mediaMuxer.addTrack(outputFormat);
                    this.audioTrackIndex = iAddTrack;
                    if (iAddTrack != -1 && !this.muxerStarted) {
                        this.mediaMuxer.start();
                        this.muxerStarted = true;
                        Log.i(TAG, "MediaMuxer started for audio recording");
                    }
                }
                if (!this.muxerStarted) {
                    return;
                }
            } else if (iDequeueOutputBuffer < 0) {
                Log.e(TAG, "unexpected result from audio encoder.dequeueOutputBuffer: " + iDequeueOutputBuffer);
            } else {
                try {
                    ByteBuffer byteBuffer = this.audioOutputBuffers[iDequeueOutputBuffer];
                    if (byteBuffer == null) {
                        Log.e(TAG, "audio encoderOutputBuffer " + iDequeueOutputBuffer + " was null");
                        return;
                    }
                    byteBuffer.position(this.audioBufferInfo.offset);
                    MediaCodec.BufferInfo bufferInfo = this.audioBufferInfo;
                    byteBuffer.limit(bufferInfo.offset + bufferInfo.size);
                    if (this.muxerStarted && (i10 = this.audioTrackIndex) != -1) {
                        this.mediaMuxer.writeSampleData(i10, byteBuffer, this.audioBufferInfo);
                    }
                    this.audioEncoder.releaseOutputBuffer(iDequeueOutputBuffer, false);
                    if ((this.audioBufferInfo.flags & 4) != 0) {
                        Log.i(TAG, "End of audio stream reached");
                        return;
                    }
                } catch (Exception e10) {
                    Log.e(TAG, "Error processing audio data", e10);
                    return;
                }
            }
        }
    }

    private void initializeAudioEncoder(JavaAudioDeviceModule.AudioSamples audioSamples) {
        try {
            this.audioEncoder = MediaCodec.createEncoderByType("audio/mp4a-latm");
            MediaFormat mediaFormat = new MediaFormat();
            mediaFormat.setString("mime", "audio/mp4a-latm");
            mediaFormat.setInteger("channel-count", audioSamples.getChannelCount());
            mediaFormat.setInteger("sample-rate", audioSamples.getSampleRate());
            mediaFormat.setInteger("bitrate", 131072);
            mediaFormat.setInteger("aac-profile", 2);
            Log.i(TAG, "Configuring audio encoder with format: " + mediaFormat);
            this.audioEncoder.configure(mediaFormat, (Surface) null, (MediaCrypto) null, 1);
            this.audioEncoder.start();
            this.audioInputBuffers = this.audioEncoder.getInputBuffers();
            this.audioOutputBuffers = this.audioEncoder.getOutputBuffers();
            this.audioEncoderStarted = true;
            Log.i(TAG, "Audio encoder initialized successfully");
        } catch (IOException e10) {
            Log.e(TAG, "Failed to create audio encoder", e10);
            this.audioEncoder = null;
        }
    }

    @Override // org.webrtc.audio.JavaAudioDeviceModule.SamplesReadyCallback
    public void onWebRtcAudioRecordSamplesReady(final JavaAudioDeviceModule.AudioSamples audioSamples) {
        if (this.isRunning) {
            this.audioThreadHandler.post(new Runnable() { // from class: com.cloudwebrtc.webrtc.record.a
                @Override // java.lang.Runnable
                public final void run() {
                    AudioFileRenderer.a(this.f28814a, audioSamples);
                }
            });
        }
    }

    public void release() {
        this.isRunning = false;
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        this.audioThreadHandler.post(new Runnable() { // from class: com.cloudwebrtc.webrtc.record.b
            @Override // java.lang.Runnable
            public final void run() {
                AudioFileRenderer.b(this.f28816a, countDownLatch);
            }
        });
        try {
            if (countDownLatch.await(2L, TimeUnit.SECONDS)) {
                return;
            }
            Log.w(TAG, "Release timed out, proceeding anyway");
        } catch (InterruptedException e10) {
            Log.e(TAG, "Release interrupted", e10);
            Thread.currentThread().interrupt();
        }
    }
}
