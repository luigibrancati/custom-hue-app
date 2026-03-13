package N6;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: renamed from: N6.k, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C1370k extends AbstractC1240a implements IInterface {
    public C1370k(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetector");
    }

    public final A9[] I6(IObjectWrapper iObjectWrapper, C1409n c1409n) {
        Parcel parcelD = D();
        AbstractC1241a0.b(parcelD, iObjectWrapper);
        AbstractC1241a0.a(parcelD, c1409n);
        Parcel parcelK = K(1, parcelD);
        A9[] a9Arr = (A9[]) parcelK.createTypedArray(A9.CREATOR);
        parcelK.recycle();
        return a9Arr;
    }

    public final A9[] J6(IObjectWrapper iObjectWrapper, C1409n c1409n) {
        Parcel parcelD = D();
        AbstractC1241a0.b(parcelD, iObjectWrapper);
        AbstractC1241a0.a(parcelD, c1409n);
        Parcel parcelK = K(2, parcelD);
        A9[] a9Arr = (A9[]) parcelK.createTypedArray(A9.CREATOR);
        parcelK.recycle();
        return a9Arr;
    }

    public final void c() {
        X(3, D());
    }
}
