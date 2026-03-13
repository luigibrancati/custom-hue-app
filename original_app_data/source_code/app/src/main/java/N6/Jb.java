package N6;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class Jb implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iE = w6.b.E(parcel);
        String strG = null;
        int iW = 0;
        int iW2 = 0;
        int iW3 = 0;
        int iW4 = 0;
        int iW5 = 0;
        int iW6 = 0;
        boolean zN = false;
        while (parcel.dataPosition() < iE) {
            int iU = w6.b.u(parcel);
            switch (w6.b.m(iU)) {
                case 1:
                    iW = w6.b.w(parcel, iU);
                    break;
                case 2:
                    iW2 = w6.b.w(parcel, iU);
                    break;
                case 3:
                    iW3 = w6.b.w(parcel, iU);
                    break;
                case 4:
                    iW4 = w6.b.w(parcel, iU);
                    break;
                case 5:
                    iW5 = w6.b.w(parcel, iU);
                    break;
                case 6:
                    iW6 = w6.b.w(parcel, iU);
                    break;
                case 7:
                    zN = w6.b.n(parcel, iU);
                    break;
                case 8:
                    strG = w6.b.g(parcel, iU);
                    break;
                default:
                    w6.b.D(parcel, iU);
                    break;
            }
        }
        w6.b.l(parcel, iE);
        return new C1498tb(iW, iW2, iW3, iW4, iW5, iW6, zN, strG);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C1498tb[i10];
    }
}
