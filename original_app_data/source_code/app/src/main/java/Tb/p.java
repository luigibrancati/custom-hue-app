package Tb;

import Eb.v;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class p extends Eb.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v f16328a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Eb.q f16329b;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends AtomicReference implements Eb.t, Hb.c, Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Eb.t f16330a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Eb.q f16331b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f16332c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Throwable f16333d;

        public a(Eb.t tVar, Eb.q qVar) {
            this.f16330a = tVar;
            this.f16331b = qVar;
        }

        @Override // Eb.t
        public void b(Hb.c cVar) {
            if (Kb.c.u(this, cVar)) {
                this.f16330a.b(this);
            }
        }

        @Override // Hb.c
        public void dispose() {
            Kb.c.a(this);
        }

        @Override // Hb.c
        public boolean j() {
            return Kb.c.b((Hb.c) get());
        }

        @Override // Eb.t
        public void onError(Throwable th) {
            this.f16333d = th;
            Kb.c.p(this, this.f16331b.c(this));
        }

        @Override // Eb.t
        public void onSuccess(Object obj) {
            this.f16332c = obj;
            Kb.c.p(this, this.f16331b.c(this));
        }

        @Override // java.lang.Runnable
        public void run() {
            Throwable th = this.f16333d;
            if (th != null) {
                this.f16330a.onError(th);
            } else {
                this.f16330a.onSuccess(this.f16332c);
            }
        }
    }

    public p(v vVar, Eb.q qVar) {
        this.f16328a = vVar;
        this.f16329b = qVar;
    }

    @Override // Eb.r
    public void C(Eb.t tVar) {
        this.f16328a.c(new a(tVar, this.f16329b));
    }
}
