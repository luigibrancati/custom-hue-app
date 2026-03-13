package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class I2 extends AbstractC3406h1 implements K1 {
    private static final I2 zzb;
    private int zzd;
    private int zze;
    private P3 zzf;
    private B3 zzg;
    private D3 zzh;

    static {
        I2 i22 = new I2();
        zzb = i22;
        AbstractC3406h1.C(I2.class, i22);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC3406h1
    public final Object I(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC3406h1.z(zzb, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0005ဉ\u0003", new Object[]{"zzd", "zze", C3413i3.f29868a, "zzf", "zzg", "zzh"});
        }
        if (i11 == 3) {
            return new I2();
        }
        G2 g22 = null;
        if (i11 == 4) {
            return new H2(g22);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
