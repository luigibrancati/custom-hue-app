package G1;

import android.text.TextUtils;
import android.util.Log;
import java.net.UnknownHostException;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class t {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f4336b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f4337c = true;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f4335a = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static a f4338d = a.f4339a;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f4339a = new C0067a();

        /* JADX INFO: renamed from: G1.t$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public class C0067a implements a {
            @Override // G1.t.a
            public void a(String str, String str2, Throwable th) {
                Log.d(str, t.a(str2, th));
            }

            @Override // G1.t.a
            public void b(String str, String str2, Throwable th) {
                Log.w(str, t.a(str2, th));
            }

            @Override // G1.t.a
            public void c(String str, String str2, Throwable th) {
                Log.e(str, t.a(str2, th));
            }

            @Override // G1.t.a
            public void d(String str, String str2, Throwable th) {
                Log.i(str, t.a(str2, th));
            }
        }

        void a(String str, String str2, Throwable th);

        void b(String str, String str2, Throwable th);

        void c(String str, String str2, Throwable th);

        void d(String str, String str2, Throwable th);
    }

    public static String a(String str, Throwable th) {
        String strE = e(th);
        if (TextUtils.isEmpty(strE)) {
            return str;
        }
        return str + "\n  " + strE.replace("\n", "\n  ") + '\n';
    }

    public static void b(String str, String str2) {
        synchronized (f4335a) {
            try {
                if (f4336b == 0) {
                    f4338d.a(str, str2, null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void c(String str, String str2) {
        synchronized (f4335a) {
            try {
                if (f4336b <= 3) {
                    f4338d.c(str, str2, null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void d(String str, String str2, Throwable th) {
        synchronized (f4335a) {
            try {
                if (f4336b <= 3) {
                    f4338d.c(str, str2, th);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static String e(Throwable th) {
        if (th == null) {
            return null;
        }
        synchronized (f4335a) {
            try {
                if (g(th)) {
                    return "UnknownHostException (no network)";
                }
                if (f4337c) {
                    return Log.getStackTraceString(th).trim().replace("\t", "    ");
                }
                return th.getMessage();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void f(String str, String str2) {
        synchronized (f4335a) {
            try {
                if (f4336b <= 1) {
                    f4338d.d(str, str2, null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static boolean g(Throwable th) {
        while (th != null) {
            if (th instanceof UnknownHostException) {
                return true;
            }
            th = th.getCause();
        }
        return false;
    }

    public static void h(String str, String str2) {
        synchronized (f4335a) {
            try {
                if (f4336b <= 2) {
                    f4338d.b(str, str2, null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void i(String str, String str2, Throwable th) {
        synchronized (f4335a) {
            try {
                if (f4336b <= 2) {
                    f4338d.b(str, str2, th);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
