package X6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class B6 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iE = w6.b.E(parcel);
        ArrayList arrayListK = null;
        while (parcel.dataPosition() < iE) {
            int iU = w6.b.u(parcel);
            if (w6.b.m(iU) != 1) {
                w6.b.D(parcel, iU);
            } else {
                arrayListK = w6.b.k(parcel, iU, C2522w6.CREATOR);
            }
        }
        w6.b.l(parcel, iE);
        return new A6(arrayListK);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new A6[i10];
    }
}
