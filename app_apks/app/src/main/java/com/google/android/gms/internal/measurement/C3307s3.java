package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.s3, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C3307s3 extends AbstractC3148a5 implements D5 {
    private static final C3307s3 zzd;
    private InterfaceC3202g5 zzb = AbstractC3148a5.z();

    static {
        C3307s3 c3307s3 = new C3307s3();
        zzd = c3307s3;
        AbstractC3148a5.t(C3307s3.class, c3307s3);
    }

    public static C3307s3 F() {
        return zzd;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC3148a5
    public final Object C(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC3148a5.u(zzd, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzb", C3325u3.class});
        }
        if (i11 == 3) {
            return new C3307s3();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new C3298r3(bArr);
        }
        if (i11 == 5) {
            return zzd;
        }
        throw null;
    }

    public final List D() {
        return this.zzb;
    }

    public final int E() {
        return this.zzb.size();
    }
}
