package H7;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC3406h1;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.K1;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class D extends AbstractC3406h1 implements K1 {
    private static final D zzb;

    static {
        D d10 = new D();
        zzb = d10;
        AbstractC3406h1.C(D.class, d10);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC3406h1
    public final Object I(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        B b10 = null;
        if (i11 == 2) {
            return AbstractC3406h1.z(zzb, "\u0001\u0000", null);
        }
        if (i11 == 3) {
            return new D();
        }
        if (i11 == 4) {
            return new C(b10);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
