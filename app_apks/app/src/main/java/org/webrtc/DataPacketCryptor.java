package org.webrtc;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes5.dex */
public class DataPacketCryptor {
    private long nativePtr;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class EncryptedPacket {
        public final byte[] iv;
        public final int keyIndex;
        public final byte[] payload;

        @CalledByNative("EncryptedPacket")
        public EncryptedPacket(byte[] bArr, byte[] bArr2, int i10) {
            this.payload = bArr;
            this.iv = bArr2;
            this.keyIndex = i10;
        }
    }

    @CalledByNative
    public DataPacketCryptor(long j10) {
        this.nativePtr = j10;
    }

    private void checkDataPacketCryptorExists() {
        if (this.nativePtr == 0) {
            throw new IllegalStateException("DataPacketCryptor has been disposed.");
        }
    }

    private static native byte[] nativeDecrypt(long j10, String str, int i10, byte[] bArr, byte[] bArr2);

    private static native EncryptedPacket nativeEncrypt(long j10, String str, int i10, byte[] bArr);

    public byte[] decrypt(String str, EncryptedPacket encryptedPacket) {
        checkDataPacketCryptorExists();
        return nativeDecrypt(this.nativePtr, str, encryptedPacket.keyIndex, encryptedPacket.payload, encryptedPacket.iv);
    }

    public void dispose() {
        checkDataPacketCryptorExists();
        JniCommon.nativeReleaseRef(this.nativePtr);
        this.nativePtr = 0L;
    }

    public EncryptedPacket encrypt(String str, int i10, byte[] bArr) {
        checkDataPacketCryptorExists();
        return nativeEncrypt(this.nativePtr, str, i10, bArr);
    }

    public long getNativeDataPacketCryptor() {
        return this.nativePtr;
    }
}
