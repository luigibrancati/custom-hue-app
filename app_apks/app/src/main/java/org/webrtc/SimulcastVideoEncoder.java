package org.webrtc;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes5.dex */
public class SimulcastVideoEncoder extends WrappedNativeVideoEncoder {
    VideoEncoderFactory fallback;
    VideoCodecInfo info;
    VideoEncoderFactory primary;

    public SimulcastVideoEncoder(VideoEncoderFactory videoEncoderFactory, VideoEncoderFactory videoEncoderFactory2, VideoCodecInfo videoCodecInfo) {
        this.primary = videoEncoderFactory;
        this.fallback = videoEncoderFactory2;
        this.info = videoCodecInfo;
    }

    public static native long nativeCreateEncoder(long j10, VideoEncoderFactory videoEncoderFactory, VideoEncoderFactory videoEncoderFactory2, VideoCodecInfo videoCodecInfo);

    @Override // org.webrtc.WrappedNativeVideoEncoder, org.webrtc.VideoEncoder
    public long createNative(long j10) {
        return nativeCreateEncoder(j10, this.primary, this.fallback, this.info);
    }

    @Override // org.webrtc.WrappedNativeVideoEncoder, org.webrtc.VideoEncoder
    public boolean isHardwareEncoder() {
        return false;
    }
}
