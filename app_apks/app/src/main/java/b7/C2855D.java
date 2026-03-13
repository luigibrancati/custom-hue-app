package b7;

import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: b7.D, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C2855D implements InterfaceC2858G {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f25390a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f25391b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public InterfaceC2874h f25392c;

    public C2855D(Executor executor, InterfaceC2874h interfaceC2874h) {
        this.f25390a = executor;
        this.f25392c = interfaceC2874h;
    }

    public final /* synthetic */ Object a() {
        return this.f25391b;
    }

    @Override // b7.InterfaceC2858G
    public final void b(Task task) {
        if (task.q()) {
            synchronized (this.f25391b) {
                try {
                    if (this.f25392c == null) {
                        return;
                    }
                    this.f25390a.execute(new RunnableC2854C(this, task));
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final /* synthetic */ InterfaceC2874h c() {
        return this.f25392c;
    }

    @Override // b7.InterfaceC2858G
    public final void zzb() {
        synchronized (this.f25391b) {
            this.f25392c = null;
        }
    }
}
