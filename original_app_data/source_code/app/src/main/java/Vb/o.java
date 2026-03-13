package Vb;

import Eb.q;
import bc.AbstractC2904a;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class o extends q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final o f17455b = new o();

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Runnable f17456a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final c f17457b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f17458c;

        public a(Runnable runnable, c cVar, long j10) {
            this.f17456a = runnable;
            this.f17457b = cVar;
            this.f17458c = j10;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f17457b.f17466d) {
                return;
            }
            long jA = this.f17457b.a(TimeUnit.MILLISECONDS);
            long j10 = this.f17458c;
            if (j10 > jA) {
                try {
                    Thread.sleep(j10 - jA);
                } catch (InterruptedException e10) {
                    Thread.currentThread().interrupt();
                    AbstractC2904a.q(e10);
                    return;
                }
            }
            if (this.f17457b.f17466d) {
                return;
            }
            this.f17456a.run();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b implements Comparable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Runnable f17459a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f17460b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f17461c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public volatile boolean f17462d;

        public b(Runnable runnable, Long l10, int i10) {
            this.f17459a = runnable;
            this.f17460b = l10.longValue();
            this.f17461c = i10;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(b bVar) {
            int iB = Lb.b.b(this.f17460b, bVar.f17460b);
            return iB == 0 ? Lb.b.a(this.f17461c, bVar.f17461c) : iB;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class c extends q.c implements Hb.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PriorityBlockingQueue f17463a = new PriorityBlockingQueue();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AtomicInteger f17464b = new AtomicInteger();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final AtomicInteger f17465c = new AtomicInteger();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public volatile boolean f17466d;

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public final class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final b f17467a;

            public a(b bVar) {
                this.f17467a = bVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f17467a.f17462d = true;
                c.this.f17463a.remove(this.f17467a);
            }
        }

        @Override // Eb.q.c
        public Hb.c b(Runnable runnable) {
            return e(runnable, a(TimeUnit.MILLISECONDS));
        }

        @Override // Eb.q.c
        public Hb.c c(Runnable runnable, long j10, TimeUnit timeUnit) {
            long jA = a(TimeUnit.MILLISECONDS) + timeUnit.toMillis(j10);
            return e(new a(runnable, this, jA), jA);
        }

        @Override // Hb.c
        public void dispose() {
            this.f17466d = true;
        }

        public Hb.c e(Runnable runnable, long j10) {
            if (this.f17466d) {
                return Kb.d.INSTANCE;
            }
            b bVar = new b(runnable, Long.valueOf(j10), this.f17465c.incrementAndGet());
            this.f17463a.add(bVar);
            if (this.f17464b.getAndIncrement() != 0) {
                return Hb.d.d(new a(bVar));
            }
            int iAddAndGet = 1;
            while (!this.f17466d) {
                b bVar2 = (b) this.f17463a.poll();
                if (bVar2 == null) {
                    iAddAndGet = this.f17464b.addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return Kb.d.INSTANCE;
                    }
                } else if (!bVar2.f17462d) {
                    bVar2.f17459a.run();
                }
            }
            this.f17463a.clear();
            return Kb.d.INSTANCE;
        }

        @Override // Hb.c
        public boolean j() {
            return this.f17466d;
        }
    }

    public static o g() {
        return f17455b;
    }

    @Override // Eb.q
    public q.c a() {
        return new c();
    }

    @Override // Eb.q
    public Hb.c c(Runnable runnable) {
        AbstractC2904a.r(runnable).run();
        return Kb.d.INSTANCE;
    }

    @Override // Eb.q
    public Hb.c d(Runnable runnable, long j10, TimeUnit timeUnit) {
        try {
            timeUnit.sleep(j10);
            AbstractC2904a.r(runnable).run();
        } catch (InterruptedException e10) {
            Thread.currentThread().interrupt();
            AbstractC2904a.q(e10);
        }
        return Kb.d.INSTANCE;
    }
}
