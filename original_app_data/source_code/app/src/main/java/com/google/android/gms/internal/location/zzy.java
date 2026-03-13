package com.google.android.gms.internal.location;

import K6.AbstractC1047l;
import K6.q0;
import android.location.Location;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class zzy extends zzb implements q0 {
    public zzy() {
        super("com.google.android.gms.location.internal.ILocationStatusCallback");
    }

    @Override // com.google.android.gms.internal.location.zzb
    public final boolean D(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 1) {
            return false;
        }
        Status status = (Status) AbstractC1047l.a(parcel, Status.CREATOR);
        Location location = (Location) AbstractC1047l.a(parcel, Location.CREATOR);
        AbstractC1047l.d(parcel);
        R0(status, location);
        return true;
    }
}
