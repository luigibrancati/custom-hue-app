package org.webrtc;

import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaFormat;
import android.opengl.GLES20;
import android.os.Bundle;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.Map;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;
import org.apache.tika.pipes.PipesConfigBase;
import org.webrtc.EglBase14;
import org.webrtc.EncodedImage;
import org.webrtc.ThreadUtils;
import org.webrtc.VideoEncoder;
import org.webrtc.VideoFrame;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes5.dex */
class HardwareVideoEncoder implements VideoEncoder {
    private static final int DEQUEUE_OUTPUT_BUFFER_TIMEOUT_US = 100000;
    private static final int MAX_ENCODER_Q_SIZE = 2;
    private static final int MAX_VIDEO_FRAMERATE = 30;
    private static final int MEDIA_CODEC_RELEASE_TIMEOUT_MS = 5000;
    private static final int REQUIRED_RESOLUTION_ALIGNMENT = 2;
    private static final String TAG = "HardwareVideoEncoder";
    private int adjustedBitrate;
    private boolean automaticResizeOn;
    private final BitrateAdjuster bitrateAdjuster;
    private VideoEncoder.Callback callback;
    private MediaCodecWrapper codec;
    private final String codecName;
    private final VideoCodecMimeType codecType;
    private ByteBuffer configBuffer;
    private final ThreadUtils.ThreadChecker encodeThreadChecker;
    private final long forcedKeyFrameNs;
    private int frameSizeBytes;
    private int height;
    private boolean isEncodingStatisticsEnabled;
    private boolean isSemiPlanar;
    private final int keyFrameIntervalSec;
    private long lastKeyFrameNs;
    private final MediaCodecWrapperFactory mediaCodecWrapperFactory;
    private long nextPresentationTimestampUs;
    private final BusyCount outputBuffersBusyCount;
    private Thread outputThread;
    private final ThreadUtils.ThreadChecker outputThreadChecker;
    private final Map<String, String> params;
    private volatile boolean running;
    private final EglBase14.Context sharedContext;
    private volatile Exception shutdownException;
    private int sliceHeight;
    private int stride;
    private final Integer surfaceColorFormat;
    private EglBase14 textureEglBase;
    private Surface textureInputSurface;
    private boolean useSurfaceMode;
    private int width;
    private final Integer yuvColorFormat;
    private final GlRectDrawer textureDrawer = new GlRectDrawer();
    private final VideoFrameDrawer videoFrameDrawer = new VideoFrameDrawer();
    private final BlockingDeque<EncodedImage.Builder> outputBuilders = new LinkedBlockingDeque();

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class BusyCount {
        private int count;
        private final Object countLock;

        public void decrement() {
            synchronized (this.countLock) {
                try {
                    int i10 = this.count - 1;
                    this.count = i10;
                    if (i10 == 0) {
                        this.countLock.notifyAll();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public void increment() {
            synchronized (this.countLock) {
                this.count++;
            }
        }

        public void waitForZero() {
            boolean z10;
            synchronized (this.countLock) {
                z10 = false;
                while (this.count > 0) {
                    try {
                        this.countLock.wait();
                    } catch (InterruptedException e10) {
                        Logging.e(HardwareVideoEncoder.TAG, "Interrupted while waiting on busy count", e10);
                        z10 = true;
                    }
                }
            }
            if (z10) {
                Thread.currentThread().interrupt();
            }
        }

        private BusyCount() {
            this.countLock = new Object();
        }
    }

    public HardwareVideoEncoder(MediaCodecWrapperFactory mediaCodecWrapperFactory, String str, VideoCodecMimeType videoCodecMimeType, Integer num, Integer num2, Map<String, String> map, int i10, int i11, BitrateAdjuster bitrateAdjuster, EglBase14.Context context) {
        ThreadUtils.ThreadChecker threadChecker = new ThreadUtils.ThreadChecker();
        this.encodeThreadChecker = threadChecker;
        this.outputThreadChecker = new ThreadUtils.ThreadChecker();
        this.outputBuffersBusyCount = new BusyCount();
        this.mediaCodecWrapperFactory = mediaCodecWrapperFactory;
        this.codecName = str;
        this.codecType = videoCodecMimeType;
        this.surfaceColorFormat = num;
        this.yuvColorFormat = num2;
        this.params = map;
        this.keyFrameIntervalSec = i10;
        this.forcedKeyFrameNs = TimeUnit.MILLISECONDS.toNanos(i11);
        this.bitrateAdjuster = bitrateAdjuster;
        this.sharedContext = context;
        threadChecker.detachThread();
    }

    private boolean canUseSurface() {
        return (this.sharedContext == null || this.surfaceColorFormat == null) ? false : true;
    }

    private Thread createOutputThread() {
        return new Thread() { // from class: org.webrtc.HardwareVideoEncoder.1
            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                while (HardwareVideoEncoder.this.running) {
                    HardwareVideoEncoder.this.deliverEncodedImage();
                }
                HardwareVideoEncoder.this.releaseCodecOnOutputThread();
            }
        };
    }

    private VideoCodecStatus encodeByteBuffer(VideoFrame videoFrame, long j10) {
        this.encodeThreadChecker.checkIsOnValidThread();
        try {
            int iDequeueInputBuffer = this.codec.dequeueInputBuffer(0L);
            if (iDequeueInputBuffer == -1) {
                Logging.d(TAG, "Dropped frame, no input buffers available");
                return VideoCodecStatus.NO_OUTPUT;
            }
            try {
                ByteBuffer inputBuffer = this.codec.getInputBuffer(iDequeueInputBuffer);
                if (inputBuffer.capacity() >= this.frameSizeBytes) {
                    fillInputBuffer(inputBuffer, videoFrame.getBuffer());
                    try {
                        this.codec.queueInputBuffer(iDequeueInputBuffer, 0, this.frameSizeBytes, j10, 0);
                        return VideoCodecStatus.OK;
                    } catch (IllegalStateException e10) {
                        Logging.e(TAG, "queueInputBuffer failed", e10);
                        return VideoCodecStatus.ERROR;
                    }
                }
                Logging.e(TAG, "Input buffer size: " + inputBuffer.capacity() + " is smaller than frame size: " + this.frameSizeBytes);
                return VideoCodecStatus.ERROR;
            } catch (IllegalStateException e11) {
                Logging.e(TAG, "getInputBuffer with index=" + iDequeueInputBuffer + " failed", e11);
                return VideoCodecStatus.ERROR;
            }
        } catch (IllegalStateException e12) {
            Logging.e(TAG, "dequeueInputBuffer failed", e12);
            return VideoCodecStatus.ERROR;
        }
    }

    private VideoCodecStatus encodeTextureBuffer(VideoFrame videoFrame, long j10) {
        this.encodeThreadChecker.checkIsOnValidThread();
        try {
            GLES20.glClear(16384);
            this.videoFrameDrawer.drawFrame(new VideoFrame(videoFrame.getBuffer(), 0, videoFrame.getTimestampNs()), this.textureDrawer, null);
            this.textureEglBase.swapBuffers(TimeUnit.MICROSECONDS.toNanos(j10));
            return VideoCodecStatus.OK;
        } catch (RuntimeException e10) {
            Logging.e(TAG, "encodeTexture failed", e10);
            return VideoCodecStatus.ERROR;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00a1 A[Catch: IllegalArgumentException | IllegalStateException -> 0x0097, IllegalArgumentException | IllegalStateException -> 0x0097, TryCatch #0 {IllegalArgumentException | IllegalStateException -> 0x0097, blocks: (B:9:0x0029, B:11:0x0062, B:15:0x0071, B:15:0x0071, B:28:0x00a1, B:28:0x00a1, B:20:0x0080, B:20:0x0080, B:22:0x0088, B:22:0x0088, B:25:0x009a, B:25:0x009a, B:29:0x00b5, B:29:0x00b5, B:31:0x00c0, B:31:0x00c0, B:32:0x00c5, B:32:0x00c5, B:34:0x00cb, B:34:0x00cb, B:35:0x00d2, B:35:0x00d2, B:37:0x00f4, B:37:0x00f4, B:38:0x0110, B:38:0x0110), top: B:46:0x0029 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private org.webrtc.VideoCodecStatus initEncodeInternal() {
        /*
            Method dump skipped, instruction units count: 342
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.webrtc.HardwareVideoEncoder.initEncodeInternal():org.webrtc.VideoCodecStatus");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$deliverEncodedImage$0(int i10) {
        try {
            this.codec.releaseOutputBuffer(i10, false);
        } catch (Exception e10) {
            Logging.e(TAG, "releaseOutputBuffer failed", e10);
        }
        this.outputBuffersBusyCount.decrement();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void releaseCodecOnOutputThread() {
        this.outputThreadChecker.checkIsOnValidThread();
        Logging.d(TAG, "Releasing MediaCodec on output thread");
        this.outputBuffersBusyCount.waitForZero();
        try {
            this.codec.stop();
        } catch (Exception e10) {
            Logging.e(TAG, "Media encoder stop failed", e10);
        }
        try {
            this.codec.release();
        } catch (Exception e11) {
            Logging.e(TAG, "Media encoder release failed", e11);
            this.shutdownException = e11;
        }
        this.configBuffer = null;
        Logging.d(TAG, "Release on output thread done");
    }

    private void requestKeyFrame(long j10) {
        this.encodeThreadChecker.checkIsOnValidThread();
        try {
            Bundle bundle = new Bundle();
            bundle.putInt("request-sync", 0);
            this.codec.setParameters(bundle);
            this.lastKeyFrameNs = j10;
        } catch (IllegalStateException e10) {
            Logging.e(TAG, "requestKeyFrame failed", e10);
        }
    }

    private VideoCodecStatus resetCodec(int i10, int i11, boolean z10) {
        this.encodeThreadChecker.checkIsOnValidThread();
        VideoCodecStatus videoCodecStatusRelease = release();
        if (videoCodecStatusRelease != VideoCodecStatus.OK) {
            return videoCodecStatusRelease;
        }
        if (i10 % 2 != 0 || i11 % 2 != 0) {
            Logging.e(TAG, "MediaCodec requires 2x2 alignment.");
            return VideoCodecStatus.ERR_SIZE;
        }
        this.width = i10;
        this.height = i11;
        this.useSurfaceMode = z10;
        return initEncodeInternal();
    }

    private boolean shouldForceKeyFrame(long j10) {
        this.encodeThreadChecker.checkIsOnValidThread();
        long j11 = this.forcedKeyFrameNs;
        return j11 > 0 && j10 > this.lastKeyFrameNs + j11;
    }

    private VideoCodecStatus updateBitrate() {
        this.outputThreadChecker.checkIsOnValidThread();
        this.adjustedBitrate = this.bitrateAdjuster.getAdjustedBitrateBps();
        try {
            Bundle bundle = new Bundle();
            bundle.putInt("video-bitrate", this.adjustedBitrate);
            this.codec.setParameters(bundle);
            return VideoCodecStatus.OK;
        } catch (IllegalStateException e10) {
            Logging.e(TAG, "updateBitrate failed", e10);
            return VideoCodecStatus.ERROR;
        }
    }

    private void updateInputFormat(MediaFormat mediaFormat) {
        this.stride = this.width;
        this.sliceHeight = this.height;
        if (mediaFormat != null) {
            if (mediaFormat.containsKey("stride")) {
                int integer = mediaFormat.getInteger("stride");
                this.stride = integer;
                this.stride = Math.max(integer, this.width);
            }
            if (mediaFormat.containsKey("slice-height")) {
                int integer2 = mediaFormat.getInteger("slice-height");
                this.sliceHeight = integer2;
                this.sliceHeight = Math.max(integer2, this.height);
            }
        }
        boolean zIsSemiPlanar = isSemiPlanar(this.yuvColorFormat.intValue());
        this.isSemiPlanar = zIsSemiPlanar;
        if (zIsSemiPlanar) {
            int i10 = (this.height + 1) / 2;
            int i11 = this.sliceHeight;
            int i12 = this.stride;
            this.frameSizeBytes = (i11 * i12) + (i10 * i12);
        } else {
            int i13 = this.stride;
            int i14 = this.sliceHeight;
            this.frameSizeBytes = (i14 * i13) + (((i14 + 1) / 2) * ((i13 + 1) / 2) * 2);
        }
        Logging.d(TAG, "updateInputFormat format: " + String.valueOf(mediaFormat) + " stride: " + this.stride + " sliceHeight: " + this.sliceHeight + " isSemiPlanar: " + this.isSemiPlanar + " frameSizeBytes: " + this.frameSizeBytes);
    }

    public void deliverEncodedImage() {
        ByteBuffer byteBufferSlice;
        ByteBuffer byteBuffer;
        MediaFormat outputFormat;
        VideoCodecMimeType videoCodecMimeType;
        this.outputThreadChecker.checkIsOnValidThread();
        try {
            MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
            final int iDequeueOutputBuffer = this.codec.dequeueOutputBuffer(bufferInfo, PipesConfigBase.DEFAULT_MAX_FOR_EMIT_BATCH);
            if (iDequeueOutputBuffer < 0) {
                if (iDequeueOutputBuffer == -3) {
                    this.outputBuffersBusyCount.waitForZero();
                    return;
                }
                return;
            }
            ByteBuffer outputBuffer = this.codec.getOutputBuffer(iDequeueOutputBuffer);
            outputBuffer.position(bufferInfo.offset);
            outputBuffer.limit(bufferInfo.offset + bufferInfo.size);
            if ((bufferInfo.flags & 2) != 0) {
                Logging.d(TAG, "Config frame generated. Offset: " + bufferInfo.offset + ". Size: " + bufferInfo.size);
                int i10 = bufferInfo.size;
                if (i10 > 0 && ((videoCodecMimeType = this.codecType) == VideoCodecMimeType.H264 || videoCodecMimeType == VideoCodecMimeType.H265)) {
                    ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(i10);
                    this.configBuffer = byteBufferAllocateDirect;
                    byteBufferAllocateDirect.put(outputBuffer);
                }
                this.codec.releaseOutputBuffer(iDequeueOutputBuffer, false);
                return;
            }
            this.bitrateAdjuster.reportEncodedFrame(bufferInfo.size);
            if (this.adjustedBitrate != this.bitrateAdjuster.getAdjustedBitrateBps()) {
                updateBitrate();
            }
            boolean z10 = true;
            if ((bufferInfo.flags & 1) == 0) {
                z10 = false;
            }
            if (z10) {
                Logging.d(TAG, "Sync frame generated");
            }
            Runnable runnable = null;
            Integer numValueOf = (this.isEncodingStatisticsEnabled && (outputFormat = this.codec.getOutputFormat(iDequeueOutputBuffer)) != null && outputFormat.containsKey("video-qp-average")) ? Integer.valueOf(outputFormat.getInteger("video-qp-average")) : null;
            if (!z10 || (byteBuffer = this.configBuffer) == null) {
                byteBufferSlice = outputBuffer.slice();
                this.outputBuffersBusyCount.increment();
                runnable = new Runnable() { // from class: org.webrtc.D
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f41641a.lambda$deliverEncodedImage$0(iDequeueOutputBuffer);
                    }
                };
            } else {
                Logging.d(TAG, "Prepending config buffer of size " + byteBuffer.capacity() + " to output buffer with offset " + bufferInfo.offset + ", size " + bufferInfo.size);
                byteBufferSlice = ByteBuffer.allocateDirect(bufferInfo.size + this.configBuffer.capacity());
                this.configBuffer.rewind();
                byteBufferSlice.put(this.configBuffer);
                byteBufferSlice.put(outputBuffer);
                byteBufferSlice.rewind();
                this.codec.releaseOutputBuffer(iDequeueOutputBuffer, false);
            }
            EncodedImage.FrameType frameType = z10 ? EncodedImage.FrameType.VideoFrameKey : EncodedImage.FrameType.VideoFrameDelta;
            EncodedImage.Builder builderPoll = this.outputBuilders.poll();
            builderPoll.setBuffer(byteBufferSlice, runnable);
            builderPoll.setFrameType(frameType);
            builderPoll.setQp(numValueOf);
            EncodedImage encodedImageCreateEncodedImage = builderPoll.createEncodedImage();
            this.callback.onEncodedFrame(encodedImageCreateEncodedImage, new VideoEncoder.CodecSpecificInfo());
            encodedImageCreateEncodedImage.release();
        } catch (IllegalStateException e10) {
            Logging.e(TAG, "deliverOutput failed", e10);
        }
    }

    @Override // org.webrtc.VideoEncoder
    public VideoCodecStatus encode(VideoFrame videoFrame, VideoEncoder.EncodeInfo encodeInfo) {
        VideoCodecStatus videoCodecStatusResetCodec;
        this.encodeThreadChecker.checkIsOnValidThread();
        if (this.codec == null) {
            return VideoCodecStatus.UNINITIALIZED;
        }
        boolean z10 = videoFrame.getBuffer() instanceof VideoFrame.TextureBuffer;
        int width = videoFrame.getBuffer().getWidth();
        int height = videoFrame.getBuffer().getHeight();
        boolean z11 = canUseSurface() && z10;
        if ((width != this.width || height != this.height || z11 != this.useSurfaceMode) && (videoCodecStatusResetCodec = resetCodec(width, height, z11)) != VideoCodecStatus.OK) {
            return videoCodecStatusResetCodec;
        }
        if (this.outputBuilders.size() > 2) {
            Logging.e(TAG, "Dropped frame, encoder queue full");
            return VideoCodecStatus.NO_OUTPUT;
        }
        boolean z12 = false;
        for (EncodedImage.FrameType frameType : encodeInfo.frameTypes) {
            if (frameType == EncodedImage.FrameType.VideoFrameKey) {
                z12 = true;
            }
        }
        if (z12 || shouldForceKeyFrame(videoFrame.getTimestampNs())) {
            requestKeyFrame(videoFrame.getTimestampNs());
        }
        this.outputBuilders.offer(EncodedImage.builder().setCaptureTimeNs(videoFrame.getTimestampNs()).setEncodedWidth(videoFrame.getBuffer().getWidth()).setEncodedHeight(videoFrame.getBuffer().getHeight()).setRotation(videoFrame.getRotation()));
        long j10 = this.nextPresentationTimestampUs;
        this.nextPresentationTimestampUs += (long) (TimeUnit.SECONDS.toMicros(1L) / this.bitrateAdjuster.getAdjustedFramerateFps());
        VideoCodecStatus videoCodecStatusEncodeTextureBuffer = this.useSurfaceMode ? encodeTextureBuffer(videoFrame, j10) : encodeByteBuffer(videoFrame, j10);
        if (videoCodecStatusEncodeTextureBuffer != VideoCodecStatus.OK) {
            this.outputBuilders.pollLast();
        }
        return videoCodecStatusEncodeTextureBuffer;
    }

    public void fillInputBuffer(ByteBuffer byteBuffer, VideoFrame.Buffer buffer) {
        VideoFrame.I420Buffer i420 = buffer.toI420();
        if (this.isSemiPlanar) {
            YuvHelper.I420ToNV12(i420.getDataY(), i420.getStrideY(), i420.getDataU(), i420.getStrideU(), i420.getDataV(), i420.getStrideV(), byteBuffer, i420.getWidth(), i420.getHeight(), this.stride, this.sliceHeight);
        } else {
            YuvHelper.I420Copy(i420.getDataY(), i420.getStrideY(), i420.getDataU(), i420.getStrideU(), i420.getDataV(), i420.getStrideV(), byteBuffer, i420.getWidth(), i420.getHeight(), this.stride, this.sliceHeight);
        }
        i420.release();
    }

    @Override // org.webrtc.VideoEncoder
    public VideoEncoder.EncoderInfo getEncoderInfo() {
        return new VideoEncoder.EncoderInfo(2, false);
    }

    @Override // org.webrtc.VideoEncoder
    public String getImplementationName() {
        return this.codecName;
    }

    @Override // org.webrtc.VideoEncoder
    public VideoEncoder.ScalingSettings getScalingSettings() {
        if (this.automaticResizeOn) {
            VideoCodecMimeType videoCodecMimeType = this.codecType;
            if (videoCodecMimeType == VideoCodecMimeType.VP8) {
                return new VideoEncoder.ScalingSettings(29, 95);
            }
            if (videoCodecMimeType == VideoCodecMimeType.H264) {
                return new VideoEncoder.ScalingSettings(24, 37);
            }
            if (videoCodecMimeType == VideoCodecMimeType.H265) {
                return new VideoEncoder.ScalingSettings(24, 37);
            }
        }
        return VideoEncoder.ScalingSettings.OFF;
    }

    @Override // org.webrtc.VideoEncoder
    public VideoCodecStatus initEncode(VideoEncoder.Settings settings, VideoEncoder.Callback callback) {
        int i10;
        this.encodeThreadChecker.checkIsOnValidThread();
        this.callback = callback;
        this.automaticResizeOn = settings.automaticResizeOn;
        int i11 = settings.width;
        if (i11 % 2 == 0) {
            int i12 = settings.height;
            if (i12 % 2 == 0) {
                this.width = i11;
                this.height = i12;
                this.useSurfaceMode = canUseSurface();
                int i13 = settings.startBitrate;
                if (i13 != 0 && (i10 = settings.maxFramerate) != 0) {
                    this.bitrateAdjuster.setTargets(i13 * 1000, i10);
                }
                this.adjustedBitrate = this.bitrateAdjuster.getAdjustedBitrateBps();
                Logging.d(TAG, "initEncode name: " + this.codecName + " type: " + String.valueOf(this.codecType) + " width: " + this.width + " height: " + this.height + " framerate_fps: " + settings.maxFramerate + " bitrate_kbps: " + settings.startBitrate + " surface mode: " + this.useSurfaceMode);
                return initEncodeInternal();
            }
        }
        Logging.e(TAG, "MediaCodec requires 2x2 alignment.");
        return VideoCodecStatus.ERR_SIZE;
    }

    public boolean isEncodingStatisticsSupported() {
        MediaCodecInfo codecInfo;
        MediaCodecInfo.CodecCapabilities capabilitiesForType;
        VideoCodecMimeType videoCodecMimeType = this.codecType;
        if (videoCodecMimeType == VideoCodecMimeType.VP8 || videoCodecMimeType == VideoCodecMimeType.VP9 || (codecInfo = this.codec.getCodecInfo()) == null || (capabilitiesForType = codecInfo.getCapabilitiesForType(this.codecType.mimeType())) == null) {
            return false;
        }
        return capabilitiesForType.isFeatureSupported("encoding-statistics");
    }

    public boolean isSemiPlanar(int i10) {
        if (i10 == 19) {
            return false;
        }
        if (i10 == 21 || i10 == 2141391872 || i10 == 2141391876) {
            return true;
        }
        throw new IllegalArgumentException("Unsupported colorFormat: " + i10);
    }

    @Override // org.webrtc.VideoEncoder
    public VideoCodecStatus release() {
        VideoCodecStatus videoCodecStatus;
        this.encodeThreadChecker.checkIsOnValidThread();
        if (this.outputThread == null) {
            videoCodecStatus = VideoCodecStatus.OK;
        } else {
            this.running = false;
            if (!ThreadUtils.joinUninterruptibly(this.outputThread, 5000L)) {
                Logging.e(TAG, "Media encoder release timeout");
                videoCodecStatus = VideoCodecStatus.TIMEOUT;
            } else if (this.shutdownException != null) {
                Logging.e(TAG, "Media encoder release exception", this.shutdownException);
                videoCodecStatus = VideoCodecStatus.ERROR;
            } else {
                videoCodecStatus = VideoCodecStatus.OK;
            }
        }
        this.textureDrawer.release();
        this.videoFrameDrawer.release();
        EglBase14 eglBase14 = this.textureEglBase;
        if (eglBase14 != null) {
            eglBase14.release();
            this.textureEglBase = null;
        }
        Surface surface = this.textureInputSurface;
        if (surface != null) {
            surface.release();
            this.textureInputSurface = null;
        }
        this.outputBuilders.clear();
        this.codec = null;
        this.outputThread = null;
        this.encodeThreadChecker.detachThread();
        return videoCodecStatus;
    }

    @Override // org.webrtc.VideoEncoder
    public VideoCodecStatus setRateAllocation(VideoEncoder.BitrateAllocation bitrateAllocation, int i10) {
        this.encodeThreadChecker.checkIsOnValidThread();
        if (i10 > 30) {
            i10 = 30;
        }
        this.bitrateAdjuster.setTargets(bitrateAllocation.getSum(), i10);
        return VideoCodecStatus.OK;
    }

    @Override // org.webrtc.VideoEncoder
    public VideoCodecStatus setRates(VideoEncoder.RateControlParameters rateControlParameters) {
        this.encodeThreadChecker.checkIsOnValidThread();
        this.bitrateAdjuster.setTargets(rateControlParameters.bitrate.getSum(), rateControlParameters.framerateFps);
        return VideoCodecStatus.OK;
    }
}
