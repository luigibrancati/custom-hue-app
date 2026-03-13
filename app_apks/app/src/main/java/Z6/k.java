package Z6;

import android.os.Parcel;
import android.os.Parcelable;
import s6.C5783b;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class k implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iE = w6.b.E(parcel);
        C5783b c5783b = null;
        int iW = 0;
        com.google.android.gms.common.internal.f fVar = null;
        while (parcel.dataPosition() < iE) {
            int iU = w6.b.u(parcel);
            int iM = w6.b.m(iU);
            if (iM == 1) {
                iW = w6.b.w(parcel, iU);
            } else if (iM == 2) {
                c5783b = (C5783b) w6.b.f(parcel, iU, C5783b.CREATOR);
            } else if (iM != 3) {
                w6.b.D(parcel, iU);
            } else {
                fVar = (com.google.android.gms.common.internal.f) w6.b.f(parcel, iU, com.google.android.gms.common.internal.f.CREATOR);
            }
        }
        w6.b.l(parcel, iE);
        return new j(iW, c5783b, fVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new j[i10];
    }
}
