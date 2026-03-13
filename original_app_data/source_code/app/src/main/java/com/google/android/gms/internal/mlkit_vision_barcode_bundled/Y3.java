package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class Y3 extends AbstractC3406h1 implements K1 {
    private static final Y3 zzb;
    private int zzd;
    private InterfaceC3441o1 zze = AbstractC3406h1.r();
    private String zzf = "";

    static {
        Y3 y32 = new Y3();
        zzb = y32;
        AbstractC3406h1.C(Y3.class, y32);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC3406h1
    public final Object I(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC3406h1.z(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001a\u0002ဈ\u0000", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i11 == 3) {
            return new Y3();
        }
        W3 w32 = null;
        if (i11 == 4) {
            return new X3(w32);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
