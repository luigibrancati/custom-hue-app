package Fe;

import fc.C4015H;
import io.sentry.ProfilingTraceData;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: Fe.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class C0841c extends K {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f4095i = new a(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final ReentrantLock f4096j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Condition f4097k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final long f4098l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final long f4099m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static C0841c f4100n;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f4101f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public C0841c f4102g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f4103h;

    /* JADX INFO: renamed from: Fe.c$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public final C0841c c() throws InterruptedException {
            C0841c c0841c = C0841c.f4100n;
            AbstractC4862t.b(c0841c);
            C0841c c0841c2 = c0841c.f4102g;
            if (c0841c2 == null) {
                long jNanoTime = System.nanoTime();
                d().await(C0841c.f4098l, TimeUnit.MILLISECONDS);
                C0841c c0841c3 = C0841c.f4100n;
                AbstractC4862t.b(c0841c3);
                if (c0841c3.f4102g != null || System.nanoTime() - jNanoTime < C0841c.f4099m) {
                    return null;
                }
                return C0841c.f4100n;
            }
            long jY = c0841c2.y(System.nanoTime());
            if (jY > 0) {
                d().await(jY, TimeUnit.NANOSECONDS);
                return null;
            }
            C0841c c0841c4 = C0841c.f4100n;
            AbstractC4862t.b(c0841c4);
            c0841c4.f4102g = c0841c2.f4102g;
            c0841c2.f4102g = null;
            c0841c2.f4101f = 2;
            return c0841c2;
        }

        public final Condition d() {
            return C0841c.f4097k;
        }

        public final ReentrantLock e() {
            return C0841c.f4096j;
        }

        public final void f(C0841c c0841c, long j10, boolean z10) {
            if (C0841c.f4100n == null) {
                C0841c.f4100n = new C0841c();
                new b().start();
            }
            long jNanoTime = System.nanoTime();
            if (j10 != 0 && z10) {
                c0841c.f4103h = Math.min(j10, c0841c.c() - jNanoTime) + jNanoTime;
            } else if (j10 != 0) {
                c0841c.f4103h = j10 + jNanoTime;
            } else {
                if (!z10) {
                    throw new AssertionError();
                }
                c0841c.f4103h = c0841c.c();
            }
            long jY = c0841c.y(jNanoTime);
            C0841c c0841c2 = C0841c.f4100n;
            AbstractC4862t.b(c0841c2);
            while (c0841c2.f4102g != null) {
                C0841c c0841c3 = c0841c2.f4102g;
                AbstractC4862t.b(c0841c3);
                if (jY < c0841c3.y(jNanoTime)) {
                    break;
                }
                c0841c2 = c0841c2.f4102g;
                AbstractC4862t.b(c0841c2);
            }
            c0841c.f4102g = c0841c2.f4102g;
            c0841c2.f4102g = c0841c;
            if (c0841c2 == C0841c.f4100n) {
                d().signal();
            }
        }

        public final void g(C0841c c0841c) {
            for (C0841c c0841c2 = C0841c.f4100n; c0841c2 != null; c0841c2 = c0841c2.f4102g) {
                if (c0841c2.f4102g == c0841c) {
                    c0841c2.f4102g = c0841c.f4102g;
                    c0841c.f4102g = null;
                    return;
                }
            }
            throw new IllegalStateException("node was not found in the queue");
        }

        public a() {
        }
    }

    /* JADX INFO: renamed from: Fe.c$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends Thread {
        public b() {
            super("Okio Watchdog");
            setDaemon(true);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            ReentrantLock reentrantLockE;
            C0841c c0841cC;
            while (true) {
                try {
                    reentrantLockE = C0841c.f4095i.e();
                    reentrantLockE.lock();
                    try {
                        c0841cC = C0841c.f4095i.c();
                    } finally {
                        reentrantLockE.unlock();
                    }
                } catch (InterruptedException unused) {
                    continue;
                }
                if (c0841cC == C0841c.f4100n) {
                    a unused2 = C0841c.f4095i;
                    C0841c.f4100n = null;
                    return;
                } else {
                    C4015H c4015h = C4015H.f34254a;
                    reentrantLockE.unlock();
                    if (c0841cC != null) {
                        c0841cC.B();
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: Fe.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class C0064c implements H {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ H f4105b;

        public C0064c(H h10) {
            this.f4105b = h10;
        }

        @Override // Fe.H
        public void J(C0843e source, long j10) throws IOException {
            AbstractC4862t.e(source, "source");
            AbstractC0840b.b(source.size(), 0L, j10);
            while (true) {
                long j11 = 0;
                if (j10 <= 0) {
                    return;
                }
                E e10 = source.f4108a;
                AbstractC4862t.b(e10);
                while (true) {
                    if (j11 >= 65536) {
                        break;
                    }
                    j11 += (long) (e10.f4067c - e10.f4066b);
                    if (j11 >= j10) {
                        j11 = j10;
                        break;
                    } else {
                        e10 = e10.f4070f;
                        AbstractC4862t.b(e10);
                    }
                }
                C0841c c0841c = C0841c.this;
                H h10 = this.f4105b;
                c0841c.v();
                try {
                    try {
                        h10.J(source, j11);
                        C4015H c4015h = C4015H.f34254a;
                        if (c0841c.w()) {
                            throw c0841c.p(null);
                        }
                        j10 -= j11;
                    } catch (IOException e11) {
                        if (!c0841c.w()) {
                            throw e11;
                        }
                        throw c0841c.p(e11);
                    }
                } catch (Throwable th) {
                    c0841c.w();
                    throw th;
                }
            }
        }

        @Override // Fe.H
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C0841c n() {
            return C0841c.this;
        }

        @Override // Fe.H, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
        public void close() throws IOException {
            C0841c c0841c = C0841c.this;
            H h10 = this.f4105b;
            c0841c.v();
            try {
                h10.close();
                C4015H c4015h = C4015H.f34254a;
                if (c0841c.w()) {
                    throw c0841c.p(null);
                }
            } catch (IOException e10) {
                if (!c0841c.w()) {
                    throw e10;
                }
                throw c0841c.p(e10);
            } finally {
                c0841c.w();
            }
        }

        @Override // Fe.H, java.io.Flushable
        public void flush() throws IOException {
            C0841c c0841c = C0841c.this;
            H h10 = this.f4105b;
            c0841c.v();
            try {
                h10.flush();
                C4015H c4015h = C4015H.f34254a;
                if (c0841c.w()) {
                    throw c0841c.p(null);
                }
            } catch (IOException e10) {
                if (!c0841c.w()) {
                    throw e10;
                }
                throw c0841c.p(e10);
            } finally {
                c0841c.w();
            }
        }

        public String toString() {
            return "AsyncTimeout.sink(" + this.f4105b + ')';
        }
    }

    /* JADX INFO: renamed from: Fe.c$d */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class d implements J {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ J f4107b;

        public d(J j10) {
            this.f4107b = j10;
        }

        @Override // Fe.J
        public long V0(C0843e sink, long j10) throws IOException {
            AbstractC4862t.e(sink, "sink");
            C0841c c0841c = C0841c.this;
            J j11 = this.f4107b;
            c0841c.v();
            try {
                long jV0 = j11.V0(sink, j10);
                if (c0841c.w()) {
                    throw c0841c.p(null);
                }
                return jV0;
            } catch (IOException e10) {
                if (c0841c.w()) {
                    throw c0841c.p(e10);
                }
                throw e10;
            } finally {
                c0841c.w();
            }
        }

        @Override // Fe.J
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C0841c n() {
            return C0841c.this;
        }

        @Override // Fe.J, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            C0841c c0841c = C0841c.this;
            J j10 = this.f4107b;
            c0841c.v();
            try {
                j10.close();
                C4015H c4015h = C4015H.f34254a;
                if (c0841c.w()) {
                    throw c0841c.p(null);
                }
            } catch (IOException e10) {
                if (!c0841c.w()) {
                    throw e10;
                }
                throw c0841c.p(e10);
            } finally {
                c0841c.w();
            }
        }

        public String toString() {
            return "AsyncTimeout.source(" + this.f4107b + ')';
        }
    }

    static {
        ReentrantLock reentrantLock = new ReentrantLock();
        f4096j = reentrantLock;
        Condition conditionNewCondition = reentrantLock.newCondition();
        AbstractC4862t.d(conditionNewCondition, "newCondition(...)");
        f4097k = conditionNewCondition;
        long millis = TimeUnit.SECONDS.toMillis(60L);
        f4098l = millis;
        f4099m = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    public final J A(J source) {
        AbstractC4862t.e(source, "source");
        return new d(source);
    }

    public final IOException p(IOException iOException) {
        return x(iOException);
    }

    public final void v() {
        long jH = h();
        boolean zE = e();
        if (jH != 0 || zE) {
            ReentrantLock reentrantLock = f4096j;
            reentrantLock.lock();
            try {
                if (this.f4101f != 0) {
                    throw new IllegalStateException("Unbalanced enter/exit");
                }
                this.f4101f = 1;
                f4095i.f(this, jH, zE);
                C4015H c4015h = C4015H.f34254a;
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    public final boolean w() {
        ReentrantLock reentrantLock = f4096j;
        reentrantLock.lock();
        try {
            int i10 = this.f4101f;
            this.f4101f = 0;
            if (i10 != 1) {
                return i10 == 2;
            }
            f4095i.g(this);
            return false;
        } finally {
            reentrantLock.unlock();
        }
    }

    public IOException x(IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException(ProfilingTraceData.TRUNCATION_REASON_TIMEOUT);
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    public final long y(long j10) {
        return this.f4103h - j10;
    }

    public final H z(H sink) {
        AbstractC4862t.e(sink, "sink");
        return new C0064c(sink);
    }

    public void B() {
    }
}
