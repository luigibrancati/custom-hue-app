package Rc;

import com.fasterxml.jackson.core.JsonPointer;
import fc.AbstractC4040w;
import gc.C4204q;
import gc.C4206t;
import gc.C4207u;
import gc.Q;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC4862t;
import kotlin.jvm.internal.M;
import uc.AbstractC6017a;
import vc.InterfaceC6082a;
import vc.InterfaceC6083b;
import vc.InterfaceC6084c;
import vc.InterfaceC6085d;
import vc.InterfaceC6086e;
import vc.InterfaceC6087f;
import vc.InterfaceC6088g;
import vc.InterfaceC6089h;
import vc.InterfaceC6090i;
import vc.InterfaceC6091j;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final List f15067a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Map f15068b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Map f15069c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Map f15070d;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends kotlin.jvm.internal.v implements vc.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f15071a = new a();

        public a() {
            super(1);
        }

        @Override // vc.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ParameterizedType invoke(ParameterizedType it) {
            AbstractC4862t.e(it, "it");
            Type ownerType = it.getOwnerType();
            if (ownerType instanceof ParameterizedType) {
                return (ParameterizedType) ownerType;
            }
            return null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends kotlin.jvm.internal.v implements vc.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f15072a = new b();

        public b() {
            super(1);
        }

        @Override // vc.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Nd.h invoke(ParameterizedType it) {
            AbstractC4862t.e(it, "it");
            Type[] actualTypeArguments = it.getActualTypeArguments();
            AbstractC4862t.d(actualTypeArguments, "it.actualTypeArguments");
            return C4204q.J(actualTypeArguments);
        }
    }

    static {
        int i10 = 0;
        List<Cc.d> listN = C4206t.n(M.b(Boolean.TYPE), M.b(Byte.TYPE), M.b(Character.TYPE), M.b(Double.TYPE), M.b(Float.TYPE), M.b(Integer.TYPE), M.b(Long.TYPE), M.b(Short.TYPE));
        f15067a = listN;
        ArrayList arrayList = new ArrayList(C4207u.v(listN, 10));
        for (Cc.d dVar : listN) {
            arrayList.add(AbstractC4040w.a(AbstractC6017a.c(dVar), AbstractC6017a.d(dVar)));
        }
        f15068b = Q.s(arrayList);
        List<Cc.d> list = f15067a;
        ArrayList arrayList2 = new ArrayList(C4207u.v(list, 10));
        for (Cc.d dVar2 : list) {
            arrayList2.add(AbstractC4040w.a(AbstractC6017a.d(dVar2), AbstractC6017a.c(dVar2)));
        }
        f15069c = Q.s(arrayList2);
        List listN2 = C4206t.n(InterfaceC6082a.class, vc.l.class, vc.p.class, vc.q.class, vc.r.class, vc.s.class, vc.t.class, vc.u.class, vc.v.class, vc.w.class, InterfaceC6083b.class, InterfaceC6084c.class, InterfaceC6085d.class, InterfaceC6086e.class, InterfaceC6087f.class, InterfaceC6088g.class, InterfaceC6089h.class, InterfaceC6090i.class, InterfaceC6091j.class, vc.k.class, vc.m.class, vc.n.class, vc.o.class);
        ArrayList arrayList3 = new ArrayList(C4207u.v(listN2, 10));
        for (Object obj : listN2) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                C4206t.u();
            }
            arrayList3.add(AbstractC4040w.a((Class) obj, Integer.valueOf(i10)));
            i10 = i11;
        }
        f15070d = Q.s(arrayList3);
    }

    public static final kd.b a(Class cls) {
        kd.b bVarM;
        kd.b bVarA;
        AbstractC4862t.e(cls, "<this>");
        if (cls.isPrimitive()) {
            throw new IllegalArgumentException("Can't compute ClassId for primitive type: " + cls);
        }
        if (cls.isArray()) {
            throw new IllegalArgumentException("Can't compute ClassId for array type: " + cls);
        }
        if (cls.getEnclosingMethod() == null && cls.getEnclosingConstructor() == null) {
            String simpleName = cls.getSimpleName();
            AbstractC4862t.d(simpleName, "simpleName");
            if (simpleName.length() != 0) {
                Class<?> declaringClass = cls.getDeclaringClass();
                if (declaringClass == null || (bVarA = a(declaringClass)) == null || (bVarM = bVarA.d(kd.f.s(cls.getSimpleName()))) == null) {
                    bVarM = kd.b.m(new kd.c(cls.getName()));
                }
                AbstractC4862t.d(bVarM, "declaringClass?.classId?…Id.topLevel(FqName(name))");
                return bVarM;
            }
        }
        kd.c cVar = new kd.c(cls.getName());
        return new kd.b(cVar.e(), kd.c.k(cVar.g()), true);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final String b(Class cls) {
        AbstractC4862t.e(cls, "<this>");
        if (!cls.isPrimitive()) {
            if (cls.isArray()) {
                String name = cls.getName();
                AbstractC4862t.d(name, "name");
                return Od.C.K(name, '.', JsonPointer.SEPARATOR, false, 4, null);
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append('L');
            String name2 = cls.getName();
            AbstractC4862t.d(name2, "name");
            sb2.append(Od.C.K(name2, '.', JsonPointer.SEPARATOR, false, 4, null));
            sb2.append(';');
            return sb2.toString();
        }
        String name3 = cls.getName();
        switch (name3.hashCode()) {
            case -1325958191:
                if (name3.equals("double")) {
                    return "D";
                }
                break;
            case 104431:
                if (name3.equals("int")) {
                    return "I";
                }
                break;
            case 3039496:
                if (name3.equals("byte")) {
                    return "B";
                }
                break;
            case 3052374:
                if (name3.equals("char")) {
                    return "C";
                }
                break;
            case 3327612:
                if (name3.equals("long")) {
                    return "J";
                }
                break;
            case 3625364:
                if (name3.equals("void")) {
                    return "V";
                }
                break;
            case 64711720:
                if (name3.equals("boolean")) {
                    return "Z";
                }
                break;
            case 97526364:
                if (name3.equals("float")) {
                    return "F";
                }
                break;
            case 109413500:
                if (name3.equals("short")) {
                    return "S";
                }
                break;
        }
        throw new IllegalArgumentException("Unsupported primitive type: " + cls);
    }

    public static final Integer c(Class cls) {
        AbstractC4862t.e(cls, "<this>");
        return (Integer) f15070d.get(cls);
    }

    public static final List d(Type type) {
        AbstractC4862t.e(type, "<this>");
        if (!(type instanceof ParameterizedType)) {
            return C4206t.k();
        }
        ParameterizedType parameterizedType = (ParameterizedType) type;
        if (parameterizedType.getOwnerType() != null) {
            return Nd.t.O(Nd.t.D(Nd.q.n(type, a.f15071a), b.f15072a));
        }
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        AbstractC4862t.d(actualTypeArguments, "actualTypeArguments");
        return C4204q.O0(actualTypeArguments);
    }

    public static final Class e(Class cls) {
        AbstractC4862t.e(cls, "<this>");
        return (Class) f15068b.get(cls);
    }

    public static final ClassLoader f(Class cls) {
        AbstractC4862t.e(cls, "<this>");
        ClassLoader classLoader = cls.getClassLoader();
        if (classLoader != null) {
            return classLoader;
        }
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        AbstractC4862t.d(systemClassLoader, "getSystemClassLoader()");
        return systemClassLoader;
    }

    public static final Class g(Class cls) {
        AbstractC4862t.e(cls, "<this>");
        return (Class) f15069c.get(cls);
    }

    public static final boolean h(Class cls) {
        AbstractC4862t.e(cls, "<this>");
        return Enum.class.isAssignableFrom(cls);
    }
}
