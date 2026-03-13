package oa;

import ta.C5871i;

/* JADX INFO: renamed from: oa.F, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class C5248F implements W3.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final X3.a f41331a;

    public C5248F(X3.a aVar) {
        this.f41331a = aVar;
    }

    public static C5248F a(X3.a aVar) {
        return new C5248F(aVar);
    }

    public static C5247E c(C5871i c5871i) {
        return new C5247E(c5871i);
    }

    @Override // X3.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public C5247E get() {
        return c((C5871i) this.f41331a.get());
    }
}
