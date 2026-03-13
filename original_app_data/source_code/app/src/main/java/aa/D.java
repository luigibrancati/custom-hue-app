package aa;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC3406h1;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.K1;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class D extends AbstractC3406h1 implements K1 {
    private static final D zzb;
    private int zzd;
    private String zze = "";
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";
    private C2661B zzj;
    private C2661B zzk;

    static {
        D d10 = new D();
        zzb = d10;
        AbstractC3406h1.C(D.class, d10);
    }

    public static D M() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC3406h1
    public final Object I(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC3406h1.z(zzb, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဉ\u0005\u0007ဉ\u0006", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        if (i11 == 3) {
            return new D();
        }
        AbstractC2664b abstractC2664b = null;
        if (i11 == 4) {
            return new C2662C(abstractC2664b);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }

    public final C2661B J() {
        C2661B c2661b = this.zzk;
        return c2661b == null ? C2661B.Q() : c2661b;
    }

    public final C2661B K() {
        C2661B c2661b = this.zzj;
        return c2661b == null ? C2661B.Q() : c2661b;
    }

    public final String N() {
        return this.zzf;
    }

    public final String O() {
        return this.zzg;
    }

    public final String P() {
        return this.zzh;
    }

    public final String Q() {
        return this.zzi;
    }

    public final String R() {
        return this.zze;
    }
}
