package H7;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC3406h1;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.K1;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class x extends AbstractC3406h1 implements K1 {
    private static final x zzb;

    static {
        x xVar = new x();
        zzb = xVar;
        AbstractC3406h1.C(x.class, xVar);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC3406h1
    public final Object I(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        v vVar = null;
        if (i11 == 2) {
            return AbstractC3406h1.z(zzb, "\u0001\u0000", null);
        }
        if (i11 == 3) {
            return new x();
        }
        if (i11 == 4) {
            return new w(vVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
