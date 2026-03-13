package Oc;

import Cd.Q;
import Cd.n0;
import Cd.u0;
import Lc.AbstractC1192u;
import Lc.InterfaceC1174b;
import Lc.InterfaceC1176d;
import Lc.InterfaceC1177e;
import Lc.InterfaceC1185m;
import Lc.InterfaceC1196y;
import Lc.X;
import Lc.a0;
import Lc.e0;
import gc.C4206t;
import gc.C4207u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import od.AbstractC5282d;
import vc.InterfaceC6082a;
import wd.InterfaceC6194f;
import wd.InterfaceC6195g;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class J extends p implements I {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final Bd.n f12207E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final e0 f12208F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final Bd.j f12209G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public InterfaceC1176d f12210H;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public static final /* synthetic */ Cc.l[] f12206J = {kotlin.jvm.internal.M.g(new kotlin.jvm.internal.E(kotlin.jvm.internal.M.b(J.class), "withDispatchReceiver", "getWithDispatchReceiver()Lorg/jetbrains/kotlin/descriptors/impl/TypeAliasConstructorDescriptor;"))};

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public static final a f12205I = new a(null);

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public final I b(Bd.n storageManager, e0 typeAliasDescriptor, InterfaceC1176d constructor) {
            InterfaceC1176d interfaceC1176dC;
            List listK;
            AbstractC4862t.e(storageManager, "storageManager");
            AbstractC4862t.e(typeAliasDescriptor, "typeAliasDescriptor");
            AbstractC4862t.e(constructor, "constructor");
            n0 n0VarC = c(typeAliasDescriptor);
            if (n0VarC == null || (interfaceC1176dC = constructor.c(n0VarC)) == null) {
                return null;
            }
            Mc.g annotations = constructor.getAnnotations();
            InterfaceC1174b.a aVarF = constructor.f();
            AbstractC4862t.d(aVarF, "constructor.kind");
            a0 a0VarJ = typeAliasDescriptor.j();
            AbstractC4862t.d(a0VarJ, "typeAliasDescriptor.source");
            J j10 = new J(storageManager, typeAliasDescriptor, interfaceC1176dC, null, annotations, aVarF, a0VarJ, null);
            List listO0 = p.O0(j10, constructor.i(), n0VarC);
            if (listO0 == null) {
                return null;
            }
            Cd.M mC = Cd.B.c(interfaceC1176dC.getReturnType().Q0());
            Cd.M mP = typeAliasDescriptor.p();
            AbstractC4862t.d(mP, "typeAliasDescriptor.defaultType");
            Cd.M mJ = Q.j(mC, mP);
            X xJ = constructor.J();
            X xI = xJ != null ? AbstractC5282d.i(j10, n0VarC.n(xJ.getType(), u0.INVARIANT), Mc.g.f9435K.b()) : null;
            InterfaceC1177e interfaceC1177eS = typeAliasDescriptor.s();
            if (interfaceC1177eS != null) {
                List<X> listU0 = constructor.u0();
                AbstractC4862t.d(listU0, "constructor.contextReceiverParameters");
                listK = new ArrayList(C4207u.v(listU0, 10));
                for (X x10 : listU0) {
                    Cd.E eN = n0VarC.n(x10.getType(), u0.INVARIANT);
                    InterfaceC6195g value = x10.getValue();
                    AbstractC4862t.c(value, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.scopes.receivers.ImplicitContextReceiver");
                    listK.add(AbstractC5282d.c(interfaceC1177eS, eN, ((InterfaceC6194f) value).a(), Mc.g.f9435K.b()));
                }
            } else {
                listK = C4206t.k();
            }
            j10.R0(xI, null, listK, typeAliasDescriptor.q(), listO0, mJ, Lc.D.FINAL, typeAliasDescriptor.getVisibility());
            return j10;
        }

        public final n0 c(e0 e0Var) {
            if (e0Var.s() == null) {
                return null;
            }
            return n0.f(e0Var.F());
        }

        public a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends kotlin.jvm.internal.v implements InterfaceC6082a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC1176d f12212b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC1176d interfaceC1176d) {
            super(0);
            this.f12212b = interfaceC1176d;
        }

        @Override // vc.InterfaceC6082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final J invoke() {
            Bd.n nVarK = J.this.K();
            e0 e0VarO1 = J.this.o1();
            InterfaceC1176d interfaceC1176d = this.f12212b;
            J j10 = J.this;
            Mc.g annotations = interfaceC1176d.getAnnotations();
            InterfaceC1174b.a aVarF = this.f12212b.f();
            AbstractC4862t.d(aVarF, "underlyingConstructorDescriptor.kind");
            a0 a0VarJ = J.this.o1().j();
            AbstractC4862t.d(a0VarJ, "typeAliasDescriptor.source");
            J j11 = new J(nVarK, e0VarO1, interfaceC1176d, j10, annotations, aVarF, a0VarJ, null);
            J j12 = J.this;
            InterfaceC1176d interfaceC1176d2 = this.f12212b;
            n0 n0VarC = J.f12205I.c(j12.o1());
            if (n0VarC == null) {
                return null;
            }
            X xJ = interfaceC1176d2.J();
            X xC = xJ != null ? xJ.c(n0VarC) : null;
            List listU0 = interfaceC1176d2.u0();
            AbstractC4862t.d(listU0, "underlyingConstructorDes…contextReceiverParameters");
            X x10 = xC;
            ArrayList arrayList = new ArrayList(C4207u.v(listU0, 10));
            Iterator it = listU0.iterator();
            while (it.hasNext()) {
                arrayList.add(((X) it.next()).c(n0VarC));
            }
            j11.R0(null, x10, arrayList, j12.o1().q(), j12.i(), j12.getReturnType(), Lc.D.FINAL, j12.o1().getVisibility());
            return j11;
        }
    }

    public /* synthetic */ J(Bd.n nVar, e0 e0Var, InterfaceC1176d interfaceC1176d, I i10, Mc.g gVar, InterfaceC1174b.a aVar, a0 a0Var, AbstractC4854k abstractC4854k) {
        this(nVar, e0Var, interfaceC1176d, i10, gVar, aVar, a0Var);
    }

    public final Bd.n K() {
        return this.f12207E;
    }

    @Override // Oc.I
    public InterfaceC1176d P() {
        return this.f12210H;
    }

    @Override // Lc.InterfaceC1184l
    public boolean b0() {
        return P().b0();
    }

    @Override // Lc.InterfaceC1184l
    public InterfaceC1177e c0() {
        InterfaceC1177e interfaceC1177eC0 = P().c0();
        AbstractC4862t.d(interfaceC1177eC0, "underlyingConstructorDescriptor.constructedClass");
        return interfaceC1177eC0;
    }

    @Override // Oc.p, Lc.InterfaceC1173a
    public Cd.E getReturnType() {
        Cd.E returnType = super.getReturnType();
        AbstractC4862t.b(returnType);
        return returnType;
    }

    @Override // Lc.InterfaceC1174b
    /* JADX INFO: renamed from: k1, reason: merged with bridge method [inline-methods] */
    public I H0(InterfaceC1185m newOwner, Lc.D modality, AbstractC1192u visibility, InterfaceC1174b.a kind, boolean z10) {
        AbstractC4862t.e(newOwner, "newOwner");
        AbstractC4862t.e(modality, "modality");
        AbstractC4862t.e(visibility, "visibility");
        AbstractC4862t.e(kind, "kind");
        InterfaceC1196y interfaceC1196yBuild = u().l(newOwner).b(modality).m(visibility).n(kind).q(z10).build();
        AbstractC4862t.c(interfaceC1196yBuild, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.impl.TypeAliasConstructorDescriptor");
        return (I) interfaceC1196yBuild;
    }

    @Override // Oc.p
    /* JADX INFO: renamed from: l1, reason: merged with bridge method [inline-methods] */
    public J L0(InterfaceC1185m newOwner, InterfaceC1196y interfaceC1196y, InterfaceC1174b.a kind, kd.f fVar, Mc.g annotations, a0 source) {
        AbstractC4862t.e(newOwner, "newOwner");
        AbstractC4862t.e(kind, "kind");
        AbstractC4862t.e(annotations, "annotations");
        AbstractC4862t.e(source, "source");
        InterfaceC1174b.a aVar = InterfaceC1174b.a.DECLARATION;
        if (kind != aVar) {
            InterfaceC1174b.a aVar2 = InterfaceC1174b.a.SYNTHESIZED;
        }
        return new J(this.f12207E, o1(), P(), this, annotations, aVar, source);
    }

    @Override // Oc.AbstractC1817k, Lc.InterfaceC1185m
    /* JADX INFO: renamed from: m1, reason: merged with bridge method [inline-methods] */
    public e0 b() {
        return o1();
    }

    @Override // Oc.p, Oc.AbstractC1817k, Oc.AbstractC1816j, Lc.InterfaceC1185m
    /* JADX INFO: renamed from: n1, reason: merged with bridge method [inline-methods] */
    public I a() {
        InterfaceC1196y interfaceC1196yA = super.a();
        AbstractC4862t.c(interfaceC1196yA, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.impl.TypeAliasConstructorDescriptor");
        return (I) interfaceC1196yA;
    }

    public e0 o1() {
        return this.f12208F;
    }

    @Override // Oc.p, Lc.InterfaceC1196y, Lc.c0
    /* JADX INFO: renamed from: p1, reason: merged with bridge method [inline-methods] */
    public I c(n0 substitutor) {
        AbstractC4862t.e(substitutor, "substitutor");
        InterfaceC1196y interfaceC1196yC = super.c(substitutor);
        AbstractC4862t.c(interfaceC1196yC, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.impl.TypeAliasConstructorDescriptorImpl");
        J j10 = (J) interfaceC1196yC;
        n0 n0VarF = n0.f(j10.getReturnType());
        AbstractC4862t.d(n0VarF, "create(substitutedTypeAliasConstructor.returnType)");
        InterfaceC1176d interfaceC1176dC = P().a().c(n0VarF);
        if (interfaceC1176dC == null) {
            return null;
        }
        j10.f12210H = interfaceC1176dC;
        return j10;
    }

    public J(Bd.n nVar, e0 e0Var, InterfaceC1176d interfaceC1176d, I i10, Mc.g gVar, InterfaceC1174b.a aVar, a0 a0Var) {
        super(e0Var, i10, gVar, kd.h.f39575j, aVar, a0Var);
        this.f12207E = nVar;
        this.f12208F = e0Var;
        V0(o1().V());
        this.f12209G = nVar.h(new b(interfaceC1176d));
        this.f12210H = interfaceC1176d;
    }
}
