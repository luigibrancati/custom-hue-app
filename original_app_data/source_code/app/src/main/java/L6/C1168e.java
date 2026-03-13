package L6;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: renamed from: L6.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C1168e extends AbstractC1164a implements f {
    public C1168e(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.IMapCapabilitiesDelegate");
    }

    @Override // L6.f
    public final boolean c() {
        Parcel parcelD = D(1, K());
        boolean zF = s.f(parcelD);
        parcelD.recycle();
        return zF;
    }
}
