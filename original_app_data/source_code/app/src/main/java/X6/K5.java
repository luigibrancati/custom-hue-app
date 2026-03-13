package X6;

import android.content.ComponentName;
import android.content.Context;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class K5 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ O5 f18389a;

    public K5(O5 o52) {
        Objects.requireNonNull(o52);
        this.f18389a = o52;
    }

    @Override // java.lang.Runnable
    public final void run() {
        U5 u52 = this.f18389a.f18465c;
        C2416j3 c2416j3 = u52.f18400a;
        Context contextD = c2416j3.d();
        c2416j3.c();
        u52.K(new ComponentName(contextD, "com.google.android.gms.measurement.AppMeasurementService"));
    }
}
