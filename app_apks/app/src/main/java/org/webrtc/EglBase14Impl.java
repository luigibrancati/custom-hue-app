package org.webrtc;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import android.opengl.GLException;
import android.view.Surface;
import org.webrtc.EglBase14;
import org.webrtc.EglBase14Impl;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes5.dex */
class EglBase14Impl implements EglBase14 {
    private static final EglConnection EGL_NO_CONNECTION = new EglConnection();
    private static final String TAG = "EglBase14Impl";
    private EglConnection eglConnection;
    private EGLSurface eglSurface = EGL14.EGL_NO_SURFACE;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class Context implements EglBase14.Context {
        private final EGLContext egl14Context;

        public Context(EGLContext eGLContext) {
            this.egl14Context = eGLContext;
        }

        @Override // org.webrtc.EglBase.Context
        public long getNativeEglContext() {
            return this.egl14Context.getNativeHandle();
        }

        @Override // org.webrtc.EglBase14.Context
        public EGLContext getRawContext() {
            return this.egl14Context;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class EglConnection implements EglBase14.EglConnection {
        private EGLSurface currentSurface;
        private final EGLConfig eglConfig;
        private final EGLContext eglContext;
        private final EGLDisplay eglDisplay;
        private final RefCountDelegate refCountDelegate;

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$new$0() {
            synchronized (EglBase.lock) {
                EGLDisplay eGLDisplay = this.eglDisplay;
                EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
                EGL14.eglDestroyContext(this.eglDisplay, this.eglContext);
            }
            EGL14.eglReleaseThread();
            EGL14.eglTerminate(this.eglDisplay);
            this.currentSurface = EGL14.EGL_NO_SURFACE;
        }

        public void detachCurrent() {
            synchronized (EglBase.lock) {
                EGLDisplay eGLDisplay = this.eglDisplay;
                EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                if (!EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT)) {
                    throw new GLException(EGL14.eglGetError(), "eglDetachCurrent failed: 0x" + Integer.toHexString(EGL14.eglGetError()));
                }
            }
            this.currentSurface = EGL14.EGL_NO_SURFACE;
        }

        @Override // org.webrtc.EglBase14.EglConnection
        public EGLConfig getConfig() {
            return this.eglConfig;
        }

        @Override // org.webrtc.EglBase14.EglConnection
        public EGLContext getContext() {
            return this.eglContext;
        }

        @Override // org.webrtc.EglBase14.EglConnection
        public EGLDisplay getDisplay() {
            return this.eglDisplay;
        }

        public void makeCurrent(EGLSurface eGLSurface) {
            if (EGL14.eglGetCurrentContext() == this.eglContext && this.currentSurface == eGLSurface) {
                return;
            }
            synchronized (EglBase.lock) {
                if (!EGL14.eglMakeCurrent(this.eglDisplay, eGLSurface, eGLSurface, this.eglContext)) {
                    throw new GLException(EGL14.eglGetError(), "eglMakeCurrent failed: 0x" + Integer.toHexString(EGL14.eglGetError()));
                }
            }
            this.currentSurface = eGLSurface;
        }

        @Override // org.webrtc.RefCounted
        public void release() {
            this.refCountDelegate.release();
        }

        @Override // org.webrtc.RefCounted
        public void retain() {
            this.refCountDelegate.retain();
        }

        public EglConnection(EGLContext eGLContext, int[] iArr) {
            this.currentSurface = EGL14.EGL_NO_SURFACE;
            EGLDisplay eglDisplay = EglBase14Impl.getEglDisplay();
            this.eglDisplay = eglDisplay;
            EGLConfig eglConfig = EglBase14Impl.getEglConfig(eglDisplay, iArr);
            this.eglConfig = eglConfig;
            int openGlesVersionFromConfig = EglBase.getOpenGlesVersionFromConfig(iArr);
            Logging.d(EglBase14Impl.TAG, "Using OpenGL ES version " + openGlesVersionFromConfig);
            this.eglContext = EglBase14Impl.createEglContext(eGLContext, eglDisplay, eglConfig, openGlesVersionFromConfig);
            this.refCountDelegate = new RefCountDelegate(new Runnable() { // from class: org.webrtc.k
                @Override // java.lang.Runnable
                public final void run() {
                    this.f41693a.lambda$new$0();
                }
            });
        }

        private EglConnection() {
            this.currentSurface = EGL14.EGL_NO_SURFACE;
            this.eglContext = EGL14.EGL_NO_CONTEXT;
            this.eglDisplay = EGL14.EGL_NO_DISPLAY;
            this.eglConfig = null;
            this.refCountDelegate = new RefCountDelegate(new Runnable() { // from class: org.webrtc.l
                @Override // java.lang.Runnable
                public final void run() {
                    EglBase14Impl.EglConnection.b();
                }
            });
        }

        public static /* synthetic */ void b() {
        }
    }

    public EglBase14Impl(EGLContext eGLContext, int[] iArr) {
        this.eglConnection = new EglConnection(eGLContext, iArr);
    }

    private void checkIsNotReleased() {
        if (this.eglConnection == EGL_NO_CONNECTION) {
            throw new RuntimeException("This object has been released");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static EGLContext createEglContext(EGLContext eGLContext, EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i10) {
        EGLContext eGLContextEglCreateContext;
        if (eGLContext != null && eGLContext == EGL14.EGL_NO_CONTEXT) {
            throw new RuntimeException("Invalid sharedContext");
        }
        int[] iArr = {12440, i10, 12344};
        if (eGLContext == null) {
            eGLContext = EGL14.EGL_NO_CONTEXT;
        }
        synchronized (EglBase.lock) {
            eGLContextEglCreateContext = EGL14.eglCreateContext(eGLDisplay, eGLConfig, eGLContext, iArr, 0);
        }
        if (eGLContextEglCreateContext != EGL14.EGL_NO_CONTEXT) {
            return eGLContextEglCreateContext;
        }
        throw new GLException(EGL14.eglGetError(), "Failed to create EGL context: 0x" + Integer.toHexString(EGL14.eglGetError()));
    }

    private void createSurfaceInternal(Object obj) {
        if (!(obj instanceof Surface) && !(obj instanceof SurfaceTexture)) {
            throw new IllegalStateException("Input must be either a Surface or SurfaceTexture");
        }
        checkIsNotReleased();
        if (this.eglSurface != EGL14.EGL_NO_SURFACE) {
            throw new RuntimeException("Already has an EGLSurface");
        }
        EGLSurface eGLSurfaceEglCreateWindowSurface = EGL14.eglCreateWindowSurface(this.eglConnection.getDisplay(), this.eglConnection.getConfig(), obj, new int[]{12344}, 0);
        this.eglSurface = eGLSurfaceEglCreateWindowSurface;
        if (eGLSurfaceEglCreateWindowSurface != EGL14.EGL_NO_SURFACE) {
            return;
        }
        throw new GLException(EGL14.eglGetError(), "Failed to create window surface: 0x" + Integer.toHexString(EGL14.eglGetError()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static EGLConfig getEglConfig(EGLDisplay eGLDisplay, int[] iArr) {
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr2 = new int[1];
        if (EGL14.eglChooseConfig(eGLDisplay, iArr, 0, eGLConfigArr, 0, 1, iArr2, 0)) {
            if (iArr2[0] <= 0) {
                throw new RuntimeException("Unable to find any matching EGL config");
            }
            EGLConfig eGLConfig = eGLConfigArr[0];
            if (eGLConfig != null) {
                return eGLConfig;
            }
            throw new RuntimeException("eglChooseConfig returned null");
        }
        throw new GLException(EGL14.eglGetError(), "eglChooseConfig failed: 0x" + Integer.toHexString(EGL14.eglGetError()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static EGLDisplay getEglDisplay() {
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        if (eGLDisplayEglGetDisplay == EGL14.EGL_NO_DISPLAY) {
            throw new GLException(EGL14.eglGetError(), "Unable to get EGL14 display: 0x" + Integer.toHexString(EGL14.eglGetError()));
        }
        int[] iArr = new int[2];
        if (EGL14.eglInitialize(eGLDisplayEglGetDisplay, iArr, 0, iArr, 1)) {
            return eGLDisplayEglGetDisplay;
        }
        throw new GLException(EGL14.eglGetError(), "Unable to initialize EGL14: 0x" + Integer.toHexString(EGL14.eglGetError()));
    }

    @Override // org.webrtc.EglBase
    public void createDummyPbufferSurface() {
        createPbufferSurface(1, 1);
    }

    @Override // org.webrtc.EglBase
    public void createPbufferSurface(int i10, int i11) {
        checkIsNotReleased();
        if (this.eglSurface != EGL14.EGL_NO_SURFACE) {
            throw new RuntimeException("Already has an EGLSurface");
        }
        EGLSurface eGLSurfaceEglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(this.eglConnection.getDisplay(), this.eglConnection.getConfig(), new int[]{12375, i10, 12374, i11, 12344}, 0);
        this.eglSurface = eGLSurfaceEglCreatePbufferSurface;
        if (eGLSurfaceEglCreatePbufferSurface != EGL14.EGL_NO_SURFACE) {
            return;
        }
        throw new GLException(EGL14.eglGetError(), "Failed to create pixel buffer surface with size " + i10 + "x" + i11 + ": 0x" + Integer.toHexString(EGL14.eglGetError()));
    }

    @Override // org.webrtc.EglBase
    public void createSurface(Surface surface) {
        createSurfaceInternal(surface);
    }

    @Override // org.webrtc.EglBase
    public void detachCurrent() {
        this.eglConnection.detachCurrent();
    }

    @Override // org.webrtc.EglBase
    public boolean hasSurface() {
        return this.eglSurface != EGL14.EGL_NO_SURFACE;
    }

    @Override // org.webrtc.EglBase
    public void makeCurrent() {
        checkIsNotReleased();
        EGLSurface eGLSurface = this.eglSurface;
        if (eGLSurface == EGL14.EGL_NO_SURFACE) {
            throw new RuntimeException("No EGLSurface - can't make current");
        }
        this.eglConnection.makeCurrent(eGLSurface);
    }

    @Override // org.webrtc.EglBase
    public void release() {
        checkIsNotReleased();
        releaseSurface();
        this.eglConnection.release();
        this.eglConnection = EGL_NO_CONNECTION;
    }

    @Override // org.webrtc.EglBase
    public void releaseSurface() {
        if (this.eglSurface != EGL14.EGL_NO_SURFACE) {
            EGL14.eglDestroySurface(this.eglConnection.getDisplay(), this.eglSurface);
            this.eglSurface = EGL14.EGL_NO_SURFACE;
        }
    }

    @Override // org.webrtc.EglBase
    public int surfaceHeight() {
        int[] iArr = new int[1];
        EGL14.eglQuerySurface(this.eglConnection.getDisplay(), this.eglSurface, 12374, iArr, 0);
        return iArr[0];
    }

    @Override // org.webrtc.EglBase
    public int surfaceWidth() {
        int[] iArr = new int[1];
        EGL14.eglQuerySurface(this.eglConnection.getDisplay(), this.eglSurface, 12375, iArr, 0);
        return iArr[0];
    }

    @Override // org.webrtc.EglBase
    public void swapBuffers() {
        checkIsNotReleased();
        if (this.eglSurface == EGL14.EGL_NO_SURFACE) {
            throw new RuntimeException("No EGLSurface - can't swap buffers");
        }
        synchronized (EglBase.lock) {
            EGL14.eglSwapBuffers(this.eglConnection.getDisplay(), this.eglSurface);
        }
    }

    @Override // org.webrtc.EglBase
    public void createSurface(SurfaceTexture surfaceTexture) {
        createSurfaceInternal(surfaceTexture);
    }

    @Override // org.webrtc.EglBase
    public Context getEglBaseContext() {
        return new Context(this.eglConnection.getContext());
    }

    public EglBase14Impl(EglConnection eglConnection) {
        this.eglConnection = eglConnection;
        eglConnection.retain();
    }

    @Override // org.webrtc.EglBase
    public void swapBuffers(long j10) {
        checkIsNotReleased();
        if (this.eglSurface != EGL14.EGL_NO_SURFACE) {
            synchronized (EglBase.lock) {
                EGLExt.eglPresentationTimeANDROID(this.eglConnection.getDisplay(), this.eglSurface, j10);
                EGL14.eglSwapBuffers(this.eglConnection.getDisplay(), this.eglSurface);
            }
            return;
        }
        throw new RuntimeException("No EGLSurface - can't swap buffers");
    }
}
