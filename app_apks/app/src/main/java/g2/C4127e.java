package g2;

import D1.K;
import D1.o;
import G1.AbstractC0853a;
import G1.InterfaceC0860h;
import K1.C1030x;
import android.media.MediaFormat;
import android.view.Surface;
import g2.H;
import g2.v;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: g2.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C4127e implements H {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s f35144a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v f35145b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Queue f35146c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Surface f35147d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public D1.o f35148e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f35149f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public H.a f35150g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Executor f35151h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public r f35152i;

    /* JADX INFO: renamed from: g2.e$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public final class b implements v.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public D1.o f35153a;

        public b() {
        }

        @Override // g2.v.a
        public void a() {
            C4127e.this.f35151h.execute(new Runnable() { // from class: g2.g
                @Override // java.lang.Runnable
                public final void run() {
                    C4127e.this.f35150g.a();
                }
            });
            ((H.b) C4127e.this.f35146c.remove()).b();
        }

        @Override // g2.v.a
        public void b(long j10, long j11, boolean z10) {
            if (z10 && C4127e.this.f35147d != null) {
                C4127e.this.f35151h.execute(new Runnable() { // from class: g2.f
                    @Override // java.lang.Runnable
                    public final void run() {
                        C4127e.this.f35150g.onFirstFrameRendered();
                    }
                });
            }
            D1.o oVarP = this.f35153a;
            if (oVarP == null) {
                oVarP = new o.b().P();
            }
            C4127e.this.f35152i.e(j11, j10, oVarP, null);
            ((H.b) C4127e.this.f35146c.remove()).a(j10);
        }

        @Override // g2.v.a
        public void onVideoSizeChanged(final K k10) {
            this.f35153a = new o.b().F0(k10.f1622a).h0(k10.f1623b).y0("video/raw").P();
            C4127e.this.f35151h.execute(new Runnable() { // from class: g2.h
                @Override // java.lang.Runnable
                public final void run() {
                    C4127e.this.f35150g.onVideoSizeChanged(k10);
                }
            });
        }
    }

    public C4127e(s sVar, InterfaceC0860h interfaceC0860h) {
        this.f35144a = sVar;
        sVar.m(interfaceC0860h);
        this.f35145b = new v(new b(), sVar);
        this.f35146c = new ArrayDeque();
        this.f35148e = new o.b().P();
        this.f35149f = -9223372036854775807L;
        this.f35150g = H.a.f35140a;
        this.f35151h = new Executor() { // from class: g2.b
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                C4127e.v(runnable);
            }
        };
        this.f35152i = new r() { // from class: g2.c
            @Override // g2.r
            public final void e(long j10, long j11, D1.o oVar, MediaFormat mediaFormat) {
                C4127e.x(j10, j11, oVar, mediaFormat);
            }
        };
    }

    @Override // g2.H
    public void T(float f10) {
        this.f35144a.p(f10);
    }

    @Override // g2.H
    public void a(int i10, D1.o oVar, long j10, int i11, List list) {
        AbstractC0853a.g(list.isEmpty());
        int i12 = oVar.f1812v;
        D1.o oVar2 = this.f35148e;
        if (i12 != oVar2.f1812v || oVar.f1813w != oVar2.f1813w) {
            this.f35145b.i(i12, oVar.f1813w);
        }
        float f10 = oVar.f1816z;
        if (f10 != this.f35148e.f1816z) {
            this.f35144a.n(f10);
        }
        this.f35148e = oVar;
        if (j10 != this.f35149f) {
            this.f35145b.h(i11, j10);
            this.f35149f = j10;
        }
    }

    @Override // g2.H
    public boolean b() {
        return this.f35145b.d();
    }

    @Override // g2.H
    public void c(H.a aVar, Executor executor) {
        this.f35150g = aVar;
        this.f35151h = executor;
    }

    @Override // g2.H
    public boolean d(long j10, H.b bVar) {
        this.f35146c.add(bVar);
        this.f35145b.g(j10);
        this.f35151h.execute(new Runnable() { // from class: g2.d
            @Override // java.lang.Runnable
            public final void run() {
                this.f35143a.f35150g.b();
            }
        });
        return true;
    }

    @Override // g2.H
    public void e(long j10) {
        throw new UnsupportedOperationException();
    }

    @Override // g2.H
    public void f() {
        this.f35145b.l();
    }

    @Override // g2.H
    public void g(long j10, long j11) throws H.c {
        try {
            this.f35145b.j(j10, j11);
        } catch (C1030x e10) {
            throw new H.c(e10, this.f35148e);
        }
    }

    @Override // g2.H
    public void h(Surface surface, G1.D d10) {
        this.f35147d = surface;
        this.f35144a.o(surface);
    }

    @Override // g2.H
    public void i(List list) {
        throw new UnsupportedOperationException();
    }

    @Override // g2.H
    public boolean isInitialized() {
        return true;
    }

    @Override // g2.H
    public boolean j(boolean z10) {
        return this.f35144a.d(z10);
    }

    @Override // g2.H
    public void k() {
        throw new UnsupportedOperationException();
    }

    @Override // g2.H
    public void l() {
        this.f35144a.a();
    }

    @Override // g2.H
    public Surface m() {
        return (Surface) AbstractC0853a.i(this.f35147d);
    }

    @Override // g2.H
    public void n() {
        this.f35144a.i();
    }

    @Override // g2.H
    public void o() {
        this.f35144a.h();
    }

    @Override // g2.H
    public void p(int i10) {
        this.f35144a.l(i10);
    }

    @Override // g2.H
    public boolean q(D1.o oVar) {
        return true;
    }

    @Override // g2.H
    public void r() {
        this.f35147d = null;
        this.f35144a.o(null);
    }

    @Override // g2.H
    public void s(boolean z10) {
        if (z10) {
            this.f35144a.k();
        }
        this.f35145b.b();
        this.f35146c.clear();
    }

    @Override // g2.H
    public void t(boolean z10) {
        this.f35144a.e(z10);
    }

    @Override // g2.H
    public void u(r rVar) {
        this.f35152i = rVar;
    }

    @Override // g2.H
    public void release() {
    }

    public static /* synthetic */ void v(Runnable runnable) {
    }

    public static /* synthetic */ void x(long j10, long j11, D1.o oVar, MediaFormat mediaFormat) {
    }
}
