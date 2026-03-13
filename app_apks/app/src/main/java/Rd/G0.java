package Rd;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class G0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Wd.E f15128a = new Wd.E("COMPLETING_ALREADY");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Wd.E f15129b = new Wd.E("COMPLETING_WAITING_CHILDREN");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Wd.E f15130c = new Wd.E("COMPLETING_RETRY");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Wd.E f15131d = new Wd.E("TOO_LATE_TO_CANCEL");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Wd.E f15132e = new Wd.E("SEALED");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final C2133i0 f15133f = new C2133i0(false);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final C2133i0 f15134g = new C2133i0(true);

    public static final Object g(Object obj) {
        return obj instanceof InterfaceC2158v0 ? new C2160w0((InterfaceC2158v0) obj) : obj;
    }

    public static final Object h(Object obj) {
        InterfaceC2158v0 interfaceC2158v0;
        C2160w0 c2160w0 = obj instanceof C2160w0 ? (C2160w0) obj : null;
        return (c2160w0 == null || (interfaceC2158v0 = c2160w0.f15209a) == null) ? obj : interfaceC2158v0;
    }
}
