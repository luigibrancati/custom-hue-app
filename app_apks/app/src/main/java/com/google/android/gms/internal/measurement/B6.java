package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class B6 implements A6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AbstractC3228j4 f29144a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AbstractC3228j4 f29145b;

    static {
        C3174d4 c3174d4B = new C3174d4(Y3.a("com.google.android.gms.measurement")).a().b();
        c3174d4B.d("measurement.set_default_event_parameters_with_backfill.client.dev", false);
        c3174d4B.d("measurement.set_default_event_parameters_with_backfill.service", true);
        c3174d4B.c("measurement.id.set_default_event_parameters.fix_service_request_ordering", 0L);
        f29144a = c3174d4B.d("measurement.set_default_event_parameters.fix_app_update_logging", true);
        f29145b = c3174d4B.d("measurement.set_default_event_parameters.fix_service_request_ordering", false);
        c3174d4B.d("measurement.set_default_event_parameters.fix_subsequent_launches", true);
    }

    @Override // com.google.android.gms.internal.measurement.A6
    public final boolean zza() {
        return ((Boolean) f29144a.d()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.A6
    public final boolean zzb() {
        return ((Boolean) f29145b.d()).booleanValue();
    }
}
