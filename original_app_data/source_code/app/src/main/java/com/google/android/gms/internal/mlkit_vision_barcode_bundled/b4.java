package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class b4 extends AbstractC3406h1 implements K1 {
    private static final b4 zzb;
    private int zzd;
    private V3 zzj;
    private byte zzk = 2;
    private InterfaceC3436n1 zze = AbstractC3406h1.q();
    private InterfaceC3431m1 zzf = AbstractC3406h1.o();
    private boolean zzg = true;
    private String zzh = "";
    private String zzi = "";

    static {
        b4 b4Var = new b4();
        zzb = b4Var;
        AbstractC3406h1.C(b4.class, b4Var);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC3406h1
    public final Object I(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return Byte.valueOf(this.zzk);
        }
        if (i11 == 2) {
            return AbstractC3406h1.z(zzb, "\u0001\u0006\u0000\u0001\u0001\u000f\u0006\u0000\u0002\u0001\u0001\u0016\u0002\u0013\u0003ဇ\u0000\u0004ဈ\u0001\u0005ဈ\u0002\u000fᐉ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i11 == 3) {
            return new b4();
        }
        Z3 z32 = null;
        if (i11 == 4) {
            return new a4(z32);
        }
        if (i11 == 5) {
            return zzb;
        }
        this.zzk = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
