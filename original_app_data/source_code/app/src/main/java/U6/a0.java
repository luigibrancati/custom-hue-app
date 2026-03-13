package U6;

import U6.C2293u;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class a0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iE = w6.b.E(parcel);
        int iW = 0;
        String strG = null;
        IBinder iBinderV = null;
        int iW2 = 0;
        while (parcel.dataPosition() < iE) {
            int iU = w6.b.u(parcel);
            int iM = w6.b.m(iU);
            if (iM == 2) {
                strG = w6.b.g(parcel, iU);
            } else if (iM == 3) {
                iBinderV = w6.b.v(parcel, iU);
            } else if (iM == 4) {
                iW = w6.b.w(parcel, iU);
            } else if (iM != 5) {
                w6.b.D(parcel, iU);
            } else {
                iW2 = w6.b.w(parcel, iU);
            }
        }
        w6.b.l(parcel, iE);
        return new C2293u.b(strG, iBinderV, iW, iW2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C2293u.b[i10];
    }
}
