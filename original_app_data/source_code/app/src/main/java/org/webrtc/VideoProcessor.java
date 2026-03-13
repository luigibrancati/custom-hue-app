package org.webrtc;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes5.dex */
public interface VideoProcessor extends CapturerObserver {

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class FrameAdaptationParameters {
        public final int cropHeight;
        public final int cropWidth;
        public final int cropX;
        public final int cropY;
        public final boolean drop;
        public final int scaleHeight;
        public final int scaleWidth;
        public final long timestampNs;

        public FrameAdaptationParameters(int i10, int i11, int i12, int i13, int i14, int i15, long j10, boolean z10) {
            this.cropX = i10;
            this.cropY = i11;
            this.cropWidth = i12;
            this.cropHeight = i13;
            this.scaleWidth = i14;
            this.scaleHeight = i15;
            this.timestampNs = j10;
            this.drop = z10;
        }
    }

    static VideoFrame applyFrameAdaptationParameters(VideoFrame videoFrame, FrameAdaptationParameters frameAdaptationParameters) {
        if (frameAdaptationParameters.drop) {
            return null;
        }
        return new VideoFrame(videoFrame.getBuffer().cropAndScale(frameAdaptationParameters.cropX, frameAdaptationParameters.cropY, frameAdaptationParameters.cropWidth, frameAdaptationParameters.cropHeight, frameAdaptationParameters.scaleWidth, frameAdaptationParameters.scaleHeight), videoFrame.getRotation(), frameAdaptationParameters.timestampNs);
    }

    default void onFrameCaptured(VideoFrame videoFrame, FrameAdaptationParameters frameAdaptationParameters) {
        VideoFrame videoFrameApplyFrameAdaptationParameters = applyFrameAdaptationParameters(videoFrame, frameAdaptationParameters);
        if (videoFrameApplyFrameAdaptationParameters != null) {
            onFrameCaptured(videoFrameApplyFrameAdaptationParameters);
            videoFrameApplyFrameAdaptationParameters.release();
        }
    }

    void setSink(VideoSink videoSink);
}
