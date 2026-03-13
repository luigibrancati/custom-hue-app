package U6;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class o0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iE = w6.b.E(parcel);
        E[] eArr = null;
        LatLng latLng = null;
        String strG = null;
        while (parcel.dataPosition() < iE) {
            int iU = w6.b.u(parcel);
            int iM = w6.b.m(iU);
            if (iM == 2) {
                eArr = (E[]) w6.b.j(parcel, iU, E.CREATOR);
            } else if (iM == 3) {
                latLng = (LatLng) w6.b.f(parcel, iU, LatLng.CREATOR);
            } else if (iM != 4) {
                w6.b.D(parcel, iU);
            } else {
                strG = w6.b.g(parcel, iU);
            }
        }
        w6.b.l(parcel, iE);
        return new F(eArr, latLng, strG);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new F[i10];
    }
}
