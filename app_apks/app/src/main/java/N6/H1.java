package N6;

import java.util.concurrent.RunnableFuture;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class H1 extends AbstractC1450q1 implements RunnableFuture {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public volatile C1 f9750h;

    public H1(C1382kb c1382kb) {
        this.f9750h = new G1(this, c1382kb);
    }

    @Override // N6.AbstractC1346i1
    public final String i() {
        C1 c12 = this.f9750h;
        if (c12 == null) {
            return super.i();
        }
        return "task=[" + c12.toString() + "]";
    }

    @Override // N6.AbstractC1346i1
    public final void o() {
        C1 c12;
        if (r() && (c12 = this.f9750h) != null) {
            c12.e();
        }
        this.f9750h = null;
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        C1 c12 = this.f9750h;
        if (c12 != null) {
            c12.run();
        }
        this.f9750h = null;
    }
}
