package I3;

import Rd.AbstractC2152s0;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.AbstractC4862t;
import lc.InterfaceC4989f;
import lc.InterfaceC4992i;
import s3.AbstractC5712a;

/* JADX INFO: renamed from: I3.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0873c {

    /* JADX INFO: renamed from: I3.c$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a implements ThreadFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AtomicInteger f5592a = new AtomicInteger(0);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean f5593b;

        public a(boolean z10) {
            this.f5593b = z10;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            AbstractC4862t.e(runnable, "runnable");
            return new Thread(runnable, (this.f5593b ? "WM.task-" : "androidx.work-") + this.f5592a.incrementAndGet());
        }
    }

    /* JADX INFO: renamed from: I3.c$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b implements I {
        @Override // I3.I
        public void a(String label) {
            AbstractC4862t.e(label, "label");
            AbstractC5712a.b(label);
        }

        @Override // I3.I
        public void b(String methodName, int i10) {
            AbstractC4862t.e(methodName, "methodName");
            AbstractC5712a.c(methodName, i10);
        }

        @Override // I3.I
        public void c(String methodName, int i10) {
            AbstractC4862t.e(methodName, "methodName");
            AbstractC5712a.a(methodName, i10);
        }

        @Override // I3.I
        public void d() {
            AbstractC5712a.d();
        }

        @Override // I3.I
        public boolean isEnabled() {
            return AbstractC5712a.e();
        }
    }

    public static final Executor d(InterfaceC4992i interfaceC4992i) {
        InterfaceC4989f interfaceC4989f = interfaceC4992i != null ? (InterfaceC4989f) interfaceC4992i.get(InterfaceC4989f.f40086j0) : null;
        Rd.I i10 = interfaceC4989f instanceof Rd.I ? (Rd.I) interfaceC4989f : null;
        if (i10 != null) {
            return AbstractC2152s0.a(i10);
        }
        return null;
    }

    public static final Executor e(boolean z10) {
        ExecutorService executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), new a(z10));
        AbstractC4862t.d(executorServiceNewFixedThreadPool, "newFixedThreadPool(...)");
        return executorServiceNewFixedThreadPool;
    }

    public static final I f() {
        return new b();
    }
}
