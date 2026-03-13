package com.google.android.gms.internal.play_billing;

import android.os.Bundle;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class zzab extends zzar implements InterfaceC3510c {
    public zzab() {
        super("com.android.vending.billing.IInAppBillingGetAlternativeBillingOnlyDialogIntentCallback");
    }

    @Override // com.google.android.gms.internal.play_billing.zzar
    public final boolean D(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 1) {
            return false;
        }
        Bundle bundle = (Bundle) AbstractC3564l.a(parcel, Bundle.CREATOR);
        AbstractC3564l.b(parcel);
        a(bundle);
        return true;
    }
}
