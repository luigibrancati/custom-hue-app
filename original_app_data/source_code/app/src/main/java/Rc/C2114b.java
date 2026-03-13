package Rc;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: Rc.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class C2114b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C2114b f15057a = new C2114b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static a f15058b;

    /* JADX INFO: renamed from: Rc.b$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Method f15059a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Method f15060b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Method f15061c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Method f15062d;

        public a(Method method, Method method2, Method method3, Method method4) {
            this.f15059a = method;
            this.f15060b = method2;
            this.f15061c = method3;
            this.f15062d = method4;
        }

        public final Method a() {
            return this.f15060b;
        }

        public final Method b() {
            return this.f15062d;
        }

        public final Method c() {
            return this.f15061c;
        }

        public final Method d() {
            return this.f15059a;
        }
    }

    public final a a() {
        try {
            return new a(Class.class.getMethod("isSealed", null), Class.class.getMethod("getPermittedSubclasses", null), Class.class.getMethod("isRecord", null), Class.class.getMethod("getRecordComponents", null));
        } catch (NoSuchMethodException unused) {
            return new a(null, null, null, null);
        }
    }

    public final a b() {
        a aVar = f15058b;
        if (aVar != null) {
            return aVar;
        }
        a aVarA = a();
        f15058b = aVarA;
        return aVarA;
    }

    public final Class[] c(Class clazz) throws IllegalAccessException, InvocationTargetException {
        AbstractC4862t.e(clazz, "clazz");
        Method methodA = b().a();
        if (methodA == null) {
            return null;
        }
        Object objInvoke = methodA.invoke(clazz, null);
        AbstractC4862t.c(objInvoke, "null cannot be cast to non-null type kotlin.Array<java.lang.Class<*>>");
        return (Class[]) objInvoke;
    }

    public final Object[] d(Class clazz) {
        AbstractC4862t.e(clazz, "clazz");
        Method methodB = b().b();
        if (methodB == null) {
            return null;
        }
        return (Object[]) methodB.invoke(clazz, null);
    }

    public final Boolean e(Class clazz) throws IllegalAccessException, InvocationTargetException {
        AbstractC4862t.e(clazz, "clazz");
        Method methodC = b().c();
        if (methodC == null) {
            return null;
        }
        Object objInvoke = methodC.invoke(clazz, null);
        AbstractC4862t.c(objInvoke, "null cannot be cast to non-null type kotlin.Boolean");
        return (Boolean) objInvoke;
    }

    public final Boolean f(Class clazz) throws IllegalAccessException, InvocationTargetException {
        AbstractC4862t.e(clazz, "clazz");
        Method methodD = b().d();
        if (methodD == null) {
            return null;
        }
        Object objInvoke = methodD.invoke(clazz, null);
        AbstractC4862t.c(objInvoke, "null cannot be cast to non-null type kotlin.Boolean");
        return (Boolean) objInvoke;
    }
}
