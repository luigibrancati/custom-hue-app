package Nb;

import Eb.p;
import bc.AbstractC2904a;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class h extends AtomicReference implements p, Hb.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Jb.d f10620a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Jb.d f10621b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Jb.a f10622c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Jb.d f10623d;

    public h(Jb.d dVar, Jb.d dVar2, Jb.a aVar, Jb.d dVar3) {
        this.f10620a = dVar;
        this.f10621b = dVar2;
        this.f10622c = aVar;
        this.f10623d = dVar3;
    }

    @Override // Eb.p
    public void a() {
        if (j()) {
            return;
        }
        lazySet(Kb.c.DISPOSED);
        try {
            this.f10622c.run();
        } catch (Throwable th) {
            Ib.b.b(th);
            AbstractC2904a.q(th);
        }
    }

    @Override // Eb.p
    public void b(Hb.c cVar) {
        if (Kb.c.u(this, cVar)) {
            try {
                this.f10623d.accept(this);
            } catch (Throwable th) {
                Ib.b.b(th);
                cVar.dispose();
                onError(th);
            }
        }
    }

    @Override // Eb.p
    public void c(Object obj) {
        if (j()) {
            return;
        }
        try {
            this.f10620a.accept(obj);
        } catch (Throwable th) {
            Ib.b.b(th);
            ((Hb.c) get()).dispose();
            onError(th);
        }
    }

    @Override // Hb.c
    public void dispose() {
        Kb.c.a(this);
    }

    @Override // Hb.c
    public boolean j() {
        return get() == Kb.c.DISPOSED;
    }

    @Override // Eb.p
    public void onError(Throwable th) {
        if (j()) {
            AbstractC2904a.q(th);
            return;
        }
        lazySet(Kb.c.DISPOSED);
        try {
            this.f10621b.accept(th);
        } catch (Throwable th2) {
            Ib.b.b(th2);
            AbstractC2904a.q(new Ib.a(th, th2));
        }
    }
}
