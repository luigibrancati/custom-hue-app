package y6;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class j implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iE = w6.b.E(parcel);
        PendingIntent pendingIntent = null;
        while (parcel.dataPosition() < iE) {
            int iU = w6.b.u(parcel);
            if (w6.b.m(iU) != 1) {
                w6.b.D(parcel, iU);
            } else {
                pendingIntent = (PendingIntent) w6.b.f(parcel, iU, PendingIntent.CREATOR);
            }
        }
        w6.b.l(parcel, iE);
        return new C6443e(pendingIntent);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C6443e[i10];
    }
}
