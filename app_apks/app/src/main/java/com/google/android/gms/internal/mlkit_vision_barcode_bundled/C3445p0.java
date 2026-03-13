package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* JADX INFO: renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.p0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C3445p0 extends AbstractC3406h1 implements K1 {
    private static final C3445p0 zzb;
    private int zzd;
    private int zze;
    private String zzf = "";

    static {
        C3445p0 c3445p0 = new C3445p0();
        zzb = c3445p0;
        AbstractC3406h1.C(C3445p0.class, c3445p0);
    }

    public static C3445p0 K() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC3406h1
    public final Object I(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC3406h1.z(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001", new Object[]{"zzd", "zze", C3435n0.f29879a, "zzf"});
        }
        if (i11 == 3) {
            return new C3445p0();
        }
        AbstractC3395f0 abstractC3395f0 = null;
        if (i11 == 4) {
            return new C3430m0(abstractC3395f0);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }

    public final String L() {
        return this.zzf;
    }

    public final int M() {
        int iA = AbstractC3440o0.a(this.zze);
        if (iA == 0) {
            return 1;
        }
        return iA;
    }
}
