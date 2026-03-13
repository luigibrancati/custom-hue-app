package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class S3 extends AbstractC3406h1 implements K1 {
    private static final S3 zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private String zzg = "";

    static {
        S3 s32 = new S3();
        zzb = s32;
        AbstractC3406h1.C(S3.class, s32);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC3406h1
    public final Object I(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC3406h1.z(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002᠌\u0001\u0003ဈ\u0002", new Object[]{"zzd", "zze", "zzf", Q3.f29794a, "zzg"});
        }
        if (i11 == 3) {
            return new S3();
        }
        G2 g22 = null;
        if (i11 == 4) {
            return new R3(g22);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
