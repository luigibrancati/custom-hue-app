package aa;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC3406h1;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.G0;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.K1;

/* JADX INFO: renamed from: aa.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C2667e extends AbstractC3406h1 implements K1 {
    private static final C2667e zzb;
    private int zzd;
    private int zze;
    private G0 zzf = G0.f29754b;

    static {
        C2667e c2667e = new C2667e();
        zzb = c2667e;
        AbstractC3406h1.C(C2667e.class, c2667e);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC3406h1
    public final Object I(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC3406h1.z(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ည\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i11 == 3) {
            return new C2667e();
        }
        AbstractC2664b abstractC2664b = null;
        if (i11 == 4) {
            return new C2666d(abstractC2664b);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
