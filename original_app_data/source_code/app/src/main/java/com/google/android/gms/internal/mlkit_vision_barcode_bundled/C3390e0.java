package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.e0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C3390e0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iE = w6.b.E(parcel);
        long jZ = 0;
        int iW = 0;
        int iW2 = 0;
        int iW3 = 0;
        int iW4 = 0;
        while (parcel.dataPosition() < iE) {
            int iU = w6.b.u(parcel);
            int iM = w6.b.m(iU);
            if (iM == 1) {
                iW = w6.b.w(parcel, iU);
            } else if (iM == 2) {
                iW2 = w6.b.w(parcel, iU);
            } else if (iM == 3) {
                iW3 = w6.b.w(parcel, iU);
            } else if (iM == 4) {
                iW4 = w6.b.w(parcel, iU);
            } else if (iM != 5) {
                w6.b.D(parcel, iU);
            } else {
                jZ = w6.b.z(parcel, iU);
            }
        }
        w6.b.l(parcel, iE);
        return new C3385d0(iW, iW2, iW3, iW4, jZ);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C3385d0[i10];
    }
}
