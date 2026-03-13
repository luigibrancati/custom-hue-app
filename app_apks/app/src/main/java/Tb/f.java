package Tb;

import Eb.v;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class f extends Eb.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v f16301a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Jb.d f16302b;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public final class a implements Eb.t {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Eb.t f16303a;

        public a(Eb.t tVar) {
            this.f16303a = tVar;
        }

        @Override // Eb.t
        public void b(Hb.c cVar) {
            this.f16303a.b(cVar);
        }

        @Override // Eb.t
        public void onError(Throwable th) {
            try {
                f.this.f16302b.accept(th);
            } catch (Throwable th2) {
                Ib.b.b(th2);
                th = new Ib.a(th, th2);
            }
            this.f16303a.onError(th);
        }

        @Override // Eb.t
        public void onSuccess(Object obj) {
            this.f16303a.onSuccess(obj);
        }
    }

    public f(v vVar, Jb.d dVar) {
        this.f16301a = vVar;
        this.f16302b = dVar;
    }

    @Override // Eb.r
    public void C(Eb.t tVar) {
        this.f16301a.c(new a(tVar));
    }
}
