package Oc;

import Cd.AbstractC0723f;
import Cd.a0;
import Cd.e0;
import Cd.u0;
import Lc.InterfaceC1180h;
import Lc.InterfaceC1185m;
import Lc.InterfaceC1187o;
import Lc.d0;
import Lc.f0;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import od.C5281c;
import sd.AbstractC5823c;
import vc.InterfaceC6082a;
import vd.C6098g;
import vd.C6105n;
import vd.InterfaceC6099h;

/* JADX INFO: renamed from: Oc.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC1811e extends AbstractC1817k implements f0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final u0 f12243e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f12244f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f12245g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Bd.i f12246h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Bd.i f12247i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Bd.n f12248j;

    /* JADX INFO: renamed from: Oc.e$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a implements InterfaceC6082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Bd.n f12249a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ d0 f12250b;

        public a(Bd.n nVar, d0 d0Var) {
            this.f12249a = nVar;
            this.f12250b = d0Var;
        }

        @Override // vc.InterfaceC6082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public e0 invoke() {
            return new c(AbstractC1811e.this, this.f12249a, this.f12250b);
        }
    }

    /* JADX INFO: renamed from: Oc.e$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class b implements InterfaceC6082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ kd.f f12252a;

        /* JADX INFO: renamed from: Oc.e$b$a */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public class a implements InterfaceC6082a {
            public a() {
            }

            @Override // vc.InterfaceC6082a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public InterfaceC6099h invoke() {
                return C6105n.j("Scope for type parameter " + b.this.f12252a.b(), AbstractC1811e.this.getUpperBounds());
            }
        }

        public b(kd.f fVar) {
            this.f12252a = fVar;
        }

        @Override // vc.InterfaceC6082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Cd.M invoke() {
            return Cd.F.k(a0.f1311b.h(), AbstractC1811e.this.k(), Collections.EMPTY_LIST, false, new C6098g(new a()));
        }
    }

    /* JADX INFO: renamed from: Oc.e$c */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class c extends AbstractC0723f {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final d0 f12255d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ AbstractC1811e f12256e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(AbstractC1811e abstractC1811e, Bd.n nVar, d0 d0Var) {
            super(nVar);
            if (nVar == null) {
                t(0);
            }
            this.f12256e = abstractC1811e;
            this.f12255d = d0Var;
        }

        private static /* synthetic */ void t(int i10) {
            String str = (i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4 || i10 == 5 || i10 == 8) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[(i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4 || i10 == 5 || i10 == 8) ? 2 : 3];
            switch (i10) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 8:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor$TypeParameterTypeConstructor";
                    break;
                case 6:
                    objArr[0] = "type";
                    break;
                case 7:
                    objArr[0] = "supertypes";
                    break;
                case 9:
                    objArr[0] = "classifier";
                    break;
                default:
                    objArr[0] = "storageManager";
                    break;
            }
            if (i10 == 1) {
                objArr[1] = "computeSupertypes";
            } else if (i10 == 2) {
                objArr[1] = "getParameters";
            } else if (i10 == 3) {
                objArr[1] = "getDeclarationDescriptor";
            } else if (i10 == 4) {
                objArr[1] = "getBuiltIns";
            } else if (i10 == 5) {
                objArr[1] = "getSupertypeLoopChecker";
            } else if (i10 != 8) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor$TypeParameterTypeConstructor";
            } else {
                objArr[1] = "processSupertypesWithoutCycles";
            }
            switch (i10) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 8:
                    break;
                case 6:
                    objArr[2] = "reportSupertypeLoopError";
                    break;
                case 7:
                    objArr[2] = "processSupertypesWithoutCycles";
                    break;
                case 9:
                    objArr[2] = "isSameClassifier";
                    break;
                default:
                    objArr[2] = "<init>";
                    break;
            }
            String str2 = String.format(str, objArr);
            if (i10 != 1 && i10 != 2 && i10 != 3 && i10 != 4 && i10 != 5 && i10 != 8) {
                throw new IllegalArgumentException(str2);
            }
            throw new IllegalStateException(str2);
        }

        @Override // Cd.AbstractC0729l
        public boolean c(InterfaceC1180h interfaceC1180h) {
            if (interfaceC1180h == null) {
                t(9);
            }
            return (interfaceC1180h instanceof f0) && C5281c.f41534a.h(this.f12256e, (f0) interfaceC1180h, true);
        }

        @Override // Cd.AbstractC0723f
        public Collection f() {
            List listL0 = this.f12256e.L0();
            if (listL0 == null) {
                t(1);
            }
            return listL0;
        }

        @Override // Cd.AbstractC0723f
        public Cd.E g() {
            return Ed.k.d(Ed.j.CYCLIC_UPPER_BOUNDS, new String[0]);
        }

        @Override // Cd.e0
        public List getParameters() {
            List list = Collections.EMPTY_LIST;
            if (list == null) {
                t(2);
            }
            return list;
        }

        @Override // Cd.AbstractC0723f
        public d0 j() {
            d0 d0Var = this.f12255d;
            if (d0Var == null) {
                t(5);
            }
            return d0Var;
        }

        @Override // Cd.AbstractC0723f
        public List l(List list) {
            if (list == null) {
                t(7);
            }
            List listG0 = this.f12256e.G0(list);
            if (listG0 == null) {
                t(8);
            }
            return listG0;
        }

        @Override // Cd.e0
        public Ic.g n() {
            Ic.g gVarJ = AbstractC5823c.j(this.f12256e);
            if (gVarJ == null) {
                t(4);
            }
            return gVarJ;
        }

        @Override // Cd.AbstractC0729l, Cd.e0
        public InterfaceC1180h q() {
            AbstractC1811e abstractC1811e = this.f12256e;
            if (abstractC1811e == null) {
                t(3);
            }
            return abstractC1811e;
        }

        @Override // Cd.e0
        public boolean r() {
            return true;
        }

        @Override // Cd.AbstractC0723f
        public void s(Cd.E e10) {
            if (e10 == null) {
                t(6);
            }
            this.f12256e.K0(e10);
        }

        public String toString() {
            return this.f12256e.getName().toString();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC1811e(Bd.n nVar, InterfaceC1185m interfaceC1185m, Mc.g gVar, kd.f fVar, u0 u0Var, boolean z10, int i10, Lc.a0 a0Var, d0 d0Var) {
        super(interfaceC1185m, gVar, fVar, a0Var);
        if (nVar == null) {
            g0(0);
        }
        if (interfaceC1185m == null) {
            g0(1);
        }
        if (gVar == null) {
            g0(2);
        }
        if (fVar == null) {
            g0(3);
        }
        if (u0Var == null) {
            g0(4);
        }
        if (a0Var == null) {
            g0(5);
        }
        if (d0Var == null) {
            g0(6);
        }
        this.f12243e = u0Var;
        this.f12244f = z10;
        this.f12245g = i10;
        this.f12246h = nVar.f(new a(nVar, d0Var));
        this.f12247i = nVar.f(new b(fVar));
        this.f12248j = nVar;
    }

    private static /* synthetic */ void g0(int i10) {
        String str;
        int i11;
        switch (i10) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 12:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i10) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                i11 = 2;
                break;
            case 12:
            default:
                i11 = 3;
                break;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
                objArr[0] = "containingDeclaration";
                break;
            case 2:
                objArr[0] = "annotations";
                break;
            case 3:
                objArr[0] = "name";
                break;
            case 4:
                objArr[0] = "variance";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
                objArr[0] = "supertypeLoopChecker";
                break;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor";
                break;
            case 12:
                objArr[0] = "bounds";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        switch (i10) {
            case 7:
                objArr[1] = "getVariance";
                break;
            case 8:
                objArr[1] = "getUpperBounds";
                break;
            case 9:
                objArr[1] = "getTypeConstructor";
                break;
            case 10:
                objArr[1] = "getDefaultType";
                break;
            case 11:
                objArr[1] = "getOriginal";
                break;
            case 12:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor";
                break;
            case 13:
                objArr[1] = "processBoundsWithoutCycles";
                break;
            case 14:
                objArr[1] = "getStorageManager";
                break;
        }
        switch (i10) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                break;
            case 12:
                objArr[2] = "processBoundsWithoutCycles";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i10) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                throw new IllegalStateException(str2);
            case 12:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    public List G0(List list) {
        if (list == null) {
            g0(12);
        }
        if (list == null) {
            g0(13);
        }
        return list;
    }

    @Override // Lc.f0
    public Bd.n K() {
        Bd.n nVar = this.f12248j;
        if (nVar == null) {
            g0(14);
        }
        return nVar;
    }

    public abstract void K0(Cd.E e10);

    public abstract List L0();

    @Override // Lc.f0
    public boolean O() {
        return false;
    }

    @Override // Lc.f0
    public int getIndex() {
        return this.f12245g;
    }

    @Override // Lc.f0
    public List getUpperBounds() {
        List listO = ((c) k()).o();
        if (listO == null) {
            g0(8);
        }
        return listO;
    }

    @Override // Lc.InterfaceC1185m
    public Object j0(InterfaceC1187o interfaceC1187o, Object obj) {
        return interfaceC1187o.a(this, obj);
    }

    @Override // Lc.f0, Lc.InterfaceC1180h
    public final e0 k() {
        e0 e0Var = (e0) this.f12246h.invoke();
        if (e0Var == null) {
            g0(9);
        }
        return e0Var;
    }

    @Override // Lc.f0
    public u0 m() {
        u0 u0Var = this.f12243e;
        if (u0Var == null) {
            g0(7);
        }
        return u0Var;
    }

    @Override // Lc.InterfaceC1180h
    public Cd.M p() {
        Cd.M m10 = (Cd.M) this.f12247i.invoke();
        if (m10 == null) {
            g0(10);
        }
        return m10;
    }

    @Override // Lc.f0
    public boolean w() {
        return this.f12244f;
    }

    @Override // Oc.AbstractC1817k, Oc.AbstractC1816j, Lc.InterfaceC1185m
    public f0 a() {
        f0 f0Var = (f0) super.a();
        if (f0Var == null) {
            g0(11);
        }
        return f0Var;
    }
}
