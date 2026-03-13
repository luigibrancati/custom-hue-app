package U6;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class b0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iE = w6.b.E(parcel);
        boolean zN = false;
        boolean zN2 = false;
        float fS = 0.0f;
        float fS2 = 0.0f;
        float fS3 = 0.0f;
        float fS4 = 0.0f;
        float fS5 = 0.0f;
        float fS6 = 0.0f;
        float fS7 = 0.0f;
        IBinder iBinderV = null;
        LatLng latLng = null;
        LatLngBounds latLngBounds = null;
        while (parcel.dataPosition() < iE) {
            int iU = w6.b.u(parcel);
            switch (w6.b.m(iU)) {
                case 2:
                    iBinderV = w6.b.v(parcel, iU);
                    break;
                case 3:
                    latLng = (LatLng) w6.b.f(parcel, iU, LatLng.CREATOR);
                    break;
                case 4:
                    fS = w6.b.s(parcel, iU);
                    break;
                case 5:
                    fS2 = w6.b.s(parcel, iU);
                    break;
                case 6:
                    latLngBounds = (LatLngBounds) w6.b.f(parcel, iU, LatLngBounds.CREATOR);
                    break;
                case 7:
                    fS3 = w6.b.s(parcel, iU);
                    break;
                case 8:
                    fS4 = w6.b.s(parcel, iU);
                    break;
                case 9:
                    zN = w6.b.n(parcel, iU);
                    break;
                case 10:
                    fS5 = w6.b.s(parcel, iU);
                    break;
                case 11:
                    fS6 = w6.b.s(parcel, iU);
                    break;
                case 12:
                    fS7 = w6.b.s(parcel, iU);
                    break;
                case 13:
                    zN2 = w6.b.n(parcel, iU);
                    break;
                default:
                    w6.b.D(parcel, iU);
                    break;
            }
        }
        w6.b.l(parcel, iE);
        return new C2288o(iBinderV, latLng, fS, fS2, latLngBounds, fS3, fS4, zN, fS5, fS6, fS7, zN2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C2288o[i10];
    }
}
