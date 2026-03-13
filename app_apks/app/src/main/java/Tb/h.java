package Tb;

import Eb.v;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class h extends Eb.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v f16310a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Jb.d f16311b;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public final class a implements Eb.t {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Eb.t f16312a;

        public a(Eb.t tVar) {
            this.f16312a = tVar;
        }

        @Override // Eb.t
        public void b(Hb.c cVar) {
            this.f16312a.b(cVar);
        }

        @Override // Eb.t
        public void onError(Throwable th) {
            this.f16312a.onError(th);
        }

        @Override // Eb.t
        public void onSuccess(Object obj) {
            try {
                h.this.f16311b.accept(obj);
                this.f16312a.onSuccess(obj);
            } catch (Throwable th) {
                Ib.b.b(th);
                this.f16312a.onError(th);
            }
        }
    }

    public h(v vVar, Jb.d dVar) {
        this.f16310a = vVar;
        this.f16311b = dVar;
    }

    @Override // Eb.r
    public void C(Eb.t tVar) {
        this.f16310a.c(new a(tVar));
    }
}
