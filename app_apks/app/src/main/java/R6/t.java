package R6;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import com.google.android.gms.location.LocationRequest;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class t implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iE = w6.b.E(parcel);
        WorkSource workSource = new WorkSource();
        K6.H h10 = null;
        boolean zN = false;
        int iW = 0;
        int iW2 = 0;
        boolean zN2 = false;
        long jZ = -1;
        float fS = 0.0f;
        int iW3 = Integer.MAX_VALUE;
        long jZ2 = Long.MAX_VALUE;
        long jZ3 = Long.MAX_VALUE;
        long jZ4 = 0;
        long jZ5 = 600000;
        long jZ6 = 3600000;
        int iW4 = 102;
        while (parcel.dataPosition() < iE) {
            int iU = w6.b.u(parcel);
            switch (w6.b.m(iU)) {
                case 1:
                    iW4 = w6.b.w(parcel, iU);
                    break;
                case 2:
                    jZ6 = w6.b.z(parcel, iU);
                    break;
                case 3:
                    jZ5 = w6.b.z(parcel, iU);
                    break;
                case 4:
                case 14:
                default:
                    w6.b.D(parcel, iU);
                    break;
                case 5:
                    jZ2 = w6.b.z(parcel, iU);
                    break;
                case 6:
                    iW3 = w6.b.w(parcel, iU);
                    break;
                case 7:
                    fS = w6.b.s(parcel, iU);
                    break;
                case 8:
                    jZ4 = w6.b.z(parcel, iU);
                    break;
                case 9:
                    zN = w6.b.n(parcel, iU);
                    break;
                case 10:
                    jZ3 = w6.b.z(parcel, iU);
                    break;
                case 11:
                    jZ = w6.b.z(parcel, iU);
                    break;
                case 12:
                    iW = w6.b.w(parcel, iU);
                    break;
                case 13:
                    iW2 = w6.b.w(parcel, iU);
                    break;
                case 15:
                    zN2 = w6.b.n(parcel, iU);
                    break;
                case 16:
                    workSource = (WorkSource) w6.b.f(parcel, iU, WorkSource.CREATOR);
                    break;
                case 17:
                    h10 = (K6.H) w6.b.f(parcel, iU, K6.H.CREATOR);
                    break;
            }
        }
        w6.b.l(parcel, iE);
        return new LocationRequest(iW4, jZ6, jZ5, jZ4, jZ2, jZ3, iW3, fS, zN, jZ, iW, iW2, zN2, workSource, h10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new LocationRequest[i10];
    }
}
