package b7;

import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: b7.v, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C2888v implements InterfaceC2874h, InterfaceC2873g, InterfaceC2871e, InterfaceC2858G {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f25435a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC2869c f25436b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C2864M f25437c;

    public C2888v(Executor executor, InterfaceC2869c interfaceC2869c, C2864M c2864m) {
        this.f25435a = executor;
        this.f25436b = interfaceC2869c;
        this.f25437c = c2864m;
    }

    @Override // b7.InterfaceC2871e
    public final void a() {
        this.f25437c.x();
    }

    @Override // b7.InterfaceC2858G
    public final void b(Task task) {
        this.f25435a.execute(new RunnableC2887u(this, task));
    }

    @Override // b7.InterfaceC2873g
    public final void c(Exception exc) {
        this.f25437c.v(exc);
    }

    public final /* synthetic */ InterfaceC2869c d() {
        return this.f25436b;
    }

    public final /* synthetic */ C2864M e() {
        return this.f25437c;
    }

    @Override // b7.InterfaceC2874h
    public final void onSuccess(Object obj) {
        this.f25437c.t(obj);
    }

    @Override // b7.InterfaceC2858G
    public final void zzb() {
        throw new UnsupportedOperationException();
    }
}
