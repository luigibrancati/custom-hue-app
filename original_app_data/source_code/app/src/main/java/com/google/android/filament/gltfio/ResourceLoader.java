package com.google.android.filament.gltfio;

import com.google.android.filament.Engine;
import java.nio.Buffer;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class ResourceLoader {
    private final long mNativeKtx2Provider;
    private final long mNativeObject;
    private final long mNativeStbProvider;

    public ResourceLoader(Engine engine) {
        long nativeObject = engine.getNativeObject();
        long jNCreateResourceLoader = nCreateResourceLoader(nativeObject, false);
        this.mNativeObject = jNCreateResourceLoader;
        long jNCreateStbProvider = nCreateStbProvider(nativeObject);
        this.mNativeStbProvider = jNCreateStbProvider;
        long jNCreateKtx2Provider = nCreateKtx2Provider(nativeObject);
        this.mNativeKtx2Provider = jNCreateKtx2Provider;
        nAddTextureProvider(jNCreateResourceLoader, "image/jpeg", jNCreateStbProvider);
        nAddTextureProvider(jNCreateResourceLoader, "image/png", jNCreateStbProvider);
        nAddTextureProvider(jNCreateResourceLoader, "image/ktx2", jNCreateKtx2Provider);
    }

    private static native void nAddResourceData(long j10, String str, Buffer buffer, int i10);

    private static native void nAddTextureProvider(long j10, String str, long j11);

    private static native boolean nAsyncBeginLoad(long j10, long j11);

    private static native void nAsyncCancelLoad(long j10);

    private static native float nAsyncGetLoadProgress(long j10);

    private static native void nAsyncUpdateLoad(long j10);

    private static native long nCreateKtx2Provider(long j10);

    private static native long nCreateResourceLoader(long j10, boolean z10);

    private static native long nCreateStbProvider(long j10);

    private static native void nDestroyResourceLoader(long j10);

    private static native void nDestroyTextureProvider(long j10);

    private static native void nEvictResourceData(long j10);

    private static native boolean nHasResourceData(long j10, String str);

    private static native void nLoadResources(long j10, long j11);

    public ResourceLoader addResourceData(String str, Buffer buffer) {
        nAddResourceData(this.mNativeObject, str, buffer, buffer.remaining());
        return this;
    }

    public boolean asyncBeginLoad(FilamentAsset filamentAsset) {
        return nAsyncBeginLoad(this.mNativeObject, filamentAsset.getNativeObject());
    }

    public void asyncCancelLoad() {
        nAsyncCancelLoad(this.mNativeObject);
    }

    public float asyncGetLoadProgress() {
        return nAsyncGetLoadProgress(this.mNativeObject);
    }

    public void asyncUpdateLoad() {
        nAsyncUpdateLoad(this.mNativeObject);
    }

    public void destroy() {
        nDestroyResourceLoader(this.mNativeObject);
        nDestroyTextureProvider(this.mNativeStbProvider);
        nDestroyTextureProvider(this.mNativeKtx2Provider);
    }

    public void evictResourceData() {
        nEvictResourceData(this.mNativeObject);
    }

    public boolean hasResourceData(String str) {
        return nHasResourceData(this.mNativeObject, str);
    }

    public ResourceLoader loadResources(FilamentAsset filamentAsset) {
        nLoadResources(this.mNativeObject, filamentAsset.getNativeObject());
        return this;
    }

    public ResourceLoader(Engine engine, boolean z10) {
        long nativeObject = engine.getNativeObject();
        long jNCreateResourceLoader = nCreateResourceLoader(nativeObject, z10);
        this.mNativeObject = jNCreateResourceLoader;
        long jNCreateStbProvider = nCreateStbProvider(nativeObject);
        this.mNativeStbProvider = jNCreateStbProvider;
        long jNCreateKtx2Provider = nCreateKtx2Provider(nativeObject);
        this.mNativeKtx2Provider = jNCreateKtx2Provider;
        nAddTextureProvider(jNCreateResourceLoader, "image/jpeg", jNCreateStbProvider);
        nAddTextureProvider(jNCreateResourceLoader, "image/png", jNCreateStbProvider);
        nAddTextureProvider(jNCreateResourceLoader, "image/ktx2", jNCreateKtx2Provider);
    }
}
