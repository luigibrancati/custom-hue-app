package aa;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC3406h1;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.K1;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class L extends AbstractC3406h1 implements K1 {
    private static final L zzb;
    private int zzd;
    private int zze;
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";

    static {
        L l10 = new L();
        zzb = l10;
        AbstractC3406h1.C(L.class, l10);
    }

    public static L K() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC3406h1
    public final Object I(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC3406h1.z(zzb, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003", new Object[]{"zzd", "zze", J.f21202a, "zzf", "zzg", "zzh"});
        }
        if (i11 == 3) {
            return new L();
        }
        AbstractC2664b abstractC2664b = null;
        if (i11 == 4) {
            return new I(abstractC2664b);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }

    public final String L() {
        return this.zzf;
    }

    public final String M() {
        return this.zzh;
    }

    public final String N() {
        return this.zzg;
    }

    public final int O() {
        int iA = K.a(this.zze);
        if (iA == 0) {
            return 1;
        }
        return iA;
    }
}
