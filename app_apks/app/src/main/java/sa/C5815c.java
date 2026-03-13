package sa;

import Eb.q;

/* JADX INFO: renamed from: sa.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class C5815c implements W3.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final X3.a f44405a;

    public C5815c(X3.a aVar) {
        this.f44405a = aVar;
    }

    public static C5815c a(X3.a aVar) {
        return new C5815c(aVar);
    }

    public static C5814b c(q qVar) {
        return new C5814b(qVar);
    }

    @Override // X3.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public C5814b get() {
        return c((q) this.f44405a.get());
    }
}
