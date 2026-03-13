package D2;

import D1.w;
import G1.AbstractC0853a;
import G1.C;
import i2.I;
import i2.InterfaceC4336p;
import i2.InterfaceC4337q;
import i2.O;
import i2.r;
import i2.u;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class d implements InterfaceC4336p {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final u f2164d = new u() { // from class: D2.c
        @Override // i2.u
        public final InterfaceC4336p[] f() {
            return d.b();
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public r f2165a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public i f2166b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f2167c;

    public static /* synthetic */ InterfaceC4336p[] b() {
        return new InterfaceC4336p[]{new d()};
    }

    public static C d(C c10) {
        c10.a0(0);
        return c10;
    }

    @Override // i2.InterfaceC4336p
    public void a(long j10, long j11) {
        i iVar = this.f2166b;
        if (iVar != null) {
            iVar.m(j10, j11);
        }
    }

    @Override // i2.InterfaceC4336p
    public void c(r rVar) {
        this.f2165a = rVar;
    }

    public final boolean e(InterfaceC4337q interfaceC4337q) {
        f fVar = new f();
        if (fVar.a(interfaceC4337q, true) && (fVar.f2174b & 2) == 2) {
            int iMin = Math.min(fVar.f2181i, 8);
            C c10 = new C(iMin);
            interfaceC4337q.s(c10.f(), 0, iMin);
            if (b.p(d(c10))) {
                this.f2166b = new b();
            } else if (j.r(d(c10))) {
                this.f2166b = new j();
            } else if (h.o(d(c10))) {
                this.f2166b = new h();
            }
            return true;
        }
        return false;
    }

    @Override // i2.InterfaceC4336p
    public int i(InterfaceC4337q interfaceC4337q, I i10) throws w {
        AbstractC0853a.i(this.f2165a);
        if (this.f2166b == null) {
            if (!e(interfaceC4337q)) {
                throw w.a("Failed to determine bitstream type", null);
            }
            interfaceC4337q.i();
        }
        if (!this.f2167c) {
            O oF = this.f2165a.f(0, 1);
            this.f2165a.n();
            this.f2166b.d(this.f2165a, oF);
            this.f2167c = true;
        }
        return this.f2166b.g(interfaceC4337q, i10);
    }

    @Override // i2.InterfaceC4336p
    public boolean j(InterfaceC4337q interfaceC4337q) {
        try {
            return e(interfaceC4337q);
        } catch (w unused) {
            return false;
        }
    }

    @Override // i2.InterfaceC4336p
    public void release() {
    }
}
