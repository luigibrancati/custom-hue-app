package v6;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: v6.z, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C6070z implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iE = w6.b.E(parcel);
        int iW = -1;
        int iW2 = 0;
        int iW3 = 0;
        int iW4 = 0;
        int iW5 = 0;
        String strG = null;
        String strG2 = null;
        long jZ = 0;
        long jZ2 = 0;
        while (parcel.dataPosition() < iE) {
            int iU = w6.b.u(parcel);
            switch (w6.b.m(iU)) {
                case 1:
                    iW2 = w6.b.w(parcel, iU);
                    break;
                case 2:
                    iW3 = w6.b.w(parcel, iU);
                    break;
                case 3:
                    iW4 = w6.b.w(parcel, iU);
                    break;
                case 4:
                    jZ = w6.b.z(parcel, iU);
                    break;
                case 5:
                    jZ2 = w6.b.z(parcel, iU);
                    break;
                case 6:
                    strG = w6.b.g(parcel, iU);
                    break;
                case 7:
                    strG2 = w6.b.g(parcel, iU);
                    break;
                case 8:
                    iW5 = w6.b.w(parcel, iU);
                    break;
                case 9:
                    iW = w6.b.w(parcel, iU);
                    break;
                default:
                    w6.b.D(parcel, iU);
                    break;
            }
        }
        w6.b.l(parcel, iE);
        return new C6054i(iW2, iW3, iW4, jZ, jZ2, strG, strG2, iW5, iW);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C6054i[i10];
    }
}
