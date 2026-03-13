package X6;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import v6.AbstractC6056k;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class H2 extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final R6 f18329a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f18330b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f18331c;

    public H2(R6 r62) {
        AbstractC6056k.l(r62);
        this.f18329a = r62;
    }

    public final void a() {
        R6 r62 = this.f18329a;
        r62.O0();
        r62.b().h();
        if (this.f18330b) {
            return;
        }
        r62.d().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        this.f18331c = r62.E0().m();
        r62.a().w().b("Registering connectivity change receiver. Network connected", Boolean.valueOf(this.f18331c));
        this.f18330b = true;
    }

    public final void b() {
        R6 r62 = this.f18329a;
        r62.O0();
        r62.b().h();
        r62.b().h();
        if (this.f18330b) {
            r62.a().w().a("Unregistering connectivity change receiver");
            this.f18330b = false;
            this.f18331c = false;
            try {
                r62.d().unregisterReceiver(this);
            } catch (IllegalArgumentException e10) {
                this.f18329a.a().o().b("Failed to unregister the network broadcast receiver", e10);
            }
        }
    }

    public final /* synthetic */ R6 c() {
        return this.f18329a;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        R6 r62 = this.f18329a;
        r62.O0();
        String action = intent.getAction();
        r62.a().w().b("NetworkBroadcastReceiver received action", action);
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            r62.a().r().b("NetworkBroadcastReceiver received unknown action", action);
            return;
        }
        boolean zM = r62.E0().m();
        if (this.f18331c != zM) {
            this.f18331c = zM;
            r62.b().t(new G2(this, zM));
        }
    }
}
