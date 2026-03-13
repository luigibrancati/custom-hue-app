package com.google.android.filament.gltfio;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class Animator {
    private long mNativeObject;

    public Animator(long j10) {
        this.mNativeObject = j10;
    }

    private static native void nApplyAnimation(long j10, int i10, float f10);

    private static native void nApplyCrossFade(long j10, int i10, float f10, float f11);

    private static native int nGetAnimationCount(long j10);

    private static native float nGetAnimationDuration(long j10, int i10);

    private static native String nGetAnimationName(long j10, int i10);

    private static native void nResetBoneMatrices(long j10);

    private static native void nUpdateBoneMatrices(long j10);

    public void applyAnimation(int i10, float f10) {
        nApplyAnimation(getNativeObject(), i10, f10);
    }

    public void applyCrossFade(int i10, float f10, float f11) {
        nApplyCrossFade(getNativeObject(), i10, f10, f11);
    }

    public void clearNativeObject() {
        this.mNativeObject = 0L;
    }

    public int getAnimationCount() {
        return nGetAnimationCount(getNativeObject());
    }

    public float getAnimationDuration(int i10) {
        return nGetAnimationDuration(getNativeObject(), i10);
    }

    public String getAnimationName(int i10) {
        return nGetAnimationName(getNativeObject(), i10);
    }

    public long getNativeObject() {
        long j10 = this.mNativeObject;
        if (j10 != 0) {
            return j10;
        }
        throw new IllegalStateException("Using Animator on destroyed asset");
    }

    public void resetBoneMatrices() {
        nResetBoneMatrices(getNativeObject());
    }

    public void updateBoneMatrices() {
        nUpdateBoneMatrices(getNativeObject());
    }
}
