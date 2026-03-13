package O4;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.internal.play_billing.AbstractC3524e1;
import com.google.android.gms.internal.play_billing.C3527e4;
import com.google.android.gms.internal.play_billing.C3551i4;
import com.google.android.gms.internal.play_billing.C3569l4;
import com.google.android.gms.internal.play_billing.V4;
import com.google.android.gms.internal.play_billing.W3;
import com.google.android.gms.internal.play_billing.Y3;
import com.google.android.gms.internal.play_billing.zzam;
import io.sentry.TransactionOptions;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class T implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC1595j f11004a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1593i f11005b;

    public /* synthetic */ T(C1593i c1593i, InterfaceC1595j interfaceC1595j, Z z10) {
        this.f11005b = c1593i;
        this.f11004a = interfaceC1595j;
    }

    /* JADX WARN: Removed duplicated region for block: B:162:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0278  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* synthetic */ java.lang.Object a() {
        /*
            Method dump skipped, instruction units count: 776
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: O4.T.a():java.lang.Object");
    }

    public final /* synthetic */ void b() {
        this.f11005b.Z(0);
        com.android.billingclient.api.a aVar = com.android.billingclient.api.d.f26631n;
        this.f11005b.L0(24, 6, aVar);
        c(aVar);
    }

    public final void c(com.android.billingclient.api.a aVar) {
        synchronized (this.f11005b.f11069a) {
            try {
                if (this.f11005b.f11070b == 3) {
                    return;
                }
                this.f11004a.onBillingSetupFinished(aVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        AbstractC3524e1.k("BillingClient", "Billing service died.");
        try {
            if (C1593i.z0(this.f11005b)) {
                InterfaceC1615t0 interfaceC1615t0 = this.f11005b.f11075g;
                W3 w3H = Y3.H();
                w3H.x(6);
                C3527e4 c3527e4H = C3551i4.H();
                c3527e4H.y(122);
                w3H.v(c3527e4H);
                interfaceC1615t0.f((Y3) w3H.r());
            } else {
                this.f11005b.f11075g.a(C3569l4.C());
            }
        } catch (Throwable th) {
            AbstractC3524e1.l("BillingClient", "Unable to log.", th);
        }
        synchronized (this.f11005b.f11069a) {
            if (this.f11005b.f11070b != 3 && this.f11005b.f11070b != 0) {
                this.f11005b.Z(0);
                this.f11005b.b0();
                this.f11004a.onBillingServiceDisconnected();
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        AbstractC3524e1.j("BillingClient", "Billing service connected.");
        synchronized (this.f11005b.f11069a) {
            try {
                if (this.f11005b.f11070b == 3) {
                    return;
                }
                this.f11005b.f11076h = zzam.zzu(iBinder);
                C1593i c1593i = this.f11005b;
                if (C1593i.t(new Callable() { // from class: O4.P
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        this.f10993a.a();
                        return null;
                    }
                }, TransactionOptions.DEFAULT_DEADLINE_TIMEOUT_AUTO_TRANSACTION, new Runnable() { // from class: O4.Q
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f10994a.b();
                    }
                }, c1593i.F0(), c1593i.T()) == null) {
                    C1593i c1593i2 = this.f11005b;
                    com.android.billingclient.api.a aVarQ = c1593i2.Q();
                    c1593i2.L0(25, 6, aVarQ);
                    c(aVarQ);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        AbstractC3524e1.k("BillingClient", "Billing service disconnected.");
        try {
            if (C1593i.z0(this.f11005b)) {
                InterfaceC1615t0 interfaceC1615t0 = this.f11005b.f11075g;
                W3 w3H = Y3.H();
                w3H.x(6);
                C3527e4 c3527e4H = C3551i4.H();
                c3527e4H.y(121);
                w3H.v(c3527e4H);
                interfaceC1615t0.f((Y3) w3H.r());
            } else {
                this.f11005b.f11075g.e(V4.C());
            }
        } catch (Throwable th) {
            AbstractC3524e1.l("BillingClient", "Unable to log.", th);
        }
        synchronized (this.f11005b.f11069a) {
            try {
                if (this.f11005b.f11070b == 3) {
                    return;
                }
                this.f11005b.Z(0);
                this.f11004a.onBillingServiceDisconnected();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
