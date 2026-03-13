package H7;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC3406h1;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.G0;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.I2;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.K1;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class A extends AbstractC3406h1 implements K1 {
    private static final A zzb;
    private int zzd;
    private I2 zzf;
    private G0 zze = G0.f29754b;
    private int zzg = 1;
    private float zzh = 0.75f;
    private boolean zzi = true;

    static {
        A a10 = new A();
        zzb = a10;
        AbstractC3406h1.C(A.class, a10);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC3406h1
    public final Object I(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC3406h1.z(zzb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ည\u0000\u0002ဉ\u0001\u0003င\u0002\u0004ခ\u0003\u0005ဇ\u0004", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (i11 == 3) {
            return new A();
        }
        y yVar = null;
        if (i11 == 4) {
            return new z(yVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
