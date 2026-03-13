package com.google.android.filament;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class Scene {
    private IndirectLight mIndirectLight;
    private long mNativeObject;
    private Skybox mSkybox;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface EntityProcessor {
        void process(@Entity int i10);
    }

    public Scene(long j10) {
        this.mNativeObject = j10;
    }

    private static native void nAddEntities(long j10, int[] iArr);

    private static native void nAddEntity(long j10, int i10);

    private static native boolean nGetEntities(long j10, int[] iArr, int i10);

    private static native int nGetEntityCount(long j10);

    private static native int nGetLightCount(long j10);

    private static native int nGetRenderableCount(long j10);

    private static native boolean nHasEntity(long j10, int i10);

    private static native void nRemove(long j10, int i10);

    private static native void nRemoveEntities(long j10, int[] iArr);

    private static native void nSetIndirectLight(long j10, long j11);

    private static native void nSetSkybox(long j10, long j11);

    public void addEntities(@Entity int[] iArr) {
        nAddEntities(getNativeObject(), iArr);
    }

    public void addEntity(@Entity int i10) {
        nAddEntity(getNativeObject(), i10);
    }

    public void clearNativeObject() {
        this.mNativeObject = 0L;
    }

    public void forEach(EntityProcessor entityProcessor) {
        for (int i10 : getEntities(null)) {
            entityProcessor.process(i10);
        }
    }

    public int[] getEntities(int[] iArr) {
        int entityCount = getEntityCount();
        if (iArr == null || iArr.length < entityCount) {
            iArr = new int[entityCount];
        }
        if (nGetEntities(getNativeObject(), iArr, iArr.length)) {
            return iArr;
        }
        throw new IllegalStateException("Error retriving Scene's entities");
    }

    public int getEntityCount() {
        return nGetEntityCount(getNativeObject());
    }

    public IndirectLight getIndirectLight() {
        return this.mIndirectLight;
    }

    public int getLightCount() {
        return nGetLightCount(getNativeObject());
    }

    public long getNativeObject() {
        long j10 = this.mNativeObject;
        if (j10 != 0) {
            return j10;
        }
        throw new IllegalStateException("Calling method on destroyed Scene");
    }

    public int getRenderableCount() {
        return nGetRenderableCount(getNativeObject());
    }

    public Skybox getSkybox() {
        return this.mSkybox;
    }

    public boolean hasEntity(@Entity int i10) {
        return nHasEntity(getNativeObject(), i10);
    }

    @Deprecated
    public void remove(@Entity int i10) {
        removeEntity(i10);
    }

    public void removeEntities(@Entity int[] iArr) {
        nRemoveEntities(getNativeObject(), iArr);
    }

    public void removeEntity(@Entity int i10) {
        nRemove(getNativeObject(), i10);
    }

    public void setIndirectLight(IndirectLight indirectLight) {
        this.mIndirectLight = indirectLight;
        long nativeObject = getNativeObject();
        IndirectLight indirectLight2 = this.mIndirectLight;
        nSetIndirectLight(nativeObject, indirectLight2 != null ? indirectLight2.getNativeObject() : 0L);
    }

    public void setSkybox(Skybox skybox) {
        this.mSkybox = skybox;
        long nativeObject = getNativeObject();
        Skybox skybox2 = this.mSkybox;
        nSetSkybox(nativeObject, skybox2 != null ? skybox2.getNativeObject() : 0L);
    }

    public int[] getEntities() {
        return getEntities(null);
    }
}
