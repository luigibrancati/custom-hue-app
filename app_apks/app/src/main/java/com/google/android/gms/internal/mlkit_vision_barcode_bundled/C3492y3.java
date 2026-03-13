package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* JADX INFO: renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.y3, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C3492y3 extends AbstractC3406h1 implements K1 {
    private static final C3492y3 zzb;
    private int zzd;
    private int zze;

    static {
        C3492y3 c3492y3 = new C3492y3();
        zzb = c3492y3;
        AbstractC3406h1.C(C3492y3.class, c3492y3);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC3406h1
    public final Object I(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC3406h1.z(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"zzd", "zze"});
        }
        if (i11 == 3) {
            return new C3492y3();
        }
        G2 g22 = null;
        if (i11 == 4) {
            return new C3487x3(g22);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
