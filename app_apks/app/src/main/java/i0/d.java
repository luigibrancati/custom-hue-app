package i0;

import fc.C4015H;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference f36808a = new AtomicReference(e.f36811a);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f36809b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f36810c;

    public final Object a() {
        long jA = h.a();
        return jA == g.a() ? this.f36810c : ((f) this.f36808a.get()).b(jA);
    }

    public final void b(Object obj) {
        long jA = h.a();
        if (jA == g.a()) {
            this.f36810c = obj;
            return;
        }
        synchronized (this.f36809b) {
            f fVar = (f) this.f36808a.get();
            if (fVar.d(jA, obj)) {
                return;
            }
            this.f36808a.set(fVar.c(jA, obj));
            C4015H c4015h = C4015H.f34254a;
        }
    }
}
