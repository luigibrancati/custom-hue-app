package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class E1 extends AbstractC3148a5 implements D5 {
    private static final E1 zzi;
    private int zzb;
    private int zzd;
    private boolean zze;
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";

    static {
        E1 e12 = new E1();
        zzi = e12;
        AbstractC3148a5.t(E1.class, e12);
    }

    public static E1 M() {
        return zzi;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC3148a5
    public final Object C(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC3148a5.u(zzi, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004", new Object[]{"zzb", "zzd", C1.f29149a, "zze", "zzf", "zzg", "zzh"});
        }
        if (i11 == 3) {
            return new E1();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new B1(bArr);
        }
        if (i11 == 5) {
            return zzi;
        }
        throw null;
    }

    public final boolean D() {
        return (this.zzb & 1) != 0;
    }

    public final boolean E() {
        return (this.zzb & 2) != 0;
    }

    public final boolean F() {
        return this.zze;
    }

    public final boolean G() {
        return (this.zzb & 4) != 0;
    }

    public final String H() {
        return this.zzf;
    }

    public final boolean I() {
        return (this.zzb & 8) != 0;
    }

    public final String J() {
        return this.zzg;
    }

    public final boolean K() {
        return (this.zzb & 16) != 0;
    }

    public final String L() {
        return this.zzh;
    }

    public final int O() {
        int iA = D1.a(this.zzd);
        if (iA == 0) {
            return 1;
        }
        return iA;
    }
}
