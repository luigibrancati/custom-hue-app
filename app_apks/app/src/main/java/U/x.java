package U;

import E.AbstractC0807p0;
import W.d;
import W.e;
import android.graphics.Bitmap;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.util.Log;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.ImageProcessingUtil;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import org.webrtc.EglBase;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class x {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Thread f16559c;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public EGLConfig f16563g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Surface f16565i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f16557a = new AtomicBoolean(false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f16558b = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public EGLDisplay f16560d = EGL14.EGL_NO_DISPLAY;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public EGLContext f16561e = EGL14.EGL_NO_CONTEXT;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int[] f16562f = W.d.f17614a;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public EGLSurface f16564h = EGL14.EGL_NO_SURFACE;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Map f16566j = Collections.EMPTY_MAP;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public d.f f16567k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public d.e f16568l = d.e.UNKNOWN;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f16569m = -1;

    public final void a(int i10) {
        GLES20.glActiveTexture(33984);
        W.d.g("glActiveTexture");
        GLES20.glBindTexture(36197, i10);
        W.d.g("glBindTexture");
    }

    public final void b(E.J j10, e.a aVar) {
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        this.f16560d = eGLDisplayEglGetDisplay;
        if (Objects.equals(eGLDisplayEglGetDisplay, EGL14.EGL_NO_DISPLAY)) {
            throw new IllegalStateException("Unable to get EGL14 display");
        }
        int[] iArr = new int[2];
        if (!EGL14.eglInitialize(this.f16560d, iArr, 0, iArr, 1)) {
            this.f16560d = EGL14.EGL_NO_DISPLAY;
            throw new IllegalStateException("Unable to initialize EGL14");
        }
        if (aVar != null) {
            aVar.c(iArr[0] + "." + iArr[1]);
        }
        int i10 = j10.d() ? 10 : 8;
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        if (!EGL14.eglChooseConfig(this.f16560d, new int[]{12324, i10, 12323, i10, 12322, i10, 12321, j10.d() ? 2 : 8, 12325, 0, 12326, 0, 12352, j10.d() ? 64 : 4, EglBase.EGL_RECORDABLE_ANDROID, j10.d() ? -1 : 1, 12339, 5, 12344}, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
            throw new IllegalStateException("Unable to find a suitable EGLConfig");
        }
        EGLConfig eGLConfig = eGLConfigArr[0];
        EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext(this.f16560d, eGLConfig, EGL14.EGL_NO_CONTEXT, new int[]{12440, j10.d() ? 3 : 2, 12344}, 0);
        W.d.f("eglCreateContext");
        this.f16563g = eGLConfig;
        this.f16561e = eGLContextEglCreateContext;
        int[] iArr2 = new int[1];
        EGL14.eglQueryContext(this.f16560d, eGLContextEglCreateContext, 12440, iArr2, 0);
        Log.d("OpenGlRenderer", "EGLContext created, client version " + iArr2[0]);
    }

    public W.g c(Surface surface) {
        try {
            EGLDisplay eGLDisplay = this.f16560d;
            EGLConfig eGLConfig = this.f16563g;
            Objects.requireNonNull(eGLConfig);
            EGLSurface eGLSurfaceQ = W.d.q(eGLDisplay, eGLConfig, surface, this.f16562f);
            Size sizeX = W.d.x(this.f16560d, eGLSurfaceQ);
            return W.g.d(eGLSurfaceQ, sizeX.getWidth(), sizeX.getHeight());
        } catch (IllegalArgumentException | IllegalStateException e10) {
            AbstractC0807p0.m("OpenGlRenderer", "Failed to create EGL surface: " + e10.getMessage(), e10);
            return null;
        }
    }

    public final void d() {
        EGLDisplay eGLDisplay = this.f16560d;
        EGLConfig eGLConfig = this.f16563g;
        Objects.requireNonNull(eGLConfig);
        this.f16564h = W.d.n(eGLDisplay, eGLConfig, 1, 1);
    }

    public final X0.d e(E.J j10) {
        W.d.i(this.f16557a, false);
        try {
            b(j10, null);
            d();
            i(this.f16564h);
            String strGlGetString = GLES20.glGetString(7939);
            String strEglQueryString = EGL14.eglQueryString(this.f16560d, 12373);
            if (strGlGetString == null) {
                strGlGetString = "";
            }
            if (strEglQueryString == null) {
                strEglQueryString = "";
            }
            return new X0.d(strGlGetString, strEglQueryString);
        } catch (IllegalStateException e10) {
            AbstractC0807p0.m("OpenGlRenderer", "Failed to get GL or EGL extensions: " + e10.getMessage(), e10);
            return new X0.d("", "");
        } finally {
            l();
        }
    }

    public W.g f(Surface surface) {
        X0.h.j(this.f16558b.containsKey(surface), "The surface is not registered.");
        W.g gVar = (W.g) this.f16558b.get(surface);
        Objects.requireNonNull(gVar);
        return gVar;
    }

    public int g() {
        W.d.i(this.f16557a, true);
        W.d.h(this.f16559c);
        return this.f16569m;
    }

    public W.e h(E.J j10, Map map) {
        W.d.i(this.f16557a, false);
        e.a aVarA = W.e.a();
        try {
            if (j10.d()) {
                X0.d dVarE = e(j10);
                String str = (String) X0.h.g((String) dVarE.f17986a);
                String str2 = (String) X0.h.g((String) dVarE.f17987b);
                if (!str.contains("GL_EXT_YUV_target")) {
                    AbstractC0807p0.l("OpenGlRenderer", "Device does not support GL_EXT_YUV_target. Fallback to SDR.");
                    j10 = E.J.f2794d;
                }
                this.f16562f = W.d.k(str2, j10);
                aVarA.d(str);
                aVarA.b(str2);
            }
            b(j10, aVarA);
            d();
            i(this.f16564h);
            aVarA.e(W.d.w());
            this.f16566j = W.d.o(j10, map);
            int iP = W.d.p();
            this.f16569m = iP;
            s(iP);
            this.f16559c = Thread.currentThread();
            this.f16557a.set(true);
            return aVarA.a();
        } catch (IllegalArgumentException | IllegalStateException e10) {
            l();
            throw e10;
        }
    }

    public void i(EGLSurface eGLSurface) {
        X0.h.g(this.f16560d);
        X0.h.g(this.f16561e);
        if (!EGL14.eglMakeCurrent(this.f16560d, eGLSurface, eGLSurface, this.f16561e)) {
            throw new IllegalStateException("eglMakeCurrent failed");
        }
    }

    public void j(Surface surface) {
        W.d.i(this.f16557a, true);
        W.d.h(this.f16559c);
        if (this.f16558b.containsKey(surface)) {
            return;
        }
        this.f16558b.put(surface, W.d.f17625l);
    }

    public void k() {
        if (this.f16557a.getAndSet(false)) {
            W.d.h(this.f16559c);
            l();
        }
    }

    public final void l() {
        Iterator it = this.f16566j.values().iterator();
        while (it.hasNext()) {
            ((d.f) it.next()).b();
        }
        this.f16566j = Collections.EMPTY_MAP;
        this.f16567k = null;
        if (!Objects.equals(this.f16560d, EGL14.EGL_NO_DISPLAY)) {
            EGLDisplay eGLDisplay = this.f16560d;
            EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            for (W.g gVar : this.f16558b.values()) {
                if (!Objects.equals(gVar.a(), EGL14.EGL_NO_SURFACE) && !EGL14.eglDestroySurface(this.f16560d, gVar.a())) {
                    W.d.e("eglDestroySurface");
                }
            }
            this.f16558b.clear();
            if (!Objects.equals(this.f16564h, EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(this.f16560d, this.f16564h);
                this.f16564h = EGL14.EGL_NO_SURFACE;
            }
            if (!Objects.equals(this.f16561e, EGL14.EGL_NO_CONTEXT)) {
                EGL14.eglDestroyContext(this.f16560d, this.f16561e);
                this.f16561e = EGL14.EGL_NO_CONTEXT;
            }
            EGL14.eglReleaseThread();
            EGL14.eglTerminate(this.f16560d);
            this.f16560d = EGL14.EGL_NO_DISPLAY;
        }
        this.f16563g = null;
        this.f16569m = -1;
        this.f16568l = d.e.UNKNOWN;
        this.f16565i = null;
        this.f16559c = null;
    }

    public void m(Surface surface, boolean z10) {
        if (this.f16565i == surface) {
            this.f16565i = null;
            i(this.f16564h);
        }
        W.g gVar = z10 ? (W.g) this.f16558b.remove(surface) : (W.g) this.f16558b.put(surface, W.d.f17625l);
        if (gVar == null || gVar == W.d.f17625l) {
            return;
        }
        try {
            EGL14.eglDestroySurface(this.f16560d, gVar.a());
        } catch (RuntimeException e10) {
            AbstractC0807p0.m("OpenGlRenderer", "Failed to destroy EGL surface: " + e10.getMessage(), e10);
        }
    }

    public void n(long j10, float[] fArr, Surface surface) {
        W.d.i(this.f16557a, true);
        W.d.h(this.f16559c);
        W.g gVarF = f(surface);
        if (gVarF == W.d.f17625l) {
            gVarF = c(surface);
            if (gVarF == null) {
                return;
            } else {
                this.f16558b.put(surface, gVarF);
            }
        }
        if (surface != this.f16565i) {
            i(gVarF.a());
            this.f16565i = surface;
            GLES20.glViewport(0, 0, gVarF.c(), gVarF.b());
            GLES20.glScissor(0, 0, gVarF.c(), gVarF.b());
        }
        d.f fVar = (d.f) X0.h.g(this.f16567k);
        if (fVar instanceof d.g) {
            ((d.g) fVar).h(fArr);
        }
        GLES20.glDrawArrays(5, 0, 4);
        W.d.g("glDrawArrays");
        EGLExt.eglPresentationTimeANDROID(this.f16560d, gVarF.a(), j10);
        if (EGL14.eglSwapBuffers(this.f16560d, gVarF.a())) {
            return;
        }
        AbstractC0807p0.l("OpenGlRenderer", "Failed to swap buffers with EGL error: 0x" + Integer.toHexString(EGL14.eglGetError()));
        m(surface, false);
    }

    public void o(d.e eVar) {
        W.d.i(this.f16557a, true);
        W.d.h(this.f16559c);
        if (this.f16568l != eVar) {
            this.f16568l = eVar;
            s(this.f16569m);
        }
    }

    public Bitmap p(Size size, float[] fArr) {
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(size.getWidth() * size.getHeight() * 4);
        q(byteBufferAllocateDirect, size, fArr);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(size.getWidth(), size.getHeight(), Bitmap.Config.ARGB_8888);
        byteBufferAllocateDirect.rewind();
        ImageProcessingUtil.j(bitmapCreateBitmap, byteBufferAllocateDirect, size.getWidth() * 4);
        return bitmapCreateBitmap;
    }

    public final void q(ByteBuffer byteBuffer, Size size, float[] fArr) {
        X0.h.b(byteBuffer.capacity() == (size.getWidth() * size.getHeight()) * 4, "ByteBuffer capacity is not equal to width * height * 4.");
        X0.h.b(byteBuffer.isDirect(), "ByteBuffer is not direct.");
        int iU = W.d.u();
        GLES20.glActiveTexture(33985);
        W.d.g("glActiveTexture");
        GLES20.glBindTexture(3553, iU);
        W.d.g("glBindTexture");
        GLES20.glTexImage2D(3553, 0, 6407, size.getWidth(), size.getHeight(), 0, 6407, 5121, null);
        W.d.g("glTexImage2D");
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glTexParameteri(3553, 10241, 9729);
        int iT = W.d.t();
        GLES20.glBindFramebuffer(36160, iT);
        W.d.g("glBindFramebuffer");
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, iU, 0);
        W.d.g("glFramebufferTexture2D");
        GLES20.glActiveTexture(33984);
        W.d.g("glActiveTexture");
        GLES20.glBindTexture(36197, this.f16569m);
        W.d.g("glBindTexture");
        this.f16565i = null;
        GLES20.glViewport(0, 0, size.getWidth(), size.getHeight());
        GLES20.glScissor(0, 0, size.getWidth(), size.getHeight());
        d.f fVar = (d.f) X0.h.g(this.f16567k);
        if (fVar instanceof d.g) {
            ((d.g) fVar).h(fArr);
        }
        GLES20.glDrawArrays(5, 0, 4);
        W.d.g("glDrawArrays");
        GLES20.glReadPixels(0, 0, size.getWidth(), size.getHeight(), 6408, 5121, byteBuffer);
        W.d.g("glReadPixels");
        GLES20.glBindFramebuffer(36160, 0);
        W.d.s(iU);
        W.d.r(iT);
        a(this.f16569m);
    }

    public void r(Surface surface) {
        W.d.i(this.f16557a, true);
        W.d.h(this.f16559c);
        m(surface, true);
    }

    public void s(int i10) {
        d.f fVar = (d.f) this.f16566j.get(this.f16568l);
        if (fVar == null) {
            throw new IllegalStateException("Unable to configure program for input format: " + this.f16568l);
        }
        if (this.f16567k != fVar) {
            this.f16567k = fVar;
            fVar.f();
            Log.d("OpenGlRenderer", "Using program for input format " + this.f16568l + ": " + this.f16567k);
        }
        a(i10);
    }
}
