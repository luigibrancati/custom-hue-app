package G1;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: G1.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0854b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Executor f4279a;

    public static synchronized Executor a() {
        try {
            if (f4279a == null) {
                f4279a = M.N0("ExoPlayer:BackgroundExecutor");
            }
        } catch (Throwable th) {
            throw th;
        }
        return f4279a;
    }
}
