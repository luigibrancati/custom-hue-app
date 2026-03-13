package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.x3, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C3349x3 extends AbstractC3148a5 implements D5 {
    private static final C3349x3 zzf;
    private int zzb;
    private InterfaceC3202g5 zzd = AbstractC3148a5.z();
    private C3307s3 zze;

    static {
        C3349x3 c3349x3 = new C3349x3();
        zzf = c3349x3;
        AbstractC3148a5.t(C3349x3.class, c3349x3);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC3148a5
    public final Object C(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC3148a5.u(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"zzb", "zzd", B3.class, "zze"});
        }
        if (i11 == 3) {
            return new C3349x3();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new C3333v3(bArr);
        }
        if (i11 == 5) {
            return zzf;
        }
        throw null;
    }

    public final List D() {
        return this.zzd;
    }

    public final C3307s3 E() {
        C3307s3 c3307s3 = this.zze;
        return c3307s3 == null ? C3307s3.F() : c3307s3;
    }
}
