package com.google.android.gms.location;

import K6.AbstractC1047l;
import R6.J;
import R6.K;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.location.zzb;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class zzv extends zzb implements K {
    public zzv() {
        super("com.google.android.gms.location.ILocationCallback");
    }

    public static K zzb(IBinder iBinder) {
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.ILocationCallback");
        return iInterfaceQueryLocalInterface instanceof K ? (K) iInterfaceQueryLocalInterface : new J(iBinder);
    }

    @Override // com.google.android.gms.internal.location.zzb
    public final boolean D(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            LocationResult locationResult = (LocationResult) AbstractC1047l.a(parcel, LocationResult.CREATOR);
            AbstractC1047l.d(parcel);
            Z3(locationResult);
        } else if (i10 == 2) {
            LocationAvailability locationAvailability = (LocationAvailability) AbstractC1047l.a(parcel, LocationAvailability.CREATOR);
            AbstractC1047l.d(parcel);
            t1(locationAvailability);
        } else {
            if (i10 != 3) {
                return false;
            }
            e();
        }
        return true;
    }
}
