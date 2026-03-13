package org.webrtc;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes5.dex */
public class FrameCryptorKeyProvider {
    private long nativeKeyProvider;

    @CalledByNative
    public FrameCryptorKeyProvider(long j10) {
        this.nativeKeyProvider = j10;
    }

    private void checkKeyProviderExists() {
        if (this.nativeKeyProvider == 0) {
            throw new IllegalStateException("FrameCryptorKeyProvider has been disposed.");
        }
    }

    private static native byte[] nativeExportKey(long j10, String str, int i10);

    private static native byte[] nativeExportSharedKey(long j10, int i10);

    private static native byte[] nativeRatchetKey(long j10, String str, int i10);

    private static native byte[] nativeRatchetSharedKey(long j10, int i10);

    private static native boolean nativeSetKey(long j10, String str, int i10, byte[] bArr);

    private static native boolean nativeSetSharedKey(long j10, int i10, byte[] bArr);

    private static native void nativeSetSifTrailer(long j10, byte[] bArr);

    public void dispose() {
        checkKeyProviderExists();
        JniCommon.nativeReleaseRef(this.nativeKeyProvider);
        this.nativeKeyProvider = 0L;
    }

    public byte[] exportKey(String str, int i10) {
        checkKeyProviderExists();
        return nativeExportKey(this.nativeKeyProvider, str, i10);
    }

    public byte[] exportSharedKey(int i10) {
        checkKeyProviderExists();
        return nativeExportSharedKey(this.nativeKeyProvider, i10);
    }

    public long getNativeKeyProvider() {
        return this.nativeKeyProvider;
    }

    public byte[] ratchetKey(String str, int i10) {
        checkKeyProviderExists();
        return nativeRatchetKey(this.nativeKeyProvider, str, i10);
    }

    public byte[] ratchetSharedKey(int i10) {
        checkKeyProviderExists();
        return nativeRatchetSharedKey(this.nativeKeyProvider, i10);
    }

    public boolean setKey(String str, int i10, byte[] bArr) {
        checkKeyProviderExists();
        return nativeSetKey(this.nativeKeyProvider, str, i10, bArr);
    }

    public boolean setSharedKey(int i10, byte[] bArr) {
        checkKeyProviderExists();
        return nativeSetSharedKey(this.nativeKeyProvider, i10, bArr);
    }

    public void setSifTrailer(byte[] bArr) {
        checkKeyProviderExists();
        nativeSetSifTrailer(this.nativeKeyProvider, bArr);
    }
}
