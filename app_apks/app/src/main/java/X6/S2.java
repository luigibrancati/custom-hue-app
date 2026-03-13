package X6;

import android.content.Context;
import android.content.Intent;
import v6.AbstractC6056k;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class S2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final R2 f18555a;

    public S2(R2 r22) {
        AbstractC6056k.l(r22);
        this.f18555a = r22;
    }

    public final void a(Context context, Intent intent) {
        C2416j3 c2416j3O = C2416j3.O(context, null, null);
        C2542z2 c2542z2A = c2416j3O.a();
        if (intent == null) {
            c2542z2A.r().a("Receiver called with null intent");
            return;
        }
        c2416j3O.c();
        String action = intent.getAction();
        c2542z2A.w().b("Local receiver got", action);
        if (!"com.google.android.gms.measurement.UPLOAD".equals(action)) {
            if ("com.android.vending.INSTALL_REFERRER".equals(action)) {
                c2542z2A.r().a("Install Referrer Broadcasts are deprecated");
            }
        } else {
            Intent className = new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementService");
            className.setAction("com.google.android.gms.measurement.UPLOAD");
            c2542z2A.w().a("Starting wakeful intent.");
            this.f18555a.a(context, className);
        }
    }
}
