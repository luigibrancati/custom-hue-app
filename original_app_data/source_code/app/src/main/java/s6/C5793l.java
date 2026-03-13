package s6;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: s6.l, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C5793l implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iE = w6.b.E(parcel);
        PendingIntent pendingIntent = null;
        String strG = null;
        Integer numX = null;
        int iW = 0;
        int iW2 = 0;
        while (parcel.dataPosition() < iE) {
            int iU = w6.b.u(parcel);
            int iM = w6.b.m(iU);
            if (iM == 1) {
                iW = w6.b.w(parcel, iU);
            } else if (iM == 2) {
                iW2 = w6.b.w(parcel, iU);
            } else if (iM == 3) {
                pendingIntent = (PendingIntent) w6.b.f(parcel, iU, PendingIntent.CREATOR);
            } else if (iM == 4) {
                strG = w6.b.g(parcel, iU);
            } else if (iM != 5) {
                w6.b.D(parcel, iU);
            } else {
                numX = w6.b.x(parcel, iU);
            }
        }
        w6.b.l(parcel, iE);
        return new C5783b(iW, iW2, pendingIntent, strG, numX);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C5783b[i10];
    }
}
