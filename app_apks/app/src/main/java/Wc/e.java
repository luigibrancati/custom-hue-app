package Wc;

import Cd.E;
import Jd.p;
import Lc.AbstractC1192u;
import Lc.D;
import Lc.InterfaceC1173a;
import Lc.InterfaceC1174b;
import Lc.InterfaceC1185m;
import Lc.InterfaceC1196y;
import Lc.X;
import Lc.Z;
import Lc.a0;
import Oc.G;
import fc.C4034q;
import io.sentry.protocol.ViewHierarchyNode;
import java.util.List;
import java.util.Map;
import od.AbstractC5282d;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class e extends G implements Wc.a {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static final InterfaceC1173a.InterfaceC0132a f17888G = new a();

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public static final InterfaceC1173a.InterfaceC0132a f17889H = new b();

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public c f17890E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final boolean f17891F;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class a implements InterfaceC1173a.InterfaceC0132a {
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class b implements InterfaceC1173a.InterfaceC0132a {
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public enum c {
        NON_STABLE_DECLARED(false, false),
        STABLE_DECLARED(true, false),
        NON_STABLE_SYNTHESIZED(false, true),
        STABLE_SYNTHESIZED(true, true);

        public final boolean isStable;
        public final boolean isSynthesized;

        c(boolean z10, boolean z11) {
            this.isStable = z10;
            this.isSynthesized = z11;
        }

        public static /* synthetic */ void a(int i10) {
            throw new IllegalStateException(String.format("@NotNull method %s.%s must not return null", "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaMethodDescriptor$ParameterNamesStatus", "get"));
        }

        public static c b(boolean z10, boolean z11) {
            c cVar = z10 ? z11 ? STABLE_SYNTHESIZED : STABLE_DECLARED : z11 ? NON_STABLE_SYNTHESIZED : NON_STABLE_DECLARED;
            if (cVar == null) {
                a(0);
            }
            return cVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(InterfaceC1185m interfaceC1185m, Z z10, Mc.g gVar, kd.f fVar, InterfaceC1174b.a aVar, a0 a0Var, boolean z11) {
        super(interfaceC1185m, z10, gVar, fVar, aVar, a0Var);
        if (interfaceC1185m == null) {
            g0(0);
        }
        if (gVar == null) {
            g0(1);
        }
        if (fVar == null) {
            g0(2);
        }
        if (aVar == null) {
            g0(3);
        }
        if (a0Var == null) {
            g0(4);
        }
        this.f17890E = null;
        this.f17891F = z11;
    }

    private static /* synthetic */ void g0(int i10) {
        String str = (i10 == 13 || i10 == 18 || i10 == 21) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 13 || i10 == 18 || i10 == 21) ? 2 : 3];
        switch (i10) {
            case 1:
            case 6:
            case 16:
                objArr[0] = "annotations";
                break;
            case 2:
            case 7:
                objArr[0] = "name";
                break;
            case 3:
            case 15:
                objArr[0] = "kind";
                break;
            case 4:
            case 8:
            case 17:
                objArr[0] = "source";
                break;
            case 5:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 9:
                objArr[0] = "contextReceiverParameters";
                break;
            case 10:
                objArr[0] = "typeParameters";
                break;
            case 11:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 12:
                objArr[0] = ViewHierarchyNode.JsonKeys.VISIBILITY;
                break;
            case 13:
            case 18:
            case 21:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaMethodDescriptor";
                break;
            case 14:
                objArr[0] = "newOwner";
                break;
            case 19:
                objArr[0] = "enhancedValueParameterTypes";
                break;
            case 20:
                objArr[0] = "enhancedReturnType";
                break;
        }
        if (i10 == 13) {
            objArr[1] = "initialize";
        } else if (i10 == 18) {
            objArr[1] = "createSubstitutedCopy";
        } else if (i10 != 21) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaMethodDescriptor";
        } else {
            objArr[1] = "enhance";
        }
        switch (i10) {
            case 5:
            case 6:
            case 7:
            case 8:
                objArr[2] = "createJavaMethod";
                break;
            case 9:
            case 10:
            case 11:
            case 12:
                objArr[2] = "initialize";
                break;
            case 13:
            case 18:
            case 21:
                break;
            case 14:
            case 15:
            case 16:
            case 17:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 19:
            case 20:
                objArr[2] = "enhance";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i10 != 13 && i10 != 18 && i10 != 21) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public static e p1(InterfaceC1185m interfaceC1185m, Mc.g gVar, kd.f fVar, a0 a0Var, boolean z10) {
        if (interfaceC1185m == null) {
            g0(5);
        }
        if (gVar == null) {
            g0(6);
        }
        if (fVar == null) {
            g0(7);
        }
        if (a0Var == null) {
            g0(8);
        }
        return new e(interfaceC1185m, null, gVar, fVar, InterfaceC1174b.a.DECLARATION, a0Var, z10);
    }

    @Override // Oc.p
    public boolean Q0() {
        return this.f17890E.isStable;
    }

    @Override // Oc.p, Lc.InterfaceC1173a
    public boolean f0() {
        return this.f17890E.isSynthesized;
    }

    @Override // Oc.G
    public G o1(X x10, X x11, List list, List list2, List list3, E e10, D d10, AbstractC1192u abstractC1192u, Map map) {
        if (list == null) {
            g0(9);
        }
        if (list2 == null) {
            g0(10);
        }
        if (list3 == null) {
            g0(11);
        }
        if (abstractC1192u == null) {
            g0(12);
        }
        G gO1 = super.o1(x10, x11, list, list2, list3, e10, d10, abstractC1192u, map);
        f1(p.f6427a.a(gO1).a());
        if (gO1 == null) {
            g0(13);
        }
        return gO1;
    }

    @Override // Oc.G, Oc.p
    /* JADX INFO: renamed from: q1, reason: merged with bridge method [inline-methods] */
    public e L0(InterfaceC1185m interfaceC1185m, InterfaceC1196y interfaceC1196y, InterfaceC1174b.a aVar, kd.f fVar, Mc.g gVar, a0 a0Var) {
        if (interfaceC1185m == null) {
            g0(14);
        }
        if (aVar == null) {
            g0(15);
        }
        if (gVar == null) {
            g0(16);
        }
        if (a0Var == null) {
            g0(17);
        }
        Z z10 = (Z) interfaceC1196y;
        if (fVar == null) {
            fVar = getName();
        }
        e eVar = new e(interfaceC1185m, z10, gVar, fVar, aVar, a0Var, this.f17891F);
        eVar.s1(Q0(), f0());
        return eVar;
    }

    @Override // Wc.a
    /* JADX INFO: renamed from: r1, reason: merged with bridge method [inline-methods] */
    public e W(E e10, List list, E e11, C4034q c4034q) {
        if (list == null) {
            g0(19);
        }
        if (e11 == null) {
            g0(20);
        }
        e eVar = (e) u().c(h.a(list, i(), this)).h(e11).i(e10 == null ? null : AbstractC5282d.i(this, e10, Mc.g.f9435K.b())).a().o().build();
        if (c4034q != null) {
            eVar.U0((InterfaceC1173a.InterfaceC0132a) c4034q.e(), c4034q.f());
        }
        if (eVar == null) {
            g0(21);
        }
        return eVar;
    }

    public void s1(boolean z10, boolean z11) {
        this.f17890E = c.b(z10, z11);
    }
}
