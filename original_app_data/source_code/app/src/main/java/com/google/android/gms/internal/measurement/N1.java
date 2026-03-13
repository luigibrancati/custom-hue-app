package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class N1 extends AbstractC3148a5 implements D5 {
    private static final N1 zzg;
    private int zzb;
    private int zzd;
    private int zze;
    private int zzf;

    static {
        N1 n12 = new N1();
        zzg = n12;
        AbstractC3148a5.t(N1.class, n12);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC3148a5
    public final Object C(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC3148a5.u(zzg, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002", new Object[]{"zzb", "zzd", S1.f29325a, "zze", Q1.f29317a, "zzf", X1.f29383a});
        }
        if (i11 == 3) {
            return new N1();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new M1(bArr);
        }
        if (i11 == 5) {
            return zzg;
        }
        throw null;
    }

    public final int E() {
        int iA = U1.a(this.zzd);
        if (iA == 0) {
            return 1;
        }
        return iA;
    }

    public final int F() {
        int iA = R1.a(this.zze);
        if (iA == 0) {
            return 1;
        }
        return iA;
    }

    public final int G() {
        int iA = Y1.a(this.zzf);
        if (iA == 0) {
            return 1;
        }
        return iA;
    }
}
