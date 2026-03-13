package a2;

import D1.C0753k;
import D1.InterfaceC0749g;
import G1.AbstractC0853a;
import G1.InterfaceC0864l;
import K1.C0;
import P1.m;
import P1.t;
import P1.u;
import a2.b0;
import i2.O;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class b0 implements i2.O {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public D1.o f20699A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public D1.o f20700B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public long f20701C;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public boolean f20703E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public long f20704F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public boolean f20705G;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Z f20706a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final P1.u f20709d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t.a f20710e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public d f20711f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public D1.o f20712g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public P1.m f20713h;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f20721p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f20722q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f20723r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f20724s;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f20728w;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f20731z;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f20707b = new b();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f20714i = 1000;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long[] f20715j = new long[1000];

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long[] f20716k = new long[1000];

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long[] f20719n = new long[1000];

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int[] f20718m = new int[1000];

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int[] f20717l = new int[1000];

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public O.a[] f20720o = new O.a[1000];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j0 f20708c = new j0(new InterfaceC0864l() { // from class: a2.a0
        @Override // G1.InterfaceC0864l
        public final void accept(Object obj) {
            ((b0.c) obj).f20736b.release();
        }
    });

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f20725t = Long.MIN_VALUE;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f20726u = Long.MIN_VALUE;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f20727v = Long.MIN_VALUE;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f20730y = true;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f20729x = true;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public boolean f20702D = true;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f20732a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f20733b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public O.a f20734c;
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final D1.o f20735a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final u.b f20736b;

        public c(D1.o oVar, u.b bVar) {
            this.f20735a = oVar;
            this.f20736b = bVar;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface d {
        void r(D1.o oVar);
    }

    public b0(e2.b bVar, P1.u uVar, t.a aVar) {
        this.f20709d = uVar;
        this.f20710e = aVar;
        this.f20706a = new Z(bVar);
    }

    public static b0 l(e2.b bVar, P1.u uVar, t.a aVar) {
        return new b0(bVar, (P1.u) AbstractC0853a.e(uVar), (t.a) AbstractC0853a.e(aVar));
    }

    public static b0 m(e2.b bVar) {
        return new b0(bVar, null, null);
    }

    public final int A() {
        return this.f20722q;
    }

    public final synchronized long B() {
        return this.f20721p == 0 ? Long.MIN_VALUE : this.f20719n[this.f20723r];
    }

    public final synchronized long C() {
        return this.f20727v;
    }

    public final synchronized long D() {
        return Math.max(this.f20726u, E(this.f20724s));
    }

    public final long E(int i10) {
        long jMax = Long.MIN_VALUE;
        if (i10 == 0) {
            return Long.MIN_VALUE;
        }
        int iG = G(i10 - 1);
        for (int i11 = 0; i11 < i10; i11++) {
            jMax = Math.max(jMax, this.f20719n[iG]);
            if ((this.f20718m[iG] & 1) != 0) {
                return jMax;
            }
            iG--;
            if (iG == -1) {
                iG = this.f20714i - 1;
            }
        }
        return jMax;
    }

    public final int F() {
        return this.f20722q + this.f20724s;
    }

    public final int G(int i10) {
        int i11 = this.f20723r + i10;
        int i12 = this.f20714i;
        return i11 < i12 ? i11 : i11 - i12;
    }

    public final synchronized int H(long j10, boolean z10) throws Throwable {
        Throwable th;
        b0 b0Var;
        try {
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            int iG = G(this.f20724s);
            if (!K() || j10 < this.f20719n[iG]) {
                return 0;
            }
            if (j10 <= this.f20727v || !z10) {
                int iY = y(iG, this.f20721p - this.f20724s, j10, true);
                if (iY == -1) {
                    return 0;
                }
                return iY;
            }
            try {
                return this.f20721p - this.f20724s;
            } catch (Throwable th3) {
                th = th3;
                b0Var = this;
            }
        } catch (Throwable th4) {
            th = th4;
            b0Var = this;
            th = th;
        }
        throw th;
    }

    public final synchronized D1.o I() {
        return this.f20730y ? null : this.f20700B;
    }

    public final int J() {
        return this.f20722q + this.f20721p;
    }

    public final boolean K() {
        return this.f20724s != this.f20721p;
    }

    public final void L() {
        this.f20731z = true;
    }

    public final synchronized boolean M() {
        return this.f20728w;
    }

    public synchronized boolean N(boolean z10) {
        D1.o oVar;
        boolean z11 = true;
        if (K()) {
            if (((c) this.f20708c.f(F())).f20735a != this.f20712g) {
                return true;
            }
            return O(G(this.f20724s));
        }
        if (!z10 && !this.f20728w && ((oVar = this.f20700B) == null || oVar == this.f20712g)) {
            z11 = false;
        }
        return z11;
    }

    public final boolean O(int i10) {
        P1.m mVar = this.f20713h;
        if (mVar == null || mVar.getState() == 4) {
            return true;
        }
        return (this.f20718m[i10] & 1073741824) == 0 && this.f20713h.b();
    }

    public void P() throws m.a {
        P1.m mVar = this.f20713h;
        if (mVar != null && mVar.getState() == 1) {
            throw ((m.a) AbstractC0853a.e(this.f20713h.e()));
        }
    }

    public final void Q(D1.o oVar, C0 c02) {
        D1.o oVar2 = this.f20712g;
        boolean z10 = oVar2 == null;
        C0753k c0753k = oVar2 == null ? null : oVar2.f1809s;
        this.f20712g = oVar;
        C0753k c0753k2 = oVar.f1809s;
        P1.u uVar = this.f20709d;
        c02.f6835b = uVar != null ? oVar.c(uVar.b(oVar)) : oVar;
        c02.f6834a = this.f20713h;
        if (this.f20709d == null) {
            return;
        }
        if (z10 || !Objects.equals(c0753k, c0753k2)) {
            P1.m mVar = this.f20713h;
            P1.m mVarA = this.f20709d.a(this.f20710e, oVar);
            this.f20713h = mVarA;
            c02.f6834a = mVarA;
            if (mVar != null) {
                mVar.c(this.f20710e);
            }
        }
    }

    public final synchronized int R(C0 c02, J1.f fVar, boolean z10, boolean z11, b bVar) {
        try {
            fVar.f5879e = false;
            if (!K()) {
                if (!z11 && !this.f20728w) {
                    D1.o oVar = this.f20700B;
                    if (oVar == null || (!z10 && oVar == this.f20712g)) {
                        return -3;
                    }
                    Q((D1.o) AbstractC0853a.e(oVar), c02);
                    return -5;
                }
                fVar.B(4);
                fVar.f5880f = Long.MIN_VALUE;
                return -4;
            }
            D1.o oVar2 = ((c) this.f20708c.f(F())).f20735a;
            if (!z10 && oVar2 == this.f20712g) {
                int iG = G(this.f20724s);
                if (!O(iG)) {
                    fVar.f5879e = true;
                    return -3;
                }
                fVar.B(this.f20718m[iG]);
                if (this.f20724s == this.f20721p - 1 && (z11 || this.f20728w)) {
                    fVar.q(536870912);
                }
                fVar.f5880f = this.f20719n[iG];
                bVar.f20732a = this.f20717l[iG];
                bVar.f20733b = this.f20716k[iG];
                bVar.f20734c = this.f20720o[iG];
                return -4;
            }
            Q(oVar2, c02);
            return -5;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized long S() {
        try {
        } catch (Throwable th) {
            throw th;
        }
        return K() ? this.f20715j[G(this.f20724s)] : this.f20701C;
    }

    public void T() {
        s();
        W();
    }

    public int U(C0 c02, J1.f fVar, int i10, boolean z10) {
        int iR = R(c02, fVar, (i10 & 2) != 0, z10, this.f20707b);
        if (iR == -4 && !fVar.w()) {
            boolean z11 = (i10 & 1) != 0;
            if ((i10 & 4) == 0) {
                if (z11) {
                    this.f20706a.f(fVar, this.f20707b);
                } else {
                    this.f20706a.m(fVar, this.f20707b);
                }
            }
            if (!z11) {
                this.f20724s++;
            }
        }
        return iR;
    }

    public void V() {
        Y(true);
        W();
    }

    public final void W() {
        P1.m mVar = this.f20713h;
        if (mVar != null) {
            mVar.c(this.f20710e);
            this.f20713h = null;
            this.f20712g = null;
        }
    }

    public final void X() {
        Y(false);
    }

    public void Y(boolean z10) {
        this.f20706a.n();
        this.f20721p = 0;
        this.f20722q = 0;
        this.f20723r = 0;
        this.f20724s = 0;
        this.f20729x = true;
        this.f20725t = Long.MIN_VALUE;
        this.f20726u = Long.MIN_VALUE;
        this.f20727v = Long.MIN_VALUE;
        this.f20728w = false;
        this.f20708c.c();
        if (z10) {
            this.f20699A = null;
            this.f20700B = null;
            this.f20730y = true;
            this.f20702D = true;
        }
    }

    public final synchronized void Z() {
        this.f20724s = 0;
        this.f20706a.o();
    }

    public final synchronized boolean a0(int i10) {
        Z();
        int i11 = this.f20722q;
        if (i10 >= i11 && i10 <= this.f20721p + i11) {
            this.f20725t = Long.MIN_VALUE;
            this.f20724s = i10 - i11;
            return true;
        }
        return false;
    }

    public final synchronized boolean b0(long j10, boolean z10) throws Throwable {
        b0 b0Var;
        long j11;
        int iY;
        try {
            try {
                Z();
                int iG = G(this.f20724s);
                if (!K() || j10 < this.f20719n[iG] || (j10 > this.f20727v && !z10)) {
                    return false;
                }
                if (this.f20702D) {
                    b0Var = this;
                    j11 = j10;
                    iY = b0Var.x(iG, this.f20721p - this.f20724s, j11, z10);
                } else {
                    b0Var = this;
                    j11 = j10;
                    iY = b0Var.y(iG, b0Var.f20721p - b0Var.f20724s, j11, true);
                }
                if (iY == -1) {
                    return false;
                }
                b0Var.f20725t = j11;
                b0Var.f20724s += iY;
                return true;
            } catch (Throwable th) {
                th = th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
        throw th;
    }

    @Override // i2.O
    public final int c(InterfaceC0749g interfaceC0749g, int i10, boolean z10, int i11) {
        return this.f20706a.p(interfaceC0749g, i10, z10);
    }

    public final void c0(long j10) {
        if (this.f20704F != j10) {
            this.f20704F = j10;
            L();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0053  */
    @Override // i2.O
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void d(long r12, int r14, int r15, int r16, i2.O.a r17) {
        /*
            r11 = this;
            boolean r1 = r11.f20731z
            if (r1 == 0) goto Lf
            D1.o r1 = r11.f20699A
            java.lang.Object r1 = G1.AbstractC0853a.i(r1)
            D1.o r1 = (D1.o) r1
            r11.e(r1)
        Lf:
            r1 = r14 & 1
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L17
            r4 = r3
            goto L18
        L17:
            r4 = r2
        L18:
            boolean r5 = r11.f20729x
            if (r5 == 0) goto L21
            if (r4 != 0) goto L1f
            goto L64
        L1f:
            r11.f20729x = r2
        L21:
            long r5 = r11.f20704F
            long r5 = r5 + r12
            boolean r7 = r11.f20702D
            if (r7 == 0) goto L53
            long r7 = r11.f20725t
            int r7 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r7 >= 0) goto L2f
            goto L64
        L2f:
            if (r1 != 0) goto L53
            boolean r1 = r11.f20703E
            if (r1 != 0) goto L4f
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r7 = "Overriding unexpected non-sync sample for format: "
            r1.append(r7)
            D1.o r7 = r11.f20700B
            r1.append(r7)
            java.lang.String r1 = r1.toString()
            java.lang.String r7 = "SampleQueue"
            G1.t.h(r7, r1)
            r11.f20703E = r3
        L4f:
            r1 = r14 | 1
            r3 = r1
            goto L54
        L53:
            r3 = r14
        L54:
            boolean r1 = r11.f20705G
            if (r1 == 0) goto L65
            if (r4 == 0) goto L64
            boolean r1 = r11.i(r5)
            if (r1 != 0) goto L61
            goto L64
        L61:
            r11.f20705G = r2
            goto L65
        L64:
            return
        L65:
            a2.Z r1 = r11.f20706a
            long r1 = r1.e()
            long r7 = (long) r15
            long r1 = r1 - r7
            r7 = r16
            long r7 = (long) r7
            long r1 = r1 - r7
            r9 = r5
            r4 = r1
            r1 = r9
            r0 = r11
            r6 = r15
            r7 = r17
            r0.j(r1, r3, r4, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a2.b0.d(long, int, int, int, i2.O$a):void");
    }

    public final void d0(long j10) {
        this.f20725t = j10;
    }

    @Override // i2.O
    public final void e(D1.o oVar) {
        D1.o oVarZ = z(oVar);
        this.f20731z = false;
        this.f20699A = oVar;
        boolean zE0 = e0(oVarZ);
        d dVar = this.f20711f;
        if (dVar == null || !zE0) {
            return;
        }
        dVar.r(oVarZ);
    }

    public final synchronized boolean e0(D1.o oVar) {
        try {
            this.f20730y = false;
            if (Objects.equals(oVar, this.f20700B)) {
                return false;
            }
            if (this.f20708c.h() || !((c) this.f20708c.g()).f20735a.equals(oVar)) {
                this.f20700B = oVar;
            } else {
                this.f20700B = ((c) this.f20708c.g()).f20735a;
            }
            boolean z10 = this.f20702D;
            D1.o oVar2 = this.f20700B;
            this.f20702D = z10 & D1.v.a(oVar2.f1805o, oVar2.f1801k);
            this.f20703E = false;
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void f0(d dVar) {
        this.f20711f = dVar;
    }

    @Override // i2.O
    public final void g(G1.C c10, int i10, int i11) {
        this.f20706a.q(c10, i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x000e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void g0(int r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            if (r3 < 0) goto Le
            int r0 = r2.f20724s     // Catch: java.lang.Throwable -> Lc
            int r0 = r0 + r3
            int r1 = r2.f20721p     // Catch: java.lang.Throwable -> Lc
            if (r0 > r1) goto Le
            r0 = 1
            goto Lf
        Lc:
            r3 = move-exception
            goto L19
        Le:
            r0 = 0
        Lf:
            G1.AbstractC0853a.a(r0)     // Catch: java.lang.Throwable -> Lc
            int r0 = r2.f20724s     // Catch: java.lang.Throwable -> Lc
            int r0 = r0 + r3
            r2.f20724s = r0     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r2)
            return
        L19:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lc
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: a2.b0.g0(int):void");
    }

    public final void h0(long j10) {
        this.f20701C = j10;
    }

    public final synchronized boolean i(long j10) {
        if (this.f20721p == 0) {
            return j10 > this.f20726u;
        }
        if (D() >= j10) {
            return false;
        }
        v(this.f20722q + k(j10));
        return true;
    }

    public final void i0() {
        this.f20705G = true;
    }

    public final synchronized void j(long j10, int i10, long j11, int i11, O.a aVar) {
        try {
            int i12 = this.f20721p;
            if (i12 > 0) {
                int iG = G(i12 - 1);
                AbstractC0853a.a(this.f20716k[iG] + ((long) this.f20717l[iG]) <= j11);
            }
            this.f20728w = (536870912 & i10) != 0;
            this.f20727v = Math.max(this.f20727v, j10);
            int iG2 = G(this.f20721p);
            this.f20719n[iG2] = j10;
            this.f20716k[iG2] = j11;
            this.f20717l[iG2] = i11;
            this.f20718m[iG2] = i10;
            this.f20720o[iG2] = aVar;
            this.f20715j[iG2] = this.f20701C;
            if (this.f20708c.h() || !((c) this.f20708c.g()).f20735a.equals(this.f20700B)) {
                D1.o oVar = (D1.o) AbstractC0853a.e(this.f20700B);
                P1.u uVar = this.f20709d;
                this.f20708c.b(J(), new c(oVar, uVar != null ? uVar.d(this.f20710e, oVar) : u.b.f12676a));
            }
            int i13 = this.f20721p + 1;
            this.f20721p = i13;
            int i14 = this.f20714i;
            if (i13 == i14) {
                int i15 = i14 + 1000;
                long[] jArr = new long[i15];
                long[] jArr2 = new long[i15];
                long[] jArr3 = new long[i15];
                int[] iArr = new int[i15];
                int[] iArr2 = new int[i15];
                O.a[] aVarArr = new O.a[i15];
                int i16 = this.f20723r;
                int i17 = i14 - i16;
                System.arraycopy(this.f20716k, i16, jArr2, 0, i17);
                System.arraycopy(this.f20719n, this.f20723r, jArr3, 0, i17);
                System.arraycopy(this.f20718m, this.f20723r, iArr, 0, i17);
                System.arraycopy(this.f20717l, this.f20723r, iArr2, 0, i17);
                System.arraycopy(this.f20720o, this.f20723r, aVarArr, 0, i17);
                System.arraycopy(this.f20715j, this.f20723r, jArr, 0, i17);
                int i18 = this.f20723r;
                System.arraycopy(this.f20716k, 0, jArr2, i17, i18);
                System.arraycopy(this.f20719n, 0, jArr3, i17, i18);
                System.arraycopy(this.f20718m, 0, iArr, i17, i18);
                System.arraycopy(this.f20717l, 0, iArr2, i17, i18);
                System.arraycopy(this.f20720o, 0, aVarArr, i17, i18);
                System.arraycopy(this.f20715j, 0, jArr, i17, i18);
                this.f20716k = jArr2;
                this.f20719n = jArr3;
                this.f20718m = iArr;
                this.f20717l = iArr2;
                this.f20720o = aVarArr;
                this.f20715j = jArr;
                this.f20723r = 0;
                this.f20714i = i15;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final int k(long j10) {
        int i10 = this.f20721p;
        int iG = G(i10 - 1);
        while (i10 > this.f20724s && this.f20719n[iG] >= j10) {
            i10--;
            iG--;
            if (iG == -1) {
                iG = this.f20714i - 1;
            }
        }
        return i10;
    }

    public final synchronized long n(long j10, boolean z10, boolean z11) throws Throwable {
        b0 b0Var;
        Throwable th;
        try {
            try {
                int i10 = this.f20721p;
                if (i10 != 0) {
                    long[] jArr = this.f20719n;
                    int i11 = this.f20723r;
                    if (j10 >= jArr[i11]) {
                        if (z11) {
                            try {
                                int i12 = this.f20724s;
                                if (i12 != i10) {
                                    i10 = i12 + 1;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                b0Var = this;
                                throw th;
                            }
                        }
                        int iY = y(i11, i10, j10, z10);
                        if (iY == -1) {
                            return -1L;
                        }
                        return q(iY);
                    }
                }
                return -1L;
            } catch (Throwable th3) {
                th = th3;
                b0Var = this;
                th = th;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            th = th;
            throw th;
        }
    }

    public final synchronized long o() {
        int i10 = this.f20721p;
        if (i10 == 0) {
            return -1L;
        }
        return q(i10);
    }

    public synchronized long p() {
        int i10 = this.f20724s;
        if (i10 == 0) {
            return -1L;
        }
        return q(i10);
    }

    public final long q(int i10) {
        this.f20726u = Math.max(this.f20726u, E(i10));
        this.f20721p -= i10;
        int i11 = this.f20722q + i10;
        this.f20722q = i11;
        int i12 = this.f20723r + i10;
        this.f20723r = i12;
        int i13 = this.f20714i;
        if (i12 >= i13) {
            this.f20723r = i12 - i13;
        }
        int i14 = this.f20724s - i10;
        this.f20724s = i14;
        if (i14 < 0) {
            this.f20724s = 0;
        }
        this.f20708c.e(i11);
        if (this.f20721p != 0) {
            return this.f20716k[this.f20723r];
        }
        int i15 = this.f20723r;
        if (i15 == 0) {
            i15 = this.f20714i;
        }
        int i16 = i15 - 1;
        return this.f20716k[i16] + ((long) this.f20717l[i16]);
    }

    public final void r(long j10, boolean z10, boolean z11) {
        this.f20706a.b(n(j10, z10, z11));
    }

    public final void s() {
        this.f20706a.b(o());
    }

    public final void t() {
        this.f20706a.b(p());
    }

    public final void u(long j10) {
        if (this.f20721p == 0) {
            return;
        }
        AbstractC0853a.a(j10 > D());
        w(this.f20722q + k(j10));
    }

    public final long v(int i10) {
        int iJ = J() - i10;
        boolean z10 = false;
        AbstractC0853a.a(iJ >= 0 && iJ <= this.f20721p - this.f20724s);
        int i11 = this.f20721p - iJ;
        this.f20721p = i11;
        this.f20727v = Math.max(this.f20726u, E(i11));
        if (iJ == 0 && this.f20728w) {
            z10 = true;
        }
        this.f20728w = z10;
        this.f20708c.d(i10);
        int i12 = this.f20721p;
        if (i12 == 0) {
            return 0L;
        }
        int iG = G(i12 - 1);
        return this.f20716k[iG] + ((long) this.f20717l[iG]);
    }

    public final void w(int i10) {
        this.f20706a.c(v(i10));
    }

    public final int x(int i10, int i11, long j10, boolean z10) {
        for (int i12 = 0; i12 < i11; i12++) {
            if (this.f20719n[i10] >= j10) {
                return i12;
            }
            i10++;
            if (i10 == this.f20714i) {
                i10 = 0;
            }
        }
        if (z10) {
            return i11;
        }
        return -1;
    }

    public final int y(int i10, int i11, long j10, boolean z10) {
        int i12 = -1;
        for (int i13 = 0; i13 < i11; i13++) {
            long j11 = this.f20719n[i10];
            if (j11 > j10) {
                break;
            }
            if (!z10 || (this.f20718m[i10] & 1) != 0) {
                if (j11 == j10) {
                    return i13;
                }
                i12 = i13;
            }
            i10++;
            if (i10 == this.f20714i) {
                i10 = 0;
            }
        }
        return i12;
    }

    public D1.o z(D1.o oVar) {
        return (this.f20704F == 0 || oVar.f1810t == Long.MAX_VALUE) ? oVar : oVar.b().C0(oVar.f1810t + this.f20704F).P();
    }
}
