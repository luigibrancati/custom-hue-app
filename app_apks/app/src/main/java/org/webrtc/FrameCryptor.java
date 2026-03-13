package org.webrtc;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes5.dex */
public class FrameCryptor {
    private long nativeFrameCryptor;
    private long observerPtr = 0;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public enum FrameCryptionState {
        NEW,
        OK,
        ENCRYPTIONFAILED,
        DECRYPTIONFAILED,
        MISSINGKEY,
        KEYRATCHETED,
        INTERNALERROR;

        @CalledByNative("FrameCryptionState")
        public static FrameCryptionState fromNativeIndex(int i10) {
            return values()[i10];
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface Observer {
        @CalledByNative("Observer")
        void onFrameCryptionStateChanged(String str, FrameCryptionState frameCryptionState);
    }

    @CalledByNative
    public FrameCryptor(long j10) {
        this.nativeFrameCryptor = j10;
    }

    private void checkFrameCryptorExists() {
        if (this.nativeFrameCryptor == 0) {
            throw new IllegalStateException("FrameCryptor has been disposed.");
        }
    }

    private static native int nativeGetKeyIndex(long j10);

    private static native boolean nativeIsEnabled(long j10);

    private static native void nativeSetEnabled(long j10, boolean z10);

    private static native void nativeSetKeyIndex(long j10, int i10);

    private static native long nativeSetObserver(long j10, Observer observer);

    private static native void nativeUnSetObserver(long j10);

    public void dispose() {
        checkFrameCryptorExists();
        nativeUnSetObserver(this.nativeFrameCryptor);
        JniCommon.nativeReleaseRef(this.nativeFrameCryptor);
        this.nativeFrameCryptor = 0L;
        long j10 = this.observerPtr;
        if (j10 != 0) {
            JniCommon.nativeReleaseRef(j10);
            this.observerPtr = 0L;
        }
    }

    public int getKeyIndex() {
        checkFrameCryptorExists();
        return nativeGetKeyIndex(this.nativeFrameCryptor);
    }

    public long getNativeFrameCryptor() {
        return this.nativeFrameCryptor;
    }

    public boolean isEnabled() {
        checkFrameCryptorExists();
        return nativeIsEnabled(this.nativeFrameCryptor);
    }

    public void setEnabled(boolean z10) {
        checkFrameCryptorExists();
        nativeSetEnabled(this.nativeFrameCryptor, z10);
    }

    public void setKeyIndex(int i10) {
        checkFrameCryptorExists();
        nativeSetKeyIndex(this.nativeFrameCryptor, i10);
    }

    public void setObserver(Observer observer) {
        checkFrameCryptorExists();
        nativeSetObserver(this.nativeFrameCryptor, observer);
        long j10 = this.observerPtr;
        if (j10 != 0) {
            JniCommon.nativeReleaseRef(j10);
            this.observerPtr = 0L;
        }
    }
}
