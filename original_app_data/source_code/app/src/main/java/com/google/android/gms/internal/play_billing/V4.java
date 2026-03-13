package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class V4 extends O2 implements InterfaceC3574m3 {
    private static final V4 zzb;
    private int zzd;
    private int zze;

    static {
        V4 v42 = new V4();
        zzb = v42;
        O2.z(V4.class, v42);
    }

    public static V4 C() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.play_billing.O2
    public final Object l(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return O2.w(zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"zzd", "zze", T4.f30093a});
        }
        if (i11 == 3) {
            return new V4();
        }
        U4 u42 = null;
        if (i11 == 4) {
            return new S4(u42);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
