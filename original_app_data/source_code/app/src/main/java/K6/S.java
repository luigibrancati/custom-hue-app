package K6;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class S implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iE = w6.b.E(parcel);
        String strG = "";
        ArrayList arrayListI = null;
        PendingIntent pendingIntent = null;
        while (parcel.dataPosition() < iE) {
            int iU = w6.b.u(parcel);
            int iM = w6.b.m(iU);
            if (iM == 1) {
                arrayListI = w6.b.i(parcel, iU);
            } else if (iM == 2) {
                pendingIntent = (PendingIntent) w6.b.f(parcel, iU, PendingIntent.CREATOR);
            } else if (iM != 3) {
                w6.b.D(parcel, iU);
            } else {
                strG = w6.b.g(parcel, iU);
            }
        }
        w6.b.l(parcel, iE);
        return new Q(arrayListI, pendingIntent, strG);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new Q[i10];
    }
}
