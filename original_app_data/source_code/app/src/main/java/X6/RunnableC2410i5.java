package X6;

import com.google.android.gms.internal.measurement.InterfaceC3304s0;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import java.util.Objects;

/* JADX INFO: renamed from: X6.i5, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC2410i5 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC3304s0 f18993a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f18994b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f18995c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AppMeasurementDynamiteService f18996d;

    public RunnableC2410i5(AppMeasurementDynamiteService appMeasurementDynamiteService, InterfaceC3304s0 interfaceC3304s0, String str, String str2) {
        this.f18993a = interfaceC3304s0;
        this.f18994b = str;
        this.f18995c = str2;
        Objects.requireNonNull(appMeasurementDynamiteService);
        this.f18996d = appMeasurementDynamiteService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f18996d.f30371a.J().f0(this.f18993a, this.f18994b, this.f18995c);
    }
}
