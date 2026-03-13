package L;

import K.InterfaceC0981x;
import K.X;
import L.C1095e0;
import L.InterfaceC1099g0;
import L.a1;
import L.t1;
import android.util.Range;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public interface s1 extends P.q, InterfaceC1130w0 {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final InterfaceC1099g0.a f8175A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final InterfaceC1099g0.a f8176B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final InterfaceC1099g0.a f8177C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final InterfaceC1099g0.a f8178D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final InterfaceC1099g0.a f8179E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public static final InterfaceC1099g0.a f8180F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static final InterfaceC1099g0.a f8181G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public static final InterfaceC1099g0.a f8182H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public static final InterfaceC1099g0.a f8183I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public static final InterfaceC1099g0.a f8184J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public static final InterfaceC1099g0.a f8185K;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final InterfaceC1099g0.a f8186w = InterfaceC1099g0.a.a("camerax.core.useCase.defaultSessionConfig", a1.class);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final InterfaceC1099g0.a f8187x = InterfaceC1099g0.a.a("camerax.core.useCase.defaultCaptureConfig", C1095e0.class);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final InterfaceC1099g0.a f8188y = InterfaceC1099g0.a.a("camerax.core.useCase.sessionConfigUnpacker", a1.e.class);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final InterfaceC1099g0.a f8189z = InterfaceC1099g0.a.a("camerax.core.useCase.captureConfigUnpacker", C1095e0.b.class);

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a implements X.b {
        public a() {
        }

        @Override // K.X.b
        public K.X a(InterfaceC0981x interfaceC0981x) {
            return new K.b0(interfaceC0981x);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface b extends E.K {
        s1 b();
    }

    static {
        Class cls = Integer.TYPE;
        f8175A = InterfaceC1099g0.a.a("camerax.core.useCase.surfaceOccupancyPriority", cls);
        f8176B = InterfaceC1099g0.a.a("camerax.core.useCase.sessionType", cls);
        f8177C = InterfaceC1099g0.a.a("camerax.core.useCase.targetFrameRate", Range.class);
        f8178D = InterfaceC1099g0.a.a("camerax.core.useCase.isStrictFrameRateRequired", Boolean.class);
        Class cls2 = Boolean.TYPE;
        f8179E = InterfaceC1099g0.a.a("camerax.core.useCase.zslDisabled", cls2);
        f8180F = InterfaceC1099g0.a.a("camerax.core.useCase.highResolutionDisabled", cls2);
        f8181G = InterfaceC1099g0.a.a("camerax.core.useCase.captureType", t1.b.class);
        f8182H = InterfaceC1099g0.a.a("camerax.core.useCase.previewStabilizationMode", cls);
        f8183I = InterfaceC1099g0.a.a("camerax.core.useCase.videoStabilizationMode", cls);
        f8184J = InterfaceC1099g0.a.a("camerax.core.useCase.takePictureManagerProvider", X.b.class);
        f8185K = InterfaceC1099g0.a.a("camerax.core.useCase.streamUseCase", f1.class);
    }

    default boolean A() {
        Boolean bool = (Boolean) c(f8178D, Boolean.FALSE);
        Objects.requireNonNull(bool);
        return bool.booleanValue();
    }

    default a1.e E(a1.e eVar) {
        return (a1.e) c(f8188y, eVar);
    }

    default a1 J() {
        return (a1) a(f8186w);
    }

    default boolean K(boolean z10) {
        return ((Boolean) c(f8179E, Boolean.valueOf(z10))).booleanValue();
    }

    default C1095e0.b P(C1095e0.b bVar) {
        return (C1095e0.b) c(f8189z, bVar);
    }

    default f1 R() {
        f1 f1Var = (f1) c(f8185K, f1.DEFAULT);
        Objects.requireNonNull(f1Var);
        return f1Var;
    }

    default t1.b S() {
        return (t1.b) a(f8181G);
    }

    default C1095e0 V(C1095e0 c1095e0) {
        return (C1095e0) c(f8187x, c1095e0);
    }

    default boolean Z(boolean z10) {
        return ((Boolean) c(f8180F, Boolean.valueOf(z10))).booleanValue();
    }

    default boolean b0() {
        return d(f8177C);
    }

    default int n(int i10) {
        return ((Integer) c(f8176B, Integer.valueOf(i10))).intValue();
    }

    default X.b o() {
        X.b bVar = (X.b) c(f8184J, new a());
        Objects.requireNonNull(bVar);
        return bVar;
    }

    default a1 p(a1 a1Var) {
        return (a1) c(f8186w, a1Var);
    }

    default int u() {
        return ((Integer) c(f8183I, 0)).intValue();
    }

    default Range v(Range range) {
        return (Range) c(f8177C, range);
    }

    default int x(int i10) {
        return ((Integer) c(f8175A, Integer.valueOf(i10))).intValue();
    }

    default int z() {
        return ((Integer) c(f8182H, 0)).intValue();
    }
}
