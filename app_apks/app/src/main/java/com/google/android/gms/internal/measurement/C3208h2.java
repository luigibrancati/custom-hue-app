package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.h2, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C3208h2 extends AbstractC3148a5 implements D5 {
    private static final C3208h2 zzd;
    private InterfaceC3202g5 zzb = AbstractC3148a5.z();

    static {
        C3208h2 c3208h2 = new C3208h2();
        zzd = c3208h2;
        AbstractC3148a5.t(C3208h2.class, c3208h2);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC3148a5
    public final Object C(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC3148a5.u(zzd, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"zzb"});
        }
        if (i11 == 3) {
            return new C3208h2();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new C3199g2(bArr);
        }
        if (i11 == 5) {
            return zzd;
        }
        throw null;
    }
}
