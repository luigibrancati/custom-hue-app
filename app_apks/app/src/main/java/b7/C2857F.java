package b7;

import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: b7.F, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C2857F implements InterfaceC2874h, InterfaceC2873g, InterfaceC2871e, InterfaceC2858G {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f25395a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC2877k f25396b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C2864M f25397c;

    public C2857F(Executor executor, InterfaceC2877k interfaceC2877k, C2864M c2864m) {
        this.f25395a = executor;
        this.f25396b = interfaceC2877k;
        this.f25397c = c2864m;
    }

    @Override // b7.InterfaceC2871e
    public final void a() {
        this.f25397c.x();
    }

    @Override // b7.InterfaceC2858G
    public final void b(Task task) {
        this.f25395a.execute(new RunnableC2856E(this, task));
    }

    @Override // b7.InterfaceC2873g
    public final void c(Exception exc) {
        this.f25397c.v(exc);
    }

    public final /* synthetic */ InterfaceC2877k d() {
        return this.f25396b;
    }

    @Override // b7.InterfaceC2874h
    public final void onSuccess(Object obj) {
        this.f25397c.t(obj);
    }

    @Override // b7.InterfaceC2858G
    public final void zzb() {
        throw new UnsupportedOperationException();
    }
}
