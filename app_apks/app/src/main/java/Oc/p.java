package Oc;

import Cd.AbstractC0735s;
import Cd.l0;
import Cd.n0;
import Cd.u0;
import Lc.AbstractC1191t;
import Lc.AbstractC1192u;
import Lc.InterfaceC1173a;
import Lc.InterfaceC1174b;
import Lc.InterfaceC1185m;
import Lc.InterfaceC1187o;
import Lc.InterfaceC1196y;
import Lc.X;
import Lc.a0;
import Lc.f0;
import Lc.j0;
import Oc.L;
import com.google.protobuf.DescriptorProtos$FileOptions;
import gc.C4179C;
import io.flutter.Build;
import io.flutter.plugins.firebase.analytics.Constants;
import io.sentry.protocol.ViewHierarchyNode;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import od.AbstractC5282d;
import vc.InterfaceC6082a;
import wd.C6192d;
import wd.InterfaceC6194f;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class p extends AbstractC1817k implements InterfaceC1196y {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final InterfaceC1196y f12289A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final InterfaceC1174b.a f12290B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public InterfaceC1196y f12291C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public Map f12292D;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public List f12293e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public List f12294f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Cd.E f12295g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public List f12296h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public X f12297i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public X f12298j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Lc.D f12299k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public AbstractC1192u f12300l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f12301m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f12302n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f12303o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f12304p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f12305q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f12306r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f12307s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f12308t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f12309u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f12310v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f12311w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f12312x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Collection f12313y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public volatile InterfaceC6082a f12314z;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a implements InterfaceC6082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ n0 f12315a;

        public a(n0 n0Var) {
            this.f12315a = n0Var;
        }

        @Override // vc.InterfaceC6082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Collection invoke() {
            Md.e eVar = new Md.e();
            Iterator it = p.this.d().iterator();
            while (it.hasNext()) {
                eVar.add(((InterfaceC1196y) it.next()).c(this.f12315a));
            }
            return eVar;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class b implements InterfaceC6082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List f12317a;

        public b(List list) {
            this.f12317a = list;
        }

        @Override // vc.InterfaceC6082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public List invoke() {
            return this.f12317a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class c implements InterfaceC1196y.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public l0 f12318a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public InterfaceC1185m f12319b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Lc.D f12320c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public AbstractC1192u f12321d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public InterfaceC1196y f12322e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public InterfaceC1174b.a f12323f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public List f12324g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public List f12325h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public X f12326i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public X f12327j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public Cd.E f12328k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public kd.f f12329l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public boolean f12330m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public boolean f12331n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public boolean f12332o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public boolean f12333p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public boolean f12334q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public List f12335r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public Mc.g f12336s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public boolean f12337t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Map f12338u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public Boolean f12339v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public boolean f12340w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public final /* synthetic */ p f12341x;

        public c(p pVar, l0 l0Var, InterfaceC1185m interfaceC1185m, Lc.D d10, AbstractC1192u abstractC1192u, InterfaceC1174b.a aVar, List list, List list2, X x10, Cd.E e10, kd.f fVar) {
            if (l0Var == null) {
                u(0);
            }
            if (interfaceC1185m == null) {
                u(1);
            }
            if (d10 == null) {
                u(2);
            }
            if (abstractC1192u == null) {
                u(3);
            }
            if (aVar == null) {
                u(4);
            }
            if (list == null) {
                u(5);
            }
            if (list2 == null) {
                u(6);
            }
            if (e10 == null) {
                u(7);
            }
            this.f12341x = pVar;
            this.f12322e = null;
            this.f12327j = pVar.f12298j;
            this.f12330m = true;
            this.f12331n = false;
            this.f12332o = false;
            this.f12333p = false;
            this.f12334q = pVar.B0();
            this.f12335r = null;
            this.f12336s = null;
            this.f12337t = pVar.F0();
            this.f12338u = new LinkedHashMap();
            this.f12339v = null;
            this.f12340w = false;
            this.f12318a = l0Var;
            this.f12319b = interfaceC1185m;
            this.f12320c = d10;
            this.f12321d = abstractC1192u;
            this.f12323f = aVar;
            this.f12324g = list;
            this.f12325h = list2;
            this.f12326i = x10;
            this.f12328k = e10;
            this.f12329l = fVar;
        }

        public static /* synthetic */ void u(int i10) {
            String str;
            int i11;
            switch (i10) {
                case 9:
                case 11:
                case 13:
                case 15:
                case 16:
                case 18:
                case 20:
                case 22:
                case 24:
                case 26:
                case 27:
                case 28:
                case 29:
                case Build.API_LEVELS.API_30 /* 30 */:
                case 31:
                case 32:
                case 33:
                case 34:
                case 36:
                case 38:
                case DescriptorProtos$FileOptions.PHP_CLASS_PREFIX_FIELD_NUMBER /* 40 */:
                case DescriptorProtos$FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
                case DescriptorProtos$FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
                    str = "@NotNull method %s.%s must not return null";
                    break;
                case 10:
                case 12:
                case 14:
                case 17:
                case 19:
                case 21:
                case 23:
                case 25:
                case 35:
                case 37:
                case DescriptorProtos$FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
            switch (i10) {
                case 9:
                case 11:
                case 13:
                case 15:
                case 16:
                case 18:
                case 20:
                case 22:
                case 24:
                case 26:
                case 27:
                case 28:
                case 29:
                case Build.API_LEVELS.API_30 /* 30 */:
                case 31:
                case 32:
                case 33:
                case 34:
                case 36:
                case 38:
                case DescriptorProtos$FileOptions.PHP_CLASS_PREFIX_FIELD_NUMBER /* 40 */:
                case DescriptorProtos$FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
                case DescriptorProtos$FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
                    i11 = 2;
                    break;
                case 10:
                case 12:
                case 14:
                case 17:
                case 19:
                case 21:
                case 23:
                case 25:
                case 35:
                case 37:
                case DescriptorProtos$FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                default:
                    i11 = 3;
                    break;
            }
            Object[] objArr = new Object[i11];
            switch (i10) {
                case 1:
                    objArr[0] = "newOwner";
                    break;
                case 2:
                    objArr[0] = "newModality";
                    break;
                case 3:
                    objArr[0] = "newVisibility";
                    break;
                case 4:
                case 14:
                    objArr[0] = "kind";
                    break;
                case 5:
                    objArr[0] = "newValueParameterDescriptors";
                    break;
                case 6:
                    objArr[0] = "newContextReceiverParameters";
                    break;
                case 7:
                    objArr[0] = "newReturnType";
                    break;
                case 8:
                    objArr[0] = "owner";
                    break;
                case 9:
                case 11:
                case 13:
                case 15:
                case 16:
                case 18:
                case 20:
                case 22:
                case 24:
                case 26:
                case 27:
                case 28:
                case 29:
                case Build.API_LEVELS.API_30 /* 30 */:
                case 31:
                case 32:
                case 33:
                case 34:
                case 36:
                case 38:
                case DescriptorProtos$FileOptions.PHP_CLASS_PREFIX_FIELD_NUMBER /* 40 */:
                case DescriptorProtos$FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
                case DescriptorProtos$FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl$CopyConfiguration";
                    break;
                case 10:
                    objArr[0] = "modality";
                    break;
                case 12:
                    objArr[0] = ViewHierarchyNode.JsonKeys.VISIBILITY;
                    break;
                case 17:
                    objArr[0] = "name";
                    break;
                case 19:
                case 21:
                    objArr[0] = Constants.PARAMETERS;
                    break;
                case 23:
                    objArr[0] = "type";
                    break;
                case 25:
                    objArr[0] = "contextReceiverParameters";
                    break;
                case 35:
                    objArr[0] = "additionalAnnotations";
                    break;
                case 37:
                default:
                    objArr[0] = "substitution";
                    break;
                case DescriptorProtos$FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                    objArr[0] = "userDataKey";
                    break;
            }
            switch (i10) {
                case 9:
                    objArr[1] = "setOwner";
                    break;
                case 10:
                case 12:
                case 14:
                case 17:
                case 19:
                case 21:
                case 23:
                case 25:
                case 35:
                case 37:
                case DescriptorProtos$FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                default:
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl$CopyConfiguration";
                    break;
                case 11:
                    objArr[1] = "setModality";
                    break;
                case 13:
                    objArr[1] = "setVisibility";
                    break;
                case 15:
                    objArr[1] = "setKind";
                    break;
                case 16:
                    objArr[1] = "setCopyOverrides";
                    break;
                case 18:
                    objArr[1] = "setName";
                    break;
                case 20:
                    objArr[1] = "setValueParameters";
                    break;
                case 22:
                    objArr[1] = "setTypeParameters";
                    break;
                case 24:
                    objArr[1] = "setReturnType";
                    break;
                case 26:
                    objArr[1] = "setContextReceiverParameters";
                    break;
                case 27:
                    objArr[1] = "setExtensionReceiverParameter";
                    break;
                case 28:
                    objArr[1] = "setDispatchReceiverParameter";
                    break;
                case 29:
                    objArr[1] = "setOriginal";
                    break;
                case Build.API_LEVELS.API_30 /* 30 */:
                    objArr[1] = "setSignatureChange";
                    break;
                case 31:
                    objArr[1] = "setPreserveSourceElement";
                    break;
                case 32:
                    objArr[1] = "setDropOriginalInContainingParts";
                    break;
                case 33:
                    objArr[1] = "setHiddenToOvercomeSignatureClash";
                    break;
                case 34:
                    objArr[1] = "setHiddenForResolutionEverywhereBesideSupercalls";
                    break;
                case 36:
                    objArr[1] = "setAdditionalAnnotations";
                    break;
                case 38:
                    objArr[1] = "setSubstitution";
                    break;
                case DescriptorProtos$FileOptions.PHP_CLASS_PREFIX_FIELD_NUMBER /* 40 */:
                    objArr[1] = "putUserData";
                    break;
                case DescriptorProtos$FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
                    objArr[1] = "getSubstitution";
                    break;
                case DescriptorProtos$FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
                    objArr[1] = "setJustForTypeSubstitution";
                    break;
            }
            switch (i10) {
                case 8:
                    objArr[2] = "setOwner";
                    break;
                case 9:
                case 11:
                case 13:
                case 15:
                case 16:
                case 18:
                case 20:
                case 22:
                case 24:
                case 26:
                case 27:
                case 28:
                case 29:
                case Build.API_LEVELS.API_30 /* 30 */:
                case 31:
                case 32:
                case 33:
                case 34:
                case 36:
                case 38:
                case DescriptorProtos$FileOptions.PHP_CLASS_PREFIX_FIELD_NUMBER /* 40 */:
                case DescriptorProtos$FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
                case DescriptorProtos$FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
                    break;
                case 10:
                    objArr[2] = "setModality";
                    break;
                case 12:
                    objArr[2] = "setVisibility";
                    break;
                case 14:
                    objArr[2] = "setKind";
                    break;
                case 17:
                    objArr[2] = "setName";
                    break;
                case 19:
                    objArr[2] = "setValueParameters";
                    break;
                case 21:
                    objArr[2] = "setTypeParameters";
                    break;
                case 23:
                    objArr[2] = "setReturnType";
                    break;
                case 25:
                    objArr[2] = "setContextReceiverParameters";
                    break;
                case 35:
                    objArr[2] = "setAdditionalAnnotations";
                    break;
                case 37:
                    objArr[2] = "setSubstitution";
                    break;
                case DescriptorProtos$FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                    objArr[2] = "putUserData";
                    break;
                default:
                    objArr[2] = "<init>";
                    break;
            }
            String str2 = String.format(str, objArr);
            switch (i10) {
                case 9:
                case 11:
                case 13:
                case 15:
                case 16:
                case 18:
                case 20:
                case 22:
                case 24:
                case 26:
                case 27:
                case 28:
                case 29:
                case Build.API_LEVELS.API_30 /* 30 */:
                case 31:
                case 32:
                case 33:
                case 34:
                case 36:
                case 38:
                case DescriptorProtos$FileOptions.PHP_CLASS_PREFIX_FIELD_NUMBER /* 40 */:
                case DescriptorProtos$FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
                case DescriptorProtos$FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
                    throw new IllegalStateException(str2);
                case 10:
                case 12:
                case 14:
                case 17:
                case 19:
                case 21:
                case 23:
                case 25:
                case 35:
                case 37:
                case DescriptorProtos$FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                default:
                    throw new IllegalArgumentException(str2);
            }
        }

        @Override // Lc.InterfaceC1196y.a
        /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
        public c s(Mc.g gVar) {
            if (gVar == null) {
                u(35);
            }
            this.f12336s = gVar;
            return this;
        }

        @Override // Lc.InterfaceC1196y.a
        /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
        public c q(boolean z10) {
            this.f12330m = z10;
            return this;
        }

        @Override // Lc.InterfaceC1196y.a
        /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
        public c d(X x10) {
            this.f12327j = x10;
            return this;
        }

        @Override // Lc.InterfaceC1196y.a
        /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
        public c a() {
            this.f12333p = true;
            return this;
        }

        @Override // Lc.InterfaceC1196y.a
        /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
        public c i(X x10) {
            this.f12326i = x10;
            return this;
        }

        public c G(boolean z10) {
            this.f12339v = Boolean.valueOf(z10);
            return this;
        }

        @Override // Lc.InterfaceC1196y.a
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public c f() {
            this.f12337t = true;
            return this;
        }

        @Override // Lc.InterfaceC1196y.a
        /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
        public c j() {
            this.f12334q = true;
            return this;
        }

        public c J(boolean z10) {
            this.f12340w = z10;
            return this;
        }

        @Override // Lc.InterfaceC1196y.a
        /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
        public c n(InterfaceC1174b.a aVar) {
            if (aVar == null) {
                u(14);
            }
            this.f12323f = aVar;
            return this;
        }

        @Override // Lc.InterfaceC1196y.a
        /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
        public c b(Lc.D d10) {
            if (d10 == null) {
                u(10);
            }
            this.f12320c = d10;
            return this;
        }

        @Override // Lc.InterfaceC1196y.a
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public c p(kd.f fVar) {
            if (fVar == null) {
                u(17);
            }
            this.f12329l = fVar;
            return this;
        }

        @Override // Lc.InterfaceC1196y.a
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public c k(InterfaceC1174b interfaceC1174b) {
            this.f12322e = (InterfaceC1196y) interfaceC1174b;
            return this;
        }

        @Override // Lc.InterfaceC1196y.a
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public c l(InterfaceC1185m interfaceC1185m) {
            if (interfaceC1185m == null) {
                u(8);
            }
            this.f12319b = interfaceC1185m;
            return this;
        }

        @Override // Lc.InterfaceC1196y.a
        /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
        public c o() {
            this.f12332o = true;
            return this;
        }

        @Override // Lc.InterfaceC1196y.a
        /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
        public c h(Cd.E e10) {
            if (e10 == null) {
                u(23);
            }
            this.f12328k = e10;
            return this;
        }

        @Override // Lc.InterfaceC1196y.a
        /* JADX INFO: renamed from: R, reason: merged with bridge method [inline-methods] */
        public c t() {
            this.f12331n = true;
            return this;
        }

        @Override // Lc.InterfaceC1196y.a
        /* JADX INFO: renamed from: S, reason: merged with bridge method [inline-methods] */
        public c e(l0 l0Var) {
            if (l0Var == null) {
                u(37);
            }
            this.f12318a = l0Var;
            return this;
        }

        @Override // Lc.InterfaceC1196y.a
        /* JADX INFO: renamed from: T, reason: merged with bridge method [inline-methods] */
        public c r(List list) {
            if (list == null) {
                u(21);
            }
            this.f12335r = list;
            return this;
        }

        @Override // Lc.InterfaceC1196y.a
        /* JADX INFO: renamed from: U, reason: merged with bridge method [inline-methods] */
        public c c(List list) {
            if (list == null) {
                u(19);
            }
            this.f12324g = list;
            return this;
        }

        @Override // Lc.InterfaceC1196y.a
        /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
        public c m(AbstractC1192u abstractC1192u) {
            if (abstractC1192u == null) {
                u(12);
            }
            this.f12321d = abstractC1192u;
            return this;
        }

        @Override // Lc.InterfaceC1196y.a
        public InterfaceC1196y build() {
            return this.f12341x.M0(this);
        }

        @Override // Lc.InterfaceC1196y.a
        public InterfaceC1196y.a g(InterfaceC1173a.InterfaceC0132a interfaceC0132a, Object obj) {
            if (interfaceC0132a == null) {
                u(39);
            }
            this.f12338u.put(interfaceC0132a, obj);
            return this;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(InterfaceC1185m interfaceC1185m, InterfaceC1196y interfaceC1196y, Mc.g gVar, kd.f fVar, InterfaceC1174b.a aVar, a0 a0Var) {
        super(interfaceC1185m, gVar, fVar, a0Var);
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
        this.f12300l = AbstractC1191t.f8779i;
        this.f12301m = false;
        this.f12302n = false;
        this.f12303o = false;
        this.f12304p = false;
        this.f12305q = false;
        this.f12306r = false;
        this.f12307s = false;
        this.f12308t = false;
        this.f12309u = false;
        this.f12310v = false;
        this.f12311w = true;
        this.f12312x = false;
        this.f12313y = null;
        this.f12314z = null;
        this.f12291C = null;
        this.f12292D = null;
        this.f12289A = interfaceC1196y == null ? this : interfaceC1196y;
        this.f12290B = aVar;
    }

    public static List O0(InterfaceC1196y interfaceC1196y, List list, n0 n0Var) {
        if (list == null) {
            g0(28);
        }
        if (n0Var == null) {
            g0(29);
        }
        return P0(interfaceC1196y, list, n0Var, false, false, null);
    }

    public static List P0(InterfaceC1196y interfaceC1196y, List list, n0 n0Var, boolean z10, boolean z11, boolean[] zArr) {
        if (list == null) {
            g0(30);
        }
        if (n0Var == null) {
            g0(31);
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            j0 j0Var = (j0) it.next();
            Cd.E type = j0Var.getType();
            u0 u0Var = u0.IN_VARIANCE;
            Cd.E eP = n0Var.p(type, u0Var);
            Cd.E eS0 = j0Var.s0();
            Cd.E eP2 = eS0 == null ? null : n0Var.p(eS0, u0Var);
            if (eP == null) {
                return null;
            }
            if ((eP != j0Var.getType() || eS0 != eP2) && zArr != null) {
                zArr[0] = true;
            }
            arrayList.add(L.K0(interfaceC1196y, z10 ? null : j0Var, j0Var.getIndex(), j0Var.getAnnotations(), j0Var.getName(), eP, j0Var.x0(), j0Var.p0(), j0Var.o0(), eP2, z11 ? j0Var.j() : a0.f8746a, j0Var instanceof L.b ? new b(((L.b) j0Var).N0()) : null));
        }
        return arrayList;
    }

    private void d1(InterfaceC1196y interfaceC1196y) {
        this.f12291C = interfaceC1196y;
    }

    private static /* synthetic */ void g0(int i10) {
        String str;
        int i11;
        switch (i10) {
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            case 26:
            case 27:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 10:
            case 11:
            case 12:
            case 17:
            case 22:
            case 24:
            case 25:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i10) {
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            case 26:
            case 27:
                i11 = 2;
                break;
            case 10:
            case 11:
            case 12:
            case 17:
            case 22:
            case 24:
            case 25:
            default:
                i11 = 3;
                break;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
                objArr[0] = "annotations";
                break;
            case 2:
                objArr[0] = "name";
                break;
            case 3:
                objArr[0] = "kind";
                break;
            case 4:
                objArr[0] = "source";
                break;
            case 5:
                objArr[0] = "contextReceiverParameters";
                break;
            case 6:
                objArr[0] = "typeParameters";
                break;
            case 7:
            case 28:
            case Build.API_LEVELS.API_30 /* 30 */:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 8:
            case 10:
                objArr[0] = ViewHierarchyNode.JsonKeys.VISIBILITY;
                break;
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            case 26:
            case 27:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl";
                break;
            case 11:
                objArr[0] = "unsubstitutedReturnType";
                break;
            case 12:
                objArr[0] = "extensionReceiverParameter";
                break;
            case 17:
                objArr[0] = "overriddenDescriptors";
                break;
            case 22:
                objArr[0] = "originalSubstitutor";
                break;
            case 24:
            case 29:
            case 31:
                objArr[0] = "substitutor";
                break;
            case 25:
                objArr[0] = "configuration";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i10) {
            case 9:
                objArr[1] = "initialize";
                break;
            case 10:
            case 11:
            case 12:
            case 17:
            case 22:
            case 24:
            case 25:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl";
                break;
            case 13:
                objArr[1] = "getContextReceiverParameters";
                break;
            case 14:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 15:
                objArr[1] = "getModality";
                break;
            case 16:
                objArr[1] = "getVisibility";
                break;
            case 18:
                objArr[1] = "getTypeParameters";
                break;
            case 19:
                objArr[1] = "getValueParameters";
                break;
            case 20:
                objArr[1] = "getOriginal";
                break;
            case 21:
                objArr[1] = "getKind";
                break;
            case 23:
                objArr[1] = "newCopyBuilder";
                break;
            case 26:
                objArr[1] = "copy";
                break;
            case 27:
                objArr[1] = "getSourceToUseForCopy";
                break;
        }
        switch (i10) {
            case 5:
            case 6:
            case 7:
            case 8:
                objArr[2] = "initialize";
                break;
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            case 26:
            case 27:
                break;
            case 10:
                objArr[2] = "setVisibility";
                break;
            case 11:
                objArr[2] = "setReturnType";
                break;
            case 12:
                objArr[2] = "setExtensionReceiverParameter";
                break;
            case 17:
                objArr[2] = "setOverriddenDescriptors";
                break;
            case 22:
                objArr[2] = "substitute";
                break;
            case 24:
                objArr[2] = "newCopyBuilder";
                break;
            case 25:
                objArr[2] = "doSubstitute";
                break;
            case 28:
            case 29:
            case Build.API_LEVELS.API_30 /* 30 */:
            case 31:
                objArr[2] = "getSubstitutedValueParameters";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i10) {
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            case 26:
            case 27:
                throw new IllegalStateException(str2);
            case 10:
            case 11:
            case 12:
            case 17:
            case 22:
            case 24:
            case 25:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    public boolean B() {
        return this.f12305q;
    }

    @Override // Lc.InterfaceC1196y
    public boolean B0() {
        return this.f12308t;
    }

    public void C0(Collection collection) {
        if (collection == null) {
            g0(17);
        }
        this.f12313y = collection;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (((InterfaceC1196y) it.next()).F0()) {
                this.f12309u = true;
                return;
            }
        }
    }

    @Override // Lc.InterfaceC1196y
    public boolean F0() {
        return this.f12309u;
    }

    @Override // Lc.InterfaceC1173a
    public X J() {
        return this.f12298j;
    }

    public InterfaceC1196y K0(InterfaceC1185m interfaceC1185m, Lc.D d10, AbstractC1192u abstractC1192u, InterfaceC1174b.a aVar, boolean z10) {
        InterfaceC1196y interfaceC1196yBuild = u().l(interfaceC1185m).b(d10).m(abstractC1192u).n(aVar).q(z10).build();
        if (interfaceC1196yBuild == null) {
            g0(26);
        }
        return interfaceC1196yBuild;
    }

    public abstract p L0(InterfaceC1185m interfaceC1185m, InterfaceC1196y interfaceC1196y, InterfaceC1174b.a aVar, kd.f fVar, Mc.g gVar, a0 a0Var);

    @Override // Lc.InterfaceC1173a
    public X M() {
        return this.f12297i;
    }

    public InterfaceC1196y M0(c cVar) {
        int i10;
        F f10;
        InterfaceC1196y interfaceC1196y;
        Cd.E eP;
        if (cVar == null) {
            g0(25);
        }
        boolean[] zArr = new boolean[1];
        Mc.g gVarA = cVar.f12336s != null ? Mc.i.a(getAnnotations(), cVar.f12336s) : getAnnotations();
        InterfaceC1185m interfaceC1185m = cVar.f12319b;
        InterfaceC1196y interfaceC1196y2 = cVar.f12322e;
        p pVarL0 = L0(interfaceC1185m, interfaceC1196y2, cVar.f12323f, cVar.f12329l, gVarA, N0(cVar.f12332o, interfaceC1196y2));
        List typeParameters = cVar.f12335r == null ? getTypeParameters() : cVar.f12335r;
        zArr[0] = (zArr[0] ? 1 : 0) | (!typeParameters.isEmpty() ? 1 : 0);
        ArrayList arrayList = new ArrayList(typeParameters.size());
        n0 n0VarC = AbstractC0735s.c(typeParameters, cVar.f12318a, pVarL0, arrayList, zArr);
        X x10 = null;
        if (n0VarC == null) {
            return null;
        }
        ArrayList arrayList2 = new ArrayList();
        if (!cVar.f12325h.isEmpty()) {
            for (X x11 : cVar.f12325h) {
                Cd.E eP2 = n0VarC.p(x11.getType(), u0.IN_VARIANCE);
                if (eP2 == null) {
                    return null;
                }
                arrayList2.add(AbstractC5282d.b(pVarL0, eP2, ((InterfaceC6194f) x11.getValue()).a(), x11.getAnnotations()));
                zArr[0] = (eP2 != x11.getType() ? 1 : 0) | (zArr[0] ? 1 : 0);
            }
        }
        X x12 = cVar.f12326i;
        if (x12 != null) {
            Cd.E eP3 = n0VarC.p(x12.getType(), u0.IN_VARIANCE);
            if (eP3 == null) {
                return null;
            }
            F f11 = new F(pVarL0, new C6192d(pVarL0, eP3, cVar.f12326i.getValue()), cVar.f12326i.getAnnotations());
            zArr[0] = (eP3 != cVar.f12326i.getType() ? 1 : 0) | (zArr[0] ? 1 : 0);
            i10 = 0;
            f10 = f11;
        } else {
            i10 = 0;
            f10 = null;
        }
        X x13 = cVar.f12327j;
        if (x13 != null) {
            X xC = x13.c(n0VarC);
            if (xC == null) {
                return null;
            }
            zArr[i10] = (zArr[i10] ? 1 : 0) | (xC != cVar.f12327j ? 1 : i10);
            interfaceC1196y = null;
            x10 = xC;
        } else {
            interfaceC1196y = null;
        }
        List listP0 = P0(pVarL0, cVar.f12324g, n0VarC, cVar.f12333p, cVar.f12332o, zArr);
        if (listP0 == null || (eP = n0VarC.p(cVar.f12328k, u0.OUT_VARIANCE)) == null) {
            return interfaceC1196y;
        }
        boolean z10 = (zArr[i10] ? 1 : 0) | (eP != cVar.f12328k ? 1 : i10);
        zArr[i10] = z10;
        if (z10 == 0 && cVar.f12340w) {
            return this;
        }
        pVarL0.R0(f10, x10, arrayList2, arrayList, listP0, eP, cVar.f12320c, cVar.f12321d);
        pVarL0.f1(this.f12301m);
        pVarL0.c1(this.f12302n);
        pVarL0.X0(this.f12303o);
        pVarL0.e1(this.f12304p);
        pVarL0.i1(this.f12305q);
        pVarL0.h1(this.f12310v);
        pVarL0.W0(this.f12306r);
        pVarL0.V0(this.f12307s);
        pVarL0.Y0(this.f12311w);
        pVarL0.b1(cVar.f12334q);
        pVarL0.a1(cVar.f12337t);
        pVarL0.Z0(cVar.f12339v != null ? cVar.f12339v.booleanValue() : this.f12312x);
        if (!cVar.f12338u.isEmpty() || this.f12292D != null) {
            Map map = cVar.f12338u;
            Map map2 = this.f12292D;
            if (map2 != null) {
                for (Map.Entry entry : map2.entrySet()) {
                    if (!map.containsKey(entry.getKey())) {
                        map.put(entry.getKey(), entry.getValue());
                    }
                }
            }
            if (map.size() == 1) {
                pVarL0.f12292D = Collections.singletonMap(map.keySet().iterator().next(), map.values().iterator().next());
            } else {
                pVarL0.f12292D = map;
            }
        }
        if (cVar.f12331n || q0() != null) {
            pVarL0.d1((q0() != null ? q0() : this).c(n0VarC));
        }
        if (cVar.f12330m && !a().d().isEmpty()) {
            if (cVar.f12318a.f()) {
                InterfaceC6082a interfaceC6082a = this.f12314z;
                if (interfaceC6082a != null) {
                    pVarL0.f12314z = interfaceC6082a;
                    return pVarL0;
                }
                pVarL0.C0(d());
                return pVarL0;
            }
            pVarL0.f12314z = new a(n0VarC);
        }
        return pVarL0;
    }

    public final a0 N0(boolean z10, InterfaceC1196y interfaceC1196y) {
        a0 a0VarJ;
        if (z10) {
            if (interfaceC1196y == null) {
                interfaceC1196y = a();
            }
            a0VarJ = interfaceC1196y.j();
        } else {
            a0VarJ = a0.f8746a;
        }
        if (a0VarJ == null) {
            g0(27);
        }
        return a0VarJ;
    }

    public boolean Q0() {
        return this.f12311w;
    }

    public p R0(X x10, X x11, List list, List list2, List list3, Cd.E e10, Lc.D d10, AbstractC1192u abstractC1192u) {
        if (list == null) {
            g0(5);
        }
        if (list2 == null) {
            g0(6);
        }
        if (list3 == null) {
            g0(7);
        }
        if (abstractC1192u == null) {
            g0(8);
        }
        this.f12293e = C4179C.V0(list2);
        this.f12294f = C4179C.V0(list3);
        this.f12295g = e10;
        this.f12299k = d10;
        this.f12300l = abstractC1192u;
        this.f12297i = x10;
        this.f12298j = x11;
        this.f12296h = list;
        for (int i10 = 0; i10 < list2.size(); i10++) {
            f0 f0Var = (f0) list2.get(i10);
            if (f0Var.getIndex() != i10) {
                throw new IllegalStateException(f0Var + " index is " + f0Var.getIndex() + " but position is " + i10);
            }
        }
        for (int i11 = 0; i11 < list3.size(); i11++) {
            j0 j0Var = (j0) list3.get(i11);
            if (j0Var.getIndex() != i11) {
                throw new IllegalStateException(j0Var + "index is " + j0Var.getIndex() + " but position is " + i11);
            }
        }
        return this;
    }

    public c S0(n0 n0Var) {
        if (n0Var == null) {
            g0(24);
        }
        return new c(this, n0Var.j(), b(), r(), getVisibility(), f(), i(), u0(), M(), getReturnType(), null);
    }

    public final void T0() {
        InterfaceC6082a interfaceC6082a = this.f12314z;
        if (interfaceC6082a != null) {
            this.f12313y = (Collection) interfaceC6082a.invoke();
            this.f12314z = null;
        }
    }

    public void U0(InterfaceC1173a.InterfaceC0132a interfaceC0132a, Object obj) {
        if (this.f12292D == null) {
            this.f12292D = new LinkedHashMap();
        }
        this.f12292D.put(interfaceC0132a, obj);
    }

    @Override // Lc.C
    public boolean V() {
        return this.f12307s;
    }

    public void V0(boolean z10) {
        this.f12307s = z10;
    }

    public void W0(boolean z10) {
        this.f12306r = z10;
    }

    public void X0(boolean z10) {
        this.f12303o = z10;
    }

    public void Y0(boolean z10) {
        this.f12311w = z10;
    }

    public void Z0(boolean z10) {
        this.f12312x = z10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [Lc.y] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    @Override // Oc.AbstractC1817k, Oc.AbstractC1816j, Lc.InterfaceC1185m
    public InterfaceC1196y a() {
        InterfaceC1196y interfaceC1196y = this.f12289A;
        ?? A10 = this;
        if (interfaceC1196y != this) {
            A10 = interfaceC1196y.a();
        }
        if (A10 == 0) {
            g0(20);
        }
        return A10;
    }

    public final void a1(boolean z10) {
        this.f12309u = z10;
    }

    public final void b1(boolean z10) {
        this.f12308t = z10;
    }

    public void c1(boolean z10) {
        this.f12302n = z10;
    }

    public Collection d() {
        T0();
        Collection collection = this.f12313y;
        if (collection == null) {
            collection = Collections.EMPTY_LIST;
        }
        if (collection == null) {
            g0(14);
        }
        return collection;
    }

    public void e1(boolean z10) {
        this.f12304p = z10;
    }

    @Override // Lc.InterfaceC1174b
    public InterfaceC1174b.a f() {
        InterfaceC1174b.a aVar = this.f12290B;
        if (aVar == null) {
            g0(21);
        }
        return aVar;
    }

    @Override // Lc.InterfaceC1173a
    public boolean f0() {
        return this.f12312x;
    }

    public void f1(boolean z10) {
        this.f12301m = z10;
    }

    public void g1(Cd.E e10) {
        if (e10 == null) {
            g0(11);
        }
        this.f12295g = e10;
    }

    public Cd.E getReturnType() {
        return this.f12295g;
    }

    @Override // Lc.InterfaceC1173a
    public List getTypeParameters() {
        List list = this.f12293e;
        if (list != null) {
            return list;
        }
        throw new IllegalStateException("typeParameters == null for " + this);
    }

    @Override // Lc.InterfaceC1189q, Lc.C
    public AbstractC1192u getVisibility() {
        AbstractC1192u abstractC1192u = this.f12300l;
        if (abstractC1192u == null) {
            g0(16);
        }
        return abstractC1192u;
    }

    public void h1(boolean z10) {
        this.f12310v = z10;
    }

    @Override // Lc.InterfaceC1173a
    public List i() {
        List list = this.f12294f;
        if (list == null) {
            g0(19);
        }
        return list;
    }

    public void i1(boolean z10) {
        this.f12305q = z10;
    }

    public boolean isExternal() {
        return this.f12303o;
    }

    @Override // Lc.InterfaceC1196y
    public boolean isInfix() {
        if (this.f12302n) {
            return true;
        }
        Iterator it = a().d().iterator();
        while (it.hasNext()) {
            if (((InterfaceC1196y) it.next()).isInfix()) {
                return true;
            }
        }
        return false;
    }

    public boolean isInline() {
        return this.f12304p;
    }

    @Override // Lc.InterfaceC1196y
    public boolean isOperator() {
        if (this.f12301m) {
            return true;
        }
        Iterator it = a().d().iterator();
        while (it.hasNext()) {
            if (((InterfaceC1196y) it.next()).isOperator()) {
                return true;
            }
        }
        return false;
    }

    public boolean isSuspend() {
        return this.f12310v;
    }

    public Object j0(InterfaceC1187o interfaceC1187o, Object obj) {
        return interfaceC1187o.j(this, obj);
    }

    public void j1(AbstractC1192u abstractC1192u) {
        if (abstractC1192u == null) {
            g0(10);
        }
        this.f12300l = abstractC1192u;
    }

    @Override // Lc.C
    public boolean k0() {
        return this.f12306r;
    }

    @Override // Lc.InterfaceC1196y
    public InterfaceC1196y q0() {
        return this.f12291C;
    }

    @Override // Lc.C
    public Lc.D r() {
        Lc.D d10 = this.f12299k;
        if (d10 == null) {
            g0(15);
        }
        return d10;
    }

    public InterfaceC1196y.a u() {
        c cVarS0 = S0(n0.f1385b);
        if (cVarS0 == null) {
            g0(23);
        }
        return cVarS0;
    }

    @Override // Lc.InterfaceC1173a
    public List u0() {
        List list = this.f12296h;
        if (list == null) {
            g0(13);
        }
        return list;
    }

    public Object y0(InterfaceC1173a.InterfaceC0132a interfaceC0132a) {
        Map map = this.f12292D;
        if (map == null) {
            return null;
        }
        return map.get(interfaceC0132a);
    }

    @Override // Lc.InterfaceC1196y, Lc.c0
    public InterfaceC1196y c(n0 n0Var) {
        if (n0Var == null) {
            g0(22);
        }
        return n0Var.k() ? this : S0(n0Var).k(a()).o().J(true).build();
    }
}
