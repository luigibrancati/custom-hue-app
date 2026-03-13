package Sb;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class e0 extends Eb.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Eb.q f15692a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f15693b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TimeUnit f15694c;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends AtomicReference implements Hb.c, Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Eb.p f15695a;

        public a(Eb.p pVar) {
            this.f15695a = pVar;
        }

        public void a(Hb.c cVar) {
            Kb.c.v(this, cVar);
        }

        @Override // Hb.c
        public void dispose() {
            Kb.c.a(this);
        }

        @Override // Hb.c
        public boolean j() {
            return get() == Kb.c.DISPOSED;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (j()) {
                return;
            }
            this.f15695a.c(0L);
            lazySet(Kb.d.INSTANCE);
            this.f15695a.a();
        }
    }

    public e0(long j10, TimeUnit timeUnit, Eb.q qVar) {
        this.f15693b = j10;
        this.f15694c = timeUnit;
        this.f15692a = qVar;
    }

    @Override // Eb.k
    public void v0(Eb.p pVar) {
        a aVar = new a(pVar);
        pVar.b(aVar);
        aVar.a(this.f15692a.d(aVar, this.f15693b, this.f15694c));
    }
}
