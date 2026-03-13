package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class B2 extends AbstractC3148a5 implements D5 {
    private static final B2 zzh;
    private int zzb;
    private int zzd;
    private C3182e3 zze;
    private C3182e3 zzf;
    private boolean zzg;

    static {
        B2 b22 = new B2();
        zzh = b22;
        AbstractC3148a5.t(B2.class, b22);
    }

    public static A2 K() {
        return (A2) zzh.p();
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC3148a5
    public final Object C(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC3148a5.u(zzh, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဇ\u0003", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg"});
        }
        if (i11 == 3) {
            return new B2();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new A2(bArr);
        }
        if (i11 == 5) {
            return zzh;
        }
        throw null;
    }

    public final boolean D() {
        return (this.zzb & 1) != 0;
    }

    public final int E() {
        return this.zzd;
    }

    public final C3182e3 F() {
        C3182e3 c3182e3 = this.zze;
        return c3182e3 == null ? C3182e3.M() : c3182e3;
    }

    public final boolean G() {
        return (this.zzb & 4) != 0;
    }

    public final C3182e3 H() {
        C3182e3 c3182e3 = this.zzf;
        return c3182e3 == null ? C3182e3.M() : c3182e3;
    }

    public final boolean I() {
        return (this.zzb & 8) != 0;
    }

    public final boolean J() {
        return this.zzg;
    }

    public final /* synthetic */ void L(int i10) {
        this.zzb |= 1;
        this.zzd = i10;
    }

    public final /* synthetic */ void M(C3182e3 c3182e3) {
        c3182e3.getClass();
        this.zze = c3182e3;
        this.zzb |= 2;
    }

    public final /* synthetic */ void N(C3182e3 c3182e3) {
        this.zzf = c3182e3;
        this.zzb |= 4;
    }

    public final /* synthetic */ void O(boolean z10) {
        this.zzb |= 8;
        this.zzg = z10;
    }
}
