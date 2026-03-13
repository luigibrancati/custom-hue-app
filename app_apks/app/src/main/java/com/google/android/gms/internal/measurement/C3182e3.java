package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.e3, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C3182e3 extends AbstractC3148a5 implements D5 {
    private static final C3182e3 zzg;
    private InterfaceC3193f5 zzb = AbstractC3148a5.x();
    private InterfaceC3193f5 zzd = AbstractC3148a5.x();
    private InterfaceC3202g5 zze = AbstractC3148a5.z();
    private InterfaceC3202g5 zzf = AbstractC3148a5.z();

    static {
        C3182e3 c3182e3 = new C3182e3();
        zzg = c3182e3;
        AbstractC3148a5.t(C3182e3.class, c3182e3);
    }

    public static C3173d3 L() {
        return (C3173d3) zzg.p();
    }

    public static C3182e3 M() {
        return zzg;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC3148a5
    public final Object C(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC3148a5.u(zzg, "\u0004\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0004\u0000\u0001\u0015\u0002\u0015\u0003\u001b\u0004\u001b", new Object[]{"zzb", "zzd", "zze", L2.class, "zzf", C3200g3.class});
        }
        if (i11 == 3) {
            return new C3182e3();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new C3173d3(bArr);
        }
        if (i11 == 5) {
            return zzg;
        }
        throw null;
    }

    public final List D() {
        return this.zzb;
    }

    public final int E() {
        return this.zzb.size();
    }

    public final List F() {
        return this.zzd;
    }

    public final int G() {
        return this.zzd.size();
    }

    public final List H() {
        return this.zze;
    }

    public final int I() {
        return this.zze.size();
    }

    public final List J() {
        return this.zzf;
    }

    public final int K() {
        return this.zzf.size();
    }

    public final /* synthetic */ void N(Iterable iterable) {
        InterfaceC3193f5 interfaceC3193f5 = this.zzb;
        if (!interfaceC3193f5.zza()) {
            this.zzb = AbstractC3148a5.y(interfaceC3193f5);
        }
        AbstractC3282p4.d(iterable, this.zzb);
    }

    public final /* synthetic */ void O() {
        this.zzb = AbstractC3148a5.x();
    }

    public final /* synthetic */ void P(Iterable iterable) {
        InterfaceC3193f5 interfaceC3193f5 = this.zzd;
        if (!interfaceC3193f5.zza()) {
            this.zzd = AbstractC3148a5.y(interfaceC3193f5);
        }
        AbstractC3282p4.d(iterable, this.zzd);
    }

    public final /* synthetic */ void Q() {
        this.zzd = AbstractC3148a5.x();
    }

    public final /* synthetic */ void R(Iterable iterable) {
        InterfaceC3202g5 interfaceC3202g5 = this.zze;
        if (!interfaceC3202g5.zza()) {
            this.zze = AbstractC3148a5.A(interfaceC3202g5);
        }
        AbstractC3282p4.d(iterable, this.zze);
    }

    public final /* synthetic */ void S() {
        this.zze = AbstractC3148a5.z();
    }

    public final /* synthetic */ void T(Iterable iterable) {
        InterfaceC3202g5 interfaceC3202g5 = this.zzf;
        if (!interfaceC3202g5.zza()) {
            this.zzf = AbstractC3148a5.A(interfaceC3202g5);
        }
        AbstractC3282p4.d(iterable, this.zzf);
    }

    public final /* synthetic */ void U() {
        this.zzf = AbstractC3148a5.z();
    }
}
