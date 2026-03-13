package b7;

import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: b7.z, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C2892z implements InterfaceC2858G {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f25444a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f25445b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public InterfaceC2872f f25446c;

    public C2892z(Executor executor, InterfaceC2872f interfaceC2872f) {
        this.f25444a = executor;
        this.f25446c = interfaceC2872f;
    }

    public final /* synthetic */ Object a() {
        return this.f25445b;
    }

    @Override // b7.InterfaceC2858G
    public final void b(Task task) {
        synchronized (this.f25445b) {
            try {
                if (this.f25446c == null) {
                    return;
                }
                this.f25444a.execute(new RunnableC2891y(this, task));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final /* synthetic */ InterfaceC2872f c() {
        return this.f25446c;
    }

    @Override // b7.InterfaceC2858G
    public final void zzb() {
        synchronized (this.f25445b) {
            this.f25446c = null;
        }
    }
}
