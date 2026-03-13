package aa;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC3406h1;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.K1;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class P extends AbstractC3406h1 implements K1 {
    private static final P zzb;
    private int zzd;
    private double zze;
    private double zzf;
    private byte zzg = 2;

    static {
        P p10 = new P();
        zzb = p10;
        AbstractC3406h1.C(P.class, p10);
    }

    public static P M() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC3406h1
    public final Object I(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return Byte.valueOf(this.zzg);
        }
        if (i11 == 2) {
            return AbstractC3406h1.z(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᔀ\u0000\u0002ᔀ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i11 == 3) {
            return new P();
        }
        AbstractC2664b abstractC2664b = null;
        if (i11 == 4) {
            return new O(abstractC2664b);
        }
        if (i11 == 5) {
            return zzb;
        }
        this.zzg = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }

    public final double J() {
        return this.zze;
    }

    public final double K() {
        return this.zzf;
    }
}
