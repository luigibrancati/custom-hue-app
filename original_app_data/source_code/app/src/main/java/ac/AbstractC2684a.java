package ac;

import Eb.p;
import Yb.d;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: ac.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC2684a implements p, Hb.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference f21219a = new AtomicReference();

    @Override // Eb.p
    public final void b(Hb.c cVar) {
        if (d.c(this.f21219a, cVar, getClass())) {
            d();
        }
    }

    @Override // Hb.c
    public final void dispose() {
        Kb.c.a(this.f21219a);
    }

    @Override // Hb.c
    public final boolean j() {
        return this.f21219a.get() == Kb.c.DISPOSED;
    }

    public void d() {
    }
}
