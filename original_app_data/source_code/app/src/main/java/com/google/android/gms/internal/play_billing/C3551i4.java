package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.i4, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C3551i4 extends O2 implements InterfaceC3574m3 {
    private static final C3551i4 zzb;
    private int zzd;
    private int zze;
    private int zzg;
    private String zzf = "";
    private String zzh = "";

    static {
        C3551i4 c3551i4 = new C3551i4();
        zzb = c3551i4;
        O2.z(C3551i4.class, c3551i4);
    }

    public static /* synthetic */ void D(C3551i4 c3551i4, String str) {
        c3551i4.zzd |= 8;
        c3551i4.zzh = str;
    }

    public static /* synthetic */ void E(C3551i4 c3551i4, String str) {
        str.getClass();
        c3551i4.zzd |= 2;
        c3551i4.zzf = str;
    }

    public static /* synthetic */ void F(C3551i4 c3551i4, int i10) {
        c3551i4.zzd |= 1;
        c3551i4.zze = i10;
    }

    public static /* synthetic */ void G(C3551i4 c3551i4, int i10) {
        c3551i4.zzg = i10 - 1;
        c3551i4.zzd |= 4;
    }

    public static C3527e4 H() {
        return (C3527e4) zzb.n();
    }

    @Override // com.google.android.gms.internal.play_billing.O2
    public final Object l(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return O2.w(zzb, "\u0004\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0004᠌\u0002\u0005ဈ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", C3533f4.f30167a, "zzh"});
        }
        if (i11 == 3) {
            return new C3551i4();
        }
        AbstractC3545h4 abstractC3545h4 = null;
        if (i11 == 4) {
            return new C3527e4(abstractC3545h4);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
