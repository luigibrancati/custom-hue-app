package com.google.android.gms.maps.internal;

import L6.f;
import L6.s;
import T6.InterfaceC2242o;
import android.os.Parcel;
import com.google.android.gms.internal.maps.zzaf;
import com.google.android.gms.internal.maps.zzb;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class zzak extends zzb implements InterfaceC2242o {
    public zzak() {
        super("com.google.android.gms.maps.internal.IOnMapCapabilitiesChangedListener");
    }

    @Override // com.google.android.gms.internal.maps.zzb
    public final boolean D(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 1) {
            return false;
        }
        f fVarZzb = zzaf.zzb(parcel.readStrongBinder());
        s.b(parcel);
        k1(fVarZzb);
        parcel2.writeNoException();
        return true;
    }
}
