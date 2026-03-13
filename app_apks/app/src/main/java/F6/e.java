package F6;

import J6.n;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class e extends J6.a implements IInterface {
    public e(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader");
    }

    public final int I6(IObjectWrapper iObjectWrapper, String str, boolean z10) {
        Parcel parcelK = K();
        n.e(parcelK, iObjectWrapper);
        parcelK.writeString(str);
        parcelK.writeInt(z10 ? 1 : 0);
        Parcel parcelD = D(3, parcelK);
        int i10 = parcelD.readInt();
        parcelD.recycle();
        return i10;
    }

    public final IObjectWrapper J6(IObjectWrapper iObjectWrapper, String str, int i10) {
        Parcel parcelK = K();
        n.e(parcelK, iObjectWrapper);
        parcelK.writeString(str);
        parcelK.writeInt(i10);
        Parcel parcelD = D(4, parcelK);
        IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcelD.readStrongBinder());
        parcelD.recycle();
        return iObjectWrapperAsInterface;
    }

    public final int K6(IObjectWrapper iObjectWrapper, String str, boolean z10) {
        Parcel parcelK = K();
        n.e(parcelK, iObjectWrapper);
        parcelK.writeString(str);
        parcelK.writeInt(z10 ? 1 : 0);
        Parcel parcelD = D(5, parcelK);
        int i10 = parcelD.readInt();
        parcelD.recycle();
        return i10;
    }

    public final IObjectWrapper L6(IObjectWrapper iObjectWrapper, String str, boolean z10, long j10) {
        Parcel parcelK = K();
        n.e(parcelK, iObjectWrapper);
        parcelK.writeString(str);
        parcelK.writeInt(z10 ? 1 : 0);
        parcelK.writeLong(j10);
        Parcel parcelD = D(7, parcelK);
        IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcelD.readStrongBinder());
        parcelD.recycle();
        return iObjectWrapperAsInterface;
    }

    public final IObjectWrapper M6(IObjectWrapper iObjectWrapper, String str, int i10, IObjectWrapper iObjectWrapper2) {
        Parcel parcelK = K();
        n.e(parcelK, iObjectWrapper);
        parcelK.writeString(str);
        parcelK.writeInt(i10);
        n.e(parcelK, iObjectWrapper2);
        Parcel parcelD = D(8, parcelK);
        IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcelD.readStrongBinder());
        parcelD.recycle();
        return iObjectWrapperAsInterface;
    }

    public final IObjectWrapper X(IObjectWrapper iObjectWrapper, String str, int i10) {
        Parcel parcelK = K();
        n.e(parcelK, iObjectWrapper);
        parcelK.writeString(str);
        parcelK.writeInt(i10);
        Parcel parcelD = D(2, parcelK);
        IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcelD.readStrongBinder());
        parcelD.recycle();
        return iObjectWrapperAsInterface;
    }

    public final int g() {
        Parcel parcelD = D(6, K());
        int i10 = parcelD.readInt();
        parcelD.recycle();
        return i10;
    }
}
