package com.google.android.gms.maps.internal;

import L6.s;
import T6.InterfaceC2248v;
import android.os.Parcel;
import com.google.android.gms.internal.maps.zzb;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class zzay extends zzb implements InterfaceC2248v {
    public zzay() {
        super("com.google.android.gms.maps.internal.IOnMyLocationButtonClickListener");
    }

    @Override // com.google.android.gms.internal.maps.zzb
    public final boolean D(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 1) {
            return false;
        }
        boolean zZzb = zzb();
        parcel2.writeNoException();
        ClassLoader classLoader = s.f8585a;
        parcel2.writeInt(zZzb ? 1 : 0);
        return true;
    }
}
