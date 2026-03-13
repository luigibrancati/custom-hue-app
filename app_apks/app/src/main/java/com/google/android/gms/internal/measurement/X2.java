package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class X2 extends AbstractC3148a5 implements D5 {
    private static final X2 zzh;
    private int zzb;
    private InterfaceC3202g5 zzd = AbstractC3148a5.z();
    private String zze = "";
    private String zzf = "";
    private int zzg;

    static {
        X2 x22 = new X2();
        zzh = x22;
        AbstractC3148a5.t(X2.class, x22);
    }

    public static U2 K() {
        return (U2) zzh.p();
    }

    public static U2 L(X2 x22) {
        X4 x4P = zzh.p();
        x4P.x(x22);
        return (U2) x4P;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC3148a5
    public final Object C(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC3148a5.u(zzh, "\u0004\u0004\u0000\u0001\u0001\t\u0004\u0000\u0001\u0000\u0001\u001b\u0007ဈ\u0000\bဈ\u0001\t᠌\u0002", new Object[]{"zzb", "zzd", Z2.class, "zze", "zzf", "zzg", W2.f29379a});
        }
        if (i11 == 3) {
            return new X2();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new U2(bArr);
        }
        if (i11 == 5) {
            return zzh;
        }
        throw null;
    }

    public final List D() {
        return this.zzd;
    }

    public final int E() {
        return this.zzd.size();
    }

    public final Z2 F(int i10) {
        return (Z2) this.zzd.get(i10);
    }

    public final boolean G() {
        return (this.zzb & 1) != 0;
    }

    public final String H() {
        return this.zze;
    }

    public final boolean I() {
        return (this.zzb & 2) != 0;
    }

    public final String J() {
        return this.zzf;
    }

    public final /* synthetic */ void M(int i10, Z2 z22) {
        z22.getClass();
        T();
        this.zzd.set(i10, z22);
    }

    public final /* synthetic */ void N(Z2 z22) {
        z22.getClass();
        T();
        this.zzd.add(z22);
    }

    public final /* synthetic */ void O(Iterable iterable) {
        T();
        AbstractC3282p4.d(iterable, this.zzd);
    }

    public final /* synthetic */ void P() {
        this.zzd = AbstractC3148a5.z();
    }

    public final /* synthetic */ void Q(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zze = str;
    }

    public final /* synthetic */ void R(String str) {
        str.getClass();
        this.zzb |= 2;
        this.zzf = str;
    }

    public final void T() {
        InterfaceC3202g5 interfaceC3202g5 = this.zzd;
        if (interfaceC3202g5.zza()) {
            return;
        }
        this.zzd = AbstractC3148a5.A(interfaceC3202g5);
    }
}
