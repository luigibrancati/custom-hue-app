package aa;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC3406h1;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.InterfaceC3441o1;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.K1;

/* JADX INFO: renamed from: aa.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C2668f extends AbstractC3406h1 implements K1 {
    private static final C2668f zzb;
    private InterfaceC3441o1 zzd = AbstractC3406h1.r();

    static {
        C2668f c2668f = new C2668f();
        zzb = c2668f;
        AbstractC3406h1.C(C2668f.class, c2668f);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC3406h1
    public final Object I(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC3406h1.z(zzb, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", C2667e.class});
        }
        if (i11 == 3) {
            return new C2668f();
        }
        AbstractC2664b abstractC2664b = null;
        if (i11 == 4) {
            return new C2665c(abstractC2664b);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
