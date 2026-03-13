package ac;

import Eb.t;
import Yb.d;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class b implements t, Hb.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference f21220a = new AtomicReference();

    @Override // Eb.t
    public final void b(Hb.c cVar) {
        if (d.c(this.f21220a, cVar, getClass())) {
            a();
        }
    }

    @Override // Hb.c
    public final void dispose() {
        Kb.c.a(this.f21220a);
    }

    @Override // Hb.c
    public final boolean j() {
        return this.f21220a.get() == Kb.c.DISPOSED;
    }

    public void a() {
    }
}
