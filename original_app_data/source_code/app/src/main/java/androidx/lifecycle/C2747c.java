package androidx.lifecycle;

import androidx.lifecycle.AbstractC2754j;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: androidx.lifecycle.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C2747c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static C2747c f23446c = new C2747c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f23447a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f23448b = new HashMap();

    /* JADX INFO: renamed from: androidx.lifecycle.c$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Map f23449a = new HashMap();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Map f23450b;

        public a(Map map) {
            this.f23450b = map;
            for (Map.Entry entry : map.entrySet()) {
                AbstractC2754j.a aVar = (AbstractC2754j.a) entry.getValue();
                List arrayList = (List) this.f23449a.get(aVar);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    this.f23449a.put(aVar, arrayList);
                }
                arrayList.add((b) entry.getKey());
            }
        }

        public static void b(List list, InterfaceC2758n interfaceC2758n, AbstractC2754j.a aVar, Object obj) {
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    ((b) list.get(size)).a(interfaceC2758n, aVar, obj);
                }
            }
        }

        public void a(InterfaceC2758n interfaceC2758n, AbstractC2754j.a aVar, Object obj) {
            b((List) this.f23449a.get(aVar), interfaceC2758n, aVar, obj);
            b((List) this.f23449a.get(AbstractC2754j.a.ON_ANY), interfaceC2758n, aVar, obj);
        }
    }

    /* JADX INFO: renamed from: androidx.lifecycle.c$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f23451a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Method f23452b;

        public b(int i10, Method method) {
            this.f23451a = i10;
            this.f23452b = method;
            method.setAccessible(true);
        }

        public void a(InterfaceC2758n interfaceC2758n, AbstractC2754j.a aVar, Object obj) {
            try {
                int i10 = this.f23451a;
                if (i10 == 0) {
                    this.f23452b.invoke(obj, null);
                } else if (i10 == 1) {
                    this.f23452b.invoke(obj, interfaceC2758n);
                } else {
                    if (i10 != 2) {
                        return;
                    }
                    this.f23452b.invoke(obj, interfaceC2758n, aVar);
                }
            } catch (IllegalAccessException e10) {
                throw new RuntimeException(e10);
            } catch (InvocationTargetException e11) {
                throw new RuntimeException("Failed to call observer method", e11.getCause());
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f23451a == bVar.f23451a && this.f23452b.getName().equals(bVar.f23452b.getName());
        }

        public int hashCode() {
            return (this.f23451a * 31) + this.f23452b.getName().hashCode();
        }
    }

    public final a a(Class cls, Method[] methodArr) {
        int i10;
        a aVarC;
        Class superclass = cls.getSuperclass();
        HashMap map = new HashMap();
        if (superclass != null && (aVarC = c(superclass)) != null) {
            map.putAll(aVarC.f23450b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            for (Map.Entry entry : c(cls2).f23450b.entrySet()) {
                e(map, (b) entry.getKey(), (AbstractC2754j.a) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            methodArr = b(cls);
        }
        boolean z10 = false;
        for (Method method : methodArr) {
            y yVar = (y) method.getAnnotation(y.class);
            if (yVar != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i10 = 0;
                } else {
                    if (!InterfaceC2758n.class.isAssignableFrom(parameterTypes[0])) {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                    i10 = 1;
                }
                AbstractC2754j.a aVarValue = yVar.value();
                if (parameterTypes.length > 1) {
                    if (!AbstractC2754j.a.class.isAssignableFrom(parameterTypes[1])) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                    if (aVarValue != AbstractC2754j.a.ON_ANY) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                    i10 = 2;
                }
                if (parameterTypes.length > 2) {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
                e(map, new b(i10, method), aVarValue, cls);
                z10 = true;
            }
        }
        a aVar = new a(map);
        this.f23447a.put(cls, aVar);
        this.f23448b.put(cls, Boolean.valueOf(z10));
        return aVar;
    }

    public final Method[] b(Class cls) {
        try {
            return cls.getDeclaredMethods();
        } catch (NoClassDefFoundError e10) {
            throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e10);
        }
    }

    public a c(Class cls) {
        a aVar = (a) this.f23447a.get(cls);
        return aVar != null ? aVar : a(cls, null);
    }

    public boolean d(Class cls) {
        Boolean bool = (Boolean) this.f23448b.get(cls);
        if (bool != null) {
            return bool.booleanValue();
        }
        Method[] methodArrB = b(cls);
        for (Method method : methodArrB) {
            if (((y) method.getAnnotation(y.class)) != null) {
                a(cls, methodArrB);
                return true;
            }
        }
        this.f23448b.put(cls, Boolean.FALSE);
        return false;
    }

    public final void e(Map map, b bVar, AbstractC2754j.a aVar, Class cls) {
        AbstractC2754j.a aVar2 = (AbstractC2754j.a) map.get(bVar);
        if (aVar2 == null || aVar == aVar2) {
            if (aVar2 == null) {
                map.put(bVar, aVar);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Method " + bVar.f23452b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + aVar2 + ", new value " + aVar);
    }
}
