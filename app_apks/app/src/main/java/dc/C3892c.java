package dc;

import Eb.p;
import Yb.a;
import Yb.h;
import bc.AbstractC2904a;

/* JADX INFO: renamed from: dc.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class C3892c extends d implements a.InterfaceC0251a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f33338a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f33339b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Yb.a f33340c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile boolean f33341d;

    public C3892c(d dVar) {
        this.f33338a = dVar;
    }

    public void P0() {
        Yb.a aVar;
        while (true) {
            synchronized (this) {
                try {
                    aVar = this.f33340c;
                    if (aVar == null) {
                        this.f33339b = false;
                        return;
                    }
                    this.f33340c = null;
                } catch (Throwable th) {
                    throw th;
                }
            }
            aVar.c(this);
        }
    }

    @Override // Eb.p
    public void a() {
        if (this.f33341d) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f33341d) {
                    return;
                }
                this.f33341d = true;
                if (!this.f33339b) {
                    this.f33339b = true;
                    this.f33338a.a();
                    return;
                }
                Yb.a aVar = this.f33340c;
                if (aVar == null) {
                    aVar = new Yb.a(4);
                    this.f33340c = aVar;
                }
                aVar.b(h.j());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // Eb.p
    public void b(Hb.c cVar) {
        boolean z10 = true;
        if (!this.f33341d) {
            synchronized (this) {
                try {
                    if (!this.f33341d) {
                        if (this.f33339b) {
                            Yb.a aVar = this.f33340c;
                            if (aVar == null) {
                                aVar = new Yb.a(4);
                                this.f33340c = aVar;
                            }
                            aVar.b(h.p(cVar));
                            return;
                        }
                        this.f33339b = true;
                        z10 = false;
                    }
                } finally {
                }
            }
        }
        if (z10) {
            cVar.dispose();
        } else {
            this.f33338a.b(cVar);
            P0();
        }
    }

    @Override // Eb.p
    public void c(Object obj) {
        if (this.f33341d) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f33341d) {
                    return;
                }
                if (!this.f33339b) {
                    this.f33339b = true;
                    this.f33338a.c(obj);
                    P0();
                } else {
                    Yb.a aVar = this.f33340c;
                    if (aVar == null) {
                        aVar = new Yb.a(4);
                        this.f33340c = aVar;
                    }
                    aVar.b(h.w(obj));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // Eb.p
    public void onError(Throwable th) {
        if (this.f33341d) {
            AbstractC2904a.q(th);
            return;
        }
        synchronized (this) {
            try {
                boolean z10 = true;
                if (!this.f33341d) {
                    this.f33341d = true;
                    if (this.f33339b) {
                        Yb.a aVar = this.f33340c;
                        if (aVar == null) {
                            aVar = new Yb.a(4);
                            this.f33340c = aVar;
                        }
                        aVar.d(h.q(th));
                        return;
                    }
                    this.f33339b = true;
                    z10 = false;
                }
                if (z10) {
                    AbstractC2904a.q(th);
                } else {
                    this.f33338a.onError(th);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // Yb.a.InterfaceC0251a, Jb.g
    public boolean test(Object obj) {
        return h.b(obj, this.f33338a);
    }

    @Override // Eb.k
    public void v0(p pVar) {
        this.f33338a.f(pVar);
    }
}
