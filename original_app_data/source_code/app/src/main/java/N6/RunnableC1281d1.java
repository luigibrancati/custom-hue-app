package N6;

/* JADX INFO: renamed from: N6.d1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC1281d1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC1346i1 f10205a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final E1 f10206b;

    public RunnableC1281d1(AbstractC1346i1 abstractC1346i1, E1 e12) {
        this.f10205a = abstractC1346i1;
        this.f10206b = e12;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f10205a.f10310a != this) {
            return;
        }
        E1 e12 = this.f10206b;
        if (AbstractC1346i1.f10308f.f(this.f10205a, this, AbstractC1346i1.s(e12))) {
            AbstractC1346i1.x(this.f10205a, false);
        }
    }
}
