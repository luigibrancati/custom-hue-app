package v6;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class L implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iE = w6.b.E(parcel);
        int iW = 0;
        while (parcel.dataPosition() < iE) {
            int iU = w6.b.u(parcel);
            if (w6.b.m(iU) != 1) {
                w6.b.D(parcel, iU);
            } else {
                iW = w6.b.w(parcel, iU);
            }
        }
        w6.b.l(parcel, iE);
        return new K(iW);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new K[i10];
    }
}
