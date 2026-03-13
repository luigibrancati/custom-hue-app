package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class g4 extends AbstractC3406h1 implements K1 {
    private static final g4 zzb;
    private int zzd;
    private long zze;
    private long zzf;
    private V3 zzg;
    private byte zzh = 2;

    static {
        g4 g4Var = new g4();
        zzb = g4Var;
        AbstractC3406h1.C(g4.class, g4Var);
        AbstractC3406h1.j(V3.L(), g4Var, g4Var, null, 13258261, D2.zzk, g4.class);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC3406h1
    public final Object I(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return Byte.valueOf(this.zzh);
        }
        if (i11 == 2) {
            return AbstractC3406h1.z(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0003\u0001ᔅ\u0000\u0002ᔅ\u0001\u0003ᐉ\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i11 == 3) {
            return new g4();
        }
        e4 e4Var = null;
        if (i11 == 4) {
            return new f4(e4Var);
        }
        if (i11 == 5) {
            return zzb;
        }
        this.zzh = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
