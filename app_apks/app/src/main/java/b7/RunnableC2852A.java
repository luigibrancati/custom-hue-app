package b7;

import com.google.android.gms.tasks.Task;
import java.util.Objects;
import v6.AbstractC6056k;

/* JADX INFO: renamed from: b7.A, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC2852A implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Task f25383a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C2853B f25384b;

    public RunnableC2852A(C2853B c2853b, Task task) {
        this.f25383a = task;
        Objects.requireNonNull(c2853b);
        this.f25384b = c2853b;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2853B c2853b = this.f25384b;
        synchronized (c2853b.a()) {
            try {
                if (c2853b.c() != null) {
                    c2853b.c().c((Exception) AbstractC6056k.l(this.f25383a.l()));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
