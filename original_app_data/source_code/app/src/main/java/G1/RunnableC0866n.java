package G1;

import G1.o;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Handler;

/* JADX INFO: renamed from: G1.n, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0866n implements SurfaceTexture.OnFrameAvailableListener, Runnable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int[] f4306g = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f4307a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f4308b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public EGLDisplay f4309c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public EGLContext f4310d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public EGLSurface f4311e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public SurfaceTexture f4312f;

    /* JADX INFO: renamed from: G1.n$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface a {
    }

    public RunnableC0866n(Handler handler) {
        this(handler, null);
    }

    public static EGLConfig a(EGLDisplay eGLDisplay) throws o.a {
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr = new int[1];
        boolean zEglChooseConfig = EGL14.eglChooseConfig(eGLDisplay, f4306g, 0, eGLConfigArr, 0, 1, iArr, 0);
        o.b(zEglChooseConfig && iArr[0] > 0 && eGLConfigArr[0] != null, M.G("eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", Boolean.valueOf(zEglChooseConfig), Integer.valueOf(iArr[0]), eGLConfigArr[0]));
        return eGLConfigArr[0];
    }

    public static EGLContext b(EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i10) throws o.a {
        EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext(eGLDisplay, eGLConfig, EGL14.EGL_NO_CONTEXT, i10 == 0 ? new int[]{12440, 2, 12344} : new int[]{12440, 2, 12992, 1, 12344}, 0);
        o.b(eGLContextEglCreateContext != null, "eglCreateContext failed");
        return eGLContextEglCreateContext;
    }

    public static EGLSurface c(EGLDisplay eGLDisplay, EGLConfig eGLConfig, EGLContext eGLContext, int i10) throws o.a {
        EGLSurface eGLSurfaceEglCreatePbufferSurface;
        if (i10 == 1) {
            eGLSurfaceEglCreatePbufferSurface = EGL14.EGL_NO_SURFACE;
        } else {
            eGLSurfaceEglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, i10 == 2 ? new int[]{12375, 1, 12374, 1, 12992, 1, 12344} : new int[]{12375, 1, 12374, 1, 12344}, 0);
            o.b(eGLSurfaceEglCreatePbufferSurface != null, "eglCreatePbufferSurface failed");
        }
        o.b(EGL14.eglMakeCurrent(eGLDisplay, eGLSurfaceEglCreatePbufferSurface, eGLSurfaceEglCreatePbufferSurface, eGLContext), "eglMakeCurrent failed");
        return eGLSurfaceEglCreatePbufferSurface;
    }

    public static void e(int[] iArr) throws o.a {
        GLES20.glGenTextures(1, iArr, 0);
        o.a();
    }

    public static EGLDisplay f() throws o.a {
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        o.b(eGLDisplayEglGetDisplay != null, "eglGetDisplay failed");
        int[] iArr = new int[2];
        o.b(EGL14.eglInitialize(eGLDisplayEglGetDisplay, iArr, 0, iArr, 1), "eglInitialize failed");
        return eGLDisplayEglGetDisplay;
    }

    public SurfaceTexture g() {
        return (SurfaceTexture) AbstractC0853a.e(this.f4312f);
    }

    public void h(int i10) throws o.a {
        EGLDisplay eGLDisplayF = f();
        this.f4309c = eGLDisplayF;
        EGLConfig eGLConfigA = a(eGLDisplayF);
        EGLContext eGLContextB = b(this.f4309c, eGLConfigA, i10);
        this.f4310d = eGLContextB;
        this.f4311e = c(this.f4309c, eGLConfigA, eGLContextB, i10);
        e(this.f4308b);
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.f4308b[0]);
        this.f4312f = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(this);
    }

    public void i() {
        this.f4307a.removeCallbacks(this);
        try {
            SurfaceTexture surfaceTexture = this.f4312f;
            if (surfaceTexture != null) {
                surfaceTexture.release();
                GLES20.glDeleteTextures(1, this.f4308b, 0);
            }
        } finally {
            EGLDisplay eGLDisplay = this.f4309c;
            if (eGLDisplay != null && !eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
                EGLDisplay eGLDisplay2 = this.f4309c;
                EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            }
            EGLSurface eGLSurface2 = this.f4311e;
            if (eGLSurface2 != null && !eGLSurface2.equals(EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(this.f4309c, this.f4311e);
            }
            EGLContext eGLContext = this.f4310d;
            if (eGLContext != null) {
                EGL14.eglDestroyContext(this.f4309c, eGLContext);
            }
            EGL14.eglReleaseThread();
            EGLDisplay eGLDisplay3 = this.f4309c;
            if (eGLDisplay3 != null && !eGLDisplay3.equals(EGL14.EGL_NO_DISPLAY)) {
                EGL14.eglTerminate(this.f4309c);
            }
            this.f4309c = null;
            this.f4310d = null;
            this.f4311e = null;
            this.f4312f = null;
        }
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f4307a.post(this);
    }

    @Override // java.lang.Runnable
    public void run() {
        d();
        SurfaceTexture surfaceTexture = this.f4312f;
        if (surfaceTexture != null) {
            try {
                surfaceTexture.updateTexImage();
            } catch (RuntimeException unused) {
            }
        }
    }

    public RunnableC0866n(Handler handler, a aVar) {
        this.f4307a = handler;
        this.f4308b = new int[1];
    }

    public final void d() {
    }
}
