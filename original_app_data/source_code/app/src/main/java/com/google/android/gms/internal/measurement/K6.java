package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class K6 implements J6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AbstractC3228j4 f29256a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AbstractC3228j4 f29257b;

    static {
        C3174d4 c3174d4B = new C3174d4(Y3.a("com.google.android.gms.measurement")).a().b();
        c3174d4B.d("measurement.collection.event_safelist", true);
        f29256a = c3174d4B.d("measurement.service.store_null_safelist", true);
        f29257b = c3174d4B.d("measurement.service.store_safelist", true);
    }

    @Override // com.google.android.gms.internal.measurement.J6
    public final boolean b() {
        return ((Boolean) f29257b.d()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.J6
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.J6
    public final boolean zzb() {
        return ((Boolean) f29256a.d()).booleanValue();
    }
}
