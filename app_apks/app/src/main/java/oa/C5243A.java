package oa;

/* JADX INFO: renamed from: oa.A, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class C5243A implements W3.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final X3.a f41321a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final X3.a f41322b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final X3.a f41323c;

    public C5243A(X3.a aVar, X3.a aVar2, X3.a aVar3) {
        this.f41321a = aVar;
        this.f41322b = aVar2;
        this.f41323c = aVar3;
    }

    public static C5243A a(X3.a aVar, X3.a aVar2, X3.a aVar3) {
        return new C5243A(aVar, aVar2, aVar3);
    }

    public static C5272y c(String str, ta.F f10, Eb.k kVar) {
        return new C5272y(str, f10, kVar);
    }

    @Override // X3.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public C5272y get() {
        return c((String) this.f41321a.get(), (ta.F) this.f41322b.get(), (Eb.k) this.f41323c.get());
    }
}
