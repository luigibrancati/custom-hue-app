package U6;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class f0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iE = w6.b.E(parcel);
        LatLng latLng = null;
        String strG = null;
        String strG2 = null;
        IBinder iBinderV = null;
        IBinder iBinderV2 = null;
        String strG3 = null;
        boolean zN = false;
        boolean zN2 = false;
        boolean zN3 = false;
        int iW = 0;
        int iW2 = 0;
        float fS = 0.0f;
        float fS2 = 0.0f;
        float fS3 = 0.0f;
        float fS4 = 0.0f;
        float fS5 = 0.0f;
        float fS6 = 1.0f;
        float fS7 = 0.5f;
        while (parcel.dataPosition() < iE) {
            int iU = w6.b.u(parcel);
            switch (w6.b.m(iU)) {
                case 2:
                    latLng = (LatLng) w6.b.f(parcel, iU, LatLng.CREATOR);
                    break;
                case 3:
                    strG = w6.b.g(parcel, iU);
                    break;
                case 4:
                    strG2 = w6.b.g(parcel, iU);
                    break;
                case 5:
                    iBinderV = w6.b.v(parcel, iU);
                    break;
                case 6:
                    fS = w6.b.s(parcel, iU);
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
                    fS3 = w6.b.s(parcel, iU);
                    break;
                case 12:
                    fS7 = w6.b.s(parcel, iU);
                    break;
                case 13:
                    fS4 = w6.b.s(parcel, iU);
                    break;
                case 14:
                    fS6 = w6.b.s(parcel, iU);
                    break;
                case 15:
                    fS5 = w6.b.s(parcel, iU);
                    break;
                case 16:
                default:
                    w6.b.D(parcel, iU);
                    break;
                case 17:
                    iW = w6.b.w(parcel, iU);
                    break;
                case 18:
                    iBinderV2 = w6.b.v(parcel, iU);
                    break;
                case 19:
                    iW2 = w6.b.w(parcel, iU);
                    break;
                case 20:
                    strG3 = w6.b.g(parcel, iU);
                    break;
            }
        }
        w6.b.l(parcel, iE);
        return new C2291s(latLng, strG, strG2, iBinderV, fS, fS2, zN, zN2, zN3, fS3, fS7, fS4, fS6, fS5, iW, iBinderV2, iW2, strG3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C2291s[i10];
    }
}
