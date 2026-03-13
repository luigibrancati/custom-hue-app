package a2;

import D1.D;
import D1.r;
import G1.AbstractC0853a;
import I1.f;
import L1.B0;
import P1.t;
import a2.InterfaceC2611D;
import a2.L;
import a2.Q;
import a2.W;
import a2.X;
import android.net.Uri;
import android.os.Looper;
import com.google.ar.core.ImageMetadata;
import f2.InterfaceExecutorC3986a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class X extends AbstractC2615a implements W.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final f.a f20657h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Q.a f20658i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final P1.u f20659j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final e2.k f20660k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f20661l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f20662m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final D1.o f20663n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final J7.t f20664o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f20665p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f20666q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f20667r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f20668s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public I1.x f20669t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public D1.r f20670u;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a extends AbstractC2636w {
        public a(D1.D d10) {
            super(d10);
        }

        @Override // a2.AbstractC2636w, D1.D
        public D.b g(int i10, D.b bVar, boolean z10) {
            super.g(i10, bVar, z10);
            bVar.f1455f = true;
            return bVar;
        }

        @Override // a2.AbstractC2636w, D1.D
        public D.c o(int i10, D.c cVar, long j10) {
            super.o(i10, cVar, j10);
            cVar.f1483k = true;
            return cVar;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b implements M {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final f.a f20672c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Q.a f20673d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public P1.w f20674e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public e2.k f20675f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f20676g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public J7.t f20677h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f20678i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public D1.o f20679j;

        public b(f.a aVar, final i2.u uVar) {
            this(aVar, new Q.a() { // from class: a2.Y
                @Override // a2.Q.a
                public final Q a(B0 b02) {
                    return X.b.g(uVar, b02);
                }
            });
        }

        public static /* synthetic */ Q g(i2.u uVar, B0 b02) {
            return new C2618d(uVar);
        }

        @Override // a2.InterfaceC2611D.a
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public X f(D1.r rVar) {
            AbstractC0853a.e(rVar.f1873b);
            return new X(rVar, this.f20672c, this.f20673d, this.f20674e.a(rVar), this.f20675f, this.f20676g, this.f20678i, this.f20679j, this.f20677h, null);
        }

        public b i(int i10, D1.o oVar) {
            this.f20678i = i10;
            this.f20679j = (D1.o) AbstractC0853a.e(oVar);
            return this;
        }

        @Override // a2.InterfaceC2611D.a
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public b d(P1.w wVar) {
            this.f20674e = (P1.w) AbstractC0853a.f(wVar, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior.");
            return this;
        }

        @Override // a2.InterfaceC2611D.a
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public b e(e2.k kVar) {
            this.f20675f = (e2.k) AbstractC0853a.f(kVar, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
            return this;
        }

        public b(f.a aVar, Q.a aVar2) {
            this(aVar, aVar2, new P1.l(), new e2.j(), ImageMetadata.SHADING_MODE);
        }

        public b(f.a aVar, Q.a aVar2, P1.w wVar, e2.k kVar, int i10) {
            this.f20672c = aVar;
            this.f20673d = aVar2;
            this.f20674e = wVar;
            this.f20675f = kVar;
            this.f20676g = i10;
        }
    }

    public /* synthetic */ X(D1.r rVar, f.a aVar, Q.a aVar2, P1.u uVar, e2.k kVar, int i10, int i11, D1.o oVar, J7.t tVar, a aVar3) {
        this(rVar, aVar, aVar2, uVar, kVar, i10, i11, oVar, tVar);
    }

    private void H() {
        D1.D f0Var = new f0(this.f20666q, this.f20667r, false, this.f20668s, null, f());
        if (this.f20665p) {
            f0Var = new a(f0Var);
        }
        E(f0Var);
    }

    @Override // a2.AbstractC2615a
    public void D(I1.x xVar) {
        this.f20669t = xVar;
        this.f20659j.c((Looper) AbstractC0853a.e(Looper.myLooper()), B());
        this.f20659j.u();
        H();
    }

    @Override // a2.AbstractC2615a
    public void F() {
        this.f20659j.release();
    }

    public final r.h G() {
        return (r.h) AbstractC0853a.e(f().f1873b);
    }

    @Override // a2.W.c
    public void a(long j10, i2.J j11, boolean z10) {
        if (j10 == -9223372036854775807L) {
            j10 = this.f20666q;
        }
        boolean zH = j11.h();
        if (!this.f20665p && this.f20666q == j10 && this.f20667r == zH && this.f20668s == z10) {
            return;
        }
        this.f20666q = j10;
        this.f20667r = zH;
        this.f20668s = z10;
        this.f20665p = false;
        H();
    }

    @Override // a2.InterfaceC2611D
    public synchronized void b(D1.r rVar) {
        this.f20670u = rVar;
    }

    @Override // a2.InterfaceC2611D
    public synchronized D1.r f() {
        return this.f20670u;
    }

    @Override // a2.InterfaceC2611D
    public void h(InterfaceC2610C interfaceC2610C) {
        ((W) interfaceC2610C).f0();
    }

    @Override // a2.InterfaceC2611D
    public InterfaceC2610C k(InterfaceC2611D.b bVar, e2.b bVar2, long j10) {
        I1.f fVarA = this.f20657h.a();
        I1.x xVar = this.f20669t;
        if (xVar != null) {
            fVarA.h(xVar);
        }
        r.h hVarG = G();
        Uri uri = hVarG.f1968a;
        Q qA = this.f20658i.a(B());
        P1.u uVar = this.f20659j;
        t.a aVarV = v(bVar);
        e2.k kVar = this.f20660k;
        L.a aVarY = y(bVar);
        String str = hVarG.f1972e;
        int i10 = this.f20661l;
        int i11 = this.f20662m;
        D1.o oVar = this.f20663n;
        long jM0 = G1.M.M0(hVarG.f1976i);
        J7.t tVar = this.f20664o;
        return new W(uri, fVarA, qA, uVar, aVarV, kVar, aVarY, this, bVar2, str, i10, i11, oVar, jM0, tVar != null ? (InterfaceExecutorC3986a) tVar.get() : null);
    }

    public X(D1.r rVar, f.a aVar, Q.a aVar2, P1.u uVar, e2.k kVar, int i10, int i11, D1.o oVar, J7.t tVar) {
        this.f20670u = rVar;
        this.f20657h = aVar;
        this.f20658i = aVar2;
        this.f20659j = uVar;
        this.f20660k = kVar;
        this.f20661l = i10;
        this.f20663n = oVar;
        this.f20662m = i11;
        this.f20665p = true;
        this.f20666q = -9223372036854775807L;
        this.f20664o = tVar;
    }

    @Override // a2.InterfaceC2611D
    public void n() {
    }
}
