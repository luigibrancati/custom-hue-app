package K3;

import I3.AbstractC0890u;
import I3.G;
import I3.InterfaceC0872b;
import J3.InterfaceC0912u;
import Q3.I;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f7413e = AbstractC0890u.i("DelayedWorkTracker");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC0912u f7414a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final G f7415b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC0872b f7416c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map f7417d = new HashMap();

    /* JADX INFO: renamed from: K3.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class RunnableC0112a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ I f7418a;

        public RunnableC0112a(I i10) {
            this.f7418a = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC0890u.e().a(a.f7413e, "Scheduling work " + this.f7418a.f13588a);
            a.this.f7414a.e(this.f7418a);
        }
    }

    public a(InterfaceC0912u interfaceC0912u, G g10, InterfaceC0872b interfaceC0872b) {
        this.f7414a = interfaceC0912u;
        this.f7415b = g10;
        this.f7416c = interfaceC0872b;
    }

    public void a(I i10, long j10) {
        Runnable runnable = (Runnable) this.f7417d.remove(i10.f13588a);
        if (runnable != null) {
            this.f7415b.a(runnable);
        }
        RunnableC0112a runnableC0112a = new RunnableC0112a(i10);
        this.f7417d.put(i10.f13588a, runnableC0112a);
        this.f7415b.b(j10 - this.f7416c.a(), runnableC0112a);
    }

    public void b(String str) {
        Runnable runnable = (Runnable) this.f7417d.remove(str);
        if (runnable != null) {
            this.f7415b.a(runnable);
        }
    }
}
