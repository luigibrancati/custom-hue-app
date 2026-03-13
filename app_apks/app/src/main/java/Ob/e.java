package Ob;

import Eb.q;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class e extends Eb.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Eb.c f12130a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f12131b;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends AtomicReference implements Eb.b, Hb.c, Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Eb.b f12132a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final q f12133b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Throwable f12134c;

        public a(Eb.b bVar, q qVar) {
            this.f12132a = bVar;
            this.f12133b = qVar;
        }

        @Override // Eb.b
        public void a() {
            Kb.c.p(this, this.f12133b.c(this));
        }

        @Override // Eb.b
        public void b(Hb.c cVar) {
            if (Kb.c.u(this, cVar)) {
                this.f12132a.b(this);
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

        @Override // Eb.b
        public void onError(Throwable th) {
            this.f12134c = th;
            Kb.c.p(this, this.f12133b.c(this));
        }

        @Override // java.lang.Runnable
        public void run() {
            Throwable th = this.f12134c;
            if (th == null) {
                this.f12132a.a();
            } else {
                this.f12134c = null;
                this.f12132a.onError(th);
            }
        }
    }

    public e(Eb.c cVar, q qVar) {
        this.f12130a = cVar;
        this.f12131b = qVar;
    }

    @Override // Eb.a
    public void m(Eb.b bVar) {
        this.f12130a.b(new a(bVar, this.f12131b));
    }
}
