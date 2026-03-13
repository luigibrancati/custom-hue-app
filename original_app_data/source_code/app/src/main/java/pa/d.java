package pa;

import ta.C5871i;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class d implements W3.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final X3.a f42515a;

    public d(X3.a aVar) {
        this.f42515a = aVar;
    }

    public static d a(X3.a aVar) {
        return new d(aVar);
    }

    public static C5452c c(C5871i c5871i) {
        return new C5452c(c5871i);
    }

    @Override // X3.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public C5452c get() {
        return c((C5871i) this.f42515a.get());
    }
}
