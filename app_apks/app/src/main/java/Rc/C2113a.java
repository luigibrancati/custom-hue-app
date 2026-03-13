package Rc;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: Rc.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class C2113a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C2113a f15053a = new C2113a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static C0184a f15054b;

    /* JADX INFO: renamed from: Rc.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class C0184a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Method f15055a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Method f15056b;

        public C0184a(Method method, Method method2) {
            this.f15055a = method;
            this.f15056b = method2;
        }

        public final Method a() {
            return this.f15056b;
        }

        public final Method b() {
            return this.f15055a;
        }
    }

    public final C0184a a(Object obj) {
        Class<?> cls = obj.getClass();
        try {
            return new C0184a(cls.getMethod("getType", null), cls.getMethod("getAccessor", null));
        } catch (NoSuchMethodException unused) {
            return new C0184a(null, null);
        }
    }

    public final C0184a b(Object obj) {
        C0184a c0184a = f15054b;
        if (c0184a != null) {
            return c0184a;
        }
        C0184a c0184aA = a(obj);
        f15054b = c0184aA;
        return c0184aA;
    }

    public final Method c(Object recordComponent) throws IllegalAccessException, InvocationTargetException {
        AbstractC4862t.e(recordComponent, "recordComponent");
        Method methodA = b(recordComponent).a();
        if (methodA == null) {
            return null;
        }
        Object objInvoke = methodA.invoke(recordComponent, null);
        AbstractC4862t.c(objInvoke, "null cannot be cast to non-null type java.lang.reflect.Method");
        return (Method) objInvoke;
    }

    public final Class d(Object recordComponent) throws IllegalAccessException, InvocationTargetException {
        AbstractC4862t.e(recordComponent, "recordComponent");
        Method methodB = b(recordComponent).b();
        if (methodB == null) {
            return null;
        }
        Object objInvoke = methodB.invoke(recordComponent, null);
        AbstractC4862t.c(objInvoke, "null cannot be cast to non-null type java.lang.Class<*>");
        return (Class) objInvoke;
    }
}
