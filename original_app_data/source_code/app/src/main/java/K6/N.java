package K6;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class N implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iE = w6.b.E(parcel);
        K k10 = null;
        IBinder iBinderV = null;
        IBinder iBinderV2 = null;
        PendingIntent pendingIntent = null;
        IBinder iBinderV3 = null;
        String strG = null;
        int iW = 1;
        while (parcel.dataPosition() < iE) {
            int iU = w6.b.u(parcel);
            switch (w6.b.m(iU)) {
                case 1:
                    iW = w6.b.w(parcel, iU);
                    break;
                case 2:
                    k10 = (K) w6.b.f(parcel, iU, K.CREATOR);
                    break;
                case 3:
                    iBinderV = w6.b.v(parcel, iU);
                    break;
                case 4:
                    pendingIntent = (PendingIntent) w6.b.f(parcel, iU, PendingIntent.CREATOR);
                    break;
                case 5:
                    iBinderV2 = w6.b.v(parcel, iU);
                    break;
                case 6:
                    iBinderV3 = w6.b.v(parcel, iU);
                    break;
                case 7:
                default:
                    w6.b.D(parcel, iU);
                    break;
                case 8:
                    strG = w6.b.g(parcel, iU);
                    break;
            }
        }
        w6.b.l(parcel, iE);
        return new M(iW, k10, iBinderV, iBinderV2, pendingIntent, iBinderV3, strG);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new M[i10];
    }
}
