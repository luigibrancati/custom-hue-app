package X6;

import android.os.IBinder;
import android.os.Parcel;
import java.util.List;

/* JADX INFO: renamed from: X6.j2, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C2415j2 extends com.google.android.gms.internal.measurement.N implements InterfaceC2423k2 {
    public C2415j2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.ITriggerUrisCallback");
    }

    @Override // X6.InterfaceC2423k2
    public final void n3(List list) {
        Parcel parcelK = K();
        parcelK.writeTypedList(list);
        I6(2, parcelK);
    }
}
