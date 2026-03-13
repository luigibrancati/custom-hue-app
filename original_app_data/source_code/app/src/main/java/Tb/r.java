package Tb;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class r extends Eb.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f16346a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TimeUnit f16347b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Eb.q f16348c;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends AtomicReference implements Hb.c, Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Eb.t f16349a;

        public a(Eb.t tVar) {
            this.f16349a = tVar;
        }

        public void a(Hb.c cVar) {
            Kb.c.p(this, cVar);
        }

        @Override // Hb.c
        public void dispose() {
            Kb.c.a(this);
        }

        @Override // Hb.c
        public boolean j() {
            return Kb.c.b((Hb.c) get());
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f16349a.onSuccess(0L);
        }
    }

    public r(long j10, TimeUnit timeUnit, Eb.q qVar) {
        this.f16346a = j10;
        this.f16347b = timeUnit;
        this.f16348c = qVar;
    }

    @Override // Eb.r
    public void C(Eb.t tVar) {
        a aVar = new a(tVar);
        tVar.b(aVar);
        aVar.a(this.f16348c.d(aVar, this.f16346a, this.f16347b));
    }
}
