package org.webrtc;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes5.dex */
public class LibvpxVp9Encoder extends WrappedNativeVideoEncoder {
    public static native long nativeCreate(long j10);

    public static native List<String> nativeGetSupportedScalabilityModes();

    public static native boolean nativeIsSupported();

    public static List<String> scalabilityModes() {
        return nativeGetSupportedScalabilityModes();
    }

    @Override // org.webrtc.WrappedNativeVideoEncoder, org.webrtc.VideoEncoder
    public long createNative(long j10) {
        return nativeCreate(j10);
    }

    @Override // org.webrtc.WrappedNativeVideoEncoder, org.webrtc.VideoEncoder
    public boolean isHardwareEncoder() {
        return false;
    }
}
