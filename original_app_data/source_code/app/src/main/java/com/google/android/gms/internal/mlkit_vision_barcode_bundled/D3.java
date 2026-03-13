package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class D3 extends AbstractC3406h1 implements K1 {
    private static final D3 zzb;
    private int zzd;
    private InterfaceC3441o1 zze = AbstractC3406h1.r();
    private F3 zzf;
    private K2 zzg;

    static {
        D3 d32 = new D3();
        zzb = d32;
        AbstractC3406h1.C(D3.class, d32);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC3406h1
    public final Object I(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC3406h1.z(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000\u0003ဉ\u0001", new Object[]{"zzd", "zze", P3.class, "zzf", "zzg"});
        }
        if (i11 == 3) {
            return new D3();
        }
        G2 g22 = null;
        if (i11 == 4) {
            return new C3(g22);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
