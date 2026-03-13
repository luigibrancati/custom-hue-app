package a2;

import a2.InterfaceC2611D;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class p0 extends AbstractC2622h {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final Void f20871l = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final InterfaceC2611D f20872k;

    public p0(InterfaceC2611D interfaceC2611D) {
        this.f20872k = interfaceC2611D;
    }

    @Override // a2.AbstractC2622h, a2.AbstractC2615a
    public final void D(I1.x xVar) {
        super.D(xVar);
        V();
    }

    @Override // a2.AbstractC2622h
    /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
    public final InterfaceC2611D.b H(Void r12, InterfaceC2611D.b bVar) {
        return M(bVar);
    }

    @Override // a2.AbstractC2622h
    /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
    public final long I(Void r12, long j10, InterfaceC2611D.b bVar) {
        return O(j10, bVar);
    }

    @Override // a2.AbstractC2622h
    /* JADX INFO: renamed from: R, reason: merged with bridge method [inline-methods] */
    public final int J(Void r12, int i10) {
        return Q(i10);
    }

    public abstract void S(D1.D d10);

    @Override // a2.AbstractC2622h
    /* JADX INFO: renamed from: T, reason: merged with bridge method [inline-methods] */
    public final void K(Void r12, InterfaceC2611D interfaceC2611D, D1.D d10) {
        S(d10);
    }

    public final void U() {
        L(f20871l, this.f20872k);
    }

    public void V() {
        U();
    }

    @Override // a2.InterfaceC2611D
    public void b(D1.r rVar) {
        this.f20872k.b(rVar);
    }

    @Override // a2.InterfaceC2611D
    public D1.r f() {
        return this.f20872k.f();
    }

    @Override // a2.InterfaceC2611D
    public boolean p() {
        return this.f20872k.p();
    }

    @Override // a2.InterfaceC2611D
    public D1.D q() {
        return this.f20872k.q();
    }

    public InterfaceC2611D.b M(InterfaceC2611D.b bVar) {
        return bVar;
    }

    public int Q(int i10) {
        return i10;
    }

    public long O(long j10, InterfaceC2611D.b bVar) {
        return j10;
    }
}
