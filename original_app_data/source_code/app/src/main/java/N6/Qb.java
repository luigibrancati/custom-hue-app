package N6;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class Qb extends AbstractC1240a implements Rb {
    public Qb(IBinder iBinder) {
        super(iBinder, "com.google.mlkit.vision.barcode.aidls.IBarcodeScannerCreator");
    }

    @Override // N6.Rb
    public final Pb s3(IObjectWrapper iObjectWrapper, Hb hb2) {
        Pb pb2;
        Parcel parcelD = D();
        AbstractC1241a0.b(parcelD, iObjectWrapper);
        AbstractC1241a0.a(parcelD, hb2);
        Parcel parcelK = K(1, parcelD);
        IBinder strongBinder = parcelK.readStrongBinder();
        if (strongBinder == null) {
            pb2 = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.mlkit.vision.barcode.aidls.IBarcodeScanner");
            pb2 = iInterfaceQueryLocalInterface instanceof Pb ? (Pb) iInterfaceQueryLocalInterface : new Pb(strongBinder);
        }
        parcelK.recycle();
        return pb2;
    }
}
