package Hb;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class g implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference f5348a = new AtomicReference();

    public boolean a(c cVar) {
        return Kb.c.s(this.f5348a, cVar);
    }

    @Override // Hb.c
    public void dispose() {
        Kb.c.a(this.f5348a);
    }

    @Override // Hb.c
    public boolean j() {
        return Kb.c.b((c) this.f5348a.get());
    }
}
