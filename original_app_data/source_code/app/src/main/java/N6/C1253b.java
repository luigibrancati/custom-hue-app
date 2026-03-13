package N6;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: N6.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C1253b implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iE = w6.b.E(parcel);
        String strG = null;
        String strG2 = null;
        int iW = 0;
        String strG3 = null;
        while (parcel.dataPosition() < iE) {
            int iU = w6.b.u(parcel);
            int iM = w6.b.m(iU);
            if (iM == 2) {
                iW = w6.b.w(parcel, iU);
            } else if (iM == 3) {
                strG = w6.b.g(parcel, iU);
            } else if (iM == 4) {
                strG3 = w6.b.g(parcel, iU);
            } else if (iM != 5) {
                w6.b.D(parcel, iU);
            } else {
                strG2 = w6.b.g(parcel, iU);
            }
        }
        w6.b.l(parcel, iE);
        return new T5(iW, strG, strG3, strG2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new T5[i10];
    }
}
