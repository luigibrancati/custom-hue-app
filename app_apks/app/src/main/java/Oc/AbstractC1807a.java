package Oc;

import Cd.l0;
import Cd.n0;
import Cd.q0;
import Lc.InterfaceC1177e;
import Lc.InterfaceC1180h;
import Lc.InterfaceC1187o;
import Lc.X;
import Lc.e0;
import java.util.Collections;
import java.util.List;
import od.AbstractC5283e;
import sd.AbstractC5823c;
import vc.InterfaceC6082a;
import vd.C6097f;
import vd.C6104m;
import vd.InterfaceC6099h;

/* JADX INFO: renamed from: Oc.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC1807a extends t {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kd.f f12229b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Bd.i f12230c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Bd.i f12231d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Bd.i f12232e;

    /* JADX INFO: renamed from: Oc.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class C0160a implements InterfaceC6082a {

        /* JADX INFO: renamed from: Oc.a$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public class C0161a implements vc.l {
            public C0161a() {
            }

            @Override // vc.l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Cd.M invoke(Dd.g gVar) {
                InterfaceC1180h interfaceC1180hF = gVar.f(AbstractC1807a.this);
                return interfaceC1180hF == null ? (Cd.M) AbstractC1807a.this.f12230c.invoke() : interfaceC1180hF instanceof e0 ? Cd.F.b((e0) interfaceC1180hF, q0.g(interfaceC1180hF.k().getParameters())) : interfaceC1180hF instanceof t ? q0.u(interfaceC1180hF.k().p(gVar), ((t) interfaceC1180hF).D0(gVar), this) : interfaceC1180hF.p();
            }
        }

        public C0160a() {
        }

        @Override // vc.InterfaceC6082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Cd.M invoke() {
            AbstractC1807a abstractC1807a = AbstractC1807a.this;
            return q0.v(abstractC1807a, abstractC1807a.U(), new C0161a());
        }
    }

    /* JADX INFO: renamed from: Oc.a$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class b implements InterfaceC6082a {
        public b() {
        }

        @Override // vc.InterfaceC6082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public InterfaceC6099h invoke() {
            return new C6097f(AbstractC1807a.this.U());
        }
    }

    /* JADX INFO: renamed from: Oc.a$c */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class c implements InterfaceC6082a {
        public c() {
        }

        @Override // vc.InterfaceC6082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public X invoke() {
            return new q(AbstractC1807a.this);
        }
    }

    public AbstractC1807a(Bd.n nVar, kd.f fVar) {
        if (nVar == null) {
            E0(0);
        }
        if (fVar == null) {
            E0(1);
        }
        this.f12229b = fVar;
        this.f12230c = nVar.f(new C0160a());
        this.f12231d = nVar.f(new b());
        this.f12232e = nVar.f(new c());
    }

    private static /* synthetic */ void E0(int i10) {
        String str = (i10 == 2 || i10 == 3 || i10 == 4 || i10 == 5 || i10 == 6 || i10 == 9 || i10 == 12 || i10 == 14 || i10 == 16 || i10 == 17 || i10 == 19 || i10 == 20) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 2 || i10 == 3 || i10 == 4 || i10 == 5 || i10 == 6 || i10 == 9 || i10 == 12 || i10 == 14 || i10 == 16 || i10 == 17 || i10 == 19 || i10 == 20) ? 2 : 3];
        switch (i10) {
            case 1:
                objArr[0] = "name";
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            case 17:
            case 19:
            case 20:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractClassDescriptor";
                break;
            case 7:
            case 13:
                objArr[0] = "typeArguments";
                break;
            case 8:
            case 11:
                objArr[0] = "kotlinTypeRefiner";
                break;
            case 10:
            case 15:
                objArr[0] = "typeSubstitution";
                break;
            case 18:
                objArr[0] = "substitutor";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        if (i10 == 2) {
            objArr[1] = "getName";
        } else if (i10 == 3) {
            objArr[1] = "getOriginal";
        } else if (i10 == 4) {
            objArr[1] = "getUnsubstitutedInnerClassesScope";
        } else if (i10 == 5) {
            objArr[1] = "getThisAsReceiverParameter";
        } else if (i10 == 6) {
            objArr[1] = "getContextReceivers";
        } else if (i10 == 9 || i10 == 12 || i10 == 14 || i10 == 16) {
            objArr[1] = "getMemberScope";
        } else if (i10 == 17) {
            objArr[1] = "getUnsubstitutedMemberScope";
        } else if (i10 == 19) {
            objArr[1] = "substitute";
        } else if (i10 != 20) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractClassDescriptor";
        } else {
            objArr[1] = "getDefaultType";
        }
        switch (i10) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            case 17:
            case 19:
            case 20:
                break;
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
                objArr[2] = "getMemberScope";
                break;
            case 18:
                objArr[2] = "substitute";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i10 != 2 && i10 != 3 && i10 != 4 && i10 != 5 && i10 != 6 && i10 != 9 && i10 != 12 && i10 != 14 && i10 != 16 && i10 != 17 && i10 != 19 && i10 != 20) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // Lc.c0
    /* JADX INFO: renamed from: G0 */
    public InterfaceC1177e c(n0 n0Var) {
        if (n0Var == null) {
            E0(18);
        }
        return n0Var.k() ? this : new s(this, n0Var);
    }

    @Override // Lc.InterfaceC1177e
    public InterfaceC6099h H(l0 l0Var) {
        if (l0Var == null) {
            E0(15);
        }
        InterfaceC6099h interfaceC6099hG0 = g0(l0Var, AbstractC5823c.o(AbstractC5283e.g(this)));
        if (interfaceC6099hG0 == null) {
            E0(16);
        }
        return interfaceC6099hG0;
    }

    @Override // Lc.InterfaceC1177e
    public X J0() {
        X x10 = (X) this.f12232e.invoke();
        if (x10 == null) {
            E0(5);
        }
        return x10;
    }

    @Override // Lc.InterfaceC1177e
    public InterfaceC6099h R() {
        InterfaceC6099h interfaceC6099h = (InterfaceC6099h) this.f12231d.invoke();
        if (interfaceC6099h == null) {
            E0(4);
        }
        return interfaceC6099h;
    }

    @Override // Lc.InterfaceC1177e
    public InterfaceC6099h U() {
        InterfaceC6099h interfaceC6099hD0 = D0(AbstractC5823c.o(AbstractC5283e.g(this)));
        if (interfaceC6099hD0 == null) {
            E0(17);
        }
        return interfaceC6099hD0;
    }

    @Override // Lc.InterfaceC1177e
    public List X() {
        List list = Collections.EMPTY_LIST;
        if (list == null) {
            E0(6);
        }
        return list;
    }

    @Override // Oc.t
    public InterfaceC6099h g0(l0 l0Var, Dd.g gVar) {
        if (l0Var == null) {
            E0(10);
        }
        if (gVar == null) {
            E0(11);
        }
        if (!l0Var.f()) {
            return new C6104m(D0(gVar), n0.g(l0Var));
        }
        InterfaceC6099h interfaceC6099hD0 = D0(gVar);
        if (interfaceC6099hD0 == null) {
            E0(12);
        }
        return interfaceC6099hD0;
    }

    @Override // Lc.I
    public kd.f getName() {
        kd.f fVar = this.f12229b;
        if (fVar == null) {
            E0(2);
        }
        return fVar;
    }

    @Override // Lc.InterfaceC1185m
    public Object j0(InterfaceC1187o interfaceC1187o, Object obj) {
        return interfaceC1187o.e(this, obj);
    }

    @Override // Lc.InterfaceC1177e, Lc.InterfaceC1180h
    public Cd.M p() {
        Cd.M m10 = (Cd.M) this.f12230c.invoke();
        if (m10 == null) {
            E0(20);
        }
        return m10;
    }

    @Override // Oc.t, Lc.InterfaceC1185m
    public InterfaceC1177e a() {
        return this;
    }
}
