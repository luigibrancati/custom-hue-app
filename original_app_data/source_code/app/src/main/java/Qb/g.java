package Qb;

import Eb.i;
import Eb.j;
import Eb.k;
import Eb.p;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class g extends k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f14257a;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends Nb.f implements i {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Hb.c f14258c;

        public a(p pVar) {
            super(pVar);
        }

        @Override // Eb.i
        public void a() {
            d();
        }

        @Override // Eb.i
        public void b(Hb.c cVar) {
            if (Kb.c.w(this.f14258c, cVar)) {
                this.f14258c = cVar;
                this.f10614a.b(this);
            }
        }

        @Override // Nb.f, Hb.c
        public void dispose() {
            super.dispose();
            this.f14258c.dispose();
        }

        @Override // Eb.i
        public void onError(Throwable th) {
            f(th);
        }

        @Override // Eb.i
        public void onSuccess(Object obj) {
            e(obj);
        }
    }

    public g(j jVar) {
        this.f14257a = jVar;
    }

    public static i O0(p pVar) {
        return new a(pVar);
    }

    @Override // Eb.k
    public void v0(p pVar) {
        this.f14257a.b(O0(pVar));
    }
}
