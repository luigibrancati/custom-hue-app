package a2;

import D1.o;
import D1.r;
import G1.AbstractC0853a;
import I1.f;
import I1.j;
import K7.AbstractC1081v;
import a2.InterfaceC2611D;
import a2.L;
import android.net.Uri;
import f2.InterfaceExecutorC3986a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class h0 extends AbstractC2615a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final I1.j f20826h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final f.a f20827i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final D1.o f20828j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f20829k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e2.k f20830l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f20831m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final D1.D f20832n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final D1.r f20833o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final J7.t f20834p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public I1.x f20835q;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final f.a f20836a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public e2.k f20837b = new e2.j();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f20838c = true;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Object f20839d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public String f20840e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public J7.t f20841f;

        public b(f.a aVar) {
            this.f20836a = (f.a) AbstractC0853a.e(aVar);
        }

        public h0 a(r.k kVar, long j10) {
            return new h0(this.f20840e, kVar, this.f20836a, j10, this.f20837b, this.f20838c, this.f20839d, this.f20841f);
        }

        public b b(e2.k kVar) {
            if (kVar == null) {
                kVar = new e2.j();
            }
            this.f20837b = kVar;
            return this;
        }
    }

    @Override // a2.AbstractC2615a
    public void D(I1.x xVar) {
        this.f20835q = xVar;
        E(this.f20832n);
    }

    @Override // a2.InterfaceC2611D
    public D1.r f() {
        return this.f20833o;
    }

    @Override // a2.InterfaceC2611D
    public void h(InterfaceC2610C interfaceC2610C) {
        ((g0) interfaceC2610C).v();
    }

    @Override // a2.InterfaceC2611D
    public InterfaceC2610C k(InterfaceC2611D.b bVar, e2.b bVar2, long j10) {
        I1.j jVar = this.f20826h;
        f.a aVar = this.f20827i;
        I1.x xVar = this.f20835q;
        D1.o oVar = this.f20828j;
        long j11 = this.f20829k;
        e2.k kVar = this.f20830l;
        L.a aVarY = y(bVar);
        boolean z10 = this.f20831m;
        J7.t tVar = this.f20834p;
        return new g0(jVar, aVar, xVar, oVar, j11, kVar, aVarY, z10, tVar != null ? (InterfaceExecutorC3986a) tVar.get() : null);
    }

    public h0(String str, r.k kVar, f.a aVar, long j10, e2.k kVar2, boolean z10, Object obj, J7.t tVar) {
        this.f20827i = aVar;
        this.f20829k = j10;
        this.f20830l = kVar2;
        this.f20831m = z10;
        D1.r rVarA = new r.c().g(Uri.EMPTY).c(kVar.f1987a.toString()).e(AbstractC1081v.A(kVar)).f(obj).a();
        this.f20833o = rVarA;
        o.b bVarL0 = new o.b().y0((String) J7.h.a(kVar.f1988b, "text/x-unknown")).n0(kVar.f1989c).A0(kVar.f1990d).w0(kVar.f1991e).l0(kVar.f1992f);
        String str2 = kVar.f1993g;
        this.f20828j = bVarL0.j0(str2 != null ? str2 : str).P();
        this.f20826h = new j.b().i(kVar.f1987a).b(1).a();
        this.f20832n = new f0(j10, true, false, false, null, rVarA);
        this.f20834p = tVar;
    }

    @Override // a2.AbstractC2615a
    public void F() {
    }

    @Override // a2.InterfaceC2611D
    public void n() {
    }
}
