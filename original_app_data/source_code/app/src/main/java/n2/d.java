package n2;

import G1.AbstractC0853a;
import G1.C;
import G1.M;
import i2.I;
import i2.InterfaceC4336p;
import i2.InterfaceC4337q;
import i2.J;
import i2.O;
import i2.r;
import i2.u;
import i2.v;
import i2.w;
import i2.x;
import i2.y;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class d implements InterfaceC4336p {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final u f40523o = new u() { // from class: n2.c
        @Override // i2.u
        public final InterfaceC4336p[] f() {
            return d.b();
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f40524a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C f40525b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f40526c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final v.a f40527d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public r f40528e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public O f40529f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f40530g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public D1.u f40531h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public y f40532i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f40533j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f40534k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public b f40535l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f40536m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f40537n;

    public d() {
        this(0);
    }

    public static /* synthetic */ InterfaceC4336p[] b() {
        return new InterfaceC4336p[]{new d()};
    }

    @Override // i2.InterfaceC4336p
    public void a(long j10, long j11) {
        if (j10 == 0) {
            this.f40530g = 0;
        } else {
            b bVar = this.f40535l;
            if (bVar != null) {
                bVar.h(j11);
            }
        }
        this.f40537n = j11 != 0 ? -1L : 0L;
        this.f40536m = 0;
        this.f40525b.W(0);
    }

    @Override // i2.InterfaceC4336p
    public void c(r rVar) {
        this.f40528e = rVar;
        this.f40529f = rVar.f(0, 1);
        rVar.n();
    }

    public final long d(C c10, boolean z10) {
        boolean zD;
        AbstractC0853a.e(this.f40532i);
        int iG = c10.g();
        while (iG <= c10.j() - 16) {
            c10.a0(iG);
            if (v.d(c10, this.f40532i, this.f40534k, this.f40527d)) {
                c10.a0(iG);
                return this.f40527d.f37048a;
            }
            iG++;
        }
        if (!z10) {
            c10.a0(iG);
            return -1L;
        }
        while (iG <= c10.j() - this.f40533j) {
            c10.a0(iG);
            try {
                zD = v.d(c10, this.f40532i, this.f40534k, this.f40527d);
            } catch (IndexOutOfBoundsException unused) {
                zD = false;
            }
            if (c10.g() <= c10.j() ? zD : false) {
                c10.a0(iG);
                return this.f40527d.f37048a;
            }
            iG++;
        }
        c10.a0(c10.j());
        return -1L;
    }

    public final void e(InterfaceC4337q interfaceC4337q) {
        this.f40534k = w.b(interfaceC4337q);
        ((r) M.i(this.f40528e)).v(g(interfaceC4337q.getPosition(), interfaceC4337q.getLength()));
        this.f40530g = 5;
    }

    public final J g(long j10, long j11) {
        AbstractC0853a.e(this.f40532i);
        y yVar = this.f40532i;
        y.a aVar = yVar.f37062k;
        if (aVar != null && aVar.f37064a.length > 0) {
            return new x(yVar, j10);
        }
        if (j11 == -1 || yVar.f37061j <= 0) {
            return new J.b(yVar.f());
        }
        b bVar = new b(yVar, this.f40534k, j10, j11);
        this.f40535l = bVar;
        return bVar.b();
    }

    public final void h(InterfaceC4337q interfaceC4337q) {
        byte[] bArr = this.f40524a;
        interfaceC4337q.s(bArr, 0, bArr.length);
        interfaceC4337q.i();
        this.f40530g = 2;
    }

    @Override // i2.InterfaceC4336p
    public int i(InterfaceC4337q interfaceC4337q, I i10) throws D1.w {
        int i11 = this.f40530g;
        if (i11 == 0) {
            n(interfaceC4337q);
            return 0;
        }
        if (i11 == 1) {
            h(interfaceC4337q);
            return 0;
        }
        if (i11 == 2) {
            p(interfaceC4337q);
            return 0;
        }
        if (i11 == 3) {
            o(interfaceC4337q);
            return 0;
        }
        if (i11 == 4) {
            e(interfaceC4337q);
            return 0;
        }
        if (i11 == 5) {
            return m(interfaceC4337q, i10);
        }
        throw new IllegalStateException();
    }

    @Override // i2.InterfaceC4336p
    public boolean j(InterfaceC4337q interfaceC4337q) throws Throwable {
        w.c(interfaceC4337q, false);
        return w.a(interfaceC4337q);
    }

    public final void l() {
        ((O) M.i(this.f40529f)).d((this.f40537n * 1000000) / ((long) ((y) M.i(this.f40532i)).f37056e), 1, this.f40536m, 0, null);
    }

    public final int m(InterfaceC4337q interfaceC4337q, I i10) {
        boolean z10;
        AbstractC0853a.e(this.f40529f);
        AbstractC0853a.e(this.f40532i);
        b bVar = this.f40535l;
        if (bVar != null && bVar.d()) {
            return this.f40535l.c(interfaceC4337q, i10);
        }
        if (this.f40537n == -1) {
            this.f40537n = v.i(interfaceC4337q, this.f40532i);
            return 0;
        }
        int iJ = this.f40525b.j();
        if (iJ < 32768) {
            int i11 = interfaceC4337q.read(this.f40525b.f(), iJ, 32768 - iJ);
            z10 = i11 == -1;
            if (!z10) {
                this.f40525b.Z(iJ + i11);
            } else if (this.f40525b.a() == 0) {
                l();
                return -1;
            }
        } else {
            z10 = false;
        }
        int iG = this.f40525b.g();
        int i12 = this.f40536m;
        int i13 = this.f40533j;
        if (i12 < i13) {
            C c10 = this.f40525b;
            c10.b0(Math.min(i13 - i12, c10.a()));
        }
        long jD = d(this.f40525b, z10);
        int iG2 = this.f40525b.g() - iG;
        this.f40525b.a0(iG);
        this.f40529f.b(this.f40525b, iG2);
        this.f40536m += iG2;
        if (jD != -1) {
            l();
            this.f40536m = 0;
            this.f40537n = jD;
        }
        int length = this.f40525b.f().length - this.f40525b.j();
        if (this.f40525b.a() < 16 && length < 16) {
            int iA = this.f40525b.a();
            System.arraycopy(this.f40525b.f(), this.f40525b.g(), this.f40525b.f(), 0, iA);
            this.f40525b.a0(0);
            this.f40525b.Z(iA);
        }
        return 0;
    }

    public final void n(InterfaceC4337q interfaceC4337q) {
        this.f40531h = w.d(interfaceC4337q, !this.f40526c);
        this.f40530g = 1;
    }

    public final void o(InterfaceC4337q interfaceC4337q) {
        w.a aVar = new w.a(this.f40532i);
        boolean zE = false;
        while (!zE) {
            zE = w.e(interfaceC4337q, aVar);
            this.f40532i = (y) M.i(aVar.f37049a);
        }
        AbstractC0853a.e(this.f40532i);
        this.f40533j = Math.max(this.f40532i.f37054c, 6);
        ((O) M.i(this.f40529f)).e(this.f40532i.g(this.f40524a, this.f40531h).b().W("audio/flac").P());
        ((O) M.i(this.f40529f)).f(this.f40532i.f());
        this.f40530g = 4;
    }

    public final void p(InterfaceC4337q interfaceC4337q) throws D1.w {
        w.i(interfaceC4337q);
        this.f40530g = 3;
    }

    public d(int i10) {
        this.f40524a = new byte[42];
        this.f40525b = new C(new byte[32768], 0);
        this.f40526c = (i10 & 1) != 0;
        this.f40527d = new v.a();
        this.f40530g = 0;
    }

    @Override // i2.InterfaceC4336p
    public void release() {
    }
}
