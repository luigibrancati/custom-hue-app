package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class G2 extends AbstractC3148a5 implements D5 {
    private static final G2 zzf;
    private int zzb;
    private int zzd;
    private int zze;

    static {
        G2 g22 = new G2();
        zzf = g22;
        AbstractC3148a5.t(G2.class, g22);
    }

    public static F2 D() {
        return (F2) zzf.p();
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC3148a5
    public final Object C(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC3148a5.u(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zzb", "zzd", D2.f29154a, "zze", H2.f29216a});
        }
        if (i11 == 3) {
            return new G2();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new F2(bArr);
        }
        if (i11 == 5) {
            return zzf;
        }
        throw null;
    }

    public final int F() {
        int iA = E2.a(this.zzd);
        if (iA == 0) {
            return 1;
        }
        return iA;
    }

    public final int G() {
        int iA = I2.a(this.zze);
        if (iA == 0) {
            return 1;
        }
        return iA;
    }

    public final /* synthetic */ void H(int i10) {
        this.zzd = i10 - 1;
        this.zzb |= 1;
    }

    public final /* synthetic */ void I(int i10) {
        this.zze = i10 - 1;
        this.zzb |= 2;
    }
}
