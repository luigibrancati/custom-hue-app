package Nb;

import Eb.p;
import bc.AbstractC2904a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class a implements p, Mb.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f10605a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Hb.c f10606b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Mb.c f10607c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f10608d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f10609e;

    public a(p pVar) {
        this.f10605a = pVar;
    }

    @Override // Eb.p
    public void a() {
        if (this.f10608d) {
            return;
        }
        this.f10608d = true;
        this.f10605a.a();
    }

    @Override // Eb.p
    public final void b(Hb.c cVar) {
        if (Kb.c.w(this.f10606b, cVar)) {
            this.f10606b = cVar;
            if (cVar instanceof Mb.c) {
                this.f10607c = (Mb.c) cVar;
            }
            if (e()) {
                this.f10605a.b(this);
                d();
            }
        }
    }

    @Override // Mb.h
    public void clear() {
        this.f10607c.clear();
    }

    @Override // Hb.c
    public void dispose() {
        this.f10606b.dispose();
    }

    public boolean e() {
        return true;
    }

    public final void f(Throwable th) {
        Ib.b.b(th);
        this.f10606b.dispose();
        onError(th);
    }

    public final int g(int i10) {
        Mb.c cVar = this.f10607c;
        if (cVar == null || (i10 & 4) != 0) {
            return 0;
        }
        int iQ = cVar.q(i10);
        if (iQ != 0) {
            this.f10609e = iQ;
        }
        return iQ;
    }

    @Override // Mb.h
    public boolean isEmpty() {
        return this.f10607c.isEmpty();
    }

    @Override // Hb.c
    public boolean j() {
        return this.f10606b.j();
    }

    @Override // Mb.h
    public final boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // Eb.p
    public void onError(Throwable th) {
        if (this.f10608d) {
            AbstractC2904a.q(th);
        } else {
            this.f10608d = true;
            this.f10605a.onError(th);
        }
    }

    public void d() {
    }
}
