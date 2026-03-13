package Fc;

import Cc.k;
import Fc.F;
import Lc.InterfaceC1174b;
import Lc.InterfaceC1177e;
import Lc.InterfaceC1185m;
import Lc.Q;
import Lc.X;
import Lc.j0;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.jvm.internal.AbstractC4862t;
import sd.AbstractC5823c;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class u implements Cc.k {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ Cc.l[] f4004f = {kotlin.jvm.internal.M.g(new kotlin.jvm.internal.E(kotlin.jvm.internal.M.b(u.class), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/ParameterDescriptor;")), kotlin.jvm.internal.M.g(new kotlin.jvm.internal.E(kotlin.jvm.internal.M.b(u.class), "annotations", "getAnnotations()Ljava/util/List;"))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC0835j f4005a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f4006b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k.a f4007c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final F.a f4008d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final F.a f4009e;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends kotlin.jvm.internal.v implements InterfaceC6082a {
        public a() {
            super(0);
        }

        @Override // vc.InterfaceC6082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List invoke() {
            return L.e(u.this.m());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends kotlin.jvm.internal.v implements InterfaceC6082a {
        public b() {
            super(0);
        }

        @Override // vc.InterfaceC6082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Type invoke() {
            Q qM = u.this.m();
            if (!(qM instanceof X) || !AbstractC4862t.a(L.i(u.this.i().y()), qM) || u.this.i().y().f() != InterfaceC1174b.a.FAKE_OVERRIDE) {
                return (Type) u.this.i().v().a().get(u.this.o());
            }
            InterfaceC1185m interfaceC1185mB = u.this.i().y().b();
            AbstractC4862t.c(interfaceC1185mB, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
            Class clsP = L.p((InterfaceC1177e) interfaceC1185mB);
            if (clsP != null) {
                return clsP;
            }
            throw new D("Cannot determine receiver Java type of inherited declaration: " + qM);
        }
    }

    public u(AbstractC0835j callable, int i10, k.a kind, InterfaceC6082a computeDescriptor) {
        AbstractC4862t.e(callable, "callable");
        AbstractC4862t.e(kind, "kind");
        AbstractC4862t.e(computeDescriptor, "computeDescriptor");
        this.f4005a = callable;
        this.f4006b = i10;
        this.f4007c = kind;
        this.f4008d = F.d(computeDescriptor);
        this.f4009e = F.d(new a());
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return AbstractC4862t.a(this.f4005a, uVar.f4005a) && o() == uVar.o();
    }

    @Override // Cc.k
    public k.a f() {
        return this.f4007c;
    }

    @Override // Cc.k
    public String getName() {
        Q qM = m();
        j0 j0Var = qM instanceof j0 ? (j0) qM : null;
        if (j0Var == null || j0Var.b().f0()) {
            return null;
        }
        kd.f name = j0Var.getName();
        AbstractC4862t.d(name, "valueParameter.name");
        if (name.u()) {
            return null;
        }
        return name.b();
    }

    @Override // Cc.k
    public Cc.p getType() {
        Cd.E type = m().getType();
        AbstractC4862t.d(type, "descriptor.type");
        return new A(type, new b());
    }

    public int hashCode() {
        return (this.f4005a.hashCode() * 31) + Integer.hashCode(o());
    }

    public final AbstractC0835j i() {
        return this.f4005a;
    }

    @Override // Cc.k
    public boolean k() {
        Q qM = m();
        return (qM instanceof j0) && ((j0) qM).s0() != null;
    }

    public final Q m() {
        Object objB = this.f4008d.b(this, f4004f[0]);
        AbstractC4862t.d(objB, "<get-descriptor>(...)");
        return (Q) objB;
    }

    @Override // Cc.k
    public boolean n() {
        Q qM = m();
        j0 j0Var = qM instanceof j0 ? (j0) qM : null;
        if (j0Var != null) {
            return AbstractC5823c.c(j0Var);
        }
        return false;
    }

    public int o() {
        return this.f4006b;
    }

    public String toString() {
        return H.f3843a.f(this);
    }
}
