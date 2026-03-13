package Pb;

import Eb.r;
import Eb.t;
import bc.AbstractC2904a;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class c extends r implements Mb.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Eb.f f13222a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f13223b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f13224c;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a implements Eb.g, Hb.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final t f13225a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f13226b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Object f13227c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Ze.c f13228d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f13229e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f13230f;

        public a(t tVar, long j10, Object obj) {
            this.f13225a = tVar;
            this.f13226b = j10;
            this.f13227c = obj;
        }

        @Override // Ze.b
        public void a() {
            this.f13228d = Xb.g.CANCELLED;
            if (this.f13230f) {
                return;
            }
            this.f13230f = true;
            Object obj = this.f13227c;
            if (obj != null) {
                this.f13225a.onSuccess(obj);
            } else {
                this.f13225a.onError(new NoSuchElementException());
            }
        }

        @Override // Ze.b
        public void c(Object obj) {
            if (this.f13230f) {
                return;
            }
            long j10 = this.f13229e;
            if (j10 != this.f13226b) {
                this.f13229e = j10 + 1;
                return;
            }
            this.f13230f = true;
            this.f13228d.cancel();
            this.f13228d = Xb.g.CANCELLED;
            this.f13225a.onSuccess(obj);
        }

        @Override // Ze.b
        public void d(Ze.c cVar) {
            if (Xb.g.w(this.f13228d, cVar)) {
                this.f13228d = cVar;
                this.f13225a.b(this);
                cVar.p(Long.MAX_VALUE);
            }
        }

        @Override // Hb.c
        public void dispose() {
            this.f13228d.cancel();
            this.f13228d = Xb.g.CANCELLED;
        }

        @Override // Hb.c
        public boolean j() {
            return this.f13228d == Xb.g.CANCELLED;
        }

        @Override // Ze.b
        public void onError(Throwable th) {
            if (this.f13230f) {
                AbstractC2904a.q(th);
                return;
            }
            this.f13230f = true;
            this.f13228d = Xb.g.CANCELLED;
            this.f13225a.onError(th);
        }
    }

    public c(Eb.f fVar, long j10, Object obj) {
        this.f13222a = fVar;
        this.f13223b = j10;
        this.f13224c = obj;
    }

    @Override // Eb.r
    public void C(t tVar) {
        this.f13222a.i(new a(tVar, this.f13223b, this.f13224c));
    }

    @Override // Mb.a
    public Eb.f d() {
        return AbstractC2904a.k(new b(this.f13222a, this.f13223b, this.f13224c, true));
    }
}
