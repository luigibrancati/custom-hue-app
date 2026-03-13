package com.google.android.gms.internal.location;

import K6.AbstractC1047l;
import K6.p0;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.LocationAvailability;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class zzw extends zzb implements p0 {
    public zzw() {
        super("com.google.android.gms.location.internal.ILocationAvailabilityStatusCallback");
    }

    @Override // com.google.android.gms.internal.location.zzb
    public final boolean D(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 1) {
            return false;
        }
        Status status = (Status) AbstractC1047l.a(parcel, Status.CREATOR);
        LocationAvailability locationAvailability = (LocationAvailability) AbstractC1047l.a(parcel, LocationAvailability.CREATOR);
        AbstractC1047l.d(parcel);
        a1(status, locationAvailability);
        return true;
    }
}
