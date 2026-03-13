package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.l2, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C3244l2 extends AbstractC3148a5 implements D5 {
    private static final C3244l2 zzf;
    private int zzb;
    private String zzd = "";
    private String zze = "";

    static {
        C3244l2 c3244l2 = new C3244l2();
        zzf = c3244l2;
        AbstractC3148a5.t(C3244l2.class, c3244l2);
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
            return new C3244l2();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new C3235k2(bArr);
        }
        if (i11 == 5) {
            return zzf;
        }
        throw null;
    }
}
