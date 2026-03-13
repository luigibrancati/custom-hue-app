package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.g7, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C3204g7 implements InterfaceC3195f7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AbstractC3228j4 f29474a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AbstractC3228j4 f29475b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AbstractC3228j4 f29476c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final AbstractC3228j4 f29477d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final AbstractC3228j4 f29478e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final AbstractC3228j4 f29479f;

    static {
        C3174d4 c3174d4B = new C3174d4(Y3.a("com.google.android.gms.measurement")).a().b();
        f29474a = c3174d4B.d("measurement.test.boolean_flag", false);
        f29475b = c3174d4B.c("measurement.test.cached_long_flag", -1L);
        f29476c = c3174d4B.e("measurement.test.double_flag", -3.0d);
        f29477d = c3174d4B.c("measurement.test.int_flag", -2L);
        f29478e = c3174d4B.c("measurement.test.long_flag", -1L);
        f29479f = c3174d4B.f("measurement.test.string_flag", "---");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3195f7
    public final double b() {
        return ((Double) f29476c.d()).doubleValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3195f7
    public final long c() {
        return ((Long) f29477d.d()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3195f7
    public final long d() {
        return ((Long) f29478e.d()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3195f7
    public final String e() {
        return (String) f29479f.d();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3195f7
    public final boolean zza() {
        return ((Boolean) f29474a.d()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3195f7
    public final long zzb() {
        return ((Long) f29475b.d()).longValue();
    }
}
