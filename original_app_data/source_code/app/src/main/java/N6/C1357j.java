package N6;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: N6.j, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C1357j implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iE = w6.b.E(parcel);
        int iW = 0;
        boolean zN = false;
        while (parcel.dataPosition() < iE) {
            int iU = w6.b.u(parcel);
            int iM = w6.b.m(iU);
            if (iM == 2) {
                iW = w6.b.w(parcel, iU);
            } else if (iM != 3) {
                w6.b.D(parcel, iU);
            } else {
                zN = w6.b.n(parcel, iU);
            }
        }
        w6.b.l(parcel, iE);
        return new C1344i(iW, zN);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C1344i[i10];
    }
}
