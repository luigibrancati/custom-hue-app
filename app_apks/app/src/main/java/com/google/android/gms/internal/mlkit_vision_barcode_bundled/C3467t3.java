package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* JADX INFO: renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.t3, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C3467t3 extends AbstractC3406h1 implements K1 {
    private static final C3467t3 zzb;
    private int zzd;
    private boolean zzf;
    private int zzg;
    private boolean zzj;
    private int zzm;
    private int zzn;
    private boolean zzo;
    private int zze = -1;
    private G0 zzh = G0.f29754b;
    private String zzi = "";
    private boolean zzk = true;
    private boolean zzl = true;

    static {
        C3467t3 c3467t3 = new C3467t3();
        zzb = c3467t3;
        AbstractC3406h1.C(C3467t3.class, c3467t3);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC3406h1
    public final Object I(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            InterfaceC3426l1 interfaceC3426l1 = C3457r3.f29926a;
            InterfaceC3426l1 interfaceC3426l12 = C3462s3.f29931a;
            return AbstractC3406h1.z(zzb, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0000\u0000\u0001င\u0000\u0002ဇ\u0001\u0003᠌\u0002\u0004ည\u0003\u0005ဈ\u0004\u0006ဇ\u0005\u0007ဇ\u0006\bဇ\u0007\t᠌\b\n᠌\t\u000bဇ\n", new Object[]{"zzd", "zze", "zzf", "zzg", interfaceC3426l1, "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", interfaceC3426l12, "zzn", interfaceC3426l12, "zzo"});
        }
        if (i11 == 3) {
            return new C3467t3();
        }
        G2 g22 = null;
        if (i11 == 4) {
            return new C3453q3(g22);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
