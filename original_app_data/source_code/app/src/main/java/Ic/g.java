package Ic;

import Cd.E;
import Cd.F;
import Cd.M;
import Cd.b0;
import Cd.e0;
import Cd.i0;
import Cd.k0;
import Cd.q0;
import Cd.u0;
import Ic.j;
import Lc.AbstractC1190s;
import Lc.AbstractC1195x;
import Lc.G;
import Lc.InterfaceC1177e;
import Lc.InterfaceC1180h;
import Lc.InterfaceC1185m;
import Lc.K;
import Lc.U;
import Lc.V;
import Lc.W;
import Nc.a;
import Nc.c;
import Oc.x;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.api.Endpoint;
import com.google.protobuf.DescriptorProtos$FileOptions;
import io.flutter.Build;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import od.AbstractC5283e;
import org.apache.tika.pipes.PipesConfigBase;
import sd.AbstractC5823c;
import vc.InterfaceC6082a;
import vd.InterfaceC6099h;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class g {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final kd.f f5687g = kd.f.w("<built-ins module>");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public x f5688a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Bd.i f5689b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Bd.i f5690c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Bd.i f5691d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Bd.g f5692e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Bd.n f5693f;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a implements InterfaceC6082a {
        public a() {
        }

        @Override // vc.InterfaceC6082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Collection invoke() {
            return Arrays.asList(g.this.r().z0(j.f5739u), g.this.r().z0(j.f5741w), g.this.r().z0(j.f5742x), g.this.r().z0(j.f5740v));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class b implements InterfaceC6082a {
        public b() {
        }

        @Override // vc.InterfaceC6082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public e invoke() {
            EnumMap enumMap = new EnumMap(h.class);
            HashMap map = new HashMap();
            HashMap map2 = new HashMap();
            for (h hVar : h.values()) {
                M mQ = g.this.q(hVar.q().b());
                M mQ2 = g.this.q(hVar.j().b());
                enumMap.put(hVar, mQ2);
                map.put(mQ, mQ2);
                map2.put(mQ2, mQ);
            }
            return new e(enumMap, map, map2, null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class c implements vc.l {
        public c() {
        }

        @Override // vc.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public InterfaceC1177e invoke(kd.f fVar) {
            InterfaceC1180h interfaceC1180hE = g.this.s().e(fVar, Tc.d.FROM_BUILTINS);
            if (interfaceC1180hE == null) {
                throw new AssertionError("Built-in class " + j.f5739u.c(fVar) + " is not found");
            }
            if (interfaceC1180hE instanceof InterfaceC1177e) {
                return (InterfaceC1177e) interfaceC1180hE;
            }
            throw new AssertionError("Must be a class descriptor " + fVar + ", but was " + interfaceC1180hE);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class d implements InterfaceC6082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ x f5697a;

        public d(x xVar) {
            this.f5697a = xVar;
        }

        @Override // vc.InterfaceC6082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void invoke() {
            if (g.this.f5688a == null) {
                g.this.f5688a = this.f5697a;
                return null;
            }
            throw new AssertionError("Built-ins module is already set: " + g.this.f5688a + " (attempting to reset to " + this.f5697a + ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Map f5699a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Map f5700b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Map f5701c;

        public /* synthetic */ e(Map map, Map map2, Map map3, a aVar) {
            this(map, map2, map3);
        }

        public static /* synthetic */ void a(int i10) {
            Object[] objArr = new Object[3];
            if (i10 == 1) {
                objArr[0] = "primitiveKotlinTypeToKotlinArrayType";
            } else if (i10 != 2) {
                objArr[0] = "primitiveTypeToArrayKotlinType";
            } else {
                objArr[0] = "kotlinArrayTypeToPrimitiveKotlinType";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/builtins/KotlinBuiltIns$Primitives";
            objArr[2] = "<init>";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        public e(Map map, Map map2, Map map3) {
            if (map == null) {
                a(0);
            }
            if (map2 == null) {
                a(1);
            }
            if (map3 == null) {
                a(2);
            }
            this.f5699a = map;
            this.f5700b = map2;
            this.f5701c = map3;
        }
    }

    public g(Bd.n nVar) {
        if (nVar == null) {
            a(0);
        }
        this.f5693f = nVar;
        this.f5691d = nVar.f(new a());
        this.f5690c = nVar.f(new b());
        this.f5692e = nVar.g(new c());
    }

    public static E A(E e10, G g10) {
        kd.b bVarK;
        kd.b bVarA;
        InterfaceC1177e interfaceC1177eA;
        if (e10 == null) {
            a(71);
        }
        if (g10 == null) {
            a(72);
        }
        InterfaceC1180h interfaceC1180hQ = e10.N0().q();
        if (interfaceC1180hQ == null) {
            return null;
        }
        n nVar = n.f5834a;
        if (!nVar.b(interfaceC1180hQ.getName()) || (bVarK = AbstractC5823c.k(interfaceC1180hQ)) == null || (bVarA = nVar.a(bVarK)) == null || (interfaceC1177eA = AbstractC1195x.a(g10, bVarA)) == null) {
            return null;
        }
        return interfaceC1177eA.p();
    }

    public static boolean A0(InterfaceC1185m interfaceC1185m) {
        if (interfaceC1185m == null) {
            a(10);
        }
        while (interfaceC1185m != null) {
            if (interfaceC1185m instanceof K) {
                return ((K) interfaceC1185m).e().i(j.f5738t);
            }
            interfaceC1185m = interfaceC1185m.b();
        }
        return false;
    }

    public static boolean B0(E e10) {
        if (e10 == null) {
            a(142);
        }
        return l0(e10, j.a.f5791f);
    }

    public static boolean C0(E e10) {
        if (e10 == null) {
            a(132);
        }
        return w0(e10) || z0(e10) || x0(e10) || y0(e10);
    }

    public static h N(E e10) {
        if (e10 == null) {
            a(92);
        }
        InterfaceC1180h interfaceC1180hQ = e10.N0().q();
        if (interfaceC1180hQ == null) {
            return null;
        }
        return P(interfaceC1180hQ);
    }

    public static h P(InterfaceC1185m interfaceC1185m) {
        if (interfaceC1185m == null) {
            a(77);
        }
        if (j.a.f5760H0.contains(interfaceC1185m.getName())) {
            return (h) j.a.f5764J0.get(AbstractC5283e.m(interfaceC1185m));
        }
        return null;
    }

    public static h S(InterfaceC1185m interfaceC1185m) {
        if (interfaceC1185m == null) {
            a(76);
        }
        if (j.a.f5758G0.contains(interfaceC1185m.getName())) {
            return (h) j.a.f5762I0.get(AbstractC5283e.m(interfaceC1185m));
        }
        return null;
    }

    public static /* synthetic */ void a(int i10) {
        String str;
        int i11;
        switch (i10) {
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 11:
            case 13:
            case 15:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case Build.API_LEVELS.API_30 /* 30 */:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case DescriptorProtos$FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
            case DescriptorProtos$FileOptions.PHP_CLASS_PREFIX_FIELD_NUMBER /* 40 */:
            case DescriptorProtos$FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
            case DescriptorProtos$FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
            case 43:
            case DescriptorProtos$FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
            case DescriptorProtos$FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case PipesConfigBase.DEFAULT_STALE_FETCHER_DELAY_SECONDS /* 60 */:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 68:
            case 69:
            case 70:
            case 74:
            case 81:
            case 84:
            case 86:
            case 87:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 9:
            case 10:
            case 12:
            case 14:
            case 16:
            case 17:
            case 46:
            case 53:
            case 67:
            case 71:
            case 72:
            case 73:
            case 75:
            case 76:
            case 77:
            case 78:
            case 79:
            case 80:
            case 82:
            case 83:
            case 85:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i10) {
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 11:
            case 13:
            case 15:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case Build.API_LEVELS.API_30 /* 30 */:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case DescriptorProtos$FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
            case DescriptorProtos$FileOptions.PHP_CLASS_PREFIX_FIELD_NUMBER /* 40 */:
            case DescriptorProtos$FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
            case DescriptorProtos$FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
            case 43:
            case DescriptorProtos$FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
            case DescriptorProtos$FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case PipesConfigBase.DEFAULT_STALE_FETCHER_DELAY_SECONDS /* 60 */:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 68:
            case 69:
            case 70:
            case 74:
            case 81:
            case 84:
            case 86:
            case 87:
                i11 = 2;
                break;
            case 9:
            case 10:
            case 12:
            case 14:
            case 16:
            case 17:
            case 46:
            case 53:
            case 67:
            case 71:
            case 72:
            case 73:
            case 75:
            case 76:
            case 77:
            case 78:
            case 79:
            case 80:
            case 82:
            case 83:
            case 85:
            default:
                i11 = 3;
                break;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
            case 72:
                objArr[0] = "module";
                break;
            case 2:
                objArr[0] = "computation";
                break;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 11:
            case 13:
            case 15:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case Build.API_LEVELS.API_30 /* 30 */:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case DescriptorProtos$FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
            case DescriptorProtos$FileOptions.PHP_CLASS_PREFIX_FIELD_NUMBER /* 40 */:
            case DescriptorProtos$FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
            case DescriptorProtos$FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
            case 43:
            case DescriptorProtos$FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
            case DescriptorProtos$FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case PipesConfigBase.DEFAULT_STALE_FETCHER_DELAY_SECONDS /* 60 */:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 68:
            case 69:
            case 70:
            case 74:
            case 81:
            case 84:
            case 86:
            case 87:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/builtins/KotlinBuiltIns";
                break;
            case 9:
            case 10:
            case 76:
            case 77:
            case 89:
            case 96:
            case 103:
            case 107:
            case 108:
            case 143:
            case 146:
            case 147:
            case 149:
            case 157:
            case 158:
            case 159:
            case 160:
                objArr[0] = "descriptor";
                break;
            case 12:
            case 98:
            case 100:
            case 102:
            case 104:
            case 106:
            case 135:
                objArr[0] = "fqName";
                break;
            case 14:
                objArr[0] = "simpleName";
                break;
            case 16:
            case 17:
            case 53:
            case 88:
            case 90:
            case 91:
            case 92:
            case 93:
            case 94:
            case 95:
            case 97:
            case 99:
            case 105:
            case 109:
            case 110:
            case 111:
            case 113:
            case 114:
            case 115:
            case 116:
            case 117:
            case 118:
            case 119:
            case 120:
            case 121:
            case 122:
            case 123:
            case 124:
            case 125:
            case 126:
            case 127:
            case 128:
            case 129:
            case 130:
            case 131:
            case 132:
            case 133:
            case 134:
            case 136:
            case 137:
            case 138:
            case 139:
            case 140:
            case 141:
            case 142:
            case 144:
            case 145:
            case 148:
            case 150:
            case 151:
            case 152:
            case 153:
            case 154:
            case ModuleDescriptor.MODULE_VERSION /* 155 */:
            case 156:
            case 162:
                objArr[0] = "type";
                break;
            case 46:
                objArr[0] = "classSimpleName";
                break;
            case 67:
                objArr[0] = "arrayType";
                break;
            case 71:
                objArr[0] = "notNullArrayType";
                break;
            case 73:
                objArr[0] = "primitiveType";
                break;
            case 75:
                objArr[0] = "kotlinType";
                break;
            case 78:
            case 82:
                objArr[0] = "projectionType";
                break;
            case 79:
            case 83:
            case 85:
                objArr[0] = "argument";
                break;
            case 80:
                objArr[0] = "annotations";
                break;
            case Endpoint.TARGET_FIELD_NUMBER /* 101 */:
                objArr[0] = "typeConstructor";
                break;
            case 112:
                objArr[0] = "classDescriptor";
                break;
            case 161:
                objArr[0] = "declarationDescriptor";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        switch (i10) {
            case 3:
                objArr[1] = "getAdditionalClassPartsProvider";
                break;
            case 4:
                objArr[1] = "getPlatformDependentDeclarationFilter";
                break;
            case 5:
                objArr[1] = "getClassDescriptorFactories";
                break;
            case 6:
                objArr[1] = "getStorageManager";
                break;
            case 7:
                objArr[1] = "getBuiltInsModule";
                break;
            case 8:
                objArr[1] = "getBuiltInPackagesImportedByDefault";
                break;
            case 9:
            case 10:
            case 12:
            case 14:
            case 16:
            case 17:
            case 46:
            case 53:
            case 67:
            case 71:
            case 72:
            case 73:
            case 75:
            case 76:
            case 77:
            case 78:
            case 79:
            case 80:
            case 82:
            case 83:
            case 85:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/builtins/KotlinBuiltIns";
                break;
            case 11:
                objArr[1] = "getBuiltInsPackageScope";
                break;
            case 13:
                objArr[1] = "getBuiltInClassByFqName";
                break;
            case 15:
                objArr[1] = "getBuiltInClassByName";
                break;
            case 18:
                objArr[1] = "getSuspendFunction";
                break;
            case 19:
                objArr[1] = "getKFunction";
                break;
            case 20:
                objArr[1] = "getKSuspendFunction";
                break;
            case 21:
                objArr[1] = "getKClass";
                break;
            case 22:
                objArr[1] = "getKCallable";
                break;
            case 23:
                objArr[1] = "getKProperty";
                break;
            case 24:
                objArr[1] = "getKProperty0";
                break;
            case 25:
                objArr[1] = "getKProperty1";
                break;
            case 26:
                objArr[1] = "getKProperty2";
                break;
            case 27:
                objArr[1] = "getKMutableProperty0";
                break;
            case 28:
                objArr[1] = "getKMutableProperty1";
                break;
            case 29:
                objArr[1] = "getKMutableProperty2";
                break;
            case Build.API_LEVELS.API_30 /* 30 */:
                objArr[1] = "getIterator";
                break;
            case 31:
                objArr[1] = "getIterable";
                break;
            case 32:
                objArr[1] = "getMutableIterable";
                break;
            case 33:
                objArr[1] = "getMutableIterator";
                break;
            case 34:
                objArr[1] = "getCollection";
                break;
            case 35:
                objArr[1] = "getMutableCollection";
                break;
            case 36:
                objArr[1] = "getList";
                break;
            case 37:
                objArr[1] = "getMutableList";
                break;
            case 38:
                objArr[1] = "getSet";
                break;
            case DescriptorProtos$FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                objArr[1] = "getMutableSet";
                break;
            case DescriptorProtos$FileOptions.PHP_CLASS_PREFIX_FIELD_NUMBER /* 40 */:
                objArr[1] = "getMap";
                break;
            case DescriptorProtos$FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
                objArr[1] = "getMutableMap";
                break;
            case DescriptorProtos$FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
                objArr[1] = "getMapEntry";
                break;
            case 43:
                objArr[1] = "getMutableMapEntry";
                break;
            case DescriptorProtos$FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                objArr[1] = "getListIterator";
                break;
            case DescriptorProtos$FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                objArr[1] = "getMutableListIterator";
                break;
            case 47:
                objArr[1] = "getBuiltInTypeByClassName";
                break;
            case 48:
                objArr[1] = "getNothingType";
                break;
            case 49:
                objArr[1] = "getNullableNothingType";
                break;
            case 50:
                objArr[1] = "getAnyType";
                break;
            case 51:
                objArr[1] = "getNullableAnyType";
                break;
            case 52:
                objArr[1] = "getDefaultBound";
                break;
            case 54:
                objArr[1] = "getPrimitiveKotlinType";
                break;
            case 55:
                objArr[1] = "getNumberType";
                break;
            case 56:
                objArr[1] = "getByteType";
                break;
            case 57:
                objArr[1] = "getShortType";
                break;
            case 58:
                objArr[1] = "getIntType";
                break;
            case 59:
                objArr[1] = "getLongType";
                break;
            case PipesConfigBase.DEFAULT_STALE_FETCHER_DELAY_SECONDS /* 60 */:
                objArr[1] = "getFloatType";
                break;
            case 61:
                objArr[1] = "getDoubleType";
                break;
            case 62:
                objArr[1] = "getCharType";
                break;
            case 63:
                objArr[1] = "getBooleanType";
                break;
            case 64:
                objArr[1] = "getUnitType";
                break;
            case 65:
                objArr[1] = "getStringType";
                break;
            case 66:
                objArr[1] = "getIterableType";
                break;
            case 68:
            case 69:
            case 70:
                objArr[1] = "getArrayElementType";
                break;
            case 74:
                objArr[1] = "getPrimitiveArrayKotlinType";
                break;
            case 81:
            case 84:
                objArr[1] = "getArrayType";
                break;
            case 86:
                objArr[1] = "getEnumType";
                break;
            case 87:
                objArr[1] = "getAnnotationType";
                break;
        }
        switch (i10) {
            case 1:
                objArr[2] = "setBuiltInsModule";
                break;
            case 2:
                objArr[2] = "setPostponedBuiltinsModuleComputation";
                break;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 11:
            case 13:
            case 15:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case Build.API_LEVELS.API_30 /* 30 */:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case DescriptorProtos$FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
            case DescriptorProtos$FileOptions.PHP_CLASS_PREFIX_FIELD_NUMBER /* 40 */:
            case DescriptorProtos$FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
            case DescriptorProtos$FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
            case 43:
            case DescriptorProtos$FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
            case DescriptorProtos$FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case PipesConfigBase.DEFAULT_STALE_FETCHER_DELAY_SECONDS /* 60 */:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 68:
            case 69:
            case 70:
            case 74:
            case 81:
            case 84:
            case 86:
            case 87:
                break;
            case 9:
                objArr[2] = "isBuiltIn";
                break;
            case 10:
                objArr[2] = "isUnderKotlinPackage";
                break;
            case 12:
                objArr[2] = "getBuiltInClassByFqName";
                break;
            case 14:
                objArr[2] = "getBuiltInClassByName";
                break;
            case 16:
                objArr[2] = "getPrimitiveClassDescriptor";
                break;
            case 17:
                objArr[2] = "getPrimitiveArrayClassDescriptor";
                break;
            case 46:
                objArr[2] = "getBuiltInTypeByClassName";
                break;
            case 53:
                objArr[2] = "getPrimitiveKotlinType";
                break;
            case 67:
                objArr[2] = "getArrayElementType";
                break;
            case 71:
            case 72:
                objArr[2] = "getElementTypeForUnsignedArray";
                break;
            case 73:
                objArr[2] = "getPrimitiveArrayKotlinType";
                break;
            case 75:
                objArr[2] = "getPrimitiveArrayKotlinTypeByPrimitiveKotlinType";
                break;
            case 76:
            case 93:
                objArr[2] = "getPrimitiveType";
                break;
            case 77:
                objArr[2] = "getPrimitiveArrayType";
                break;
            case 78:
            case 79:
            case 80:
            case 82:
            case 83:
                objArr[2] = "getArrayType";
                break;
            case 85:
                objArr[2] = "getEnumType";
                break;
            case 88:
                objArr[2] = "isArray";
                break;
            case 89:
            case 90:
                objArr[2] = "isArrayOrPrimitiveArray";
                break;
            case 91:
                objArr[2] = "isPrimitiveArray";
                break;
            case 92:
                objArr[2] = "getPrimitiveArrayElementType";
                break;
            case 94:
                objArr[2] = "isPrimitiveType";
                break;
            case 95:
                objArr[2] = "isPrimitiveTypeOrNullablePrimitiveType";
                break;
            case 96:
                objArr[2] = "isPrimitiveClass";
                break;
            case 97:
            case 98:
            case 99:
            case 100:
                objArr[2] = "isConstructedFromGivenClass";
                break;
            case Endpoint.TARGET_FIELD_NUMBER /* 101 */:
            case 102:
                objArr[2] = "isTypeConstructorForGivenClass";
                break;
            case 103:
            case 104:
                objArr[2] = "classFqNameEquals";
                break;
            case 105:
            case 106:
                objArr[2] = "isNotNullConstructedFromGivenClass";
                break;
            case 107:
                objArr[2] = "isSpecialClassWithNoSupertypes";
                break;
            case 108:
            case 109:
                objArr[2] = "isAny";
                break;
            case 110:
            case 112:
                objArr[2] = "isBoolean";
                break;
            case 111:
                objArr[2] = "isBooleanOrNullableBoolean";
                break;
            case 113:
                objArr[2] = "isNumber";
                break;
            case 114:
                objArr[2] = "isChar";
                break;
            case 115:
                objArr[2] = "isCharOrNullableChar";
                break;
            case 116:
                objArr[2] = "isInt";
                break;
            case 117:
                objArr[2] = "isByte";
                break;
            case 118:
                objArr[2] = "isLong";
                break;
            case 119:
                objArr[2] = "isLongOrNullableLong";
                break;
            case 120:
                objArr[2] = "isShort";
                break;
            case 121:
                objArr[2] = "isFloat";
                break;
            case 122:
                objArr[2] = "isFloatOrNullableFloat";
                break;
            case 123:
                objArr[2] = "isDouble";
                break;
            case 124:
                objArr[2] = "isUByte";
                break;
            case 125:
                objArr[2] = "isUShort";
                break;
            case 126:
                objArr[2] = "isUInt";
                break;
            case 127:
                objArr[2] = "isULong";
                break;
            case 128:
                objArr[2] = "isUByteArray";
                break;
            case 129:
                objArr[2] = "isUShortArray";
                break;
            case 130:
                objArr[2] = "isUIntArray";
                break;
            case 131:
                objArr[2] = "isULongArray";
                break;
            case 132:
                objArr[2] = "isUnsignedArrayType";
                break;
            case 133:
                objArr[2] = "isDoubleOrNullableDouble";
                break;
            case 134:
            case 135:
                objArr[2] = "isConstructedFromGivenClassAndNotNullable";
                break;
            case 136:
                objArr[2] = "isNothing";
                break;
            case 137:
                objArr[2] = "isNullableNothing";
                break;
            case 138:
                objArr[2] = "isNothingOrNullableNothing";
                break;
            case 139:
                objArr[2] = "isAnyOrNullableAny";
                break;
            case 140:
                objArr[2] = "isNullableAny";
                break;
            case 141:
                objArr[2] = "isDefaultBound";
                break;
            case 142:
                objArr[2] = "isUnit";
                break;
            case 143:
                objArr[2] = "mayReturnNonUnitValue";
                break;
            case 144:
                objArr[2] = "isUnitOrNullableUnit";
                break;
            case 145:
                objArr[2] = "isBooleanOrSubtype";
                break;
            case 146:
                objArr[2] = "isMemberOfAny";
                break;
            case 147:
            case 148:
                objArr[2] = "isEnum";
                break;
            case 149:
            case 150:
                objArr[2] = "isComparable";
                break;
            case 151:
                objArr[2] = "isCollectionOrNullableCollection";
                break;
            case 152:
                objArr[2] = "isListOrNullableList";
                break;
            case 153:
                objArr[2] = "isSetOrNullableSet";
                break;
            case 154:
                objArr[2] = "isMapOrNullableMap";
                break;
            case ModuleDescriptor.MODULE_VERSION /* 155 */:
                objArr[2] = "isIterableOrNullableIterable";
                break;
            case 156:
                objArr[2] = "isThrowableOrNullableThrowable";
                break;
            case 157:
                objArr[2] = "isThrowable";
                break;
            case 158:
                objArr[2] = "isKClass";
                break;
            case 159:
                objArr[2] = "isNonPrimitiveArray";
                break;
            case 160:
                objArr[2] = "isCloneable";
                break;
            case 161:
                objArr[2] = "isDeprecated";
                break;
            case 162:
                objArr[2] = "isNotNullOrNullableFunctionSupertype";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i10) {
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 11:
            case 13:
            case 15:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case Build.API_LEVELS.API_30 /* 30 */:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case DescriptorProtos$FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
            case DescriptorProtos$FileOptions.PHP_CLASS_PREFIX_FIELD_NUMBER /* 40 */:
            case DescriptorProtos$FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
            case DescriptorProtos$FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
            case 43:
            case DescriptorProtos$FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
            case DescriptorProtos$FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case PipesConfigBase.DEFAULT_STALE_FETCHER_DELAY_SECONDS /* 60 */:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 68:
            case 69:
            case 70:
            case 74:
            case 81:
            case 84:
            case 86:
            case 87:
                throw new IllegalStateException(str2);
            case 9:
            case 10:
            case 12:
            case 14:
            case 16:
            case 17:
            case 46:
            case 53:
            case 67:
            case 71:
            case 72:
            case 73:
            case 75:
            case 76:
            case 77:
            case 78:
            case 79:
            case 80:
            case 82:
            case 83:
            case 85:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    public static boolean a0(InterfaceC1177e interfaceC1177e) {
        if (interfaceC1177e == null) {
            a(108);
        }
        return e(interfaceC1177e, j.a.f5783b);
    }

    public static boolean b0(E e10) {
        if (e10 == null) {
            a(139);
        }
        return g0(e10, j.a.f5783b);
    }

    public static boolean c0(E e10) {
        if (e10 == null) {
            a(88);
        }
        return g0(e10, j.a.f5797i);
    }

    public static boolean d0(E e10) {
        if (e10 == null) {
            a(90);
        }
        return c0(e10) || p0(e10);
    }

    public static boolean e(InterfaceC1180h interfaceC1180h, kd.d dVar) {
        if (interfaceC1180h == null) {
            a(103);
        }
        if (dVar == null) {
            a(104);
        }
        return interfaceC1180h.getName().equals(dVar.i()) && dVar.equals(AbstractC5283e.m(interfaceC1180h));
    }

    public static boolean e0(InterfaceC1177e interfaceC1177e) {
        if (interfaceC1177e == null) {
            a(89);
        }
        return e(interfaceC1177e, j.a.f5797i) || P(interfaceC1177e) != null;
    }

    public static boolean f0(InterfaceC1185m interfaceC1185m) {
        if (interfaceC1185m == null) {
            a(9);
        }
        return AbstractC5283e.r(interfaceC1185m, Ic.b.class, false) != null;
    }

    public static boolean g0(E e10, kd.d dVar) {
        if (e10 == null) {
            a(97);
        }
        if (dVar == null) {
            a(98);
        }
        return v0(e10.N0(), dVar);
    }

    public static boolean h0(E e10, kd.d dVar) {
        if (e10 == null) {
            a(134);
        }
        if (dVar == null) {
            a(135);
        }
        return g0(e10, dVar) && !e10.O0();
    }

    public static boolean i0(E e10) {
        if (e10 == null) {
            a(141);
        }
        return o0(e10);
    }

    public static boolean j0(InterfaceC1185m interfaceC1185m) {
        if (interfaceC1185m == null) {
            a(161);
        }
        if (interfaceC1185m.a().getAnnotations().K(j.a.f5829y)) {
            return true;
        }
        if (interfaceC1185m instanceof U) {
            U u10 = (U) interfaceC1185m;
            boolean zL = u10.L();
            V vG = u10.g();
            W wH = u10.h();
            if (vG != null && j0(vG) && (!zL || (wH != null && j0(wH)))) {
                return true;
            }
        }
        return false;
    }

    public static boolean k0(InterfaceC1177e interfaceC1177e) {
        if (interfaceC1177e == null) {
            a(158);
        }
        return e(interfaceC1177e, j.a.f5798i0);
    }

    public static boolean l0(E e10, kd.d dVar) {
        if (e10 == null) {
            a(105);
        }
        if (dVar == null) {
            a(106);
        }
        return !e10.O0() && g0(e10, dVar);
    }

    public static boolean m0(E e10) {
        if (e10 == null) {
            a(136);
        }
        return n0(e10) && !q0.l(e10);
    }

    public static boolean n0(E e10) {
        if (e10 == null) {
            a(138);
        }
        return g0(e10, j.a.f5785c);
    }

    public static boolean o0(E e10) {
        if (e10 == null) {
            a(140);
        }
        return b0(e10) && e10.O0();
    }

    public static boolean p0(E e10) {
        if (e10 == null) {
            a(91);
        }
        InterfaceC1180h interfaceC1180hQ = e10.N0().q();
        return (interfaceC1180hQ == null || P(interfaceC1180hQ) == null) ? false : true;
    }

    public static boolean q0(InterfaceC1177e interfaceC1177e) {
        if (interfaceC1177e == null) {
            a(96);
        }
        return S(interfaceC1177e) != null;
    }

    public static boolean r0(E e10) {
        if (e10 == null) {
            a(94);
        }
        return !e10.O0() && s0(e10);
    }

    public static boolean s0(E e10) {
        if (e10 == null) {
            a(95);
        }
        InterfaceC1180h interfaceC1180hQ = e10.N0().q();
        return (interfaceC1180hQ instanceof InterfaceC1177e) && q0((InterfaceC1177e) interfaceC1180hQ);
    }

    public static boolean t0(InterfaceC1177e interfaceC1177e) {
        if (interfaceC1177e == null) {
            a(107);
        }
        return e(interfaceC1177e, j.a.f5783b) || e(interfaceC1177e, j.a.f5785c);
    }

    public static boolean u0(E e10) {
        return e10 != null && l0(e10, j.a.f5795h);
    }

    public static boolean v0(e0 e0Var, kd.d dVar) {
        if (e0Var == null) {
            a(Endpoint.TARGET_FIELD_NUMBER);
        }
        if (dVar == null) {
            a(102);
        }
        InterfaceC1180h interfaceC1180hQ = e0Var.q();
        return (interfaceC1180hQ instanceof InterfaceC1177e) && e(interfaceC1180hQ, dVar);
    }

    public static boolean w0(E e10) {
        if (e10 == null) {
            a(128);
        }
        return h0(e10, j.a.f5750C0.j());
    }

    public static boolean x0(E e10) {
        if (e10 == null) {
            a(130);
        }
        return h0(e10, j.a.f5754E0.j());
    }

    public static boolean y0(E e10) {
        if (e10 == null) {
            a(131);
        }
        return h0(e10, j.a.f5756F0.j());
    }

    public static boolean z0(E e10) {
        if (e10 == null) {
            a(129);
        }
        return h0(e10, j.a.f5752D0.j());
    }

    public M B() {
        M mR = R(h.FLOAT);
        if (mR == null) {
            a(60);
        }
        return mR;
    }

    public InterfaceC1177e C(int i10) {
        return p(j.b(i10));
    }

    public M D() {
        M mR = R(h.INT);
        if (mR == null) {
            a(58);
        }
        return mR;
    }

    public void D0(x xVar) {
        if (xVar == null) {
            a(1);
        }
        this.f5693f.e(new d(xVar));
    }

    public InterfaceC1177e E() {
        InterfaceC1177e interfaceC1177eO = o(j.a.f5798i0.l());
        if (interfaceC1177eO == null) {
            a(21);
        }
        return interfaceC1177eO;
    }

    public M F() {
        M mR = R(h.LONG);
        if (mR == null) {
            a(59);
        }
        return mR;
    }

    public InterfaceC1177e G() {
        return p("Nothing");
    }

    public M H() {
        M mP = G().p();
        if (mP == null) {
            a(48);
        }
        return mP;
    }

    public M I() {
        M mU0 = i().R0(true);
        if (mU0 == null) {
            a(51);
        }
        return mU0;
    }

    public M J() {
        M mU0 = H().R0(true);
        if (mU0 == null) {
            a(49);
        }
        return mU0;
    }

    public InterfaceC1177e K() {
        return p("Number");
    }

    public M L() {
        M mP = K().p();
        if (mP == null) {
            a(55);
        }
        return mP;
    }

    public Nc.c M() {
        c.b bVar = c.b.f10628a;
        if (bVar == null) {
            a(4);
        }
        return bVar;
    }

    public M O(h hVar) {
        if (hVar == null) {
            a(73);
        }
        M m10 = (M) ((e) this.f5690c.invoke()).f5699a.get(hVar);
        if (m10 == null) {
            a(74);
        }
        return m10;
    }

    public final InterfaceC1177e Q(h hVar) {
        if (hVar == null) {
            a(16);
        }
        return p(hVar.q().b());
    }

    public M R(h hVar) {
        if (hVar == null) {
            a(53);
        }
        M mP = Q(hVar).p();
        if (mP == null) {
            a(54);
        }
        return mP;
    }

    public M T() {
        M mR = R(h.SHORT);
        if (mR == null) {
            a(57);
        }
        return mR;
    }

    public Bd.n U() {
        Bd.n nVar = this.f5693f;
        if (nVar == null) {
            a(6);
        }
        return nVar;
    }

    public InterfaceC1177e V() {
        return p("String");
    }

    public M W() {
        M mP = V().p();
        if (mP == null) {
            a(65);
        }
        return mP;
    }

    public InterfaceC1177e X(int i10) {
        InterfaceC1177e interfaceC1177eO = o(j.f5731m.c(kd.f.s(j.d(i10))));
        if (interfaceC1177eO == null) {
            a(18);
        }
        return interfaceC1177eO;
    }

    public InterfaceC1177e Y() {
        return p("Unit");
    }

    public M Z() {
        M mP = Y().p();
        if (mP == null) {
            a(64);
        }
        return mP;
    }

    public void f(boolean z10) {
        x xVar = new x(f5687g, this.f5693f, this, null);
        this.f5688a = xVar;
        xVar.S0(Ic.a.f5679a.a().a(this.f5693f, this.f5688a, v(), M(), g(), z10));
        x xVar2 = this.f5688a;
        xVar2.Y0(xVar2);
    }

    public Nc.a g() {
        a.C0154a c0154a = a.C0154a.f10626a;
        if (c0154a == null) {
            a(3);
        }
        return c0154a;
    }

    public InterfaceC1177e h() {
        return p("Any");
    }

    public M i() {
        M mP = h().p();
        if (mP == null) {
            a(50);
        }
        return mP;
    }

    public InterfaceC1177e j() {
        return p("Array");
    }

    public E k(E e10) {
        E eA;
        if (e10 == null) {
            a(67);
        }
        if (c0(e10)) {
            if (e10.L0().size() != 1) {
                throw new IllegalStateException();
            }
            E type = ((i0) e10.L0().get(0)).getType();
            if (type == null) {
                a(68);
            }
            return type;
        }
        E eN = q0.n(e10);
        E e11 = (E) ((e) this.f5690c.invoke()).f5701c.get(eN);
        if (e11 != null) {
            return e11;
        }
        G gH = AbstractC5283e.h(eN);
        if (gH != null && (eA = A(eN, gH)) != null) {
            return eA;
        }
        throw new IllegalStateException("not array: " + e10);
    }

    public M l(u0 u0Var, E e10) {
        if (u0Var == null) {
            a(82);
        }
        if (e10 == null) {
            a(83);
        }
        M m10 = m(u0Var, e10, Mc.g.f9435K.b());
        if (m10 == null) {
            a(84);
        }
        return m10;
    }

    public M m(u0 u0Var, E e10, Mc.g gVar) {
        if (u0Var == null) {
            a(78);
        }
        if (e10 == null) {
            a(79);
        }
        if (gVar == null) {
            a(80);
        }
        M mG = F.g(b0.b(gVar), j(), Collections.singletonList(new k0(u0Var, e10)));
        if (mG == null) {
            a(81);
        }
        return mG;
    }

    public M n() {
        M mR = R(h.BOOLEAN);
        if (mR == null) {
            a(63);
        }
        return mR;
    }

    public InterfaceC1177e o(kd.c cVar) {
        if (cVar == null) {
            a(12);
        }
        InterfaceC1177e interfaceC1177eC = AbstractC1190s.c(r(), cVar, Tc.d.FROM_BUILTINS);
        if (interfaceC1177eC == null) {
            a(13);
        }
        return interfaceC1177eC;
    }

    public final InterfaceC1177e p(String str) {
        if (str == null) {
            a(14);
        }
        InterfaceC1177e interfaceC1177e = (InterfaceC1177e) this.f5692e.invoke(kd.f.s(str));
        if (interfaceC1177e == null) {
            a(15);
        }
        return interfaceC1177e;
    }

    public final M q(String str) {
        if (str == null) {
            a(46);
        }
        M mP = p(str).p();
        if (mP == null) {
            a(47);
        }
        return mP;
    }

    public x r() {
        if (this.f5688a == null) {
            this.f5688a = (x) this.f5689b.invoke();
        }
        x xVar = this.f5688a;
        if (xVar == null) {
            a(7);
        }
        return xVar;
    }

    public InterfaceC6099h s() {
        InterfaceC6099h interfaceC6099hO = r().z0(j.f5739u).o();
        if (interfaceC6099hO == null) {
            a(11);
        }
        return interfaceC6099hO;
    }

    public M t() {
        M mR = R(h.BYTE);
        if (mR == null) {
            a(56);
        }
        return mR;
    }

    public M u() {
        M mR = R(h.CHAR);
        if (mR == null) {
            a(62);
        }
        return mR;
    }

    public Iterable v() {
        List listSingletonList = Collections.singletonList(new Jc.a(this.f5693f, r()));
        if (listSingletonList == null) {
            a(5);
        }
        return listSingletonList;
    }

    public InterfaceC1177e w() {
        InterfaceC1177e interfaceC1177eO = o(j.a.f5775U);
        if (interfaceC1177eO == null) {
            a(34);
        }
        return interfaceC1177eO;
    }

    public InterfaceC1177e x() {
        return p("Comparable");
    }

    public M y() {
        M mI = I();
        if (mI == null) {
            a(52);
        }
        return mI;
    }

    public M z() {
        M mR = R(h.DOUBLE);
        if (mR == null) {
            a(61);
        }
        return mR;
    }
}
