package a2;

import D1.r;
import G1.AbstractC0853a;
import a2.InterfaceC2611D;

/* JADX INFO: renamed from: a2.v, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C2635v extends AbstractC2615a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f20906h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public D1.r f20907i;

    @Override // a2.AbstractC2615a
    public void D(I1.x xVar) {
        E(new f0(this.f20906h, true, false, false, null, f()));
    }

    @Override // a2.InterfaceC2611D
    public synchronized void b(D1.r rVar) {
        this.f20907i = rVar;
    }

    @Override // a2.InterfaceC2611D
    public synchronized D1.r f() {
        return this.f20907i;
    }

    @Override // a2.InterfaceC2611D
    public void h(InterfaceC2610C interfaceC2610C) {
        ((C2634u) interfaceC2610C).o();
    }

    @Override // a2.InterfaceC2611D
    public InterfaceC2610C k(InterfaceC2611D.b bVar, e2.b bVar2, long j10) {
        D1.r rVarF = f();
        AbstractC0853a.e(rVarF.f1873b);
        AbstractC0853a.f(rVarF.f1873b.f1969b, "Externally loaded mediaItems require a MIME type.");
        r.h hVar = rVarF.f1873b;
        return new C2634u(hVar.f1968a, hVar.f1969b, null);
    }

    public C2635v(D1.r rVar, long j10, InterfaceC2633t interfaceC2633t) {
        this.f20907i = rVar;
        this.f20906h = j10;
    }

    @Override // a2.AbstractC2615a
    public void F() {
    }

    @Override // a2.InterfaceC2611D
    public void n() {
    }

    /* JADX INFO: renamed from: a2.v$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b implements InterfaceC2611D.a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f20908c;

        public b(long j10, InterfaceC2633t interfaceC2633t) {
            this.f20908c = j10;
        }

        @Override // a2.InterfaceC2611D.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public C2635v f(D1.r rVar) {
            return new C2635v(rVar, this.f20908c, null);
        }

        @Override // a2.InterfaceC2611D.a
        public InterfaceC2611D.a d(P1.w wVar) {
            return this;
        }

        @Override // a2.InterfaceC2611D.a
        public InterfaceC2611D.a e(e2.k kVar) {
            return this;
        }
    }
}
