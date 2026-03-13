package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* JADX INFO: renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.y1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C3490y1 extends AbstractC3406h1 implements K1 {
    private static final C3490y1 zzb;
    private int zzd;
    private V3 zzi;
    private C3490y1 zzj;
    private j4 zzk;
    private byte zzl = 2;
    private String zze = "";
    private InterfaceC3441o1 zzf = AbstractC3406h1.r();
    private InterfaceC3441o1 zzg = AbstractC3406h1.r();
    private InterfaceC3441o1 zzh = AbstractC3406h1.r();

    static {
        C3490y1 c3490y1 = new C3490y1();
        zzb = c3490y1;
        AbstractC3406h1.C(C3490y1.class, c3490y1);
        AbstractC3406h1.j(V3.L(), c3490y1, c3490y1, null, 12208774, D2.zzk, C3490y1.class);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC3406h1
    public final Object I(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return Byte.valueOf(this.zzl);
        }
        if (i11 == 2) {
            return AbstractC3406h1.z(zzb, "\u0001\u0007\u0000\u0001\u0002Ǵ\u0007\u0000\u0003\u0004\u0002Л\u0005Л\u0006\u001b\bᐉ\u0001\nဈ\u0000\u000bᐉ\u0002Ǵဉ\u0003", new Object[]{"zzd", "zzf", C3497z3.class, "zzh", C3497z3.class, "zzg", Y3.class, "zzi", "zze", "zzj", "zzk"});
        }
        if (i11 == 3) {
            return new C3490y1();
        }
        A0 a02 = null;
        if (i11 == 4) {
            return new C3371a1(a02);
        }
        if (i11 == 5) {
            return zzb;
        }
        this.zzl = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
