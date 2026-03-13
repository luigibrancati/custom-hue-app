package Hb;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class e extends AtomicReference implements c {
    public e(Object obj) {
        super(Lb.b.e(obj, "value is null"));
    }

    public abstract void a(Object obj);

    @Override // Hb.c
    public final void dispose() {
        Object andSet;
        if (get() == null || (andSet = getAndSet(null)) == null) {
            return;
        }
        a(andSet);
    }

    @Override // Hb.c
    public final boolean j() {
        return get() == null;
    }
}
