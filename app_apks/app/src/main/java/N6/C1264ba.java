package N6;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: N6.ba, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C1264ba implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iE = w6.b.E(parcel);
        double dQ = 0.0d;
        int iW = 0;
        int iW2 = 0;
        boolean zN = false;
        String strG = null;
        String strG2 = null;
        Point[] pointArr = null;
        T5 t52 = null;
        C1533w7 c1533w7 = null;
        X7 x72 = null;
        Z8 z82 = null;
        C1560y8 c1560y8 = null;
        C1506u6 c1506u6 = null;
        C1453q4 c1453q4 = null;
        R4 r42 = null;
        C1479s5 c1479s5 = null;
        byte[] bArrB = null;
        while (parcel.dataPosition() < iE) {
            int iU = w6.b.u(parcel);
            switch (w6.b.m(iU)) {
                case 2:
                    iW = w6.b.w(parcel, iU);
                    break;
                case 3:
                    strG = w6.b.g(parcel, iU);
                    break;
                case 4:
                    strG2 = w6.b.g(parcel, iU);
                    break;
                case 5:
                    iW2 = w6.b.w(parcel, iU);
                    break;
                case 6:
                    pointArr = (Point[]) w6.b.j(parcel, iU, Point.CREATOR);
                    break;
                case 7:
                    t52 = (T5) w6.b.f(parcel, iU, T5.CREATOR);
                    break;
                case 8:
                    c1533w7 = (C1533w7) w6.b.f(parcel, iU, C1533w7.CREATOR);
                    break;
                case 9:
                    x72 = (X7) w6.b.f(parcel, iU, X7.CREATOR);
                    break;
                case 10:
                    z82 = (Z8) w6.b.f(parcel, iU, Z8.CREATOR);
                    break;
                case 11:
                    c1560y8 = (C1560y8) w6.b.f(parcel, iU, C1560y8.CREATOR);
                    break;
                case 12:
                    c1506u6 = (C1506u6) w6.b.f(parcel, iU, C1506u6.CREATOR);
                    break;
                case 13:
                    c1453q4 = (C1453q4) w6.b.f(parcel, iU, C1453q4.CREATOR);
                    break;
                case 14:
                    r42 = (R4) w6.b.f(parcel, iU, R4.CREATOR);
                    break;
                case 15:
                    c1479s5 = (C1479s5) w6.b.f(parcel, iU, C1479s5.CREATOR);
                    break;
                case 16:
                    bArrB = w6.b.b(parcel, iU);
                    break;
                case 17:
                    zN = w6.b.n(parcel, iU);
                    break;
                case 18:
                    dQ = w6.b.q(parcel, iU);
                    break;
                default:
                    w6.b.D(parcel, iU);
                    break;
            }
        }
        w6.b.l(parcel, iE);
        return new A9(iW, strG, strG2, iW2, pointArr, t52, c1533w7, x72, z82, c1560y8, c1506u6, c1453q4, r42, c1479s5, bArrB, zN, dQ);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new A9[i10];
    }
}
