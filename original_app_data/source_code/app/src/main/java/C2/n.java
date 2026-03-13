package C2;

import D1.o;
import F2.s;
import G1.AbstractC0853a;
import G1.C;
import G1.M;
import H1.d;
import K7.AbstractC1081v;
import i2.AbstractC4323c;
import i2.B;
import i2.I;
import i2.InterfaceC4336p;
import i2.InterfaceC4337q;
import i2.J;
import i2.K;
import i2.N;
import i2.O;
import i2.P;
import io.sentry.SentryReplayEvent;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import x2.C6291a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class n implements InterfaceC4336p, J {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static final i2.u f1003G = new i2.u() { // from class: C2.m
        @Override // i2.u
        public final InterfaceC4336p[] f() {
            return n.o();
        }
    };

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public a[] f1004A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public long[][] f1005B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public int f1006C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public long f1007D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public int f1008E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public C6291a f1009F;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s.a f1010a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f1011b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C f1012c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C f1013d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C f1014e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C f1015f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayDeque f1016g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final q f1017h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final List f1018i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public AbstractC1081v f1019j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f1020k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f1021l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f1022m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f1023n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public C f1024o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f1025p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f1026q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f1027r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f1028s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f1029t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f1030u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f1031v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public long f1032w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f1033x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public long f1034y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public i2.r f1035z;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final t f1036a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final w f1037b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final O f1038c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final P f1039d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f1040e;

        public a(t tVar, w wVar, O o10) {
            this.f1036a = tVar;
            this.f1037b = wVar;
            this.f1038c = o10;
            this.f1039d = "audio/true-hd".equals(tVar.f1061g.f1805o) ? new P() : null;
        }
    }

    @Deprecated
    public n() {
        this(s.a.f3686a, 16);
    }

    public static int E(C c10) {
        c10.a0(8);
        int iP = p(c10.u());
        if (iP != 0) {
            return iP;
        }
        c10.b0(4);
        while (c10.a() > 0) {
            int iP2 = p(c10.u());
            if (iP2 != 0) {
                return iP2;
            }
        }
        return 0;
    }

    public static boolean L(int i10) {
        return i10 == 1836019574 || i10 == 1953653099 || i10 == 1835297121 || i10 == 1835626086 || i10 == 1937007212 || i10 == 1701082227 || i10 == 1835365473 || i10 == 1635284069;
    }

    public static boolean M(int i10) {
        return i10 == 1835296868 || i10 == 1836476516 || i10 == 1751411826 || i10 == 1937011556 || i10 == 1937011827 || i10 == 1937011571 || i10 == 1668576371 || i10 == 1701606260 || i10 == 1937011555 || i10 == 1937011578 || i10 == 1937013298 || i10 == 1937007471 || i10 == 1668232756 || i10 == 1953196132 || i10 == 1718909296 || i10 == 1969517665 || i10 == 1801812339 || i10 == 1768715124;
    }

    public static /* synthetic */ InterfaceC4336p[] o() {
        return new InterfaceC4336p[]{new n(s.a.f3686a, 16)};
    }

    public static int p(int i10) {
        if (i10 != 1751476579) {
            return i10 != 1903435808 ? 0 : 1;
        }
        return 2;
    }

    public static long[][] q(a[] aVarArr) {
        long[][] jArr = new long[aVarArr.length][];
        int[] iArr = new int[aVarArr.length];
        long[] jArr2 = new long[aVarArr.length];
        boolean[] zArr = new boolean[aVarArr.length];
        for (int i10 = 0; i10 < aVarArr.length; i10++) {
            jArr[i10] = new long[aVarArr[i10].f1037b.f1091b];
            jArr2[i10] = aVarArr[i10].f1037b.f1095f[0];
        }
        long j10 = 0;
        int i11 = 0;
        while (i11 < aVarArr.length) {
            long j11 = Long.MAX_VALUE;
            int i12 = -1;
            for (int i13 = 0; i13 < aVarArr.length; i13++) {
                if (!zArr[i13]) {
                    long j12 = jArr2[i13];
                    if (j12 <= j11) {
                        i12 = i13;
                        j11 = j12;
                    }
                }
            }
            int i14 = iArr[i12];
            long[] jArr3 = jArr[i12];
            jArr3[i14] = j10;
            w wVar = aVarArr[i12].f1037b;
            j10 += (long) wVar.f1093d[i14];
            int i15 = i14 + 1;
            iArr[i12] = i15;
            if (i15 < jArr3.length) {
                jArr2[i12] = wVar.f1095f[i15];
            } else {
                zArr[i12] = true;
                i11++;
            }
        }
        return jArr;
    }

    public static int s(int i10) {
        int i11 = (i10 & 1) != 0 ? 32 : 0;
        return (i10 & 2) != 0 ? i11 | 128 : i11;
    }

    public static int x(w wVar, long j10) {
        int iA = wVar.a(j10);
        return iA == -1 ? wVar.b(j10) : iA;
    }

    public static long z(w wVar, long j10, long j11) {
        int iX = x(wVar, j10);
        return iX == -1 ? j11 : Math.min(wVar.f1092c[iX], j11);
    }

    public final void A(D1.u uVar) {
        H1.b bVarA = j.a(uVar, "auxiliary.tracks.interleaved");
        if (bVarA == null || bVarA.f5118b[0] != 0) {
            return;
        }
        this.f1034y = this.f1032w + 16;
    }

    public final void B(InterfaceC4337q interfaceC4337q) {
        this.f1014e.W(8);
        interfaceC4337q.s(this.f1014e.f(), 0, 8);
        b.g(this.f1014e);
        interfaceC4337q.q(this.f1014e.g());
        interfaceC4337q.i();
    }

    public final void C(long j10) {
        while (!this.f1016g.isEmpty() && ((d.b) this.f1016g.peek()).f5123b == j10) {
            d.b bVar = (d.b) this.f1016g.pop();
            if (bVar.f5122a == 1836019574) {
                F(bVar);
                this.f1016g.clear();
                if (!this.f1031v) {
                    this.f1020k = 2;
                }
            } else if (!this.f1016g.isEmpty()) {
                ((d.b) this.f1016g.peek()).b(bVar);
            }
        }
        if (this.f1020k != 2) {
            t();
        }
    }

    public final void D() {
        if (this.f1008E != 2 || (this.f1011b & 2) == 0) {
            return;
        }
        O oF = this.f1035z.f(0, 4);
        C6291a c6291a = this.f1009F;
        oF.e(new o.b().r0(c6291a == null ? null : new D1.u(c6291a)).P());
        this.f1035z.n();
        this.f1035z.v(new J.b(-9223372036854775807L));
    }

    public final void F(d.b bVar) {
        List list;
        D1.u uVar;
        D1.u uVar2;
        List list2;
        D1.u uVar3;
        D1.u uVar4;
        B b10;
        String str;
        ArrayList arrayList;
        d.b bVarD = bVar.d(1835365473);
        List arrayList2 = new ArrayList();
        if (bVarD != null) {
            D1.u uVarU = b.u(bVarD);
            if (this.f1033x) {
                AbstractC0853a.i(uVarU);
                A(uVarU);
                arrayList2 = u(uVarU);
            } else if (N(uVarU)) {
                this.f1031v = true;
                return;
            }
            uVar = uVarU;
            list = arrayList2;
        } else {
            list = arrayList2;
            uVar = null;
        }
        ArrayList arrayList3 = new ArrayList();
        boolean z10 = this.f1008E == 1;
        B b11 = new B();
        d.c cVarE = bVar.e(1969517665);
        if (cVarE != null) {
            D1.u uVarI = b.I(cVarE);
            b11.c(uVarI);
            uVar2 = uVarI;
        } else {
            uVar2 = null;
        }
        D1.u uVar5 = new D1.u(b.w(((d.c) AbstractC0853a.e(bVar.e(1836476516))).f5126b));
        List listH = b.H(bVar, b11, -9223372036854775807L, null, (this.f1011b & 1) != 0, z10, new J7.f() { // from class: C2.l
            @Override // J7.f
            public final Object apply(Object obj) {
                return n.n((t) obj);
            }
        });
        if (this.f1033x) {
            AbstractC0853a.h(list.size() == listH.size(), String.format(Locale.US, "The number of auxiliary track types from metadata (%d) is not same as the number of auxiliary tracks (%d)", Integer.valueOf(list.size()), Integer.valueOf(listH.size())));
        }
        String strB = k.b(listH);
        int i10 = 0;
        int i11 = 0;
        long jMax = -9223372036854775807L;
        int size = -1;
        while (i10 < listH.size()) {
            w wVar = (w) listH.get(i10);
            if (wVar.f1091b == 0) {
                list2 = listH;
                b10 = b11;
                str = strB;
                uVar3 = uVar;
                arrayList = arrayList3;
            } else {
                t tVar = wVar.f1090a;
                list2 = listH;
                ArrayList arrayList4 = arrayList3;
                int i12 = i11 + 1;
                String str2 = strB;
                a aVar = new a(tVar, wVar, this.f1035z.f(i11, tVar.f1056b));
                uVar3 = uVar;
                long j10 = tVar.f1059e;
                if (j10 == -9223372036854775807L) {
                    j10 = wVar.f1097h;
                }
                aVar.f1038c.f(j10);
                jMax = Math.max(jMax, j10);
                int i13 = "audio/true-hd".equals(tVar.f1061g.f1805o) ? wVar.f1094e * 16 : wVar.f1094e + 30;
                o.b bVarB = tVar.f1061g.b();
                bVarB.o0(i13);
                if (tVar.f1056b == 2) {
                    int i14 = tVar.f1061g.f1796f;
                    if ((this.f1011b & 8) != 0) {
                        i14 |= size == -1 ? 1 : 2;
                    }
                    if (this.f1033x) {
                        i14 |= 32768;
                        bVarB.R(((Integer) list.get(i10)).intValue());
                    }
                    bVarB.w0(i14);
                }
                j.l(tVar.f1056b, b11, bVarB);
                int i15 = tVar.f1056b;
                D1.u uVar6 = tVar.f1061g.f1802l;
                if (this.f1018i.isEmpty()) {
                    b10 = b11;
                    uVar4 = null;
                } else {
                    b10 = b11;
                    uVar4 = new D1.u(this.f1018i);
                }
                j.m(i15, uVar3, bVarB, uVar6, uVar4, uVar2, uVar5);
                str = str2;
                bVarB.W(str);
                aVar.f1038c.e(bVarB.P());
                if (tVar.f1056b == 2 && size == -1) {
                    size = arrayList4.size();
                }
                arrayList = arrayList4;
                arrayList.add(aVar);
                i11 = i12;
            }
            i10++;
            uVar = uVar3;
            arrayList3 = arrayList;
            listH = list2;
            strB = str;
            b11 = b10;
        }
        this.f1006C = size;
        this.f1007D = jMax;
        a[] aVarArr = (a[]) arrayList3.toArray(new a[0]);
        this.f1004A = aVarArr;
        this.f1005B = q(aVarArr);
        this.f1035z.n();
        this.f1035z.v(this);
    }

    public final void G(long j10) {
        if (this.f1021l == 1836086884) {
            int i10 = this.f1023n;
            this.f1009F = new C6291a(0L, j10, -9223372036854775807L, j10 + ((long) i10), this.f1022m - ((long) i10));
        }
    }

    public final boolean H(InterfaceC4337q interfaceC4337q) throws D1.w {
        d.b bVar;
        if (this.f1023n == 0) {
            if (!interfaceC4337q.j(this.f1015f.f(), 0, 8, true)) {
                D();
                return false;
            }
            this.f1023n = 8;
            this.f1015f.a0(0);
            this.f1022m = this.f1015f.N();
            this.f1021l = this.f1015f.u();
        }
        long j10 = this.f1022m;
        if (j10 == 1) {
            interfaceC4337q.readFully(this.f1015f.f(), 8, 8);
            this.f1023n += 8;
            this.f1022m = this.f1015f.S();
        } else if (j10 == 0) {
            long length = interfaceC4337q.getLength();
            if (length == -1 && (bVar = (d.b) this.f1016g.peek()) != null) {
                length = bVar.f5123b;
            }
            if (length != -1) {
                this.f1022m = (length - interfaceC4337q.getPosition()) + ((long) this.f1023n);
            }
        }
        if (this.f1022m < this.f1023n) {
            throw D1.w.e("Atom size less than header length (unsupported).");
        }
        if (L(this.f1021l)) {
            long position = interfaceC4337q.getPosition();
            long j11 = this.f1022m;
            int i10 = this.f1023n;
            long j12 = (position + j11) - ((long) i10);
            if (j11 != i10 && this.f1021l == 1835365473) {
                B(interfaceC4337q);
            }
            this.f1016g.push(new d.b(this.f1021l, j12));
            if (this.f1022m == this.f1023n) {
                C(j12);
            } else {
                t();
            }
        } else if (M(this.f1021l)) {
            AbstractC0853a.g(this.f1023n == 8);
            AbstractC0853a.g(this.f1022m <= 2147483647L);
            C c10 = new C((int) this.f1022m);
            System.arraycopy(this.f1015f.f(), 0, c10.f(), 0, 8);
            this.f1024o = c10;
            this.f1020k = 1;
        } else {
            G(interfaceC4337q.getPosition() - ((long) this.f1023n));
            this.f1024o = null;
            this.f1020k = 1;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean I(i2.InterfaceC4337q r10, i2.I r11) {
        /*
            r9 = this;
            long r0 = r9.f1022m
            int r2 = r9.f1023n
            long r2 = (long) r2
            long r0 = r0 - r2
            long r2 = r10.getPosition()
            long r2 = r2 + r0
            G1.C r4 = r9.f1024o
            r5 = 1
            r6 = 0
            if (r4 == 0) goto L46
            byte[] r7 = r4.f()
            int r8 = r9.f1023n
            int r0 = (int) r0
            r10.readFully(r7, r8, r0)
            int r10 = r9.f1021l
            r0 = 1718909296(0x66747970, float:2.8862439E23)
            if (r10 != r0) goto L2b
            r9.f1030u = r5
            int r10 = E(r4)
            r9.f1008E = r10
            goto L5e
        L2b:
            java.util.ArrayDeque r10 = r9.f1016g
            boolean r10 = r10.isEmpty()
            if (r10 != 0) goto L5e
            java.util.ArrayDeque r10 = r9.f1016g
            java.lang.Object r10 = r10.peek()
            H1.d$b r10 = (H1.d.b) r10
            H1.d$c r0 = new H1.d$c
            int r1 = r9.f1021l
            r0.<init>(r1, r4)
            r10.c(r0)
            goto L5e
        L46:
            boolean r4 = r9.f1030u
            if (r4 != 0) goto L53
            int r4 = r9.f1021l
            r7 = 1835295092(0x6d646174, float:4.4175247E27)
            if (r4 != r7) goto L53
            r9.f1008E = r5
        L53:
            r7 = 262144(0x40000, double:1.295163E-318)
            int r4 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r4 >= 0) goto L60
            int r0 = (int) r0
            r10.q(r0)
        L5e:
            r10 = r6
            goto L68
        L60:
            long r7 = r10.getPosition()
            long r7 = r7 + r0
            r11.f36871a = r7
            r10 = r5
        L68:
            r9.C(r2)
            boolean r0 = r9.f1031v
            if (r0 == 0) goto L78
            r9.f1033x = r5
            long r0 = r9.f1032w
            r11.f36871a = r0
            r9.f1031v = r6
            r10 = r5
        L78:
            if (r10 == 0) goto L80
            int r9 = r9.f1020k
            r10 = 2
            if (r9 == r10) goto L80
            return r5
        L80:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: C2.n.I(i2.q, i2.I):boolean");
    }

    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v9 */
    public final int J(InterfaceC4337q interfaceC4337q, I i10) throws D1.w {
        O.a aVar;
        ?? r12;
        int iO;
        long position = interfaceC4337q.getPosition();
        if (this.f1025p == -1) {
            int iY = y(position);
            this.f1025p = iY;
            if (iY == -1) {
                return -1;
            }
        }
        a aVar2 = this.f1004A[this.f1025p];
        O o10 = aVar2.f1038c;
        int i11 = aVar2.f1040e;
        w wVar = aVar2.f1037b;
        long j10 = wVar.f1092c[i11] + this.f1034y;
        int i12 = wVar.f1093d[i11];
        P p10 = aVar2.f1039d;
        long j11 = (j10 - position) + ((long) this.f1026q);
        if (j11 < 0 || j11 >= 262144) {
            i10.f36871a = j10;
            return 1;
        }
        if (aVar2.f1036a.f1062h == 1) {
            j11 += 8;
            i12 -= 8;
        }
        interfaceC4337q.q((int) j11);
        if (!r(aVar2.f1036a.f1061g)) {
            this.f1029t = true;
        }
        t tVar = aVar2.f1036a;
        if (tVar.f1065k == 0) {
            aVar = null;
            if ("audio/ac4".equals(tVar.f1061g.f1805o)) {
                if (this.f1027r == 0) {
                    AbstractC4323c.b(i12, this.f1014e);
                    o10.b(this.f1014e, 7);
                    this.f1027r += 7;
                }
                i12 += 7;
            } else if (p10 != null) {
                p10.d(interfaceC4337q);
            }
            while (true) {
                int i13 = this.f1027r;
                if (i13 >= i12) {
                    break;
                }
                int iA = o10.a(interfaceC4337q, i12 - i13, false);
                this.f1026q += iA;
                this.f1027r += iA;
                this.f1028s -= iA;
            }
        } else {
            byte[] bArrF = this.f1013d.f();
            bArrF[0] = 0;
            bArrF[1] = 0;
            bArrF[2] = 0;
            int i14 = 4 - aVar2.f1036a.f1065k;
            i12 += i14;
            while (this.f1027r < i12) {
                int i15 = this.f1028s;
                if (i15 == 0) {
                    t tVar2 = aVar2.f1036a;
                    int i16 = tVar2.f1065k;
                    if (this.f1029t || H1.g.o(tVar2.f1061g) + i16 > aVar2.f1037b.f1093d[i11] - this.f1026q) {
                        iO = 0;
                    } else {
                        iO = H1.g.o(aVar2.f1036a.f1061g);
                        i16 = aVar2.f1036a.f1065k + iO;
                    }
                    interfaceC4337q.readFully(bArrF, i14, i16);
                    this.f1026q += i16;
                    this.f1013d.a0(0);
                    int iU = this.f1013d.u();
                    if (iU < 0) {
                        throw D1.w.a("Invalid NAL length", null);
                    }
                    this.f1028s = iU - iO;
                    this.f1012c.a0(0);
                    o10.b(this.f1012c, 4);
                    this.f1027r += 4;
                    if (iO > 0) {
                        o10.b(this.f1013d, iO);
                        this.f1027r += iO;
                        if (H1.g.k(bArrF, 4, iO, aVar2.f1036a.f1061g)) {
                            this.f1029t = true;
                        }
                    }
                } else {
                    int iA2 = o10.a(interfaceC4337q, i15, false);
                    this.f1026q += iA2;
                    this.f1027r += iA2;
                    this.f1028s -= iA2;
                }
            }
            aVar = null;
        }
        int i17 = i12;
        w wVar2 = aVar2.f1037b;
        long j12 = wVar2.f1095f[i11];
        int i18 = wVar2.f1096g[i11];
        if (!this.f1029t) {
            i18 |= 67108864;
        }
        if (p10 != null) {
            int i19 = i18;
            boolean z10 = false;
            p10.c(o10, j12, i19, i17, 0, null);
            r12 = z10;
            if (i11 + 1 == aVar2.f1037b.f1091b) {
                p10.a(o10, aVar);
                r12 = z10;
            }
        } else {
            int i20 = i18;
            r12 = 0;
            o10.d(j12, i20, i17, 0, null);
        }
        aVar2.f1040e++;
        this.f1025p = -1;
        this.f1026q = r12;
        this.f1027r = r12;
        this.f1028s = r12;
        this.f1029t = r12;
        return r12;
    }

    public final int K(InterfaceC4337q interfaceC4337q, I i10) throws D1.w {
        int iC = this.f1017h.c(interfaceC4337q, i10, this.f1018i);
        if (iC == 1 && i10.f36871a == 0) {
            t();
        }
        return iC;
    }

    public final boolean N(D1.u uVar) {
        H1.b bVarA;
        if (uVar != null && (this.f1011b & 64) != 0 && (bVarA = j.a(uVar, "auxiliary.tracks.offset")) != null) {
            long jS = new C(bVarA.f5118b).S();
            if (jS > 0) {
                this.f1032w = jS;
                return true;
            }
        }
        return false;
    }

    public final void O(a aVar, long j10) {
        w wVar = aVar.f1037b;
        int iA = wVar.a(j10);
        if (iA == -1) {
            iA = wVar.b(j10);
        }
        aVar.f1040e = iA;
    }

    @Override // i2.InterfaceC4336p
    public void a(long j10, long j11) {
        this.f1016g.clear();
        this.f1023n = 0;
        this.f1025p = -1;
        this.f1026q = 0;
        this.f1027r = 0;
        this.f1028s = 0;
        this.f1029t = false;
        if (j10 == 0) {
            if (this.f1020k != 3) {
                t();
                return;
            } else {
                this.f1017h.g();
                this.f1018i.clear();
                return;
            }
        }
        for (a aVar : this.f1004A) {
            O(aVar, j11);
            P p10 = aVar.f1039d;
            if (p10 != null) {
                p10.b();
            }
        }
    }

    @Override // i2.InterfaceC4336p
    public void c(i2.r rVar) {
        if ((this.f1011b & 16) == 0) {
            rVar = new F2.t(rVar, this.f1010a);
        }
        this.f1035z = rVar;
    }

    @Override // i2.J
    public J.a e(long j10) {
        return v(j10, -1);
    }

    @Override // i2.J
    public boolean h() {
        return true;
    }

    @Override // i2.InterfaceC4336p
    public int i(InterfaceC4337q interfaceC4337q, I i10) {
        while (true) {
            int i11 = this.f1020k;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        return J(interfaceC4337q, i10);
                    }
                    if (i11 == 3) {
                        return K(interfaceC4337q, i10);
                    }
                    throw new IllegalStateException();
                }
                if (I(interfaceC4337q, i10)) {
                    return 1;
                }
            } else if (!H(interfaceC4337q)) {
                return -1;
            }
        }
    }

    @Override // i2.InterfaceC4336p
    public boolean j(InterfaceC4337q interfaceC4337q) {
        N nD = s.d(interfaceC4337q, (this.f1011b & 2) != 0);
        this.f1019j = nD != null ? AbstractC1081v.A(nD) : AbstractC1081v.z();
        return nD == null;
    }

    @Override // i2.J
    public long m() {
        return this.f1007D;
    }

    public final boolean r(D1.o oVar) {
        return Objects.equals(oVar.f1805o, "video/avc") ? (this.f1011b & 32) != 0 : Objects.equals(oVar.f1805o, "video/hevc") && (this.f1011b & 128) != 0;
    }

    public final void t() {
        this.f1020k = 0;
        this.f1023n = 0;
    }

    public final List u(D1.u uVar) {
        List listD = ((H1.b) AbstractC0853a.i(j.a(uVar, "auxiliary.tracks.map"))).d();
        ArrayList arrayList = new ArrayList(listD.size());
        for (int i10 = 0; i10 < listD.size(); i10++) {
            int iIntValue = ((Integer) listD.get(i10)).intValue();
            int i11 = 1;
            if (iIntValue != 0) {
                if (iIntValue != 1) {
                    i11 = 3;
                    if (iIntValue != 2) {
                        i11 = iIntValue != 3 ? 0 : 4;
                    }
                } else {
                    i11 = 2;
                }
            }
            arrayList.add(Integer.valueOf(i11));
        }
        return arrayList;
    }

    public J.a v(long j10, int i10) {
        long j11;
        long jZ;
        long j12;
        long j13;
        int iB;
        long j14 = j10;
        a[] aVarArr = this.f1004A;
        if (aVarArr.length == 0) {
            return new J.a(K.f36876c);
        }
        int i11 = i10 != -1 ? i10 : this.f1006C;
        if (i11 != -1) {
            w wVar = aVarArr[i11].f1037b;
            int iX = x(wVar, j14);
            if (iX == -1) {
                return new J.a(K.f36876c);
            }
            long j15 = wVar.f1095f[iX];
            j11 = wVar.f1092c[iX];
            if (j15 >= j14 || iX >= wVar.f1091b - 1 || (iB = wVar.b(j14)) == -1 || iB == iX) {
                j13 = -1;
                j12 = -9223372036854775807L;
            } else {
                j12 = wVar.f1095f[iB];
                j13 = wVar.f1092c[iB];
            }
            jZ = j13;
            j14 = j15;
        } else {
            j11 = Long.MAX_VALUE;
            jZ = -1;
            j12 = -9223372036854775807L;
        }
        if (i10 == -1) {
            int i12 = 0;
            while (true) {
                a[] aVarArr2 = this.f1004A;
                if (i12 >= aVarArr2.length) {
                    break;
                }
                if (i12 != this.f1006C) {
                    w wVar2 = aVarArr2[i12].f1037b;
                    long jZ2 = z(wVar2, j14, j11);
                    if (j12 != -9223372036854775807L) {
                        jZ = z(wVar2, j12, jZ);
                    }
                    j11 = jZ2;
                }
                i12++;
            }
        }
        K k10 = new K(j14, j11);
        return j12 == -9223372036854775807L ? new J.a(k10) : new J.a(k10, new K(j12, jZ));
    }

    @Override // i2.InterfaceC4336p
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public AbstractC1081v k() {
        return this.f1019j;
    }

    public final int y(long j10) {
        int i10 = -1;
        int i11 = -1;
        int i12 = 0;
        long j11 = Long.MAX_VALUE;
        boolean z10 = true;
        long j12 = Long.MAX_VALUE;
        boolean z11 = true;
        long j13 = Long.MAX_VALUE;
        while (true) {
            a[] aVarArr = this.f1004A;
            if (i12 >= aVarArr.length) {
                break;
            }
            a aVar = aVarArr[i12];
            int i13 = aVar.f1040e;
            w wVar = aVar.f1037b;
            if (i13 != wVar.f1091b) {
                long j14 = wVar.f1092c[i13];
                long j15 = ((long[][]) M.i(this.f1005B))[i12][i13];
                long j16 = j14 - j10;
                boolean z12 = j16 < 0 || j16 >= 262144;
                if ((!z12 && z11) || (z12 == z11 && j16 < j13)) {
                    j12 = j15;
                    z11 = z12;
                    i11 = i12;
                    j13 = j16;
                }
                if (j15 < j11) {
                    j11 = j15;
                    z10 = z12;
                    i10 = i12;
                }
            }
            i12++;
        }
        return (j11 == Long.MAX_VALUE || !z10 || j12 < j11 + SentryReplayEvent.REPLAY_VIDEO_MAX_SIZE) ? i11 : i10;
    }

    public n(s.a aVar, int i10) {
        this.f1010a = aVar;
        this.f1011b = i10;
        this.f1019j = AbstractC1081v.z();
        this.f1020k = (i10 & 4) != 0 ? 3 : 0;
        this.f1017h = new q();
        this.f1018i = new ArrayList();
        this.f1015f = new C(16);
        this.f1016g = new ArrayDeque();
        this.f1012c = new C(H1.g.f5132a);
        this.f1013d = new C(6);
        this.f1014e = new C();
        this.f1025p = -1;
        this.f1035z = i2.r.f37046i0;
        this.f1004A = new a[0];
    }

    @Override // i2.InterfaceC4336p
    public void release() {
    }

    public static /* synthetic */ t n(t tVar) {
        return tVar;
    }
}
