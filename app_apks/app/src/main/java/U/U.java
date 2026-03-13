package U;

import E.AbstractC0807p0;
import E.C0824y0;
import E.J0;
import E.V0;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class U {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final P f16492a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final L.J f16493b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public c f16494c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public b f16495d;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a implements O.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ L f16496a;

        public a(L l10) {
            this.f16496a = l10;
        }

        @Override // O.c
        public void a(Throwable th) {
            if (this.f16496a.s() == 2 && (th instanceof CancellationException)) {
                AbstractC0807p0.a("SurfaceProcessorNode", "Downstream VideoCapture failed to provide Surface.");
                return;
            }
            AbstractC0807p0.m("SurfaceProcessorNode", "Downstream node failed to provide Surface. Target: " + V.a(this.f16496a.s()), th);
        }

        @Override // O.c
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onSuccess(J0 j02) {
            X0.h.g(j02);
            try {
                U.this.f16492a.c(j02);
            } catch (C0824y0 e10) {
                AbstractC0807p0.d("SurfaceProcessorNode", "Failed to send SurfaceOutput to SurfaceProcessor.", e10);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static abstract class b {
        public static b c(L l10, List list) {
            return new C2255c(l10, list);
        }

        public abstract List a();

        public abstract L b();
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class c extends HashMap {
    }

    public U(L.J j10, P p10) {
        this.f16493b = j10;
        this.f16492a = p10;
    }

    public static /* synthetic */ void b(Map map, V0.h hVar) {
        for (Map.Entry entry : map.entrySet()) {
            int iB = hVar.b() - ((W.f) entry.getKey()).c();
            if (((W.f) entry.getKey()).g()) {
                iB = -iB;
            }
            ((L) entry.getValue()).y(M.y.t(iB), -1);
        }
    }

    public static /* synthetic */ void c(U u10) {
        c cVar = u10.f16494c;
        if (cVar != null) {
            Iterator it = cVar.values().iterator();
            while (it.hasNext()) {
                ((L) it.next()).i();
            }
        }
    }

    public final void d(L l10, Map.Entry entry) {
        L l11 = (L) entry.getValue();
        AbstractC0807p0.a("SurfaceProcessorNode", "     -> outputEdge = " + l11);
        O.n.j(l11.j(((W.f) entry.getKey()).b(), J0.a.f(l10.r().f(), ((W.f) entry.getKey()).a(), l10.t() ? this.f16493b : null, ((W.f) entry.getKey()).c(), ((W.f) entry.getKey()).g()), null), new a(l11), N.a.d());
    }

    public P e() {
        return this.f16492a;
    }

    public void f() {
        this.f16492a.release();
        M.x.e(new Runnable() { // from class: U.T
            @Override // java.lang.Runnable
            public final void run() {
                U.c(this.f16491a);
            }
        });
    }

    public final void g(final L l10, Map map) {
        for (final Map.Entry entry : map.entrySet()) {
            d(l10, entry);
            ((L) entry.getValue()).e(new Runnable() { // from class: U.Q
                @Override // java.lang.Runnable
                public final void run() {
                    this.f16487a.d(l10, entry);
                }
            });
        }
    }

    public final void h(L l10) {
        try {
            this.f16492a.b(l10.k(this.f16493b));
        } catch (C0824y0 e10) {
            AbstractC0807p0.d("SurfaceProcessorNode", "Failed to send SurfaceRequest to SurfaceProcessor.", e10);
        }
    }

    public void i(L l10, final Map map) {
        l10.f(new X0.a() { // from class: U.S
            @Override // X0.a
            public final void accept(Object obj) {
                U.b(map, (V0.h) obj);
            }
        });
    }

    public c j(b bVar) {
        M.x.b();
        AbstractC0807p0.a("SurfaceProcessorNode", "SurfaceProcessorNode Transform (Processor=" + this.f16492a + "\n   inputEdge = " + bVar.b());
        Iterator it = bVar.a().iterator();
        while (it.hasNext()) {
            AbstractC0807p0.a("SurfaceProcessorNode", "   outputConfig = " + ((W.f) it.next()));
        }
        this.f16495d = bVar;
        this.f16494c = new c();
        L lB = bVar.b();
        for (W.f fVar : bVar.a()) {
            this.f16494c.put(fVar, k(lB, fVar));
        }
        h(lB);
        g(lB, this.f16494c);
        i(lB, this.f16494c);
        return this.f16494c;
    }

    public final L k(L l10, W.f fVar) {
        Rect rectO;
        Rect rectA = fVar.a();
        int iC = fVar.c();
        boolean zG = fVar.g();
        Matrix matrix = new Matrix(l10.q());
        Matrix matrixD = M.y.d(new RectF(rectA), M.y.q(fVar.d()), iC, zG);
        matrix.postConcat(matrixD);
        X0.h.a(M.y.i(M.y.e(rectA, iC), fVar.d()));
        if (fVar.j()) {
            X0.h.b(fVar.a().contains(l10.n()), String.format("Output crop rect %s must contain input crop rect %s", fVar.a(), l10.n()));
            rectO = new Rect();
            RectF rectF = new RectF(l10.n());
            matrixD.mapRect(rectF);
            rectF.round(rectO);
        } else {
            rectO = M.y.o(fVar.d());
        }
        Rect rect = rectO;
        return new L(fVar.e(), fVar.b(), l10.r().i().f(fVar.d()).a(), matrix, false, rect, l10.p() - iC, -1, l10.v() != zG);
    }
}
