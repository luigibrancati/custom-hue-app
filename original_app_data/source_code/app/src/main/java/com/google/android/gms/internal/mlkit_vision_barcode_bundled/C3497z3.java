package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* JADX INFO: renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.z3, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C3497z3 extends AbstractC3406h1 implements K1 {
    private static final C3497z3 zzb;
    private int zzd;
    private int zzg;
    private g4 zzh;
    private b4 zzi;
    private V3 zzj;
    private int zzk;
    private byte zzm = 2;
    private int zze = 17;
    private InterfaceC3441o1 zzf = AbstractC3406h1.r();
    private InterfaceC3441o1 zzl = AbstractC3406h1.r();

    static {
        C3497z3 c3497z3 = new C3497z3();
        zzb = c3497z3;
        AbstractC3406h1.C(C3497z3.class, c3497z3);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC3406h1
    public final Object I(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return Byte.valueOf(this.zzm);
        }
        if (i11 == 2) {
            return AbstractC3406h1.z(zzb, "\u0001\b\u0000\u0001\u0001\u000f\b\u0000\u0002\u0004\u0001᠌\u0000\u0003Л\u0004င\u0001\u0005ᐉ\u0002\u0006ᐉ\u0003\u0007င\u0005\b\u001b\u000fᐉ\u0004", new Object[]{"zzd", "zze", Y2.f29825a, "zzf", C3409i.class, "zzg", "zzh", "zzi", "zzk", "zzl", C3424l.class, "zzj"});
        }
        if (i11 == 3) {
            return new C3497z3();
        }
        X1 x12 = null;
        if (i11 == 4) {
            return new C3486x2(x12);
        }
        if (i11 == 5) {
            return zzb;
        }
        this.zzm = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
