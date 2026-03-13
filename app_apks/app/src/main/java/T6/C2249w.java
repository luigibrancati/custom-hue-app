package T6;

import L6.AbstractC1164a;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;

/* JADX INFO: renamed from: T6.w, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C2249w extends AbstractC1164a implements InterfaceC2228a {
    public C2249w(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
    }

    @Override // T6.InterfaceC2228a
    public final IObjectWrapper T5() {
        Parcel parcelD = D(2, K());
        IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcelD.readStrongBinder());
        parcelD.recycle();
        return iObjectWrapperAsInterface;
    }

    @Override // T6.InterfaceC2228a
    public final IObjectWrapper g5(float f10, int i10, int i11) {
        Parcel parcelK = K();
        parcelK.writeFloat(f10);
        parcelK.writeInt(i10);
        parcelK.writeInt(i11);
        Parcel parcelD = D(6, parcelK);
        IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcelD.readStrongBinder());
        parcelD.recycle();
        return iObjectWrapperAsInterface;
    }

    @Override // T6.InterfaceC2228a
    public final IObjectWrapper j3(float f10) {
        Parcel parcelK = K();
        parcelK.writeFloat(f10);
        Parcel parcelD = D(4, parcelK);
        IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcelD.readStrongBinder());
        parcelD.recycle();
        return iObjectWrapperAsInterface;
    }

    @Override // T6.InterfaceC2228a
    public final IObjectWrapper m0(LatLngBounds latLngBounds, int i10) {
        Parcel parcelK = K();
        L6.s.c(parcelK, latLngBounds);
        parcelK.writeInt(i10);
        Parcel parcelD = D(10, parcelK);
        IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcelD.readStrongBinder());
        parcelD.recycle();
        return iObjectWrapperAsInterface;
    }

    @Override // T6.InterfaceC2228a
    public final IObjectWrapper s0(float f10) {
        Parcel parcelK = K();
        parcelK.writeFloat(f10);
        Parcel parcelD = D(5, parcelK);
        IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcelD.readStrongBinder());
        parcelD.recycle();
        return iObjectWrapperAsInterface;
    }

    @Override // T6.InterfaceC2228a
    public final IObjectWrapper u2(CameraPosition cameraPosition) {
        Parcel parcelK = K();
        L6.s.c(parcelK, cameraPosition);
        Parcel parcelD = D(7, parcelK);
        IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcelD.readStrongBinder());
        parcelD.recycle();
        return iObjectWrapperAsInterface;
    }

    @Override // T6.InterfaceC2228a
    public final IObjectWrapper w3(LatLng latLng, float f10) {
        Parcel parcelK = K();
        L6.s.c(parcelK, latLng);
        parcelK.writeFloat(f10);
        Parcel parcelD = D(9, parcelK);
        IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcelD.readStrongBinder());
        parcelD.recycle();
        return iObjectWrapperAsInterface;
    }

    @Override // T6.InterfaceC2228a
    public final IObjectWrapper w4(LatLng latLng) {
        Parcel parcelK = K();
        L6.s.c(parcelK, latLng);
        Parcel parcelD = D(8, parcelK);
        IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcelD.readStrongBinder());
        parcelD.recycle();
        return iObjectWrapperAsInterface;
    }

    @Override // T6.InterfaceC2228a
    public final IObjectWrapper x3(float f10, float f11) {
        Parcel parcelK = K();
        parcelK.writeFloat(f10);
        parcelK.writeFloat(f11);
        Parcel parcelD = D(3, parcelK);
        IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcelD.readStrongBinder());
        parcelD.recycle();
        return iObjectWrapperAsInterface;
    }

    @Override // T6.InterfaceC2228a
    public final IObjectWrapper z1() {
        Parcel parcelD = D(1, K());
        IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcelD.readStrongBinder());
        parcelD.recycle();
        return iObjectWrapperAsInterface;
    }
}
