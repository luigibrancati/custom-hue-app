package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.z2, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C3364z2 extends AbstractC3148a5 implements D5 {
    private static final C3364z2 zzk;
    private int zzb;
    private boolean zzd;
    private boolean zze;
    private boolean zzf;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;
    private boolean zzj;

    static {
        C3364z2 c3364z2 = new C3364z2();
        zzk = c3364z2;
        AbstractC3148a5.t(C3364z2.class, c3364z2);
    }

    public static C3356y2 K() {
        return (C3356y2) zzk.p();
    }

    public static C3364z2 L() {
        return zzk;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC3148a5
    public final Object C(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC3148a5.u(zzk, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005\u0007ဇ\u0006", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i11 == 3) {
            return new C3364z2();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new C3356y2(bArr);
        }
        if (i11 == 5) {
            return zzk;
        }
        throw null;
    }

    public final boolean D() {
        return this.zzd;
    }

    public final boolean E() {
        return this.zze;
    }

    public final boolean F() {
        return this.zzf;
    }

    public final boolean G() {
        return this.zzg;
    }

    public final boolean H() {
        return this.zzh;
    }

    public final boolean I() {
        return this.zzi;
    }

    public final boolean J() {
        return this.zzj;
    }

    public final /* synthetic */ void M(boolean z10) {
        this.zzb |= 1;
        this.zzd = z10;
    }

    public final /* synthetic */ void N(boolean z10) {
        this.zzb |= 2;
        this.zze = z10;
    }

    public final /* synthetic */ void O(boolean z10) {
        this.zzb |= 4;
        this.zzf = z10;
    }

    public final /* synthetic */ void P(boolean z10) {
        this.zzb |= 8;
        this.zzg = z10;
    }

    public final /* synthetic */ void Q(boolean z10) {
        this.zzb |= 16;
        this.zzh = z10;
    }

    public final /* synthetic */ void R(boolean z10) {
        this.zzb |= 32;
        this.zzi = z10;
    }

    public final /* synthetic */ void S(boolean z10) {
        this.zzb |= 64;
        this.zzj = z10;
    }
}
