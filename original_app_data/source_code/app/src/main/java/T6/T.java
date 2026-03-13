package T6;

import L6.AbstractC1164a;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class T extends AbstractC1164a implements InterfaceC2231d {
    public T(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.IMapViewDelegate");
    }

    @Override // T6.InterfaceC2231d
    public final void A() {
        X(5, K());
    }

    @Override // T6.InterfaceC2231d
    public final void J(Bundle bundle) {
        Parcel parcelK = K();
        L6.s.c(parcelK, bundle);
        X(2, parcelK);
    }

    @Override // T6.InterfaceC2231d
    public final void S() {
        X(4, K());
    }

    @Override // T6.InterfaceC2231d
    public final void Y() {
        X(13, K());
    }

    @Override // T6.InterfaceC2231d
    public final IObjectWrapper getView() {
        Parcel parcelD = D(8, K());
        IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcelD.readStrongBinder());
        parcelD.recycle();
        return iObjectWrapperAsInterface;
    }

    @Override // T6.InterfaceC2231d
    public final void h6(InterfaceC2245s interfaceC2245s) {
        Parcel parcelK = K();
        L6.s.e(parcelK, interfaceC2245s);
        X(9, parcelK);
    }

    @Override // T6.InterfaceC2231d
    public final void onResume() {
        X(3, K());
    }

    @Override // T6.InterfaceC2231d
    public final void onSaveInstanceState(Bundle bundle) {
        Parcel parcelK = K();
        L6.s.c(parcelK, bundle);
        Parcel parcelD = D(7, parcelK);
        if (parcelD.readInt() != 0) {
            bundle.readFromParcel(parcelD);
        }
        parcelD.recycle();
    }

    @Override // T6.InterfaceC2231d
    public final void v() {
        X(12, K());
    }
}
