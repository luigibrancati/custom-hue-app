package com.google.android.filament.gltfio;

import com.google.android.filament.Engine;
import com.google.android.filament.Entity;
import com.google.android.filament.MaterialInstance;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class FilamentInstance {
    private Animator mAnimator = null;
    private FilamentAsset mAsset;
    private long mNativeObject;

    public FilamentInstance(FilamentAsset filamentAsset, long j10) {
        this.mAsset = filamentAsset;
        this.mNativeObject = j10;
    }

    private static native void nApplyMaterialVariant(long j10, int i10);

    private static native void nAttachSkin(long j10, int i10, int i11);

    private static native void nDetachSkin(long j10, int i10, int i11);

    private static native long nGetAnimator(long j10);

    private static native void nGetEntities(long j10, int[] iArr);

    private static native int nGetEntityCount(long j10);

    private static native int nGetJointCountAt(long j10, int i10);

    private static native void nGetJointsAt(long j10, int i10, int[] iArr);

    private static native int nGetMaterialInstanceCount(long j10);

    private static native void nGetMaterialInstances(long j10, long[] jArr);

    private static native int nGetMaterialVariantCount(long j10);

    private static native void nGetMaterialVariantNames(long j10, String[] strArr);

    private static native int nGetRoot(long j10);

    private static native int nGetSkinCount(long j10);

    private static native void nGetSkinNames(long j10, String[] strArr);

    public void applyMaterialVariant(int i10) {
        nApplyMaterialVariant(this.mNativeObject, i10);
    }

    public void attachSkin(int i10, @Entity int i11) {
        nAttachSkin(getNativeObject(), i10, i11);
    }

    public void clearNativeObject() {
        this.mNativeObject = 0L;
    }

    public void detachSkin(int i10, @Entity int i11) {
        nDetachSkin(getNativeObject(), i10, i11);
    }

    public Animator getAnimator() {
        Animator animator = this.mAnimator;
        if (animator != null) {
            return animator;
        }
        Animator animator2 = new Animator(nGetAnimator(this.mNativeObject));
        this.mAnimator = animator2;
        return animator2;
    }

    public FilamentAsset getAsset() {
        return this.mAsset;
    }

    @Entity
    public int[] getEntities() {
        int[] iArr = new int[nGetEntityCount(this.mNativeObject)];
        nGetEntities(this.mNativeObject, iArr);
        return iArr;
    }

    public int getJointCountAt(int i10) {
        return nGetJointCountAt(getNativeObject(), i10);
    }

    @Entity
    public int[] getJointsAt(int i10) {
        int[] iArr = new int[getJointCountAt(i10)];
        nGetJointsAt(getNativeObject(), i10, iArr);
        return iArr;
    }

    public MaterialInstance[] getMaterialInstances() {
        int iNGetMaterialInstanceCount = nGetMaterialInstanceCount(this.mNativeObject);
        MaterialInstance[] materialInstanceArr = new MaterialInstance[iNGetMaterialInstanceCount];
        long[] jArr = new long[iNGetMaterialInstanceCount];
        nGetMaterialInstances(this.mNativeObject, jArr);
        Engine engine = this.mAsset.getEngine();
        for (int i10 = 0; i10 < iNGetMaterialInstanceCount; i10++) {
            materialInstanceArr[i10] = new MaterialInstance(engine, jArr[i10]);
        }
        return materialInstanceArr;
    }

    public String[] getMaterialVariantNames() {
        String[] strArr = new String[nGetMaterialVariantCount(this.mNativeObject)];
        nGetMaterialVariantNames(this.mNativeObject, strArr);
        return strArr;
    }

    public long getNativeObject() {
        return this.mNativeObject;
    }

    @Entity
    public int getRoot() {
        return nGetRoot(this.mNativeObject);
    }

    public int getSkinCount() {
        return nGetSkinCount(getNativeObject());
    }

    public String[] getSkinNames() {
        String[] strArr = new String[getSkinCount()];
        nGetSkinNames(getNativeObject(), strArr);
        return strArr;
    }
}
