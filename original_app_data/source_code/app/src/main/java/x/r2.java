package x;

import B0.c;
import E.AbstractC0807p0;
import E.InterfaceC0802n;
import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Looper;
import android.util.Range;
import androidx.lifecycle.AbstractC2763t;
import java.util.concurrent.Executor;
import w.C6107a;
import x.C6266v;
import y.C6378n;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class r2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C6266v f47118a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f47119b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s2 f47120c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final androidx.lifecycle.w f47121d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b f47122e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f47123f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public C6266v.c f47124g = new a();

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a implements C6266v.c {
        public a() {
        }

        @Override // x.C6266v.c
        public boolean a(TotalCaptureResult totalCaptureResult) {
            r2.this.f47122e.a(totalCaptureResult);
            return false;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface b {
        void a(TotalCaptureResult totalCaptureResult);

        float b();

        void c(float f10, c.a aVar);

        void d(C6107a.C0631a c0631a);

        void e();

        float f();

        Rect g();
    }

    public r2(C6266v c6266v, C6378n c6378n, Executor executor) {
        this.f47118a = c6266v;
        this.f47119b = executor;
        b bVarF = f(c6378n);
        this.f47122e = bVarF;
        s2 s2Var = new s2(bVarF.f(), bVarF.b());
        this.f47120c = s2Var;
        s2Var.f(1.0f);
        this.f47121d = new androidx.lifecycle.w(P.h.f(s2Var));
        c6266v.y(this.f47124g);
    }

    public static /* synthetic */ Object c(final r2 r2Var, final E.Y0 y02, final c.a aVar) {
        r2Var.f47119b.execute(new Runnable() { // from class: x.q2
            @Override // java.lang.Runnable
            public final void run() {
                this.f47109a.o(aVar, y02);
            }
        });
        return "setLinearZoom";
    }

    public static /* synthetic */ Object d(final r2 r2Var, final E.Y0 y02, final c.a aVar) {
        r2Var.f47119b.execute(new Runnable() { // from class: x.p2
            @Override // java.lang.Runnable
            public final void run() {
                this.f47101a.o(aVar, y02);
            }
        });
        return "setZoomRatio";
    }

    public static b f(C6378n c6378n) {
        return k(c6378n) ? new C6204a(c6378n) : new C6233j1(c6378n);
    }

    public static E.Y0 h(C6378n c6378n) {
        b bVarF = f(c6378n);
        s2 s2Var = new s2(bVarF.f(), bVarF.b());
        s2Var.f(1.0f);
        return P.h.f(s2Var);
    }

    public static Range i(C6378n c6378n) {
        try {
            return (Range) c6378n.a(CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE);
        } catch (AssertionError e10) {
            AbstractC0807p0.m("ZoomControl", "AssertionError, fail to get camera characteristic.", e10);
            return null;
        }
    }

    public static boolean k(C6378n c6378n) {
        return i(c6378n) != null;
    }

    public void e(C6107a.C0631a c0631a) {
        this.f47122e.d(c0631a);
    }

    public Rect g() {
        return this.f47122e.g();
    }

    public AbstractC2763t j() {
        return this.f47121d;
    }

    public void l(boolean z10) {
        E.Y0 y0F;
        if (this.f47123f == z10) {
            return;
        }
        this.f47123f = z10;
        if (z10) {
            return;
        }
        synchronized (this.f47120c) {
            this.f47120c.f(1.0f);
            y0F = P.h.f(this.f47120c);
        }
        p(y0F);
        this.f47122e.e();
        this.f47118a.o0();
    }

    public O7.e m(float f10) {
        final E.Y0 y0F;
        synchronized (this.f47120c) {
            try {
                this.f47120c.e(f10);
                y0F = P.h.f(this.f47120c);
            } catch (IllegalArgumentException e10) {
                return O.n.n(e10);
            }
        }
        p(y0F);
        return B0.c.a(new c.InterfaceC0018c() { // from class: x.o2
            @Override // B0.c.InterfaceC0018c
            public final Object a(c.a aVar) {
                return r2.c(this.f47093a, y0F, aVar);
            }
        });
    }

    public O7.e n(float f10) {
        final E.Y0 y0F;
        synchronized (this.f47120c) {
            try {
                this.f47120c.f(f10);
                y0F = P.h.f(this.f47120c);
            } catch (IllegalArgumentException e10) {
                return O.n.n(e10);
            }
        }
        p(y0F);
        return B0.c.a(new c.InterfaceC0018c() { // from class: x.n2
            @Override // B0.c.InterfaceC0018c
            public final Object a(c.a aVar) {
                return r2.d(this.f47086a, y0F, aVar);
            }
        });
    }

    public final void o(c.a aVar, E.Y0 y02) {
        E.Y0 y0F;
        if (this.f47123f) {
            this.f47122e.c(y02.d(), aVar);
            this.f47118a.o0();
            return;
        }
        synchronized (this.f47120c) {
            this.f47120c.f(1.0f);
            y0F = P.h.f(this.f47120c);
        }
        p(y0F);
        aVar.f(new InterfaceC0802n.a("Camera is not active."));
    }

    public final void p(E.Y0 y02) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            this.f47121d.setValue(y02);
        } else {
            this.f47121d.postValue(y02);
        }
    }
}
