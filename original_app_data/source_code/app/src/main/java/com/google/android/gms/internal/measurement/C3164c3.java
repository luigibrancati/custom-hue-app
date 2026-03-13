package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.c3, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C3164c3 extends AbstractC3148a5 implements D5 {
    private static final C3164c3 zzf;
    private int zzb;
    private int zzd = 1;
    private InterfaceC3202g5 zze = AbstractC3148a5.z();

    static {
        C3164c3 c3164c3 = new C3164c3();
        zzf = c3164c3;
        AbstractC3148a5.t(C3164c3.class, c3164c3);
    }

    public static C3146a3 D() {
        return (C3146a3) zzf.p();
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC3148a5
    public final Object C(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC3148a5.u(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001᠌\u0000\u0002\u001b", new Object[]{"zzb", "zzd", C3155b3.f29419a, "zze", P2.class});
        }
        if (i11 == 3) {
            return new C3164c3();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new C3146a3(bArr);
        }
        if (i11 == 5) {
            return zzf;
        }
        throw null;
    }

    public final /* synthetic */ void E(P2 p22) {
        p22.getClass();
        InterfaceC3202g5 interfaceC3202g5 = this.zze;
        if (!interfaceC3202g5.zza()) {
            this.zze = AbstractC3148a5.A(interfaceC3202g5);
        }
        this.zze.add(p22);
    }
}
