package Q1;

import G1.AbstractC0853a;
import K1.C0;
import a2.c0;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class n implements c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f13439a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s f13440b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f13441c = -1;

    public n(s sVar, int i10) {
        this.f13440b = sVar;
        this.f13439a = i10;
    }

    @Override // a2.c0
    public void a() throws IOException {
        int i10 = this.f13441c;
        if (i10 == -2) {
            throw new u(this.f13440b.q().b(this.f13439a).a(0).f1805o);
        }
        if (i10 == -1) {
            this.f13440b.X();
        } else if (i10 != -3) {
            this.f13440b.Y(i10);
        }
    }

    public void b() {
        AbstractC0853a.a(this.f13441c == -1);
        this.f13441c = this.f13440b.A(this.f13439a);
    }

    public final boolean c() {
        int i10 = this.f13441c;
        return (i10 == -1 || i10 == -3 || i10 == -2) ? false : true;
    }

    public void d() {
        if (this.f13441c != -1) {
            this.f13440b.t0(this.f13439a);
            this.f13441c = -1;
        }
    }

    @Override // a2.c0
    public int f(C0 c02, J1.f fVar, int i10) {
        if (this.f13441c == -3) {
            fVar.q(4);
            return -4;
        }
        if (c()) {
            return this.f13440b.i0(this.f13441c, c02, fVar, i10);
        }
        return -3;
    }

    @Override // a2.c0
    public boolean isReady() {
        if (this.f13441c != -3) {
            return c() && this.f13440b.S(this.f13441c);
        }
        return true;
    }

    @Override // a2.c0
    public int n(long j10) {
        if (c()) {
            return this.f13440b.s0(this.f13441c, j10);
        }
        return 0;
    }
}
