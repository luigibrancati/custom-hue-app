package N6;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class Kb implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iE = w6.b.E(parcel);
        String strG = null;
        String strG2 = null;
        String strG3 = null;
        String strG4 = null;
        String strG5 = null;
        C1498tb c1498tb = null;
        C1498tb c1498tb2 = null;
        while (parcel.dataPosition() < iE) {
            int iU = w6.b.u(parcel);
            switch (w6.b.m(iU)) {
                case 1:
                    strG = w6.b.g(parcel, iU);
                    break;
                case 2:
                    strG2 = w6.b.g(parcel, iU);
                    break;
                case 3:
                    strG3 = w6.b.g(parcel, iU);
                    break;
                case 4:
                    strG4 = w6.b.g(parcel, iU);
                    break;
                case 5:
                    strG5 = w6.b.g(parcel, iU);
                    break;
                case 6:
                    c1498tb = (C1498tb) w6.b.f(parcel, iU, C1498tb.CREATOR);
                    break;
                case 7:
                    c1498tb2 = (C1498tb) w6.b.f(parcel, iU, C1498tb.CREATOR);
                    break;
                default:
                    w6.b.D(parcel, iU);
                    break;
            }
        }
        w6.b.l(parcel, iE);
        return new C1511ub(strG, strG2, strG3, strG4, strG5, c1498tb, c1498tb2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C1511ub[i10];
    }
}
