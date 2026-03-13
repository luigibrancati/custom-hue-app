package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.w1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C3339w1 extends AbstractC3148a5 implements D5 {
    private static final C3339w1 zzi;
    private int zzb;
    private int zzd;
    private InterfaceC3202g5 zze = AbstractC3148a5.z();
    private InterfaceC3202g5 zzf = AbstractC3148a5.z();
    private boolean zzg;
    private boolean zzh;

    static {
        C3339w1 c3339w1 = new C3339w1();
        zzi = c3339w1;
        AbstractC3148a5.t(C3339w1.class, c3339w1);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC3148a5
    public final Object C(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC3148a5.u(zzi, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဇ\u0001\u0005ဇ\u0002", new Object[]{"zzb", "zzd", "zze", G1.class, "zzf", C3355y1.class, "zzg", "zzh"});
        }
        if (i11 == 3) {
            return new C3339w1();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new C3331v1(bArr);
        }
        if (i11 == 5) {
            return zzi;
        }
        throw null;
    }

    public final boolean D() {
        return (this.zzb & 1) != 0;
    }

    public final int E() {
        return this.zzd;
    }

    public final List F() {
        return this.zze;
    }

    public final int G() {
        return this.zze.size();
    }

    public final G1 H(int i10) {
        return (G1) this.zze.get(i10);
    }

    public final List I() {
        return this.zzf;
    }

    public final int J() {
        return this.zzf.size();
    }

    public final C3355y1 K(int i10) {
        return (C3355y1) this.zzf.get(i10);
    }

    public final /* synthetic */ void L(int i10, G1 g12) {
        g12.getClass();
        InterfaceC3202g5 interfaceC3202g5 = this.zze;
        if (!interfaceC3202g5.zza()) {
            this.zze = AbstractC3148a5.A(interfaceC3202g5);
        }
        this.zze.set(i10, g12);
    }

    public final /* synthetic */ void M(int i10, C3355y1 c3355y1) {
        c3355y1.getClass();
        InterfaceC3202g5 interfaceC3202g5 = this.zzf;
        if (!interfaceC3202g5.zza()) {
            this.zzf = AbstractC3148a5.A(interfaceC3202g5);
        }
        this.zzf.set(i10, c3355y1);
    }
}
