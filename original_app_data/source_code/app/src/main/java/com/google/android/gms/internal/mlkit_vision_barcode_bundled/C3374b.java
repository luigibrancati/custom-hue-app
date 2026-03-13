package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* JADX INFO: renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C3374b extends AbstractC3406h1 implements K1 {
    private static final C3374b zzb;
    private int zzd;
    private C3389e zze;
    private boolean zzf;

    static {
        C3374b c3374b = new C3374b();
        zzb = c3374b;
        AbstractC3406h1.C(C3374b.class, c3374b);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC3406h1
    public final Object I(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC3406h1.z(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဇ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i11 == 3) {
            return new C3374b();
        }
        k4 k4Var = null;
        if (i11 == 4) {
            return new l4(k4Var);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
