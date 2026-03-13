package Tb;

import Eb.v;
import bc.AbstractC2904a;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class q extends Eb.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v f16334a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f16335b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TimeUnit f16336c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Eb.q f16337d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final v f16338e;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends AtomicReference implements Eb.t, Runnable, Hb.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Eb.t f16339a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AtomicReference f16340b = new AtomicReference();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final C0201a f16341c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public v f16342d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final long f16343e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final TimeUnit f16344f;

        /* JADX INFO: renamed from: Tb.q$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class C0201a extends AtomicReference implements Eb.t {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Eb.t f16345a;

            public C0201a(Eb.t tVar) {
                this.f16345a = tVar;
            }

            @Override // Eb.t
            public void b(Hb.c cVar) {
                Kb.c.u(this, cVar);
            }

            @Override // Eb.t
            public void onError(Throwable th) {
                this.f16345a.onError(th);
            }

            @Override // Eb.t
            public void onSuccess(Object obj) {
                this.f16345a.onSuccess(obj);
            }
        }

        public a(Eb.t tVar, v vVar, long j10, TimeUnit timeUnit) {
            this.f16339a = tVar;
            this.f16342d = vVar;
            this.f16343e = j10;
            this.f16344f = timeUnit;
            if (vVar != null) {
                this.f16341c = new C0201a(tVar);
            } else {
                this.f16341c = null;
            }
        }

        @Override // Eb.t
        public void b(Hb.c cVar) {
            Kb.c.u(this, cVar);
        }

        @Override // Hb.c
        public void dispose() {
            Kb.c.a(this);
            Kb.c.a(this.f16340b);
            C0201a c0201a = this.f16341c;
            if (c0201a != null) {
                Kb.c.a(c0201a);
            }
        }

        @Override // Hb.c
        public boolean j() {
            return Kb.c.b((Hb.c) get());
        }

        @Override // Eb.t
        public void onError(Throwable th) {
            Hb.c cVar = (Hb.c) get();
            Kb.c cVar2 = Kb.c.DISPOSED;
            if (cVar == cVar2 || !compareAndSet(cVar, cVar2)) {
                AbstractC2904a.q(th);
            } else {
                Kb.c.a(this.f16340b);
                this.f16339a.onError(th);
            }
        }

        @Override // Eb.t
        public void onSuccess(Object obj) {
            Hb.c cVar = (Hb.c) get();
            Kb.c cVar2 = Kb.c.DISPOSED;
            if (cVar == cVar2 || !compareAndSet(cVar, cVar2)) {
                return;
            }
            Kb.c.a(this.f16340b);
            this.f16339a.onSuccess(obj);
        }

        @Override // java.lang.Runnable
        public void run() {
            Hb.c cVar = (Hb.c) get();
            Kb.c cVar2 = Kb.c.DISPOSED;
            if (cVar == cVar2 || !compareAndSet(cVar, cVar2)) {
                return;
            }
            if (cVar != null) {
                cVar.dispose();
            }
            v vVar = this.f16342d;
            if (vVar == null) {
                this.f16339a.onError(new TimeoutException(Yb.f.c(this.f16343e, this.f16344f)));
            } else {
                this.f16342d = null;
                vVar.c(this.f16341c);
            }
        }
    }

    public q(v vVar, long j10, TimeUnit timeUnit, Eb.q qVar, v vVar2) {
        this.f16334a = vVar;
        this.f16335b = j10;
        this.f16336c = timeUnit;
        this.f16337d = qVar;
        this.f16338e = vVar2;
    }

    @Override // Eb.r
    public void C(Eb.t tVar) {
        a aVar = new a(tVar, this.f16338e, this.f16335b, this.f16336c);
        tVar.b(aVar);
        Kb.c.p(aVar.f16340b, this.f16337d.d(aVar, this.f16335b, this.f16336c));
        this.f16334a.c(aVar);
    }
}
