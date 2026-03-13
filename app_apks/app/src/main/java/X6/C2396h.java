package X6;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: X6.h, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C2396h implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iE = w6.b.E(parcel);
        long jZ = 0;
        long jZ2 = 0;
        int iW = 0;
        while (parcel.dataPosition() < iE) {
            int iU = w6.b.u(parcel);
            int iM = w6.b.m(iU);
            if (iM == 1) {
                jZ = w6.b.z(parcel, iU);
            } else if (iM == 2) {
                iW = w6.b.w(parcel, iU);
            } else if (iM != 3) {
                w6.b.D(parcel, iU);
            } else {
                jZ2 = w6.b.z(parcel, iU);
            }
        }
        w6.b.l(parcel, iE);
        return new C2388g(jZ, iW, jZ2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C2388g[i10];
    }
}
