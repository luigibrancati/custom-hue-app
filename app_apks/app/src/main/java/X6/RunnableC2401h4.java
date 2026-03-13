package X6;

import com.google.android.gms.internal.measurement.InterfaceC3304s0;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import java.util.Objects;

/* JADX INFO: renamed from: X6.h4, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC2401h4 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC3304s0 f18966a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f18967b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f18968c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f18969d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AppMeasurementDynamiteService f18970e;

    public RunnableC2401h4(AppMeasurementDynamiteService appMeasurementDynamiteService, InterfaceC3304s0 interfaceC3304s0, String str, String str2, boolean z10) {
        this.f18966a = interfaceC3304s0;
        this.f18967b = str;
        this.f18968c = str2;
        this.f18969d = z10;
        Objects.requireNonNull(appMeasurementDynamiteService);
        this.f18970e = appMeasurementDynamiteService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f18970e.f30371a.J().h0(this.f18966a, this.f18967b, this.f18968c, this.f18969d);
    }
}
