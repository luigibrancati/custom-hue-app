package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class z7 implements y7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AbstractC3228j4 f29734a;

    static {
        C3174d4 c3174d4B = new C3174d4(Y3.a("com.google.android.gms.measurement")).a().b();
        f29734a = c3174d4B.d("measurement.client.sessions.enable_fix_background_engagement", false);
        c3174d4B.d("measurement.client.sessions.enable_pause_engagement_in_background", true);
        c3174d4B.c("measurement.id.client.sessions.enable_fix_background_engagement", 0L);
    }

    @Override // com.google.android.gms.internal.measurement.y7
    public final boolean zza() {
        return ((Boolean) f29734a.d()).booleanValue();
    }
}
