package Tb;

import Eb.v;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class o extends Eb.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v f16324a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Jb.e f16325b;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a implements Eb.t {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Eb.t f16326a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Jb.e f16327b;

        public a(Eb.t tVar, Jb.e eVar) {
            this.f16326a = tVar;
            this.f16327b = eVar;
        }

        @Override // Eb.t
        public void b(Hb.c cVar) {
            this.f16326a.b(cVar);
        }

        @Override // Eb.t
        public void onError(Throwable th) {
            this.f16326a.onError(th);
        }

        @Override // Eb.t
        public void onSuccess(Object obj) {
            try {
                this.f16326a.onSuccess(Lb.b.e(this.f16327b.apply(obj), "The mapper function returned a null value."));
            } catch (Throwable th) {
                Ib.b.b(th);
                onError(th);
            }
        }
    }

    public o(v vVar, Jb.e eVar) {
        this.f16324a = vVar;
        this.f16325b = eVar;
    }

    @Override // Eb.r
    public void C(Eb.t tVar) {
        this.f16324a.c(new a(tVar, this.f16325b));
    }
}
