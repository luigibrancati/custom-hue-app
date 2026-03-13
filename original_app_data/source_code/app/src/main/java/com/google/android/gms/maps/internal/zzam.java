package com.google.android.gms.maps.internal;

import L6.s;
import T6.InterfaceC2243p;
import android.os.Parcel;
import com.google.android.gms.internal.maps.zzb;
import com.google.android.gms.maps.model.LatLng;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class zzam extends zzb implements InterfaceC2243p {
    public zzam() {
        super("com.google.android.gms.maps.internal.IOnMapClickListener");
    }

    @Override // com.google.android.gms.internal.maps.zzb
    public final boolean D(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 1) {
            return false;
        }
        LatLng latLng = (LatLng) s.a(parcel, LatLng.CREATOR);
        s.b(parcel);
        B(latLng);
        parcel2.writeNoException();
        return true;
    }
}
