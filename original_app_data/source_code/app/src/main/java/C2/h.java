package C2;

import D1.C0753k;
import D1.o;
import F2.s;
import G1.AbstractC0853a;
import G1.C;
import G1.H;
import G1.M;
import H1.d;
import H1.j;
import K7.AbstractC1081v;
import android.util.Pair;
import android.util.SparseArray;
import com.google.android.libraries.barhopper.RecognitionOptions;
import com.google.api.Endpoint;
import i2.AbstractC4326f;
import i2.B;
import i2.C4327g;
import i2.C4328h;
import i2.I;
import i2.InterfaceC4336p;
import i2.InterfaceC4337q;
import i2.J;
import i2.N;
import i2.O;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import org.apache.tika.fork.ForkServer;
import t2.C5828a;
import t2.C5830c;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class h implements InterfaceC4336p {

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public static final i2.u f940P = new i2.u() { // from class: C2.f
        @Override // i2.u
        public final InterfaceC4336p[] f() {
            return h.b();
        }
    };

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public static final byte[] f941Q = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public static final D1.o f942R = new o.b().y0("application/x-emsg").P();

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public long f943A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public long f944B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public long f945C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public b f946D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public int f947E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public int f948F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public int f949G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public boolean f950H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public boolean f951I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public i2.r f952J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public O[] f953K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public O[] f954L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public boolean f955M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public boolean f956N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public long f957O;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s.a f958a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f959b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f960c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f961d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final SparseArray f962e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C f963f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C f964g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C f965h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final byte[] f966i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final C f967j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final H f968k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final C5830c f969l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final C f970m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ArrayDeque f971n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ArrayDeque f972o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final H1.j f973p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final O f974q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final C4328h f975r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public AbstractC1081v f976s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f977t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f978u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f979v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f980w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public C f981x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public long f982y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f983z;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f984a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f985b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f986c;

        public a(long j10, boolean z10, int i10) {
            this.f984a = j10;
            this.f985b = z10;
            this.f986c = i10;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final O f987a;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public w f990d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public c f991e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f992f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f993g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f994h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f995i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final D1.o f996j;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public boolean f999m;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final v f988b = new v();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final C f989c = new C();

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final C f997k = new C(1);

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final C f998l = new C();

        public b(O o10, w wVar, c cVar, D1.o oVar) {
            this.f987a = o10;
            this.f990d = wVar;
            this.f991e = cVar;
            this.f996j = oVar;
            j(wVar, cVar);
        }

        public int c() {
            int i10 = !this.f999m ? this.f990d.f1096g[this.f992f] : this.f988b.f1082k[this.f992f] ? 1 : 0;
            return g() != null ? 1073741824 | i10 : i10;
        }

        public long d() {
            return !this.f999m ? this.f990d.f1092c[this.f992f] : this.f988b.f1078g[this.f994h];
        }

        public long e() {
            return !this.f999m ? this.f990d.f1095f[this.f992f] : this.f988b.c(this.f992f);
        }

        public int f() {
            return !this.f999m ? this.f990d.f1093d[this.f992f] : this.f988b.f1080i[this.f992f];
        }

        public u g() {
            if (!this.f999m) {
                return null;
            }
            int i10 = ((c) M.i(this.f988b.f1072a)).f927a;
            u uVarB = this.f988b.f1085n;
            if (uVarB == null) {
                uVarB = this.f990d.f1090a.b(i10);
            }
            if (uVarB == null || !uVarB.f1067a) {
                return null;
            }
            return uVarB;
        }

        public boolean h() {
            this.f992f++;
            if (!this.f999m) {
                return false;
            }
            int i10 = this.f993g + 1;
            this.f993g = i10;
            int[] iArr = this.f988b.f1079h;
            int i11 = this.f994h;
            if (i10 != iArr[i11]) {
                return true;
            }
            this.f994h = i11 + 1;
            this.f993g = 0;
            return false;
        }

        public int i(int i10, int i11) {
            C c10;
            u uVarG = g();
            if (uVarG == null) {
                return 0;
            }
            int length = uVarG.f1070d;
            if (length != 0) {
                c10 = this.f988b.f1086o;
            } else {
                byte[] bArr = (byte[]) M.i(uVarG.f1071e);
                this.f998l.Y(bArr, bArr.length);
                C c11 = this.f998l;
                length = bArr.length;
                c10 = c11;
            }
            boolean zG = this.f988b.g(this.f992f);
            boolean z10 = zG || i11 != 0;
            this.f997k.f()[0] = (byte) ((z10 ? 128 : 0) | length);
            this.f997k.a0(0);
            this.f987a.g(this.f997k, 1, 1);
            this.f987a.g(c10, length, 1);
            if (!z10) {
                return length + 1;
            }
            if (!zG) {
                this.f989c.W(8);
                byte[] bArrF = this.f989c.f();
                bArrF[0] = 0;
                bArrF[1] = 1;
                bArrF[2] = (byte) ((i11 >> 8) & 255);
                bArrF[3] = (byte) (i11 & 255);
                bArrF[4] = (byte) ((i10 >> 24) & 255);
                bArrF[5] = (byte) ((i10 >> 16) & 255);
                bArrF[6] = (byte) ((i10 >> 8) & 255);
                bArrF[7] = (byte) (i10 & 255);
                this.f987a.g(this.f989c, 8, 1);
                return length + 9;
            }
            C c12 = this.f988b.f1086o;
            int iT = c12.T();
            c12.b0(-2);
            int i12 = (iT * 6) + 2;
            if (i11 != 0) {
                this.f989c.W(i12);
                byte[] bArrF2 = this.f989c.f();
                c12.q(bArrF2, 0, i12);
                int i13 = (((bArrF2[2] & ForkServer.ERROR) << 8) | (bArrF2[3] & ForkServer.ERROR)) + i11;
                bArrF2[2] = (byte) ((i13 >> 8) & 255);
                bArrF2[3] = (byte) (i13 & 255);
                c12 = this.f989c;
            }
            this.f987a.g(c12, i12, 1);
            return length + 1 + i12;
        }

        public void j(w wVar, c cVar) {
            this.f990d = wVar;
            this.f991e = cVar;
            this.f987a.e(this.f996j);
            k();
        }

        public void k() {
            this.f988b.f();
            this.f992f = 0;
            this.f994h = 0;
            this.f993g = 0;
            this.f995i = 0;
            this.f999m = false;
        }

        public void l(long j10) {
            int i10 = this.f992f;
            while (true) {
                v vVar = this.f988b;
                if (i10 >= vVar.f1077f || vVar.c(i10) > j10) {
                    return;
                }
                if (this.f988b.f1082k[i10]) {
                    this.f995i = i10;
                }
                i10++;
            }
        }

        public void m() {
            u uVarG = g();
            if (uVarG == null) {
                return;
            }
            C c10 = this.f988b.f1086o;
            int i10 = uVarG.f1070d;
            if (i10 != 0) {
                c10.b0(i10);
            }
            if (this.f988b.g(this.f992f)) {
                c10.b0(c10.T() * 6);
            }
        }

        public void n(C0753k c0753k) {
            u uVarB = this.f990d.f1090a.b(((c) M.i(this.f988b.f1072a)).f927a);
            this.f987a.e(this.f996j.b().c0(c0753k.c(uVarB != null ? uVarB.f1068b : null)).P());
        }
    }

    @Deprecated
    public h() {
        this(s.a.f3686a, 32, null, null, AbstractC1081v.z(), null);
    }

    public static long A(C c10) {
        c10.a0(8);
        return C2.b.q(c10.u()) == 0 ? c10.N() : c10.S();
    }

    public static void B(d.b bVar, SparseArray sparseArray, boolean z10, int i10, byte[] bArr) throws D1.w {
        int size = bVar.f5125d.size();
        for (int i11 = 0; i11 < size; i11++) {
            d.b bVar2 = (d.b) bVar.f5125d.get(i11);
            if (bVar2.f5122a == 1953653094) {
                K(bVar2, sparseArray, z10, i10, bArr);
            }
        }
    }

    public static void C(C c10, v vVar) throws D1.w {
        c10.a0(8);
        int iU = c10.u();
        if ((C2.b.p(iU) & 1) == 1) {
            c10.b0(8);
        }
        int iP = c10.P();
        if (iP == 1) {
            vVar.f1075d += C2.b.q(iU) == 0 ? c10.N() : c10.S();
        } else {
            throw D1.w.a("Unexpected saio entry count: " + iP, null);
        }
    }

    public static void D(u uVar, C c10, v vVar) throws D1.w {
        int i10;
        int i11 = uVar.f1070d;
        c10.a0(8);
        if ((C2.b.p(c10.u()) & 1) == 1) {
            c10.b0(8);
        }
        int iL = c10.L();
        int iP = c10.P();
        if (iP > vVar.f1077f) {
            throw D1.w.a("Saiz sample count " + iP + " is greater than fragment sample count" + vVar.f1077f, null);
        }
        if (iL == 0) {
            boolean[] zArr = vVar.f1084m;
            i10 = 0;
            for (int i12 = 0; i12 < iP; i12++) {
                int iL2 = c10.L();
                i10 += iL2;
                zArr[i12] = iL2 > i11;
            }
        } else {
            i10 = iL * iP;
            Arrays.fill(vVar.f1084m, 0, iP, iL > i11);
        }
        Arrays.fill(vVar.f1084m, iP, vVar.f1077f, false);
        if (i10 > 0) {
            vVar.d(i10);
        }
    }

    public static void E(d.b bVar, String str, v vVar) throws D1.w {
        byte[] bArr = null;
        C c10 = null;
        C c11 = null;
        for (int i10 = 0; i10 < bVar.f5124c.size(); i10++) {
            d.c cVar = (d.c) bVar.f5124c.get(i10);
            C c12 = cVar.f5126b;
            int i11 = cVar.f5122a;
            if (i11 == 1935828848) {
                c12.a0(12);
                if (c12.u() == 1936025959) {
                    c10 = c12;
                }
            } else if (i11 == 1936158820) {
                c12.a0(12);
                if (c12.u() == 1936025959) {
                    c11 = c12;
                }
            }
        }
        if (c10 == null || c11 == null) {
            return;
        }
        c10.a0(8);
        int iQ = C2.b.q(c10.u());
        c10.b0(4);
        if (iQ == 1) {
            c10.b0(4);
        }
        if (c10.u() != 1) {
            throw D1.w.e("Entry count in sbgp != 1 (unsupported).");
        }
        c11.a0(8);
        int iQ2 = C2.b.q(c11.u());
        c11.b0(4);
        if (iQ2 == 1) {
            if (c11.N() == 0) {
                throw D1.w.e("Variable length description in sgpd found (unsupported)");
            }
        } else if (iQ2 >= 2) {
            c11.b0(4);
        }
        if (c11.N() != 1) {
            throw D1.w.e("Entry count in sgpd != 1 (unsupported).");
        }
        c11.b0(1);
        int iL = c11.L();
        int i12 = (iL & 240) >> 4;
        int i13 = iL & 15;
        boolean z10 = c11.L() == 1;
        if (z10) {
            int iL2 = c11.L();
            byte[] bArr2 = new byte[16];
            c11.q(bArr2, 0, 16);
            if (iL2 == 0) {
                int iL3 = c11.L();
                bArr = new byte[iL3];
                c11.q(bArr, 0, iL3);
            }
            vVar.f1083l = true;
            vVar.f1085n = new u(z10, str, iL2, bArr2, i12, i13, bArr);
        }
    }

    public static void F(C c10, int i10, v vVar) throws D1.w {
        c10.a0(i10 + 8);
        int iP = C2.b.p(c10.u());
        if ((iP & 1) != 0) {
            throw D1.w.e("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z10 = (iP & 2) != 0;
        int iP2 = c10.P();
        if (iP2 == 0) {
            Arrays.fill(vVar.f1084m, 0, vVar.f1077f, false);
            return;
        }
        if (iP2 == vVar.f1077f) {
            Arrays.fill(vVar.f1084m, 0, iP2, z10);
            vVar.d(c10.a());
            vVar.a(c10);
        } else {
            throw D1.w.a("Senc sample count " + iP2 + " is different from fragment sample count" + vVar.f1077f, null);
        }
    }

    public static void G(C c10, v vVar) throws D1.w {
        F(c10, 0, vVar);
    }

    public static Pair H(C c10, long j10) throws D1.w {
        long jS;
        long jS2;
        c10.a0(8);
        int iQ = C2.b.q(c10.u());
        c10.b0(4);
        long jN = c10.N();
        if (iQ == 0) {
            jS = c10.N();
            jS2 = c10.N();
        } else {
            jS = c10.S();
            jS2 = c10.S();
        }
        long j11 = j10 + jS2;
        long jA1 = M.a1(jS, 1000000L, jN);
        c10.b0(2);
        int iT = c10.T();
        int[] iArr = new int[iT];
        long[] jArr = new long[iT];
        long[] jArr2 = new long[iT];
        long[] jArr3 = new long[iT];
        long j12 = j11;
        long jA12 = jA1;
        int i10 = 0;
        while (i10 < iT) {
            int iU = c10.u();
            if ((Integer.MIN_VALUE & iU) != 0) {
                throw D1.w.a("Unhandled indirect reference", null);
            }
            long jN2 = c10.N();
            iArr[i10] = iU & Integer.MAX_VALUE;
            jArr[i10] = j12;
            jArr3[i10] = jA12;
            jS += jN2;
            long[] jArr4 = jArr3;
            jA12 = M.a1(jS, 1000000L, jN);
            jArr2[i10] = jA12 - jArr4[i10];
            c10.b0(4);
            j12 += (long) iArr[i10];
            i10++;
            jArr3 = jArr4;
        }
        return Pair.create(Long.valueOf(jA1), new C4327g(iArr, jArr, jArr2, jArr3));
    }

    public static long I(C c10) {
        c10.a0(8);
        return C2.b.q(c10.u()) == 1 ? c10.S() : c10.N();
    }

    public static b J(C c10, SparseArray sparseArray, boolean z10) {
        c10.a0(8);
        int iP = C2.b.p(c10.u());
        b bVar = (b) (z10 ? sparseArray.valueAt(0) : sparseArray.get(c10.u()));
        if (bVar == null) {
            return null;
        }
        if ((iP & 1) != 0) {
            long jS = c10.S();
            v vVar = bVar.f988b;
            vVar.f1074c = jS;
            vVar.f1075d = jS;
        }
        c cVar = bVar.f991e;
        bVar.f988b.f1072a = new c((iP & 2) != 0 ? c10.u() - 1 : cVar.f927a, (iP & 8) != 0 ? c10.u() : cVar.f928b, (iP & 16) != 0 ? c10.u() : cVar.f929c, (iP & 32) != 0 ? c10.u() : cVar.f930d);
        return bVar;
    }

    public static void K(d.b bVar, SparseArray sparseArray, boolean z10, int i10, byte[] bArr) throws D1.w {
        b bVarJ = J(((d.c) AbstractC0853a.e(bVar.e(1952868452))).f5126b, sparseArray, z10);
        if (bVarJ == null) {
            return;
        }
        v vVar = bVarJ.f988b;
        long j10 = vVar.f1088q;
        boolean z11 = vVar.f1089r;
        bVarJ.k();
        bVarJ.f999m = true;
        d.c cVarE = bVar.e(1952867444);
        if (cVarE == null || (i10 & 2) != 0) {
            vVar.f1088q = j10;
            vVar.f1089r = z11;
        } else {
            vVar.f1088q = I(cVarE.f5126b);
            vVar.f1089r = true;
        }
        N(bVar, bVarJ, i10);
        u uVarB = bVarJ.f990d.f1090a.b(((c) AbstractC0853a.e(vVar.f1072a)).f927a);
        d.c cVarE2 = bVar.e(1935763834);
        if (cVarE2 != null) {
            D((u) AbstractC0853a.e(uVarB), cVarE2.f5126b, vVar);
        }
        d.c cVarE3 = bVar.e(1935763823);
        if (cVarE3 != null) {
            C(cVarE3.f5126b, vVar);
        }
        d.c cVarE4 = bVar.e(1936027235);
        if (cVarE4 != null) {
            G(cVarE4.f5126b, vVar);
        }
        E(bVar, uVarB != null ? uVarB.f1068b : null, vVar);
        int size = bVar.f5124c.size();
        for (int i11 = 0; i11 < size; i11++) {
            d.c cVar = (d.c) bVar.f5124c.get(i11);
            if (cVar.f5122a == 1970628964) {
                O(cVar.f5126b, vVar, bArr);
            }
        }
    }

    public static Pair L(C c10) {
        c10.a0(12);
        return Pair.create(Integer.valueOf(c10.u()), new c(c10.u() - 1, c10.u(), c10.u(), c10.u()));
    }

    public static int M(b bVar, int i10, int i11, C c10, int i12) throws D1.w {
        boolean z10;
        int iU;
        int i13;
        int iU2;
        int i14;
        int iU3;
        int i15;
        int iU4;
        c10.a0(8);
        int iP = C2.b.p(c10.u());
        t tVar = bVar.f990d.f1090a;
        v vVar = bVar.f988b;
        c cVar = (c) M.i(vVar.f1072a);
        vVar.f1079h[i10] = c10.P();
        long[] jArr = vVar.f1078g;
        long j10 = vVar.f1074c;
        jArr[i10] = j10;
        if ((iP & 1) != 0) {
            jArr[i10] = j10 + ((long) c10.u());
        }
        boolean z11 = (iP & 4) != 0;
        int iU5 = cVar.f930d;
        if (z11) {
            iU5 = c10.u();
        }
        boolean z12 = (iP & 256) != 0;
        boolean z13 = (iP & 512) != 0;
        boolean z14 = (iP & RecognitionOptions.UPC_E) != 0;
        boolean z15 = (iP & RecognitionOptions.PDF417) != 0;
        long j11 = r(tVar) ? ((long[]) M.i(tVar.f1064j))[0] : 0L;
        int[] iArr = vVar.f1080i;
        long[] jArr2 = vVar.f1081j;
        boolean[] zArr = vVar.f1082k;
        boolean z16 = z15;
        boolean z17 = tVar.f1056b == 2 && (i11 & 1) != 0;
        int i16 = i12 + vVar.f1079h[i10];
        boolean z18 = z11;
        long j12 = tVar.f1057c;
        long j13 = vVar.f1088q;
        int i17 = i12;
        while (i17 < i16) {
            if (z12) {
                iU = c10.u();
                z10 = z17;
            } else {
                z10 = z17;
                iU = cVar.f928b;
            }
            int iG = g(iU);
            if (z13) {
                iU2 = c10.u();
                i13 = i16;
            } else {
                i13 = i16;
                iU2 = cVar.f929c;
            }
            int iG2 = g(iU2);
            if (z14) {
                i14 = iG2;
                iU3 = c10.u();
            } else if (i17 == 0 && z18) {
                i14 = iG2;
                iU3 = iU5;
            } else {
                i14 = iG2;
                iU3 = cVar.f930d;
            }
            if (z16) {
                i15 = iU3;
                iU4 = c10.u();
            } else {
                i15 = iU3;
                iU4 = 0;
            }
            int i18 = i17;
            long jA1 = M.a1((((long) iU4) + j13) - j11, 1000000L, j12);
            jArr2[i18] = jA1;
            if (!vVar.f1089r) {
                jArr2[i18] = jA1 + bVar.f990d.f1097h;
            }
            iArr[i18] = i14;
            zArr[i18] = ((i15 >> 16) & 1) == 0 && (!z10 || i18 == 0);
            j13 += (long) iG;
            i17 = i18 + 1;
            i16 = i13;
            z17 = z10;
        }
        int i19 = i16;
        vVar.f1088q = j13;
        return i19;
    }

    public static void N(d.b bVar, b bVar2, int i10) throws D1.w {
        List list = bVar.f5124c;
        int size = list.size();
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            d.c cVar = (d.c) list.get(i13);
            if (cVar.f5122a == 1953658222) {
                C c10 = cVar.f5126b;
                c10.a0(12);
                int iP = c10.P();
                if (iP > 0) {
                    i12 += iP;
                    i11++;
                }
            }
        }
        bVar2.f994h = 0;
        bVar2.f993g = 0;
        bVar2.f992f = 0;
        bVar2.f988b.e(i11, i12);
        int i14 = 0;
        int iM = 0;
        for (int i15 = 0; i15 < size; i15++) {
            d.c cVar2 = (d.c) list.get(i15);
            if (cVar2.f5122a == 1953658222) {
                iM = M(bVar2, i14, i10, cVar2.f5126b, iM);
                i14++;
            }
        }
    }

    public static void O(C c10, v vVar, byte[] bArr) throws D1.w {
        c10.a0(8);
        c10.q(bArr, 0, 16);
        if (Arrays.equals(bArr, f941Q)) {
            F(c10, 16, vVar);
        }
    }

    private void P(long j10) throws D1.w {
        while (!this.f971n.isEmpty() && ((d.b) this.f971n.peek()).f5123b == j10) {
            u((d.b) this.f971n.pop());
        }
        l();
    }

    private boolean Q(InterfaceC4337q interfaceC4337q) throws D1.w {
        if (this.f980w == 0) {
            if (!interfaceC4337q.j(this.f970m.f(), 0, 8, true)) {
                return false;
            }
            this.f980w = 8;
            this.f970m.a0(0);
            this.f979v = this.f970m.N();
            this.f978u = this.f970m.u();
        }
        long j10 = this.f979v;
        if (j10 == 1) {
            interfaceC4337q.readFully(this.f970m.f(), 8, 8);
            this.f980w += 8;
            this.f979v = this.f970m.S();
        } else if (j10 == 0) {
            long length = interfaceC4337q.getLength();
            if (length == -1 && !this.f971n.isEmpty()) {
                length = ((d.b) this.f971n.peek()).f5123b;
            }
            if (length != -1) {
                this.f979v = (length - interfaceC4337q.getPosition()) + ((long) this.f980w);
            }
        }
        long j11 = this.f979v;
        int i10 = this.f980w;
        if (j11 < i10) {
            throw D1.w.e("Atom size less than header length (unsupported).");
        }
        if (this.f957O != -1) {
            if (this.f978u == 1936286840) {
                this.f967j.W((int) j11);
                System.arraycopy(this.f970m.f(), 0, this.f967j.f(), 0, 8);
                interfaceC4337q.readFully(this.f967j.f(), 8, (int) (this.f979v - ((long) this.f980w)));
                this.f975r.a((C4327g) H(new d.c(1936286840, this.f967j).f5126b, interfaceC4337q.m()).second);
            } else {
                interfaceC4337q.d((int) (j11 - ((long) i10)), true);
            }
            l();
            return true;
        }
        long position = interfaceC4337q.getPosition() - ((long) this.f980w);
        int i11 = this.f978u;
        if ((i11 == 1836019558 || i11 == 1835295092) && !this.f955M) {
            this.f952J.v(new J.b(this.f944B, position));
            this.f955M = true;
        }
        if (this.f978u == 1836019558) {
            int size = this.f962e.size();
            for (int i12 = 0; i12 < size; i12++) {
                v vVar = ((b) this.f962e.valueAt(i12)).f988b;
                vVar.f1073b = position;
                vVar.f1075d = position;
                vVar.f1074c = position;
            }
        }
        int i13 = this.f978u;
        if (i13 == 1835295092) {
            this.f946D = null;
            this.f982y = position + this.f979v;
            this.f977t = 2;
            return true;
        }
        if (U(i13)) {
            long position2 = interfaceC4337q.getPosition();
            long j12 = this.f979v;
            long j13 = (position2 + j12) - 8;
            if (j12 != this.f980w && this.f978u == 1835365473) {
                s(interfaceC4337q);
            }
            this.f971n.push(new d.b(this.f978u, j13));
            if (this.f979v == this.f980w) {
                P(j13);
            } else {
                l();
            }
        } else if (V(this.f978u)) {
            if (this.f980w != 8) {
                throw D1.w.e("Leaf atom defines extended atom size (unsupported).");
            }
            if (this.f979v > 2147483647L) {
                throw D1.w.e("Leaf atom with length > 2147483647 (unsupported).");
            }
            C c10 = new C((int) this.f979v);
            System.arraycopy(this.f970m.f(), 0, c10.f(), 0, 8);
            this.f981x = c10;
            this.f977t = 1;
        } else {
            if (this.f979v > 2147483647L) {
                throw D1.w.e("Skipping atom with length > 2147483647 (unsupported).");
            }
            this.f981x = null;
            this.f977t = 1;
        }
        return true;
    }

    private static boolean U(int i10) {
        return i10 == 1836019574 || i10 == 1953653099 || i10 == 1835297121 || i10 == 1835626086 || i10 == 1937007212 || i10 == 1836019558 || i10 == 1953653094 || i10 == 1836475768 || i10 == 1701082227 || i10 == 1835365473;
    }

    private static boolean V(int i10) {
        return i10 == 1751411826 || i10 == 1835296868 || i10 == 1836476516 || i10 == 1936286840 || i10 == 1937011556 || i10 == 1937011827 || i10 == 1668576371 || i10 == 1937011555 || i10 == 1937011578 || i10 == 1937013298 || i10 == 1937007471 || i10 == 1668232756 || i10 == 1937011571 || i10 == 1952867444 || i10 == 1952868452 || i10 == 1953196132 || i10 == 1953654136 || i10 == 1953658222 || i10 == 1886614376 || i10 == 1935763834 || i10 == 1935763823 || i10 == 1936027235 || i10 == 1970628964 || i10 == 1935828848 || i10 == 1936158820 || i10 == 1701606260 || i10 == 1835362404 || i10 == 1701671783 || i10 == 1969517665 || i10 == 1801812339 || i10 == 1768715124;
    }

    public static /* synthetic */ InterfaceC4336p[] b() {
        return new InterfaceC4336p[]{new h(s.a.f3686a, 32)};
    }

    private boolean e(D1.o oVar) {
        return Objects.equals(oVar.f1805o, "video/avc") ? (this.f959b & 64) != 0 : Objects.equals(oVar.f1805o, "video/hevc") && (this.f959b & 128) != 0;
    }

    public static int g(int i10) throws D1.w {
        if (i10 >= 0) {
            return i10;
        }
        throw D1.w.a("Unexpected negative value: " + i10, null);
    }

    public static int h(int i10) {
        int i11 = (i10 & 1) != 0 ? 64 : 0;
        return (i10 & 2) != 0 ? i11 | 128 : i11;
    }

    private void l() {
        this.f977t = 0;
        this.f980w = 0;
    }

    public static C0753k n(List list) {
        int size = list.size();
        ArrayList arrayList = null;
        for (int i10 = 0; i10 < size; i10++) {
            d.c cVar = (d.c) list.get(i10);
            if (cVar.f5122a == 1886614376) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] bArrF = cVar.f5126b.f();
                UUID uuidF = p.f(bArrF);
                if (uuidF == null) {
                    G1.t.h("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList.add(new C0753k.b(uuidF, "video/mp4", bArrF));
                }
            }
        }
        if (arrayList == null) {
            return null;
        }
        return new C0753k(arrayList);
    }

    public static b o(SparseArray sparseArray) {
        int size = sparseArray.size();
        b bVar = null;
        long j10 = Long.MAX_VALUE;
        for (int i10 = 0; i10 < size; i10++) {
            b bVar2 = (b) sparseArray.valueAt(i10);
            if ((bVar2.f999m || bVar2.f992f != bVar2.f990d.f1091b) && (!bVar2.f999m || bVar2.f994h != bVar2.f988b.f1076e)) {
                long jD = bVar2.d();
                if (jD < j10) {
                    bVar = bVar2;
                    j10 = jD;
                }
            }
        }
        return bVar;
    }

    public static boolean r(t tVar) {
        long[] jArr = tVar.f1063i;
        if (jArr != null && jArr.length == 1 && tVar.f1064j != null) {
            long j10 = jArr[0];
            if (j10 == 0 || M.a1(j10, 1000000L, tVar.f1058d) + M.a1(tVar.f1064j[0], 1000000L, tVar.f1057c) >= tVar.f1059e) {
                return true;
            }
        }
        return false;
    }

    private void s(InterfaceC4337q interfaceC4337q) {
        this.f967j.W(8);
        interfaceC4337q.s(this.f967j.f(), 0, 8);
        C2.b.g(this.f967j);
        interfaceC4337q.q(this.f967j.g());
        interfaceC4337q.i();
    }

    public final void R(InterfaceC4337q interfaceC4337q) throws D1.w {
        int i10 = (int) (this.f979v - ((long) this.f980w));
        C c10 = this.f981x;
        if (c10 != null) {
            interfaceC4337q.readFully(c10.f(), 8, i10);
            w(new d.c(this.f978u, c10), interfaceC4337q);
        } else {
            interfaceC4337q.q(i10);
        }
        P(interfaceC4337q.getPosition());
    }

    public final void S(InterfaceC4337q interfaceC4337q) throws D1.w {
        int size = this.f962e.size();
        long j10 = Long.MAX_VALUE;
        b bVar = null;
        for (int i10 = 0; i10 < size; i10++) {
            v vVar = ((b) this.f962e.valueAt(i10)).f988b;
            if (vVar.f1087p) {
                long j11 = vVar.f1075d;
                if (j11 < j10) {
                    bVar = (b) this.f962e.valueAt(i10);
                    j10 = j11;
                }
            }
        }
        if (bVar == null) {
            this.f977t = 3;
            return;
        }
        int position = (int) (j10 - interfaceC4337q.getPosition());
        if (position < 0) {
            throw D1.w.a("Offset to encryption data was negative.", null);
        }
        interfaceC4337q.q(position);
        bVar.f988b.b(interfaceC4337q);
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0113  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean T(i2.InterfaceC4337q r17) throws D1.w {
        /*
            Method dump skipped, instruction units count: 569
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: C2.h.T(i2.q):boolean");
    }

    @Override // i2.InterfaceC4336p
    public void a(long j10, long j11) {
        int size = this.f962e.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((b) this.f962e.valueAt(i10)).k();
        }
        this.f972o.clear();
        this.f983z = 0;
        this.f973p.b();
        this.f943A = j11;
        this.f971n.clear();
        l();
    }

    @Override // i2.InterfaceC4336p
    public void c(i2.r rVar) {
        if ((this.f959b & 32) == 0) {
            rVar = new F2.t(rVar, this.f958a);
        }
        this.f952J = rVar;
        l();
        q();
        t tVar = this.f960c;
        if (tVar != null) {
            o.b bVarB = tVar.f1061g.b();
            bVarB.W(k.a(this.f960c.f1061g));
            this.f962e.put(0, new b(this.f952J.f(0, this.f960c.f1056b), new w(this.f960c, new long[0], new int[0], 0, new long[0], new int[0], 0L), new c(0, 0, 0, 0), bVarB.P()));
            this.f952J.n();
        }
    }

    @Override // i2.InterfaceC4336p
    public int i(InterfaceC4337q interfaceC4337q, I i10) throws D1.w {
        while (true) {
            int i11 = this.f977t;
            if (i11 != 0) {
                if (i11 == 1) {
                    R(interfaceC4337q);
                } else if (i11 == 2) {
                    S(interfaceC4337q);
                } else if (T(interfaceC4337q)) {
                    return 0;
                }
            } else if (!Q(interfaceC4337q)) {
                long j10 = this.f957O;
                if (j10 == -1) {
                    this.f973p.d();
                    return -1;
                }
                i10.f36871a = j10;
                this.f957O = -1L;
                this.f952J.v(this.f975r.b());
                this.f956N = true;
                return 1;
            }
        }
    }

    @Override // i2.InterfaceC4336p
    public boolean j(InterfaceC4337q interfaceC4337q) {
        N nB = s.b(interfaceC4337q);
        this.f976s = nB != null ? AbstractC1081v.A(nB) : AbstractC1081v.z();
        return nB == null;
    }

    public final c m(SparseArray sparseArray, int i10) {
        return sparseArray.size() == 1 ? (c) sparseArray.valueAt(0) : (c) AbstractC0853a.e((c) sparseArray.get(i10));
    }

    @Override // i2.InterfaceC4336p
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public AbstractC1081v k() {
        return this.f976s;
    }

    public final void q() {
        int i10;
        O[] oArr = new O[2];
        this.f953K = oArr;
        O o10 = this.f974q;
        int i11 = 0;
        if (o10 != null) {
            oArr[0] = o10;
            i10 = 1;
        } else {
            i10 = 0;
        }
        int i12 = 100;
        if ((this.f959b & 4) != 0) {
            oArr[i10] = this.f952J.f(100, 5);
            i12 = Endpoint.TARGET_FIELD_NUMBER;
            i10++;
        }
        O[] oArr2 = (O[]) M.S0(this.f953K, i10);
        this.f953K = oArr2;
        for (O o11 : oArr2) {
            o11.e(f942R);
        }
        this.f954L = new O[this.f961d.size()];
        while (i11 < this.f954L.length) {
            O oF = this.f952J.f(i12, 3);
            oF.e((D1.o) this.f961d.get(i11));
            this.f954L[i11] = oF;
            i11++;
            i12++;
        }
    }

    public final void u(d.b bVar) throws D1.w {
        int i10 = bVar.f5122a;
        if (i10 == 1836019574) {
            y(bVar);
        } else if (i10 == 1836019558) {
            x(bVar);
        } else {
            if (this.f971n.isEmpty()) {
                return;
            }
            ((d.b) this.f971n.peek()).b(bVar);
        }
    }

    public final void v(C c10) {
        String str;
        String str2;
        long jA1;
        long jA12;
        long jN;
        long jA;
        if (this.f953K.length == 0) {
            return;
        }
        c10.a0(8);
        int iQ = C2.b.q(c10.u());
        if (iQ == 0) {
            str = (String) AbstractC0853a.e(c10.F());
            str2 = (String) AbstractC0853a.e(c10.F());
            long jN2 = c10.N();
            jA1 = M.a1(c10.N(), 1000000L, jN2);
            long j10 = this.f945C;
            long j11 = j10 != -9223372036854775807L ? j10 + jA1 : -9223372036854775807L;
            jA12 = M.a1(c10.N(), 1000L, jN2);
            jN = c10.N();
            jA = j11;
        } else {
            if (iQ != 1) {
                G1.t.h("FragmentedMp4Extractor", "Skipping unsupported emsg version: " + iQ);
                return;
            }
            long jN3 = c10.N();
            jA = M.a1(c10.S(), 1000000L, jN3);
            long jA13 = M.a1(c10.N(), 1000L, jN3);
            long jN4 = c10.N();
            str = (String) AbstractC0853a.e(c10.F());
            str2 = (String) AbstractC0853a.e(c10.F());
            jA12 = jA13;
            jN = jN4;
            jA1 = -9223372036854775807L;
        }
        String str3 = str;
        String str4 = str2;
        byte[] bArr = new byte[c10.a()];
        c10.q(bArr, 0, c10.a());
        C c11 = new C(this.f969l.a(new C5828a(str3, str4, jA12, jN, bArr)));
        int iA = c11.a();
        for (O o10 : this.f953K) {
            c11.a0(0);
            o10.b(c11, iA);
        }
        if (jA == -9223372036854775807L) {
            this.f972o.addLast(new a(jA1, true, iA));
            this.f983z += iA;
            return;
        }
        if (!this.f972o.isEmpty()) {
            this.f972o.addLast(new a(jA, false, iA));
            this.f983z += iA;
            return;
        }
        H h10 = this.f968k;
        if (h10 != null && !h10.g()) {
            this.f972o.addLast(new a(jA, false, iA));
            this.f983z += iA;
            return;
        }
        H h11 = this.f968k;
        if (h11 != null) {
            jA = h11.a(jA);
        }
        long j12 = jA;
        for (O o11 : this.f953K) {
            o11.d(j12, 1, iA, 0, null);
        }
    }

    public final void w(d.c cVar, InterfaceC4337q interfaceC4337q) throws D1.w {
        if (!this.f971n.isEmpty()) {
            ((d.b) this.f971n.peek()).c(cVar);
            return;
        }
        int i10 = cVar.f5122a;
        if (i10 != 1936286840) {
            if (i10 == 1701671783) {
                v(cVar.f5126b);
                return;
            }
            return;
        }
        Pair pairH = H(cVar.f5126b, interfaceC4337q.getPosition());
        this.f975r.a((C4327g) pairH.second);
        if (!this.f955M) {
            this.f945C = ((Long) pairH.first).longValue();
            this.f952J.v((J) pairH.second);
            this.f955M = true;
        } else {
            if ((this.f959b & 256) == 0 || this.f956N || this.f975r.c() <= 1) {
                return;
            }
            this.f957O = interfaceC4337q.getPosition();
        }
    }

    public final void x(d.b bVar) throws D1.w {
        B(bVar, this.f962e, this.f960c != null, this.f959b, this.f966i);
        C0753k c0753kN = n(bVar.f5124c);
        if (c0753kN != null) {
            int size = this.f962e.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((b) this.f962e.valueAt(i10)).n(c0753kN);
            }
        }
        if (this.f943A != -9223372036854775807L) {
            int size2 = this.f962e.size();
            for (int i11 = 0; i11 < size2; i11++) {
                ((b) this.f962e.valueAt(i11)).l(this.f943A);
            }
            this.f943A = -9223372036854775807L;
        }
    }

    public final void y(d.b bVar) {
        long j10;
        boolean z10;
        int i10 = 0;
        AbstractC0853a.h(this.f960c == null, "Unexpected moov box.");
        C0753k c0753kN = n(bVar.f5124c);
        d.b bVar2 = (d.b) AbstractC0853a.e(bVar.d(1836475768));
        SparseArray sparseArray = new SparseArray();
        int size = bVar2.f5124c.size();
        long jA = -9223372036854775807L;
        for (int i11 = 0; i11 < size; i11++) {
            d.c cVar = (d.c) bVar2.f5124c.get(i11);
            int i12 = cVar.f5122a;
            if (i12 == 1953654136) {
                Pair pairL = L(cVar.f5126b);
                sparseArray.put(((Integer) pairL.first).intValue(), (c) pairL.second);
            } else if (i12 == 1835362404) {
                jA = A(cVar.f5126b);
            }
        }
        d.b bVarD = bVar.d(1835365473);
        D1.u uVarI = null;
        D1.u uVarU = bVarD != null ? C2.b.u(bVarD) : null;
        B b10 = new B();
        d.c cVarE = bVar.e(1969517665);
        if (cVarE != null) {
            uVarI = C2.b.I(cVarE);
            b10.c(uVarI);
        }
        D1.u uVar = uVarI;
        D1.u uVar2 = new D1.u(C2.b.w(((d.c) AbstractC0853a.e(bVar.e(1836476516))).f5126b));
        if ((this.f959b & 16) != 0) {
            j10 = jA;
            z10 = true;
        } else {
            j10 = jA;
            z10 = false;
        }
        List listH = C2.b.H(bVar, b10, j10, c0753kN, z10, false, new J7.f() { // from class: C2.e
            @Override // J7.f
            public final Object apply(Object obj) {
                return this.f938a.t((t) obj);
            }
        });
        int size2 = listH.size();
        if (this.f962e.size() != 0) {
            AbstractC0853a.g(this.f962e.size() == size2);
            while (i10 < size2) {
                w wVar = (w) listH.get(i10);
                t tVar = wVar.f1090a;
                ((b) this.f962e.get(tVar.f1055a)).j(wVar, m(sparseArray, tVar.f1055a));
                i10++;
            }
            return;
        }
        String strB = k.b(listH);
        while (i10 < size2) {
            w wVar2 = (w) listH.get(i10);
            t tVar2 = wVar2.f1090a;
            O oF = this.f952J.f(i10, tVar2.f1056b);
            oF.f(tVar2.f1059e);
            o.b bVarB = tVar2.f1061g.b();
            bVarB.W(strB);
            j.l(tVar2.f1056b, b10, bVarB);
            j.m(tVar2.f1056b, uVarU, bVarB, tVar2.f1061g.f1802l, uVar, uVar2);
            this.f962e.put(tVar2.f1055a, new b(oF, wVar2, m(sparseArray, tVar2.f1055a), bVarB.P()));
            this.f944B = Math.max(this.f944B, tVar2.f1059e);
            i10++;
            b10 = b10;
        }
        this.f952J.n();
    }

    public final void z(long j10) {
        while (!this.f972o.isEmpty()) {
            a aVar = (a) this.f972o.removeFirst();
            this.f983z -= aVar.f986c;
            long jA = aVar.f984a;
            if (aVar.f985b) {
                jA += j10;
            }
            H h10 = this.f968k;
            if (h10 != null) {
                jA = h10.a(jA);
            }
            long j11 = jA;
            for (O o10 : this.f953K) {
                o10.d(j11, 1, aVar.f986c, this.f983z, null);
            }
        }
    }

    public h(s.a aVar, int i10) {
        this(aVar, i10, null, null, AbstractC1081v.z(), null);
    }

    public h(s.a aVar, int i10, H h10, t tVar, List list, O o10) {
        this.f958a = aVar;
        this.f959b = i10;
        this.f968k = h10;
        this.f960c = tVar;
        this.f961d = Collections.unmodifiableList(list);
        this.f974q = o10;
        this.f969l = new C5830c();
        this.f970m = new C(16);
        this.f963f = new C(H1.g.f5132a);
        this.f964g = new C(6);
        this.f965h = new C();
        byte[] bArr = new byte[16];
        this.f966i = bArr;
        this.f967j = new C(bArr);
        this.f971n = new ArrayDeque();
        this.f972o = new ArrayDeque();
        this.f962e = new SparseArray();
        this.f976s = AbstractC1081v.z();
        this.f944B = -9223372036854775807L;
        this.f943A = -9223372036854775807L;
        this.f945C = -9223372036854775807L;
        this.f952J = i2.r.f37046i0;
        this.f953K = new O[0];
        this.f954L = new O[0];
        this.f973p = new H1.j(new j.b() { // from class: C2.g
            @Override // H1.j.b
            public final void a(long j10, C c10) {
                AbstractC4326f.a(j10, c10, this.f939a.f954L);
            }
        });
        this.f975r = new C4328h();
        this.f957O = -1L;
    }

    @Override // i2.InterfaceC4336p
    public void release() {
    }

    public t t(t tVar) {
        return tVar;
    }
}
