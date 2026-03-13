package kotlin.jvm.internal;

import fc.C4014G;
import java.util.Arrays;

/* JADX INFO: renamed from: kotlin.jvm.internal.t, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC4862t {
    public static boolean a(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public static void b(Object obj) {
        if (obj == null) {
            l();
        }
    }

    public static void c(Object obj, String str) {
        if (obj == null) {
            m(str);
        }
    }

    public static void d(Object obj, String str) {
        if (obj != null) {
            return;
        }
        throw ((NullPointerException) i(new NullPointerException(str + " must not be null")));
    }

    public static void e(Object obj, String str) {
        if (obj == null) {
            n(str);
        }
    }

    public static int f(int i10, int i11) {
        if (i10 < i11) {
            return -1;
        }
        return i10 == i11 ? 0 : 1;
    }

    public static int g(long j10, long j11) {
        if (j10 < j11) {
            return -1;
        }
        return j10 == j11 ? 0 : 1;
    }

    public static String h(String str) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        String name = AbstractC4862t.class.getName();
        int i10 = 0;
        while (!stackTrace[i10].getClassName().equals(name)) {
            i10++;
        }
        while (stackTrace[i10].getClassName().equals(name)) {
            i10++;
        }
        StackTraceElement stackTraceElement = stackTrace[i10];
        return "Parameter specified as non-null is null: method " + stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName() + ", parameter " + str;
    }

    public static Throwable i(Throwable th) {
        return j(th, AbstractC4862t.class.getName());
    }

    public static Throwable j(Throwable th, String str) {
        StackTraceElement[] stackTrace = th.getStackTrace();
        int length = stackTrace.length;
        int i10 = -1;
        for (int i11 = 0; i11 < length; i11++) {
            if (str.equals(stackTrace[i11].getClassName())) {
                i10 = i11;
            }
        }
        th.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i10 + 1, length));
        return th;
    }

    public static String k(String str, Object obj) {
        return str + obj;
    }

    public static void l() {
        throw ((NullPointerException) i(new NullPointerException()));
    }

    public static void m(String str) {
        throw ((NullPointerException) i(new NullPointerException(str)));
    }

    public static void n(String str) {
        throw ((NullPointerException) i(new NullPointerException(h(str))));
    }

    public static void o(String str) {
        throw ((C4014G) i(new C4014G(str)));
    }

    public static void p(String str) {
        o("lateinit property " + str + " has not been initialized");
    }
}
