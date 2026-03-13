package R6;

import K6.O;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class F implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iE = w6.b.E(parcel);
        ArrayList arrayListK = null;
        int iW = 0;
        String strG = null;
        while (parcel.dataPosition() < iE) {
            int iU = w6.b.u(parcel);
            int iM = w6.b.m(iU);
            if (iM == 1) {
                arrayListK = w6.b.k(parcel, iU, O.CREATOR);
            } else if (iM == 2) {
                iW = w6.b.w(parcel, iU);
            } else if (iM != 4) {
                w6.b.D(parcel, iU);
            } else {
                strG = w6.b.g(parcel, iU);
            }
        }
        w6.b.l(parcel, iE);
        return new C2074i(arrayListK, iW, strG);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C2074i[i10];
    }
}
