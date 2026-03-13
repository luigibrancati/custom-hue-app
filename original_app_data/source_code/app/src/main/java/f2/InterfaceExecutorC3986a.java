package f2;

import G1.InterfaceC0864l;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: f2.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceExecutorC3986a extends Executor {

    /* JADX INFO: renamed from: f2.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class C0438a implements InterfaceExecutorC3986a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Executor f34121a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC0864l f34122b;

        public C0438a(Executor executor, InterfaceC0864l interfaceC0864l) {
            this.f34121a = executor;
            this.f34122b = interfaceC0864l;
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            this.f34121a.execute(runnable);
        }

        @Override // f2.InterfaceExecutorC3986a
        public void release() {
            this.f34122b.accept(this.f34121a);
        }
    }

    static InterfaceExecutorC3986a S(Executor executor, InterfaceC0864l interfaceC0864l) {
        return new C0438a(executor, interfaceC0864l);
    }

    void release();
}
