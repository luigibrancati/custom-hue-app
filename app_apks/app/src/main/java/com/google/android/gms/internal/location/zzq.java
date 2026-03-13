package com.google.android.gms.internal.location;

import K6.AbstractC1047l;
import K6.h0;
import K6.l0;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class zzq extends zzb implements l0 {
    public zzq() {
        super("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
    }

    @Override // com.google.android.gms.internal.location.zzb
    public final boolean D(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            h0 h0Var = (h0) AbstractC1047l.a(parcel, h0.CREATOR);
            AbstractC1047l.d(parcel);
            E6(h0Var);
        } else {
            if (i10 != 2) {
                return false;
            }
            d();
        }
        return true;
    }
}
