package org.webrtc;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes5.dex */
public class DataPacketCryptorFactory {
    public static DataPacketCryptor createDataPacketCryptor(FrameCryptorAlgorithm frameCryptorAlgorithm, FrameCryptorKeyProvider frameCryptorKeyProvider) {
        return nativeCreateDataPacketCryptor(frameCryptorAlgorithm.getValue(), frameCryptorKeyProvider.getNativeKeyProvider());
    }

    private static native DataPacketCryptor nativeCreateDataPacketCryptor(int i10, long j10);
}
