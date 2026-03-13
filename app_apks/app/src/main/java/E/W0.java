package E;

import I.e;
import L.AbstractC1109l0;
import L.InterfaceC1099g0;
import L.InterfaceC1130w0;
import L.InterfaceC1132x0;
import L.a1;
import L.e1;
import L.s1;
import L.t1;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Range;
import android.util.Size;
import androidx.camera.core.internal.compat.quirk.AeFpsRangeQuirk;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class W0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public s1 f2924e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public s1 f2925f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Set f2926g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public s1 f2927h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public e1 f2928i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public s1 f2929j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Rect f2930k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public L.J f2932m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public L.J f2933n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f2934o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f2920a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f2921b = new HashSet();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f2922c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public b f2923d = b.INACTIVE;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Matrix f2931l = new Matrix();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public a1 f2935p = a1.b();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public a1 f2936q = a1.b();

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f2937a;

        static {
            int[] iArr = new int[e.b.values().length];
            f2937a = iArr;
            try {
                iArr[e.b.OFF.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2937a[e.b.ON.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2937a[e.b.PREVIEW.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public enum b {
        ACTIVE,
        INACTIVE
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface c {
        void d(W0 w02);

        void j(W0 w02);

        void m(W0 w02);

        void n(W0 w02);
    }

    public W0(s1 s1Var) {
        this.f2925f = s1Var;
        this.f2927h = s1Var;
    }

    public a1 A() {
        return this.f2935p;
    }

    public Set B(L.I i10) {
        return null;
    }

    public Set C() {
        return Collections.EMPTY_SET;
    }

    public int D() {
        return ((InterfaceC1132x0) this.f2927h).B(0);
    }

    public abstract s1.b E(InterfaceC1099g0 interfaceC1099g0);

    public Rect F() {
        return this.f2930k;
    }

    public boolean G(int i10) {
        Iterator it = C().iterator();
        while (it.hasNext()) {
            if (U.V.b(i10, ((Integer) it.next()).intValue())) {
                return true;
            }
        }
        return false;
    }

    public boolean H(L.J j10) {
        int iQ = q();
        if (iQ == -1 || iQ == 0) {
            return false;
        }
        if (iQ == 1) {
            return true;
        }
        if (iQ == 2) {
            return j10.l();
        }
        throw new AssertionError("Unknown mirrorMode: " + iQ);
    }

    public s1 I(L.I i10, s1 s1Var, s1 s1Var2) {
        L.M0 m0G0;
        if (s1Var2 != null) {
            m0G0 = L.M0.h0(s1Var2);
            m0G0.i0(P.q.f12541M);
        } else {
            m0G0 = L.M0.g0();
        }
        if (this.f2925f.d(InterfaceC1132x0.f8216m) || this.f2925f.d(InterfaceC1132x0.f8220q)) {
            InterfaceC1099g0.a aVar = InterfaceC1132x0.f8224u;
            if (m0G0.d(aVar)) {
                m0G0.i0(aVar);
            }
        }
        s1 s1Var3 = this.f2925f;
        InterfaceC1099g0.a aVar2 = InterfaceC1132x0.f8224u;
        if (s1Var3.d(aVar2)) {
            InterfaceC1099g0.a aVar3 = InterfaceC1132x0.f8222s;
            if (m0G0.d(aVar3) && ((X.c) this.f2925f.a(aVar2)).d() != null) {
                m0G0.i0(aVar3);
            }
        }
        Iterator it = this.f2925f.b().iterator();
        while (it.hasNext()) {
            InterfaceC1099g0.Q(m0G0, m0G0, this.f2925f, (InterfaceC1099g0.a) it.next());
        }
        if (s1Var != null) {
            for (InterfaceC1099g0.a aVar4 : s1Var.b()) {
                if (!aVar4.c().equals(P.q.f12541M.c())) {
                    InterfaceC1099g0.Q(m0G0, m0G0, s1Var, aVar4);
                }
            }
        }
        if (m0G0.d(InterfaceC1132x0.f8220q)) {
            InterfaceC1099g0.a aVar5 = InterfaceC1132x0.f8216m;
            if (m0G0.d(aVar5)) {
                m0G0.i0(aVar5);
            }
        }
        InterfaceC1099g0.a aVar6 = InterfaceC1132x0.f8224u;
        if (m0G0.d(aVar6) && ((X.c) m0G0.a(aVar6)).a() != 0) {
            m0G0.H(s1.f8179E, Boolean.TRUE);
        }
        c(m0G0);
        return P(i10, E(m0G0));
    }

    public final void J() {
        this.f2923d = b.ACTIVE;
        M();
    }

    public final void K() {
        this.f2923d = b.INACTIVE;
        M();
    }

    public final void L() {
        Iterator it = this.f2921b.iterator();
        while (it.hasNext()) {
            ((c) it.next()).d(this);
        }
    }

    public final void M() {
        int iOrdinal = this.f2923d.ordinal();
        if (iOrdinal == 0) {
            Iterator it = this.f2921b.iterator();
            while (it.hasNext()) {
                ((c) it.next()).m(this);
            }
        } else {
            if (iOrdinal != 1) {
                return;
            }
            Iterator it2 = this.f2921b.iterator();
            while (it2.hasNext()) {
                ((c) it2.next()).j(this);
            }
        }
    }

    public abstract s1 P(L.I i10, s1.b bVar);

    public void Q() {
        this.f2920a = true;
    }

    public void R() {
        this.f2920a = false;
    }

    public abstract e1 S(InterfaceC1099g0 interfaceC1099g0);

    public abstract e1 T(e1 e1Var, e1 e1Var2);

    public final void V(c cVar) {
        this.f2921b.remove(cVar);
    }

    public void W(AbstractC0804o abstractC0804o) {
        X0.h.a(true);
    }

    public void X(Set set) {
        this.f2926g = set != null ? new HashSet(set) : null;
    }

    public void Y(Matrix matrix) {
        this.f2931l = new Matrix(matrix);
    }

    public void Z(Rect rect) {
        this.f2930k = rect;
    }

    public final void a(c cVar) {
        this.f2921b.add(cVar);
    }

    public final void a0(L.J j10) {
        U();
        synchronized (this.f2922c) {
            try {
                L.J j11 = this.f2932m;
                if (j10 == j11) {
                    V(j11);
                    this.f2932m = null;
                }
                L.J j12 = this.f2933n;
                if (j10 == j12) {
                    V(j12);
                    this.f2933n = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f2928i = null;
        this.f2930k = null;
        this.f2927h = this.f2925f;
        this.f2924e = null;
        this.f2929j = null;
    }

    public void b(a1.b bVar, e1 e1Var) {
        if (!e1.f8057a.equals(e1Var.c())) {
            bVar.s(e1Var.c());
            return;
        }
        synchronized (this.f2922c) {
            try {
                List listC = ((L.J) X0.h.g(this.f2932m)).i().k().c(AeFpsRangeQuirk.class);
                boolean z10 = true;
                if (listC.size() > 1) {
                    z10 = false;
                }
                X0.h.b(z10, "There should not have more than one AeFpsRangeQuirk.");
                if (!listC.isEmpty()) {
                    bVar.s(((AeFpsRangeQuirk) listC.get(0)).a());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void b0(List list) {
        if (list.isEmpty()) {
            return;
        }
        this.f2935p = (a1) list.get(0);
        if (list.size() > 1) {
            this.f2936q = (a1) list.get(1);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            for (AbstractC1109l0 abstractC1109l0 : ((a1) it.next()).o()) {
                if (abstractC1109l0.g() == null) {
                    abstractC1109l0.p(getClass());
                }
            }
        }
    }

    public final void c(L.M0 m02) {
        AbstractC0807p0.a("UseCase", "applyFeaturesToConfig: mFeatureGroup = " + this.f2926g + ", this = " + this);
        Set<G.b> set = this.f2926g;
        if (set == null) {
            return;
        }
        J jF = I.a.f5378j;
        Range range = e1.f8057a;
        e.b bVarF = I.e.f5390j;
        for (G.b bVar : set) {
            if (bVar instanceof I.a) {
                jF = ((I.a) bVar).f();
            } else if (bVar instanceof I.c) {
                I.c cVar = (I.c) bVar;
                range = new Range(Integer.valueOf(cVar.g()), Integer.valueOf(cVar.f()));
            } else if (bVar instanceof I.e) {
                bVarF = ((I.e) bVar).f();
            }
        }
        if ((this instanceof C0822x0) || P.f.c0(this)) {
            m02.H(InterfaceC1130w0.f8215l, jF);
        }
        m02.H(s1.f8177C, range);
        int i10 = a.f2937a[bVarF.ordinal()];
        if (i10 == 1) {
            m02.H(s1.f8182H, 1);
            m02.H(s1.f8183I, 1);
        } else if (i10 == 2) {
            m02.H(s1.f8182H, 0);
            m02.H(s1.f8183I, 2);
        } else {
            if (i10 != 3) {
                return;
            }
            m02.H(s1.f8182H, 2);
            m02.H(s1.f8183I, 0);
        }
    }

    public void c0(e1 e1Var, e1 e1Var2) {
        this.f2928i = T(e1Var, e1Var2);
    }

    public final void d(L.J j10, L.J j11, s1 s1Var, s1 s1Var2) {
        synchronized (this.f2922c) {
            try {
                this.f2932m = j10;
                this.f2933n = j11;
                a(j10);
                if (j11 != null) {
                    a(j11);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f2924e = s1Var;
        this.f2929j = s1Var2;
        this.f2927h = I(j10.i(), this.f2924e, this.f2929j);
        N();
    }

    public void d0(InterfaceC1099g0 interfaceC1099g0) {
        this.f2928i = S(interfaceC1099g0);
    }

    public s1 e() {
        return this.f2925f;
    }

    public int f() {
        return ((InterfaceC1132x0) this.f2927h).r(-1);
    }

    public e1 g() {
        return this.f2928i;
    }

    public Size h() {
        e1 e1Var = this.f2928i;
        if (e1Var != null) {
            return e1Var.f();
        }
        return null;
    }

    public L.J i() {
        L.J j10;
        synchronized (this.f2922c) {
            j10 = this.f2932m;
        }
        return j10;
    }

    public L.F j() {
        synchronized (this.f2922c) {
            try {
                L.J j10 = this.f2932m;
                if (j10 == null) {
                    return L.F.f7895a;
                }
                return j10.c();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public String k() {
        return ((L.J) X0.h.h(i(), "No camera attached to use case: " + this)).i().d();
    }

    public s1 l() {
        return this.f2927h;
    }

    public abstract s1 m(boolean z10, t1 t1Var);

    public AbstractC0804o n() {
        return null;
    }

    public Set o() {
        return this.f2926g;
    }

    public int p() {
        return this.f2927h.getInputFormat();
    }

    public int q() {
        return ((InterfaceC1132x0) this.f2927h).c0(-1);
    }

    public String r() {
        String strS = this.f2927h.s("<UnknownUseCase-" + hashCode() + ">");
        Objects.requireNonNull(strS);
        return strS;
    }

    public String s() {
        return this.f2934o;
    }

    public int t(L.J j10) {
        return u(j10, false);
    }

    public int u(L.J j10, boolean z10) {
        int iP = j10.i().p(D());
        return (j10.p() || !z10) ? iP : M.y.t(-iP);
    }

    public z0 v() {
        L.J jI = i();
        Size sizeH = h();
        if (jI == null || sizeH == null) {
            return null;
        }
        Rect rectF = F();
        if (rectF == null) {
            rectF = new Rect(0, 0, sizeH.getWidth(), sizeH.getHeight());
        }
        return new z0(sizeH, rectF, t(jI));
    }

    public L.J w() {
        L.J j10;
        synchronized (this.f2922c) {
            j10 = this.f2933n;
        }
        return j10;
    }

    public String x() {
        if (w() == null) {
            return null;
        }
        return w().i().d();
    }

    public a1 y() {
        return this.f2936q;
    }

    public Matrix z() {
        return this.f2931l;
    }

    public void N() {
    }

    public void O() {
    }

    public void U() {
    }
}
