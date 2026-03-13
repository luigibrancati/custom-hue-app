package Pb;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class h extends Eb.f implements Mb.f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f13269b;

    public h(Object obj) {
        this.f13269b = obj;
    }

    @Override // Mb.f, java.util.concurrent.Callable
    public Object call() {
        return this.f13269b;
    }

    @Override // Eb.f
    public void j(Ze.b bVar) {
        bVar.d(new Xb.e(bVar, this.f13269b));
    }
}
