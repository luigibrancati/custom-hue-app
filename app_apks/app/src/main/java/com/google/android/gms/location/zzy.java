package com.google.android.gms.location;

import K6.AbstractC1047l;
import R6.L;
import R6.M;
import android.location.Location;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.location.zzb;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class zzy extends zzb implements M {
    public zzy() {
        super("com.google.android.gms.location.ILocationListener");
    }

    public static M zzb(IBinder iBinder) {
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.ILocationListener");
        return iInterfaceQueryLocalInterface instanceof M ? (M) iInterfaceQueryLocalInterface : new L(iBinder);
    }

    @Override // com.google.android.gms.internal.location.zzb
    public final boolean D(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            Location location = (Location) AbstractC1047l.a(parcel, Location.CREATOR);
            AbstractC1047l.d(parcel);
            w0(location);
        } else {
            if (i10 != 2) {
                return false;
            }
            d();
        }
        return true;
    }
}
