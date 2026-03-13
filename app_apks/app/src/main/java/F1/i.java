package F1;

import G1.AbstractC0853a;
import G1.M;
import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f3657b = M.z0(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3658a;

    public i(String str) {
        this.f3658a = str;
    }

    public static i a(Bundle bundle) {
        return new i((String) AbstractC0853a.e(bundle.getString(f3657b)));
    }

    public Bundle b() {
        Bundle bundle = new Bundle();
        bundle.putString(f3657b, this.f3658a);
        return bundle;
    }
}
