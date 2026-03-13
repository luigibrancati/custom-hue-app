package O4;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.internal.play_billing.AbstractC3524e1;
import com.google.android.gms.internal.play_billing.zzau;

/* JADX INFO: renamed from: O4.m0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class ServiceConnectionC1602m0 implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C1606o0 f11129a;

    public /* synthetic */ ServiceConnectionC1602m0(C1606o0 c1606o0, AbstractC1604n0 abstractC1604n0) {
        this.f11129a = c1606o0;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        AbstractC3524e1.j("BillingClientTesting", "Billing Override Service connected.");
        this.f11129a.f11134I = zzau.zzc(iBinder);
        this.f11129a.f11133H = 2;
        this.f11129a.B1(26);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        AbstractC3524e1.k("BillingClientTesting", "Billing Override Service disconnected.");
        this.f11129a.f11134I = null;
        this.f11129a.f11133H = 0;
    }
}
