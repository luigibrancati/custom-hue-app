package b7;

import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: b7.B, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C2853B implements InterfaceC2858G {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f25385a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f25386b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public InterfaceC2873g f25387c;

    public C2853B(Executor executor, InterfaceC2873g interfaceC2873g) {
        this.f25385a = executor;
        this.f25387c = interfaceC2873g;
    }

    public final /* synthetic */ Object a() {
        return this.f25386b;
    }

    @Override // b7.InterfaceC2858G
    public final void b(Task task) {
        if (task.q() || task.o()) {
            return;
        }
        synchronized (this.f25386b) {
            try {
                if (this.f25387c == null) {
                    return;
                }
                this.f25385a.execute(new RunnableC2852A(this, task));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final /* synthetic */ InterfaceC2873g c() {
        return this.f25387c;
    }

    @Override // b7.InterfaceC2858G
    public final void zzb() {
        synchronized (this.f25386b) {
            this.f25387c = null;
        }
    }
}
