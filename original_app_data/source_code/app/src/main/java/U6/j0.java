package U6;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class j0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iE = w6.b.E(parcel);
        ArrayList arrayList = new ArrayList();
        float fS = 0.0f;
        ArrayList arrayListK = null;
        int iW = 0;
        int iW2 = 0;
        boolean zN = false;
        boolean zN2 = false;
        boolean zN3 = false;
        int iW3 = 0;
        float fS2 = 0.0f;
        ArrayList arrayListK2 = null;
        while (parcel.dataPosition() < iE) {
            int iU = w6.b.u(parcel);
            switch (w6.b.m(iU)) {
                case 2:
                    arrayListK2 = w6.b.k(parcel, iU, LatLng.CREATOR);
                    break;
                case 3:
                    w6.b.y(parcel, iU, arrayList, j0.class.getClassLoader());
                    break;
                case 4:
                    fS = w6.b.s(parcel, iU);
                    break;
                case 5:
                    iW = w6.b.w(parcel, iU);
                    break;
                case 6:
                    iW2 = w6.b.w(parcel, iU);
                    break;
                case 7:
                    fS2 = w6.b.s(parcel, iU);
                    break;
                case 8:
                    zN = w6.b.n(parcel, iU);
                    break;
                case 9:
                    zN2 = w6.b.n(parcel, iU);
                    break;
                case 10:
                    zN3 = w6.b.n(parcel, iU);
                    break;
                case 11:
                    iW3 = w6.b.w(parcel, iU);
                    break;
                case 12:
                    arrayListK = w6.b.k(parcel, iU, C2292t.CREATOR);
                    break;
                default:
                    w6.b.D(parcel, iU);
                    break;
            }
        }
        w6.b.l(parcel, iE);
        return new C2296x(arrayListK2, arrayList, fS, iW, iW2, fS2, zN, zN2, zN3, iW3, arrayListK);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C2296x[i10];
    }
}
