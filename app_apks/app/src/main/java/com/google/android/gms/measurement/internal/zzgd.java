package com.google.android.gms.measurement.internal;

import X6.C2482r6;
import X6.InterfaceC2423k2;
import android.os.Parcel;
import com.google.android.gms.internal.measurement.O;
import com.google.android.gms.internal.measurement.zzbm;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class zzgd extends zzbm implements InterfaceC2423k2 {
    public zzgd() {
        super("com.google.android.gms.measurement.internal.ITriggerUrisCallback");
    }

    @Override // com.google.android.gms.internal.measurement.zzbm
    public final boolean D(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 2) {
            return false;
        }
        ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(C2482r6.CREATOR);
        O.f(parcel);
        n3(arrayListCreateTypedArrayList);
        return true;
    }
}
