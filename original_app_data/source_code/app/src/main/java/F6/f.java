package F6;

import J6.n;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class f extends J6.a implements IInterface {
    public f(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2");
    }

    public final IObjectWrapper I6(IObjectWrapper iObjectWrapper, String str, int i10, IObjectWrapper iObjectWrapper2) {
        Parcel parcelK = K();
        n.e(parcelK, iObjectWrapper);
        parcelK.writeString(str);
        parcelK.writeInt(i10);
        n.e(parcelK, iObjectWrapper2);
        Parcel parcelD = D(3, parcelK);
        IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcelD.readStrongBinder());
        parcelD.recycle();
        return iObjectWrapperAsInterface;
    }

    public final IObjectWrapper X(IObjectWrapper iObjectWrapper, String str, int i10, IObjectWrapper iObjectWrapper2) {
        Parcel parcelK = K();
        n.e(parcelK, iObjectWrapper);
        parcelK.writeString(str);
        parcelK.writeInt(i10);
        n.e(parcelK, iObjectWrapper2);
        Parcel parcelD = D(2, parcelK);
        IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcelD.readStrongBinder());
        parcelD.recycle();
        return iObjectWrapperAsInterface;
    }
}
