package Yd;

import Rd.AbstractC2118b;
import Rd.AbstractC2120c;
import Rd.Q;
import Wd.E;
import Wd.z;
import fc.C4015H;
import fc.C4032o;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import kotlin.jvm.internal.L;
import oc.AbstractC5277b;
import oc.InterfaceC5276a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class a implements Executor, Closeable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final C0257a f20030h = new C0257a(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f20031i = AtomicLongFieldUpdater.newUpdater(a.class, "parkedWorkersStack$volatile");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f20032j = AtomicLongFieldUpdater.newUpdater(a.class, "controlState$volatile");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f20033k = AtomicIntegerFieldUpdater.newUpdater(a.class, "_isTerminated$volatile");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final E f20034l = new E("NOT_IN_STACK");
    private volatile /* synthetic */ int _isTerminated$volatile;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f20035a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f20036b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f20037c;
    private volatile /* synthetic */ long controlState$volatile;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f20038d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Yd.d f20039e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Yd.d f20040f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final z f20041g;
    private volatile /* synthetic */ long parkedWorkersStack$volatile;

    /* JADX INFO: renamed from: Yd.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class C0257a {
        public /* synthetic */ C0257a(AbstractC4854k abstractC4854k) {
            this();
        }

        public C0257a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f20042a;

        static {
            int[] iArr = new int[d.values().length];
            try {
                iArr[d.PARKING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[d.BLOCKING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[d.CPU_ACQUIRED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[d.DORMANT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[d.TERMINATED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f20042a = iArr;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class d {
        private static final /* synthetic */ InterfaceC5276a $ENTRIES;
        private static final /* synthetic */ d[] $VALUES;
        public static final d CPU_ACQUIRED = new d("CPU_ACQUIRED", 0);
        public static final d BLOCKING = new d("BLOCKING", 1);
        public static final d PARKING = new d("PARKING", 2);
        public static final d DORMANT = new d("DORMANT", 3);
        public static final d TERMINATED = new d("TERMINATED", 4);

        static {
            d[] dVarArrA = a();
            $VALUES = dVarArrA;
            $ENTRIES = AbstractC5277b.a(dVarArrA);
        }

        public d(String str, int i10) {
        }

        public static final /* synthetic */ d[] a() {
            return new d[]{CPU_ACQUIRED, BLOCKING, PARKING, DORMANT, TERMINATED};
        }

        public static d valueOf(String str) {
            return (d) Enum.valueOf(d.class, str);
        }

        public static d[] values() {
            return (d[]) $VALUES.clone();
        }
    }

    public a(int i10, int i11, long j10, String str) {
        this.f20035a = i10;
        this.f20036b = i11;
        this.f20037c = j10;
        this.f20038d = str;
        if (i10 < 1) {
            throw new IllegalArgumentException(("Core pool size " + i10 + " should be at least 1").toString());
        }
        if (i11 < i10) {
            throw new IllegalArgumentException(("Max pool size " + i11 + " should be greater than or equals to core pool size " + i10).toString());
        }
        if (i11 > 2097150) {
            throw new IllegalArgumentException(("Max pool size " + i11 + " should not exceed maximal supported number of threads 2097150").toString());
        }
        if (j10 > 0) {
            this.f20039e = new Yd.d();
            this.f20040f = new Yd.d();
            this.f20041g = new z((i10 + 1) * 2);
            this.controlState$volatile = ((long) i10) << 42;
            return;
        }
        throw new IllegalArgumentException(("Idle worker keep alive time " + j10 + " must be positive").toString());
    }

    public static /* synthetic */ boolean g0(a aVar, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = f20032j.get(aVar);
        }
        return aVar.a0(j10);
    }

    public static /* synthetic */ void i(a aVar, Runnable runnable, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        if ((i10 & 4) != 0) {
            z11 = false;
        }
        aVar.h(runnable, z10, z11);
    }

    public static final /* synthetic */ AtomicLongFieldUpdater k() {
        return f20032j;
    }

    public final boolean C(c cVar) {
        if (cVar.g() != f20034l) {
            return false;
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater = f20031i;
        while (true) {
            long j10 = atomicLongFieldUpdater.get(this);
            int iF = cVar.f();
            cVar.o(this.f20041g.b((int) (2097151 & j10)));
            long j11 = ((2097152 + j10) & (-2097152)) | ((long) iF);
            a aVar = this;
            if (f20031i.compareAndSet(aVar, j10, j11)) {
                return true;
            }
            this = aVar;
        }
    }

    public final void D(c cVar, int i10, int i11) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f20031i;
        while (true) {
            long j10 = atomicLongFieldUpdater.get(this);
            int iQ = (int) (2097151 & j10);
            long j11 = (2097152 + j10) & (-2097152);
            if (iQ == i10) {
                iQ = i11 == 0 ? this.q(cVar) : i11;
            }
            if (iQ >= 0) {
                a aVar = this;
                if (f20031i.compareAndSet(aVar, j10, j11 | ((long) iQ))) {
                    return;
                } else {
                    this = aVar;
                }
            }
        }
    }

    public final void F(h hVar) {
        try {
            hVar.run();
        } catch (Throwable th) {
            try {
                Thread threadCurrentThread = Thread.currentThread();
                threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th);
                AbstractC2118b abstractC2118b = AbstractC2120c.f15162a;
                if (abstractC2118b != null) {
                    abstractC2118b.e();
                }
            } finally {
                AbstractC2118b abstractC2118b2 = AbstractC2120c.f15162a;
                if (abstractC2118b2 != null) {
                    abstractC2118b2.e();
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void G(long r8) throws java.lang.InterruptedException {
        /*
            r7 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = o()
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r7, r1, r2)
            if (r0 != 0) goto Ld
            return
        Ld:
            Yd.a$c r0 = r7.g()
            Wd.z r1 = r7.f20041g
            monitor-enter(r1)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r3 = a()     // Catch: java.lang.Throwable -> L8f
            long r3 = r3.get(r7)     // Catch: java.lang.Throwable -> L8f
            r5 = 2097151(0x1fffff, double:1.0361303E-317)
            long r3 = r3 & r5
            int r3 = (int) r3
            monitor-exit(r1)
            if (r2 > r3) goto L4d
            r1 = r2
        L25:
            Wd.z r4 = r7.f20041g
            java.lang.Object r4 = r4.b(r1)
            kotlin.jvm.internal.AbstractC4862t.b(r4)
            Yd.a$c r4 = (Yd.a.c) r4
            if (r4 == r0) goto L48
        L32:
            java.lang.Thread$State r5 = r4.getState()
            java.lang.Thread$State r6 = java.lang.Thread.State.TERMINATED
            if (r5 == r6) goto L41
            java.util.concurrent.locks.LockSupport.unpark(r4)
            r4.join(r8)
            goto L32
        L41:
            Yd.l r4 = r4.f20044a
            Yd.d r5 = r7.f20040f
            r4.j(r5)
        L48:
            if (r1 == r3) goto L4d
            int r1 = r1 + 1
            goto L25
        L4d:
            Yd.d r8 = r7.f20040f
            r8.b()
            Yd.d r8 = r7.f20039e
            r8.b()
        L57:
            if (r0 == 0) goto L5f
            Yd.h r8 = r0.e(r2)
            if (r8 != 0) goto L8b
        L5f:
            Yd.d r8 = r7.f20039e
            java.lang.Object r8 = r8.e()
            Yd.h r8 = (Yd.h) r8
            if (r8 != 0) goto L8b
            Yd.d r8 = r7.f20040f
            java.lang.Object r8 = r8.e()
            Yd.h r8 = (Yd.h) r8
            if (r8 != 0) goto L8b
            if (r0 == 0) goto L7a
            Yd.a$d r8 = Yd.a.d.TERMINATED
            r0.r(r8)
        L7a:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r8 = m()
            r0 = 0
            r8.set(r7, r0)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r8 = k()
            r8.set(r7, r0)
            return
        L8b:
            r7.F(r8)
            goto L57
        L8f:
            r7 = move-exception
            monitor-exit(r1)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: Yd.a.G(long):void");
    }

    public final void H(long j10) {
        if (k0() || a0(j10)) {
            return;
        }
        k0();
    }

    public final void K() {
        if (k0() || g0(this, 0L, 1, null)) {
            return;
        }
        k0();
    }

    public final h Y(c cVar, h hVar, boolean z10) {
        d dVar;
        if (cVar == null || (dVar = cVar.f20046c) == d.TERMINATED) {
            return hVar;
        }
        if (!hVar.f20062b && dVar == d.BLOCKING) {
            return hVar;
        }
        cVar.f20050g = true;
        return cVar.f20044a.a(hVar, z10);
    }

    public final boolean a0(long j10) {
        if (Bc.k.e(((int) (2097151 & j10)) - ((int) ((j10 & 4398044413952L) >> 21)), 0) < this.f20035a) {
            int iD = d();
            if (iD == 1 && this.f20035a > 1) {
                d();
            }
            if (iD > 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean c(h hVar) {
        return hVar.f20062b ? this.f20040f.a(hVar) : this.f20039e.a(hVar);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws InterruptedException {
        G(10000L);
    }

    public final int d() {
        synchronized (this.f20041g) {
            try {
                if (isTerminated()) {
                    return -1;
                }
                long j10 = f20032j.get(this);
                int i10 = (int) (j10 & 2097151);
                int iE = Bc.k.e(i10 - ((int) ((j10 & 4398044413952L) >> 21)), 0);
                if (iE >= this.f20035a) {
                    return 0;
                }
                if (i10 >= this.f20036b) {
                    return 0;
                }
                int i11 = ((int) (k().get(this) & 2097151)) + 1;
                if (i11 <= 0 || this.f20041g.b(i11) != null) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                c cVar = new c(this, i11);
                this.f20041g.c(i11, cVar);
                if (i11 != ((int) (2097151 & f20032j.incrementAndGet(this)))) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                int i12 = iE + 1;
                cVar.start();
                return i12;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        i(this, runnable, false, false, 6, null);
    }

    public final h f(Runnable runnable, boolean z10) {
        long jA = j.f20069f.a();
        if (!(runnable instanceof h)) {
            return j.b(runnable, jA, z10);
        }
        h hVar = (h) runnable;
        hVar.f20061a = jA;
        hVar.f20062b = z10;
        return hVar;
    }

    public final c g() {
        Thread threadCurrentThread = Thread.currentThread();
        c cVar = threadCurrentThread instanceof c ? (c) threadCurrentThread : null;
        if (cVar == null || !AbstractC4862t.a(a.this, this)) {
            return null;
        }
        return cVar;
    }

    public final void h(Runnable runnable, boolean z10, boolean z11) {
        AbstractC2118b abstractC2118b = AbstractC2120c.f15162a;
        if (abstractC2118b != null) {
            abstractC2118b.d();
        }
        h hVarF = f(runnable, z10);
        boolean z12 = hVarF.f20062b;
        long jAddAndGet = z12 ? f20032j.addAndGet(this, 2097152L) : 0L;
        h hVarY = Y(g(), hVarF, z11);
        if (hVarY != null && !c(hVarY)) {
            throw new RejectedExecutionException(this.f20038d + " was terminated");
        }
        if (z12) {
            H(jAddAndGet);
        } else {
            K();
        }
    }

    public final boolean isTerminated() {
        return f20033k.get(this) == 1;
    }

    public final boolean k0() {
        c cVarU;
        do {
            cVarU = u();
            if (cVarU == null) {
                return false;
            }
        } while (!c.f20043i.compareAndSet(cVarU, -1, 0));
        LockSupport.unpark(cVarU);
        return true;
    }

    public final int q(c cVar) {
        Object objG = cVar.g();
        while (objG != f20034l) {
            if (objG == null) {
                return 0;
            }
            c cVar2 = (c) objG;
            int iF = cVar2.f();
            if (iF != 0) {
                return iF;
            }
            objG = cVar2.g();
        }
        return -1;
    }

    public String toString() {
        ArrayList arrayList = new ArrayList();
        int iA = this.f20041g.a();
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 1; i15 < iA; i15++) {
            c cVar = (c) this.f20041g.b(i15);
            if (cVar != null) {
                int i16 = cVar.f20044a.i();
                int i17 = b.f20042a[cVar.f20046c.ordinal()];
                if (i17 == 1) {
                    i12++;
                } else if (i17 == 2) {
                    i11++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(i16);
                    sb2.append('b');
                    arrayList.add(sb2.toString());
                } else if (i17 == 3) {
                    i10++;
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(i16);
                    sb3.append('c');
                    arrayList.add(sb3.toString());
                } else if (i17 == 4) {
                    i13++;
                    if (i16 > 0) {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append(i16);
                        sb4.append('d');
                        arrayList.add(sb4.toString());
                    }
                } else {
                    if (i17 != 5) {
                        throw new C4032o();
                    }
                    i14++;
                }
            }
        }
        long j10 = f20032j.get(this);
        return this.f20038d + '@' + Q.b(this) + "[Pool Size {core = " + this.f20035a + ", max = " + this.f20036b + "}, Worker States {CPU = " + i10 + ", blocking = " + i11 + ", parked = " + i12 + ", dormant = " + i13 + ", terminated = " + i14 + "}, running workers queues = " + arrayList + ", global CPU queue size = " + this.f20039e.c() + ", global blocking queue size = " + this.f20040f.c() + ", Control State {created workers= " + ((int) (2097151 & j10)) + ", blocking tasks = " + ((int) ((4398044413952L & j10) >> 21)) + ", CPUs acquired = " + (this.f20035a - ((int) ((9223367638808264704L & j10) >> 42))) + "}]";
    }

    public final c u() {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f20031i;
        while (true) {
            long j10 = atomicLongFieldUpdater.get(this);
            c cVar = (c) this.f20041g.b((int) (2097151 & j10));
            if (cVar == null) {
                return null;
            }
            long j11 = (2097152 + j10) & (-2097152);
            int iQ = this.q(cVar);
            if (iQ >= 0) {
                a aVar = this;
                if (f20031i.compareAndSet(aVar, j10, ((long) iQ) | j11)) {
                    cVar.o(f20034l);
                    return cVar;
                }
                this = aVar;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public final class c extends Thread {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final /* synthetic */ AtomicIntegerFieldUpdater f20043i = AtomicIntegerFieldUpdater.newUpdater(c.class, "workerCtl$volatile");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final l f20044a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final L f20045b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public d f20046c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f20047d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f20048e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f20049f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f20050g;
        private volatile int indexInArray;
        private volatile Object nextParkedWorker;
        private volatile /* synthetic */ int workerCtl$volatile;

        public c() {
            setDaemon(true);
            setContextClassLoader(a.this.getClass().getClassLoader());
            this.f20044a = new l();
            this.f20045b = new L();
            this.f20046c = d.DORMANT;
            this.nextParkedWorker = a.f20034l;
            int iNanoTime = (int) System.nanoTime();
            this.f20049f = iNanoTime == 0 ? 42 : iNanoTime;
        }

        public final void b(h hVar) {
            this.f20047d = 0L;
            if (this.f20046c == d.PARKING) {
                this.f20046c = d.BLOCKING;
            }
            if (!hVar.f20062b) {
                a.this.F(hVar);
                return;
            }
            if (r(d.BLOCKING)) {
                a.this.K();
            }
            a.this.F(hVar);
            a.k().addAndGet(a.this, -2097152L);
            if (this.f20046c != d.TERMINATED) {
                this.f20046c = d.DORMANT;
            }
        }

        public final h c(boolean z10) {
            h hVarL;
            h hVarL2;
            if (z10) {
                boolean z11 = j(a.this.f20035a * 2) == 0;
                if (z11 && (hVarL2 = l()) != null) {
                    return hVarL2;
                }
                h hVarK = this.f20044a.k();
                if (hVarK != null) {
                    return hVarK;
                }
                if (!z11 && (hVarL = l()) != null) {
                    return hVarL;
                }
            } else {
                h hVarL3 = l();
                if (hVarL3 != null) {
                    return hVarL3;
                }
            }
            return s(3);
        }

        public final h d() {
            h hVarL = this.f20044a.l();
            return (hVarL == null && (hVarL = (h) a.this.f20040f.e()) == null) ? s(1) : hVarL;
        }

        public final h e(boolean z10) {
            return p() ? c(z10) : d();
        }

        public final int f() {
            return this.indexInArray;
        }

        public final Object g() {
            return this.nextParkedWorker;
        }

        public final boolean i() {
            return this.nextParkedWorker != a.f20034l;
        }

        public final int j(int i10) {
            int i11 = this.f20049f;
            int i12 = i11 ^ (i11 << 13);
            int i13 = i12 ^ (i12 >> 17);
            int i14 = i13 ^ (i13 << 5);
            this.f20049f = i14;
            int i15 = i10 - 1;
            return (i15 & i10) == 0 ? i15 & i14 : (Integer.MAX_VALUE & i14) % i10;
        }

        public final void k() {
            if (this.f20047d == 0) {
                this.f20047d = System.nanoTime() + a.this.f20037c;
            }
            LockSupport.parkNanos(a.this.f20037c);
            if (System.nanoTime() - this.f20047d >= 0) {
                this.f20047d = 0L;
                t();
            }
        }

        public final h l() {
            if (j(2) == 0) {
                h hVar = (h) a.this.f20039e.e();
                return hVar != null ? hVar : (h) a.this.f20040f.e();
            }
            h hVar2 = (h) a.this.f20040f.e();
            return hVar2 != null ? hVar2 : (h) a.this.f20039e.e();
        }

        public final void m() {
            loop0: while (true) {
                boolean z10 = false;
                while (!a.this.isTerminated() && this.f20046c != d.TERMINATED) {
                    h hVarE = e(this.f20050g);
                    if (hVarE != null) {
                        this.f20048e = 0L;
                        b(hVarE);
                    } else {
                        this.f20050g = false;
                        if (this.f20048e == 0) {
                            q();
                        } else if (z10) {
                            r(d.PARKING);
                            Thread.interrupted();
                            LockSupport.parkNanos(this.f20048e);
                            this.f20048e = 0L;
                        } else {
                            z10 = true;
                        }
                    }
                }
                break loop0;
            }
            r(d.TERMINATED);
        }

        public final void n(int i10) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(a.this.f20038d);
            sb2.append("-worker-");
            sb2.append(i10 == 0 ? "TERMINATED" : String.valueOf(i10));
            setName(sb2.toString());
            this.indexInArray = i10;
        }

        public final void o(Object obj) {
            this.nextParkedWorker = obj;
        }

        public final boolean p() {
            long j10;
            if (this.f20046c == d.CPU_ACQUIRED) {
                return true;
            }
            a aVar = a.this;
            AtomicLongFieldUpdater atomicLongFieldUpdaterK = a.k();
            do {
                j10 = atomicLongFieldUpdaterK.get(aVar);
                if (((int) ((9223367638808264704L & j10) >> 42)) == 0) {
                    return false;
                }
            } while (!a.k().compareAndSet(aVar, j10, j10 - 4398046511104L));
            this.f20046c = d.CPU_ACQUIRED;
            return true;
        }

        public final void q() {
            if (!i()) {
                a.this.C(this);
                return;
            }
            f20043i.set(this, -1);
            while (i() && f20043i.get(this) == -1 && !a.this.isTerminated() && this.f20046c != d.TERMINATED) {
                r(d.PARKING);
                Thread.interrupted();
                k();
            }
        }

        public final boolean r(d dVar) {
            d dVar2 = this.f20046c;
            boolean z10 = dVar2 == d.CPU_ACQUIRED;
            if (z10) {
                a.k().addAndGet(a.this, 4398046511104L);
            }
            if (dVar2 != dVar) {
                this.f20046c = dVar;
            }
            return z10;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            m();
        }

        public final h s(int i10) {
            int i11 = (int) (a.k().get(a.this) & 2097151);
            if (i11 < 2) {
                return null;
            }
            int iJ = j(i11);
            a aVar = a.this;
            long jMin = Long.MAX_VALUE;
            for (int i12 = 0; i12 < i11; i12++) {
                iJ++;
                if (iJ > i11) {
                    iJ = 1;
                }
                c cVar = (c) aVar.f20041g.b(iJ);
                if (cVar != null && cVar != this) {
                    long jR = cVar.f20044a.r(i10, this.f20045b);
                    if (jR == -1) {
                        L l10 = this.f20045b;
                        h hVar = (h) l10.f39776a;
                        l10.f39776a = null;
                        return hVar;
                    }
                    if (jR > 0) {
                        jMin = Math.min(jMin, jR);
                    }
                }
            }
            if (jMin == Long.MAX_VALUE) {
                jMin = 0;
            }
            this.f20048e = jMin;
            return null;
        }

        public final void t() {
            a aVar = a.this;
            synchronized (aVar.f20041g) {
                try {
                    if (aVar.isTerminated()) {
                        return;
                    }
                    if (((int) (a.k().get(aVar) & 2097151)) <= aVar.f20035a) {
                        return;
                    }
                    if (f20043i.compareAndSet(this, -1, 1)) {
                        int i10 = this.indexInArray;
                        n(0);
                        aVar.D(this, i10, 0);
                        int andDecrement = (int) (a.k().getAndDecrement(aVar) & 2097151);
                        if (andDecrement != i10) {
                            Object objB = aVar.f20041g.b(andDecrement);
                            AbstractC4862t.b(objB);
                            c cVar = (c) objB;
                            aVar.f20041g.c(i10, cVar);
                            cVar.n(i10);
                            aVar.D(cVar, andDecrement, i10);
                        }
                        aVar.f20041g.c(andDecrement, null);
                        C4015H c4015h = C4015H.f34254a;
                        this.f20046c = d.TERMINATED;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public c(a aVar, int i10) {
            this();
            n(i10);
        }
    }
}
