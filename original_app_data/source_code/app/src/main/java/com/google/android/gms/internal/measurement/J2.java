package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class J2 extends AbstractC3148a5 implements D5 {
    private static final J2 zzd;
    private InterfaceC3202g5 zzb = AbstractC3148a5.z();

    static {
        J2 j22 = new J2();
        zzd = j22;
        AbstractC3148a5.t(J2.class, j22);
    }

    public static C2 E() {
        return (C2) zzd.p();
    }

    public static J2 F() {
        return zzd;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC3148a5
    public final Object C(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC3148a5.u(zzd, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzb", G2.class});
        }
        if (i11 == 3) {
            return new J2();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new C2(bArr);
        }
        if (i11 == 5) {
            return zzd;
        }
        throw null;
    }

    public final List D() {
        return this.zzb;
    }

    public final /* synthetic */ void G(Iterable iterable) {
        InterfaceC3202g5 interfaceC3202g5 = this.zzb;
        if (!interfaceC3202g5.zza()) {
            this.zzb = AbstractC3148a5.A(interfaceC3202g5);
        }
        AbstractC3282p4.d(iterable, this.zzb);
    }
}
