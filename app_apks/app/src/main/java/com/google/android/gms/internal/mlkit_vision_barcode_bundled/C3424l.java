package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* JADX INFO: renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.l, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C3424l extends AbstractC3406h1 implements K1 {
    private static final C3424l zzb;
    private int zzd;
    private String zze = "";
    private String zzf = "";
    private String zzg = "";

    static {
        C3424l c3424l = new C3424l();
        zzb = c3424l;
        AbstractC3406h1.C(C3424l.class, c3424l);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC3406h1
    public final Object I(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC3406h1.z(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i11 == 3) {
            return new C3424l();
        }
        AbstractC3414j abstractC3414j = null;
        if (i11 == 4) {
            return new C3419k(abstractC3414j);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
