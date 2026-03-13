package B0;

import java.util.Locale;
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

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class a implements O7.e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final boolean f532d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Logger f533e = Logger.getLogger(a.class.getName());

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final b f534f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Object f535g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile Object f536a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile e f537b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile h f538c;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static abstract class b {
        public b() {
        }

        public abstract boolean a(a aVar, e eVar, e eVar2);

        public abstract boolean b(a aVar, Object obj, Object obj2);

        public abstract boolean c(a aVar, h hVar, h hVar2);

        public abstract void d(h hVar, h hVar2);

        public abstract void e(h hVar, Thread thread);
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c f539c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final c f540d;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f541a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Throwable f542b;

        static {
            if (a.f532d) {
                f540d = null;
                f539c = null;
            } else {
                f540d = new c(false, null);
                f539c = new c(true, null);
            }
        }

        public c(boolean z10, Throwable th) {
            this.f541a = z10;
            this.f542b = th;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final d f543b = new d(new C0017a("Failure occurred while trying to finish a future."));

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Throwable f544a;

        /* JADX INFO: renamed from: B0.a$d$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public class C0017a extends Throwable {
            public C0017a(String str) {
                super(str);
            }

            @Override // java.lang.Throwable
            public synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        public d(Throwable th) {
            this.f544a = (Throwable) a.u(th);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class e {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final e f545d = new e(null, null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Runnable f546a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Executor f547b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public e f548c;

        public e(Runnable runnable, Executor executor) {
            this.f546a = runnable;
            this.f547b = executor;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class f extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater f549a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater f550b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater f551c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater f552d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater f553e;

        public f(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
            super();
            this.f549a = atomicReferenceFieldUpdater;
            this.f550b = atomicReferenceFieldUpdater2;
            this.f551c = atomicReferenceFieldUpdater3;
            this.f552d = atomicReferenceFieldUpdater4;
            this.f553e = atomicReferenceFieldUpdater5;
        }

        @Override // B0.a.b
        public boolean a(a aVar, e eVar, e eVar2) {
            return B0.b.a(this.f552d, aVar, eVar, eVar2);
        }

        @Override // B0.a.b
        public boolean b(a aVar, Object obj, Object obj2) {
            return B0.b.a(this.f553e, aVar, obj, obj2);
        }

        @Override // B0.a.b
        public boolean c(a aVar, h hVar, h hVar2) {
            return B0.b.a(this.f551c, aVar, hVar, hVar2);
        }

        @Override // B0.a.b
        public void d(h hVar, h hVar2) {
            this.f550b.lazySet(hVar, hVar2);
        }

        @Override // B0.a.b
        public void e(h hVar, Thread thread) {
            this.f549a.lazySet(hVar, thread);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class g extends b {
        public g() {
            super();
        }

        @Override // B0.a.b
        public boolean a(a aVar, e eVar, e eVar2) {
            synchronized (aVar) {
                try {
                    if (aVar.f537b != eVar) {
                        return false;
                    }
                    aVar.f537b = eVar2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // B0.a.b
        public boolean b(a aVar, Object obj, Object obj2) {
            synchronized (aVar) {
                try {
                    if (aVar.f536a != obj) {
                        return false;
                    }
                    aVar.f536a = obj2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // B0.a.b
        public boolean c(a aVar, h hVar, h hVar2) {
            synchronized (aVar) {
                try {
                    if (aVar.f538c != hVar) {
                        return false;
                    }
                    aVar.f538c = hVar2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // B0.a.b
        public void d(h hVar, h hVar2) {
            hVar.f556b = hVar2;
        }

        @Override // B0.a.b
        public void e(h hVar, Thread thread) {
            hVar.f555a = thread;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class h {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final h f554c = new h(false);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public volatile Thread f555a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public volatile h f556b;

        public h(boolean z10) {
        }

        public void a(h hVar) {
            a.f534f.d(this, hVar);
        }

        public void b() {
            Thread thread = this.f555a;
            if (thread != null) {
                this.f555a = null;
                LockSupport.unpark(thread);
            }
        }

        public h() {
            a.f534f.e(this, Thread.currentThread());
        }
    }

    static {
        b gVar;
        try {
            gVar = new f(AtomicReferenceFieldUpdater.newUpdater(h.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(h.class, h.class, "b"), AtomicReferenceFieldUpdater.newUpdater(a.class, h.class, "c"), AtomicReferenceFieldUpdater.newUpdater(a.class, e.class, "b"), AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "a"));
            th = null;
        } catch (Throwable th) {
            th = th;
            gVar = new g();
        }
        f534f = gVar;
        if (th != null) {
            f533e.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f535g = new Object();
    }

    public static CancellationException s(String str, Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }

    public static Object u(Object obj) {
        obj.getClass();
        return obj;
    }

    public static void w(a aVar) {
        aVar.C();
        aVar.q();
        e eVarV = aVar.v(null);
        while (eVarV != null) {
            e eVar = eVarV.f548c;
            x(eVarV.f546a, eVarV.f547b);
            eVarV = eVar;
        }
    }

    public static void x(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e10) {
            f533e.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e10);
        }
    }

    public static Object z(Future future) {
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

    /* JADX WARN: Multi-variable type inference failed */
    public String B() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    public final void C() {
        h hVar;
        do {
            hVar = this.f538c;
        } while (!f534f.c(this, hVar, h.f554c));
        while (hVar != null) {
            hVar.b();
            hVar = hVar.f556b;
        }
    }

    public final void D(h hVar) {
        hVar.f555a = null;
        while (true) {
            h hVar2 = this.f538c;
            if (hVar2 == h.f554c) {
                return;
            }
            h hVar3 = null;
            while (hVar2 != null) {
                h hVar4 = hVar2.f556b;
                if (hVar2.f555a != null) {
                    hVar3 = hVar2;
                } else if (hVar3 != null) {
                    hVar3.f556b = hVar4;
                    if (hVar3.f555a == null) {
                        break;
                    }
                } else if (!f534f.c(this, hVar2, hVar4)) {
                    break;
                }
                hVar2 = hVar4;
            }
            return;
        }
    }

    public boolean E(Object obj) {
        if (obj == null) {
            obj = f535g;
        }
        if (!f534f.b(this, null, obj)) {
            return false;
        }
        w(this);
        return true;
    }

    public boolean F(Throwable th) {
        if (!f534f.b(this, null, new d((Throwable) u(th)))) {
            return false;
        }
        w(this);
        return true;
    }

    public final String G(Object obj) {
        return obj == this ? "this future" : String.valueOf(obj);
    }

    public final boolean H() {
        Object obj = this.f536a;
        return (obj instanceof c) && ((c) obj).f541a;
    }

    @Override // O7.e
    public final void b(Runnable runnable, Executor executor) {
        u(runnable);
        u(executor);
        e eVar = this.f537b;
        if (eVar != e.f545d) {
            e eVar2 = new e(runnable, executor);
            do {
                eVar2.f548c = eVar;
                if (f534f.a(this, eVar, eVar2)) {
                    return;
                } else {
                    eVar = this.f537b;
                }
            } while (eVar != e.f545d);
        }
        x(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        Object obj = this.f536a;
        if (obj == null) {
            if (f534f.b(this, obj, f532d ? new c(z10, new CancellationException("Future.cancel() was called.")) : z10 ? c.f539c : c.f540d)) {
                if (z10) {
                    A();
                }
                w(this);
                return true;
            }
        }
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j10, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        long nanos = timeUnit.toNanos(j10);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f536a;
        if (obj != null) {
            return y(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            h hVar = this.f538c;
            if (hVar != h.f554c) {
                h hVar2 = new h();
                do {
                    hVar2.a(hVar);
                    if (f534f.c(this, hVar, hVar2)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                D(hVar2);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f536a;
                            if (obj2 != null) {
                                return y(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        D(hVar2);
                    } else {
                        hVar = this.f538c;
                    }
                } while (hVar != h.f554c);
            }
            return y(this.f536a);
        }
        while (nanos > 0) {
            Object obj3 = this.f536a;
            if (obj3 != null) {
                return y(obj3);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = jNanoTime - System.nanoTime();
        }
        String string = toString();
        String string2 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = string2.toLowerCase(locale);
        String str = "Waited " + j10 + StringUtils.SPACE + timeUnit.toString().toLowerCase(locale);
        if (nanos + 1000 < 0) {
            String str2 = str + " (plus ";
            long j11 = -nanos;
            long jConvert = timeUnit.convert(j11, TimeUnit.NANOSECONDS);
            long nanos2 = j11 - timeUnit.toNanos(jConvert);
            boolean z10 = jConvert == 0 || nanos2 > 1000;
            if (jConvert > 0) {
                String str3 = str2 + jConvert + StringUtils.SPACE + lowerCase;
                if (z10) {
                    str3 = str3 + ",";
                }
                str2 = str3 + StringUtils.SPACE;
            }
            if (z10) {
                str2 = str2 + nanos2 + " nanoseconds ";
            }
            str = str2 + "delay)";
        }
        if (isDone()) {
            throw new TimeoutException(str + " but future completed as timeout expired");
        }
        throw new TimeoutException(str + " for " + string);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f536a instanceof c;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f536a != null;
    }

    public final void p(StringBuilder sb2) {
        try {
            Object objZ = z(this);
            sb2.append("SUCCESS, result=[");
            sb2.append(G(objZ));
            sb2.append("]");
        } catch (CancellationException unused) {
            sb2.append("CANCELLED");
        } catch (RuntimeException e10) {
            sb2.append("UNKNOWN, cause=[");
            sb2.append(e10.getClass());
            sb2.append(" thrown from get()]");
        } catch (ExecutionException e11) {
            sb2.append("FAILURE, cause=[");
            sb2.append(e11.getCause());
            sb2.append("]");
        }
    }

    public String toString() {
        String strB;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append("[status=");
        if (isCancelled()) {
            sb2.append("CANCELLED");
        } else if (isDone()) {
            p(sb2);
        } else {
            try {
                strB = B();
            } catch (RuntimeException e10) {
                strB = "Exception thrown from implementation: " + e10.getClass();
            }
            if (strB != null && !strB.isEmpty()) {
                sb2.append("PENDING, info=[");
                sb2.append(strB);
                sb2.append("]");
            } else if (isDone()) {
                p(sb2);
            } else {
                sb2.append("PENDING");
            }
        }
        sb2.append("]");
        return sb2.toString();
    }

    public final e v(e eVar) {
        e eVar2;
        do {
            eVar2 = this.f537b;
        } while (!f534f.a(this, eVar2, e.f545d));
        while (true) {
            e eVar3 = eVar;
            eVar = eVar2;
            if (eVar == null) {
                return eVar3;
            }
            eVar2 = eVar.f548c;
            eVar.f548c = eVar3;
        }
    }

    public final Object y(Object obj) throws ExecutionException {
        if (obj instanceof c) {
            throw s("Task was cancelled.", ((c) obj).f542b);
        }
        if (obj instanceof d) {
            throw new ExecutionException(((d) obj).f544a);
        }
        if (obj == f535g) {
            return null;
        }
        return obj;
    }

    public void A() {
    }

    public void q() {
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws InterruptedException {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f536a;
            if (obj2 != null) {
                return y(obj2);
            }
            h hVar = this.f538c;
            if (hVar != h.f554c) {
                h hVar2 = new h();
                do {
                    hVar2.a(hVar);
                    if (f534f.c(this, hVar, hVar2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f536a;
                            } else {
                                D(hVar2);
                                throw new InterruptedException();
                            }
                        } while (!(obj != null));
                        return y(obj);
                    }
                    hVar = this.f538c;
                } while (hVar != h.f554c);
            }
            return y(this.f536a);
        }
        throw new InterruptedException();
    }
}
