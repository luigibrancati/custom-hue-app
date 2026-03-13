package U6;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class Z implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iE = w6.b.E(parcel);
        Integer numX = null;
        Integer numX2 = null;
        Float fT = null;
        Float fT2 = null;
        while (parcel.dataPosition() < iE) {
            int iU = w6.b.u(parcel);
            int iM = w6.b.m(iU);
            if (iM == 1) {
                numX = w6.b.x(parcel, iU);
            } else if (iM == 2) {
                numX2 = w6.b.x(parcel, iU);
            } else if (iM == 3) {
                fT = w6.b.t(parcel, iU);
            } else if (iM != 4) {
                w6.b.D(parcel, iU);
            } else {
                fT2 = w6.b.t(parcel, iU);
            }
        }
        w6.b.l(parcel, iE);
        return new C2285l(numX, numX2, fT, fT2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C2285l[i10];
    }
}
