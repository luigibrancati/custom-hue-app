package Pb;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class i extends Pb.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Jb.g f13270c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f13271d;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends AtomicInteger implements Eb.g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Ze.b f13272a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Xb.f f13273b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Ze.a f13274c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Jb.g f13275d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f13276e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public long f13277f;

        public a(Ze.b bVar, long j10, Jb.g gVar, Xb.f fVar, Ze.a aVar) {
            this.f13272a = bVar;
            this.f13273b = fVar;
            this.f13274c = aVar;
            this.f13275d = gVar;
            this.f13276e = j10;
        }

        @Override // Ze.b
        public void a() {
            this.f13272a.a();
        }

        public void b() {
            if (getAndIncrement() == 0) {
                int iAddAndGet = 1;
                while (!this.f13273b.c()) {
                    long j10 = this.f13277f;
                    if (j10 != 0) {
                        this.f13277f = 0L;
                        this.f13273b.d(j10);
                    }
                    this.f13274c.a(this);
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
            }
        }

        @Override // Ze.b
        public void c(Object obj) {
            this.f13277f++;
            this.f13272a.c(obj);
        }

        @Override // Ze.b
        public void d(Ze.c cVar) {
            this.f13273b.e(cVar);
        }

        @Override // Ze.b
        public void onError(Throwable th) {
            long j10 = this.f13276e;
            if (j10 != Long.MAX_VALUE) {
                this.f13276e = j10 - 1;
            }
            if (j10 == 0) {
                this.f13272a.onError(th);
                return;
            }
            try {
                if (this.f13275d.test(th)) {
                    b();
                } else {
                    this.f13272a.onError(th);
                }
            } catch (Throwable th2) {
                Ib.b.b(th2);
                this.f13272a.onError(new Ib.a(th, th2));
            }
        }
    }

    public i(Eb.f fVar, long j10, Jb.g gVar) {
        super(fVar);
        this.f13270c = gVar;
        this.f13271d = j10;
    }

    @Override // Eb.f
    public void j(Ze.b bVar) {
        Xb.f fVar = new Xb.f(false);
        bVar.d(fVar);
        new a(bVar, this.f13271d, this.f13270c, fVar, this.f13212b).b();
    }
}
