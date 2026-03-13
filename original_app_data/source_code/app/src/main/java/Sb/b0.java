package Sb;

import bc.AbstractC2904a;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class b0 extends AbstractC2200a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Eb.n f15639b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Jb.e f15640c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Eb.n f15641d;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends AtomicReference implements Eb.p, Hb.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f15642a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f15643b;

        public a(long j10, d dVar) {
            this.f15643b = j10;
            this.f15642a = dVar;
        }

        @Override // Eb.p
        public void a() {
            Object obj = get();
            Kb.c cVar = Kb.c.DISPOSED;
            if (obj != cVar) {
                lazySet(cVar);
                this.f15642a.e(this.f15643b);
            }
        }

        @Override // Eb.p
        public void b(Hb.c cVar) {
            Kb.c.u(this, cVar);
        }

        @Override // Eb.p
        public void c(Object obj) {
            Hb.c cVar = (Hb.c) get();
            Kb.c cVar2 = Kb.c.DISPOSED;
            if (cVar != cVar2) {
                cVar.dispose();
                lazySet(cVar2);
                this.f15642a.e(this.f15643b);
            }
        }

        @Override // Hb.c
        public void dispose() {
            Kb.c.a(this);
        }

        @Override // Hb.c
        public boolean j() {
            return Kb.c.b((Hb.c) get());
        }

        @Override // Eb.p
        public void onError(Throwable th) {
            Object obj = get();
            Kb.c cVar = Kb.c.DISPOSED;
            if (obj == cVar) {
                AbstractC2904a.q(th);
            } else {
                lazySet(cVar);
                this.f15642a.d(this.f15643b, th);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends AtomicReference implements Eb.p, Hb.c, d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Eb.p f15644a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Jb.e f15645b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Kb.g f15646c = new Kb.g();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final AtomicLong f15647d = new AtomicLong();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final AtomicReference f15648e = new AtomicReference();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Eb.n f15649f;

        public b(Eb.p pVar, Jb.e eVar, Eb.n nVar) {
            this.f15644a = pVar;
            this.f15645b = eVar;
            this.f15649f = nVar;
        }

        @Override // Eb.p
        public void a() {
            if (this.f15647d.getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.f15646c.dispose();
                this.f15644a.a();
                this.f15646c.dispose();
            }
        }

        @Override // Eb.p
        public void b(Hb.c cVar) {
            Kb.c.u(this.f15648e, cVar);
        }

        @Override // Eb.p
        public void c(Object obj) {
            long j10 = this.f15647d.get();
            if (j10 != Long.MAX_VALUE) {
                long j11 = 1 + j10;
                if (this.f15647d.compareAndSet(j10, j11)) {
                    Hb.c cVar = (Hb.c) this.f15646c.get();
                    if (cVar != null) {
                        cVar.dispose();
                    }
                    this.f15644a.c(obj);
                    try {
                        Eb.n nVar = (Eb.n) Lb.b.e(this.f15645b.apply(obj), "The itemTimeoutIndicator returned a null ObservableSource.");
                        a aVar = new a(j11, this);
                        if (this.f15646c.a(aVar)) {
                            nVar.f(aVar);
                        }
                    } catch (Throwable th) {
                        Ib.b.b(th);
                        ((Hb.c) this.f15648e.get()).dispose();
                        this.f15647d.getAndSet(Long.MAX_VALUE);
                        this.f15644a.onError(th);
                    }
                }
            }
        }

        @Override // Sb.b0.d
        public void d(long j10, Throwable th) {
            if (!this.f15647d.compareAndSet(j10, Long.MAX_VALUE)) {
                AbstractC2904a.q(th);
            } else {
                Kb.c.a(this);
                this.f15644a.onError(th);
            }
        }

        @Override // Hb.c
        public void dispose() {
            Kb.c.a(this.f15648e);
            Kb.c.a(this);
            this.f15646c.dispose();
        }

        @Override // Sb.d0
        public void e(long j10) {
            if (this.f15647d.compareAndSet(j10, Long.MAX_VALUE)) {
                Kb.c.a(this.f15648e);
                Eb.n nVar = this.f15649f;
                this.f15649f = null;
                nVar.f(new c0(this.f15644a, this));
            }
        }

        public void f(Eb.n nVar) {
            if (nVar != null) {
                a aVar = new a(0L, this);
                if (this.f15646c.a(aVar)) {
                    nVar.f(aVar);
                }
            }
        }

        @Override // Hb.c
        public boolean j() {
            return Kb.c.b((Hb.c) get());
        }

        @Override // Eb.p
        public void onError(Throwable th) {
            if (this.f15647d.getAndSet(Long.MAX_VALUE) == Long.MAX_VALUE) {
                AbstractC2904a.q(th);
                return;
            }
            this.f15646c.dispose();
            this.f15644a.onError(th);
            this.f15646c.dispose();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class c extends AtomicLong implements Eb.p, Hb.c, d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Eb.p f15650a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Jb.e f15651b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Kb.g f15652c = new Kb.g();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final AtomicReference f15653d = new AtomicReference();

        public c(Eb.p pVar, Jb.e eVar) {
            this.f15650a = pVar;
            this.f15651b = eVar;
        }

        @Override // Eb.p
        public void a() {
            if (getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.f15652c.dispose();
                this.f15650a.a();
            }
        }

        @Override // Eb.p
        public void b(Hb.c cVar) {
            Kb.c.u(this.f15653d, cVar);
        }

        @Override // Eb.p
        public void c(Object obj) {
            long j10 = get();
            if (j10 != Long.MAX_VALUE) {
                long j11 = 1 + j10;
                if (compareAndSet(j10, j11)) {
                    Hb.c cVar = (Hb.c) this.f15652c.get();
                    if (cVar != null) {
                        cVar.dispose();
                    }
                    this.f15650a.c(obj);
                    try {
                        Eb.n nVar = (Eb.n) Lb.b.e(this.f15651b.apply(obj), "The itemTimeoutIndicator returned a null ObservableSource.");
                        a aVar = new a(j11, this);
                        if (this.f15652c.a(aVar)) {
                            nVar.f(aVar);
                        }
                    } catch (Throwable th) {
                        Ib.b.b(th);
                        ((Hb.c) this.f15653d.get()).dispose();
                        getAndSet(Long.MAX_VALUE);
                        this.f15650a.onError(th);
                    }
                }
            }
        }

        @Override // Sb.b0.d
        public void d(long j10, Throwable th) {
            if (!compareAndSet(j10, Long.MAX_VALUE)) {
                AbstractC2904a.q(th);
            } else {
                Kb.c.a(this.f15653d);
                this.f15650a.onError(th);
            }
        }

        @Override // Hb.c
        public void dispose() {
            Kb.c.a(this.f15653d);
            this.f15652c.dispose();
        }

        @Override // Sb.d0
        public void e(long j10) {
            if (compareAndSet(j10, Long.MAX_VALUE)) {
                Kb.c.a(this.f15653d);
                this.f15650a.onError(new TimeoutException());
            }
        }

        public void f(Eb.n nVar) {
            if (nVar != null) {
                a aVar = new a(0L, this);
                if (this.f15652c.a(aVar)) {
                    nVar.f(aVar);
                }
            }
        }

        @Override // Hb.c
        public boolean j() {
            return Kb.c.b((Hb.c) this.f15653d.get());
        }

        @Override // Eb.p
        public void onError(Throwable th) {
            if (getAndSet(Long.MAX_VALUE) == Long.MAX_VALUE) {
                AbstractC2904a.q(th);
            } else {
                this.f15652c.dispose();
                this.f15650a.onError(th);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface d extends d0 {
        void d(long j10, Throwable th);
    }

    public b0(Eb.k kVar, Eb.n nVar, Jb.e eVar, Eb.n nVar2) {
        super(kVar);
        this.f15639b = nVar;
        this.f15640c = eVar;
        this.f15641d = nVar2;
    }

    @Override // Eb.k
    public void v0(Eb.p pVar) {
        if (this.f15641d == null) {
            c cVar = new c(pVar, this.f15640c);
            pVar.b(cVar);
            cVar.f(this.f15639b);
            this.f15624a.f(cVar);
            return;
        }
        b bVar = new b(pVar, this.f15640c, this.f15641d);
        pVar.b(bVar);
        bVar.f(this.f15639b);
        this.f15624a.f(bVar);
    }
}
