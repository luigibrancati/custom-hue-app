package P;

import L.InterfaceC1099g0;
import L.Y0;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public interface r extends Y0 {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final InterfaceC1099g0.a f12543O = InterfaceC1099g0.a.a("camerax.core.thread.backgroundExecutor", Executor.class);

    default Executor a0(Executor executor) {
        return (Executor) c(f12543O, executor);
    }
}
