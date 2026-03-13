package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.g3, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C3200g3 extends AbstractC3148a5 implements D5 {
    private static final C3200g3 zzf;
    private int zzb;
    private int zzd;
    private InterfaceC3193f5 zze = AbstractC3148a5.x();

    static {
        C3200g3 c3200g3 = new C3200g3();
        zzf = c3200g3;
        AbstractC3148a5.t(C3200g3.class, c3200g3);
    }

    public static C3191f3 I() {
        return (C3191f3) zzf.p();
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC3148a5
    public final Object C(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC3148a5.u(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001င\u0000\u0002\u0014", new Object[]{"zzb", "zzd", "zze"});
        }
        if (i11 == 3) {
            return new C3200g3();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new C3191f3(bArr);
        }
        if (i11 == 5) {
            return zzf;
        }
        throw null;
    }

    public final boolean D() {
        return (this.zzb & 1) != 0;
    }

    public final int E() {
        return this.zzd;
    }

    public final List F() {
        return this.zze;
    }

    public final int G() {
        return this.zze.size();
    }

    public final long H(int i10) {
        return this.zze.S(i10);
    }

    public final /* synthetic */ void J(int i10) {
        this.zzb |= 1;
        this.zzd = i10;
    }

    public final /* synthetic */ void K(Iterable iterable) {
        InterfaceC3193f5 interfaceC3193f5 = this.zze;
        if (!interfaceC3193f5.zza()) {
            this.zze = AbstractC3148a5.y(interfaceC3193f5);
        }
        AbstractC3282p4.d(iterable, this.zze);
    }
}
