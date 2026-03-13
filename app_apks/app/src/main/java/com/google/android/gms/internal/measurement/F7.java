package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class F7 implements E7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AbstractC3228j4 f29197a;

    static {
        C3174d4 c3174d4B = new C3174d4(Y3.a("com.google.android.gms.measurement")).a().b();
        f29197a = c3174d4B.d("measurement.tcf.consent_fix", true);
        c3174d4B.d("measurement.tcf.client", true);
        c3174d4B.d("measurement.tcf.empty_pref_fix", true);
    }

    @Override // com.google.android.gms.internal.measurement.E7
    public final boolean zza() {
        return ((Boolean) f29197a.d()).booleanValue();
    }
}
