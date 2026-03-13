package Sb;

import bc.AbstractC2904a;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class f0 extends AbstractC2200a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Eb.q f15700b;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends AtomicBoolean implements Eb.p, Hb.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Eb.p f15701a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Eb.q f15702b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Hb.c f15703c;

        /* JADX INFO: renamed from: Sb.f0$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public final class RunnableC0192a implements Runnable {
            public RunnableC0192a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f15703c.dispose();
            }
        }

        public a(Eb.p pVar, Eb.q qVar) {
            this.f15701a = pVar;
            this.f15702b = qVar;
        }

        @Override // Eb.p
        public void a() {
            if (get()) {
                return;
            }
            this.f15701a.a();
        }

        @Override // Eb.p
        public void b(Hb.c cVar) {
            if (Kb.c.w(this.f15703c, cVar)) {
                this.f15703c = cVar;
                this.f15701a.b(this);
            }
        }

        @Override // Eb.p
        public void c(Object obj) {
            if (get()) {
                return;
            }
            this.f15701a.c(obj);
        }

        @Override // Hb.c
        public void dispose() {
            if (compareAndSet(false, true)) {
                this.f15702b.c(new RunnableC0192a());
            }
        }

        @Override // Hb.c
        public boolean j() {
            return get();
        }

        @Override // Eb.p
        public void onError(Throwable th) {
            if (get()) {
                AbstractC2904a.q(th);
            } else {
                this.f15701a.onError(th);
            }
        }
    }

    public f0(Eb.n nVar, Eb.q qVar) {
        super(nVar);
        this.f15700b = qVar;
    }

    @Override // Eb.k
    public void v0(Eb.p pVar) {
        this.f15624a.f(new a(pVar, this.f15700b));
    }
}
