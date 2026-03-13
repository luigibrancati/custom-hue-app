package L;

import E.AbstractC0782d;
import L.InterfaceC1099g0;
import android.util.Size;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: L.x0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC1132x0 extends Y0 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final InterfaceC1099g0.a f8216m = InterfaceC1099g0.a.a("camerax.core.imageOutput.targetAspectRatio", AbstractC0782d.class);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final InterfaceC1099g0.a f8217n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final InterfaceC1099g0.a f8218o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final InterfaceC1099g0.a f8219p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final InterfaceC1099g0.a f8220q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final InterfaceC1099g0.a f8221r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final InterfaceC1099g0.a f8222s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final InterfaceC1099g0.a f8223t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final InterfaceC1099g0.a f8224u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final InterfaceC1099g0.a f8225v;

    static {
        Class cls = Integer.TYPE;
        f8217n = InterfaceC1099g0.a.a("camerax.core.imageOutput.targetRotation", cls);
        f8218o = InterfaceC1099g0.a.a("camerax.core.imageOutput.appTargetRotation", cls);
        f8219p = InterfaceC1099g0.a.a("camerax.core.imageOutput.mirrorMode", cls);
        f8220q = InterfaceC1099g0.a.a("camerax.core.imageOutput.targetResolution", Size.class);
        f8221r = InterfaceC1099g0.a.a("camerax.core.imageOutput.defaultResolution", Size.class);
        f8222s = InterfaceC1099g0.a.a("camerax.core.imageOutput.maxResolution", Size.class);
        f8223t = InterfaceC1099g0.a.a("camerax.core.imageOutput.supportedResolutions", List.class);
        f8224u = InterfaceC1099g0.a.a("camerax.core.imageOutput.resolutionSelector", X.c.class);
        f8225v = InterfaceC1099g0.a.a("camerax.core.imageOutput.customOrderedResolutions", List.class);
    }

    static void k(InterfaceC1132x0 interfaceC1132x0) {
        boolean zW = interfaceC1132x0.w();
        boolean z10 = interfaceC1132x0.O(null) != null;
        if (zW && z10) {
            throw new IllegalArgumentException("Cannot use both setTargetResolution and setTargetAspectRatio on the same config.");
        }
        if (interfaceC1132x0.N(null) != null) {
            if (zW || z10) {
                throw new IllegalArgumentException("Cannot use setTargetResolution or setTargetAspectRatio with setResolutionSelector on the same config.");
            }
        }
    }

    default int B(int i10) {
        return ((Integer) c(f8217n, Integer.valueOf(i10))).intValue();
    }

    default List D(List list) {
        List list2 = (List) c(f8225v, list);
        if (list2 != null) {
            return new ArrayList(list2);
        }
        return null;
    }

    default Size I(Size size) {
        return (Size) c(f8221r, size);
    }

    default X.c N(X.c cVar) {
        return (X.c) c(f8224u, cVar);
    }

    default Size O(Size size) {
        return (Size) c(f8220q, size);
    }

    default int c0(int i10) {
        return ((Integer) c(f8219p, Integer.valueOf(i10))).intValue();
    }

    default Size i(Size size) {
        return (Size) c(f8222s, size);
    }

    default List l(List list) {
        return (List) c(f8223t, list);
    }

    default X.c m() {
        return (X.c) a(f8224u);
    }

    default int r(int i10) {
        return ((Integer) c(f8218o, Integer.valueOf(i10))).intValue();
    }

    default boolean w() {
        return d(f8216m);
    }

    default int y() {
        return ((Integer) a(f8216m)).intValue();
    }
}
