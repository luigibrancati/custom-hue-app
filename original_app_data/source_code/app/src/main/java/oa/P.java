package oa;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class P implements W3.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final X3.a f41351a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final X3.a f41352b;

    public P(X3.a aVar, X3.a aVar2) {
        this.f41351a = aVar;
        this.f41352b = aVar2;
    }

    public static P a(X3.a aVar, X3.a aVar2) {
        return new P(aVar, aVar2);
    }

    public static O c(j0 j0Var, int i10) {
        return new O(j0Var, i10);
    }

    @Override // X3.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public O get() {
        return c((j0) this.f41351a.get(), ((Integer) this.f41352b.get()).intValue());
    }
}
