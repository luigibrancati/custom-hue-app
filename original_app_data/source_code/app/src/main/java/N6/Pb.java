package N6;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class Pb extends AbstractC1240a implements IInterface {
    public Pb(IBinder iBinder) {
        super(iBinder, "com.google.mlkit.vision.barcode.aidls.IBarcodeScanner");
    }

    public final List I6(IObjectWrapper iObjectWrapper, Xb xb2) {
        Parcel parcelD = D();
        AbstractC1241a0.b(parcelD, iObjectWrapper);
        AbstractC1241a0.a(parcelD, xb2);
        Parcel parcelK = K(3, parcelD);
        ArrayList arrayListCreateTypedArrayList = parcelK.createTypedArrayList(Fb.CREATOR);
        parcelK.recycle();
        return arrayListCreateTypedArrayList;
    }

    public final void d() {
        X(1, D());
    }

    public final void e() {
        X(2, D());
    }
}
