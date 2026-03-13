package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.y1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C3355y1 extends AbstractC3148a5 implements D5 {
    private static final C3355y1 zzl;
    private int zzb;
    private int zzd;
    private String zze = "";
    private InterfaceC3202g5 zzf = AbstractC3148a5.z();
    private boolean zzg;
    private E1 zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;

    static {
        C3355y1 c3355y1 = new C3355y1();
        zzl = c3355y1;
        AbstractC3148a5.t(C3355y1.class, c3355y1);
    }

    public static C3347x1 P() {
        return (C3347x1) zzl.p();
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC3148a5
    public final Object C(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC3148a5.u(zzl, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u001b\u0004ဇ\u0002\u0005ဉ\u0003\u0006ဇ\u0004\u0007ဇ\u0005\bဇ\u0006", new Object[]{"zzb", "zzd", "zze", "zzf", A1.class, "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        if (i11 == 3) {
            return new C3355y1();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new C3347x1(bArr);
        }
        if (i11 == 5) {
            return zzl;
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

    public final List G() {
        return this.zzf;
    }

    public final int H() {
        return this.zzf.size();
    }

    public final A1 I(int i10) {
        return (A1) this.zzf.get(i10);
    }

    public final boolean J() {
        return (this.zzb & 8) != 0;
    }

    public final E1 K() {
        E1 e12 = this.zzh;
        return e12 == null ? E1.M() : e12;
    }

    public final boolean L() {
        return this.zzi;
    }

    public final boolean M() {
        return this.zzj;
    }

    public final boolean N() {
        return (this.zzb & 64) != 0;
    }

    public final boolean O() {
        return this.zzk;
    }

    public final /* synthetic */ void Q(String str) {
        this.zzb |= 2;
        this.zze = str;
    }

    public final /* synthetic */ void R(int i10, A1 a12) {
        a12.getClass();
        InterfaceC3202g5 interfaceC3202g5 = this.zzf;
        if (!interfaceC3202g5.zza()) {
            this.zzf = AbstractC3148a5.A(interfaceC3202g5);
        }
        this.zzf.set(i10, a12);
    }
}
