package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* JADX INFO: renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.k3, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C3423k3 extends AbstractC3406h1 implements K1 {
    private static final C3423k3 zzb;
    private int zzd;
    private boolean zze;
    private boolean zzf;

    static {
        C3423k3 c3423k3 = new C3423k3();
        zzb = c3423k3;
        AbstractC3406h1.C(C3423k3.class, c3423k3);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC3406h1
    public final Object I(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC3406h1.z(zzb, "\u0001\u0002\u0000\u0001\u0005\u0006\u0002\u0000\u0000\u0000\u0005ဇ\u0000\u0006ဇ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i11 == 3) {
            return new C3423k3();
        }
        G2 g22 = null;
        if (i11 == 4) {
            return new C3418j3(g22);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
