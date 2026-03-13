package Tb;

import Eb.v;
import bc.AbstractC2904a;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class d extends Eb.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v f16291a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Eb.n f16292b;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends AtomicReference implements Eb.p, Hb.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Eb.t f16293a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final v f16294b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f16295c;

        public a(Eb.t tVar, v vVar) {
            this.f16293a = tVar;
            this.f16294b = vVar;
        }

        @Override // Eb.p
        public void a() {
            if (this.f16295c) {
                return;
            }
            this.f16295c = true;
            this.f16294b.c(new Nb.i(this, this.f16293a));
        }

        @Override // Eb.p
        public void b(Hb.c cVar) {
            if (Kb.c.s(this, cVar)) {
                this.f16293a.b(this);
            }
        }

        @Override // Eb.p
        public void c(Object obj) {
            ((Hb.c) get()).dispose();
            a();
        }

        @Override // Hb.c
        public void dispose() {
            Kb.c.a(this);
        }

        @Override // Hb.c
        public boolean j() {
            return Kb.c.b((Hb.c) get());
        }

        @Override // Eb.p
        public void onError(Throwable th) {
            if (this.f16295c) {
                AbstractC2904a.q(th);
            } else {
                this.f16295c = true;
                this.f16293a.onError(th);
            }
        }
    }

    public d(v vVar, Eb.n nVar) {
        this.f16291a = vVar;
        this.f16292b = nVar;
    }

    @Override // Eb.r
    public void C(Eb.t tVar) {
        this.f16292b.f(new a(tVar, this.f16291a));
    }
}
