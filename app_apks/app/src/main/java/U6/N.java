package U6;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class N implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iE = w6.b.E(parcel);
        float fS = 0.0f;
        float fS2 = 0.0f;
        LatLng latLng = null;
        float fS3 = 0.0f;
        while (parcel.dataPosition() < iE) {
            int iU = w6.b.u(parcel);
            int iM = w6.b.m(iU);
            if (iM == 2) {
                latLng = (LatLng) w6.b.f(parcel, iU, LatLng.CREATOR);
            } else if (iM == 3) {
                fS = w6.b.s(parcel, iU);
            } else if (iM == 4) {
                fS3 = w6.b.s(parcel, iU);
            } else if (iM != 5) {
                w6.b.D(parcel, iU);
            } else {
                fS2 = w6.b.s(parcel, iU);
            }
        }
        w6.b.l(parcel, iE);
        return new CameraPosition(latLng, fS, fS3, fS2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new CameraPosition[i10];
    }
}
