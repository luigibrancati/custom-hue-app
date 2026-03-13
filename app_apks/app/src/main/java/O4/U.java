package O4;

import android.os.Bundle;
import com.google.android.gms.internal.play_billing.AbstractC3524e1;
import com.google.android.gms.internal.play_billing.zzx;
import org.json.JSONException;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class U extends zzx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC1589g f11008a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC1615t0 f11009b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f11010c;

    public /* synthetic */ U(InterfaceC1589g interfaceC1589g, InterfaceC1615t0 interfaceC1615t0, int i10, Z z10) {
        this.f11008a = interfaceC1589g;
        this.f11009b = interfaceC1615t0;
        this.f11010c = i10;
    }

    @Override // com.google.android.gms.internal.play_billing.j5
    public final void a(Bundle bundle) {
        if (bundle == null) {
            InterfaceC1615t0 interfaceC1615t0 = this.f11009b;
            com.android.billingclient.api.a aVar = com.android.billingclient.api.d.f26628k;
            interfaceC1615t0.c(AbstractC1613s0.b(71, 15, aVar), this.f11010c);
            this.f11008a.a(aVar, null);
            return;
        }
        int iB = AbstractC3524e1.b(bundle, "BillingClient");
        com.android.billingclient.api.a aVarA = com.android.billingclient.api.d.a(iB, AbstractC3524e1.g(bundle, "BillingClient"));
        if (iB != 0) {
            AbstractC3524e1.k("BillingClient", "createAlternativeBillingOnlyReportingDetailsAsync() failed. Response code: " + iB);
            this.f11009b.c(AbstractC1613s0.b(23, 15, aVarA), this.f11010c);
            this.f11008a.a(aVarA, null);
            return;
        }
        try {
            this.f11008a.a(aVarA, new C1587f(bundle.getString("CREATE_ALTERNATIVE_BILLING_ONLY_REPORTING_DETAILS")));
        } catch (JSONException e10) {
            AbstractC3524e1.l("BillingClient", "Error when parsing invalid alternative billing only reporting details. \n Exception: ", e10);
            InterfaceC1615t0 interfaceC1615t02 = this.f11009b;
            com.android.billingclient.api.a aVar2 = com.android.billingclient.api.d.f26628k;
            interfaceC1615t02.c(AbstractC1613s0.b(72, 15, aVar2), this.f11010c);
            this.f11008a.a(aVar2, null);
        }
    }
}
