package N6;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: N6.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C1266c implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iE = w6.b.E(parcel);
        double dQ = 0.0d;
        double dQ2 = 0.0d;
        while (parcel.dataPosition() < iE) {
            int iU = w6.b.u(parcel);
            int iM = w6.b.m(iU);
            if (iM == 2) {
                dQ = w6.b.q(parcel, iU);
            } else if (iM != 3) {
                w6.b.D(parcel, iU);
            } else {
                dQ2 = w6.b.q(parcel, iU);
            }
        }
        w6.b.l(parcel, iE);
        return new C1506u6(dQ, dQ2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C1506u6[i10];
    }
}
