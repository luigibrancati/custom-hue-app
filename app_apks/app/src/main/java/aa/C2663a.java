package aa;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC3406h1;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.G0;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.InterfaceC3441o1;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.K1;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.S0;
import java.util.List;

/* JADX INFO: renamed from: aa.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C2663a extends AbstractC3406h1 implements K1 {
    private static final C2663a zzb;
    private int zzd;
    private int zzf;
    private byte zzi = 2;
    private InterfaceC3441o1 zze = AbstractC3406h1.r();
    private String zzg = "";
    private G0 zzh = G0.f29754b;

    static {
        C2663a c2663a = new C2663a();
        zzb = c2663a;
        AbstractC3406h1.C(C2663a.class, c2663a);
    }

    public static C2663a K(byte[] bArr, S0 s02) {
        return (C2663a) AbstractC3406h1.n(zzb, bArr, s02);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC3406h1
    public final Object I(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return Byte.valueOf(this.zzi);
        }
        if (i11 == 2) {
            return AbstractC3406h1.z(zzb, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0002\u0001Л\u0002ᴌ\u0000\u0003ဈ\u0001\u0004ည\u0002", new Object[]{"zzd", "zze", s.class, "zzf", C2673k.f21203a, "zzg", "zzh"});
        }
        if (i11 == 3) {
            return new C2663a();
        }
        AbstractC2664b abstractC2664b = null;
        if (i11 == 4) {
            return new x(abstractC2664b);
        }
        if (i11 == 5) {
            return zzb;
        }
        this.zzi = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }

    public final List L() {
        return this.zze;
    }
}
