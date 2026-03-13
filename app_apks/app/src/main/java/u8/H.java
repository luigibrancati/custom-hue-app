package u8;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import b7.C2878l;
import com.google.android.gms.tasks.Task;
import h8.C4288f;
import v8.AbstractC6073b;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class H {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SharedPreferences f45266a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C4288f f45267b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f45268c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public C2878l f45269d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f45270e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f45271f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Boolean f45272g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C2878l f45273h;

    public H(C4288f c4288f) {
        Object obj = new Object();
        this.f45268c = obj;
        this.f45269d = new C2878l();
        this.f45270e = false;
        this.f45271f = false;
        this.f45273h = new C2878l();
        Context contextM = c4288f.m();
        this.f45267b = c4288f;
        this.f45266a = C5992i.q(contextM);
        Boolean boolB = b();
        this.f45272g = boolB == null ? a(contextM) : boolB;
        synchronized (obj) {
            try {
                if (d()) {
                    this.f45269d.e(null);
                    this.f45270e = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static Boolean g(Context context) {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_crashlytics_collection_enabled")) {
                return null;
            }
            return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_crashlytics_collection_enabled"));
        } catch (PackageManager.NameNotFoundException e10) {
            r8.g.f().e("Could not read data collection permission from manifest", e10);
            return null;
        }
    }

    public static void i(SharedPreferences sharedPreferences, Boolean bool) {
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        if (bool != null) {
            editorEdit.putBoolean("firebase_crashlytics_collection_enabled", bool.booleanValue());
        } else {
            editorEdit.remove("firebase_crashlytics_collection_enabled");
        }
        editorEdit.apply();
    }

    public final Boolean a(Context context) {
        Boolean boolG = g(context);
        if (boolG == null) {
            this.f45271f = false;
            return null;
        }
        this.f45271f = true;
        return Boolean.valueOf(Boolean.TRUE.equals(boolG));
    }

    public final Boolean b() {
        if (!this.f45266a.contains("firebase_crashlytics_collection_enabled")) {
            return null;
        }
        this.f45271f = false;
        return Boolean.valueOf(this.f45266a.getBoolean("firebase_crashlytics_collection_enabled", true));
    }

    public void c(boolean z10) {
        if (!z10) {
            throw new IllegalStateException("An invalid data collection token was used.");
        }
        this.f45273h.e(null);
    }

    public synchronized boolean d() {
        boolean zBooleanValue;
        try {
            Boolean bool = this.f45272g;
            zBooleanValue = bool != null ? bool.booleanValue() : e();
            f(zBooleanValue);
        } catch (Throwable th) {
            throw th;
        }
        return zBooleanValue;
    }

    public final boolean e() {
        try {
            return this.f45267b.x();
        } catch (IllegalStateException unused) {
            return false;
        }
    }

    public final void f(boolean z10) {
        r8.g.f().b(String.format("Crashlytics automatic data collection %s by %s.", z10 ? "ENABLED" : "DISABLED", this.f45272g == null ? "global Firebase setting" : this.f45271f ? "firebase_crashlytics_collection_enabled manifest flag" : "API"));
    }

    public synchronized void h(Boolean bool) {
        if (bool != null) {
            try {
                this.f45271f = false;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f45272g = bool != null ? bool : a(this.f45267b.m());
        i(this.f45266a, bool);
        synchronized (this.f45268c) {
            try {
                if (d()) {
                    if (!this.f45270e) {
                        this.f45269d.e(null);
                        this.f45270e = true;
                    }
                } else if (this.f45270e) {
                    this.f45269d = new C2878l();
                    this.f45270e = false;
                }
            } finally {
            }
        }
    }

    public Task j() {
        Task taskA;
        synchronized (this.f45268c) {
            taskA = this.f45269d.a();
        }
        return taskA;
    }

    public Task k() {
        return AbstractC6073b.b(this.f45273h.a(), j());
    }
}
