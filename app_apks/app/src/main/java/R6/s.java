package R6;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.LocationAvailability;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class s implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iE = w6.b.E(parcel);
        boolean zN = false;
        z[] zVarArr = null;
        long jZ = 0;
        int iW = 1;
        int iW2 = 1;
        int iW3 = 1000;
        while (parcel.dataPosition() < iE) {
            int iU = w6.b.u(parcel);
            switch (w6.b.m(iU)) {
                case 1:
                    iW = w6.b.w(parcel, iU);
                    break;
                case 2:
                    iW2 = w6.b.w(parcel, iU);
                    break;
                case 3:
                    jZ = w6.b.z(parcel, iU);
                    break;
                case 4:
                    iW3 = w6.b.w(parcel, iU);
                    break;
                case 5:
                    zVarArr = (z[]) w6.b.j(parcel, iU, z.CREATOR);
                    break;
                case 6:
                    zN = w6.b.n(parcel, iU);
                    break;
                default:
                    w6.b.D(parcel, iU);
                    break;
            }
        }
        w6.b.l(parcel, iE);
        return new LocationAvailability(iW3, iW, iW2, jZ, zVarArr, zN);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new LocationAvailability[i10];
    }
}
