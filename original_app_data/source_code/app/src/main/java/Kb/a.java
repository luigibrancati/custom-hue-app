package Kb;

import bc.AbstractC2904a;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class a extends AtomicReference implements Hb.c {
    public a(Jb.c cVar) {
        super(cVar);
    }

    @Override // Hb.c
    public void dispose() {
        Jb.c cVar;
        if (get() == null || (cVar = (Jb.c) getAndSet(null)) == null) {
            return;
        }
        try {
            cVar.cancel();
        } catch (Exception e10) {
            Ib.b.b(e10);
            AbstractC2904a.q(e10);
        }
    }

    @Override // Hb.c
    public boolean j() {
        return get() == null;
    }
}
