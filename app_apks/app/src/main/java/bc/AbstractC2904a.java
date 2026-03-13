package bc;

import Eb.h;
import Eb.i;
import Eb.k;
import Eb.p;
import Eb.q;
import Eb.r;
import Eb.t;
import Ib.c;
import Jb.d;
import Jb.e;
import Lb.b;
import Vb.n;
import Yb.f;
import java.util.concurrent.Callable;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: renamed from: bc.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC2904a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile d f25486a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile e f25487b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile e f25488c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static volatile e f25489d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static volatile e f25490e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static volatile e f25491f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static volatile e f25492g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static volatile e f25493h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static volatile e f25494i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static volatile e f25495j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static volatile e f25496k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static volatile e f25497l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static volatile e f25498m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static volatile e f25499n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static volatile boolean f25500o;

    public static Object a(e eVar, Object obj) {
        try {
            return eVar.apply(obj);
        } catch (Throwable th) {
            throw f.d(th);
        }
    }

    public static q b(e eVar, Callable callable) {
        return (q) b.e(a(eVar, callable), "Scheduler Callable result can't be null");
    }

    public static q c(Callable callable) {
        try {
            return (q) b.e(callable.call(), "Scheduler Callable result can't be null");
        } catch (Throwable th) {
            throw f.d(th);
        }
    }

    public static q d(ThreadFactory threadFactory) {
        return new n((ThreadFactory) b.e(threadFactory, "threadFactory is null"));
    }

    public static q e(Callable callable) {
        b.e(callable, "Scheduler Callable can't be null");
        e eVar = f25488c;
        return eVar == null ? c(callable) : b(eVar, callable);
    }

    public static q f(Callable callable) {
        b.e(callable, "Scheduler Callable can't be null");
        e eVar = f25490e;
        return eVar == null ? c(callable) : b(eVar, callable);
    }

    public static q g(Callable callable) {
        b.e(callable, "Scheduler Callable can't be null");
        e eVar = f25491f;
        return eVar == null ? c(callable) : b(eVar, callable);
    }

    public static q h(Callable callable) {
        b.e(callable, "Scheduler Callable can't be null");
        e eVar = f25489d;
        return eVar == null ? c(callable) : b(eVar, callable);
    }

    public static boolean i(Throwable th) {
        return (th instanceof Ib.d) || (th instanceof c) || (th instanceof IllegalStateException) || (th instanceof NullPointerException) || (th instanceof IllegalArgumentException) || (th instanceof Ib.a);
    }

    public static Eb.a j(Eb.a aVar) {
        e eVar = f25499n;
        return eVar != null ? (Eb.a) a(eVar, aVar) : aVar;
    }

    public static Eb.f k(Eb.f fVar) {
        e eVar = f25494i;
        return eVar != null ? (Eb.f) a(eVar, fVar) : fVar;
    }

    public static h l(h hVar) {
        e eVar = f25497l;
        return eVar != null ? (h) a(eVar, hVar) : hVar;
    }

    public static k m(k kVar) {
        e eVar = f25495j;
        return eVar != null ? (k) a(eVar, kVar) : kVar;
    }

    public static r n(r rVar) {
        e eVar = f25498m;
        return eVar != null ? (r) a(eVar, rVar) : rVar;
    }

    public static Zb.a o(Zb.a aVar) {
        e eVar = f25496k;
        return eVar != null ? (Zb.a) a(eVar, aVar) : aVar;
    }

    public static q p(q qVar) {
        e eVar = f25492g;
        return eVar == null ? qVar : (q) a(eVar, qVar);
    }

    public static void q(Throwable th) {
        d dVar = f25486a;
        if (th == null) {
            th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        } else if (!i(th)) {
            th = new Ib.f(th);
        }
        if (dVar != null) {
            try {
                dVar.accept(th);
                return;
            } catch (Throwable th2) {
                th2.printStackTrace();
                z(th2);
            }
        }
        th.printStackTrace();
        z(th);
    }

    public static Runnable r(Runnable runnable) {
        b.e(runnable, "run is null");
        e eVar = f25487b;
        return eVar == null ? runnable : (Runnable) a(eVar, runnable);
    }

    public static q s(q qVar) {
        e eVar = f25493h;
        return eVar == null ? qVar : (q) a(eVar, qVar);
    }

    public static void y(d dVar) {
        if (f25500o) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        f25486a = dVar;
    }

    public static void z(Throwable th) {
        Thread threadCurrentThread = Thread.currentThread();
        threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th);
    }

    public static Eb.b t(Eb.a aVar, Eb.b bVar) {
        return bVar;
    }

    public static i u(h hVar, i iVar) {
        return iVar;
    }

    public static p v(k kVar, p pVar) {
        return pVar;
    }

    public static t w(r rVar, t tVar) {
        return tVar;
    }

    public static Ze.b x(Eb.f fVar, Ze.b bVar) {
        return bVar;
    }
}
