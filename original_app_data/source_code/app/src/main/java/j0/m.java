package j0;

import fc.C4015H;
import gc.C4206t;
import i0.C4313a;
import j0.h;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f38897b = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static h f38900e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static long f38901f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final f f38902g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final o f38903h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static List f38904i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static List f38905j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final C4668b f38906k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final e f38907l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static C4313a f38908m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final vc.l f38896a = new vc.l() { // from class: j0.k
        @Override // vc.l
        public final Object invoke(Object obj) {
            return m.j((h) obj);
        }
    };

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final i0.d f38898c = new i0.d();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Object f38899d = new Object();

    static {
        h.a aVar = h.f38880e;
        f38900e = aVar.a();
        long j10 = 1;
        f38901f = i.c(1) + j10;
        f38902g = new f();
        f38903h = new o();
        f38904i = C4206t.k();
        f38905j = C4206t.k();
        long j11 = f38901f;
        f38901f = j10 + j11;
        C4668b c4668b = new C4668b(j11, aVar.a());
        f38900e = f38900e.n(c4668b.d());
        f38906k = c4668b;
        f38907l = c4668b;
        f38908m = new C4313a(0);
    }

    public static final e h(e eVar, vc.l lVar, boolean z10) {
        boolean z11 = eVar instanceof d;
        if (z11 || eVar == null) {
            return new p(z11 ? (d) eVar : null, lVar, null, false, z10);
        }
        return new q(eVar, lVar, false, z10);
    }

    public static /* synthetic */ e i(e eVar, vc.l lVar, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            lVar = null;
        }
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        return h(eVar, lVar, z10);
    }

    public static final C4015H j(h hVar) {
        return C4015H.f34254a;
    }

    public static final Object k() {
        return f38899d;
    }

    public static final vc.l l(final vc.l lVar, final vc.l lVar2, boolean z10) {
        if (!z10) {
            lVar2 = null;
        }
        return (lVar == null || lVar2 == null || lVar == lVar2) ? lVar == null ? lVar2 : lVar : new vc.l() { // from class: j0.j
            @Override // vc.l
            public final Object invoke(Object obj) {
                return m.m(lVar, lVar2, obj);
            }
        };
    }

    public static final C4015H m(vc.l lVar, vc.l lVar2, Object obj) {
        lVar.invoke(obj);
        lVar2.invoke(obj);
        return C4015H.f34254a;
    }

    public static final vc.l n(final vc.l lVar, final vc.l lVar2) {
        return (lVar == null || lVar2 == null || lVar == lVar2) ? lVar == null ? lVar2 : lVar : new vc.l() { // from class: j0.l
            @Override // vc.l
            public final Object invoke(Object obj) {
                return m.o(lVar, lVar2, obj);
            }
        };
    }

    public static final C4015H o(vc.l lVar, vc.l lVar2, Object obj) {
        lVar.invoke(obj);
        lVar2.invoke(obj);
        return C4015H.f34254a;
    }

    public static final void p(int i10) {
        f38902g.e(i10);
    }

    public static final int q(long j10, h hVar) {
        int iA;
        long jL = hVar.l(j10);
        synchronized (k()) {
            iA = f38902g.a(jL);
        }
        return iA;
    }
}
