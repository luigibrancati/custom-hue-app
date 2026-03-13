package S6;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLngBounds;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class n implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iE = w6.b.E(parcel);
        int iW = 0;
        int iW2 = 0;
        CameraPosition cameraPosition = null;
        Float fT = null;
        Float fT2 = null;
        LatLngBounds latLngBounds = null;
        Integer numX = null;
        String strG = null;
        byte bP = -1;
        byte bP2 = -1;
        byte bP3 = -1;
        byte bP4 = -1;
        byte bP5 = -1;
        byte bP6 = -1;
        byte bP7 = -1;
        byte bP8 = -1;
        byte bP9 = -1;
        byte bP10 = -1;
        byte bP11 = -1;
        byte bP12 = -1;
        while (parcel.dataPosition() < iE) {
            int iU = w6.b.u(parcel);
            switch (w6.b.m(iU)) {
                case 2:
                    bP = w6.b.p(parcel, iU);
                    break;
                case 3:
                    bP2 = w6.b.p(parcel, iU);
                    break;
                case 4:
                    iW = w6.b.w(parcel, iU);
                    break;
                case 5:
                    cameraPosition = (CameraPosition) w6.b.f(parcel, iU, CameraPosition.CREATOR);
                    break;
                case 6:
                    bP3 = w6.b.p(parcel, iU);
                    break;
                case 7:
                    bP4 = w6.b.p(parcel, iU);
                    break;
                case 8:
                    bP5 = w6.b.p(parcel, iU);
                    break;
                case 9:
                    bP6 = w6.b.p(parcel, iU);
                    break;
                case 10:
                    bP7 = w6.b.p(parcel, iU);
                    break;
                case 11:
                    bP8 = w6.b.p(parcel, iU);
                    break;
                case 12:
                    bP9 = w6.b.p(parcel, iU);
                    break;
                case 13:
                case 22:
                default:
                    w6.b.D(parcel, iU);
                    break;
                case 14:
                    bP10 = w6.b.p(parcel, iU);
                    break;
                case 15:
                    bP11 = w6.b.p(parcel, iU);
                    break;
                case 16:
                    fT = w6.b.t(parcel, iU);
                    break;
                case 17:
                    fT2 = w6.b.t(parcel, iU);
                    break;
                case 18:
                    latLngBounds = (LatLngBounds) w6.b.f(parcel, iU, LatLngBounds.CREATOR);
                    break;
                case 19:
                    bP12 = w6.b.p(parcel, iU);
                    break;
                case 20:
                    numX = w6.b.x(parcel, iU);
                    break;
                case 21:
                    strG = w6.b.g(parcel, iU);
                    break;
                case 23:
                    iW2 = w6.b.w(parcel, iU);
                    break;
            }
        }
        w6.b.l(parcel, iE);
        return new GoogleMapOptions(bP, bP2, iW, cameraPosition, bP3, bP4, bP5, bP6, bP7, bP8, bP9, bP10, bP11, fT, fT2, latLngBounds, bP12, numX, strG, iW2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new GoogleMapOptions[i10];
    }
}
