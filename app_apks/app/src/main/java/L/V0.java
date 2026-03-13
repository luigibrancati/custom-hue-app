package L;

import E.AbstractC0807p0;
import L.P0;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class V0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final U0 f7953b = U0.b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final V0 f7954c = new V0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final N0 f7955a = N0.h(f7953b);

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class a implements P0.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final X0.a f7956a;

        public a(X0.a aVar) {
            this.f7956a = aVar;
        }

        @Override // L.P0.a
        public void a(Object obj) {
            this.f7956a.accept(obj);
        }

        @Override // L.P0.a
        public void onError(Throwable th) {
            AbstractC0807p0.d("ObserverToConsumerAdapter", "Unexpected error in Observable", th);
        }
    }

    public static V0 b() {
        return f7954c;
    }

    public U0 a() {
        try {
            return (U0) this.f7955a.b().get();
        } catch (InterruptedException | ExecutionException e10) {
            throw new AssertionError("Unexpected error in QuirkSettings StateObservable", e10);
        }
    }

    public void c(Executor executor, X0.a aVar) {
        this.f7955a.c(executor, new a(aVar));
    }

    public void d(U0 u02) {
        this.f7955a.g(u02);
    }
}
