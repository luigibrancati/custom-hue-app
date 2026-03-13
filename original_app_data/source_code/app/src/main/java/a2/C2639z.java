package a2;

import G1.AbstractC0853a;
import K1.F0;
import K1.k1;
import a2.InterfaceC2610C;
import a2.InterfaceC2611D;
import java.io.IOException;

/* JADX INFO: renamed from: a2.z, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C2639z implements InterfaceC2610C, InterfaceC2610C.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC2611D.b f20923a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f20924b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e2.b f20925c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public InterfaceC2611D f20926d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public InterfaceC2610C f20927e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public InterfaceC2610C.a f20928f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public a f20929g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f20930h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f20931i = -9223372036854775807L;

    /* JADX INFO: renamed from: a2.z$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface a {
        void a(InterfaceC2611D.b bVar);

        void b(InterfaceC2611D.b bVar, IOException iOException);
    }

    public C2639z(InterfaceC2611D.b bVar, e2.b bVar2, long j10) {
        this.f20923a = bVar;
        this.f20925c = bVar2;
        this.f20924b = j10;
    }

    public void a(InterfaceC2611D.b bVar) {
        long jT = t(this.f20924b);
        InterfaceC2610C interfaceC2610CK = ((InterfaceC2611D) AbstractC0853a.e(this.f20926d)).k(bVar, this.f20925c, jT);
        this.f20927e = interfaceC2610CK;
        if (this.f20928f != null) {
            interfaceC2610CK.p(this, jT);
        }
    }

    @Override // a2.InterfaceC2610C, a2.d0
    public long b() {
        return ((InterfaceC2610C) G1.M.i(this.f20927e)).b();
    }

    @Override // a2.InterfaceC2610C
    public long c(long j10, k1 k1Var) {
        return ((InterfaceC2610C) G1.M.i(this.f20927e)).c(j10, k1Var);
    }

    @Override // a2.InterfaceC2610C, a2.d0
    public boolean d() {
        InterfaceC2610C interfaceC2610C = this.f20927e;
        return interfaceC2610C != null && interfaceC2610C.d();
    }

    @Override // a2.InterfaceC2610C, a2.d0
    public boolean e(F0 f02) {
        InterfaceC2610C interfaceC2610C = this.f20927e;
        return interfaceC2610C != null && interfaceC2610C.e(f02);
    }

    @Override // a2.InterfaceC2610C, a2.d0
    public long g() {
        return ((InterfaceC2610C) G1.M.i(this.f20927e)).g();
    }

    @Override // a2.InterfaceC2610C, a2.d0
    public void h(long j10) {
        ((InterfaceC2610C) G1.M.i(this.f20927e)).h(j10);
    }

    @Override // a2.InterfaceC2610C
    public long i(long j10) {
        return ((InterfaceC2610C) G1.M.i(this.f20927e)).i(j10);
    }

    @Override // a2.InterfaceC2610C
    public long k() {
        return ((InterfaceC2610C) G1.M.i(this.f20927e)).k();
    }

    @Override // a2.InterfaceC2610C
    public long l(d2.r[] rVarArr, boolean[] zArr, c0[] c0VarArr, boolean[] zArr2, long j10) {
        long j11 = this.f20931i;
        if (j11 != -9223372036854775807L && j10 == this.f20924b) {
            j10 = j11;
        }
        this.f20931i = -9223372036854775807L;
        return ((InterfaceC2610C) G1.M.i(this.f20927e)).l(rVarArr, zArr, c0VarArr, zArr2, j10);
    }

    @Override // a2.InterfaceC2610C
    public void m() throws IOException {
        try {
            InterfaceC2610C interfaceC2610C = this.f20927e;
            if (interfaceC2610C != null) {
                interfaceC2610C.m();
                return;
            }
            InterfaceC2611D interfaceC2611D = this.f20926d;
            if (interfaceC2611D != null) {
                interfaceC2611D.n();
            }
        } catch (IOException e10) {
            a aVar = this.f20929g;
            if (aVar == null) {
                throw e10;
            }
            if (this.f20930h) {
                return;
            }
            this.f20930h = true;
            aVar.b(this.f20923a, e10);
        }
    }

    @Override // a2.InterfaceC2610C.a
    public void n(InterfaceC2610C interfaceC2610C) {
        ((InterfaceC2610C.a) G1.M.i(this.f20928f)).n(this);
        a aVar = this.f20929g;
        if (aVar != null) {
            aVar.a(this.f20923a);
        }
    }

    @Override // a2.InterfaceC2610C
    public void p(InterfaceC2610C.a aVar, long j10) {
        this.f20928f = aVar;
        InterfaceC2610C interfaceC2610C = this.f20927e;
        if (interfaceC2610C != null) {
            interfaceC2610C.p(this, t(this.f20924b));
        }
    }

    @Override // a2.InterfaceC2610C
    public n0 q() {
        return ((InterfaceC2610C) G1.M.i(this.f20927e)).q();
    }

    public long r() {
        return this.f20931i;
    }

    public long s() {
        return this.f20924b;
    }

    public final long t(long j10) {
        long j11 = this.f20931i;
        return j11 != -9223372036854775807L ? j11 : j10;
    }

    @Override // a2.InterfaceC2610C
    public void u(long j10, boolean z10) {
        ((InterfaceC2610C) G1.M.i(this.f20927e)).u(j10, z10);
    }

    @Override // a2.d0.a
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public void f(InterfaceC2610C interfaceC2610C) {
        ((InterfaceC2610C.a) G1.M.i(this.f20928f)).f(this);
    }

    public void w(long j10) {
        this.f20931i = j10;
    }

    public void x() {
        if (this.f20927e != null) {
            ((InterfaceC2611D) AbstractC0853a.e(this.f20926d)).h(this.f20927e);
        }
    }

    public void y(InterfaceC2611D interfaceC2611D) {
        AbstractC0853a.g(this.f20926d == null);
        this.f20926d = interfaceC2611D;
    }
}
