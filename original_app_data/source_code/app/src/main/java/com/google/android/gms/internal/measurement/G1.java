package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class G1 extends AbstractC3148a5 implements D5 {
    private static final G1 zzj;
    private int zzb;
    private int zzd;
    private String zze = "";
    private A1 zzf;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;

    static {
        G1 g12 = new G1();
        zzj = g12;
        AbstractC3148a5.t(G1.class, g12);
    }

    public static F1 L() {
        return (F1) zzj.p();
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC3148a5
    public final Object C(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC3148a5.u(zzj, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (i11 == 3) {
            return new G1();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new F1(bArr);
        }
        if (i11 == 5) {
            return zzj;
        }
        throw null;
    }

    public final boolean D() {
        return (this.zzb & 1) != 0;
    }

    public final int E() {
        return this.zzd;
    }

    public final String F() {
        return this.zze;
    }

    public final A1 G() {
        A1 a12 = this.zzf;
        return a12 == null ? A1.L() : a12;
    }

    public final boolean H() {
        return this.zzg;
    }

    public final boolean I() {
        return this.zzh;
    }

    public final boolean J() {
        return (this.zzb & 32) != 0;
    }

    public final boolean K() {
        return this.zzi;
    }

    public final /* synthetic */ void M(String str) {
        this.zzb |= 2;
        this.zze = str;
    }
}
