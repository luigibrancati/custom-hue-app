package Kb;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class g extends AtomicReference implements Hb.c {
    public g() {
    }

    public boolean a(Hb.c cVar) {
        return c.p(this, cVar);
    }

    public boolean b(Hb.c cVar) {
        return c.s(this, cVar);
    }

    @Override // Hb.c
    public void dispose() {
        c.a(this);
    }

    @Override // Hb.c
    public boolean j() {
        return c.b((Hb.c) get());
    }

    public g(Hb.c cVar) {
        lazySet(cVar);
    }
}
