package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class L4 extends O2 implements InterfaceC3574m3 {
    private static final L4 zzb;
    private int zzd;
    private int zze = 0;
    private Object zzf;
    private C3622u4 zzg;
    private C3640x4 zzh;

    static {
        L4 l42 = new L4();
        zzb = l42;
        O2.z(L4.class, l42);
    }

    public static /* synthetic */ void D(L4 l42, Y3 y32) {
        l42.zzf = y32;
        l42.zze = 2;
    }

    public static /* synthetic */ void E(L4 l42, C3521d4 c3521d4) {
        l42.zzf = c3521d4;
        l42.zze = 3;
    }

    public static /* synthetic */ void F(L4 l42, C3569l4 c3569l4) {
        c3569l4.getClass();
        l42.zzf = c3569l4;
        l42.zze = 7;
    }

    public static /* synthetic */ void G(L4 l42, C3622u4 c3622u4) {
        c3622u4.getClass();
        l42.zzg = c3622u4;
        l42.zzd |= 1;
    }

    public static /* synthetic */ void H(L4 l42, R4 r42) {
        r42.getClass();
        l42.zzf = r42;
        l42.zze = 8;
    }

    public static /* synthetic */ void I(L4 l42, V4 v42) {
        l42.zzf = v42;
        l42.zze = 4;
    }

    public static J4 J() {
        return (J4) zzb.n();
    }

    @Override // com.google.android.gms.internal.play_billing.O2
    public final Object l(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return O2.w(zzb, "\u0004\b\u0001\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဉ\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006ဉ\u0001\u0007<\u0000\b<\u0000", new Object[]{"zzf", "zze", "zzd", "zzg", Y3.class, C3521d4.class, V4.class, C3604r4.class, "zzh", C3569l4.class, R4.class});
        }
        if (i11 == 3) {
            return new L4();
        }
        K4 k42 = null;
        if (i11 == 4) {
            return new J4(k42);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
