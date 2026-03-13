package U6;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class X implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iE = w6.b.E(parcel);
        IBinder iBinderV = null;
        int iW = 0;
        Float fT = null;
        while (parcel.dataPosition() < iE) {
            int iU = w6.b.u(parcel);
            int iM = w6.b.m(iU);
            if (iM == 2) {
                iW = w6.b.w(parcel, iU);
            } else if (iM == 3) {
                iBinderV = w6.b.v(parcel, iU);
            } else if (iM != 4) {
                w6.b.D(parcel, iU);
            } else {
                fT = w6.b.t(parcel, iU);
            }
        }
        w6.b.l(parcel, iE);
        return new C2279f(iW, iBinderV, fT);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C2279f[i10];
    }
}
