package K6;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class P implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iE = w6.b.E(parcel);
        int iW = -1;
        int iW2 = 0;
        short sB = 0;
        int iW3 = 0;
        long jZ = 0;
        float fS = 0.0f;
        double dQ = 0.0d;
        double dQ2 = 0.0d;
        String strG = null;
        while (parcel.dataPosition() < iE) {
            int iU = w6.b.u(parcel);
            switch (w6.b.m(iU)) {
                case 1:
                    strG = w6.b.g(parcel, iU);
                    break;
                case 2:
                    jZ = w6.b.z(parcel, iU);
                    break;
                case 3:
                    sB = w6.b.B(parcel, iU);
                    break;
                case 4:
                    dQ = w6.b.q(parcel, iU);
                    break;
                case 5:
                    dQ2 = w6.b.q(parcel, iU);
                    break;
                case 6:
                    fS = w6.b.s(parcel, iU);
                    break;
                case 7:
                    iW2 = w6.b.w(parcel, iU);
                    break;
                case 8:
                    iW3 = w6.b.w(parcel, iU);
                    break;
                case 9:
                    iW = w6.b.w(parcel, iU);
                    break;
                default:
                    w6.b.D(parcel, iU);
                    break;
            }
        }
        w6.b.l(parcel, iE);
        return new O(strG, iW2, sB, dQ, dQ2, fS, jZ, iW3, iW);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new O[i10];
    }
}
