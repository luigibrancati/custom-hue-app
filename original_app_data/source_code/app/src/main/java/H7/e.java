package H7;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC3406h1;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.G0;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.K1;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class e extends AbstractC3406h1 implements K1 {
    private static final e zzb;
    private int zzd;
    private String zze = "";
    private G0 zzf;
    private String zzg;
    private G0 zzh;
    private float zzi;
    private float zzj;
    private float zzk;
    private float zzl;
    private int zzm;

    static {
        e eVar = new e();
        zzb = eVar;
        AbstractC3406h1.C(e.class, eVar);
    }

    public e() {
        G0 g02 = G0.f29754b;
        this.zzf = g02;
        this.zzg = "";
        this.zzh = g02;
        this.zzi = 0.25f;
        this.zzj = 0.25f;
        this.zzk = 0.5f;
        this.zzl = 0.85f;
        this.zzm = 1;
    }

    public static C0870d J() {
        return (C0870d) zzb.g();
    }

    public static /* synthetic */ void L(e eVar, G0 g02) {
        g02.getClass();
        eVar.zzd |= 2;
        eVar.zzf = g02;
    }

    public static /* synthetic */ void M(e eVar, G0 g02) {
        g02.getClass();
        eVar.zzd |= 8;
        eVar.zzh = g02;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC3406h1
    public final Object I(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC3406h1.z(zzb, "\u0004\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001ဈ\u0000\u0002ည\u0001\u0003ဈ\u0002\u0004ည\u0003\u0005ခ\u0004\u0006ခ\u0005\u0007ခ\u0006\bခ\u0007\tင\b", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm"});
        }
        if (i11 == 3) {
            return new e();
        }
        AbstractC0869c abstractC0869c = null;
        if (i11 == 4) {
            return new C0870d(abstractC0869c);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
