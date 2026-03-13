package oa;

/* JADX INFO: renamed from: oa.i, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class C5257i implements W3.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final X3.a f41416a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final X3.a f41417b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final X3.a f41418c;

    public C5257i(X3.a aVar, X3.a aVar2, X3.a aVar3) {
        this.f41416a = aVar;
        this.f41417b = aVar2;
        this.f41418c = aVar3;
    }

    public static C5257i a(X3.a aVar, X3.a aVar2, X3.a aVar3) {
        return new C5257i(aVar, aVar2, aVar3);
    }

    public static AbstractC5246D c(boolean z10, X3.a aVar, X3.a aVar2) {
        return (AbstractC5246D) W3.e.d(AbstractC5252d.e(z10, aVar, aVar2));
    }

    @Override // X3.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public AbstractC5246D get() {
        return c(((Boolean) this.f41416a.get()).booleanValue(), this.f41417b, this.f41418c);
    }
}
