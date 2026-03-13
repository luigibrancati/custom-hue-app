package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class W1 extends O2 implements InterfaceC3574m3 {
    private static final W1 zzb;
    private int zzd;
    private String zze = "";

    static {
        W1 w12 = new W1();
        zzb = w12;
        O2.z(W1.class, w12);
    }

    public static V1 C() {
        return (V1) zzb.n();
    }

    public static /* synthetic */ void E(W1 w12, String str) {
        w12.zzd |= 1;
        w12.zze = str;
    }

    @Override // com.google.android.gms.internal.play_billing.O2
    public final Object l(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return O2.w(zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"zzd", "zze"});
        }
        if (i11 == 3) {
            return new W1();
        }
        X1 x12 = null;
        if (i11 == 4) {
            return new V1(x12);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
