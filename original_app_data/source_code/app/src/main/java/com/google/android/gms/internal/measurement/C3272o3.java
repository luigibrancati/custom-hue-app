package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.o3, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C3272o3 extends AbstractC3148a5 implements D5 {
    private static final C3272o3 zzg;
    private int zzb;
    private int zzd;
    private int zze;
    private int zzf;

    static {
        C3272o3 c3272o3 = new C3272o3();
        zzg = c3272o3;
        AbstractC3148a5.t(C3272o3.class, c3272o3);
    }

    public static C3209h3 E() {
        return (C3209h3) zzg.p();
    }

    public static C3272o3 F() {
        return zzg;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC3148a5
    public final Object C(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC3148a5.u(zzg, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002", new Object[]{"zzb", "zzd", C3254m3.f29547a, "zze", C3218i3.f29499a, "zzf", C3236k3.f29530a});
        }
        if (i11 == 3) {
            return new C3272o3();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new C3209h3(bArr);
        }
        if (i11 == 5) {
            return zzg;
        }
        throw null;
    }

    public final EnumC3227j3 D() {
        EnumC3227j3 enumC3227j3A = EnumC3227j3.a(this.zze);
        return enumC3227j3A == null ? EnumC3227j3.CLIENT_UPLOAD_ELIGIBILITY_UNKNOWN : enumC3227j3A;
    }

    public final /* synthetic */ void G(EnumC3227j3 enumC3227j3) {
        this.zze = enumC3227j3.zza();
        this.zzb |= 2;
    }

    public final int I() {
        int iA = AbstractC3263n3.a(this.zzd);
        if (iA == 0) {
            return 1;
        }
        return iA;
    }

    public final int J() {
        int iA = AbstractC3245l3.a(this.zzf);
        if (iA == 0) {
            return 1;
        }
        return iA;
    }

    public final /* synthetic */ void K(int i10) {
        this.zzd = i10 - 1;
        this.zzb |= 1;
    }

    public final /* synthetic */ void L(int i10) {
        this.zzf = i10 - 1;
        this.zzb |= 4;
    }
}
