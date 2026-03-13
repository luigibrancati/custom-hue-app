package K1;

import D1.C0744b;
import D1.D;
import D1.r;
import D1.u;
import G1.AbstractC0853a;
import G1.C0863k;
import G1.InterfaceC0860h;
import K1.C0999h;
import K1.C1011n;
import K1.E0;
import K1.F0;
import K1.H0;
import K1.InterfaceC1032y;
import K1.Z0;
import K1.c1;
import K1.e1;
import K1.f1;
import K7.AbstractC1081v;
import L1.InterfaceC1137a;
import P1.m;
import a2.C2616b;
import a2.InterfaceC2610C;
import a2.InterfaceC2611D;
import android.content.Context;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Pair;
import d2.x;
import io.flutter.Build;
import java.io.IOException;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class A0 implements Handler.Callback, InterfaceC2610C.a, x.a, Z0.d, C1011n.a, c1.a, C0999h.a, g2.r {

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public static final long f6740z0 = G1.M.o1(10000);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final boolean f6741A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final C0999h f6742B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public k1 f6743C;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public k1 f6745E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public boolean f6746F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public boolean f6747G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public h f6748H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public C0986a1 f6749I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public e f6750J;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public boolean f6751P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public boolean f6752Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public boolean f6753R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public boolean f6754S;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public boolean f6756V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public int f6757W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public boolean f6758X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public boolean f6759Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public boolean f6760Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h1[] f6761a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f1[] f6762b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean[] f6763c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d2.x f6764d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final d2.y f6765e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final E0 f6766f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e2.d f6767g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final G1.p f6768h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final b1 f6769i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Looper f6770j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final D.c f6771k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public boolean f6772k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final D.b f6773l;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public int f6774l0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final long f6775m;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public h f6776m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f6777n;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public long f6778n0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final C1011n f6779o;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public long f6780o0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ArrayList f6781p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f6782p0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final InterfaceC0860h f6783q;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public boolean f6784q0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final f f6785r;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public C1030x f6786r0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final K0 f6787s;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public long f6788s0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Z0 f6789t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final D0 f6791u;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public InterfaceC1032y.c f6792u0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final long f6793v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final L1.B0 f6795w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final boolean f6797x;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public boolean f6798x0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final InterfaceC1137a f6799y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final G1.p f6801z;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public long f6796w0 = -9223372036854775807L;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public float f6800y0 = 1.0f;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public j1 f6744D = j1.f7191i;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public long f6790t0 = -9223372036854775807L;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public long f6755T = -9223372036854775807L;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public D1.D f6794v0 = D1.D.f1441a;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a implements e1.a {
        public a() {
        }

        @Override // K1.e1.a
        public void a() {
            A0.this.f6760Z = true;
        }

        @Override // K1.e1.a
        public void b() {
            if (A0.this.f0() || A0.this.f6772k0) {
                A0.this.f6768h.j(2);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f6803a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final a2.e0 f6804b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f6805c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long f6806d;

        public /* synthetic */ b(List list, a2.e0 e0Var, int i10, long j10, a aVar) {
            this(list, e0Var, i10, j10);
        }

        public b(List list, a2.e0 e0Var, int i10, long j10) {
            this.f6803a = list;
            this.f6804b = e0Var;
            this.f6805c = i10;
            this.f6806d = j10;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class c {
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class d implements Comparable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c1 f6807a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f6808b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f6809c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Object f6810d;

        public d(c1 c1Var) {
            this.f6807a = c1Var;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(d dVar) {
            Object obj = this.f6810d;
            if ((obj == null) != (dVar.f6810d == null)) {
                return obj != null ? -1 : 1;
            }
            if (obj == null) {
                return 0;
            }
            int i10 = this.f6808b - dVar.f6808b;
            return i10 != 0 ? i10 : Long.compare(this.f6809c, dVar.f6809c);
        }

        public void b(int i10, long j10, Object obj) {
            this.f6808b = i10;
            this.f6809c = j10;
            this.f6810d = obj;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f6811a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public C0986a1 f6812b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f6813c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f6814d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f6815e;

        public e(C0986a1 c0986a1) {
            this.f6812b = c0986a1;
        }

        public void b(int i10) {
            this.f6811a |= i10 > 0;
            this.f6813c += i10;
        }

        public void c(C0986a1 c0986a1) {
            this.f6811a |= this.f6812b != c0986a1;
            this.f6812b = c0986a1;
        }

        public void d(int i10) {
            if (this.f6814d && this.f6815e != 5) {
                AbstractC0853a.a(i10 == 5);
                return;
            }
            this.f6811a = true;
            this.f6814d = true;
            this.f6815e = i10;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface f {
        void a(e eVar);
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final InterfaceC2611D.b f6816a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f6817b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f6818c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f6819d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f6820e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final boolean f6821f;

        public g(InterfaceC2611D.b bVar, long j10, long j11, boolean z10, boolean z11, boolean z12) {
            this.f6816a = bVar;
            this.f6817b = j10;
            this.f6818c = j11;
            this.f6819d = z10;
            this.f6820e = z11;
            this.f6821f = z12;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final D1.D f6822a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f6823b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f6824c;

        public h(D1.D d10, int i10, long j10) {
            this.f6822a = d10;
            this.f6823b = i10;
            this.f6824c = j10;
        }
    }

    public A0(Context context, e1[] e1VarArr, e1[] e1VarArr2, d2.x xVar, d2.y yVar, E0 e02, e2.d dVar, int i10, boolean z10, InterfaceC1137a interfaceC1137a, k1 k1Var, D0 d02, long j10, boolean z11, boolean z12, Looper looper, InterfaceC0860h interfaceC0860h, f fVar, L1.B0 b02, b1 b1Var, InterfaceC1032y.c cVar, final g2.r rVar) {
        this.f6785r = fVar;
        this.f6764d = xVar;
        this.f6765e = yVar;
        this.f6766f = e02;
        this.f6767g = dVar;
        this.f6757W = i10;
        this.f6758X = z10;
        this.f6743C = k1Var;
        this.f6791u = d02;
        this.f6793v = j10;
        this.f6788s0 = j10;
        this.f6752Q = z11;
        this.f6797x = z12;
        this.f6783q = interfaceC0860h;
        this.f6795w = b02;
        this.f6792u0 = cVar;
        this.f6799y = interfaceC1137a;
        this.f6775m = e02.g(b02);
        this.f6777n = e02.c(b02);
        C0986a1 c0986a1K = C0986a1.k(yVar);
        this.f6749I = c0986a1K;
        this.f6750J = new e(c0986a1K);
        this.f6762b = new f1[e1VarArr.length];
        this.f6763c = new boolean[e1VarArr.length];
        f1.a aVarC = xVar.c();
        this.f6761a = new h1[e1VarArr.length];
        boolean z13 = false;
        for (int i11 = 0; i11 < e1VarArr.length; i11++) {
            e1VarArr[i11].P(i11, b02, interfaceC0860h);
            this.f6762b[i11] = e1VarArr[i11].G();
            if (aVarC != null) {
                this.f6762b[i11].x(aVarC);
            }
            e1 e1Var = e1VarArr2[i11];
            if (e1Var != null) {
                e1Var.P(i11, b02, interfaceC0860h);
                z13 = true;
            }
            this.f6761a[i11] = new h1(e1VarArr[i11], e1VarArr2[i11], i11);
        }
        this.f6741A = z13;
        this.f6779o = new C1011n(this, interfaceC0860h);
        this.f6781p = new ArrayList();
        this.f6771k = new D.c();
        this.f6773l = new D.b();
        xVar.d(this, dVar);
        this.f6784q0 = true;
        G1.p pVarE = interfaceC0860h.e(looper, null);
        this.f6801z = pVarE;
        this.f6787s = new K0(interfaceC1137a, pVarE, new H0.a() { // from class: K1.y0
            @Override // K1.H0.a
            public final H0 a(I0 i02, long j11) {
                return this.f7399a.y(i02, j11);
            }
        }, cVar);
        this.f6789t = new Z0(this, interfaceC1137a, pVarE, b02);
        b1 b1Var2 = b1Var == null ? new b1() : b1Var;
        this.f6769i = b1Var2;
        Looper looperA = b1Var2.a();
        this.f6770j = looperA;
        G1.p pVarE2 = interfaceC0860h.e(looperA, this);
        this.f6768h = pVarE2;
        this.f6742B = new C0999h(context, looperA, this);
        pVarE2.e(35, new g2.r() { // from class: K1.z0
            @Override // g2.r
            public final void e(long j11, long j12, D1.o oVar, MediaFormat mediaFormat) {
                A0.l(this.f7404a, rVar, j11, j12, oVar, mediaFormat);
            }
        }).a();
    }

    public static void R0(D1.D d10, d dVar, D.c cVar, D.b bVar) {
        int i10 = d10.n(d10.h(dVar.f6810d, bVar).f1452c, cVar).f1487o;
        Object obj = d10.g(i10, bVar, true).f1451b;
        long j10 = bVar.f1453d;
        dVar.b(i10, j10 != -9223372036854775807L ? j10 - 1 : Long.MAX_VALUE, obj);
    }

    public static boolean S0(d dVar, D1.D d10, D1.D d11, int i10, boolean z10, D.c cVar, D.b bVar) {
        Object obj = dVar.f6810d;
        if (obj == null) {
            Pair pairV0 = V0(d10, new h(dVar.f6807a.g(), dVar.f6807a.c(), dVar.f6807a.e() == Long.MIN_VALUE ? -9223372036854775807L : G1.M.M0(dVar.f6807a.e())), false, i10, z10, cVar, bVar);
            if (pairV0 == null) {
                return false;
            }
            dVar.b(d10.b(pairV0.first), ((Long) pairV0.second).longValue(), pairV0.first);
            if (dVar.f6807a.e() == Long.MIN_VALUE) {
                R0(d10, dVar, cVar, bVar);
            }
            return true;
        }
        int iB = d10.b(obj);
        if (iB == -1) {
            return false;
        }
        if (dVar.f6807a.e() == Long.MIN_VALUE) {
            R0(d10, dVar, cVar, bVar);
            return true;
        }
        dVar.f6808b = iB;
        d11.h(dVar.f6810d, bVar);
        if (bVar.f1455f && d11.n(bVar.f1452c, cVar).f1486n == d11.b(dVar.f6810d)) {
            Pair pairJ = d10.j(cVar, bVar, d10.h(dVar.f6810d, bVar).f1452c, dVar.f6809c + bVar.n());
            dVar.b(d10.b(pairJ.first), ((Long) pairJ.second).longValue(), pairJ.first);
        }
        return true;
    }

    public static g U0(D1.D d10, C0986a1 c0986a1, h hVar, K0 k02, int i10, boolean z10, D.c cVar, D.b bVar) {
        D1.D d11;
        D.b bVar2;
        int i11;
        int iA;
        long jP;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        long jG;
        long j10;
        int i12;
        long jLongValue;
        boolean z15;
        boolean z16;
        boolean z17;
        if (d10.q()) {
            return new g(C0986a1.l(), 0L, -9223372036854775807L, false, true, false);
        }
        InterfaceC2611D.b bVar3 = c0986a1.f6990b;
        Object obj = bVar3.f20522a;
        boolean zK0 = k0(c0986a1, bVar);
        long j11 = (c0986a1.f6990b.b() || zK0) ? c0986a1.f6991c : c0986a1.f7007s;
        boolean z18 = false;
        if (hVar != null) {
            d11 = d10;
            Pair pairV0 = V0(d11, hVar, true, i10, z10, cVar, bVar);
            if (pairV0 == null) {
                iA = d11.a(z10);
                jLongValue = j11;
                z15 = false;
                z16 = false;
                z17 = true;
            } else {
                if (hVar.f6824c == -9223372036854775807L) {
                    iA = d11.h(pairV0.first, bVar).f1452c;
                    jLongValue = j11;
                    z15 = false;
                } else {
                    obj = pairV0.first;
                    jLongValue = ((Long) pairV0.second).longValue();
                    iA = -1;
                    z15 = true;
                }
                z16 = c0986a1.f6993e == 4;
                z17 = false;
            }
            z13 = z15;
            z11 = z16;
            z12 = z17;
            bVar2 = bVar;
            i11 = -1;
            jP = jLongValue;
        } else {
            d11 = d10;
            if (c0986a1.f6989a.q()) {
                iA = d11.a(z10);
            } else if (d11.b(obj) == -1) {
                int iW0 = W0(cVar, bVar, i10, z10, obj, c0986a1.f6989a, d11);
                d11 = d11;
                if (iW0 == -1) {
                    iW0 = d11.a(z10);
                    z14 = true;
                } else {
                    z14 = false;
                }
                iA = iW0;
                obj = obj;
                bVar2 = bVar;
                i11 = -1;
                z12 = z14;
                z11 = false;
                z13 = false;
                jP = j11;
            } else if (j11 == -9223372036854775807L) {
                iA = d11.h(obj, bVar).f1452c;
                obj = obj;
            } else if (zK0) {
                c0986a1.f6989a.h(bVar3.f20522a, bVar);
                if (c0986a1.f6989a.n(bVar.f1452c, cVar).f1486n == c0986a1.f6989a.b(bVar3.f20522a)) {
                    bVar2 = bVar;
                    Pair pairJ = d11.j(cVar, bVar2, d11.h(obj, bVar).f1452c, bVar.n() + j11);
                    obj = pairJ.first;
                    i11 = -1;
                    jP = ((Long) pairJ.second).longValue();
                } else {
                    bVar2 = bVar;
                    if (d11.h(obj, bVar2).f1453d != -9223372036854775807L) {
                        i11 = -1;
                        jP = G1.M.p(j11, 0L, bVar2.f1453d - 1);
                        obj = obj;
                    } else {
                        i11 = -1;
                        obj = obj;
                        jP = j11;
                    }
                }
                iA = i11;
                z11 = false;
                z12 = false;
                z13 = true;
            } else {
                bVar2 = bVar;
                i11 = -1;
                obj = obj;
                iA = -1;
                jP = j11;
                z11 = false;
                z12 = false;
                z13 = false;
            }
            bVar2 = bVar;
            i11 = -1;
            z11 = false;
            z12 = false;
            z13 = false;
            jP = j11;
        }
        if (iA != i11) {
            Pair pairJ2 = d11.j(cVar, bVar2, iA, -9223372036854775807L);
            obj = pairJ2.first;
            jG = ((Long) pairJ2.second).longValue();
            j10 = -9223372036854775807L;
        } else {
            jG = jP;
            j10 = jG;
        }
        InterfaceC2611D.b bVarQ = k02.Q(d11, obj, jG);
        int i13 = bVarQ.f20526e;
        boolean z19 = i13 == i11 || ((i12 = bVar3.f20526e) != i11 && i13 >= i12);
        if (bVar3.f20522a.equals(obj) && !bVar3.b() && !bVarQ.b() && z19) {
            z18 = true;
        }
        InterfaceC2611D.b bVar4 = bVarQ;
        boolean zG0 = g0(zK0, bVar3, j11, bVar4, d11.h(obj, bVar2), j10);
        if (z18 || zG0) {
            bVar4 = bVar3;
        }
        if (bVar4.b()) {
            if (bVar4.equals(bVar3)) {
                jG = c0986a1.f7007s;
            } else {
                d11.h(bVar4.f20522a, bVar2);
                jG = bVar4.f20524c == bVar2.k(bVar4.f20523b) ? bVar2.g() : 0L;
            }
        }
        return new g(bVar4, jG, j10, z11, z12, z13);
    }

    public static Pair V0(D1.D d10, h hVar, boolean z10, int i10, boolean z11, D.c cVar, D.b bVar) {
        Pair pairJ;
        D1.D d11;
        int iW0;
        D1.D d12 = hVar.f6822a;
        if (d10.q()) {
            return null;
        }
        boolean zQ = d12.q();
        D1.D d13 = d12;
        if (zQ) {
            d13 = d10;
        }
        try {
            pairJ = d13.j(cVar, bVar, hVar.f6823b, hVar.f6824c);
            d11 = d13;
        } catch (IndexOutOfBoundsException unused) {
        }
        if (d10.equals(d11)) {
            return pairJ;
        }
        if (d10.b(pairJ.first) != -1) {
            return (d11.h(pairJ.first, bVar).f1455f && d11.n(bVar.f1452c, cVar).f1486n == d11.b(pairJ.first)) ? d10.j(cVar, bVar, d10.h(pairJ.first, bVar).f1452c, hVar.f6824c) : pairJ;
        }
        if (z10 && (iW0 = W0(cVar, bVar, i10, z11, pairJ.first, d11, d10)) != -1) {
            return d10.j(cVar, bVar, iW0, -9223372036854775807L);
        }
        return null;
    }

    public static int W0(D.c cVar, D.b bVar, int i10, boolean z10, Object obj, D1.D d10, D1.D d11) {
        D.b bVar2;
        Object obj2 = d10.n(d10.h(obj, bVar).f1452c, cVar).f1473a;
        int i11 = 0;
        for (int i12 = 0; i12 < d11.p(); i12++) {
            if (d11.n(i12, cVar).f1473a.equals(obj2)) {
                return i12;
            }
        }
        int iB = d10.b(obj);
        int i13 = d10.i();
        int iD = iB;
        int iB2 = -1;
        while (i11 < i13 && iB2 == -1) {
            D.c cVar2 = cVar;
            bVar2 = bVar;
            int i14 = i10;
            boolean z11 = z10;
            D1.D d12 = d10;
            iD = d12.d(iD, bVar2, cVar2, i14, z11);
            if (iD == -1) {
                break;
            }
            iB2 = d11.b(d12.m(iD));
            i11++;
            d10 = d12;
            bVar = bVar2;
            cVar = cVar2;
            i10 = i14;
            z10 = z11;
        }
        bVar2 = bVar;
        if (iB2 == -1) {
            return -1;
        }
        return d11.f(iB2, bVar2).f1452c;
    }

    public static int W1(int i10, int i11) {
        if (i10 == -1) {
            return 2;
        }
        if (i11 == 2) {
            return 1;
        }
        return i11;
    }

    public static int c2(int i10, int i11) {
        if (i10 == 0) {
            return 1;
        }
        if (i11 == 1) {
            return 0;
        }
        return i11;
    }

    public static boolean g0(boolean z10, InterfaceC2611D.b bVar, long j10, InterfaceC2611D.b bVar2, D.b bVar3, long j11) {
        if (!z10 && j10 == j11 && bVar.f20522a.equals(bVar2.f20522a)) {
            if (bVar.b() && bVar3.r(bVar.f20523b)) {
                return (bVar3.h(bVar.f20523b, bVar.f20524c) == 4 || bVar3.h(bVar.f20523b, bVar.f20524c) == 2) ? false : true;
            }
            if (bVar2.b() && bVar3.r(bVar2.f20523b)) {
                return true;
            }
        }
        return false;
    }

    public static boolean k0(C0986a1 c0986a1, D.b bVar) {
        InterfaceC2611D.b bVar2 = c0986a1.f6990b;
        D1.D d10 = c0986a1.f6989a;
        return d10.q() || d10.h(bVar2.f20522a, bVar).f1455f;
    }

    public static /* synthetic */ void l(A0 a02, g2.r rVar, long j10, long j11, D1.o oVar, MediaFormat mediaFormat) {
        a02.getClass();
        rVar.e(j10, j11, oVar, mediaFormat);
        a02.e(j10, j11, oVar, mediaFormat);
    }

    public static /* synthetic */ void m(A0 a02, c1 c1Var) {
        a02.getClass();
        try {
            a02.z(c1Var);
        } catch (C1030x e10) {
            G1.t.d("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e10);
            throw new RuntimeException(e10);
        }
    }

    public final void A() {
        if (this.f6741A && w()) {
            for (h1 h1Var : this.f6761a) {
                int iH = h1Var.h();
                h1Var.c(this.f6779o);
                this.f6774l0 -= iH - h1Var.h();
            }
            this.f6796w0 = -9223372036854775807L;
        }
    }

    public final void A0() throws Throwable {
        Z(this.f6789t.i(), true);
    }

    public final void A1(k1 k1Var) {
        this.f6743C = k1Var;
    }

    public final void B(int i10) {
        int iH = this.f6761a[i10].h();
        this.f6761a[i10].b(this.f6779o);
        r0(i10, false);
        this.f6774l0 -= iH;
    }

    public final void B0(c cVar) {
        this.f6750J.b(1);
        throw null;
    }

    public final void B1(boolean z10) throws C1030x {
        this.f6758X = z10;
        int iY = this.f6787s.Y(this.f6749I.f6989a, z10);
        if ((iY & 1) != 0) {
            Z0(true);
        } else if ((iY & 2) != 0) {
            A();
        }
        X(false);
    }

    public final void C() {
        for (int i10 = 0; i10 < this.f6761a.length; i10++) {
            B(i10);
        }
        this.f6796w0 = -9223372036854775807L;
    }

    public final void C0() {
        for (H0 h0U = this.f6787s.u(); h0U != null; h0U = h0U.k()) {
            for (d2.r rVar : h0U.p().f32981c) {
                if (rVar != null) {
                    rVar.k();
                }
            }
        }
    }

    public final void C1(a2.e0 e0Var) throws Throwable {
        this.f6750J.b(1);
        Z(this.f6789t.C(e0Var), false);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x012b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void D() throws K1.C1030x {
        /*
            Method dump skipped, instruction units count: 461
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: K1.A0.D():void");
    }

    public final void D0(boolean z10) {
        for (H0 h0U = this.f6787s.u(); h0U != null; h0U = h0U.k()) {
            for (d2.r rVar : h0U.p().f32981c) {
                if (rVar != null) {
                    rVar.o(z10);
                }
            }
        }
    }

    public final void D1(int i10) {
        C0986a1 c0986a1 = this.f6749I;
        if (c0986a1.f6993e != i10) {
            if (i10 != 2) {
                this.f6790t0 = -9223372036854775807L;
            }
            if (i10 != 3 && c0986a1.f7004p) {
                this.f6749I = c0986a1.i(false);
            }
            this.f6749I = this.f6749I.h(i10);
        }
    }

    public final void E(H0 h02, int i10, boolean z10, long j10) throws C1030x {
        h1 h1Var = this.f6761a[i10];
        if (h1Var.y()) {
            return;
        }
        boolean z11 = h02 == this.f6787s.u();
        d2.y yVarP = h02.p();
        g1 g1Var = yVarP.f32980b[i10];
        d2.r rVar = yVarP.f32981c[i10];
        boolean z12 = L1() && this.f6749I.f6993e == 3;
        boolean z13 = !z10 && z12;
        this.f6774l0++;
        h1Var.e(g1Var, rVar, h02.f6858c[i10], this.f6778n0, z13, z11, j10, h02.m(), h02.f6863h.f6874a, this.f6779o);
        h1Var.n(11, new a(), h02);
        if (z12 && z11) {
            h1Var.W();
        }
    }

    public final void E0() {
        for (H0 h0U = this.f6787s.u(); h0U != null; h0U = h0U.k()) {
            for (d2.r rVar : h0U.p().f32981c) {
                if (rVar != null) {
                    rVar.u();
                }
            }
        }
    }

    public final void E1(g2.r rVar) {
        for (h1 h1Var : this.f6761a) {
            h1Var.T(rVar);
        }
    }

    public final void F() throws C1030x {
        G(new boolean[this.f6761a.length], this.f6787s.y().n());
    }

    @Override // a2.d0.a
    /* JADX INFO: renamed from: F0, reason: merged with bridge method [inline-methods] */
    public void f(InterfaceC2610C interfaceC2610C) {
        this.f6768h.e(9, interfaceC2610C).a();
    }

    public boolean F1(Object obj, long j10) {
        if (!this.f6751P && this.f6770j.getThread().isAlive()) {
            C0863k c0863k = new C0863k(this.f6783q);
            this.f6768h.e(30, new Pair(obj, c0863k)).a();
            if (j10 != -9223372036854775807L) {
                return c0863k.c(j10);
            }
        }
        return true;
    }

    public final void G(boolean[] zArr, long j10) throws C1030x {
        A0 a02;
        long j11;
        H0 h0Y = this.f6787s.y();
        d2.y yVarP = h0Y.p();
        for (int i10 = 0; i10 < this.f6761a.length; i10++) {
            if (!yVarP.c(i10)) {
                this.f6761a[i10].L();
            }
        }
        int i11 = 0;
        while (i11 < this.f6761a.length) {
            if (!yVarP.c(i11) || this.f6761a[i11].x(h0Y)) {
                a02 = this;
                j11 = j10;
            } else {
                a02 = this;
                j11 = j10;
                a02.E(h0Y, i11, zArr[i11], j11);
            }
            i11++;
            this = a02;
            j10 = j11;
        }
    }

    public void G0() {
        this.f6768h.a(29).a();
    }

    public final void G1(Object obj, C0863k c0863k) {
        for (h1 h1Var : this.f6761a) {
            h1Var.U(obj);
        }
        int i10 = this.f6749I.f6993e;
        if (i10 == 3 || i10 == 2) {
            this.f6768h.j(2);
        }
        if (c0863k != null) {
            c0863k.f();
        }
    }

    public void H(long j10) {
        this.f6788s0 = j10;
    }

    public final void H0() {
        this.f6750J.b(1);
        O0(false, false, false, true);
        this.f6766f.a(this.f6795w);
        D1(this.f6749I.f6989a.q() ? 4 : 2);
        X1();
        this.f6789t.v(this.f6767g.e());
        this.f6768h.j(2);
    }

    public void H1(float f10) {
        this.f6768h.e(32, Float.valueOf(f10)).a();
    }

    public final AbstractC1081v I(d2.r[] rVarArr) {
        AbstractC1081v.a aVar = new AbstractC1081v.a();
        boolean z10 = false;
        for (d2.r rVar : rVarArr) {
            if (rVar != null) {
                D1.u uVar = rVar.e(0).f1802l;
                if (uVar == null) {
                    aVar.a(new D1.u(new u.a[0]));
                } else {
                    aVar.a(uVar);
                    z10 = true;
                }
            }
        }
        return z10 ? aVar.k() : AbstractC1081v.z();
    }

    public boolean I0() {
        if (this.f6751P || !this.f6770j.getThread().isAlive()) {
            return true;
        }
        this.f6751P = true;
        C0863k c0863k = new C0863k(this.f6783q);
        this.f6768h.e(7, c0863k).a();
        return c0863k.c(this.f6793v);
    }

    public final void I1(float f10) {
        this.f6800y0 = f10;
        float f11 = f10 * this.f6742B.f();
        for (h1 h1Var : this.f6761a) {
            h1Var.V(f11);
        }
    }

    public final long J() {
        C0986a1 c0986a1 = this.f6749I;
        return L(c0986a1.f6989a, c0986a1.f6990b.f20522a, c0986a1.f7007s);
    }

    public final void J0(C0863k c0863k) {
        try {
            O0(true, false, true, false);
            K0();
            this.f6766f.j(this.f6795w);
            this.f6742B.h();
            this.f6764d.i();
            D1(1);
        } finally {
            this.f6768h.f(null);
            this.f6769i.b();
            c0863k.f();
        }
    }

    public final boolean J1() {
        H0 h0U;
        H0 h0K;
        return L1() && !this.f6753R && (h0U = this.f6787s.u()) != null && (h0K = h0U.k()) != null && this.f6778n0 >= h0K.n() && h0K.f6864i;
    }

    public final long K() {
        long jMin = this.f6749I.f6993e == 3 ? 1000L : f6740z0;
        for (h1 h1Var : this.f6761a) {
            jMin = Math.min(jMin, G1.M.o1(h1Var.j(this.f6778n0, this.f6780o0)));
        }
        if (!this.f6749I.n()) {
            return jMin;
        }
        H0 h0K = this.f6787s.u() != null ? this.f6787s.u().k() : null;
        return (h0K == null || ((float) this.f6778n0) + (((float) G1.M.M0(jMin)) * this.f6749I.f7003o.f2119a) < ((float) h0K.n())) ? jMin : Math.min(jMin, f6740z0);
    }

    public final void K0() {
        for (int i10 = 0; i10 < this.f6761a.length; i10++) {
            this.f6762b[i10].i();
            this.f6761a[i10].H();
        }
    }

    public final boolean K1() {
        if (!h0(this.f6787s.n())) {
            return false;
        }
        H0 h0N = this.f6787s.n();
        long jS = S(h0N.l());
        E0.a aVar = new E0.a(this.f6795w, this.f6749I.f6989a, h0N.f6863h.f6874a, h0N == this.f6787s.u() ? h0N.C(this.f6778n0) : h0N.C(this.f6778n0) - h0N.f6863h.f6875b, jS, this.f6779o.e().f2119a, this.f6749I.f7000l, this.f6754S, N1(this.f6749I.f6989a, h0N.f6863h.f6874a) ? this.f6791u.b() : -9223372036854775807L, this.f6755T);
        boolean zD = this.f6766f.d(aVar);
        H0 h0U = this.f6787s.u();
        if (zD || !h0U.f6861f || jS >= 500000 || (this.f6775m <= 0 && !this.f6777n)) {
            return zD;
        }
        h0U.f6856a.u(this.f6749I.f7007s, false);
        return this.f6766f.d(aVar);
    }

    public final long L(D1.D d10, Object obj, long j10) {
        d10.n(d10.h(obj, this.f6773l).f1452c, this.f6771k);
        D.c cVar = this.f6771k;
        if (cVar.f1478f != -9223372036854775807L && cVar.f()) {
            D.c cVar2 = this.f6771k;
            if (cVar2.f1481i) {
                return G1.M.M0(cVar2.a() - this.f6771k.f1478f) - (j10 + this.f6773l.n());
            }
        }
        return -9223372036854775807L;
    }

    public final void L0(int i10, int i11, a2.e0 e0Var) throws Throwable {
        this.f6750J.b(1);
        Z(this.f6789t.z(i10, i11, e0Var), false);
    }

    public final boolean L1() {
        C0986a1 c0986a1 = this.f6749I;
        return c0986a1.f7000l && c0986a1.f7002n == 0;
    }

    public final long M(H0 h02) {
        if (h02 == null) {
            return 0L;
        }
        long jM = h02.m();
        if (!h02.f6861f) {
            return jM;
        }
        int i10 = 0;
        while (true) {
            h1[] h1VarArr = this.f6761a;
            if (i10 >= h1VarArr.length) {
                return jM;
            }
            if (h1VarArr[i10].x(h02)) {
                long jK = this.f6761a[i10].k(h02);
                if (jK == Long.MIN_VALUE) {
                    return Long.MIN_VALUE;
                }
                jM = Math.max(jK, jM);
            }
            i10++;
        }
    }

    public final void M0() throws C1030x {
        float f10 = this.f6779o.e().f2119a;
        H0 h0Y = this.f6787s.y();
        d2.y yVar = null;
        boolean z10 = true;
        for (H0 h0U = this.f6787s.u(); h0U != null && h0U.f6861f; h0U = h0U.k()) {
            C0986a1 c0986a1 = this.f6749I;
            d2.y yVarZ = h0U.z(f10, c0986a1.f6989a, c0986a1.f7000l);
            if (h0U == this.f6787s.u()) {
                yVar = yVarZ;
            }
            if (!yVarZ.a(h0U.p())) {
                if (z10) {
                    H0 h0U2 = this.f6787s.u();
                    boolean z11 = (this.f6787s.N(h0U2) & 1) != 0;
                    boolean[] zArr = new boolean[this.f6761a.length];
                    long jB = h0U2.b((d2.y) AbstractC0853a.e(yVar), this.f6749I.f7007s, z11, zArr);
                    C0986a1 c0986a12 = this.f6749I;
                    boolean z12 = (c0986a12.f6993e == 4 || jB == c0986a12.f7007s) ? false : true;
                    C0986a1 c0986a13 = this.f6749I;
                    this.f6749I = d0(c0986a13.f6990b, jB, c0986a13.f6991c, c0986a13.f6992d, z12, 5);
                    if (z12) {
                        Q0(jB);
                    }
                    A();
                    boolean[] zArr2 = new boolean[this.f6761a.length];
                    int i10 = 0;
                    while (true) {
                        h1[] h1VarArr = this.f6761a;
                        if (i10 >= h1VarArr.length) {
                            break;
                        }
                        int iH = h1VarArr[i10].h();
                        zArr2[i10] = this.f6761a[i10].y();
                        this.f6761a[i10].B(h0U2.f6858c[i10], this.f6779o, this.f6778n0, zArr[i10]);
                        if (iH - this.f6761a[i10].h() > 0) {
                            r0(i10, false);
                        }
                        this.f6774l0 -= iH - this.f6761a[i10].h();
                        i10++;
                    }
                    G(zArr2, this.f6778n0);
                    h0U2.f6864i = true;
                } else {
                    this.f6787s.N(h0U);
                    if (h0U.f6861f) {
                        long jMax = Math.max(h0U.f6863h.f6875b, h0U.C(this.f6778n0));
                        if (this.f6741A && w() && this.f6787s.x() == h0U) {
                            A();
                        }
                        h0U.a(yVarZ, jMax, false);
                    }
                }
                X(true);
                if (this.f6749I.f6993e != 4) {
                    l0();
                    a2();
                    this.f6768h.j(2);
                    return;
                }
                return;
            }
            if (h0U == h0Y) {
                z10 = false;
            }
        }
    }

    public final boolean M1(boolean z10) {
        if (this.f6774l0 == 0) {
            return j0();
        }
        boolean z11 = false;
        if (!z10) {
            return false;
        }
        if (!this.f6749I.f6995g) {
            return true;
        }
        H0 h0U = this.f6787s.u();
        long jB = N1(this.f6749I.f6989a, h0U.f6863h.f6874a) ? this.f6791u.b() : -9223372036854775807L;
        H0 h0N = this.f6787s.n();
        boolean z12 = h0N.s() && h0N.f6863h.f6883j;
        if (h0N.f6863h.f6874a.b() && !h0N.f6861f) {
            z11 = true;
        }
        if (z12 || z11) {
            return true;
        }
        return this.f6766f.i(new E0.a(this.f6795w, this.f6749I.f6989a, h0U.f6863h.f6874a, h0U.C(this.f6778n0), S(h0N.j()), this.f6779o.e().f2119a, this.f6749I.f7000l, this.f6754S, jB, this.f6755T));
    }

    public final Pair N(D1.D d10) {
        if (d10.q()) {
            return Pair.create(C0986a1.l(), 0L);
        }
        Pair pairJ = d10.j(this.f6771k, this.f6773l, d10.a(this.f6758X), -9223372036854775807L);
        InterfaceC2611D.b bVarQ = this.f6787s.Q(d10, pairJ.first, 0L);
        long jLongValue = ((Long) pairJ.second).longValue();
        if (bVarQ.b()) {
            d10.h(bVarQ.f20522a, this.f6773l);
            jLongValue = bVarQ.f20524c == this.f6773l.k(bVarQ.f20523b) ? this.f6773l.g() : 0L;
        }
        return Pair.create(bVarQ, Long.valueOf(jLongValue));
    }

    public final void N0() throws C1030x {
        M0();
        Z0(true);
    }

    public final boolean N1(D1.D d10, InterfaceC2611D.b bVar) {
        if (!bVar.b() && !d10.q()) {
            d10.n(d10.h(bVar.f20522a, this.f6773l).f1452c, this.f6771k);
            if (this.f6771k.f()) {
                D.c cVar = this.f6771k;
                if (cVar.f1481i && cVar.f1478f != -9223372036854775807L) {
                    return true;
                }
            }
        }
        return false;
    }

    public Looper O() {
        return this.f6770j;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0093 A[PHI: r2 r6 r8
      0x0093: PHI (r2v2 a2.D$b) = (r2v1 a2.D$b), (r2v12 a2.D$b) binds: [B:23:0x0069, B:25:0x008e] A[DONT_GENERATE, DONT_INLINE]
      0x0093: PHI (r6v3 long) = (r6v2 long), (r6v10 long) binds: [B:23:0x0069, B:25:0x008e] A[DONT_GENERATE, DONT_INLINE]
      0x0093: PHI (r8v2 long) = (r8v1 long), (r8v7 long) binds: [B:23:0x0069, B:25:0x008e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00da A[PHI: r0
      0x00da: PHI (r0v11 D1.D) = (r0v10 D1.D), (r0v10 D1.D), (r0v21 D1.D), (r0v21 D1.D) binds: [B:29:0x00a0, B:31:0x00a4, B:33:0x00b5, B:35:0x00cc] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void O0(boolean r34, boolean r35, boolean r36, boolean r37) {
        /*
            Method dump skipped, instruction units count: 314
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: K1.A0.O0(boolean, boolean, boolean, boolean):void");
    }

    public final void O1() {
        H0 h0U = this.f6787s.u();
        if (h0U == null) {
            return;
        }
        d2.y yVarP = h0U.p();
        for (int i10 = 0; i10 < this.f6761a.length; i10++) {
            if (yVarP.c(i10)) {
                this.f6761a[i10].W();
            }
        }
    }

    public final k1 P(long j10) {
        j1 j1Var;
        Double d10;
        if (!this.f6746F || j10 == -9223372036854775807L || (d10 = (j1Var = this.f6744D).f7193b) == null || j1Var.f7194c == null) {
            return this.f6743C;
        }
        double d11 = j10;
        double dDoubleValue = d10.doubleValue() * d11;
        RoundingMode roundingMode = RoundingMode.FLOOR;
        long jF = M7.b.f(dDoubleValue, roundingMode);
        long jF2 = M7.b.f(this.f6744D.f7194c.doubleValue() * d11, roundingMode);
        k1 k1Var = this.f6745E;
        if (k1Var == null || k1Var.f7221a != jF || k1Var.f7222b != jF2) {
            this.f6745E = new k1(jF, jF2);
        }
        return this.f6745E;
    }

    public final void P0() {
        H0 h0U = this.f6787s.u();
        this.f6753R = h0U != null && h0U.f6863h.f6882i && this.f6752Q;
    }

    public void P1() {
        this.f6768h.a(6).a();
    }

    public final long Q() {
        if (this.f6749I.f6993e != 3 || L1()) {
            return f6740z0;
        }
        return 1000L;
    }

    public final void Q0(long j10) {
        H0 h0U = this.f6787s.u();
        long jD = h0U == null ? j10 + 1000000000000L : h0U.D(j10);
        this.f6778n0 = jD;
        this.f6779o.c(jD);
        for (h1 h1Var : this.f6761a) {
            h1Var.M(h0U, this.f6778n0);
        }
        C0();
    }

    public final void Q1(boolean z10, boolean z11) {
        O0(z10 || !this.f6759Y, false, true, false);
        this.f6750J.b(z11 ? 1 : 0);
        this.f6766f.e(this.f6795w);
        this.f6742B.n(this.f6749I.f7000l, 1);
        D1(1);
    }

    public final long R() {
        return S(this.f6749I.f7005q);
    }

    public final void R1() {
        this.f6779o.h();
        for (h1 h1Var : this.f6761a) {
            h1Var.Y();
        }
    }

    public final long S(long j10) {
        H0 h0N = this.f6787s.n();
        if (h0N == null) {
            return 0L;
        }
        return Math.max(0L, j10 - h0N.C(this.f6778n0));
    }

    public final void S1() {
        H0 h0N = this.f6787s.n();
        boolean z10 = this.f6756V || (h0N != null && h0N.f6856a.d());
        C0986a1 c0986a1 = this.f6749I;
        if (z10 != c0986a1.f6995g) {
            this.f6749I = c0986a1.b(z10);
        }
    }

    public final void T(int i10) {
        C0986a1 c0986a1 = this.f6749I;
        Z1(c0986a1.f7000l, i10, c0986a1.f7002n, c0986a1.f7001m);
    }

    public final void T0(D1.D d10, D1.D d11) {
        if (d10.q() && d11.q()) {
            return;
        }
        int size = this.f6781p.size() - 1;
        while (size >= 0) {
            D1.D d12 = d10;
            D1.D d13 = d11;
            if (!S0((d) this.f6781p.get(size), d12, d13, this.f6757W, this.f6758X, this.f6771k, this.f6773l)) {
                ((d) this.f6781p.get(size)).f6807a.j(false);
                this.f6781p.remove(size);
            }
            size--;
            d10 = d12;
            d11 = d13;
        }
        Collections.sort(this.f6781p);
    }

    public final void T1(InterfaceC2611D.b bVar, a2.n0 n0Var, d2.y yVar) {
        H0 h02 = (H0) AbstractC0853a.e(this.f6787s.n());
        this.f6766f.h(new E0.a(this.f6795w, this.f6749I.f6989a, bVar, h02 == this.f6787s.u() ? h02.C(this.f6778n0) : h02.C(this.f6778n0) - h02.f6863h.f6875b, S(h02.j()), this.f6779o.e().f2119a, this.f6749I.f7000l, this.f6754S, N1(this.f6749I.f6989a, h02.f6863h.f6874a) ? this.f6791u.b() : -9223372036854775807L, this.f6755T), n0Var, yVar.f32981c);
    }

    public final void U() {
        I1(this.f6800y0);
    }

    public final void U1(int i10, int i11, List list) throws Throwable {
        this.f6750J.b(1);
        Z(this.f6789t.D(i10, i11, list), false);
    }

    public final void V(InterfaceC2610C interfaceC2610C) {
        if (this.f6787s.F(interfaceC2610C)) {
            this.f6787s.K(this.f6778n0);
            l0();
        } else if (this.f6787s.G(interfaceC2610C)) {
            m0();
        }
    }

    public final void V1() throws C1030x {
        if (this.f6749I.f6989a.q() || !this.f6789t.t()) {
            return;
        }
        boolean zT0 = t0();
        x0();
        y0();
        z0();
        v0();
        w0(zT0);
    }

    public final void W(IOException iOException, int i10) {
        C1030x c1030xC = C1030x.c(iOException, i10);
        H0 h0U = this.f6787s.u();
        if (h0U != null) {
            c1030xC = c1030xC.a(h0U.f6863h.f6874a);
        }
        G1.t.d("ExoPlayerImplInternal", "Playback error", c1030xC);
        Q1(false, false);
        this.f6749I = this.f6749I.f(c1030xC);
    }

    public final void X(boolean z10) {
        H0 h0N = this.f6787s.n();
        InterfaceC2611D.b bVar = h0N == null ? this.f6749I.f6990b : h0N.f6863h.f6874a;
        boolean zEquals = this.f6749I.f6999k.equals(bVar);
        if (!zEquals) {
            this.f6749I = this.f6749I.c(bVar);
        }
        C0986a1 c0986a1 = this.f6749I;
        c0986a1.f7005q = h0N == null ? c0986a1.f7007s : h0N.j();
        this.f6749I.f7006r = R();
        if ((!zEquals || z10) && h0N != null && h0N.f6861f) {
            T1(h0N.f6863h.f6874a, h0N.o(), h0N.p());
        }
    }

    public final void X0(long j10) {
        this.f6768h.k(2, j10 + (f0() ? K() : Q()));
    }

    public final void X1() {
        C0986a1 c0986a1 = this.f6749I;
        Y1(c0986a1.f7000l, c0986a1.f7002n, c0986a1.f7001m);
    }

    public final void Y(H0 h02) throws C1030x {
        A0 a02;
        if (!h02.f6861f) {
            float f10 = this.f6779o.e().f2119a;
            C0986a1 c0986a1 = this.f6749I;
            h02.q(f10, c0986a1.f6989a, c0986a1.f7000l);
        }
        T1(h02.f6863h.f6874a, h02.o(), h02.p());
        if (h02 == this.f6787s.u()) {
            Q0(h02.f6863h.f6875b);
            F();
            h02.f6864i = true;
            C0986a1 c0986a12 = this.f6749I;
            InterfaceC2611D.b bVar = c0986a12.f6990b;
            long j10 = h02.f6863h.f6875b;
            a02 = this;
            a02.f6749I = a02.d0(bVar, j10, c0986a12.f6991c, j10, false, 5);
        } else {
            a02 = this;
        }
        a02.l0();
    }

    public void Y0(D1.D d10, int i10, long j10) {
        this.f6768h.e(3, new h(d10, i10, j10)).a();
    }

    public final void Y1(boolean z10, int i10, int i11) {
        Z1(z10, this.f6742B.n(z10, this.f6749I.f6993e), i10, i11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01c6  */
    /* JADX WARN: Type inference failed for: r12v0, types: [long] */
    /* JADX WARN: Type inference failed for: r12v14 */
    /* JADX WARN: Type inference failed for: r12v15 */
    /* JADX WARN: Type inference failed for: r12v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r21v0 */
    /* JADX WARN: Type inference failed for: r21v1, types: [long] */
    /* JADX WARN: Type inference failed for: r21v10 */
    /* JADX WARN: Type inference failed for: r21v11 */
    /* JADX WARN: Type inference failed for: r21v12 */
    /* JADX WARN: Type inference failed for: r21v13 */
    /* JADX WARN: Type inference failed for: r21v14 */
    /* JADX WARN: Type inference failed for: r21v15 */
    /* JADX WARN: Type inference failed for: r21v16 */
    /* JADX WARN: Type inference failed for: r21v2 */
    /* JADX WARN: Type inference failed for: r21v3 */
    /* JADX WARN: Type inference failed for: r21v4 */
    /* JADX WARN: Type inference failed for: r21v5 */
    /* JADX WARN: Type inference failed for: r21v6, types: [long] */
    /* JADX WARN: Type inference failed for: r21v7 */
    /* JADX WARN: Type inference failed for: r21v8 */
    /* JADX WARN: Type inference failed for: r21v9 */
    /* JADX WARN: Type inference failed for: r28v0, types: [K1.A0] */
    /* JADX WARN: Type inference failed for: r5v3, types: [long] */
    /* JADX WARN: Type inference failed for: r5v7, types: [long] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void Z(D1.D r29, boolean r30) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 569
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: K1.A0.Z(D1.D, boolean):void");
    }

    public final void Z0(boolean z10) throws C1030x {
        InterfaceC2611D.b bVar = this.f6787s.u().f6863h.f6874a;
        long jC1 = c1(bVar, this.f6749I.f7007s, true, false);
        if (jC1 != this.f6749I.f7007s) {
            C0986a1 c0986a1 = this.f6749I;
            this.f6749I = d0(bVar, jC1, c0986a1.f6991c, c0986a1.f6992d, z10, 5);
        }
    }

    public final void Z1(boolean z10, int i10, int i11, int i12) {
        boolean z11 = z10 && i10 != -1;
        int iW1 = W1(i10, i12);
        int iC2 = c2(i10, i11);
        C0986a1 c0986a1 = this.f6749I;
        if (c0986a1.f7000l == z11 && c0986a1.f7002n == iC2 && c0986a1.f7001m == iW1) {
            return;
        }
        this.f6749I = c0986a1.e(z11, iW1, iC2);
        d2(false, false);
        D0(z11);
        if (!L1()) {
            R1();
            a2();
            C0986a1 c0986a12 = this.f6749I;
            if (c0986a12.f7004p) {
                this.f6749I = c0986a12.i(false);
            }
            this.f6787s.K(this.f6778n0);
            return;
        }
        int i13 = this.f6749I.f6993e;
        if (i13 == 3) {
            this.f6779o.g();
            O1();
            this.f6768h.j(2);
        } else if (i13 == 2) {
            this.f6768h.j(2);
        }
    }

    @Override // d2.x.a
    public void a(e1 e1Var) {
        this.f6768h.j(26);
    }

    public final void a0(InterfaceC2610C interfaceC2610C) throws C1030x {
        if (this.f6787s.F(interfaceC2610C)) {
            Y((H0) AbstractC0853a.e(this.f6787s.n()));
            return;
        }
        H0 h0V = this.f6787s.v(interfaceC2610C);
        if (h0V != null) {
            AbstractC0853a.g(!h0V.f6861f);
            float f10 = this.f6779o.e().f2119a;
            C0986a1 c0986a1 = this.f6749I;
            h0V.q(f10, c0986a1.f6989a, c0986a1.f7000l);
            if (this.f6787s.G(interfaceC2610C)) {
                m0();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00aa A[Catch: all -> 0x00ad, TryCatch #2 {all -> 0x00ad, blocks: (B:26:0x00a0, B:28:0x00aa, B:33:0x00b5, B:35:0x00bb, B:36:0x00be, B:38:0x00c5, B:40:0x00cf, B:42:0x00d7, B:46:0x00df, B:48:0x00ef, B:65:0x0122, B:69:0x012f), top: B:90:0x00a0 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a1(K1.A0.h r18, boolean r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 352
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: K1.A0.a1(K1.A0$h, boolean):void");
    }

    public final void a2() {
        H0 h0U = this.f6787s.u();
        if (h0U == null) {
            return;
        }
        long jK = h0U.f6861f ? h0U.f6856a.k() : -9223372036854775807L;
        if (jK != -9223372036854775807L) {
            if (!h0U.s()) {
                this.f6787s.N(h0U);
                X(false);
                l0();
            }
            Q0(jK);
            if (jK != this.f6749I.f7007s) {
                C0986a1 c0986a1 = this.f6749I;
                long j10 = jK;
                this.f6749I = d0(c0986a1.f6990b, j10, c0986a1.f6991c, j10, true, 5);
            }
        } else {
            long jI = this.f6779o.i(h0U != this.f6787s.y());
            this.f6778n0 = jI;
            long jC = h0U.C(jI);
            s0(this.f6749I.f7007s, jC);
            if (this.f6779o.v()) {
                boolean z10 = !this.f6750J.f6814d;
                C0986a1 c0986a12 = this.f6749I;
                this.f6749I = d0(c0986a12.f6990b, jC, c0986a12.f6991c, jC, z10, 6);
            } else {
                this.f6749I.o(jC);
            }
        }
        this.f6749I.f7005q = this.f6787s.n().j();
        this.f6749I.f7006r = R();
        C0986a1 c0986a13 = this.f6749I;
        if (c0986a13.f7000l && c0986a13.f6993e == 3 && N1(c0986a13.f6989a, c0986a13.f6990b) && this.f6749I.f7003o.f2119a == 1.0f) {
            float fA = this.f6791u.a(J(), this.f6749I.f7006r);
            if (this.f6779o.e().f2119a != fA) {
                k1(this.f6749I.f7003o.b(fA));
                b0(this.f6749I.f7003o, this.f6779o.e().f2119a, false, false);
            }
        }
    }

    @Override // d2.x.a
    public void b() {
        this.f6768h.j(10);
    }

    public final void b0(D1.y yVar, float f10, boolean z10, boolean z11) {
        if (z10) {
            if (z11) {
                this.f6750J.b(1);
            }
            this.f6749I = this.f6749I.g(yVar);
        }
        f2(yVar.f2119a);
        for (h1 h1Var : this.f6761a) {
            h1Var.Q(f10, yVar.f2119a);
        }
    }

    public final long b1(InterfaceC2611D.b bVar, long j10, boolean z10) {
        return c1(bVar, j10, this.f6787s.u() != this.f6787s.y(), z10);
    }

    public final void b2(D1.D d10, InterfaceC2611D.b bVar, D1.D d11, InterfaceC2611D.b bVar2, long j10, boolean z10) {
        if (!N1(d10, bVar)) {
            D1.y yVar = bVar.b() ? D1.y.f2116d : this.f6749I.f7003o;
            if (this.f6779o.e().equals(yVar)) {
                return;
            }
            k1(yVar);
            b0(this.f6749I.f7003o, yVar.f2119a, false, false);
            return;
        }
        d10.n(d10.h(bVar.f20522a, this.f6773l).f1452c, this.f6771k);
        this.f6791u.d((r.g) G1.M.i(this.f6771k.f1482j));
        if (j10 != -9223372036854775807L) {
            this.f6791u.e(L(d10, bVar.f20522a, j10));
            return;
        }
        if (!Objects.equals(!d11.q() ? d11.n(d11.h(bVar2.f20522a, this.f6773l).f1452c, this.f6771k).f1473a : null, this.f6771k.f1473a) || z10) {
            this.f6791u.e(-9223372036854775807L);
        }
    }

    @Override // K1.Z0.d
    public void c() {
        this.f6768h.l(2);
        this.f6768h.j(22);
    }

    public final void c0(D1.y yVar, boolean z10) {
        b0(yVar, yVar.f2119a, true, z10);
    }

    public final long c1(InterfaceC2611D.b bVar, long j10, boolean z10, boolean z11) throws C1030x {
        R1();
        d2(false, true);
        if (z11 || this.f6749I.f6993e == 3) {
            D1(2);
        }
        H0 h0U = this.f6787s.u();
        H0 h0K = h0U;
        while (h0K != null && !bVar.equals(h0K.f6863h.f6874a)) {
            h0K = h0K.k();
        }
        if (z10 || h0U != h0K || (h0K != null && h0K.D(j10) < 0)) {
            C();
            if (h0K != null) {
                while (this.f6787s.u() != h0K) {
                    this.f6787s.b();
                }
                this.f6787s.N(h0K);
                h0K.B(1000000000000L);
                F();
                h0K.f6864i = true;
            }
        }
        A();
        if (h0K != null) {
            this.f6787s.N(h0K);
            if (!h0K.f6861f) {
                h0K.f6863h = h0K.f6863h.b(j10);
            } else if (h0K.f6862g) {
                j10 = h0K.f6856a.i(j10);
                h0K.f6856a.u(j10 - this.f6775m, this.f6777n);
            }
            Q0(j10);
            l0();
        } else {
            this.f6787s.g();
            Q0(j10);
        }
        X(false);
        this.f6768h.j(2);
        return j10;
    }

    @Override // K1.c1.a
    public void d(c1 c1Var) {
        if (!this.f6751P && this.f6770j.getThread().isAlive()) {
            this.f6768h.e(14, c1Var).a();
        } else {
            G1.t.h("ExoPlayerImplInternal", "Ignoring messages sent after release.");
            c1Var.j(false);
        }
    }

    public final C0986a1 d0(InterfaceC2611D.b bVar, long j10, long j11, long j12, boolean z10, int i10) {
        List list;
        a2.n0 n0Var;
        d2.y yVar;
        this.f6784q0 = (!this.f6784q0 && j10 == this.f6749I.f7007s && bVar.equals(this.f6749I.f6990b)) ? false : true;
        P0();
        C0986a1 c0986a1 = this.f6749I;
        a2.n0 n0Var2 = c0986a1.f6996h;
        d2.y yVar2 = c0986a1.f6997i;
        List listZ = c0986a1.f6998j;
        if (this.f6789t.t()) {
            H0 h0U = this.f6787s.u();
            a2.n0 n0VarO = h0U == null ? a2.n0.f20861d : h0U.o();
            d2.y yVarP = h0U == null ? this.f6765e : h0U.p();
            AbstractC1081v abstractC1081vI = I(yVarP.f32981c);
            if (h0U != null) {
                I0 i02 = h0U.f6863h;
                if (i02.f6876c != j11) {
                    h0U.f6863h = i02.a(j11);
                }
            }
            u0();
            n0Var = n0VarO;
            yVar = yVarP;
            list = abstractC1081vI;
        } else {
            if (!bVar.equals(this.f6749I.f6990b)) {
                n0Var2 = a2.n0.f20861d;
                yVar2 = this.f6765e;
                listZ = AbstractC1081v.z();
            }
            list = listZ;
            n0Var = n0Var2;
            yVar = yVar2;
        }
        if (z10) {
            this.f6750J.d(i10);
        }
        return this.f6749I.d(bVar, j10, j11, j12, R(), n0Var, yVar, list);
    }

    public final void d1(c1 c1Var) {
        if (c1Var.e() == -9223372036854775807L) {
            e1(c1Var);
            return;
        }
        if (this.f6749I.f6989a.q()) {
            this.f6781p.add(new d(c1Var));
            return;
        }
        d dVar = new d(c1Var);
        D1.D d10 = this.f6749I.f6989a;
        if (!S0(dVar, d10, d10, this.f6757W, this.f6758X, this.f6771k, this.f6773l)) {
            c1Var.j(false);
        } else {
            this.f6781p.add(dVar);
            Collections.sort(this.f6781p);
        }
    }

    public final void d2(boolean z10, boolean z11) {
        this.f6754S = z10;
        this.f6755T = (!z10 || z11) ? -9223372036854775807L : this.f6783q.c();
    }

    @Override // g2.r
    public void e(long j10, long j11, D1.o oVar, MediaFormat mediaFormat) {
        if (this.f6747G) {
            this.f6768h.a(37).a();
        }
    }

    public final boolean e0() {
        H0 h0Y = this.f6787s.y();
        if (!h0Y.f6861f) {
            return false;
        }
        int i10 = 0;
        while (true) {
            h1[] h1VarArr = this.f6761a;
            if (i10 >= h1VarArr.length) {
                return true;
            }
            if (!h1VarArr[i10].o(h0Y)) {
                return false;
            }
            i10++;
        }
    }

    public final void e1(c1 c1Var) {
        if (c1Var.b() != this.f6770j) {
            this.f6768h.e(15, c1Var).a();
            return;
        }
        z(c1Var);
        int i10 = this.f6749I.f6993e;
        if (i10 == 3 || i10 == 2) {
            this.f6768h.j(2);
        }
    }

    public final boolean e2() throws C1030x {
        A0 a02;
        H0 h0Y = this.f6787s.y();
        d2.y yVarP = h0Y.p();
        int i10 = 0;
        boolean z10 = true;
        int i11 = 0;
        while (true) {
            h1[] h1VarArr = this.f6761a;
            if (i11 >= h1VarArr.length) {
                break;
            }
            int iH = h1VarArr[i11].h();
            int iJ = this.f6761a[i11].J(h0Y, yVarP, this.f6779o);
            if ((iJ & 2) != 0 && this.f6772k0) {
                n1(false);
            }
            this.f6774l0 -= iH - this.f6761a[i11].h();
            z10 &= (iJ & 1) != 0;
            i11++;
        }
        if (z10) {
            while (i10 < this.f6761a.length) {
                if (!yVarP.c(i10) || this.f6761a[i10].x(h0Y)) {
                    a02 = this;
                } else {
                    a02 = this;
                    a02.E(h0Y, i10, false, h0Y.n());
                }
                i10++;
                this = a02;
            }
        }
        return z10;
    }

    public final boolean f0() {
        if (this.f6797x) {
            return true;
        }
        return this.f6746F && this.f6744D.f7198g;
    }

    public final void f1(final c1 c1Var) {
        Looper looperB = c1Var.b();
        if (looperB.getThread().isAlive()) {
            this.f6783q.e(looperB, null).i(new Runnable() { // from class: K1.x0
                @Override // java.lang.Runnable
                public final void run() {
                    A0.m(this.f7352a, c1Var);
                }
            });
        } else {
            G1.t.h("TAG", "Trying to send message on a dead thread.");
            c1Var.j(false);
        }
    }

    public final void f2(float f10) {
        for (H0 h0U = this.f6787s.u(); h0U != null; h0U = h0U.k()) {
            for (d2.r rVar : h0U.p().f32981c) {
                if (rVar != null) {
                    rVar.i(f10);
                }
            }
        }
    }

    @Override // K1.C0999h.a
    public void g(float f10) {
        this.f6768h.j(34);
    }

    public final void g1(long j10) {
        for (h1 h1Var : this.f6761a) {
            h1Var.N(j10);
        }
    }

    @Override // K1.C0999h.a
    public void h(int i10) {
        this.f6768h.h(33, i10, 0).a();
    }

    public final boolean h0(H0 h02) {
        return (h02 == null || h02.r() || h02.l() == Long.MIN_VALUE) ? false : true;
    }

    public void h1(C0744b c0744b, boolean z10) {
        this.f6768h.d(31, z10 ? 1 : 0, 0, c0744b).a();
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) throws Throwable {
        int i10;
        InterfaceC2611D.b bVar;
        H0 h0Y;
        try {
            switch (message.what) {
                case 1:
                    boolean z10 = message.arg1 != 0;
                    int i11 = message.arg2;
                    q1(z10, i11 >> 4, true, i11 & 15);
                    break;
                case 2:
                    D();
                    break;
                case 3:
                    a1((h) message.obj, true);
                    break;
                case 4:
                    s1((D1.y) message.obj);
                    break;
                case 5:
                    A1((k1) message.obj);
                    break;
                case 6:
                    Q1(false, true);
                    break;
                case 7:
                    J0((C0863k) message.obj);
                    return true;
                case 8:
                    a0((InterfaceC2610C) message.obj);
                    break;
                case 9:
                    V((InterfaceC2610C) message.obj);
                    break;
                case 10:
                    M0();
                    break;
                case 11:
                    v1(message.arg1);
                    break;
                case 12:
                    B1(message.arg1 != 0);
                    break;
                case 13:
                    j1(message.arg1 != 0, (C0863k) message.obj);
                    break;
                case 14:
                    d1((c1) message.obj);
                    break;
                case 15:
                    f1((c1) message.obj);
                    break;
                case 16:
                    c0((D1.y) message.obj, false);
                    break;
                case 17:
                    l1((b) message.obj);
                    break;
                case 18:
                    t((b) message.obj, message.arg1);
                    break;
                case 19:
                    android.support.v4.media.session.a.a(message.obj);
                    B0(null);
                    break;
                case 20:
                    L0(message.arg1, message.arg2, (a2.e0) message.obj);
                    break;
                case 21:
                    C1((a2.e0) message.obj);
                    break;
                case 22:
                    A0();
                    break;
                case 23:
                    o1(message.arg1 != 0);
                    break;
                case 24:
                default:
                    return false;
                case 25:
                    x();
                    break;
                case 26:
                    N0();
                    break;
                case 27:
                    U1(message.arg1, message.arg2, (List) message.obj);
                    break;
                case 28:
                    t1((InterfaceC1032y.c) message.obj);
                    break;
                case 29:
                    H0();
                    break;
                case Build.API_LEVELS.API_30 /* 30 */:
                    Pair pair = (Pair) message.obj;
                    G1(pair.first, (C0863k) pair.second);
                    break;
                case 31:
                    i1((C0744b) message.obj, message.arg1 != 0);
                    break;
                case 32:
                    I1(((Float) message.obj).floatValue());
                    break;
                case 33:
                    T(message.arg1);
                    break;
                case 34:
                    U();
                    break;
                case 35:
                    E1((g2.r) message.obj);
                    break;
                case 36:
                    w1(((Boolean) message.obj).booleanValue());
                    break;
                case 37:
                    this.f6747G = false;
                    h hVar = this.f6748H;
                    if (hVar != null) {
                        a1(hVar, false);
                        this.f6748H = null;
                    }
                    break;
                case 38:
                    y1((j1) message.obj);
                    break;
            }
        } catch (D1.w e10) {
            int i12 = e10.f2106b;
            if (i12 == 1) {
                i = e10.f2105a ? 3001 : 3003;
            } else if (i12 == 4) {
                i = e10.f2105a ? 3002 : 3004;
            }
            W(e10, i);
        } catch (I1.g e11) {
            W(e11, e11.f5430a);
        } catch (C1030x e12) {
            e = e12;
            if (e.f7345j == 1 && (h0Y = this.f6787s.y()) != null && e.f7350o == null) {
                e = e.a(h0Y.f6863h.f6874a);
            }
            if (e.f7345j == 1 && (bVar = e.f7350o) != null && i0(e.f7347l, bVar)) {
                this.f6798x0 = true;
                A();
                H0 h0X = this.f6787s.x();
                H0 h0U = this.f6787s.u();
                if (this.f6787s.u() != h0X) {
                    while (h0U != null && h0U.k() != h0X) {
                        h0U = h0U.k();
                    }
                }
                this.f6787s.N(h0U);
                if (this.f6749I.f6993e != 4) {
                    l0();
                    this.f6768h.j(2);
                }
            } else {
                C1030x c1030x = this.f6786r0;
                if (c1030x != null) {
                    c1030x.addSuppressed(e);
                    e = this.f6786r0;
                }
                if (e.f7345j == 1 && this.f6787s.u() != this.f6787s.y()) {
                    while (this.f6787s.u() != this.f6787s.y()) {
                        this.f6787s.b();
                    }
                    H0 h02 = (H0) AbstractC0853a.e(this.f6787s.u());
                    o0();
                    I0 i02 = h02.f6863h;
                    InterfaceC2611D.b bVar2 = i02.f6874a;
                    long j10 = i02.f6875b;
                    this.f6749I = d0(bVar2, j10, i02.f6876c, j10, true, 0);
                }
                if (e.f7351p && (this.f6786r0 == null || (i10 = e.f2113a) == 5004 || i10 == 5003)) {
                    G1.t.i("ExoPlayerImplInternal", "Recoverable renderer error", e);
                    if (this.f6786r0 == null) {
                        this.f6786r0 = e;
                    }
                    G1.p pVar = this.f6768h;
                    pVar.c(pVar.e(25, e));
                } else {
                    G1.t.d("ExoPlayerImplInternal", "Playback error", e);
                    Q1(true, false);
                    this.f6749I = this.f6749I.f(e);
                }
            }
        } catch (m.a e13) {
            W(e13, e13.f12655a);
        } catch (C2616b e14) {
            W(e14, 1002);
        } catch (IOException e15) {
            W(e15, 2000);
        } catch (RuntimeException e16) {
            C1030x c1030xD = C1030x.d(e16, ((e16 instanceof IllegalStateException) || (e16 instanceof IllegalArgumentException)) ? 1004 : 1000);
            G1.t.d("ExoPlayerImplInternal", "Playback error", c1030xD);
            Q1(true, false);
            this.f6749I = this.f6749I.f(c1030xD);
        }
        o0();
        return true;
    }

    public final boolean i0(int i10, InterfaceC2611D.b bVar) {
        if (this.f6787s.x() == null || !this.f6787s.x().f6863h.f6874a.equals(bVar)) {
            return false;
        }
        return this.f6761a[i10].v(this.f6787s.x());
    }

    public final void i1(C0744b c0744b, boolean z10) {
        this.f6764d.k(c0744b);
        C0999h c0999h = this.f6742B;
        if (!z10) {
            c0744b = null;
        }
        c0999h.k(c0744b);
        X1();
    }

    public final boolean j0() {
        H0 h0U = this.f6787s.u();
        long j10 = h0U.f6863h.f6878e;
        if (h0U.f6861f) {
            return j10 == -9223372036854775807L || this.f6749I.f7007s < j10 || !L1();
        }
        return false;
    }

    public final void j1(boolean z10, C0863k c0863k) {
        if (this.f6759Y != z10) {
            this.f6759Y = z10;
            if (!z10) {
                for (h1 h1Var : this.f6761a) {
                    h1Var.L();
                }
            }
        }
        if (c0863k != null) {
            c0863k.f();
        }
    }

    public final void k1(D1.y yVar) {
        this.f6768h.l(16);
        this.f6779o.d(yVar);
    }

    public final void l0() {
        boolean zK1 = K1();
        this.f6756V = zK1;
        if (zK1) {
            H0 h02 = (H0) AbstractC0853a.e(this.f6787s.n());
            h02.e(new F0.b().f(h02.C(this.f6778n0)).g(this.f6779o.e().f2119a).e(this.f6755T).d());
        }
        S1();
    }

    public final void l1(b bVar) throws Throwable {
        this.f6750J.b(1);
        if (bVar.f6805c != -1) {
            this.f6776m0 = new h(new d1(bVar.f6803a, bVar.f6804b), bVar.f6805c, bVar.f6806d);
        }
        Z(this.f6789t.B(bVar.f6803a, bVar.f6804b), false);
    }

    public final void m0() {
        this.f6787s.I();
        H0 h0W = this.f6787s.w();
        if (h0W != null) {
            if ((!h0W.f6860e || h0W.f6861f) && !h0W.f6856a.d()) {
                if (this.f6766f.b(this.f6749I.f6989a, h0W.f6863h.f6874a, h0W.f6861f ? h0W.f6856a.g() : 0L)) {
                    if (h0W.f6860e) {
                        h0W.e(new F0.b().f(h0W.C(this.f6778n0)).g(this.f6779o.e().f2119a).e(this.f6755T).d());
                    } else {
                        h0W.v(this, h0W.f6863h.f6875b);
                    }
                }
            }
        }
    }

    public void m1(List list, int i10, long j10, a2.e0 e0Var) {
        this.f6768h.e(17, new b(list, e0Var, i10, j10, null)).a();
    }

    @Override // a2.InterfaceC2610C.a
    public void n(InterfaceC2610C interfaceC2610C) {
        this.f6768h.e(8, interfaceC2610C).a();
    }

    public final void n0() {
        for (h1 h1Var : this.f6761a) {
            h1Var.D();
        }
    }

    public final void n1(boolean z10) {
        if (z10 == this.f6772k0) {
            return;
        }
        this.f6772k0 = z10;
        if (z10 || !this.f6749I.f7004p) {
            return;
        }
        this.f6768h.j(2);
    }

    public final void o0() {
        this.f6750J.c(this.f6749I);
        if (this.f6750J.f6811a) {
            this.f6785r.a(this.f6750J);
            this.f6750J = new e(this.f6749I);
        }
    }

    public final void o1(boolean z10) throws C1030x {
        this.f6752Q = z10;
        P0();
        if (!this.f6753R || this.f6787s.y() == this.f6787s.u()) {
            return;
        }
        Z0(true);
        X(false);
    }

    @Override // K1.C1011n.a
    public void onPlaybackParametersChanged(D1.y yVar) {
        this.f6768h.e(16, yVar).a();
    }

    public final void p0() throws C1030x {
        A0 a02;
        H0 h0X = this.f6787s.x();
        if (h0X == null) {
            return;
        }
        d2.y yVarP = h0X.p();
        int i10 = 0;
        while (i10 < this.f6761a.length) {
            if (yVarP.c(i10) && this.f6761a[i10].s() && !this.f6761a[i10].u()) {
                this.f6761a[i10].X();
                a02 = this;
                a02.E(h0X, i10, false, h0X.n());
            } else {
                a02 = this;
            }
            i10++;
            this = a02;
        }
        A0 a03 = this;
        if (a03.w()) {
            a03.f6796w0 = h0X.f6856a.k();
            if (h0X.s()) {
                return;
            }
            a03.f6787s.N(h0X);
            a03.X(false);
            a03.l0();
        }
    }

    public void p1(boolean z10, int i10, int i11) {
        this.f6768h.h(1, z10 ? 1 : 0, i10 | (i11 << 4)).a();
    }

    public final void q0(int i10) {
        h1 h1Var = this.f6761a[i10];
        try {
            h1Var.G((H0) AbstractC0853a.e(this.f6787s.u()));
        } catch (IOException | RuntimeException e10) {
            int iM = h1Var.m();
            if (iM != 3 && iM != 5) {
                throw e10;
            }
            d2.y yVarP = this.f6787s.u().p();
            G1.t.d("ExoPlayerImplInternal", "Disabling track due to error: " + D1.o.h(yVarP.f32981c[i10].s()), e10);
            d2.y yVar = new d2.y((g1[]) yVarP.f32980b.clone(), (d2.r[]) yVarP.f32981c.clone(), yVarP.f32982d, yVarP.f32983e);
            yVar.f32980b[i10] = null;
            yVar.f32981c[i10] = null;
            B(i10);
            this.f6787s.u().a(yVar, this.f6749I.f7007s, false);
        }
    }

    public final void q1(boolean z10, int i10, boolean z11, int i11) {
        this.f6750J.b(z11 ? 1 : 0);
        Y1(z10, i10, i11);
    }

    public final void r0(final int i10, final boolean z10) {
        boolean[] zArr = this.f6763c;
        if (zArr[i10] != z10) {
            zArr[i10] = z10;
            this.f6801z.i(new Runnable() { // from class: K1.w0
                @Override // java.lang.Runnable
                public final void run() {
                    A0 a02 = this.f7339a;
                    int i11 = i10;
                    a02.f6799y.G(i11, a02.f6761a[i11].m(), z10);
                }
            });
        }
    }

    public void r1(D1.y yVar) {
        this.f6768h.e(4, yVar).a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x0079, code lost:
    
        r3 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void s0(long r9, long r11) {
        /*
            Method dump skipped, instruction units count: 253
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: K1.A0.s0(long, long):void");
    }

    public final void s1(D1.y yVar) {
        k1(yVar);
        c0(this.f6779o.e(), true);
    }

    public final void t(b bVar, int i10) throws Throwable {
        this.f6750J.b(1);
        Z0 z02 = this.f6789t;
        if (i10 == -1) {
            i10 = z02.r();
        }
        Z(z02.f(i10, bVar.f6803a, bVar.f6804b), false);
    }

    public final boolean t0() {
        I0 i0T;
        this.f6787s.K(this.f6778n0);
        boolean z10 = false;
        if (this.f6787s.T() && (i0T = this.f6787s.t(this.f6778n0, this.f6749I)) != null) {
            H0 h0H = this.f6787s.h(i0T);
            if (!h0H.f6860e) {
                h0H.v(this, i0T.f6875b);
            } else if (h0H.f6861f) {
                this.f6768h.e(8, h0H.f6856a).a();
            }
            if (this.f6787s.u() == h0H) {
                Q0(i0T.f6875b);
            }
            X(false);
            z10 = true;
        }
        if (!this.f6756V) {
            l0();
            return z10;
        }
        this.f6756V = h0(this.f6787s.n());
        S1();
        return z10;
    }

    public final void t1(InterfaceC1032y.c cVar) {
        this.f6792u0 = cVar;
        this.f6787s.V(this.f6749I.f6989a, cVar);
    }

    public final void u() {
        d2.y yVarP = this.f6787s.u().p();
        for (int i10 = 0; i10 < this.f6761a.length; i10++) {
            if (yVarP.c(i10)) {
                this.f6761a[i10].f();
            }
        }
    }

    public final void u0() {
        H0 h0U;
        boolean z10;
        if (this.f6787s.u() == this.f6787s.y() && (h0U = this.f6787s.u()) != null) {
            d2.y yVarP = h0U.p();
            boolean z11 = false;
            int i10 = 0;
            boolean z12 = false;
            while (true) {
                if (i10 >= this.f6761a.length) {
                    z10 = true;
                    break;
                }
                if (yVarP.c(i10)) {
                    if (this.f6761a[i10].m() != 1) {
                        z10 = false;
                        break;
                    } else if (yVarP.f32980b[i10].f7058a != 0) {
                        z12 = true;
                    }
                }
                i10++;
            }
            if (z12 && z10) {
                z11 = true;
            }
            n1(z11);
        }
    }

    public void u1(int i10) {
        this.f6768h.h(11, i10, 0).a();
    }

    public final void v() {
        for (h1 h1Var : this.f6761a) {
            h1Var.R(this.f6746F ? this.f6744D : null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void v0() {
        /*
            r15 = this;
            r0 = 0
            r1 = r0
        L2:
            boolean r2 = r15.J1()
            if (r2 == 0) goto L82
            if (r1 == 0) goto Ld
            r15.o0()
        Ld:
            r15.f6798x0 = r0
            K1.K0 r1 = r15.f6787s
            K1.H0 r1 = r1.b()
            java.lang.Object r1 = G1.AbstractC0853a.e(r1)
            K1.H0 r1 = (K1.H0) r1
            K1.a1 r2 = r15.f6749I
            a2.D$b r2 = r2.f6990b
            java.lang.Object r2 = r2.f20522a
            K1.I0 r3 = r1.f6863h
            a2.D$b r3 = r3.f6874a
            java.lang.Object r3 = r3.f20522a
            boolean r2 = r2.equals(r3)
            r3 = 1
            if (r2 == 0) goto L47
            K1.a1 r2 = r15.f6749I
            a2.D$b r2 = r2.f6990b
            int r4 = r2.f20523b
            r5 = -1
            if (r4 != r5) goto L47
            K1.I0 r4 = r1.f6863h
            a2.D$b r4 = r4.f6874a
            int r6 = r4.f20523b
            if (r6 != r5) goto L47
            int r2 = r2.f20526e
            int r4 = r4.f20526e
            if (r2 == r4) goto L47
            r2 = r3
            goto L48
        L47:
            r2 = r0
        L48:
            K1.I0 r4 = r1.f6863h
            a2.D$b r6 = r4.f6874a
            long r7 = r4.f6875b
            long r9 = r4.f6876c
            r13 = r2 ^ 1
            r14 = 0
            r11 = r7
            r5 = r15
            K1.a1 r15 = r5.d0(r6, r7, r9, r11, r13, r14)
            r5.f6749I = r15
            r5.P0()
            r5.a2()
            boolean r15 = r5.w()
            if (r15 == 0) goto L72
            K1.K0 r15 = r5.f6787s
            K1.H0 r15 = r15.x()
            if (r1 != r15) goto L72
            r5.n0()
        L72:
            K1.a1 r15 = r5.f6749I
            int r15 = r15.f6993e
            r1 = 3
            if (r15 != r1) goto L7c
            r5.O1()
        L7c:
            r5.u()
            r1 = r3
            r15 = r5
            goto L2
        L82:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: K1.A0.v0():void");
    }

    public final void v1(int i10) throws C1030x {
        this.f6757W = i10;
        int iX = this.f6787s.X(this.f6749I.f6989a, i10);
        if ((iX & 1) != 0) {
            Z0(true);
        } else if ((iX & 2) != 0) {
            A();
        }
        X(false);
    }

    public final boolean w() {
        if (!this.f6741A) {
            return false;
        }
        for (h1 h1Var : this.f6761a) {
            if (h1Var.u()) {
                return true;
            }
        }
        return false;
    }

    public final void w0(boolean z10) {
        if (this.f6792u0.f7398a == -9223372036854775807L) {
            return;
        }
        if (z10 || !this.f6749I.f6989a.equals(this.f6794v0)) {
            D1.D d10 = this.f6749I.f6989a;
            this.f6794v0 = d10;
            this.f6787s.B(d10);
        }
        m0();
    }

    public final void w1(boolean z10) throws Throwable {
        if (!z10) {
            this.f6747G = false;
            this.f6768h.l(37);
            h hVar = this.f6748H;
            if (hVar != null) {
                a1(hVar, false);
                this.f6748H = null;
            }
        }
        this.f6746F = z10;
        v();
    }

    public final void x() throws C1030x {
        N0();
    }

    public final void x0() throws C1030x {
        H0 h0X;
        if (this.f6753R || !this.f6741A || this.f6798x0 || w() || (h0X = this.f6787s.x()) == null || h0X != this.f6787s.y() || h0X.k() == null || !h0X.k().f6861f) {
            return;
        }
        this.f6787s.c();
        p0();
    }

    public void x1(j1 j1Var) {
        this.f6768h.e(38, j1Var).a();
    }

    public final H0 y(I0 i02, long j10) {
        return new H0(this.f6762b, j10, this.f6764d, this.f6766f.f(), this.f6789t, i02, this.f6765e, this.f6792u0.f7398a);
    }

    public final void y0() {
        H0 h0Y = this.f6787s.y();
        if (h0Y == null) {
            return;
        }
        int i10 = 0;
        if (h0Y.k() == null || this.f6753R) {
            if (h0Y.f6863h.f6883j || this.f6753R) {
                h1[] h1VarArr = this.f6761a;
                int length = h1VarArr.length;
                while (i10 < length) {
                    h1 h1Var = h1VarArr[i10];
                    if (h1Var.x(h0Y) && h1Var.r(h0Y)) {
                        long j10 = h0Y.f6863h.f6878e;
                        h1Var.O(h0Y, (j10 == -9223372036854775807L || j10 == Long.MIN_VALUE) ? -9223372036854775807L : h0Y.m() + h0Y.f6863h.f6878e);
                    }
                    i10++;
                }
                return;
            }
            return;
        }
        if (e0()) {
            if (w() && this.f6787s.x() == this.f6787s.y()) {
                return;
            }
            if (h0Y.k().f6861f || this.f6778n0 >= h0Y.k().n()) {
                d2.y yVarP = h0Y.p();
                H0 h0D = this.f6787s.d();
                d2.y yVarP2 = h0D.p();
                D1.D d10 = this.f6749I.f6989a;
                b2(d10, h0D.f6863h.f6874a, d10, h0Y.f6863h.f6874a, -9223372036854775807L, false);
                if (h0D.f6861f && ((this.f6741A && this.f6796w0 != -9223372036854775807L) || h0D.f6856a.k() != -9223372036854775807L)) {
                    this.f6796w0 = -9223372036854775807L;
                    boolean z10 = this.f6741A && !this.f6798x0;
                    if (z10) {
                        int i11 = 0;
                        while (true) {
                            if (i11 < this.f6761a.length) {
                                if (yVarP2.c(i11) && this.f6761a[i11].m() != -2 && !D1.v.a(yVarP2.f32981c[i11].s().f1805o, yVarP2.f32981c[i11].s().f1801k) && !this.f6761a[i11].u()) {
                                    z10 = false;
                                    break;
                                }
                                i11++;
                            } else {
                                break;
                            }
                        }
                    }
                    if (!z10) {
                        g1(h0D.n());
                        if (h0D.s()) {
                            return;
                        }
                        this.f6787s.N(h0D);
                        X(false);
                        l0();
                        return;
                    }
                }
                h1[] h1VarArr2 = this.f6761a;
                int length2 = h1VarArr2.length;
                while (i10 < length2) {
                    h1VarArr2[i10].F(yVarP, yVarP2, h0D.n());
                    i10++;
                }
            }
        }
    }

    public final void y1(j1 j1Var) {
        this.f6744D = j1Var;
        v();
    }

    public final void z(c1 c1Var) {
        if (c1Var.i()) {
            return;
        }
        try {
            c1Var.f().w(c1Var.h(), c1Var.d());
        } finally {
            c1Var.j(true);
        }
    }

    public final void z0() {
        H0 h0Y = this.f6787s.y();
        if (h0Y == null || this.f6787s.u() == h0Y || h0Y.f6864i || !e2()) {
            return;
        }
        this.f6787s.y().f6864i = true;
    }

    public void z1(k1 k1Var) {
        this.f6768h.e(5, k1Var).a();
    }
}
