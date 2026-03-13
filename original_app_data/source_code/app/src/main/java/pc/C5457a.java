package pc;

import gc.C4204q;
import java.lang.reflect.Method;
import kotlin.jvm.internal.AbstractC4862t;
import zc.AbstractC6558c;
import zc.C6557b;

/* JADX INFO: renamed from: pc.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class C5457a {

    /* JADX INFO: renamed from: pc.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class C0565a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0565a f42537a = new C0565a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final Method f42538b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final Method f42539c;

        static {
            Method method;
            Method method2;
            Method[] methods = Throwable.class.getMethods();
            AbstractC4862t.b(methods);
            int length = methods.length;
            int i10 = 0;
            int i11 = 0;
            while (true) {
                method = null;
                if (i11 >= length) {
                    method2 = null;
                    break;
                }
                method2 = methods[i11];
                if (AbstractC4862t.a(method2.getName(), "addSuppressed")) {
                    Class<?>[] parameterTypes = method2.getParameterTypes();
                    AbstractC4862t.d(parameterTypes, "getParameterTypes(...)");
                    if (AbstractC4862t.a(C4204q.z0(parameterTypes), Throwable.class)) {
                        break;
                    }
                }
                i11++;
            }
            f42538b = method2;
            int length2 = methods.length;
            while (true) {
                if (i10 >= length2) {
                    break;
                }
                Method method3 = methods[i10];
                if (AbstractC4862t.a(method3.getName(), "getSuppressed")) {
                    method = method3;
                    break;
                }
                i10++;
            }
            f42539c = method;
        }
    }

    public void a(Throwable cause, Throwable exception) {
        AbstractC4862t.e(cause, "cause");
        AbstractC4862t.e(exception, "exception");
        Method method = C0565a.f42538b;
        if (method != null) {
            method.invoke(cause, exception);
        }
    }

    public AbstractC6558c b() {
        return new C6557b();
    }
}
