package com.google.android.filament.gltfio;

import com.google.android.filament.Box;
import com.google.android.filament.Engine;
import com.google.android.filament.Entity;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class FilamentAsset {
    private Engine mEngine;
    private long mNativeObject;
    private FilamentInstance mPrimaryInstance;

    public FilamentAsset(Engine engine, long j10) {
        this.mEngine = engine;
        this.mNativeObject = j10;
    }

    private static native void nGetBoundingBox(long j10, float[] fArr);

    private static native void nGetCameraEntities(long j10, int[] iArr);

    private static native int nGetCameraEntityCount(long j10);

    private static native void nGetEntities(long j10, int[] iArr);

    private static native int nGetEntitiesByName(long j10, String str, int[] iArr);

    private static native int nGetEntitiesByPrefix(long j10, String str, int[] iArr);

    private static native int nGetEntityCount(long j10);

    private static native String nGetExtras(long j10, int i10);

    private static native int nGetFirstEntityByName(long j10, String str);

    private static native long nGetInstance(long j10);

    private static native void nGetLightEntities(long j10, int[] iArr);

    private static native int nGetLightEntityCount(long j10);

    private static native int nGetMorphTargetCount(long j10, int i10);

    private static native void nGetMorphTargetNames(long j10, int i10, String[] strArr);

    private static native String nGetName(long j10, int i10);

    private static native void nGetRenderableEntities(long j10, int[] iArr);

    private static native int nGetRenderableEntityCount(long j10);

    private static native int nGetResourceUriCount(long j10);

    private static native void nGetResourceUris(long j10, String[] strArr);

    private static native int nGetRoot(long j10);

    private static native int nPopRenderable(long j10);

    private static native int nPopRenderables(long j10, int[] iArr);

    private static native void nReleaseSourceData(long j10);

    public void clearNativeObject() {
        this.mPrimaryInstance = null;
        this.mNativeObject = 0L;
    }

    public Box getBoundingBox() {
        float[] fArr = new float[6];
        nGetBoundingBox(this.mNativeObject, fArr);
        return new Box(fArr[0], fArr[1], fArr[2], fArr[3], fArr[4], fArr[5]);
    }

    @Entity
    public int[] getCameraEntities() {
        int[] iArr = new int[nGetCameraEntityCount(this.mNativeObject)];
        nGetCameraEntities(this.mNativeObject, iArr);
        return iArr;
    }

    public Engine getEngine() {
        return this.mEngine;
    }

    @Entity
    public int[] getEntities() {
        int[] iArr = new int[nGetEntityCount(this.mNativeObject)];
        nGetEntities(this.mNativeObject, iArr);
        return iArr;
    }

    @Entity
    public int[] getEntitiesByName(String str) {
        int[] iArr = new int[nGetEntitiesByName(this.mNativeObject, str, null)];
        nGetEntitiesByName(this.mNativeObject, str, iArr);
        return iArr;
    }

    @Entity
    public int[] getEntitiesByPrefix(String str) {
        int[] iArr = new int[nGetEntitiesByPrefix(this.mNativeObject, str, null)];
        nGetEntitiesByPrefix(this.mNativeObject, str, iArr);
        return iArr;
    }

    public String getExtras(@Entity int i10) {
        return nGetExtras(this.mNativeObject, i10);
    }

    @Entity
    public int getFirstEntityByName(String str) {
        return nGetFirstEntityByName(this.mNativeObject, str);
    }

    public FilamentInstance getInstance() {
        FilamentInstance filamentInstance = this.mPrimaryInstance;
        if (filamentInstance != null) {
            return filamentInstance;
        }
        FilamentInstance filamentInstance2 = new FilamentInstance(this, nGetInstance(getNativeObject()));
        this.mPrimaryInstance = filamentInstance2;
        return filamentInstance2;
    }

    @Entity
    public int[] getLightEntities() {
        int[] iArr = new int[nGetLightEntityCount(this.mNativeObject)];
        nGetLightEntities(this.mNativeObject, iArr);
        return iArr;
    }

    public String[] getMorphTargetNames(@Entity int i10) {
        String[] strArr = new String[nGetMorphTargetCount(this.mNativeObject, i10)];
        nGetMorphTargetNames(this.mNativeObject, i10, strArr);
        return strArr;
    }

    public String getName(@Entity int i10) {
        return nGetName(getNativeObject(), i10);
    }

    public long getNativeObject() {
        return this.mNativeObject;
    }

    @Entity
    public int[] getRenderableEntities() {
        int[] iArr = new int[nGetRenderableEntityCount(this.mNativeObject)];
        nGetRenderableEntities(this.mNativeObject, iArr);
        return iArr;
    }

    public String[] getResourceUris() {
        String[] strArr = new String[nGetResourceUriCount(this.mNativeObject)];
        nGetResourceUris(this.mNativeObject, strArr);
        return strArr;
    }

    @Entity
    public int getRoot() {
        return nGetRoot(this.mNativeObject);
    }

    @Entity
    public int popRenderable() {
        return nPopRenderable(this.mNativeObject);
    }

    public int popRenderables(@Entity int[] iArr) {
        return nPopRenderables(this.mNativeObject, iArr);
    }

    public void releaseSourceData() {
        nReleaseSourceData(this.mNativeObject);
    }
}
