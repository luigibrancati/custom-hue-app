package X6;

import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: X6.c4, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class ExecutorC2361c4 implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ R4 f18730a;

    public ExecutorC2361c4(R4 r42) {
        Objects.requireNonNull(r42);
        this.f18730a = r42;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f18730a.f18400a.b().t(runnable);
    }
}
