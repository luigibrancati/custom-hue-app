package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.u4, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C3622u4 extends O2 implements InterfaceC3574m3 {
    private static final C3622u4 zzb;
    private int zzd;
    private String zze = "";
    private String zzf = "";
    private int zzg;
    private long zzh;

    static {
        C3622u4 c3622u4 = new C3622u4();
        zzb = c3622u4;
        O2.z(C3622u4.class, c3622u4);
    }

    public static /* synthetic */ void D(C3622u4 c3622u4, int i10) {
        c3622u4.zzd |= 4;
        c3622u4.zzg = i10;
    }

    public static /* synthetic */ void E(C3622u4 c3622u4, long j10) {
        c3622u4.zzd |= 8;
        c3622u4.zzh = j10;
    }

    public static /* synthetic */ void F(C3622u4 c3622u4, String str) {
        str.getClass();
        c3622u4.zzd |= 2;
        c3622u4.zzf = str;
    }

    public static /* synthetic */ void G(C3622u4 c3622u4, String str) {
        str.getClass();
        c3622u4.zzd |= 1;
        c3622u4.zze = str;
    }

    public static C3610s4 H() {
        return (C3610s4) zzb.n();
    }

    @Override // com.google.android.gms.internal.play_billing.O2
    public final Object l(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return O2.w(zzb, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004ဂ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (i11 == 3) {
            return new C3622u4();
        }
        AbstractC3616t4 abstractC3616t4 = null;
        if (i11 == 4) {
            return new C3610s4(abstractC3616t4);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
