package K3;

import I3.G;
import J3.C0916y;
import J3.c0;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final G f7439a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c0 f7440b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f7441c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f7442d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Map f7443e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public d(G runnableScheduler, c0 launcher) {
        this(runnableScheduler, launcher, 0L, 4, null);
        AbstractC4862t.e(runnableScheduler, "runnableScheduler");
        AbstractC4862t.e(launcher, "launcher");
    }

    public static final void d(d dVar, C0916y c0916y) {
        dVar.f7440b.c(c0916y, 3);
    }

    public final void b(C0916y token) {
        Runnable runnable;
        AbstractC4862t.e(token, "token");
        synchronized (this.f7442d) {
            runnable = (Runnable) this.f7443e.remove(token);
        }
        if (runnable != null) {
            this.f7439a.a(runnable);
        }
    }

    public final void c(final C0916y token) {
        AbstractC4862t.e(token, "token");
        Runnable runnable = new Runnable() { // from class: K3.c
            @Override // java.lang.Runnable
            public final void run() {
                d.d(this.f7437a, token);
            }
        };
        synchronized (this.f7442d) {
        }
        this.f7439a.b(this.f7441c, runnable);
    }

    public d(G runnableScheduler, c0 launcher, long j10) {
        AbstractC4862t.e(runnableScheduler, "runnableScheduler");
        AbstractC4862t.e(launcher, "launcher");
        this.f7439a = runnableScheduler;
        this.f7440b = launcher;
        this.f7441c = j10;
        this.f7442d = new Object();
        this.f7443e = new LinkedHashMap();
    }

    public /* synthetic */ d(G g10, c0 c0Var, long j10, int i10, AbstractC4854k abstractC4854k) {
        this(g10, c0Var, (i10 & 4) != 0 ? TimeUnit.MINUTES.toMillis(90L) : j10);
    }
}
