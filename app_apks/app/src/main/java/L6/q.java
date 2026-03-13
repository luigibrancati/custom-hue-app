package L6;

import U6.I;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class q extends AbstractC1164a implements r {
    public q(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.ITileProviderDelegate");
    }

    @Override // L6.r
    public final I z2(int i10, int i11, int i12) {
        Parcel parcelK = K();
        parcelK.writeInt(i10);
        parcelK.writeInt(i11);
        parcelK.writeInt(i12);
        Parcel parcelD = D(1, parcelK);
        I i13 = (I) s.a(parcelD, I.CREATOR);
        parcelD.recycle();
        return i13;
    }
}
