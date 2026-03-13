package Uc;

import Cd.M;
import Lc.InterfaceC1173a;
import Lc.InterfaceC1174b;
import Lc.InterfaceC1177e;
import Lc.InterfaceC1185m;
import Lc.T;
import Lc.U;
import Lc.Z;
import kotlin.jvm.internal.AbstractC4862t;
import od.AbstractC5283e;
import sd.AbstractC5823c;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class H {

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends kotlin.jvm.internal.v implements vc.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f16883a = new a();

        public a() {
            super(1);
        }

        @Override // vc.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(InterfaceC1174b it) {
            AbstractC4862t.e(it, "it");
            return Boolean.valueOf(C2307i.f16924a.b(AbstractC5823c.s(it)));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends kotlin.jvm.internal.v implements vc.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f16884a = new b();

        public b() {
            super(1);
        }

        @Override // vc.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(InterfaceC1174b it) {
            AbstractC4862t.e(it, "it");
            return Boolean.valueOf(C2303e.f16914n.j((Z) it));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class c extends kotlin.jvm.internal.v implements vc.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f16885a = new c();

        public c() {
            super(1);
        }

        @Override // vc.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(InterfaceC1174b it) {
            AbstractC4862t.e(it, "it");
            return Boolean.valueOf(Ic.g.f0(it) && C2304f.m(it) != null);
        }
    }

    public static final boolean a(InterfaceC1174b interfaceC1174b) {
        AbstractC4862t.e(interfaceC1174b, "<this>");
        return d(interfaceC1174b) != null;
    }

    public static final String b(InterfaceC1174b callableMemberDescriptor) {
        InterfaceC1174b interfaceC1174bS;
        kd.f fVarI;
        AbstractC4862t.e(callableMemberDescriptor, "callableMemberDescriptor");
        InterfaceC1174b interfaceC1174bC = c(callableMemberDescriptor);
        if (interfaceC1174bC != null && (interfaceC1174bS = AbstractC5823c.s(interfaceC1174bC)) != null) {
            if (interfaceC1174bS instanceof U) {
                return C2307i.f16924a.a(interfaceC1174bS);
            }
            if ((interfaceC1174bS instanceof Z) && (fVarI = C2303e.f16914n.i((Z) interfaceC1174bS)) != null) {
                return fVarI.b();
            }
        }
        return null;
    }

    public static final InterfaceC1174b c(InterfaceC1174b interfaceC1174b) {
        if (Ic.g.f0(interfaceC1174b)) {
            return d(interfaceC1174b);
        }
        return null;
    }

    public static final InterfaceC1174b d(InterfaceC1174b interfaceC1174b) {
        AbstractC4862t.e(interfaceC1174b, "<this>");
        if (!I.f16886a.g().contains(interfaceC1174b.getName()) && !C2305g.f16919a.d().contains(AbstractC5823c.s(interfaceC1174b).getName())) {
            return null;
        }
        if (interfaceC1174b instanceof U ? true : interfaceC1174b instanceof T) {
            return AbstractC5823c.f(interfaceC1174b, false, a.f16883a, 1, null);
        }
        if (interfaceC1174b instanceof Z) {
            return AbstractC5823c.f(interfaceC1174b, false, b.f16884a, 1, null);
        }
        return null;
    }

    public static final InterfaceC1174b e(InterfaceC1174b interfaceC1174b) {
        AbstractC4862t.e(interfaceC1174b, "<this>");
        InterfaceC1174b interfaceC1174bD = d(interfaceC1174b);
        if (interfaceC1174bD != null) {
            return interfaceC1174bD;
        }
        C2304f c2304f = C2304f.f16916n;
        kd.f name = interfaceC1174b.getName();
        AbstractC4862t.d(name, "name");
        if (c2304f.l(name)) {
            return AbstractC5823c.f(interfaceC1174b, false, c.f16885a, 1, null);
        }
        return null;
    }

    public static final boolean f(InterfaceC1177e interfaceC1177e, InterfaceC1173a specialCallableDescriptor) {
        AbstractC4862t.e(interfaceC1177e, "<this>");
        AbstractC4862t.e(specialCallableDescriptor, "specialCallableDescriptor");
        InterfaceC1185m interfaceC1185mB = specialCallableDescriptor.b();
        AbstractC4862t.c(interfaceC1185mB, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        M mP = ((InterfaceC1177e) interfaceC1185mB).p();
        AbstractC4862t.d(mP, "specialCallableDescripto…ssDescriptor).defaultType");
        for (InterfaceC1177e interfaceC1177eS = AbstractC5283e.s(interfaceC1177e); interfaceC1177eS != null; interfaceC1177eS = AbstractC5283e.s(interfaceC1177eS)) {
            if (!(interfaceC1177eS instanceof Wc.c) && Dd.s.b(interfaceC1177eS.p(), mP) != null) {
                return !Ic.g.f0(interfaceC1177eS);
            }
        }
        return false;
    }

    public static final boolean g(InterfaceC1174b interfaceC1174b) {
        AbstractC4862t.e(interfaceC1174b, "<this>");
        return AbstractC5823c.s(interfaceC1174b).b() instanceof Wc.c;
    }

    public static final boolean h(InterfaceC1174b interfaceC1174b) {
        AbstractC4862t.e(interfaceC1174b, "<this>");
        return g(interfaceC1174b) || Ic.g.f0(interfaceC1174b);
    }
}
