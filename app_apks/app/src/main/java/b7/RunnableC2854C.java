package b7;

import com.google.android.gms.tasks.Task;
import java.util.Objects;

/* JADX INFO: renamed from: b7.C, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC2854C implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Task f25388a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C2855D f25389b;

    public RunnableC2854C(C2855D c2855d, Task task) {
        this.f25388a = task;
        Objects.requireNonNull(c2855d);
        this.f25389b = c2855d;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2855D c2855d = this.f25389b;
        synchronized (c2855d.a()) {
            try {
                if (c2855d.c() != null) {
                    c2855d.c().onSuccess(this.f25388a.m());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
