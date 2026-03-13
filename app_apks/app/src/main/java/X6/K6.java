package X6;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.InterfaceC3346x0;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class K6 implements W3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC3346x0 f18390a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AppMeasurementDynamiteService f18391b;

    public K6(AppMeasurementDynamiteService appMeasurementDynamiteService, InterfaceC3346x0 interfaceC3346x0) {
        Objects.requireNonNull(appMeasurementDynamiteService);
        this.f18391b = appMeasurementDynamiteService;
        this.f18390a = interfaceC3346x0;
    }

    @Override // X6.W3
    public final void a(String str, String str2, Bundle bundle, long j10) {
        try {
            this.f18390a.q0(str, str2, bundle, j10);
        } catch (RemoteException e10) {
            C2416j3 c2416j3 = this.f18391b.f30371a;
            if (c2416j3 != null) {
                c2416j3.a().r().b("Event interceptor threw exception", e10);
            }
        }
    }
}
