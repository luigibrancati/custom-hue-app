package Nb;

import bc.AbstractC2904a;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class d extends AtomicReference implements Eb.b, Hb.c, Jb.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Jb.d f10610a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Jb.a f10611b;

    public d(Jb.d dVar, Jb.a aVar) {
        this.f10610a = dVar;
        this.f10611b = aVar;
    }

    @Override // Eb.b
    public void a() {
        try {
            this.f10611b.run();
        } catch (Throwable th) {
            Ib.b.b(th);
            AbstractC2904a.q(th);
        }
        lazySet(Kb.c.DISPOSED);
    }

    @Override // Eb.b
    public void b(Hb.c cVar) {
        Kb.c.u(this, cVar);
    }

    @Override // Jb.d
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void accept(Throwable th) {
        AbstractC2904a.q(new Ib.d(th));
    }

    @Override // Hb.c
    public void dispose() {
        Kb.c.a(this);
    }

    @Override // Hb.c
    public boolean j() {
        return get() == Kb.c.DISPOSED;
    }

    @Override // Eb.b
    public void onError(Throwable th) {
        try {
            this.f10610a.accept(th);
        } catch (Throwable th2) {
            Ib.b.b(th2);
            AbstractC2904a.q(th2);
        }
        lazySet(Kb.c.DISPOSED);
    }
}
