package Sb;

import bc.AbstractC2904a;

/* JADX INFO: renamed from: Sb.m, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class C2212m extends AbstractC2200a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Jb.a f15766b;

    /* JADX INFO: renamed from: Sb.m$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends Nb.b implements Eb.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Eb.p f15767a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Jb.a f15768b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Hb.c f15769c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Mb.c f15770d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f15771e;

        public a(Eb.p pVar, Jb.a aVar) {
            this.f15767a = pVar;
            this.f15768b = aVar;
        }

        @Override // Eb.p
        public void a() {
            this.f15767a.a();
            d();
        }

        @Override // Eb.p
        public void b(Hb.c cVar) {
            if (Kb.c.w(this.f15769c, cVar)) {
                this.f15769c = cVar;
                if (cVar instanceof Mb.c) {
                    this.f15770d = (Mb.c) cVar;
                }
                this.f15767a.b(this);
            }
        }

        @Override // Eb.p
        public void c(Object obj) {
            this.f15767a.c(obj);
        }

        @Override // Mb.h
        public void clear() {
            this.f15770d.clear();
        }

        public void d() {
            if (compareAndSet(0, 1)) {
                try {
                    this.f15768b.run();
                } catch (Throwable th) {
                    Ib.b.b(th);
                    AbstractC2904a.q(th);
                }
            }
        }

        @Override // Hb.c
        public void dispose() {
            this.f15769c.dispose();
            d();
        }

        @Override // Mb.h
        public boolean isEmpty() {
            return this.f15770d.isEmpty();
        }

        @Override // Hb.c
        public boolean j() {
            return this.f15769c.j();
        }

        @Override // Eb.p
        public void onError(Throwable th) {
            this.f15767a.onError(th);
            d();
        }

        @Override // Mb.h
        public Object poll() {
            Object objPoll = this.f15770d.poll();
            if (objPoll == null && this.f15771e) {
                d();
            }
            return objPoll;
        }

        @Override // Mb.d
        public int q(int i10) {
            Mb.c cVar = this.f15770d;
            if (cVar == null || (i10 & 4) != 0) {
                return 0;
            }
            int iQ = cVar.q(i10);
            if (iQ != 0) {
                this.f15771e = iQ == 1;
            }
            return iQ;
        }
    }

    public C2212m(Eb.n nVar, Jb.a aVar) {
        super(nVar);
        this.f15766b = aVar;
    }

    @Override // Eb.k
    public void v0(Eb.p pVar) {
        this.f15624a.f(new a(pVar, this.f15766b));
    }
}
