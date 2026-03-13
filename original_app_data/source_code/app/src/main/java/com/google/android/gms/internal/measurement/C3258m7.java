package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.m7, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C3258m7 implements InterfaceC3249l7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AbstractC3228j4 f29553a;

    static {
        C3174d4 c3174d4B = new C3174d4(Y3.a("com.google.android.gms.measurement")).a().b();
        f29553a = c3174d4B.d("measurement.add_first_launch_logging_timestamp.service", false);
        c3174d4B.c("measurement.id.add_first_launch_logging_timestamp.service", 0L);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3249l7
    public final boolean zza() {
        return ((Boolean) f29553a.d()).booleanValue();
    }
}
