package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class R4 extends O2 implements InterfaceC3574m3 {
    private static final R4 zzb;
    private int zzd;
    private C3551i4 zze;

    static {
        R4 r42 = new R4();
        zzb = r42;
        O2.z(R4.class, r42);
    }

    public static /* synthetic */ void D(R4 r42, C3551i4 c3551i4) {
        c3551i4.getClass();
        r42.zze = c3551i4;
        r42.zzd |= 1;
    }

    public static P4 E() {
        return (P4) zzb.n();
    }

    @Override // com.google.android.gms.internal.play_billing.O2
    public final Object l(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return O2.w(zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"zzd", "zze"});
        }
        if (i11 == 3) {
            return new R4();
        }
        Q4 q42 = null;
        if (i11 == 4) {
            return new P4(q42);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
