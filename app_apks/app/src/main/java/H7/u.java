package H7;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC3406h1;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.InterfaceC3441o1;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.K1;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class u extends AbstractC3406h1 implements K1 {
    private static final u zzb;
    private InterfaceC3441o1 zzd = AbstractC3406h1.r();
    private InterfaceC3441o1 zze = AbstractC3406h1.r();

    static {
        u uVar = new u();
        zzb = uVar;
        AbstractC3406h1.C(u.class, uVar);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC3406h1
    public final Object I(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC3406h1.z(zzb, "\u0004\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001b\u0002\u001b", new Object[]{"zzd", r.class, "zze", r.class});
        }
        if (i11 == 3) {
            return new u();
        }
        s sVar = null;
        if (i11 == 4) {
            return new t(sVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
