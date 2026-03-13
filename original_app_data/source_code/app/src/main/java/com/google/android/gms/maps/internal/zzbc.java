package com.google.android.gms.maps.internal;

import L6.s;
import T6.InterfaceC2251y;
import android.location.Location;
import android.os.Parcel;
import com.google.android.gms.internal.maps.zzb;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class zzbc extends zzb implements InterfaceC2251y {
    public zzbc() {
        super("com.google.android.gms.maps.internal.IOnMyLocationClickListener");
    }

    @Override // com.google.android.gms.internal.maps.zzb
    public final boolean D(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 1) {
            return false;
        }
        Location location = (Location) s.a(parcel, Location.CREATOR);
        s.b(parcel);
        w1(location);
        parcel2.writeNoException();
        return true;
    }
}
