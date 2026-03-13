package Q2;

import D1.o;
import D1.w;
import G1.AbstractC0853a;
import G1.C;
import G1.M;
import G1.t;
import android.util.Pair;
import i2.I;
import i2.InterfaceC4336p;
import i2.InterfaceC4337q;
import i2.O;
import i2.T;
import i2.r;
import i2.u;
import io.flutter.embedding.android.KeyboardMap;
import org.apache.tika.fork.ForkServer;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class b implements InterfaceC4336p {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final u f13528h = new u() { // from class: Q2.a
        @Override // i2.u
        public final InterfaceC4336p[] f() {
            return b.b();
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public r f13529a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public O f13530b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public InterfaceC0171b f13533e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f13531c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f13532d = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f13534f = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f13535g = -1;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a implements InterfaceC0171b {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final int[] f13536m = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final int[] f13537n = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, 143, 157, 173, 190, 209, 230, 253, 279, 307, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final r f13538a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final O f13539b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Q2.c f13540c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f13541d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final byte[] f13542e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final C f13543f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f13544g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final o f13545h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f13546i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public long f13547j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f13548k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public long f13549l;

        public a(r rVar, O o10, Q2.c cVar) throws w {
            this.f13538a = rVar;
            this.f13539b = o10;
            this.f13540c = cVar;
            int iMax = Math.max(1, cVar.f13560c / 10);
            this.f13544g = iMax;
            C c10 = new C(cVar.f13564g);
            c10.D();
            int iD = c10.D();
            this.f13541d = iD;
            int i10 = cVar.f13559b;
            int i11 = (((cVar.f13562e - (i10 * 4)) * 8) / (cVar.f13563f * i10)) + 1;
            if (iD == i11) {
                int iK = M.k(iMax, iD);
                this.f13542e = new byte[cVar.f13562e * iK];
                this.f13543f = new C(iK * h(iD, i10));
                int i12 = ((cVar.f13560c * cVar.f13562e) * 8) / iD;
                this.f13545h = new o.b().y0("audio/raw").S(i12).t0(i12).o0(h(iMax, i10)).T(cVar.f13559b).z0(cVar.f13560c).s0(2).P();
                return;
            }
            throw w.a("Expected frames per block: " + i11 + "; got: " + iD, null);
        }

        public static int h(int i10, int i11) {
            return i10 * 2 * i11;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0020  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0035 -> B:4:0x001b). Please report as a decompilation issue!!! */
        @Override // Q2.b.InterfaceC0171b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean a(i2.InterfaceC4337q r7, long r8) {
            /*
                r6 = this;
                int r0 = r6.f13544g
                int r1 = r6.f13548k
                int r1 = r6.f(r1)
                int r0 = r0 - r1
                int r1 = r6.f13541d
                int r0 = G1.M.k(r0, r1)
                Q2.c r1 = r6.f13540c
                int r1 = r1.f13562e
                int r0 = r0 * r1
                r1 = 0
                int r1 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
                r2 = 1
                if (r1 != 0) goto L1d
            L1b:
                r1 = r2
                goto L1e
            L1d:
                r1 = 0
            L1e:
                if (r1 != 0) goto L3e
                int r3 = r6.f13546i
                if (r3 >= r0) goto L3e
                int r3 = r0 - r3
                long r3 = (long) r3
                long r3 = java.lang.Math.min(r3, r8)
                int r3 = (int) r3
                byte[] r4 = r6.f13542e
                int r5 = r6.f13546i
                int r3 = r7.read(r4, r5, r3)
                r4 = -1
                if (r3 != r4) goto L38
                goto L1b
            L38:
                int r4 = r6.f13546i
                int r4 = r4 + r3
                r6.f13546i = r4
                goto L1e
            L3e:
                int r7 = r6.f13546i
                Q2.c r8 = r6.f13540c
                int r8 = r8.f13562e
                int r7 = r7 / r8
                if (r7 <= 0) goto L75
                byte[] r8 = r6.f13542e
                G1.C r9 = r6.f13543f
                r6.d(r8, r7, r9)
                int r8 = r6.f13546i
                Q2.c r9 = r6.f13540c
                int r9 = r9.f13562e
                int r7 = r7 * r9
                int r8 = r8 - r7
                r6.f13546i = r8
                G1.C r7 = r6.f13543f
                int r7 = r7.j()
                i2.O r8 = r6.f13539b
                G1.C r9 = r6.f13543f
                r8.b(r9, r7)
                int r8 = r6.f13548k
                int r8 = r8 + r7
                r6.f13548k = r8
                int r7 = r6.f(r8)
                int r8 = r6.f13544g
                if (r7 < r8) goto L75
                r6.i(r8)
            L75:
                if (r1 == 0) goto L82
                int r7 = r6.f13548k
                int r7 = r6.f(r7)
                if (r7 <= 0) goto L82
                r6.i(r7)
            L82:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: Q2.b.a.a(i2.q, long):boolean");
        }

        @Override // Q2.b.InterfaceC0171b
        public void b(int i10, long j10) {
            e eVar = new e(this.f13540c, this.f13541d, i10, j10);
            this.f13538a.v(eVar);
            this.f13539b.e(this.f13545h);
            this.f13539b.f(eVar.m());
        }

        @Override // Q2.b.InterfaceC0171b
        public void c(long j10) {
            this.f13546i = 0;
            this.f13547j = j10;
            this.f13548k = 0;
            this.f13549l = 0L;
        }

        public final void d(byte[] bArr, int i10, C c10) {
            for (int i11 = 0; i11 < i10; i11++) {
                for (int i12 = 0; i12 < this.f13540c.f13559b; i12++) {
                    e(bArr, i11, i12, c10.f());
                }
            }
            int iG = g(this.f13541d * i10);
            c10.a0(0);
            c10.Z(iG);
        }

        public final void e(byte[] bArr, int i10, int i11, byte[] bArr2) {
            Q2.c cVar = this.f13540c;
            int i12 = cVar.f13562e;
            int i13 = cVar.f13559b;
            int i14 = (i10 * i12) + (i11 * 4);
            int i15 = (i13 * 4) + i14;
            int i16 = (i12 / i13) - 4;
            int iO = (short) (((bArr[i14 + 1] & ForkServer.ERROR) << 8) | (bArr[i14] & ForkServer.ERROR));
            int iMin = Math.min(bArr[i14 + 2] & ForkServer.ERROR, 88);
            int i17 = f13537n[iMin];
            int i18 = ((i10 * this.f13541d * i13) + i11) * 2;
            bArr2[i18] = (byte) (iO & 255);
            bArr2[i18 + 1] = (byte) (iO >> 8);
            for (int i19 = 0; i19 < i16 * 2; i19++) {
                byte b10 = bArr[((i19 / 8) * i13 * 4) + i15 + ((i19 / 2) % 4)];
                int i20 = i19 % 2 == 0 ? b10 & 15 : (b10 & ForkServer.ERROR) >> 4;
                int i21 = ((((i20 & 7) * 2) + 1) * i17) >> 3;
                if ((i20 & 8) != 0) {
                    i21 = -i21;
                }
                iO = M.o(iO + i21, -32768, 32767);
                i18 += i13 * 2;
                bArr2[i18] = (byte) (iO & 255);
                bArr2[i18 + 1] = (byte) (iO >> 8);
                int i22 = iMin + f13536m[i20];
                int[] iArr = f13537n;
                iMin = M.o(i22, 0, iArr.length - 1);
                i17 = iArr[iMin];
            }
        }

        public final int f(int i10) {
            return i10 / (this.f13540c.f13559b * 2);
        }

        public final int g(int i10) {
            return h(i10, this.f13540c.f13559b);
        }

        public final void i(int i10) {
            long jA1 = this.f13547j + M.a1(this.f13549l, 1000000L, this.f13540c.f13560c);
            int iG = g(i10);
            this.f13539b.d(jA1, 1, iG, this.f13548k - iG, null);
            this.f13549l += (long) i10;
            this.f13548k -= iG;
        }
    }

    /* JADX INFO: renamed from: Q2.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface InterfaceC0171b {
        boolean a(InterfaceC4337q interfaceC4337q, long j10);

        void b(int i10, long j10);

        void c(long j10);
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class c implements InterfaceC0171b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final r f13550a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final O f13551b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Q2.c f13552c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final o f13553d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f13554e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public long f13555f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f13556g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public long f13557h;

        public c(r rVar, O o10, Q2.c cVar, String str, int i10) throws w {
            this.f13550a = rVar;
            this.f13551b = o10;
            this.f13552c = cVar;
            int i11 = (cVar.f13559b * cVar.f13563f) / 8;
            if (cVar.f13562e == i11) {
                int i12 = cVar.f13560c;
                int i13 = i12 * i11 * 8;
                int iMax = Math.max(i11, (i12 * i11) / 10);
                this.f13554e = iMax;
                this.f13553d = new o.b().W("audio/wav").y0(str).S(i13).t0(i13).o0(iMax).T(cVar.f13559b).z0(cVar.f13560c).s0(i10).P();
                return;
            }
            throw w.a("Expected block size: " + i11 + "; got: " + cVar.f13562e, null);
        }

        @Override // Q2.b.InterfaceC0171b
        public boolean a(InterfaceC4337q interfaceC4337q, long j10) {
            int i10;
            int i11;
            long j11 = j10;
            while (j11 > 0 && (i10 = this.f13556g) < (i11 = this.f13554e)) {
                int iA = this.f13551b.a(interfaceC4337q, (int) Math.min(i11 - i10, j11), true);
                if (iA == -1) {
                    j11 = 0;
                } else {
                    this.f13556g += iA;
                    j11 -= (long) iA;
                }
            }
            int i12 = this.f13552c.f13562e;
            int i13 = this.f13556g / i12;
            if (i13 > 0) {
                long jA1 = this.f13555f + M.a1(this.f13557h, 1000000L, r1.f13560c);
                int i14 = i13 * i12;
                int i15 = this.f13556g - i14;
                this.f13551b.d(jA1, 1, i14, i15, null);
                this.f13557h += (long) i13;
                this.f13556g = i15;
            }
            return j11 <= 0;
        }

        @Override // Q2.b.InterfaceC0171b
        public void b(int i10, long j10) {
            e eVar = new e(this.f13552c, 1, i10, j10);
            this.f13550a.v(eVar);
            this.f13551b.e(this.f13553d);
            this.f13551b.f(eVar.m());
        }

        @Override // Q2.b.InterfaceC0171b
        public void c(long j10) {
            this.f13555f = j10;
            this.f13556g = 0;
            this.f13557h = 0L;
        }
    }

    public static /* synthetic */ InterfaceC4336p[] b() {
        return new InterfaceC4336p[]{new b()};
    }

    private void d() {
        AbstractC0853a.i(this.f13530b);
        M.i(this.f13529a);
    }

    @Override // i2.InterfaceC4336p
    public void a(long j10, long j11) {
        this.f13531c = j10 == 0 ? 0 : 4;
        InterfaceC0171b interfaceC0171b = this.f13533e;
        if (interfaceC0171b != null) {
            interfaceC0171b.c(j11);
        }
    }

    @Override // i2.InterfaceC4336p
    public void c(r rVar) {
        this.f13529a = rVar;
        this.f13530b = rVar.f(0, 1);
        rVar.n();
    }

    public final void e(InterfaceC4337q interfaceC4337q) throws w {
        AbstractC0853a.g(interfaceC4337q.getPosition() == 0);
        int i10 = this.f13534f;
        if (i10 != -1) {
            interfaceC4337q.q(i10);
            this.f13531c = 4;
        } else {
            if (!d.a(interfaceC4337q)) {
                throw w.a("Unsupported or unrecognized wav file type.", null);
            }
            interfaceC4337q.q((int) (interfaceC4337q.m() - interfaceC4337q.getPosition()));
            this.f13531c = 1;
        }
    }

    public final void g(InterfaceC4337q interfaceC4337q) throws w {
        Q2.c cVarB = d.b(interfaceC4337q);
        int i10 = cVarB.f13558a;
        if (i10 == 17) {
            this.f13533e = new a(this.f13529a, this.f13530b, cVarB);
        } else if (i10 == 6) {
            this.f13533e = new c(this.f13529a, this.f13530b, cVarB, "audio/g711-alaw", -1);
        } else if (i10 == 7) {
            this.f13533e = new c(this.f13529a, this.f13530b, cVarB, "audio/g711-mlaw", -1);
        } else {
            int iA = T.a(i10, cVarB.f13563f);
            if (iA == 0) {
                throw w.e("Unsupported WAV format type: " + cVarB.f13558a);
            }
            this.f13533e = new c(this.f13529a, this.f13530b, cVarB, "audio/raw", iA);
        }
        this.f13531c = 3;
    }

    public final void h(InterfaceC4337q interfaceC4337q) {
        this.f13532d = d.c(interfaceC4337q);
        this.f13531c = 2;
    }

    @Override // i2.InterfaceC4336p
    public int i(InterfaceC4337q interfaceC4337q, I i10) throws w {
        d();
        int i11 = this.f13531c;
        if (i11 == 0) {
            e(interfaceC4337q);
            return 0;
        }
        if (i11 == 1) {
            h(interfaceC4337q);
            return 0;
        }
        if (i11 == 2) {
            g(interfaceC4337q);
            return 0;
        }
        if (i11 == 3) {
            m(interfaceC4337q);
            return 0;
        }
        if (i11 == 4) {
            return l(interfaceC4337q);
        }
        throw new IllegalStateException();
    }

    @Override // i2.InterfaceC4336p
    public boolean j(InterfaceC4337q interfaceC4337q) {
        return d.a(interfaceC4337q);
    }

    public final int l(InterfaceC4337q interfaceC4337q) {
        AbstractC0853a.g(this.f13535g != -1);
        return ((InterfaceC0171b) AbstractC0853a.e(this.f13533e)).a(interfaceC4337q, this.f13535g - interfaceC4337q.getPosition()) ? -1 : 0;
    }

    public final void m(InterfaceC4337q interfaceC4337q) throws w {
        Pair pairE = d.e(interfaceC4337q);
        this.f13534f = ((Long) pairE.first).intValue();
        long jLongValue = ((Long) pairE.second).longValue();
        long j10 = this.f13532d;
        if (j10 != -1 && jLongValue == KeyboardMap.kValueMask) {
            jLongValue = j10;
        }
        this.f13535g = ((long) this.f13534f) + jLongValue;
        long length = interfaceC4337q.getLength();
        if (length != -1 && this.f13535g > length) {
            t.h("WavExtractor", "Data exceeds input length: " + this.f13535g + ", " + length);
            this.f13535g = length;
        }
        ((InterfaceC0171b) AbstractC0853a.e(this.f13533e)).b(this.f13534f, this.f13535g);
        this.f13531c = 4;
    }

    @Override // i2.InterfaceC4336p
    public void release() {
    }
}
