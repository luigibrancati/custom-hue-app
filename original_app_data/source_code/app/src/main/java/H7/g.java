package H7;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC3406h1;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.InterfaceC3431m1;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.K1;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class g extends AbstractC3406h1 implements K1 {
    private static final g zzb;
    private int zzd;
    private InterfaceC3431m1 zze = AbstractC3406h1.o();
    private InterfaceC3431m1 zzf = AbstractC3406h1.o();
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;

    static {
        g gVar = new g();
        zzb = gVar;
        AbstractC3406h1.C(g.class, gVar);
    }

    public static f J() {
        return (f) zzb.g();
    }

    public static /* synthetic */ void L(g gVar, int i10) {
        gVar.zzd |= 2;
        gVar.zzh = i10;
    }

    public static /* synthetic */ void M(g gVar, float f10) {
        InterfaceC3431m1 interfaceC3431m1 = gVar.zze;
        if (!interfaceC3431m1.b()) {
            gVar.zze = AbstractC3406h1.p(interfaceC3431m1);
        }
        gVar.zze.k0(f10);
    }

    public static /* synthetic */ void N(g gVar, float f10) {
        InterfaceC3431m1 interfaceC3431m1 = gVar.zzf;
        if (!interfaceC3431m1.b()) {
            gVar.zzf = AbstractC3406h1.p(interfaceC3431m1);
        }
        gVar.zzf.k0(f10);
    }

    public static /* synthetic */ void O(g gVar, int i10) {
        gVar.zzd |= 1;
        gVar.zzg = i10;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC3406h1
    public final Object I(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC3406h1.z(zzb, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0002\u0000\u0001\u0013\u0002\u0013\u0003ဋ\u0000\u0004ဋ\u0001\u0005ဋ\u0002\u0006ဋ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i11 == 3) {
            return new g();
        }
        AbstractC0868b abstractC0868b = null;
        if (i11 == 4) {
            return new f(abstractC0868b);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
