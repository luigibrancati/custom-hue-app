package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.u3, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C3325u3 extends AbstractC3148a5 implements D5 {
    private static final C3325u3 zzf;
    private int zzb;
    private String zzd = "";
    private InterfaceC3202g5 zze = AbstractC3148a5.z();

    static {
        C3325u3 c3325u3 = new C3325u3();
        zzf = c3325u3;
        AbstractC3148a5.t(C3325u3.class, c3325u3);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC3148a5
    public final Object C(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC3148a5.u(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"zzb", "zzd", "zze", B3.class});
        }
        if (i11 == 3) {
            return new C3325u3();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new C3316t3(bArr);
        }
        if (i11 == 5) {
            return zzf;
        }
        throw null;
    }

    public final String D() {
        return this.zzd;
    }

    public final List E() {
        return this.zze;
    }
}
