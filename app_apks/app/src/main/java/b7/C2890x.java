package b7;

import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: b7.x, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C2890x implements InterfaceC2858G {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f25439a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f25440b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public InterfaceC2871e f25441c;

    public C2890x(Executor executor, InterfaceC2871e interfaceC2871e) {
        this.f25439a = executor;
        this.f25441c = interfaceC2871e;
    }

    public final /* synthetic */ Object a() {
        return this.f25440b;
    }

    @Override // b7.InterfaceC2858G
    public final void b(Task task) {
        if (task.o()) {
            synchronized (this.f25440b) {
                try {
                    if (this.f25441c == null) {
                        return;
                    }
                    this.f25439a.execute(new RunnableC2889w(this));
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final /* synthetic */ InterfaceC2871e c() {
        return this.f25441c;
    }

    @Override // b7.InterfaceC2858G
    public final void zzb() {
        synchronized (this.f25440b) {
            this.f25441c = null;
        }
    }
}
