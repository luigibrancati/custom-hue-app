package Tb;

import Eb.v;
import bc.AbstractC2904a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class g extends Eb.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v f16305a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Jb.d f16306b;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a implements Eb.t {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Eb.t f16307a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Jb.d f16308b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f16309c;

        public a(Eb.t tVar, Jb.d dVar) {
            this.f16307a = tVar;
            this.f16308b = dVar;
        }

        @Override // Eb.t
        public void b(Hb.c cVar) {
            try {
                this.f16308b.accept(cVar);
                this.f16307a.b(cVar);
            } catch (Throwable th) {
                Ib.b.b(th);
                this.f16309c = true;
                cVar.dispose();
                Kb.d.s(th, this.f16307a);
            }
        }

        @Override // Eb.t
        public void onError(Throwable th) {
            if (this.f16309c) {
                AbstractC2904a.q(th);
            } else {
                this.f16307a.onError(th);
            }
        }

        @Override // Eb.t
        public void onSuccess(Object obj) {
            if (this.f16309c) {
                return;
            }
            this.f16307a.onSuccess(obj);
        }
    }

    public g(v vVar, Jb.d dVar) {
        this.f16305a = vVar;
        this.f16306b = dVar;
    }

    @Override // Eb.r
    public void C(Eb.t tVar) {
        this.f16305a.c(new a(tVar, this.f16306b));
    }
}
