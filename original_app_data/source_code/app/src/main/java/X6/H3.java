package X6;

import com.google.android.gms.internal.measurement.InterfaceC3304s0;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class H3 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC3304s0 f18332a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ I f18333b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f18334c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AppMeasurementDynamiteService f18335d;

    public H3(AppMeasurementDynamiteService appMeasurementDynamiteService, InterfaceC3304s0 interfaceC3304s0, I i10, String str) {
        this.f18332a = interfaceC3304s0;
        this.f18333b = i10;
        this.f18334c = str;
        Objects.requireNonNull(appMeasurementDynamiteService);
        this.f18335d = appMeasurementDynamiteService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f18335d.f30371a.J().B(this.f18332a, this.f18333b, this.f18334c);
    }
}
