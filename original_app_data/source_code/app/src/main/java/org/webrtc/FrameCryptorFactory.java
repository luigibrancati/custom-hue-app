package org.webrtc;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes5.dex */
public class FrameCryptorFactory {
    public static FrameCryptor createFrameCryptorForRtpReceiver(PeerConnectionFactory peerConnectionFactory, RtpReceiver rtpReceiver, String str, FrameCryptorAlgorithm frameCryptorAlgorithm, FrameCryptorKeyProvider frameCryptorKeyProvider) {
        return nativeCreateFrameCryptorForRtpReceiver(peerConnectionFactory.getNativeOwnedFactoryAndThreads(), rtpReceiver.getNativeRtpReceiver(), str, frameCryptorAlgorithm.getValue(), frameCryptorKeyProvider.getNativeKeyProvider());
    }

    public static FrameCryptor createFrameCryptorForRtpSender(PeerConnectionFactory peerConnectionFactory, RtpSender rtpSender, String str, FrameCryptorAlgorithm frameCryptorAlgorithm, FrameCryptorKeyProvider frameCryptorKeyProvider) {
        return nativeCreateFrameCryptorForRtpSender(peerConnectionFactory.getNativeOwnedFactoryAndThreads(), rtpSender.getNativeRtpSender(), str, frameCryptorAlgorithm.getValue(), frameCryptorKeyProvider.getNativeKeyProvider());
    }

    public static FrameCryptorKeyProvider createFrameCryptorKeyProvider(boolean z10, byte[] bArr, int i10, byte[] bArr2, int i11, int i12, boolean z11) {
        return nativeCreateFrameCryptorKeyProvider(z10, bArr, i10, bArr2, i11, i12, z11);
    }

    private static native FrameCryptor nativeCreateFrameCryptorForRtpReceiver(long j10, long j11, String str, int i10, long j12);

    private static native FrameCryptor nativeCreateFrameCryptorForRtpSender(long j10, long j11, String str, int i10, long j12);

    private static native FrameCryptorKeyProvider nativeCreateFrameCryptorKeyProvider(boolean z10, byte[] bArr, int i10, byte[] bArr2, int i11, int i12, boolean z11);
}
