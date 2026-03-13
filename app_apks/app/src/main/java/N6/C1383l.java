package N6;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: renamed from: N6.l, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C1383l extends AbstractC1240a implements InterfaceC1396m {
    public C1383l(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetectorCreator");
    }

    @Override // N6.InterfaceC1396m
    public final C1370k v0(IObjectWrapper iObjectWrapper, C1344i c1344i) {
        C1370k c1370k;
        Parcel parcelD = D();
        AbstractC1241a0.b(parcelD, iObjectWrapper);
        AbstractC1241a0.a(parcelD, c1344i);
        Parcel parcelK = K(1, parcelD);
        IBinder strongBinder = parcelK.readStrongBinder();
        if (strongBinder == null) {
            c1370k = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetector");
            c1370k = iInterfaceQueryLocalInterface instanceof C1370k ? (C1370k) iInterfaceQueryLocalInterface : new C1370k(strongBinder);
        }
        parcelK.recycle();
        return c1370k;
    }
}
