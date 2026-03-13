package Fc;

import Cd.i0;
import Cd.q0;
import Cd.u0;
import Fc.F;
import Lc.InterfaceC1177e;
import Lc.InterfaceC1180h;
import Lc.e0;
import Lc.f0;
import fc.C4029l;
import fc.C4032o;
import fc.C4033p;
import fc.EnumC4031n;
import fc.InterfaceC4028k;
import gc.C4179C;
import gc.C4204q;
import gc.C4206t;
import gc.C4207u;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import kotlin.jvm.internal.InterfaceC4863u;
import uc.AbstractC6017a;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class A implements InterfaceC4863u {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ Cc.l[] f3818e = {kotlin.jvm.internal.M.g(new kotlin.jvm.internal.E(kotlin.jvm.internal.M.b(A.class), "classifier", "getClassifier()Lkotlin/reflect/KClassifier;")), kotlin.jvm.internal.M.g(new kotlin.jvm.internal.E(kotlin.jvm.internal.M.b(A.class), "arguments", "getArguments()Ljava/util/List;"))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Cd.E f3819a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final F.a f3820b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final F.a f3821c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final F.a f3822d;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends kotlin.jvm.internal.v implements InterfaceC6082a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC6082a f3824b;

        /* JADX INFO: renamed from: Fc.A$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class C0056a extends kotlin.jvm.internal.v implements InterfaceC6082a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ A f3825a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ int f3826b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ InterfaceC4028k f3827c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0056a(A a10, int i10, InterfaceC4028k interfaceC4028k) {
                super(0);
                this.f3825a = a10;
                this.f3826b = i10;
                this.f3827c = interfaceC4028k;
            }

            @Override // vc.InterfaceC6082a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Type invoke() {
                Type typeC = this.f3825a.c();
                if (typeC instanceof Class) {
                    Class cls = (Class) typeC;
                    Class componentType = cls.isArray() ? cls.getComponentType() : Object.class;
                    AbstractC4862t.d(componentType, "{\n                      …                        }");
                    return componentType;
                }
                if (typeC instanceof GenericArrayType) {
                    if (this.f3826b == 0) {
                        Type genericComponentType = ((GenericArrayType) typeC).getGenericComponentType();
                        AbstractC4862t.d(genericComponentType, "{\n                      …                        }");
                        return genericComponentType;
                    }
                    throw new D("Array type has been queried for a non-0th argument: " + this.f3825a);
                }
                if (!(typeC instanceof ParameterizedType)) {
                    throw new D("Non-generic type has been queried for arguments: " + this.f3825a);
                }
                Type type = (Type) a.c(this.f3827c).get(this.f3826b);
                if (type instanceof WildcardType) {
                    WildcardType wildcardType = (WildcardType) type;
                    Type[] lowerBounds = wildcardType.getLowerBounds();
                    AbstractC4862t.d(lowerBounds, "argument.lowerBounds");
                    Type type2 = (Type) C4204q.V(lowerBounds);
                    if (type2 == null) {
                        Type[] upperBounds = wildcardType.getUpperBounds();
                        AbstractC4862t.d(upperBounds, "argument.upperBounds");
                        type = (Type) C4204q.U(upperBounds);
                    } else {
                        type = type2;
                    }
                }
                AbstractC4862t.d(type, "{\n                      …                        }");
                return type;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public /* synthetic */ class b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f3828a;

            static {
                int[] iArr = new int[u0.values().length];
                try {
                    iArr[u0.INVARIANT.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[u0.IN_VARIANCE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[u0.OUT_VARIANCE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f3828a = iArr;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class c extends kotlin.jvm.internal.v implements InterfaceC6082a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ A f3829a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(A a10) {
                super(0);
                this.f3829a = a10;
            }

            @Override // vc.InterfaceC6082a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final List invoke() {
                Type typeC = this.f3829a.c();
                AbstractC4862t.b(typeC);
                return Rc.d.d(typeC);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC6082a interfaceC6082a) {
            super(0);
            this.f3824b = interfaceC6082a;
        }

        public static final List c(InterfaceC4028k interfaceC4028k) {
            return (List) interfaceC4028k.getValue();
        }

        @Override // vc.InterfaceC6082a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final List invoke() {
            Cc.r rVarD;
            List listL0 = A.this.m().L0();
            if (listL0.isEmpty()) {
                return C4206t.k();
            }
            InterfaceC4028k interfaceC4028kA = C4029l.a(EnumC4031n.PUBLICATION, new c(A.this));
            InterfaceC6082a interfaceC6082a = this.f3824b;
            A a10 = A.this;
            ArrayList arrayList = new ArrayList(C4207u.v(listL0, 10));
            int i10 = 0;
            for (Object obj : listL0) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    C4206t.u();
                }
                i0 i0Var = (i0) obj;
                if (i0Var.a()) {
                    rVarD = Cc.r.f1238c.c();
                } else {
                    Cd.E type = i0Var.getType();
                    AbstractC4862t.d(type, "typeProjection.type");
                    A a11 = new A(type, interfaceC6082a == null ? null : new C0056a(a10, i10, interfaceC4028kA));
                    int i12 = b.f3828a[i0Var.b().ordinal()];
                    if (i12 == 1) {
                        rVarD = Cc.r.f1238c.d(a11);
                    } else if (i12 == 2) {
                        rVarD = Cc.r.f1238c.a(a11);
                    } else {
                        if (i12 != 3) {
                            throw new C4032o();
                        }
                        rVarD = Cc.r.f1238c.b(a11);
                    }
                }
                arrayList.add(rVarD);
                i10 = i11;
            }
            return arrayList;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends kotlin.jvm.internal.v implements InterfaceC6082a {
        public b() {
            super(0);
        }

        @Override // vc.InterfaceC6082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Cc.f invoke() {
            A a10 = A.this;
            return a10.i(a10.m());
        }
    }

    public A(Cd.E type, InterfaceC6082a interfaceC6082a) {
        AbstractC4862t.e(type, "type");
        this.f3819a = type;
        F.a aVarD = null;
        F.a aVar = interfaceC6082a instanceof F.a ? (F.a) interfaceC6082a : null;
        if (aVar != null) {
            aVarD = aVar;
        } else if (interfaceC6082a != null) {
            aVarD = F.d(interfaceC6082a);
        }
        this.f3820b = aVarD;
        this.f3821c = F.d(new b());
        this.f3822d = F.d(new a(interfaceC6082a));
    }

    @Override // Cc.p
    public Cc.f a() {
        return (Cc.f) this.f3821c.b(this, f3818e[0]);
    }

    @Override // Cc.p
    public List b() {
        Object objB = this.f3822d.b(this, f3818e[1]);
        AbstractC4862t.d(objB, "<get-arguments>(...)");
        return (List) objB;
    }

    @Override // kotlin.jvm.internal.InterfaceC4863u
    public Type c() {
        F.a aVar = this.f3820b;
        if (aVar != null) {
            return (Type) aVar.invoke();
        }
        return null;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof A)) {
            return false;
        }
        A a10 = (A) obj;
        return AbstractC4862t.a(this.f3819a, a10.f3819a) && AbstractC4862t.a(a(), a10.a()) && AbstractC4862t.a(b(), a10.b());
    }

    public int hashCode() {
        int iHashCode = this.f3819a.hashCode() * 31;
        Cc.f fVarA = a();
        return ((iHashCode + (fVarA != null ? fVarA.hashCode() : 0)) * 31) + b().hashCode();
    }

    public final Cc.f i(Cd.E e10) {
        Cd.E type;
        InterfaceC1180h interfaceC1180hQ = e10.N0().q();
        if (!(interfaceC1180hQ instanceof InterfaceC1177e)) {
            if (interfaceC1180hQ instanceof f0) {
                return new B(null, (f0) interfaceC1180hQ);
            }
            if (!(interfaceC1180hQ instanceof e0)) {
                return null;
            }
            throw new C4033p("An operation is not implemented: Type alias classifiers are not yet supported");
        }
        Class clsP = L.p((InterfaceC1177e) interfaceC1180hQ);
        if (clsP == null) {
            return null;
        }
        if (!clsP.isArray()) {
            if (q0.l(e10)) {
                return new C0836k(clsP);
            }
            Class clsE = Rc.d.e(clsP);
            if (clsE != null) {
                clsP = clsE;
            }
            return new C0836k(clsP);
        }
        i0 i0Var = (i0) C4179C.H0(e10.L0());
        if (i0Var == null || (type = i0Var.getType()) == null) {
            return new C0836k(clsP);
        }
        Cc.f fVarI = i(type);
        if (fVarI != null) {
            return new C0836k(L.f(AbstractC6017a.b(Ec.b.a(fVarI))));
        }
        throw new D("Cannot determine classifier for array element type: " + this);
    }

    public final Cd.E m() {
        return this.f3819a;
    }

    public String toString() {
        return H.f3843a.h(this.f3819a);
    }

    public /* synthetic */ A(Cd.E e10, InterfaceC6082a interfaceC6082a, int i10, AbstractC4854k abstractC4854k) {
        this(e10, (i10 & 2) != 0 ? null : interfaceC6082a);
    }
}
