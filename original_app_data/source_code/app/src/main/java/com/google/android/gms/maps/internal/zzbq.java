package com.google.android.gms.maps.internal;

import L6.s;
import T6.F;
import android.os.Parcel;
import com.google.android.gms.internal.maps.zzb;
import com.google.android.gms.maps.model.a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class zzbq extends zzb implements F {
    public zzbq() {
        super("com.google.android.gms.maps.internal.IOnStreetViewPanoramaLongClickListener");
    }

    @Override // com.google.android.gms.internal.maps.zzb
    public final boolean D(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 1) {
            return false;
        }
        a aVar = (a) s.a(parcel, a.CREATOR);
        s.b(parcel);
        N(aVar);
        parcel2.writeNoException();
        return true;
    }
}
