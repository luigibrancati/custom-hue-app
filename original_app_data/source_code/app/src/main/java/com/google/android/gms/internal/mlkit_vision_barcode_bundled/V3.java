package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class V3 extends AbstractC3391e1 implements K1 {
    private static final V3 zzd;
    private byte zze = 2;

    static {
        V3 v32 = new V3();
        zzd = v32;
        AbstractC3406h1.C(V3.class, v32);
    }

    public static V3 L() {
        return zzd;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC3406h1
    public final Object I(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return Byte.valueOf(this.zze);
        }
        T3 t32 = null;
        if (i11 == 2) {
            return AbstractC3406h1.z(zzd, "\u0003\u0000", null);
        }
        if (i11 == 3) {
            return new V3();
        }
        if (i11 == 4) {
            return new U3(t32);
        }
        if (i11 == 5) {
            return zzd;
        }
        this.zze = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
