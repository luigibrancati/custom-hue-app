package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class Y4 extends O2 implements InterfaceC3574m3 {
    private static final Y4 zzb;
    private int zzd;
    private int zze;
    private boolean zzf;

    static {
        Y4 y42 = new Y4();
        zzb = y42;
        O2.z(Y4.class, y42);
    }

    public static /* synthetic */ void D(Y4 y42, boolean z10) {
        y42.zzd |= 2;
        y42.zzf = true;
    }

    public static W4 E() {
        return (W4) zzb.n();
    }

    @Override // com.google.android.gms.internal.play_billing.O2
    public final Object l(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return O2.w(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဇ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i11 == 3) {
            return new Y4();
        }
        X4 x42 = null;
        if (i11 == 4) {
            return new W4(x42);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
