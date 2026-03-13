package F1;

import G1.M;
import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f3651d = M.z0(0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f3652e = M.z0(1);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f3653f = M.z0(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f3654a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f3655b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f3656c;

    public h(int i10, int i11, int i12) {
        this.f3654a = i10;
        this.f3655b = i11;
        this.f3656c = i12;
    }

    public static h a(Bundle bundle) {
        return new h(bundle.getInt(f3651d), bundle.getInt(f3652e), bundle.getInt(f3653f));
    }

    public Bundle b() {
        Bundle bundle = new Bundle();
        bundle.putInt(f3651d, this.f3654a);
        bundle.putInt(f3652e, this.f3655b);
        bundle.putInt(f3653f, this.f3656c);
        return bundle;
    }
}
