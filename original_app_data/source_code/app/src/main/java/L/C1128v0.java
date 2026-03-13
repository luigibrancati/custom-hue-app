package L;

import E.C0781c0;
import E.InterfaceC0797k0;
import L.InterfaceC1099g0;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: L.v0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C1128v0 implements s1, InterfaceC1132x0, P.i {

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public static final InterfaceC1099g0.a f8199Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public static final InterfaceC1099g0.a f8200R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public static final InterfaceC1099g0.a f8201S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public static final InterfaceC1099g0.a f8202T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public static final InterfaceC1099g0.a f8203U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public static final InterfaceC1099g0.a f8204V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public static final InterfaceC1099g0.a f8205W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public static final InterfaceC1099g0.a f8206X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public static final InterfaceC1099g0.a f8207Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public static final InterfaceC1099g0.a f8208Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final InterfaceC1099g0.a f8209a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final InterfaceC1099g0.a f8210b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final InterfaceC1099g0.a f8211c0;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public final R0 f8212P;

    static {
        Class cls = Integer.TYPE;
        f8199Q = InterfaceC1099g0.a.a("camerax.core.imageCapture.captureMode", cls);
        f8200R = InterfaceC1099g0.a.a("camerax.core.imageCapture.flashMode", cls);
        f8201S = InterfaceC1099g0.a.a("camerax.core.imageCapture.captureBundle", InterfaceC1093d0.class);
        f8202T = InterfaceC1099g0.a.a("camerax.core.imageCapture.bufferFormat", Integer.class);
        f8203U = InterfaceC1099g0.a.a("camerax.core.imageCapture.outputFormat", Integer.class);
        f8204V = InterfaceC1099g0.a.a("camerax.core.imageCapture.maxCaptureStages", Integer.class);
        f8205W = InterfaceC1099g0.a.a("camerax.core.imageCapture.imageReaderProxyProvider", InterfaceC0797k0.class);
        f8206X = InterfaceC1099g0.a.a("camerax.core.imageCapture.useSoftwareJpegEncoder", Boolean.TYPE);
        f8207Y = InterfaceC1099g0.a.a("camerax.core.imageCapture.flashType", cls);
        f8208Z = InterfaceC1099g0.a.a("camerax.core.imageCapture.jpegCompressionQuality", cls);
        f8209a0 = InterfaceC1099g0.a.a("camerax.core.imageCapture.screenFlash", C0781c0.i.class);
        f8210b0 = InterfaceC1099g0.a.a("camerax.core.useCase.postviewResolutionSelector", X.c.class);
        f8211c0 = InterfaceC1099g0.a.a("camerax.core.useCase.isPostviewEnabled", Boolean.class);
    }

    public C1128v0(R0 r02) {
        this.f8212P = r02;
    }

    public InterfaceC1093d0 d0(InterfaceC1093d0 interfaceC1093d0) {
        return (InterfaceC1093d0) c(f8201S, interfaceC1093d0);
    }

    public int e0() {
        return ((Integer) a(f8199Q)).intValue();
    }

    public int f0(int i10) {
        return ((Integer) c(f8200R, Integer.valueOf(i10))).intValue();
    }

    public int g0(int i10) {
        return ((Integer) c(f8207Y, Integer.valueOf(i10))).intValue();
    }

    @Override // L.Y0
    public InterfaceC1099g0 getConfig() {
        return this.f8212P;
    }

    @Override // L.InterfaceC1130w0
    public int getInputFormat() {
        return ((Integer) a(InterfaceC1130w0.f8213j)).intValue();
    }

    public InterfaceC0797k0 h0() {
        android.support.v4.media.session.a.a(c(f8205W, null));
        return null;
    }

    public Executor i0(Executor executor) {
        return (Executor) c(P.i.f12518L, executor);
    }

    public C0781c0.i j0() {
        return (C0781c0.i) c(f8209a0, null);
    }

    public boolean k0() {
        return d(f8199Q);
    }
}
