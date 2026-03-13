package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class E6 implements D6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AbstractC3228j4 f29172a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AbstractC3228j4 f29173b;

    static {
        C3174d4 c3174d4B = new C3174d4(Y3.a("com.google.android.gms.measurement")).a().b();
        f29172a = c3174d4B.d("measurement.set_default_event_parameters_propagate_clear.client.dev", true);
        f29173b = c3174d4B.d("measurement.set_default_event_parameters_propagate_clear.service", true);
    }

    @Override // com.google.android.gms.internal.measurement.D6
    public final boolean zza() {
        return ((Boolean) f29172a.d()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.D6
    public final boolean zzb() {
        return ((Boolean) f29173b.d()).booleanValue();
    }
}
