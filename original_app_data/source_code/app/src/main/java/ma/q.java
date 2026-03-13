package ma;

import android.util.Log;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import ka.C;
import pa.C5450a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pattern f40261a = Pattern.compile("\\$\\d+$");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ThreadLocal f40262b = new ThreadLocal();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C.b f40263c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static C5450a f40264d;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a implements C.b {
        @Override // ka.C.b
        public void a(int i10, String str, String str2) {
            Log.println(i10, str, str2);
        }
    }

    static {
        a aVar = new a();
        f40263c = aVar;
        f40264d = new C5450a(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, false, true, aVar);
    }

    public static String a() {
        ThreadLocal threadLocal = f40262b;
        String str = (String) threadLocal.get();
        if (str != null) {
            threadLocal.remove();
            return str;
        }
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        if (stackTrace.length < 5) {
            throw new IllegalStateException("Synthetic stacktrace didn't have enough elements: are you using proguard?");
        }
        String className = stackTrace[4].getClassName();
        Matcher matcher = f40261a.matcher(className);
        if (matcher.find()) {
            className = matcher.replaceAll("");
        }
        String strReplace = className.replace("Impl", "").replace("RxBle", "");
        int iIndexOf = strReplace.indexOf(36);
        return "RxBle#" + (iIndexOf <= 0 ? strReplace.substring(strReplace.lastIndexOf(46) + 1) : strReplace.substring(strReplace.lastIndexOf(46) + 1, iIndexOf));
    }

    public static void b(String str, Object... objArr) {
        n(3, null, str, objArr);
    }

    public static void c(Throwable th, String str, Object... objArr) {
        n(3, th, str, objArr);
    }

    public static void d(String str, Object... objArr) {
        n(6, null, str, objArr);
    }

    public static void e(Throwable th, String str, Object... objArr) {
        n(6, th, str, objArr);
    }

    public static String f(String str, Object... objArr) {
        return objArr.length == 0 ? str : String.format(str, objArr);
    }

    public static int g() {
        return f40264d.f42505b;
    }

    public static boolean h() {
        return f40264d.f42507d;
    }

    public static boolean i() {
        return f40264d.f42508e;
    }

    public static int j() {
        return f40264d.f42506c;
    }

    public static void k(String str, Object... objArr) {
        n(4, null, str, objArr);
    }

    public static boolean l(int i10) {
        return f40264d.f42504a <= i10;
    }

    public static void m(int i10, String str, String str2) {
        if (str2.length() < 4000) {
            f40264d.f42509f.a(i10, str, str2);
            return;
        }
        for (String str3 : str2.split("\n")) {
            f40264d.f42509f.a(i10, str, str3);
        }
    }

    public static void n(int i10, Throwable th, String str, Object... objArr) {
        if (i10 < f40264d.f42504a) {
            return;
        }
        String strF = f(str, objArr);
        if (strF == null || strF.length() == 0) {
            if (th == null) {
                return;
            } else {
                strF = Log.getStackTraceString(th);
            }
        } else if (th != null) {
            strF = strF + "\n" + Log.getStackTraceString(th);
        }
        m(i10, a(), strF);
    }

    public static void o(C c10) {
        C5450a c5450a = f40264d;
        C5450a c5450aA = c5450a.a(c10);
        b("Received new options (%s) and merged with old setup: %s. New setup: %s", c10, c5450a, c5450aA);
        f40264d = c5450aA;
    }

    public static void p(String str, Object... objArr) {
        n(2, null, str, objArr);
    }

    public static void q(String str, Object... objArr) {
        n(5, null, str, objArr);
    }

    public static void r(Throwable th, String str, Object... objArr) {
        n(5, th, str, objArr);
    }
}
