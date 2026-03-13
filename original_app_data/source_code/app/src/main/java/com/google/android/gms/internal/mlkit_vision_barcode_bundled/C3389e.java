package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* JADX INFO: renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C3389e extends AbstractC3406h1 implements K1 {
    private static final C3389e zzb;
    private int zzd;
    private int zze = 4369;
    private String zzf = "";

    static {
        C3389e c3389e = new C3389e();
        zzb = c3389e;
        AbstractC3406h1.C(C3389e.class, c3389e);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC3406h1
    public final Object I(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC3406h1.z(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001", new Object[]{"zzd", "zze", c4.f29842a, "zzf"});
        }
        if (i11 == 3) {
            return new C3389e();
        }
        AbstractC3379c abstractC3379c = null;
        if (i11 == 4) {
            return new C3384d(abstractC3379c);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
