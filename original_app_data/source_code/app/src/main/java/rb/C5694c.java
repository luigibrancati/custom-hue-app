package rb;

import zb.AbstractC6555a;

/* JADX INFO: renamed from: rb.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class C5694c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Ab.f f43943a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public g f43944b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public AbstractC5695d f43945c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public AbstractC5695d f43946d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f43947e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f43948f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public o f43949g = new a();

    /* JADX INFO: renamed from: rb.c$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a implements o {
        public a() {
        }

        @Override // rb.o
        public j p() {
            return AbstractC6555a.u(C5694c.this.f43943a.a0());
        }
    }

    public C5694c(Ab.f fVar) {
        this.f43943a = fVar;
    }

    public final boolean a() {
        AbstractC5695d abstractC5695d = this.f43945c;
        if (abstractC5695d == null) {
            return false;
        }
        return abstractC5695d.a().a(this.f43948f) || this.f43947e || this.f43946d == null;
    }

    public AbstractC5695d b() {
        f();
        return this.f43946d;
    }

    public void c() {
        this.f43947e = true;
    }

    public void d(g gVar) {
        g gVar2 = this.f43944b;
        if (gVar2 != null) {
            gVar2.h(this);
        }
        this.f43944b = gVar;
        if (gVar != null) {
            gVar.c(this);
        }
    }

    public void e(AbstractC5695d abstractC5695d) {
        k.d(abstractC5695d, "Parameter \"localCollisionShape\" was null.");
        if (this.f43945c != abstractC5695d) {
            this.f43945c = abstractC5695d;
            this.f43946d = null;
        }
    }

    public final void f() {
        if (a()) {
            AbstractC5695d abstractC5695d = this.f43946d;
            if (abstractC5695d == null) {
                this.f43946d = this.f43945c.e(this.f43949g);
            } else {
                this.f43945c.f(this.f43949g, abstractC5695d);
            }
            this.f43948f = this.f43945c.a().b();
        }
    }
}
