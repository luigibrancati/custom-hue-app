package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.j7, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C3231j7 implements InterfaceC3222i7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AbstractC3228j4 f29519a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AbstractC3228j4 f29520b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AbstractC3228j4 f29521c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final AbstractC3228j4 f29522d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final AbstractC3228j4 f29523e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final AbstractC3228j4 f29524f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final AbstractC3228j4 f29525g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final AbstractC3228j4 f29526h;

    static {
        C3174d4 c3174d4B = new C3174d4(Y3.a("com.google.android.gms.measurement")).a().b();
        c3174d4B.d("measurement.rb.attribution.ad_campaign_info", true);
        c3174d4B.d("measurement.rb.attribution.service.bundle_on_backgrounded", true);
        f29519a = c3174d4B.d("measurement.rb.attribution.client2", true);
        f29520b = c3174d4B.d("measurement.rb.attribution.followup1.service", false);
        c3174d4B.d("measurement.rb.attribution.client.get_trigger_uris_async", true);
        f29521c = c3174d4B.d("measurement.rb.attribution.service.trigger_uris_high_priority", true);
        c3174d4B.d("measurement.rb.attribution.index_out_of_bounds_fix", true);
        f29522d = c3174d4B.d("measurement.rb.attribution.service.enable_max_trigger_uris_queried_at_once", true);
        f29523e = c3174d4B.d("measurement.rb.attribution.retry_disposition", false);
        f29524f = c3174d4B.d("measurement.rb.attribution.service", true);
        f29525g = c3174d4B.d("measurement.rb.attribution.enable_trigger_redaction", true);
        f29526h = c3174d4B.d("measurement.rb.attribution.uuid_generation", true);
        c3174d4B.c("measurement.id.rb.attribution.retry_disposition", 0L);
        c3174d4B.d("measurement.rb.attribution.improved_retry", true);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3222i7
    public final boolean b() {
        return ((Boolean) f29520b.d()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3222i7
    public final boolean c() {
        return ((Boolean) f29521c.d()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3222i7
    public final boolean d() {
        return ((Boolean) f29522d.d()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3222i7
    public final boolean e() {
        return ((Boolean) f29523e.d()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3222i7
    public final boolean f() {
        return ((Boolean) f29525g.d()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3222i7
    public final boolean g() {
        return ((Boolean) f29526h.d()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3222i7
    public final boolean i() {
        return ((Boolean) f29524f.d()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3222i7
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3222i7
    public final boolean zzb() {
        return ((Boolean) f29519a.d()).booleanValue();
    }
}
