package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.l4, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C3569l4 extends O2 implements InterfaceC3574m3 {
    private static final C3569l4 zzb;

    static {
        C3569l4 c3569l4 = new C3569l4();
        zzb = c3569l4;
        O2.z(C3569l4.class, c3569l4);
    }

    public static C3569l4 C() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.play_billing.O2
    public final Object l(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        AbstractC3563k4 abstractC3563k4 = null;
        if (i11 == 2) {
            return O2.w(zzb, "\u0004\u0000", null);
        }
        if (i11 == 3) {
            return new C3569l4();
        }
        if (i11 == 4) {
            return new C3557j4(abstractC3563k4);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
