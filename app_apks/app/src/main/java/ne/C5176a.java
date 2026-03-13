package ne;

import android.util.Log;
import ke.p;

/* JADX INFO: renamed from: ne.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class C5176a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static C5176a f40869c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f40870a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f40871b;

    /* JADX INFO: renamed from: ne.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class C0543a implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0543a f40872a = new C0543a();

        @Override // ne.C5176a.b
        public boolean a(String str, int i10) {
            return Log.isLoggable(str, i10);
        }

        @Override // ne.C5176a.b
        public void b(int i10, String str, String str2) {
            Log.println(i10, str, str2);
        }

        @Override // ne.C5176a.b
        public String c(Throwable th) {
            return Log.getStackTraceString(th);
        }
    }

    /* JADX INFO: renamed from: ne.a$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface b {
        boolean a(String str, int i10);

        void b(int i10, String str, String str2);

        String c(Throwable th);
    }

    public C5176a(b bVar) {
        this.f40870a = (b) p.d(bVar);
        int i10 = 7;
        while (i10 >= 2 && this.f40870a.a("AppAuth", i10)) {
            i10--;
        }
        this.f40871b = i10 + 1;
    }

    public static void a(String str, Object... objArr) {
        e().g(3, null, str, objArr);
    }

    public static void b(Throwable th, String str, Object... objArr) {
        e().g(3, th, str, objArr);
    }

    public static void c(String str, Object... objArr) {
        e().g(6, null, str, objArr);
    }

    public static void d(Throwable th, String str, Object... objArr) {
        e().g(6, th, str, objArr);
    }

    public static synchronized C5176a e() {
        try {
            if (f40869c == null) {
                f40869c = new C5176a(C0543a.f40872a);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f40869c;
    }

    public static void f(String str, Object... objArr) {
        e().g(4, null, str, objArr);
    }

    public static void h(String str, Object... objArr) {
        e().g(5, null, str, objArr);
    }

    public void g(int i10, Throwable th, String str, Object... objArr) {
        if (this.f40871b > i10) {
            return;
        }
        if (objArr != null && objArr.length >= 1) {
            str = String.format(str, objArr);
        }
        if (th != null) {
            str = str + "\n" + this.f40870a.c(th);
        }
        this.f40870a.b(i10, "AppAuth", str);
    }
}
