package Nb;

import Eb.t;
import bc.AbstractC2904a;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class e extends AtomicReference implements t, Hb.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Jb.d f10612a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Jb.d f10613b;

    public e(Jb.d dVar, Jb.d dVar2) {
        this.f10612a = dVar;
        this.f10613b = dVar2;
    }

    @Override // Eb.t
    public void b(Hb.c cVar) {
        Kb.c.u(this, cVar);
    }

    @Override // Hb.c
    public void dispose() {
        Kb.c.a(this);
    }

    @Override // Hb.c
    public boolean j() {
        return get() == Kb.c.DISPOSED;
    }

    @Override // Eb.t
    public void onError(Throwable th) {
        lazySet(Kb.c.DISPOSED);
        try {
            this.f10613b.accept(th);
        } catch (Throwable th2) {
            Ib.b.b(th2);
            AbstractC2904a.q(new Ib.a(th, th2));
        }
    }

    @Override // Eb.t
    public void onSuccess(Object obj) {
        lazySet(Kb.c.DISPOSED);
        try {
            this.f10612a.accept(obj);
        } catch (Throwable th) {
            Ib.b.b(th);
            AbstractC2904a.q(th);
        }
    }
}
