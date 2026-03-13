package com.google.android.gms.internal.measurement;

import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.v2, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C3332v2 extends AbstractC3148a5 implements D5 {
    private static final C3332v2 zzn;
    private int zzb;
    private long zzg;
    private long zzk;
    private C3343w5 zzl = C3343w5.a();
    private C3343w5 zzm = C3343w5.a();
    private String zzd = "";
    private String zze = "";
    private String zzf = "";
    private String zzh = "";
    private String zzi = "";
    private String zzj = "";

    static {
        C3332v2 c3332v2 = new C3332v2();
        zzn = c3332v2;
        AbstractC3148a5.t(C3332v2.class, c3332v2);
    }

    public static C3297r2 e0() {
        return (C3297r2) zzn.p();
    }

    public static C3332v2 f0() {
        return zzn;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC3148a5
    public final Object C(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC3148a5.u(zzn, "\u0004\n\u0000\u0001\u0001\n\n\u0002\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006\bဂ\u0007\t2\n2", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", AbstractC3306s2.f29603a, "zzm", AbstractC3315t2.f29609a});
        }
        if (i11 == 3) {
            return new C3332v2();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new C3297r2(bArr);
        }
        if (i11 == 5) {
            return zzn;
        }
        throw null;
    }

    public final /* synthetic */ void D(String str) {
        this.zzb |= 16;
        this.zzh = str;
    }

    public final /* synthetic */ void E() {
        this.zzb &= -17;
        this.zzh = zzn.zzh;
    }

    public final /* synthetic */ void F(String str) {
        this.zzb |= 32;
        this.zzi = str;
    }

    public final /* synthetic */ void G() {
        this.zzb &= -33;
        this.zzi = zzn.zzi;
    }

    public final /* synthetic */ void H(String str) {
        this.zzb |= 64;
        this.zzj = str;
    }

    public final /* synthetic */ void I() {
        this.zzb &= -65;
        this.zzj = zzn.zzj;
    }

    public final /* synthetic */ void J(long j10) {
        this.zzb |= 128;
        this.zzk = j10;
    }

    public final /* synthetic */ Map K() {
        if (!this.zzl.j()) {
            this.zzl = this.zzl.g();
        }
        return this.zzl;
    }

    public final /* synthetic */ Map L() {
        if (!this.zzm.j()) {
            this.zzm = this.zzm.g();
        }
        return this.zzm;
    }

    public final boolean N() {
        return (this.zzb & 1) != 0;
    }

    public final String O() {
        return this.zzd;
    }

    public final boolean P() {
        return (this.zzb & 2) != 0;
    }

    public final String Q() {
        return this.zze;
    }

    public final boolean R() {
        return (this.zzb & 4) != 0;
    }

    public final String S() {
        return this.zzf;
    }

    public final boolean T() {
        return (this.zzb & 8) != 0;
    }

    public final long U() {
        return this.zzg;
    }

    public final boolean V() {
        return (this.zzb & 16) != 0;
    }

    public final String W() {
        return this.zzh;
    }

    public final boolean X() {
        return (this.zzb & 32) != 0;
    }

    public final String Z() {
        return this.zzi;
    }

    public final boolean a0() {
        return (this.zzb & 64) != 0;
    }

    public final String b0() {
        return this.zzj;
    }

    public final boolean c0() {
        return (this.zzb & 128) != 0;
    }

    public final long d0() {
        return this.zzk;
    }

    public final /* synthetic */ void g0(String str) {
        this.zzb |= 1;
        this.zzd = str;
    }

    public final /* synthetic */ void h0() {
        this.zzb &= -2;
        this.zzd = zzn.zzd;
    }

    public final /* synthetic */ void i0(String str) {
        this.zzb |= 2;
        this.zze = str;
    }

    public final /* synthetic */ void j0() {
        this.zzb &= -3;
        this.zze = zzn.zze;
    }

    public final /* synthetic */ void k0(String str) {
        this.zzb |= 4;
        this.zzf = str;
    }

    public final /* synthetic */ void l0() {
        this.zzb &= -5;
        this.zzf = zzn.zzf;
    }

    public final /* synthetic */ void m0(long j10) {
        this.zzb |= 8;
        this.zzg = j10;
    }
}
