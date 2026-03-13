package L;

import L.InterfaceC1099g0;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public interface B extends Y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final InterfaceC1099g0.a f7877a = InterfaceC1099g0.a.a("camerax.core.camera.useCaseConfigFactory", t1.class);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final InterfaceC1099g0.a f7878b = InterfaceC1099g0.a.a("camerax.core.camera.compatibilityId", AbstractC1124t0.class);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final InterfaceC1099g0.a f7879c = InterfaceC1099g0.a.a("camerax.core.camera.useCaseCombinationRequiredRule", Integer.class);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final InterfaceC1099g0.a f7880d = InterfaceC1099g0.a.a("camerax.core.camera.SessionProcessor", c1.class);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final InterfaceC1099g0.a f7881e = InterfaceC1099g0.a.a("camerax.core.camera.isZslDisabled", Boolean.class);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final InterfaceC1099g0.a f7882f = InterfaceC1099g0.a.a("camerax.core.camera.isPostviewSupported", Boolean.class);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final InterfaceC1099g0.a f7883g = InterfaceC1099g0.a.a("camerax.core.camera.PostviewFormatSelector", a.class);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final InterfaceC1099g0.a f7884h = InterfaceC1099g0.a.a("camerax.core.camera.isCaptureProcessProgressSupported", Boolean.class);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f7885i = new a() { // from class: L.A
    };

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface a {
    }

    default boolean L() {
        return ((Boolean) c(f7882f, Boolean.FALSE)).booleanValue();
    }

    AbstractC1124t0 W();

    default boolean X() {
        return ((Boolean) c(f7884h, Boolean.FALSE)).booleanValue();
    }

    default t1 j() {
        return (t1) c(f7877a, t1.f8191a);
    }

    default c1 q(c1 c1Var) {
        android.support.v4.media.session.a.a(c(f7880d, c1Var));
        return null;
    }

    default int t() {
        return ((Integer) c(f7879c, 0)).intValue();
    }
}
