package H7;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC3406h1;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.InterfaceC3441o1;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.K1;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class j extends AbstractC3406h1 implements K1 {
    private static final j zzb;
    private InterfaceC3441o1 zzd = AbstractC3406h1.r();

    static {
        j jVar = new j();
        zzb = jVar;
        AbstractC3406h1.C(j.class, jVar);
    }

    public static i J() {
        return (i) zzb.g();
    }

    public static /* synthetic */ void L(j jVar, g gVar) {
        gVar.getClass();
        InterfaceC3441o1 interfaceC3441o1 = jVar.zzd;
        if (!interfaceC3441o1.b()) {
            jVar.zzd = AbstractC3406h1.u(interfaceC3441o1);
        }
        jVar.zzd.add(gVar);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC3406h1
    public final Object I(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC3406h1.z(zzb, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", g.class});
        }
        if (i11 == 3) {
            return new j();
        }
        h hVar = null;
        if (i11 == 4) {
            return new i(hVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
