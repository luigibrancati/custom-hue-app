package K6;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class J implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iE = w6.b.E(parcel);
        IBinder iBinderV = null;
        IBinder iBinderV2 = null;
        PendingIntent pendingIntent = null;
        String strG = null;
        int iW = 0;
        while (parcel.dataPosition() < iE) {
            int iU = w6.b.u(parcel);
            int iM = w6.b.m(iU);
            if (iM == 1) {
                iW = w6.b.w(parcel, iU);
            } else if (iM == 2) {
                iBinderV = w6.b.v(parcel, iU);
            } else if (iM == 3) {
                iBinderV2 = w6.b.v(parcel, iU);
            } else if (iM == 4) {
                pendingIntent = (PendingIntent) w6.b.f(parcel, iU, PendingIntent.CREATOR);
            } else if (iM != 6) {
                w6.b.D(parcel, iU);
            } else {
                strG = w6.b.g(parcel, iU);
            }
        }
        w6.b.l(parcel, iE);
        return new I(iW, iBinderV, iBinderV2, pendingIntent, strG);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new I[i10];
    }
}
