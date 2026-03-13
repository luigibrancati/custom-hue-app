package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class B3 extends AbstractC3148a5 implements D5 {
    private static final B3 zzj;
    private int zzb;
    private int zzd;
    private InterfaceC3202g5 zze = AbstractC3148a5.z();
    private String zzf = "";
    private String zzg = "";
    private boolean zzh;
    private double zzi;

    static {
        B3 b32 = new B3();
        zzj = b32;
        AbstractC3148a5.t(B3.class, b32);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC3148a5
    public final Object C(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC3148a5.u(zzj, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001᠌\u0000\u0002\u001b\u0003ဈ\u0001\u0004ဈ\u0002\u0005ဇ\u0003\u0006က\u0004", new Object[]{"zzb", "zzd", C3365z3.f29730a, "zze", B3.class, "zzf", "zzg", "zzh", "zzi"});
        }
        if (i11 == 3) {
            return new B3();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new C3357y3(bArr);
        }
        if (i11 == 5) {
            return zzj;
        }
        throw null;
    }

    public final List D() {
        return this.zze;
    }

    public final String E() {
        return this.zzf;
    }

    public final boolean F() {
        return (this.zzb & 4) != 0;
    }

    public final String G() {
        return this.zzg;
    }

    public final boolean H() {
        return (this.zzb & 8) != 0;
    }

    public final boolean I() {
        return this.zzh;
    }

    public final boolean J() {
        return (this.zzb & 16) != 0;
    }

    public final double K() {
        return this.zzi;
    }

    public final int M() {
        int iA = A3.a(this.zzd);
        if (iA == 0) {
            return 1;
        }
        return iA;
    }
}
