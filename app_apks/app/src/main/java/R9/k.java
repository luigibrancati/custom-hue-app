package R9;

import M6.AbstractC1232x;
import b7.AbstractC2867a;
import b7.C2868b;
import b7.C2878l;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import v6.AbstractC6056k;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicInteger f14964b = new AtomicInteger(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f14965c = new AtomicBoolean(false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f14963a = new n();

    public Task a(final Executor executor, final Callable callable, final AbstractC2867a abstractC2867a) {
        AbstractC6056k.p(this.f14964b.get() > 0);
        if (abstractC2867a.a()) {
            return Tasks.c();
        }
        final C2868b c2868b = new C2868b();
        final C2878l c2878l = new C2878l(c2868b.b());
        this.f14963a.a(new Executor() { // from class: R9.y
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                try {
                    executor.execute(runnable);
                } catch (RuntimeException e10) {
                    if (abstractC2867a.a()) {
                        c2868b.a();
                    } else {
                        c2878l.b(e10);
                    }
                    throw e10;
                }
            }
        }, new Runnable() { // from class: R9.z
            @Override // java.lang.Runnable
            public final void run() {
                this.f15015a.g(abstractC2867a, c2868b, callable, c2878l);
            }
        });
        return c2878l.a();
    }

    public abstract void b();

    public void c() {
        this.f14964b.incrementAndGet();
    }

    public abstract void d();

    public void e(Executor executor) {
        f(executor);
    }

    public Task f(Executor executor) {
        AbstractC6056k.p(this.f14964b.get() > 0);
        final C2878l c2878l = new C2878l();
        this.f14963a.a(executor, new Runnable() { // from class: R9.x
            @Override // java.lang.Runnable
            public final void run() {
                this.f15009a.h(c2878l);
            }
        });
        return c2878l.a();
    }

    public final /* synthetic */ void g(AbstractC2867a abstractC2867a, C2868b c2868b, Callable callable, C2878l c2878l) {
        try {
            if (abstractC2867a.a()) {
                c2868b.a();
                return;
            }
            try {
                if (!this.f14965c.get()) {
                    b();
                    this.f14965c.set(true);
                }
                if (abstractC2867a.a()) {
                    c2868b.a();
                    return;
                }
                Object objCall = callable.call();
                if (abstractC2867a.a()) {
                    c2868b.a();
                } else {
                    c2878l.c(objCall);
                }
            } catch (RuntimeException e10) {
                throw new N9.a("Internal error has occurred when executing ML Kit tasks", 13, e10);
            }
        } catch (Exception e11) {
            if (abstractC2867a.a()) {
                c2868b.a();
            } else {
                c2878l.b(e11);
            }
        }
    }

    public final /* synthetic */ void h(C2878l c2878l) {
        int iDecrementAndGet = this.f14964b.decrementAndGet();
        AbstractC6056k.p(iDecrementAndGet >= 0);
        if (iDecrementAndGet == 0) {
            d();
            this.f14965c.set(false);
        }
        AbstractC1232x.a();
        c2878l.c(null);
    }
}
