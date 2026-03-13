package Oc;

import Cd.AbstractC0735s;
import Cd.C0728k;
import Cd.C0731n;
import Cd.e0;
import Cd.l0;
import Cd.n0;
import Cd.q0;
import Cd.u0;
import Lc.AbstractC1192u;
import Lc.EnumC1178f;
import Lc.InterfaceC1176d;
import Lc.InterfaceC1177e;
import Lc.InterfaceC1185m;
import Lc.InterfaceC1187o;
import Lc.X;
import Lc.a0;
import Lc.f0;
import Lc.h0;
import gc.C4179C;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import od.AbstractC5283e;
import sd.AbstractC5823c;
import vd.C6104m;
import vd.InterfaceC6099h;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class s extends t {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f12353b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n0 f12354c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public n0 f12355d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public List f12356e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public List f12357f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public e0 f12358g;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a implements vc.l {
        public a() {
        }

        @Override // vc.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean invoke(f0 f0Var) {
            return Boolean.valueOf(!f0Var.O());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class b implements vc.l {
        public b() {
        }

        @Override // vc.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Cd.M invoke(Cd.M m10) {
            return s.this.M0(m10);
        }
    }

    public s(t tVar, n0 n0Var) {
        this.f12353b = tVar;
        this.f12354c = n0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static /* synthetic */ void E0(int r15) {
        /*
            Method dump skipped, instruction units count: 318
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: Oc.s.E0(int):void");
    }

    @Override // Lc.InterfaceC1177e
    public InterfaceC1176d C() {
        return this.f12353b.C();
    }

    @Override // Oc.t
    public InterfaceC6099h D0(Dd.g gVar) {
        if (gVar == null) {
            E0(13);
        }
        InterfaceC6099h interfaceC6099hD0 = this.f12353b.D0(gVar);
        if (!this.f12354c.k()) {
            return new C6104m(interfaceC6099hD0, K0());
        }
        if (interfaceC6099hD0 == null) {
            E0(14);
        }
        return interfaceC6099hD0;
    }

    @Override // Lc.InterfaceC1177e
    public InterfaceC6099h H(l0 l0Var) {
        if (l0Var == null) {
            E0(10);
        }
        InterfaceC6099h interfaceC6099hG0 = g0(l0Var, AbstractC5823c.o(AbstractC5283e.g(this)));
        if (interfaceC6099hG0 == null) {
            E0(11);
        }
        return interfaceC6099hG0;
    }

    @Override // Lc.InterfaceC1177e
    public boolean I0() {
        return this.f12353b.I0();
    }

    @Override // Lc.InterfaceC1177e
    public X J0() {
        throw new UnsupportedOperationException();
    }

    public final n0 K0() {
        if (this.f12355d == null) {
            if (this.f12354c.k()) {
                this.f12355d = this.f12354c;
            } else {
                List parameters = this.f12353b.k().getParameters();
                this.f12356e = new ArrayList(parameters.size());
                this.f12355d = AbstractC0735s.b(parameters, this.f12354c.j(), this, this.f12356e);
                this.f12357f = C4179C.d0(this.f12356e, new a());
            }
        }
        return this.f12355d;
    }

    @Override // Lc.c0
    /* JADX INFO: renamed from: L0, reason: merged with bridge method [inline-methods] */
    public InterfaceC1177e c(n0 n0Var) {
        if (n0Var == null) {
            E0(23);
        }
        return n0Var.k() ? this : new s(this, n0.h(n0Var.j(), K0().j()));
    }

    public final Cd.M M0(Cd.M m10) {
        return (m10 == null || this.f12354c.k()) ? m10 : (Cd.M) K0().p(m10, u0.INVARIANT);
    }

    @Override // Lc.InterfaceC1177e
    public InterfaceC6099h R() {
        InterfaceC6099h interfaceC6099hR = this.f12353b.R();
        if (interfaceC6099hR == null) {
            E0(28);
        }
        return interfaceC6099hR;
    }

    @Override // Lc.InterfaceC1177e
    public h0 S() {
        h0 h0VarS = this.f12353b.S();
        if (h0VarS == null) {
            return null;
        }
        return h0VarS.b(new b());
    }

    @Override // Lc.InterfaceC1177e
    public InterfaceC6099h U() {
        InterfaceC6099h interfaceC6099hD0 = D0(AbstractC5823c.o(AbstractC5283e.g(this.f12353b)));
        if (interfaceC6099hD0 == null) {
            E0(12);
        }
        return interfaceC6099hD0;
    }

    @Override // Lc.C
    public boolean V() {
        return this.f12353b.V();
    }

    @Override // Lc.InterfaceC1177e
    public List X() {
        List list = Collections.EMPTY_LIST;
        if (list == null) {
            E0(17);
        }
        return list;
    }

    @Override // Lc.InterfaceC1177e
    public boolean Z() {
        return this.f12353b.Z();
    }

    @Override // Lc.InterfaceC1177e, Lc.InterfaceC1186n, Lc.InterfaceC1185m
    public InterfaceC1185m b() {
        InterfaceC1185m interfaceC1185mB = this.f12353b.b();
        if (interfaceC1185mB == null) {
            E0(22);
        }
        return interfaceC1185mB;
    }

    @Override // Lc.InterfaceC1177e
    public boolean d0() {
        return this.f12353b.d0();
    }

    @Override // Lc.InterfaceC1177e
    public EnumC1178f f() {
        EnumC1178f enumC1178fF = this.f12353b.f();
        if (enumC1178fF == null) {
            E0(25);
        }
        return enumC1178fF;
    }

    @Override // Oc.t
    public InterfaceC6099h g0(l0 l0Var, Dd.g gVar) {
        if (l0Var == null) {
            E0(5);
        }
        if (gVar == null) {
            E0(6);
        }
        InterfaceC6099h interfaceC6099hG0 = this.f12353b.g0(l0Var, gVar);
        if (!this.f12354c.k()) {
            return new C6104m(interfaceC6099hG0, K0());
        }
        if (interfaceC6099hG0 == null) {
            E0(7);
        }
        return interfaceC6099hG0;
    }

    @Override // Mc.a
    public Mc.g getAnnotations() {
        Mc.g annotations = this.f12353b.getAnnotations();
        if (annotations == null) {
            E0(19);
        }
        return annotations;
    }

    @Override // Lc.I
    public kd.f getName() {
        kd.f name = this.f12353b.getName();
        if (name == null) {
            E0(20);
        }
        return name;
    }

    @Override // Lc.InterfaceC1177e, Lc.InterfaceC1189q, Lc.C
    public AbstractC1192u getVisibility() {
        AbstractC1192u visibility = this.f12353b.getVisibility();
        if (visibility == null) {
            E0(27);
        }
        return visibility;
    }

    @Override // Lc.InterfaceC1177e
    public boolean i0() {
        return this.f12353b.i0();
    }

    @Override // Lc.C
    public boolean isExternal() {
        return this.f12353b.isExternal();
    }

    @Override // Lc.InterfaceC1177e
    public boolean isInline() {
        return this.f12353b.isInline();
    }

    @Override // Lc.InterfaceC1188p
    public a0 j() {
        a0 a0Var = a0.f8746a;
        if (a0Var == null) {
            E0(29);
        }
        return a0Var;
    }

    @Override // Lc.InterfaceC1185m
    public Object j0(InterfaceC1187o interfaceC1187o, Object obj) {
        return interfaceC1187o.e(this, obj);
    }

    @Override // Lc.InterfaceC1180h
    public e0 k() {
        e0 e0VarK = this.f12353b.k();
        if (this.f12354c.k()) {
            if (e0VarK == null) {
                E0(0);
            }
            return e0VarK;
        }
        if (this.f12358g == null) {
            n0 n0VarK0 = K0();
            Collection collectionO = e0VarK.o();
            ArrayList arrayList = new ArrayList(collectionO.size());
            Iterator it = collectionO.iterator();
            while (it.hasNext()) {
                arrayList.add(n0VarK0.p((Cd.E) it.next(), u0.INVARIANT));
            }
            this.f12358g = new C0728k(this, this.f12356e, arrayList, Bd.f.f816e);
        }
        e0 e0Var = this.f12358g;
        if (e0Var == null) {
            E0(1);
        }
        return e0Var;
    }

    @Override // Lc.C
    public boolean k0() {
        return this.f12353b.k0();
    }

    @Override // Lc.InterfaceC1177e
    public Collection l() {
        Collection<InterfaceC1176d> collectionL = this.f12353b.l();
        ArrayList arrayList = new ArrayList(collectionL.size());
        for (InterfaceC1176d interfaceC1176d : collectionL) {
            arrayList.add(((InterfaceC1176d) interfaceC1176d.u().k(interfaceC1176d.a()).b(interfaceC1176d.r()).m(interfaceC1176d.getVisibility()).n(interfaceC1176d.f()).q(false).build()).c(K0()));
        }
        return arrayList;
    }

    @Override // Lc.InterfaceC1177e
    public InterfaceC6099h l0() {
        InterfaceC6099h interfaceC6099hL0 = this.f12353b.l0();
        if (interfaceC6099hL0 == null) {
            E0(15);
        }
        return interfaceC6099hL0;
    }

    @Override // Lc.InterfaceC1177e
    public InterfaceC1177e m0() {
        return this.f12353b.m0();
    }

    @Override // Lc.InterfaceC1177e, Lc.InterfaceC1180h
    public Cd.M p() {
        Cd.M mK = Cd.F.k(C0731n.f1384a.a(getAnnotations(), null, null), k(), q0.g(k().getParameters()), false, U());
        if (mK == null) {
            E0(16);
        }
        return mK;
    }

    @Override // Lc.InterfaceC1177e, Lc.InterfaceC1181i
    public List q() {
        K0();
        List list = this.f12357f;
        if (list == null) {
            E0(30);
        }
        return list;
    }

    @Override // Lc.InterfaceC1177e, Lc.C
    public Lc.D r() {
        Lc.D dR = this.f12353b.r();
        if (dR == null) {
            E0(26);
        }
        return dR;
    }

    @Override // Lc.InterfaceC1177e
    public Collection x() {
        Collection collectionX = this.f12353b.x();
        if (collectionX == null) {
            E0(31);
        }
        return collectionX;
    }

    @Override // Lc.InterfaceC1181i
    public boolean z() {
        return this.f12353b.z();
    }

    @Override // Oc.t, Lc.InterfaceC1185m
    public InterfaceC1177e a() {
        InterfaceC1177e interfaceC1177eA = this.f12353b.a();
        if (interfaceC1177eA == null) {
            E0(21);
        }
        return interfaceC1177eA;
    }
}
