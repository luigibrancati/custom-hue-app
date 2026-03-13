package s6;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: s6.D, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C5774D implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iE = w6.b.E(parcel);
        long jZ = -1;
        boolean zN = false;
        int iW = 0;
        int iW2 = 0;
        String strG = null;
        while (parcel.dataPosition() < iE) {
            int iU = w6.b.u(parcel);
            int iM = w6.b.m(iU);
            if (iM == 1) {
                zN = w6.b.n(parcel, iU);
            } else if (iM == 2) {
                strG = w6.b.g(parcel, iU);
            } else if (iM == 3) {
                iW = w6.b.w(parcel, iU);
            } else if (iM == 4) {
                iW2 = w6.b.w(parcel, iU);
            } else if (iM != 5) {
                w6.b.D(parcel, iU);
            } else {
                jZ = w6.b.z(parcel, iU);
            }
        }
        w6.b.l(parcel, iE);
        return new C5773C(zN, strG, iW, iW2, jZ);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C5773C[i10];
    }
}
