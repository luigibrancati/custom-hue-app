package Tb;

import Eb.v;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class s extends Eb.f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v f16350b;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends Xb.c implements Eb.t {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Hb.c f16351c;

        public a(Ze.b bVar) {
            super(bVar);
        }

        @Override // Eb.t
        public void b(Hb.c cVar) {
            if (Kb.c.w(this.f16351c, cVar)) {
                this.f16351c = cVar;
                this.f19443a.d(this);
            }
        }

        @Override // Xb.c, Ze.c
        public void cancel() {
            super.cancel();
            this.f16351c.dispose();
        }

        @Override // Eb.t
        public void onError(Throwable th) {
            this.f19443a.onError(th);
        }

        @Override // Eb.t
        public void onSuccess(Object obj) {
            e(obj);
        }
    }

    public s(v vVar) {
        this.f16350b = vVar;
    }

    @Override // Eb.f
    public void j(Ze.b bVar) {
        this.f16350b.c(new a(bVar));
    }
}
