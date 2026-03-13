package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class K implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iE = w6.b.E(parcel);
        String strG = null;
        String strG2 = null;
        String strG3 = null;
        String strG4 = null;
        String strG5 = null;
        String strG6 = null;
        String strG7 = null;
        String strG8 = null;
        String strG9 = null;
        String strG10 = null;
        String strG11 = null;
        String strG12 = null;
        String strG13 = null;
        String strG14 = null;
        while (parcel.dataPosition() < iE) {
            int iU = w6.b.u(parcel);
            switch (w6.b.m(iU)) {
                case 1:
                    strG = w6.b.g(parcel, iU);
                    break;
                case 2:
                    strG2 = w6.b.g(parcel, iU);
                    break;
                case 3:
                    strG3 = w6.b.g(parcel, iU);
                    break;
                case 4:
                    strG4 = w6.b.g(parcel, iU);
                    break;
                case 5:
                    strG5 = w6.b.g(parcel, iU);
                    break;
                case 6:
                    strG6 = w6.b.g(parcel, iU);
                    break;
                case 7:
                    strG7 = w6.b.g(parcel, iU);
                    break;
                case 8:
                    strG8 = w6.b.g(parcel, iU);
                    break;
                case 9:
                    strG9 = w6.b.g(parcel, iU);
                    break;
                case 10:
                    strG10 = w6.b.g(parcel, iU);
                    break;
                case 11:
                    strG11 = w6.b.g(parcel, iU);
                    break;
                case 12:
                    strG12 = w6.b.g(parcel, iU);
                    break;
                case 13:
                    strG13 = w6.b.g(parcel, iU);
                    break;
                case 14:
                    strG14 = w6.b.g(parcel, iU);
                    break;
                default:
                    w6.b.D(parcel, iU);
                    break;
            }
        }
        w6.b.l(parcel, iE);
        return new r(strG, strG2, strG3, strG4, strG5, strG6, strG7, strG8, strG9, strG10, strG11, strG12, strG13, strG14);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new r[i10];
    }
}
