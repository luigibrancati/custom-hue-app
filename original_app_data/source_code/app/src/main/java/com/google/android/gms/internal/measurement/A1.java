package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class A1 extends AbstractC3148a5 implements D5 {
    private static final A1 zzh;
    private int zzb;
    private K1 zzd;
    private E1 zze;
    private boolean zzf;
    private String zzg = "";

    static {
        A1 a12 = new A1();
        zzh = a12;
        AbstractC3148a5.t(A1.class, a12);
    }

    public static A1 L() {
        return zzh;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC3148a5
    public final Object C(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC3148a5.u(zzh, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဇ\u0002\u0004ဈ\u0003", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg"});
        }
        if (i11 == 3) {
            return new A1();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new C3363z1(bArr);
        }
        if (i11 == 5) {
            return zzh;
        }
        throw null;
    }

    public final boolean D() {
        return (this.zzb & 1) != 0;
    }

    public final K1 E() {
        K1 k12 = this.zzd;
        return k12 == null ? K1.K() : k12;
    }

    public final boolean F() {
        return (this.zzb & 2) != 0;
    }

    public final E1 G() {
        E1 e12 = this.zze;
        return e12 == null ? E1.M() : e12;
    }

    public final boolean H() {
        return (this.zzb & 4) != 0;
    }

    public final boolean I() {
        return this.zzf;
    }

    public final boolean J() {
        return (this.zzb & 8) != 0;
    }

    public final String K() {
        return this.zzg;
    }

    public final /* synthetic */ void M(String str) {
        this.zzb |= 8;
        this.zzg = str;
    }
}
