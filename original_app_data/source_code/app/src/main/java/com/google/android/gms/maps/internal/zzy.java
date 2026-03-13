package com.google.android.gms.maps.internal;

import L6.D;
import L6.s;
import T6.a0;
import android.os.Parcel;
import com.google.android.gms.internal.maps.zzb;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class zzy extends zzb implements a0 {
    public zzy() {
        super("com.google.android.gms.maps.internal.IOnGroundOverlayClickListener");
    }

    @Override // com.google.android.gms.internal.maps.zzb
    public final boolean D(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 1) {
            return false;
        }
        D dZzb = com.google.android.gms.internal.maps.zzw.zzb(parcel.readStrongBinder());
        s.b(parcel);
        N5(dZzb);
        parcel2.writeNoException();
        return true;
    }
}
