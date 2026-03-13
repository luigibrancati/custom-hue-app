package Rd;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: renamed from: Rd.s0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC2152s0 {
    public static final Executor a(I i10) {
        Executor executorJ0;
        AbstractC2149q0 abstractC2149q0 = i10 instanceof AbstractC2149q0 ? (AbstractC2149q0) i10 : null;
        return (abstractC2149q0 == null || (executorJ0 = abstractC2149q0.J0()) == null) ? new ExecutorC2121c0(i10) : executorJ0;
    }

    public static final I b(Executor executor) {
        I i10;
        ExecutorC2121c0 executorC2121c0 = executor instanceof ExecutorC2121c0 ? (ExecutorC2121c0) executor : null;
        return (executorC2121c0 == null || (i10 = executorC2121c0.f15163a) == null) ? new C2150r0(executor) : i10;
    }

    public static final AbstractC2149q0 c(ExecutorService executorService) {
        return new C2150r0(executorService);
    }
}
