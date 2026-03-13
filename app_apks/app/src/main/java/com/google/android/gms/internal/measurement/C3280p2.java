package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.p2, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C3280p2 extends AbstractC3148a5 implements D5 {
    private static final C3280p2 zzi;
    private int zzb;
    private int zzg;
    private String zzd = "";
    private String zze = "";
    private String zzf = "";
    private String zzh = "";

    static {
        C3280p2 c3280p2 = new C3280p2();
        zzi = c3280p2;
        AbstractC3148a5.t(C3280p2.class, c3280p2);
    }

    public static C3280p2 H() {
        return zzi;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC3148a5
    public final Object C(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC3148a5.u(zzi, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004င\u0003\u0005ဈ\u0004", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (i11 == 3) {
            return new C3280p2();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new C3271o2(bArr);
        }
        if (i11 == 5) {
            return zzi;
        }
        throw null;
    }

    public final String D() {
        return this.zzd;
    }

    public final String E() {
        return this.zze;
    }

    public final int F() {
        return this.zzg;
    }

    public final String G() {
        return this.zzh;
    }
}
