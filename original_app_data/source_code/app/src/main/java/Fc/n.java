package Fc;

import Fc.F;
import Lc.AbstractC1191t;
import Lc.AbstractC1192u;
import Lc.InterfaceC1174b;
import Lc.InterfaceC1184l;
import Lc.InterfaceC1196y;
import Lc.U;
import com.fasterxml.jackson.core.JsonPointer;
import fc.C4015H;
import gc.C4179C;
import gc.P;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import kotlin.jvm.internal.InterfaceC4851h;
import nd.AbstractC5164c;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class n implements InterfaceC4851h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f3956a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Class f3957b = AbstractC4854k.class;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Od.o f3958c = new Od.o("<v#(\\d+)>");

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public final Od.o a() {
            return n.f3958c;
        }

        public a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public abstract class b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ Cc.l[] f3959c = {kotlin.jvm.internal.M.g(new kotlin.jvm.internal.E(kotlin.jvm.internal.M.b(b.class), "moduleData", "getModuleData()Lorg/jetbrains/kotlin/descriptors/runtime/components/RuntimeModuleData;"))};

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final F.a f3960a;

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class a extends kotlin.jvm.internal.v implements InterfaceC6082a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ n f3962a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(n nVar) {
                super(0);
                this.f3962a = nVar;
            }

            @Override // vc.InterfaceC6082a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Qc.k invoke() {
                return E.a(this.f3962a.d());
            }
        }

        public b() {
            this.f3960a = F.d(new a(n.this));
        }

        public final Qc.k a() {
            Object objB = this.f3960a.b(this, f3959c[0]);
            AbstractC4862t.d(objB, "<get-moduleData>(...)");
            return (Qc.k) objB;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public enum c {
        DECLARED,
        INHERITED;

        public final boolean b(InterfaceC1174b member) {
            AbstractC4862t.e(member, "member");
            return member.f().a() == (this == DECLARED);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class d extends kotlin.jvm.internal.v implements vc.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f3963a = new d();

        public d() {
            super(1);
        }

        @Override // vc.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(InterfaceC1196y descriptor) {
            AbstractC4862t.e(descriptor, "descriptor");
            return AbstractC5164c.f40786j.q(descriptor) + " | " + I.f3848a.g(descriptor).a();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class e extends kotlin.jvm.internal.v implements vc.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f3964a = new e();

        public e() {
            super(1);
        }

        @Override // vc.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(U descriptor) {
            AbstractC4862t.e(descriptor, "descriptor");
            return AbstractC5164c.f40786j.q(descriptor) + " | " + I.f3848a.f(descriptor).a();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class f extends kotlin.jvm.internal.v implements vc.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f f3965a = new f();

        public f() {
            super(2);
        }

        @Override // vc.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer invoke(AbstractC1192u abstractC1192u, AbstractC1192u abstractC1192u2) {
            Integer numD = AbstractC1191t.d(abstractC1192u, abstractC1192u2);
            return Integer.valueOf(numD == null ? 0 : numD.intValue());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class g extends C0830e {
        public g(n nVar) {
            super(nVar);
        }

        @Override // Oc.C1818l, Lc.InterfaceC1187o
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public AbstractC0835j b(InterfaceC1184l descriptor, C4015H data) {
            AbstractC4862t.e(descriptor, "descriptor");
            AbstractC4862t.e(data, "data");
            throw new IllegalStateException("No constructors should appear here: " + descriptor);
        }
    }

    public static final int x(vc.p tmp0, Object obj, Object obj2) {
        AbstractC4862t.e(tmp0, "$tmp0");
        return ((Number) tmp0.invoke(obj, obj2)).intValue();
    }

    public abstract U A(int i10);

    /* JADX WARN: Removed duplicated region for block: B:12:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.Collection B(vd.InterfaceC6099h r7, Fc.n.c r8) {
        /*
            r6 = this;
            java.lang.String r0 = "scope"
            kotlin.jvm.internal.AbstractC4862t.e(r7, r0)
            java.lang.String r0 = "belonginess"
            kotlin.jvm.internal.AbstractC4862t.e(r8, r0)
            Fc.n$g r0 = new Fc.n$g
            r0.<init>(r6)
            r6 = 3
            r1 = 0
            java.util.Collection r6 = vd.InterfaceC6102k.a.a(r7, r1, r1, r6, r1)
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r6 = r6.iterator()
        L1e:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L53
            java.lang.Object r2 = r6.next()
            Lc.m r2 = (Lc.InterfaceC1185m) r2
            boolean r3 = r2 instanceof Lc.InterfaceC1174b
            if (r3 == 0) goto L4c
            r3 = r2
            Lc.b r3 = (Lc.InterfaceC1174b) r3
            Lc.u r4 = r3.getVisibility()
            Lc.u r5 = Lc.AbstractC1191t.f8778h
            boolean r4 = kotlin.jvm.internal.AbstractC4862t.a(r4, r5)
            if (r4 != 0) goto L4c
            boolean r3 = r8.b(r3)
            if (r3 == 0) goto L4c
            fc.H r3 = fc.C4015H.f34254a
            java.lang.Object r2 = r2.j0(r0, r3)
            Fc.j r2 = (Fc.AbstractC0835j) r2
            goto L4d
        L4c:
            r2 = r1
        L4d:
            if (r2 == 0) goto L1e
            r7.add(r2)
            goto L1e
        L53:
            java.util.List r6 = gc.C4179C.V0(r7)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: Fc.n.B(vd.h, Fc.n$c):java.util.Collection");
    }

    public Class C() {
        Class clsG = Rc.d.g(d());
        return clsG == null ? d() : clsG;
    }

    public abstract Collection D(kd.f fVar);

    public final List E(String str) {
        String str2;
        int iH0;
        ArrayList arrayList = new ArrayList();
        int i10 = 1;
        while (str.charAt(i10) != ')') {
            int i11 = i10;
            while (str.charAt(i11) == '[') {
                i11++;
            }
            char cCharAt = str.charAt(i11);
            if (Od.F.U("VZCBSIFJD", cCharAt, false, 2, null)) {
                int i12 = i11 + 1;
                str2 = str;
                iH0 = i12;
            } else {
                if (cCharAt != 'L') {
                    throw new D("Unknown type prefix in the method signature: " + str);
                }
                str2 = str;
                iH0 = Od.F.h0(str2, ';', i10, false, 4, null) + 1;
            }
            arrayList.add(H(str2, i10, iH0));
            i10 = iH0;
            str = str2;
        }
        return arrayList;
    }

    public final Class F(String str) {
        return H(str, Od.F.h0(str, ')', 0, false, 6, null) + 1, str.length());
    }

    public final Method G(Class cls, String str, Class[] clsArr, Class cls2, boolean z10) {
        n nVar;
        String str2;
        Class[] clsArr2;
        Class cls3;
        boolean z11;
        if (z10) {
            clsArr[0] = cls;
        }
        Method methodJ = J(cls, str, clsArr, cls2);
        if (methodJ != null) {
            return methodJ;
        }
        Class superclass = cls.getSuperclass();
        if (superclass != null) {
            Method methodG = G(superclass, str, clsArr, cls2, z10);
            nVar = this;
            str2 = str;
            clsArr2 = clsArr;
            cls3 = cls2;
            z11 = z10;
            if (methodG != null) {
                return methodG;
            }
        } else {
            nVar = this;
            str2 = str;
            clsArr2 = clsArr;
            cls3 = cls2;
            z11 = z10;
        }
        Class<?>[] interfaces = cls.getInterfaces();
        AbstractC4862t.d(interfaces, "interfaces");
        for (Class<?> superInterface : interfaces) {
            AbstractC4862t.d(superInterface, "superInterface");
            Method methodG2 = nVar.G(superInterface, str2, clsArr2, cls3, z11);
            if (methodG2 != null) {
                return methodG2;
            }
            if (z11) {
                Class clsA = Qc.e.a(Rc.d.f(superInterface), superInterface.getName() + "$DefaultImpls");
                if (clsA != null) {
                    clsArr2[0] = superInterface;
                    Method methodJ2 = nVar.J(clsA, str2, clsArr2, cls3);
                    if (methodJ2 != null) {
                        return methodJ2;
                    }
                } else {
                    continue;
                }
            }
        }
        return null;
    }

    public final Class H(String str, int i10, int i11) throws ClassNotFoundException {
        char cCharAt = str.charAt(i10);
        if (cCharAt == 'L') {
            ClassLoader classLoaderF = Rc.d.f(d());
            String strSubstring = str.substring(i10 + 1, i11 - 1);
            AbstractC4862t.d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            Class<?> clsLoadClass = classLoaderF.loadClass(Od.C.K(strSubstring, JsonPointer.SEPARATOR, '.', false, 4, null));
            AbstractC4862t.d(clsLoadClass, "jClass.safeClassLoader.l…d - 1).replace('/', '.'))");
            return clsLoadClass;
        }
        if (cCharAt == '[') {
            return L.f(H(str, i10 + 1, i11));
        }
        if (cCharAt == 'V') {
            Class TYPE = Void.TYPE;
            AbstractC4862t.d(TYPE, "TYPE");
            return TYPE;
        }
        if (cCharAt == 'Z') {
            return Boolean.TYPE;
        }
        if (cCharAt == 'C') {
            return Character.TYPE;
        }
        if (cCharAt == 'B') {
            return Byte.TYPE;
        }
        if (cCharAt == 'S') {
            return Short.TYPE;
        }
        if (cCharAt == 'I') {
            return Integer.TYPE;
        }
        if (cCharAt == 'F') {
            return Float.TYPE;
        }
        if (cCharAt == 'J') {
            return Long.TYPE;
        }
        if (cCharAt == 'D') {
            return Double.TYPE;
        }
        throw new D("Unknown type prefix in the method signature: " + str);
    }

    public final Constructor I(Class cls, List list) {
        try {
            Class[] clsArr = (Class[]) list.toArray(new Class[0]);
            return cls.getDeclaredConstructor((Class[]) Arrays.copyOf(clsArr, clsArr.length));
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    public final Method J(Class cls, String str, Class[] clsArr, Class cls2) {
        try {
            Method declaredMethod = cls.getDeclaredMethod(str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
            if (AbstractC4862t.a(declaredMethod.getReturnType(), cls2)) {
                return declaredMethod;
            }
            Method[] declaredMethods = cls.getDeclaredMethods();
            AbstractC4862t.d(declaredMethods, "declaredMethods");
            for (Method method : declaredMethods) {
                if (AbstractC4862t.a(method.getName(), str) && AbstractC4862t.a(method.getReturnType(), cls2) && Arrays.equals(method.getParameterTypes(), clsArr)) {
                    return method;
                }
            }
        } catch (NoSuchMethodException unused) {
        }
        return null;
    }

    public final void p(List list, String str, boolean z10) {
        List listE = E(str);
        list.addAll(listE);
        int size = (listE.size() + 31) / 32;
        for (int i10 = 0; i10 < size; i10++) {
            Class TYPE = Integer.TYPE;
            AbstractC4862t.d(TYPE, "TYPE");
            list.add(TYPE);
        }
        if (!z10) {
            list.add(Object.class);
            return;
        }
        Class DEFAULT_CONSTRUCTOR_MARKER = f3957b;
        list.remove(DEFAULT_CONSTRUCTOR_MARKER);
        AbstractC4862t.d(DEFAULT_CONSTRUCTOR_MARKER, "DEFAULT_CONSTRUCTOR_MARKER");
        list.add(DEFAULT_CONSTRUCTOR_MARKER);
    }

    public final Constructor r(String desc) {
        AbstractC4862t.e(desc, "desc");
        return I(d(), E(desc));
    }

    public final Constructor s(String desc) {
        AbstractC4862t.e(desc, "desc");
        Class clsD = d();
        ArrayList arrayList = new ArrayList();
        p(arrayList, desc, true);
        C4015H c4015h = C4015H.f34254a;
        return I(clsD, arrayList);
    }

    public final Method t(String name, String desc, boolean z10) {
        AbstractC4862t.e(name, "name");
        AbstractC4862t.e(desc, "desc");
        if (AbstractC4862t.a(name, "<init>")) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (z10) {
            arrayList.add(d());
        }
        p(arrayList, desc, false);
        return G(C(), name + "$default", (Class[]) arrayList.toArray(new Class[0]), F(desc), z10);
    }

    public final InterfaceC1196y u(String name, String signature) {
        Collection collectionZ;
        AbstractC4862t.e(name, "name");
        AbstractC4862t.e(signature, "signature");
        if (AbstractC4862t.a(name, "<init>")) {
            collectionZ = C4179C.V0(y());
        } else {
            kd.f fVarS = kd.f.s(name);
            AbstractC4862t.d(fVarS, "identifier(name)");
            collectionZ = z(fVarS);
        }
        Collection collection = collectionZ;
        ArrayList arrayList = new ArrayList();
        for (Object obj : collection) {
            if (AbstractC4862t.a(I.f3848a.g((InterfaceC1196y) obj).a(), signature)) {
                arrayList.add(obj);
            }
        }
        if (arrayList.size() == 1) {
            return (InterfaceC1196y) C4179C.F0(arrayList);
        }
        String strQ0 = C4179C.q0(collection, "\n", null, null, 0, null, d.f3963a, 30, null);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Function '");
        sb2.append(name);
        sb2.append("' (JVM signature: ");
        sb2.append(signature);
        sb2.append(") not resolved in ");
        sb2.append(this);
        sb2.append(':');
        sb2.append(strQ0.length() == 0 ? " no members found" : '\n' + strQ0);
        throw new D(sb2.toString());
    }

    public final Method v(String name, String desc) {
        Method methodG;
        AbstractC4862t.e(name, "name");
        AbstractC4862t.e(desc, "desc");
        if (AbstractC4862t.a(name, "<init>")) {
            return null;
        }
        Class[] clsArr = (Class[]) E(desc).toArray(new Class[0]);
        Class clsF = F(desc);
        Method methodG2 = G(C(), name, clsArr, clsF, false);
        if (methodG2 != null) {
            return methodG2;
        }
        if (!C().isInterface() || (methodG = G(Object.class, name, clsArr, clsF, false)) == null) {
            return null;
        }
        return methodG;
    }

    public final U w(String name, String signature) {
        AbstractC4862t.e(name, "name");
        AbstractC4862t.e(signature, "signature");
        Od.k kVarH = f3958c.h(signature);
        if (kVarH != null) {
            String str = (String) kVarH.a().a().b().get(1);
            U uA = A(Integer.parseInt(str));
            if (uA != null) {
                return uA;
            }
            throw new D("Local property #" + str + " not found in " + d());
        }
        kd.f fVarS = kd.f.s(name);
        AbstractC4862t.d(fVarS, "identifier(name)");
        Collection collectionD = D(fVarS);
        ArrayList arrayList = new ArrayList();
        for (Object obj : collectionD) {
            if (AbstractC4862t.a(I.f3848a.f((U) obj).a(), signature)) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            throw new D("Property '" + name + "' (JVM signature: " + signature + ") not resolved in " + this);
        }
        if (arrayList.size() == 1) {
            return (U) C4179C.F0(arrayList);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj2 : arrayList) {
            AbstractC1192u visibility = ((U) obj2).getVisibility();
            Object arrayList2 = linkedHashMap.get(visibility);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                linkedHashMap.put(visibility, arrayList2);
            }
            ((List) arrayList2).add(obj2);
        }
        Collection collectionValues = P.h(linkedHashMap, new C0838m(f.f3965a)).values();
        AbstractC4862t.d(collectionValues, "properties\n             …\n                }.values");
        List mostVisibleProperties = (List) C4179C.r0(collectionValues);
        if (mostVisibleProperties.size() == 1) {
            AbstractC4862t.d(mostVisibleProperties, "mostVisibleProperties");
            return (U) C4179C.h0(mostVisibleProperties);
        }
        kd.f fVarS2 = kd.f.s(name);
        AbstractC4862t.d(fVarS2, "identifier(name)");
        String strQ0 = C4179C.q0(D(fVarS2), "\n", null, null, 0, null, e.f3964a, 30, null);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Property '");
        sb2.append(name);
        sb2.append("' (JVM signature: ");
        sb2.append(signature);
        sb2.append(") not resolved in ");
        sb2.append(this);
        sb2.append(':');
        sb2.append(strQ0.length() == 0 ? " no members found" : '\n' + strQ0);
        throw new D(sb2.toString());
    }

    public abstract Collection y();

    public abstract Collection z(kd.f fVar);
}
