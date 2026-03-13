package O4;

import android.os.Bundle;
import com.google.android.gms.internal.play_billing.AbstractC3524e1;
import com.google.android.gms.internal.play_billing.zzah;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class W extends zzah {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC1583d f11018a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC1615t0 f11019b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f11020c;

    public /* synthetic */ W(InterfaceC1583d interfaceC1583d, InterfaceC1615t0 interfaceC1615t0, int i10, Z z10) {
        this.f11018a = interfaceC1583d;
        this.f11019b = interfaceC1615t0;
        this.f11020c = i10;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC3528f
    public final void a(Bundle bundle) {
        if (bundle == null) {
            InterfaceC1615t0 interfaceC1615t0 = this.f11019b;
            com.android.billingclient.api.a aVar = com.android.billingclient.api.d.f26628k;
            interfaceC1615t0.c(AbstractC1613s0.b(67, 14, aVar), this.f11020c);
            this.f11018a.a(aVar);
            return;
        }
        int iB = AbstractC3524e1.b(bundle, "BillingClient");
        com.android.billingclient.api.a aVarA = com.android.billingclient.api.d.a(iB, AbstractC3524e1.g(bundle, "BillingClient"));
        if (iB != 0) {
            AbstractC3524e1.k("BillingClient", "isAlternativeBillingOnlyAvailableAsync() failed. Response code: " + iB);
            this.f11019b.c(AbstractC1613s0.b(23, 14, aVarA), this.f11020c);
        }
        this.f11018a.a(aVarA);
    }
}
