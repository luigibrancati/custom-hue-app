package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class U2 extends AbstractC3406h1 implements K1 {
    private static final U2 zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh = 2;

    static {
        U2 u22 = new U2();
        zzb = u22;
        AbstractC3406h1.C(U2.class, u22);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC3406h1
    public final Object I(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC3406h1.z(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003", new Object[]{"zzd", "zze", T2.f29812a, "zzf", "zzg", "zzh"});
        }
        if (i11 == 3) {
            return new U2();
        }
        G2 g22 = null;
        if (i11 == 4) {
            return new S2(g22);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
