package Cd;

import Cd.X;
import Lc.InterfaceC1177e;
import Lc.InterfaceC1180h;
import gc.C4206t;
import java.util.List;
import kotlin.jvm.internal.AbstractC4862t;
import sd.AbstractC5823c;
import vd.InterfaceC6099h;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class F {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final F f1267a = new F();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final vc.l f1268b = a.f1269a;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends kotlin.jvm.internal.v implements vc.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f1269a = new a();

        public a() {
            super(1);
        }

        @Override // vc.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke(Dd.g gVar) {
            AbstractC4862t.e(gVar, "<anonymous parameter 0>");
            return null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final M f1270a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final e0 f1271b;

        public b(M m10, e0 e0Var) {
            this.f1270a = m10;
            this.f1271b = e0Var;
        }

        public final M a() {
            return this.f1270a;
        }

        public final e0 b() {
            return this.f1271b;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class c extends kotlin.jvm.internal.v implements vc.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e0 f1272a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ List f1273b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ a0 f1274c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ boolean f1275d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(e0 e0Var, List list, a0 a0Var, boolean z10) {
            super(1);
            this.f1272a = e0Var;
            this.f1273b = list;
            this.f1274c = a0Var;
            this.f1275d = z10;
        }

        @Override // vc.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final M invoke(Dd.g refiner) {
            AbstractC4862t.e(refiner, "refiner");
            b bVarF = F.f1267a.f(this.f1272a, refiner, this.f1273b);
            if (bVarF == null) {
                return null;
            }
            M mA = bVarF.a();
            if (mA != null) {
                return mA;
            }
            a0 a0Var = this.f1274c;
            e0 e0VarB = bVarF.b();
            AbstractC4862t.b(e0VarB);
            return F.i(a0Var, e0VarB, this.f1273b, this.f1275d, refiner);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class d extends kotlin.jvm.internal.v implements vc.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e0 f1276a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ List f1277b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ a0 f1278c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ boolean f1279d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ InterfaceC6099h f1280e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(e0 e0Var, List list, a0 a0Var, boolean z10, InterfaceC6099h interfaceC6099h) {
            super(1);
            this.f1276a = e0Var;
            this.f1277b = list;
            this.f1278c = a0Var;
            this.f1279d = z10;
            this.f1280e = interfaceC6099h;
        }

        @Override // vc.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final M invoke(Dd.g kotlinTypeRefiner) {
            AbstractC4862t.e(kotlinTypeRefiner, "kotlinTypeRefiner");
            b bVarF = F.f1267a.f(this.f1276a, kotlinTypeRefiner, this.f1277b);
            if (bVarF == null) {
                return null;
            }
            M mA = bVarF.a();
            if (mA != null) {
                return mA;
            }
            a0 a0Var = this.f1278c;
            e0 e0VarB = bVarF.b();
            AbstractC4862t.b(e0VarB);
            return F.k(a0Var, e0VarB, this.f1277b, this.f1279d, this.f1280e);
        }
    }

    public static final M b(Lc.e0 e0Var, List arguments) {
        AbstractC4862t.e(e0Var, "<this>");
        AbstractC4862t.e(arguments, "arguments");
        return new V(X.a.f1308a, false).h(W.f1303e.a(null, e0Var, arguments), a0.f1311b.h());
    }

    public static final t0 d(M lowerBound, M upperBound) {
        AbstractC4862t.e(lowerBound, "lowerBound");
        AbstractC4862t.e(upperBound, "upperBound");
        return AbstractC4862t.a(lowerBound, upperBound) ? lowerBound : new C0742z(lowerBound, upperBound);
    }

    public static final M e(a0 attributes, qd.n constructor, boolean z10) {
        AbstractC4862t.e(attributes, "attributes");
        AbstractC4862t.e(constructor, "constructor");
        return k(attributes, constructor, C4206t.k(), z10, Ed.k.a(Ed.g.INTEGER_LITERAL_TYPE_SCOPE, true, "unknown integer literal type"));
    }

    public static final M g(a0 attributes, InterfaceC1177e descriptor, List arguments) {
        AbstractC4862t.e(attributes, "attributes");
        AbstractC4862t.e(descriptor, "descriptor");
        AbstractC4862t.e(arguments, "arguments");
        e0 e0VarK = descriptor.k();
        AbstractC4862t.d(e0VarK, "descriptor.typeConstructor");
        return j(attributes, e0VarK, arguments, false, null, 16, null);
    }

    public static final M h(a0 attributes, e0 constructor, List arguments, boolean z10) {
        AbstractC4862t.e(attributes, "attributes");
        AbstractC4862t.e(constructor, "constructor");
        AbstractC4862t.e(arguments, "arguments");
        return j(attributes, constructor, arguments, z10, null, 16, null);
    }

    public static final M i(a0 attributes, e0 constructor, List arguments, boolean z10, Dd.g gVar) {
        AbstractC4862t.e(attributes, "attributes");
        AbstractC4862t.e(constructor, "constructor");
        AbstractC4862t.e(arguments, "arguments");
        if (!attributes.isEmpty() || !arguments.isEmpty() || z10 || constructor.q() == null) {
            return l(attributes, constructor, arguments, z10, f1267a.c(constructor, arguments, gVar), new c(constructor, arguments, attributes, z10));
        }
        InterfaceC1180h interfaceC1180hQ = constructor.q();
        AbstractC4862t.b(interfaceC1180hQ);
        M mP = interfaceC1180hQ.p();
        AbstractC4862t.d(mP, "constructor.declarationDescriptor!!.defaultType");
        return mP;
    }

    public static /* synthetic */ M j(a0 a0Var, e0 e0Var, List list, boolean z10, Dd.g gVar, int i10, Object obj) {
        if ((i10 & 16) != 0) {
            gVar = null;
        }
        return i(a0Var, e0Var, list, z10, gVar);
    }

    public static final M k(a0 attributes, e0 constructor, List arguments, boolean z10, InterfaceC6099h memberScope) {
        AbstractC4862t.e(attributes, "attributes");
        AbstractC4862t.e(constructor, "constructor");
        AbstractC4862t.e(arguments, "arguments");
        AbstractC4862t.e(memberScope, "memberScope");
        N n10 = new N(constructor, arguments, z10, memberScope, new d(constructor, arguments, attributes, z10, memberScope));
        return attributes.isEmpty() ? n10 : new O(n10, attributes);
    }

    public static final M l(a0 attributes, e0 constructor, List arguments, boolean z10, InterfaceC6099h memberScope, vc.l refinedTypeFactory) {
        AbstractC4862t.e(attributes, "attributes");
        AbstractC4862t.e(constructor, "constructor");
        AbstractC4862t.e(arguments, "arguments");
        AbstractC4862t.e(memberScope, "memberScope");
        AbstractC4862t.e(refinedTypeFactory, "refinedTypeFactory");
        N n10 = new N(constructor, arguments, z10, memberScope, refinedTypeFactory);
        return attributes.isEmpty() ? n10 : new O(n10, attributes);
    }

    public final InterfaceC6099h c(e0 e0Var, List list, Dd.g gVar) {
        InterfaceC1180h interfaceC1180hQ = e0Var.q();
        if (interfaceC1180hQ instanceof Lc.f0) {
            return ((Lc.f0) interfaceC1180hQ).p().o();
        }
        if (interfaceC1180hQ instanceof InterfaceC1177e) {
            if (gVar == null) {
                gVar = AbstractC5823c.o(AbstractC5823c.p(interfaceC1180hQ));
            }
            return list.isEmpty() ? Oc.u.b((InterfaceC1177e) interfaceC1180hQ, gVar) : Oc.u.a((InterfaceC1177e) interfaceC1180hQ, f0.f1357c.b(e0Var, list), gVar);
        }
        if (interfaceC1180hQ instanceof Lc.e0) {
            Ed.g gVar2 = Ed.g.SCOPE_FOR_ABBREVIATION_TYPE;
            String string = ((Lc.e0) interfaceC1180hQ).getName().toString();
            AbstractC4862t.d(string, "descriptor.name.toString()");
            return Ed.k.a(gVar2, true, string);
        }
        if (e0Var instanceof D) {
            return ((D) e0Var).a();
        }
        throw new IllegalStateException("Unsupported classifier: " + interfaceC1180hQ + " for constructor: " + e0Var);
    }

    public final b f(e0 e0Var, Dd.g gVar, List list) {
        InterfaceC1180h interfaceC1180hF;
        InterfaceC1180h interfaceC1180hQ = e0Var.q();
        if (interfaceC1180hQ == null || (interfaceC1180hF = gVar.f(interfaceC1180hQ)) == null) {
            return null;
        }
        if (interfaceC1180hF instanceof Lc.e0) {
            return new b(b((Lc.e0) interfaceC1180hF, list), null);
        }
        e0 e0VarP = interfaceC1180hF.k().p(gVar);
        AbstractC4862t.d(e0VarP, "descriptor.typeConstruct…refine(kotlinTypeRefiner)");
        return new b(null, e0VarP);
    }
}
