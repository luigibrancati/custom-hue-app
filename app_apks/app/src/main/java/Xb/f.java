package Xb;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class f extends AtomicInteger implements Ze.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Ze.c f19447a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f19448b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicReference f19449c = new AtomicReference();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicLong f19450d = new AtomicLong();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicLong f19451e = new AtomicLong();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f19452f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile boolean f19453g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f19454h;

    public f(boolean z10) {
        this.f19452f = z10;
    }

    public final void a() {
        if (getAndIncrement() != 0) {
            return;
        }
        b();
    }

    public final void b() {
        int iAddAndGet = 1;
        long jB = 0;
        Ze.c cVar = null;
        do {
            Ze.c cVar2 = (Ze.c) this.f19449c.get();
            if (cVar2 != null) {
                cVar2 = (Ze.c) this.f19449c.getAndSet(null);
            }
            long andSet = this.f19450d.get();
            if (andSet != 0) {
                andSet = this.f19450d.getAndSet(0L);
            }
            long andSet2 = this.f19451e.get();
            if (andSet2 != 0) {
                andSet2 = this.f19451e.getAndSet(0L);
            }
            Ze.c cVar3 = this.f19447a;
            if (this.f19453g) {
                if (cVar3 != null) {
                    cVar3.cancel();
                    this.f19447a = null;
                }
                if (cVar2 != null) {
                    cVar2.cancel();
                }
            } else {
                long jB2 = this.f19448b;
                if (jB2 != Long.MAX_VALUE) {
                    jB2 = Yb.c.b(jB2, andSet);
                    if (jB2 != Long.MAX_VALUE) {
                        jB2 -= andSet2;
                        if (jB2 < 0) {
                            g.q(jB2);
                            jB2 = 0;
                        }
                    }
                    this.f19448b = jB2;
                }
                if (cVar2 != null) {
                    if (cVar3 != null && this.f19452f) {
                        cVar3.cancel();
                    }
                    this.f19447a = cVar2;
                    if (jB2 != 0) {
                        jB = Yb.c.b(jB, jB2);
                        cVar = cVar2;
                    }
                } else if (cVar3 != null && andSet != 0) {
                    jB = Yb.c.b(jB, andSet);
                    cVar = cVar3;
                }
            }
            iAddAndGet = addAndGet(-iAddAndGet);
        } while (iAddAndGet != 0);
        if (jB != 0) {
            cVar.p(jB);
        }
    }

    public final boolean c() {
        return this.f19453g;
    }

    @Override // Ze.c
    public void cancel() {
        if (this.f19453g) {
            return;
        }
        this.f19453g = true;
        a();
    }

    public final void d(long j10) {
        if (this.f19454h) {
            return;
        }
        if (get() != 0 || !compareAndSet(0, 1)) {
            Yb.c.a(this.f19451e, j10);
            a();
            return;
        }
        long j11 = this.f19448b;
        if (j11 != Long.MAX_VALUE) {
            long j12 = j11 - j10;
            if (j12 < 0) {
                g.q(j12);
                j12 = 0;
            }
            this.f19448b = j12;
        }
        if (decrementAndGet() == 0) {
            return;
        }
        b();
    }

    public final void e(Ze.c cVar) {
        if (this.f19453g) {
            cVar.cancel();
            return;
        }
        Lb.b.e(cVar, "s is null");
        if (get() != 0 || !compareAndSet(0, 1)) {
            Ze.c cVar2 = (Ze.c) this.f19449c.getAndSet(cVar);
            if (cVar2 != null && this.f19452f) {
                cVar2.cancel();
            }
            a();
            return;
        }
        Ze.c cVar3 = this.f19447a;
        if (cVar3 != null && this.f19452f) {
            cVar3.cancel();
        }
        this.f19447a = cVar;
        long j10 = this.f19448b;
        if (decrementAndGet() != 0) {
            b();
        }
        if (j10 != 0) {
            cVar.p(j10);
        }
    }

    @Override // Ze.c
    public final void p(long j10) {
        if (!g.v(j10) || this.f19454h) {
            return;
        }
        if (get() != 0 || !compareAndSet(0, 1)) {
            Yb.c.a(this.f19450d, j10);
            a();
            return;
        }
        long j11 = this.f19448b;
        if (j11 != Long.MAX_VALUE) {
            long jB = Yb.c.b(j11, j10);
            this.f19448b = jB;
            if (jB == Long.MAX_VALUE) {
                this.f19454h = true;
            }
        }
        Ze.c cVar = this.f19447a;
        if (decrementAndGet() != 0) {
            b();
        }
        if (cVar != null) {
            cVar.p(j10);
        }
    }
}
