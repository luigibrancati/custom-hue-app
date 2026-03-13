package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class L2 extends AbstractC3148a5 implements D5 {
    private static final L2 zzf;
    private int zzb;
    private int zzd;
    private long zze;

    static {
        L2 l22 = new L2();
        zzf = l22;
        AbstractC3148a5.t(L2.class, l22);
    }

    public static K2 H() {
        return (K2) zzf.p();
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC3148a5
    public final Object C(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC3148a5.u(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဂ\u0001", new Object[]{"zzb", "zzd", "zze"});
        }
        if (i11 == 3) {
            return new L2();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new K2(bArr);
        }
        if (i11 == 5) {
            return zzf;
        }
        throw null;
    }

    public final boolean D() {
        return (this.zzb & 1) != 0;
    }

    public final int E() {
        return this.zzd;
    }

    public final boolean F() {
        return (this.zzb & 2) != 0;
    }

    public final long G() {
        return this.zze;
    }

    public final /* synthetic */ void I(int i10) {
        this.zzb |= 1;
        this.zzd = i10;
    }

    public final /* synthetic */ void J(long j10) {
        this.zzb |= 2;
        this.zze = j10;
    }
}
