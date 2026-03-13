package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.t7, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C3320t7 implements InterfaceC3302r7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AbstractC3228j4 f29619a = new C3174d4(Y3.a("com.google.android.gms.measurement")).a().b().d("measurement.experiment.enable_phenotype_experiment_reporting", true);

    @Override // com.google.android.gms.internal.measurement.InterfaceC3302r7
    public final boolean zza() {
        return ((Boolean) f29619a.d()).booleanValue();
    }
}
