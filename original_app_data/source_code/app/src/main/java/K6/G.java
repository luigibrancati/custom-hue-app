package K6;

import R6.C2074i;
import R6.C2075j;
import android.app.PendingIntent;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import b7.C2878l;
import com.google.android.gms.location.LocationRequest;
import java.util.Objects;
import s6.C5785d;
import u6.C5960i;
import u6.InterfaceC5950d;
import u6.InterfaceC5964k;
import v6.C6048c;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class G extends com.google.android.gms.common.internal.c {

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public final b0.J f7491K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final b0.J f7492L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final b0.J f7493M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public final b0.J f7494N;

    public G(Context context, Looper looper, C6048c c6048c, InterfaceC5950d interfaceC5950d, InterfaceC5964k interfaceC5964k) {
        super(context, looper, 23, c6048c, interfaceC5950d, interfaceC5964k);
        this.f7491K = new b0.J();
        this.f7492L = new b0.J();
        this.f7493M = new b0.J();
        this.f7494N = new b0.J();
    }

    @Override // com.google.android.gms.common.internal.a
    public final String D() {
        return "com.google.android.gms.location.internal.IGoogleLocationManagerService";
    }

    @Override // com.google.android.gms.common.internal.a
    public final String E() {
        return "com.google.android.location.internal.GoogleLocationManagerService.START";
    }

    @Override // com.google.android.gms.common.internal.a
    public final void L(int i10) {
        super.L(i10);
        synchronized (this.f7491K) {
            this.f7491K.clear();
        }
        synchronized (this.f7492L) {
            this.f7492L.clear();
        }
        synchronized (this.f7493M) {
            this.f7493M.clear();
        }
    }

    @Override // com.google.android.gms.common.internal.a
    public final boolean S() {
        return true;
    }

    @Override // com.google.android.gms.common.internal.a, t6.C5843a.f
    public final int m() {
        return 11717000;
    }

    public final void m0(C2074i c2074i, PendingIntent pendingIntent, C2878l c2878l) {
        if (o0(R6.E.f14781n)) {
            ((o0) C()).x5(c2074i, pendingIntent, new BinderC1059y(null, c2878l));
        } else {
            ((o0) C()).n6(c2074i, pendingIntent, new BinderC1058x(c2878l));
        }
    }

    public final void n0(Q q10, C2878l c2878l) {
        if (o0(R6.E.f14781n)) {
            ((o0) C()).O3(q10, new BinderC1059y(null, c2878l));
        } else {
            ((o0) C()).A1(q10, new BinderC1058x(c2878l));
        }
    }

    public final boolean o0(C5785d c5785d) {
        C5785d c5785d2;
        C5785d[] c5785dArrN = n();
        if (c5785dArrN != null) {
            int i10 = 0;
            while (true) {
                if (i10 >= c5785dArrN.length) {
                    c5785d2 = null;
                    break;
                }
                c5785d2 = c5785dArrN[i10];
                if (c5785d.e().equals(c5785d2.e())) {
                    break;
                }
                i10++;
            }
            if (c5785d2 != null && c5785d2.f() >= c5785d.f()) {
                return true;
            }
        }
        return false;
    }

    public final void p0(C2075j c2075j, C2878l c2878l) {
        if (o0(R6.E.f14777j)) {
            ((o0) C()).L1(c2075j, I.e(new BinderC1060z(c2878l)));
        } else if (o0(R6.E.f14773f)) {
            ((o0) C()).d2(c2075j, new BinderC1060z(c2878l));
        } else {
            c2878l.c(((o0) C()).r());
        }
    }

    public final void q0(B b10, LocationRequest locationRequest, C2878l c2878l) {
        F f10;
        C5960i c5960iZza = b10.zza();
        C5960i.a aVarB = c5960iZza.b();
        Objects.requireNonNull(aVarB);
        boolean zO0 = o0(R6.E.f14777j);
        synchronized (this.f7492L) {
            try {
                F f11 = (F) this.f7492L.get(aVarB);
                if (f11 == null || zO0) {
                    F f12 = new F(b10);
                    this.f7492L.put(aVarB, f12);
                    f10 = f12;
                } else {
                    f11.K(c5960iZza);
                    f10 = f11;
                    f11 = null;
                }
                if (zO0) {
                    ((o0) C()).m3(I.d(f11, f10, aVarB.a()), locationRequest, new BinderC1059y(null, c2878l));
                } else {
                    ((o0) C()).Q0(new M(1, K.d(null, locationRequest), null, f10, null, new BinderC1056v(c2878l, f10), aVarB.a()));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.common.internal.a
    public final /* synthetic */ IInterface r(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        return iInterfaceQueryLocalInterface instanceof o0 ? (o0) iInterfaceQueryLocalInterface : new n0(iBinder);
    }

    public final void r0(C5960i.a aVar, boolean z10, C2878l c2878l) {
        synchronized (this.f7492L) {
            try {
                F f10 = (F) this.f7492L.remove(aVar);
                if (f10 == null) {
                    c2878l.c(Boolean.FALSE);
                    return;
                }
                f10.X();
                if (!z10) {
                    c2878l.c(Boolean.TRUE);
                } else if (o0(R6.E.f14777j)) {
                    o0 o0Var = (o0) C();
                    int iIdentityHashCode = System.identityHashCode(f10);
                    StringBuilder sb2 = new StringBuilder(String.valueOf(iIdentityHashCode).length() + 18);
                    sb2.append("ILocationCallback@");
                    sb2.append(iIdentityHashCode);
                    o0Var.z0(I.d(null, f10, sb2.toString()), new BinderC1059y(Boolean.TRUE, c2878l));
                } else {
                    ((o0) C()).Q0(new M(2, null, null, f10, null, new A(Boolean.TRUE, c2878l), null));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.common.internal.a
    public final C5785d[] u() {
        return R6.E.f14783p;
    }
}
