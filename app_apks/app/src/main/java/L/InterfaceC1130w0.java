package L;

import L.InterfaceC1099g0;

/* JADX INFO: renamed from: L.w0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC1130w0 extends Y0 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final InterfaceC1099g0.a f8213j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final InterfaceC1099g0.a f8214k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final InterfaceC1099g0.a f8215l;

    static {
        Class cls = Integer.TYPE;
        f8213j = InterfaceC1099g0.a.a("camerax.core.imageInput.inputFormat", cls);
        f8214k = InterfaceC1099g0.a.a("camerax.core.imageInput.secondaryInputFormat", cls);
        f8215l = InterfaceC1099g0.a.a("camerax.core.imageInput.inputDynamicRange", E.J.class);
    }

    default E.J C() {
        return (E.J) X0.h.g((E.J) c(f8215l, E.J.f2793c));
    }

    default boolean G() {
        return d(f8215l);
    }

    default int T() {
        return ((Integer) c(f8214k, 0)).intValue();
    }

    default int getInputFormat() {
        return ((Integer) a(f8213j)).intValue();
    }
}
