package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.d2, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C3172d2 extends AbstractC3148a5 implements D5 {
    private static final C3172d2 zzh;
    private int zzb;
    private String zzd = "";
    private boolean zze;
    private boolean zzf;
    private int zzg;

    static {
        C3172d2 c3172d2 = new C3172d2();
        zzh = c3172d2;
        AbstractC3148a5.t(C3172d2.class, c3172d2);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC3148a5
    public final Object C(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC3148a5.u(zzh, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004င\u0003", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg"});
        }
        if (i11 == 3) {
            return new C3172d2();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new C3163c2(bArr);
        }
        if (i11 == 5) {
            return zzh;
        }
        throw null;
    }

    public final String D() {
        return this.zzd;
    }

    public final boolean E() {
        return (this.zzb & 2) != 0;
    }

    public final boolean F() {
        return this.zze;
    }

    public final boolean G() {
        return (this.zzb & 4) != 0;
    }

    public final boolean H() {
        return this.zzf;
    }

    public final boolean I() {
        return (this.zzb & 8) != 0;
    }

    public final int J() {
        return this.zzg;
    }

    public final /* synthetic */ void K(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zzd = str;
    }
}
