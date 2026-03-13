package com.google.android.gms.maps.internal;

import L6.h;
import L6.s;
import T6.InterfaceC2247u;
import android.os.Parcel;
import com.google.android.gms.internal.maps.zzai;
import com.google.android.gms.internal.maps.zzb;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class zzaw extends zzb implements InterfaceC2247u {
    public zzaw() {
        super("com.google.android.gms.maps.internal.IOnMarkerDragListener");
    }

    @Override // com.google.android.gms.internal.maps.zzb
    public final boolean D(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            h hVarZzb = zzai.zzb(parcel.readStrongBinder());
            s.b(parcel);
            C5(hVarZzb);
        } else if (i10 == 2) {
            h hVarZzb2 = zzai.zzb(parcel.readStrongBinder());
            s.b(parcel);
            l(hVarZzb2);
        } else {
            if (i10 != 3) {
                return false;
            }
            h hVarZzb3 = zzai.zzb(parcel.readStrongBinder());
            s.b(parcel);
            b0(hVarZzb3);
        }
        parcel2.writeNoException();
        return true;
    }
}
