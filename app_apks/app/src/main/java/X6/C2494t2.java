package X6;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.internal.a;

/* JADX INFO: renamed from: X6.t2, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C2494t2 extends com.google.android.gms.common.internal.a {
    public C2494t2(Context context, Looper looper, a.InterfaceC0356a interfaceC0356a, a.b bVar) {
        super(context, looper, 93, interfaceC0356a, bVar, null);
    }

    @Override // com.google.android.gms.common.internal.a
    public final String D() {
        return "com.google.android.gms.measurement.internal.IMeasurementService";
    }

    @Override // com.google.android.gms.common.internal.a
    public final String E() {
        return "com.google.android.gms.measurement.START";
    }

    @Override // com.google.android.gms.common.internal.a, t6.C5843a.f
    public final int m() {
        return 12451000;
    }

    @Override // com.google.android.gms.common.internal.a
    public final /* synthetic */ IInterface r(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
        return iInterfaceQueryLocalInterface instanceof InterfaceC2407i2 ? (InterfaceC2407i2) iInterfaceQueryLocalInterface : new C2391g2(iBinder);
    }
}
