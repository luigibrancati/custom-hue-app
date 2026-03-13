package N6;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class Db implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iE = w6.b.E(parcel);
        V6 v62 = null;
        String strG = null;
        String strG2 = null;
        C1533w7[] c1533w7Arr = null;
        T5[] t5Arr = null;
        String[] strArrH = null;
        C1426o3[] c1426o3Arr = null;
        while (parcel.dataPosition() < iE) {
            int iU = w6.b.u(parcel);
            switch (w6.b.m(iU)) {
                case 2:
                    v62 = (V6) w6.b.f(parcel, iU, V6.CREATOR);
                    break;
                case 3:
                    strG = w6.b.g(parcel, iU);
                    break;
                case 4:
                    strG2 = w6.b.g(parcel, iU);
                    break;
                case 5:
                    c1533w7Arr = (C1533w7[]) w6.b.j(parcel, iU, C1533w7.CREATOR);
                    break;
                case 6:
                    t5Arr = (T5[]) w6.b.j(parcel, iU, T5.CREATOR);
                    break;
                case 7:
                    strArrH = w6.b.h(parcel, iU);
                    break;
                case 8:
                    c1426o3Arr = (C1426o3[]) w6.b.j(parcel, iU, C1426o3.CREATOR);
                    break;
                default:
                    w6.b.D(parcel, iU);
                    break;
            }
        }
        w6.b.l(parcel, iE);
        return new R4(v62, strG, strG2, c1533w7Arr, t5Arr, strArrH, c1426o3Arr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new R4[i10];
    }
}
