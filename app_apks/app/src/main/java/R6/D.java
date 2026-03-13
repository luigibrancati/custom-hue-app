package R6;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class D implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iE = w6.b.E(parcel);
        float fS = 0.0f;
        float fS2 = 0.0f;
        float fS3 = 0.0f;
        float fS4 = 0.0f;
        byte bP = 0;
        long jZ = 0;
        float[] fArrC = null;
        while (parcel.dataPosition() < iE) {
            int iU = w6.b.u(parcel);
            int iM = w6.b.m(iU);
            if (iM != 1) {
                switch (iM) {
                    case 4:
                        fS = w6.b.s(parcel, iU);
                        break;
                    case 5:
                        fS2 = w6.b.s(parcel, iU);
                        break;
                    case 6:
                        jZ = w6.b.z(parcel, iU);
                        break;
                    case 7:
                        bP = w6.b.p(parcel, iU);
                        break;
                    case 8:
                        fS3 = w6.b.s(parcel, iU);
                        break;
                    case 9:
                        fS4 = w6.b.s(parcel, iU);
                        break;
                    default:
                        w6.b.D(parcel, iU);
                        break;
                }
            } else {
                fArrC = w6.b.c(parcel, iU);
            }
        }
        w6.b.l(parcel, iE);
        return new C2066a(fArrC, fS, fS2, jZ, bP, fS3, fS4);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C2066a[i10];
    }
}
