package N6;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class Lb implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iE = w6.b.E(parcel);
        C1576zb c1576zb = null;
        String strG = null;
        String strG2 = null;
        Ab[] abArr = null;
        C1550xb[] c1550xbArr = null;
        String[] strArrH = null;
        C1485sb[] c1485sbArr = null;
        while (parcel.dataPosition() < iE) {
            int iU = w6.b.u(parcel);
            switch (w6.b.m(iU)) {
                case 1:
                    c1576zb = (C1576zb) w6.b.f(parcel, iU, C1576zb.CREATOR);
                    break;
                case 2:
                    strG = w6.b.g(parcel, iU);
                    break;
                case 3:
                    strG2 = w6.b.g(parcel, iU);
                    break;
                case 4:
                    abArr = (Ab[]) w6.b.j(parcel, iU, Ab.CREATOR);
                    break;
                case 5:
                    c1550xbArr = (C1550xb[]) w6.b.j(parcel, iU, C1550xb.CREATOR);
                    break;
                case 6:
                    strArrH = w6.b.h(parcel, iU);
                    break;
                case 7:
                    c1485sbArr = (C1485sb[]) w6.b.j(parcel, iU, C1485sb.CREATOR);
                    break;
                default:
                    w6.b.D(parcel, iU);
                    break;
            }
        }
        w6.b.l(parcel, iE);
        return new C1524vb(c1576zb, strG, strG2, abArr, c1550xbArr, strArrH, c1485sbArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C1524vb[i10];
    }
}
