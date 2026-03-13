package N6;

import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.tika.utils.StringUtils;

/* JADX INFO: renamed from: N6.i1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1346i1 extends I1 implements E1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final boolean f10306d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final D1 f10307e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Y0 f10308f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Object f10309g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile Object f10310a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile C1255b1 f10311b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile C1333h1 f10312c;

    static {
        boolean z10;
        Throwable th;
        Throwable th2;
        Y0 c1294e1;
        try {
            z10 = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z10 = false;
        }
        f10306d = z10;
        f10307e = new D1(AbstractC1346i1.class);
        byte b10 = 0;
        try {
            c1294e1 = new C1320g1(null);
            th2 = null;
            th = null;
        } catch (Error | Exception e10) {
            try {
                th = e10;
                c1294e1 = new C1268c1(AtomicReferenceFieldUpdater.newUpdater(C1333h1.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(C1333h1.class, C1333h1.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractC1346i1.class, C1333h1.class, "c"), AtomicReferenceFieldUpdater.newUpdater(AbstractC1346i1.class, C1255b1.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractC1346i1.class, Object.class, "a"));
                th2 = null;
            } catch (Error | Exception e11) {
                th = e10;
                th2 = e11;
                c1294e1 = new C1294e1(b10 == true ? 1 : 0);
            }
        }
        f10308f = c1294e1;
        if (th2 != null) {
            D1 d12 = f10307e;
            Logger loggerA = d12.a();
            Level level = Level.SEVERE;
            loggerA.logp(level, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "UnsafeAtomicHelper is broken!", th);
            d12.a().logp(level, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "SafeAtomicHelper is broken!", th2);
        }
        f10309g = new Object();
    }

    public static final Object A(Object obj) throws ExecutionException {
        if (obj instanceof Z0) {
            Throwable th = ((Z0) obj).f10149b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof C1242a1) {
            throw new ExecutionException(((C1242a1) obj).f10167a);
        }
        if (obj == f10309g) {
            return null;
        }
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Object s(E1 e12) {
        Throwable thC;
        if (e12 instanceof InterfaceC1307f1) {
            Object z02 = ((AbstractC1346i1) e12).f10310a;
            if (z02 instanceof Z0) {
                Z0 z03 = (Z0) z02;
                if (z03.f10148a) {
                    Throwable th = z03.f10149b;
                    z02 = th != null ? new Z0(false, th) : Z0.f10147d;
                }
            }
            Objects.requireNonNull(z02);
            return z02;
        }
        if ((e12 instanceof I1) && (thC = ((I1) e12).c()) != null) {
            return new C1242a1(thC);
        }
        boolean zIsCancelled = e12.isCancelled();
        if ((!f10306d) && zIsCancelled) {
            Z0 z04 = Z0.f10147d;
            Objects.requireNonNull(z04);
            return z04;
        }
        try {
            Object objT = t(e12);
            if (!zIsCancelled) {
                return objT == null ? f10309g : objT;
            }
            return new Z0(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + String.valueOf(e12)));
        } catch (Error | Exception e10) {
            return new C1242a1(e10);
        } catch (CancellationException e11) {
            return !zIsCancelled ? new C1242a1(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: ".concat(String.valueOf(e12)), e11)) : new Z0(false, e11);
        } catch (ExecutionException e13) {
            return zIsCancelled ? new Z0(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(String.valueOf(e12)), e13)) : new C1242a1(e13.getCause());
        }
    }

    public static Object t(Future future) {
        Object obj;
        boolean z10 = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z10 = true;
            } catch (Throwable th) {
                if (z10) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    public static void x(AbstractC1346i1 abstractC1346i1, boolean z10) {
        C1255b1 c1255b1;
        C1255b1 c1255b12 = null;
        while (true) {
            for (C1333h1 c1333h1B = f10308f.b(abstractC1346i1, C1333h1.f10293c); c1333h1B != null; c1333h1B = c1333h1B.f10295b) {
                Thread thread = c1333h1B.f10294a;
                if (thread != null) {
                    c1333h1B.f10294a = null;
                    LockSupport.unpark(thread);
                }
            }
            abstractC1346i1.o();
            C1255b1 c1255b13 = c1255b12;
            C1255b1 c1255b1A = f10308f.a(abstractC1346i1, C1255b1.f10176d);
            C1255b1 c1255b14 = c1255b13;
            while (c1255b1A != null) {
                C1255b1 c1255b15 = c1255b1A.f10179c;
                c1255b1A.f10179c = c1255b14;
                c1255b14 = c1255b1A;
                c1255b1A = c1255b15;
            }
            while (c1255b14 != null) {
                Runnable runnable = c1255b14.f10177a;
                c1255b1 = c1255b14.f10179c;
                Objects.requireNonNull(runnable);
                Runnable runnable2 = runnable;
                if (runnable2 instanceof RunnableC1281d1) {
                    RunnableC1281d1 runnableC1281d1 = (RunnableC1281d1) runnable2;
                    abstractC1346i1 = runnableC1281d1.f10205a;
                    if (abstractC1346i1.f10310a == runnableC1281d1) {
                        if (f10308f.f(abstractC1346i1, runnableC1281d1, s(runnableC1281d1.f10206b))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    Executor executor = c1255b14.f10178b;
                    Objects.requireNonNull(executor);
                    y(runnable2, executor);
                }
                c1255b14 = c1255b1;
            }
            return;
            c1255b12 = c1255b1;
        }
    }

    public static void y(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e10) {
            f10307e.a().logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "executeListener", "RuntimeException while executing runnable " + String.valueOf(runnable) + " with executor " + String.valueOf(executor), (Throwable) e10);
        }
    }

    @Override // N6.E1
    public final void a(Runnable runnable, Executor executor) {
        C1255b1 c1255b1;
        AbstractC1564z.c(executor, "Executor was null.");
        if (!isDone() && (c1255b1 = this.f10311b) != C1255b1.f10176d) {
            C1255b1 c1255b12 = new C1255b1(runnable, executor);
            do {
                c1255b12.f10179c = c1255b1;
                if (f10308f.e(this, c1255b1, c1255b12)) {
                    return;
                } else {
                    c1255b1 = this.f10311b;
                }
            } while (c1255b1 != C1255b1.f10176d);
        }
        y(runnable, executor);
    }

    @Override // N6.I1
    public final Throwable c() {
        if (!(this instanceof InterfaceC1307f1)) {
            return null;
        }
        Object obj = this.f10310a;
        if (obj instanceof C1242a1) {
            return ((C1242a1) obj).f10167a;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0055, code lost:
    
        return true;
     */
    @Override // java.util.concurrent.Future
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean cancel(boolean r7) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.f10310a
            boolean r1 = r0 instanceof N6.RunnableC1281d1
            r2 = 0
            r3 = 1
            if (r0 != 0) goto La
            r4 = r3
            goto Lb
        La:
            r4 = r2
        Lb:
            r1 = r1 | r4
            if (r1 == 0) goto L5d
            boolean r1 = N6.AbstractC1346i1.f10306d
            if (r1 == 0) goto L1f
            N6.Z0 r1 = new N6.Z0
            java.util.concurrent.CancellationException r4 = new java.util.concurrent.CancellationException
            java.lang.String r5 = "Future.cancel() was called."
            r4.<init>(r5)
            r1.<init>(r7, r4)
            goto L29
        L1f:
            if (r7 == 0) goto L24
            N6.Z0 r1 = N6.Z0.f10146c
            goto L26
        L24:
            N6.Z0 r1 = N6.Z0.f10147d
        L26:
            java.util.Objects.requireNonNull(r1)
        L29:
            r4 = r2
        L2a:
            N6.Y0 r5 = N6.AbstractC1346i1.f10308f
            boolean r5 = r5.f(r6, r0, r1)
            if (r5 == 0) goto L56
            x(r6, r7)
            boolean r6 = r0 instanceof N6.RunnableC1281d1
            if (r6 == 0) goto L55
            N6.d1 r0 = (N6.RunnableC1281d1) r0
            N6.E1 r6 = r0.f10206b
            boolean r0 = r6 instanceof N6.InterfaceC1307f1
            if (r0 == 0) goto L52
            N6.i1 r6 = (N6.AbstractC1346i1) r6
            java.lang.Object r0 = r6.f10310a
            if (r0 != 0) goto L49
            r4 = r3
            goto L4a
        L49:
            r4 = r2
        L4a:
            boolean r5 = r0 instanceof N6.RunnableC1281d1
            r4 = r4 | r5
            if (r4 == 0) goto L51
            r4 = r3
            goto L2a
        L51:
            return r3
        L52:
            r6.cancel(r7)
        L55:
            return r3
        L56:
            java.lang.Object r0 = r6.f10310a
            boolean r5 = r0 instanceof N6.RunnableC1281d1
            if (r5 != 0) goto L2a
            return r4
        L5d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: N6.AbstractC1346i1.cancel(boolean):boolean");
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws InterruptedException {
        Object obj;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.f10310a;
        if ((obj2 != null) && (!(obj2 instanceof RunnableC1281d1))) {
            return A(obj2);
        }
        C1333h1 c1333h1 = this.f10312c;
        if (c1333h1 != C1333h1.f10293c) {
            C1333h1 c1333h12 = new C1333h1();
            do {
                Y0 y02 = f10308f;
                y02.c(c1333h12, c1333h1);
                if (y02.g(this, c1333h1, c1333h12)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            z(c1333h12);
                            throw new InterruptedException();
                        }
                        obj = this.f10310a;
                    } while (!((obj != null) & (!(obj instanceof RunnableC1281d1))));
                    return A(obj);
                }
                c1333h1 = this.f10312c;
            } while (c1333h1 != C1333h1.f10293c);
        }
        Object obj3 = this.f10310a;
        Objects.requireNonNull(obj3);
        return A(obj3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String i() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f10310a instanceof Z0;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return (this.f10310a != null) & (!(r2 instanceof RunnableC1281d1));
    }

    public final boolean p(Throwable th) {
        if (!f10308f.f(this, null, new C1242a1(th))) {
            return false;
        }
        x(this, false);
        return true;
    }

    public final boolean q(E1 e12) {
        C1242a1 c1242a1;
        e12.getClass();
        Object obj = this.f10310a;
        if (obj == null) {
            if (e12.isDone()) {
                if (!f10308f.f(this, null, s(e12))) {
                    return false;
                }
                x(this, false);
                return true;
            }
            RunnableC1281d1 runnableC1281d1 = new RunnableC1281d1(this, e12);
            if (f10308f.f(this, null, runnableC1281d1)) {
                try {
                    e12.a(runnableC1281d1, EnumC1437p1.INSTANCE);
                } catch (Throwable th) {
                    try {
                        c1242a1 = new C1242a1(th);
                    } catch (Error | Exception unused) {
                        c1242a1 = C1242a1.f10166b;
                    }
                    f10308f.f(this, runnableC1281d1, c1242a1);
                }
                return true;
            }
            obj = this.f10310a;
        }
        if (obj instanceof Z0) {
            e12.cancel(((Z0) obj).f10148a);
        }
        return false;
    }

    public final boolean r() {
        Object obj = this.f10310a;
        return (obj instanceof Z0) && ((Z0) obj).f10148a;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        if (getClass().getName().startsWith("com.google.common.util.concurrent.")) {
            sb2.append(getClass().getSimpleName());
        } else {
            sb2.append(getClass().getName());
        }
        sb2.append('@');
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("[status=");
        if (this.f10310a instanceof Z0) {
            sb2.append("CANCELLED");
        } else if (isDone()) {
            u(sb2);
        } else {
            v(sb2);
        }
        sb2.append("]");
        return sb2.toString();
    }

    public final void u(StringBuilder sb2) {
        try {
            Object objT = t(this);
            sb2.append("SUCCESS, result=[");
            if (objT == null) {
                sb2.append("null");
            } else if (objT == this) {
                sb2.append("this future");
            } else {
                sb2.append(objT.getClass().getName());
                sb2.append("@");
                sb2.append(Integer.toHexString(System.identityHashCode(objT)));
            }
            sb2.append("]");
        } catch (CancellationException unused) {
            sb2.append("CANCELLED");
        } catch (ExecutionException e10) {
            sb2.append("FAILURE, cause=[");
            sb2.append(e10.getCause());
            sb2.append("]");
        } catch (Exception e11) {
            sb2.append("UNKNOWN, cause=[");
            sb2.append(e11.getClass());
            sb2.append(" thrown from get()]");
        }
    }

    public final void v(StringBuilder sb2) {
        String strConcat;
        int length = sb2.length();
        sb2.append("PENDING");
        Object obj = this.f10310a;
        if (obj instanceof RunnableC1281d1) {
            sb2.append(", setFuture=[");
            w(sb2, ((RunnableC1281d1) obj).f10206b);
            sb2.append("]");
        } else {
            try {
                strConcat = A.a(i());
            } catch (Exception | StackOverflowError e10) {
                strConcat = "Exception thrown from implementation: ".concat(String.valueOf(e10.getClass()));
            }
            if (strConcat != null) {
                sb2.append(", info=[");
                sb2.append(strConcat);
                sb2.append("]");
            }
        }
        if (isDone()) {
            sb2.delete(length, sb2.length());
            u(sb2);
        }
    }

    public final void w(StringBuilder sb2, Object obj) {
        try {
            if (obj == this) {
                sb2.append("this future");
            } else {
                sb2.append(obj);
            }
        } catch (Exception | StackOverflowError e10) {
            sb2.append("Exception thrown from implementation: ");
            sb2.append(e10.getClass());
        }
    }

    public final void z(C1333h1 c1333h1) {
        c1333h1.f10294a = null;
        while (true) {
            C1333h1 c1333h12 = this.f10312c;
            if (c1333h12 != C1333h1.f10293c) {
                C1333h1 c1333h13 = null;
                while (c1333h12 != null) {
                    C1333h1 c1333h14 = c1333h12.f10295b;
                    if (c1333h12.f10294a != null) {
                        c1333h13 = c1333h12;
                    } else if (c1333h13 != null) {
                        c1333h13.f10295b = c1333h14;
                        if (c1333h13.f10294a == null) {
                            break;
                        }
                    } else if (!f10308f.g(this, c1333h12, c1333h14)) {
                        break;
                    }
                    c1333h12 = c1333h14;
                }
                return;
            }
            return;
        }
    }

    public void o() {
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j10, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        long nanos = timeUnit.toNanos(j10);
        if (!Thread.interrupted()) {
            Object obj = this.f10310a;
            boolean z10 = true;
            if ((obj != null) & (!(obj instanceof RunnableC1281d1))) {
                return A(obj);
            }
            long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
            if (nanos >= 1000) {
                C1333h1 c1333h1 = this.f10312c;
                if (c1333h1 != C1333h1.f10293c) {
                    C1333h1 c1333h12 = new C1333h1();
                    do {
                        Y0 y02 = f10308f;
                        y02.c(c1333h12, c1333h1);
                        if (y02.g(this, c1333h1, c1333h12)) {
                            do {
                                LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.f10310a;
                                    if ((obj2 != null) & (!(obj2 instanceof RunnableC1281d1))) {
                                        return A(obj2);
                                    }
                                    nanos = jNanoTime - System.nanoTime();
                                } else {
                                    z(c1333h12);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            z(c1333h12);
                        } else {
                            c1333h1 = this.f10312c;
                        }
                    } while (c1333h1 != C1333h1.f10293c);
                }
                Object obj3 = this.f10310a;
                Objects.requireNonNull(obj3);
                return A(obj3);
            }
            while (nanos > 0) {
                Object obj4 = this.f10310a;
                if ((obj4 != null) & (!(obj4 instanceof RunnableC1281d1))) {
                    return A(obj4);
                }
                if (!Thread.interrupted()) {
                    nanos = jNanoTime - System.nanoTime();
                } else {
                    throw new InterruptedException();
                }
            }
            String string = toString();
            String string2 = timeUnit.toString();
            Locale locale = Locale.ROOT;
            String lowerCase = string2.toLowerCase(locale);
            String strConcat = "Waited " + j10 + StringUtils.SPACE + timeUnit.toString().toLowerCase(locale);
            if (nanos + 1000 < 0) {
                String strConcat2 = strConcat.concat(" (plus ");
                long j11 = -nanos;
                long jConvert = timeUnit.convert(j11, TimeUnit.NANOSECONDS);
                long nanos2 = j11 - timeUnit.toNanos(jConvert);
                if (jConvert != 0 && nanos2 <= 1000) {
                    z10 = false;
                }
                if (jConvert > 0) {
                    String strConcat3 = strConcat2 + jConvert + StringUtils.SPACE + lowerCase;
                    if (z10) {
                        strConcat3 = strConcat3.concat(",");
                    }
                    strConcat2 = strConcat3.concat(StringUtils.SPACE);
                }
                if (z10) {
                    strConcat2 = strConcat2 + nanos2 + " nanoseconds ";
                }
                strConcat = strConcat2.concat("delay)");
            }
            if (isDone()) {
                throw new TimeoutException(strConcat.concat(" but future completed as timeout expired"));
            }
            throw new TimeoutException(strConcat + " for " + string);
        }
        throw new InterruptedException();
    }
}
