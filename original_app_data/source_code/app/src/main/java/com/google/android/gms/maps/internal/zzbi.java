package com.google.android.gms.maps.internal;

import L6.m;
import L6.s;
import T6.B;
import android.os.Parcel;
import com.google.android.gms.internal.maps.zzb;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class zzbi extends zzb implements B {
    public zzbi() {
        super("com.google.android.gms.maps.internal.IOnPolylineClickListener");
    }

    @Override // com.google.android.gms.internal.maps.zzb
    public final boolean D(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 1) {
            return false;
        }
        m mVarZzb = com.google.android.gms.internal.maps.zzaq.zzb(parcel.readStrongBinder());
        s.b(parcel);
        v3(mVarZzb);
        parcel2.writeNoException();
        return true;
    }
}
