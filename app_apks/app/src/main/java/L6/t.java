package L6;

import U6.C2293u;
import android.graphics.Bitmap;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class t extends AbstractC1164a implements u {
    public t(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
    }

    @Override // L6.u
    public final IObjectWrapper C3(C2293u c2293u) {
        Parcel parcelK = K();
        s.c(parcelK, c2293u);
        Parcel parcelD = D(8, parcelK);
        IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcelD.readStrongBinder());
        parcelD.recycle();
        return iObjectWrapperAsInterface;
    }

    @Override // L6.u
    public final IObjectWrapper J0(float f10) {
        Parcel parcelK = K();
        parcelK.writeFloat(f10);
        Parcel parcelD = D(5, parcelK);
        IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcelD.readStrongBinder());
        parcelD.recycle();
        return iObjectWrapperAsInterface;
    }

    @Override // L6.u
    public final IObjectWrapper P5(String str) {
        Parcel parcelK = K();
        parcelK.writeString(str);
        Parcel parcelD = D(2, parcelK);
        IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcelD.readStrongBinder());
        parcelD.recycle();
        return iObjectWrapperAsInterface;
    }

    @Override // L6.u
    public final IObjectWrapper c() {
        Parcel parcelD = D(4, K());
        IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcelD.readStrongBinder());
        parcelD.recycle();
        return iObjectWrapperAsInterface;
    }

    @Override // L6.u
    public final IObjectWrapper f1(Bitmap bitmap) {
        Parcel parcelK = K();
        s.c(parcelK, bitmap);
        Parcel parcelD = D(6, parcelK);
        IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcelD.readStrongBinder());
        parcelD.recycle();
        return iObjectWrapperAsInterface;
    }
}
