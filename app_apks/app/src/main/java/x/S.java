package x;

import B0.c;
import E.AbstractC0807p0;
import E.AbstractC0819w;
import E.C0821x;
import E.C0822x0;
import L.AbstractC1096f;
import L.AbstractC1109l0;
import L.C1095e0;
import L.C1136z0;
import L.F;
import L.J;
import L.Z;
import L.a1;
import L.r1;
import L.t1;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.media.CamcorderProfile;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Rational;
import android.util.Size;
import android.view.Surface;
import androidx.camera.camera2.internal.compat.quirk.LegacyCameraSurfaceCleanupQuirk;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import s3.AbstractC5712a;
import x.S;
import x.U1;
import y.AbstractC6365a;
import y.C6369e;
import y.C6378n;
import z.C6485e;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class S implements L.J {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public boolean f46710A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public boolean f46711B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public N1 f46712C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final C6230i1 f46713D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final U1.b f46714E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final Set f46715F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public L.B f46716G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final Object f46717H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public boolean f46718I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final C6236k1 f46719J;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public final C6378n f46720P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public final C6485e f46721Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public final T1 f46722R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public final h f46723S;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final L.r1 f46724a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y.t f46725b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Executor f46726c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ScheduledExecutorService f46727d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile i f46728e = i.INITIALIZED;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final L.J0 f46729f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final V0 f46730g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C6266v f46731h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final j f46732i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Y f46733j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public CameraDevice f46734k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f46735l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public InterfaceC6221f1 f46736m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final AtomicInteger f46737n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public O7.e f46738o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public c.a f46739p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Map f46740q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f46741r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e f46742s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final f f46743t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final F.a f46744u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final L.Z f46745v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final E.G f46746w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final boolean f46747x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final boolean f46748y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f46749z;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a implements InterfaceC6216e {
        public a() {
        }

        @Override // x.InterfaceC6216e
        public CamcorderProfile a(int i10, int i11) {
            return CamcorderProfile.get(i10, i11);
        }

        @Override // x.InterfaceC6216e
        public boolean b(int i10, int i11) {
            return CamcorderProfile.hasProfile(i10, i11);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class b extends CameraDevice.StateCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ c.a f46751a;

        public b(c.a aVar) {
            this.f46751a = aVar;
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onClosed(CameraDevice cameraDevice) {
            S.this.Y("openCameraConfigAndClose camera closed");
            this.f46751a.c(null);
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onDisconnected(CameraDevice cameraDevice) {
            S.this.Y("openCameraConfigAndClose camera disconnected");
            this.f46751a.c(null);
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onError(CameraDevice cameraDevice, int i10) {
            S.this.Y("openCameraConfigAndClose camera error " + i10);
            this.f46751a.c(null);
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onOpened(final CameraDevice cameraDevice) {
            S.this.Y("openCameraConfigAndClose camera opened");
            O7.e eVarV = S.this.V(cameraDevice);
            Objects.requireNonNull(cameraDevice);
            eVarV.b(new Runnable() { // from class: x.T
                @Override // java.lang.Runnable
                public final void run() {
                    cameraDevice.close();
                }
            }, S.this.f46726c);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class d implements O.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC6221f1 f46755a;

        public d(InterfaceC6221f1 interfaceC6221f1) {
            this.f46755a = interfaceC6221f1;
        }

        @Override // O.c
        public void a(Throwable th) {
            if (th instanceof AbstractC1109l0.a) {
                L.a1 a1VarA0 = S.this.a0(((AbstractC1109l0.a) th).a());
                if (a1VarA0 != null) {
                    S.this.v0(a1VarA0);
                    return;
                }
                return;
            }
            if (th instanceof CancellationException) {
                S.this.Y("Unable to configure camera cancelled");
                return;
            }
            i iVar = S.this.f46728e;
            i iVar2 = i.OPENED;
            if (iVar == iVar2) {
                S.this.C0(iVar2, AbstractC0819w.a.b(4, th));
            }
            AbstractC0807p0.d("Camera2CameraImpl", "Unable to configure camera " + S.this, th);
            S s10 = S.this;
            if (s10.f46736m == this.f46755a) {
                s10.z0(false);
            }
        }

        @Override // O.c
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r22) {
            if (S.this.f46744u.c() == 2 && S.this.f46728e == i.OPENED) {
                S.this.B0(i.CONFIGURED);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public final class e extends CameraManager.AvailabilityCallback implements Z.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f46757a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f46758b = true;

        public e(String str) {
            this.f46757a = str;
        }

        @Override // L.Z.c
        public void a() {
            if (S.this.f46728e == i.PENDING_OPEN || S.this.f46728e == i.OPENING_WITH_ERROR) {
                S.this.K0(false);
            }
        }

        public boolean b() {
            return this.f46758b;
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public void onCameraAvailable(String str) {
            if (this.f46757a.equals(str)) {
                this.f46758b = true;
                if (S.this.f46728e == i.PENDING_OPEN || S.this.f46728e == i.OPENING_WITH_ERROR) {
                    S.this.K0(false);
                }
            }
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public void onCameraUnavailable(String str) {
            if (this.f46757a.equals(str)) {
                this.f46758b = false;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public final class f implements Z.b {
        public f() {
        }

        @Override // L.Z.b
        public void a() {
            if (S.this.f46728e == i.OPENED) {
                S.this.t0();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public final class g implements F.d {
        public g() {
        }

        @Override // L.F.d
        public void a() {
            S.this.L0();
        }

        @Override // L.F.d
        public void b(List list) {
            S.this.E0((List) X0.h.g(list));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public enum i {
        RELEASED,
        RELEASING,
        INITIALIZED,
        PENDING_OPEN,
        OPENING_WITH_ERROR,
        CLOSING,
        REOPENING_QUIRK,
        REOPENING,
        OPENING,
        OPENED,
        CONFIGURED
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public final class j extends CameraDevice.StateCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Executor f46767a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ScheduledExecutorService f46768b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public b f46769c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public ScheduledFuture f46770d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final a f46771e;

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final long f46773a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public long f46774b = -1;

            public a(long j10) {
                this.f46773a = j10;
            }

            public boolean a() {
                if (b() < d()) {
                    return true;
                }
                e();
                return false;
            }

            public long b() {
                long jUptimeMillis = SystemClock.uptimeMillis();
                if (this.f46774b == -1) {
                    this.f46774b = jUptimeMillis;
                }
                return jUptimeMillis - this.f46774b;
            }

            public int c() {
                if (!j.this.f()) {
                    return 700;
                }
                long jB = b();
                if (jB <= 120000) {
                    return 1000;
                }
                return jB <= 300000 ? 2000 : 4000;
            }

            public int d() {
                if (j.this.f()) {
                    long j10 = this.f46773a;
                    if (j10 > 0) {
                        return Math.min((int) j10, 1800000);
                    }
                    return 1800000;
                }
                long j11 = this.f46773a;
                if (j11 > 0) {
                    return Math.min((int) j11, 10000);
                }
                return 10000;
            }

            public void e() {
                this.f46774b = -1L;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public class b implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public Executor f46776a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public boolean f46777b = false;

            public b(Executor executor) {
                this.f46776a = executor;
            }

            public static /* synthetic */ void a(b bVar) {
                if (bVar.f46777b) {
                    return;
                }
                X0.h.i(S.this.f46728e == i.REOPENING || S.this.f46728e == i.REOPENING_QUIRK);
                if (j.this.f()) {
                    S.this.J0(true);
                } else {
                    S.this.K0(true);
                }
            }

            public void b() {
                this.f46777b = true;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f46776a.execute(new Runnable() { // from class: x.W
                    @Override // java.lang.Runnable
                    public final void run() {
                        S.j.b.a(this.f46830a);
                    }
                });
            }
        }

        public j(Executor executor, ScheduledExecutorService scheduledExecutorService, long j10) {
            this.f46767a = executor;
            this.f46768b = scheduledExecutorService;
            this.f46771e = new a(j10);
        }

        public boolean a() {
            if (this.f46770d == null) {
                return false;
            }
            S.this.Y("Cancelling scheduled re-open: " + this.f46769c);
            this.f46769c.b();
            this.f46769c = null;
            this.f46770d.cancel(false);
            this.f46770d = null;
            return true;
        }

        public final void b(CameraDevice cameraDevice, int i10) {
            X0.h.j(S.this.f46728e == i.OPENING || S.this.f46728e == i.OPENED || S.this.f46728e == i.CONFIGURED || S.this.f46728e == i.REOPENING || S.this.f46728e == i.REOPENING_QUIRK, "Attempt to handle open error from non open state: " + S.this.f46728e);
            if (i10 == 1 || i10 == 2 || i10 == 4) {
                AbstractC0807p0.a("Camera2CameraImpl", String.format("Attempt to reopen camera[%s] after error[%s]", cameraDevice.getId(), S.e0(i10)));
                c(i10);
                return;
            }
            AbstractC0807p0.c("Camera2CameraImpl", "Error observed on open (or opening) camera device " + cameraDevice.getId() + ": " + S.e0(i10) + " closing camera.");
            S.this.C0(i.CLOSING, AbstractC0819w.a.a(i10 == 3 ? 5 : 6));
            S.this.T(false);
        }

        public final void c(int i10) {
            int i11 = 1;
            X0.h.j(S.this.f46735l != 0, "Can only reopen camera device after error if the camera device is actually in an error state.");
            if (i10 == 1) {
                i11 = 2;
            } else if (i10 != 2) {
                i11 = 3;
            }
            S.this.C0(i.REOPENING, AbstractC0819w.a.a(i11));
            S.this.T(false);
        }

        public void d() {
            this.f46771e.e();
        }

        public void e() {
            X0.h.i(this.f46769c == null);
            X0.h.i(this.f46770d == null);
            if (!this.f46771e.a()) {
                AbstractC0807p0.c("Camera2CameraImpl", "Camera reopening attempted for " + this.f46771e.d() + "ms without success.");
                S.this.D0(i.PENDING_OPEN, null, false);
                return;
            }
            this.f46769c = new b(this.f46767a);
            S.this.Y("Attempting camera re-open in " + this.f46771e.c() + "ms: " + this.f46769c + " activeResuming = " + S.this.f46718I);
            this.f46770d = this.f46768b.schedule(this.f46769c, (long) this.f46771e.c(), TimeUnit.MILLISECONDS);
        }

        public boolean f() {
            S s10 = S.this;
            if (!s10.f46718I) {
                return false;
            }
            int i10 = s10.f46735l;
            return i10 == 1 || i10 == 2;
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onClosed(CameraDevice cameraDevice) {
            S.this.Y("CameraDevice.onClosed()");
            X0.h.j(S.this.f46734k == null, "Unexpected onClose callback on camera device: " + cameraDevice);
            int iOrdinal = S.this.f46728e.ordinal();
            if (iOrdinal == 1 || iOrdinal == 5) {
                X0.h.i(S.this.m0());
                S.this.W();
                return;
            }
            if (iOrdinal != 6 && iOrdinal != 7) {
                throw new IllegalStateException("Camera closed while in state: " + S.this.f46728e);
            }
            S s10 = S.this;
            if (s10.f46735l == 0) {
                s10.K0(false);
                return;
            }
            s10.Y("Camera closed due to error: " + S.e0(S.this.f46735l));
            e();
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onDisconnected(CameraDevice cameraDevice) {
            S.this.Y("CameraDevice.onDisconnected()");
            onError(cameraDevice, 1);
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onError(CameraDevice cameraDevice, int i10) {
            S s10 = S.this;
            s10.f46734k = cameraDevice;
            s10.f46735l = i10;
            s10.f46723S.b();
            int iOrdinal = S.this.f46728e.ordinal();
            if (iOrdinal != 1) {
                switch (iOrdinal) {
                    case 5:
                        break;
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                        AbstractC0807p0.a("Camera2CameraImpl", String.format("CameraDevice.onError(): %s failed with %s while in %s state. Will attempt recovering from error.", cameraDevice.getId(), S.e0(i10), S.this.f46728e.name()));
                        b(cameraDevice, i10);
                        return;
                    default:
                        throw new IllegalStateException("onError() should not be possible from state: " + S.this.f46728e);
                }
            }
            AbstractC0807p0.c("Camera2CameraImpl", String.format("CameraDevice.onError(): %s failed with %s while in %s state. Will finish closing camera.", cameraDevice.getId(), S.e0(i10), S.this.f46728e.name()));
            S.this.T(false);
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onOpened(CameraDevice cameraDevice) {
            S.this.Y("CameraDevice.onOpened()");
            S s10 = S.this;
            s10.f46734k = cameraDevice;
            s10.f46735l = 0;
            d();
            int iOrdinal = S.this.f46728e.ordinal();
            if (iOrdinal == 1 || iOrdinal == 5) {
                X0.h.i(S.this.m0());
                S.this.f46734k.close();
                S.this.f46734k = null;
            } else {
                if (iOrdinal != 6 && iOrdinal != 7 && iOrdinal != 8) {
                    throw new IllegalStateException("onOpened() should not be possible from state: " + S.this.f46728e);
                }
                S.this.B0(i.OPENED);
                L.Z z10 = S.this.f46745v;
                String id2 = cameraDevice.getId();
                S s11 = S.this;
                if (z10.j(id2, s11.f46744u.b(s11.f46734k.getId()))) {
                    S.this.t0();
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static abstract class k {
        public static k a(String str, Class cls, L.a1 a1Var, L.s1 s1Var, Size size, L.e1 e1Var, List list) {
            return new C6207b(str, cls, a1Var, s1Var, size, e1Var, list);
        }

        public static k b(E.W0 w02, boolean z10) {
            return a(S.h0(w02), w02.getClass(), z10 ? w02.A() : w02.y(), w02.l(), w02.h(), w02.g(), S.d0(w02));
        }

        public abstract List c();

        public abstract L.a1 d();

        public abstract L.e1 e();

        public abstract Size f();

        public abstract L.s1 g();

        public abstract String h();

        public abstract Class i();
    }

    public S(Context context, y.t tVar, String str, Y y10, F.a aVar, L.Z z10, Executor executor, Handler handler, C6236k1 c6236k1, long j10, E.G g10) throws C0821x {
        L.J0 j02 = new L.J0();
        this.f46729f = j02;
        this.f46735l = 0;
        this.f46737n = new AtomicInteger(0);
        this.f46740q = new LinkedHashMap();
        this.f46741r = 0;
        this.f46749z = false;
        this.f46710A = false;
        this.f46711B = true;
        this.f46715F = new HashSet();
        this.f46716G = L.E.a();
        this.f46717H = new Object();
        this.f46718I = false;
        this.f46723S = new h(this, null);
        this.f46725b = tVar;
        this.f46744u = aVar;
        this.f46745v = z10;
        ScheduledExecutorService scheduledExecutorServiceE = N.a.e(handler);
        this.f46727d = scheduledExecutorServiceE;
        Executor executorF = N.a.f(executor);
        this.f46726c = executorF;
        this.f46732i = new j(executorF, scheduledExecutorServiceE, j10);
        this.f46724a = new L.r1(str);
        j02.m(J.a.CLOSED);
        V0 v02 = new V0(z10);
        this.f46730g = v02;
        C6230i1 c6230i1 = new C6230i1(executorF);
        this.f46713D = c6230i1;
        this.f46719J = c6236k1;
        this.f46746w = g10;
        try {
            C6378n c6378nC = tVar.c(str);
            this.f46720P = c6378nC;
            C6266v c6266v = new C6266v(c6378nC, scheduledExecutorServiceE, executorF, new g(), y10.k());
            this.f46731h = c6266v;
            this.f46733j = y10;
            y10.x(c6266v);
            y10.A(v02.a());
            this.f46721Q = C6485e.a(c6378nC);
            this.f46736m = o0();
            this.f46714E = new U1.b(executorF, scheduledExecutorServiceE, handler, c6230i1, y10.k(), A.d.c());
            this.f46747x = B.c.a(y10.k());
            this.f46748y = y10.k().a(LegacyCameraSurfaceCleanupQuirk.class);
            e eVar = new e(str);
            this.f46742s = eVar;
            f fVar = new f();
            this.f46743t = fVar;
            z10.g(this, executorF, fVar, eVar);
            tVar.g(executorF, eVar);
            this.f46722R = new T1(context, str, tVar, new a(), H.a.f4784b);
        } catch (C6369e e10) {
            throw W0.a(e10);
        }
    }

    public static /* synthetic */ void C(S s10, String str, L.a1 a1Var, L.s1 s1Var, L.e1 e1Var, List list) {
        s10.getClass();
        s10.Y("Use case " + str + " ACTIVE");
        s10.f46724a.q(str, a1Var, s1Var, e1Var, list);
        s10.f46724a.u(str, a1Var, s1Var, e1Var, list);
        s10.L0();
    }

    public static /* synthetic */ void D(S s10, String str, L.a1 a1Var, L.s1 s1Var, L.e1 e1Var, List list) {
        s10.getClass();
        s10.Y("Use case " + str + " RESET");
        s10.f46724a.u(str, a1Var, s1Var, e1Var, list);
        s10.R();
        s10.z0(false);
        s10.L0();
        if (s10.f46728e == i.OPENED) {
            s10.t0();
        }
    }

    public static /* synthetic */ Object E(final S s10, final c.a aVar) {
        s10.f46726c.execute(new Runnable() { // from class: x.H
            @Override // java.lang.Runnable
            public final void run() {
                O.n.t(this.f46627a.w0(), aVar);
            }
        });
        return "Release[request=" + s10.f46737n.getAndIncrement() + "]";
    }

    public static /* synthetic */ void G(S s10) {
        s10.Y("Camera is removed. Updating state and cleaning up.");
        i iVar = s10.f46728e;
        i iVar2 = i.RELEASING;
        if (iVar == iVar2 || s10.f46728e == i.RELEASED) {
            return;
        }
        AbstractC0819w.a aVarA = AbstractC0819w.a.a(8);
        s10.f46730g.c(J.a.CLOSED, aVarA);
        s10.C0(iVar2, aVarA);
        s10.f46732i.a();
        s10.f46723S.a();
        if (s10.f46734k != null) {
            s10.T(false);
        } else {
            s10.b0();
        }
    }

    public static /* synthetic */ void I(S s10, List list) {
        s10.getClass();
        try {
            s10.H0(list);
        } finally {
            s10.f46731h.A();
        }
    }

    public static /* synthetic */ Object J(S s10, c.a aVar) {
        X0.h.j(s10.f46739p == null, "Camera can only be released once, so release completer should be null on creation.");
        s10.f46739p = aVar;
        return "Release[camera=" + s10 + "]";
    }

    public static List d0(E.W0 w02) {
        if (w02.i() == null) {
            return null;
        }
        return Y.f.o0(w02);
    }

    public static String e0(int i10) {
        return i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? i10 != 5 ? "UNKNOWN ERROR" : "ERROR_CAMERA_SERVICE" : "ERROR_CAMERA_DEVICE" : "ERROR_CAMERA_DISABLED" : "ERROR_MAX_CAMERAS_IN_USE" : "ERROR_CAMERA_IN_USE" : "ERROR_NONE";
    }

    public static String f0(N1 n12) {
        return n12.f() + n12.hashCode();
    }

    public static String h0(E.W0 w02) {
        return w02.r() + w02.hashCode();
    }

    public static /* synthetic */ Object r(S s10, c.a aVar) {
        s10.getClass();
        try {
            ArrayList arrayList = new ArrayList(s10.f46724a.g().c().c());
            arrayList.add(s10.f46713D.c());
            arrayList.add(s10.new b(aVar));
            s10.f46725b.f(s10.f46733j.d(), s10.f46726c, S0.a(arrayList));
            return "configAndCloseTask";
        } catch (RuntimeException | C6369e e10) {
            s10.Z("Unable to open camera for configAndClose: " + e10.getMessage(), e10);
            aVar.f(e10);
            return "configAndCloseTask";
        }
    }

    public static /* synthetic */ Object s(final S s10, final c.a aVar) {
        s10.getClass();
        try {
            s10.f46726c.execute(new Runnable() { // from class: x.L
                @Override // java.lang.Runnable
                public final void run() {
                    aVar.c(Boolean.valueOf(this.f46658a.j0()));
                }
            });
            return "isMeteringRepeatingAttached";
        } catch (RejectedExecutionException unused) {
            aVar.f(new RuntimeException("Unable to check if MeteringRepeating is attached. Camera executor shut down."));
            return "isMeteringRepeatingAttached";
        }
    }

    public static /* synthetic */ void t(S s10) {
        if (s10.i0()) {
            s10.A0(f0(s10.f46712C), s10.f46712C.h(), s10.f46712C.i(), null, Collections.singletonList(t1.b.METERING_REPEATING));
        }
    }

    public static /* synthetic */ void u(S s10) {
        s10.f46710A = false;
        s10.f46749z = false;
        s10.Y("OpenCameraConfigAndClose is done, state: " + s10.f46728e);
        int iOrdinal = s10.f46728e.ordinal();
        if (iOrdinal == 1 || iOrdinal == 5) {
            X0.h.i(s10.m0());
            s10.b0();
            return;
        }
        if (iOrdinal != 7) {
            s10.Y("OpenCameraConfigAndClose finished while in state: " + s10.f46728e);
            return;
        }
        if (s10.f46735l == 0) {
            s10.K0(false);
            return;
        }
        s10.Y("OpenCameraConfigAndClose in error: " + e0(s10.f46735l));
        s10.f46732i.e();
    }

    public static /* synthetic */ void v(Surface surface, SurfaceTexture surfaceTexture) {
        surface.release();
        surfaceTexture.release();
    }

    public static /* synthetic */ void w(S s10, String str) {
        s10.getClass();
        s10.Y("Use case " + str + " INACTIVE");
        s10.f46724a.t(str);
        s10.L0();
    }

    public static /* synthetic */ void x(S s10, String str, L.a1 a1Var, L.s1 s1Var, L.e1 e1Var, List list) {
        s10.getClass();
        s10.Y("Use case " + str + " UPDATED");
        s10.f46724a.u(str, a1Var, s1Var, e1Var, list);
        s10.L0();
    }

    public static /* synthetic */ O7.e y(C6218e1 c6218e1, AbstractC1109l0 abstractC1109l0, Void r22) {
        c6218e1.close();
        abstractC1109l0.d();
        return c6218e1.f(false);
    }

    public static /* synthetic */ void z(S s10, boolean z10) {
        s10.f46718I = z10;
        if (z10) {
            if (s10.f46728e == i.PENDING_OPEN || s10.f46728e == i.OPENING_WITH_ERROR) {
                s10.J0(false);
            }
        }
    }

    public final void A0(final String str, final L.a1 a1Var, final L.s1 s1Var, final L.e1 e1Var, final List list) {
        this.f46726c.execute(new Runnable() { // from class: x.C
            @Override // java.lang.Runnable
            public final void run() {
                S.D(this.f46604a, str, a1Var, s1Var, e1Var, list);
            }
        });
    }

    public void B0(i iVar) {
        C0(iVar, null);
    }

    public void C0(i iVar, AbstractC0819w.a aVar) {
        D0(iVar, aVar, true);
    }

    public void D0(i iVar, AbstractC0819w.a aVar, boolean z10) {
        J.a aVar2;
        Y("Transitioning camera internal state: " + this.f46728e + " --> " + iVar);
        G0(iVar, aVar);
        this.f46728e = iVar;
        switch (iVar) {
            case RELEASED:
                aVar2 = J.a.RELEASED;
                break;
            case RELEASING:
                aVar2 = J.a.RELEASING;
                break;
            case INITIALIZED:
                aVar2 = J.a.CLOSED;
                break;
            case PENDING_OPEN:
                aVar2 = J.a.PENDING_OPEN;
                break;
            case OPENING_WITH_ERROR:
            case CLOSING:
            case REOPENING_QUIRK:
                aVar2 = J.a.CLOSING;
                break;
            case REOPENING:
            case OPENING:
                aVar2 = J.a.OPENING;
                break;
            case OPENED:
                aVar2 = J.a.OPEN;
                break;
            case CONFIGURED:
                aVar2 = J.a.CONFIGURED;
                break;
            default:
                throw new IllegalStateException("Unknown state: " + iVar);
        }
        this.f46745v.e(this, aVar2, z10);
        this.f46729f.m(aVar2);
        this.f46730g.c(aVar2, aVar);
    }

    public void E0(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C1095e0 c1095e0 = (C1095e0) it.next();
            C1095e0.a aVarJ = C1095e0.a.j(c1095e0);
            if (c1095e0.k() == 5 && c1095e0.d() != null) {
                aVarJ.n(c1095e0.d());
            }
            if (!c1095e0.i().isEmpty() || !c1095e0.m() || S(aVarJ)) {
                arrayList.add(aVarJ.h());
            }
        }
        Y("Issue capture request");
        this.f46736m.b(arrayList);
    }

    public final Collection F0(Collection collection) {
        ArrayList arrayList = new ArrayList();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(k.b((E.W0) it.next(), this.f46711B));
        }
        return arrayList;
    }

    public void G0(i iVar, AbstractC0819w.a aVar) {
        if (AbstractC5712a.e()) {
            AbstractC5712a.f("CX:C2State[" + this + "]", iVar.ordinal());
            if (aVar != null) {
                this.f46741r++;
            }
            if (this.f46741r > 0) {
                AbstractC5712a.f("CX:C2StateErrorCode[" + this + "]", aVar != null ? aVar.d() : 0);
            }
        }
    }

    public final void H0(Collection collection) {
        Size sizeF;
        boolean zIsEmpty = this.f46724a.h().isEmpty();
        ArrayList arrayList = new ArrayList();
        Iterator it = collection.iterator();
        Rational rational = null;
        while (it.hasNext()) {
            k kVar = (k) it.next();
            if (!this.f46724a.o(kVar.h())) {
                this.f46724a.r(kVar.h(), kVar.d(), kVar.g(), kVar.e(), kVar.c());
                arrayList.add(kVar.h());
                if (kVar.i() == C0822x0.class && (sizeF = kVar.f()) != null) {
                    rational = new Rational(sizeF.getWidth(), sizeF.getHeight());
                }
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        Y("Use cases [" + TextUtils.join(", ", arrayList) + "] now ATTACHED");
        if (zIsEmpty) {
            this.f46731h.g0(true);
            this.f46731h.V();
        }
        R();
        N0();
        M0();
        L0();
        z0(false);
        if (this.f46728e == i.OPENED) {
            t0();
        } else {
            u0();
        }
        if (rational != null) {
            this.f46731h.j0(rational);
        }
    }

    public final void I0(Collection collection) {
        ArrayList arrayList = new ArrayList();
        Iterator it = collection.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            k kVar = (k) it.next();
            if (this.f46724a.o(kVar.h())) {
                this.f46724a.p(kVar.h());
                arrayList.add(kVar.h());
                if (kVar.i() == C0822x0.class) {
                    z10 = true;
                }
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        Y("Use cases [" + TextUtils.join(", ", arrayList) + "] now DETACHED for camera");
        if (z10) {
            this.f46731h.j0(null);
        }
        R();
        if (this.f46724a.i().isEmpty()) {
            this.f46731h.l0(false);
            this.f46731h.i0(false);
        } else {
            N0();
            M0();
        }
        if (this.f46724a.h().isEmpty()) {
            this.f46731h.A();
            z0(false);
            this.f46731h.g0(false);
            this.f46736m = o0();
            U();
            return;
        }
        L0();
        z0(false);
        if (this.f46728e == i.OPENED) {
            t0();
        }
    }

    public void J0(boolean z10) {
        Y("Attempting to force open the camera.");
        if (this.f46745v.i(this)) {
            s0(z10);
        } else {
            Y("No cameras available. Waiting for available camera before opening camera.");
            B0(i.PENDING_OPEN);
        }
    }

    public void K0(boolean z10) {
        Y("Attempting to open the camera.");
        if (this.f46742s.b() && this.f46745v.i(this)) {
            s0(z10);
        } else {
            Y("No cameras available. Waiting for available camera before opening camera.");
            B0(i.PENDING_OPEN);
        }
    }

    public void L0() {
        a1.h hVarE = this.f46724a.e();
        if (!hVarE.f()) {
            this.f46731h.f0();
            this.f46736m.c(this.f46731h.L());
            return;
        }
        this.f46731h.k0(hVarE.c().p());
        hVarE.b(this.f46731h.L());
        this.f46736m.c(hVarE.c());
    }

    public final void M0() {
        if (this.f46733j.w()) {
            a1.h hVarE = this.f46724a.e();
            if (hVarE.f()) {
                if (((Integer) hVarE.c().e().getUpper()).intValue() > 30) {
                    this.f46731h.i0(true);
                } else {
                    this.f46731h.i0(false);
                }
            }
        }
    }

    public final void N0() {
        Iterator it = this.f46724a.i().iterator();
        boolean zK = false;
        while (it.hasNext()) {
            zK |= ((L.s1) it.next()).K(false);
        }
        this.f46731h.l0(zK);
    }

    public final void Q() {
        N1 n12 = this.f46712C;
        if (n12 != null) {
            String strF0 = f0(n12);
            L.r1 r1Var = this.f46724a;
            L.a1 a1VarH = this.f46712C.h();
            L.s1 s1VarI = this.f46712C.i();
            t1.b bVar = t1.b.METERING_REPEATING;
            r1Var.r(strF0, a1VarH, s1VarI, null, Collections.singletonList(bVar));
            this.f46724a.q(strF0, this.f46712C.h(), this.f46712C.i(), null, Collections.singletonList(bVar));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void R() {
        /*
            r6 = this;
            L.r1 r0 = r6.f46724a
            L.a1$h r0 = r0.g()
            L.a1 r0 = r0.c()
            L.e0 r1 = r0.k()
            java.util.List r1 = r1.i()
            int r1 = r1.size()
            java.util.List r0 = r0.o()
            int r0 = r0.size()
            boolean r2 = r6.j0()
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L3e
            if (r1 != r4) goto L2d
            if (r0 != r4) goto L2b
            goto L2d
        L2b:
            r0 = r3
            goto L2e
        L2d:
            r0 = r4
        L2e:
            if (r0 != 0) goto L38
            x.N1 r1 = r6.f46712C
            boolean r1 = r6.l0(r1)
            if (r1 == 0) goto L66
        L38:
            r6.y0()
            if (r0 != 0) goto L66
            goto L67
        L3e:
            if (r1 != 0) goto L66
            if (r0 <= 0) goto L66
            x.N1 r0 = r6.f46712C
            if (r0 != 0) goto L5a
            x.N1 r0 = new x.N1
            x.Y r1 = r6.f46733j
            y.n r1 = r1.t()
            x.k1 r2 = r6.f46719J
            x.G r5 = new x.G
            r5.<init>()
            r0.<init>(r1, r2, r5)
            r6.f46712C = r0
        L5a:
            x.N1 r0 = r6.f46712C
            boolean r0 = r6.l0(r0)
            if (r0 == 0) goto L63
            goto L67
        L63:
            r6.Q()
        L66:
            r3 = r4
        L67:
            x.v r6 = r6.f46731h
            r6.h0(r3)
            if (r3 != 0) goto L75
            java.lang.String r6 = "Camera2CameraImpl"
            java.lang.String r0 = "The repeating surface is missing, CameraControl and ImageCapture may encounter issues due to the absence of repeating surface. Please add a UseCase (Preview or ImageAnalysis) that can provide a repeating surface for CameraControl and ImageCapture to function properly."
            E.AbstractC0807p0.c(r6, r0)
        L75:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: x.S.R():void");
    }

    public final boolean S(C1095e0.a aVar) {
        if (!aVar.l().isEmpty()) {
            AbstractC0807p0.l("Camera2CameraImpl", "The capture config builder already has surface inside.");
            return false;
        }
        Iterator it = this.f46724a.f().iterator();
        while (it.hasNext()) {
            C1095e0 c1095e0K = ((L.a1) it.next()).k();
            List listI = c1095e0K.i();
            if (!listI.isEmpty()) {
                if (c1095e0K.h() != 0) {
                    aVar.s(c1095e0K.h());
                }
                if (c1095e0K.l() != 0) {
                    aVar.v(c1095e0K.l());
                }
                Iterator it2 = listI.iterator();
                while (it2.hasNext()) {
                    aVar.f((AbstractC1109l0) it2.next());
                }
            }
        }
        if (!aVar.l().isEmpty()) {
            return true;
        }
        AbstractC0807p0.l("Camera2CameraImpl", "Unable to find a repeating surface to attach to CaptureConfig");
        return false;
    }

    public void T(boolean z10) {
        X0.h.j(this.f46728e == i.CLOSING || this.f46728e == i.RELEASING || (this.f46728e == i.REOPENING && this.f46735l != 0), "closeCamera should only be called in a CLOSING, RELEASING or REOPENING (with error) state. Current state: " + this.f46728e + " (error: " + e0(this.f46735l) + ")");
        z0(z10);
        this.f46736m.e();
    }

    public final void U() {
        Y("Closing camera.");
        switch (this.f46728e.ordinal()) {
            case 3:
            case 4:
                X0.h.i(this.f46734k == null);
                B0(i.INITIALIZED);
                break;
            case 5:
            default:
                Y("close() ignored due to being in state: " + this.f46728e);
                break;
            case 6:
            case 7:
            case 8:
                if (!this.f46732i.a() && !this.f46723S.c()) {
                    z = false;
                }
                this.f46723S.a();
                B0(i.CLOSING);
                if (z) {
                    X0.h.i(m0());
                    W();
                }
                break;
            case 9:
            case 10:
                B0(i.CLOSING);
                T(false);
                break;
        }
    }

    public final O7.e V(CameraDevice cameraDevice) {
        final C6218e1 c6218e1 = new C6218e1(this.f46721Q);
        final SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        surfaceTexture.setDefaultBufferSize(640, 480);
        final Surface surface = new Surface(surfaceTexture);
        final C1136z0 c1136z0 = new C1136z0(surface);
        c1136z0.k().b(new Runnable() { // from class: x.J
            @Override // java.lang.Runnable
            public final void run() {
                S.v(surface, surfaceTexture);
            }
        }, N.a.a());
        a1.b bVar = new a1.b();
        bVar.h(c1136z0);
        bVar.y(1);
        Y("Start configAndClose.");
        return O.d.c(O.n.z(c6218e1.a(bVar.p(), cameraDevice, this.f46714E.a()))).g(new O.a() { // from class: x.K
            @Override // O.a
            public final O7.e apply(Object obj) {
                return S.y(c6218e1, c1136z0, (Void) obj);
            }
        }, this.f46726c);
    }

    public final void W() {
        X0.h.i(this.f46728e == i.RELEASING || this.f46728e == i.CLOSING);
        X0.h.i(this.f46740q.isEmpty());
        if (!this.f46749z) {
            b0();
            return;
        }
        if (this.f46710A) {
            Y("Ignored since configAndClose is processing");
            return;
        }
        if (!this.f46742s.b()) {
            this.f46749z = false;
            b0();
            Y("Ignore configAndClose and finish the close flow directly since camera is unavailable.");
        } else {
            Y("Open camera to configAndClose");
            O7.e eVarR0 = r0();
            this.f46710A = true;
            eVarR0.b(new Runnable() { // from class: x.M
                @Override // java.lang.Runnable
                public final void run() {
                    S.u(this.f46662a);
                }
            }, this.f46726c);
        }
    }

    public final CameraDevice.StateCallback X() {
        ArrayList arrayList = new ArrayList(this.f46724a.g().c().c());
        arrayList.add(this.f46713D.c());
        arrayList.add(this.f46732i);
        return S0.a(arrayList);
    }

    public void Y(String str) {
        Z(str, null);
    }

    public final void Z(String str, Throwable th) {
        AbstractC0807p0.b("Camera2CameraImpl", String.format("{%s} %s", toString(), str), th);
    }

    public L.a1 a0(AbstractC1109l0 abstractC1109l0) {
        for (L.a1 a1Var : this.f46724a.h()) {
            if (a1Var.o().contains(abstractC1109l0)) {
                return a1Var;
            }
        }
        return null;
    }

    public void b0() {
        X0.h.i(this.f46728e == i.RELEASING || this.f46728e == i.CLOSING);
        X0.h.i(this.f46740q.isEmpty());
        this.f46734k = null;
        if (this.f46728e == i.CLOSING) {
            B0(i.INITIALIZED);
            return;
        }
        this.f46725b.h(this.f46742s);
        B0(i.RELEASED);
        c.a aVar = this.f46739p;
        if (aVar != null) {
            aVar.c(null);
            this.f46739p = null;
        }
    }

    @Override // L.J
    public L.F c() {
        return this.f46731h;
    }

    public final int c0() {
        synchronized (this.f46717H) {
            try {
                return this.f46744u.c() == 2 ? 1 : 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // E.W0.c
    public void d(E.W0 w02) {
        X0.h.g(w02);
        A0(h0(w02), this.f46711B ? w02.A() : w02.y(), w02.l(), w02.g(), d0(w02));
    }

    @Override // L.J
    public L.B e() {
        return this.f46716G;
    }

    @Override // L.J
    public void f(final boolean z10) {
        this.f46726c.execute(new Runnable() { // from class: x.D
            @Override // java.lang.Runnable
            public final void run() {
                S.z(this.f46610a, z10);
            }
        });
    }

    @Override // L.J
    public void g(Collection collection) {
        ArrayList arrayList = new ArrayList(collection);
        if (arrayList.isEmpty()) {
            return;
        }
        this.f46731h.V();
        p0(new ArrayList(arrayList));
        final ArrayList arrayList2 = new ArrayList(F0(arrayList));
        try {
            this.f46726c.execute(new Runnable() { // from class: x.N
                @Override // java.lang.Runnable
                public final void run() {
                    S.I(this.f46665a, arrayList2);
                }
            });
        } catch (RejectedExecutionException e10) {
            Z("Unable to attach use cases.", e10);
            this.f46731h.A();
        }
    }

    public final O7.e g0() {
        if (this.f46738o == null) {
            if (this.f46728e != i.RELEASED) {
                this.f46738o = B0.c.a(new c.InterfaceC0018c() { // from class: x.y
                    @Override // B0.c.InterfaceC0018c
                    public final Object a(c.a aVar) {
                        return S.J(this.f47221a, aVar);
                    }
                });
            } else {
                this.f46738o = O.n.p(null);
            }
        }
        return this.f46738o;
    }

    @Override // L.J
    public void h(Collection collection) {
        ArrayList arrayList = new ArrayList(collection);
        if (arrayList.isEmpty()) {
            return;
        }
        final ArrayList arrayList2 = new ArrayList(F0(arrayList));
        q0(new ArrayList(arrayList));
        this.f46726c.execute(new Runnable() { // from class: x.B
            @Override // java.lang.Runnable
            public final void run() {
                this.f46573a.I0(arrayList2);
            }
        });
    }

    @Override // L.J
    public L.I i() {
        return this.f46733j;
    }

    public boolean i0() {
        try {
            return ((Boolean) B0.c.a(new c.InterfaceC0018c() { // from class: x.I
                @Override // B0.c.InterfaceC0018c
                public final Object a(c.a aVar) {
                    return S.s(this.f46631a, aVar);
                }
            }).get()).booleanValue();
        } catch (InterruptedException | ExecutionException e10) {
            throw new RuntimeException("Unable to check if MeteringRepeating is attached.", e10);
        }
    }

    @Override // E.W0.c
    public void j(E.W0 w02) {
        X0.h.g(w02);
        final String strH0 = h0(w02);
        this.f46726c.execute(new Runnable() { // from class: x.P
            @Override // java.lang.Runnable
            public final void run() {
                S.w(this.f46692a, strH0);
            }
        });
    }

    public final boolean j0() {
        N1 n12 = this.f46712C;
        if (n12 == null) {
            return false;
        }
        return this.f46724a.o(f0(n12));
    }

    @Override // L.J
    public void k(L.B b10) {
        if (b10 == null) {
            b10 = L.E.a();
        }
        b10.q(null);
        this.f46716G = b10;
        synchronized (this.f46717H) {
        }
    }

    public final boolean k0() {
        E.G g10 = this.f46746w;
        return (g10 == null || g10.n0()) ? false : true;
    }

    public final boolean l0(N1 n12) {
        X0.h.g(n12);
        return !n0(n12) || k0();
    }

    @Override // E.W0.c
    public void m(E.W0 w02) {
        X0.h.g(w02);
        final String strH0 = h0(w02);
        final L.a1 a1VarA = this.f46711B ? w02.A() : w02.y();
        final L.s1 s1VarL = w02.l();
        final L.e1 e1VarG = w02.g();
        final List listD0 = d0(w02);
        this.f46726c.execute(new Runnable() { // from class: x.Q
            @Override // java.lang.Runnable
            public final void run() {
                S.C(this.f46695a, strH0, a1VarA, s1VarL, e1VarG, listD0);
            }
        });
    }

    public boolean m0() {
        return this.f46740q.isEmpty();
    }

    @Override // E.W0.c
    public void n(E.W0 w02) {
        X0.h.g(w02);
        final String strH0 = h0(w02);
        final L.a1 a1VarA = this.f46711B ? w02.A() : w02.y();
        final L.s1 s1VarL = w02.l();
        final L.e1 e1VarG = w02.g();
        final List listD0 = d0(w02);
        this.f46726c.execute(new Runnable() { // from class: x.O
            @Override // java.lang.Runnable
            public final void run() {
                S.x(this.f46683a, strH0, a1VarA, s1VarL, e1VarG, listD0);
            }
        });
    }

    public final boolean n0(N1 n12) {
        ArrayList arrayList = new ArrayList();
        int iC0 = c0();
        for (r1.b bVar : this.f46724a.j()) {
            if (bVar.c() == null || bVar.c().get(0) != t1.b.METERING_REPEATING) {
                if (bVar.e() == null || bVar.c() == null) {
                    AbstractC0807p0.l("Camera2CameraImpl", "Invalid stream spec or capture types in " + bVar);
                    return false;
                }
                L.a1 a1VarD = bVar.d();
                L.s1 s1VarF = bVar.f();
                for (AbstractC1109l0 abstractC1109l0 : a1VarD.o()) {
                    arrayList.add(AbstractC1096f.a(this.f46722R.a0(iC0, s1VarF.getInputFormat(), abstractC1109l0.h(), s1VarF.R()), s1VarF.getInputFormat(), abstractC1109l0.h(), bVar.e().b(), bVar.c(), bVar.e().d(), bVar.e().g(), bVar.e().c(), s1VarF.A()));
                }
            }
        }
        X0.h.g(n12);
        HashMap map = new HashMap();
        map.put(n12.i(), Collections.singletonList(n12.e()));
        try {
            this.f46722R.K(iC0, arrayList, map, false, false, false, false);
            Y("Surface combination with metering repeating supported!");
            return true;
        } catch (IllegalArgumentException e10) {
            Z("Surface combination with metering repeating  not supported!", e10);
            return false;
        }
    }

    @Override // L.J
    public void o() {
        this.f46726c.execute(new Runnable() { // from class: x.E
            @Override // java.lang.Runnable
            public final void run() {
                S.G(this.f46614a);
            }
        });
    }

    public final InterfaceC6221f1 o0() {
        C6218e1 c6218e1;
        synchronized (this.f46717H) {
            E.G g10 = this.f46746w;
            if (g10 != null) {
                D.j.a(g10);
            }
            c6218e1 = new C6218e1(this.f46721Q, this.f46733j.k(), null);
        }
        return c6218e1;
    }

    public final void p0(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            E.W0 w02 = (E.W0) it.next();
            String strH0 = h0(w02);
            if (!this.f46715F.contains(strH0)) {
                this.f46715F.add(strH0);
                w02.Q();
                w02.O();
            }
        }
    }

    @Override // L.J
    public void q(boolean z10) {
        this.f46711B = z10;
    }

    public final void q0(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            E.W0 w02 = (E.W0) it.next();
            String strH0 = h0(w02);
            if (this.f46715F.contains(strH0)) {
                w02.R();
                this.f46715F.remove(strH0);
            }
        }
    }

    public final O7.e r0() {
        return B0.c.a(new c.InterfaceC0018c() { // from class: x.F
            @Override // B0.c.InterfaceC0018c
            public final Object a(c.a aVar) {
                return S.r(this.f46617a, aVar);
            }
        });
    }

    @Override // L.J
    public O7.e release() {
        return B0.c.a(new c.InterfaceC0018c() { // from class: x.z
            @Override // B0.c.InterfaceC0018c
            public final Object a(c.a aVar) {
                return S.E(this.f47227a, aVar);
            }
        });
    }

    public final void s0(boolean z10) {
        if (!z10) {
            this.f46732i.d();
        }
        this.f46732i.a();
        this.f46723S.a();
        Y("Opening camera.");
        B0(i.OPENING);
        try {
            this.f46725b.f(this.f46733j.d(), this.f46726c, X());
        } catch (SecurityException e10) {
            Y("Unable to open camera due to " + e10.getMessage());
            B0(i.REOPENING);
            this.f46732i.e();
        } catch (RuntimeException e11) {
            Z("Unexpected error occurred when opening camera.", e11);
            C0(i.OPENING_WITH_ERROR, AbstractC0819w.a.a(6));
        } catch (C6369e e12) {
            Y("Unable to open camera due to " + e12.getMessage());
            if (e12.c() != 10001) {
                this.f46723S.d();
            } else {
                C0(i.INITIALIZED, AbstractC0819w.a.b(7, e12));
            }
        }
    }

    public void t0() {
        X0.h.i(this.f46728e == i.OPENED);
        a1.h hVarG = this.f46724a.g();
        if (!hVarG.f()) {
            Y("Unable to create capture session due to conflicting configurations");
            return;
        }
        if (!this.f46745v.j(this.f46734k.getId(), this.f46744u.b(this.f46734k.getId()))) {
            Y("Unable to create capture session in camera operating mode = " + this.f46744u.c());
            return;
        }
        HashMap map = new HashMap();
        Q1.m(this.f46724a.h(), this.f46724a.i(), map);
        this.f46736m.i(map);
        InterfaceC6221f1 interfaceC6221f1 = this.f46736m;
        O.n.j(interfaceC6221f1.a(hVarG.c(), (CameraDevice) X0.h.g(this.f46734k), this.f46714E.a()), new d(interfaceC6221f1), this.f46726c);
    }

    public String toString() {
        return String.format(Locale.US, "Camera@%x[id=%s]", Integer.valueOf(hashCode()), this.f46733j.d());
    }

    public final void u0() {
        int iOrdinal = this.f46728e.ordinal();
        if (iOrdinal == 2 || iOrdinal == 3 || iOrdinal == 4) {
            J0(false);
            return;
        }
        if (iOrdinal != 5) {
            Y("open() ignored due to being in state: " + this.f46728e);
            return;
        }
        B0(i.REOPENING);
        if (m0() || this.f46710A || this.f46735l != 0) {
            return;
        }
        X0.h.j(this.f46734k != null, "Camera Device should be open if session close is not complete");
        B0(i.OPENED);
        t0();
    }

    public void v0(final L.a1 a1Var) {
        ScheduledExecutorService scheduledExecutorServiceD = N.a.d();
        final a1.d dVarD = a1Var.d();
        if (dVarD != null) {
            Z("Posting surface closed", new Throwable());
            scheduledExecutorServiceD.execute(new Runnable() { // from class: x.A
                @Override // java.lang.Runnable
                public final void run() {
                    dVarD.a(a1Var, a1.g.SESSION_ERROR_SURFACE_NEEDS_RESET);
                }
            });
        }
    }

    public final O7.e w0() {
        O7.e eVarG0 = g0();
        switch (this.f46728e.ordinal()) {
            case 1:
            case 5:
            case 6:
            case 7:
            case 8:
                if (!this.f46732i.a() && !this.f46723S.c()) {
                    z = false;
                }
                this.f46723S.a();
                B0(i.RELEASING);
                if (z) {
                    X0.h.i(m0());
                    W();
                }
                break;
            case 2:
            case 3:
            case 4:
                X0.h.i(this.f46734k == null);
                B0(i.RELEASING);
                X0.h.i(m0());
                W();
                break;
            case 9:
            case 10:
                B0(i.RELEASING);
                T(false);
                break;
            default:
                Y("release() ignored due to being in state: " + this.f46728e);
                break;
        }
        return eVarG0;
    }

    public O7.e x0(InterfaceC6221f1 interfaceC6221f1, boolean z10) {
        interfaceC6221f1.close();
        O7.e eVarF = interfaceC6221f1.f(z10);
        Y("Releasing session in state " + this.f46728e.name());
        this.f46740q.put(interfaceC6221f1, eVarF);
        O.n.j(eVarF, new c(interfaceC6221f1), N.a.a());
        return eVarF;
    }

    public final void y0() {
        if (this.f46712C != null) {
            this.f46724a.s(this.f46712C.f() + this.f46712C.hashCode());
            this.f46724a.t(this.f46712C.f() + this.f46712C.hashCode());
            this.f46712C.c();
            this.f46712C = null;
        }
    }

    public void z0(boolean z10) {
        X0.h.i(this.f46736m != null);
        Y("Resetting Capture Session");
        InterfaceC6221f1 interfaceC6221f1 = this.f46736m;
        L.a1 a1VarH = interfaceC6221f1.h();
        List listG = interfaceC6221f1.g();
        InterfaceC6221f1 interfaceC6221f1O0 = o0();
        this.f46736m = interfaceC6221f1O0;
        interfaceC6221f1O0.c(a1VarH);
        this.f46736m.b(listG);
        if (this.f46728e.ordinal() != 9) {
            Y("Skipping Capture Session state check due to current camera state: " + this.f46728e + " and previous session status: " + interfaceC6221f1.d());
        } else if (this.f46747x && interfaceC6221f1.d()) {
            Y("Close camera before creating new session");
            B0(i.REOPENING_QUIRK);
        }
        if (this.f46748y && interfaceC6221f1.d()) {
            Y("ConfigAndClose is required when close the camera.");
            this.f46749z = true;
        }
        x0(interfaceC6221f1, z10);
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public a f46762a;

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final ScheduledFuture f46764a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final AtomicBoolean f46765b = new AtomicBoolean(false);

            public a() {
                this.f46764a = S.this.f46727d.schedule(new Runnable() { // from class: x.U
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f46817a.d();
                    }
                }, 2000L, TimeUnit.MILLISECONDS);
            }

            public void c() {
                this.f46765b.set(true);
                this.f46764a.cancel(true);
            }

            public final void d() {
                if (this.f46765b.getAndSet(true)) {
                    return;
                }
                S.this.f46726c.execute(new Runnable() { // from class: x.V
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f46824a.e();
                    }
                });
            }

            public final void e() {
                if (S.this.f46728e == i.OPENING) {
                    S.this.Y("Camera onError timeout, reopen it.");
                    S.this.B0(i.REOPENING);
                    S.this.f46732i.e();
                } else {
                    S.this.Y("Camera skip reopen at state: " + S.this.f46728e);
                }
            }

            public boolean f() {
                return this.f46765b.get();
            }
        }

        public h() {
            this.f46762a = null;
        }

        public void a() {
            a aVar = this.f46762a;
            if (aVar != null) {
                aVar.c();
            }
            this.f46762a = null;
        }

        public void b() {
            S.this.Y("Camera receive onErrorCallback");
            a();
        }

        public boolean c() {
            a aVar = this.f46762a;
            return (aVar == null || aVar.f()) ? false : true;
        }

        public void d() {
            if (S.this.f46728e != i.OPENING) {
                S.this.Y("Don't need the onError timeout handler.");
                return;
            }
            S.this.Y("Camera waiting for onError.");
            a();
            this.f46762a = new a();
        }

        public /* synthetic */ h(S s10, a aVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class c implements O.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC6221f1 f46753a;

        public c(InterfaceC6221f1 interfaceC6221f1) {
            this.f46753a = interfaceC6221f1;
        }

        @Override // O.c
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r22) {
            S.this.f46740q.remove(this.f46753a);
            int iOrdinal = S.this.f46728e.ordinal();
            if (iOrdinal != 1 && iOrdinal != 5) {
                if (iOrdinal != 6 && (iOrdinal != 7 || S.this.f46735l == 0)) {
                    return;
                } else {
                    S.this.Y("Camera reopen required. Checking if the current camera can be closed safely.");
                }
            }
            if (S.this.m0()) {
                S s10 = S.this;
                if (s10.f46734k != null) {
                    s10.Y("closing camera");
                    AbstractC6365a.a(S.this.f46734k);
                    S.this.f46734k = null;
                }
            }
        }

        @Override // O.c
        public void a(Throwable th) {
        }
    }
}
