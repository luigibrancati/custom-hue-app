package X6;

import com.google.android.gms.internal.measurement.InterfaceC3304s0;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class I5 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC3304s0 f18359a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AppMeasurementDynamiteService f18360b;

    public I5(AppMeasurementDynamiteService appMeasurementDynamiteService, InterfaceC3304s0 interfaceC3304s0) {
        this.f18359a = interfaceC3304s0;
        Objects.requireNonNull(appMeasurementDynamiteService);
        this.f18360b = appMeasurementDynamiteService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AppMeasurementDynamiteService appMeasurementDynamiteService = this.f18360b;
        appMeasurementDynamiteService.f30371a.C().e0(this.f18359a, appMeasurementDynamiteService.f30371a.f());
    }
}
