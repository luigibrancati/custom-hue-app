package n;

import android.content.Context;
import android.content.res.Configuration;
import h.AbstractC4263b;

/* JADX INFO: renamed from: n.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class C5056a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f40403a;

    public C5056a(Context context) {
        this.f40403a = context;
    }

    public static C5056a b(Context context) {
        return new C5056a(context);
    }

    public boolean a() {
        return this.f40403a.getApplicationInfo().targetSdkVersion < 14;
    }

    public int c() {
        return this.f40403a.getResources().getDisplayMetrics().widthPixels / 2;
    }

    public int d() {
        Configuration configuration = this.f40403a.getResources().getConfiguration();
        int i10 = configuration.screenWidthDp;
        int i11 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i10 > 600) {
            return 5;
        }
        if (i10 > 960 && i11 > 720) {
            return 5;
        }
        if (i10 > 720 && i11 > 960) {
            return 5;
        }
        if (i10 >= 500) {
            return 4;
        }
        if (i10 > 640 && i11 > 480) {
            return 4;
        }
        if (i10 <= 480 || i11 <= 640) {
            return i10 >= 360 ? 3 : 2;
        }
        return 4;
    }

    public boolean e() {
        return this.f40403a.getResources().getBoolean(AbstractC4263b.f35818a);
    }

    public boolean f() {
        return true;
    }
}
