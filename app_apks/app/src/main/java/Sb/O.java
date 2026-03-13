package Sb;

import bc.AbstractC2904a;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class O extends Eb.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Zb.a f15521a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f15522b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f15523c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TimeUnit f15524d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Eb.q f15525e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public a f15526f;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends AtomicReference implements Runnable, Jb.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final O f15527a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Hb.c f15528b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f15529c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f15530d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f15531e;

        public a(O o10) {
            this.f15527a = o10;
        }

        @Override // Jb.d
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(Hb.c cVar) {
            Kb.c.p(this, cVar);
            synchronized (this.f15527a) {
                try {
                    if (this.f15531e) {
                        ((Kb.f) this.f15527a.f15521a).d(cVar);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f15527a.S0(this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends AtomicBoolean implements Eb.p, Hb.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Eb.p f15532a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final O f15533b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final a f15534c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Hb.c f15535d;

        public b(Eb.p pVar, O o10, a aVar) {
            this.f15532a = pVar;
            this.f15533b = o10;
            this.f15534c = aVar;
        }

        @Override // Eb.p
        public void a() {
            if (compareAndSet(false, true)) {
                this.f15533b.R0(this.f15534c);
                this.f15532a.a();
            }
        }

        @Override // Eb.p
        public void b(Hb.c cVar) {
            if (Kb.c.w(this.f15535d, cVar)) {
                this.f15535d = cVar;
                this.f15532a.b(this);
            }
        }

        @Override // Eb.p
        public void c(Object obj) {
            this.f15532a.c(obj);
        }

        @Override // Hb.c
        public void dispose() {
            this.f15535d.dispose();
            if (compareAndSet(false, true)) {
                this.f15533b.O0(this.f15534c);
            }
        }

        @Override // Hb.c
        public boolean j() {
            return this.f15535d.j();
        }

        @Override // Eb.p
        public void onError(Throwable th) {
            if (!compareAndSet(false, true)) {
                AbstractC2904a.q(th);
            } else {
                this.f15533b.R0(this.f15534c);
                this.f15532a.onError(th);
            }
        }
    }

    public O(Zb.a aVar) {
        this(aVar, 1, 0L, TimeUnit.NANOSECONDS, null);
    }

    public void O0(a aVar) {
        synchronized (this) {
            try {
                a aVar2 = this.f15526f;
                if (aVar2 != null && aVar2 == aVar) {
                    long j10 = aVar.f15529c - 1;
                    aVar.f15529c = j10;
                    if (j10 == 0 && aVar.f15530d) {
                        if (this.f15523c == 0) {
                            S0(aVar);
                            return;
                        }
                        Kb.g gVar = new Kb.g();
                        aVar.f15528b = gVar;
                        gVar.a(this.f15525e.d(aVar, this.f15523c, this.f15524d));
                    }
                }
            } finally {
            }
        }
    }

    public void P0(a aVar) {
        Hb.c cVar = aVar.f15528b;
        if (cVar != null) {
            cVar.dispose();
            aVar.f15528b = null;
        }
    }

    public void Q0(a aVar) {
        Object obj = this.f15521a;
        if (obj instanceof Hb.c) {
            ((Hb.c) obj).dispose();
        } else if (obj instanceof Kb.f) {
            ((Kb.f) obj).d((Hb.c) aVar.get());
        }
    }

    public void R0(a aVar) {
        synchronized (this) {
            try {
                if (this.f15521a instanceof M) {
                    a aVar2 = this.f15526f;
                    if (aVar2 != null && aVar2 == aVar) {
                        this.f15526f = null;
                        P0(aVar);
                    }
                    long j10 = aVar.f15529c - 1;
                    aVar.f15529c = j10;
                    if (j10 == 0) {
                        Q0(aVar);
                    }
                } else {
                    a aVar3 = this.f15526f;
                    if (aVar3 != null && aVar3 == aVar) {
                        P0(aVar);
                        long j11 = aVar.f15529c - 1;
                        aVar.f15529c = j11;
                        if (j11 == 0) {
                            this.f15526f = null;
                            Q0(aVar);
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void S0(a aVar) {
        synchronized (this) {
            try {
                if (aVar.f15529c == 0 && aVar == this.f15526f) {
                    this.f15526f = null;
                    Hb.c cVar = (Hb.c) aVar.get();
                    Kb.c.a(aVar);
                    Object obj = this.f15521a;
                    if (obj instanceof Hb.c) {
                        ((Hb.c) obj).dispose();
                    } else if (obj instanceof Kb.f) {
                        if (cVar == null) {
                            aVar.f15531e = true;
                        } else {
                            ((Kb.f) obj).d(cVar);
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // Eb.k
    public void v0(Eb.p pVar) {
        a aVar;
        boolean z10;
        Hb.c cVar;
        synchronized (this) {
            try {
                aVar = this.f15526f;
                if (aVar == null) {
                    aVar = new a(this);
                    this.f15526f = aVar;
                }
                long j10 = aVar.f15529c;
                if (j10 == 0 && (cVar = aVar.f15528b) != null) {
                    cVar.dispose();
                }
                long j11 = j10 + 1;
                aVar.f15529c = j11;
                if (aVar.f15530d || j11 != this.f15522b) {
                    z10 = false;
                } else {
                    z10 = true;
                    aVar.f15530d = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f15521a.f(new b(pVar, this, aVar));
        if (z10) {
            this.f15521a.Q0(aVar);
        }
    }

    public O(Zb.a aVar, int i10, long j10, TimeUnit timeUnit, Eb.q qVar) {
        this.f15521a = aVar;
        this.f15522b = i10;
        this.f15523c = j10;
        this.f15524d = timeUnit;
        this.f15525e = qVar;
    }
}
