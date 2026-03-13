package v6;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import s6.C5785d;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class O implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iE = w6.b.E(parcel);
        Bundle bundleA = null;
        C6049d c6049d = null;
        int iW = 0;
        C5785d[] c5785dArr = null;
        while (parcel.dataPosition() < iE) {
            int iU = w6.b.u(parcel);
            int iM = w6.b.m(iU);
            if (iM == 1) {
                bundleA = w6.b.a(parcel, iU);
            } else if (iM == 2) {
                c5785dArr = (C5785d[]) w6.b.j(parcel, iU, C5785d.CREATOR);
            } else if (iM == 3) {
                iW = w6.b.w(parcel, iU);
            } else if (iM != 4) {
                w6.b.D(parcel, iU);
            } else {
                c6049d = (C6049d) w6.b.f(parcel, iU, C6049d.CREATOR);
            }
        }
        w6.b.l(parcel, iE);
        return new N(bundleA, c5785dArr, iW, c6049d);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new N[i10];
    }
}
