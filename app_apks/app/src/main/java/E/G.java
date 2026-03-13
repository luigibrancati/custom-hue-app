package E;

import L.G;
import L.H;
import L.InterfaceC1099g0;
import L.t1;
import android.os.Handler;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class G implements P.q {

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public static final InterfaceC1099g0.a f2763Q = InterfaceC1099g0.a.a("camerax.core.appConfig.cameraFactoryProvider", H.a.class);

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public static final InterfaceC1099g0.a f2764R = InterfaceC1099g0.a.a("camerax.core.appConfig.deviceSurfaceManagerProvider", G.a.class);

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public static final InterfaceC1099g0.a f2765S = InterfaceC1099g0.a.a("camerax.core.appConfig.useCaseConfigFactoryProvider", t1.c.class);

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public static final InterfaceC1099g0.a f2766T = InterfaceC1099g0.a.a("camerax.core.appConfig.cameraExecutor", Executor.class);

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public static final InterfaceC1099g0.a f2767U = InterfaceC1099g0.a.a("camerax.core.appConfig.schedulerHandler", Handler.class);

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public static final InterfaceC1099g0.a f2768V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public static final InterfaceC1099g0.a f2769W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public static final InterfaceC1099g0.a f2770X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public static final InterfaceC1099g0.a f2771Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public static final InterfaceC1099g0.a f2772Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final InterfaceC1099g0.a f2773a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final InterfaceC1099g0.a f2774b0;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public final L.R0 f2775P;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final L.M0 f2776a;

        public a() {
            this(L.M0.g0());
        }

        public static a b(G g10) {
            return new a(L.M0.h0(g10));
        }

        public G a() {
            return new G(L.R0.f0(this.f2776a));
        }

        public L.L0 c() {
            return this.f2776a;
        }

        public a d(H.a aVar) {
            c().H(G.f2763Q, aVar);
            return this;
        }

        public a e(int i10) {
            c().H(G.f2773a0, Integer.valueOf(i10));
            return this;
        }

        public a f(G.a aVar) {
            c().H(G.f2764R, aVar);
            return this;
        }

        public a g(int i10) {
            c().H(G.f2768V, Integer.valueOf(i10));
            return this;
        }

        public a h(boolean z10) {
            c().H(G.f2774b0, Boolean.valueOf(z10));
            return this;
        }

        public a i(Class cls) {
            c().H(P.q.f12542N, cls);
            if (c().c(P.q.f12541M, null) == null) {
                j(cls.getCanonicalName() + "-" + UUID.randomUUID());
            }
            return this;
        }

        public a j(String str) {
            c().H(P.q.f12541M, str);
            return this;
        }

        public a k(t1.c cVar) {
            c().H(G.f2765S, cVar);
            return this;
        }

        public a(L.M0 m02) {
            this.f2776a = m02;
            Class cls = (Class) m02.c(P.q.f12542N, null);
            if (cls == null || cls.equals(F.class)) {
                i(F.class);
                return;
            }
            throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface b {
        G getCameraXConfig();
    }

    static {
        Class cls = Integer.TYPE;
        f2768V = InterfaceC1099g0.a.a("camerax.core.appConfig.minimumLoggingLevel", cls);
        f2769W = InterfaceC1099g0.a.a("camerax.core.appConfig.availableCamerasLimiter", C0817v.class);
        f2770X = InterfaceC1099g0.a.a("camerax.core.appConfig.cameraOpenRetryMaxTimeoutInMillisWhileResuming", Long.TYPE);
        f2771Y = InterfaceC1099g0.a.a("camerax.core.appConfig.cameraProviderInitRetryPolicy", B0.class);
        f2772Z = InterfaceC1099g0.a.a("camerax.core.appConfig.quirksSettings", L.U0.class);
        f2773a0 = InterfaceC1099g0.a.a("camerax.core.appConfig.configImplType", cls);
        f2774b0 = InterfaceC1099g0.a.a("camerax.core.appConfig.repeatingStreamForced", Boolean.TYPE);
    }

    public G(L.R0 r02) {
        this.f2775P = r02;
    }

    public C0817v d0(C0817v c0817v) {
        return (C0817v) this.f2775P.c(f2769W, c0817v);
    }

    public Executor e0(Executor executor) {
        return (Executor) this.f2775P.c(f2766T, executor);
    }

    public H.a f0(H.a aVar) {
        return (H.a) this.f2775P.c(f2763Q, aVar);
    }

    public long g0() {
        return ((Long) this.f2775P.c(f2770X, -1L)).longValue();
    }

    @Override // L.Y0
    public InterfaceC1099g0 getConfig() {
        return this.f2775P;
    }

    public B0 h0() {
        B0 b02 = (B0) this.f2775P.c(f2771Y, B0.f2711b);
        Objects.requireNonNull(b02);
        return b02;
    }

    public int i0() {
        return ((Integer) this.f2775P.c(f2773a0, -1)).intValue();
    }

    public G.a j0(G.a aVar) {
        return (G.a) this.f2775P.c(f2764R, aVar);
    }

    public L.U0 k0() {
        return (L.U0) this.f2775P.c(f2772Z, null);
    }

    public Handler l0(Handler handler) {
        return (Handler) this.f2775P.c(f2767U, handler);
    }

    public t1.c m0(t1.c cVar) {
        return (t1.c) this.f2775P.c(f2765S, cVar);
    }

    public boolean n0() {
        return ((Boolean) this.f2775P.c(f2774b0, Boolean.TRUE)).booleanValue();
    }
}
