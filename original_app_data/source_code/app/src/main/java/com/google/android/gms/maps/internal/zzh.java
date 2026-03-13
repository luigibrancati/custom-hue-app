package com.google.android.gms.maps.internal;

import L6.h;
import L6.s;
import T6.S;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.maps.zzai;
import com.google.android.gms.internal.maps.zzb;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class zzh extends zzb implements S {
    public zzh() {
        super("com.google.android.gms.maps.internal.IInfoWindowAdapter");
    }

    @Override // com.google.android.gms.internal.maps.zzb
    public final boolean D(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            h hVarZzb = zzai.zzb(parcel.readStrongBinder());
            s.b(parcel);
            IObjectWrapper iObjectWrapperB0 = b0(hVarZzb);
            parcel2.writeNoException();
            s.e(parcel2, iObjectWrapperB0);
        } else {
            if (i10 != 2) {
                return false;
            }
            h hVarZzb2 = zzai.zzb(parcel.readStrongBinder());
            s.b(parcel);
            IObjectWrapper iObjectWrapperL = l(hVarZzb2);
            parcel2.writeNoException();
            s.e(parcel2, iObjectWrapperL);
        }
        return true;
    }
}
