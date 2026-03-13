package com.google.android.gms.internal.measurement;

import com.google.android.libraries.barhopper.RecognitionOptions;
import com.google.ar.core.ImageMetadata;
import io.sentry.ProfileChunk;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class Z2 extends AbstractC3148a5 implements D5 {
    private static final Z2 zzat;
    private int zzA;
    private boolean zzD;
    private int zzG;
    private int zzH;
    private int zzI;
    private long zzK;
    private long zzL;
    private int zzO;
    private C3164c3 zzQ;
    private long zzS;
    private long zzT;
    private int zzW;
    private boolean zzX;
    private boolean zzZ;
    private T2 zzaa;
    private long zzae;
    private boolean zzaf;
    private boolean zzah;
    private int zzaj;
    private C3364z2 zzal;
    private int zzam;
    private C3332v2 zzan;
    private C3272o3 zzap;
    private long zzaq;
    private J2 zzas;
    private int zzb;
    private int zzd;
    private int zze;
    private long zzh;
    private long zzi;
    private long zzj;
    private long zzk;
    private long zzl;
    private int zzq;
    private long zzu;
    private long zzv;
    private boolean zzx;
    private long zzz;
    private InterfaceC3202g5 zzf = AbstractC3148a5.z();
    private InterfaceC3202g5 zzg = AbstractC3148a5.z();
    private String zzm = "";
    private String zzn = "";
    private String zzo = "";
    private String zzp = "";
    private String zzr = "";
    private String zzs = "";
    private String zzt = "";
    private String zzw = "";
    private String zzy = "";
    private String zzB = "";
    private String zzC = "";
    private InterfaceC3202g5 zzE = AbstractC3148a5.z();
    private String zzF = "";
    private String zzJ = "";
    private String zzM = "";
    private String zzN = "";
    private String zzP = "";
    private InterfaceC3184e5 zzR = AbstractC3148a5.w();
    private String zzU = "";
    private String zzV = "";
    private String zzY = "";
    private String zzab = "";
    private InterfaceC3202g5 zzac = AbstractC3148a5.z();
    private String zzad = "";
    private String zzag = "";
    private String zzai = "";
    private String zzak = "";
    private String zzao = "";
    private String zzar = "";

    static {
        Z2 z22 = new Z2();
        zzat = z22;
        AbstractC3148a5.t(Z2.class, z22);
    }

    public static Y2 j0() {
        return (Y2) zzat.p();
    }

    public static Y2 k0(Z2 z22) {
        X4 x4P = zzat.p();
        x4P.x(z22);
        return (Y2) x4P;
    }

    public final /* synthetic */ void A0() {
        this.zzb &= -17;
        this.zzk = 0L;
    }

    public final /* synthetic */ void A1(int i10) {
        this.zzd |= ImageMetadata.SHADING_MODE;
        this.zzaj = i10;
    }

    public final long A2() {
        return this.zzl;
    }

    public final /* synthetic */ void B0(long j10) {
        this.zzb |= 32;
        this.zzl = j10;
    }

    public final /* synthetic */ void B1(C3364z2 c3364z2) {
        c3364z2.getClass();
        this.zzal = c3364z2;
        this.zzd |= 4194304;
    }

    public final String B2() {
        return this.zzm;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC3148a5
    public final Object C(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC3148a5.u(zzat, "\u0004C\u0000\u0002\u0001VC\u0000\u0005\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဂ\u0001\u0005ဂ\u0002\u0006ဂ\u0003\u0007ဂ\u0005\bဈ\u0006\tဈ\u0007\nဈ\b\u000bဈ\t\fင\n\rဈ\u000b\u000eဈ\f\u0010ဈ\r\u0011ဂ\u000e\u0012ဂ\u000f\u0013ဈ\u0010\u0014ဇ\u0011\u0015ဈ\u0012\u0016ဂ\u0013\u0017င\u0014\u0018ဈ\u0015\u0019ဈ\u0016\u001aဂ\u0004\u001cဇ\u0017\u001d\u001b\u001eဈ\u0018\u001fင\u0019 င\u001a!င\u001b\"ဈ\u001c#ဂ\u001d$ဂ\u001e%ဈ\u001f&ဈ 'င!)ဈ\",ဉ#-\u001d.ဂ$/ဂ%2ဈ&4ဈ'5᠌(7ဇ)9ဈ*:ဇ+;ဉ,?ဈ-@\u001aAဈ.Cဂ/Dဇ0Gဈ1Hဇ2Iဈ3Jင4Kဈ5Lဉ6Mင7Oဉ8Pဈ9Qဉ:Rဂ;Sဈ<Vဉ=", new Object[]{"zzb", "zzd", "zze", "zzf", N2.class, "zzg", C3290q3.class, "zzh", "zzi", "zzj", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzA", "zzB", "zzC", "zzk", "zzD", "zzE", B2.class, "zzF", "zzG", "zzH", "zzI", "zzJ", "zzK", "zzL", "zzM", "zzN", "zzO", "zzP", "zzQ", "zzR", "zzS", "zzT", "zzU", "zzV", "zzW", C3289q2.f29585a, "zzX", "zzY", "zzZ", "zzaa", "zzab", "zzac", "zzad", "zzae", "zzaf", "zzag", "zzah", "zzai", "zzaj", "zzak", "zzal", "zzam", "zzan", "zzao", "zzap", "zzaq", "zzar", "zzas"});
        }
        if (i11 == 3) {
            return new Z2();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new Y2(bArr);
        }
        if (i11 == 5) {
            return zzat;
        }
        throw null;
    }

    public final /* synthetic */ void C0() {
        this.zzb &= -33;
        this.zzl = 0L;
    }

    public final /* synthetic */ void C1(int i10) {
        this.zzd |= 8388608;
        this.zzam = i10;
    }

    public final String C2() {
        return this.zzn;
    }

    public final String D() {
        return this.zzs;
    }

    public final /* synthetic */ void D0(String str) {
        this.zzb |= 64;
        this.zzm = ProfileChunk.PLATFORM_ANDROID;
    }

    public final /* synthetic */ void D1(C3332v2 c3332v2) {
        c3332v2.getClass();
        this.zzan = c3332v2;
        this.zzd |= 16777216;
    }

    public final String D2() {
        return this.zzo;
    }

    public final String E() {
        return this.zzt;
    }

    public final /* synthetic */ void E0(String str) {
        str.getClass();
        this.zzb |= 128;
        this.zzn = str;
    }

    public final /* synthetic */ void E1(C3272o3 c3272o3) {
        this.zzap = c3272o3;
        this.zzd |= 67108864;
    }

    public final String E2() {
        return this.zzp;
    }

    public final boolean F() {
        return (this.zzb & 16384) != 0;
    }

    public final boolean F0() {
        return (this.zzd & 2) != 0;
    }

    public final /* synthetic */ void F1(long j10) {
        this.zzd |= 134217728;
        this.zzaq = j10;
    }

    public final boolean F2() {
        return (this.zzb & RecognitionOptions.UPC_E) != 0;
    }

    public final long G() {
        return this.zzu;
    }

    public final int G0() {
        return this.zzO;
    }

    public final /* synthetic */ void G1(String str) {
        this.zzd |= 268435456;
        this.zzar = "";
    }

    public final int G2() {
        return this.zzq;
    }

    public final boolean H() {
        return (this.zzb & 32768) != 0;
    }

    public final boolean H0() {
        return (this.zzd & 16) != 0;
    }

    public final /* synthetic */ void H1(J2 j22) {
        j22.getClass();
        this.zzas = j22;
        this.zzd |= 536870912;
    }

    public final String H2() {
        return this.zzr;
    }

    public final long I() {
        return this.zzv;
    }

    public final long I0() {
        return this.zzS;
    }

    public final /* synthetic */ void I1(String str) {
        str.getClass();
        this.zzb |= 256;
        this.zzo = str;
    }

    public final String J() {
        return this.zzw;
    }

    public final /* synthetic */ void J1() {
        this.zzb &= -257;
        this.zzo = zzat.zzo;
    }

    public final boolean K() {
        return (this.zzb & 131072) != 0;
    }

    public final boolean K0() {
        return (this.zzd & 128) != 0;
    }

    public final /* synthetic */ void K1(String str) {
        str.getClass();
        this.zzb |= 512;
        this.zzp = str;
    }

    public final boolean L() {
        return this.zzx;
    }

    public final String L0() {
        return this.zzV;
    }

    public final /* synthetic */ void L1(int i10) {
        this.zzb |= RecognitionOptions.UPC_E;
        this.zzq = i10;
    }

    public final String M() {
        return this.zzy;
    }

    public final /* synthetic */ void M1(String str) {
        str.getClass();
        this.zzb |= RecognitionOptions.PDF417;
        this.zzr = str;
    }

    public final boolean N() {
        return (this.zzb & ImageMetadata.LENS_APERTURE) != 0;
    }

    public final boolean N0() {
        return (this.zzd & 8192) != 0;
    }

    public final /* synthetic */ void N1(String str) {
        str.getClass();
        this.zzb |= RecognitionOptions.AZTEC;
        this.zzs = str;
    }

    public final long O() {
        return this.zzz;
    }

    public final String O0() {
        return this.zzab;
    }

    public final /* synthetic */ void O1(String str) {
        str.getClass();
        this.zzb |= 8192;
        this.zzt = str;
    }

    public final boolean P() {
        return (this.zzb & ImageMetadata.SHADING_MODE) != 0;
    }

    public final boolean P0() {
        return (this.zzd & 32768) != 0;
    }

    public final /* synthetic */ void P1(long j10) {
        this.zzb |= 16384;
        this.zzu = j10;
    }

    public final int Q() {
        return this.zzA;
    }

    public final long Q0() {
        return this.zzae;
    }

    public final /* synthetic */ void Q1(long j10) {
        this.zzb |= 32768;
        this.zzv = 133005L;
    }

    public final String R() {
        return this.zzB;
    }

    public final boolean R0() {
        return this.zzaf;
    }

    public final /* synthetic */ void R1(String str) {
        str.getClass();
        this.zzb |= ImageMetadata.CONTROL_AE_ANTIBANDING_MODE;
        this.zzw = str;
    }

    public final String S() {
        return this.zzC;
    }

    public final boolean S0() {
        return (this.zzd & 131072) != 0;
    }

    public final /* synthetic */ void S1() {
        this.zzb &= -65537;
        this.zzw = zzat.zzw;
    }

    public final boolean T() {
        return (this.zzb & 8388608) != 0;
    }

    public final String T0() {
        return this.zzag;
    }

    public final /* synthetic */ void T1(boolean z10) {
        this.zzb |= 131072;
        this.zzx = z10;
    }

    public final boolean U() {
        return this.zzD;
    }

    public final boolean U0() {
        return (this.zzd & 262144) != 0;
    }

    public final /* synthetic */ void U1() {
        this.zzb &= -131073;
        this.zzx = false;
    }

    public final List V() {
        return this.zzE;
    }

    public final boolean V0() {
        return this.zzah;
    }

    public final /* synthetic */ void V1(String str) {
        str.getClass();
        this.zzb |= 262144;
        this.zzy = str;
    }

    public final String W() {
        return this.zzF;
    }

    public final boolean W0() {
        return (this.zzd & ImageMetadata.LENS_APERTURE) != 0;
    }

    public final /* synthetic */ void W1() {
        this.zzb &= -262145;
        this.zzy = zzat.zzy;
    }

    public final boolean X() {
        return (this.zzb & 33554432) != 0;
    }

    public final String X0() {
        return this.zzai;
    }

    public final /* synthetic */ void X1(long j10) {
        this.zzb |= ImageMetadata.LENS_APERTURE;
        this.zzz = j10;
    }

    public final int Y0() {
        return this.zzaj;
    }

    public final /* synthetic */ void Y1(int i10) {
        this.zzb |= ImageMetadata.SHADING_MODE;
        this.zzA = i10;
    }

    public final int Z() {
        return this.zzG;
    }

    public final boolean Z0() {
        return (this.zzd & 4194304) != 0;
    }

    public final /* synthetic */ void Z1(String str) {
        this.zzb |= 2097152;
        this.zzB = str;
    }

    public final boolean a0() {
        return (this.zzb & 536870912) != 0;
    }

    public final C3364z2 a1() {
        C3364z2 c3364z2 = this.zzal;
        return c3364z2 == null ? C3364z2.L() : c3364z2;
    }

    public final /* synthetic */ void a2() {
        this.zzb &= -2097153;
        this.zzB = zzat.zzB;
    }

    public final long b0() {
        return this.zzK;
    }

    public final boolean b1() {
        return (this.zzd & 8388608) != 0;
    }

    public final /* synthetic */ void b2(String str) {
        str.getClass();
        this.zzb |= 4194304;
        this.zzC = str;
    }

    public final boolean c0() {
        return (this.zzb & Integer.MIN_VALUE) != 0;
    }

    public final int c1() {
        return this.zzam;
    }

    public final /* synthetic */ void c2(boolean z10) {
        this.zzb |= 8388608;
        this.zzD = z10;
    }

    public final String d0() {
        return this.zzM;
    }

    public final boolean d1() {
        return (this.zzd & 16777216) != 0;
    }

    public final /* synthetic */ void d2(Iterable iterable) {
        InterfaceC3202g5 interfaceC3202g5 = this.zzE;
        if (!interfaceC3202g5.zza()) {
            this.zzE = AbstractC3148a5.A(interfaceC3202g5);
        }
        AbstractC3282p4.d(iterable, this.zzE);
    }

    public final boolean e0() {
        return (this.zzb & 1) != 0;
    }

    public final C3332v2 e1() {
        C3332v2 c3332v2 = this.zzan;
        return c3332v2 == null ? C3332v2.f0() : c3332v2;
    }

    public final /* synthetic */ void e2() {
        this.zzE = AbstractC3148a5.z();
    }

    public final boolean f0() {
        return (this.zzd & 134217728) != 0;
    }

    public final boolean f1() {
        return (this.zzd & 67108864) != 0;
    }

    public final /* synthetic */ void f2(String str) {
        str.getClass();
        this.zzb |= 16777216;
        this.zzF = str;
    }

    public final long g0() {
        return this.zzaq;
    }

    public final C3272o3 g1() {
        C3272o3 c3272o3 = this.zzap;
        return c3272o3 == null ? C3272o3.F() : c3272o3;
    }

    public final /* synthetic */ void g2(int i10) {
        this.zzb |= 33554432;
        this.zzG = i10;
    }

    public final boolean h0() {
        return (this.zzd & 536870912) != 0;
    }

    public final int h1() {
        return this.zze;
    }

    public final /* synthetic */ void h2() {
        this.zzb &= -268435457;
        this.zzJ = zzat.zzJ;
    }

    public final J2 i0() {
        J2 j22 = this.zzas;
        return j22 == null ? J2.F() : j22;
    }

    public final /* synthetic */ void i1(long j10) {
        this.zzb |= 536870912;
        this.zzK = j10;
    }

    public final List i2() {
        return this.zzf;
    }

    public final /* synthetic */ void j1(String str) {
        str.getClass();
        this.zzb |= Integer.MIN_VALUE;
        this.zzM = str;
    }

    public final /* synthetic */ void k1() {
        this.zzb &= Integer.MAX_VALUE;
        this.zzM = zzat.zzM;
    }

    public final void k2() {
        InterfaceC3202g5 interfaceC3202g5 = this.zzf;
        if (interfaceC3202g5.zza()) {
            return;
        }
        this.zzf = AbstractC3148a5.A(interfaceC3202g5);
    }

    public final /* synthetic */ void l0(int i10) {
        this.zzb |= 1;
        this.zze = 1;
    }

    public final /* synthetic */ void l1(int i10) {
        this.zzd |= 2;
        this.zzO = i10;
    }

    public final void l2() {
        InterfaceC3202g5 interfaceC3202g5 = this.zzg;
        if (interfaceC3202g5.zza()) {
            return;
        }
        this.zzg = AbstractC3148a5.A(interfaceC3202g5);
    }

    public final /* synthetic */ void m0(int i10, N2 n22) {
        n22.getClass();
        k2();
        this.zzf.set(i10, n22);
    }

    public final /* synthetic */ void m1(C3164c3 c3164c3) {
        c3164c3.getClass();
        this.zzQ = c3164c3;
        this.zzd |= 8;
    }

    public final int m2() {
        return this.zzf.size();
    }

    public final /* synthetic */ void n0(N2 n22) {
        n22.getClass();
        k2();
        this.zzf.add(n22);
    }

    public final /* synthetic */ void n1(Iterable iterable) {
        InterfaceC3184e5 interfaceC3184e5 = this.zzR;
        if (!interfaceC3184e5.zza()) {
            int size = interfaceC3184e5.size();
            this.zzR = interfaceC3184e5.q(size + size);
        }
        AbstractC3282p4.d(iterable, this.zzR);
    }

    public final N2 n2(int i10) {
        return (N2) this.zzf.get(i10);
    }

    public final /* synthetic */ void o0(Iterable iterable) {
        k2();
        AbstractC3282p4.d(iterable, this.zzf);
    }

    public final /* synthetic */ void o1(long j10) {
        this.zzd |= 16;
        this.zzS = j10;
    }

    public final List o2() {
        return this.zzg;
    }

    public final /* synthetic */ void p0() {
        this.zzf = AbstractC3148a5.z();
    }

    public final /* synthetic */ void p1(long j10) {
        this.zzd |= 32;
        this.zzT = j10;
    }

    public final int p2() {
        return this.zzg.size();
    }

    public final /* synthetic */ void q0(int i10) {
        k2();
        this.zzf.remove(i10);
    }

    public final /* synthetic */ void q1(String str) {
        this.zzd |= 128;
        this.zzV = str;
    }

    public final C3290q3 q2(int i10) {
        return (C3290q3) this.zzg.get(i10);
    }

    public final /* synthetic */ void r0(int i10, C3290q3 c3290q3) {
        c3290q3.getClass();
        l2();
        this.zzg.set(i10, c3290q3);
    }

    public final /* synthetic */ void r1(String str) {
        str.getClass();
        this.zzd |= 8192;
        this.zzab = str;
    }

    public final boolean r2() {
        return (this.zzb & 2) != 0;
    }

    public final /* synthetic */ void s0(C3290q3 c3290q3) {
        c3290q3.getClass();
        l2();
        this.zzg.add(c3290q3);
    }

    public final /* synthetic */ void s1() {
        this.zzd &= -8193;
        this.zzab = zzat.zzab;
    }

    public final long s2() {
        return this.zzh;
    }

    public final /* synthetic */ void t0(Iterable iterable) {
        l2();
        AbstractC3282p4.d(iterable, this.zzg);
    }

    public final /* synthetic */ void t1(Iterable iterable) {
        InterfaceC3202g5 interfaceC3202g5 = this.zzac;
        if (!interfaceC3202g5.zza()) {
            this.zzac = AbstractC3148a5.A(interfaceC3202g5);
        }
        AbstractC3282p4.d(iterable, this.zzac);
    }

    public final boolean t2() {
        return (this.zzb & 4) != 0;
    }

    public final /* synthetic */ void u0(int i10) {
        l2();
        this.zzg.remove(i10);
    }

    public final /* synthetic */ void u1(String str) {
        str.getClass();
        this.zzd |= 16384;
        this.zzad = str;
    }

    public final long u2() {
        return this.zzi;
    }

    public final /* synthetic */ void v0(long j10) {
        this.zzb |= 2;
        this.zzh = j10;
    }

    public final /* synthetic */ void v1(long j10) {
        this.zzd |= 32768;
        this.zzae = j10;
    }

    public final boolean v2() {
        return (this.zzb & 8) != 0;
    }

    public final /* synthetic */ void w0() {
        this.zzb &= -3;
        this.zzh = 0L;
    }

    public final /* synthetic */ void w1(boolean z10) {
        this.zzd |= ImageMetadata.CONTROL_AE_ANTIBANDING_MODE;
        this.zzaf = z10;
    }

    public final long w2() {
        return this.zzj;
    }

    public final /* synthetic */ void x0(long j10) {
        this.zzb |= 4;
        this.zzi = j10;
    }

    public final /* synthetic */ void x1(String str) {
        this.zzd |= 131072;
        this.zzag = str;
    }

    public final boolean x2() {
        return (this.zzb & 16) != 0;
    }

    public final /* synthetic */ void y0(long j10) {
        this.zzb |= 8;
        this.zzj = j10;
    }

    public final /* synthetic */ void y1(boolean z10) {
        this.zzd |= 262144;
        this.zzah = z10;
    }

    public final long y2() {
        return this.zzk;
    }

    public final /* synthetic */ void z0(long j10) {
        this.zzb |= 16;
        this.zzk = j10;
    }

    public final /* synthetic */ void z1(String str) {
        str.getClass();
        this.zzd |= ImageMetadata.LENS_APERTURE;
        this.zzai = str;
    }

    public final boolean z2() {
        return (this.zzb & 32) != 0;
    }
}
