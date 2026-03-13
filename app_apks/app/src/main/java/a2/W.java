package a2;

import D1.InterfaceC0749g;
import D1.o;
import G1.AbstractC0853a;
import G1.C0863k;
import I1.j;
import K1.C0;
import K1.F0;
import K1.k1;
import P1.t;
import a2.C2637x;
import a2.InterfaceC2610C;
import a2.L;
import a2.b0;
import android.net.Uri;
import android.os.Handler;
import e2.k;
import e2.m;
import f2.InterfaceExecutorC3986a;
import i2.AbstractC4320A;
import i2.C4334n;
import i2.J;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import v2.C6036b;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class W implements InterfaceC2610C, i2.r, m.b, m.f, b0.d {

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public static final Map f20589X = N();

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public static final D1.o f20590Y = new o.b().j0("icy").y0("application/x-icy").P();

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public boolean f20591A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public f f20592B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public i2.J f20593C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public long f20594D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public boolean f20595E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public int f20596F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public boolean f20597G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public boolean f20598H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public boolean f20599I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public int f20600J;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public boolean f20601P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public long f20602Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public long f20603R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public boolean f20604S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public int f20605T;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public boolean f20606V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public boolean f20607W;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f20608a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final I1.f f20609b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final P1.u f20610c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e2.k f20611d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final L.a f20612e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t.a f20613f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final c f20614g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e2.b f20615h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f20616i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f20617j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f20618k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final D1.o f20619l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final long f20620m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e2.m f20621n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Q f20622o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final C0863k f20623p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Runnable f20624q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Runnable f20625r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Handler f20626s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public InterfaceC2610C.a f20627t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public C6036b f20628u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public b0[] f20629v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public e[] f20630w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f20631x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f20632y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f20633z;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a extends AbstractC4320A {
        public a(i2.J j10) {
            super(j10);
        }

        @Override // i2.AbstractC4320A, i2.J
        public long m() {
            return W.this.f20594D;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public final class b implements m.e, C2637x.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Uri f20636b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final I1.w f20637c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Q f20638d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final i2.r f20639e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final C0863k f20640f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public volatile boolean f20642h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public long f20644j;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public i2.O f20646l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public boolean f20647m;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final i2.I f20641g = new i2.I();

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f20643i = true;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f20635a = C2638y.a();

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public I1.j f20645k = h(0);

        public b(Uri uri, I1.f fVar, Q q10, i2.r rVar, C0863k c0863k) {
            this.f20636b = uri;
            this.f20637c = new I1.w(fVar);
            this.f20638d = q10;
            this.f20639e = rVar;
            this.f20640f = c0863k;
        }

        @Override // a2.C2637x.a
        public void a(G1.C c10) {
            long jMax = !this.f20647m ? this.f20644j : Math.max(W.this.P(true), this.f20644j);
            int iA = c10.a();
            i2.O o10 = (i2.O) AbstractC0853a.e(this.f20646l);
            o10.b(c10, iA);
            o10.d(jMax, 1, iA, 0, null);
            this.f20647m = true;
        }

        @Override // e2.m.e
        public void b() {
            this.f20642h = true;
        }

        public final I1.j h(long j10) {
            return new j.b().i(this.f20636b).h(j10).f(W.this.f20616i).b(6).e(W.f20589X).a();
        }

        public final void i(long j10, long j11) {
            this.f20641g.f36871a = j10;
            this.f20644j = j11;
            this.f20643i = true;
            this.f20647m = false;
        }

        @Override // e2.m.e
        public void load() {
            int iC = 0;
            while (iC == 0 && !this.f20642h) {
                try {
                    long j10 = this.f20641g.f36871a;
                    I1.j jVarH = h(j10);
                    this.f20645k = jVarH;
                    long jF = this.f20637c.f(jVarH);
                    if (this.f20642h) {
                        if (iC != 1 && this.f20638d.e() != -1) {
                            this.f20641g.f36871a = this.f20638d.e();
                        }
                        I1.i.a(this.f20637c);
                        return;
                    }
                    if (jF != -1) {
                        jF += j10;
                        W.this.Y();
                    }
                    long j11 = jF;
                    W.this.f20628u = C6036b.d(this.f20637c.g());
                    InterfaceC0749g c2637x = this.f20637c;
                    if (W.this.f20628u != null && W.this.f20628u.f45753f != -1) {
                        c2637x = new C2637x(this.f20637c, W.this.f20628u.f45753f, this);
                        i2.O oQ = W.this.Q();
                        this.f20646l = oQ;
                        oQ.e(W.f20590Y);
                    }
                    this.f20638d.d(c2637x, this.f20636b, this.f20637c.g(), j10, j11, this.f20639e);
                    if (W.this.f20628u != null) {
                        this.f20638d.b();
                    }
                    if (this.f20643i) {
                        this.f20638d.a(j10, this.f20644j);
                        this.f20643i = false;
                    }
                    while (iC == 0 && !this.f20642h) {
                        try {
                            this.f20640f.a();
                            iC = this.f20638d.c(this.f20641g);
                            long jE = this.f20638d.e();
                            if (jE > W.this.f20617j + j10) {
                                this.f20640f.d();
                                W.this.f20626s.post(W.this.f20625r);
                                j10 = jE;
                            }
                        } catch (InterruptedException unused) {
                            throw new InterruptedIOException();
                        }
                    }
                    if (iC == 1) {
                        iC = 0;
                    } else if (this.f20638d.e() != -1) {
                        this.f20641g.f36871a = this.f20638d.e();
                    }
                    I1.i.a(this.f20637c);
                } catch (Throwable th) {
                    if (iC != 1 && this.f20638d.e() != -1) {
                        this.f20641g.f36871a = this.f20638d.e();
                    }
                    I1.i.a(this.f20637c);
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface c {
        void a(long j10, i2.J j11, boolean z10);
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public final class d implements c0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f20649a;

        public d(int i10) {
            this.f20649a = i10;
        }

        @Override // a2.c0
        public void a() throws IOException {
            W.this.X(this.f20649a);
        }

        @Override // a2.c0
        public int f(C0 c02, J1.f fVar, int i10) {
            return W.this.e0(this.f20649a, c02, fVar, i10);
        }

        @Override // a2.c0
        public boolean isReady() {
            return W.this.S(this.f20649a);
        }

        @Override // a2.c0
        public int n(long j10) {
            return W.this.i0(this.f20649a, j10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f20651a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f20652b;

        public e(int i10, boolean z10) {
            this.f20651a = i10;
            this.f20652b = z10;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && e.class == obj.getClass()) {
                e eVar = (e) obj;
                if (this.f20651a == eVar.f20651a && this.f20652b == eVar.f20652b) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (this.f20651a * 31) + (this.f20652b ? 1 : 0);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final n0 f20653a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean[] f20654b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean[] f20655c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean[] f20656d;

        public f(n0 n0Var, boolean[] zArr) {
            this.f20653a = n0Var;
            this.f20654b = zArr;
            int i10 = n0Var.f20863a;
            this.f20655c = new boolean[i10];
            this.f20656d = new boolean[i10];
        }
    }

    public W(Uri uri, I1.f fVar, Q q10, P1.u uVar, t.a aVar, e2.k kVar, L.a aVar2, c cVar, e2.b bVar, String str, int i10, int i11, D1.o oVar, long j10, InterfaceExecutorC3986a interfaceExecutorC3986a) {
        this.f20608a = uri;
        this.f20609b = fVar;
        this.f20610c = uVar;
        this.f20613f = aVar;
        this.f20611d = kVar;
        this.f20612e = aVar2;
        this.f20614g = cVar;
        this.f20615h = bVar;
        this.f20616i = str;
        this.f20617j = i10;
        this.f20618k = i11;
        this.f20619l = oVar;
        this.f20621n = interfaceExecutorC3986a != null ? new e2.m(interfaceExecutorC3986a) : new e2.m("ProgressiveMediaPeriod");
        this.f20622o = q10;
        this.f20620m = j10;
        this.f20623p = new C0863k();
        this.f20624q = new Runnable() { // from class: a2.T
            @Override // java.lang.Runnable
            public final void run() {
                this.f20585a.T();
            }
        };
        this.f20625r = new Runnable() { // from class: a2.U
            @Override // java.lang.Runnable
            public final void run() {
                W.y(this.f20586a);
            }
        };
        this.f20626s = G1.M.z();
        this.f20630w = new e[0];
        this.f20629v = new b0[0];
        this.f20603R = -9223372036854775807L;
        this.f20596F = 1;
    }

    public static Map N() {
        HashMap map = new HashMap();
        map.put("Icy-MetaData", "1");
        return Collections.unmodifiableMap(map);
    }

    private boolean R() {
        return this.f20603R != -9223372036854775807L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void T() {
        if (this.f20607W || this.f20632y || !this.f20631x || this.f20593C == null) {
            return;
        }
        for (b0 b0Var : this.f20629v) {
            if (b0Var.I() == null) {
                return;
            }
        }
        this.f20623p.d();
        int length = this.f20629v.length;
        D1.E[] eArr = new D1.E[length];
        boolean[] zArr = new boolean[length];
        for (int i10 = 0; i10 < length; i10++) {
            D1.o oVarP = (D1.o) AbstractC0853a.e(this.f20629v[i10].I());
            String str = oVarP.f1805o;
            boolean zO = D1.v.o(str);
            boolean z10 = zO || D1.v.t(str);
            zArr[i10] = z10;
            this.f20633z = z10 | this.f20633z;
            this.f20591A = this.f20620m != -9223372036854775807L && length == 1 && D1.v.q(str);
            C6036b c6036b = this.f20628u;
            if (c6036b != null) {
                if (zO || this.f20630w[i10].f20652b) {
                    D1.u uVar = oVarP.f1802l;
                    oVarP = oVarP.b().r0(uVar == null ? new D1.u(c6036b) : uVar.a(c6036b)).P();
                }
                if (zO && oVarP.f1798h == -1 && oVarP.f1799i == -1 && c6036b.f45748a != -1) {
                    oVarP = oVarP.b().S(c6036b.f45748a).P();
                }
            }
            D1.o oVarC = oVarP.c(this.f20610c.b(oVarP));
            eArr[i10] = new D1.E(Integer.toString(i10), oVarC);
            this.f20599I = oVarC.f1811u | this.f20599I;
        }
        this.f20592B = new f(new n0(eArr), zArr);
        if (this.f20591A && this.f20594D == -9223372036854775807L) {
            this.f20594D = this.f20620m;
            this.f20593C = new a(this.f20593C);
        }
        this.f20614g.a(this.f20594D, this.f20593C, this.f20595E);
        this.f20632y = true;
        ((InterfaceC2610C.a) AbstractC0853a.e(this.f20627t)).n(this);
    }

    public static /* synthetic */ void y(W w10) {
        if (w10.f20607W) {
            return;
        }
        ((InterfaceC2610C.a) AbstractC0853a.e(w10.f20627t)).f(w10);
    }

    public final void L() {
        AbstractC0853a.g(this.f20632y);
        AbstractC0853a.e(this.f20592B);
        AbstractC0853a.e(this.f20593C);
    }

    public final boolean M(b bVar, int i10) {
        i2.J j10;
        if (this.f20601P || !((j10 = this.f20593C) == null || j10.m() == -9223372036854775807L)) {
            this.f20605T = i10;
            return true;
        }
        if (this.f20632y && !k0()) {
            this.f20604S = true;
            return false;
        }
        this.f20598H = this.f20632y;
        this.f20602Q = 0L;
        this.f20605T = 0;
        for (b0 b0Var : this.f20629v) {
            b0Var.X();
        }
        bVar.i(0L, 0L);
        return true;
    }

    public final int O() {
        int iJ = 0;
        for (b0 b0Var : this.f20629v) {
            iJ += b0Var.J();
        }
        return iJ;
    }

    public final long P(boolean z10) {
        long jMax = Long.MIN_VALUE;
        for (int i10 = 0; i10 < this.f20629v.length; i10++) {
            if (z10 || ((f) AbstractC0853a.e(this.f20592B)).f20655c[i10]) {
                jMax = Math.max(jMax, this.f20629v[i10].C());
            }
        }
        return jMax;
    }

    public i2.O Q() {
        return d0(new e(0, true));
    }

    public boolean S(int i10) {
        return !k0() && this.f20629v[i10].N(this.f20606V);
    }

    public final void U(int i10) {
        L();
        f fVar = this.f20592B;
        boolean[] zArr = fVar.f20656d;
        if (zArr[i10]) {
            return;
        }
        D1.o oVarA = fVar.f20653a.b(i10).a(0);
        this.f20612e.j(D1.v.k(oVarA.f1805o), oVarA, 0, null, this.f20602Q);
        zArr[i10] = true;
    }

    public final void V(int i10) {
        L();
        if (this.f20604S) {
            if (!this.f20633z || this.f20592B.f20654b[i10]) {
                if (this.f20629v[i10].N(false)) {
                    return;
                }
                this.f20603R = 0L;
                this.f20604S = false;
                this.f20598H = true;
                this.f20602Q = 0L;
                this.f20605T = 0;
                for (b0 b0Var : this.f20629v) {
                    b0Var.X();
                }
                ((InterfaceC2610C.a) AbstractC0853a.e(this.f20627t)).f(this);
            }
        }
    }

    public void W() throws IOException {
        this.f20621n.k(this.f20611d.b(this.f20596F));
    }

    public void X(int i10) throws IOException {
        this.f20629v[i10].P();
        W();
    }

    public final void Y() {
        this.f20626s.post(new Runnable() { // from class: a2.S
            @Override // java.lang.Runnable
            public final void run() {
                this.f20584a.f20601P = true;
            }
        });
    }

    @Override // e2.m.b
    /* JADX INFO: renamed from: Z, reason: merged with bridge method [inline-methods] */
    public void t(b bVar, long j10, long j11, boolean z10) {
        I1.w wVar = bVar.f20637c;
        C2638y c2638y = new C2638y(bVar.f20635a, bVar.f20645k, wVar.t(), wVar.u(), j10, j11, wVar.l());
        this.f20611d.d(bVar.f20635a);
        this.f20612e.m(c2638y, 1, -1, null, 0, null, bVar.f20644j, this.f20594D);
        if (z10) {
            return;
        }
        for (b0 b0Var : this.f20629v) {
            b0Var.X();
        }
        if (this.f20600J > 0) {
            ((InterfaceC2610C.a) AbstractC0853a.e(this.f20627t)).f(this);
        }
    }

    @Override // e2.m.b
    /* JADX INFO: renamed from: a0, reason: merged with bridge method [inline-methods] */
    public void w(b bVar, long j10, long j11) {
        if (this.f20594D == -9223372036854775807L && this.f20593C != null) {
            long jP = P(true);
            long j12 = jP == Long.MIN_VALUE ? 0L : jP + 10000;
            this.f20594D = j12;
            this.f20614g.a(j12, this.f20593C, this.f20595E);
        }
        I1.w wVar = bVar.f20637c;
        C2638y c2638y = new C2638y(bVar.f20635a, bVar.f20645k, wVar.t(), wVar.u(), j10, j11, wVar.l());
        this.f20611d.d(bVar.f20635a);
        this.f20612e.p(c2638y, 1, -1, null, 0, null, bVar.f20644j, this.f20594D);
        this.f20606V = true;
        ((InterfaceC2610C.a) AbstractC0853a.e(this.f20627t)).f(this);
    }

    @Override // a2.InterfaceC2610C, a2.d0
    public long b() {
        return g();
    }

    @Override // e2.m.b
    /* JADX INFO: renamed from: b0, reason: merged with bridge method [inline-methods] */
    public m.c o(b bVar, long j10, long j11, IOException iOException, int i10) {
        b bVar2;
        m.c cVarH;
        I1.w wVar = bVar.f20637c;
        C2638y c2638y = new C2638y(bVar.f20635a, bVar.f20645k, wVar.t(), wVar.u(), j10, j11, wVar.l());
        long jA = this.f20611d.a(new k.c(c2638y, new C2609B(1, -1, null, 0, null, G1.M.o1(bVar.f20644j), G1.M.o1(this.f20594D)), iOException, i10));
        if (jA == -9223372036854775807L) {
            cVarH = e2.m.f33635g;
            bVar2 = bVar;
        } else {
            int iO = O();
            bVar2 = bVar;
            cVarH = M(bVar2, iO) ? e2.m.h(iO > this.f20605T, jA) : e2.m.f33634f;
        }
        boolean zC = cVarH.c();
        this.f20612e.r(c2638y, 1, -1, null, 0, null, bVar2.f20644j, this.f20594D, iOException, !zC);
        if (!zC) {
            this.f20611d.d(bVar2.f20635a);
        }
        return cVarH;
    }

    @Override // a2.InterfaceC2610C
    public long c(long j10, k1 k1Var) {
        L();
        if (!this.f20593C.h()) {
            return 0L;
        }
        J.a aVarE = this.f20593C.e(j10);
        return k1Var.a(j10, aVarE.f36872a.f36877a, aVarE.f36873b.f36877a);
    }

    @Override // e2.m.b
    /* JADX INFO: renamed from: c0, reason: merged with bridge method [inline-methods] */
    public void s(b bVar, long j10, long j11, int i10) {
        I1.w wVar = bVar.f20637c;
        this.f20612e.v(i10 == 0 ? new C2638y(bVar.f20635a, bVar.f20645k, j10) : new C2638y(bVar.f20635a, bVar.f20645k, wVar.t(), wVar.u(), j10, j11, wVar.l()), 1, -1, null, 0, null, bVar.f20644j, this.f20594D, i10);
    }

    @Override // a2.InterfaceC2610C, a2.d0
    public boolean d() {
        return this.f20621n.j() && this.f20623p.e();
    }

    public final i2.O d0(e eVar) {
        int length = this.f20629v.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (eVar.equals(this.f20630w[i10])) {
                return this.f20629v[i10];
            }
        }
        if (this.f20631x) {
            G1.t.h("ProgressiveMediaPeriod", "Extractor added new track (id=" + eVar.f20651a + ") after finishing tracks.");
            return new C4334n();
        }
        b0 b0VarL = b0.l(this.f20615h, this.f20610c, this.f20613f);
        b0VarL.f0(this);
        int i11 = length + 1;
        e[] eVarArr = (e[]) Arrays.copyOf(this.f20630w, i11);
        eVarArr[length] = eVar;
        this.f20630w = (e[]) G1.M.j(eVarArr);
        b0[] b0VarArr = (b0[]) Arrays.copyOf(this.f20629v, i11);
        b0VarArr[length] = b0VarL;
        this.f20629v = (b0[]) G1.M.j(b0VarArr);
        return b0VarL;
    }

    @Override // a2.InterfaceC2610C, a2.d0
    public boolean e(F0 f02) {
        if (this.f20606V || this.f20621n.i() || this.f20604S) {
            return false;
        }
        if ((this.f20632y || this.f20619l != null) && this.f20600J == 0) {
            return false;
        }
        boolean zF = this.f20623p.f();
        if (this.f20621n.j()) {
            return zF;
        }
        j0();
        return true;
    }

    public int e0(int i10, C0 c02, J1.f fVar, int i11) {
        if (k0()) {
            return -3;
        }
        U(i10);
        int iU = this.f20629v[i10].U(c02, fVar, i11, this.f20606V);
        if (iU == -3) {
            V(i10);
        }
        return iU;
    }

    @Override // i2.r
    public i2.O f(int i10, int i11) {
        return d0(new e(i10, false));
    }

    public void f0() {
        if (this.f20632y) {
            for (b0 b0Var : this.f20629v) {
                b0Var.T();
            }
        }
        this.f20621n.m(this);
        this.f20626s.removeCallbacksAndMessages(null);
        this.f20627t = null;
        this.f20607W = true;
    }

    @Override // a2.InterfaceC2610C, a2.d0
    public long g() {
        long jP;
        L();
        if (this.f20606V || this.f20600J == 0) {
            return Long.MIN_VALUE;
        }
        if (R()) {
            return this.f20603R;
        }
        if (this.f20633z) {
            int length = this.f20629v.length;
            jP = Long.MAX_VALUE;
            for (int i10 = 0; i10 < length; i10++) {
                f fVar = this.f20592B;
                if (fVar.f20654b[i10] && fVar.f20655c[i10] && !this.f20629v[i10].M()) {
                    jP = Math.min(jP, this.f20629v[i10].C());
                }
            }
        } else {
            jP = Long.MAX_VALUE;
        }
        if (jP == Long.MAX_VALUE) {
            jP = P(false);
        }
        return jP == Long.MIN_VALUE ? this.f20602Q : jP;
    }

    public final boolean g0(boolean[] zArr, long j10, boolean z10) {
        int length = this.f20629v.length;
        for (int i10 = 0; i10 < length; i10++) {
            b0 b0Var = this.f20629v[i10];
            if (b0Var.F() != 0 || !z10) {
                if (!(this.f20591A ? b0Var.a0(b0Var.A()) : b0Var.b0(j10, this.f20606V)) && (zArr[i10] || !this.f20633z)) {
                    return false;
                }
            }
        }
        return true;
    }

    public final void h0(i2.J j10) {
        this.f20593C = this.f20628u == null ? j10 : new J.b(-9223372036854775807L);
        this.f20594D = j10.m();
        boolean z10 = !this.f20601P && j10.m() == -9223372036854775807L;
        this.f20595E = z10;
        this.f20596F = z10 ? 7 : 1;
        if (this.f20632y) {
            this.f20614g.a(this.f20594D, j10, z10);
        } else {
            T();
        }
    }

    @Override // a2.InterfaceC2610C
    public long i(long j10) {
        L();
        boolean[] zArr = this.f20592B.f20654b;
        if (!this.f20593C.h()) {
            j10 = 0;
        }
        int i10 = 0;
        this.f20598H = false;
        boolean z10 = this.f20602Q == j10;
        this.f20602Q = j10;
        if (R()) {
            this.f20603R = j10;
            return j10;
        }
        if (this.f20596F == 7 || ((!this.f20606V && !this.f20621n.j()) || !g0(zArr, j10, z10))) {
            this.f20604S = false;
            this.f20603R = j10;
            this.f20606V = false;
            this.f20599I = false;
            if (this.f20621n.j()) {
                b0[] b0VarArr = this.f20629v;
                int length = b0VarArr.length;
                while (i10 < length) {
                    b0VarArr[i10].s();
                    i10++;
                }
                this.f20621n.f();
                return j10;
            }
            this.f20621n.g();
            b0[] b0VarArr2 = this.f20629v;
            int length2 = b0VarArr2.length;
            while (i10 < length2) {
                b0VarArr2[i10].X();
                i10++;
            }
        }
        return j10;
    }

    public int i0(int i10, long j10) throws Throwable {
        if (k0()) {
            return 0;
        }
        U(i10);
        b0 b0Var = this.f20629v[i10];
        int iH = b0Var.H(j10, this.f20606V);
        b0Var.g0(iH);
        if (iH == 0) {
            V(i10);
        }
        return iH;
    }

    @Override // e2.m.f
    public void j() {
        for (b0 b0Var : this.f20629v) {
            b0Var.V();
        }
        this.f20622o.release();
    }

    public final void j0() {
        b bVar = new b(this.f20608a, this.f20609b, this.f20622o, this, this.f20623p);
        if (this.f20632y) {
            AbstractC0853a.g(R());
            long j10 = this.f20594D;
            if (j10 != -9223372036854775807L && this.f20603R > j10) {
                this.f20606V = true;
                this.f20603R = -9223372036854775807L;
                return;
            }
            bVar.i(((i2.J) AbstractC0853a.e(this.f20593C)).e(this.f20603R).f36872a.f36878b, this.f20603R);
            for (b0 b0Var : this.f20629v) {
                b0Var.d0(this.f20603R);
            }
            this.f20603R = -9223372036854775807L;
        }
        this.f20605T = O();
        this.f20621n.n(bVar, this, this.f20611d.b(this.f20596F));
    }

    @Override // a2.InterfaceC2610C
    public long k() {
        if (this.f20599I) {
            this.f20599I = false;
            return this.f20602Q;
        }
        if (!this.f20598H) {
            return -9223372036854775807L;
        }
        if (!this.f20606V && O() <= this.f20605T) {
            return -9223372036854775807L;
        }
        this.f20598H = false;
        return this.f20602Q;
    }

    public final boolean k0() {
        return this.f20598H || R();
    }

    @Override // a2.InterfaceC2610C
    public long l(d2.r[] rVarArr, boolean[] zArr, c0[] c0VarArr, boolean[] zArr2, long j10) {
        d2.r rVar;
        L();
        f fVar = this.f20592B;
        n0 n0Var = fVar.f20653a;
        boolean[] zArr3 = fVar.f20655c;
        int i10 = this.f20600J;
        int i11 = 0;
        for (int i12 = 0; i12 < rVarArr.length; i12++) {
            c0 c0Var = c0VarArr[i12];
            if (c0Var != null && (rVarArr[i12] == null || !zArr[i12])) {
                int i13 = ((d) c0Var).f20649a;
                AbstractC0853a.g(zArr3[i13]);
                this.f20600J--;
                zArr3[i13] = false;
                c0VarArr[i12] = null;
            }
        }
        boolean z10 = !this.f20597G ? j10 == 0 || this.f20591A : i10 != 0;
        for (int i14 = 0; i14 < rVarArr.length; i14++) {
            if (c0VarArr[i14] == null && (rVar = rVarArr[i14]) != null) {
                AbstractC0853a.g(rVar.length() == 1);
                AbstractC0853a.g(rVar.f(0) == 0);
                int iD = n0Var.d(rVar.n());
                AbstractC0853a.g(!zArr3[iD]);
                this.f20600J++;
                zArr3[iD] = true;
                this.f20599I = rVar.s().f1811u | this.f20599I;
                c0VarArr[i14] = new d(iD);
                zArr2[i14] = true;
                if (!z10) {
                    b0 b0Var = this.f20629v[iD];
                    z10 = (b0Var.F() == 0 || b0Var.b0(j10, true)) ? false : true;
                }
            }
        }
        if (this.f20600J == 0) {
            this.f20604S = false;
            this.f20598H = false;
            this.f20599I = false;
            if (this.f20621n.j()) {
                b0[] b0VarArr = this.f20629v;
                int length = b0VarArr.length;
                while (i11 < length) {
                    b0VarArr[i11].s();
                    i11++;
                }
                this.f20621n.f();
            } else {
                this.f20606V = false;
                b0[] b0VarArr2 = this.f20629v;
                int length2 = b0VarArr2.length;
                while (i11 < length2) {
                    b0VarArr2[i11].X();
                    i11++;
                }
            }
        } else if (z10) {
            j10 = i(j10);
            while (i11 < c0VarArr.length) {
                if (c0VarArr[i11] != null) {
                    zArr2[i11] = true;
                }
                i11++;
            }
        }
        this.f20597G = true;
        return j10;
    }

    @Override // a2.InterfaceC2610C
    public void m() throws IOException {
        W();
        if (this.f20606V && !this.f20632y) {
            throw D1.w.a("Loading finished before preparation is complete.", null);
        }
    }

    @Override // i2.r
    public void n() {
        this.f20631x = true;
        this.f20626s.post(this.f20624q);
    }

    @Override // a2.InterfaceC2610C
    public void p(InterfaceC2610C.a aVar, long j10) {
        this.f20627t = aVar;
        if (this.f20619l == null) {
            this.f20623p.f();
            j0();
        } else {
            f(this.f20618k, 3).e(this.f20619l);
            h0(new i2.E(new long[]{0}, new long[]{0}, -9223372036854775807L));
            n();
            this.f20603R = j10;
        }
    }

    @Override // a2.InterfaceC2610C
    public n0 q() {
        L();
        return this.f20592B.f20653a;
    }

    @Override // a2.b0.d
    public void r(D1.o oVar) {
        this.f20626s.post(this.f20624q);
    }

    @Override // a2.InterfaceC2610C
    public void u(long j10, boolean z10) {
        if (this.f20591A) {
            return;
        }
        L();
        if (R()) {
            return;
        }
        boolean[] zArr = this.f20592B.f20655c;
        int length = this.f20629v.length;
        for (int i10 = 0; i10 < length; i10++) {
            this.f20629v[i10].r(j10, z10, zArr[i10]);
        }
    }

    @Override // i2.r
    public void v(final i2.J j10) {
        this.f20626s.post(new Runnable() { // from class: a2.V
            @Override // java.lang.Runnable
            public final void run() {
                this.f20587a.h0(j10);
            }
        });
    }

    @Override // a2.InterfaceC2610C, a2.d0
    public void h(long j10) {
    }
}
