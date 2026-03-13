package aa;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC3406h1;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.C3415j0;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.C3425l0;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.C3445p0;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.InterfaceC3441o1;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.K1;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class F extends AbstractC3406h1 implements K1 {
    private static final F zzb;
    private int zzd;
    private C3425l0 zze;
    private byte zzm = 2;
    private String zzf = "";
    private String zzg = "";
    private InterfaceC3441o1 zzh = AbstractC3406h1.r();
    private InterfaceC3441o1 zzi = AbstractC3406h1.r();
    private InterfaceC3441o1 zzj = AbstractC3406h1.r();
    private InterfaceC3441o1 zzk = AbstractC3406h1.r();
    private String zzl = "";

    static {
        F f10 = new F();
        zzb = f10;
        AbstractC3406h1.C(F.class, f10);
    }

    public static F L() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC3406h1
    public final Object I(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return Byte.valueOf(this.zzm);
        }
        if (i11 == 2) {
            return AbstractC3406h1.z(zzb, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0004\u0001\u0001ဉ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004\u001b\u0005\u001b\u0006\u001a\u0007Л\bဈ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", C3445p0.class, "zzi", L.class, "zzj", "zzk", C3415j0.class, "zzl"});
        }
        if (i11 == 3) {
            return new F();
        }
        AbstractC2664b abstractC2664b = null;
        if (i11 == 4) {
            return new E(abstractC2664b);
        }
        if (i11 == 5) {
            return zzb;
        }
        this.zzm = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }

    public final C3425l0 J() {
        C3425l0 c3425l0 = this.zze;
        return c3425l0 == null ? C3425l0.K() : c3425l0;
    }

    public final String M() {
        return this.zzf;
    }

    public final String N() {
        return this.zzg;
    }

    public final List O() {
        return this.zzk;
    }

    public final List P() {
        return this.zzi;
    }

    public final List Q() {
        return this.zzh;
    }

    public final List R() {
        return this.zzj;
    }
}
