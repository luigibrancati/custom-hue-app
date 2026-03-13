package x;

import B.h;
import E.AbstractC0807p0;
import L.AbstractC1109l0;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import androidx.camera.camera2.internal.compat.quirk.CaptureSessionStuckQuirk;
import androidx.camera.camera2.internal.compat.quirk.IncorrectCaptureStateQuirk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class e2 extends a2 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ScheduledExecutorService f46988o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Object f46989p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public List f46990q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public O7.e f46991r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final B.i f46992s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final B.h f46993t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final B.s f46994u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final B.u f46995v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final AtomicBoolean f46996w;

    public e2(L.X0 x02, L.X0 x03, C6230i1 c6230i1, Executor executor, ScheduledExecutorService scheduledExecutorService, Handler handler) {
        super(c6230i1, executor, scheduledExecutorService, handler);
        this.f46989p = new Object();
        this.f46996w = new AtomicBoolean(false);
        this.f46992s = new B.i(x02, x03);
        this.f46994u = new B.s(x02.a(CaptureSessionStuckQuirk.class) || x02.a(IncorrectCaptureStateQuirk.class));
        this.f46993t = new B.h(x03);
        this.f46995v = new B.u(x03);
        this.f46988o = scheduledExecutorService;
    }

    public static /* synthetic */ O7.e H(e2 e2Var, CameraDevice cameraDevice, z.o oVar, List list, List list2) {
        if (e2Var.f46995v.a()) {
            e2Var.J();
        }
        e2Var.K("start openCaptureSession");
        return super.i(cameraDevice, oVar, list);
    }

    public static /* synthetic */ void I(e2 e2Var) {
        e2Var.K("Session call super.close()");
        super.close();
    }

    public final void J() {
        Iterator it = this.f46868b.d().iterator();
        while (it.hasNext()) {
            ((U1) it.next()).close();
        }
    }

    public void K(String str) {
        AbstractC0807p0.a("SyncCaptureSessionImpl", "[" + this + "] " + str);
    }

    @Override // x.a2, x.U1
    public void a() {
        super.a();
        this.f46994u.g();
    }

    @Override // x.a2, x.U1
    public void c(int i10) {
        super.c(i10);
        if (i10 == 5) {
            synchronized (this.f46989p) {
                try {
                    if (E() && this.f46990q != null) {
                        K("Close DeferrableSurfaces for CameraDevice error.");
                        Iterator it = this.f46990q.iterator();
                        while (it.hasNext()) {
                            ((AbstractC1109l0) it.next()).d();
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // x.a2, x.U1
    public void close() {
        if (!this.f46996w.compareAndSet(false, true)) {
            K("close() has been called. Skip this invocation.");
            return;
        }
        if (this.f46995v.a()) {
            try {
                K("Call abortCaptures() before closing session.");
                d();
            } catch (Exception e10) {
                K("Exception when calling abortCaptures()" + e10);
            }
        }
        K("Session call close()");
        this.f46994u.e().b(new Runnable() { // from class: x.c2
            @Override // java.lang.Runnable
            public final void run() {
                e2.I(this.f46903a);
            }
        }, getExecutor());
    }

    @Override // x.a2, x.U1
    public int f(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback) {
        return super.f(captureRequest, this.f46994u.d(captureCallback));
    }

    @Override // x.a2, x.U1.a
    public O7.e h(List list, long j10) {
        O7.e eVarH;
        synchronized (this.f46989p) {
            this.f46990q = list;
            eVarH = super.h(list, j10);
        }
        return eVarH;
    }

    @Override // x.a2, x.U1.a
    public O7.e i(final CameraDevice cameraDevice, final z.o oVar, final List list) {
        O7.e eVarS;
        synchronized (this.f46989p) {
            try {
                List listD = this.f46868b.d();
                ArrayList arrayList = new ArrayList();
                Iterator it = listD.iterator();
                while (it.hasNext()) {
                    arrayList.add(((U1) it.next()).o());
                }
                O7.e eVarW = O.n.w(arrayList);
                this.f46991r = eVarW;
                eVarS = O.n.s(O.d.c(eVarW).g(new O.a() { // from class: x.d2
                    @Override // O.a
                    public final O7.e apply(Object obj) {
                        return e2.H(this.f46915a, cameraDevice, oVar, list, (List) obj);
                    }
                }, getExecutor()));
            } catch (Throwable th) {
                throw th;
            }
        }
        return eVarS;
    }

    @Override // x.a2, x.U1
    public int k(List list, CameraCaptureSession.CaptureCallback captureCallback) {
        return super.k(list, this.f46994u.d(captureCallback));
    }

    @Override // x.U1
    public O7.e o() {
        return O.n.q(1500L, this.f46988o, this.f46994u.e());
    }

    @Override // x.a2, x.U1.c
    public void r(U1 u12) {
        synchronized (this.f46989p) {
            this.f46992s.a(this.f46990q);
        }
        K("onClosed()");
        super.r(u12);
    }

    @Override // x.a2, x.U1.a
    public boolean stop() {
        boolean zStop;
        synchronized (this.f46989p) {
            try {
                if (E()) {
                    this.f46992s.a(this.f46990q);
                } else {
                    O7.e eVar = this.f46991r;
                    if (eVar != null) {
                        eVar.cancel(true);
                    }
                }
                zStop = super.stop();
            } catch (Throwable th) {
                throw th;
            }
        }
        return zStop;
    }

    @Override // x.a2, x.U1.c
    public void t(U1 u12) {
        K("Session onConfigured()");
        this.f46993t.c(u12, this.f46868b.e(), this.f46868b.d(), new h.a() { // from class: x.b2
            @Override // B.h.a
            public final void a(U1 u13) {
                super/*x.a2*/.t(u13);
            }
        });
    }
}
