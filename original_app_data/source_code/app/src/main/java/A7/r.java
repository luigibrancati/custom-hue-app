package A7;

import B7.C0695c;
import B7.c0;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class r {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c0 f212c = new c0("SplitInstallService");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Intent f213d = new Intent("com.google.android.play.core.splitinstall.BIND_SPLIT_INSTALL_SERVICE").setPackage("com.android.vending");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f214a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C0695c f215b;

    public r(Context context, String str) {
        this.f214a = str;
        if (B7.H.a(context)) {
            this.f215b = new C0695c(B7.E.a(context), f212c, "SplitInstallService", f213d, p.f211a, null);
        }
    }
}
