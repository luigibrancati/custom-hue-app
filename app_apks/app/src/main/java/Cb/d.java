package Cb;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f1235a = new d();

    public final EGLContext a() {
        EGLContext eGLContextB = b(EGL14.EGL_NO_CONTEXT);
        AbstractC4862t.b(eGLContextB);
        return eGLContextB;
    }

    public final EGLContext b(EGLContext eGLContext) {
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        EGL14.eglInitialize(eGLDisplayEglGetDisplay, null, 0, null, 0);
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        EGL14.eglChooseConfig(eGLDisplayEglGetDisplay, new int[]{12352, 64, 12344}, 0, eGLConfigArr, 0, 1, new int[]{0}, 0);
        EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext(eGLDisplayEglGetDisplay, eGLConfigArr[0], eGLContext, new int[]{12440, 3, 12344}, 0);
        EGLSurface eGLSurfaceEglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplayEglGetDisplay, eGLConfigArr[0], new int[]{12375, 1, 12374, 1, 12344}, 0);
        if (EGL14.eglMakeCurrent(eGLDisplayEglGetDisplay, eGLSurfaceEglCreatePbufferSurface, eGLSurfaceEglCreatePbufferSurface, eGLContextEglCreateContext)) {
            return eGLContextEglCreateContext;
        }
        throw new IllegalStateException("Error making GL context.");
    }

    public final int c() {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        int i10 = iArr[0];
        GLES20.glBindTexture(36197, i10);
        GLES20.glTexParameteri(36197, 10242, 33071);
        GLES20.glTexParameteri(36197, 10243, 33071);
        GLES20.glTexParameteri(36197, 10241, 9729);
        GLES20.glTexParameteri(36197, 10240, 9729);
        return i10;
    }

    public final void d(EGLContext eGLContext) {
        if (!EGL14.eglDestroyContext(EGL14.eglGetDisplay(0), eGLContext)) {
            throw new IllegalStateException("Error destroying GL context.");
        }
    }
}
