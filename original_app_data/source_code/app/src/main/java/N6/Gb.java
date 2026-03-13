package N6;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class Gb implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iE = w6.b.E(parcel);
        String strG = null;
        String strG2 = null;
        byte[] bArrB = null;
        Point[] pointArr = null;
        C1550xb c1550xb = null;
        Ab ab2 = null;
        Bb bb2 = null;
        Eb eb2 = null;
        Cb cb2 = null;
        C1563yb c1563yb = null;
        C1511ub c1511ub = null;
        C1524vb c1524vb = null;
        C1537wb c1537wb = null;
        int iW = 0;
        int iW2 = 0;
        while (parcel.dataPosition() < iE) {
            int iU = w6.b.u(parcel);
            switch (w6.b.m(iU)) {
                case 1:
                    iW = w6.b.w(parcel, iU);
                    break;
                case 2:
                    strG = w6.b.g(parcel, iU);
                    break;
                case 3:
                    strG2 = w6.b.g(parcel, iU);
                    break;
                case 4:
                    bArrB = w6.b.b(parcel, iU);
                    break;
                case 5:
                    pointArr = (Point[]) w6.b.j(parcel, iU, Point.CREATOR);
                    break;
                case 6:
                    iW2 = w6.b.w(parcel, iU);
                    break;
                case 7:
                    c1550xb = (C1550xb) w6.b.f(parcel, iU, C1550xb.CREATOR);
                    break;
                case 8:
                    ab2 = (Ab) w6.b.f(parcel, iU, Ab.CREATOR);
                    break;
                case 9:
                    bb2 = (Bb) w6.b.f(parcel, iU, Bb.CREATOR);
                    break;
                case 10:
                    eb2 = (Eb) w6.b.f(parcel, iU, Eb.CREATOR);
                    break;
                case 11:
                    cb2 = (Cb) w6.b.f(parcel, iU, Cb.CREATOR);
                    break;
                case 12:
                    c1563yb = (C1563yb) w6.b.f(parcel, iU, C1563yb.CREATOR);
                    break;
                case 13:
                    c1511ub = (C1511ub) w6.b.f(parcel, iU, C1511ub.CREATOR);
                    break;
                case 14:
                    c1524vb = (C1524vb) w6.b.f(parcel, iU, C1524vb.CREATOR);
                    break;
                case 15:
                    c1537wb = (C1537wb) w6.b.f(parcel, iU, C1537wb.CREATOR);
                    break;
                default:
                    w6.b.D(parcel, iU);
                    break;
            }
        }
        w6.b.l(parcel, iE);
        return new Fb(iW, strG, strG2, bArrB, pointArr, iW2, c1550xb, ab2, bb2, eb2, cb2, c1563yb, c1511ub, c1524vb, c1537wb);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new Fb[i10];
    }
}
