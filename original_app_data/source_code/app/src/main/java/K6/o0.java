package K6;

import R6.C2074i;
import R6.C2075j;
import R6.C2077l;
import android.app.PendingIntent;
import android.location.Location;
import android.os.IInterface;
import com.google.android.gms.common.api.internal.IStatusCallback;
import com.google.android.gms.location.LocationRequest;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public interface o0 extends IInterface {
    void A1(Q q10, m0 m0Var);

    void L1(C2075j c2075j, I i10);

    void O3(Q q10, IStatusCallback iStatusCallback);

    void Q0(M m10);

    void d2(C2075j c2075j, q0 q0Var);

    void m3(I i10, LocationRequest locationRequest, IStatusCallback iStatusCallback);

    void n6(C2074i c2074i, PendingIntent pendingIntent, m0 m0Var);

    Location r();

    void x1(C2077l c2077l, InterfaceC1037b interfaceC1037b, String str);

    void x5(C2074i c2074i, PendingIntent pendingIntent, IStatusCallback iStatusCallback);

    void z0(I i10, IStatusCallback iStatusCallback);
}
