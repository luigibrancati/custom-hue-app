package com.android.billingclient.api;

import O4.AbstractC1613s0;
import O4.C1597k;
import O4.InterfaceC1599l;
import O4.InterfaceC1615t0;
import O4.Z;
import android.os.Bundle;
import com.android.billingclient.api.a;
import com.google.android.gms.internal.play_billing.AbstractC3524e1;
import com.google.android.gms.internal.play_billing.zzad;
import org.json.JSONException;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class c extends zzad {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC1599l f26608a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC1615t0 f26609b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f26610c;

    public /* synthetic */ c(InterfaceC1599l interfaceC1599l, InterfaceC1615t0 interfaceC1615t0, int i10, Z z10) {
        this.f26608a = interfaceC1599l;
        this.f26609b = interfaceC1615t0;
        this.f26610c = i10;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC3516d
    public final void a(Bundle bundle) {
        if (bundle == null) {
            InterfaceC1615t0 interfaceC1615t0 = this.f26609b;
            a aVar = d.f26628k;
            interfaceC1615t0.c(AbstractC1613s0.b(63, 13, aVar), this.f26610c);
            this.f26608a.a(aVar, null);
            return;
        }
        int iB = AbstractC3524e1.b(bundle, "BillingClient");
        String strG = AbstractC3524e1.g(bundle, "BillingClient");
        a.C0341a c0341aC = a.c();
        c0341aC.c(iB);
        c0341aC.b(strG);
        if (iB != 0) {
            AbstractC3524e1.k("BillingClient", "getBillingConfig() failed. Response code: " + iB);
            a aVarA = c0341aC.a();
            this.f26609b.c(AbstractC1613s0.b(23, 13, aVarA), this.f26610c);
            this.f26608a.a(aVarA, null);
            return;
        }
        if (!bundle.containsKey("BILLING_CONFIG")) {
            AbstractC3524e1.k("BillingClient", "getBillingConfig() returned a bundle with neither an error nor a billing config response");
            c0341aC.c(6);
            a aVarA2 = c0341aC.a();
            this.f26609b.c(AbstractC1613s0.b(64, 13, aVarA2), this.f26610c);
            this.f26608a.a(aVarA2, null);
            return;
        }
        try {
            this.f26608a.a(c0341aC.a(), new C1597k(bundle.getString("BILLING_CONFIG")));
        } catch (JSONException e10) {
            AbstractC3524e1.l("BillingClient", "Got a JSON exception trying to decode BillingConfig. \n Exception: ", e10);
            InterfaceC1615t0 interfaceC1615t02 = this.f26609b;
            a aVar2 = d.f26628k;
            interfaceC1615t02.c(AbstractC1613s0.b(65, 13, aVar2), this.f26610c);
            this.f26608a.a(aVar2, null);
        }
    }
}
