package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* JADX INFO: renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.i, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C3409i extends AbstractC3406h1 implements K1 {
    private static final C3409i zzb;
    private int zzd;
    private j4 zzj;
    private V3 zzk;
    private byte zzl = 2;
    private String zze = "";
    private String zzf = "";
    private InterfaceC3436n1 zzg = AbstractC3406h1.q();
    private String zzh = "";
    private String zzi = "";

    static {
        C3409i c3409i = new C3409i();
        zzb = c3409i;
        AbstractC3406h1.C(C3409i.class, c3409i);
        AbstractC3406h1.j(V3.L(), c3409i, c3409i, null, 308676116, D2.zzk, C3409i.class);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC3406h1
    public final Object I(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return Byte.valueOf(this.zzl);
        }
        if (i11 == 2) {
            return AbstractC3406h1.z(zzb, "\u0001\u0007\u0000\u0001\u0001Ǵ\u0007\u0000\u0001\u0002\u0001ᔈ\u0000\u0002ဈ\u0001\u0003ࠞ\u0005ဈ\u0002\u0006ဈ\u0003\u000fᐉ\u0005Ǵဉ\u0004", new Object[]{"zzd", "zze", "zzf", "zzg", C3404h.f29859a, "zzh", "zzi", "zzk", "zzj"});
        }
        if (i11 == 3) {
            return new C3409i();
        }
        AbstractC3394f abstractC3394f = null;
        if (i11 == 4) {
            return new C3399g(abstractC3394f);
        }
        if (i11 == 5) {
            return zzb;
        }
        this.zzl = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
