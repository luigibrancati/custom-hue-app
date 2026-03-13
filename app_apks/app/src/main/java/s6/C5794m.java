package s6;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: s6.m, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C5794m implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iE = w6.b.E(parcel);
        int iW = 0;
        boolean zN = false;
        long jZ = -1;
        String strG = null;
        while (parcel.dataPosition() < iE) {
            int iU = w6.b.u(parcel);
            int iM = w6.b.m(iU);
            if (iM == 1) {
                strG = w6.b.g(parcel, iU);
            } else if (iM == 2) {
                iW = w6.b.w(parcel, iU);
            } else if (iM == 3) {
                jZ = w6.b.z(parcel, iU);
            } else if (iM != 4) {
                w6.b.D(parcel, iU);
            } else {
                zN = w6.b.n(parcel, iU);
            }
        }
        w6.b.l(parcel, iE);
        return new C5785d(strG, iW, jZ, zN);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C5785d[i10];
    }
}
