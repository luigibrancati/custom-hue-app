package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class Z1 extends AbstractC3148a5 implements D5 {
    private static final Z1 zzi;
    private int zzb;
    private boolean zzg;
    private InterfaceC3202g5 zzd = AbstractC3148a5.z();
    private InterfaceC3202g5 zze = AbstractC3148a5.z();
    private InterfaceC3202g5 zzf = AbstractC3148a5.z();
    private InterfaceC3202g5 zzh = AbstractC3148a5.z();

    static {
        Z1 z12 = new Z1();
        zzi = z12;
        AbstractC3148a5.t(Z1.class, z12);
    }

    public static Z1 J() {
        return zzi;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC3148a5
    public final Object C(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC3148a5.u(zzi, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0004\u0000\u0001\u001b\u0002\u001b\u0003\u001b\u0004ဇ\u0000\u0005\u001b", new Object[]{"zzb", "zzd", N1.class, "zze", P1.class, "zzf", W1.class, "zzg", "zzh", N1.class});
        }
        if (i11 == 3) {
            return new Z1();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new L1(bArr);
        }
        if (i11 == 5) {
            return zzi;
        }
        throw null;
    }

    public final List D() {
        return this.zzd;
    }

    public final List E() {
        return this.zze;
    }

    public final List F() {
        return this.zzf;
    }

    public final boolean G() {
        return (this.zzb & 1) != 0;
    }

    public final boolean H() {
        return this.zzg;
    }

    public final List I() {
        return this.zzh;
    }
}
