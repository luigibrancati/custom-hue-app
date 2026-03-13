package b7;

import java.util.concurrent.Callable;

/* JADX INFO: renamed from: b7.N, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC2865N implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C2864M f25410a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Callable f25411b;

    public RunnableC2865N(C2864M c2864m, Callable callable) {
        this.f25410a = c2864m;
        this.f25411b = callable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f25410a.t(this.f25411b.call());
        } catch (Exception e10) {
            this.f25410a.v(e10);
        } catch (Throwable th) {
            this.f25410a.v(new RuntimeException(th));
        }
    }
}
