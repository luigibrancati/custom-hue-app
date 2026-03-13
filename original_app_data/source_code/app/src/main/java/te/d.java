package te;

import fc.C4015H;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import qe.m;
import qe.p;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class d {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final b f44938k = new b(null);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final Logger f44939l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final d f44940m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f44941a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Logger f44942b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ReentrantLock f44943c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Condition f44944d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f44945e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f44946f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f44947g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f44948h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final List f44949i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Runnable f44950j;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface a {
        void a(d dVar);

        long b();

        BlockingQueue c(BlockingQueue blockingQueue);

        void d(d dVar, long j10);

        void e(d dVar, Runnable runnable);
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b {
        public /* synthetic */ b(AbstractC4854k abstractC4854k) {
            this();
        }

        public b() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class c implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ThreadPoolExecutor f44951a;

        public c(ThreadFactory threadFactory) {
            AbstractC4862t.e(threadFactory, "threadFactory");
            this.f44951a = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), threadFactory);
        }

        @Override // te.d.a
        public void a(d taskRunner) {
            AbstractC4862t.e(taskRunner, "taskRunner");
            taskRunner.g().signal();
        }

        @Override // te.d.a
        public long b() {
            return System.nanoTime();
        }

        @Override // te.d.a
        public BlockingQueue c(BlockingQueue queue) {
            AbstractC4862t.e(queue, "queue");
            return queue;
        }

        @Override // te.d.a
        public void d(d taskRunner, long j10) throws InterruptedException {
            AbstractC4862t.e(taskRunner, "taskRunner");
            ReentrantLock reentrantLockH = taskRunner.h();
            if (!p.f43482e || reentrantLockH.isHeldByCurrentThread()) {
                if (j10 > 0) {
                    taskRunner.g().awaitNanos(j10);
                }
            } else {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + reentrantLockH);
            }
        }

        @Override // te.d.a
        public void e(d taskRunner, Runnable runnable) {
            AbstractC4862t.e(taskRunner, "taskRunner");
            AbstractC4862t.e(runnable, "runnable");
            this.f44951a.execute(runnable);
        }
    }

    /* JADX INFO: renamed from: te.d$d, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class RunnableC0610d implements Runnable {
        public RunnableC0610d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            long jB;
            while (true) {
                ReentrantLock reentrantLockH = d.this.h();
                d dVar = d.this;
                reentrantLockH.lock();
                try {
                    AbstractC5884a abstractC5884aC = dVar.c();
                    if (abstractC5884aC == null) {
                        return;
                    }
                    Logger loggerI = d.this.i();
                    te.c cVarD = abstractC5884aC.d();
                    AbstractC4862t.b(cVarD);
                    d dVar2 = d.this;
                    boolean zIsLoggable = loggerI.isLoggable(Level.FINE);
                    if (zIsLoggable) {
                        jB = cVarD.j().f().b();
                        AbstractC5885b.c(loggerI, abstractC5884aC, cVarD, "starting");
                    } else {
                        jB = -1;
                    }
                    try {
                        try {
                            dVar2.l(abstractC5884aC);
                            C4015H c4015h = C4015H.f34254a;
                            if (zIsLoggable) {
                                AbstractC5885b.c(loggerI, abstractC5884aC, cVarD, "finished run in " + AbstractC5885b.b(cVarD.j().f().b() - jB));
                            }
                        } catch (Throwable th) {
                            dVar2.h().lock();
                            try {
                                dVar2.f().e(dVar2, this);
                                C4015H c4015h2 = C4015H.f34254a;
                                throw th;
                            } finally {
                            }
                        }
                    } catch (Throwable th2) {
                        if (zIsLoggable) {
                            AbstractC5885b.c(loggerI, abstractC5884aC, cVarD, "failed a run in " + AbstractC5885b.b(cVarD.j().f().b() - jB));
                        }
                        throw th2;
                    }
                } finally {
                }
            }
        }
    }

    static {
        Logger logger = Logger.getLogger(d.class.getName());
        AbstractC4862t.d(logger, "getLogger(...)");
        f44939l = logger;
        f44940m = new d(new c(p.m(p.f43483f + " TaskRunner", true)), 0 == true ? 1 : 0, 2, 0 == true ? 1 : 0);
    }

    public d(a backend, Logger logger) {
        AbstractC4862t.e(backend, "backend");
        AbstractC4862t.e(logger, "logger");
        this.f44941a = backend;
        this.f44942b = logger;
        ReentrantLock reentrantLock = new ReentrantLock();
        this.f44943c = reentrantLock;
        Condition conditionNewCondition = reentrantLock.newCondition();
        AbstractC4862t.d(conditionNewCondition, "newCondition(...)");
        this.f44944d = conditionNewCondition;
        this.f44945e = 10000;
        this.f44948h = new ArrayList();
        this.f44949i = new ArrayList();
        this.f44950j = new RunnableC0610d();
    }

    public final void b(AbstractC5884a abstractC5884a, long j10) {
        ReentrantLock reentrantLock = this.f44943c;
        if (p.f43482e && !reentrantLock.isHeldByCurrentThread()) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + reentrantLock);
        }
        te.c cVarD = abstractC5884a.d();
        AbstractC4862t.b(cVarD);
        if (cVarD.e() != abstractC5884a) {
            throw new IllegalStateException("Check failed.");
        }
        boolean zF = cVarD.f();
        cVarD.p(false);
        cVarD.o(null);
        this.f44948h.remove(cVarD);
        if (j10 != -1 && !zF && !cVarD.i()) {
            cVarD.n(abstractC5884a, j10, true);
        }
        if (cVarD.g().isEmpty()) {
            return;
        }
        this.f44949i.add(cVarD);
    }

    public final AbstractC5884a c() {
        boolean z10;
        ReentrantLock reentrantLock = this.f44943c;
        if (p.f43482e && !reentrantLock.isHeldByCurrentThread()) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + reentrantLock);
        }
        while (!this.f44949i.isEmpty()) {
            long jB = this.f44941a.b();
            Iterator it = this.f44949i.iterator();
            long jMin = Long.MAX_VALUE;
            AbstractC5884a abstractC5884a = null;
            while (true) {
                if (!it.hasNext()) {
                    z10 = false;
                    break;
                }
                AbstractC5884a abstractC5884a2 = (AbstractC5884a) ((te.c) it.next()).g().get(0);
                long jMax = Math.max(0L, abstractC5884a2.c() - jB);
                if (jMax > 0) {
                    jMin = Math.min(jMax, jMin);
                } else {
                    if (abstractC5884a != null) {
                        z10 = true;
                        break;
                    }
                    abstractC5884a = abstractC5884a2;
                }
            }
            if (abstractC5884a != null) {
                d(abstractC5884a);
                if (z10 || (!this.f44946f && !this.f44949i.isEmpty())) {
                    this.f44941a.e(this, this.f44950j);
                }
                return abstractC5884a;
            }
            if (this.f44946f) {
                if (jMin < this.f44947g - jB) {
                    this.f44941a.a(this);
                }
                return null;
            }
            this.f44946f = true;
            this.f44947g = jB + jMin;
            try {
                try {
                    this.f44941a.d(this, jMin);
                } catch (InterruptedException unused) {
                    e();
                }
            } finally {
                this.f44946f = false;
            }
        }
        return null;
    }

    public final void d(AbstractC5884a abstractC5884a) {
        ReentrantLock reentrantLock = this.f44943c;
        if (p.f43482e && !reentrantLock.isHeldByCurrentThread()) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + reentrantLock);
        }
        abstractC5884a.g(-1L);
        te.c cVarD = abstractC5884a.d();
        AbstractC4862t.b(cVarD);
        cVarD.g().remove(abstractC5884a);
        this.f44949i.remove(cVarD);
        cVarD.o(abstractC5884a);
        this.f44948h.add(cVarD);
    }

    public final void e() {
        ReentrantLock reentrantLock = this.f44943c;
        if (p.f43482e && !reentrantLock.isHeldByCurrentThread()) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + reentrantLock);
        }
        int size = this.f44948h.size();
        while (true) {
            size--;
            if (-1 >= size) {
                break;
            } else {
                ((te.c) this.f44948h.get(size)).b();
            }
        }
        for (int size2 = this.f44949i.size() - 1; -1 < size2; size2--) {
            te.c cVar = (te.c) this.f44949i.get(size2);
            cVar.b();
            if (cVar.g().isEmpty()) {
                this.f44949i.remove(size2);
            }
        }
    }

    public final a f() {
        return this.f44941a;
    }

    public final Condition g() {
        return this.f44944d;
    }

    public final ReentrantLock h() {
        return this.f44943c;
    }

    public final Logger i() {
        return this.f44942b;
    }

    public final void j(te.c taskQueue) {
        AbstractC4862t.e(taskQueue, "taskQueue");
        ReentrantLock reentrantLock = this.f44943c;
        if (p.f43482e && !reentrantLock.isHeldByCurrentThread()) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + reentrantLock);
        }
        if (taskQueue.e() == null) {
            if (taskQueue.g().isEmpty()) {
                this.f44949i.remove(taskQueue);
            } else {
                m.a(this.f44949i, taskQueue);
            }
        }
        if (this.f44946f) {
            this.f44941a.a(this);
        } else {
            this.f44941a.e(this, this.f44950j);
        }
    }

    public final te.c k() {
        ReentrantLock reentrantLock = this.f44943c;
        reentrantLock.lock();
        try {
            int i10 = this.f44945e;
            this.f44945e = i10 + 1;
            reentrantLock.unlock();
            StringBuilder sb2 = new StringBuilder();
            sb2.append('Q');
            sb2.append(i10);
            return new te.c(this, sb2.toString());
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void l(AbstractC5884a abstractC5884a) {
        ReentrantLock reentrantLock;
        Thread threadCurrentThread = Thread.currentThread();
        String name = threadCurrentThread.getName();
        threadCurrentThread.setName(abstractC5884a.b());
        try {
            long jF = abstractC5884a.f();
            reentrantLock = this.f44943c;
            reentrantLock.lock();
            try {
                b(abstractC5884a, jF);
                C4015H c4015h = C4015H.f34254a;
                reentrantLock.unlock();
                threadCurrentThread.setName(name);
            } finally {
            }
        } catch (Throwable th) {
            reentrantLock = this.f44943c;
            reentrantLock.lock();
            try {
                b(abstractC5884a, -1L);
                C4015H c4015h2 = C4015H.f34254a;
                reentrantLock.unlock();
                threadCurrentThread.setName(name);
                throw th;
            } finally {
            }
        }
    }

    public /* synthetic */ d(a aVar, Logger logger, int i10, AbstractC4854k abstractC4854k) {
        this(aVar, (i10 & 2) != 0 ? f44939l : logger);
    }
}
