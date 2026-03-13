package O;

import B0.c;
import O.o;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import s.InterfaceC5702a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final InterfaceC5702a f10723a = new b();

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a implements O.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC5702a f10724a;

        public a(InterfaceC5702a interfaceC5702a) {
            this.f10724a = interfaceC5702a;
        }

        @Override // O.a
        public O7.e apply(Object obj) {
            return n.p(this.f10724a.apply(obj));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class c implements O.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ c.a f10725a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC5702a f10726b;

        public c(c.a aVar, InterfaceC5702a interfaceC5702a) {
            this.f10725a = aVar;
            this.f10726b = interfaceC5702a;
        }

        @Override // O.c
        public void a(Throwable th) {
            this.f10725a.f(th);
        }

        @Override // O.c
        public void onSuccess(Object obj) {
            try {
                this.f10725a.c(this.f10726b.apply(obj));
            } catch (Throwable th) {
                this.f10725a.f(th);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ O7.e f10727a;

        public d(O7.e eVar) {
            this.f10727a = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f10727a.cancel(true);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class e implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Future f10728a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final O.c f10729b;

        public e(Future future, O.c cVar) {
            this.f10728a = future;
            this.f10729b = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f10729b.onSuccess(n.l(this.f10728a));
            } catch (Error | RuntimeException e10) {
                this.f10729b.a(e10);
            } catch (ExecutionException e11) {
                Throwable cause = e11.getCause();
                if (cause == null) {
                    this.f10729b.a(e11);
                } else {
                    this.f10729b.a(cause);
                }
            }
        }

        public String toString() {
            return e.class.getSimpleName() + "," + this.f10729b;
        }
    }

    public static /* synthetic */ Object a(final O7.e eVar, ScheduledExecutorService scheduledExecutorService, final Object obj, final boolean z10, long j10, final c.a aVar) {
        t(eVar, aVar);
        if (!eVar.isDone()) {
            final ScheduledFuture<?> scheduledFutureSchedule = scheduledExecutorService.schedule(new Runnable() { // from class: O.i
                @Override // java.lang.Runnable
                public final void run() {
                    n.h(aVar, obj, z10, eVar);
                }
            }, j10, TimeUnit.MILLISECONDS);
            eVar.b(new Runnable() { // from class: O.j
                @Override // java.lang.Runnable
                public final void run() {
                    scheduledFutureSchedule.cancel(true);
                }
            }, N.a.a());
        }
        return "TimeoutFuture[" + eVar + "]";
    }

    public static /* synthetic */ Object c(O7.e eVar, c.a aVar) {
        v(false, eVar, f10723a, aVar, N.a.a());
        return "nonCancellationPropagating[" + eVar + "]";
    }

    public static /* synthetic */ Object d(final O7.e eVar, ScheduledExecutorService scheduledExecutorService, final long j10, final c.a aVar) {
        t(eVar, aVar);
        if (!eVar.isDone()) {
            final ScheduledFuture scheduledFutureSchedule = scheduledExecutorService.schedule(new Callable() { // from class: O.f
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return Boolean.valueOf(aVar.f(new TimeoutException("Future[" + eVar + "] is not done within " + j10 + " ms.")));
                }
            }, j10, TimeUnit.MILLISECONDS);
            eVar.b(new Runnable() { // from class: O.g
                @Override // java.lang.Runnable
                public final void run() {
                    scheduledFutureSchedule.cancel(true);
                }
            }, N.a.a());
        }
        return "TimeoutFuture[" + eVar + "]";
    }

    public static /* synthetic */ Object f(O7.e eVar, final c.a aVar) {
        eVar.b(new Runnable() { // from class: O.m
            @Override // java.lang.Runnable
            public final void run() {
                aVar.c(null);
            }
        }, N.a.a());
        return "transformVoidFuture [" + eVar + "]";
    }

    public static /* synthetic */ void h(c.a aVar, Object obj, boolean z10, O7.e eVar) {
        aVar.c(obj);
        if (z10) {
            eVar.cancel(true);
        }
    }

    public static void j(O7.e eVar, O.c cVar, Executor executor) {
        X0.h.g(cVar);
        eVar.b(new e(eVar, cVar), executor);
    }

    public static O7.e k(Collection collection) {
        return new p(new ArrayList(collection), true, N.a.a());
    }

    public static Object l(Future future) {
        X0.h.j(future.isDone(), "Future was expected to be done, " + future);
        return m(future);
    }

    public static Object m(Future future) {
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

    public static O7.e n(Throwable th) {
        return new o.a(th);
    }

    public static ScheduledFuture o(Throwable th) {
        return new o.b(th);
    }

    public static O7.e p(Object obj) {
        return obj == null ? o.p() : new o.c(obj);
    }

    public static O7.e q(final long j10, final ScheduledExecutorService scheduledExecutorService, final O7.e eVar) {
        return B0.c.a(new c.InterfaceC0018c() { // from class: O.e
            @Override // B0.c.InterfaceC0018c
            public final Object a(c.a aVar) {
                return n.d(eVar, scheduledExecutorService, j10, aVar);
            }
        });
    }

    public static O7.e r(final long j10, final ScheduledExecutorService scheduledExecutorService, final Object obj, final boolean z10, final O7.e eVar) {
        return B0.c.a(new c.InterfaceC0018c() { // from class: O.h
            @Override // B0.c.InterfaceC0018c
            public final Object a(c.a aVar) {
                return n.a(eVar, scheduledExecutorService, obj, z10, j10, aVar);
            }
        });
    }

    public static O7.e s(final O7.e eVar) {
        X0.h.g(eVar);
        return eVar.isDone() ? eVar : B0.c.a(new c.InterfaceC0018c() { // from class: O.k
            @Override // B0.c.InterfaceC0018c
            public final Object a(c.a aVar) {
                return n.c(eVar, aVar);
            }
        });
    }

    public static void t(O7.e eVar, c.a aVar) {
        u(eVar, f10723a, aVar, N.a.a());
    }

    public static void u(O7.e eVar, InterfaceC5702a interfaceC5702a, c.a aVar, Executor executor) {
        v(true, eVar, interfaceC5702a, aVar, executor);
    }

    public static void v(boolean z10, O7.e eVar, InterfaceC5702a interfaceC5702a, c.a aVar, Executor executor) {
        X0.h.g(eVar);
        X0.h.g(interfaceC5702a);
        X0.h.g(aVar);
        X0.h.g(executor);
        j(eVar, new c(aVar, interfaceC5702a), executor);
        if (z10) {
            aVar.a(new d(eVar), N.a.a());
        }
    }

    public static O7.e w(Collection collection) {
        return new p(new ArrayList(collection), false, N.a.a());
    }

    public static O7.e x(O7.e eVar, InterfaceC5702a interfaceC5702a, Executor executor) {
        X0.h.g(interfaceC5702a);
        return y(eVar, new a(interfaceC5702a), executor);
    }

    public static O7.e y(O7.e eVar, O.a aVar, Executor executor) {
        O.b bVar = new O.b(aVar, eVar);
        eVar.b(bVar, executor);
        return bVar;
    }

    public static O7.e z(final O7.e eVar) {
        return B0.c.a(new c.InterfaceC0018c() { // from class: O.l
            @Override // B0.c.InterfaceC0018c
            public final Object a(c.a aVar) {
                return n.f(eVar, aVar);
            }
        });
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class b implements InterfaceC5702a {
        @Override // s.InterfaceC5702a
        public Object apply(Object obj) {
            return obj;
        }
    }
}
