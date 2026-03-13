package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class R1 extends O2 implements InterfaceC3574m3 {
    private static final R1 zzb;
    private int zzd;
    private W1 zze;
    private W1 zzf;
    private int zzg;

    static {
        R1 r12 = new R1();
        zzb = r12;
        O2.z(R1.class, r12);
    }

    public static Q1 C() {
        return (Q1) zzb.n();
    }

    public static /* synthetic */ void E(R1 r12, W1 w12) {
        w12.getClass();
        r12.zze = w12;
        r12.zzd |= 1;
    }

    @Override // com.google.android.gms.internal.play_billing.O2
    public final Object l(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return O2.w(zzb, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003᠌\u0002", new Object[]{"zzd", "zze", "zzf", "zzg", Z1.a()});
        }
        if (i11 == 3) {
            return new R1();
        }
        U1 u12 = null;
        if (i11 == 4) {
            return new Q1(u12);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
