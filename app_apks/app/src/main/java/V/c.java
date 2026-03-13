package V;

import E.AbstractC0807p0;
import E.I;
import E.J;
import E.J0;
import U.x;
import W.d;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLExt;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.util.Size;
import android.view.Surface;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class c extends x {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f17140n = -1;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f17141o = -1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final I f17142p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final I f17143q;

    public c(I i10, I i11) {
        this.f17142p = i10;
        this.f17143q = i11;
    }

    public static float[] u(Size size, Size size2, I i10) {
        float[] fArrL = W.d.l();
        float[] fArrL2 = W.d.l();
        float[] fArrL3 = W.d.l();
        Matrix.scaleM(fArrL, 0, size.getWidth() / size2.getWidth(), size.getHeight() / size2.getHeight(), 1.0f);
        if (((Float) i10.c().f17986a).floatValue() != 0.0f || ((Float) i10.c().f17987b).floatValue() != 0.0f) {
            Matrix.translateM(fArrL2, 0, ((Float) i10.b().f17986a).floatValue() / ((Float) i10.c().f17986a).floatValue(), ((Float) i10.b().f17987b).floatValue() / ((Float) i10.c().f17987b).floatValue(), 0.0f);
        }
        Matrix.multiplyMM(fArrL3, 0, fArrL, 0, fArrL2, 0);
        return fArrL3;
    }

    @Override // U.x
    public W.e h(J j10, Map map) {
        W.e eVarH = super.h(j10, map);
        this.f17140n = W.d.p();
        this.f17141o = W.d.p();
        return eVarH;
    }

    @Override // U.x
    public void k() {
        super.k();
        this.f17140n = -1;
        this.f17141o = -1;
    }

    public int t(boolean z10) {
        W.d.i(this.f16557a, true);
        W.d.h(this.f16559c);
        return z10 ? this.f17140n : this.f17141o;
    }

    public void v(long j10, Surface surface, J0 j02, SurfaceTexture surfaceTexture, SurfaceTexture surfaceTexture2) {
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
        W.g gVar = gVarF;
        if (surface != this.f16565i) {
            i(gVar.a());
            this.f16565i = surface;
        }
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
        GLES20.glClear(16384);
        w(gVar, j02, surfaceTexture, this.f17142p, this.f17140n, true);
        w(gVar, j02, surfaceTexture2, this.f17143q, this.f17141o, false);
        EGLExt.eglPresentationTimeANDROID(this.f16560d, gVar.a(), j10);
        if (EGL14.eglSwapBuffers(this.f16560d, gVar.a())) {
            return;
        }
        AbstractC0807p0.l("DualOpenGlRenderer", "Failed to swap buffers with EGL error: 0x" + Integer.toHexString(EGL14.eglGetError()));
        m(surface, false);
    }

    public final void w(W.g gVar, J0 j02, SurfaceTexture surfaceTexture, I i10, int i11, boolean z10) {
        s(i11);
        GLES20.glViewport(0, 0, gVar.c(), gVar.b());
        GLES20.glScissor(0, 0, gVar.c(), gVar.b());
        float[] fArr = new float[16];
        surfaceTexture.getTransformMatrix(fArr);
        float[] fArr2 = new float[16];
        j02.A(fArr2, fArr, z10);
        d.f fVar = (d.f) X0.h.g(this.f16567k);
        if (fVar instanceof d.g) {
            ((d.g) fVar).h(fArr2);
        }
        fVar.e(u(new Size((int) (gVar.c() * ((Float) i10.c().f17986a).floatValue()), (int) (gVar.b() * ((Float) i10.c().f17987b).floatValue())), new Size(gVar.c(), gVar.b()), i10));
        fVar.d(i10.a());
        GLES20.glEnable(3042);
        GLES20.glBlendFuncSeparate(770, 771, 1, 771);
        GLES20.glDrawArrays(5, 0, 4);
        W.d.g("glDrawArrays");
        GLES20.glDisable(3042);
    }
}
