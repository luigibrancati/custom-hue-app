package com.google.android.gms.internal.location;

import K6.AbstractC1047l;
import K6.InterfaceC1037b;
import R6.n;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class zzaa extends zzb implements InterfaceC1037b {
    public zzaa() {
        super("com.google.android.gms.location.internal.ISettingsCallbacks");
    }

    @Override // com.google.android.gms.internal.location.zzb
    public final boolean D(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 1) {
            return false;
        }
        n nVar = (n) AbstractC1047l.a(parcel, n.CREATOR);
        AbstractC1047l.d(parcel);
        E5(nVar);
        return true;
    }
}
