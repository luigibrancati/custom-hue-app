package Sb;

import bc.AbstractC2904a;

/* JADX INFO: renamed from: Sb.q, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class C2216q extends Eb.h implements Mb.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Eb.n f15795a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f15796b;

    /* JADX INFO: renamed from: Sb.q$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a implements Eb.p, Hb.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Eb.i f15797a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f15798b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Hb.c f15799c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f15800d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f15801e;

        public a(Eb.i iVar, long j10) {
            this.f15797a = iVar;
            this.f15798b = j10;
        }

        @Override // Eb.p
        public void a() {
            if (this.f15801e) {
                return;
            }
            this.f15801e = true;
            this.f15797a.a();
        }

        @Override // Eb.p
        public void b(Hb.c cVar) {
            if (Kb.c.w(this.f15799c, cVar)) {
                this.f15799c = cVar;
                this.f15797a.b(this);
            }
        }

        @Override // Eb.p
        public void c(Object obj) {
            if (this.f15801e) {
                return;
            }
            long j10 = this.f15800d;
            if (j10 != this.f15798b) {
                this.f15800d = j10 + 1;
                return;
            }
            this.f15801e = true;
            this.f15799c.dispose();
            this.f15797a.onSuccess(obj);
        }

        @Override // Hb.c
        public void dispose() {
            this.f15799c.dispose();
        }

        @Override // Hb.c
        public boolean j() {
            return this.f15799c.j();
        }

        @Override // Eb.p
        public void onError(Throwable th) {
            if (this.f15801e) {
                AbstractC2904a.q(th);
            } else {
                this.f15801e = true;
                this.f15797a.onError(th);
            }
        }
    }

    public C2216q(Eb.n nVar, long j10) {
        this.f15795a = nVar;
        this.f15796b = j10;
    }

    @Override // Mb.b
    public Eb.k a() {
        return AbstractC2904a.m(new C2215p(this.f15795a, this.f15796b, null, false));
    }

    @Override // Eb.h
    public void f(Eb.i iVar) {
        this.f15795a.f(new a(iVar, this.f15796b));
    }
}
