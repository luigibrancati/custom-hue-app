package oa;

/* JADX INFO: renamed from: oa.C, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class C5245C implements W3.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final X3.a f41328a;

    public C5245C(X3.a aVar) {
        this.f41328a = aVar;
    }

    public static C5245C a(X3.a aVar) {
        return new C5245C(aVar);
    }

    public static C5244B c(AbstractC5246D abstractC5246D) {
        return new C5244B(abstractC5246D);
    }

    @Override // X3.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public C5244B get() {
        return c((AbstractC5246D) this.f41328a.get());
    }
}
