package x6;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import v6.C6060o;

/* JADX INFO: renamed from: x6.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C6311a extends H6.a implements IInterface {
    public C6311a(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.service.IClientTelemetryService");
    }

    public final void I6(C6060o c6060o) {
        Parcel parcelD = D();
        H6.b.b(parcelD, c6060o);
        X(1, parcelD);
    }
}
