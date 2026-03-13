package dc;

import Eb.p;
import Mb.h;
import bc.AbstractC2904a;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class e extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Ub.c f33342a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicReference f33344c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f33345d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile boolean f33346e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile boolean f33347f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Throwable f33348g;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f33351j;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicReference f33343b = new AtomicReference();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AtomicBoolean f33349h = new AtomicBoolean();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Nb.b f33350i = new a();

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public final class a extends Nb.b {
        public a() {
        }

        @Override // Mb.h
        public void clear() {
            e.this.f33342a.clear();
        }

        @Override // Hb.c
        public void dispose() {
            if (e.this.f33346e) {
                return;
            }
            e.this.f33346e = true;
            e.this.Q0();
            e.this.f33343b.lazySet(null);
            if (e.this.f33350i.getAndIncrement() == 0) {
                e.this.f33343b.lazySet(null);
                e eVar = e.this;
                if (eVar.f33351j) {
                    return;
                }
                eVar.f33342a.clear();
            }
        }

        @Override // Mb.h
        public boolean isEmpty() {
            return e.this.f33342a.isEmpty();
        }

        @Override // Hb.c
        public boolean j() {
            return e.this.f33346e;
        }

        @Override // Mb.h
        public Object poll() {
            return e.this.f33342a.poll();
        }

        @Override // Mb.d
        public int q(int i10) {
            if ((i10 & 2) == 0) {
                return 0;
            }
            e.this.f33351j = true;
            return 2;
        }
    }

    public e(int i10, Runnable runnable, boolean z10) {
        this.f33342a = new Ub.c(Lb.b.f(i10, "capacityHint"));
        this.f33344c = new AtomicReference(Lb.b.e(runnable, "onTerminate"));
        this.f33345d = z10;
    }

    public static e P0(int i10, Runnable runnable) {
        return new e(i10, runnable, true);
    }

    public void Q0() {
        Runnable runnable = (Runnable) this.f33344c.get();
        if (runnable == null || !T1.e.a(this.f33344c, runnable, null)) {
            return;
        }
        runnable.run();
    }

    public void R0() {
        if (this.f33350i.getAndIncrement() != 0) {
            return;
        }
        p pVar = (p) this.f33343b.get();
        int iAddAndGet = 1;
        while (pVar == null) {
            iAddAndGet = this.f33350i.addAndGet(-iAddAndGet);
            if (iAddAndGet == 0) {
                return;
            } else {
                pVar = (p) this.f33343b.get();
            }
        }
        if (this.f33351j) {
            S0(pVar);
        } else {
            T0(pVar);
        }
    }

    public void S0(p pVar) {
        Ub.c cVar = this.f33342a;
        boolean z10 = this.f33345d;
        int iAddAndGet = 1;
        while (!this.f33346e) {
            boolean z11 = this.f33347f;
            if (!z10 && z11 && V0(cVar, pVar)) {
                return;
            }
            pVar.c(null);
            if (z11) {
                U0(pVar);
                return;
            } else {
                iAddAndGet = this.f33350i.addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }
        this.f33343b.lazySet(null);
    }

    public void T0(p pVar) {
        Ub.c cVar = this.f33342a;
        boolean z10 = this.f33345d;
        boolean z11 = true;
        int iAddAndGet = 1;
        while (!this.f33346e) {
            boolean z12 = this.f33347f;
            Object objPoll = this.f33342a.poll();
            boolean z13 = objPoll == null;
            if (z12) {
                if (!z10 && z11) {
                    if (V0(cVar, pVar)) {
                        return;
                    } else {
                        z11 = false;
                    }
                }
                if (z13) {
                    U0(pVar);
                    return;
                }
            }
            if (z13) {
                iAddAndGet = this.f33350i.addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            } else {
                pVar.c(objPoll);
            }
        }
        this.f33343b.lazySet(null);
        cVar.clear();
    }

    public void U0(p pVar) {
        this.f33343b.lazySet(null);
        Throwable th = this.f33348g;
        if (th != null) {
            pVar.onError(th);
        } else {
            pVar.a();
        }
    }

    public boolean V0(h hVar, p pVar) {
        Throwable th = this.f33348g;
        if (th == null) {
            return false;
        }
        this.f33343b.lazySet(null);
        hVar.clear();
        pVar.onError(th);
        return true;
    }

    @Override // Eb.p
    public void a() {
        if (this.f33347f || this.f33346e) {
            return;
        }
        this.f33347f = true;
        Q0();
        R0();
    }

    @Override // Eb.p
    public void b(Hb.c cVar) {
        if (this.f33347f || this.f33346e) {
            cVar.dispose();
        }
    }

    @Override // Eb.p
    public void c(Object obj) {
        Lb.b.e(obj, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.f33347f || this.f33346e) {
            return;
        }
        this.f33342a.offer(obj);
        R0();
    }

    @Override // Eb.p
    public void onError(Throwable th) {
        Lb.b.e(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.f33347f || this.f33346e) {
            AbstractC2904a.q(th);
            return;
        }
        this.f33348g = th;
        this.f33347f = true;
        Q0();
        R0();
    }

    @Override // Eb.k
    public void v0(p pVar) {
        if (this.f33349h.get() || !this.f33349h.compareAndSet(false, true)) {
            Kb.d.p(new IllegalStateException("Only a single observer allowed."), pVar);
            return;
        }
        pVar.b(this.f33350i);
        this.f33343b.lazySet(pVar);
        if (this.f33346e) {
            this.f33343b.lazySet(null);
        } else {
            R0();
        }
    }
}
