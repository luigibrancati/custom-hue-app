package U6;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class k0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iE = w6.b.E(parcel);
        ArrayList arrayListK = null;
        C2279f c2279f = null;
        C2279f c2279f2 = null;
        ArrayList arrayListK2 = null;
        ArrayList arrayListK3 = null;
        int iW = 0;
        boolean zN = false;
        boolean zN2 = false;
        boolean zN3 = false;
        int iW2 = 0;
        float fS = 0.0f;
        float fS2 = 0.0f;
        while (parcel.dataPosition() < iE) {
            int iU = w6.b.u(parcel);
            switch (w6.b.m(iU)) {
                case 2:
                    arrayListK = w6.b.k(parcel, iU, LatLng.CREATOR);
                    break;
                case 3:
                    fS = w6.b.s(parcel, iU);
                    break;
                case 4:
                    iW = w6.b.w(parcel, iU);
                    break;
                case 5:
                    fS2 = w6.b.s(parcel, iU);
                    break;
                case 6:
                    zN = w6.b.n(parcel, iU);
                    break;
                case 7:
                    zN2 = w6.b.n(parcel, iU);
                    break;
                case 8:
                    zN3 = w6.b.n(parcel, iU);
                    break;
                case 9:
                    c2279f = (C2279f) w6.b.f(parcel, iU, C2279f.CREATOR);
                    break;
                case 10:
                    c2279f2 = (C2279f) w6.b.f(parcel, iU, C2279f.CREATOR);
                    break;
                case 11:
                    iW2 = w6.b.w(parcel, iU);
                    break;
                case 12:
                    arrayListK2 = w6.b.k(parcel, iU, C2292t.CREATOR);
                    break;
                case 13:
                    arrayListK3 = w6.b.k(parcel, iU, H.CREATOR);
                    break;
                default:
                    w6.b.D(parcel, iU);
                    break;
            }
        }
        w6.b.l(parcel, iE);
        return new C2298z(arrayListK, fS, iW, fS2, zN, zN2, zN3, c2279f, c2279f2, iW2, arrayListK2, arrayListK3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C2298z[i10];
    }
}
