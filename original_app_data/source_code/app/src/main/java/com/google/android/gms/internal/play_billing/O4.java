package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class O4 extends O2 implements InterfaceC3574m3 {
    private static final O4 zzb;
    private int zzd;
    private int zzf;
    private S2 zze = O2.u();
    private String zzg = "";

    static {
        O4 o42 = new O4();
        zzb = o42;
        O2.z(O4.class, o42);
    }

    @Override // com.google.android.gms.internal.play_billing.O2
    public final Object l(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return O2.w(zzb, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001a\u0002င\u0000\u0003ဈ\u0001", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i11 == 3) {
            return new O4();
        }
        N4 n42 = null;
        if (i11 == 4) {
            return new M4(n42);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
