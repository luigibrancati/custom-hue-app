package aa;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC3406h1;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.K1;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class H extends AbstractC3406h1 implements K1 {
    private static final H zzb;
    private int zzd;
    private String zze = "";
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";
    private String zzj = "";
    private String zzk = "";
    private String zzl = "";
    private String zzm = "";
    private String zzn = "";
    private String zzo = "";
    private String zzp = "";
    private String zzq = "";
    private String zzr = "";

    static {
        H h10 = new H();
        zzb = h10;
        AbstractC3406h1.C(H.class, h10);
    }

    public static H K() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC3406h1
    public final Object I(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC3406h1.z(zzb, "\u0004\u000e\u0000\u0001\u0001\u000e\u000e\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006\bဈ\u0007\tဈ\b\nဈ\t\u000bဈ\n\fဈ\u000b\rဈ\f\u000eဈ\r", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", "zzr"});
        }
        if (i11 == 3) {
            return new H();
        }
        AbstractC2664b abstractC2664b = null;
        if (i11 == 4) {
            return new G(abstractC2664b);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }

    public final String L() {
        return this.zzk;
    }

    public final String M() {
        return this.zzl;
    }

    public final String N() {
        return this.zzj;
    }

    public final String O() {
        return this.zzm;
    }

    public final String P() {
        return this.zzq;
    }

    public final String Q() {
        return this.zze;
    }

    public final String R() {
        return this.zzp;
    }

    public final String S() {
        return this.zzf;
    }

    public final String T() {
        return this.zzi;
    }

    public final String U() {
        return this.zzo;
    }

    public final String V() {
        return this.zzr;
    }

    public final String W() {
        return this.zzh;
    }

    public final String X() {
        return this.zzn;
    }

    public final String Y() {
        return this.zzg;
    }
}
