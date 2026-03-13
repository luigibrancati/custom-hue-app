package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class G4 extends O2 implements InterfaceC3574m3 {
    private static final G4 zzb;
    private int zzd;
    private int zze;
    private String zzf = "";

    static {
        G4 g42 = new G4();
        zzb = g42;
        O2.z(G4.class, g42);
    }

    @Override // com.google.android.gms.internal.play_billing.O2
    public final Object l(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return O2.w(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001", new Object[]{"zzd", "zze", F4.f30028a, "zzf"});
        }
        if (i11 == 3) {
            return new G4();
        }
        H4 h42 = null;
        if (i11 == 4) {
            return new E4(h42);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
