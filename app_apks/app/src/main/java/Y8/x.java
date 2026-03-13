package Y8;

import android.content.Context;
import android.content.SharedPreferences;
import b9.C2898a;
import h8.C4288f;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class x {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C2898a f19854c = C2898a.e();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static x f19855d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile SharedPreferences f19856a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ExecutorService f19857b;

    public x(ExecutorService executorService) {
        this.f19857b = executorService;
    }

    public static /* synthetic */ void a(x xVar, Context context) {
        if (xVar.f19856a != null || context == null) {
            return;
        }
        xVar.f19856a = context.getSharedPreferences("FirebasePerfSharedPrefs", 0);
    }

    public static synchronized x e() {
        try {
            if (f19855d == null) {
                f19855d = new x(Executors.newSingleThreadExecutor());
            }
        } catch (Throwable th) {
            throw th;
        }
        return f19855d;
    }

    public com.google.firebase.perf.util.g b(String str) {
        if (str == null) {
            f19854c.a("Key is null when getting boolean value on device cache.");
            return com.google.firebase.perf.util.g.a();
        }
        if (this.f19856a == null) {
            h(d());
            if (this.f19856a == null) {
                return com.google.firebase.perf.util.g.a();
            }
        }
        if (!this.f19856a.contains(str)) {
            return com.google.firebase.perf.util.g.a();
        }
        try {
            return com.google.firebase.perf.util.g.e(Boolean.valueOf(this.f19856a.getBoolean(str, false)));
        } catch (ClassCastException e10) {
            f19854c.b("Key %s from sharedPreferences has type other than long: %s", str, e10.getMessage());
            return com.google.firebase.perf.util.g.a();
        }
    }

    public com.google.firebase.perf.util.g c(String str) {
        if (str == null) {
            f19854c.a("Key is null when getting double value on device cache.");
            return com.google.firebase.perf.util.g.a();
        }
        if (this.f19856a == null) {
            h(d());
            if (this.f19856a == null) {
                return com.google.firebase.perf.util.g.a();
            }
        }
        if (!this.f19856a.contains(str)) {
            return com.google.firebase.perf.util.g.a();
        }
        try {
            try {
                return com.google.firebase.perf.util.g.e(Double.valueOf(Double.longBitsToDouble(this.f19856a.getLong(str, 0L))));
            } catch (ClassCastException e10) {
                f19854c.b("Key %s from sharedPreferences has type other than double: %s", str, e10.getMessage());
                return com.google.firebase.perf.util.g.a();
            }
        } catch (ClassCastException unused) {
            return com.google.firebase.perf.util.g.e(Double.valueOf(Float.valueOf(this.f19856a.getFloat(str, 0.0f)).doubleValue()));
        }
    }

    public final Context d() {
        try {
            C4288f.o();
            return C4288f.o().m();
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    public com.google.firebase.perf.util.g f(String str) {
        if (str == null) {
            f19854c.a("Key is null when getting long value on device cache.");
            return com.google.firebase.perf.util.g.a();
        }
        if (this.f19856a == null) {
            h(d());
            if (this.f19856a == null) {
                return com.google.firebase.perf.util.g.a();
            }
        }
        if (!this.f19856a.contains(str)) {
            return com.google.firebase.perf.util.g.a();
        }
        try {
            return com.google.firebase.perf.util.g.e(Long.valueOf(this.f19856a.getLong(str, 0L)));
        } catch (ClassCastException e10) {
            f19854c.b("Key %s from sharedPreferences has type other than long: %s", str, e10.getMessage());
            return com.google.firebase.perf.util.g.a();
        }
    }

    public com.google.firebase.perf.util.g g(String str) {
        if (str == null) {
            f19854c.a("Key is null when getting String value on device cache.");
            return com.google.firebase.perf.util.g.a();
        }
        if (this.f19856a == null) {
            h(d());
            if (this.f19856a == null) {
                return com.google.firebase.perf.util.g.a();
            }
        }
        if (!this.f19856a.contains(str)) {
            return com.google.firebase.perf.util.g.a();
        }
        try {
            return com.google.firebase.perf.util.g.e(this.f19856a.getString(str, ""));
        } catch (ClassCastException e10) {
            f19854c.b("Key %s from sharedPreferences has type other than String: %s", str, e10.getMessage());
            return com.google.firebase.perf.util.g.a();
        }
    }

    public synchronized void h(final Context context) {
        if (this.f19856a == null && context != null) {
            this.f19857b.execute(new Runnable() { // from class: Y8.w
                @Override // java.lang.Runnable
                public final void run() {
                    x.a(this.f19852a, context);
                }
            });
        }
    }

    public boolean i(String str, double d10) {
        if (str == null) {
            f19854c.a("Key is null when setting double value on device cache.");
            return false;
        }
        if (this.f19856a == null) {
            h(d());
            if (this.f19856a == null) {
                return false;
            }
        }
        this.f19856a.edit().putLong(str, Double.doubleToRawLongBits(d10)).apply();
        return true;
    }

    public boolean j(String str, long j10) {
        if (str == null) {
            f19854c.a("Key is null when setting long value on device cache.");
            return false;
        }
        if (this.f19856a == null) {
            h(d());
            if (this.f19856a == null) {
                return false;
            }
        }
        this.f19856a.edit().putLong(str, j10).apply();
        return true;
    }

    public boolean k(String str, String str2) {
        if (str == null) {
            f19854c.a("Key is null when setting String value on device cache.");
            return false;
        }
        if (this.f19856a == null) {
            h(d());
            if (this.f19856a == null) {
                return false;
            }
        }
        if (str2 == null) {
            this.f19856a.edit().remove(str).apply();
            return true;
        }
        this.f19856a.edit().putString(str, str2).apply();
        return true;
    }

    public boolean l(String str, boolean z10) {
        if (str == null) {
            f19854c.a("Key is null when setting boolean value on device cache.");
            return false;
        }
        if (this.f19856a == null) {
            h(d());
            if (this.f19856a == null) {
                return false;
            }
        }
        this.f19856a.edit().putBoolean(str, z10).apply();
        return true;
    }
}
