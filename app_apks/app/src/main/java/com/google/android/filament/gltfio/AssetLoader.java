package com.google.android.filament.gltfio;

import com.google.android.filament.Engine;
import com.google.android.filament.EntityManager;
import java.nio.Buffer;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class AssetLoader {
    private Engine mEngine;
    private MaterialProvider mMaterialCache;
    private long mNativeObject;

    public AssetLoader(Engine engine, MaterialProvider materialProvider, EntityManager entityManager) {
        long jNCreateAssetLoader = nCreateAssetLoader(engine.getNativeObject(), materialProvider, entityManager.getNativeObject());
        this.mNativeObject = jNCreateAssetLoader;
        if (jNCreateAssetLoader == 0) {
            throw new IllegalStateException("Unable to parse glTF asset.");
        }
        this.mEngine = engine;
        this.mMaterialCache = materialProvider;
    }

    private static native long nCreateAsset(long j10, Buffer buffer, int i10);

    private static native long nCreateAssetLoader(long j10, Object obj, long j11);

    private static native long nCreateInstance(long j10, long j11);

    private static native long nCreateInstancedAsset(long j10, Buffer buffer, int i10, long[] jArr);

    private static native void nDestroyAsset(long j10, long j11);

    private static native void nDestroyAssetLoader(long j10);

    private static native void nEnableDiagnostics(long j10, boolean z10);

    public FilamentAsset createAsset(Buffer buffer) {
        long jNCreateAsset = nCreateAsset(this.mNativeObject, buffer, buffer.remaining());
        if (jNCreateAsset != 0) {
            return new FilamentAsset(this.mEngine, jNCreateAsset);
        }
        return null;
    }

    public FilamentInstance createInstance(FilamentAsset filamentAsset) {
        long jNCreateInstance = nCreateInstance(this.mNativeObject, filamentAsset.getNativeObject());
        if (jNCreateInstance == 0) {
            return null;
        }
        return new FilamentInstance(filamentAsset, jNCreateInstance);
    }

    public FilamentAsset createInstancedAsset(Buffer buffer, FilamentInstance[] filamentInstanceArr) {
        int length = filamentInstanceArr.length;
        long[] jArr = new long[length];
        long jNCreateInstancedAsset = nCreateInstancedAsset(this.mNativeObject, buffer, buffer.remaining(), jArr);
        if (jNCreateInstancedAsset == 0) {
            return null;
        }
        FilamentAsset filamentAsset = new FilamentAsset(this.mEngine, jNCreateInstancedAsset);
        for (int i10 = 0; i10 < length; i10++) {
            filamentInstanceArr[i10] = new FilamentInstance(filamentAsset, jArr[i10]);
        }
        return filamentAsset;
    }

    public void destroy() {
        nDestroyAssetLoader(this.mNativeObject);
        this.mNativeObject = 0L;
    }

    public void destroyAsset(FilamentAsset filamentAsset) {
        nDestroyAsset(this.mNativeObject, filamentAsset.getNativeObject());
        filamentAsset.clearNativeObject();
    }

    public void enableDiagnostics(boolean z10) {
        nEnableDiagnostics(this.mNativeObject, z10);
    }
}
