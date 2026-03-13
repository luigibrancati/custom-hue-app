package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class W1 extends AbstractC3148a5 implements D5 {
    private static final W1 zzf;
    private int zzb;
    private String zzd = "";
    private String zze = "";

    static {
        W1 w12 = new W1();
        zzf = w12;
        AbstractC3148a5.t(W1.class, w12);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC3148a5
    public final Object C(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC3148a5.u(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zzb", "zzd", "zze"});
        }
        if (i11 == 3) {
            return new W1();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new V1(bArr);
        }
        if (i11 == 5) {
            return zzf;
        }
        throw null;
    }

    public final String D() {
        return this.zzd;
    }
}
