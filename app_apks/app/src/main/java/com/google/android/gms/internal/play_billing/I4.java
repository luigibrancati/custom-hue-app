package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class I4 extends O2 implements InterfaceC3574m3 {
    private static final I4 zzb;
    private S2 zzd = O2.u();

    static {
        I4 i42 = new I4();
        zzb = i42;
        O2.z(I4.class, i42);
    }

    @Override // com.google.android.gms.internal.play_billing.O2
    public final Object l(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return O2.w(zzb, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", G4.class});
        }
        if (i11 == 3) {
            return new I4();
        }
        H4 h42 = null;
        if (i11 == 4) {
            return new D4(h42);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
