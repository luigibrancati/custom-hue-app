package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class P1 extends AbstractC3148a5 implements D5 {
    private static final P1 zzf;
    private int zzb;
    private int zzd;
    private int zze;

    static {
        P1 p12 = new P1();
        zzf = p12;
        AbstractC3148a5.t(P1.class, p12);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC3148a5
    public final Object C(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            InterfaceC3175d5 interfaceC3175d5 = S1.f29325a;
            return AbstractC3148a5.u(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zzb", "zzd", interfaceC3175d5, "zze", interfaceC3175d5});
        }
        if (i11 == 3) {
            return new P1();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new O1(bArr);
        }
        if (i11 == 5) {
            return zzf;
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
        int iA = U1.a(this.zze);
        if (iA == 0) {
            return 1;
        }
        return iA;
    }
}
