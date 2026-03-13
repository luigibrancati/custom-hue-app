package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class R2 extends AbstractC3148a5 implements D5 {
    private static final R2 zzj;
    private int zzb;
    private long zzf;
    private float zzg;
    private double zzh;
    private String zzd = "";
    private String zze = "";
    private InterfaceC3202g5 zzi = AbstractC3148a5.z();

    static {
        R2 r22 = new R2();
        zzj = r22;
        AbstractC3148a5.t(R2.class, r22);
    }

    public static Q2 P() {
        return (Q2) zzj.p();
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC3148a5
    public final Object C(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC3148a5.u(zzj, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ခ\u0003\u0005က\u0004\u0006\u001b", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", R2.class});
        }
        if (i11 == 3) {
            return new R2();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new Q2(bArr);
        }
        if (i11 == 5) {
            return zzj;
        }
        throw null;
    }

    public final boolean D() {
        return (this.zzb & 1) != 0;
    }

    public final String E() {
        return this.zzd;
    }

    public final boolean F() {
        return (this.zzb & 2) != 0;
    }

    public final String G() {
        return this.zze;
    }

    public final boolean H() {
        return (this.zzb & 4) != 0;
    }

    public final long I() {
        return this.zzf;
    }

    public final boolean J() {
        return (this.zzb & 8) != 0;
    }

    public final float K() {
        return this.zzg;
    }

    public final boolean L() {
        return (this.zzb & 16) != 0;
    }

    public final double M() {
        return this.zzh;
    }

    public final List N() {
        return this.zzi;
    }

    public final int O() {
        return this.zzi.size();
    }

    public final /* synthetic */ void Q(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zzd = str;
    }

    public final /* synthetic */ void R(String str) {
        str.getClass();
        this.zzb |= 2;
        this.zze = str;
    }

    public final /* synthetic */ void S() {
        this.zzb &= -3;
        this.zze = zzj.zze;
    }

    public final /* synthetic */ void T(long j10) {
        this.zzb |= 4;
        this.zzf = j10;
    }

    public final /* synthetic */ void U() {
        this.zzb &= -5;
        this.zzf = 0L;
    }

    public final /* synthetic */ void V(double d10) {
        this.zzb |= 16;
        this.zzh = d10;
    }

    public final /* synthetic */ void W() {
        this.zzb &= -17;
        this.zzh = 0.0d;
    }

    public final /* synthetic */ void X(R2 r22) {
        r22.getClass();
        c0();
        this.zzi.add(r22);
    }

    public final /* synthetic */ void Z(Iterable iterable) {
        c0();
        AbstractC3282p4.d(iterable, this.zzi);
    }

    public final /* synthetic */ void a0() {
        this.zzi = AbstractC3148a5.z();
    }

    public final void c0() {
        InterfaceC3202g5 interfaceC3202g5 = this.zzi;
        if (interfaceC3202g5.zza()) {
            return;
        }
        this.zzi = AbstractC3148a5.A(interfaceC3202g5);
    }
}
