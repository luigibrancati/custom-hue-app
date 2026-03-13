package com.cloudwebrtc.webrtc.record;

import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Log;
import android.view.Surface;
import com.google.ar.core.ImageMetadata;
import io.flutter.plugin.platform.PlatformPlugin;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import org.webrtc.EglBase;
import org.webrtc.GlRectDrawer;
import org.webrtc.VideoFrame;
import org.webrtc.VideoFrameDrawer;
import org.webrtc.VideoSink;
import org.webrtc.audio.JavaAudioDeviceModule;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
class VideoFileRenderer implements VideoSink, JavaAudioDeviceModule.SamplesReadyCallback {
    private static final int FRAME_RATE = 30;
    private static final int IFRAME_INTERVAL = 5;
    private static final String MIME_TYPE = "video/avc";
    private static final String TAG = "VideoFileRenderer";
    private MediaCodec.BufferInfo audioBufferInfo;
    private MediaCodec audioEncoder;
    private ByteBuffer[] audioInputBuffers;
    private ByteBuffer[] audioOutputBuffers;
    private final HandlerThread audioThread;
    private final Handler audioThreadHandler;
    private int audioTrackIndex;
    private final MediaCodec.BufferInfo bufferInfo;
    private GlRectDrawer drawer;
    private EglBase eglBase;
    private MediaCodec encoder;
    private ByteBuffer[] encoderOutputBuffers;
    private VideoFrameDrawer frameDrawer;
    private final MediaMuxer mediaMuxer;
    private final HandlerThread renderThread;
    private final Handler renderThreadHandler;
    private final EglBase.Context sharedContext;
    private Surface surface;
    private int outputFileWidth = -1;
    private int outputFileHeight = -1;
    private int trackIndex = -1;
    private boolean isRunning = true;
    private boolean encoderInitializing = false;
    private boolean encoderStarted = false;
    private volatile boolean muxerStarted = false;
    private long videoFrameStart = 0;
    private long presTime = 0;

    public VideoFileRenderer(String str, EglBase.Context context, boolean z10) {
        HandlerThread handlerThread = new HandlerThread("VideoFileRendererRenderThread");
        this.renderThread = handlerThread;
        handlerThread.start();
        this.renderThreadHandler = new Handler(handlerThread.getLooper());
        if (z10) {
            HandlerThread handlerThread2 = new HandlerThread("VideoFileRendererAudioThread");
            this.audioThread = handlerThread2;
            handlerThread2.start();
            this.audioThreadHandler = new Handler(handlerThread2.getLooper());
        } else {
            this.audioThread = null;
            this.audioThreadHandler = null;
        }
        this.bufferInfo = new MediaCodec.BufferInfo();
        this.sharedContext = context;
        this.mediaMuxer = new MediaMuxer(str, 0);
        this.audioTrackIndex = z10 ? -1 : 0;
    }

    public static /* synthetic */ void a(VideoFileRenderer videoFileRenderer, JavaAudioDeviceModule.AudioSamples audioSamples) {
        if (videoFileRenderer.audioEncoder == null) {
            try {
                videoFileRenderer.audioEncoder = MediaCodec.createEncoderByType("audio/mp4a-latm");
                MediaFormat mediaFormat = new MediaFormat();
                mediaFormat.setString("mime", "audio/mp4a-latm");
                mediaFormat.setInteger("channel-count", audioSamples.getChannelCount());
                mediaFormat.setInteger("sample-rate", audioSamples.getSampleRate());
                mediaFormat.setInteger("bitrate", ImageMetadata.CONTROL_AE_ANTIBANDING_MODE);
                mediaFormat.setInteger("aac-profile", 2);
                videoFileRenderer.audioEncoder.configure(mediaFormat, (Surface) null, (MediaCrypto) null, 1);
                videoFileRenderer.audioEncoder.start();
                videoFileRenderer.audioInputBuffers = videoFileRenderer.audioEncoder.getInputBuffers();
                videoFileRenderer.audioOutputBuffers = videoFileRenderer.audioEncoder.getOutputBuffers();
            } catch (IOException e10) {
                Log.wtf(TAG, e10);
            }
        }
        int iDequeueInputBuffer = videoFileRenderer.audioEncoder.dequeueInputBuffer(0L);
        if (iDequeueInputBuffer >= 0) {
            ByteBuffer byteBuffer = videoFileRenderer.audioInputBuffers[iDequeueInputBuffer];
            byteBuffer.clear();
            byte[] data = audioSamples.getData();
            byteBuffer.put(data);
            videoFileRenderer.audioEncoder.queueInputBuffer(iDequeueInputBuffer, 0, data.length, videoFileRenderer.presTime, 0);
            videoFileRenderer.presTime += (long) ((data.length * 125) / 12);
        }
        videoFileRenderer.drainAudio();
    }

