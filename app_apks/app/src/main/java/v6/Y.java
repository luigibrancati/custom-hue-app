package v6;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class Y extends J6.a implements Z {
    public Y(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ICertData");
    }

    @Override // v6.Z
    public final IObjectWrapper c() {
        Parcel parcelD = D(1, K());
        IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcelD.readStrongBinder());
        parcelD.recycle();
        return iObjectWrapperAsInterface;
    }

    @Override // v6.Z
    public final int d() {
        Parcel parcelD = D(2, K());
        int i10 = parcelD.readInt();
        parcelD.recycle();
        return i10;
    }
}
