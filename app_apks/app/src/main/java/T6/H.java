package T6;

import L6.AbstractC1164a;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.maps.model.LatLng;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class H extends AbstractC1164a implements InterfaceC2232e {
    public H(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.IProjectionDelegate");
    }

    @Override // T6.InterfaceC2232e
    public final LatLng b3(IObjectWrapper iObjectWrapper) {
        Parcel parcelK = K();
        L6.s.e(parcelK, iObjectWrapper);
        Parcel parcelD = D(1, parcelK);
        LatLng latLng = (LatLng) L6.s.a(parcelD, LatLng.CREATOR);
        parcelD.recycle();
        return latLng;
    }

    @Override // T6.InterfaceC2232e
    public final U6.M getVisibleRegion() {
        Parcel parcelD = D(3, K());
        U6.M m10 = (U6.M) L6.s.a(parcelD, U6.M.CREATOR);
        parcelD.recycle();
        return m10;
    }

    @Override // T6.InterfaceC2232e
    public final IObjectWrapper m1(LatLng latLng) {
        Parcel parcelK = K();
        L6.s.c(parcelK, latLng);
        Parcel parcelD = D(2, parcelK);
        IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcelD.readStrongBinder());
        parcelD.recycle();
        return iObjectWrapperAsInterface;
    }
}
