package com.google.android.filament;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class Fence {
    public static final long WAIT_FOR_EVER = -1;
    private long mNativeObject;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public enum FenceStatus {
        ERROR,
        CONDITION_SATISFIED,
        TIMEOUT_EXPIRED
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public enum Mode {
        FLUSH,
        DONT_FLUSH
    }

    public Fence(long j10) {
        this.mNativeObject = j10;
    }

    private static native int nWait(long j10, int i10, long j11);

    private static native int nWaitAndDestroy(long j10, int i10);

    public static FenceStatus waitAndDestroy(Fence fence, Mode mode) {
        int iNWaitAndDestroy = nWaitAndDestroy(fence.getNativeObject(), mode.ordinal());
        return iNWaitAndDestroy != -1 ? iNWaitAndDestroy != 0 ? FenceStatus.ERROR : FenceStatus.CONDITION_SATISFIED : FenceStatus.ERROR;
    }

    public void clearNativeObject() {
        this.mNativeObject = 0L;
    }

    public long getNativeObject() {
        long j10 = this.mNativeObject;
        if (j10 != 0) {
            return j10;
        }
        throw new IllegalStateException("Calling method on destroyed Fence");
    }

    public FenceStatus wait(Mode mode, long j10) {
        int iNWait = nWait(getNativeObject(), mode.ordinal(), j10);
        return iNWait != -1 ? iNWait != 0 ? iNWait != 1 ? FenceStatus.ERROR : FenceStatus.TIMEOUT_EXPIRED : FenceStatus.CONDITION_SATISFIED : FenceStatus.ERROR;
    }
}
