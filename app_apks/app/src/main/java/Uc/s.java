package Uc;

import Lc.AbstractC1191t;
import Lc.AbstractC1192u;
import Lc.InterfaceC1185m;
import Lc.InterfaceC1189q;
import Lc.K;
import Lc.n0;
import io.sentry.metrics.MetricsUnit;
import io.sentry.protocol.ViewHierarchyNode;
import java.util.HashMap;
import java.util.Map;
import od.AbstractC5283e;
import wd.InterfaceC6195g;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AbstractC1192u f16939a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AbstractC1192u f16940b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AbstractC1192u f16941c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Map f16942d;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class a extends Lc.r {
        public a(n0 n0Var) {
            super(n0Var);
        }

        private static /* synthetic */ void g(int i10) {
            Object[] objArr = new Object[3];
            if (i10 != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities$1";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // Lc.AbstractC1192u
        public boolean e(InterfaceC6195g interfaceC6195g, InterfaceC1189q interfaceC1189q, InterfaceC1185m interfaceC1185m, boolean z10) {
            if (interfaceC1189q == null) {
                g(0);
            }
            if (interfaceC1185m == null) {
                g(1);
            }
            return s.d(interfaceC1189q, interfaceC1185m);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class b extends Lc.r {
        public b(n0 n0Var) {
            super(n0Var);
        }

        private static /* synthetic */ void g(int i10) {
            Object[] objArr = new Object[3];
            if (i10 != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities$2";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // Lc.AbstractC1192u
        public boolean e(InterfaceC6195g interfaceC6195g, InterfaceC1189q interfaceC1189q, InterfaceC1185m interfaceC1185m, boolean z10) {
            if (interfaceC1189q == null) {
                g(0);
            }
            if (interfaceC1185m == null) {
                g(1);
            }
            return s.e(interfaceC6195g, interfaceC1189q, interfaceC1185m);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class c extends Lc.r {
        public c(n0 n0Var) {
            super(n0Var);
        }

        private static /* synthetic */ void g(int i10) {
            Object[] objArr = new Object[3];
            if (i10 != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities$3";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // Lc.AbstractC1192u
        public boolean e(InterfaceC6195g interfaceC6195g, InterfaceC1189q interfaceC1189q, InterfaceC1185m interfaceC1185m, boolean z10) {
            if (interfaceC1189q == null) {
                g(0);
            }
            if (interfaceC1185m == null) {
                g(1);
            }
            return s.e(interfaceC6195g, interfaceC1189q, interfaceC1185m);
        }
    }

    static {
        a aVar = new a(Pc.a.f13291c);
        f16939a = aVar;
        b bVar = new b(Pc.c.f13293c);
        f16940b = bVar;
        c cVar = new c(Pc.b.f13292c);
        f16941c = cVar;
        f16942d = new HashMap();
        f(aVar);
        f(bVar);
        f(cVar);
    }

    public static /* synthetic */ void a(int i10) {
        String str = (i10 == 5 || i10 == 6) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 5 || i10 == 6) ? 2 : 3];
        switch (i10) {
            case 1:
                objArr[0] = "from";
                break;
            case 2:
                objArr[0] = "first";
                break;
            case 3:
                objArr[0] = MetricsUnit.Duration.SECOND;
                break;
            case 4:
                objArr[0] = ViewHierarchyNode.JsonKeys.VISIBILITY;
                break;
            case 5:
            case 6:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities";
                break;
            default:
                objArr[0] = "what";
                break;
        }
        if (i10 == 5 || i10 == 6) {
            objArr[1] = "toDescriptorVisibility";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities";
        }
        if (i10 == 2 || i10 == 3) {
            objArr[2] = "areInSamePackage";
        } else if (i10 == 4) {
            objArr[2] = "toDescriptorVisibility";
        } else if (i10 != 5 && i10 != 6) {
            objArr[2] = "isVisibleForProtectedAndPackage";
        }
        String str2 = String.format(str, objArr);
        if (i10 != 5 && i10 != 6) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public static boolean d(InterfaceC1185m interfaceC1185m, InterfaceC1185m interfaceC1185m2) {
        if (interfaceC1185m == null) {
            a(2);
        }
        if (interfaceC1185m2 == null) {
            a(3);
        }
        K k10 = (K) AbstractC5283e.r(interfaceC1185m, K.class, false);
        K k11 = (K) AbstractC5283e.r(interfaceC1185m2, K.class, false);
        return (k11 == null || k10 == null || !k10.e().equals(k11.e())) ? false : true;
    }

    public static boolean e(InterfaceC6195g interfaceC6195g, InterfaceC1189q interfaceC1189q, InterfaceC1185m interfaceC1185m) {
        if (interfaceC1189q == null) {
            a(0);
        }
        if (interfaceC1185m == null) {
            a(1);
        }
        if (d(AbstractC5283e.M(interfaceC1189q), interfaceC1185m)) {
            return true;
        }
        return AbstractC1191t.f8773c.e(interfaceC6195g, interfaceC1189q, interfaceC1185m, false);
    }

    public static void f(AbstractC1192u abstractC1192u) {
        f16942d.put(abstractC1192u.b(), abstractC1192u);
    }

    public static AbstractC1192u g(n0 n0Var) {
        if (n0Var == null) {
            a(4);
        }
        AbstractC1192u abstractC1192u = (AbstractC1192u) f16942d.get(n0Var);
        if (abstractC1192u != null) {
            return abstractC1192u;
        }
        AbstractC1192u abstractC1192uJ = AbstractC1191t.j(n0Var);
        if (abstractC1192uJ == null) {
            a(5);
        }
        return abstractC1192uJ;
    }
}
