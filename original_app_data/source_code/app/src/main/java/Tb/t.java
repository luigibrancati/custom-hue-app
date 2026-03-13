package Tb;

import Eb.v;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class t extends Eb.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v f16352a;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends Nb.f implements Eb.t {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Hb.c f16353c;

        public a(Eb.p pVar) {
            super(pVar);
        }

        @Override // Eb.t
        public void b(Hb.c cVar) {
            if (Kb.c.w(this.f16353c, cVar)) {
                this.f16353c = cVar;
                this.f10614a.b(this);
            }
        }

        @Override // Nb.f, Hb.c
        public void dispose() {
            super.dispose();
            this.f16353c.dispose();
        }

        @Override // Eb.t
        public void onError(Throwable th) {
            f(th);
        }

        @Override // Eb.t
        public void onSuccess(Object obj) {
            e(obj);
        }
    }

    public t(v vVar) {
        this.f16352a = vVar;
    }

    public static Eb.t O0(Eb.p pVar) {
        return new a(pVar);
    }

    @Override // Eb.k
    public void v0(Eb.p pVar) {
        this.f16352a.c(O0(pVar));
    }
}
