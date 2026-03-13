package od;

import Cd.C0722e;
import Cd.E;
import Cd.G;
import Cd.d0;
import Cd.e0;
import Dd.e;
import Dd.f;
import Dd.g;
import Lc.AbstractC1191t;
import Lc.AbstractC1192u;
import Lc.C;
import Lc.D;
import Lc.InterfaceC1173a;
import Lc.InterfaceC1174b;
import Lc.InterfaceC1177e;
import Lc.InterfaceC1185m;
import Lc.InterfaceC1189q;
import Lc.InterfaceC1196y;
import Lc.T;
import Lc.U;
import Lc.X;
import Lc.f0;
import Lc.j0;
import Oc.B;
import com.google.api.Endpoint;
import fc.C4015H;
import fc.C4034q;
import gc.C4179C;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.ServiceLoader;
import java.util.Set;
import od.InterfaceC5284f;
import sd.AbstractC5823c;
import vc.InterfaceC6082a;

/* JADX INFO: renamed from: od.k, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class C5289k {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final List f41543e = C4179C.V0(ServiceLoader.load(InterfaceC5284f.class, InterfaceC5284f.class.getClassLoader()));

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final C5289k f41544f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final e.a f41545g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Dd.g f41546a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Dd.f f41547b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e.a f41548c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final vc.p f41549d;

    /* JADX INFO: renamed from: od.k$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class a implements e.a {
        public static /* synthetic */ void b(int i10) {
            Object[] objArr = new Object[3];
            if (i10 != 1) {
                objArr[0] = "a";
            } else {
                objArr[0] = "b";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil$1";
            objArr[2] = "equals";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // Dd.e.a
        public boolean a(e0 e0Var, e0 e0Var2) {
            if (e0Var == null) {
                b(0);
            }
            if (e0Var2 == null) {
                b(1);
            }
            return e0Var.equals(e0Var2);
        }
    }

    /* JADX INFO: renamed from: od.k$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class b implements vc.p {
        @Override // vc.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C4034q invoke(InterfaceC1173a interfaceC1173a, InterfaceC1173a interfaceC1173a2) {
            return new C4034q(interfaceC1173a, interfaceC1173a2);
        }
    }

    /* JADX INFO: renamed from: od.k$c */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class c implements vc.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC1185m f41550a;

        public c(InterfaceC1185m interfaceC1185m) {
            this.f41550a = interfaceC1185m;
        }

        @Override // vc.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean invoke(InterfaceC1174b interfaceC1174b) {
            return Boolean.valueOf(interfaceC1174b.b() == this.f41550a);
        }
    }

    /* JADX INFO: renamed from: od.k$e */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class e implements vc.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC1177e f41551a;

        public e(InterfaceC1177e interfaceC1177e) {
            this.f41551a = interfaceC1177e;
        }

        @Override // vc.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean invoke(InterfaceC1174b interfaceC1174b) {
            boolean z10 = false;
            if (!AbstractC1191t.g(interfaceC1174b.getVisibility()) && AbstractC1191t.h(interfaceC1174b, this.f41551a, false)) {
                z10 = true;
            }
            return Boolean.valueOf(z10);
        }
    }

    /* JADX INFO: renamed from: od.k$g */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class g implements vc.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AbstractC5288j f41552a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC1174b f41553b;

        public g(AbstractC5288j abstractC5288j, InterfaceC1174b interfaceC1174b) {
            this.f41552a = abstractC5288j;
            this.f41553b = interfaceC1174b;
        }

        @Override // vc.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C4015H invoke(InterfaceC1174b interfaceC1174b) {
            this.f41552a.b(this.f41553b, interfaceC1174b);
            return C4015H.f34254a;
        }
    }

    /* JADX INFO: renamed from: od.k$h */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static /* synthetic */ class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f41554a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f41555b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f41556c;

        static {
            int[] iArr = new int[D.values().length];
            f41556c = iArr;
            try {
                iArr[D.FINAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f41556c[D.SEALED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f41556c[D.OPEN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f41556c[D.ABSTRACT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[i.a.values().length];
            f41555b = iArr2;
            try {
                iArr2[i.a.OVERRIDABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f41555b[i.a.CONFLICT.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f41555b[i.a.INCOMPATIBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr3 = new int[InterfaceC5284f.b.values().length];
            f41554a = iArr3;
            try {
                iArr3[InterfaceC5284f.b.OVERRIDABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f41554a[InterfaceC5284f.b.CONFLICT.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f41554a[InterfaceC5284f.b.INCOMPATIBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f41554a[InterfaceC5284f.b.UNKNOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    /* JADX INFO: renamed from: od.k$i */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class i {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final i f41557c = new i(a.OVERRIDABLE, "SUCCESS");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final a f41558a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f41559b;

        /* JADX INFO: renamed from: od.k$i$a */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public enum a {
            OVERRIDABLE,
            INCOMPATIBLE,
            CONFLICT
        }

        public i(a aVar, String str) {
            if (aVar == null) {
                a(3);
            }
            if (str == null) {
                a(4);
            }
            this.f41558a = aVar;
            this.f41559b = str;
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0031  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static /* synthetic */ void a(int r10) {
            /*
                r0 = 4
                r1 = 3
                r2 = 2
                r3 = 1
                if (r10 == r3) goto Lf
                if (r10 == r2) goto Lf
                if (r10 == r1) goto Lf
                if (r10 == r0) goto Lf
                java.lang.String r4 = "@NotNull method %s.%s must not return null"
                goto L11
            Lf:
                java.lang.String r4 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
            L11:
                if (r10 == r3) goto L1b
                if (r10 == r2) goto L1b
                if (r10 == r1) goto L1b
                if (r10 == r0) goto L1b
                r5 = r2
                goto L1c
            L1b:
                r5 = r1
            L1c:
                java.lang.Object[] r5 = new java.lang.Object[r5]
                java.lang.String r6 = "success"
                java.lang.String r7 = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil$OverrideCompatibilityInfo"
                r8 = 0
                if (r10 == r3) goto L31
                if (r10 == r2) goto L31
                if (r10 == r1) goto L2e
                if (r10 == r0) goto L31
                r5[r8] = r7
                goto L35
            L2e:
                r5[r8] = r6
                goto L35
            L31:
                java.lang.String r9 = "debugMessage"
                r5[r8] = r9
            L35:
                switch(r10) {
                    case 1: goto L45;
                    case 2: goto L45;
                    case 3: goto L45;
                    case 4: goto L45;
                    case 5: goto L40;
                    case 6: goto L3b;
                    default: goto L38;
                }
            L38:
                r5[r3] = r6
                goto L47
            L3b:
                java.lang.String r6 = "getDebugMessage"
                r5[r3] = r6
                goto L47
            L40:
                java.lang.String r6 = "getResult"
                r5[r3] = r6
                goto L47
            L45:
                r5[r3] = r7
            L47:
                if (r10 == r3) goto L5a
                if (r10 == r2) goto L55
                if (r10 == r1) goto L50
                if (r10 == r0) goto L50
                goto L5e
            L50:
                java.lang.String r6 = "<init>"
                r5[r2] = r6
                goto L5e
            L55:
                java.lang.String r6 = "conflict"
                r5[r2] = r6
                goto L5e
            L5a:
                java.lang.String r6 = "incompatible"
                r5[r2] = r6
            L5e:
                java.lang.String r4 = java.lang.String.format(r4, r5)
                if (r10 == r3) goto L70
                if (r10 == r2) goto L70
                if (r10 == r1) goto L70
                if (r10 == r0) goto L70
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                r10.<init>(r4)
                goto L75
            L70:
                java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
                r10.<init>(r4)
            L75:
                throw r10
            */
            throw new UnsupportedOperationException("Method not decompiled: od.C5289k.i.a(int):void");
        }

        public static i b(String str) {
            if (str == null) {
                a(2);
            }
            return new i(a.CONFLICT, str);
        }

        public static i d(String str) {
            if (str == null) {
                a(1);
            }
            return new i(a.INCOMPATIBLE, str);
        }

        public static i e() {
            i iVar = f41557c;
            if (iVar == null) {
                a(0);
            }
            return iVar;
        }

        public a c() {
            a aVar = this.f41558a;
            if (aVar == null) {
                a(5);
            }
            return aVar;
        }
    }

    static {
        a aVar = new a();
        f41545g = aVar;
        f41544f = new C5289k(aVar, g.a.f2666a, f.a.f2665a, null);
    }

    public C5289k(e.a aVar, Dd.g gVar, Dd.f fVar, vc.p pVar) {
        if (aVar == null) {
            a(5);
        }
        if (gVar == null) {
            a(6);
        }
        if (fVar == null) {
            a(7);
        }
        this.f41548c = aVar;
        this.f41546a = gVar;
        this.f41547b = fVar;
        this.f41549d = pVar;
    }

    public static boolean A(T t10, T t11) {
        if (t10 == null || t11 == null) {
            return true;
        }
        return H(t10, t11);
    }

    public static boolean B(InterfaceC1173a interfaceC1173a, InterfaceC1173a interfaceC1173a2) {
        if (interfaceC1173a == null) {
            a(67);
        }
        if (interfaceC1173a2 == null) {
            a(68);
        }
        E returnType = interfaceC1173a.getReturnType();
        E returnType2 = interfaceC1173a2.getReturnType();
        if (!H(interfaceC1173a, interfaceC1173a2)) {
            return false;
        }
        d0 d0VarL = f41544f.l(interfaceC1173a.getTypeParameters(), interfaceC1173a2.getTypeParameters());
        if (interfaceC1173a instanceof InterfaceC1196y) {
            return G(interfaceC1173a, returnType, interfaceC1173a2, returnType2, d0VarL);
        }
        if (!(interfaceC1173a instanceof U)) {
            throw new IllegalArgumentException("Unexpected callable: " + interfaceC1173a.getClass());
        }
        U u10 = (U) interfaceC1173a;
        U u11 = (U) interfaceC1173a2;
        if (A(u10.h(), u11.h())) {
            return (u10.L() && u11.L()) ? C0722e.f1329a.k(d0VarL, returnType.Q0(), returnType2.Q0()) : (u10.L() || !u11.L()) && G(interfaceC1173a, returnType, interfaceC1173a2, returnType2, d0VarL);
        }
        return false;
    }

    public static boolean C(InterfaceC1173a interfaceC1173a, Collection collection) {
        if (interfaceC1173a == null) {
            a(71);
        }
        if (collection == null) {
            a(72);
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!B(interfaceC1173a, (InterfaceC1173a) it.next())) {
                return false;
            }
        }
        return true;
    }

    public static boolean G(InterfaceC1173a interfaceC1173a, E e10, InterfaceC1173a interfaceC1173a2, E e11, d0 d0Var) {
        if (interfaceC1173a == null) {
            a(73);
        }
        if (e10 == null) {
            a(74);
        }
        if (interfaceC1173a2 == null) {
            a(75);
        }
        if (e11 == null) {
            a(76);
        }
        if (d0Var == null) {
            a(77);
        }
        return C0722e.f1329a.r(d0Var, e10.Q0(), e11.Q0());
    }

    public static boolean H(InterfaceC1189q interfaceC1189q, InterfaceC1189q interfaceC1189q2) {
        if (interfaceC1189q == null) {
            a(69);
        }
        if (interfaceC1189q2 == null) {
            a(70);
        }
        Integer numD = AbstractC1191t.d(interfaceC1189q.getVisibility(), interfaceC1189q2.getVisibility());
        return numD == null || numD.intValue() >= 0;
    }

    public static boolean I(C c10, C c11, boolean z10) {
        if (c10 == null) {
            a(57);
        }
        if (c11 == null) {
            a(58);
        }
        return !AbstractC1191t.g(c11.getVisibility()) && AbstractC1191t.h(c11, c10, z10);
    }

    public static boolean J(InterfaceC1173a interfaceC1173a, InterfaceC1173a interfaceC1173a2, boolean z10, boolean z11) {
        if (interfaceC1173a == null) {
            a(13);
        }
        if (interfaceC1173a2 == null) {
            a(14);
        }
        if (!interfaceC1173a.equals(interfaceC1173a2) && C5281c.f41534a.f(interfaceC1173a.a(), interfaceC1173a2.a(), z10, z11)) {
            return true;
        }
        InterfaceC1173a interfaceC1173aA = interfaceC1173a2.a();
        Iterator it = AbstractC5283e.d(interfaceC1173a).iterator();
        while (it.hasNext()) {
            if (C5281c.f41534a.f(interfaceC1173aA, (InterfaceC1173a) it.next(), z10, z11)) {
                return true;
            }
        }
        return false;
    }

    public static void K(InterfaceC1174b interfaceC1174b, vc.l lVar) {
        AbstractC1192u abstractC1192u;
        if (interfaceC1174b == null) {
            a(107);
        }
        for (InterfaceC1174b interfaceC1174b2 : interfaceC1174b.d()) {
            if (interfaceC1174b2.getVisibility() == AbstractC1191t.f8777g) {
                K(interfaceC1174b2, lVar);
            }
        }
        if (interfaceC1174b.getVisibility() != AbstractC1191t.f8777g) {
            return;
        }
        AbstractC1192u abstractC1192uH = h(interfaceC1174b);
        if (abstractC1192uH == null) {
            if (lVar != null) {
                lVar.invoke(interfaceC1174b);
            }
            abstractC1192u = AbstractC1191t.f8775e;
        } else {
            abstractC1192u = abstractC1192uH;
        }
        if (interfaceC1174b instanceof Oc.C) {
            ((Oc.C) interfaceC1174b).c1(abstractC1192u);
            Iterator it = ((U) interfaceC1174b).v().iterator();
            while (it.hasNext()) {
                K((T) it.next(), abstractC1192uH == null ? null : lVar);
            }
            return;
        }
        if (interfaceC1174b instanceof Oc.p) {
            ((Oc.p) interfaceC1174b).j1(abstractC1192u);
            return;
        }
        B b10 = (B) interfaceC1174b;
        b10.N0(abstractC1192u);
        if (abstractC1192u != b10.T().getVisibility()) {
            b10.L0(false);
        }
    }

    public static Object L(Collection collection, vc.l lVar) {
        Object next;
        if (collection == null) {
            a(78);
        }
        if (lVar == null) {
            a(79);
        }
        if (collection.size() == 1) {
            Object objG0 = C4179C.g0(collection);
            if (objG0 == null) {
                a(80);
            }
            return objG0;
        }
        ArrayList arrayList = new ArrayList(2);
        List listV0 = C4179C.v0(collection, lVar);
        Object objG02 = C4179C.g0(collection);
        InterfaceC1173a interfaceC1173a = (InterfaceC1173a) lVar.invoke(objG02);
        for (Object obj : collection) {
            InterfaceC1173a interfaceC1173a2 = (InterfaceC1173a) lVar.invoke(obj);
            if (C(interfaceC1173a2, listV0)) {
                arrayList.add(obj);
            }
            if (B(interfaceC1173a2, interfaceC1173a) && !B(interfaceC1173a, interfaceC1173a2)) {
                objG02 = obj;
            }
        }
        if (arrayList.isEmpty()) {
            if (objG02 == null) {
                a(81);
            }
            return objG02;
        }
        if (arrayList.size() == 1) {
            Object objG03 = C4179C.g0(arrayList);
            if (objG03 == null) {
                a(82);
            }
            return objG03;
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (!Cd.B.b(((InterfaceC1173a) lVar.invoke(next)).getReturnType())) {
                break;
            }
        }
        if (next != null) {
            return next;
        }
        Object objG04 = C4179C.g0(arrayList);
        if (objG04 == null) {
            a(84);
        }
        return objG04;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0035 A[FALL_THROUGH] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ void a(int r24) {
        /*
            Method dump skipped, instruction units count: 1322
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: od.C5289k.a(int):void");
    }

    public static boolean b(Collection collection) {
        if (collection == null) {
            a(63);
        }
        if (collection.size() < 2) {
            return true;
        }
        return C4179C.W(collection, new c(((InterfaceC1174b) collection.iterator().next()).b()));
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0054, code lost:
    
        r1.remove();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean c(Lc.f0 r4, Lc.f0 r5, Cd.d0 r6) {
        /*
            if (r4 != 0) goto L7
            r0 = 49
            a(r0)
        L7:
            if (r5 != 0) goto Le
            r0 = 50
            a(r0)
        Le:
            if (r6 != 0) goto L15
            r0 = 51
            a(r0)
        L15:
            java.util.List r4 = r4.getUpperBounds()
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.List r5 = r5.getUpperBounds()
            r0.<init>(r5)
            int r5 = r4.size()
            int r1 = r0.size()
            r2 = 0
            if (r5 == r1) goto L2e
            return r2
        L2e:
            java.util.Iterator r4 = r4.iterator()
        L32:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L59
            java.lang.Object r5 = r4.next()
            Cd.E r5 = (Cd.E) r5
            java.util.ListIterator r1 = r0.listIterator()
        L42:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L58
            java.lang.Object r3 = r1.next()
            Cd.E r3 = (Cd.E) r3
            boolean r3 = d(r5, r3, r6)
            if (r3 == 0) goto L42
            r1.remove()
            goto L32
        L58:
            return r2
        L59:
            r4 = 1
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: od.C5289k.c(Lc.f0, Lc.f0, Cd.d0):boolean");
    }

    public static boolean d(E e10, E e11, d0 d0Var) {
        if (e10 == null) {
            a(46);
        }
        if (e11 == null) {
            a(47);
        }
        if (d0Var == null) {
            a(48);
        }
        if (G.a(e10) && G.a(e11)) {
            return true;
        }
        return C0722e.f1329a.k(d0Var, e10.Q0(), e11.Q0());
    }

    public static i e(InterfaceC1173a interfaceC1173a, InterfaceC1173a interfaceC1173a2) {
        if ((interfaceC1173a.M() == null) != (interfaceC1173a2.M() == null)) {
            return i.d("Receiver presence mismatch");
        }
        if (interfaceC1173a.i().size() != interfaceC1173a2.i().size()) {
            return i.d("Value parameter number mismatch");
        }
        return null;
    }

    public static void f(InterfaceC1174b interfaceC1174b, Set set) {
        if (interfaceC1174b == null) {
            a(17);
        }
        if (set == null) {
            a(18);
        }
        if (interfaceC1174b.f().a()) {
            set.add(interfaceC1174b);
            return;
        }
        if (interfaceC1174b.d().isEmpty()) {
            throw new IllegalStateException("No overridden descriptors found for (fake override) " + interfaceC1174b);
        }
        Iterator it = interfaceC1174b.d().iterator();
        while (it.hasNext()) {
            f((InterfaceC1174b) it.next(), set);
        }
    }

    public static List g(InterfaceC1173a interfaceC1173a) {
        X xM = interfaceC1173a.M();
        ArrayList arrayList = new ArrayList();
        if (xM != null) {
            arrayList.add(xM.getType());
        }
        Iterator it = interfaceC1173a.i().iterator();
        while (it.hasNext()) {
            arrayList.add(((j0) it.next()).getType());
        }
        return arrayList;
    }

    public static AbstractC1192u h(InterfaceC1174b interfaceC1174b) {
        if (interfaceC1174b == null) {
            a(108);
        }
        Collection<InterfaceC1174b> collectionD = interfaceC1174b.d();
        AbstractC1192u abstractC1192uU = u(collectionD);
        if (abstractC1192uU == null) {
            return null;
        }
        if (interfaceC1174b.f() != InterfaceC1174b.a.FAKE_OVERRIDE) {
            return abstractC1192uU.f();
        }
        for (InterfaceC1174b interfaceC1174b2 : collectionD) {
            if (interfaceC1174b2.r() != D.ABSTRACT && !interfaceC1174b2.getVisibility().equals(abstractC1192uU)) {
                return null;
            }
        }
        return abstractC1192uU;
    }

    public static C5289k i(Dd.g gVar, e.a aVar) {
        if (gVar == null) {
            a(3);
        }
        if (aVar == null) {
            a(4);
        }
        return new C5289k(aVar, gVar, f.a.f2665a, null);
    }

    public static void j(Collection collection, InterfaceC1177e interfaceC1177e, AbstractC5288j abstractC5288j) {
        if (collection == null) {
            a(85);
        }
        if (interfaceC1177e == null) {
            a(86);
        }
        if (abstractC5288j == null) {
            a(87);
        }
        Collection collectionT = t(interfaceC1177e, collection);
        boolean zIsEmpty = collectionT.isEmpty();
        if (!zIsEmpty) {
            collection = collectionT;
        }
        InterfaceC1174b interfaceC1174bH0 = ((InterfaceC1174b) L(collection, new d())).H0(interfaceC1177e, n(collection, interfaceC1177e), zIsEmpty ? AbstractC1191t.f8778h : AbstractC1191t.f8777g, InterfaceC1174b.a.FAKE_OVERRIDE, false);
        abstractC5288j.d(interfaceC1174bH0, collection);
        abstractC5288j.a(interfaceC1174bH0);
    }

    public static void k(InterfaceC1177e interfaceC1177e, Collection collection, AbstractC5288j abstractC5288j) {
        if (interfaceC1177e == null) {
            a(64);
        }
        if (collection == null) {
            a(65);
        }
        if (abstractC5288j == null) {
            a(66);
        }
        if (b(collection)) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                j(Collections.singleton((InterfaceC1174b) it.next()), interfaceC1177e, abstractC5288j);
            }
        } else {
            LinkedList linkedList = new LinkedList(collection);
            while (!linkedList.isEmpty()) {
                j(p(AbstractC5294p.a(linkedList), linkedList, abstractC5288j), interfaceC1177e, abstractC5288j);
            }
        }
    }

    public static C5289k m(Dd.g gVar) {
        if (gVar == null) {
            a(0);
        }
        return new C5289k(f41545g, gVar, f.a.f2665a, null);
    }

    public static D n(Collection collection, InterfaceC1177e interfaceC1177e) {
        if (collection == null) {
            a(88);
        }
        if (interfaceC1177e == null) {
            a(89);
        }
        Iterator it = collection.iterator();
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        while (it.hasNext()) {
            InterfaceC1174b interfaceC1174b = (InterfaceC1174b) it.next();
            int i10 = h.f41556c[interfaceC1174b.r().ordinal()];
            if (i10 == 1) {
                D d10 = D.FINAL;
                if (d10 == null) {
                    a(90);
                }
                return d10;
            }
            if (i10 == 2) {
                throw new IllegalStateException("Member cannot have SEALED modality: " + interfaceC1174b);
            }
            if (i10 == 3) {
                z11 = true;
            } else if (i10 == 4) {
                z12 = true;
            }
        }
        if (interfaceC1177e.k0() && interfaceC1177e.r() != D.ABSTRACT && interfaceC1177e.r() != D.SEALED) {
            z10 = true;
        }
        if (z11 && !z12) {
            D d11 = D.OPEN;
            if (d11 == null) {
                a(91);
            }
            return d11;
        }
        if (!z11 && z12) {
            D dR = z10 ? interfaceC1177e.r() : D.ABSTRACT;
            if (dR == null) {
                a(92);
            }
            return dR;
        }
        HashSet hashSet = new HashSet();
        Iterator it2 = collection.iterator();
        while (it2.hasNext()) {
            hashSet.addAll(z((InterfaceC1174b) it2.next()));
        }
        return y(r(hashSet), z10, interfaceC1177e.r());
    }

    public static Collection p(InterfaceC1174b interfaceC1174b, Queue queue, AbstractC5288j abstractC5288j) {
        if (interfaceC1174b == null) {
            a(104);
        }
        if (queue == null) {
            a(105);
        }
        if (abstractC5288j == null) {
            a(106);
        }
        return q(interfaceC1174b, queue, new f(), new g(abstractC5288j, interfaceC1174b));
    }

    public static Collection q(Object obj, Collection collection, vc.l lVar, vc.l lVar2) {
        if (obj == null) {
            a(99);
        }
        if (collection == null) {
            a(100);
        }
        if (lVar == null) {
            a(Endpoint.TARGET_FIELD_NUMBER);
        }
        if (lVar2 == null) {
            a(102);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(obj);
        InterfaceC1173a interfaceC1173a = (InterfaceC1173a) lVar.invoke(obj);
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            InterfaceC1173a interfaceC1173a2 = (InterfaceC1173a) lVar.invoke(next);
            if (obj == next) {
                it.remove();
            } else {
                i.a aVarX = x(interfaceC1173a, interfaceC1173a2);
                if (aVarX == i.a.OVERRIDABLE) {
                    arrayList.add(next);
                    it.remove();
                } else if (aVarX == i.a.CONFLICT) {
                    lVar2.invoke(next);
                    it.remove();
                }
            }
        }
        return arrayList;
    }

    public static Set r(Set set) {
        if (set == null) {
            a(8);
        }
        return s(set, !set.isEmpty() && AbstractC5823c.u(AbstractC5823c.p((InterfaceC1185m) set.iterator().next())), null, new b());
    }

    public static Set s(Set set, boolean z10, InterfaceC6082a interfaceC6082a, vc.p pVar) {
        if (set == null) {
            a(9);
        }
        if (pVar == null) {
            a(10);
        }
        if (set.size() <= 1) {
            return set;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : set) {
            if (interfaceC6082a != null) {
                interfaceC6082a.invoke();
            }
            Iterator it = linkedHashSet.iterator();
            while (true) {
                if (!it.hasNext()) {
                    linkedHashSet.add(obj);
                    break;
                }
                C4034q c4034q = (C4034q) pVar.invoke(obj, it.next());
                InterfaceC1173a interfaceC1173a = (InterfaceC1173a) c4034q.a();
                InterfaceC1173a interfaceC1173a2 = (InterfaceC1173a) c4034q.b();
                if (!J(interfaceC1173a, interfaceC1173a2, z10, true)) {
                    if (J(interfaceC1173a2, interfaceC1173a, z10, true)) {
                        break;
                    }
                } else {
                    it.remove();
                }
            }
        }
        return linkedHashSet;
    }

    public static Collection t(InterfaceC1177e interfaceC1177e, Collection collection) {
        if (interfaceC1177e == null) {
            a(96);
        }
        if (collection == null) {
            a(97);
        }
        List listD0 = C4179C.d0(collection, new e(interfaceC1177e));
        if (listD0 == null) {
            a(98);
        }
        return listD0;
    }

    public static AbstractC1192u u(Collection collection) {
        AbstractC1192u abstractC1192u;
        if (collection == null) {
            a(109);
        }
        if (collection.isEmpty()) {
            return AbstractC1191t.f8782l;
        }
        Iterator it = collection.iterator();
        loop0: while (true) {
            abstractC1192u = null;
            while (it.hasNext()) {
                AbstractC1192u visibility = ((InterfaceC1174b) it.next()).getVisibility();
                if (abstractC1192u != null) {
                    Integer numD = AbstractC1191t.d(visibility, abstractC1192u);
                    if (numD == null) {
                        break;
                    }
                    if (numD.intValue() > 0) {
                    }
                }
                abstractC1192u = visibility;
            }
        }
        if (abstractC1192u == null) {
            return null;
        }
        Iterator it2 = collection.iterator();
        while (it2.hasNext()) {
            Integer numD2 = AbstractC1191t.d(abstractC1192u, ((InterfaceC1174b) it2.next()).getVisibility());
            if (numD2 == null || numD2.intValue() < 0) {
                return null;
            }
        }
        return abstractC1192u;
    }

    public static i w(InterfaceC1173a interfaceC1173a, InterfaceC1173a interfaceC1173a2) {
        boolean z10;
        if (interfaceC1173a == null) {
            a(40);
        }
        if (interfaceC1173a2 == null) {
            a(41);
        }
        boolean z11 = interfaceC1173a instanceof InterfaceC1196y;
        if ((z11 && !(interfaceC1173a2 instanceof InterfaceC1196y)) || (((z10 = interfaceC1173a instanceof U)) && !(interfaceC1173a2 instanceof U))) {
            return i.d("Member kind mismatch");
        }
        if (!z11 && !z10) {
            throw new IllegalArgumentException("This type of CallableDescriptor cannot be checked for overridability: " + interfaceC1173a);
        }
        if (!interfaceC1173a.getName().equals(interfaceC1173a2.getName())) {
            return i.d("Name mismatch");
        }
        i iVarE = e(interfaceC1173a, interfaceC1173a2);
        if (iVarE != null) {
            return iVarE;
        }
        return null;
    }

    public static i.a x(InterfaceC1173a interfaceC1173a, InterfaceC1173a interfaceC1173a2) {
        C5289k c5289k = f41544f;
        i.a aVarC = c5289k.D(interfaceC1173a2, interfaceC1173a, null).c();
        i.a aVarC2 = c5289k.D(interfaceC1173a, interfaceC1173a2, null).c();
        i.a aVar = i.a.OVERRIDABLE;
        if (aVarC == aVar && aVarC2 == aVar) {
            return aVar;
        }
        i.a aVar2 = i.a.CONFLICT;
        return (aVarC == aVar2 || aVarC2 == aVar2) ? aVar2 : i.a.INCOMPATIBLE;
    }

    public static D y(Collection collection, boolean z10, D d10) {
        if (collection == null) {
            a(93);
        }
        if (d10 == null) {
            a(94);
        }
        D d11 = D.ABSTRACT;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            InterfaceC1174b interfaceC1174b = (InterfaceC1174b) it.next();
            D dR = (z10 && interfaceC1174b.r() == D.ABSTRACT) ? d10 : interfaceC1174b.r();
            if (dR.compareTo(d11) < 0) {
                d11 = dR;
            }
        }
        if (d11 == null) {
            a(95);
        }
        return d11;
    }

    public static Set z(InterfaceC1174b interfaceC1174b) {
        if (interfaceC1174b == null) {
            a(15);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        f(interfaceC1174b, linkedHashSet);
        return linkedHashSet;
    }

    public i D(InterfaceC1173a interfaceC1173a, InterfaceC1173a interfaceC1173a2, InterfaceC1177e interfaceC1177e) {
        if (interfaceC1173a == null) {
            a(19);
        }
        if (interfaceC1173a2 == null) {
            a(20);
        }
        i iVarE = E(interfaceC1173a, interfaceC1173a2, interfaceC1177e, false);
        if (iVarE == null) {
            a(21);
        }
        return iVarE;
    }

    public i E(InterfaceC1173a interfaceC1173a, InterfaceC1173a interfaceC1173a2, InterfaceC1177e interfaceC1177e, boolean z10) {
        if (interfaceC1173a == null) {
            a(22);
        }
        if (interfaceC1173a2 == null) {
            a(23);
        }
        i iVarF = F(interfaceC1173a, interfaceC1173a2, z10);
        boolean z11 = iVarF.c() == i.a.OVERRIDABLE;
        for (InterfaceC5284f interfaceC5284f : f41543e) {
            if (interfaceC5284f.b() != InterfaceC5284f.a.CONFLICTS_ONLY && (!z11 || interfaceC5284f.b() != InterfaceC5284f.a.SUCCESS_ONLY)) {
                int i10 = h.f41554a[interfaceC5284f.a(interfaceC1173a, interfaceC1173a2, interfaceC1177e).ordinal()];
                if (i10 == 1) {
                    z11 = true;
                } else {
                    if (i10 == 2) {
                        i iVarB = i.b("External condition failed");
                        if (iVarB == null) {
                            a(24);
                        }
                        return iVarB;
                    }
                    if (i10 == 3) {
                        i iVarD = i.d("External condition");
                        if (iVarD == null) {
                            a(25);
                        }
                        return iVarD;
                    }
                }
            }
        }
        if (!z11) {
            return iVarF;
        }
        for (InterfaceC5284f interfaceC5284f2 : f41543e) {
            if (interfaceC5284f2.b() == InterfaceC5284f.a.CONFLICTS_ONLY) {
                int i11 = h.f41554a[interfaceC5284f2.a(interfaceC1173a, interfaceC1173a2, interfaceC1177e).ordinal()];
                if (i11 == 1) {
                    throw new IllegalStateException("Contract violation in " + interfaceC5284f2.getClass().getName() + " condition. It's not supposed to end with success");
                }
                if (i11 == 2) {
                    i iVarB2 = i.b("External condition failed");
                    if (iVarB2 == null) {
                        a(27);
                    }
                    return iVarB2;
                }
                if (i11 == 3) {
                    i iVarD2 = i.d("External condition");
                    if (iVarD2 == null) {
                        a(28);
                    }
                    return iVarD2;
                }
            }
        }
        i iVarE = i.e();
        if (iVarE == null) {
            a(29);
        }
        return iVarE;
    }

    public i F(InterfaceC1173a interfaceC1173a, InterfaceC1173a interfaceC1173a2, boolean z10) {
        if (interfaceC1173a == null) {
            a(30);
        }
        if (interfaceC1173a2 == null) {
            a(31);
        }
        i iVarW = w(interfaceC1173a, interfaceC1173a2);
        if (iVarW != null) {
            return iVarW;
        }
        List listG = g(interfaceC1173a);
        List listG2 = g(interfaceC1173a2);
        List typeParameters = interfaceC1173a.getTypeParameters();
        List typeParameters2 = interfaceC1173a2.getTypeParameters();
        int i10 = 0;
        if (typeParameters.size() != typeParameters2.size()) {
            while (i10 < listG.size()) {
                if (!Dd.e.f2664a.c((E) listG.get(i10), (E) listG2.get(i10))) {
                    i iVarD = i.d("Type parameter number mismatch");
                    if (iVarD == null) {
                        a(33);
                    }
                    return iVarD;
                }
                i10++;
            }
            i iVarB = i.b("Type parameter number mismatch");
            if (iVarB == null) {
                a(34);
            }
            return iVarB;
        }
        d0 d0VarL = l(typeParameters, typeParameters2);
        for (int i11 = 0; i11 < typeParameters.size(); i11++) {
            if (!c((f0) typeParameters.get(i11), (f0) typeParameters2.get(i11), d0VarL)) {
                i iVarD2 = i.d("Type parameter bounds mismatch");
                if (iVarD2 == null) {
                    a(35);
                }
                return iVarD2;
            }
        }
        while (i10 < listG.size()) {
            if (!d((E) listG.get(i10), (E) listG2.get(i10), d0VarL)) {
                i iVarD3 = i.d("Value parameter type mismatch");
                if (iVarD3 == null) {
                    a(36);
                }
                return iVarD3;
            }
            i10++;
        }
        if ((interfaceC1173a instanceof InterfaceC1196y) && (interfaceC1173a2 instanceof InterfaceC1196y) && ((InterfaceC1196y) interfaceC1173a).isSuspend() != ((InterfaceC1196y) interfaceC1173a2).isSuspend()) {
            i iVarB2 = i.b("Incompatible suspendability");
            if (iVarB2 == null) {
                a(37);
            }
            return iVarB2;
        }
        if (z10) {
            E returnType = interfaceC1173a.getReturnType();
            E returnType2 = interfaceC1173a2.getReturnType();
            if (returnType != null && returnType2 != null && ((!G.a(returnType2) || !G.a(returnType)) && !C0722e.f1329a.r(d0VarL, returnType2.Q0(), returnType.Q0()))) {
                i iVarB3 = i.b("Return type mismatch");
                if (iVarB3 == null) {
                    a(38);
                }
                return iVarB3;
            }
        }
        i iVarE = i.e();
        if (iVarE == null) {
            a(39);
        }
        return iVarE;
    }

    public final d0 l(List list, List list2) {
        if (list == null) {
            a(42);
        }
        if (list2 == null) {
            a(43);
        }
        if (list.isEmpty()) {
            d0 d0VarH0 = new C5290l(null, this.f41548c, this.f41546a, this.f41547b, this.f41549d).H0(true, true);
            if (d0VarH0 == null) {
                a(44);
            }
            return d0VarH0;
        }
        HashMap map = new HashMap();
        for (int i10 = 0; i10 < list.size(); i10++) {
            map.put(((f0) list.get(i10)).k(), ((f0) list2.get(i10)).k());
        }
        d0 d0VarH02 = new C5290l(map, this.f41548c, this.f41546a, this.f41547b, this.f41549d).H0(true, true);
        if (d0VarH02 == null) {
            a(45);
        }
        return d0VarH02;
    }

    public final Collection o(InterfaceC1174b interfaceC1174b, Collection collection, InterfaceC1177e interfaceC1177e, AbstractC5288j abstractC5288j) {
        if (interfaceC1174b == null) {
            a(59);
        }
        if (collection == null) {
            a(60);
        }
        if (interfaceC1177e == null) {
            a(61);
        }
        if (abstractC5288j == null) {
            a(62);
        }
        ArrayList arrayList = new ArrayList(collection.size());
        Md.f fVarC = Md.f.c();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            InterfaceC1174b interfaceC1174b2 = (InterfaceC1174b) it.next();
            i.a aVarC = D(interfaceC1174b2, interfaceC1174b, interfaceC1177e).c();
            boolean zI = I(interfaceC1174b, interfaceC1174b2, false);
            int i10 = h.f41555b[aVarC.ordinal()];
            if (i10 == 1) {
                if (zI) {
                    fVarC.add(interfaceC1174b2);
                }
                arrayList.add(interfaceC1174b2);
            } else if (i10 == 2) {
                if (zI) {
                    abstractC5288j.c(interfaceC1174b2, interfaceC1174b);
                }
                arrayList.add(interfaceC1174b2);
            }
        }
        abstractC5288j.d(interfaceC1174b, fVarC);
        return arrayList;
    }

    public void v(kd.f fVar, Collection collection, Collection collection2, InterfaceC1177e interfaceC1177e, AbstractC5288j abstractC5288j) {
        if (fVar == null) {
            a(52);
        }
        if (collection == null) {
            a(53);
        }
        if (collection2 == null) {
            a(54);
        }
        if (interfaceC1177e == null) {
            a(55);
        }
        if (abstractC5288j == null) {
            a(56);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(collection);
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            linkedHashSet.removeAll(o((InterfaceC1174b) it.next(), collection, interfaceC1177e, abstractC5288j));
        }
        k(interfaceC1177e, linkedHashSet, abstractC5288j);
    }

    /* JADX INFO: renamed from: od.k$d */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class d implements vc.l {
        @Override // vc.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public InterfaceC1174b invoke(InterfaceC1174b interfaceC1174b) {
            return interfaceC1174b;
        }
    }

    /* JADX INFO: renamed from: od.k$f */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class f implements vc.l {
        @Override // vc.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public InterfaceC1173a invoke(InterfaceC1174b interfaceC1174b) {
            return interfaceC1174b;
        }
    }
}
