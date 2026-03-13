package V;

import E.AbstractC0807p0;
import E.C0824y0;
import E.J0;
import L.J;
import M.x;
import M.y;
import U.L;
import U.P;
import U.V;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Size;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final P f17182a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final J f17183b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final J f17184c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public c f17185d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public b f17186e;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a implements O.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ L f17187a;

        public a(L l10) {
            this.f17187a = l10;
        }

        @Override // O.c
        public void a(Throwable th) {
            if (this.f17187a.s() == 2 && (th instanceof CancellationException)) {
                AbstractC0807p0.a("DualSurfaceProcessorNode", "Downstream VideoCapture failed to provide Surface.");
                return;
            }
            AbstractC0807p0.m("DualSurfaceProcessorNode", "Downstream node failed to provide Surface. Target: " + V.a(this.f17187a.s()), th);
        }

        @Override // O.c
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onSuccess(J0 j02) {
            X0.h.g(j02);
            try {
                r.this.f17182a.c(j02);
            } catch (C0824y0 e10) {
                AbstractC0807p0.d("DualSurfaceProcessorNode", "Failed to send SurfaceOutput to SurfaceProcessor.", e10);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static abstract class b {
        public static b d(L l10, L l11, List list) {
            return new V.b(l10, l11, list);
        }

        public abstract List a();

        public abstract L b();

        public abstract L c();
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class c extends HashMap {
    }

    public r(J j10, J j11, P p10) {
        this.f17183b = j10;
        this.f17184c = j11;
        this.f17182a = p10;
    }

    public static /* synthetic */ void a(r rVar) {
        c cVar = rVar.f17185d;
        if (cVar != null) {
            Iterator it = cVar.values().iterator();
            while (it.hasNext()) {
                ((L) it.next()).i();
            }
        }
    }

    public final void c(J j10, J j11, L l10, L l11, Map.Entry entry) {
        L l12 = (L) entry.getValue();
        AbstractC0807p0.a("DualSurfaceProcessorNode", "     -> outputEdge = " + l12);
        Size sizeF = l10.r().f();
        Rect rectA = ((d) entry.getKey()).a().a();
        if (!l10.t()) {
            j10 = null;
        }
        J0.a aVarF = J0.a.f(sizeF, rectA, j10, ((d) entry.getKey()).a().c(), ((d) entry.getKey()).a().g());
        Size sizeF2 = l11.r().f();
        Rect rectA2 = ((d) entry.getKey()).b().a();
        if (!l11.t()) {
            j11 = null;
        }
        O.n.j(l12.j(((d) entry.getKey()).a().b(), aVarF, J0.a.f(sizeF2, rectA2, j11, ((d) entry.getKey()).b().c(), ((d) entry.getKey()).b().g())), new a(l12), N.a.d());
    }

    public void d() {
        this.f17182a.release();
        x.e(new Runnable() { // from class: V.p
            @Override // java.lang.Runnable
            public final void run() {
                r.a(this.f17175a);
            }
        });
    }

    public final void e(J j10, J j11, L l10, L l11, Map map) {
        for (final Map.Entry entry : map.entrySet()) {
            final r rVar = this;
            final J j12 = j10;
            final J j13 = j11;
            final L l12 = l10;
            final L l13 = l11;
            rVar.c(j12, j13, l12, l13, entry);
            ((L) entry.getValue()).e(new Runnable() { // from class: V.q
                @Override // java.lang.Runnable
                public final void run() {
                    this.f17176a.c(j12, j13, l12, l13, entry);
                }
            });
            this = rVar;
            j10 = j12;
            j11 = j13;
            l10 = l12;
            l11 = l13;
        }
    }

    public final void f(J j10, L l10, boolean z10) {
        try {
            this.f17182a.b(l10.l(j10, z10));
        } catch (C0824y0 e10) {
            AbstractC0807p0.d("DualSurfaceProcessorNode", "Failed to send SurfaceRequest to SurfaceProcessor.", e10);
        }
    }

    public c g(b bVar) {
        x.b();
        AbstractC0807p0.a("DualSurfaceProcessorNode", "DualSurfaceProcessorNode Transform Processor = " + this.f17182a + "\n   primary input = " + bVar.b() + "\n   secondary input = " + bVar.c());
        Iterator it = bVar.a().iterator();
        while (it.hasNext()) {
            AbstractC0807p0.a("SurfaceProcessorNode", "   outputConfig = " + ((d) it.next()));
        }
        this.f17186e = bVar;
        this.f17185d = new c();
        L lB = this.f17186e.b();
        L lC = this.f17186e.c();
        for (d dVar : this.f17186e.a()) {
            this.f17185d.put(dVar, h(lB, dVar.a()));
        }
        f(this.f17183b, lB, true);
        f(this.f17184c, lC, false);
        e(this.f17183b, this.f17184c, lB, lC, this.f17185d);
        return this.f17185d;
    }

    public final L h(L l10, W.f fVar) {
        Rect rectA = fVar.a();
        int iC = fVar.c();
        boolean zG = fVar.g();
        Matrix matrix = new Matrix(l10.q());
        matrix.postConcat(y.d(new RectF(rectA), y.q(fVar.d()), iC, zG));
        X0.h.a(y.i(y.e(rectA, iC), fVar.d()));
        Rect rectO = y.o(fVar.d());
        return new L(fVar.e(), fVar.b(), l10.r().i().f(fVar.d()).a(), matrix, false, rectO, l10.p() - iC, -1, l10.v() != zG);
    }
}
