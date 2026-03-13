package P8;

import b7.C2878l;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class l implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C2878l f13202a;

    public l(C2878l c2878l) {
        this.f13202a = c2878l;
    }

    @Override // P8.o
    public boolean a(Exception exc) {
        return false;
    }

    @Override // P8.o
    public boolean b(Q8.d dVar) {
        if (!dVar.l() && !dVar.k() && !dVar.i()) {
            return false;
        }
        this.f13202a.e(dVar.d());
        return true;
    }
}
