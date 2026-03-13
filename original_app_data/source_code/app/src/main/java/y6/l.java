package y6;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class l implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iE = w6.b.E(parcel);
        int iW = 0;
        int iW2 = 0;
        int iW3 = 0;
        Long lA = null;
        Long lA2 = null;
        while (parcel.dataPosition() < iE) {
            int iU = w6.b.u(parcel);
            int iM = w6.b.m(iU);
            if (iM == 1) {
                iW = w6.b.w(parcel, iU);
            } else if (iM == 2) {
                iW2 = w6.b.w(parcel, iU);
            } else if (iM == 3) {
                lA = w6.b.A(parcel, iU);
            } else if (iM == 4) {
                lA2 = w6.b.A(parcel, iU);
            } else if (iM != 5) {
                w6.b.D(parcel, iU);
            } else {
                iW3 = w6.b.w(parcel, iU);
            }
        }
        w6.b.l(parcel, iE);
        return new h(iW, iW2, lA, lA2, iW3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new h[i10];
    }
}