    public static /* synthetic */ void c(VideoFileRenderer videoFileRenderer, CountDownLatch countDownLatch) {
        videoFileRenderer.getClass();
        try {
            videoFileRenderer.eglBase = EglBase.create(videoFileRenderer.sharedContext, EglBase.CONFIG_RECORDABLE);
            Log.d(TAG, "EGL context created");
            videoFileRenderer.eglBase.createSurface(videoFileRenderer.surface);
            videoFileRenderer.eglBase.makeCurrent();
            videoFileRenderer.drawer = new GlRectDrawer();
            videoFileRenderer.encoderStarted = true;
            videoFileRenderer.encoderInitializing = false;
            Log.d(TAG, "Encoder surface setup complete: " + videoFileRenderer.surface);
        } catch (Exception e10) {
            Log.e(TAG, "Failed to setup EGL surface: " + e10.getMessage());
        } finally {
            countDownLatch.countDown();
        }
    }

    public static /* synthetic */ void d(VideoFileRenderer videoFileRenderer, CountDownLatch countDownLatch) {
        videoFileRenderer.getClass();
        try {
            MediaCodec mediaCodec = videoFileRenderer.audioEncoder;
            if (mediaCodec != null) {
                mediaCodec.stop();
                videoFileRenderer.audioEncoder.release();
            }
            videoFileRenderer.audioThread.quit();
            countDownLatch.countDown();
        } catch (Throwable th) {
            countDownLatch.countDown();
            throw th;
        }
    }

    private void drainAudio() {
        if (this.audioBufferInfo == null) {
            this.audioBufferInfo = new MediaCodec.BufferInfo();
        }
        while (true) {
            int iDequeueOutputBuffer = this.audioEncoder.dequeueOutputBuffer(this.audioBufferInfo, 1000L);
            if (iDequeueOutputBuffer == -1) {
                return;
            }
            if (iDequeueOutputBuffer == -3) {
                this.audioOutputBuffers = this.audioEncoder.getOutputBuffers();
                Log.w(TAG, "encoder output buffers changed");
            } else {
                boolean z10 = true;
                if (iDequeueOutputBuffer == -2) {
                    MediaFormat outputFormat = this.audioEncoder.getOutputFormat();
                    Log.w(TAG, "encoder output format changed: " + outputFormat);
                    int iAddTrack = this.mediaMuxer.addTrack(outputFormat);
                    this.audioTrackIndex = iAddTrack;
                    if (this.trackIndex != -1 && iAddTrack != -1 && !this.muxerStarted) {
                        this.mediaMuxer.start();
                        this.muxerStarted = true;
                    }
                    if (!this.muxerStarted) {
                        return;
                    }
                } else if (iDequeueOutputBuffer < 0) {
                    Log.e(TAG, "unexpected result from encoder.dequeueOutputBuffer: " + iDequeueOutputBuffer);
                } else {
                    try {
                        ByteBuffer byteBuffer = this.audioOutputBuffers[iDequeueOutputBuffer];
                        if (byteBuffer == null) {
                            Log.e(TAG, "encoderOutputBuffer " + iDequeueOutputBuffer + " was null");
                            return;
                        }
                        byteBuffer.position(this.audioBufferInfo.offset);
                        MediaCodec.BufferInfo bufferInfo = this.audioBufferInfo;
                        byteBuffer.limit(bufferInfo.offset + bufferInfo.size);
                        if (this.muxerStarted) {
                            this.mediaMuxer.writeSampleData(this.audioTrackIndex, byteBuffer, this.audioBufferInfo);
                        }
                        if (!this.isRunning || (this.audioBufferInfo.flags & 4) != 0) {
                            z10 = false;
                        }
                        this.isRunning = z10;
                        this.audioEncoder.releaseOutputBuffer(iDequeueOutputBuffer, false);
                        if ((this.audioBufferInfo.flags & 4) != 0) {
                            return;
                        }
                    } catch (Exception e10) {
                        Log.wtf(TAG, e10);
                        return;
                    }
                }
            }
        }
    }

