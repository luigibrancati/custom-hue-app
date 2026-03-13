package com.google.android.gms.internal.play_billing;

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

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.c1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3512c1 extends O1 implements InterfaceFutureC3649z1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final boolean f30134d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final C3643y1 f30135e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final R0 f30136f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Object f30137g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile Object f30138a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile U0 f30139b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile C3506b1 f30140c;

    static {
        boolean z10;
        Throwable th;
        Throwable th2;
        R0 x02;
        try {
            z10 = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z10 = false;
        }
        f30134d = z10;
        f30135e = new C3643y1(AbstractC3512c1.class);
        AbstractC3536g1 abstractC3536g1 = null;
        try {
            x02 = new C3500a1(abstractC3536g1);
            th2 = null;
            th = null;
        } catch (Error | Exception e10) {
            try {
                th = e10;
                x02 = new V0(AtomicReferenceFieldUpdater.newUpdater(C3506b1.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(C3506b1.class, C3506b1.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractC3512c1.class, C3506b1.class, "c"), AtomicReferenceFieldUpdater.newUpdater(AbstractC3512c1.class, U0.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractC3512c1.class, Object.class, "a"));
                th2 = null;
            } catch (Error | Exception e11) {
                th = e10;
                th2 = e11;
                x02 = new X0(abstractC3536g1);
            }
        }
        f30136f = x02;
        if (th2 != null) {
            C3643y1 c3643y1 = f30135e;
            Logger loggerA = c3643y1.a();
            Level level = Level.SEVERE;
            loggerA.logp(level, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "UnsafeAtomicHelper is broken!", th);
            c3643y1.a().logp(level, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "SafeAtomicHelper is broken!", th2);
        }
        f30137g = new Object();
    }

    public static final Object B(Object obj) throws ExecutionException {
        if (obj instanceof S0) {
            Throwable th = ((S0) obj).f30086b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof T0) {
            throw new ExecutionException(((T0) obj).f30090a);
        }
        if (obj == f30137g) {
            return null;
        }
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Object t(InterfaceFutureC3649z1 interfaceFutureC3649z1) {
        Throwable thC;
        if (interfaceFutureC3649z1 instanceof Y0) {
            Object s02 = ((AbstractC3512c1) interfaceFutureC3649z1).f30138a;
            if (s02 instanceof S0) {
                S0 s03 = (S0) s02;
                if (s03.f30085a) {
                    Throwable th = s03.f30086b;
                    s02 = th != null ? new S0(false, th) : S0.f30084d;
                }
            }
            Objects.requireNonNull(s02);
            return s02;
        }
        if ((interfaceFutureC3649z1 instanceof O1) && (thC = ((O1) interfaceFutureC3649z1).c()) != null) {
            return new T0(thC);
        }
        boolean zIsCancelled = interfaceFutureC3649z1.isCancelled();
        if ((!f30134d) && zIsCancelled) {
            S0 s04 = S0.f30084d;
            Objects.requireNonNull(s04);
            return s04;
        }
        try {
            Object objU = u(interfaceFutureC3649z1);
            if (!zIsCancelled) {
                return objU == null ? f30137g : objU;
            }
            return new S0(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + String.valueOf(interfaceFutureC3649z1)));
        } catch (Error | Exception e10) {
            return new T0(e10);
        } catch (CancellationException e11) {
            return !zIsCancelled ? new T0(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: ".concat(String.valueOf(interfaceFutureC3649z1)), e11)) : new S0(false, e11);
        } catch (ExecutionException e12) {
            return zIsCancelled ? new S0(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(String.valueOf(interfaceFutureC3649z1)), e12)) : new T0(e12.getCause());
        }
    }

    public static Object u(Future future) {
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

    public static void y(AbstractC3512c1 abstractC3512c1, boolean z10) {
        U0 u02;
        U0 u03 = null;
        while (true) {
            for (C3506b1 c3506b1B = f30136f.b(abstractC3512c1, C3506b1.f30129c); c3506b1B != null; c3506b1B = c3506b1B.f30131b) {
                Thread thread = c3506b1B.f30130a;
                if (thread != null) {
                    c3506b1B.f30130a = null;
                    LockSupport.unpark(thread);
                }
            }
            abstractC3512c1.o();
            U0 u04 = u03;
            U0 u0A = f30136f.a(abstractC3512c1, U0.f30097d);
            U0 u05 = u04;
            while (u0A != null) {
                U0 u06 = u0A.f30100c;
                u0A.f30100c = u05;
                u05 = u0A;
                u0A = u06;
            }
            while (u05 != null) {
                Runnable runnable = u05.f30098a;
                u02 = u05.f30100c;
                Objects.requireNonNull(runnable);
                Runnable runnable2 = runnable;
                if (runnable2 instanceof W0) {
                    W0 w02 = (W0) runnable2;
                    abstractC3512c1 = w02.f30108a;
                    if (abstractC3512c1.f30138a == w02) {
                        if (f30136f.f(abstractC3512c1, w02, t(w02.f30109b))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    Executor executor = u05.f30099b;
                    Objects.requireNonNull(executor);
                    z(runnable2, executor);
                }
                u05 = u02;
            }
            return;
            u03 = u02;
        }
    }

    public static void z(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e10) {
            f30135e.a().logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "executeListener", "RuntimeException while executing runnable " + String.valueOf(runnable) + " with executor " + String.valueOf(executor), (Throwable) e10);
        }
    }

    public final void A(C3506b1 c3506b1) {
        c3506b1.f30130a = null;
        while (true) {
            C3506b1 c3506b12 = this.f30140c;
            if (c3506b12 != C3506b1.f30129c) {
                C3506b1 c3506b13 = null;
                while (c3506b12 != null) {
                    C3506b1 c3506b14 = c3506b12.f30131b;
                    if (c3506b12.f30130a != null) {
                        c3506b13 = c3506b12;
                    } else if (c3506b13 != null) {
                        c3506b13.f30131b = c3506b14;
                        if (c3506b13.f30130a == null) {
                            break;
                        }
                    } else if (!f30136f.g(this, c3506b12, c3506b14)) {
                        break;
                    }
                    c3506b12 = c3506b14;
                }
                return;
            }
            return;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.O1
    public final Throwable c() {
        if (!(this instanceof Y0)) {
            return null;
        }
        Object obj = this.f30138a;
        if (obj instanceof T0) {
            return ((T0) obj).f30090a;
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
            java.lang.Object r0 = r6.f30138a
            boolean r1 = r0 instanceof com.google.android.gms.internal.play_billing.W0
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
            boolean r1 = com.google.android.gms.internal.play_billing.AbstractC3512c1.f30134d
            if (r1 == 0) goto L1f
            com.google.android.gms.internal.play_billing.S0 r1 = new com.google.android.gms.internal.play_billing.S0
            java.util.concurrent.CancellationException r4 = new java.util.concurrent.CancellationException
            java.lang.String r5 = "Future.cancel() was called."
            r4.<init>(r5)
            r1.<init>(r7, r4)
            goto L29
        L1f:
            if (r7 == 0) goto L24
            com.google.android.gms.internal.play_billing.S0 r1 = com.google.android.gms.internal.play_billing.S0.f30083c
            goto L26
        L24:
            com.google.android.gms.internal.play_billing.S0 r1 = com.google.android.gms.internal.play_billing.S0.f30084d
        L26:
            java.util.Objects.requireNonNull(r1)
        L29:
            r4 = r2
        L2a:
            com.google.android.gms.internal.play_billing.R0 r5 = com.google.android.gms.internal.play_billing.AbstractC3512c1.f30136f
            boolean r5 = r5.f(r6, r0, r1)
            if (r5 == 0) goto L56
            y(r6, r7)
            boolean r6 = r0 instanceof com.google.android.gms.internal.play_billing.W0
            if (r6 == 0) goto L55
            com.google.android.gms.internal.play_billing.W0 r0 = (com.google.android.gms.internal.play_billing.W0) r0
            com.google.android.gms.internal.play_billing.z1 r6 = r0.f30109b
            boolean r0 = r6 instanceof com.google.android.gms.internal.play_billing.Y0
            if (r0 == 0) goto L52
            com.google.android.gms.internal.play_billing.c1 r6 = (com.google.android.gms.internal.play_billing.AbstractC3512c1) r6
            java.lang.Object r0 = r6.f30138a
            if (r0 != 0) goto L49
            r4 = r3
            goto L4a
        L49:
            r4 = r2
        L4a:
            boolean r5 = r0 instanceof com.google.android.gms.internal.play_billing.W0
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
            java.lang.Object r0 = r6.f30138a
            boolean r5 = r0 instanceof com.google.android.gms.internal.play_billing.W0
            if (r5 != 0) goto L2a
            return r4
        L5d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.AbstractC3512c1.cancel(boolean):boolean");
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws InterruptedException {
        Object obj;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.f30138a;
        if ((obj2 != null) && (!(obj2 instanceof W0))) {
            return B(obj2);
        }
        C3506b1 c3506b1 = this.f30140c;
        if (c3506b1 != C3506b1.f30129c) {
            C3506b1 c3506b12 = new C3506b1();
            do {
                R0 r02 = f30136f;
                r02.c(c3506b12, c3506b1);
                if (r02.g(this, c3506b1, c3506b12)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            A(c3506b12);
                            throw new InterruptedException();
                        }
                        obj = this.f30138a;
                    } while (!((obj != null) & (!(obj instanceof W0))));
                    return B(obj);
                }
                c3506b1 = this.f30140c;
            } while (c3506b1 != C3506b1.f30129c);
        }
        Object obj3 = this.f30138a;
        Objects.requireNonNull(obj3);
        return B(obj3);
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
        return this.f30138a instanceof S0;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return (this.f30138a != null) & (!(r2 instanceof W0));
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceFutureC3649z1
    public final void j(Runnable runnable, Executor executor) {
        U0 u02;
        AbstractC3629w.c(executor, "Executor was null.");
        if (!isDone() && (u02 = this.f30139b) != U0.f30097d) {
            U0 u03 = new U0(runnable, executor);
            do {
                u03.f30100c = u02;
                if (f30136f.e(this, u02, u03)) {
                    return;
                } else {
                    u02 = this.f30139b;
                }
            } while (u02 != U0.f30097d);
        }
        z(runnable, executor);
    }

    public final boolean p(Object obj) {
        if (obj == null) {
            obj = f30137g;
        }
        if (!f30136f.f(this, null, obj)) {
            return false;
        }
        y(this, false);
        return true;
    }

    public final boolean q(Throwable th) {
        if (!f30136f.f(this, null, new T0(th))) {
            return false;
        }
        y(this, false);
        return true;
    }

    public final boolean r(InterfaceFutureC3649z1 interfaceFutureC3649z1) {
        T0 t02;
        Object obj = this.f30138a;
        if (obj == null) {
            if (interfaceFutureC3649z1.isDone()) {
                if (!f30136f.f(this, null, t(interfaceFutureC3649z1))) {
                    return false;
                }
                y(this, false);
                return true;
            }
            W0 w02 = new W0(this, interfaceFutureC3649z1);
            if (f30136f.f(this, null, w02)) {
                try {
                    interfaceFutureC3649z1.j(w02, EnumC3548i1.INSTANCE);
                } catch (Throwable th) {
                    try {
                        t02 = new T0(th);
                    } catch (Error | Exception unused) {
                        t02 = T0.f30089b;
                    }
                    f30136f.f(this, w02, t02);
                }
                return true;
            }
            obj = this.f30138a;
        }
        if (obj instanceof S0) {
            interfaceFutureC3649z1.cancel(((S0) obj).f30085a);
        }
        return false;
    }

    public final boolean s() {
        Object obj = this.f30138a;
        return (obj instanceof S0) && ((S0) obj).f30085a;
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
        if (this.f30138a instanceof S0) {
            sb2.append("CANCELLED");
        } else if (isDone()) {
            v(sb2);
        } else {
            w(sb2);
        }
        sb2.append("]");
        return sb2.toString();
    }

    public final void v(StringBuilder sb2) {
        try {
            Object objU = u(this);
            sb2.append("SUCCESS, result=[");
            if (objU == null) {
                sb2.append("null");
            } else if (objU == this) {
                sb2.append("this future");
            } else {
                sb2.append(objU.getClass().getName());
                sb2.append("@");
                sb2.append(Integer.toHexString(System.identityHashCode(objU)));
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

    /* JADX WARN: Removed duplicated region for block: B:9:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void w(java.lang.StringBuilder r6) {
        /*
            r5 = this;
            int r0 = r6.length()
            java.lang.String r1 = "PENDING"
            r6.append(r1)
            java.lang.Object r1 = r5.f30138a
            boolean r2 = r1 instanceof com.google.android.gms.internal.play_billing.W0
            java.lang.String r3 = "]"
            if (r2 == 0) goto L21
            java.lang.String r2 = ", setFuture=["
            r6.append(r2)
            com.google.android.gms.internal.play_billing.W0 r1 = (com.google.android.gms.internal.play_billing.W0) r1
            com.google.android.gms.internal.play_billing.z1 r1 = r1.f30109b
            r5.x(r6, r1)
            r6.append(r3)
            goto L4c
        L21:
            java.lang.String r1 = r5.i()     // Catch: java.lang.Throwable -> L30
            r2 = 0
            if (r1 == 0) goto L2e
            boolean r4 = r1.isEmpty()     // Catch: java.lang.Throwable -> L30
            if (r4 == 0) goto L3f
        L2e:
            r1 = r2
            goto L3f
        L30:
            r1 = move-exception
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r2 = "Exception thrown from implementation: "
            java.lang.String r1 = r2.concat(r1)
        L3f:
            if (r1 == 0) goto L4c
            java.lang.String r2 = ", info=["
            r6.append(r2)
            r6.append(r1)
            r6.append(r3)
        L4c:
            boolean r1 = r5.isDone()
            if (r1 == 0) goto L5c
            int r1 = r6.length()
            r6.delete(r0, r1)
            r5.v(r6)
        L5c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.AbstractC3512c1.w(java.lang.StringBuilder):void");
    }

    public final void x(StringBuilder sb2, Object obj) {
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

    public void o() {
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j10, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        long nanos = timeUnit.toNanos(j10);
        if (!Thread.interrupted()) {
            Object obj = this.f30138a;
            boolean z10 = true;
            if ((obj != null) & (!(obj instanceof W0))) {
                return B(obj);
            }
            long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
            if (nanos >= 1000) {
                C3506b1 c3506b1 = this.f30140c;
                if (c3506b1 != C3506b1.f30129c) {
                    C3506b1 c3506b12 = new C3506b1();
                    do {
                        R0 r02 = f30136f;
                        r02.c(c3506b12, c3506b1);
                        if (r02.g(this, c3506b1, c3506b12)) {
                            do {
                                LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.f30138a;
                                    if ((obj2 != null) & (!(obj2 instanceof W0))) {
                                        return B(obj2);
                                    }
                                    nanos = jNanoTime - System.nanoTime();
                                } else {
                                    A(c3506b12);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            A(c3506b12);
                        } else {
                            c3506b1 = this.f30140c;
                        }
                    } while (c3506b1 != C3506b1.f30129c);
                }
                Object obj3 = this.f30138a;
                Objects.requireNonNull(obj3);
                return B(obj3);
            }
            while (nanos > 0) {
                Object obj4 = this.f30138a;
                if ((obj4 != null) & (!(obj4 instanceof W0))) {
                    return B(obj4);
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
