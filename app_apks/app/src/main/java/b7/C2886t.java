package b7;

import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: b7.t, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C2886t implements InterfaceC2858G {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f25430a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC2869c f25431b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C2864M f25432c;

    public C2886t(Executor executor, InterfaceC2869c interfaceC2869c, C2864M c2864m) {
        this.f25430a = executor;
        this.f25431b = interfaceC2869c;
        this.f25432c = c2864m;
    }

    public final /* synthetic */ InterfaceC2869c a() {
        return this.f25431b;
    }

    @Override // b7.InterfaceC2858G
    public final void b(Task task) {
        this.f25430a.execute(new RunnableC2885s(this, task));
    }

    public final /* synthetic */ C2864M c() {
        return this.f25432c;
    }

    @Override // b7.InterfaceC2858G
    public final void zzb() {
        throw new UnsupportedOperationException();
    }
}
