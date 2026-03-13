package z3;

import android.app.Activity;
import fc.C4015H;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ClassLoader f48712a;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a implements InvocationHandler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Cc.d f48713a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final vc.l f48714b;

        public a(Cc.d clazz, vc.l consumer) {
            AbstractC4862t.e(clazz, "clazz");
            AbstractC4862t.e(consumer, "consumer");
            this.f48713a = clazz;
            this.f48714b = consumer;
        }

        public final void a(Object parameter) {
            AbstractC4862t.e(parameter, "parameter");
            this.f48714b.invoke(parameter);
        }

        public final boolean b(Method method, Object[] objArr) {
            return AbstractC4862t.a(method.getName(), "accept") && objArr != null && objArr.length == 1;
        }

        public final boolean c(Method method, Object[] objArr) {
            return AbstractC4862t.a(method.getName(), "equals") && method.getReturnType().equals(Boolean.TYPE) && objArr != null && objArr.length == 1;
        }

        public final boolean d(Method method, Object[] objArr) {
            return AbstractC4862t.a(method.getName(), "hashCode") && method.getReturnType().equals(Integer.TYPE) && objArr == null;
        }

        public final boolean e(Method method, Object[] objArr) {
            return AbstractC4862t.a(method.getName(), "toString") && method.getReturnType().equals(String.class) && objArr == null;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) {
            AbstractC4862t.e(obj, "obj");
            AbstractC4862t.e(method, "method");
            if (b(method, objArr)) {
                a(Cc.e.a(this.f48713a, objArr != null ? objArr[0] : null));
                return C4015H.f34254a;
            }
            if (c(method, objArr)) {
                return Boolean.valueOf(obj == (objArr != null ? objArr[0] : null));
            }
            if (d(method, objArr)) {
                return Integer.valueOf(this.f48714b.hashCode());
            }
            if (e(method, objArr)) {
                return this.f48714b.toString();
            }
            throw new UnsupportedOperationException("Unexpected method call object:" + obj + ", method: " + method + ", args: " + objArr);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface b {
        void dispose();
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class c implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Method f48715a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Object f48716b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Object f48717c;

        public c(Method method, Object obj, Object obj2) {
            this.f48715a = method;
            this.f48716b = obj;
            this.f48717c = obj2;
        }

        @Override // z3.d.b
        public void dispose() throws IllegalAccessException, InvocationTargetException {
            this.f48715a.invoke(this.f48716b, this.f48717c);
        }
    }

    public d(ClassLoader loader) {
        AbstractC4862t.e(loader, "loader");
        this.f48712a = loader;
    }

    public final Object a(Cc.d dVar, vc.l lVar) {
        Object objNewProxyInstance = Proxy.newProxyInstance(this.f48712a, new Class[]{d()}, new a(dVar, lVar));
        AbstractC4862t.d(objNewProxyInstance, "newProxyInstance(...)");
        return objNewProxyInstance;
    }

    public final Class b() {
        try {
            return d();
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public final b c(Object obj, Cc.d clazz, String addMethodName, String removeMethodName, Activity activity, vc.l consumer) throws IllegalAccessException, InvocationTargetException {
        AbstractC4862t.e(obj, "obj");
        AbstractC4862t.e(clazz, "clazz");
        AbstractC4862t.e(addMethodName, "addMethodName");
        AbstractC4862t.e(removeMethodName, "removeMethodName");
        AbstractC4862t.e(activity, "activity");
        AbstractC4862t.e(consumer, "consumer");
        Object objA = a(clazz, consumer);
        obj.getClass().getMethod(addMethodName, Activity.class, d()).invoke(obj, activity, objA);
        return new c(obj.getClass().getMethod(removeMethodName, d()), obj, objA);
    }

    public final Class d() throws ClassNotFoundException {
        Class<?> clsLoadClass = this.f48712a.loadClass("java.util.function.Consumer");
        AbstractC4862t.d(clsLoadClass, "loadClass(...)");
        return clsLoadClass;
    }
}
