package Sb;

import bc.AbstractC2904a;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class r extends Eb.r implements Mb.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Eb.n f15802a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f15803b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f15804c;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a implements Eb.p, Hb.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Eb.t f15805a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f15806b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Object f15807c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Hb.c f15808d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f15809e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f15810f;

        public a(Eb.t tVar, long j10, Object obj) {
            this.f15805a = tVar;
            this.f15806b = j10;
            this.f15807c = obj;
        }

        @Override // Eb.p
        public void a() {
            if (this.f15810f) {
                return;
            }
            this.f15810f = true;
            Object obj = this.f15807c;
            if (obj != null) {
                this.f15805a.onSuccess(obj);
            } else {
                this.f15805a.onError(new NoSuchElementException());
            }
        }

        @Override // Eb.p
        public void b(Hb.c cVar) {
            if (Kb.c.w(this.f15808d, cVar)) {
                this.f15808d = cVar;
                this.f15805a.b(this);
            }
        }

        @Override // Eb.p
        public void c(Object obj) {
            if (this.f15810f) {
                return;
            }
            long j10 = this.f15809e;
            if (j10 != this.f15806b) {
                this.f15809e = j10 + 1;
                return;
            }
            this.f15810f = true;
            this.f15808d.dispose();
            this.f15805a.onSuccess(obj);
        }

        @Override // Hb.c
        public void dispose() {
            this.f15808d.dispose();
        }

        @Override // Hb.c
        public boolean j() {
            return this.f15808d.j();
        }

        @Override // Eb.p
        public void onError(Throwable th) {
            if (this.f15810f) {
                AbstractC2904a.q(th);
            } else {
                this.f15810f = true;
                this.f15805a.onError(th);
            }
        }
    }

    public r(Eb.n nVar, long j10, Object obj) {
        this.f15802a = nVar;
        this.f15803b = j10;
        this.f15804c = obj;
    }

    @Override // Eb.r
    public void C(Eb.t tVar) {
        this.f15802a.f(new a(tVar, this.f15803b, this.f15804c));
    }

    @Override // Mb.b
    public Eb.k a() {
        return AbstractC2904a.m(new C2215p(this.f15802a, this.f15803b, this.f15804c, true));
    }
}
