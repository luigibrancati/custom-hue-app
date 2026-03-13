package com.google.android.gms.measurement.internal;

import X6.A6;
import X6.InterfaceC2439m2;
import android.os.Parcel;
import com.google.android.gms.internal.measurement.O;
import com.google.android.gms.internal.measurement.zzbm;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class zzgg extends zzbm implements InterfaceC2439m2 {
    public zzgg() {
        super("com.google.android.gms.measurement.internal.IUploadBatchesCallback");
    }

    @Override // com.google.android.gms.internal.measurement.zzbm
    public final boolean D(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 2) {
            return false;
        }
        A6 a62 = (A6) O.b(parcel, A6.CREATOR);
        O.f(parcel);
        B1(a62);
        return true;
    }
}
