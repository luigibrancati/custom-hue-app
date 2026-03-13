package U6;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class W implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iE = w6.b.E(parcel);
        LatLng latLng = null;
        LatLng latLng2 = null;
        LatLng latLng3 = null;
        LatLng latLng4 = null;
        LatLngBounds latLngBounds = null;
        while (parcel.dataPosition() < iE) {
            int iU = w6.b.u(parcel);
            int iM = w6.b.m(iU);
            if (iM == 2) {
                latLng = (LatLng) w6.b.f(parcel, iU, LatLng.CREATOR);
            } else if (iM == 3) {
                latLng2 = (LatLng) w6.b.f(parcel, iU, LatLng.CREATOR);
            } else if (iM == 4) {
                latLng3 = (LatLng) w6.b.f(parcel, iU, LatLng.CREATOR);
            } else if (iM == 5) {
                latLng4 = (LatLng) w6.b.f(parcel, iU, LatLng.CREATOR);
            } else if (iM != 6) {
                w6.b.D(parcel, iU);
            } else {
                latLngBounds = (LatLngBounds) w6.b.f(parcel, iU, LatLngBounds.CREATOR);
            }
        }
        w6.b.l(parcel, iE);
        return new M(latLng, latLng2, latLng3, latLng4, latLngBounds);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new M[i10];
    }
}
