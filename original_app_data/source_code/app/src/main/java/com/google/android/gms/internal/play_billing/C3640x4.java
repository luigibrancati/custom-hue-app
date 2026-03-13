package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.x4, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C3640x4 extends O2 implements InterfaceC3574m3 {
    private static final C3640x4 zzb;
    private int zzd;
    private boolean zze;
    private boolean zzf;

    static {
        C3640x4 c3640x4 = new C3640x4();
        zzb = c3640x4;
        O2.z(C3640x4.class, c3640x4);
    }

    @Override // com.google.android.gms.internal.play_billing.O2
    public final Object l(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return O2.w(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i11 == 3) {
            return new C3640x4();
        }
        AbstractC3634w4 abstractC3634w4 = null;
        if (i11 == 4) {
            return new C3628v4(abstractC3634w4);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
