package Y;

import E.AbstractC0807p0;
import E.C0781c0;
import E.C0822x0;
import E.W0;
import L.AbstractC1109l0;
import L.AbstractC1114o;
import L.InterfaceC1130w0;
import L.InterfaceC1132x0;
import L.InterfaceC1133y;
import L.J;
import L.L0;
import L.a1;
import L.e1;
import L.s1;
import L.t1;
import M.x;
import M.y;
import U.L;
import Y.f;
import android.graphics.Rect;
import android.util.Range;
import android.util.Size;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class j implements W0.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f19552a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t1 f19556e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final J f19557f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final J f19558g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Set f19560i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Map f19561j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final c f19562k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public c f19563l;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f19553b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f19554c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map f19555d = new HashMap();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AbstractC1114o f19559h = t();

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class a extends AbstractC1114o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WeakReference f19564a;

        public a(j jVar) {
            this.f19564a = new WeakReference(jVar);
        }

        @Override // L.AbstractC1114o
        public void b(int i10, InterfaceC1133y interfaceC1133y) {
            j jVar = (j) this.f19564a.get();
            if (jVar != null) {
                Iterator it = jVar.f19552a.iterator();
                while (it.hasNext()) {
                    j.O(interfaceC1133y, ((W0) it.next()).A(), i10);
                }
            }
        }
    }

    public j(J j10, J j11, Set set, t1 t1Var, f.a aVar) {
        this.f19557f = j10;
        this.f19558g = j11;
        this.f19556e = t1Var;
        this.f19552a = set;
        Map mapQ = Q(j10, set, t1Var);
        this.f19561j = mapQ;
        HashSet hashSet = new HashSet(mapQ.values());
        this.f19560i = hashSet;
        this.f19562k = new c(j10, hashSet);
        if (j11 != null) {
            this.f19563l = new c(j11, hashSet);
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            W0 w02 = (W0) it.next();
            this.f19555d.put(w02, Boolean.FALSE);
            this.f19554c.put(w02, new i(j10, this, aVar));
        }
    }

    public static int D(Set set) {
        Iterator it = set.iterator();
        int iMax = 0;
        while (it.hasNext()) {
            iMax = Math.max(iMax, ((s1) it.next()).x(0));
        }
        return iMax;
    }

    public static Range N(Set set) {
        Range rangeIntersect = e1.f8057a;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            Range rangeV = ((s1) it.next()).v(rangeIntersect);
            Objects.requireNonNull(rangeV);
            if (e1.f8057a.equals(rangeIntersect)) {
                rangeIntersect = rangeV;
            } else {
                try {
                    rangeIntersect = rangeIntersect.intersect(rangeV);
                } catch (IllegalArgumentException unused) {
                    AbstractC0807p0.a("VirtualCameraAdapter", "No intersected frame rate can be found from the target frame rate settings of the UseCases! Resolved: " + rangeIntersect + " <<>> " + rangeV);
                    return rangeIntersect.extend(rangeV);
                }
            }
        }
        return rangeIntersect;
    }

    public static void O(InterfaceC1133y interfaceC1133y, a1 a1Var, int i10) {
        Iterator it = a1Var.j().iterator();
        while (it.hasNext()) {
            ((AbstractC1114o) it.next()).b(i10, new k(a1Var.k().j(), interfaceC1133y));
        }
    }

    public static Map Q(J j10, Set set, t1 t1Var) {
        HashMap map = new HashMap();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            W0 w02 = (W0) it.next();
            map.put(w02, w02.I(j10.i(), null, w02.m(true, t1Var)));
        }
        return map;
    }

    public static void u(L l10, AbstractC1109l0 abstractC1109l0, a1 a1Var) {
        l10.u();
        try {
            l10.x(abstractC1109l0);
        } catch (AbstractC1109l0.a unused) {
            if (a1Var.d() != null) {
                a1Var.d().a(a1Var, a1.g.SESSION_ERROR_SURFACE_NEEDS_RESET);
            }
        }
    }

    public static int v(W0 w02) {
        return w02 instanceof C0781c0 ? 256 : 34;
    }

    public static e1 x(W0 w02, e1 e1Var, Map map) {
        e1.a aVarI = e1Var.i();
        Size size = (Size) map.get(w02);
        if (size != null) {
            aVarI.e(size);
        }
        return aVarI.a();
    }

    public static AbstractC1109l0 y(W0 w02) {
        List listO = w02 instanceof C0781c0 ? w02.A().o() : w02.A().k().i();
        X0.h.i(listO.size() <= 1);
        if (listO.size() == 1) {
            return (AbstractC1109l0) listO.get(0);
        }
        return null;
    }

    public static int z(W0 w02) {
        if (w02 instanceof C0822x0) {
            return 1;
        }
        return w02 instanceof C0781c0 ? 4 : 2;
    }

    public Set A() {
        return this.f19552a;
    }

    public Map B(L l10, int i10, boolean z10, boolean z11) {
        HashMap map = new HashMap();
        for (W0 w02 : this.f19552a) {
            j jVar = this;
            W.f fVarS = jVar.s(w02, this.f19562k, this.f19557f, l10, i10, z10, z11);
            jVar.S(w02);
            map.put(w02, fVarS);
            this = jVar;
        }
        return map;
    }

    public Map C(L l10, L l11, int i10, boolean z10) {
        HashMap map = new HashMap();
        for (W0 w02 : this.f19552a) {
            j jVar = this;
            int i11 = i10;
            W.f fVarS = jVar.s(w02, this.f19562k, this.f19557f, l10, i11, z10, false);
            c cVar = jVar.f19563l;
            Objects.requireNonNull(cVar);
            J j10 = jVar.f19558g;
            Objects.requireNonNull(j10);
            L l12 = l11;
            W.f fVarS2 = jVar.s(w02, cVar, j10, l12, i11, z10, false);
            jVar.S(w02);
            map.put(w02, V.d.c(fVarS, fVarS2));
            this = jVar;
            l11 = l12;
            i10 = i11;
        }
        return map;
    }

    public AbstractC1114o E() {
        return this.f19559h;
    }

    public Map F(L l10, boolean z10) {
        HashMap map = new HashMap();
        for (W0 w02 : this.f19552a) {
            c cVar = this.f19562k;
            s1 s1Var = (s1) this.f19561j.get(w02);
            Objects.requireNonNull(s1Var);
            b bVarQ = cVar.q(s1Var, l10.n(), y.f(l10.q()), z10);
            map.put(w02, bVarQ.c());
            AbstractC0807p0.a("VirtualCameraAdapter", "Selected child size: " + bVarQ.c() + ", useCase: " + w02);
        }
        return map;
    }

    public final L G(W0 w02) {
        L l10 = (L) this.f19553b.get(w02);
        Objects.requireNonNull(l10);
        return l10;
    }

    public final boolean H(W0 w02) {
        Boolean bool = (Boolean) this.f19555d.get(w02);
        Objects.requireNonNull(bool);
        return bool.booleanValue();
    }

    public void I(L0 l02) {
        l02.H(InterfaceC1132x0.f8225v, this.f19562k.o(l02));
        l02.H(s1.f8175A, Integer.valueOf(D(this.f19560i)));
        E.J jD = Y.a.d(this.f19560i);
        if (jD == null) {
            throw new IllegalArgumentException("Failed to merge child dynamic ranges, can not find a dynamic range that satisfies all children.");
        }
        l02.H(InterfaceC1130w0.f8215l, jD);
        l02.H(s1.f8177C, N(this.f19560i));
        Iterator it = this.f19552a.iterator();
        while (it.hasNext()) {
            s1 s1Var = (s1) this.f19561j.get((W0) it.next());
            Objects.requireNonNull(s1Var);
            s1 s1Var2 = s1Var;
            if (s1Var2.u() != 0) {
                l02.H(s1.f8183I, Integer.valueOf(s1Var2.u()));
            }
            if (s1Var2.z() != 0) {
                l02.H(s1.f8182H, Integer.valueOf(s1Var2.z()));
            }
        }
    }

    public void J() {
        Iterator it = this.f19552a.iterator();
        while (it.hasNext()) {
            ((W0) it.next()).O();
        }
    }

    public void K() {
        Iterator it = this.f19552a.iterator();
        while (it.hasNext()) {
            ((W0) it.next()).Q();
        }
    }

    public void L() {
        Iterator it = this.f19552a.iterator();
        while (it.hasNext()) {
            ((W0) it.next()).R();
        }
    }

    public void M() {
        x.b();
        Iterator it = this.f19552a.iterator();
        while (it.hasNext()) {
            d((W0) it.next());
        }
    }

    public void P(Map map, Map map2) {
        this.f19553b.clear();
        this.f19553b.putAll(map);
        for (Map.Entry entry : this.f19553b.entrySet()) {
            W0 w02 = (W0) entry.getKey();
            L l10 = (L) entry.getValue();
            w02.Z(l10.n());
            w02.Y(l10.q());
            w02.c0(x(w02, l10.r(), map2), null);
            w02.M();
        }
    }

    public void R() {
        for (W0 w02 : this.f19552a) {
            i iVar = (i) this.f19554c.get(w02);
            Objects.requireNonNull(iVar);
            w02.a0(iVar);
        }
    }

    public final void S(W0 w02) {
        int iW = w(w02, this.f19557f);
        i iVar = (i) this.f19554c.get(w02);
        Objects.requireNonNull(iVar);
        iVar.r(iW);
    }

    @Override // E.W0.c
    public void d(W0 w02) {
        AbstractC1109l0 abstractC1109l0Y;
        x.b();
        L lG = G(w02);
        if (H(w02) && (abstractC1109l0Y = y(w02)) != null) {
            u(lG, abstractC1109l0Y, w02.A());
        }
    }

    @Override // E.W0.c
    public void j(W0 w02) {
        x.b();
        if (H(w02)) {
            this.f19555d.put(w02, Boolean.FALSE);
            G(w02).m();
        }
    }

    @Override // E.W0.c
    public void m(W0 w02) {
        x.b();
        if (H(w02)) {
            return;
        }
        this.f19555d.put(w02, Boolean.TRUE);
        AbstractC1109l0 abstractC1109l0Y = y(w02);
        if (abstractC1109l0Y != null) {
            u(G(w02), abstractC1109l0Y, w02.A());
        }
    }

    @Override // E.W0.c
    public void n(W0 w02) {
        x.b();
        if (H(w02)) {
            L lG = G(w02);
            AbstractC1109l0 abstractC1109l0Y = y(w02);
            if (abstractC1109l0Y != null) {
                u(lG, abstractC1109l0Y, w02.A());
            } else {
                lG.m();
            }
        }
    }

    public void r() {
        for (W0 w02 : this.f19552a) {
            i iVar = (i) this.f19554c.get(w02);
            Objects.requireNonNull(iVar);
            w02.d(iVar, null, null, w02.m(true, this.f19556e));
        }
    }

    public final W.f s(W0 w02, c cVar, J j10, L l10, int i10, boolean z10, boolean z11) {
        int iP = j10.b().p(i10);
        boolean zK = y.k(l10.q());
        s1 s1Var = (s1) this.f19561j.get(w02);
        Objects.requireNonNull(s1Var);
        b bVarQ = cVar.q(s1Var, l10.n(), y.f(l10.q()), z10);
        Rect rectB = bVarQ.b();
        Size sizeA = bVarQ.a();
        int iT = y.t((l10.p() + w(w02, j10)) - iP);
        return W.f.h(z(w02), v(w02), rectB, y.n(sizeA, iT), iT, z11 ? false : w02.H(j10) ^ zK);
    }

    public AbstractC1114o t() {
        return new a(this);
    }

    public final int w(W0 w02, J j10) {
        return j10.b().p(((InterfaceC1132x0) w02.l()).B(0));
    }
}
