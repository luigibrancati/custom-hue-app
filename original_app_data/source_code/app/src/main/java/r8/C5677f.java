package r8;

import android.content.Context;
import java.io.IOException;
import java.io.InputStream;
import u8.C5992i;

/* JADX INFO: renamed from: r8.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class C5677f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f43825a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b f43826b = null;

    /* JADX INFO: renamed from: r8.f$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f43827a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f43828b;

        public b() {
            int iP = C5992i.p(C5677f.this.f43825a, "com.google.firebase.crashlytics.unity_version", "string");
            if (iP == 0) {
                if (!C5677f.this.c("flutter_assets/NOTICES.Z")) {
                    this.f43827a = null;
                    this.f43828b = null;
                    return;
                } else {
                    this.f43827a = "Flutter";
                    this.f43828b = null;
                    g.f().i("Development platform is: Flutter");
                    return;
                }
            }
            this.f43827a = "Unity";
            String string = C5677f.this.f43825a.getResources().getString(iP);
            this.f43828b = string;
            g.f().i("Unity Editor version is: " + string);
        }
    }

    public C5677f(Context context) {
        this.f43825a = context;
    }

    public final boolean c(String str) {
        if (this.f43825a.getAssets() == null) {
            return false;
        }
        try {
            InputStream inputStreamOpen = this.f43825a.getAssets().open(str);
            if (inputStreamOpen != null) {
                inputStreamOpen.close();
            }
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    public String d() {
        return f().f43827a;
    }

    public String e() {
        return f().f43828b;
    }

    public final b f() {
        if (this.f43826b == null) {
            this.f43826b = new b();
        }
        return this.f43826b;
    }
}
