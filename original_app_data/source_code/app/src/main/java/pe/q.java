package pe;

import fc.C4015H;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC4862t;
import ue.k;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class q {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Runnable f42852c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ExecutorService f42853d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f42850a = 64;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f42851b = 5;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayDeque f42854e = new ArrayDeque();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayDeque f42855f = new ArrayDeque();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayDeque f42856g = new ArrayDeque();

    public final void a(k.a call) {
        k.a aVarD;
        AbstractC4862t.e(call, "call");
        synchronized (this) {
            try {
                this.f42854e.add(call);
                if (!call.d().s() && (aVarD = d(call.f())) != null) {
                    call.g(aVarD);
                }
                C4015H c4015h = C4015H.f34254a;
            } catch (Throwable th) {
                throw th;
            }
        }
        h();
    }

    public final synchronized void b(ue.k call) {
        AbstractC4862t.e(call, "call");
        this.f42856g.add(call);
    }

    public final synchronized ExecutorService c() {
        ExecutorService executorService;
        try {
            if (this.f42853d == null) {
                this.f42853d = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), qe.p.m(qe.p.f43483f + " Dispatcher", false));
            }
            executorService = this.f42853d;
            AbstractC4862t.b(executorService);
        } catch (Throwable th) {
            throw th;
        }
        return executorService;
    }

    public final k.a d(String str) {
        for (k.a aVar : this.f42855f) {
            if (AbstractC4862t.a(aVar.f(), str)) {
                return aVar;
            }
        }
        for (k.a aVar2 : this.f42854e) {
            if (AbstractC4862t.a(aVar2.f(), str)) {
                return aVar2;
            }
        }
        return null;
    }

    public final void e(Deque deque, Object obj) {
        Runnable runnable;
        synchronized (this) {
            if (!deque.remove(obj)) {
                throw new AssertionError("Call wasn't in-flight!");
            }
            runnable = this.f42852c;
            C4015H c4015h = C4015H.f34254a;
        }
        if (h() || runnable == null) {
            return;
        }
        runnable.run();
    }

    public final void f(k.a call) {
        AbstractC4862t.e(call, "call");
        call.e().decrementAndGet();
        e(this.f42855f, call);
    }

    public final void g(ue.k call) {
        AbstractC4862t.e(call, "call");
        e(this.f42856g, call);
    }

    public final boolean h() {
        int i10;
        boolean z10;
        if (qe.p.f43482e && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            try {
                Iterator it = this.f42854e.iterator();
                AbstractC4862t.d(it, "iterator(...)");
                while (it.hasNext()) {
                    k.a aVar = (k.a) it.next();
                    if (this.f42855f.size() >= this.f42850a) {
                        break;
                    }
                    if (aVar.e().get() < this.f42851b) {
                        it.remove();
                        aVar.e().incrementAndGet();
                        AbstractC4862t.b(aVar);
                        arrayList.add(aVar);
                        this.f42855f.add(aVar);
                    }
                }
                i10 = 0;
                z10 = i() > 0;
                C4015H c4015h = C4015H.f34254a;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (c().isShutdown()) {
            int size = arrayList.size();
            while (i10 < size) {
                k.a aVar2 = (k.a) arrayList.get(i10);
                aVar2.e().decrementAndGet();
                synchronized (this) {
                    this.f42855f.remove(aVar2);
                }
                k.a.c(aVar2, null, 1, null);
                i10++;
            }
            Runnable runnable = this.f42852c;
            if (runnable != null) {
                runnable.run();
                return z10;
            }
        } else {
            int size2 = arrayList.size();
            while (i10 < size2) {
                ((k.a) arrayList.get(i10)).a(c());
                i10++;
            }
        }
        return z10;
    }

    public final synchronized int i() {
        return this.f42855f.size() + this.f42856g.size();
    }
}
