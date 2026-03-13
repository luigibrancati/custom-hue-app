package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.b2, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C3154b2 extends AbstractC3148a5 implements D5 {
    private static final C3154b2 zzg;
    private int zzb;
    private String zzd = "";
    private InterfaceC3202g5 zze = AbstractC3148a5.z();
    private boolean zzf;

    static {
        C3154b2 c3154b2 = new C3154b2();
        zzg = c3154b2;
        AbstractC3148a5.t(C3154b2.class, c3154b2);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC3148a5
    public final Object C(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC3148a5.u(zzg, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဇ\u0001", new Object[]{"zzb", "zzd", "zze", C3244l2.class, "zzf"});
        }
        if (i11 == 3) {
            return new C3154b2();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new C3145a2(bArr);
        }
        if (i11 == 5) {
            return zzg;
        }
        throw null;
    }

    public final String D() {
        return this.zzd;
    }
}
