package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class j4 extends AbstractC3406h1 implements K1 {
    private static final j4 zzb;
    private int zzd;
    private C3374b zze;

    static {
        j4 j4Var = new j4();
        zzb = j4Var;
        AbstractC3406h1.C(j4.class, j4Var);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC3406h1
    public final Object I(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC3406h1.z(zzb, "\u0001\u0001\u0000\u0001\u000f\u000f\u0001\u0000\u0000\u0000\u000fဉ\u0000", new Object[]{"zzd", "zze"});
        }
        if (i11 == 3) {
            return new j4();
        }
        h4 h4Var = null;
        if (i11 == 4) {
            return new i4(h4Var);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