    private void drainEncoder() {
        while (true) {
            int iDequeueOutputBuffer = this.encoder.dequeueOutputBuffer(this.bufferInfo, 10000L);
            if (iDequeueOutputBuffer == -1) {
                return;
            }
            if (iDequeueOutputBuffer == -3) {
                this.encoderOutputBuffers = this.encoder.getOutputBuffers();
                Log.e(TAG, "encoder output buffers changed");
            } else {
                boolean z10 = true;
                if (iDequeueOutputBuffer == -2) {
                    MediaFormat outputFormat = this.encoder.getOutputFormat();
                    Log.e(TAG, "encoder output format changed: " + outputFormat);
                    int iAddTrack = this.mediaMuxer.addTrack(outputFormat);
                    this.trackIndex = iAddTrack;
                    if (iAddTrack != -1 && this.audioTrackIndex != -1 && !this.muxerStarted) {
                        this.mediaMuxer.start();
                        this.muxerStarted = true;
                    }
                    if (!this.muxerStarted) {
                        return;
                    }
                } else if (iDequeueOutputBuffer < 0) {
                    Log.e(TAG, "unexpected result fr om encoder.dequeueOutputBuffer: " + iDequeueOutputBuffer);
                } else {
                    try {
                        ByteBuffer byteBuffer = this.encoderOutputBuffers[iDequeueOutputBuffer];
                        if (byteBuffer == null) {
                            Log.e(TAG, "encoderOutputBuffer " + iDequeueOutputBuffer + " was null");
                            return;
                        }
                        byteBuffer.position(this.bufferInfo.offset);
                        MediaCodec.BufferInfo bufferInfo = this.bufferInfo;
                        byteBuffer.limit(bufferInfo.offset + bufferInfo.size);
                        if (this.videoFrameStart == 0) {
                            long j10 = this.bufferInfo.presentationTimeUs;
                            if (j10 != 0) {
                                this.videoFrameStart = j10;
                            }
                        }
                        this.bufferInfo.presentationTimeUs -= this.videoFrameStart;
                        if (this.muxerStarted) {
                            this.mediaMuxer.writeSampleData(this.trackIndex, byteBuffer, this.bufferInfo);
                        }
                        if (!this.isRunning || (this.bufferInfo.flags & 4) != 0) {
                            z10 = false;
                        }
                        this.isRunning = z10;
                        this.encoder.releaseOutputBuffer(iDequeueOutputBuffer, false);
                        if ((this.bufferInfo.flags & 4) != 0) {
                            return;
                        }
                    } catch (Exception e10) {
                        Log.wtf(TAG, e10);
                        return;
                    }
                }
            }
        }
    }

    public static /* synthetic */ void e(VideoFileRenderer videoFileRenderer, CountDownLatch countDownLatch) {
        videoFileRenderer.getClass();
        try {
            MediaCodec mediaCodec = videoFileRenderer.encoder;
            if (mediaCodec != null) {
                mediaCodec.stop();
                videoFileRenderer.encoder.release();
            }
            EglBase eglBase = videoFileRenderer.eglBase;
            if (eglBase != null) {
                eglBase.release();
                videoFileRenderer.eglBase = null;
            }
            if (videoFileRenderer.muxerStarted) {
                videoFileRenderer.mediaMuxer.stop();
                videoFileRenderer.mediaMuxer.release();
                videoFileRenderer.muxerStarted = false;
            }
            videoFileRenderer.renderThread.quit();
            countDownLatch.countDown();
        } catch (Throwable th) {
            countDownLatch.countDown();
            throw th;
        }
    }

