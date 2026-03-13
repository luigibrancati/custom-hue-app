package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.f2, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C3190f2 extends AbstractC3148a5 implements D5 {
    private static final C3190f2 zzu;
    private int zzb;
    private long zzd;
    private int zzf;
    private boolean zzk;
    private Z1 zzp;
    private C3226j2 zzq;
    private C3280p2 zzr;
    private C3244l2 zzs;
    private C3208h2 zzt;
    private String zze = "";
    private InterfaceC3202g5 zzg = AbstractC3148a5.z();
    private InterfaceC3202g5 zzh = AbstractC3148a5.z();
    private InterfaceC3202g5 zzi = AbstractC3148a5.z();
    private String zzj = "";
    private InterfaceC3202g5 zzl = AbstractC3148a5.z();
    private InterfaceC3202g5 zzm = AbstractC3148a5.z();
    private String zzn = "";
    private String zzo = "";

    static {
        C3190f2 c3190f2 = new C3190f2();
        zzu = c3190f2;
        AbstractC3148a5.t(C3190f2.class, c3190f2);
    }

    public static C3181e2 T() {
        return (C3181e2) zzu.p();
    }

    public static C3190f2 U() {
        return zzu;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC3148a5
    public final Object C(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC3148a5.u(zzu, "\u0004\u0011\u0000\u0001\u0001\u0013\u0011\u0000\u0005\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004\u001b\u0005\u001b\u0006\u001b\u0007ဈ\u0003\bဇ\u0004\t\u001b\n\u001b\u000bဈ\u0005\u000eဈ\u0006\u000fဉ\u0007\u0010ဉ\b\u0011ဉ\t\u0012ဉ\n\u0013ဉ\u000b", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg", C3262n2.class, "zzh", C3172d2.class, "zzi", C3339w1.class, "zzj", "zzk", "zzl", C3349x3.class, "zzm", C3154b2.class, "zzn", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt"});
        }
        if (i11 == 3) {
            return new C3190f2();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new C3181e2(bArr);
        }
        if (i11 == 5) {
            return zzu;
        }
        throw null;
    }

    public final boolean D() {
        return (this.zzb & 1) != 0;
    }

    public final long E() {
        return this.zzd;
    }

    public final boolean F() {
        return (this.zzb & 2) != 0;
    }

    public final String G() {
        return this.zze;
    }

    public final List H() {
        return this.zzg;
    }

    public final int I() {
        return this.zzh.size();
    }

    public final C3172d2 J(int i10) {
        return (C3172d2) this.zzh.get(i10);
    }

    public final List K() {
        return this.zzi;
    }

    public final List L() {
        return this.zzl;
    }

    public final int M() {
        return this.zzl.size();
    }

    public final List N() {
        return this.zzm;
    }

    public final String O() {
        return this.zzn;
    }

    public final boolean P() {
        return (this.zzb & 128) != 0;
    }

    public final Z1 Q() {
        Z1 z12 = this.zzp;
        return z12 == null ? Z1.J() : z12;
    }

    public final boolean R() {
        return (this.zzb & 512) != 0;
    }

    public final C3280p2 S() {
        C3280p2 c3280p2 = this.zzr;
        return c3280p2 == null ? C3280p2.H() : c3280p2;
    }

    public final /* synthetic */ void V(int i10, C3172d2 c3172d2) {
        c3172d2.getClass();
        InterfaceC3202g5 interfaceC3202g5 = this.zzh;
        if (!interfaceC3202g5.zza()) {
            this.zzh = AbstractC3148a5.A(interfaceC3202g5);
        }
        this.zzh.set(i10, c3172d2);
    }

    public final /* synthetic */ void W() {
        this.zzi = AbstractC3148a5.z();
    }

    public final /* synthetic */ void X() {
        this.zzl = AbstractC3148a5.z();
    }
}
