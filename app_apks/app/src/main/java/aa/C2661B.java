package aa;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC3406h1;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.K1;

/* JADX INFO: renamed from: aa.B, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C2661B extends AbstractC3406h1 implements K1 {
    private static final C2661B zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private boolean zzk;

    static {
        C2661B c2661b = new C2661B();
        zzb = c2661b;
        AbstractC3406h1.C(C2661B.class, c2661b);
    }

    public static C2661B Q() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC3406h1
    public final Object I(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC3406h1.z(zzb, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006င\u0005\u0007ဇ\u0006", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        if (i11 == 3) {
            return new C2661B();
        }
        AbstractC2664b abstractC2664b = null;
        if (i11 == 4) {
            return new C2660A(abstractC2664b);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }

    public final int J() {
        return this.zzg;
    }

    public final int K() {
        return this.zzh;
    }

    public final int L() {
        return this.zzi;
    }

    public final int M() {
        return this.zzf;
    }

    public final int N() {
        return this.zzj;
    }

    public final int O() {
        return this.zze;
    }

    public final boolean R() {
        return this.zzk;
    }
}
