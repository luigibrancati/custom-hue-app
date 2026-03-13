package T6;

import L6.AbstractC1164a;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.maps.zzj;
import com.google.android.gms.maps.GoogleMapOptions;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class O extends AbstractC1164a implements P {
    public O(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.ICreator");
    }

    @Override // T6.P
    public final void B6(IObjectWrapper iObjectWrapper, String str) {
        Parcel parcelK = K();
        L6.s.e(parcelK, iObjectWrapper);
        parcelK.writeString(str);
        X(12, parcelK);
    }

    @Override // T6.P
    public final InterfaceC2231d K5(IObjectWrapper iObjectWrapper, GoogleMapOptions googleMapOptions) {
        InterfaceC2231d t10;
        Parcel parcelK = K();
        L6.s.e(parcelK, iObjectWrapper);
        L6.s.c(parcelK, googleMapOptions);
        Parcel parcelD = D(3, parcelK);
        IBinder strongBinder = parcelD.readStrongBinder();
        if (strongBinder == null) {
            t10 = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IMapViewDelegate");
            t10 = iInterfaceQueryLocalInterface instanceof InterfaceC2231d ? (InterfaceC2231d) iInterfaceQueryLocalInterface : new T(strongBinder);
        }
        parcelD.recycle();
        return t10;
    }

    @Override // T6.P
    public final void O4(IObjectWrapper iObjectWrapper, int i10) {
        Parcel parcelK = K();
        L6.s.e(parcelK, iObjectWrapper);
        parcelK.writeInt(i10);
        X(10, parcelK);
    }

    @Override // T6.P
    public final int c() {
        Parcel parcelD = D(9, K());
        int i10 = parcelD.readInt();
        parcelD.recycle();
        return i10;
    }

    @Override // T6.P
    public final InterfaceC2228a d() {
        InterfaceC2228a c2249w;
        Parcel parcelD = D(4, K());
        IBinder strongBinder = parcelD.readStrongBinder();
        if (strongBinder == null) {
            c2249w = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
            c2249w = iInterfaceQueryLocalInterface instanceof InterfaceC2228a ? (InterfaceC2228a) iInterfaceQueryLocalInterface : new C2249w(strongBinder);
        }
        parcelD.recycle();
        return c2249w;
    }

    @Override // T6.P
    public final void h1(IObjectWrapper iObjectWrapper) {
        Parcel parcelK = K();
        L6.s.e(parcelK, iObjectWrapper);
        X(11, parcelK);
    }

    @Override // T6.P
    public final L6.u k() {
        Parcel parcelD = D(5, K());
        L6.u uVarZzb = zzj.zzb(parcelD.readStrongBinder());
        parcelD.recycle();
        return uVarZzb;
    }

    @Override // T6.P
    public final void q4(IObjectWrapper iObjectWrapper, int i10) {
        Parcel parcelK = K();
        L6.s.e(parcelK, iObjectWrapper);
        parcelK.writeInt(20000000);
        X(6, parcelK);
    }
}
