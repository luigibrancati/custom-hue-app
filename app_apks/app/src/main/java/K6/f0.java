package K6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import s6.C5785d;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class f0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iE = w6.b.E(parcel);
        String strG = null;
        String strG2 = null;
        String strG3 = null;
        ArrayList arrayListK = null;
        H h10 = null;
        int iW = 0;
        while (parcel.dataPosition() < iE) {
            int iU = w6.b.u(parcel);
            int iM = w6.b.m(iU);
            if (iM == 1) {
                iW = w6.b.w(parcel, iU);
            } else if (iM == 3) {
                strG = w6.b.g(parcel, iU);
            } else if (iM == 4) {
                strG2 = w6.b.g(parcel, iU);
            } else if (iM == 6) {
                strG3 = w6.b.g(parcel, iU);
            } else if (iM == 7) {
                h10 = (H) w6.b.f(parcel, iU, H.CREATOR);
            } else if (iM != 8) {
                w6.b.D(parcel, iU);
            } else {
                arrayListK = w6.b.k(parcel, iU, C5785d.CREATOR);
            }
        }
        w6.b.l(parcel, iE);
        return new H(iW, strG, strG2, strG3, arrayListK, h10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new H[i10];
    }
}
