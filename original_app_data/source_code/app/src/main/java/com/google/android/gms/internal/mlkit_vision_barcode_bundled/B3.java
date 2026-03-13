package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class B3 extends AbstractC3406h1 implements K1 {
    private static final B3 zzb;
    private int zzd;
    private String zze = "";
    private H3 zzf;

    static {
        B3 b32 = new B3();
        zzb = b32;
        AbstractC3406h1.C(B3.class, b32);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC3406h1
    public final Object I(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC3406h1.z(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i11 == 3) {
            return new B3();
        }
        G2 g22 = null;
        if (i11 == 4) {
            return new A3(g22);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
