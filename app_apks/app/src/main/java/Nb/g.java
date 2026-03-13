package Nb;

import Eb.p;
import bc.AbstractC2904a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class g implements p, Hb.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f10616a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Jb.d f10617b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Jb.a f10618c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Hb.c f10619d;

    public g(p pVar, Jb.d dVar, Jb.a aVar) {
        this.f10616a = pVar;
        this.f10617b = dVar;
        this.f10618c = aVar;
    }

    @Override // Eb.p
    public void a() {
        Hb.c cVar = this.f10619d;
        Kb.c cVar2 = Kb.c.DISPOSED;
        if (cVar != cVar2) {
            this.f10619d = cVar2;
            this.f10616a.a();
        }
    }

    @Override // Eb.p
    public void b(Hb.c cVar) {
        try {
            this.f10617b.accept(cVar);
            if (Kb.c.w(this.f10619d, cVar)) {
                this.f10619d = cVar;
                this.f10616a.b(this);
            }
        } catch (Throwable th) {
            Ib.b.b(th);
            cVar.dispose();
            this.f10619d = Kb.c.DISPOSED;
            Kb.d.p(th, this.f10616a);
        }
    }

    @Override // Eb.p
    public void c(Object obj) {
        this.f10616a.c(obj);
    }

    @Override // Hb.c
    public void dispose() {
        Hb.c cVar = this.f10619d;
        Kb.c cVar2 = Kb.c.DISPOSED;
        if (cVar != cVar2) {
            this.f10619d = cVar2;
            try {
                this.f10618c.run();
            } catch (Throwable th) {
                Ib.b.b(th);
                AbstractC2904a.q(th);
            }
            cVar.dispose();
        }
    }

    @Override // Hb.c
    public boolean j() {
        return this.f10619d.j();
    }

    @Override // Eb.p
    public void onError(Throwable th) {
        Hb.c cVar = this.f10619d;
        Kb.c cVar2 = Kb.c.DISPOSED;
        if (cVar == cVar2) {
            AbstractC2904a.q(th);
        } else {
            this.f10619d = cVar2;
            this.f10616a.onError(th);
        }
    }
}
