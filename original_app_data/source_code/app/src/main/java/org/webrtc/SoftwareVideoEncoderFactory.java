package org.webrtc;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes5.dex */
public class SoftwareVideoEncoderFactory implements VideoEncoderFactory {
    private static final String TAG = "SoftwareVideoEncoderFactory";
    private final long nativeFactory = nativeCreateFactory();

    /* JADX INFO: Access modifiers changed from: private */
    public static native long nativeCreate(long j10, long j11, VideoCodecInfo videoCodecInfo);

    private static native long nativeCreateFactory();

    private static native List<VideoCodecInfo> nativeGetSupportedCodecs(long j10);

    private static native boolean nativeIsSupported(long j10, VideoCodecInfo videoCodecInfo);

    @Override // org.webrtc.VideoEncoderFactory
    public VideoEncoder createEncoder(final VideoCodecInfo videoCodecInfo) {
        if (nativeIsSupported(this.nativeFactory, videoCodecInfo)) {
            return new WrappedNativeVideoEncoder(this) { // from class: org.webrtc.SoftwareVideoEncoderFactory.1
                final /* synthetic */ SoftwareVideoEncoderFactory this$0;

                {
                    this.this$0 = this;
                }

                @Override // org.webrtc.WrappedNativeVideoEncoder, org.webrtc.VideoEncoder
                public long createNative(long j10) {
                    return SoftwareVideoEncoderFactory.nativeCreate(this.this$0.nativeFactory, j10, videoCodecInfo);
                }

                @Override // org.webrtc.WrappedNativeVideoEncoder, org.webrtc.VideoEncoder
                public boolean isHardwareEncoder() {
                    return false;
                }
            };
        }
        Logging.w(TAG, "Trying to create encoder for unsupported format. " + String.valueOf(videoCodecInfo));
        return null;
    }

    @Override // org.webrtc.VideoEncoderFactory
    public VideoCodecInfo[] getSupportedCodecs() {
        return (VideoCodecInfo[]) nativeGetSupportedCodecs(this.nativeFactory).toArray(new VideoCodecInfo[0]);
    }
}
