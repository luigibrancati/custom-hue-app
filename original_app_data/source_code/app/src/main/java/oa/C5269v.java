package oa;

/* JADX INFO: renamed from: oa.v, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class C5269v implements W3.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final X3.a f41490a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final X3.a f41491b;

    public C5269v(X3.a aVar, X3.a aVar2) {
        this.f41490a = aVar;
        this.f41491b = aVar2;
    }

    public static C5269v a(X3.a aVar, X3.a aVar2) {
        return new C5269v(aVar, aVar2);
    }

    public static C5268u c(sa.d dVar, qa.k kVar) {
        return new C5268u(dVar, kVar);
    }

    @Override // X3.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public C5268u get() {
        return c((sa.d) this.f41490a.get(), (qa.k) this.f41491b.get());
    }
}