    private List<EncoderConfig> getSupportedConfigurations(int i10, int i11) {
        int[] iArr = {6000000, 4000000, 2000000, 1000000};
        int[] iArr2 = {1, 2, 8};
        ArrayList<int[]> arrayList = new ArrayList();
        arrayList.add(new int[]{i10, i11});
        for (int[] iArr3 : Arrays.asList(new int[]{1984, 1984}, new int[]{1920, 1080}, new int[]{PlatformPlugin.DEFAULT_SYSTEM_UI, PlatformPlugin.DEFAULT_SYSTEM_UI}, new int[]{PlatformPlugin.DEFAULT_SYSTEM_UI, 720}, new int[]{854, 480}, new int[]{640, 360}, new int[]{426, 240})) {
            if (iArr3[0] <= i10 && iArr3[1] <= i11) {
                arrayList.add(iArr3);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (int[] iArr4 : arrayList) {
            for (int i12 = 0; i12 < 4; i12++) {
                int i13 = iArr[i12];
                for (int i14 = 0; i14 < 3; i14++) {
                    arrayList2.add(new EncoderConfig(iArr4[0], iArr4[1], i13, iArr2[i14]));
                }
            }
        }
        Collections.sort(arrayList2, new Comparator<EncoderConfig>() { // from class: com.cloudwebrtc.webrtc.record.VideoFileRenderer.1
            @Override // java.util.Comparator
            public int compare(EncoderConfig encoderConfig, EncoderConfig encoderConfig2) {
                int iCompare = Integer.compare(encoderConfig2.width * encoderConfig2.height, encoderConfig.width * encoderConfig.height);
                if (iCompare != 0) {
                    return iCompare;
                }
                int iCompare2 = Integer.compare(encoderConfig2.bitrate, encoderConfig.bitrate);
                return iCompare2 != 0 ? iCompare2 : Integer.compare(encoderConfig.profile, encoderConfig2.profile);
            }
        });
        return arrayList2;
    }

    private void initVideoEncoder(int i10, int i11) {
        MediaCodec mediaCodec = this.encoder;
        MediaCodecInfo codecInfo = null;
        if (mediaCodec != null) {
            mediaCodec.stop();
            this.encoder.release();
            this.encoder = null;
        }
        Surface surface = this.surface;
        if (surface != null) {
            surface.release();
            this.surface = null;
        }
        try {
            MediaCodec mediaCodecCreateEncoderByType = MediaCodec.createEncoderByType(MIME_TYPE);
            codecInfo = mediaCodecCreateEncoderByType.getCodecInfo();
            mediaCodecCreateEncoderByType.release();
        } catch (Exception e10) {
            Log.e(TAG, "Failed to get codec info: " + e10.getMessage());
        }
        for (EncoderConfig encoderConfig : getSupportedConfigurations(i10, i11)) {
            if (codecInfo != null) {
                MediaCodecInfo.VideoCapabilities videoCapabilities = codecInfo.getCapabilitiesForType(MIME_TYPE).getVideoCapabilities();
                if (!videoCapabilities.isSizeSupported(encoderConfig.width, encoderConfig.height)) {
                    Log.d(TAG, "Skipping unsupported resolution: " + encoderConfig);
                } else if (!videoCapabilities.getBitrateRange().contains(Integer.valueOf(encoderConfig.bitrate))) {
                    Log.d(TAG, "Skipping unsupported bitrate: " + encoderConfig);
                } else if (!isProfileSupported(codecInfo, MIME_TYPE, encoderConfig.profile)) {
                    Log.d(TAG, "Skipping unsupported profile: " + encoderConfig);
                }
            }
            if (tryConfigureEncoder(encoderConfig) && startEncoder()) {
                this.outputFileWidth = encoderConfig.width;
                this.outputFileHeight = encoderConfig.height;
                final CountDownLatch countDownLatch = new CountDownLatch(1);
                this.renderThreadHandler.post(new Runnable() { // from class: com.cloudwebrtc.webrtc.record.e
                    @Override // java.lang.Runnable
                    public final void run() {
                        VideoFileRenderer.c(this.f28821a, countDownLatch);
                    }
                });
                try {
                    countDownLatch.await();
                } catch (InterruptedException e11) {
                    Thread.currentThread().interrupt();
                    Log.e(TAG, "Interrupted while awaiting EGL setup: " + e11.getMessage());
                }
                if (this.encoderStarted) {
                    return;
                }
            }
        }
        Log.e(TAG, "Failed to configure and start encoder with any supported configuration.");
    }

    private boolean isProfileSupported(MediaCodecInfo mediaCodecInfo, String str, int i10) {
        try {
            for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : mediaCodecInfo.getCapabilitiesForType(str).profileLevels) {
                if (codecProfileLevel.profile == i10) {
                    return true;
                }
            }
        } catch (Exception e10) {
            Log.w(TAG, "Failed to check profile support: " + e10.getMessage());
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void renderFrameOnRenderThread(VideoFrame videoFrame) {
        if (this.drawer == null) {
            Log.e(TAG, "drawer is null — skipping frame render");
            videoFrame.release();
            return;
        }
        if (this.frameDrawer == null) {
            this.frameDrawer = new VideoFrameDrawer();
        }
        this.frameDrawer.drawFrame(videoFrame, this.drawer, null, 0, 0, this.outputFileWidth, this.outputFileHeight);
        videoFrame.release();
        drainEncoder();
        this.eglBase.swapBuffers();
    }

    private boolean startEncoder() {
        try {
            this.encoder.start();
            this.encoderOutputBuffers = this.encoder.getOutputBuffers();
            Log.d(TAG, "Encoder started successfully");
            return true;
        } catch (Exception e10) {
            Log.w(TAG, "Failed to start encoder: " + e10.getMessage());
            Surface surface = this.surface;
            if (surface != null) {
                surface.release();
                this.surface = null;
            }
            MediaCodec mediaCodec = this.encoder;
            if (mediaCodec == null) {
                return false;
            }
            try {
                mediaCodec.release();
            } catch (Exception unused) {
            }
            this.encoder = null;
            return false;
        }
    }

    private boolean tryConfigureEncoder(EncoderConfig encoderConfig) {
        try {
            MediaFormat mediaFormatCreateVideoFormat = MediaFormat.createVideoFormat(MIME_TYPE, encoderConfig.width, encoderConfig.height);
            mediaFormatCreateVideoFormat.setInteger("color-format", 2130708361);
            mediaFormatCreateVideoFormat.setInteger("bitrate", encoderConfig.bitrate);
            mediaFormatCreateVideoFormat.setInteger("frame-rate", 30);
            mediaFormatCreateVideoFormat.setInteger("i-frame-interval", 5);
            mediaFormatCreateVideoFormat.setInteger("max-input-size", ((encoderConfig.width * encoderConfig.height) * 3) / 2);
            mediaFormatCreateVideoFormat.setInteger("priority", 0);
            Log.d(TAG, "Trying encoder config: " + encoderConfig);
            MediaCodec mediaCodecCreateEncoderByType = MediaCodec.createEncoderByType(MIME_TYPE);
            this.encoder = mediaCodecCreateEncoderByType;
            String name = mediaCodecCreateEncoderByType.getName();
            Log.d(TAG, "Codec name: " + name);
            if ("OMX.hisi.video.encoder.avc".equals(name)) {
                Log.w(TAG, "hisi h264 encoder does not set 'MediaFormat.KEY_PROFILE'.");
            } else {
                mediaFormatCreateVideoFormat.setInteger("profile", encoderConfig.profile);
            }
            this.encoder.configure(mediaFormatCreateVideoFormat, (Surface) null, (MediaCrypto) null, 1);
            this.surface = this.encoder.createInputSurface();
            Log.d(TAG, "Input surface created successfully: " + this.surface);
            return true;
        } catch (Exception e10) {
            Log.w(TAG, "Failed to configure encoder for config: " + encoderConfig + ", error: " + e10.getMessage());
            Surface surface = this.surface;
            if (surface != null) {
                surface.release();
                this.surface = null;
            }
            MediaCodec mediaCodec = this.encoder;
            if (mediaCodec != null) {
                try {
                    mediaCodec.release();
                } catch (Exception unused) {
                }
                this.encoder = null;
            }
            return false;
        }
    }

    @Override // org.webrtc.VideoSink
    public void onFrame(final VideoFrame videoFrame) {
        videoFrame.retain();
        if (this.outputFileWidth == -1 && !this.encoderInitializing) {
            this.encoderInitializing = true;
            initVideoEncoder(videoFrame.getRotatedWidth(), videoFrame.getRotatedHeight());
        }
        this.renderThreadHandler.post(new Runnable() { // from class: com.cloudwebrtc.webrtc.record.i
            @Override // java.lang.Runnable
            public final void run() {
                this.f28829a.renderFrameOnRenderThread(videoFrame);
            }
        });
    }

    @Override // org.webrtc.audio.JavaAudioDeviceModule.SamplesReadyCallback
    public void onWebRtcAudioRecordSamplesReady(final JavaAudioDeviceModule.AudioSamples audioSamples) {
        if (this.isRunning) {
            this.audioThreadHandler.post(new Runnable() { // from class: com.cloudwebrtc.webrtc.record.h
                @Override // java.lang.Runnable
                public final void run() {
                    VideoFileRenderer.a(this.f28827a, audioSamples);
                }
            });
        }
    }

    public void release() {
        this.isRunning = false;
        final CountDownLatch countDownLatch = new CountDownLatch(this.audioThreadHandler != null ? 2 : 1);
        Handler handler = this.audioThreadHandler;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.cloudwebrtc.webrtc.record.f
                @Override // java.lang.Runnable
                public final void run() {
                    VideoFileRenderer.d(this.f28823a, countDownLatch);
                }
            });
        }
        this.renderThreadHandler.post(new Runnable() { // from class: com.cloudwebrtc.webrtc.record.g
            @Override // java.lang.Runnable
            public final void run() {
                VideoFileRenderer.e(this.f28825a, countDownLatch);
            }
        });
        try {
            countDownLatch.await();
        } catch (InterruptedException e10) {
            Log.e(TAG, "Release interrupted", e10);
            Thread.currentThread().interrupt();
        }
    }
}
