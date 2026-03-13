package androidx.lifecycle;

import gc.C4205s;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC4846c;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: androidx.lifecycle.s, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C2762s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C2762s f23478a = new C2762s();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Map f23479b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Map f23480c = new HashMap();

    public static final String c(String className) {
        AbstractC4862t.e(className, "className");
        return Od.C.L(className, ".", "_", false, 4, null) + "_LifecycleAdapter";
    }

    public static final InterfaceC2756l f(Object object) {
        AbstractC4862t.e(object, "object");
        boolean z10 = object instanceof InterfaceC2756l;
        boolean z11 = object instanceof DefaultLifecycleObserver;
        if (z10 && z11) {
            return new C2749e((DefaultLifecycleObserver) object, (InterfaceC2756l) object);
        }
        if (z11) {
            return new C2749e((DefaultLifecycleObserver) object, null);
        }
        if (z10) {
            return (InterfaceC2756l) object;
        }
        Class<?> cls = object.getClass();
        C2762s c2762s = f23478a;
        if (c2762s.d(cls) != 2) {
            return new A(object);
        }
        Object obj = f23480c.get(cls);
        AbstractC4862t.b(obj);
        List list = (List) obj;
        if (list.size() == 1) {
            c2762s.a((Constructor) list.get(0), object);
            return new M(null);
        }
        int size = list.size();
        InterfaceC2751g[] interfaceC2751gArr = new InterfaceC2751g[size];
        for (int i10 = 0; i10 < size; i10++) {
            f23478a.a((Constructor) list.get(i10), object);
            interfaceC2751gArr[i10] = null;
        }
        return new C2748d(interfaceC2751gArr);
    }

    public final InterfaceC2751g a(Constructor constructor, Object obj) {
        try {
            Object objNewInstance = constructor.newInstance(obj);
            AbstractC4862t.b(objNewInstance);
            android.support.v4.media.session.a.a(objNewInstance);
            return null;
        } catch (IllegalAccessException e10) {
            throw new RuntimeException(e10);
        } catch (InstantiationException e11) {
            throw new RuntimeException(e11);
        } catch (InvocationTargetException e12) {
            throw new RuntimeException(e12);
        }
    }

    public final Constructor b(Class cls) {
        try {
            Package r32 = cls.getPackage();
            String canonicalName = cls.getCanonicalName();
            String name = r32 != null ? r32.getName() : "";
            AbstractC4862t.b(name);
            if (name.length() != 0) {
                AbstractC4862t.b(canonicalName);
                canonicalName = canonicalName.substring(name.length() + 1);
                AbstractC4862t.d(canonicalName, "substring(...)");
            }
            AbstractC4862t.b(canonicalName);
            String strC = c(canonicalName);
            if (name.length() != 0) {
                strC = name + '.' + strC;
            }
            Class<?> cls2 = Class.forName(strC);
            AbstractC4862t.c(cls2, "null cannot be cast to non-null type java.lang.Class<out androidx.lifecycle.GeneratedAdapter>");
            Constructor<?> declaredConstructor = cls2.getDeclaredConstructor(cls);
            if (!declaredConstructor.isAccessible()) {
                declaredConstructor.setAccessible(true);
            }
            return declaredConstructor;
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (NoSuchMethodException e10) {
            throw new RuntimeException(e10);
        }
    }

    public final int d(Class cls) {
        Map map = f23479b;
        Integer num = (Integer) map.get(cls);
        if (num != null) {
            return num.intValue();
        }
        int iG = g(cls);
        map.put(cls, Integer.valueOf(iG));
        return iG;
    }

    public final boolean e(Class cls) {
        return cls != null && InterfaceC2757m.class.isAssignableFrom(cls);
    }

    public final int g(Class cls) {
        ArrayList arrayList;
        if (cls.getCanonicalName() == null) {
            return 1;
        }
        Constructor constructorB = b(cls);
        if (constructorB != null) {
            f23480c.put(cls, C4205s.d(constructorB));
            return 2;
        }
        if (C2747c.f23446c.d(cls)) {
            return 1;
        }
        Class superclass = cls.getSuperclass();
        if (e(superclass)) {
            AbstractC4862t.b(superclass);
            if (d(superclass) == 1) {
                return 1;
            }
            Object obj = f23480c.get(superclass);
            AbstractC4862t.b(obj);
            arrayList = new ArrayList((Collection) obj);
        } else {
            arrayList = null;
        }
        Iterator itA = AbstractC4846c.a(cls.getInterfaces());
        while (itA.hasNext()) {
            Class cls2 = (Class) itA.next();
            if (e(cls2)) {
                AbstractC4862t.b(cls2);
                if (d(cls2) == 1) {
                    return 1;
                }
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                Object obj2 = f23480c.get(cls2);
                AbstractC4862t.b(obj2);
                arrayList.addAll((Collection) obj2);
            }
        }
        if (arrayList == null) {
            return 1;
        }
        f23480c.put(cls, arrayList);
        return 2;
    }
}
