package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.q3, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C3290q3 extends AbstractC3148a5 implements D5 {
    private static final C3290q3 zzj;
    private int zzb;
    private long zzd;
    private String zze = "";
    private String zzf = "";
    private long zzg;
    private float zzh;
    private double zzi;

    static {
        C3290q3 c3290q3 = new C3290q3();
        zzj = c3290q3;
        AbstractC3148a5.t(C3290q3.class, c3290q3);
    }

    public static C3281p3 O() {
        return (C3281p3) zzj.p();
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC3148a5
    public final Object C(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC3148a5.u(zzj, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ခ\u0004\u0006က\u0005", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (i11 == 3) {
            return new C3290q3();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new C3281p3(bArr);
        }
        if (i11 == 5) {
            return zzj;
        }
        throw null;
    }

    public final boolean D() {
        return (this.zzb & 1) != 0;
    }

    public final long E() {
        return this.zzd;
    }

    public final String F() {
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

    public final long J() {
        return this.zzg;
    }

    public final boolean K() {
        return (this.zzb & 16) != 0;
    }

    public final float L() {
        return this.zzh;
    }

    public final boolean M() {
        return (this.zzb & 32) != 0;
    }

    public final double N() {
        return this.zzi;
    }

    public final /* synthetic */ void P(long j10) {
        this.zzb |= 1;
        this.zzd = j10;
    }

    public final /* synthetic */ void Q(String str) {
        str.getClass();
        this.zzb |= 2;
        this.zze = str;
    }

    public final /* synthetic */ void R(String str) {
        str.getClass();
        this.zzb |= 4;
        this.zzf = str;
    }

    public final /* synthetic */ void S() {
        this.zzb &= -5;
        this.zzf = zzj.zzf;
    }

    public final /* synthetic */ void T(long j10) {
        this.zzb |= 8;
        this.zzg = j10;
    }

    public final /* synthetic */ void U() {
        this.zzb &= -9;
        this.zzg = 0L;
    }

    public final /* synthetic */ void V(double d10) {
        this.zzb |= 32;
        this.zzi = d10;
    }

    public final /* synthetic */ void W() {
        this.zzb &= -33;
        this.zzi = 0.0d;
    }
}
