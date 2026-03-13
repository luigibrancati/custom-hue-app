package d2;

import b2.AbstractC2795e;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class t implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f32968a;

    public t(r rVar) {
        this.f32968a = rVar;
    }

    @Override // d2.r
    public boolean a(int i10, long j10) {
        return this.f32968a.a(i10, j10);
    }

    @Override // d2.r
    public int b() {
        return this.f32968a.b();
    }

    @Override // d2.r
    public void c() {
        this.f32968a.c();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof t) {
            return this.f32968a.equals(((t) obj).f32968a);
        }
        return false;
    }

    @Override // d2.v
    public int f(int i10) {
        return this.f32968a.f(i10);
    }

    @Override // d2.r
    public void g(long j10, long j11, long j12, List list, b2.n[] nVarArr) {
        this.f32968a.g(j10, j11, j12, list, nVarArr);
    }

    @Override // d2.r
    public boolean h(int i10, long j10) {
        return this.f32968a.h(i10, j10);
    }

    public int hashCode() {
        return this.f32968a.hashCode();
    }

    @Override // d2.r
    public void i(float f10) {
        this.f32968a.i(f10);
    }

    @Override // d2.r
    public Object j() {
        return this.f32968a.j();
    }

    @Override // d2.r
    public void k() {
        this.f32968a.k();
    }

    @Override // d2.v
    public int l(int i10) {
        return this.f32968a.l(i10);
    }

    @Override // d2.v
    public int length() {
        return this.f32968a.length();
    }

    @Override // d2.r
    public boolean m(long j10, AbstractC2795e abstractC2795e, List list) {
        return this.f32968a.m(j10, abstractC2795e, list);
    }

    @Override // d2.r
    public void o(boolean z10) {
        this.f32968a.o(z10);
    }

    @Override // d2.r
    public void p() {
        this.f32968a.p();
    }

    @Override // d2.r
    public int q(long j10, List list) {
        return this.f32968a.q(j10, list);
    }

    @Override // d2.r
    public int r() {
        return this.f32968a.r();
    }

    @Override // d2.r
    public int t() {
        return this.f32968a.t();
    }

    @Override // d2.r
    public void u() {
        this.f32968a.u();
    }

    public r v() {
        return this.f32968a;
    }
}
