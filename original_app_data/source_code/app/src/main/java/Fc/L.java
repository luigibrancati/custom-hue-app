package Fc;

import Cd.i0;
import Lc.AbstractC1191t;
import Lc.AbstractC1192u;
import Lc.InterfaceC1173a;
import Lc.InterfaceC1177e;
import Lc.InterfaceC1180h;
import Lc.InterfaceC1185m;
import Lc.X;
import Lc.a0;
import Qc.l;
import dd.C3915t;
import dd.InterfaceC3913r;
import fc.AbstractC4040w;
import fc.C4032o;
import fc.C4034q;
import gc.C4179C;
import gc.C4202o;
import gc.C4205s;
import gc.C4207u;
import gc.Q;
import hd.AbstractC4297a;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC4859p;
import kotlin.jvm.internal.AbstractC4862t;
import kotlin.jvm.internal.O;
import od.AbstractC5285g;
import qd.C5515a;
import qd.C5516b;
import qd.p;
import sd.AbstractC5823c;
import uc.AbstractC6017a;
import yd.C6478k;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class L {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final kd.c f3851a = new kd.c("kotlin.jvm.JvmStatic");

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f3852a;

        static {
            int[] iArr = new int[Ic.h.values().length];
            try {
                iArr[Ic.h.BOOLEAN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Ic.h.CHAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Ic.h.BYTE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Ic.h.SHORT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Ic.h.INT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[Ic.h.FLOAT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[Ic.h.LONG.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[Ic.h.DOUBLE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            f3852a = iArr;
        }
    }

    public static final Object a(C5516b c5516b, ClassLoader classLoader) {
        Cd.E eC;
        Class clsN;
        yd.n nVar = c5516b instanceof yd.n ? (yd.n) c5516b : null;
        if (nVar == null || (eC = nVar.c()) == null) {
            return null;
        }
        Iterable iterable = (Iterable) c5516b.b();
        ArrayList arrayList = new ArrayList(C4207u.v(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(r((qd.g) it.next(), classLoader));
        }
        Ic.h hVarN = Ic.g.N(eC);
        int i10 = 0;
        switch (hVarN == null ? -1 : a.f3852a[hVarN.ordinal()]) {
            case -1:
                if (!Ic.g.c0(eC)) {
                    throw new IllegalStateException(("Not an array type: " + eC).toString());
                }
                Cd.E type = ((i0) C4179C.F0(eC.L0())).getType();
                AbstractC4862t.d(type, "type.arguments.single().type");
                InterfaceC1180h interfaceC1180hQ = type.N0().q();
                InterfaceC1177e interfaceC1177e = interfaceC1180hQ instanceof InterfaceC1177e ? (InterfaceC1177e) interfaceC1180hQ : null;
                if (interfaceC1177e == null) {
                    throw new IllegalStateException(("Not a class type: " + type).toString());
                }
                if (Ic.g.u0(type)) {
                    int size = ((List) c5516b.b()).size();
                    String[] strArr = new String[size];
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        AbstractC4862t.c(obj, "null cannot be cast to non-null type kotlin.String");
                        strArr[i10] = (String) obj;
                        i10++;
                    }
                    return strArr;
                }
                if (Ic.g.k0(interfaceC1177e)) {
                    int size2 = ((List) c5516b.b()).size();
                    Class[] clsArr = new Class[size2];
                    while (i10 < size2) {
                        Object obj2 = arrayList.get(i10);
                        AbstractC4862t.c(obj2, "null cannot be cast to non-null type java.lang.Class<*>");
                        clsArr[i10] = (Class) obj2;
                        i10++;
                    }
                    return clsArr;
                }
                kd.b bVarK = AbstractC5823c.k(interfaceC1177e);
                if (bVarK == null || (clsN = n(classLoader, bVarK, 0, 4, null)) == null) {
                    return null;
                }
                Object objNewInstance = Array.newInstance((Class<?>) clsN, ((List) c5516b.b()).size());
                AbstractC4862t.c(objNewInstance, "null cannot be cast to non-null type kotlin.Array<in kotlin.Any?>");
                Object[] objArr = (Object[]) objNewInstance;
                int size3 = arrayList.size();
                while (i10 < size3) {
                    objArr[i10] = arrayList.get(i10);
                    i10++;
                }
                return objArr;
            case 0:
            default:
                throw new C4032o();
            case 1:
                int size4 = ((List) c5516b.b()).size();
                boolean[] zArr = new boolean[size4];
                while (i10 < size4) {
                    Object obj3 = arrayList.get(i10);
                    AbstractC4862t.c(obj3, "null cannot be cast to non-null type kotlin.Boolean");
                    zArr[i10] = ((Boolean) obj3).booleanValue();
                    i10++;
                }
                return zArr;
            case 2:
                int size5 = ((List) c5516b.b()).size();
                char[] cArr = new char[size5];
                while (i10 < size5) {
                    Object obj4 = arrayList.get(i10);
                    AbstractC4862t.c(obj4, "null cannot be cast to non-null type kotlin.Char");
                    cArr[i10] = ((Character) obj4).charValue();
                    i10++;
                }
                return cArr;
            case 3:
                int size6 = ((List) c5516b.b()).size();
                byte[] bArr = new byte[size6];
                while (i10 < size6) {
                    Object obj5 = arrayList.get(i10);
                    AbstractC4862t.c(obj5, "null cannot be cast to non-null type kotlin.Byte");
                    bArr[i10] = ((Byte) obj5).byteValue();
                    i10++;
                }
                return bArr;
            case 4:
                int size7 = ((List) c5516b.b()).size();
                short[] sArr = new short[size7];
                while (i10 < size7) {
                    Object obj6 = arrayList.get(i10);
                    AbstractC4862t.c(obj6, "null cannot be cast to non-null type kotlin.Short");
                    sArr[i10] = ((Short) obj6).shortValue();
                    i10++;
                }
                return sArr;
            case 5:
                int size8 = ((List) c5516b.b()).size();
                int[] iArr = new int[size8];
                while (i10 < size8) {
                    Object obj7 = arrayList.get(i10);
                    AbstractC4862t.c(obj7, "null cannot be cast to non-null type kotlin.Int");
                    iArr[i10] = ((Integer) obj7).intValue();
                    i10++;
                }
                return iArr;
            case 6:
                int size9 = ((List) c5516b.b()).size();
                float[] fArr = new float[size9];
                while (i10 < size9) {
                    Object obj8 = arrayList.get(i10);
                    AbstractC4862t.c(obj8, "null cannot be cast to non-null type kotlin.Float");
                    fArr[i10] = ((Float) obj8).floatValue();
                    i10++;
                }
                return fArr;
            case 7:
                int size10 = ((List) c5516b.b()).size();
                long[] jArr = new long[size10];
                while (i10 < size10) {
                    Object obj9 = arrayList.get(i10);
                    AbstractC4862t.c(obj9, "null cannot be cast to non-null type kotlin.Long");
                    jArr[i10] = ((Long) obj9).longValue();
                    i10++;
                }
                return jArr;
            case 8:
                int size11 = ((List) c5516b.b()).size();
                double[] dArr = new double[size11];
                while (i10 < size11) {
                    Object obj10 = arrayList.get(i10);
                    AbstractC4862t.c(obj10, "null cannot be cast to non-null type kotlin.Double");
                    dArr[i10] = ((Double) obj10).doubleValue();
                    i10++;
                }
                return dArr;
        }
    }

    public static final AbstractC0835j b(Object obj) {
        AbstractC0835j abstractC0835j = obj instanceof AbstractC0835j ? (AbstractC0835j) obj : null;
        if (abstractC0835j != null) {
            return abstractC0835j;
        }
        o oVarC = c(obj);
        return oVarC != null ? oVarC : d(obj);
    }

    public static final o c(Object obj) {
        o oVar = obj instanceof o ? (o) obj : null;
        if (oVar != null) {
            return oVar;
        }
        AbstractC4859p abstractC4859p = obj instanceof AbstractC4859p ? (AbstractC4859p) obj : null;
        Cc.c cVarCompute = abstractC4859p != null ? abstractC4859p.compute() : null;
        if (cVarCompute instanceof o) {
            return (o) cVarCompute;
        }
        return null;
    }

    public static final y d(Object obj) {
        y yVar = obj instanceof y ? (y) obj : null;
        if (yVar != null) {
            return yVar;
        }
        kotlin.jvm.internal.H h10 = obj instanceof kotlin.jvm.internal.H ? (kotlin.jvm.internal.H) obj : null;
        Cc.c cVarCompute = h10 != null ? h10.compute() : null;
        if (cVarCompute instanceof y) {
            return (y) cVarCompute;
        }
        return null;
    }

    public static final List e(Mc.a aVar) {
        Annotation annotationO;
        AbstractC4862t.e(aVar, "<this>");
        Mc.g<Mc.c> annotations = aVar.getAnnotations();
        ArrayList arrayList = new ArrayList();
        for (Mc.c cVar : annotations) {
            a0 a0VarJ = cVar.j();
            if (a0VarJ instanceof Qc.b) {
                annotationO = ((Qc.b) a0VarJ).d();
            } else if (a0VarJ instanceof l.a) {
                Rc.p pVarC = ((l.a) a0VarJ).c();
                Rc.e eVar = pVarC instanceof Rc.e ? (Rc.e) pVarC : null;
                annotationO = eVar != null ? eVar.Q() : null;
            } else {
                annotationO = o(cVar);
            }
            if (annotationO != null) {
                arrayList.add(annotationO);
            }
        }
        return s(arrayList);
    }

    public static final Class f(Class cls) {
        AbstractC4862t.e(cls, "<this>");
        return Array.newInstance((Class<?>) cls, 0).getClass();
    }

    public static final Object g(Type type) {
        AbstractC4862t.e(type, "type");
        if (!(type instanceof Class) || !((Class) type).isPrimitive()) {
            return null;
        }
        if (AbstractC4862t.a(type, Boolean.TYPE)) {
            return Boolean.FALSE;
        }
        if (AbstractC4862t.a(type, Character.TYPE)) {
            return (char) 0;
        }
        if (AbstractC4862t.a(type, Byte.TYPE)) {
            return (byte) 0;
        }
        if (AbstractC4862t.a(type, Short.TYPE)) {
            return (short) 0;
        }
        if (AbstractC4862t.a(type, Integer.TYPE)) {
            return 0;
        }
        if (AbstractC4862t.a(type, Float.TYPE)) {
            return Float.valueOf(0.0f);
        }
        if (AbstractC4862t.a(type, Long.TYPE)) {
            return 0L;
        }
        if (AbstractC4862t.a(type, Double.TYPE)) {
            return Double.valueOf(0.0d);
        }
        if (AbstractC4862t.a(type, Void.TYPE)) {
            throw new IllegalStateException("Parameter with void type is illegal");
        }
        throw new UnsupportedOperationException("Unknown primitive: " + type);
    }

    public static final InterfaceC1173a h(Class moduleAnchor, md.p proto, hd.c nameResolver, hd.g typeTable, AbstractC4297a metadataVersion, vc.p createDescriptor) {
        List listH0;
        AbstractC4862t.e(moduleAnchor, "moduleAnchor");
        AbstractC4862t.e(proto, "proto");
        AbstractC4862t.e(nameResolver, "nameResolver");
        AbstractC4862t.e(typeTable, "typeTable");
        AbstractC4862t.e(metadataVersion, "metadataVersion");
        AbstractC4862t.e(createDescriptor, "createDescriptor");
        Qc.k kVarA = E.a(moduleAnchor);
        if (proto instanceof fd.i) {
            listH0 = ((fd.i) proto).g0();
        } else {
            if (!(proto instanceof fd.n)) {
                throw new IllegalStateException(("Unsupported message: " + proto).toString());
            }
            listH0 = ((fd.n) proto).h0();
        }
        List typeParameters = listH0;
        C6478k c6478kA = kVarA.a();
        Lc.G gB = kVarA.b();
        hd.h hVarB = hd.h.f36571b.b();
        AbstractC4862t.d(typeParameters, "typeParameters");
        return (InterfaceC1173a) createDescriptor.invoke(new yd.w(new yd.m(c6478kA, nameResolver, gB, typeTable, hVarB, metadataVersion, null, null, typeParameters)), proto);
    }

    public static final X i(InterfaceC1173a interfaceC1173a) {
        AbstractC4862t.e(interfaceC1173a, "<this>");
        if (interfaceC1173a.J() == null) {
            return null;
        }
        InterfaceC1185m interfaceC1185mB = interfaceC1173a.b();
        AbstractC4862t.c(interfaceC1185mB, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        return ((InterfaceC1177e) interfaceC1185mB).J0();
    }

    public static final kd.c j() {
        return f3851a;
    }

    public static final boolean k(Cc.p pVar) {
        Cd.E eM;
        AbstractC4862t.e(pVar, "<this>");
        A a10 = pVar instanceof A ? (A) pVar : null;
        return (a10 == null || (eM = a10.m()) == null || !AbstractC5285g.c(eM)) ? false : true;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final Class l(ClassLoader classLoader, String str, String str2, int i10) {
        if (AbstractC4862t.a(str, "kotlin")) {
            switch (str2.hashCode()) {
                case -901856463:
                    if (str2.equals("BooleanArray")) {
                        return boolean[].class;
                    }
                    break;
                case -763279523:
                    if (str2.equals("ShortArray")) {
                        return short[].class;
                    }
                    break;
                case -755911549:
                    if (str2.equals("CharArray")) {
                        return char[].class;
                    }
                    break;
                case -74930671:
                    if (str2.equals("ByteArray")) {
                        return byte[].class;
                    }
                    break;
                case 22374632:
                    if (str2.equals("DoubleArray")) {
                        return double[].class;
                    }
                    break;
                case 63537721:
                    if (str2.equals("Array")) {
                        return Object[].class;
                    }
                    break;
                case 601811914:
                    if (str2.equals("IntArray")) {
                        return int[].class;
                    }
                    break;
                case 948852093:
                    if (str2.equals("FloatArray")) {
                        return float[].class;
                    }
                    break;
                case 2104330525:
                    if (str2.equals("LongArray")) {
                        return long[].class;
                    }
                    break;
            }
        }
        String str3 = str + '.' + Od.C.K(str2, '.', '$', false, 4, null);
        if (i10 > 0) {
            str3 = Od.C.H("[", i10) + 'L' + str3 + ';';
        }
        return Qc.e.a(classLoader, str3);
    }

    public static final Class m(ClassLoader classLoader, kd.b bVar, int i10) {
        Kc.c cVar = Kc.c.f7792a;
        kd.d dVarJ = bVar.b().j();
        AbstractC4862t.d(dVarJ, "kotlinClassId.asSingleFqName().toUnsafe()");
        kd.b bVarN = cVar.n(dVarJ);
        if (bVarN != null) {
            bVar = bVarN;
        }
        String strB = bVar.h().b();
        AbstractC4862t.d(strB, "javaClassId.packageFqName.asString()");
        String strB2 = bVar.i().b();
        AbstractC4862t.d(strB2, "javaClassId.relativeClassName.asString()");
        return l(classLoader, strB, strB2, i10);
    }

    public static /* synthetic */ Class n(ClassLoader classLoader, kd.b bVar, int i10, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        return m(classLoader, bVar, i10);
    }

    public static final Annotation o(Mc.c cVar) {
        InterfaceC1177e interfaceC1177eI = AbstractC5823c.i(cVar);
        Class clsP = interfaceC1177eI != null ? p(interfaceC1177eI) : null;
        if (clsP == null) {
            clsP = null;
        }
        if (clsP == null) {
            return null;
        }
        Set<Map.Entry> setEntrySet = cVar.a().entrySet();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : setEntrySet) {
            kd.f fVar = (kd.f) entry.getKey();
            qd.g gVar = (qd.g) entry.getValue();
            ClassLoader classLoader = clsP.getClassLoader();
            AbstractC4862t.d(classLoader, "annotationClass.classLoader");
            Object objR = r(gVar, classLoader);
            C4034q c4034qA = objR != null ? AbstractC4040w.a(fVar.b(), objR) : null;
            if (c4034qA != null) {
                arrayList.add(c4034qA);
            }
        }
        return (Annotation) Gc.c.e(clsP, Q.s(arrayList), null, 4, null);
    }

    public static final Class p(InterfaceC1177e interfaceC1177e) {
        AbstractC4862t.e(interfaceC1177e, "<this>");
        a0 source = interfaceC1177e.j();
        AbstractC4862t.d(source, "source");
        if (source instanceof C3915t) {
            InterfaceC3913r interfaceC3913rD = ((C3915t) source).d();
            AbstractC4862t.c(interfaceC3913rD, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.runtime.components.ReflectKotlinClass");
            return ((Qc.f) interfaceC3913rD).f();
        }
        if (source instanceof l.a) {
            Rc.p pVarC = ((l.a) source).c();
            AbstractC4862t.c(pVarC, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.runtime.structure.ReflectJavaClass");
            return ((Rc.l) pVarC).r();
        }
        kd.b bVarK = AbstractC5823c.k(interfaceC1177e);
        if (bVarK == null) {
            return null;
        }
        return m(Rc.d.f(interfaceC1177e.getClass()), bVarK, 0);
    }

    public static final Cc.t q(AbstractC1192u abstractC1192u) {
        AbstractC4862t.e(abstractC1192u, "<this>");
        if (AbstractC4862t.a(abstractC1192u, AbstractC1191t.f8775e)) {
            return Cc.t.PUBLIC;
        }
        if (AbstractC4862t.a(abstractC1192u, AbstractC1191t.f8773c)) {
            return Cc.t.PROTECTED;
        }
        if (AbstractC4862t.a(abstractC1192u, AbstractC1191t.f8774d)) {
            return Cc.t.INTERNAL;
        }
        if (AbstractC4862t.a(abstractC1192u, AbstractC1191t.f8771a) ? true : AbstractC4862t.a(abstractC1192u, AbstractC1191t.f8772b)) {
            return Cc.t.PRIVATE;
        }
        return null;
    }

    public static final Object r(qd.g gVar, ClassLoader classLoader) {
        if (gVar instanceof C5515a) {
            return o((Mc.c) ((C5515a) gVar).b());
        }
        if (gVar instanceof C5516b) {
            return a((C5516b) gVar, classLoader);
        }
        if (gVar instanceof qd.j) {
            C4034q c4034q = (C4034q) ((qd.j) gVar).b();
            kd.b bVar = (kd.b) c4034q.a();
            kd.f fVar = (kd.f) c4034q.b();
            Class clsN = n(classLoader, bVar, 0, 4, null);
            if (clsN != null) {
                return K.a(clsN, fVar.b());
            }
            return null;
        }
        if (!(gVar instanceof qd.p)) {
            if (gVar instanceof qd.k ? true : gVar instanceof qd.r) {
                return null;
            }
            return gVar.b();
        }
        p.b bVar2 = (p.b) ((qd.p) gVar).b();
        if (bVar2 instanceof p.b.C0583b) {
            p.b.C0583b c0583b = (p.b.C0583b) bVar2;
            return m(classLoader, c0583b.b(), c0583b.a());
        }
        if (!(bVar2 instanceof p.b.a)) {
            throw new C4032o();
        }
        InterfaceC1180h interfaceC1180hQ = ((p.b.a) bVar2).a().N0().q();
        InterfaceC1177e interfaceC1177e = interfaceC1180hQ instanceof InterfaceC1177e ? (InterfaceC1177e) interfaceC1180hQ : null;
        if (interfaceC1177e != null) {
            return p(interfaceC1177e);
        }
        return null;
    }

    public static final List s(List list) throws IllegalAccessException, InvocationTargetException {
        List listD;
        if (list != null && list.isEmpty()) {
            return list;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (AbstractC4862t.a(AbstractC6017a.b(AbstractC6017a.a((Annotation) it.next())).getSimpleName(), "Container")) {
                ArrayList arrayList = new ArrayList();
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    Annotation annotation = (Annotation) it2.next();
                    Class clsB = AbstractC6017a.b(AbstractC6017a.a(annotation));
                    if (!AbstractC4862t.a(clsB.getSimpleName(), "Container") || clsB.getAnnotation(O.class) == null) {
                        listD = C4205s.d(annotation);
                    } else {
                        Object objInvoke = clsB.getDeclaredMethod("value", null).invoke(annotation, null);
                        AbstractC4862t.c(objInvoke, "null cannot be cast to non-null type kotlin.Array<out kotlin.Annotation>");
                        listD = C4202o.h((Annotation[]) objInvoke);
                    }
                    gc.y.C(arrayList, listD);
                }
                return arrayList;
            }
        }
        return list;
    }
}
