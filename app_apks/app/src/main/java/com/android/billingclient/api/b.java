package com.android.billingclient.api;

import O4.AbstractC1613s0;
import O4.C1593i;
import O4.InterfaceC1585e;
import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import com.android.billingclient.api.a;
import com.google.android.gms.internal.play_billing.AbstractC3524e1;
import com.google.android.gms.internal.play_billing.AbstractC3539g4;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class b extends ResultReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1585e f26606a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1593i f26607b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(C1593i c1593i, Handler handler, InterfaceC1585e interfaceC1585e) {
        super(handler);
        this.f26606a = interfaceC1585e;
        this.f26607b = c1593i;
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i10, Bundle bundle) {
        a.C0341a c0341aC = a.c();
        c0341aC.c(i10);
        if (i10 != 0) {
            if (bundle == null) {
                this.f26607b.K0(this.f26606a, d.f26628k, 73, null);
                return;
            } else {
                c0341aC.b(AbstractC3524e1.g(bundle, "BillingClient"));
                int i11 = bundle.getInt("INTERNAL_LOG_ERROR_REASON");
                this.f26607b.V(AbstractC1613s0.c(i11 != 0 ? AbstractC3539g4.a(i11) : 23, 16, c0341aC.a(), bundle.getString("INTERNAL_LOG_ERROR_ADDITIONAL_DETAILS")));
            }
        }
        this.f26606a.a(c0341aC.a());
    }
}
