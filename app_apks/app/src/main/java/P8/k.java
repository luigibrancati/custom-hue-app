package P8;

import b7.C2878l;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class k implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f13200a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C2878l f13201b;

    public k(p pVar, C2878l c2878l) {
        this.f13200a = pVar;
        this.f13201b = c2878l;
    }

    @Override // P8.o
    public boolean a(Exception exc) {
        this.f13201b.d(exc);
        return true;
    }

    @Override // P8.o
    public boolean b(Q8.d dVar) {
        if (!dVar.k() || this.f13200a.f(dVar)) {
            return false;
        }
        this.f13201b.c(m.a().b(dVar.b()).d(dVar.c()).c(dVar.h()).a());
        return true;
    }
}
