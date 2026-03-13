package nc;

import java.lang.reflect.Method;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f40767a = new i();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f40768b = new a(null, null, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static a f40769c;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Method f40770a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Method f40771b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Method f40772c;

        public a(Method method, Method method2, Method method3) {
            this.f40770a = method;
            this.f40771b = method2;
            this.f40772c = method3;
        }
    }

    public final a a(AbstractC5157a abstractC5157a) {
        try {
            a aVar = new a(Class.class.getDeclaredMethod("getModule", null), abstractC5157a.getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), abstractC5157a.getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", null));
            f40769c = aVar;
            return aVar;
        } catch (Exception unused) {
            a aVar2 = f40768b;
            f40769c = aVar2;
            return aVar2;
        }
    }

    public final String b(AbstractC5157a continuation) {
        Method method;
        Object objInvoke;
        Method method2;
        Object objInvoke2;
        AbstractC4862t.e(continuation, "continuation");
        a aVarA = f40769c;
        if (aVarA == null) {
            aVarA = a(continuation);
        }
        if (aVarA != f40768b && (method = aVarA.f40770a) != null && (objInvoke = method.invoke(continuation.getClass(), null)) != null && (method2 = aVarA.f40771b) != null && (objInvoke2 = method2.invoke(objInvoke, null)) != null) {
            Method method3 = aVarA.f40772c;
            Object objInvoke3 = method3 != null ? method3.invoke(objInvoke2, null) : null;
            if (objInvoke3 instanceof String) {
                return (String) objInvoke3;
            }
        }
        return null;
    }
}
