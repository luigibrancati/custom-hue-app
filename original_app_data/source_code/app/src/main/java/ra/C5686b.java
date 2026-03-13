package ra;

/* JADX INFO: renamed from: ra.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class C5686b implements W3.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final X3.a f43867a;

    public C5686b(X3.a aVar) {
        this.f43867a = aVar;
    }

    public static C5686b a(X3.a aVar) {
        return new C5686b(aVar);
    }

    public static C5685a c(int i10) {
        return new C5685a(i10);
    }

    @Override // X3.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public C5685a get() {
        return c(((Integer) this.f43867a.get()).intValue());
    }
}
