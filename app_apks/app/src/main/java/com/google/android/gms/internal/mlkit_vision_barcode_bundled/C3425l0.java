package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* JADX INFO: renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.l0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C3425l0 extends AbstractC3406h1 implements K1 {
    private static final C3425l0 zzb;
    private int zzd;
    private String zze = "";
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";
    private String zzj = "";
    private String zzk = "";

    static {
        C3425l0 c3425l0 = new C3425l0();
        zzb = c3425l0;
        AbstractC3406h1.C(C3425l0.class, c3425l0);
    }

    public static C3425l0 K() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC3406h1
    public final Object I(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC3406h1.z(zzb, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        if (i11 == 3) {
            return new C3425l0();
        }
        AbstractC3395f0 abstractC3395f0 = null;
        if (i11 == 4) {
            return new C3420k0(abstractC3395f0);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }

    public final String L() {
        return this.zzh;
    }

    public final String M() {
        return this.zze;
    }

    public final String N() {
        return this.zzj;
    }

    public final String O() {
        return this.zzi;
    }

    public final String P() {
        return this.zzg;
    }

    public final String Q() {
        return this.zzf;
    }

    public final String R() {
        return this.zzk;
    }
}
