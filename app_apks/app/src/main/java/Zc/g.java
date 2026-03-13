package Zc;

import Cd.B;
import Cd.C0738v;
import Cd.E;
import Cd.F;
import Cd.G;
import Cd.M;
import Cd.a0;
import Cd.e0;
import Cd.h0;
import Cd.i0;
import Cd.k0;
import Cd.l0;
import Cd.p0;
import Cd.u0;
import Ed.j;
import Ed.k;
import Lc.InterfaceC1177e;
import Lc.InterfaceC1180h;
import Lc.f0;
import com.fasterxml.jackson.core.JsonFactory;
import fc.AbstractC4040w;
import fc.C4034q;
import gc.C4205s;
import gc.C4207u;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import kotlin.jvm.internal.v;
import sd.AbstractC5823c;
import vc.l;
import vd.InterfaceC6099h;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class g extends l0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f20447e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Zc.a f20448f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Zc.a f20449g;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f20450c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final h0 f20451d;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends v implements l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC1177e f20452a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ g f20453b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ M f20454c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Zc.a f20455d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC1177e interfaceC1177e, g gVar, M m10, Zc.a aVar) {
            super(1);
            this.f20452a = interfaceC1177e;
            this.f20453b = gVar;
            this.f20454c = m10;
            this.f20455d = aVar;
        }

        @Override // vc.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final M invoke(Dd.g kotlinTypeRefiner) {
            kd.b bVarK;
            InterfaceC1177e interfaceC1177eB;
            AbstractC4862t.e(kotlinTypeRefiner, "kotlinTypeRefiner");
            InterfaceC1177e interfaceC1177e = this.f20452a;
            if (interfaceC1177e == null) {
                interfaceC1177e = null;
            }
            if (interfaceC1177e == null || (bVarK = AbstractC5823c.k(interfaceC1177e)) == null || (interfaceC1177eB = kotlinTypeRefiner.b(bVarK)) == null || AbstractC4862t.a(interfaceC1177eB, this.f20452a)) {
                return null;
            }
            return (M) this.f20453b.j(this.f20454c, interfaceC1177eB, this.f20455d).e();
        }
    }

    static {
        p0 p0Var = p0.COMMON;
        f20448f = Zc.b.b(p0Var, false, true, null, 5, null).l(c.FLEXIBLE_LOWER_BOUND);
        f20449g = Zc.b.b(p0Var, false, true, null, 5, null).l(c.FLEXIBLE_UPPER_BOUND);
    }

    public g() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ E l(g gVar, E e10, Zc.a aVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            aVar = new Zc.a(p0.COMMON, null, false, false, null, null, 62, null);
        }
        return gVar.k(e10, aVar);
    }

    @Override // Cd.l0
    public boolean f() {
        return false;
    }

    public final C4034q j(M m10, InterfaceC1177e interfaceC1177e, Zc.a aVar) {
        if (m10.N0().getParameters().isEmpty()) {
            return AbstractC4040w.a(m10, Boolean.FALSE);
        }
        if (Ic.g.c0(m10)) {
            i0 i0Var = (i0) m10.L0().get(0);
            u0 u0VarB = i0Var.b();
            E type = i0Var.getType();
            AbstractC4862t.d(type, "componentTypeProjection.type");
            return AbstractC4040w.a(F.j(m10.M0(), m10.N0(), C4205s.d(new k0(u0VarB, k(type, aVar))), m10.O0(), null, 16, null), Boolean.FALSE);
        }
        if (G.a(m10)) {
            return AbstractC4040w.a(k.d(j.ERROR_RAW_TYPE, m10.N0().toString()), Boolean.FALSE);
        }
        InterfaceC6099h interfaceC6099hH = interfaceC1177e.H(this);
        AbstractC4862t.d(interfaceC6099hH, "declaration.getMemberScope(this)");
        a0 a0VarM0 = m10.M0();
        e0 e0VarK = interfaceC1177e.k();
        AbstractC4862t.d(e0VarK, "declaration.typeConstructor");
        List<f0> parameters = interfaceC1177e.k().getParameters();
        AbstractC4862t.d(parameters, "declaration.typeConstructor.parameters");
        ArrayList arrayList = new ArrayList(C4207u.v(parameters, 10));
        for (f0 parameter : parameters) {
            f fVar = this.f20450c;
            AbstractC4862t.d(parameter, "parameter");
            arrayList.add(C0738v.b(fVar, parameter, aVar, this.f20451d, null, 8, null));
        }
        return AbstractC4040w.a(F.l(a0VarM0, e0VarK, arrayList, m10.O0(), interfaceC6099hH, new b(interfaceC1177e, this, m10, aVar)), Boolean.TRUE);
    }

    public final E k(E e10, Zc.a aVar) {
        InterfaceC1180h interfaceC1180hQ = e10.N0().q();
        if (interfaceC1180hQ instanceof f0) {
            return k(this.f20451d.c((f0) interfaceC1180hQ, aVar.j(true)), aVar);
        }
        if (!(interfaceC1180hQ instanceof InterfaceC1177e)) {
            throw new IllegalStateException(("Unexpected declaration kind: " + interfaceC1180hQ).toString());
        }
        InterfaceC1180h interfaceC1180hQ2 = B.d(e10).N0().q();
        if (interfaceC1180hQ2 instanceof InterfaceC1177e) {
            C4034q c4034qJ = j(B.c(e10), (InterfaceC1177e) interfaceC1180hQ, f20448f);
            M m10 = (M) c4034qJ.a();
            boolean zBooleanValue = ((Boolean) c4034qJ.b()).booleanValue();
            C4034q c4034qJ2 = j(B.d(e10), (InterfaceC1177e) interfaceC1180hQ2, f20449g);
            M m11 = (M) c4034qJ2.a();
            return (zBooleanValue || ((Boolean) c4034qJ2.b()).booleanValue()) ? new h(m10, m11) : F.d(m10, m11);
        }
        throw new IllegalStateException(("For some reason declaration for upper bound is not a class but \"" + interfaceC1180hQ2 + "\" while for lower it's \"" + interfaceC1180hQ + JsonFactory.DEFAULT_QUOTE_CHAR).toString());
    }

    @Override // Cd.l0
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public k0 e(E key) {
        AbstractC4862t.e(key, "key");
        return new k0(l(this, key, null, 2, null));
    }

    public g(h0 h0Var) {
        f fVar = new f();
        this.f20450c = fVar;
        this.f20451d = h0Var == null ? new h0(fVar, null, 2, null) : h0Var;
    }

    public /* synthetic */ g(h0 h0Var, int i10, AbstractC4854k abstractC4854k) {
        this((i10 & 1) != 0 ? null : h0Var);
    }
}
