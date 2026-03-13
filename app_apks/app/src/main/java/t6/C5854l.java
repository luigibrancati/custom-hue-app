package t6;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import s6.C5783b;

/* JADX INFO: renamed from: t6.l, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C5854l implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iE = w6.b.E(parcel);
        String strG = null;
        C5783b c5783b = null;
        int iW = 0;
        PendingIntent pendingIntent = null;
        while (parcel.dataPosition() < iE) {
            int iU = w6.b.u(parcel);
            int iM = w6.b.m(iU);
            if (iM == 1) {
                iW = w6.b.w(parcel, iU);
            } else if (iM == 2) {
                strG = w6.b.g(parcel, iU);
            } else if (iM == 3) {
                pendingIntent = (PendingIntent) w6.b.f(parcel, iU, PendingIntent.CREATOR);
            } else if (iM != 4) {
                w6.b.D(parcel, iU);
            } else {
                c5783b = (C5783b) w6.b.f(parcel, iU, C5783b.CREATOR);
            }
        }
        w6.b.l(parcel, iE);
        return new Status(iW, strG, pendingIntent, c5783b);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new Status[i10];
    }
}
