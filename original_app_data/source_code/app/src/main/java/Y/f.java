package Y;

import E.AbstractC0807p0;
import E.I;
import E.W0;
import L.InterfaceC1099g0;
import L.InterfaceC1130w0;
import L.InterfaceC1132x0;
import L.J;
import L.L0;
import L.M0;
import L.R0;
import L.a1;
import L.e1;
import L.f1;
import L.s1;
import L.t1;
import M.x;
import U.C2271t;
import U.L;
import U.U;
import V.o;
import V.r;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Log;
import android.util.Size;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class f extends W0 {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public L f19528A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public L f19529B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public L f19530C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public L f19531D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public L f19532E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public a1.b f19533F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public a1.b f19534G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public a1.c f19535H;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final h f19536r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final j f19537s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final I f19538t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final I f19539u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public U f19540v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public U f19541w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public r f19542x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public U f19543y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public L f19544z;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface a {
        O7.e a(int i10, int i11);
    }

    public f(J j10, J j11, I i10, I i11, Set set, t1 t1Var) {
        super(s0(set));
        this.f19536r = s0(set);
        this.f19538t = i10;
        this.f19539u = i11;
        this.f19537s = new j(j10, j11, set, t1Var, new a() { // from class: Y.e
            @Override // Y.f.a
            public final O7.e a(int i12, int i13) {
                return f.f0(this.f19527a, i12, i13);
            }
        });
        z0(set);
    }

    public static /* synthetic */ void e0(f fVar, String str, String str2, s1 s1Var, e1 e1Var, e1 e1Var2, a1 a1Var, a1.g gVar) {
        if (fVar.i() == null) {
            return;
        }
        fVar.h0();
        fVar.b0(fVar.k0(str, str2, s1Var, e1Var, e1Var2));
        fVar.L();
        fVar.f19537s.M();
    }

    public static /* synthetic */ O7.e f0(f fVar, int i10, int i11) {
        U u10 = fVar.f19541w;
        return u10 != null ? u10.e().a(i10, i11) : O.n.n(new Exception("Failed to take picture: pipeline is not ready."));
    }

    private void h0() {
        a1.c cVar = this.f19535H;
        if (cVar != null) {
            cVar.b();
            this.f19535H = null;
        }
        L l10 = this.f19544z;
        if (l10 != null) {
            l10.i();
            this.f19544z = null;
        }
        L l11 = this.f19528A;
        if (l11 != null) {
            l11.i();
            this.f19528A = null;
        }
        L l12 = this.f19529B;
        if (l12 != null) {
            l12.i();
            this.f19529B = null;
        }
        L l13 = this.f19530C;
        if (l13 != null) {
            l13.i();
            this.f19530C = null;
        }
        L l14 = this.f19531D;
        if (l14 != null) {
            l14.i();
            this.f19531D = null;
        }
        L l15 = this.f19532E;
        if (l15 != null) {
            l15.i();
            this.f19532E = null;
        }
        U u10 = this.f19541w;
        if (u10 != null) {
            u10.f();
            this.f19541w = null;
        }
        r rVar = this.f19542x;
        if (rVar != null) {
            rVar.d();
            this.f19542x = null;
        }
        U u11 = this.f19540v;
        if (u11 != null) {
            u11.f();
            this.f19540v = null;
        }
        U u12 = this.f19543y;
        if (u12 != null) {
            u12.f();
            this.f19543y = null;
        }
    }

    public static List o0(W0 w02) {
        ArrayList arrayList = new ArrayList();
        if (!u0(w02)) {
            arrayList.add(w02.l().S());
            return arrayList;
        }
        Iterator it = ((f) w02).q0().iterator();
        while (it.hasNext()) {
            arrayList.add(((W0) it.next()).l().S());
        }
        return arrayList;
    }

    public static int p0(W0 w02) {
        return w02.l().J().p();
    }

    private Rect r0(Size size) {
        return F() != null ? F() : new Rect(0, 0, size.getWidth(), size.getHeight());
    }

    public static h s0(Set set) {
        L0 l0A = new g().a();
        l0A.H(InterfaceC1130w0.f8213j, 34);
        ArrayList arrayList = new ArrayList();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            W0 w02 = (W0) it.next();
            if (w02.l().d(s1.f8181G)) {
                arrayList.add(w02.l().S());
            } else {
                Log.e("StreamSharing", "A child does not have capture type.");
            }
        }
        l0A.H(h.f19546Q, arrayList);
        l0A.H(InterfaceC1132x0.f8219p, 2);
        l0A.H(s1.f8185K, f1.PREVIEW_VIDEO_STILL);
        return new h(R0.f0(l0A));
    }

    public static boolean u0(W0 w02) {
        return w02 instanceof f;
    }

    @Override // E.W0
    public Set B(L.I i10) {
        Set setQ0 = q0();
        HashSet hashSet = null;
        if (setQ0.isEmpty()) {
            return null;
        }
        Iterator it = setQ0.iterator();
        while (it.hasNext()) {
            Set setB = ((W0) it.next()).B(i10);
            if (setB != null) {
                if (hashSet == null) {
                    hashSet = new HashSet(setB);
                } else {
                    hashSet.retainAll(setB);
                }
            }
        }
        return hashSet;
    }

    @Override // E.W0
    public Set C() {
        HashSet hashSet = new HashSet();
        hashSet.add(3);
        return hashSet;
    }

    @Override // E.W0
    public s1.b E(InterfaceC1099g0 interfaceC1099g0) {
        return new g(M0.h0(interfaceC1099g0));
    }

    @Override // E.W0
    public void N() {
        super.N();
        this.f19537s.r();
    }

    @Override // E.W0
    public void O() {
        super.O();
        this.f19537s.J();
    }

    @Override // E.W0
    public s1 P(L.I i10, s1.b bVar) {
        this.f19537s.I(bVar.a());
        return bVar.b();
    }

    @Override // E.W0
    public void Q() {
        super.Q();
        this.f19537s.K();
    }

    @Override // E.W0
    public void R() {
        super.R();
        this.f19537s.L();
    }

    @Override // E.W0
    public e1 S(InterfaceC1099g0 interfaceC1099g0) {
        this.f19533F.g(interfaceC1099g0);
        b0(List.of(this.f19533F.p()));
        return g().i().d(interfaceC1099g0).a();
    }

    @Override // E.W0
    public e1 T(e1 e1Var, e1 e1Var2) {
        AbstractC0807p0.a("StreamSharing", "onSuggestedStreamSpecUpdated: primaryStreamSpec = " + e1Var + ", secondaryStreamSpec " + e1Var2);
        b0(k0(k(), x(), l(), e1Var, e1Var2));
        J();
        return e1Var;
    }

    @Override // E.W0
    public void U() {
        super.U();
        h0();
        this.f19537s.R();
    }

    public final void g0(a1.b bVar, final String str, final String str2, final s1 s1Var, final e1 e1Var, final e1 e1Var2) {
        a1.c cVar = this.f19535H;
        if (cVar != null) {
            cVar.b();
        }
        a1.c cVar2 = new a1.c(new a1.d() { // from class: Y.d
            @Override // L.a1.d
            public final void a(a1 a1Var, a1.g gVar) {
                f.e0(this.f19521a, str, str2, s1Var, e1Var, e1Var2, a1Var, gVar);
            }
        });
        this.f19535H = cVar2;
        bVar.r(cVar2);
    }

    public final r i0(J j10, J j11, e1 e1Var, I i10, I i11) {
        return new r(j10, j11, o.a.a(e1Var.b(), i10, i11));
    }

    public final U j0(J j10, e1 e1Var) {
        n();
        return new U(j10, C2271t.a.a(e1Var.b()));
    }

    public final List k0(String str, String str2, s1 s1Var, e1 e1Var, e1 e1Var2) {
        x.b();
        if (e1Var2 != null) {
            L lL0 = l0(str, str2, s1Var, e1Var, e1Var2);
            L lM0 = m0(str, str2, s1Var, e1Var, e1Var2);
            r rVarI0 = i0(i(), w(), e1Var, this.f19538t, this.f19539u);
            this.f19542x = rVarI0;
            y0(lL0, lM0, rVarI0, e1Var);
            return List.of(this.f19533F.p(), this.f19534G.p());
        }
        L lL02 = l0(str, str2, s1Var, e1Var, null);
        J jI = i();
        Objects.requireNonNull(jI);
        U uJ0 = j0(jI, e1Var);
        this.f19541w = uJ0;
        x0(lL02, uJ0, false);
        return List.of(this.f19533F.p());
    }

    public final L l0(String str, String str2, s1 s1Var, e1 e1Var, e1 e1Var2) {
        Matrix matrixZ = z();
        J jI = i();
        Objects.requireNonNull(jI);
        boolean zP = jI.p();
        Rect rectR0 = r0(e1Var.f());
        Objects.requireNonNull(rectR0);
        J jI2 = i();
        Objects.requireNonNull(jI2);
        int iT = t(jI2);
        J jI3 = i();
        Objects.requireNonNull(jI3);
        L l10 = new L(3, 34, e1Var, matrixZ, zP, rectR0, iT, -1, H(jI3));
        this.f19544z = l10;
        boolean z10 = str2 != null;
        J jI4 = i();
        Objects.requireNonNull(jI4);
        this.f19529B = t0(l10, jI4, z10);
        a1.b bVarN0 = n0(this.f19544z, s1Var, e1Var);
        this.f19533F = bVarN0;
        g0(bVarN0, str, str2, s1Var, e1Var, e1Var2);
        return this.f19529B;
    }

    @Override // E.W0
    public s1 m(boolean z10, t1 t1Var) {
        InterfaceC1099g0 interfaceC1099g0A = t1Var.a(this.f19536r.S(), 1);
        if (z10) {
            interfaceC1099g0A = InterfaceC1099g0.F(interfaceC1099g0A, this.f19536r.getConfig());
        }
        if (interfaceC1099g0A == null) {
            return null;
        }
        return E(interfaceC1099g0A).b();
    }

    public final L m0(String str, String str2, s1 s1Var, e1 e1Var, e1 e1Var2) {
        Matrix matrixZ = z();
        J jW = w();
        Objects.requireNonNull(jW);
        boolean zP = jW.p();
        Rect rectR0 = r0(e1Var2.f());
        Objects.requireNonNull(rectR0);
        J jW2 = w();
        Objects.requireNonNull(jW2);
        int iT = t(jW2);
        J jW3 = w();
        Objects.requireNonNull(jW3);
        L l10 = new L(3, 34, e1Var2, matrixZ, zP, rectR0, iT, -1, H(jW3));
        this.f19528A = l10;
        J jW4 = w();
        Objects.requireNonNull(jW4);
        this.f19530C = t0(l10, jW4, true);
        a1.b bVarN0 = n0(this.f19528A, s1Var, e1Var2);
        this.f19534G = bVarN0;
        g0(bVarN0, str, str2, s1Var, e1Var, e1Var2);
        return this.f19530C;
    }

    public final a1.b n0(L l10, s1 s1Var, e1 e1Var) {
        a1.b bVarQ = a1.b.q(s1Var, e1Var.f());
        w0(bVarQ);
        v0(e1Var.f(), bVarQ);
        bVarQ.n(l10.o(), e1Var.b(), null, -1);
        bVarQ.j(this.f19537s.E());
        if (e1Var.d() != null) {
            bVarQ.g(e1Var.d());
        }
        bVarQ.x(e1Var.g());
        b(bVarQ, e1Var);
        return bVarQ;
    }

    public Set q0() {
        return this.f19537s.A();
    }

    public final L t0(L l10, J j10, boolean z10) {
        n();
        return l10;
    }

    public final void v0(Size size, a1.b bVar) {
        Iterator it = q0().iterator();
        while (it.hasNext()) {
            a1 a1VarP = a1.b.q(((W0) it.next()).l(), size).p();
            bVar.c(a1VarP.j());
            bVar.a(a1VarP.n());
            bVar.d(a1VarP.l());
            bVar.b(a1VarP.c());
            bVar.g(a1VarP.g());
        }
    }

    public final void w0(a1.b bVar) {
        Iterator it = q0().iterator();
        int iF = -1;
        while (it.hasNext()) {
            iF = a1.f(iF, p0((W0) it.next()));
        }
        if (iF != -1) {
            bVar.y(iF);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void x0(L l10, U u10, boolean z10) {
        boolean z11 = F() != null;
        Map mapB = this.f19537s.B(l10, D(), z11, z10);
        U.c cVarJ = u10.j(U.b.c(l10, new ArrayList(mapB.values())));
        HashMap map = new HashMap();
        for (Map.Entry entry : mapB.entrySet()) {
            map.put((W0) entry.getKey(), (L) cVarJ.get(entry.getValue()));
        }
        this.f19537s.P(map, this.f19537s.F(l10, z11));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void y0(L l10, L l11, r rVar, e1 e1Var) {
        n();
        boolean z10 = F() != null;
        Map mapC = this.f19537s.C(l10, l11, D(), z10);
        r.c cVarG = this.f19542x.g(r.b.d(l10, l11, new ArrayList(mapC.values())));
        HashMap map = new HashMap();
        for (Map.Entry entry : mapC.entrySet()) {
            map.put((W0) entry.getKey(), (L) cVarG.get(entry.getValue()));
        }
        this.f19537s.P(map, this.f19537s.F(l10, z10));
    }

    public void z0(Set set) {
        X(((W0) set.iterator().next()).o());
    }
}
