package K1;

import K7.AbstractC1081v;
import a2.InterfaceC2611D;
import android.os.SystemClock;
import java.util.List;

/* JADX INFO: renamed from: K1.a1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C0986a1 {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final InterfaceC2611D.b f6988u = new InterfaceC2611D.b(new Object());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final D1.D f6989a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC2611D.b f6990b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f6991c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f6992d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f6993e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C1030x f6994f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f6995g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final a2.n0 f6996h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final d2.y f6997i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List f6998j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final InterfaceC2611D.b f6999k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f7000l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f7001m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f7002n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final D1.y f7003o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f7004p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public volatile long f7005q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public volatile long f7006r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public volatile long f7007s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public volatile long f7008t;

    public C0986a1(D1.D d10, InterfaceC2611D.b bVar, long j10, long j11, int i10, C1030x c1030x, boolean z10, a2.n0 n0Var, d2.y yVar, List list, InterfaceC2611D.b bVar2, boolean z11, int i11, int i12, D1.y yVar2, long j12, long j13, long j14, long j15, boolean z12) {
        this.f6989a = d10;
        this.f6990b = bVar;
        this.f6991c = j10;
        this.f6992d = j11;
        this.f6993e = i10;
        this.f6994f = c1030x;
        this.f6995g = z10;
        this.f6996h = n0Var;
        this.f6997i = yVar;
        this.f6998j = list;
        this.f6999k = bVar2;
        this.f7000l = z11;
        this.f7001m = i11;
        this.f7002n = i12;
        this.f7003o = yVar2;
        this.f7005q = j12;
        this.f7006r = j13;
        this.f7007s = j14;
        this.f7008t = j15;
        this.f7004p = z12;
    }

    public static C0986a1 k(d2.y yVar) {
        D1.D d10 = D1.D.f1441a;
        InterfaceC2611D.b bVar = f6988u;
        return new C0986a1(d10, bVar, -9223372036854775807L, 0L, 1, null, false, a2.n0.f20861d, yVar, AbstractC1081v.z(), bVar, false, 1, 0, D1.y.f2116d, 0L, 0L, 0L, 0L, false);
    }

    public static InterfaceC2611D.b l() {
        return f6988u;
    }

    public C0986a1 a() {
        return new C0986a1(this.f6989a, this.f6990b, this.f6991c, this.f6992d, this.f6993e, this.f6994f, this.f6995g, this.f6996h, this.f6997i, this.f6998j, this.f6999k, this.f7000l, this.f7001m, this.f7002n, this.f7003o, this.f7005q, this.f7006r, m(), SystemClock.elapsedRealtime(), this.f7004p);
    }

    public C0986a1 b(boolean z10) {
        return new C0986a1(this.f6989a, this.f6990b, this.f6991c, this.f6992d, this.f6993e, this.f6994f, z10, this.f6996h, this.f6997i, this.f6998j, this.f6999k, this.f7000l, this.f7001m, this.f7002n, this.f7003o, this.f7005q, this.f7006r, this.f7007s, this.f7008t, this.f7004p);
    }

    public C0986a1 c(InterfaceC2611D.b bVar) {
        return new C0986a1(this.f6989a, this.f6990b, this.f6991c, this.f6992d, this.f6993e, this.f6994f, this.f6995g, this.f6996h, this.f6997i, this.f6998j, bVar, this.f7000l, this.f7001m, this.f7002n, this.f7003o, this.f7005q, this.f7006r, this.f7007s, this.f7008t, this.f7004p);
    }

    public C0986a1 d(InterfaceC2611D.b bVar, long j10, long j11, long j12, long j13, a2.n0 n0Var, d2.y yVar, List list) {
        return new C0986a1(this.f6989a, bVar, j11, j12, this.f6993e, this.f6994f, this.f6995g, n0Var, yVar, list, this.f6999k, this.f7000l, this.f7001m, this.f7002n, this.f7003o, this.f7005q, j13, j10, SystemClock.elapsedRealtime(), this.f7004p);
    }

    public C0986a1 e(boolean z10, int i10, int i11) {
        return new C0986a1(this.f6989a, this.f6990b, this.f6991c, this.f6992d, this.f6993e, this.f6994f, this.f6995g, this.f6996h, this.f6997i, this.f6998j, this.f6999k, z10, i10, i11, this.f7003o, this.f7005q, this.f7006r, this.f7007s, this.f7008t, this.f7004p);
    }

    public C0986a1 f(C1030x c1030x) {
        return new C0986a1(this.f6989a, this.f6990b, this.f6991c, this.f6992d, this.f6993e, c1030x, this.f6995g, this.f6996h, this.f6997i, this.f6998j, this.f6999k, this.f7000l, this.f7001m, this.f7002n, this.f7003o, this.f7005q, this.f7006r, this.f7007s, this.f7008t, this.f7004p);
    }

    public C0986a1 g(D1.y yVar) {
        return new C0986a1(this.f6989a, this.f6990b, this.f6991c, this.f6992d, this.f6993e, this.f6994f, this.f6995g, this.f6996h, this.f6997i, this.f6998j, this.f6999k, this.f7000l, this.f7001m, this.f7002n, yVar, this.f7005q, this.f7006r, this.f7007s, this.f7008t, this.f7004p);
    }

    public C0986a1 h(int i10) {
        return new C0986a1(this.f6989a, this.f6990b, this.f6991c, this.f6992d, i10, this.f6994f, this.f6995g, this.f6996h, this.f6997i, this.f6998j, this.f6999k, this.f7000l, this.f7001m, this.f7002n, this.f7003o, this.f7005q, this.f7006r, this.f7007s, this.f7008t, this.f7004p);
    }

    public C0986a1 i(boolean z10) {
        return new C0986a1(this.f6989a, this.f6990b, this.f6991c, this.f6992d, this.f6993e, this.f6994f, this.f6995g, this.f6996h, this.f6997i, this.f6998j, this.f6999k, this.f7000l, this.f7001m, this.f7002n, this.f7003o, this.f7005q, this.f7006r, this.f7007s, this.f7008t, z10);
    }

    public C0986a1 j(D1.D d10) {
        return new C0986a1(d10, this.f6990b, this.f6991c, this.f6992d, this.f6993e, this.f6994f, this.f6995g, this.f6996h, this.f6997i, this.f6998j, this.f6999k, this.f7000l, this.f7001m, this.f7002n, this.f7003o, this.f7005q, this.f7006r, this.f7007s, this.f7008t, this.f7004p);
    }

    public long m() {
        long j10;
        long j11;
        if (!n()) {
            return this.f7007s;
        }
        do {
            j10 = this.f7008t;
            j11 = this.f7007s;
        } while (j10 != this.f7008t);
        return G1.M.M0(G1.M.o1(j11) + ((long) ((SystemClock.elapsedRealtime() - j10) * this.f7003o.f2119a)));
    }

    public boolean n() {
        return this.f6993e == 3 && this.f7000l && this.f7002n == 0;
    }

    public void o(long j10) {
        this.f7007s = j10;
        this.f7008t = SystemClock.elapsedRealtime();
    }
}
