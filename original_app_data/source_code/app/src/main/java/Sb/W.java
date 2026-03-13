package Sb;

import bc.AbstractC2904a;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class W extends AbstractC2200a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Jb.e f15589b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f15590c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f15591d;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends AtomicReference implements Eb.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f15592a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f15593b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f15594c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public volatile Mb.h f15595d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public volatile boolean f15596e;

        public a(b bVar, long j10, int i10) {
            this.f15592a = bVar;
            this.f15593b = j10;
            this.f15594c = i10;
        }

        @Override // Eb.p
        public void a() {
            if (this.f15593b == this.f15592a.f15607j) {
                this.f15596e = true;
                this.f15592a.e();
            }
        }

        @Override // Eb.p
        public void b(Hb.c cVar) {
            if (Kb.c.u(this, cVar)) {
                if (cVar instanceof Mb.c) {
                    Mb.c cVar2 = (Mb.c) cVar;
                    int iQ = cVar2.q(7);
                    if (iQ == 1) {
                        this.f15595d = cVar2;
                        this.f15596e = true;
                        this.f15592a.e();
                        return;
                    } else if (iQ == 2) {
                        this.f15595d = cVar2;
                        return;
                    }
                }
                this.f15595d = new Ub.c(this.f15594c);
            }
        }

        @Override // Eb.p
        public void c(Object obj) {
            if (this.f15593b == this.f15592a.f15607j) {
                if (obj != null) {
                    this.f15595d.offer(obj);
                }
                this.f15592a.e();
            }
        }

        public void d() {
            Kb.c.a(this);
        }

        @Override // Eb.p
        public void onError(Throwable th) {
            this.f15592a.f(this, th);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends AtomicInteger implements Eb.p, Hb.c {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final a f15597k;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Eb.p f15598a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Jb.e f15599b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f15600c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f15601d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public volatile boolean f15603f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public volatile boolean f15604g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public Hb.c f15605h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public volatile long f15607j;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final AtomicReference f15606i = new AtomicReference();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Yb.b f15602e = new Yb.b();

        static {
            a aVar = new a(null, -1L, 1);
            f15597k = aVar;
            aVar.d();
        }

        public b(Eb.p pVar, Jb.e eVar, int i10, boolean z10) {
            this.f15598a = pVar;
            this.f15599b = eVar;
            this.f15600c = i10;
            this.f15601d = z10;
        }

        @Override // Eb.p
        public void a() {
            if (this.f15603f) {
                return;
            }
            this.f15603f = true;
            e();
        }

        @Override // Eb.p
        public void b(Hb.c cVar) {
            if (Kb.c.w(this.f15605h, cVar)) {
                this.f15605h = cVar;
                this.f15598a.b(this);
            }
        }

        @Override // Eb.p
        public void c(Object obj) {
            a aVar;
            long j10 = this.f15607j + 1;
            this.f15607j = j10;
            a aVar2 = (a) this.f15606i.get();
            if (aVar2 != null) {
                aVar2.d();
            }
            try {
                Eb.n nVar = (Eb.n) Lb.b.e(this.f15599b.apply(obj), "The ObservableSource returned is null");
                a aVar3 = new a(this, j10, this.f15600c);
                do {
                    aVar = (a) this.f15606i.get();
                    if (aVar == f15597k) {
                        return;
                    }
                } while (!T1.e.a(this.f15606i, aVar, aVar3));
                nVar.f(aVar3);
            } catch (Throwable th) {
                Ib.b.b(th);
                this.f15605h.dispose();
                onError(th);
            }
        }

        public void d() {
            a aVar;
            a aVar2 = (a) this.f15606i.get();
            a aVar3 = f15597k;
            if (aVar2 == aVar3 || (aVar = (a) this.f15606i.getAndSet(aVar3)) == aVar3 || aVar == null) {
                return;
            }
            aVar.d();
        }

        @Override // Hb.c
        public void dispose() {
            if (this.f15604g) {
                return;
            }
            this.f15604g = true;
            this.f15605h.dispose();
            d();
        }

        /* JADX WARN: Removed duplicated region for block: B:100:0x0010 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:94:0x00ee A[SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void e() {
            /*
                Method dump skipped, instruction units count: 246
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: Sb.W.b.e():void");
        }

        public void f(a aVar, Throwable th) {
            if (aVar.f15593b != this.f15607j || !this.f15602e.a(th)) {
                AbstractC2904a.q(th);
                return;
            }
            if (!this.f15601d) {
                this.f15605h.dispose();
                this.f15603f = true;
            }
            aVar.f15596e = true;
            e();
        }

        @Override // Hb.c
        public boolean j() {
            return this.f15604g;
        }

        @Override // Eb.p
        public void onError(Throwable th) {
            if (this.f15603f || !this.f15602e.a(th)) {
                AbstractC2904a.q(th);
                return;
            }
            if (!this.f15601d) {
                d();
            }
            this.f15603f = true;
            e();
        }
    }

    public W(Eb.n nVar, Jb.e eVar, int i10, boolean z10) {
        super(nVar);
        this.f15589b = eVar;
        this.f15590c = i10;
        this.f15591d = z10;
    }

    @Override // Eb.k
    public void v0(Eb.p pVar) {
        if (T.b(this.f15624a, pVar, this.f15589b)) {
            return;
        }
        this.f15624a.f(new b(pVar, this.f15589b, this.f15590c, this.f15591d));
    }
}
