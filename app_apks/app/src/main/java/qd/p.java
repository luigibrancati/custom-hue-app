package qd;

import Cd.E;
import Cd.F;
import Cd.G;
import Cd.M;
import Cd.a0;
import Cd.i0;
import Cd.k0;
import Cd.u0;
import Ic.j;
import Lc.AbstractC1195x;
import Lc.InterfaceC1177e;
import Lc.InterfaceC1180h;
import Lc.f0;
import fc.C4032o;
import gc.C4179C;
import gc.C4205s;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import sd.AbstractC5823c;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class p extends g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f43455b = new a(null);

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public final g a(E argumentType) {
            AbstractC4862t.e(argumentType, "argumentType");
            if (G.a(argumentType)) {
                return null;
            }
            int i10 = 0;
            E type = argumentType;
            while (Ic.g.c0(type)) {
                type = ((i0) C4179C.F0(type.L0())).getType();
                AbstractC4862t.d(type, "type.arguments.single().type");
                i10++;
            }
            InterfaceC1180h interfaceC1180hQ = type.N0().q();
            if (interfaceC1180hQ instanceof InterfaceC1177e) {
                kd.b bVarK = AbstractC5823c.k(interfaceC1180hQ);
                return bVarK == null ? new p(new b.a(argumentType)) : new p(bVarK, i10);
            }
            if (!(interfaceC1180hQ instanceof f0)) {
                return null;
            }
            kd.b bVarM = kd.b.m(j.a.f5783b.l());
            AbstractC4862t.d(bVarM, "topLevel(StandardNames.FqNames.any.toSafe())");
            return new p(bVarM, 0);
        }

        public a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static abstract class b {

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class a extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final E f43456a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(E type) {
                super(null);
                AbstractC4862t.e(type, "type");
                this.f43456a = type;
            }

            public final E a() {
                return this.f43456a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && AbstractC4862t.a(this.f43456a, ((a) obj).f43456a);
            }

            public int hashCode() {
                return this.f43456a.hashCode();
            }

            public String toString() {
                return "LocalClass(type=" + this.f43456a + ')';
            }
        }

        /* JADX INFO: renamed from: qd.p$b$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class C0583b extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final f f43457a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0583b(f value) {
                super(null);
                AbstractC4862t.e(value, "value");
                this.f43457a = value;
            }

            public final int a() {
                return this.f43457a.c();
            }

            public final kd.b b() {
                return this.f43457a.d();
            }

            public final f c() {
                return this.f43457a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0583b) && AbstractC4862t.a(this.f43457a, ((C0583b) obj).f43457a);
            }

            public int hashCode() {
                return this.f43457a.hashCode();
            }

            public String toString() {
                return "NormalClass(value=" + this.f43457a + ')';
            }
        }

        public /* synthetic */ b(AbstractC4854k abstractC4854k) {
            this();
        }

        public b() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(b value) {
        super(value);
        AbstractC4862t.e(value, "value");
    }

    @Override // qd.g
    public E a(Lc.G module) {
        AbstractC4862t.e(module, "module");
        a0 a0VarH = a0.f1311b.h();
        InterfaceC1177e interfaceC1177eE = module.n().E();
        AbstractC4862t.d(interfaceC1177eE, "module.builtIns.kClass");
        return F.g(a0VarH, interfaceC1177eE, C4205s.d(new k0(c(module))));
    }

    public final E c(Lc.G module) {
        AbstractC4862t.e(module, "module");
        b bVar = (b) b();
        if (bVar instanceof b.a) {
            return ((b.a) b()).a();
        }
        if (!(bVar instanceof b.C0583b)) {
            throw new C4032o();
        }
        f fVarC = ((b.C0583b) b()).c();
        kd.b bVarA = fVarC.a();
        int iB = fVarC.b();
        InterfaceC1177e interfaceC1177eA = AbstractC1195x.a(module, bVarA);
        if (interfaceC1177eA == null) {
            Ed.j jVar = Ed.j.UNRESOLVED_KCLASS_CONSTANT_VALUE;
            String string = bVarA.toString();
            AbstractC4862t.d(string, "classId.toString()");
            return Ed.k.d(jVar, string, String.valueOf(iB));
        }
        M mP = interfaceC1177eA.p();
        AbstractC4862t.d(mP, "descriptor.defaultType");
        E eW = Hd.a.w(mP);
        for (int i10 = 0; i10 < iB; i10++) {
            eW = module.n().l(u0.INVARIANT, eW);
            AbstractC4862t.d(eW, "module.builtIns.getArray…Variance.INVARIANT, type)");
        }
        return eW;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public p(f value) {
        this(new b.C0583b(value));
        AbstractC4862t.e(value, "value");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public p(kd.b classId, int i10) {
        this(new f(classId, i10));
        AbstractC4862t.e(classId, "classId");
    }
}
