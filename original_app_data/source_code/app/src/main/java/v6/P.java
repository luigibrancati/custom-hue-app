package v6;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class P implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iE = w6.b.E(parcel);
        C6058m c6058m = null;
        int[] iArrD = null;
        int[] iArrD2 = null;
        boolean zN = false;
        boolean zN2 = false;
        int iW = 0;
        while (parcel.dataPosition() < iE) {
            int iU = w6.b.u(parcel);
            switch (w6.b.m(iU)) {
                case 1:
                    c6058m = (C6058m) w6.b.f(parcel, iU, C6058m.CREATOR);
                    break;
                case 2:
                    zN = w6.b.n(parcel, iU);
                    break;
                case 3:
                    zN2 = w6.b.n(parcel, iU);
                    break;
                case 4:
                    iArrD = w6.b.d(parcel, iU);
                    break;
                case 5:
                    iW = w6.b.w(parcel, iU);
                    break;
                case 6:
                    iArrD2 = w6.b.d(parcel, iU);
                    break;
                default:
                    w6.b.D(parcel, iU);
                    break;
            }
        }
        w6.b.l(parcel, iE);
        return new C6049d(c6058m, zN, zN2, iArrD, iW, iArrD2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C6049d[i10];
    }
}
