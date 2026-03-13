package w9;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;
import z9.AbstractC6553a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f46422a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f46423b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f46424c;

    public u(Map map, boolean z10, List list) {
        this.f46422a = map;
        this.f46423b = z10;
        this.f46424c = list;
    }

    public static /* synthetic */ Object a() {
        return new LinkedHashMap();
    }

    public static /* synthetic */ Object b() {
        return new ArrayList();
    }

    public static /* synthetic */ Object c() {
        return new z();
    }

    public static /* synthetic */ Object d(String str) {
        throw new u9.k(str);
    }

    public static /* synthetic */ Object e() {
        return new TreeMap();
    }

    public static /* synthetic */ Object f() {
        return new ConcurrentHashMap();
    }

    public static /* synthetic */ Object g() {
        return new TreeSet();
    }

    public static /* synthetic */ Object h(String str) {
        throw new u9.k(str);
    }

    public static /* synthetic */ Object i(Class cls) {
        try {
            return H.f46400a.d(cls);
        } catch (Exception e10) {
            throw new RuntimeException("Unable to create instance of " + cls + ". Registering an InstanceCreator or a TypeAdapter for this type, or adding a no-args constructor may fix this problem.", e10);
        }
    }

    public static /* synthetic */ Object j(Constructor constructor) {
        try {
            return constructor.newInstance(null);
        } catch (IllegalAccessException e10) {
            throw AbstractC6553a.e(e10);
        } catch (InstantiationException e11) {
            throw new RuntimeException("Failed to invoke constructor '" + AbstractC6553a.c(constructor) + "' with no args", e11);
        } catch (InvocationTargetException e12) {
            throw new RuntimeException("Failed to invoke constructor '" + AbstractC6553a.c(constructor) + "' with no args", e12.getCause());
        }
    }

    public static /* synthetic */ Object k(Type type) {
        if (!(type instanceof ParameterizedType)) {
            throw new u9.k("Invalid EnumMap type: " + type.toString());
        }
        Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
        if (type2 instanceof Class) {
            return new EnumMap((Class) type2);
        }
        throw new u9.k("Invalid EnumMap type: " + type.toString());
    }

    public static /* synthetic */ Object l(String str) {
        throw new u9.k(str);
    }

    public static /* synthetic */ Object m() {
        return new LinkedHashSet();
    }

    public static /* synthetic */ Object n(String str) {
        throw new u9.k(str);
    }

    public static /* synthetic */ Object o(String str) {
        throw new u9.k(str);
    }

    public static /* synthetic */ Object p() {
        return new ConcurrentSkipListMap();
    }

    public static /* synthetic */ Object q() {
        return new ArrayDeque();
    }

    public static /* synthetic */ Object r(Type type) {
        if (!(type instanceof ParameterizedType)) {
            throw new u9.k("Invalid EnumSet type: " + type.toString());
        }
        Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
        if (type2 instanceof Class) {
            return EnumSet.noneOf((Class) type2);
        }
        throw new u9.k("Invalid EnumSet type: " + type.toString());
    }

    public static String s(Class cls) {
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            return "Interfaces can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Interface name: " + cls.getName();
        }
        if (!Modifier.isAbstract(modifiers)) {
            return null;
        }
        return "Abstract classes can't be instantiated! Adjust the R8 configuration or register an InstanceCreator or a TypeAdapter for this type. Class name: " + cls.getName() + "\nSee " + G.a("r8-abstract-class");
    }

    public static B u(Class cls, u9.s sVar) {
        final String strP;
        if (Modifier.isAbstract(cls.getModifiers())) {
            return null;
        }
        try {
            final Constructor declaredConstructor = cls.getDeclaredConstructor(null);
            u9.s sVar2 = u9.s.ALLOW;
            if (sVar == sVar2 || (E.a(declaredConstructor, null) && (sVar != u9.s.BLOCK_ALL || Modifier.isPublic(declaredConstructor.getModifiers())))) {
                return (sVar != sVar2 || (strP = AbstractC6553a.p(declaredConstructor)) == null) ? new B() { // from class: w9.k
                    @Override // w9.B
                    public final Object a() {
                        return u.j(declaredConstructor);
                    }
                } : new B() { // from class: w9.j
                    @Override // w9.B
                    public final Object a() {
                        return u.l(strP);
                    }
                };
            }
            final String str = "Unable to invoke no-args constructor of " + cls + "; constructor is not accessible and ReflectionAccessFilter does not permit making it accessible. Register an InstanceCreator or a TypeAdapter for this type, change the visibility of the constructor or adjust the access filter.";
            return new B() { // from class: w9.i
                @Override // w9.B
                public final Object a() {
                    return u.h(str);
                }
            };
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    public static B v(Type type, Class cls) {
        if (Collection.class.isAssignableFrom(cls)) {
            return SortedSet.class.isAssignableFrom(cls) ? new B() { // from class: w9.o
                @Override // w9.B
                public final Object a() {
                    return u.g();
                }
            } : Set.class.isAssignableFrom(cls) ? new B() { // from class: w9.p
                @Override // w9.B
                public final Object a() {
                    return u.m();
                }
            } : Queue.class.isAssignableFrom(cls) ? new B() { // from class: w9.q
                @Override // w9.B
                public final Object a() {
                    return u.q();
                }
            } : new B() { // from class: w9.r
                @Override // w9.B
                public final Object a() {
                    return u.b();
                }
            };
        }
        if (Map.class.isAssignableFrom(cls)) {
            return ConcurrentNavigableMap.class.isAssignableFrom(cls) ? new B() { // from class: w9.s
                @Override // w9.B
                public final Object a() {
                    return u.p();
                }
            } : ConcurrentMap.class.isAssignableFrom(cls) ? new B() { // from class: w9.t
                @Override // w9.B
                public final Object a() {
                    return u.f();
                }
            } : SortedMap.class.isAssignableFrom(cls) ? new B() { // from class: w9.d
                @Override // w9.B
                public final Object a() {
                    return u.e();
                }
            } : (!(type instanceof ParameterizedType) || String.class.isAssignableFrom(B9.a.b(((ParameterizedType) type).getActualTypeArguments()[0]).c())) ? new B() { // from class: w9.f
                @Override // w9.B
                public final Object a() {
                    return u.c();
                }
            } : new B() { // from class: w9.e
                @Override // w9.B
                public final Object a() {
                    return u.a();
                }
            };
        }
        return null;
    }

    public static B w(final Type type, Class cls) {
        if (EnumSet.class.isAssignableFrom(cls)) {
            return new B() { // from class: w9.g
                @Override // w9.B
                public final Object a() {
                    return u.r(type);
                }
            };
        }
        if (cls == EnumMap.class) {
            return new B() { // from class: w9.h
                @Override // w9.B
                public final Object a() {
                    return u.k(type);
                }
            };
        }
        return null;
    }

    public B t(B9.a aVar) {
        Type typeD = aVar.d();
        Class clsC = aVar.c();
        android.support.v4.media.session.a.a(this.f46422a.get(typeD));
        android.support.v4.media.session.a.a(this.f46422a.get(clsC));
        B bW = w(typeD, clsC);
        if (bW != null) {
            return bW;
        }
        u9.s sVarB = E.b(this.f46424c, clsC);
        B bU = u(clsC, sVarB);
        if (bU != null) {
            return bU;
        }
        B bV = v(typeD, clsC);
        if (bV != null) {
            return bV;
        }
        final String strS = s(clsC);
        if (strS != null) {
            return new B() { // from class: w9.c
                @Override // w9.B
                public final Object a() {
                    return u.o(strS);
                }
            };
        }
        if (sVarB == u9.s.ALLOW) {
            return x(clsC);
        }
        final String str = "Unable to create instance of " + clsC + "; ReflectionAccessFilter does not permit using reflection or Unsafe. Register an InstanceCreator or a TypeAdapter for this type or adjust the access filter to allow using reflection.";
        return new B() { // from class: w9.l
            @Override // w9.B
            public final Object a() {
                return u.d(str);
            }
        };
    }

    public String toString() {
        return this.f46422a.toString();
    }

    public final B x(final Class cls) {
        if (this.f46423b) {
            return new B() { // from class: w9.m
                @Override // w9.B
                public final Object a() {
                    return u.i(cls);
                }
            };
        }
        final String str = "Unable to create instance of " + cls + "; usage of JDK Unsafe is disabled. Registering an InstanceCreator or a TypeAdapter for this type, adding a no-args constructor, or enabling usage of JDK Unsafe may fix this problem.";
        if (cls.getDeclaredConstructors().length == 0) {
            str = str + " Or adjust your R8 configuration to keep the no-args constructor of the class.";
        }
        return new B() { // from class: w9.n
            @Override // w9.B
            public final Object a() {
                return u.n(str);
            }
        };
    }
}
