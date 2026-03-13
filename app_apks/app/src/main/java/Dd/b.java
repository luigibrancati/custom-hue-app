package Dd;

import Cd.AbstractC0741y;
import Cd.C0732o;
import Cd.D;
import Cd.E;
import Cd.F;
import Cd.G;
import Cd.J;
import Cd.L;
import Cd.P;
import Cd.d0;
import Cd.e0;
import Cd.i0;
import Cd.n0;
import Cd.o0;
import Cd.q0;
import Cd.t0;
import Cd.u0;
import Ic.j;
import Lc.C1197z;
import Lc.EnumC1178f;
import Lc.InterfaceC1177e;
import Lc.InterfaceC1180h;
import Lc.f0;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.AbstractC4862t;
import kotlin.jvm.internal.M;
import od.AbstractC5285g;
import pd.C5460a;
import sd.AbstractC5823c;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public interface b extends o0, Gd.r {

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {

        /* JADX INFO: renamed from: Dd.b$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class C0041a extends d0.c.a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ b f2662a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ n0 f2663b;

            public C0041a(b bVar, n0 n0Var) {
                this.f2662a = bVar;
                this.f2663b = n0Var;
            }

            @Override // Cd.d0.c
            public Gd.k a(d0 state, Gd.i type) {
                AbstractC4862t.e(state, "state");
                AbstractC4862t.e(type, "type");
                b bVar = this.f2662a;
                n0 n0Var = this.f2663b;
                Gd.i iVarO = bVar.o(type);
                AbstractC4862t.c(iVarO, "null cannot be cast to non-null type org.jetbrains.kotlin.types.KotlinType");
                E eN = n0Var.n((E) iVarO, u0.INVARIANT);
                AbstractC4862t.d(eN, "substitutor.safeSubstitu…VARIANT\n                )");
                Gd.k kVarE = bVar.e(eN);
                AbstractC4862t.b(kVarE);
                return kVarE;
            }
        }

        public static Gd.t A(b bVar, Gd.o receiver) {
            AbstractC4862t.e(receiver, "$receiver");
            if (receiver instanceof f0) {
                u0 u0VarM = ((f0) receiver).m();
                AbstractC4862t.d(u0VarM, "this.variance");
                return Gd.q.a(u0VarM);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + M.b(receiver.getClass())).toString());
        }

        public static boolean B(b bVar, Gd.i receiver, kd.c fqName) {
            AbstractC4862t.e(receiver, "$receiver");
            AbstractC4862t.e(fqName, "fqName");
            if (receiver instanceof E) {
                return ((E) receiver).getAnnotations().K(fqName);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + M.b(receiver.getClass())).toString());
        }

        public static boolean C(b bVar, Gd.o receiver, Gd.n nVar) {
            AbstractC4862t.e(receiver, "$receiver");
            if (!(receiver instanceof f0)) {
                throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + M.b(receiver.getClass())).toString());
            }
            if (nVar == null ? true : nVar instanceof e0) {
                return Hd.a.m((f0) receiver, (e0) nVar, null, 4, null);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + M.b(receiver.getClass())).toString());
        }

        public static boolean D(b bVar, Gd.k a10, Gd.k b10) {
            AbstractC4862t.e(a10, "a");
            AbstractC4862t.e(b10, "b");
            if (!(a10 instanceof Cd.M)) {
                throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + a10 + ", " + M.b(a10.getClass())).toString());
            }
            if (b10 instanceof Cd.M) {
                return ((Cd.M) a10).L0() == ((Cd.M) b10).L0();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + b10 + ", " + M.b(b10.getClass())).toString());
        }

        public static Gd.i E(b bVar, List types) {
            AbstractC4862t.e(types, "types");
            return d.a(types);
        }

        public static boolean F(b bVar, Gd.n receiver) {
            AbstractC4862t.e(receiver, "$receiver");
            if (receiver instanceof e0) {
                return Ic.g.v0((e0) receiver, j.a.f5783b);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + M.b(receiver.getClass())).toString());
        }

        public static boolean G(b bVar, Gd.n receiver) {
            AbstractC4862t.e(receiver, "$receiver");
            if (receiver instanceof e0) {
                return ((e0) receiver).q() instanceof InterfaceC1177e;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + M.b(receiver.getClass())).toString());
        }

        public static boolean H(b bVar, Gd.n receiver) {
            AbstractC4862t.e(receiver, "$receiver");
            if (receiver instanceof e0) {
                InterfaceC1180h interfaceC1180hQ = ((e0) receiver).q();
                InterfaceC1177e interfaceC1177e = interfaceC1180hQ instanceof InterfaceC1177e ? (InterfaceC1177e) interfaceC1180hQ : null;
                return (interfaceC1177e == null || !Lc.E.a(interfaceC1177e) || interfaceC1177e.f() == EnumC1178f.ENUM_ENTRY || interfaceC1177e.f() == EnumC1178f.ANNOTATION_CLASS) ? false : true;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + M.b(receiver.getClass())).toString());
        }

        public static boolean I(b bVar, Gd.n receiver) {
            AbstractC4862t.e(receiver, "$receiver");
            if (receiver instanceof e0) {
                return ((e0) receiver).r();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + M.b(receiver.getClass())).toString());
        }

        public static boolean J(b bVar, Gd.i receiver) {
            AbstractC4862t.e(receiver, "$receiver");
            if (receiver instanceof E) {
                return G.a((E) receiver);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + M.b(receiver.getClass())).toString());
        }

        public static boolean K(b bVar, Gd.n receiver) {
            AbstractC4862t.e(receiver, "$receiver");
            if (receiver instanceof e0) {
                InterfaceC1180h interfaceC1180hQ = ((e0) receiver).q();
                InterfaceC1177e interfaceC1177e = interfaceC1180hQ instanceof InterfaceC1177e ? (InterfaceC1177e) interfaceC1180hQ : null;
                return (interfaceC1177e != null ? interfaceC1177e.S() : null) instanceof C1197z;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + M.b(receiver.getClass())).toString());
        }

        public static boolean L(b bVar, Gd.n receiver) {
            AbstractC4862t.e(receiver, "$receiver");
            if (receiver instanceof e0) {
                return receiver instanceof qd.n;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + M.b(receiver.getClass())).toString());
        }

        public static boolean M(b bVar, Gd.n receiver) {
            AbstractC4862t.e(receiver, "$receiver");
            if (receiver instanceof e0) {
                return receiver instanceof D;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + M.b(receiver.getClass())).toString());
        }

        public static boolean N(b bVar, Gd.k receiver) {
            AbstractC4862t.e(receiver, "$receiver");
            if (receiver instanceof Cd.M) {
                return ((Cd.M) receiver).O0();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + M.b(receiver.getClass())).toString());
        }

        public static boolean O(b bVar, Gd.i receiver) {
            AbstractC4862t.e(receiver, "$receiver");
            return receiver instanceof J;
        }

        public static boolean P(b bVar, Gd.n receiver) {
            AbstractC4862t.e(receiver, "$receiver");
            if (receiver instanceof e0) {
                return Ic.g.v0((e0) receiver, j.a.f5785c);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + M.b(receiver.getClass())).toString());
        }

        public static boolean Q(b bVar, Gd.i receiver) {
            AbstractC4862t.e(receiver, "$receiver");
            if (receiver instanceof E) {
                return q0.l((E) receiver);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + M.b(receiver.getClass())).toString());
        }

        public static boolean R(b bVar, Gd.d receiver) {
            AbstractC4862t.e(receiver, "$receiver");
            return receiver instanceof C5460a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean S(b bVar, Gd.k receiver) {
            AbstractC4862t.e(receiver, "$receiver");
            if (receiver instanceof E) {
                return Ic.g.r0((E) receiver);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + M.b(receiver.getClass())).toString());
        }

        public static boolean T(b bVar, Gd.d receiver) {
            AbstractC4862t.e(receiver, "$receiver");
            if (receiver instanceof i) {
                return ((i) receiver).Z0();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + M.b(receiver.getClass())).toString());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean U(b bVar, Gd.k receiver) {
            AbstractC4862t.e(receiver, "$receiver");
            if (receiver instanceof Cd.M) {
                if (G.a((E) receiver)) {
                    return false;
                }
                Cd.M m10 = (Cd.M) receiver;
                if (m10.N0().q() instanceof Lc.e0) {
                    return false;
                }
                return m10.N0().q() != null || (receiver instanceof C5460a) || (receiver instanceof i) || (receiver instanceof C0732o) || (m10.N0() instanceof qd.n) || V(bVar, receiver);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + M.b(receiver.getClass())).toString());
        }

        public static boolean V(b bVar, Gd.k kVar) {
            return (kVar instanceof P) && bVar.g(((P) kVar).G0());
        }

        public static boolean W(b bVar, Gd.m receiver) {
            AbstractC4862t.e(receiver, "$receiver");
            if (receiver instanceof i0) {
                return ((i0) receiver).a();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + M.b(receiver.getClass())).toString());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean X(b bVar, Gd.k receiver) {
            AbstractC4862t.e(receiver, "$receiver");
            if (receiver instanceof Cd.M) {
                return Hd.a.n((E) receiver);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + M.b(receiver.getClass())).toString());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean Y(b bVar, Gd.k receiver) {
            AbstractC4862t.e(receiver, "$receiver");
            if (receiver instanceof Cd.M) {
                return Hd.a.o((E) receiver);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + M.b(receiver.getClass())).toString());
        }

        public static boolean Z(b bVar, Gd.i receiver) {
            AbstractC4862t.e(receiver, "$receiver");
            if (!(receiver instanceof t0)) {
                return false;
            }
            ((t0) receiver).N0();
            return false;
        }

        public static boolean a(b bVar, Gd.n c12, Gd.n c22) {
            AbstractC4862t.e(c12, "c1");
            AbstractC4862t.e(c22, "c2");
            if (!(c12 instanceof e0)) {
                throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + c12 + ", " + M.b(c12.getClass())).toString());
            }
            if (c22 instanceof e0) {
                return AbstractC4862t.a(c12, c22);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + c22 + ", " + M.b(c22.getClass())).toString());
        }

        public static boolean a0(b bVar, Gd.n receiver) {
            AbstractC4862t.e(receiver, "$receiver");
            if (receiver instanceof e0) {
                InterfaceC1180h interfaceC1180hQ = ((e0) receiver).q();
                return interfaceC1180hQ != null && Ic.g.A0(interfaceC1180hQ);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + M.b(receiver.getClass())).toString());
        }

        public static int b(b bVar, Gd.i receiver) {
            AbstractC4862t.e(receiver, "$receiver");
            if (receiver instanceof E) {
                return ((E) receiver).L0().size();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + M.b(receiver.getClass())).toString());
        }

        public static Gd.k b0(b bVar, Gd.g receiver) {
            AbstractC4862t.e(receiver, "$receiver");
            if (receiver instanceof AbstractC0741y) {
                return ((AbstractC0741y) receiver).V0();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + M.b(receiver.getClass())).toString());
        }

        public static Gd.l c(b bVar, Gd.k receiver) {
            AbstractC4862t.e(receiver, "$receiver");
            if (receiver instanceof Cd.M) {
                return (Gd.l) receiver;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + M.b(receiver.getClass())).toString());
        }

        public static Gd.i c0(b bVar, Gd.d receiver) {
            AbstractC4862t.e(receiver, "$receiver");
            if (receiver instanceof i) {
                return ((i) receiver).Y0();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + M.b(receiver.getClass())).toString());
        }

        public static Gd.d d(b bVar, Gd.k receiver) {
            AbstractC4862t.e(receiver, "$receiver");
            if (receiver instanceof Cd.M) {
                if (receiver instanceof P) {
                    return bVar.c(((P) receiver).G0());
                }
                if (receiver instanceof i) {
                    return (i) receiver;
                }
                return null;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + M.b(receiver.getClass())).toString());
        }

        public static Gd.i d0(b bVar, Gd.i receiver) {
            AbstractC4862t.e(receiver, "$receiver");
            if (receiver instanceof t0) {
                return c.b((t0) receiver);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + M.b(receiver.getClass())).toString());
        }

        public static Gd.e e(b bVar, Gd.k receiver) {
            AbstractC4862t.e(receiver, "$receiver");
            if (receiver instanceof Cd.M) {
                if (receiver instanceof C0732o) {
                    return (C0732o) receiver;
                }
                return null;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + M.b(receiver.getClass())).toString());
        }

        public static d0 e0(b bVar, boolean z10, boolean z11) {
            return Dd.a.b(z10, z11, bVar, null, null, 24, null);
        }

        public static Gd.f f(b bVar, Gd.g receiver) {
            AbstractC4862t.e(receiver, "$receiver");
            if (receiver instanceof AbstractC0741y) {
                return null;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + M.b(receiver.getClass())).toString());
        }

        public static Gd.k f0(b bVar, Gd.e receiver) {
            AbstractC4862t.e(receiver, "$receiver");
            if (receiver instanceof C0732o) {
                return ((C0732o) receiver).Z0();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + M.b(receiver.getClass())).toString());
        }

        public static Gd.g g(b bVar, Gd.i receiver) {
            AbstractC4862t.e(receiver, "$receiver");
            if (receiver instanceof E) {
                t0 t0VarQ0 = ((E) receiver).Q0();
                if (t0VarQ0 instanceof AbstractC0741y) {
                    return (AbstractC0741y) t0VarQ0;
                }
                return null;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + M.b(receiver.getClass())).toString());
        }

        public static int g0(b bVar, Gd.n receiver) {
            AbstractC4862t.e(receiver, "$receiver");
            if (receiver instanceof e0) {
                return ((e0) receiver).getParameters().size();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + M.b(receiver.getClass())).toString());
        }

        public static Gd.j h(b bVar, Gd.g receiver) {
            AbstractC4862t.e(receiver, "$receiver");
            if (receiver instanceof AbstractC0741y) {
                if (receiver instanceof L) {
                    return (L) receiver;
                }
                return null;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + M.b(receiver.getClass())).toString());
        }

        public static Collection h0(b bVar, Gd.k receiver) {
            AbstractC4862t.e(receiver, "$receiver");
            Gd.n nVarF = bVar.f(receiver);
            if (nVarF instanceof qd.n) {
                return ((qd.n) nVarF).e();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + M.b(receiver.getClass())).toString());
        }

        public static Gd.k i(b bVar, Gd.i receiver) {
            AbstractC4862t.e(receiver, "$receiver");
            if (receiver instanceof E) {
                t0 t0VarQ0 = ((E) receiver).Q0();
                if (t0VarQ0 instanceof Cd.M) {
                    return (Cd.M) t0VarQ0;
                }
                return null;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + M.b(receiver.getClass())).toString());
        }

        public static Gd.m i0(b bVar, Gd.c receiver) {
            AbstractC4862t.e(receiver, "$receiver");
            if (receiver instanceof j) {
                return ((j) receiver).E();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + M.b(receiver.getClass())).toString());
        }

        public static Gd.m j(b bVar, Gd.i receiver) {
            AbstractC4862t.e(receiver, "$receiver");
            if (receiver instanceof E) {
                return Hd.a.a((E) receiver);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + M.b(receiver.getClass())).toString());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static d0.c j0(b bVar, Gd.k type) {
            AbstractC4862t.e(type, "type");
            if (type instanceof Cd.M) {
                return new C0041a(bVar, Cd.f0.f1357c.a((E) type).c());
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + type + ", " + M.b(type.getClass())).toString());
        }

        public static Gd.k k(b bVar, Gd.k type, Gd.b status) {
            AbstractC4862t.e(type, "type");
            AbstractC4862t.e(status, "status");
            if (type instanceof Cd.M) {
                return k.b((Cd.M) type, status);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + type + ", " + M.b(type.getClass())).toString());
        }

        public static Collection k0(b bVar, Gd.n receiver) {
            AbstractC4862t.e(receiver, "$receiver");
            if (receiver instanceof e0) {
                Collection collectionO = ((e0) receiver).o();
                AbstractC4862t.d(collectionO, "this.supertypes");
                return collectionO;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + M.b(receiver.getClass())).toString());
        }

        public static Gd.b l(b bVar, Gd.d receiver) {
            AbstractC4862t.e(receiver, "$receiver");
            if (receiver instanceof i) {
                return ((i) receiver).W0();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + M.b(receiver.getClass())).toString());
        }

        public static Gd.c l0(b bVar, Gd.d receiver) {
            AbstractC4862t.e(receiver, "$receiver");
            if (receiver instanceof i) {
                return ((i) receiver).N0();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + M.b(receiver.getClass())).toString());
        }

        public static Gd.i m(b bVar, Gd.k lowerBound, Gd.k upperBound) {
            AbstractC4862t.e(lowerBound, "lowerBound");
            AbstractC4862t.e(upperBound, "upperBound");
            if (!(lowerBound instanceof Cd.M)) {
                throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + bVar + ", " + M.b(bVar.getClass())).toString());
            }
            if (upperBound instanceof Cd.M) {
                return F.d((Cd.M) lowerBound, (Cd.M) upperBound);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + bVar + ", " + M.b(bVar.getClass())).toString());
        }

        public static Gd.n m0(b bVar, Gd.k receiver) {
            AbstractC4862t.e(receiver, "$receiver");
            if (receiver instanceof Cd.M) {
                return ((Cd.M) receiver).N0();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + M.b(receiver.getClass())).toString());
        }

        public static Gd.m n(b bVar, Gd.i receiver, int i10) {
            AbstractC4862t.e(receiver, "$receiver");
            if (receiver instanceof E) {
                return (Gd.m) ((E) receiver).L0().get(i10);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + M.b(receiver.getClass())).toString());
        }

        public static Gd.k n0(b bVar, Gd.g receiver) {
            AbstractC4862t.e(receiver, "$receiver");
            if (receiver instanceof AbstractC0741y) {
                return ((AbstractC0741y) receiver).W0();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + M.b(receiver.getClass())).toString());
        }

        public static List o(b bVar, Gd.i receiver) {
            AbstractC4862t.e(receiver, "$receiver");
            if (receiver instanceof E) {
                return ((E) receiver).L0();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + M.b(receiver.getClass())).toString());
        }

        public static Gd.i o0(b bVar, Gd.i receiver, boolean z10) {
            AbstractC4862t.e(receiver, "$receiver");
            if (receiver instanceof Gd.k) {
                return bVar.a((Gd.k) receiver, z10);
            }
            if (!(receiver instanceof Gd.g)) {
                throw new IllegalStateException("sealed");
            }
            Gd.g gVar = (Gd.g) receiver;
            return bVar.L(bVar.a(bVar.d(gVar), z10), bVar.a(bVar.b(gVar), z10));
        }

        public static kd.d p(b bVar, Gd.n receiver) {
            AbstractC4862t.e(receiver, "$receiver");
            if (receiver instanceof e0) {
                InterfaceC1180h interfaceC1180hQ = ((e0) receiver).q();
                AbstractC4862t.c(interfaceC1180hQ, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                return AbstractC5823c.m((InterfaceC1177e) interfaceC1180hQ);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + M.b(receiver.getClass())).toString());
        }

        public static Gd.k p0(b bVar, Gd.k receiver, boolean z10) {
            AbstractC4862t.e(receiver, "$receiver");
            if (receiver instanceof Cd.M) {
                return ((Cd.M) receiver).R0(z10);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + M.b(receiver.getClass())).toString());
        }

        public static Gd.o q(b bVar, Gd.n receiver, int i10) {
            AbstractC4862t.e(receiver, "$receiver");
            if (receiver instanceof e0) {
                Object obj = ((e0) receiver).getParameters().get(i10);
                AbstractC4862t.d(obj, "this.parameters[index]");
                return (Gd.o) obj;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + M.b(receiver.getClass())).toString());
        }

        public static List r(b bVar, Gd.n receiver) {
            AbstractC4862t.e(receiver, "$receiver");
            if (receiver instanceof e0) {
                List parameters = ((e0) receiver).getParameters();
                AbstractC4862t.d(parameters, "this.parameters");
                return parameters;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + M.b(receiver.getClass())).toString());
        }

        public static Ic.h s(b bVar, Gd.n receiver) {
            AbstractC4862t.e(receiver, "$receiver");
            if (receiver instanceof e0) {
                InterfaceC1180h interfaceC1180hQ = ((e0) receiver).q();
                AbstractC4862t.c(interfaceC1180hQ, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                return Ic.g.P((InterfaceC1177e) interfaceC1180hQ);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + M.b(receiver.getClass())).toString());
        }

        public static Ic.h t(b bVar, Gd.n receiver) {
            AbstractC4862t.e(receiver, "$receiver");
            if (receiver instanceof e0) {
                InterfaceC1180h interfaceC1180hQ = ((e0) receiver).q();
                AbstractC4862t.c(interfaceC1180hQ, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                return Ic.g.S((InterfaceC1177e) interfaceC1180hQ);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + M.b(receiver.getClass())).toString());
        }

        public static Gd.i u(b bVar, Gd.o receiver) {
            AbstractC4862t.e(receiver, "$receiver");
            if (receiver instanceof f0) {
                return Hd.a.j((f0) receiver);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + M.b(receiver.getClass())).toString());
        }

        public static Gd.i v(b bVar, Gd.m receiver) {
            AbstractC4862t.e(receiver, "$receiver");
            if (receiver instanceof i0) {
                return ((i0) receiver).getType().Q0();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + M.b(receiver.getClass())).toString());
        }

        public static Gd.o w(b bVar, Gd.n receiver) {
            AbstractC4862t.e(receiver, "$receiver");
            if (receiver instanceof e0) {
                InterfaceC1180h interfaceC1180hQ = ((e0) receiver).q();
                if (interfaceC1180hQ instanceof f0) {
                    return (f0) interfaceC1180hQ;
                }
                return null;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + M.b(receiver.getClass())).toString());
        }

        public static Gd.i x(b bVar, Gd.i receiver) {
            AbstractC4862t.e(receiver, "$receiver");
            if (receiver instanceof E) {
                return AbstractC5285g.e((E) receiver);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + M.b(receiver.getClass())).toString());
        }

        public static List y(b bVar, Gd.o receiver) {
            AbstractC4862t.e(receiver, "$receiver");
            if (receiver instanceof f0) {
                List upperBounds = ((f0) receiver).getUpperBounds();
                AbstractC4862t.d(upperBounds, "this.upperBounds");
                return upperBounds;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + M.b(receiver.getClass())).toString());
        }

        public static Gd.t z(b bVar, Gd.m receiver) {
            AbstractC4862t.e(receiver, "$receiver");
            if (receiver instanceof i0) {
                u0 u0VarB = ((i0) receiver).b();
                AbstractC4862t.d(u0VarB, "this.projectionKind");
                return Gd.q.a(u0VarB);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + M.b(receiver.getClass())).toString());
        }
    }

    Gd.i L(Gd.k kVar, Gd.k kVar2);

    @Override // Gd.p
    Gd.k a(Gd.k kVar, boolean z10);

    @Override // Gd.p
    Gd.k b(Gd.g gVar);

    @Override // Gd.p
    Gd.d c(Gd.k kVar);

    @Override // Gd.p
    Gd.k d(Gd.g gVar);

    @Override // Gd.p
    Gd.k e(Gd.i iVar);

    @Override // Gd.p
    Gd.n f(Gd.k kVar);

    @Override // Gd.p
    boolean g(Gd.k kVar);
}
