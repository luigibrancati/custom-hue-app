package Sb;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class S extends AbstractC2200a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Jb.g f15569b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f15570c;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends AtomicInteger implements Eb.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Eb.p f15571a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Kb.g f15572b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Eb.n f15573c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Jb.g f15574d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f15575e;

        public a(Eb.p pVar, long j10, Jb.g gVar, Kb.g gVar2, Eb.n nVar) {
            this.f15571a = pVar;
            this.f15572b = gVar2;
            this.f15573c = nVar;
            this.f15574d = gVar;
            this.f15575e = j10;
        }

        @Override // Eb.p
        public void a() {
            this.f15571a.a();
        }

        @Override // Eb.p
        public void b(Hb.c cVar) {
            this.f15572b.a(cVar);
        }

        @Override // Eb.p
        public void c(Object obj) {
            this.f15571a.c(obj);
        }

        public void d() {
            if (getAndIncrement() == 0) {
                int iAddAndGet = 1;
                while (!this.f15572b.j()) {
                    this.f15573c.f(this);
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
            }
        }

        @Override // Eb.p
        public void onError(Throwable th) {
            long j10 = this.f15575e;
            if (j10 != Long.MAX_VALUE) {
                this.f15575e = j10 - 1;
            }
            if (j10 == 0) {
                this.f15571a.onError(th);
                return;
            }
            try {
                if (this.f15574d.test(th)) {
                    d();
                } else {
                    this.f15571a.onError(th);
                }
            } catch (Throwable th2) {
                Ib.b.b(th2);
                this.f15571a.onError(new Ib.a(th, th2));
            }
        }
    }

    public S(Eb.k kVar, long j10, Jb.g gVar) {
        super(kVar);
        this.f15569b = gVar;
        this.f15570c = j10;
    }

    @Override // Eb.k
    public void v0(Eb.p pVar) {
        Kb.g gVar = new Kb.g();
        pVar.b(gVar);
        new a(pVar, this.f15570c, this.f15569b, gVar, this.f15624a).d();
    }
}
