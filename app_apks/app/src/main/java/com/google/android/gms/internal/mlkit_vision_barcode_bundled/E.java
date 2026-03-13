package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class E implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iE = w6.b.E(parcel);
        boolean zN = false;
        T t10 = null;
        V v10 = null;
        boolean zN2 = false;
        while (parcel.dataPosition() < iE) {
            int iU = w6.b.u(parcel);
            int iM = w6.b.m(iU);
            if (iM == 1) {
                t10 = (T) w6.b.f(parcel, iU, T.CREATOR);
            } else if (iM == 2) {
                v10 = (V) w6.b.f(parcel, iU, V.CREATOR);
            } else if (iM == 3) {
                zN = w6.b.n(parcel, iU);
            } else if (iM != 4) {
                w6.b.D(parcel, iU);
            } else {
                zN2 = w6.b.n(parcel, iU);
            }
        }
        w6.b.l(parcel, iE);
        return new D(t10, v10, zN, zN2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new D[i10];
    }
}
