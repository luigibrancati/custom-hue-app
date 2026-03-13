package aa;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC3406h1;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.C3445p0;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.G0;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.InterfaceC3436n1;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.InterfaceC3441o1;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.K1;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class s extends AbstractC3406h1 implements K1 {
    private static final s zzb;
    private byte zzA = 2;
    private int zzd;
    private int zze;
    private G0 zzf;
    private String zzg;
    private C2668f zzh;
    private int zzi;
    private F zzj;
    private L zzk;
    private C3445p0 zzl;
    private C2672j zzm;
    private q zzn;
    private C2675m zzo;
    private P zzp;
    private D zzq;
    private H zzr;
    private z zzs;
    private InterfaceC3441o1 zzt;
    private InterfaceC3436n1 zzu;
    private String zzv;
    private InterfaceC3441o1 zzw;
    private boolean zzx;
    private double zzy;
    private G0 zzz;

    static {
        s sVar = new s();
        zzb = sVar;
        AbstractC3406h1.C(s.class, sVar);
    }

    public s() {
        G0 g02 = G0.f29754b;
        this.zzf = g02;
        this.zzg = "";
        this.zzt = AbstractC3406h1.r();
        this.zzu = AbstractC3406h1.q();
        this.zzv = "";
        this.zzw = AbstractC3406h1.r();
        this.zzx = true;
        this.zzz = g02;
    }

    public static /* synthetic */ void Y(s sVar, int i10, C2670h c2670h) {
        c2670h.getClass();
        InterfaceC3441o1 interfaceC3441o1 = sVar.zzt;
        if (!interfaceC3441o1.b()) {
            sVar.zzt = AbstractC3406h1.u(interfaceC3441o1);
        }
        sVar.zzt.set(i10, c2670h);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC3406h1
    public final Object I(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return Byte.valueOf(this.zzA);
        }
        if (i11 == 2) {
            return AbstractC3406h1.z(zzb, "\u0004\u0016\u0000\u0001\u0001\u0017\u0016\u0000\u0003\u000b\u0001ᴌ\u0000\u0002ᔊ\u0001\u0003ᔈ\u0002\u0004ᴌ\u0004\u0005ᐉ\u0005\u0006ဉ\u0006\u0007ဉ\u0007\bᐉ\b\tᐉ\t\nᐉ\n\u000bЛ\fဈ\u000f\rЛ\u000eည\u0012\u000fᐉ\u000b\u0010ဉ\f\u0011ဉ\r\u0012\u0016\u0013ဉ\u000e\u0014ဇ\u0010\u0015က\u0011\u0017ဉ\u0003", new Object[]{"zzd", "zze", t.f21205a, "zzf", "zzg", "zzi", v.f21206a, "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzt", C2670h.class, "zzv", "zzw", C2670h.class, "zzz", "zzp", "zzq", "zzr", "zzu", "zzs", "zzx", "zzy", "zzh"});
        }
        if (i11 == 3) {
            return new s();
        }
        AbstractC2664b abstractC2664b = null;
        if (i11 == 4) {
            return new r(abstractC2664b);
        }
        if (i11 == 5) {
            return zzb;
        }
        this.zzA = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }

    public final int J() {
        int iA = w.a(this.zzi);
        if (iA == 0) {
            return 1;
        }
        return iA;
    }

    public final int K() {
        return this.zzt.size();
    }

    public final C3445p0 L() {
        C3445p0 c3445p0 = this.zzl;
        return c3445p0 == null ? C3445p0.K() : c3445p0;
    }

    public final D N() {
        D d10 = this.zzq;
        return d10 == null ? D.M() : d10;
    }

    public final F O() {
        F f10 = this.zzj;
        return f10 == null ? F.L() : f10;
    }

    public final H P() {
        H h10 = this.zzr;
        return h10 == null ? H.K() : h10;
    }

    public final L Q() {
        L l10 = this.zzk;
        return l10 == null ? L.K() : l10;
    }

    public final P R() {
        P p10 = this.zzp;
        return p10 == null ? P.M() : p10;
    }

    public final C2672j S() {
        C2672j c2672j = this.zzm;
        return c2672j == null ? C2672j.K() : c2672j;
    }

    public final C2675m T() {
        C2675m c2675m = this.zzo;
        return c2675m == null ? C2675m.K() : c2675m;
    }

    public final q U() {
        q qVar = this.zzn;
        return qVar == null ? q.K() : qVar;
    }

    public final G0 V() {
        return this.zzf;
    }

    public final String W() {
        return this.zzg;
    }

    public final List X() {
        return this.zzt;
    }

    public final boolean Z() {
        return (this.zzd & RecognitionOptions.AZTEC) != 0;
    }

    public final boolean a0() {
        return (this.zzd & 32) != 0;
    }

    public final boolean b0() {
        return (this.zzd & 8192) != 0;
    }

    public final boolean c0() {
        return (this.zzd & 64) != 0;
    }

    public final boolean d0() {
        return (this.zzd & RecognitionOptions.PDF417) != 0;
    }

    public final boolean e0() {
        return (this.zzd & 128) != 0;
    }

    public final boolean f0() {
        return (this.zzd & 256) != 0;
    }

    public final boolean g0() {
        return (this.zzd & RecognitionOptions.UPC_E) != 0;
    }

    public final boolean h0() {
        return (this.zzd & 512) != 0;
    }

    public final int i0() {
        int iA = u.a(this.zze);
        if (iA == 0) {
            return 1;
        }
        return iA;
    }
}
