package Eb;

import bc.AbstractC2904a;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f3379a = TimeUnit.MINUTES.toNanos(Long.getLong("rx2.scheduler.drift-tolerance", 15).longValue());

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a implements Hb.c, Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Runnable f3380a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final c f3381b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Thread f3382c;

        public a(Runnable runnable, c cVar) {
            this.f3380a = runnable;
            this.f3381b = cVar;
        }

        @Override // Hb.c
        public void dispose() {
            if (this.f3382c == Thread.currentThread()) {
                c cVar = this.f3381b;
                if (cVar instanceof Vb.h) {
                    ((Vb.h) cVar).h();
                    return;
                }
            }
            this.f3381b.dispose();
        }

        @Override // Hb.c
        public boolean j() {
            return this.f3381b.j();
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f3382c = Thread.currentThread();
            try {
                this.f3380a.run();
            } finally {
                dispose();
                this.f3382c = null;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b implements Hb.c, Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Runnable f3383a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final c f3384b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public volatile boolean f3385c;

        public b(Runnable runnable, c cVar) {
            this.f3383a = runnable;
            this.f3384b = cVar;
        }

        @Override // Hb.c
        public void dispose() {
            this.f3385c = true;
            this.f3384b.dispose();
        }

        @Override // Hb.c
        public boolean j() {
            return this.f3385c;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f3385c) {
                return;
            }
            try {
                this.f3383a.run();
            } catch (Throwable th) {
                Ib.b.b(th);
                this.f3384b.dispose();
                throw Yb.f.d(th);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static abstract class c implements Hb.c {

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public final class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Runnable f3386a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Kb.g f3387b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final long f3388c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public long f3389d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public long f3390e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public long f3391f;

            public a(long j10, Runnable runnable, long j11, Kb.g gVar, long j12) {
                this.f3386a = runnable;
                this.f3387b = gVar;
                this.f3388c = j12;
                this.f3390e = j11;
                this.f3391f = j10;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0034  */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public void run() {
                /*
                    r12 = this;
                    java.lang.Runnable r0 = r12.f3386a
                    r0.run()
                    Kb.g r0 = r12.f3387b
                    boolean r0 = r0.j()
                    if (r0 != 0) goto L51
                    Eb.q$c r0 = Eb.q.c.this
                    java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.NANOSECONDS
                    long r2 = r0.a(r1)
                    long r4 = Eb.q.f3379a
                    long r6 = r2 + r4
                    long r8 = r12.f3390e
                    int r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
                    r6 = 1
                    if (r0 < 0) goto L34
                    long r10 = r12.f3388c
                    long r8 = r8 + r10
                    long r8 = r8 + r4
                    int r0 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
                    if (r0 < 0) goto L2a
                    goto L34
                L2a:
                    long r4 = r12.f3391f
                    long r8 = r12.f3389d
                    long r8 = r8 + r6
                    r12.f3389d = r8
                    long r8 = r8 * r10
                    long r4 = r4 + r8
                    goto L43
                L34:
                    long r4 = r12.f3388c
                    long r8 = r2 + r4
                    long r10 = r12.f3389d
                    long r10 = r10 + r6
                    r12.f3389d = r10
                    long r4 = r4 * r10
                    long r4 = r8 - r4
                    r12.f3391f = r4
                    r4 = r8
                L43:
                    r12.f3390e = r2
                    long r4 = r4 - r2
                    Kb.g r0 = r12.f3387b
                    Eb.q$c r2 = Eb.q.c.this
                    Hb.c r12 = r2.c(r12, r4, r1)
                    r0.a(r12)
                L51:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: Eb.q.c.a.run():void");
            }
        }

        public long a(TimeUnit timeUnit) {
            return timeUnit.convert(System.currentTimeMillis(), TimeUnit.MILLISECONDS);
        }

        public Hb.c b(Runnable runnable) {
            return c(runnable, 0L, TimeUnit.NANOSECONDS);
        }

        public abstract Hb.c c(Runnable runnable, long j10, TimeUnit timeUnit);

        public Hb.c d(Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
            Kb.g gVar = new Kb.g();
            Kb.g gVar2 = new Kb.g(gVar);
            Runnable runnableR = AbstractC2904a.r(runnable);
            long nanos = timeUnit.toNanos(j11);
            long jA = a(TimeUnit.NANOSECONDS);
            Hb.c cVarC = c(new a(jA + timeUnit.toNanos(j10), runnableR, jA, gVar2, nanos), j10, timeUnit);
            if (cVarC == Kb.d.INSTANCE) {
                return cVarC;
            }
            gVar.a(cVarC);
            return gVar2;
        }
    }

    public abstract c a();

    public long b(TimeUnit timeUnit) {
        return timeUnit.convert(System.currentTimeMillis(), TimeUnit.MILLISECONDS);
    }

    public Hb.c c(Runnable runnable) {
        return d(runnable, 0L, TimeUnit.NANOSECONDS);
    }

    public Hb.c d(Runnable runnable, long j10, TimeUnit timeUnit) {
        c cVarA = a();
        a aVar = new a(AbstractC2904a.r(runnable), cVarA);
        cVarA.c(aVar, j10, timeUnit);
        return aVar;
    }

    public Hb.c e(Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
        c cVarA = a();
        b bVar = new b(AbstractC2904a.r(runnable), cVarA);
        Hb.c cVarD = cVarA.d(bVar, j10, j11, timeUnit);
        return cVarD == Kb.d.INSTANCE ? cVarD : bVar;
    }

    public void f() {
    }
}
