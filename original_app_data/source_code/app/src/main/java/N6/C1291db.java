package N6;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: N6.db, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C1291db implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iE = w6.b.E(parcel);
        String strG = null;
        String strG2 = null;
        String strG3 = null;
        String strG4 = null;
        String strG5 = null;
        P3 p32 = null;
        P3 p33 = null;
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
                    strG3 = w6.b.g(parcel, iU);
                    break;
                case 5:
                    strG4 = w6.b.g(parcel, iU);
                    break;
                case 6:
                    strG5 = w6.b.g(parcel, iU);
                    break;
                case 7:
                    p32 = (P3) w6.b.f(parcel, iU, P3.CREATOR);
                    break;
                case 8:
                    p33 = (P3) w6.b.f(parcel, iU, P3.CREATOR);
                    break;
                default:
                    w6.b.D(parcel, iU);
                    break;
            }
        }
        w6.b.l(parcel, iE);
        return new C1453q4(strG, strG2, strG3, strG4, strG5, p32, p33);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C1453q4[i10];
    }
}
