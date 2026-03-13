package com.google.android.gms.maps.internal;

import L6.h;
import L6.s;
import T6.InterfaceC2246t;
import android.os.Parcel;
import com.google.android.gms.internal.maps.zzai;
import com.google.android.gms.internal.maps.zzb;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class zzau extends zzb implements InterfaceC2246t {
    public zzau() {
        super("com.google.android.gms.maps.internal.IOnMarkerClickListener");
    }

    @Override // com.google.android.gms.internal.maps.zzb
    public final boolean D(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 1) {
            return false;
        }
        h hVarZzb = zzai.zzb(parcel.readStrongBinder());
        s.b(parcel);
        boolean zL = l(hVarZzb);
        parcel2.writeNoException();
        parcel2.writeInt(zL ? 1 : 0);
        return true;
    }
}
