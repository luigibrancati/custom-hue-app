package Lc;

import Cd.AbstractC0737u;
import Jd.l;
import Lc.m0;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.ServiceLoader;
import java.util.Set;
import od.AbstractC5283e;
import wd.InterfaceC6195g;
import wd.InterfaceC6196h;

/* JADX INFO: renamed from: Lc.t, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC1191t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AbstractC1192u f8771a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AbstractC1192u f8772b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AbstractC1192u f8773c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final AbstractC1192u f8774d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final AbstractC1192u f8775e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final AbstractC1192u f8776f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final AbstractC1192u f8777g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final AbstractC1192u f8778h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final AbstractC1192u f8779i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Set f8780j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Map f8781k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final AbstractC1192u f8782l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final InterfaceC6195g f8783m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final InterfaceC6195g f8784n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final InterfaceC6195g f8785o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Jd.l f8786p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final Map f8787q;

    /* JADX INFO: renamed from: Lc.t$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class a implements InterfaceC6195g {
        @Override // wd.InterfaceC6195g
        public Cd.E getType() {
            throw new IllegalStateException("This method should not be called");
        }
    }

    /* JADX INFO: renamed from: Lc.t$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class b implements InterfaceC6195g {
        @Override // wd.InterfaceC6195g
        public Cd.E getType() {
            throw new IllegalStateException("This method should not be called");
        }
    }

    /* JADX INFO: renamed from: Lc.t$c */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class c implements InterfaceC6195g {
        @Override // wd.InterfaceC6195g
        public Cd.E getType() {
            throw new IllegalStateException("This method should not be called");
        }
    }

    /* JADX INFO: renamed from: Lc.t$d */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class d extends r {
        public d(n0 n0Var) {
            super(n0Var);
        }

        public static /* synthetic */ void g(int i10) {
            Object[] objArr = new Object[3];
            if (i10 == 1) {
                objArr[0] = "what";
            } else if (i10 != 2) {
                objArr[0] = "descriptor";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$1";
            if (i10 == 1 || i10 == 2) {
                objArr[2] = "isVisible";
            } else {
                objArr[2] = "hasContainingSourceFile";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // Lc.AbstractC1192u
        public boolean e(InterfaceC6195g interfaceC6195g, InterfaceC1189q interfaceC1189q, InterfaceC1185m interfaceC1185m, boolean z10) {
            if (interfaceC1189q == 0) {
                g(1);
            }
            if (interfaceC1185m == null) {
                g(2);
            }
            if (AbstractC5283e.J(interfaceC1189q) && h(interfaceC1185m)) {
                return AbstractC1191t.f(interfaceC1189q, interfaceC1185m);
            }
            if (interfaceC1189q instanceof InterfaceC1184l) {
                InterfaceC1181i interfaceC1181iB = ((InterfaceC1184l) interfaceC1189q).b();
                if (z10 && AbstractC5283e.G(interfaceC1181iB) && AbstractC5283e.J(interfaceC1181iB) && (interfaceC1185m instanceof InterfaceC1184l) && AbstractC5283e.J(interfaceC1185m.b()) && AbstractC1191t.f(interfaceC1189q, interfaceC1185m)) {
                    return true;
                }
            }
            while (interfaceC1189q != 0) {
                interfaceC1189q = interfaceC1189q.b();
                if (((interfaceC1189q instanceof InterfaceC1177e) && !AbstractC5283e.x(interfaceC1189q)) || (interfaceC1189q instanceof K)) {
                    break;
                }
            }
            if (interfaceC1189q == 0) {
                return false;
            }
            while (interfaceC1185m != null) {
                if (interfaceC1189q == interfaceC1185m) {
                    return true;
                }
                if (interfaceC1185m instanceof K) {
                    return (interfaceC1189q instanceof K) && ((K) interfaceC1189q).e().equals(((K) interfaceC1185m).e()) && AbstractC5283e.b(interfaceC1185m, interfaceC1189q);
                }
                interfaceC1185m = interfaceC1185m.b();
            }
            return false;
        }

        public final boolean h(InterfaceC1185m interfaceC1185m) {
            if (interfaceC1185m == null) {
                g(0);
            }
            return AbstractC5283e.j(interfaceC1185m) != b0.f8747a;
        }
    }

    /* JADX INFO: renamed from: Lc.t$e */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class e extends r {
        public e(n0 n0Var) {
            super(n0Var);
        }

        private static /* synthetic */ void g(int i10) {
            Object[] objArr = new Object[3];
            if (i10 != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$2";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // Lc.AbstractC1192u
        public boolean e(InterfaceC6195g interfaceC6195g, InterfaceC1189q interfaceC1189q, InterfaceC1185m interfaceC1185m, boolean z10) {
            InterfaceC1185m interfaceC1185mQ;
            if (interfaceC1189q == null) {
                g(0);
            }
            if (interfaceC1185m == null) {
                g(1);
            }
            if (!AbstractC1191t.f8771a.e(interfaceC6195g, interfaceC1189q, interfaceC1185m, z10)) {
                return false;
            }
            if (interfaceC6195g == AbstractC1191t.f8784n) {
                return true;
            }
            if (interfaceC6195g == AbstractC1191t.f8783m || (interfaceC1185mQ = AbstractC5283e.q(interfaceC1189q, InterfaceC1177e.class)) == null || !(interfaceC6195g instanceof InterfaceC6196h)) {
                return false;
            }
            return ((InterfaceC6196h) interfaceC6195g).s().a().equals(interfaceC1185mQ.a());
        }
    }

    /* JADX INFO: renamed from: Lc.t$f */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class f extends r {
        public f(n0 n0Var) {
            super(n0Var);
        }

        private static /* synthetic */ void g(int i10) {
            Object[] objArr = new Object[3];
            if (i10 == 1) {
                objArr[0] = "from";
            } else if (i10 == 2) {
                objArr[0] = "whatDeclaration";
            } else if (i10 != 3) {
                objArr[0] = "what";
            } else {
                objArr[0] = "fromClass";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$3";
            if (i10 == 2 || i10 == 3) {
                objArr[2] = "doesReceiverFitForProtectedVisibility";
            } else {
                objArr[2] = "isVisible";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // Lc.AbstractC1192u
        public boolean e(InterfaceC6195g interfaceC6195g, InterfaceC1189q interfaceC1189q, InterfaceC1185m interfaceC1185m, boolean z10) {
            InterfaceC1177e interfaceC1177e;
            if (interfaceC1189q == null) {
                g(0);
            }
            if (interfaceC1185m == null) {
                g(1);
            }
            InterfaceC1177e interfaceC1177e2 = (InterfaceC1177e) AbstractC5283e.q(interfaceC1189q, InterfaceC1177e.class);
            InterfaceC1177e interfaceC1177e3 = (InterfaceC1177e) AbstractC5283e.r(interfaceC1185m, InterfaceC1177e.class, false);
            if (interfaceC1177e3 == null) {
                return false;
            }
            if (interfaceC1177e2 != null && AbstractC5283e.x(interfaceC1177e2) && (interfaceC1177e = (InterfaceC1177e) AbstractC5283e.q(interfaceC1177e2, InterfaceC1177e.class)) != null && AbstractC5283e.H(interfaceC1177e3, interfaceC1177e)) {
                return true;
            }
            InterfaceC1189q interfaceC1189qM = AbstractC5283e.M(interfaceC1189q);
            InterfaceC1177e interfaceC1177e4 = (InterfaceC1177e) AbstractC5283e.q(interfaceC1189qM, InterfaceC1177e.class);
            if (interfaceC1177e4 == null) {
                return false;
            }
            if (AbstractC5283e.H(interfaceC1177e3, interfaceC1177e4) && h(interfaceC6195g, interfaceC1189qM, interfaceC1177e3)) {
                return true;
            }
            return e(interfaceC6195g, interfaceC1189q, interfaceC1177e3.b(), z10);
        }

        public final boolean h(InterfaceC6195g interfaceC6195g, InterfaceC1189q interfaceC1189q, InterfaceC1177e interfaceC1177e) {
            if (interfaceC1189q == null) {
                g(2);
            }
            if (interfaceC1177e == null) {
                g(3);
            }
            if (interfaceC6195g == AbstractC1191t.f8785o) {
                return false;
            }
            if (!(interfaceC1189q instanceof InterfaceC1174b) || (interfaceC1189q instanceof InterfaceC1184l) || interfaceC6195g == AbstractC1191t.f8784n) {
                return true;
            }
            if (interfaceC6195g == AbstractC1191t.f8783m || interfaceC6195g == null) {
                return false;
            }
            Cd.E type = interfaceC6195g.getType();
            return AbstractC5283e.I(type, interfaceC1177e) || AbstractC0737u.a(type);
        }
    }

    /* JADX INFO: renamed from: Lc.t$g */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class g extends r {
        public g(n0 n0Var) {
            super(n0Var);
        }

        private static /* synthetic */ void g(int i10) {
            Object[] objArr = new Object[3];
            if (i10 != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$4";
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
            if (AbstractC5283e.g(interfaceC1185m).y(AbstractC5283e.g(interfaceC1189q))) {
                return AbstractC1191t.f8786p.a(interfaceC1189q, interfaceC1185m);
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: Lc.t$h */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class h extends r {
        public h(n0 n0Var) {
            super(n0Var);
        }

        private static /* synthetic */ void g(int i10) {
            Object[] objArr = new Object[3];
            if (i10 != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$5";
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
            return true;
        }
    }

    /* JADX INFO: renamed from: Lc.t$i */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class i extends r {
        public i(n0 n0Var) {
            super(n0Var);
        }

        private static /* synthetic */ void g(int i10) {
            Object[] objArr = new Object[3];
            if (i10 != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$6";
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
            throw new IllegalStateException("This method shouldn't be invoked for LOCAL visibility");
        }
    }

    /* JADX INFO: renamed from: Lc.t$j */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class j extends r {
        public j(n0 n0Var) {
            super(n0Var);
        }

        private static /* synthetic */ void g(int i10) {
            Object[] objArr = new Object[3];
            if (i10 != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$7";
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
            throw new IllegalStateException("Visibility is unknown yet");
        }
    }

    /* JADX INFO: renamed from: Lc.t$k */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class k extends r {
        public k(n0 n0Var) {
            super(n0Var);
        }

        private static /* synthetic */ void g(int i10) {
            Object[] objArr = new Object[3];
            if (i10 != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$8";
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
            return false;
        }
    }

    /* JADX INFO: renamed from: Lc.t$l */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class l extends r {
        public l(n0 n0Var) {
            super(n0Var);
        }

        private static /* synthetic */ void g(int i10) {
            Object[] objArr = new Object[3];
            if (i10 != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$9";
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
            return false;
        }
    }

    static {
        d dVar = new d(m0.e.f8763c);
        f8771a = dVar;
        e eVar = new e(m0.f.f8764c);
        f8772b = eVar;
        f fVar = new f(m0.g.f8765c);
        f8773c = fVar;
        g gVar = new g(m0.b.f8760c);
        f8774d = gVar;
        h hVar = new h(m0.h.f8766c);
        f8775e = hVar;
        i iVar = new i(m0.d.f8762c);
        f8776f = iVar;
        j jVar = new j(m0.a.f8759c);
        f8777g = jVar;
        k kVar = new k(m0.c.f8761c);
        f8778h = kVar;
        l lVar = new l(m0.i.f8767c);
        f8779i = lVar;
        f8780j = Collections.unmodifiableSet(gc.U.h(dVar, eVar, gVar, iVar));
        HashMap mapE = Md.a.e(4);
        mapE.put(eVar, 0);
        mapE.put(dVar, 0);
        mapE.put(gVar, 1);
        mapE.put(fVar, 1);
        mapE.put(hVar, 2);
        f8781k = Collections.unmodifiableMap(mapE);
        f8782l = hVar;
        f8783m = new a();
        f8784n = new b();
        f8785o = new c();
        Iterator it = ServiceLoader.load(Jd.l.class, Jd.l.class.getClassLoader()).iterator();
        f8786p = it.hasNext() ? (Jd.l) it.next() : l.a.f6420a;
        f8787q = new HashMap();
        i(dVar);
        i(eVar);
        i(fVar);
        i(gVar);
        i(hVar);
        i(iVar);
        i(jVar);
        i(kVar);
        i(lVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ void a(int r8) {
        /*
            r0 = 16
            if (r8 == r0) goto L7
            java.lang.String r1 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
            goto L9
        L7:
            java.lang.String r1 = "@NotNull method %s.%s must not return null"
        L9:
            r2 = 3
            r3 = 2
            if (r8 == r0) goto Lf
            r4 = r2
            goto L10
        Lf:
            r4 = r3
        L10:
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.String r5 = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities"
            r6 = 1
            r7 = 0
            if (r8 == r6) goto L3a
            if (r8 == r2) goto L3a
            r2 = 5
            if (r8 == r2) goto L3a
            r2 = 7
            if (r8 == r2) goto L3a
            switch(r8) {
                case 9: goto L3a;
                case 10: goto L35;
                case 11: goto L30;
                case 12: goto L35;
                case 13: goto L30;
                case 14: goto L2b;
                case 15: goto L2b;
                case 16: goto L28;
                default: goto L23;
            }
        L23:
            java.lang.String r2 = "what"
            r4[r7] = r2
            goto L3e
        L28:
            r4[r7] = r5
            goto L3e
        L2b:
            java.lang.String r2 = "visibility"
            r4[r7] = r2
            goto L3e
        L30:
            java.lang.String r2 = "second"
            r4[r7] = r2
            goto L3e
        L35:
            java.lang.String r2 = "first"
            r4[r7] = r2
            goto L3e
        L3a:
            java.lang.String r2 = "from"
            r4[r7] = r2
        L3e:
            java.lang.String r2 = "toDescriptorVisibility"
            if (r8 == r0) goto L45
            r4[r6] = r5
            goto L47
        L45:
            r4[r6] = r2
        L47:
            switch(r8) {
                case 2: goto L70;
                case 3: goto L70;
                case 4: goto L6b;
                case 5: goto L6b;
                case 6: goto L66;
                case 7: goto L66;
                case 8: goto L61;
                case 9: goto L61;
                case 10: goto L5c;
                case 11: goto L5c;
                case 12: goto L57;
                case 13: goto L57;
                case 14: goto L52;
                case 15: goto L4f;
                case 16: goto L74;
                default: goto L4a;
            }
        L4a:
            java.lang.String r2 = "isVisible"
            r4[r3] = r2
            goto L74
        L4f:
            r4[r3] = r2
            goto L74
        L52:
            java.lang.String r2 = "isPrivate"
            r4[r3] = r2
            goto L74
        L57:
            java.lang.String r2 = "compare"
            r4[r3] = r2
            goto L74
        L5c:
            java.lang.String r2 = "compareLocal"
            r4[r3] = r2
            goto L74
        L61:
            java.lang.String r2 = "findInvisibleMember"
            r4[r3] = r2
            goto L74
        L66:
            java.lang.String r2 = "inSameFile"
            r4[r3] = r2
            goto L74
        L6b:
            java.lang.String r2 = "isVisibleWithAnyReceiver"
            r4[r3] = r2
            goto L74
        L70:
            java.lang.String r2 = "isVisibleIgnoringReceiver"
            r4[r3] = r2
        L74:
            java.lang.String r1 = java.lang.String.format(r1, r4)
            if (r8 == r0) goto L80
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            r8.<init>(r1)
            goto L85
        L80:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            r8.<init>(r1)
        L85:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: Lc.AbstractC1191t.a(int):void");
    }

    public static Integer d(AbstractC1192u abstractC1192u, AbstractC1192u abstractC1192u2) {
        if (abstractC1192u == null) {
            a(12);
        }
        if (abstractC1192u2 == null) {
            a(13);
        }
        Integer numA = abstractC1192u.a(abstractC1192u2);
        if (numA != null) {
            return numA;
        }
        Integer numA2 = abstractC1192u2.a(abstractC1192u);
        if (numA2 != null) {
            return Integer.valueOf(-numA2.intValue());
        }
        return null;
    }

    public static InterfaceC1189q e(InterfaceC6195g interfaceC6195g, InterfaceC1189q interfaceC1189q, InterfaceC1185m interfaceC1185m, boolean z10) {
        InterfaceC1189q interfaceC1189qE;
        if (interfaceC1189q == null) {
            a(8);
        }
        if (interfaceC1185m == null) {
            a(9);
        }
        for (InterfaceC1189q interfaceC1189q2 = (InterfaceC1189q) interfaceC1189q.a(); interfaceC1189q2 != null && interfaceC1189q2.getVisibility() != f8776f; interfaceC1189q2 = (InterfaceC1189q) AbstractC5283e.q(interfaceC1189q2, InterfaceC1189q.class)) {
            if (!interfaceC1189q2.getVisibility().e(interfaceC6195g, interfaceC1189q2, interfaceC1185m, z10)) {
                return interfaceC1189q2;
            }
        }
        if (!(interfaceC1189q instanceof Oc.I) || (interfaceC1189qE = e(interfaceC6195g, ((Oc.I) interfaceC1189q).P(), interfaceC1185m, z10)) == null) {
            return null;
        }
        return interfaceC1189qE;
    }

    public static boolean f(InterfaceC1185m interfaceC1185m, InterfaceC1185m interfaceC1185m2) {
        if (interfaceC1185m == null) {
            a(6);
        }
        if (interfaceC1185m2 == null) {
            a(7);
        }
        b0 b0VarJ = AbstractC5283e.j(interfaceC1185m2);
        if (b0VarJ != b0.f8747a) {
            return b0VarJ.equals(AbstractC5283e.j(interfaceC1185m));
        }
        return false;
    }

    public static boolean g(AbstractC1192u abstractC1192u) {
        if (abstractC1192u == null) {
            a(14);
        }
        return abstractC1192u == f8771a || abstractC1192u == f8772b;
    }

    public static boolean h(InterfaceC1189q interfaceC1189q, InterfaceC1185m interfaceC1185m, boolean z10) {
        if (interfaceC1189q == null) {
            a(2);
        }
        if (interfaceC1185m == null) {
            a(3);
        }
        return e(f8784n, interfaceC1189q, interfaceC1185m, z10) == null;
    }

    public static void i(AbstractC1192u abstractC1192u) {
        f8787q.put(abstractC1192u.b(), abstractC1192u);
    }

    public static AbstractC1192u j(n0 n0Var) {
        if (n0Var == null) {
            a(15);
        }
        AbstractC1192u abstractC1192u = (AbstractC1192u) f8787q.get(n0Var);
        if (abstractC1192u != null) {
            return abstractC1192u;
        }
        throw new IllegalArgumentException("Inapplicable visibility: " + n0Var);
    }
}
