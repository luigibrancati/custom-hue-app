package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class S implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iE = w6.b.E(parcel);
        boolean zN = false;
        boolean zN2 = false;
        boolean zN3 = false;
        float fS = 0.0f;
        byte[] bArrB = null;
        while (parcel.dataPosition() < iE) {
            int iU = w6.b.u(parcel);
            int iM = w6.b.m(iU);
            if (iM == 1) {
                zN = w6.b.n(parcel, iU);
            } else if (iM == 2) {
                bArrB = w6.b.b(parcel, iU);
            } else if (iM == 3) {
                zN2 = w6.b.n(parcel, iU);
            } else if (iM == 4) {
                fS = w6.b.s(parcel, iU);
            } else if (iM != 5) {
                w6.b.D(parcel, iU);
            } else {
                zN3 = w6.b.n(parcel, iU);
            }
        }
        w6.b.l(parcel, iE);
        return new Q(zN, bArrB, zN2, fS, zN3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new Q[i10];
    }
}
