package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.d4, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C3521d4 extends O2 implements InterfaceC3574m3 {
    private static final C3521d4 zzb;
    private int zzd;
    private int zze = 0;
    private Object zzf;
    private int zzg;

    static {
        C3521d4 c3521d4 = new C3521d4();
        zzb = c3521d4;
        O2.z(C3521d4.class, c3521d4);
    }

    public static /* synthetic */ void D(C3521d4 c3521d4, C4 c42) {
        c42.getClass();
        c3521d4.zzf = c42;
        c3521d4.zze = 2;
    }

    public static /* synthetic */ void E(C3521d4 c3521d4, Y4 y42) {
        y42.getClass();
        c3521d4.zzf = y42;
        c3521d4.zze = 3;
    }

    public static /* synthetic */ void F(C3521d4 c3521d4, int i10) {
        c3521d4.zzg = i10 - 1;
        c3521d4.zzd |= 1;
    }

    public static C3509b4 G() {
        return (C3509b4) zzb.n();
    }

    @Override // com.google.android.gms.internal.play_billing.O2
    public final Object l(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return O2.w(zzb, "\u0004\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000", new Object[]{"zzf", "zze", "zzd", "zzg", C3503a4.f30125a, C4.class, Y4.class, I4.class});
        }
        if (i11 == 3) {
            return new C3521d4();
        }
        AbstractC3515c4 abstractC3515c4 = null;
        if (i11 == 4) {
            return new C3509b4(abstractC3515c4);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
