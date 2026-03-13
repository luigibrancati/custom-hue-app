package b7;

import com.google.android.gms.tasks.Task;
import java.util.Objects;

/* JADX INFO: renamed from: b7.y, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC2891y implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Task f25442a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C2892z f25443b;

    public RunnableC2891y(C2892z c2892z, Task task) {
        this.f25442a = task;
        Objects.requireNonNull(c2892z);
        this.f25443b = c2892z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2892z c2892z = this.f25443b;
        synchronized (c2892z.a()) {
            try {
                if (c2892z.c() != null) {
                    c2892z.c().a(this.f25442a);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
