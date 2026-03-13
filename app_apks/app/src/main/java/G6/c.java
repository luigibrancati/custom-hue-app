package G6;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class c extends a implements d {
    public c(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
    }

    @Override // G6.d
    public final boolean X0(boolean z10) {
        Parcel parcelD = D();
        b.a(parcelD, true);
        Parcel parcelK = K(2, parcelD);
        boolean zB = b.b(parcelK);
        parcelK.recycle();
        return zB;
    }

    @Override // G6.d
    public final String b() {
        Parcel parcelK = K(1, D());
        String string = parcelK.readString();
        parcelK.recycle();
        return string;
    }
}
