package Y;

import E.W0;
import L.F;
import L.I;
import L.J;
import M.x;
import Y.f;
import java.util.Collection;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class i implements J {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final J f19548a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f19549b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p f19550c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final W0.c f19551d;

    public i(J j10, W0.c cVar, f.a aVar) {
        this.f19548a = j10;
        this.f19551d = cVar;
        this.f19549b = new o(j10.c(), aVar);
        this.f19550c = new p(j10.i());
    }

    @Override // L.J
    public F c() {
        return this.f19549b;
    }

    @Override // E.W0.c
    public void d(W0 w02) {
        x.b();
        this.f19551d.d(w02);
    }

    @Override // L.J
    public void g(Collection collection) {
        throw new UnsupportedOperationException("Operation not supported by VirtualCamera.");
    }

    @Override // L.J
    public void h(Collection collection) {
        throw new UnsupportedOperationException("Operation not supported by VirtualCamera.");
    }

    @Override // L.J
    public I i() {
        return this.f19550c;
    }

    @Override // E.W0.c
    public void j(W0 w02) {
        x.b();
        this.f19551d.j(w02);
    }

    @Override // E.W0.c
    public void m(W0 w02) {
        x.b();
        this.f19551d.m(w02);
    }

    @Override // E.W0.c
    public void n(W0 w02) {
        x.b();
        this.f19551d.n(w02);
    }

    @Override // L.J
    public boolean p() {
        return false;
    }

    public void r(int i10) {
        this.f19550c.s(i10);
    }

    @Override // L.J
    public O7.e release() {
        throw new UnsupportedOperationException("Operation not supported by VirtualCamera.");
    }
}
