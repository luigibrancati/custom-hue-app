package L;

import E.InterfaceC0802n;
import E.InterfaceC0815u;
import java.util.Collection;

/* JADX INFO: renamed from: L.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class C1094e implements J {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final J f8035a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C1092d f8036b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C1090c f8037c;

    public C1094e(J j10, C1092d c1092d) {
        this.f8035a = j10;
        this.f8036b = c1092d;
        B bS = c1092d.s();
        F fC = j10.c();
        bS.q(null);
        this.f8037c = new C1090c(fC, null);
    }

    @Override // L.J, E.InterfaceC0800m
    public InterfaceC0802n a() {
        return this.f8037c;
    }

    @Override // L.J, E.InterfaceC0800m
    public InterfaceC0815u b() {
        return this.f8036b;
    }

    @Override // L.J
    public F c() {
        return this.f8037c;
    }

    @Override // E.W0.c
    public void d(E.W0 w02) {
        this.f8035a.d(w02);
    }

    @Override // L.J
    public B e() {
        return this.f8035a.e();
    }

    @Override // L.J
    public void f(boolean z10) {
        this.f8035a.f(z10);
    }

    @Override // L.J
    public void g(Collection collection) {
        this.f8035a.g(collection);
    }

    @Override // L.J
    public void h(Collection collection) {
        this.f8035a.h(collection);
    }

    @Override // L.J
    public I i() {
        return this.f8036b;
    }

    @Override // E.W0.c
    public void j(E.W0 w02) {
        this.f8035a.j(w02);
    }

    @Override // L.J
    public void k(B b10) {
        this.f8035a.k(b10);
    }

    @Override // L.J
    public boolean l() {
        return this.f8035a.l();
    }

    @Override // E.W0.c
    public void m(E.W0 w02) {
        this.f8035a.m(w02);
    }

    @Override // E.W0.c
    public void n(E.W0 w02) {
        this.f8035a.n(w02);
    }

    @Override // L.J
    public boolean p() {
        return this.f8035a.p();
    }

    @Override // L.J
    public void q(boolean z10) {
        this.f8035a.q(z10);
    }

    @Override // L.J
    public O7.e release() {
        return this.f8035a.release();
    }
}
