package E;

import B0.c;
import E.S;
import L.InterfaceC1134y0;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.media.ImageWriter;
import androidx.camera.core.ImageProcessingUtil;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class V implements InterfaceC1134y0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public S.a f2867a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile int f2868b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile int f2869c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile boolean f2871e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile boolean f2872f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Executor f2873g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public androidx.camera.core.f f2874h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ImageWriter f2875i;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ByteBuffer f2880n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ByteBuffer f2881o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ByteBuffer f2882p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ByteBuffer f2883q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public ByteBuffer f2884r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public ByteBuffer f2885s;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile int f2870d = 1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Rect f2876j = new Rect();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Rect f2877k = new Rect();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Matrix f2878l = new Matrix();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Matrix f2879m = new Matrix();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Object f2886t = new Object();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f2887u = true;

    public static /* synthetic */ void b(V v10, androidx.camera.core.d dVar, Matrix matrix, androidx.camera.core.d dVar2, Rect rect, S.a aVar, c.a aVar2) {
        if (!v10.f2887u) {
            aVar2.f(new U0.k("ImageAnalysis is detached"));
            return;
        }
        G0 g02 = new G0(dVar2, AbstractC0801m0.e(dVar.L0().c(), dVar.L0().getTimestamp(), v10.f2871e ? 0 : v10.f2868b, matrix, dVar.L0().b()));
        if (!rect.isEmpty()) {
            g02.setCropRect(rect);
        }
        aVar.b(g02);
        aVar2.c(null);
    }

    public static /* synthetic */ Object c(final V v10, Executor executor, final androidx.camera.core.d dVar, final Matrix matrix, final androidx.camera.core.d dVar2, final Rect rect, final S.a aVar, final c.a aVar2) {
        v10.getClass();
        executor.execute(new Runnable() { // from class: E.U
            @Override // java.lang.Runnable
            public final void run() {
                V.b(this.f2858a, dVar, matrix, dVar2, rect, aVar, aVar2);
            }
        });
        return "analyzeImage";
    }

    public static androidx.camera.core.f h(int i10, int i11, int i12, int i13, int i14) {
        boolean z10 = i12 == 90 || i12 == 270;
        int i15 = z10 ? i11 : i10;
        if (!z10) {
            i10 = i11;
        }
        return new androidx.camera.core.f(AbstractC0799l0.a(i15, i10, i13, i14));
    }

    public static Matrix j(int i10, int i11, int i12, int i13, int i14) {
        Matrix matrix = new Matrix();
        if (i14 > 0) {
            matrix.setRectToRect(new RectF(0.0f, 0.0f, i10, i11), M.y.f8879a, Matrix.ScaleToFit.FILL);
            matrix.postRotate(i14);
            matrix.postConcat(M.y.b(new RectF(0.0f, 0.0f, i12, i13)));
        }
        return matrix;
    }

    public static Rect k(Rect rect, Matrix matrix) {
        RectF rectF = new RectF(rect);
        matrix.mapRect(rectF);
        Rect rect2 = new Rect();
        rectF.round(rect2);
        return rect2;
    }

    @Override // L.InterfaceC1134y0.a
    public void a(InterfaceC1134y0 interfaceC1134y0) {
        try {
            androidx.camera.core.d dVarD = d(interfaceC1134y0);
            if (dVarD != null) {
                l(dVarD);
            }
        } catch (IllegalStateException e10) {
            AbstractC0807p0.d("ImageAnalysisAnalyzer", "Failed to acquire image.", e10);
        }
    }

    public abstract androidx.camera.core.d d(InterfaceC1134y0 interfaceC1134y0);

    public O7.e e(final androidx.camera.core.d dVar) throws Throwable {
        Object obj;
        final Executor executor;
        final S.a aVar;
        boolean z10;
        androidx.camera.core.f fVar;
        ImageWriter imageWriter;
        ByteBuffer byteBuffer;
        ByteBuffer byteBuffer2;
        ByteBuffer byteBuffer3;
        ByteBuffer byteBuffer4;
        ByteBuffer byteBuffer5;
        ByteBuffer byteBuffer6;
        androidx.camera.core.d dVarO;
        androidx.camera.core.d dVar2;
        int i10 = this.f2871e ? this.f2868b : 0;
        Object obj2 = this.f2886t;
        synchronized (obj2) {
            try {
                try {
                    executor = this.f2873g;
                    aVar = this.f2867a;
                    z10 = this.f2871e && i10 != this.f2869c;
                    if (z10) {
                        n(dVar, i10);
                    }
                    if (this.f2871e || this.f2870d == 3) {
                        g(dVar);
                    }
                    try {
                        fVar = this.f2874h;
                    } catch (Throwable th) {
                        th = th;
                        obj = obj2;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    obj = obj2;
                }
            } catch (Throwable th3) {
                th = th3;
            }
            try {
                imageWriter = this.f2875i;
                byteBuffer = this.f2880n;
                byteBuffer2 = this.f2881o;
                byteBuffer3 = this.f2882p;
                byteBuffer4 = this.f2883q;
                byteBuffer5 = this.f2884r;
                byteBuffer6 = this.f2885s;
            } catch (Throwable th4) {
                th = th4;
                obj = obj2;
                throw th;
            }
        }
        if (aVar == null || executor == null || !this.f2887u) {
            return O.n.n(new U0.k("No analyzer or executor currently set."));
        }
        if (fVar != null) {
            if (this.f2870d == 2) {
                dVarO = ImageProcessingUtil.g(dVar, fVar, byteBuffer, i10, this.f2872f);
            } else {
                if (this.f2870d == 1) {
                    if (this.f2872f) {
                        ImageProcessingUtil.c(dVar);
                    }
                    if (imageWriter != null && byteBuffer2 != null && byteBuffer3 != null && byteBuffer4 != null) {
                        dVarO = ImageProcessingUtil.n(dVar, fVar, imageWriter, byteBuffer2, byteBuffer3, byteBuffer4, i10);
                    }
                }
                dVar2 = null;
            }
            dVar2 = dVarO;
        } else {
            if (this.f2870d == 3) {
                if (this.f2872f) {
                    ImageProcessingUtil.c(dVar);
                }
                if (byteBuffer2 != null && byteBuffer3 != null && byteBuffer4 != null && byteBuffer5 != null && byteBuffer6 != null) {
                    dVarO = ImageProcessingUtil.o(dVar, byteBuffer2, byteBuffer3, byteBuffer4, byteBuffer5, byteBuffer6, i10);
                    dVar2 = dVarO;
                }
            }
            dVar2 = null;
        }
        boolean z11 = dVar2 == null;
        final androidx.camera.core.d dVar3 = z11 ? dVar : dVar2;
        final Rect rect = new Rect();
        final Matrix matrix = new Matrix();
        synchronized (this.f2886t) {
            if (z10 && !z11) {
                try {
                    m(dVar.getWidth(), dVar.getHeight(), dVar3.getWidth(), dVar3.getHeight());
                } finally {
                }
            }
            this.f2869c = i10;
            rect.set(this.f2877k);
            matrix.set(this.f2879m);
        }
        return B0.c.a(new c.InterfaceC0018c() { // from class: E.T
            @Override // B0.c.InterfaceC0018c
            public final Object a(c.a aVar2) {
                return V.c(this.f2849a, executor, dVar, matrix, dVar3, rect, aVar, aVar2);
            }
        });
    }

    public abstract void f();

    public final void g(androidx.camera.core.d dVar) {
        if (this.f2870d != 1 && this.f2870d != 3) {
            if (this.f2870d == 2 && this.f2880n == null) {
                this.f2880n = ByteBuffer.allocateDirect(dVar.getWidth() * dVar.getHeight() * 4);
                return;
            }
            return;
        }
        if (this.f2881o == null) {
            this.f2881o = ByteBuffer.allocateDirect(dVar.getWidth() * dVar.getHeight());
        }
        this.f2881o.position(0);
        if (this.f2882p == null) {
            this.f2882p = ByteBuffer.allocateDirect((dVar.getWidth() * dVar.getHeight()) / 4);
        }
        this.f2882p.position(0);
        if (this.f2883q == null) {
            this.f2883q = ByteBuffer.allocateDirect((dVar.getWidth() * dVar.getHeight()) / 4);
        }
        this.f2883q.position(0);
        if (this.f2870d == 3) {
            if (this.f2884r == null) {
                this.f2884r = ByteBuffer.allocateDirect(dVar.getWidth() * dVar.getHeight());
            }
            this.f2884r.position(0);
            if (this.f2885s == null) {
                this.f2885s = ByteBuffer.allocateDirect((dVar.getWidth() * dVar.getHeight()) / 2);
            }
            this.f2885s.position(0);
        }
    }

    public void i() {
        this.f2887u = false;
        f();
    }

    public abstract void l(androidx.camera.core.d dVar);

    public final void m(int i10, int i11, int i12, int i13) {
        Matrix matrixJ = j(i10, i11, i12, i13, this.f2868b);
        this.f2877k = k(this.f2876j, matrixJ);
        this.f2879m.setConcat(this.f2878l, matrixJ);
    }

    public final void n(androidx.camera.core.d dVar, int i10) {
        androidx.camera.core.f fVar = this.f2874h;
        if (fVar == null) {
            return;
        }
        fVar.i();
        this.f2874h = h(dVar.getWidth(), dVar.getHeight(), i10, this.f2874h.b(), this.f2874h.e());
        if (this.f2870d == 1) {
            ImageWriter imageWriter = this.f2875i;
            if (imageWriter != null) {
                Q.a.a(imageWriter);
            }
            this.f2875i = Q.a.c(this.f2874h.getSurface(), this.f2874h.e());
        }
    }

    public void o(Executor executor, S.a aVar) {
        if (aVar == null) {
            f();
        }
        synchronized (this.f2886t) {
            this.f2867a = aVar;
            this.f2873g = executor;
        }
    }

    public void p(boolean z10) {
        this.f2872f = z10;
    }

    public void q(int i10) {
        this.f2870d = i10;
    }

    public void r(boolean z10) {
        this.f2871e = z10;
    }

    public void s(androidx.camera.core.f fVar) {
        synchronized (this.f2886t) {
            this.f2874h = fVar;
        }
    }

    public void t(int i10) {
        this.f2868b = i10;
    }

    public void u(Matrix matrix) {
        synchronized (this.f2886t) {
            this.f2878l = matrix;
            this.f2879m = new Matrix(this.f2878l);
        }
    }

    public void v(Rect rect) {
        synchronized (this.f2886t) {
            this.f2876j = rect;
            this.f2877k = new Rect(this.f2876j);
        }
    }
}
