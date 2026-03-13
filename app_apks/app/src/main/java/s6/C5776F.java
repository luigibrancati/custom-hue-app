package s6;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: s6.F, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C5776F implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iE = w6.b.E(parcel);
        boolean zN = false;
        String strG = null;
        IBinder iBinderV = null;
        boolean zN2 = false;
        while (parcel.dataPosition() < iE) {
            int iU = w6.b.u(parcel);
            int iM = w6.b.m(iU);
            if (iM == 1) {
                strG = w6.b.g(parcel, iU);
            } else if (iM == 2) {
                iBinderV = w6.b.v(parcel, iU);
            } else if (iM == 3) {
                zN = w6.b.n(parcel, iU);
            } else if (iM != 4) {
                w6.b.D(parcel, iU);
            } else {
                zN2 = w6.b.n(parcel, iU);
            }
        }
        w6.b.l(parcel, iE);
        return new C5775E(strG, iBinderV, zN, zN2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C5775E[i10];
    }
}
