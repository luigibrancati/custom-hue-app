package ue;

import fc.C4015H;
import gc.Q;
import java.lang.ref.Reference;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import pe.C5465a;
import te.AbstractC5884a;
import ue.k;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class m {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final a f45659j = new a(null);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static AtomicReferenceFieldUpdater f45660k = AtomicReferenceFieldUpdater.newUpdater(m.class, Map.class, "f");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final te.d f45661a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f45662b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final pe.k f45663c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final vc.q f45664d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f45665e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile Map f45666f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final te.c f45667g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final b f45668h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ConcurrentLinkedQueue f45669i;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends AbstractC5884a {
        public b(String str) {
            super(str, false, 2, null);
        }

        @Override // te.AbstractC5884a
        public long f() {
            return m.this.b(System.nanoTime());
        }
    }

    public m(te.d taskRunner, int i10, long j10, TimeUnit timeUnit, pe.k connectionListener, vc.q exchangeFinderFactory) {
        AbstractC4862t.e(taskRunner, "taskRunner");
        AbstractC4862t.e(timeUnit, "timeUnit");
        AbstractC4862t.e(connectionListener, "connectionListener");
        AbstractC4862t.e(exchangeFinderFactory, "exchangeFinderFactory");
        this.f45661a = taskRunner;
        this.f45662b = i10;
        this.f45663c = connectionListener;
        this.f45664d = exchangeFinderFactory;
        this.f45665e = timeUnit.toNanos(j10);
        this.f45666f = Q.i();
        this.f45667g = taskRunner.k();
        this.f45668h = new b(qe.p.f43483f + " ConnectionPool connection closer");
        this.f45669i = new ConcurrentLinkedQueue();
        if (j10 > 0) {
            return;
        }
        throw new IllegalArgumentException(("keepAliveDuration <= 0: " + j10).toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002d A[Catch: all -> 0x002b, TryCatch #1 {all -> 0x002b, blocks: (B:9:0x0024, B:14:0x002d, B:17:0x0034), top: B:40:0x0024 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final ue.l a(boolean r6, pe.C5465a r7, ue.d r8, java.util.List r9, boolean r10) {
        /*
            r5 = this;
            java.lang.String r0 = "address"
            kotlin.jvm.internal.AbstractC4862t.e(r7, r0)
            java.lang.String r0 = "connectionUser"
            kotlin.jvm.internal.AbstractC4862t.e(r8, r0)
            java.util.concurrent.ConcurrentLinkedQueue r0 = r5.f45669i
            java.util.Iterator r0 = r0.iterator()
        L10:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L67
            java.lang.Object r1 = r0.next()
            ue.l r1 = (ue.l) r1
            kotlin.jvm.internal.AbstractC4862t.b(r1)
            monitor-enter(r1)
            r2 = 1
            r3 = 0
            if (r10 == 0) goto L2d
            boolean r4 = r1.q()     // Catch: java.lang.Throwable -> L2b
            if (r4 != 0) goto L2d
            goto L38
        L2b:
            r5 = move-exception
            goto L65
        L2d:
            boolean r4 = r1.o(r7, r9)     // Catch: java.lang.Throwable -> L2b
            if (r4 != 0) goto L34
            goto L38
        L34:
            r8.k(r1)     // Catch: java.lang.Throwable -> L2b
            r3 = r2
        L38:
            monitor-exit(r1)
            if (r3 == 0) goto L10
            boolean r3 = r1.p(r6)
            if (r3 == 0) goto L42
            return r1
        L42:
            monitor-enter(r1)
            boolean r3 = r1.k()     // Catch: java.lang.Throwable -> L62
            r1.w(r2)     // Catch: java.lang.Throwable -> L62
            java.net.Socket r2 = r8.v()     // Catch: java.lang.Throwable -> L62
            monitor-exit(r1)
            if (r2 == 0) goto L5a
            qe.p.f(r2)
            pe.k r2 = r5.f45663c
            r2.f(r1)
            goto L10
        L5a:
            if (r3 != 0) goto L10
            pe.k r2 = r5.f45663c
            r2.h(r1)
            goto L10
        L62:
            r5 = move-exception
            monitor-exit(r1)
            throw r5
        L65:
            monitor-exit(r1)
            throw r5
        L67:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ue.m.a(boolean, pe.a, ue.d, java.util.List, boolean):ue.l");
    }

    public final long b(long j10) {
        Map map = this.f45666f;
        Iterator it = map.values().iterator();
        l lVar = null;
        if (it.hasNext()) {
            android.support.v4.media.session.a.a(it.next());
            throw null;
        }
        Iterator it2 = this.f45669i.iterator();
        while (it2.hasNext()) {
            android.support.v4.media.session.a.a(map.get(((l) it2.next()).e().a()));
        }
        long j11 = (j10 - this.f45665e) + 1;
        int i10 = 0;
        l lVar2 = null;
        l lVar3 = null;
        long j12 = Long.MAX_VALUE;
        int i11 = 0;
        for (l lVar4 : this.f45669i) {
            AbstractC4862t.b(lVar4);
            synchronized (lVar4) {
                if (f(lVar4, j10) > 0) {
                    i11++;
                } else {
                    long j13 = lVar4.j();
                    if (j13 < j11) {
                        lVar2 = lVar4;
                        j11 = j13;
                    }
                    if (e(map, lVar4)) {
                        i10++;
                        if (j13 < j12) {
                            lVar3 = lVar4;
                            j12 = j13;
                        }
                    }
                }
                C4015H c4015h = C4015H.f34254a;
            }
        }
        if (lVar2 != null) {
            lVar = lVar2;
        } else if (i10 > this.f45662b) {
            j11 = j12;
            lVar = lVar3;
        } else {
            j11 = -1;
        }
        if (lVar == null) {
            if (lVar3 != null) {
                return (j12 + this.f45665e) - j10;
            }
            if (i11 > 0) {
                return this.f45665e;
            }
            return -1L;
        }
        synchronized (lVar) {
            if (!lVar.h().isEmpty()) {
                return 0L;
            }
            if (lVar.j() != j11) {
                return 0L;
            }
            lVar.w(true);
            this.f45669i.remove(lVar);
            android.support.v4.media.session.a.a(map.get(lVar.e().a()));
            qe.p.f(lVar.x());
            this.f45663c.f(lVar);
            if (this.f45669i.isEmpty()) {
                this.f45667g.a();
            }
            return 0L;
        }
    }

    public final boolean c(l connection) {
        AbstractC4862t.e(connection, "connection");
        if (qe.p.f43482e && !Thread.holdsLock(connection)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + connection);
        }
        if (!connection.k() && this.f45662b != 0) {
            h();
            return false;
        }
        connection.w(true);
        this.f45669i.remove(connection);
        if (this.f45669i.isEmpty()) {
            this.f45667g.a();
        }
        i(connection.e().a());
        return true;
    }

    public final pe.k d() {
        return this.f45663c;
    }

    public final boolean e(Map map, l lVar) {
        android.support.v4.media.session.a.a(map.get(lVar.e().a()));
        return true;
    }

    public final int f(l lVar, long j10) {
        if (qe.p.f43482e && !Thread.holdsLock(lVar)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + lVar);
        }
        List listH = lVar.h();
        int i10 = 0;
        while (i10 < listH.size()) {
            Reference reference = (Reference) listH.get(i10);
            if (reference.get() != null) {
                i10++;
            } else {
                AbstractC4862t.c(reference, "null cannot be cast to non-null type okhttp3.internal.connection.RealCall.CallReference");
                Ae.h.f493a.g().m("A connection to " + lVar.t().a().l() + " was leaked. Did you forget to close a response body?", ((k.b) reference).a());
                listH.remove(i10);
                if (listH.isEmpty()) {
                    lVar.v(j10 - this.f45665e);
                    return 0;
                }
            }
        }
        return listH.size();
    }

    public final void g(l connection) {
        AbstractC4862t.e(connection, "connection");
        if (!qe.p.f43482e || Thread.holdsLock(connection)) {
            this.f45669i.add(connection);
            h();
            return;
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + connection);
    }

    public final void h() {
        te.c.m(this.f45667g, this.f45668h, 0L, 2, null);
    }

    public final void i(C5465a address) {
        AbstractC4862t.e(address, "address");
        android.support.v4.media.session.a.a(this.f45666f.get(address));
    }
}
