package te;

import fc.C4015H;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.internal.AbstractC4862t;
import qe.p;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f44929a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f44930b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ReentrantLock f44931c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f44932d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public AbstractC5884a f44933e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f44934f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f44935g;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends AbstractC5884a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ InterfaceC6082a f44936e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, boolean z10, InterfaceC6082a interfaceC6082a) {
            super(str, z10);
            this.f44936e = interfaceC6082a;
        }

        @Override // te.AbstractC5884a
        public long f() {
            this.f44936e.invoke();
            return -1L;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends AbstractC5884a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ InterfaceC6082a f44937e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, InterfaceC6082a interfaceC6082a) {
            super(str, false, 2, null);
            this.f44937e = interfaceC6082a;
        }

        @Override // te.AbstractC5884a
        public long f() {
            return ((Number) this.f44937e.invoke()).longValue();
        }
    }

    public c(d taskRunner, String name) {
        AbstractC4862t.e(taskRunner, "taskRunner");
        AbstractC4862t.e(name, "name");
        this.f44929a = taskRunner;
        this.f44930b = name;
        this.f44931c = new ReentrantLock();
        this.f44934f = new ArrayList();
    }

    public static /* synthetic */ void d(c cVar, String str, long j10, boolean z10, InterfaceC6082a interfaceC6082a, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = 0;
        }
        long j11 = j10;
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        cVar.c(str, j11, z10, interfaceC6082a);
    }

    public static /* synthetic */ void m(c cVar, AbstractC5884a abstractC5884a, long j10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = 0;
        }
        cVar.l(abstractC5884a, j10);
    }

    public final void a() {
        ReentrantLock reentrantLock = this.f44931c;
        if (p.f43482e && reentrantLock.isHeldByCurrentThread()) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + reentrantLock);
        }
        ReentrantLock reentrantLockH = this.f44929a.h();
        reentrantLockH.lock();
        try {
            if (b()) {
                this.f44929a.j(this);
            }
            C4015H c4015h = C4015H.f34254a;
            reentrantLockH.unlock();
        } catch (Throwable th) {
            reentrantLockH.unlock();
            throw th;
        }
    }

    public final boolean b() {
        AbstractC5884a abstractC5884a = this.f44933e;
        if (abstractC5884a != null) {
            AbstractC4862t.b(abstractC5884a);
            if (abstractC5884a.a()) {
                this.f44935g = true;
            }
        }
        boolean z10 = false;
        for (int size = this.f44934f.size() - 1; -1 < size; size--) {
            if (((AbstractC5884a) this.f44934f.get(size)).a()) {
                Logger loggerI = this.f44929a.i();
                AbstractC5884a abstractC5884a2 = (AbstractC5884a) this.f44934f.get(size);
                if (loggerI.isLoggable(Level.FINE)) {
                    AbstractC5885b.c(loggerI, abstractC5884a2, this, "canceled");
                }
                this.f44934f.remove(size);
                z10 = true;
            }
        }
        return z10;
    }

    public final void c(String name, long j10, boolean z10, InterfaceC6082a block) {
        AbstractC4862t.e(name, "name");
        AbstractC4862t.e(block, "block");
        l(new a(name, z10, block), j10);
    }

    public final AbstractC5884a e() {
        return this.f44933e;
    }

    public final boolean f() {
        return this.f44935g;
    }

    public final List g() {
        return this.f44934f;
    }

    public final String h() {
        return this.f44930b;
    }

    public final boolean i() {
        return this.f44932d;
    }

    public final d j() {
        return this.f44929a;
    }

    public final void k(String name, long j10, InterfaceC6082a block) {
        AbstractC4862t.e(name, "name");
        AbstractC4862t.e(block, "block");
        l(new b(name, block), j10);
    }

    public final void l(AbstractC5884a task, long j10) {
        AbstractC4862t.e(task, "task");
        ReentrantLock reentrantLockH = this.f44929a.h();
        reentrantLockH.lock();
        try {
            if (!this.f44932d) {
                if (n(task, j10, false)) {
                    this.f44929a.j(this);
                }
                C4015H c4015h = C4015H.f34254a;
            } else if (task.a()) {
                Logger loggerI = this.f44929a.i();
                if (loggerI.isLoggable(Level.FINE)) {
                    AbstractC5885b.c(loggerI, task, this, "schedule canceled (queue is shutdown)");
                }
            } else {
                Logger loggerI2 = this.f44929a.i();
                if (loggerI2.isLoggable(Level.FINE)) {
                    AbstractC5885b.c(loggerI2, task, this, "schedule failed (queue is shutdown)");
                }
                throw new RejectedExecutionException();
            }
        } finally {
            reentrantLockH.unlock();
        }
    }

    public final boolean n(AbstractC5884a task, long j10, boolean z10) {
        String str;
        AbstractC4862t.e(task, "task");
        task.e(this);
        long jB = this.f44929a.f().b();
        long j11 = jB + j10;
        int iIndexOf = this.f44934f.indexOf(task);
        if (iIndexOf != -1) {
            if (task.c() <= j11) {
                Logger loggerI = this.f44929a.i();
                if (loggerI.isLoggable(Level.FINE)) {
                    AbstractC5885b.c(loggerI, task, this, "already scheduled");
                }
                return false;
            }
            this.f44934f.remove(iIndexOf);
        }
        task.g(j11);
        Logger loggerI2 = this.f44929a.i();
        if (loggerI2.isLoggable(Level.FINE)) {
            if (z10) {
                str = "run again after " + AbstractC5885b.b(j11 - jB);
            } else {
                str = "scheduled after " + AbstractC5885b.b(j11 - jB);
            }
            AbstractC5885b.c(loggerI2, task, this, str);
        }
        Iterator it = this.f44934f.iterator();
        int size = 0;
        while (true) {
            if (!it.hasNext()) {
                size = -1;
                break;
            }
            if (((AbstractC5884a) it.next()).c() - jB > j10) {
                break;
            }
            size++;
        }
        if (size == -1) {
            size = this.f44934f.size();
        }
        this.f44934f.add(size, task);
        return size == 0;
    }

    public final void o(AbstractC5884a abstractC5884a) {
        this.f44933e = abstractC5884a;
    }

    public final void p(boolean z10) {
        this.f44935g = z10;
    }

    public final void q() {
        ReentrantLock reentrantLock = this.f44931c;
        if (p.f43482e && reentrantLock.isHeldByCurrentThread()) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + reentrantLock);
        }
        ReentrantLock reentrantLockH = this.f44929a.h();
        reentrantLockH.lock();
        try {
            this.f44932d = true;
            if (b()) {
                this.f44929a.j(this);
            }
            C4015H c4015h = C4015H.f34254a;
            reentrantLockH.unlock();
        } catch (Throwable th) {
            reentrantLockH.unlock();
            throw th;
        }
    }

    public String toString() {
        return this.f44930b;
    }
}
