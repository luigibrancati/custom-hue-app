package X6;

import android.os.Parcel;
import android.os.Parcelable;
import io.flutter.Build;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class d7 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iE = w6.b.E(parcel);
        boolean zN = false;
        int iW = 0;
        boolean zN2 = false;
        boolean zN3 = false;
        int iW2 = 0;
        int iW3 = 0;
        long jZ = 0;
        long jZ2 = 0;
        long jZ3 = 0;
        long jZ4 = 0;
        long jZ5 = 0;
        long jZ6 = 0;
        long jZ7 = 0;
        String strG = "";
        String strG2 = strG;
        String strG3 = strG2;
        String strG4 = strG3;
        String strG5 = null;
        String strG6 = null;
        String strG7 = null;
        String strG8 = null;
        String strG9 = null;
        String strG10 = null;
        Boolean boolO = null;
        ArrayList arrayListI = null;
        String strG11 = null;
        String strG12 = null;
        int iW4 = 100;
        boolean zN4 = true;
        boolean zN5 = true;
        long jZ8 = -2147483648L;
        while (parcel.dataPosition() < iE) {
            int iU = w6.b.u(parcel);
            switch (w6.b.m(iU)) {
                case 2:
                    strG5 = w6.b.g(parcel, iU);
                    break;
                case 3:
                    strG6 = w6.b.g(parcel, iU);
                    break;
                case 4:
                    strG7 = w6.b.g(parcel, iU);
                    break;
                case 5:
                    strG8 = w6.b.g(parcel, iU);
                    break;
                case 6:
                    jZ = w6.b.z(parcel, iU);
                    break;
                case 7:
                    jZ2 = w6.b.z(parcel, iU);
                    break;
                case 8:
                    strG9 = w6.b.g(parcel, iU);
                    break;
                case 9:
                    zN4 = w6.b.n(parcel, iU);
                    break;
                case 10:
                    zN = w6.b.n(parcel, iU);
                    break;
                case 11:
                    jZ8 = w6.b.z(parcel, iU);
                    break;
                case 12:
                    strG10 = w6.b.g(parcel, iU);
                    break;
                case 13:
                case 17:
                case 19:
                case 20:
                case 24:
                case 33:
                default:
                    w6.b.D(parcel, iU);
                    break;
                case 14:
                    jZ3 = w6.b.z(parcel, iU);
                    break;
                case 15:
                    iW = w6.b.w(parcel, iU);
                    break;
                case 16:
                    zN5 = w6.b.n(parcel, iU);
                    break;
                case 18:
                    zN2 = w6.b.n(parcel, iU);
                    break;
                case 21:
                    boolO = w6.b.o(parcel, iU);
                    break;
                case 22:
                    jZ4 = w6.b.z(parcel, iU);
                    break;
                case 23:
                    arrayListI = w6.b.i(parcel, iU);
                    break;
                case 25:
                    strG = w6.b.g(parcel, iU);
                    break;
                case 26:
                    strG2 = w6.b.g(parcel, iU);
                    break;
                case 27:
                    strG11 = w6.b.g(parcel, iU);
                    break;
                case 28:
                    zN3 = w6.b.n(parcel, iU);
                    break;
                case 29:
                    jZ5 = w6.b.z(parcel, iU);
                    break;
                case Build.API_LEVELS.API_30 /* 30 */:
                    iW4 = w6.b.w(parcel, iU);
                    break;
                case 31:
                    strG3 = w6.b.g(parcel, iU);
                    break;
                case 32:
                    iW2 = w6.b.w(parcel, iU);
                    break;
                case 34:
                    jZ6 = w6.b.z(parcel, iU);
                    break;
                case 35:
                    strG12 = w6.b.g(parcel, iU);
                    break;
                case 36:
                    strG4 = w6.b.g(parcel, iU);
                    break;
                case 37:
                    jZ7 = w6.b.z(parcel, iU);
                    break;
                case 38:
                    iW3 = w6.b.w(parcel, iU);
                    break;
            }
        }
        w6.b.l(parcel, iE);
        return new c7(strG5, strG6, strG7, strG8, jZ, jZ2, strG9, zN4, zN, jZ8, strG10, jZ3, iW, zN5, zN2, boolO, jZ4, arrayListI, strG, strG2, strG11, zN3, jZ5, iW4, strG3, iW2, jZ6, strG12, strG4, jZ7, iW3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new c7[i10];
    }
}
