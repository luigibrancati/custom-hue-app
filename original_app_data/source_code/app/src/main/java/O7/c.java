package O7;

import J7.h;
import J7.n;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class c extends d {

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Future f12080a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final b f12081b;

        public a(Future future, b bVar) {
            this.f12080a = future;
            this.f12081b = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f12081b.onSuccess(c.b(this.f12080a));
            } catch (ExecutionException e10) {
                this.f12081b.a(e10.getCause());
            } catch (Throwable th) {
                this.f12081b.a(th);
            }
        }

        public String toString() {
            return h.b(this).c(this.f12081b).toString();
        }
    }

    public static void a(e eVar, b bVar, Executor executor) {
        n.j(bVar);
        eVar.b(new a(eVar, bVar), executor);
    }

    public static Object b(Future future) {
        n.q(future.isDone(), "Future was expected to be done: %s", future);
        return g.a(future);
    }
}
