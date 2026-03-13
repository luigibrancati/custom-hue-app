package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class P extends N implements Q {
    public P(IBinder iBinder) {
        super(iBinder, "com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
    }

    @Override // com.google.android.gms.internal.measurement.Q
    public final Bundle Q(Bundle bundle) {
        Parcel parcelK = K();
        O.c(parcelK, bundle);
        Parcel parcelD = D(1, parcelK);
        Bundle bundle2 = (Bundle) O.b(parcelD, Bundle.CREATOR);
        parcelD.recycle();
        return bundle2;
    }
}
