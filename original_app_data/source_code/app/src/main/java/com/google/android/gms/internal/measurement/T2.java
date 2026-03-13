package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class T2 extends AbstractC3148a5 implements D5 {
    private static final T2 zzg;
    private int zzb;
    private String zzd = "";
    private String zze = "";
    private C3348x2 zzf;

    static {
        T2 t22 = new T2();
        zzg = t22;
        AbstractC3148a5.t(T2.class, t22);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC3148a5
    public final Object C(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC3148a5.u(zzg, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002", new Object[]{"zzb", "zzd", "zze", "zzf"});
        }
        if (i11 == 3) {
            return new T2();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new S2(bArr);
        }
        if (i11 == 5) {
            return zzg;
        }
        throw null;
    }
}
