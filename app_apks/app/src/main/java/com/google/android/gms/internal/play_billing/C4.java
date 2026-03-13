package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C4 extends O2 implements InterfaceC3574m3 {
    private static final C4 zzb;
    private int zzd;
    private int zze;

    static {
        C4 c42 = new C4();
        zzb = c42;
        O2.z(C4.class, c42);
    }

    public static /* synthetic */ void D(C4 c42, int i10) {
        c42.zze = i10 - 1;
        c42.zzd |= 1;
    }

    public static C3646y4 E() {
        return (C3646y4) zzb.n();
    }

    @Override // com.google.android.gms.internal.play_billing.O2
    public final Object l(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return O2.w(zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"zzd", "zze", C3652z4.f30279a});
        }
        if (i11 == 3) {
            return new C4();
        }
        B4 b42 = null;
        if (i11 == 4) {
            return new C3646y4(b42);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
