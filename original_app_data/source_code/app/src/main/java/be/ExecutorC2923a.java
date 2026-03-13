package be;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: be.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class ExecutorC2923a implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ExecutorC2923a f25501a = new ExecutorC2923a();

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        runnable.run();
    }
}
