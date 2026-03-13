package com.google.android.gms.internal.location;

import K6.AbstractC1047l;
import K6.j0;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class zzn extends zzb implements j0 {
    public zzn() {
        super("com.google.android.gms.location.internal.IBooleanStatusCallback");
    }

    @Override // com.google.android.gms.internal.location.zzb
    public final boolean D(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 1) {
            return false;
        }
        Status status = (Status) AbstractC1047l.a(parcel, Status.CREATOR);
        boolean z10 = parcel.readInt() != 0;
        AbstractC1047l.d(parcel);
        Y2(status, z10);
        return true;
    }
}
