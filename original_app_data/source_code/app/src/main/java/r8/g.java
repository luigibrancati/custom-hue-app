package r8;

import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final g f43830c = new g("FirebaseCrashlytics");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f43831a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f43832b = 4;

    public g(String str) {
        this.f43831a = str;
    }

    public static g f() {
        return f43830c;
    }

    public final boolean a(int i10) {
        return this.f43832b <= i10 || Log.isLoggable(this.f43831a, i10);
    }

    public void b(String str) {
        c(str, null);
    }

    public void c(String str, Throwable th) {
        if (a(3)) {
            Log.d(this.f43831a, str, th);
        }
    }

    public void d(String str) {
        e(str, null);
    }

    public void e(String str, Throwable th) {
        if (a(6)) {
            Log.e(this.f43831a, str, th);
        }
    }

    public void g(String str) {
        h(str, null);
    }

    public void h(String str, Throwable th) {
        if (a(4)) {
            Log.i(this.f43831a, str, th);
        }
    }

    public void i(String str) {
        j(str, null);
    }

    public void j(String str, Throwable th) {
        if (a(2)) {
            Log.v(this.f43831a, str, th);
        }
    }

    public void k(String str) {
        l(str, null);
    }

    public void l(String str, Throwable th) {
        if (a(5)) {
            Log.w(this.f43831a, str, th);
        }
    }
}
