package H7;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC3406h1;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.G0;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.I2;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.K1;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class m extends AbstractC3406h1 implements K1 {
    private static final m zzb;
    private int zzd;
    private j zzj;
    private I2 zzl;
    private String zze = "";
    private G0 zzf = G0.f29754b;
    private int zzg = 10;
    private float zzh = 0.5f;
    private float zzi = 0.05f;
    private int zzk = 1;
    private int zzm = 320;
    private int zzn = 4;
    private int zzo = 2;

    static {
        m mVar = new m();
        zzb = mVar;
        AbstractC3406h1.C(m.class, mVar);
    }

    public static l J() {
        return (l) zzb.g();
    }

    public static /* synthetic */ void L(m mVar, j jVar) {
        jVar.getClass();
        mVar.zzj = jVar;
        mVar.zzd |= 32;
    }

    public static /* synthetic */ void M(m mVar, G0 g02) {
        g02.getClass();
        mVar.zzd |= 2;
        mVar.zzf = g02;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC3406h1
    public final Object I(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC3406h1.z(zzb, "\u0004\u000b\u0000\u0001\u0001\f\u000b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ည\u0001\u0003ဋ\u0002\u0004ခ\u0003\u0005ခ\u0004\u0006ဉ\u0005\bင\u0006\tဉ\u0007\nင\b\u000bင\t\fင\n", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo"});
        }
        if (i11 == 3) {
            return new m();
        }
        k kVar = null;
        if (i11 == 4) {
            return new l(kVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
