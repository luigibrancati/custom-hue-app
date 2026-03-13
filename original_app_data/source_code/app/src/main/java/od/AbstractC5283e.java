package od;

import Cd.E;
import Cd.G;
import Cd.e0;
import Cd.q0;
import Lc.AbstractC1191t;
import Lc.AbstractC1192u;
import Lc.D;
import Lc.EnumC1178f;
import Lc.InterfaceC1173a;
import Lc.InterfaceC1174b;
import Lc.InterfaceC1177e;
import Lc.InterfaceC1180h;
import Lc.InterfaceC1185m;
import Lc.InterfaceC1188p;
import Lc.InterfaceC1189q;
import Lc.K;
import Lc.P;
import Lc.W;
import Lc.X;
import Lc.b0;
import Lc.k0;
import com.google.protobuf.DescriptorProtos$FileOptions;
import io.flutter.Build;
import io.sentry.metrics.MetricsUnit;
import io.sentry.protocol.FeatureFlag;
import io.sentry.protocol.Request;
import io.sentry.protocol.SentryThread;
import io.sentry.rrweb.RRWebVideoEvent;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import org.apache.tika.pipes.PipesConfigBase;
import sd.AbstractC5823c;

/* JADX INFO: renamed from: od.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC5283e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final kd.c f41539a = new kd.c("kotlin.jvm.JvmName");

    public static boolean A(InterfaceC1185m interfaceC1185m) {
        return D(interfaceC1185m, EnumC1178f.ENUM_CLASS);
    }

    public static boolean B(InterfaceC1185m interfaceC1185m) {
        if (interfaceC1185m == null) {
            a(36);
        }
        return D(interfaceC1185m, EnumC1178f.ENUM_ENTRY);
    }

    public static boolean C(InterfaceC1185m interfaceC1185m) {
        return D(interfaceC1185m, EnumC1178f.INTERFACE);
    }

    public static boolean D(InterfaceC1185m interfaceC1185m, EnumC1178f enumC1178f) {
        if (enumC1178f == null) {
            a(37);
        }
        return (interfaceC1185m instanceof InterfaceC1177e) && ((InterfaceC1177e) interfaceC1185m).f() == enumC1178f;
    }

    public static boolean E(InterfaceC1185m interfaceC1185m) {
        if (interfaceC1185m == null) {
            a(1);
        }
        while (interfaceC1185m != null) {
            if (u(interfaceC1185m) || y(interfaceC1185m)) {
                return true;
            }
            interfaceC1185m = interfaceC1185m.b();
        }
        return false;
    }

    public static boolean F(E e10, InterfaceC1185m interfaceC1185m) {
        if (e10 == null) {
            a(30);
        }
        if (interfaceC1185m == null) {
            a(31);
        }
        InterfaceC1180h interfaceC1180hQ = e10.N0().q();
        if (interfaceC1180hQ == null) {
            return false;
        }
        InterfaceC1185m interfaceC1185mA = interfaceC1180hQ.a();
        return (interfaceC1185mA instanceof InterfaceC1180h) && (interfaceC1185m instanceof InterfaceC1180h) && ((InterfaceC1180h) interfaceC1185m).k().equals(((InterfaceC1180h) interfaceC1185mA).k());
    }

    public static boolean G(InterfaceC1185m interfaceC1185m) {
        return (D(interfaceC1185m, EnumC1178f.CLASS) || D(interfaceC1185m, EnumC1178f.INTERFACE)) && ((InterfaceC1177e) interfaceC1185m).r() == D.SEALED;
    }

    public static boolean H(InterfaceC1177e interfaceC1177e, InterfaceC1177e interfaceC1177e2) {
        if (interfaceC1177e == null) {
            a(28);
        }
        if (interfaceC1177e2 == null) {
            a(29);
        }
        return I(interfaceC1177e.p(), interfaceC1177e2.a());
    }

    public static boolean I(E e10, InterfaceC1185m interfaceC1185m) {
        if (e10 == null) {
            a(32);
        }
        if (interfaceC1185m == null) {
            a(33);
        }
        if (F(e10, interfaceC1185m)) {
            return true;
        }
        Iterator it = e10.N0().o().iterator();
        while (it.hasNext()) {
            if (I((E) it.next(), interfaceC1185m)) {
                return true;
            }
        }
        return false;
    }

    public static boolean J(InterfaceC1185m interfaceC1185m) {
        return interfaceC1185m != null && (interfaceC1185m.b() instanceof K);
    }

    public static boolean K(k0 k0Var, E e10) {
        if (k0Var == null) {
            a(63);
        }
        if (e10 == null) {
            a(64);
        }
        if (k0Var.L() || G.a(e10)) {
            return false;
        }
        if (q0.b(e10)) {
            return true;
        }
        Ic.g gVarJ = AbstractC5823c.j(k0Var);
        if (!Ic.g.r0(e10)) {
            Dd.e eVar = Dd.e.f2664a;
            if (!eVar.c(gVarJ.W(), e10) && !eVar.c(gVarJ.K().p(), e10) && !eVar.c(gVarJ.i(), e10) && !Ic.n.d(e10)) {
                return false;
            }
        }
        return true;
    }

    public static InterfaceC1174b L(InterfaceC1174b interfaceC1174b) {
        if (interfaceC1174b == null) {
            a(59);
        }
        while (interfaceC1174b.f() == InterfaceC1174b.a.FAKE_OVERRIDE) {
            Collection collectionD = interfaceC1174b.d();
            if (collectionD.isEmpty()) {
                throw new IllegalStateException("Fake override should have at least one overridden descriptor: " + interfaceC1174b);
            }
            interfaceC1174b = (InterfaceC1174b) collectionD.iterator().next();
        }
        return interfaceC1174b;
    }

    public static InterfaceC1189q M(InterfaceC1189q interfaceC1189q) {
        if (interfaceC1189q == null) {
            a(61);
        }
        if (interfaceC1189q instanceof InterfaceC1174b) {
            return L((InterfaceC1174b) interfaceC1189q);
        }
        if (interfaceC1189q == null) {
            a(62);
        }
        return interfaceC1189q;
    }

    public static /* synthetic */ void a(int i10) {
        String str;
        int i11;
        switch (i10) {
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case DescriptorProtos$FileOptions.PHP_CLASS_PREFIX_FIELD_NUMBER /* 40 */:
            case DescriptorProtos$FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case PipesConfigBase.DEFAULT_STALE_FETCHER_DELAY_SECONDS /* 60 */:
            case 62:
            case 69:
            case 73:
            case 80:
            case 81:
            case 83:
            case 86:
            case 91:
            case 93:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i10) {
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case DescriptorProtos$FileOptions.PHP_CLASS_PREFIX_FIELD_NUMBER /* 40 */:
            case DescriptorProtos$FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case PipesConfigBase.DEFAULT_STALE_FETCHER_DELAY_SECONDS /* 60 */:
            case 62:
            case 69:
            case 73:
            case 80:
            case 81:
            case 83:
            case 86:
            case 91:
            case 93:
                i11 = 2;
                break;
            default:
                i11 = 3;
                break;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
            case 2:
            case 3:
            case 5:
            case 6:
            case 8:
            case 11:
            case 13:
            case 14:
            case 15:
            case 21:
            case 23:
            case 24:
            case 34:
            case 35:
            case 36:
            case 57:
            case 58:
            case 59:
            case 61:
            case 79:
            case 92:
            case 94:
                objArr[0] = "descriptor";
                break;
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case DescriptorProtos$FileOptions.PHP_CLASS_PREFIX_FIELD_NUMBER /* 40 */:
            case DescriptorProtos$FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case PipesConfigBase.DEFAULT_STALE_FETCHER_DELAY_SECONDS /* 60 */:
            case 62:
            case 69:
            case 73:
            case 80:
            case 81:
            case 83:
            case 86:
            case 91:
            case 93:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorUtils";
                break;
            case 16:
                objArr[0] = "first";
                break;
            case 17:
                objArr[0] = MetricsUnit.Duration.SECOND;
                break;
            case 18:
            case 19:
                objArr[0] = "aClass";
                break;
            case 20:
                objArr[0] = "kotlinType";
                break;
            case 25:
                objArr[0] = "declarationDescriptor";
                break;
            case 26:
            case 28:
                objArr[0] = "subClass";
                break;
            case 27:
            case 29:
            case 33:
                objArr[0] = "superClass";
                break;
            case Build.API_LEVELS.API_30 /* 30 */:
            case 32:
            case DescriptorProtos$FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
            case 64:
                objArr[0] = "type";
                break;
            case 31:
                objArr[0] = Request.JsonKeys.OTHER;
                break;
            case 37:
                objArr[0] = "classKind";
                break;
            case 38:
            case DescriptorProtos$FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
            case DescriptorProtos$FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
            case DescriptorProtos$FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
            case 48:
            case 54:
            case 65:
            case 66:
            case 67:
            case 74:
            case 75:
                objArr[0] = "classDescriptor";
                break;
            case 46:
                objArr[0] = "typeConstructor";
                break;
            case 55:
                objArr[0] = "innerClassName";
                break;
            case 56:
                objArr[0] = "location";
                break;
            case 63:
                objArr[0] = RRWebVideoEvent.REPLAY_FRAME_RATE_TYPE_VARIABLE;
                break;
            case 68:
                objArr[0] = "f";
                break;
            case 70:
                objArr[0] = SentryThread.JsonKeys.CURRENT;
                break;
            case 71:
                objArr[0] = FeatureFlag.JsonKeys.RESULT;
                break;
            case 72:
                objArr[0] = "memberDescriptor";
                break;
            case 76:
            case 77:
            case 78:
                objArr[0] = "annotated";
                break;
            case 82:
            case 84:
            case 87:
            case 89:
                objArr[0] = "scope";
                break;
            case 85:
            case 88:
            case 90:
                objArr[0] = "name";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i10) {
            case 4:
                objArr[1] = "getFqNameSafe";
                break;
            case 7:
                objArr[1] = "getFqNameUnsafe";
                break;
            case 9:
            case 10:
                objArr[1] = "getFqNameFromTopLevelClass";
                break;
            case 12:
                objArr[1] = "getClassIdForNonLocalClass";
                break;
            case 22:
                objArr[1] = "getContainingModule";
                break;
            case DescriptorProtos$FileOptions.PHP_CLASS_PREFIX_FIELD_NUMBER /* 40 */:
                objArr[1] = "getSuperclassDescriptors";
                break;
            case DescriptorProtos$FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
            case 43:
                objArr[1] = "getSuperClassType";
                break;
            case 47:
                objArr[1] = "getClassDescriptorForTypeConstructor";
                break;
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
                objArr[1] = "getDefaultConstructorVisibility";
                break;
            case PipesConfigBase.DEFAULT_STALE_FETCHER_DELAY_SECONDS /* 60 */:
                objArr[1] = "unwrapFakeOverride";
                break;
            case 62:
                objArr[1] = "unwrapFakeOverrideToAnyDeclaration";
                break;
            case 69:
                objArr[1] = "getAllOverriddenDescriptors";
                break;
            case 73:
                objArr[1] = "getAllOverriddenDeclarations";
                break;
            case 80:
            case 81:
                objArr[1] = "getContainingSourceFile";
                break;
            case 83:
                objArr[1] = "getAllDescriptors";
                break;
            case 86:
                objArr[1] = "getFunctionByName";
                break;
            case 91:
                objArr[1] = "getPropertyByName";
                break;
            case 93:
                objArr[1] = "getDirectMember";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorUtils";
                break;
        }
        switch (i10) {
            case 1:
                objArr[2] = "isLocal";
                break;
            case 2:
                objArr[2] = "getFqName";
                break;
            case 3:
                objArr[2] = "getFqNameSafe";
                break;
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case DescriptorProtos$FileOptions.PHP_CLASS_PREFIX_FIELD_NUMBER /* 40 */:
            case DescriptorProtos$FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case PipesConfigBase.DEFAULT_STALE_FETCHER_DELAY_SECONDS /* 60 */:
            case 62:
            case 69:
            case 73:
            case 80:
            case 81:
            case 83:
            case 86:
            case 91:
            case 93:
                break;
            case 5:
                objArr[2] = "getFqNameSafeIfPossible";
                break;
            case 6:
                objArr[2] = "getFqNameUnsafe";
                break;
            case 8:
                objArr[2] = "getFqNameFromTopLevelClass";
                break;
            case 11:
                objArr[2] = "getClassIdForNonLocalClass";
                break;
            case 13:
                objArr[2] = "isExtension";
                break;
            case 14:
                objArr[2] = "isOverride";
                break;
            case 15:
                objArr[2] = "isStaticDeclaration";
                break;
            case 16:
            case 17:
                objArr[2] = "areInSameModule";
                break;
            case 18:
            case 19:
                objArr[2] = "getParentOfType";
                break;
            case 20:
            case 23:
                objArr[2] = "getContainingModuleOrNull";
                break;
            case 21:
                objArr[2] = "getContainingModule";
                break;
            case 24:
                objArr[2] = "getContainingClass";
                break;
            case 25:
                objArr[2] = "isAncestor";
                break;
            case 26:
            case 27:
                objArr[2] = "isDirectSubclass";
                break;
            case 28:
            case 29:
                objArr[2] = "isSubclass";
                break;
            case Build.API_LEVELS.API_30 /* 30 */:
            case 31:
                objArr[2] = "isSameClass";
                break;
            case 32:
            case 33:
                objArr[2] = "isSubtypeOfClass";
                break;
            case 34:
                objArr[2] = "isAnonymousObject";
                break;
            case 35:
                objArr[2] = "isAnonymousFunction";
                break;
            case 36:
                objArr[2] = "isEnumEntry";
                break;
            case 37:
                objArr[2] = "isKindOf";
                break;
            case 38:
                objArr[2] = "hasAbstractMembers";
                break;
            case DescriptorProtos$FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                objArr[2] = "getSuperclassDescriptors";
                break;
            case DescriptorProtos$FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
                objArr[2] = "getSuperClassType";
                break;
            case DescriptorProtos$FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                objArr[2] = "getSuperClassDescriptor";
                break;
            case DescriptorProtos$FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                objArr[2] = "getClassDescriptorForType";
                break;
            case 46:
                objArr[2] = "getClassDescriptorForTypeConstructor";
                break;
            case 48:
                objArr[2] = "getDefaultConstructorVisibility";
                break;
            case 54:
            case 55:
            case 56:
                objArr[2] = "getInnerClassByName";
                break;
            case 57:
                objArr[2] = "isStaticNestedClass";
                break;
            case 58:
                objArr[2] = "isTopLevelOrInnerClass";
                break;
            case 59:
                objArr[2] = "unwrapFakeOverride";
                break;
            case 61:
                objArr[2] = "unwrapFakeOverrideToAnyDeclaration";
                break;
            case 63:
            case 64:
                objArr[2] = "shouldRecordInitializerForProperty";
                break;
            case 65:
                objArr[2] = "classCanHaveAbstractFakeOverride";
                break;
            case 66:
                objArr[2] = "classCanHaveAbstractDeclaration";
                break;
            case 67:
                objArr[2] = "classCanHaveOpenMembers";
                break;
            case 68:
                objArr[2] = "getAllOverriddenDescriptors";
                break;
            case 70:
            case 71:
                objArr[2] = "collectAllOverriddenDescriptors";
                break;
            case 72:
                objArr[2] = "getAllOverriddenDeclarations";
                break;
            case 74:
                objArr[2] = "isSingletonOrAnonymousObject";
                break;
            case 75:
                objArr[2] = "canHaveDeclaredConstructors";
                break;
            case 76:
                objArr[2] = "getJvmName";
                break;
            case 77:
                objArr[2] = "findJvmNameAnnotation";
                break;
            case 78:
                objArr[2] = "hasJvmNameAnnotation";
                break;
            case 79:
                objArr[2] = "getContainingSourceFile";
                break;
            case 82:
                objArr[2] = "getAllDescriptors";
                break;
            case 84:
            case 85:
                objArr[2] = "getFunctionByName";
                break;
            case 87:
            case 88:
                objArr[2] = "getFunctionByNameOrNull";
                break;
            case 89:
            case 90:
                objArr[2] = "getPropertyByName";
                break;
            case 92:
                objArr[2] = "getDirectMember";
                break;
            case 94:
                objArr[2] = "isMethodOfAny";
                break;
            default:
                objArr[2] = "getDispatchReceiverParameterIfNeeded";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i10) {
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case DescriptorProtos$FileOptions.PHP_CLASS_PREFIX_FIELD_NUMBER /* 40 */:
            case DescriptorProtos$FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case PipesConfigBase.DEFAULT_STALE_FETCHER_DELAY_SECONDS /* 60 */:
            case 62:
            case 69:
            case 73:
            case 80:
            case 81:
            case 83:
            case 86:
            case 91:
            case 93:
                throw new IllegalStateException(str2);
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    public static boolean b(InterfaceC1185m interfaceC1185m, InterfaceC1185m interfaceC1185m2) {
        if (interfaceC1185m == null) {
            a(16);
        }
        if (interfaceC1185m2 == null) {
            a(17);
        }
        return g(interfaceC1185m).equals(g(interfaceC1185m2));
    }

    public static void c(InterfaceC1173a interfaceC1173a, Set set) {
        if (interfaceC1173a == null) {
            a(70);
        }
        if (set == null) {
            a(71);
        }
        if (set.contains(interfaceC1173a)) {
            return;
        }
        Iterator it = interfaceC1173a.a().d().iterator();
        while (it.hasNext()) {
            InterfaceC1173a interfaceC1173aA = ((InterfaceC1173a) it.next()).a();
            c(interfaceC1173aA, set);
            set.add(interfaceC1173aA);
        }
    }

    public static Set d(InterfaceC1173a interfaceC1173a) {
        if (interfaceC1173a == null) {
            a(68);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        c(interfaceC1173a.a(), linkedHashSet);
        return linkedHashSet;
    }

    public static InterfaceC1177e e(E e10) {
        if (e10 == null) {
            a(45);
        }
        return f(e10.N0());
    }

    public static InterfaceC1177e f(e0 e0Var) {
        if (e0Var == null) {
            a(46);
        }
        InterfaceC1177e interfaceC1177e = (InterfaceC1177e) e0Var.q();
        if (interfaceC1177e == null) {
            a(47);
        }
        return interfaceC1177e;
    }

    public static Lc.G g(InterfaceC1185m interfaceC1185m) {
        if (interfaceC1185m == null) {
            a(21);
        }
        Lc.G gI = i(interfaceC1185m);
        if (gI == null) {
            a(22);
        }
        return gI;
    }

    public static Lc.G h(E e10) {
        if (e10 == null) {
            a(20);
        }
        InterfaceC1180h interfaceC1180hQ = e10.N0().q();
        if (interfaceC1180hQ == null) {
            return null;
        }
        return i(interfaceC1180hQ);
    }

    public static Lc.G i(InterfaceC1185m interfaceC1185m) {
        if (interfaceC1185m == null) {
            a(23);
        }
        while (interfaceC1185m != null) {
            if (interfaceC1185m instanceof Lc.G) {
                return (Lc.G) interfaceC1185m;
            }
            if (interfaceC1185m instanceof P) {
                return ((P) interfaceC1185m).A0();
            }
            interfaceC1185m = interfaceC1185m.b();
        }
        return null;
    }

    public static b0 j(InterfaceC1185m interfaceC1185m) {
        if (interfaceC1185m == null) {
            a(79);
        }
        if (interfaceC1185m instanceof W) {
            interfaceC1185m = ((W) interfaceC1185m).T();
        }
        if (interfaceC1185m instanceof InterfaceC1188p) {
            b0 b0VarB = ((InterfaceC1188p) interfaceC1185m).j().b();
            if (b0VarB == null) {
                a(80);
            }
            return b0VarB;
        }
        b0 b0Var = b0.f8747a;
        if (b0Var == null) {
            a(81);
        }
        return b0Var;
    }

    public static AbstractC1192u k(InterfaceC1177e interfaceC1177e, boolean z10) {
        if (interfaceC1177e == null) {
            a(48);
        }
        EnumC1178f enumC1178fF = interfaceC1177e.f();
        if (enumC1178fF == EnumC1178f.ENUM_CLASS || enumC1178fF.b()) {
            AbstractC1192u abstractC1192u = AbstractC1191t.f8771a;
            if (abstractC1192u == null) {
                a(49);
            }
            return abstractC1192u;
        }
        if (G(interfaceC1177e)) {
            if (z10) {
                AbstractC1192u abstractC1192u2 = AbstractC1191t.f8773c;
                if (abstractC1192u2 == null) {
                    a(50);
                }
                return abstractC1192u2;
            }
            AbstractC1192u abstractC1192u3 = AbstractC1191t.f8771a;
            if (abstractC1192u3 == null) {
                a(51);
            }
            return abstractC1192u3;
        }
        if (u(interfaceC1177e)) {
            AbstractC1192u abstractC1192u4 = AbstractC1191t.f8782l;
            if (abstractC1192u4 == null) {
                a(52);
            }
            return abstractC1192u4;
        }
        AbstractC1192u abstractC1192u5 = AbstractC1191t.f8775e;
        if (abstractC1192u5 == null) {
            a(53);
        }
        return abstractC1192u5;
    }

    public static X l(InterfaceC1185m interfaceC1185m) {
        if (interfaceC1185m == null) {
            a(0);
        }
        if (interfaceC1185m instanceof InterfaceC1177e) {
            return ((InterfaceC1177e) interfaceC1185m).J0();
        }
        return null;
    }

    public static kd.d m(InterfaceC1185m interfaceC1185m) {
        if (interfaceC1185m == null) {
            a(2);
        }
        kd.c cVarO = o(interfaceC1185m);
        return cVarO != null ? cVarO.j() : p(interfaceC1185m);
    }

    public static kd.c n(InterfaceC1185m interfaceC1185m) {
        if (interfaceC1185m == null) {
            a(3);
        }
        kd.c cVarO = o(interfaceC1185m);
        if (cVarO == null) {
            cVarO = p(interfaceC1185m).l();
        }
        if (cVarO == null) {
            a(4);
        }
        return cVarO;
    }

    public static kd.c o(InterfaceC1185m interfaceC1185m) {
        if (interfaceC1185m == null) {
            a(5);
        }
        if ((interfaceC1185m instanceof Lc.G) || Ed.k.m(interfaceC1185m)) {
            return kd.c.f39551c;
        }
        if (interfaceC1185m instanceof P) {
            return ((P) interfaceC1185m).e();
        }
        if (interfaceC1185m instanceof K) {
            return ((K) interfaceC1185m).e();
        }
        return null;
    }

    public static kd.d p(InterfaceC1185m interfaceC1185m) {
        if (interfaceC1185m == null) {
            a(6);
        }
        kd.d dVarC = m(interfaceC1185m.b()).c(interfaceC1185m.getName());
        if (dVarC == null) {
            a(7);
        }
        return dVarC;
    }

    public static InterfaceC1185m q(InterfaceC1185m interfaceC1185m, Class cls) {
        if (cls == null) {
            a(18);
        }
        return r(interfaceC1185m, cls, true);
    }

    public static InterfaceC1185m r(InterfaceC1185m interfaceC1185m, Class cls, boolean z10) {
        if (cls == null) {
            a(19);
        }
        if (interfaceC1185m == null) {
            return null;
        }
        if (z10) {
            interfaceC1185m = interfaceC1185m.b();
        }
        while (interfaceC1185m != null) {
            if (cls.isInstance(interfaceC1185m)) {
                return interfaceC1185m;
            }
            interfaceC1185m = interfaceC1185m.b();
        }
        return null;
    }

    public static InterfaceC1177e s(InterfaceC1177e interfaceC1177e) {
        if (interfaceC1177e == null) {
            a(44);
        }
        Iterator it = interfaceC1177e.k().o().iterator();
        while (it.hasNext()) {
            InterfaceC1177e interfaceC1177eE = e((E) it.next());
            if (interfaceC1177eE.f() != EnumC1178f.INTERFACE) {
                return interfaceC1177eE;
            }
        }
        return null;
    }

    public static boolean t(InterfaceC1185m interfaceC1185m) {
        return D(interfaceC1185m, EnumC1178f.ANNOTATION_CLASS);
    }

    public static boolean u(InterfaceC1185m interfaceC1185m) {
        if (interfaceC1185m == null) {
            a(34);
        }
        return v(interfaceC1185m) && interfaceC1185m.getName().equals(kd.h.f39567b);
    }

    public static boolean v(InterfaceC1185m interfaceC1185m) {
        return D(interfaceC1185m, EnumC1178f.CLASS);
    }

    public static boolean w(InterfaceC1185m interfaceC1185m) {
        return v(interfaceC1185m) || A(interfaceC1185m);
    }

    public static boolean x(InterfaceC1185m interfaceC1185m) {
        return D(interfaceC1185m, EnumC1178f.OBJECT) && ((InterfaceC1177e) interfaceC1185m).Z();
    }

    public static boolean y(InterfaceC1185m interfaceC1185m) {
        return (interfaceC1185m instanceof InterfaceC1189q) && ((InterfaceC1189q) interfaceC1185m).getVisibility() == AbstractC1191t.f8776f;
    }

    public static boolean z(InterfaceC1177e interfaceC1177e, InterfaceC1177e interfaceC1177e2) {
        if (interfaceC1177e == null) {
            a(26);
        }
        if (interfaceC1177e2 == null) {
            a(27);
        }
        Iterator it = interfaceC1177e.k().o().iterator();
        while (it.hasNext()) {
            if (F((E) it.next(), interfaceC1177e2.a())) {
                return true;
            }
        }
        return false;
    }
}
