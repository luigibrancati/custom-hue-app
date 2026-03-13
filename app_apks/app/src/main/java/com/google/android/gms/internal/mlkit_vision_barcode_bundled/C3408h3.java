package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* JADX INFO: renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.h3, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C3408h3 extends AbstractC3406h1 implements K1 {
    private static final C3408h3 zzb;
    private int zzd;
    private int zze;
    private Z2 zzh;
    private int zzj;
    private int zzk;
    private int zzn;
    private InterfaceC3441o1 zzf = AbstractC3406h1.r();
    private int zzg = -1;
    private String zzi = "";
    private InterfaceC3436n1 zzl = AbstractC3406h1.q();
    private String zzm = "";

    static {
        C3408h3 c3408h3 = new C3408h3();
        zzb = c3408h3;
        AbstractC3406h1.C(C3408h3.class, c3408h3);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC3406h1
    public final Object I(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC3406h1.z(zzb, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0002\u0000\u0001᠌\u0000\u0002\u001b\u0003င\u0001\u0004ဉ\u0002\u0005ဈ\u0003\u0006᠌\u0004\u0007᠌\u0005\b'\tဈ\u0006\n᠌\u0007", new Object[]{"zzd", "zze", C3383c3.f29841a, "zzf", C3378b3.class, "zzg", "zzh", "zzi", "zzj", C3393e3.f29849a, "zzk", C3398f3.f29852a, "zzl", "zzm", "zzn", C3403g3.f29858a});
        }
        if (i11 == 3) {
            return new C3408h3();
        }
        G2 g22 = null;
        if (i11 == 4) {
            return new C3388d3(g22);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
