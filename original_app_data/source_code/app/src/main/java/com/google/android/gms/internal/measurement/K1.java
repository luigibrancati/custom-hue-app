package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class K1 extends AbstractC3148a5 implements D5 {
    private static final K1 zzh;
    private int zzb;
    private int zzd;
    private boolean zzf;
    private String zze = "";
    private InterfaceC3202g5 zzg = AbstractC3148a5.z();

    static {
        K1 k12 = new K1();
        zzh = k12;
        AbstractC3148a5.t(K1.class, k12);
    }

    public static K1 K() {
        return zzh;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC3148a5
    public final Object C(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC3148a5.u(zzh, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004\u001a", new Object[]{"zzb", "zzd", I1.f29223a, "zze", "zzf", "zzg"});
        }
        if (i11 == 3) {
            return new K1();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new H1(bArr);
        }
        if (i11 == 5) {
            return zzh;
        }
        throw null;
    }

    public final boolean D() {
        return (this.zzb & 1) != 0;
    }

    public final boolean E() {
        return (this.zzb & 2) != 0;
    }

    public final String F() {
        return this.zze;
    }

    public final boolean G() {
        return (this.zzb & 4) != 0;
    }

    public final boolean H() {
        return this.zzf;
    }

    public final List I() {
        return this.zzg;
    }

    public final int J() {
        return this.zzg.size();
    }

    public final int M() {
        int iA = J1.a(this.zzd);
        if (iA == 0) {
            return 1;
        }
        return iA;
    }
}
