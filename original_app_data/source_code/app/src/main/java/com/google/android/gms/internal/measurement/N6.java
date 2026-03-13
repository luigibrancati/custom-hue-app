package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class N6 implements M6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AbstractC3228j4 f29289a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AbstractC3228j4 f29290b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AbstractC3228j4 f29291c;

    static {
        C3174d4 c3174d4B = new C3174d4(Y3.a("com.google.android.gms.measurement")).a().b();
        c3174d4B.d("measurement.service.audience.fix_skip_audience_with_failed_filters", true);
        f29289a = c3174d4B.d("measurement.audience.refresh_event_count_filters_timestamp", false);
        f29290b = c3174d4B.d("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", false);
        f29291c = c3174d4B.d("measurement.audience.use_bundle_timestamp_for_event_count_filters", false);
    }

    @Override // com.google.android.gms.internal.measurement.M6
    public final boolean b() {
        return ((Boolean) f29290b.d()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.M6
    public final boolean c() {
        return ((Boolean) f29291c.d()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.M6
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.M6
    public final boolean zzb() {
        return ((Boolean) f29289a.d()).booleanValue();
    }
}
