package L;

import E.InterfaceC0797k0;
import E.S;
import L.InterfaceC1099g0;

/* JADX INFO: renamed from: L.u0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C1126u0 implements s1, InterfaceC1132x0, P.r {

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public static final InterfaceC1099g0.a f8192Q = InterfaceC1099g0.a.a("camerax.core.imageAnalysis.backpressureStrategy", S.b.class);

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public static final InterfaceC1099g0.a f8193R = InterfaceC1099g0.a.a("camerax.core.imageAnalysis.imageQueueDepth", Integer.TYPE);

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public static final InterfaceC1099g0.a f8194S = InterfaceC1099g0.a.a("camerax.core.imageAnalysis.imageReaderProxyProvider", InterfaceC0797k0.class);

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public static final InterfaceC1099g0.a f8195T = InterfaceC1099g0.a.a("camerax.core.imageAnalysis.outputImageFormat", S.e.class);

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public static final InterfaceC1099g0.a f8196U = InterfaceC1099g0.a.a("camerax.core.imageAnalysis.onePixelShiftEnabled", Boolean.class);

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public static final InterfaceC1099g0.a f8197V = InterfaceC1099g0.a.a("camerax.core.imageAnalysis.outputImageRotationEnabled", Boolean.class);

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public final R0 f8198P;

    public C1126u0(R0 r02) {
        this.f8198P = r02;
    }

    public int d0(int i10) {
        return ((Integer) c(f8192Q, Integer.valueOf(i10))).intValue();
    }

    public int e0(int i10) {
        return ((Integer) c(f8193R, Integer.valueOf(i10))).intValue();
    }

    public InterfaceC0797k0 f0() {
        android.support.v4.media.session.a.a(c(f8194S, null));
        return null;
    }

    public Boolean g0(Boolean bool) {
        return (Boolean) c(f8196U, bool);
    }

    @Override // L.Y0
    public InterfaceC1099g0 getConfig() {
        return this.f8198P;
    }

    @Override // L.InterfaceC1130w0
    public int getInputFormat() {
        return 35;
    }

    public int h0(int i10) {
        return ((Integer) c(f8195T, Integer.valueOf(i10))).intValue();
    }

    public Boolean i0(Boolean bool) {
        return (Boolean) c(f8197V, bool);
    }
}
