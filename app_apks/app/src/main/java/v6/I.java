package v6;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class I implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iE = w6.b.E(parcel);
        int iW = 0;
        boolean zN = false;
        boolean zN2 = false;
        int iW2 = 0;
        int iW3 = 0;
        while (parcel.dataPosition() < iE) {
            int iU = w6.b.u(parcel);
            int iM = w6.b.m(iU);
            if (iM == 1) {
                iW = w6.b.w(parcel, iU);
            } else if (iM == 2) {
                zN = w6.b.n(parcel, iU);
            } else if (iM == 3) {
                zN2 = w6.b.n(parcel, iU);
            } else if (iM == 4) {
                iW2 = w6.b.w(parcel, iU);
            } else if (iM != 5) {
                w6.b.D(parcel, iU);
            } else {
                iW3 = w6.b.w(parcel, iU);
            }
        }
        w6.b.l(parcel, iE);
        return new C6058m(iW, zN, zN2, iW2, iW3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C6058m[i10];
    }
}
