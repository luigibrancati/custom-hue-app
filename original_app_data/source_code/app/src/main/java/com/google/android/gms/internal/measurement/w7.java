package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class w7 implements v7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AbstractC3228j4 f29720a;

    static {
        C3174d4 c3174d4B = new C3174d4(Y3.a("com.google.android.gms.measurement")).a().b();
        f29720a = c3174d4B.d("measurement.session_stitching_token_enabled", false);
        c3174d4B.d("measurement.link_sst_to_sid", true);
    }

    @Override // com.google.android.gms.internal.measurement.v7
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.v7
    public final boolean zzb() {
        return ((Boolean) f29720a.d()).booleanValue();
    }
}
