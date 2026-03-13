package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class Y3 extends O2 implements InterfaceC3574m3 {
    private static final Y3 zzb;
    private int zzd;
    private int zze = 0;
    private Object zzf;
    private int zzg;
    private C3551i4 zzh;

    static {
        Y3 y32 = new Y3();
        zzb = y32;
        O2.z(Y3.class, y32);
    }

    public static Y3 D(byte[] bArr, B2 b22) {
        return (Y3) O2.s(zzb, bArr, b22);
    }

    public static /* synthetic */ void E(Y3 y32, C3551i4 c3551i4) {
        c3551i4.getClass();
        y32.zzh = c3551i4;
        y32.zzd |= 2;
    }

    public static /* synthetic */ void F(Y3 y32, C4 c42) {
        c42.getClass();
        y32.zzf = c42;
        y32.zze = 4;
    }

    public static /* synthetic */ void G(Y3 y32, int i10) {
        y32.zzg = i10 - 1;
        y32.zzd |= 1;
    }

    public static W3 H() {
        return (W3) zzb.n();
    }

    @Override // com.google.android.gms.internal.play_billing.O2
    public final Object l(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return O2.w(zzb, "\u0004\u0003\u0001\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0004<\u0000", new Object[]{"zzf", "zze", "zzd", "zzg", C3503a4.f30125a, "zzh", C4.class});
        }
        if (i11 == 3) {
            return new Y3();
        }
        X3 x32 = null;
        if (i11 == 4) {
            return new W3(x32);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
