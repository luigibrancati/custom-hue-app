package androidx.camera.core.impl.utils;

import android.view.Surface;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class SurfaceUtil {

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f22013a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f22014b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f22015c = 0;
    }

    static {
        System.loadLibrary("surface_util_jni");
    }

    public static a a(Surface surface) {
        int[] iArrNativeGetSurfaceInfo = nativeGetSurfaceInfo(surface);
        a aVar = new a();
        aVar.f22013a = iArrNativeGetSurfaceInfo[0];
        aVar.f22014b = iArrNativeGetSurfaceInfo[1];
        aVar.f22015c = iArrNativeGetSurfaceInfo[2];
        return aVar;
    }

    private static native int[] nativeGetSurfaceInfo(Surface surface);
}
