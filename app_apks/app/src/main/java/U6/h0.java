package U6;

import U6.C2293u;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class h0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iE = w6.b.E(parcel);
        C2293u.b bVar = null;
        int iW = 0;
        int iW2 = 0;
        while (parcel.dataPosition() < iE) {
            int iU = w6.b.u(parcel);
            int iM = w6.b.m(iU);
            if (iM == 2) {
                iW = w6.b.w(parcel, iU);
            } else if (iM == 3) {
                iW2 = w6.b.w(parcel, iU);
            } else if (iM != 4) {
                w6.b.D(parcel, iU);
            } else {
                bVar = (C2293u.b) w6.b.f(parcel, iU, C2293u.b.CREATOR);
            }
        }
        w6.b.l(parcel, iE);
        return new C2293u(iW, iW2, bVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C2293u[i10];
    }
}
