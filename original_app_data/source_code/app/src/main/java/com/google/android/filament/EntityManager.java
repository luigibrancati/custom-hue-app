package com.google.android.filament;

import com.google.android.filament.proguard.UsedByReflection;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class EntityManager {
    private long mNativeObject;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class Holder {
        static final EntityManager INSTANCE = new EntityManager();

        private Holder() {
        }
    }

    public static EntityManager get() {
        return Holder.INSTANCE;
    }

    private static native int nCreate(long j10);

    private static native void nCreateArray(long j10, int i10, int[] iArr);

    private static native void nDestroy(long j10, int i10);

    private static native void nDestroyArray(long j10, int i10, int[] iArr);

    private static native long nGetEntityManager();

    private static native boolean nIsAlive(long j10, int i10);

    @Entity
    public int create() {
        return nCreate(this.mNativeObject);
    }

    public void destroy(@Entity int i10) {
        nDestroy(this.mNativeObject, i10);
    }

    @UsedByReflection("AssetLoader.java")
    public long getNativeObject() {
        return this.mNativeObject;
    }

    public boolean isAlive(@Entity int i10) {
        return nIsAlive(this.mNativeObject, i10);
    }

    private EntityManager() {
        this.mNativeObject = nGetEntityManager();
    }

    @Entity
    public int[] create(int i10) {
        if (i10 < 1) {
            throw new ArrayIndexOutOfBoundsException("n must be at least 1");
        }
        int[] iArr = new int[i10];
        nCreateArray(this.mNativeObject, i10, iArr);
        return iArr;
    }

    public void destroy(@Entity int[] iArr) {
        nDestroyArray(this.mNativeObject, iArr.length, iArr);
    }

    public EntityManager(long j10) {
        nGetEntityManager();
        this.mNativeObject = j10;
    }

    public int[] create(@Entity int[] iArr) {
        nCreateArray(this.mNativeObject, iArr.length, iArr);
        return iArr;
    }
}
