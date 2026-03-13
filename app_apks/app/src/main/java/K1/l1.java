package K1;

import G1.InterfaceC0860h;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class l1 implements G0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC0860h f7250a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f7251b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f7252c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f7253d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public D1.y f7254e = D1.y.f2116d;

    public l1(InterfaceC0860h interfaceC0860h) {
        this.f7250a = interfaceC0860h;
    }

    @Override // K1.G0
    public long H() {
        long j10 = this.f7252c;
        if (!this.f7251b) {
            return j10;
        }
        long jC = this.f7250a.c() - this.f7253d;
        D1.y yVar = this.f7254e;
        return j10 + (yVar.f2119a == 1.0f ? G1.M.M0(jC) : yVar.a(jC));
    }

    public void a(long j10) {
        this.f7252c = j10;
        if (this.f7251b) {
            this.f7253d = this.f7250a.c();
        }
    }

    public void b() {
        if (this.f7251b) {
            return;
        }
        this.f7253d = this.f7250a.c();
        this.f7251b = true;
    }

    public void c() {
        if (this.f7251b) {
            a(H());
            this.f7251b = false;
        }
    }

    @Override // K1.G0
    public void d(D1.y yVar) {
        if (this.f7251b) {
            a(H());
        }
        this.f7254e = yVar;
    }

    @Override // K1.G0
    public D1.y e() {
        return this.f7254e;
    }
}
