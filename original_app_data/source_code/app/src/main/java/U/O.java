package U;

import B0.c;
import E.AbstractC0807p0;
import E.J0;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.util.Size;
import android.view.Surface;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class O implements J0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Surface f16470b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f16471c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f16472d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Size f16473e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final J0.a f16474f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final J0.a f16475g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float[] f16476h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float[] f16477i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final float[] f16478j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final float[] f16479k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public X0.a f16480l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Executor f16481m;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final O7.e f16484p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public c.a f16485q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Matrix f16486r;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f16469a = new Object();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f16482n = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f16483o = false;

    public O(Surface surface, int i10, int i11, Size size, J0.a aVar, J0.a aVar2, Matrix matrix) {
        float[] fArr = new float[16];
        this.f16476h = fArr;
        float[] fArr2 = new float[16];
        this.f16477i = fArr2;
        float[] fArr3 = new float[16];
        this.f16478j = fArr3;
        float[] fArr4 = new float[16];
        this.f16479k = fArr4;
        this.f16470b = surface;
        this.f16471c = i10;
        this.f16472d = i11;
        this.f16473e = size;
        this.f16474f = aVar;
        this.f16475g = aVar2;
        this.f16486r = matrix;
        c(fArr, fArr3, aVar);
        c(fArr2, fArr4, aVar2);
        this.f16484p = B0.c.a(new c.InterfaceC0018c() { // from class: U.M
            @Override // B0.c.InterfaceC0018c
            public final Object a(c.a aVar3) {
                return O.a(this.f16466a, aVar3);
            }
        });
    }

    public static /* synthetic */ Object a(O o10, c.a aVar) {
        o10.f16485q = aVar;
        return "SurfaceOutputImpl close future complete";
    }

    public static /* synthetic */ void b(O o10, AtomicReference atomicReference) {
        o10.getClass();
        ((X0.a) atomicReference.get()).accept(J0.b.c(0, o10));
    }

    public static void c(float[] fArr, float[] fArr2, J0.a aVar) {
        android.opengl.Matrix.setIdentityM(fArr, 0);
        if (aVar == null) {
            return;
        }
        M.r.d(fArr, 0.5f);
        M.r.c(fArr, aVar.e(), 0.5f, 0.5f);
        if (aVar.d()) {
            android.opengl.Matrix.translateM(fArr, 0, 1.0f, 0.0f, 0.0f);
            android.opengl.Matrix.scaleM(fArr, 0, -1.0f, 1.0f, 1.0f);
        }
        Matrix matrixD = M.y.d(M.y.q(aVar.c()), M.y.q(M.y.n(aVar.c(), aVar.e())), aVar.e(), aVar.d());
        RectF rectF = new RectF(aVar.b());
        matrixD.mapRect(rectF);
        float width = rectF.left / r1.getWidth();
        float height = ((r1.getHeight() - rectF.height()) - rectF.top) / r1.getHeight();
        float fWidth = rectF.width() / r1.getWidth();
        float fHeight = rectF.height() / r1.getHeight();
        android.opengl.Matrix.translateM(fArr, 0, width, height, 0.0f);
        android.opengl.Matrix.scaleM(fArr, 0, fWidth, fHeight, 1.0f);
        d(fArr2, aVar.a());
        android.opengl.Matrix.multiplyMM(fArr, 0, fArr2, 0, fArr, 0);
    }

    public static void d(float[] fArr, L.J j10) {
        android.opengl.Matrix.setIdentityM(fArr, 0);
        M.r.d(fArr, 0.5f);
        if (j10 != null) {
            X0.h.j(j10.p(), "Camera has no transform.");
            M.r.c(fArr, j10.b().c(), 0.5f, 0.5f);
            if (j10.l()) {
                android.opengl.Matrix.translateM(fArr, 0, 1.0f, 0.0f, 0.0f);
                android.opengl.Matrix.scaleM(fArr, 0, -1.0f, 1.0f, 1.0f);
            }
        }
        android.opengl.Matrix.invertM(fArr, 0, fArr, 0);
    }

    @Override // E.J0
    public void A(float[] fArr, float[] fArr2, boolean z10) {
        android.opengl.Matrix.multiplyMM(fArr, 0, fArr2, 0, z10 ? this.f16476h : this.f16477i, 0);
    }

    @Override // E.J0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this.f16469a) {
            try {
                if (!this.f16483o) {
                    this.f16483o = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f16485q.c(null);
    }

    public O7.e f() {
        return this.f16484p;
    }

    public void g() {
        Executor executor;
        X0.a aVar;
        final AtomicReference atomicReference = new AtomicReference();
        synchronized (this.f16469a) {
            try {
                if (this.f16481m == null || (aVar = this.f16480l) == null) {
                    this.f16482n = true;
                } else if (!this.f16483o) {
                    atomicReference.set(aVar);
                    executor = this.f16481m;
                    this.f16482n = false;
                }
                executor = null;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (executor != null) {
            try {
                executor.execute(new Runnable() { // from class: U.N
                    @Override // java.lang.Runnable
                    public final void run() {
                        O.b(this.f16467a, atomicReference);
                    }
                });
            } catch (RejectedExecutionException e10) {
                AbstractC0807p0.b("SurfaceOutputImpl", "Processor executor closed. Close request not posted.", e10);
            }
        }
    }

    @Override // E.J0
    public int getFormat() {
        return this.f16472d;
    }

    @Override // E.J0
    public Size getSize() {
        return this.f16473e;
    }

    @Override // E.J0
    public Surface m0(Executor executor, X0.a aVar) {
        boolean z10;
        synchronized (this.f16469a) {
            this.f16481m = executor;
            this.f16480l = aVar;
            z10 = this.f16482n;
        }
        if (z10) {
            g();
        }
        return this.f16470b;
    }

    @Override // E.J0
    public void t0(float[] fArr, float[] fArr2) {
        A(fArr, fArr2, true);
    }
}
