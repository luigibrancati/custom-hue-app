package ma;

import na.C5152b;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class p implements W3.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final X3.a f40259a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final X3.a f40260b;

    public p(X3.a aVar, X3.a aVar2) {
        this.f40259a = aVar;
        this.f40260b = aVar2;
    }

    public static p a(X3.a aVar, X3.a aVar2) {
        return new p(aVar, aVar2);
    }

    public static o c(C5152b c5152b, X3.a aVar) {
        return new o(c5152b, aVar);
    }

    @Override // X3.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public o get() {
        return c((C5152b) this.f40259a.get(), this.f40260b);
    }
}
