package Q1;

import F2.s;
import G1.AbstractC0853a;
import G1.H;
import P2.C1842b;
import P2.C1845e;
import P2.C1848h;
import P2.K;
import i2.I;
import i2.InterfaceC4336p;
import i2.InterfaceC4337q;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class b implements k {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final I f13330f = new I();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC4336p f13331a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final D1.o f13332b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final H f13333c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final s.a f13334d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f13335e;

    public b(InterfaceC4336p interfaceC4336p, D1.o oVar, H h10, s.a aVar, boolean z10) {
        this.f13331a = interfaceC4336p;
        this.f13332b = oVar;
        this.f13333c = h10;
        this.f13334d = aVar;
        this.f13335e = z10;
    }

    @Override // Q1.k
    public boolean a(InterfaceC4337q interfaceC4337q) {
        return this.f13331a.i(interfaceC4337q, f13330f) == 0;
    }

    @Override // Q1.k
    public void c(i2.r rVar) {
        this.f13331a.c(rVar);
    }

    @Override // Q1.k
    public void d() {
        this.f13331a.a(0L, 0L);
    }

    @Override // Q1.k
    public boolean e() {
        InterfaceC4336p interfaceC4336pF = this.f13331a.f();
        return (interfaceC4336pF instanceof K) || (interfaceC4336pF instanceof C2.h);
    }

    @Override // Q1.k
    public boolean f() {
        InterfaceC4336p interfaceC4336pF = this.f13331a.f();
        return (interfaceC4336pF instanceof C1848h) || (interfaceC4336pF instanceof C1842b) || (interfaceC4336pF instanceof C1845e) || (interfaceC4336pF instanceof B2.f);
    }

    @Override // Q1.k
    public k g() {
        InterfaceC4336p fVar;
        AbstractC0853a.g(!e());
        AbstractC0853a.h(this.f13331a.f() == this.f13331a, "Can't recreate wrapped extractors. Outer type: " + this.f13331a.getClass());
        InterfaceC4336p interfaceC4336p = this.f13331a;
        if (interfaceC4336p instanceof w) {
            fVar = new w(this.f13332b.f1794d, this.f13333c, this.f13334d, this.f13335e);
        } else if (interfaceC4336p instanceof C1848h) {
            fVar = new C1848h();
        } else if (interfaceC4336p instanceof C1842b) {
            fVar = new C1842b();
        } else if (interfaceC4336p instanceof C1845e) {
            fVar = new C1845e();
        } else {
            if (!(interfaceC4336p instanceof B2.f)) {
                throw new IllegalStateException("Unexpected extractor type for recreation: " + this.f13331a.getClass().getSimpleName());
            }
            fVar = new B2.f();
        }
        return new b(fVar, this.f13332b, this.f13333c, this.f13334d, this.f13335e);
    }
}
