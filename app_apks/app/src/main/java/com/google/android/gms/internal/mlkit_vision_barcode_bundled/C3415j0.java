package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.j0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C3415j0 extends AbstractC3406h1 implements K1 {
    private static final C3415j0 zzb;
    private int zzd;
    private int zze;
    private C3490y1 zzg;
    private byte zzh = 2;
    private InterfaceC3441o1 zzf = AbstractC3406h1.r();

    static {
        C3415j0 c3415j0 = new C3415j0();
        zzb = c3415j0;
        AbstractC3406h1.C(C3415j0.class, c3415j0);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC3406h1
    public final Object I(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return Byte.valueOf(this.zzh);
        }
        if (i11 == 2) {
            return AbstractC3406h1.z(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0001\u0001᠌\u0000\u0002\u001a\u0003ᐉ\u0001", new Object[]{"zzd", "zze", C3405h0.f29860a, "zzf", "zzg"});
        }
        if (i11 == 3) {
            return new C3415j0();
        }
        AbstractC3395f0 abstractC3395f0 = null;
        if (i11 == 4) {
            return new C3400g0(abstractC3395f0);
        }
        if (i11 == 5) {
            return zzb;
        }
        this.zzh = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }

    public final List K() {
        return this.zzf;
    }

    public final int L() {
        int iA = AbstractC3410i0.a(this.zze);
        if (iA == 0) {
            return 1;
        }
        return iA;
    }
}
