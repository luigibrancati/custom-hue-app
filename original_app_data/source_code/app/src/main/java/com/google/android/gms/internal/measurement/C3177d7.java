package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.d7, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C3177d7 implements InterfaceC3168c7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AbstractC3228j4 f29443a;

    static {
        C3174d4 c3174d4B = new C3174d4(Y3.a("com.google.android.gms.measurement")).a().b();
        c3174d4B.d("measurement.sdk.collection.enable_extend_user_property_size", true);
        f29443a = c3174d4B.d("measurement.sdk.collection.last_deep_link_referrer_campaign2", false);
        c3174d4B.c("measurement.id.sdk.collection.last_deep_link_referrer2", 0L);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3168c7
    public final boolean zza() {
        return ((Boolean) f29443a.d()).booleanValue();
    }
}
