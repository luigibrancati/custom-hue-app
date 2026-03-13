package com.google.android.gms.maps.internal;

import L6.h;
import L6.s;
import T6.InterfaceC2238k;
import android.os.Parcel;
import com.google.android.gms.internal.maps.zzai;
import com.google.android.gms.internal.maps.zzb;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class zzae extends zzb implements InterfaceC2238k {
    public zzae() {
        super("com.google.android.gms.maps.internal.IOnInfoWindowCloseListener");
    }

    @Override // com.google.android.gms.internal.maps.zzb
    public final boolean D(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 1) {
            return false;
        }
        h hVarZzb = zzai.zzb(parcel.readStrongBinder());
        s.b(parcel);
        l(hVarZzb);
        parcel2.writeNoException();
        return true;
    }
}
