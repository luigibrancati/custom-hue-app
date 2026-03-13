package Sb;

import Eb.q;
import bc.AbstractC2904a;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: Sb.h, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class C2207h extends AbstractC2200a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f15722b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TimeUnit f15723c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Eb.q f15724d;

    /* JADX INFO: renamed from: Sb.h$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends AtomicReference implements Runnable, Hb.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f15725a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f15726b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final b f15727c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final AtomicBoolean f15728d = new AtomicBoolean();

        public a(Object obj, long j10, b bVar) {
            this.f15725a = obj;
            this.f15726b = j10;
            this.f15727c = bVar;
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
            return get() == Kb.c.DISPOSED;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f15728d.compareAndSet(false, true)) {
                this.f15727c.d(this.f15726b, this.f15725a, this);
            }
        }
    }

    /* JADX INFO: renamed from: Sb.h$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b implements Eb.p, Hb.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Eb.p f15729a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f15730b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final TimeUnit f15731c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final q.c f15732d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Hb.c f15733e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Hb.c f15734f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public volatile long f15735g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f15736h;

        public b(Eb.p pVar, long j10, TimeUnit timeUnit, q.c cVar) {
            this.f15729a = pVar;
            this.f15730b = j10;
            this.f15731c = timeUnit;
            this.f15732d = cVar;
        }

        @Override // Eb.p
        public void a() {
            if (this.f15736h) {
                return;
            }
            this.f15736h = true;
            Hb.c cVar = this.f15734f;
            if (cVar != null) {
                cVar.dispose();
            }
            a aVar = (a) cVar;
            if (aVar != null) {
                aVar.run();
            }
            this.f15729a.a();
            this.f15732d.dispose();
        }

        @Override // Eb.p
        public void b(Hb.c cVar) {
            if (Kb.c.w(this.f15733e, cVar)) {
                this.f15733e = cVar;
                this.f15729a.b(this);
            }
        }

        @Override // Eb.p
        public void c(Object obj) {
            if (this.f15736h) {
                return;
            }
            long j10 = this.f15735g + 1;
            this.f15735g = j10;
            Hb.c cVar = this.f15734f;
            if (cVar != null) {
                cVar.dispose();
            }
            a aVar = new a(obj, j10, this);
            this.f15734f = aVar;
            aVar.a(this.f15732d.c(aVar, this.f15730b, this.f15731c));
        }

        public void d(long j10, Object obj, a aVar) {
            if (j10 == this.f15735g) {
                this.f15729a.c(obj);
                aVar.dispose();
            }
        }

        @Override // Hb.c
        public void dispose() {
            this.f15733e.dispose();
            this.f15732d.dispose();
        }

        @Override // Hb.c
        public boolean j() {
            return this.f15732d.j();
        }

        @Override // Eb.p
        public void onError(Throwable th) {
            if (this.f15736h) {
                AbstractC2904a.q(th);
                return;
            }
            Hb.c cVar = this.f15734f;
            if (cVar != null) {
                cVar.dispose();
            }
            this.f15736h = true;
            this.f15729a.onError(th);
            this.f15732d.dispose();
        }
    }

    public C2207h(Eb.n nVar, long j10, TimeUnit timeUnit, Eb.q qVar) {
        super(nVar);
        this.f15722b = j10;
        this.f15723c = timeUnit;
        this.f15724d = qVar;
    }

    @Override // Eb.k
    public void v0(Eb.p pVar) {
        this.f15624a.f(new b(new ac.c(pVar), this.f15722b, this.f15723c, this.f15724d.a()));
    }
}
