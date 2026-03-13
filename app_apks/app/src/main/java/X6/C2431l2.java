package X6;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: renamed from: X6.l2, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C2431l2 extends com.google.android.gms.internal.measurement.N implements InterfaceC2439m2 {
    public C2431l2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IUploadBatchesCallback");
    }

    @Override // X6.InterfaceC2439m2
    public final void B1(A6 a62) {
        Parcel parcelK = K();
        com.google.android.gms.internal.measurement.O.c(parcelK, a62);
        I6(2, parcelK);
    }
}
