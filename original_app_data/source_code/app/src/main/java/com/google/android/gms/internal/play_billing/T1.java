package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class T1 extends O2 implements InterfaceC3574m3 {
    private static final T1 zzb;
    private S2 zzd = O2.u();

    static {
        T1 t12 = new T1();
        zzb = t12;
        O2.z(T1.class, t12);
    }

    public static S1 C() {
        return (S1) zzb.n();
    }

    public static /* synthetic */ void E(T1 t12, Iterable iterable) {
        S2 s22 = t12.zzd;
        if (!s22.b()) {
            int size = s22.size();
            t12.zzd = s22.g(size + size);
        }
        AbstractC3507b2.c(iterable, t12.zzd);
    }

    @Override // com.google.android.gms.internal.play_billing.O2
    public final Object l(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return O2.w(zzb, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", R1.class});
        }
        if (i11 == 3) {
            return new T1();
        }
        U1 u12 = null;
        if (i11 == 4) {
            return new S1(u12);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
