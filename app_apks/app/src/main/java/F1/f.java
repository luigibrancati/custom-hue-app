package F1;

import G1.AbstractC0853a;
import G1.M;
import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f3647c = M.z0(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f3648d = M.z0(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3649a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f3650b;

    public f(String str, int i10) {
        this.f3649a = str;
        this.f3650b = i10;
    }

    public static f a(Bundle bundle) {
        return new f((String) AbstractC0853a.e(bundle.getString(f3647c)), bundle.getInt(f3648d));
    }

    public Bundle b() {
        Bundle bundle = new Bundle();
        bundle.putString(f3647c, this.f3649a);
        bundle.putInt(f3648d, this.f3650b);
        return bundle;
    }
}
