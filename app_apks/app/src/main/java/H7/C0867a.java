package H7;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC3406h1;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.K1;

/* JADX INFO: renamed from: H7.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C0867a extends AbstractC3406h1 implements K1 {
    private static final C0867a zzb;
    private int zzd;
    private m zze;
    private e zzf;
    private u zzg;

    static {
        C0867a c0867a = new C0867a();
        zzb = c0867a;
        AbstractC3406h1.C(C0867a.class, c0867a);
    }

    public static o J() {
        return (o) zzb.g();
    }

    public static /* synthetic */ void L(C0867a c0867a, m mVar) {
        mVar.getClass();
        c0867a.zze = mVar;
        c0867a.zzd |= 1;
    }

    public static /* synthetic */ void M(C0867a c0867a, e eVar) {
        eVar.getClass();
        c0867a.zzf = eVar;
        c0867a.zzd |= 2;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC3406h1
    public final Object I(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC3406h1.z(zzb, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i11 == 3) {
            return new C0867a();
        }
        n nVar = null;
        if (i11 == 4) {
            return new o(nVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
