package com.google.android.gms.internal.play_billing;

import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.tika.utils.StringUtils;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class c5 implements InterfaceFutureC3649z1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final boolean f30141d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Logger f30142e = Logger.getLogger(c5.class.getName());

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final F1 f30143f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Object f30144g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile Object f30145a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile C3651z3 f30146b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile a5 f30147c;

    static {
        F1 z42;
        try {
            z42 = new A4(AtomicReferenceFieldUpdater.newUpdater(a5.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(a5.class, a5.class, "b"), AtomicReferenceFieldUpdater.newUpdater(c5.class, a5.class, "c"), AtomicReferenceFieldUpdater.newUpdater(c5.class, C3651z3.class, "b"), AtomicReferenceFieldUpdater.newUpdater(c5.class, Object.class, "a"));
            th = null;
        } catch (Throwable th) {
            th = th;
            z42 = new Z4();
        }
        Throwable th2 = th;
        f30143f = z42;
        if (th2 != null) {
            f30142e.logp(Level.SEVERE, "com.android.billingclient.util.concurrent.AbstractResolvableFuture", "<clinit>", "SafeAtomicHelper is broken!", th2);
        }
        f30144g = new Object();
    }

    public static void d(c5 c5Var) {
        a5 a5Var;
        C3651z3 c3651z3;
        C3651z3 c3651z32;
        C3651z3 c3651z33;
        do {
            a5Var = c5Var.f30147c;
        } while (!f30143f.e(c5Var, a5Var, a5.f30126c));
        while (true) {
            c3651z3 = null;
            if (a5Var == null) {
                break;
            }
            Thread thread = a5Var.f30127a;
            if (thread != null) {
                a5Var.f30127a = null;
                LockSupport.unpark(thread);
            }
            a5Var = a5Var.f30128b;
        }
        do {
            c3651z32 = c5Var.f30146b;
        } while (!f30143f.c(c5Var, c3651z32, C3651z3.f30275d));
        while (true) {
            c3651z33 = c3651z3;
            c3651z3 = c3651z32;
            if (c3651z3 == null) {
                break;
            }
            c3651z32 = c3651z3.f30278c;
            c3651z3.f30278c = c3651z33;
        }
        while (c3651z33 != null) {
            Runnable runnable = c3651z33.f30276a;
            C3651z3 c3651z34 = c3651z33.f30278c;
            g(runnable, c3651z33.f30277b);
            c3651z33 = c3651z34;
        }
    }

    public static void g(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e10) {
            f30142e.logp(Level.SEVERE, "com.android.billingclient.util.concurrent.AbstractResolvableFuture", "executeListener", "RuntimeException while executing runnable " + String.valueOf(runnable) + " with executor " + String.valueOf(executor), (Throwable) e10);
        }
    }

    public static final Object i(Object obj) throws ExecutionException {
        if (obj instanceof C3537g2) {
            Throwable th = ((C3537g2) obj).f30174a;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof C3502a3) {
            throw new ExecutionException(((C3502a3) obj).f30124a);
        }
        if (obj == f30144g) {
            return null;
        }
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String c() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        Object obj = this.f30145a;
        if (obj == null) {
            if (f30143f.d(this, obj, f30141d ? new C3537g2(z10, new CancellationException("Future.cancel() was called.")) : z10 ? C3537g2.f30172b : C3537g2.f30173c)) {
                d(this);
                return true;
            }
        }
        return false;
    }

    public boolean e(Object obj) {
        if (obj == null) {
            obj = f30144g;
        }
        if (!f30143f.d(this, null, obj)) {
            return false;
        }
        d(this);
        return true;
    }

    public final void f(StringBuilder sb2) {
        Object obj;
        boolean z10 = false;
        while (true) {
            try {
                try {
                    obj = get();
                    break;
                } catch (CancellationException unused) {
                    sb2.append("CANCELLED");
                    return;
                } catch (RuntimeException e10) {
                    sb2.append("UNKNOWN, cause=[");
                    sb2.append(e10.getClass());
                    sb2.append(" thrown from get()]");
                    return;
                } catch (ExecutionException e11) {
                    sb2.append("FAILURE, cause=[");
                    sb2.append(e11.getCause());
                    sb2.append("]");
                    return;
                }
            } catch (InterruptedException unused2) {
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
        sb2.append("SUCCESS, result=[");
        sb2.append(obj == this ? "this future" : String.valueOf(obj));
        sb2.append("]");
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws InterruptedException {
        Object obj;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.f30145a;
        if (obj2 != null) {
            return i(obj2);
        }
        a5 a5Var = this.f30147c;
        if (a5Var != a5.f30126c) {
            a5 a5Var2 = new a5();
            do {
                F1 f12 = f30143f;
                f12.a(a5Var2, a5Var);
                if (f12.e(this, a5Var, a5Var2)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            h(a5Var2);
                            throw new InterruptedException();
                        }
                        obj = this.f30145a;
                    } while (!(obj != null));
                    return i(obj);
                }
                a5Var = this.f30147c;
            } while (a5Var != a5.f30126c);
        }
        return i(this.f30145a);
    }

    public final void h(a5 a5Var) {
        a5Var.f30127a = null;
        while (true) {
            a5 a5Var2 = this.f30147c;
            if (a5Var2 != a5.f30126c) {
                a5 a5Var3 = null;
                while (a5Var2 != null) {
                    a5 a5Var4 = a5Var2.f30128b;
                    if (a5Var2.f30127a != null) {
                        a5Var3 = a5Var2;
                    } else if (a5Var3 != null) {
                        a5Var3.f30128b = a5Var4;
                        if (a5Var3.f30127a == null) {
                            break;
                        }
                    } else if (!f30143f.e(this, a5Var2, a5Var4)) {
                        break;
                    }
                    a5Var2 = a5Var4;
                }
                return;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f30145a instanceof C3537g2;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f30145a != null;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceFutureC3649z1
    public final void j(Runnable runnable, Executor executor) {
        executor.getClass();
        C3651z3 c3651z3 = this.f30146b;
        if (c3651z3 != C3651z3.f30275d) {
            C3651z3 c3651z32 = new C3651z3(runnable, executor);
            do {
                c3651z32.f30278c = c3651z3;
                if (f30143f.c(this, c3651z3, c3651z32)) {
                    return;
                } else {
                    c3651z3 = this.f30146b;
                }
            } while (c3651z3 != C3651z3.f30275d);
        }
        g(runnable, executor);
    }

    public final String toString() {
        String strConcat;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append("[status=");
        if (this.f30145a instanceof C3537g2) {
            sb2.append("CANCELLED");
        } else if (isDone()) {
            f(sb2);
        } else {
            try {
                strConcat = c();
            } catch (RuntimeException e10) {
                strConcat = "Exception thrown from implementation: ".concat(String.valueOf(e10.getClass()));
            }
            if (strConcat != null && !strConcat.isEmpty()) {
                sb2.append("PENDING, info=[");
                sb2.append(strConcat);
                sb2.append("]");
            } else if (isDone()) {
                f(sb2);
            } else {
                sb2.append("PENDING");
            }
        }
        sb2.append("]");
        return sb2.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j10, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        long nanos = timeUnit.toNanos(j10);
        if (!Thread.interrupted()) {
            Object obj = this.f30145a;
            boolean z10 = true;
            if (obj != null) {
                return i(obj);
            }
            long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
            if (nanos >= 1000) {
                a5 a5Var = this.f30147c;
                if (a5Var != a5.f30126c) {
                    a5 a5Var2 = new a5();
                    do {
                        F1 f12 = f30143f;
                        f12.a(a5Var2, a5Var);
                        if (f12.e(this, a5Var, a5Var2)) {
                            do {
                                LockSupport.parkNanos(this, nanos);
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.f30145a;
                                    if (obj2 != null) {
                                        return i(obj2);
                                    }
                                    nanos = jNanoTime - System.nanoTime();
                                } else {
                                    h(a5Var2);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            h(a5Var2);
                        } else {
                            a5Var = this.f30147c;
                        }
                    } while (a5Var != a5.f30126c);
                }
                return i(this.f30145a);
            }
            while (nanos > 0) {
                Object obj3 = this.f30145a;
                if (obj3 != null) {
                    return i(obj3);
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
