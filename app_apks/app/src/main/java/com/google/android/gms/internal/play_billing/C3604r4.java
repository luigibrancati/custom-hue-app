package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.r4, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C3604r4 extends O2 implements InterfaceC3574m3 {
    private static final C3604r4 zzb;
    private int zzd;
    private int zzf;
    private C3551i4 zzi;
    private boolean zzj;
    private boolean zzk;
    private String zze = "";
    private R2 zzg = O2.t();
    private S2 zzh = O2.u();

    static {
        C3604r4 c3604r4 = new C3604r4();
        zzb = c3604r4;
        O2.z(C3604r4.class, c3604r4);
    }

    @Override // com.google.android.gms.internal.play_billing.O2
    public final Object l(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return O2.w(zzb, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0002\u0000\u0001ဈ\u0000\u0002᠌\u0001\u0003ࠬ\u0004\u001b\u0005ဉ\u0002\u0006ဇ\u0003\u0007ဇ\u0004", new Object[]{"zzd", "zze", "zzf", C3593p4.f30226a, "zzg", C3575m4.f30201a, "zzh", O4.class, "zzi", "zzj", "zzk"});
        }
        if (i11 == 3) {
            return new C3604r4();
        }
        AbstractC3599q4 abstractC3599q4 = null;
        if (i11 == 4) {
            return new C3587o4(abstractC3599q4);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
