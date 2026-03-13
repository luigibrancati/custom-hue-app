package u6;

import android.os.SystemClock;
import b7.InterfaceC2872f;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Task;
import com.google.api.Endpoint;
import s6.C5783b;
import t6.C5844b;
import v6.C6049d;
import v6.C6054i;
import v6.C6057l;
import v6.C6058m;

/* JADX INFO: renamed from: u6.K, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C5929K implements InterfaceC2872f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C5952e f45110a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f45111b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C5946b f45112c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f45113d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f45114e;

    public C5929K(C5952e c5952e, int i10, C5946b c5946b, long j10, long j11, String str, String str2) {
        this.f45110a = c5952e;
        this.f45111b = i10;
        this.f45112c = c5946b;
        this.f45113d = j10;
        this.f45114e = j11;
    }

    public static C5929K b(C5952e c5952e, int i10, C5946b c5946b) {
        boolean zH;
        if (!c5952e.u()) {
            return null;
        }
        C6058m c6058mA = C6057l.b().a();
        if (c6058mA == null) {
            zH = true;
        } else {
            if (!c6058mA.f()) {
                return null;
            }
            zH = c6058mA.h();
            C5919A c5919aR = c5952e.r(c5946b);
            if (c5919aR != null) {
                if (!(c5919aR.t() instanceof com.google.android.gms.common.internal.a)) {
                    return null;
                }
                com.google.android.gms.common.internal.a aVar = (com.google.android.gms.common.internal.a) c5919aR.t();
                if (aVar.I() && !aVar.b()) {
                    C6049d c6049dC = c(c5919aR, aVar, i10);
                    if (c6049dC == null) {
                        return null;
                    }
                    c5919aR.E();
                    zH = c6049dC.k();
                }
            }
        }
        return new C5929K(c5952e, i10, c5946b, zH ? System.currentTimeMillis() : 0L, zH ? SystemClock.elapsedRealtime() : 0L, null, null);
    }

    public static C6049d c(C5919A c5919a, com.google.android.gms.common.internal.a aVar, int i10) {
        int[] iArrE;
        int[] iArrF;
        C6049d c6049dG = aVar.G();
        if (c6049dG == null || !c6049dG.h() || ((iArrE = c6049dG.e()) != null ? !B6.b.a(iArrE, i10) : !((iArrF = c6049dG.f()) == null || !B6.b.a(iArrF, i10))) || c5919a.C() >= c6049dG.d()) {
            return null;
        }
        return c6049dG;
    }

    @Override // b7.InterfaceC2872f
    public final void a(Task task) {
        C5919A c5919aR;
        long j10;
        int iK;
        int i10;
        int i11;
        int iE;
        int iE2;
        int i12;
        long j11;
        long j12;
        C5952e c5952e = this.f45110a;
        if (c5952e.u()) {
            C6058m c6058mA = C6057l.b().a();
            if ((c6058mA == null || c6058mA.f()) && (c5919aR = c5952e.r(this.f45112c)) != null && (c5919aR.t() instanceof com.google.android.gms.common.internal.a)) {
                com.google.android.gms.common.internal.a aVar = (com.google.android.gms.common.internal.a) c5919aR.t();
                long j13 = this.f45113d;
                boolean zH = j13 > 0;
                int iY = aVar.y();
                if (c6058mA != null) {
                    zH &= c6058mA.h();
                    int iD = c6058mA.d();
                    int iE3 = c6058mA.e();
                    iK = c6058mA.k();
                    if (!aVar.I() || aVar.b()) {
                        j10 = j13;
                        i11 = iD;
                    } else {
                        C6049d c6049dC = c(c5919aR, aVar, this.f45111b);
                        if (c6049dC == null) {
                            return;
                        }
                        boolean z10 = c6049dC.k() && j13 > 0;
                        iE3 = c6049dC.d();
                        zH = z10;
                        i11 = iD;
                        j10 = j13;
                    }
                    i10 = iE3;
                } else {
                    j10 = j13;
                    iK = 0;
                    i10 = 100;
                    i11 = 5000;
                }
                int iElapsedRealtime = -1;
                if (task.q()) {
                    i12 = 0;
                    iE2 = 0;
                } else if (task.o()) {
                    iE2 = -1;
                    i12 = 100;
                } else {
                    Exception excL = task.l();
                    if (excL instanceof C5844b) {
                        Status statusA = ((C5844b) excL).a();
                        iE = statusA.e();
                        C5783b c5783bD = statusA.d();
                        if (c5783bD != null) {
                            iE2 = c5783bD.e();
                        }
                        i12 = iE;
                    } else {
                        iE = Endpoint.TARGET_FIELD_NUMBER;
                    }
                    iE2 = -1;
                    i12 = iE;
                }
                if (zH) {
                    long j14 = this.f45114e;
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    iElapsedRealtime = (int) (SystemClock.elapsedRealtime() - j14);
                    j11 = j10;
                    j12 = jCurrentTimeMillis;
                } else {
                    j11 = 0;
                    j12 = 0;
                }
                c5952e.z(new C6054i(this.f45111b, i12, iE2, j11, j12, null, null, iY, iElapsedRealtime), iK, i11, i10);
            }
        }
    }
}
