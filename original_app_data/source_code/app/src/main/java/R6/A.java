package R6;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class A implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iE = w6.b.E(parcel);
        long jZ = -1;
        long jZ2 = -1;
        int iW = 1;
        int iW2 = 1;
        while (parcel.dataPosition() < iE) {
            int iU = w6.b.u(parcel);
            int iM = w6.b.m(iU);
            if (iM == 1) {
                iW = w6.b.w(parcel, iU);
            } else if (iM == 2) {
                iW2 = w6.b.w(parcel, iU);
            } else if (iM == 3) {
                jZ = w6.b.z(parcel, iU);
            } else if (iM != 4) {
                w6.b.D(parcel, iU);
            } else {
                jZ2 = w6.b.z(parcel, iU);
            }
        }
        w6.b.l(parcel, iE);
        return new z(iW, iW2, jZ, jZ2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new z[i10];
    }
}
