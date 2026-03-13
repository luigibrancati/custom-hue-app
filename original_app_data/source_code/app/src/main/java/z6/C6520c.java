package z6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import s6.C5785d;

/* JADX INFO: renamed from: z6.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C6520c implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iE = w6.b.E(parcel);
        ArrayList arrayListK = null;
        String strG = null;
        boolean zN = false;
        String strG2 = null;
        while (parcel.dataPosition() < iE) {
            int iU = w6.b.u(parcel);
            int iM = w6.b.m(iU);
            if (iM == 1) {
                arrayListK = w6.b.k(parcel, iU, C5785d.CREATOR);
            } else if (iM == 2) {
                zN = w6.b.n(parcel, iU);
            } else if (iM == 3) {
                strG2 = w6.b.g(parcel, iU);
            } else if (iM != 4) {
                w6.b.D(parcel, iU);
            } else {
                strG = w6.b.g(parcel, iU);
            }
        }
        w6.b.l(parcel, iE);
        return new C6518a(arrayListK, zN, strG2, strG);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C6518a[i10];
    }
}
