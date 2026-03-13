package com.google.android.filament;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLContext;
import android.util.Log;
import android.view.Surface;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
final class AndroidPlatform extends Platform {
    private static final String LOG_TAG = "Filament";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f28924a = 0;

    static {
        EGL14.eglGetDisplay(0);
    }

    @Override // com.google.android.filament.Platform
    public long getSharedContextNativeHandle(Object obj) {
        return AndroidPlatform21.getSharedContextNativeHandle(obj);
    }

    @Override // com.google.android.filament.Platform
    public void log(String str) {
        Log.d(LOG_TAG, str);
    }

    @Override // com.google.android.filament.Platform
    public boolean validateSharedContext(Object obj) {
        return obj instanceof EGLContext;
    }

    @Override // com.google.android.filament.Platform
    public boolean validateStreamSource(Object obj) {
        return obj instanceof SurfaceTexture;
    }

    @Override // com.google.android.filament.Platform
    public boolean validateSurface(Object obj) {
        return obj instanceof Surface;
    }

    @Override // com.google.android.filament.Platform
    public void warn(String str) {
        Log.w(LOG_TAG, str);
    }
}
