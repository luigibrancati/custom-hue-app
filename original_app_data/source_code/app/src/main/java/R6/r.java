package R6;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class r implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iE = w6.b.E(parcel);
        K6.H h10 = null;
        int iW = 0;
        boolean zN = false;
        long jZ = Long.MAX_VALUE;
        while (parcel.dataPosition() < iE) {
            int iU = w6.b.u(parcel);
            int iM = w6.b.m(iU);
            if (iM == 1) {
                jZ = w6.b.z(parcel, iU);
            } else if (iM == 2) {
                iW = w6.b.w(parcel, iU);
            } else if (iM == 3) {
                zN = w6.b.n(parcel, iU);
            } else if (iM != 5) {
                w6.b.D(parcel, iU);
            } else {
                h10 = (K6.H) w6.b.f(parcel, iU, K6.H.CREATOR);
            }
        }
        w6.b.l(parcel, iE);
        return new C2075j(jZ, iW, zN, h10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C2075j[i10];
    }
}
