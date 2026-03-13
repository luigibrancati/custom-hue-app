package Z6;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class e extends H6.a implements IInterface {
    public e(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.signin.internal.ISignInService");
    }

    public final void I6(h hVar, d dVar) {
        Parcel parcelD = D();
        H6.b.b(parcelD, hVar);
        H6.b.c(parcelD, dVar);
        K(12, parcelD);
    }
}
