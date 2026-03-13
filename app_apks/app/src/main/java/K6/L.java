package K6;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.LocationRequest;
import java.util.ArrayList;
import v6.C6047b;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class L implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iE = w6.b.E(parcel);
        long jZ = Long.MAX_VALUE;
        LocationRequest locationRequest = null;
        ArrayList arrayListK = null;
        String strG = null;
        boolean zN = false;
        boolean zN2 = false;
        boolean zN3 = false;
        boolean zN4 = false;
        while (parcel.dataPosition() < iE) {
            int iU = w6.b.u(parcel);
            int iM = w6.b.m(iU);
            if (iM == 1) {
                locationRequest = (LocationRequest) w6.b.f(parcel, iU, LocationRequest.CREATOR);
            } else if (iM == 5) {
                arrayListK = w6.b.k(parcel, iU, C6047b.CREATOR);
            } else if (iM == 8) {
                zN = w6.b.n(parcel, iU);
            } else if (iM != 9) {
                switch (iM) {
                    case 11:
                        zN3 = w6.b.n(parcel, iU);
                        break;
                    case 12:
                        zN4 = w6.b.n(parcel, iU);
                        break;
                    case 13:
                        strG = w6.b.g(parcel, iU);
                        break;
                    case 14:
                        jZ = w6.b.z(parcel, iU);
                        break;
                    default:
                        w6.b.D(parcel, iU);
                        break;
                }
            } else {
                zN2 = w6.b.n(parcel, iU);
            }
        }
        w6.b.l(parcel, iE);
        return new K(locationRequest, arrayListK, zN, zN2, zN3, zN4, strG, jZ);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new K[i10];
    }
}
