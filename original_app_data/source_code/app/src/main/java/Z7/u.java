package Z7;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class u {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static u f20391b = new u();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference f20392a = new AtomicReference(E.d().c());

    public static u b() {
        return f20391b;
    }

    public Object a(P7.g gVar, Class cls) {
        return ((E) this.f20392a.get()).f(gVar, cls);
    }

    public synchronized void c(C c10) {
        this.f20392a.set(E.e((E) this.f20392a.get()).d(c10).c());
    }

    public synchronized void d(F f10) {
        this.f20392a.set(E.e((E) this.f20392a.get()).e(f10).c());
    }

    public Object e(InterfaceC2599i interfaceC2599i, C2603m c2603m, Class cls) {
        return ((E) this.f20392a.get()).g(interfaceC2599i, c2603m, cls);
    }
}
