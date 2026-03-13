package Rd;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: renamed from: Rd.x0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class C2162x0 extends E0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f15210f = AtomicIntegerFieldUpdater.newUpdater(C2162x0.class, "_invoked$volatile");
    private volatile /* synthetic */ int _invoked$volatile;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final vc.l f15211e;

    public C2162x0(vc.l lVar) {
        this.f15211e = lVar;
    }

    @Override // Rd.E0
    public boolean v() {
        return true;
    }

    @Override // Rd.E0
    public void w(Throwable th) {
        if (f15210f.compareAndSet(this, 0, 1)) {
            this.f15211e.invoke(th);
        }
    }
}
