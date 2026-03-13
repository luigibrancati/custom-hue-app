package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class N2 extends AbstractC3148a5 implements D5 {
    private static final N2 zzj;
    private int zzb;
    private InterfaceC3202g5 zzd = AbstractC3148a5.z();
    private String zze = "";
    private long zzf;
    private long zzg;
    private int zzh;
    private long zzi;

    static {
        N2 n22 = new N2();
        zzj = n22;
        AbstractC3148a5.t(N2.class, n22);
    }

    public static M2 N() {
        return (M2) zzj.p();
    }

    private final void Z() {
        InterfaceC3202g5 interfaceC3202g5 = this.zzd;
        if (interfaceC3202g5.zza()) {
            return;
        }
        this.zzd = AbstractC3148a5.A(interfaceC3202g5);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC3148a5
    public final Object C(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC3148a5.u(zzj, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003ဂ\u0001\u0004ဂ\u0002\u0005င\u0003\u0006ဂ\u0004", new Object[]{"zzb", "zzd", R2.class, "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (i11 == 3) {
            return new N2();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new M2(bArr);
        }
        if (i11 == 5) {
            return zzj;
        }
        throw null;
    }

    public final List D() {
        return this.zzd;
    }

    public final int E() {
        return this.zzd.size();
    }

    public final R2 F(int i10) {
        return (R2) this.zzd.get(i10);
    }

    public final String G() {
        return this.zze;
    }

    public final boolean H() {
        return (this.zzb & 2) != 0;
    }

    public final long I() {
        return this.zzf;
    }

    public final boolean J() {
        return (this.zzb & 4) != 0;
    }

    public final long K() {
        return this.zzg;
    }

    public final boolean L() {
        return (this.zzb & 8) != 0;
    }

    public final int M() {
        return this.zzh;
    }

    public final /* synthetic */ void O(int i10, R2 r22) {
        r22.getClass();
        Z();
        this.zzd.set(i10, r22);
    }

    public final /* synthetic */ void P(R2 r22) {
        r22.getClass();
        Z();
        this.zzd.add(r22);
    }

    public final /* synthetic */ void Q(Iterable iterable) {
        Z();
        AbstractC3282p4.d(iterable, this.zzd);
    }

    public final /* synthetic */ void R() {
        this.zzd = AbstractC3148a5.z();
    }

    public final /* synthetic */ void S(int i10) {
        Z();
        this.zzd.remove(i10);
    }

    public final /* synthetic */ void T(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zze = str;
    }

    public final /* synthetic */ void U(long j10) {
        this.zzb |= 2;
        this.zzf = j10;
    }

    public final /* synthetic */ void V(long j10) {
        this.zzb |= 4;
        this.zzg = j10;
    }

    public final /* synthetic */ void W(long j10) {
        this.zzb |= 16;
        this.zzi = j10;
    }
}
