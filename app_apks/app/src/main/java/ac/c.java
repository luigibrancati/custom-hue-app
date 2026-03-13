package ac;

import Eb.p;
import Yb.h;
import bc.AbstractC2904a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class c implements p, Hb.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f21221a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f21222b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Hb.c f21223c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f21224d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Yb.a f21225e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile boolean f21226f;

    public c(p pVar) {
        this(pVar, false);
    }

    @Override // Eb.p
    public void a() {
        if (this.f21226f) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f21226f) {
                    return;
                }
                if (!this.f21224d) {
                    this.f21226f = true;
                    this.f21224d = true;
                    this.f21221a.a();
                } else {
                    Yb.a aVar = this.f21225e;
                    if (aVar == null) {
                        aVar = new Yb.a(4);
                        this.f21225e = aVar;
                    }
                    aVar.b(h.j());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // Eb.p
    public void b(Hb.c cVar) {
        if (Kb.c.w(this.f21223c, cVar)) {
            this.f21223c = cVar;
            this.f21221a.b(this);
        }
    }

    @Override // Eb.p
    public void c(Object obj) {
        if (this.f21226f) {
            return;
        }
        if (obj == null) {
            this.f21223c.dispose();
            onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            return;
        }
        synchronized (this) {
            try {
                if (this.f21226f) {
                    return;
                }
                if (!this.f21224d) {
                    this.f21224d = true;
                    this.f21221a.c(obj);
                    d();
                } else {
                    Yb.a aVar = this.f21225e;
                    if (aVar == null) {
                        aVar = new Yb.a(4);
                        this.f21225e = aVar;
                    }
                    aVar.b(h.w(obj));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void d() {
        Yb.a aVar;
        do {
            synchronized (this) {
                try {
                    aVar = this.f21225e;
                    if (aVar == null) {
                        this.f21224d = false;
                        return;
                    }
                    this.f21225e = null;
                } catch (Throwable th) {
                    throw th;
                }
            }
        } while (!aVar.a(this.f21221a));
    }

    @Override // Hb.c
    public void dispose() {
        this.f21223c.dispose();
    }

    @Override // Hb.c
    public boolean j() {
        return this.f21223c.j();
    }

    @Override // Eb.p
    public void onError(Throwable th) {
        if (this.f21226f) {
            AbstractC2904a.q(th);
            return;
        }
        synchronized (this) {
            try {
                boolean z10 = true;
                if (!this.f21226f) {
                    if (this.f21224d) {
                        this.f21226f = true;
                        Yb.a aVar = this.f21225e;
                        if (aVar == null) {
                            aVar = new Yb.a(4);
                            this.f21225e = aVar;
                        }
                        Object objQ = h.q(th);
                        if (this.f21222b) {
                            aVar.b(objQ);
                        } else {
                            aVar.d(objQ);
                        }
                        return;
                    }
                    this.f21226f = true;
                    this.f21224d = true;
                    z10 = false;
                }
                if (z10) {
                    AbstractC2904a.q(th);
                } else {
                    this.f21221a.onError(th);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public c(p pVar, boolean z10) {
        this.f21221a = pVar;
        this.f21222b = z10;
    }
}
