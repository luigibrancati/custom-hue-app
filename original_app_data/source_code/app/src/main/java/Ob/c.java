package Ob;

import bc.AbstractC2904a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class c extends Eb.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Jb.a f12128a;

    public c(Jb.a aVar) {
        this.f12128a = aVar;
    }

    @Override // Eb.a
    public void m(Eb.b bVar) {
        Hb.c cVarB = Hb.d.b();
        bVar.b(cVarB);
        try {
            this.f12128a.run();
            if (cVarB.j()) {
                return;
            }
            bVar.a();
        } catch (Throwable th) {
            Ib.b.b(th);
            if (cVarB.j()) {
                AbstractC2904a.q(th);
            } else {
                bVar.onError(th);
            }
        }
    }
}
