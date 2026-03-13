package v6;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import s6.C5783b;

/* JADX INFO: renamed from: v6.C, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C6045C implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iE = w6.b.E(parcel);
        int iW = 0;
        boolean zN = false;
        boolean zN2 = false;
        IBinder iBinderV = null;
        C5783b c5783b = null;
        while (parcel.dataPosition() < iE) {
            int iU = w6.b.u(parcel);
            int iM = w6.b.m(iU);
            if (iM == 1) {
                iW = w6.b.w(parcel, iU);
            } else if (iM == 2) {
                iBinderV = w6.b.v(parcel, iU);
            } else if (iM == 3) {
                c5783b = (C5783b) w6.b.f(parcel, iU, C5783b.CREATOR);
            } else if (iM == 4) {
                zN = w6.b.n(parcel, iU);
            } else if (iM != 5) {
                w6.b.D(parcel, iU);
            } else {
                zN2 = w6.b.n(parcel, iU);
            }
        }
        w6.b.l(parcel, iE);
        return new com.google.android.gms.common.internal.f(iW, iBinderV, c5783b, zN, zN2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new com.google.android.gms.common.internal.f[i10];
    }
}
