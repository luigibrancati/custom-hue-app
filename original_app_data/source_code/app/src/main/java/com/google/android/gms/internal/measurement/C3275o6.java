package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.o6, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C3275o6 implements InterfaceC3266n6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AbstractC3228j4 f29566a;

    static {
        C3174d4 c3174d4B = new C3174d4(Y3.a("com.google.android.gms.measurement")).a().b();
        f29566a = c3174d4B.d("measurement.service.ad_impression.convert_value_to_double", true);
        c3174d4B.d("measurement.service.separate_public_internal_event_blacklisting", true);
        c3174d4B.d("measurement.service.ad_impression", true);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3266n6
    public final boolean zza() {
        return ((Boolean) f29566a.d()).booleanValue();
    }
}
