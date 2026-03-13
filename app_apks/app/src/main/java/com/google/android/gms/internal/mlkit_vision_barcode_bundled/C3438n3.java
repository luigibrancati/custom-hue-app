package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* JADX INFO: renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.n3, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C3438n3 extends AbstractC3406h1 implements K1 {
    private static final C3438n3 zzb;
    private int zzd;
    private boolean zze;
    private int zzf;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private boolean zzg = true;
    private String zzl = "";
    private String zzm = "";

    static {
        C3438n3 c3438n3 = new C3438n3();
        zzb = c3438n3;
        AbstractC3406h1.C(C3438n3.class, c3438n3);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC3406h1
    public final Object I(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            InterfaceC3426l1 interfaceC3426l1 = C3448p3.f29898a;
            InterfaceC3426l1 interfaceC3426l12 = C3428l3.f29870a;
            InterfaceC3426l1 interfaceC3426l13 = C3443o3.f29888a;
            return AbstractC3406h1.z(zzb, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001ဇ\u0000\u0002᠌\u0001\u0003ဇ\u0002\u0004᠌\u0003\u0005᠌\u0004\u0006᠌\u0005\u0007᠌\u0006\bဈ\u0007\tဈ\b", new Object[]{"zzd", "zze", "zzf", interfaceC3426l1, "zzg", "zzh", interfaceC3426l12, "zzi", interfaceC3426l13, "zzj", interfaceC3426l13, "zzk", interfaceC3426l13, "zzl", "zzm"});
        }
        if (i11 == 3) {
            return new C3438n3();
        }
        G2 g22 = null;
        if (i11 == 4) {
            return new C3433m3(g22);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
