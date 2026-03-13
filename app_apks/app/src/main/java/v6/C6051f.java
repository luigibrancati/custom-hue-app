package v6;

import android.util.Log;

/* JADX INFO: renamed from: v6.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C6051f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f45850a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f45851b;

    public C6051f(String str) {
        this(str, null);
    }

    public boolean a(int i10) {
        return Log.isLoggable(this.f45850a, i10);
    }

    public void b(String str, String str2) {
        if (a(3)) {
            Log.d(str, i(str2));
        }
    }

    public void c(String str, String str2) {
        if (a(6)) {
            Log.e(str, i(str2));
        }
    }

    public void d(String str, String str2, Throwable th) {
        if (a(6)) {
            Log.e(str, i(str2), th);
        }
    }

    public void e(String str, String str2) {
        if (a(4)) {
            Log.i(str, i(str2));
        }
    }

    public void f(String str, String str2) {
        if (a(2)) {
            Log.v(str, i(str2));
        }
    }

    public void g(String str, String str2) {
        if (a(5)) {
            Log.w(str, i(str2));
        }
    }

    public void h(String str, String str2, Throwable th) {
        if (a(5)) {
            Log.w(str, i(str2), th);
        }
    }

    public final String i(String str) {
        String str2 = this.f45851b;
        return str2 == null ? str : str2.concat(str);
    }

    public C6051f(String str, String str2) {
        AbstractC6056k.m(str, "log tag cannot be null");
        AbstractC6056k.c(str.length() <= 23, "tag \"%s\" is longer than the %d character maximum", str, 23);
        this.f45850a = str;
        this.f45851b = (str2 == null || str2.length() <= 0) ? null : str2;
    }
}
