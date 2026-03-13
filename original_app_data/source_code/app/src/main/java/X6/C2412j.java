package X6;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: X6.j, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C2412j implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iE = w6.b.E(parcel);
        String strG = null;
        String strG2 = null;
        W6 w62 = null;
        String strG3 = null;
        I i10 = null;
        I i11 = null;
        I i12 = null;
        long jZ = 0;
        long jZ2 = 0;
        long jZ3 = 0;
        boolean zN = false;
        while (parcel.dataPosition() < iE) {
            int iU = w6.b.u(parcel);
            switch (w6.b.m(iU)) {
                case 2:
                    strG = w6.b.g(parcel, iU);
                    break;
                case 3:
                    strG2 = w6.b.g(parcel, iU);
                    break;
                case 4:
                    w62 = (W6) w6.b.f(parcel, iU, W6.CREATOR);
                    break;
                case 5:
                    jZ = w6.b.z(parcel, iU);
                    break;
                case 6:
                    zN = w6.b.n(parcel, iU);
                    break;
                case 7:
                    strG3 = w6.b.g(parcel, iU);
                    break;
                case 8:
                    i10 = (I) w6.b.f(parcel, iU, I.CREATOR);
                    break;
                case 9:
                    jZ2 = w6.b.z(parcel, iU);
                    break;
                case 10:
                    i11 = (I) w6.b.f(parcel, iU, I.CREATOR);
                    break;
                case 11:
                    jZ3 = w6.b.z(parcel, iU);
                    break;
                case 12:
                    i12 = (I) w6.b.f(parcel, iU, I.CREATOR);
                    break;
                default:
                    w6.b.D(parcel, iU);
                    break;
            }
        }
        w6.b.l(parcel, iE);
        return new C2404i(strG, strG2, w62, jZ, zN, strG3, i10, jZ2, i11, jZ3, i12);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C2404i[i10];
    }
}
