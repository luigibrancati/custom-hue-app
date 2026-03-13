package B2;

import B2.g;
import D1.o;
import D1.u;
import G1.AbstractC0853a;
import G1.C;
import G1.M;
import G1.t;
import com.google.android.libraries.barhopper.RecognitionOptions;
import i2.B;
import i2.C4334n;
import i2.D;
import i2.F;
import i2.I;
import i2.InterfaceC4336p;
import i2.InterfaceC4337q;
import i2.O;
import i2.r;
import i2.u;
import java.io.EOFException;
import java.math.RoundingMode;
import w2.h;
import w2.l;
import w2.n;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class f implements InterfaceC4336p {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final u f579v = new u() { // from class: B2.d
        @Override // i2.u
        public final InterfaceC4336p[] f() {
            return f.b();
        }
    };

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final h.a f580w = new h.a() { // from class: B2.e
        @Override // w2.h.a
        public final boolean a(int i10, int i11, int i12, int i13, int i14) {
            return f.d(i10, i11, i12, i13, i14);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f581a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f582b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C f583c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final F.a f584d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final B f585e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final D f586f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final O f587g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public r f588h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public O f589i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public O f590j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f591k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public D1.u f592l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f593m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f594n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f595o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f596p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f597q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public g f598r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f599s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f600t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f601u;

    public f() {
        this(0);
    }

    public static /* synthetic */ InterfaceC4336p[] b() {
        return new InterfaceC4336p[]{new f()};
    }

    public static /* synthetic */ boolean d(int i10, int i11, int i12, int i13, int i14) {
        if (i11 == 67 && i12 == 79 && i13 == 77 && (i14 == 77 || i10 == 2)) {
            return true;
        }
        if (i11 == 77 && i12 == 76 && i13 == 76) {
            return i14 == 84 || i10 == 2;
        }
        return false;
    }

    private void e() {
        AbstractC0853a.i(this.f589i);
        M.i(this.f588h);
    }

    public static long o(D1.u uVar) {
        if (uVar == null) {
            return -9223372036854775807L;
        }
        int iE = uVar.e();
        for (int i10 = 0; i10 < iE; i10++) {
            u.a aVarD = uVar.d(i10);
            if (aVarD instanceof n) {
                n nVar = (n) aVarD;
                if (nVar.f46121a.equals("TLEN")) {
                    return M.M0(Long.parseLong((String) nVar.f46135d.get(0)));
                }
            }
        }
        return -9223372036854775807L;
    }

    public static int p(C c10, int i10) {
        if (c10.j() >= i10 + 4) {
            c10.a0(i10);
            int iU = c10.u();
            if (iU == 1483304551 || iU == 1231971951) {
                return iU;
            }
        }
        if (c10.j() < 40) {
            return 0;
        }
        c10.a0(36);
        return c10.u() == 1447187017 ? 1447187017 : 0;
    }

    public static boolean q(int i10, long j10) {
        return ((long) (i10 & (-128000))) == (j10 & (-128000));
    }

    public static c r(D1.u uVar, long j10) {
        if (uVar == null) {
            return null;
        }
        int iE = uVar.e();
        for (int i10 = 0; i10 < iE; i10++) {
            u.a aVarD = uVar.d(i10);
            if (aVarD instanceof l) {
                return c.a(j10, (l) aVarD, o(uVar));
            }
        }
        return null;
    }

    private int w(InterfaceC4337q interfaceC4337q) {
        if (this.f597q == 0) {
            interfaceC4337q.i();
            if (u(interfaceC4337q)) {
                return -1;
            }
            this.f583c.a0(0);
            int iU = this.f583c.u();
            if (!q(iU, this.f591k) || F.j(iU) == -1) {
                interfaceC4337q.q(1);
                this.f591k = 0;
                return 0;
            }
            this.f584d.a(iU);
            if (this.f593m == -9223372036854775807L) {
                this.f593m = this.f598r.b(interfaceC4337q.getPosition());
                if (this.f582b != -9223372036854775807L) {
                    this.f593m += this.f582b - this.f598r.b(0L);
                }
            }
            this.f597q = this.f584d.f36866c;
            long position = interfaceC4337q.getPosition();
            F.a aVar = this.f584d;
            this.f596p = position + ((long) aVar.f36866c);
            g gVar = this.f598r;
            if (gVar instanceof b) {
                b bVar = (b) gVar;
                bVar.c(h(this.f594n + ((long) aVar.f36870g)), this.f596p);
                if (this.f600t && bVar.a(this.f601u)) {
                    this.f600t = false;
                    this.f590j = this.f589i;
                }
            }
        }
        int iA = this.f590j.a(interfaceC4337q, this.f597q, true);
        if (iA == -1) {
            return -1;
        }
        int i10 = this.f597q - iA;
        this.f597q = i10;
        if (i10 > 0) {
            return 0;
        }
        this.f590j.d(h(this.f594n), 1, this.f584d.f36866c, 0, null);
        this.f594n += (long) this.f584d.f36870g;
        this.f597q = 0;
        return 0;
    }

    @Override // i2.InterfaceC4336p
    public void a(long j10, long j11) {
        this.f591k = 0;
        this.f593m = -9223372036854775807L;
        this.f594n = 0L;
        this.f597q = 0;
        this.f601u = j11;
        g gVar = this.f598r;
        if (!(gVar instanceof b) || ((b) gVar).a(j11)) {
            return;
        }
        this.f600t = true;
        this.f590j = this.f587g;
    }

    @Override // i2.InterfaceC4336p
    public void c(r rVar) {
        this.f588h = rVar;
        O oF = rVar.f(0, 1);
        this.f589i = oF;
        this.f590j = oF;
        this.f588h.n();
    }

    public final g g(InterfaceC4337q interfaceC4337q) {
        long jO;
        long j10;
        long jG;
        g gVarS = s(interfaceC4337q);
        c cVarR = r(this.f592l, interfaceC4337q.getPosition());
        if (this.f599s) {
            return new g.a();
        }
        if ((this.f581a & 4) != 0) {
            if (cVarR != null) {
                jO = cVarR.m();
                jG = cVarR.g();
            } else if (gVarS != null) {
                jO = gVarS.m();
                jG = gVarS.g();
            } else {
                jO = o(this.f592l);
                j10 = -1;
                gVarS = new b(jO, interfaceC4337q.getPosition(), j10);
            }
            j10 = jG;
            gVarS = new b(jO, interfaceC4337q.getPosition(), j10);
        } else if (cVarR != null) {
            gVarS = cVarR;
        } else if (gVarS == null) {
            gVarS = null;
        }
        if (gVarS != null && x(gVarS) && gVarS.m() != -9223372036854775807L && (gVarS.g() != -1 || interfaceC4337q.getLength() != -1)) {
            long jD = gVarS.d() != -1 ? gVarS.d() : 0L;
            long jG2 = gVarS.g() != -1 ? gVarS.g() : interfaceC4337q.getLength();
            gVarS = new a(jG2, jD, N7.g.n(M.d1(jG2 - jD, 8000000L, gVarS.m(), RoundingMode.HALF_UP)), -1, false);
        } else if (gVarS == null || x(gVarS)) {
            gVarS = n(interfaceC4337q, (this.f581a & 2) != 0);
        }
        this.f589i.f(gVarS.m());
        return gVarS;
    }

    public final long h(long j10) {
        return this.f593m + ((j10 * 1000000) / ((long) this.f584d.f36867d));
    }

    @Override // i2.InterfaceC4336p
    public int i(InterfaceC4337q interfaceC4337q, I i10) throws Throwable {
        e();
        int iV = v(interfaceC4337q);
        if (iV == -1 && (this.f598r instanceof b)) {
            long jH = h(this.f594n);
            if (this.f598r.m() != jH) {
                ((b) this.f598r).f(jH);
                this.f588h.v(this.f598r);
                this.f589i.f(this.f598r.m());
            }
        }
        return iV;
    }

    @Override // i2.InterfaceC4336p
    public boolean j(InterfaceC4337q interfaceC4337q) {
        return y(interfaceC4337q, true);
    }

    public void l() {
        this.f599s = true;
    }

    public final g m(long j10, i iVar, long j11) {
        long j12;
        long j13;
        long jA = iVar.a();
        if (jA == -9223372036854775807L) {
            return null;
        }
        long j14 = iVar.f610c;
        if (j14 != -1) {
            long j15 = j10 + j14;
            j12 = j14 - ((long) iVar.f608a.f36866c);
            j13 = j15;
        } else {
            if (j11 == -1) {
                return null;
            }
            j12 = (j11 - j10) - ((long) iVar.f608a.f36866c);
            j13 = j11;
        }
        long j16 = j12;
        RoundingMode roundingMode = RoundingMode.HALF_UP;
        return new a(j13, j10 + ((long) iVar.f608a.f36866c), N7.g.e(M.d1(j16, 8000000L, jA, roundingMode)), N7.g.e(M7.e.b(j16, iVar.f609b, roundingMode)), false);
    }

    public final g n(InterfaceC4337q interfaceC4337q, boolean z10) {
        interfaceC4337q.s(this.f583c.f(), 0, 4);
        this.f583c.a0(0);
        this.f584d.a(this.f583c.u());
        return new a(interfaceC4337q.getLength(), interfaceC4337q.getPosition(), this.f584d, z10);
    }

    public final g s(InterfaceC4337q interfaceC4337q) {
        int i10;
        int i11;
        C c10 = new C(this.f584d.f36866c);
        interfaceC4337q.s(c10.f(), 0, this.f584d.f36866c);
        F.a aVar = this.f584d;
        int i12 = 21;
        if ((aVar.f36864a & 1) != 0) {
            if (aVar.f36868e != 1) {
                i12 = 36;
            }
        } else if (aVar.f36868e == 1) {
            i12 = 13;
        }
        int iP = p(c10, i12);
        if (iP != 1231971951) {
            if (iP == 1447187017) {
                h hVarA = h.a(interfaceC4337q.getLength(), interfaceC4337q.getPosition(), this.f584d, c10);
                interfaceC4337q.q(this.f584d.f36866c);
                return hVarA;
            }
            if (iP != 1483304551) {
                interfaceC4337q.i();
                return null;
            }
        }
        i iVarB = i.b(this.f584d, c10);
        if (!this.f585e.a() && (i10 = iVarB.f611d) != -1 && (i11 = iVarB.f612e) != -1) {
            B b10 = this.f585e;
            b10.f36834a = i10;
            b10.f36835b = i11;
        }
        long position = interfaceC4337q.getPosition();
        if (interfaceC4337q.getLength() != -1 && iVarB.f610c != -1 && interfaceC4337q.getLength() != iVarB.f610c + position) {
            t.f("Mp3Extractor", "Data size mismatch between stream (" + interfaceC4337q.getLength() + ") and Xing frame (" + (iVarB.f610c + position) + "), using Xing value.");
        }
        interfaceC4337q.q(this.f584d.f36866c);
        return iP == 1483304551 ? j.a(iVarB, position) : m(position, iVarB, interfaceC4337q.getLength());
    }

    public final void t() {
        g gVar = this.f598r;
        if ((gVar instanceof a) && gVar.h()) {
            long j10 = this.f596p;
            if (j10 == -1 || j10 == this.f598r.g()) {
                return;
            }
            this.f598r = ((a) this.f598r).i(this.f596p);
            ((r) AbstractC0853a.e(this.f588h)).v(this.f598r);
            ((O) AbstractC0853a.e(this.f589i)).f(this.f598r.m());
        }
    }

    public final boolean u(InterfaceC4337q interfaceC4337q) {
        g gVar = this.f598r;
        if (gVar != null) {
            long jG = gVar.g();
            if (jG != -1 && interfaceC4337q.m() > jG - 4) {
                return true;
            }
        }
        try {
            return !interfaceC4337q.e(this.f583c.f(), 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    public final int v(InterfaceC4337q interfaceC4337q) throws Throwable {
        if (this.f591k == 0) {
            try {
                y(interfaceC4337q, false);
            } catch (EOFException unused) {
                return -1;
            }
        }
        if (this.f598r == null) {
            g gVarG = g(interfaceC4337q);
            this.f598r = gVarG;
            this.f588h.v(gVarG);
            o.b bVarR0 = new o.b().W("audio/mpeg").y0(this.f584d.f36865b).o0(RecognitionOptions.AZTEC).T(this.f584d.f36868e).z0(this.f584d.f36867d).d0(this.f585e.f36834a).e0(this.f585e.f36835b).r0((this.f581a & 8) != 0 ? null : this.f592l);
            if (this.f598r.l() != -2147483647) {
                bVarR0.S(this.f598r.l());
            }
            this.f590j.e(bVarR0.P());
            this.f595o = interfaceC4337q.getPosition();
        } else if (this.f595o != 0) {
            long position = interfaceC4337q.getPosition();
            long j10 = this.f595o;
            if (position < j10) {
                interfaceC4337q.q((int) (j10 - position));
            }
        }
        return w(interfaceC4337q);
    }

    public final boolean x(g gVar) {
        return (gVar.h() || (this.f581a & 1) == 0) ? false : true;
    }

    public final boolean y(InterfaceC4337q interfaceC4337q, boolean z10) throws Throwable {
        int iM;
        int i10;
        int iJ;
        int i11 = z10 ? 32768 : 131072;
        interfaceC4337q.i();
        if (interfaceC4337q.getPosition() == 0) {
            D1.u uVarA = this.f586f.a(interfaceC4337q, (this.f581a & 8) == 0 ? null : f580w);
            this.f592l = uVarA;
            if (uVarA != null) {
                this.f585e.c(uVarA);
            }
            iM = (int) interfaceC4337q.m();
            if (!z10) {
                interfaceC4337q.q(iM);
            }
            i10 = 0;
        } else {
            iM = 0;
            i10 = 0;
        }
        int i12 = i10;
        int i13 = i12;
        while (true) {
            if (!u(interfaceC4337q)) {
                this.f583c.a0(0);
                int iU = this.f583c.u();
                if ((i10 == 0 || q(iU, i10)) && (iJ = F.j(iU)) != -1) {
                    i12++;
                    if (i12 != 1) {
                        if (i12 == 4) {
                            break;
                        }
                    } else {
                        this.f584d.a(iU);
                        i10 = iU;
                    }
                    interfaceC4337q.o(iJ - 4);
                } else {
                    int i14 = i13 + 1;
                    if (i13 == i11) {
                        if (z10) {
                            return false;
                        }
                        t();
                        throw new EOFException();
                    }
                    if (z10) {
                        interfaceC4337q.i();
                        interfaceC4337q.o(iM + i14);
                    } else {
                        interfaceC4337q.q(1);
                    }
                    i12 = 0;
                    i13 = i14;
                    i10 = 0;
                }
            } else if (i12 <= 0) {
                t();
                throw new EOFException();
            }
        }
        if (z10) {
            interfaceC4337q.q(iM + i13);
        } else {
            interfaceC4337q.i();
        }
        this.f591k = i10;
        return true;
    }

    public f(int i10) {
        this(i10, -9223372036854775807L);
    }

    public f(int i10, long j10) {
        this.f581a = (i10 & 2) != 0 ? i10 | 1 : i10;
        this.f582b = j10;
        this.f583c = new C(10);
        this.f584d = new F.a();
        this.f585e = new B();
        this.f593m = -9223372036854775807L;
        this.f586f = new D();
        C4334n c4334n = new C4334n();
        this.f587g = c4334n;
        this.f590j = c4334n;
        this.f596p = -1L;
    }

    @Override // i2.InterfaceC4336p
    public void release() {
    }
}
