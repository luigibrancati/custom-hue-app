package com.android.billingclient.api;

import O4.H0;
import android.os.Bundle;
import com.android.billingclient.api.a;
import com.google.android.gms.internal.play_billing.AbstractC3524e1;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class e {
    public static H0 a(Bundle bundle, String str, String str2) {
        a aVar = d.f26628k;
        if (bundle == null) {
            AbstractC3524e1.k("BillingClient", String.format("%s got null owned items list", str2));
            return new H0(aVar, 54);
        }
        int iB = AbstractC3524e1.b(bundle, "BillingClient");
        String strG = AbstractC3524e1.g(bundle, "BillingClient");
        a.C0341a c0341aC = a.c();
        c0341aC.c(iB);
        c0341aC.b(strG);
        a aVarA = c0341aC.a();
        if (iB != 0) {
            AbstractC3524e1.k("BillingClient", String.format("%s failed. Response code: %s", str2, Integer.valueOf(iB)));
            return new H0(aVarA, 23);
        }
        if (!bundle.containsKey("INAPP_PURCHASE_ITEM_LIST") || !bundle.containsKey("INAPP_PURCHASE_DATA_LIST") || !bundle.containsKey("INAPP_DATA_SIGNATURE_LIST")) {
            AbstractC3524e1.k("BillingClient", String.format("Bundle returned from %s doesn't contain required fields.", str2));
            return new H0(aVar, 55);
        }
        ArrayList<String> stringArrayList = bundle.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
        ArrayList<String> stringArrayList2 = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
        ArrayList<String> stringArrayList3 = bundle.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
        if (stringArrayList == null) {
            AbstractC3524e1.k("BillingClient", String.format("Bundle returned from %s contains null SKUs list.", str2));
            return new H0(aVar, 56);
        }
        if (stringArrayList2 == null) {
            AbstractC3524e1.k("BillingClient", String.format("Bundle returned from %s contains null purchases list.", str2));
            return new H0(aVar, 57);
        }
        if (stringArrayList3 != null) {
            return new H0(d.f26629l, 1);
        }
        AbstractC3524e1.k("BillingClient", String.format("Bundle returned from %s contains null signatures list.", str2));
        return new H0(aVar, 58);
    }
}
