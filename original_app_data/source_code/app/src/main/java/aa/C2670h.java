package aa;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC3406h1;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.K1;

/* JADX INFO: renamed from: aa.h, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C2670h extends AbstractC3406h1 implements K1 {
    private static final C2670h zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private byte zzg = 2;

    static {
        C2670h c2670h = new C2670h();
        zzb = c2670h;
        AbstractC3406h1.C(C2670h.class, c2670h);
    }

    public static C2669g L() {
        return (C2669g) zzb.g();
    }

    public static /* synthetic */ void N(C2670h c2670h, int i10) {
        c2670h.zzd |= 1;
        c2670h.zze = i10;
    }

    public static /* synthetic */ void O(C2670h c2670h, int i10) {
        c2670h.zzd |= 2;
        c2670h.zzf = i10;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC3406h1
    public final Object I(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return Byte.valueOf(this.zzg);
        }
        if (i11 == 2) {
            return AbstractC3406h1.z(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᔄ\u0000\u0002ᔄ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i11 == 3) {
            return new C2670h();
        }
        AbstractC2664b abstractC2664b = null;
        if (i11 == 4) {
            return new C2669g(abstractC2664b);
        }
        if (i11 == 5) {
            return zzb;
        }
        this.zzg = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }

    public final int J() {
        return this.zze;
    }

    public final int K() {
        return this.zzf;
    }
}
