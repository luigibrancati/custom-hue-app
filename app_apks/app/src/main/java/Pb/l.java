package Pb;

import Eb.r;
import Eb.t;
import bc.AbstractC2904a;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class l extends r implements Mb.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Eb.f f13284a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f13285b;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a implements Eb.g, Hb.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final t f13286a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Object f13287b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Ze.c f13288c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f13289d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Object f13290e;

        public a(t tVar, Object obj) {
            this.f13286a = tVar;
            this.f13287b = obj;
        }

        @Override // Ze.b
        public void a() {
            if (this.f13289d) {
                return;
            }
            this.f13289d = true;
            this.f13288c = Xb.g.CANCELLED;
            Object obj = this.f13290e;
            this.f13290e = null;
            if (obj == null) {
                obj = this.f13287b;
            }
            if (obj != null) {
                this.f13286a.onSuccess(obj);
            } else {
                this.f13286a.onError(new NoSuchElementException());
            }
        }

        @Override // Ze.b
        public void c(Object obj) {
            if (this.f13289d) {
                return;
            }
            if (this.f13290e == null) {
                this.f13290e = obj;
                return;
            }
            this.f13289d = true;
            this.f13288c.cancel();
            this.f13288c = Xb.g.CANCELLED;
            this.f13286a.onError(new IllegalArgumentException("Sequence contains more than one element!"));
        }

        @Override // Ze.b
        public void d(Ze.c cVar) {
            if (Xb.g.w(this.f13288c, cVar)) {
                this.f13288c = cVar;
                this.f13286a.b(this);
                cVar.p(Long.MAX_VALUE);
            }
        }

        @Override // Hb.c
        public void dispose() {
            this.f13288c.cancel();
            this.f13288c = Xb.g.CANCELLED;
        }

        @Override // Hb.c
        public boolean j() {
            return this.f13288c == Xb.g.CANCELLED;
        }

        @Override // Ze.b
        public void onError(Throwable th) {
            if (this.f13289d) {
                AbstractC2904a.q(th);
                return;
            }
            this.f13289d = true;
            this.f13288c = Xb.g.CANCELLED;
            this.f13286a.onError(th);
        }
    }

    public l(Eb.f fVar, Object obj) {
        this.f13284a = fVar;
        this.f13285b = obj;
    }

    @Override // Eb.r
    public void C(t tVar) {
        this.f13284a.i(new a(tVar, this.f13285b));
    }

    @Override // Mb.a
    public Eb.f d() {
        return AbstractC2904a.k(new k(this.f13284a, this.f13285b, true));
    }
}
