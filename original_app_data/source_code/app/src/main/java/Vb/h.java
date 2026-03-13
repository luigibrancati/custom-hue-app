package Vb;

import Eb.q;
import bc.AbstractC2904a;
import java.util.concurrent.Callable;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class h extends q.c implements Hb.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ScheduledExecutorService f17434a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile boolean f17435b;

    public h(ThreadFactory threadFactory) {
        this.f17434a = m.a(threadFactory);
    }

    @Override // Eb.q.c
    public Hb.c b(Runnable runnable) {
        return c(runnable, 0L, null);
    }

    @Override // Eb.q.c
    public Hb.c c(Runnable runnable, long j10, TimeUnit timeUnit) {
        return this.f17435b ? Kb.d.INSTANCE : e(runnable, j10, timeUnit, null);
    }

    @Override // Hb.c
    public void dispose() {
        if (this.f17435b) {
            return;
        }
        this.f17435b = true;
        this.f17434a.shutdownNow();
    }

    public l e(Runnable runnable, long j10, TimeUnit timeUnit, Kb.b bVar) {
        l lVar = new l(AbstractC2904a.r(runnable), bVar);
        if (bVar != null && !bVar.a(lVar)) {
            return lVar;
        }
        try {
            lVar.a(j10 <= 0 ? this.f17434a.submit((Callable) lVar) : this.f17434a.schedule((Callable) lVar, j10, timeUnit));
            return lVar;
        } catch (RejectedExecutionException e10) {
            if (bVar != null) {
                bVar.b(lVar);
            }
            AbstractC2904a.q(e10);
            return lVar;
        }
    }

    public Hb.c f(Runnable runnable, long j10, TimeUnit timeUnit) {
        k kVar = new k(AbstractC2904a.r(runnable));
        try {
            kVar.a(j10 <= 0 ? this.f17434a.submit(kVar) : this.f17434a.schedule(kVar, j10, timeUnit));
            return kVar;
        } catch (RejectedExecutionException e10) {
            AbstractC2904a.q(e10);
            return Kb.d.INSTANCE;
        }
    }

    public Hb.c g(Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
        Runnable runnableR = AbstractC2904a.r(runnable);
        if (j11 <= 0) {
            e eVar = new e(runnableR, this.f17434a);
            try {
                eVar.b(j10 <= 0 ? this.f17434a.submit(eVar) : this.f17434a.schedule(eVar, j10, timeUnit));
                return eVar;
            } catch (RejectedExecutionException e10) {
                AbstractC2904a.q(e10);
                return Kb.d.INSTANCE;
            }
        }
        j jVar = new j(runnableR);
        try {
            jVar.a(this.f17434a.scheduleAtFixedRate(jVar, j10, j11, timeUnit));
            return jVar;
        } catch (RejectedExecutionException e11) {
            AbstractC2904a.q(e11);
            return Kb.d.INSTANCE;
        }
    }

    public void h() {
        if (this.f17435b) {
            return;
        }
        this.f17435b = true;
        this.f17434a.shutdown();
    }

    @Override // Hb.c
    public boolean j() {
        return this.f17435b;
    }
}
