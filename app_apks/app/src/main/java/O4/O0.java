package O4;

import android.content.Context;
import android.content.IntentFilter;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class O0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f10986a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC1618v f10987b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC1626z f10988c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final InterfaceC1615t0 f10989d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final N0 f10990e = new N0(this, true);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final N0 f10991f = new N0(this, false);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f10992g;

    public O0(Context context, InterfaceC1618v interfaceC1618v, InterfaceC1627z0 interfaceC1627z0, S s10, InterfaceC1626z interfaceC1626z, InterfaceC1615t0 interfaceC1615t0) {
        this.f10986a = context;
        this.f10987b = interfaceC1618v;
        this.f10988c = interfaceC1626z;
        this.f10989d = interfaceC1615t0;
    }

    public static /* bridge */ /* synthetic */ S a(O0 o02) {
        o02.getClass();
        return null;
    }

    public final InterfaceC1618v d() {
        return this.f10987b;
    }

    public final void f() {
        this.f10990e.c(this.f10986a);
        this.f10991f.c(this.f10986a);
    }

    public final void g(boolean z10) {
        IntentFilter intentFilter = new IntentFilter("com.android.vending.billing.PURCHASES_UPDATED");
        IntentFilter intentFilter2 = new IntentFilter("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED");
        intentFilter2.addAction("com.android.vending.billing.ALTERNATIVE_BILLING");
        this.f10992g = z10;
        this.f10991f.a(this.f10986a, intentFilter2);
        if (this.f10992g) {
            this.f10990e.b(this.f10986a, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST");
        } else {
            this.f10990e.a(this.f10986a, intentFilter);
        }
    }
}
