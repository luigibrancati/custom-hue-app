package Q1;

import D1.C0753k;
import D1.E;
import D1.InterfaceC0749g;
import D1.o;
import D1.u;
import G1.AbstractC0853a;
import G1.C;
import G1.M;
import K1.C0;
import K1.F0;
import K1.k1;
import K7.A;
import K7.AbstractC1081v;
import P1.t;
import Q1.f;
import a2.C2609B;
import a2.C2638y;
import a2.L;
import a2.b0;
import a2.c0;
import a2.d0;
import a2.n0;
import android.net.Uri;
import android.os.Handler;
import android.util.SparseIntArray;
import b2.AbstractC2795e;
import e2.k;
import e2.m;
import i2.C4334n;
import i2.J;
import i2.O;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import t2.C5828a;
import t2.C5829b;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class s implements m.b, m.f, d0, i2.r, b0.d {

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public static final Set f13447o0 = Collections.unmodifiableSet(new HashSet(Arrays.asList(1, 2, 5)));

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f13448A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public int f13449B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public boolean f13450C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public boolean f13451D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public int f13452E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public D1.o f13453F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public D1.o f13454G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public boolean f13455H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public n0 f13456I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public Set f13457J;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public int[] f13458P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public int f13459Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public boolean f13460R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public boolean[] f13461S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public boolean[] f13462T;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public long f13463V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public long f13464W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public boolean f13465X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public boolean f13466Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public boolean f13467Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13468a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f13469b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f13470c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f f13471d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final e2.b f13472e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final D1.o f13473f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final P1.u f13474g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final t.a f13475h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final e2.k f13476i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final L.a f13478k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public boolean f13479k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f13480l;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public long f13481l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public C0753k f13483m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ArrayList f13484n;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public j f13485n0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final List f13486o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Runnable f13487p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Runnable f13488q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Handler f13489r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ArrayList f13490s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Map f13491t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public AbstractC2795e f13492u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public d[] f13493v;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Set f13495x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public SparseIntArray f13496y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public O f13497z;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e2.m f13477j = new e2.m("Loader:HlsSampleStreamWrapper");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final f.b f13482m = new f.b();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int[] f13494w = new int[0];

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface b extends d0.a {
        void j();

        void o(Uri uri);
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class c implements O {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final D1.o f13498g = new o.b().y0("application/id3").P();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final D1.o f13499h = new o.b().y0("application/x-emsg").P();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final C5829b f13500a = new C5829b();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final O f13501b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final D1.o f13502c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public D1.o f13503d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public byte[] f13504e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f13505f;

        public c(O o10, int i10) {
            this.f13501b = o10;
            if (i10 == 1) {
                this.f13502c = f13498g;
            } else {
                if (i10 != 3) {
                    throw new IllegalArgumentException("Unknown metadataType: " + i10);
                }
                this.f13502c = f13499h;
            }
            this.f13504e = new byte[0];
            this.f13505f = 0;
        }

        @Override // i2.O
        public int c(InterfaceC0749g interfaceC0749g, int i10, boolean z10, int i11) throws EOFException {
            i(this.f13505f + i10);
            int i12 = interfaceC0749g.read(this.f13504e, this.f13505f, i10);
            if (i12 != -1) {
                this.f13505f += i12;
                return i12;
            }
            if (z10) {
                return -1;
            }
            throw new EOFException();
        }

        @Override // i2.O
        public void d(long j10, int i10, int i11, int i12, O.a aVar) {
            AbstractC0853a.e(this.f13503d);
            C cJ = j(i11, i12);
            if (!Objects.equals(this.f13503d.f1805o, this.f13502c.f1805o)) {
                if (!"application/x-emsg".equals(this.f13503d.f1805o)) {
                    G1.t.h("HlsSampleStreamWrapper", "Ignoring sample for unsupported format: " + this.f13503d.f1805o);
                    return;
                }
                C5828a c5828aC = this.f13500a.c(cJ);
                if (!h(c5828aC)) {
                    G1.t.h("HlsSampleStreamWrapper", String.format("Ignoring EMSG. Expected it to contain wrapped %s but actual wrapped format: %s", this.f13502c.f1805o, c5828aC.a()));
                    return;
                }
                cJ = new C((byte[]) AbstractC0853a.e(c5828aC.c()));
            }
            int iA = cJ.a();
            this.f13501b.b(cJ, iA);
            this.f13501b.d(j10, i10, iA, 0, aVar);
        }

        @Override // i2.O
        public void e(D1.o oVar) {
            this.f13503d = oVar;
            this.f13501b.e(this.f13502c);
        }

        @Override // i2.O
        public void g(C c10, int i10, int i11) {
            i(this.f13505f + i10);
            c10.q(this.f13504e, this.f13505f, i10);
            this.f13505f += i10;
        }

        public final boolean h(C5828a c5828a) {
            D1.o oVarA = c5828a.a();
            return oVarA != null && Objects.equals(this.f13502c.f1805o, oVarA.f1805o);
        }

        public final void i(int i10) {
            byte[] bArr = this.f13504e;
            if (bArr.length < i10) {
                this.f13504e = Arrays.copyOf(bArr, i10 + (i10 / 2));
            }
        }

        public final C j(int i10, int i11) {
            int i12 = this.f13505f - i11;
            C c10 = new C(Arrays.copyOfRange(this.f13504e, i12 - i10, i12));
            byte[] bArr = this.f13504e;
            System.arraycopy(bArr, i12, bArr, 0, i11);
            this.f13505f = i11;
            return c10;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class d extends b0 {

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        public final Map f13506H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        public C0753k f13507I;

        @Override // a2.b0, i2.O
        public void d(long j10, int i10, int i11, int i12, O.a aVar) {
            super.d(j10, i10, i11, i12, aVar);
        }

        public final D1.u j0(D1.u uVar) {
            if (uVar == null) {
                return null;
            }
            int iE = uVar.e();
            int i10 = 0;
            int i11 = 0;
            while (true) {
                if (i11 >= iE) {
                    i11 = -1;
                    break;
                }
                u.a aVarD = uVar.d(i11);
                if ((aVarD instanceof w2.m) && "com.apple.streaming.transportStreamTimestamp".equals(((w2.m) aVarD).f46131b)) {
                    break;
                }
                i11++;
            }
            if (i11 == -1) {
                return uVar;
            }
            if (iE == 1) {
                return null;
            }
            u.a[] aVarArr = new u.a[iE - 1];
            while (i10 < iE) {
                if (i10 != i11) {
                    aVarArr[i10 < i11 ? i10 : i10 - 1] = uVar.d(i10);
                }
                i10++;
            }
            return new D1.u(aVarArr);
        }

        public void k0(C0753k c0753k) {
            this.f13507I = c0753k;
            L();
        }

        public void l0(j jVar) {
            h0(jVar.f13396k);
        }

        @Override // a2.b0
        public D1.o z(D1.o oVar) {
            C0753k c0753k;
            C0753k c0753k2 = this.f13507I;
            if (c0753k2 == null) {
                c0753k2 = oVar.f1809s;
            }
            if (c0753k2 != null && (c0753k = (C0753k) this.f13506H.get(c0753k2.f1726c)) != null) {
                c0753k2 = c0753k;
            }
            D1.u uVarJ0 = j0(oVar.f1802l);
            if (c0753k2 != oVar.f1809s || uVarJ0 != oVar.f1802l) {
                oVar = oVar.b().c0(c0753k2).r0(uVarJ0).P();
            }
            return super.z(oVar);
        }

        public d(e2.b bVar, P1.u uVar, t.a aVar, Map map) {
            super(bVar, uVar, aVar);
            this.f13506H = map;
        }
    }

    public s(String str, int i10, b bVar, f fVar, Map map, e2.b bVar2, long j10, D1.o oVar, P1.u uVar, t.a aVar, e2.k kVar, L.a aVar2, int i11) {
        this.f13468a = str;
        this.f13469b = i10;
        this.f13470c = bVar;
        this.f13471d = fVar;
        this.f13491t = map;
        this.f13472e = bVar2;
        this.f13473f = oVar;
        this.f13474g = uVar;
        this.f13475h = aVar;
        this.f13476i = kVar;
        this.f13478k = aVar2;
        this.f13480l = i11;
        Set set = f13447o0;
        this.f13495x = new HashSet(set.size());
        this.f13496y = new SparseIntArray(set.size());
        this.f13493v = new d[0];
        this.f13462T = new boolean[0];
        this.f13461S = new boolean[0];
        ArrayList arrayList = new ArrayList();
        this.f13484n = arrayList;
        this.f13486o = Collections.unmodifiableList(arrayList);
        this.f13490s = new ArrayList();
        this.f13487p = new Runnable() { // from class: Q1.p
            @Override // java.lang.Runnable
            public final void run() {
                this.f13444a.W();
            }
        };
        this.f13488q = new Runnable() { // from class: Q1.q
            @Override // java.lang.Runnable
            public final void run() {
                this.f13445a.g0();
            }
        };
        this.f13489r = M.z();
        this.f13463V = j10;
        this.f13464W = j10;
    }

    public static C4334n E(int i10, int i11) {
        G1.t.h("HlsSampleStreamWrapper", "Unmapped track with id " + i10 + " of type " + i11);
        return new C4334n();
    }

    public static D1.o H(D1.o oVar, D1.o oVar2, boolean z10) {
        String strD;
        String strG;
        if (oVar == null) {
            return oVar2;
        }
        int iK = D1.v.k(oVar2.f1805o);
        if (M.S(oVar.f1801k, iK) == 1) {
            strD = M.T(oVar.f1801k, iK);
            strG = D1.v.g(strD);
        } else {
            strD = D1.v.d(oVar.f1801k, oVar2.f1805o);
            strG = oVar2.f1805o;
        }
        o.b bVarU = oVar2.b().j0(oVar.f1791a).l0(oVar.f1792b).m0(oVar.f1793c).n0(oVar.f1794d).A0(oVar.f1795e).w0(oVar.f1796f).S(z10 ? oVar.f1798h : -1).t0(z10 ? oVar.f1799i : -1).U(strD);
        if (iK == 2) {
            bVarU.F0(oVar.f1812v).h0(oVar.f1813w).f0(oVar.f1816z);
        }
        if (strG != null) {
            bVarU.y0(strG);
        }
        int i10 = oVar.f1780G;
        if (i10 != -1 && iK == 1) {
            bVarU.T(i10);
        }
        D1.u uVarB = oVar.f1802l;
        if (uVarB != null) {
            D1.u uVar = oVar2.f1802l;
            if (uVar != null) {
                uVarB = uVar.b(uVarB);
            }
            bVarU.r0(uVarB);
        }
        return bVarU.P();
    }

    public static boolean L(D1.o oVar, D1.o oVar2) {
        String str = oVar.f1805o;
        String str2 = oVar2.f1805o;
        int iK = D1.v.k(str);
        if (iK != 3) {
            return iK == D1.v.k(str2);
        }
        if (Objects.equals(str, str2)) {
            return !("application/cea-608".equals(str) || "application/cea-708".equals(str)) || oVar.f1785L == oVar2.f1785L;
        }
        return false;
    }

    public static int O(int i10) {
        if (i10 == 1) {
            return 2;
        }
        if (i10 != 2) {
            return i10 != 3 ? 0 : 1;
        }
        return 3;
    }

    public static boolean Q(AbstractC2795e abstractC2795e) {
        return abstractC2795e instanceof j;
    }

    private boolean R() {
        return this.f13464W != -9223372036854775807L;
    }

    public int A(int i10) {
        z();
        AbstractC0853a.e(this.f13458P);
        int i11 = this.f13458P[i10];
        if (i11 == -1) {
            return this.f13457J.contains(this.f13456I.b(i10)) ? -3 : -2;
        }
        boolean[] zArr = this.f13461S;
        if (zArr[i11]) {
            return -2;
        }
        zArr[i11] = true;
        return i11;
    }

    public final void B() {
        D1.o oVar;
        int length = this.f13493v.length;
        int i10 = -2;
        int i11 = -1;
        int i12 = 0;
        while (true) {
            if (i12 >= length) {
                break;
            }
            String str = ((D1.o) AbstractC0853a.i(this.f13493v[i12].I())).f1805o;
            int i13 = D1.v.t(str) ? 2 : D1.v.o(str) ? 1 : D1.v.s(str) ? 3 : -2;
            if (O(i13) > O(i10)) {
                i11 = i12;
                i10 = i13;
            } else if (i13 == i10 && i11 != -1) {
                i11 = -1;
            }
            i12++;
        }
        E eL = this.f13471d.l();
        int i14 = eL.f1491a;
        this.f13459Q = -1;
        this.f13458P = new int[length];
        for (int i15 = 0; i15 < length; i15++) {
            this.f13458P[i15] = i15;
        }
        E[] eArr = new E[length];
        int i16 = 0;
        while (i16 < length) {
            D1.o oVar2 = (D1.o) AbstractC0853a.i(this.f13493v[i16].I());
            if (i16 == i11) {
                D1.o[] oVarArr = new D1.o[i14];
                for (int i17 = 0; i17 < i14; i17++) {
                    D1.o oVarA = eL.a(i17);
                    if (i10 == 1 && (oVar = this.f13473f) != null) {
                        oVarA = oVarA.i(oVar);
                    }
                    oVarArr[i17] = i14 == 1 ? oVar2.i(oVarA) : H(oVarA, oVar2, true);
                }
                eArr[i16] = new E(this.f13468a, oVarArr);
                this.f13459Q = i16;
            } else {
                D1.o oVar3 = (i10 == 2 && D1.v.o(oVar2.f1805o)) ? this.f13473f : null;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(this.f13468a);
                sb2.append(":muxed:");
                sb2.append(i16 < i11 ? i16 : i16 - 1);
                eArr[i16] = new E(sb2.toString(), H(oVar3, oVar2, false));
            }
            i16++;
        }
        this.f13456I = G(eArr);
        AbstractC0853a.g(this.f13457J == null);
        this.f13457J = Collections.EMPTY_SET;
    }

    public final boolean C(int i10) {
        for (int i11 = i10; i11 < this.f13484n.size(); i11++) {
            if (((j) this.f13484n.get(i11)).w()) {
                return false;
            }
        }
        j jVar = (j) this.f13484n.get(i10);
        for (int i12 = 0; i12 < this.f13493v.length; i12++) {
            if (this.f13493v[i12].F() > jVar.m(i12)) {
                return false;
            }
        }
        return true;
    }

    public void D() {
        if (this.f13451D) {
            return;
        }
        e(new F0.b().f(this.f13463V).d());
    }

    public final b0 F(int i10, int i11) {
        int length = this.f13493v.length;
        boolean z10 = true;
        if (i11 != 1 && i11 != 2) {
            z10 = false;
        }
        d dVar = new d(this.f13472e, this.f13474g, this.f13475h, this.f13491t);
        dVar.d0(this.f13463V);
        if (z10) {
            dVar.k0(this.f13483m0);
        }
        dVar.c0(this.f13481l0);
        j jVar = this.f13485n0;
        if (jVar != null) {
            dVar.l0(jVar);
        }
        dVar.f0(this);
        int i12 = length + 1;
        int[] iArrCopyOf = Arrays.copyOf(this.f13494w, i12);
        this.f13494w = iArrCopyOf;
        iArrCopyOf[length] = i10;
        this.f13493v = (d[]) M.Q0(this.f13493v, dVar);
        boolean[] zArrCopyOf = Arrays.copyOf(this.f13462T, i12);
        this.f13462T = zArrCopyOf;
        zArrCopyOf[length] = z10;
        this.f13460R |= z10;
        this.f13495x.add(Integer.valueOf(i11));
        this.f13496y.append(i11, length);
        if (O(i11) > O(this.f13448A)) {
            this.f13449B = length;
            this.f13448A = i11;
        }
        this.f13461S = Arrays.copyOf(this.f13461S, i12);
        return dVar;
    }

    public final n0 G(E[] eArr) {
        for (int i10 = 0; i10 < eArr.length; i10++) {
            E e10 = eArr[i10];
            D1.o[] oVarArr = new D1.o[e10.f1491a];
            for (int i11 = 0; i11 < e10.f1491a; i11++) {
                D1.o oVarA = e10.a(i11);
                oVarArr[i11] = oVarA.c(this.f13474g.b(oVarA));
            }
            eArr[i10] = new E(e10.f1492b, oVarArr);
        }
        return new n0(eArr);
    }

    public final void I(int i10) {
        AbstractC0853a.g(!this.f13477j.j());
        while (true) {
            if (i10 >= this.f13484n.size()) {
                i10 = -1;
                break;
            } else if (C(i10)) {
                break;
            } else {
                i10++;
            }
        }
        if (i10 == -1) {
            return;
        }
        long j10 = M().f25001h;
        j jVarJ = J(i10);
        if (this.f13484n.isEmpty()) {
            this.f13464W = this.f13463V;
        } else {
            ((j) A.d(this.f13484n)).p();
        }
        this.f13467Z = false;
        this.f13478k.y(this.f13448A, jVarJ.f25000g, j10);
    }

    public final j J(int i10) {
        j jVar = (j) this.f13484n.get(i10);
        ArrayList arrayList = this.f13484n;
        M.Y0(arrayList, i10, arrayList.size());
        for (int i11 = 0; i11 < this.f13493v.length; i11++) {
            this.f13493v[i11].w(jVar.m(i11));
        }
        return jVar;
    }

    public final boolean K(j jVar) {
        int i10 = jVar.f13396k;
        int length = this.f13493v.length;
        for (int i11 = 0; i11 < length; i11++) {
            if (this.f13461S[i11] && this.f13493v[i11].S() == i10) {
                return false;
            }
        }
        return true;
    }

    public final j M() {
        return (j) this.f13484n.get(r1.size() - 1);
    }

    public final O N(int i10, int i11) {
        AbstractC0853a.a(f13447o0.contains(Integer.valueOf(i11)));
        int i12 = this.f13496y.get(i11, -1);
        if (i12 == -1) {
            return null;
        }
        if (this.f13495x.add(Integer.valueOf(i11))) {
            this.f13494w[i12] = i10;
        }
        return this.f13494w[i12] == i10 ? this.f13493v[i12] : E(i10, i11);
    }

    public final void P(j jVar) {
        this.f13485n0 = jVar;
        this.f13453F = jVar.f24997d;
        this.f13464W = -9223372036854775807L;
        this.f13484n.add(jVar);
        AbstractC1081v.a aVarR = AbstractC1081v.r();
        for (d dVar : this.f13493v) {
            aVarR.a(Integer.valueOf(dVar.J()));
        }
        jVar.o(this, aVarR.k());
        for (d dVar2 : this.f13493v) {
            dVar2.l0(jVar);
            if (jVar.w()) {
                dVar2.i0();
            }
        }
    }

    public boolean S(int i10) {
        return !R() && this.f13493v[i10].N(this.f13467Z);
    }

    public boolean T() {
        return this.f13448A == 2;
    }

    public final void U() {
        int i10 = this.f13456I.f20863a;
        int[] iArr = new int[i10];
        this.f13458P = iArr;
        Arrays.fill(iArr, -1);
        for (int i11 = 0; i11 < i10; i11++) {
            int i12 = 0;
            while (true) {
                d[] dVarArr = this.f13493v;
                if (i12 >= dVarArr.length) {
                    break;
                }
                if (L((D1.o) AbstractC0853a.i(dVarArr[i12].I()), this.f13456I.b(i11).a(0))) {
                    this.f13458P[i11] = i12;
                    break;
                }
                i12++;
            }
        }
        Iterator it = this.f13490s.iterator();
        while (it.hasNext()) {
            ((n) it.next()).b();
        }
    }

    public final void V(j jVar) {
        if (this.f13484n.isEmpty()) {
            return;
        }
        if (!M().q()) {
            I(this.f13484n.size() - 1);
        }
        if (jVar.f13399n && jVar.w()) {
            for (int size = this.f13484n.size() - 1; size >= 0; size--) {
                long j10 = ((j) this.f13484n.get(size)).f25000g;
                long j11 = jVar.f25000g;
                if (j10 < j11) {
                    return;
                }
                if (j10 == j11 && C(size)) {
                    I(size);
                    jVar.i();
                    return;
                }
            }
        }
    }

    public final void W() {
        if (!this.f13455H && this.f13458P == null && this.f13450C) {
            for (d dVar : this.f13493v) {
                if (dVar.I() == null) {
                    return;
                }
            }
            if (this.f13456I != null) {
                U();
                return;
            }
            B();
            p0();
            this.f13470c.j();
        }
    }

    public void X() throws IOException {
        this.f13477j.a();
        this.f13471d.r();
    }

    public void Y(int i10) throws IOException {
        X();
        this.f13493v[i10].P();
    }

    @Override // e2.m.b
    /* JADX INFO: renamed from: Z, reason: merged with bridge method [inline-methods] */
    public void t(AbstractC2795e abstractC2795e, long j10, long j11, boolean z10) {
        this.f13492u = null;
        C2638y c2638y = new C2638y(abstractC2795e.f24994a, abstractC2795e.f24995b, abstractC2795e.e(), abstractC2795e.d(), j10, j11, abstractC2795e.a());
        this.f13476i.d(abstractC2795e.f24994a);
        this.f13478k.m(c2638y, abstractC2795e.f24996c, this.f13469b, abstractC2795e.f24997d, abstractC2795e.f24998e, abstractC2795e.f24999f, abstractC2795e.f25000g, abstractC2795e.f25001h);
        if (z10) {
            return;
        }
        if (R() || this.f13452E == 0) {
            k0();
        }
        if (this.f13452E > 0) {
            this.f13470c.f(this);
        }
    }

    @Override // e2.m.b
    /* JADX INFO: renamed from: a0, reason: merged with bridge method [inline-methods] */
    public void w(AbstractC2795e abstractC2795e, long j10, long j11) {
        this.f13492u = null;
        this.f13471d.t(abstractC2795e);
        C2638y c2638y = new C2638y(abstractC2795e.f24994a, abstractC2795e.f24995b, abstractC2795e.e(), abstractC2795e.d(), j10, j11, abstractC2795e.a());
        this.f13476i.d(abstractC2795e.f24994a);
        this.f13478k.p(c2638y, abstractC2795e.f24996c, this.f13469b, abstractC2795e.f24997d, abstractC2795e.f24998e, abstractC2795e.f24999f, abstractC2795e.f25000g, abstractC2795e.f25001h);
        if (this.f13451D) {
            this.f13470c.f(this);
        } else {
            e(new F0.b().f(this.f13463V).d());
        }
    }

    @Override // a2.d0
    public long b() {
        if (R()) {
            return this.f13464W;
        }
        if (this.f13467Z) {
            return Long.MIN_VALUE;
        }
        return M().f25001h;
    }

    @Override // e2.m.b
    /* JADX INFO: renamed from: b0, reason: merged with bridge method [inline-methods] */
    public m.c o(AbstractC2795e abstractC2795e, long j10, long j11, IOException iOException, int i10) {
        m.c cVarH;
        int i11;
        boolean zQ = Q(abstractC2795e);
        if (zQ && !((j) abstractC2795e).q() && (iOException instanceof I1.s) && ((i11 = ((I1.s) iOException).f5505d) == 410 || i11 == 404)) {
            return e2.m.f33632d;
        }
        long jA = abstractC2795e.a();
        C2638y c2638y = new C2638y(abstractC2795e.f24994a, abstractC2795e.f24995b, abstractC2795e.e(), abstractC2795e.d(), j10, j11, jA);
        k.c cVar = new k.c(c2638y, new C2609B(abstractC2795e.f24996c, this.f13469b, abstractC2795e.f24997d, abstractC2795e.f24998e, abstractC2795e.f24999f, M.o1(abstractC2795e.f25000g), M.o1(abstractC2795e.f25001h)), iOException, i10);
        k.b bVarC = this.f13476i.c(d2.w.c(this.f13471d.m()), cVar);
        boolean zQ2 = (bVarC == null || bVarC.f33626a != 2) ? false : this.f13471d.q(abstractC2795e, bVarC.f33627b);
        if (zQ2) {
            if (zQ && jA == 0) {
                ArrayList arrayList = this.f13484n;
                AbstractC0853a.g(((j) arrayList.remove(arrayList.size() - 1)) == abstractC2795e);
                if (this.f13484n.isEmpty()) {
                    this.f13464W = this.f13463V;
                } else {
                    ((j) A.d(this.f13484n)).p();
                }
            }
            cVarH = e2.m.f33634f;
        } else {
            long jA2 = this.f13476i.a(cVar);
            cVarH = jA2 != -9223372036854775807L ? e2.m.h(false, jA2) : e2.m.f33635g;
        }
        m.c cVar2 = cVarH;
        boolean zC = cVar2.c();
        this.f13478k.r(c2638y, abstractC2795e.f24996c, this.f13469b, abstractC2795e.f24997d, abstractC2795e.f24998e, abstractC2795e.f24999f, abstractC2795e.f25000g, abstractC2795e.f25001h, iOException, !zC);
        if (!zC) {
            this.f13492u = null;
            this.f13476i.d(abstractC2795e.f24994a);
        }
        if (zQ2) {
            if (!this.f13451D) {
                e(new F0.b().f(this.f13463V).d());
                return cVar2;
            }
            this.f13470c.f(this);
        }
        return cVar2;
    }

    public long c(long j10, k1 k1Var) {
        return this.f13471d.c(j10, k1Var);
    }

    @Override // e2.m.b
    /* JADX INFO: renamed from: c0, reason: merged with bridge method [inline-methods] */
    public void s(AbstractC2795e abstractC2795e, long j10, long j11, int i10) {
        this.f13478k.v(i10 == 0 ? new C2638y(abstractC2795e.f24994a, abstractC2795e.f24995b, j10) : new C2638y(abstractC2795e.f24994a, abstractC2795e.f24995b, abstractC2795e.e(), abstractC2795e.d(), j10, j11, abstractC2795e.a()), abstractC2795e.f24996c, this.f13469b, abstractC2795e.f24997d, abstractC2795e.f24998e, abstractC2795e.f24999f, abstractC2795e.f25000g, abstractC2795e.f25001h, i10);
    }

    @Override // a2.d0
    public boolean d() {
        return this.f13477j.j();
    }

    public void d0() {
        this.f13495x.clear();
    }

    @Override // a2.d0
    public boolean e(F0 f02) {
        List list;
        long j10;
        long j11;
        if (this.f13467Z || this.f13477j.j() || this.f13477j.i()) {
            return false;
        }
        if (R()) {
            List list2 = Collections.EMPTY_LIST;
            long j12 = this.f13464W;
            for (d dVar : this.f13493v) {
                dVar.d0(this.f13464W);
            }
            list = list2;
            j10 = j12;
            j11 = j10;
        } else {
            List list3 = this.f13486o;
            j jVarM = M();
            long jN = (jVarM.g() && jVarM.q()) ? jVarM.n() : Math.max(this.f13463V, jVarM.f25000g);
            long jMax = this.f13463V;
            if (this.f13450C) {
                for (d dVar2 : this.f13493v) {
                    jMax = Math.max(jMax, dVar2.D());
                }
            }
            list = list3;
            j10 = jN;
            j11 = jMax;
        }
        this.f13482m.a();
        this.f13471d.f(f02, j10, j11, list, this.f13451D || !list.isEmpty(), this.f13482m);
        f.b bVar = this.f13482m;
        boolean z10 = bVar.f13369b;
        AbstractC2795e abstractC2795e = bVar.f13368a;
        Uri uri = bVar.f13370c;
        if (z10) {
            this.f13464W = -9223372036854775807L;
            this.f13467Z = true;
            return true;
        }
        if (abstractC2795e == null) {
            if (uri != null) {
                this.f13470c.o(uri);
            }
            return false;
        }
        if (Q(abstractC2795e)) {
            j jVar = (j) abstractC2795e;
            V(jVar);
            P(jVar);
        }
        this.f13492u = abstractC2795e;
        this.f13477j.n(abstractC2795e, this, this.f13476i.b(abstractC2795e.f24996c));
        return true;
    }

    public boolean e0(Uri uri, k.c cVar, boolean z10) {
        k.b bVarC;
        if (this.f13471d.s(uri)) {
            return this.f13471d.u(uri, (z10 || (bVarC = this.f13476i.c(d2.w.c(this.f13471d.m()), cVar)) == null || bVarC.f33626a != 2) ? -9223372036854775807L : bVarC.f33627b);
        }
        return true;
    }

    @Override // i2.r
    public O f(int i10, int i11) {
        O oF;
        if (!f13447o0.contains(Integer.valueOf(i11))) {
            int i12 = 0;
            while (true) {
                O[] oArr = this.f13493v;
                if (i12 >= oArr.length) {
                    oF = null;
                    break;
                }
                if (this.f13494w[i12] == i10) {
                    oF = oArr[i12];
                    break;
                }
                i12++;
            }
        } else {
            oF = N(i10, i11);
        }
        if (oF == null) {
            if (this.f13479k0) {
                return E(i10, i11);
            }
            oF = F(i10, i11);
        }
        if (i11 != 5) {
            return oF;
        }
        if (this.f13497z == null) {
            this.f13497z = new c(oF, this.f13480l);
        }
        return this.f13497z;
    }

    public void f0() {
        if (this.f13484n.isEmpty()) {
            return;
        }
        final j jVar = (j) A.d(this.f13484n);
        int iD = this.f13471d.d(jVar);
        if (iD == 1) {
            if (jVar.q()) {
                return;
            }
            jVar.v(this.f13471d.j(jVar));
        } else if (iD == 0) {
            this.f13489r.post(new Runnable() { // from class: Q1.o
                @Override // java.lang.Runnable
                public final void run() {
                    this.f13442a.f13470c.o(jVar.f13398m);
                }
            });
        } else if (iD == 2 && !this.f13467Z && this.f13477j.j()) {
            this.f13477j.f();
        }
    }

    /*  JADX ERROR: NullPointerException in pass: LoopRegionVisitor
        java.lang.NullPointerException
        */
    @Override // a2.d0
    public long g() {
        /*
            r6 = this;
            boolean r0 = r6.f13467Z
            if (r0 == 0) goto L7
            r0 = -9223372036854775808
            return r0
        L7:
            boolean r0 = r6.R()
            if (r0 == 0) goto L10
            long r0 = r6.f13464W
            return r0
        L10:
            long r0 = r6.f13463V
            Q1.j r2 = r6.M()
            boolean r3 = r2.g()
            if (r3 == 0) goto L1d
            goto L36
        L1d:
            java.util.ArrayList r2 = r6.f13484n
            int r2 = r2.size()
            r3 = 1
            if (r2 <= r3) goto L35
            java.util.ArrayList r2 = r6.f13484n
            int r3 = r2.size()
            int r3 = r3 + (-2)
            java.lang.Object r2 = r2.get(r3)
            Q1.j r2 = (Q1.j) r2
            goto L36
        L35:
            r2 = 0
        L36:
            if (r2 == 0) goto L3e
            long r2 = r2.f25001h
            long r0 = java.lang.Math.max(r0, r2)
        L3e:
            boolean r2 = r6.f13450C
            if (r2 == 0) goto L55
            Q1.s$d[] r6 = r6.f13493v
            int r2 = r6.length
            r3 = 0
        L46:
            if (r3 >= r2) goto L55
            r4 = r6[r3]
            long r4 = r4.C()
            long r0 = java.lang.Math.max(r0, r4)
            int r3 = r3 + 1
            goto L46
        L55:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Q1.s.g():long");
    }

    public final void g0() {
        this.f13450C = true;
        W();
    }

    @Override // a2.d0
    public void h(long j10) {
        if (this.f13477j.i() || R()) {
            return;
        }
        if (this.f13477j.j()) {
            AbstractC0853a.e(this.f13492u);
            if (this.f13471d.z(j10, this.f13492u, this.f13486o)) {
                this.f13477j.f();
                return;
            }
            return;
        }
        int size = this.f13486o.size();
        while (size > 0 && this.f13471d.d((j) this.f13486o.get(size - 1)) == 2) {
            size--;
        }
        if (size < this.f13486o.size()) {
            I(size);
        }
        int i10 = this.f13471d.i(j10, this.f13486o);
        if (i10 < this.f13484n.size()) {
            I(i10);
        }
    }

    public void h0(E[] eArr, int i10, int... iArr) {
        this.f13456I = G(eArr);
        this.f13457J = new HashSet();
        for (int i11 : iArr) {
            this.f13457J.add(this.f13456I.b(i11));
        }
        this.f13459Q = i10;
        Handler handler = this.f13489r;
        final b bVar = this.f13470c;
        Objects.requireNonNull(bVar);
        handler.post(new Runnable() { // from class: Q1.r
            @Override // java.lang.Runnable
            public final void run() {
                bVar.j();
            }
        });
        p0();
    }

    public int i0(int i10, C0 c02, J1.f fVar, int i11) {
        if (R()) {
            return -3;
        }
        int i12 = 0;
        if (!this.f13484n.isEmpty()) {
            int i13 = 0;
            while (i13 < this.f13484n.size() - 1 && K((j) this.f13484n.get(i13))) {
                i13++;
            }
            M.Y0(this.f13484n, 0, i13);
            j jVar = (j) this.f13484n.get(0);
            D1.o oVar = jVar.f24997d;
            if (!oVar.equals(this.f13454G)) {
                this.f13478k.j(this.f13469b, oVar, jVar.f24998e, jVar.f24999f, jVar.f25000g);
            }
            this.f13454G = oVar;
        }
        if (!this.f13484n.isEmpty() && !((j) this.f13484n.get(0)).q()) {
            return -3;
        }
        int iU = this.f13493v[i10].U(c02, fVar, i11, this.f13467Z);
        if (iU == -5) {
            D1.o oVarI = (D1.o) AbstractC0853a.e(c02.f6835b);
            if (i10 == this.f13449B) {
                int iE = N7.g.e(this.f13493v[i10].S());
                while (i12 < this.f13484n.size() && ((j) this.f13484n.get(i12)).f13396k != iE) {
                    i12++;
                }
                oVarI = oVarI.i(i12 < this.f13484n.size() ? ((j) this.f13484n.get(i12)).f24997d : (D1.o) AbstractC0853a.e(this.f13453F));
            }
            c02.f6835b = oVarI;
        }
        return iU;
    }

    @Override // e2.m.f
    public void j() {
        for (d dVar : this.f13493v) {
            dVar.V();
        }
    }

    public void j0() {
        if (this.f13451D) {
            for (d dVar : this.f13493v) {
                dVar.T();
            }
        }
        this.f13471d.v();
        this.f13477j.m(this);
        this.f13489r.removeCallbacksAndMessages(null);
        this.f13455H = true;
        this.f13490s.clear();
    }

    public final void k0() {
        for (d dVar : this.f13493v) {
            dVar.Y(this.f13465X);
        }
        this.f13465X = false;
    }

    public final boolean l0(long j10, j jVar) throws Throwable {
        boolean zB0;
        int length = this.f13493v.length;
        int i10 = 0;
        while (true) {
            boolean z10 = true;
            if (i10 >= length) {
                return true;
            }
            d dVar = this.f13493v[i10];
            if (jVar != null) {
                zB0 = dVar.a0(jVar.m(i10));
            } else {
                long jB = b();
                if (jB != Long.MIN_VALUE && j10 >= jB) {
                    z10 = false;
                }
                zB0 = dVar.b0(j10, z10);
            }
            if (!zB0 && (this.f13462T[i10] || !this.f13460R)) {
                break;
            }
            i10++;
        }
        return false;
    }

    public void m() throws IOException {
        X();
        if (this.f13467Z && !this.f13451D) {
            throw D1.w.a("Loading finished before preparation is complete.", null);
        }
    }

    public boolean m0(long j10, boolean z10) {
        j jVar;
        this.f13463V = j10;
        if (R()) {
            this.f13464W = j10;
            return true;
        }
        if (this.f13471d.n()) {
            for (int i10 = 0; i10 < this.f13484n.size(); i10++) {
                jVar = (j) this.f13484n.get(i10);
                if (jVar.f25000g == j10) {
                    break;
                }
            }
            jVar = null;
        } else {
            jVar = null;
        }
        if (this.f13450C && !z10 && !this.f13484n.isEmpty() && l0(j10, jVar)) {
            return false;
        }
        this.f13464W = j10;
        this.f13467Z = false;
        this.f13484n.clear();
        if (this.f13477j.j()) {
            if (this.f13450C) {
                for (d dVar : this.f13493v) {
                    dVar.s();
                }
            }
            this.f13477j.f();
        } else {
            this.f13477j.g();
            k0();
        }
        return true;
    }

    @Override // i2.r
    public void n() {
        this.f13479k0 = true;
        this.f13489r.post(this.f13488q);
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0118  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean n0(d2.r[] r14, boolean[] r15, a2.c0[] r16, boolean[] r17, long r18, boolean r20) {
        /*
            Method dump skipped, instruction units count: 301
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: Q1.s.n0(d2.r[], boolean[], a2.c0[], boolean[], long, boolean):boolean");
    }

    public void o0(C0753k c0753k) {
        if (Objects.equals(this.f13483m0, c0753k)) {
            return;
        }
        this.f13483m0 = c0753k;
        int i10 = 0;
        while (true) {
            d[] dVarArr = this.f13493v;
            if (i10 >= dVarArr.length) {
                return;
            }
            if (this.f13462T[i10]) {
                dVarArr[i10].k0(c0753k);
            }
            i10++;
        }
    }

    public final void p0() {
        this.f13451D = true;
    }

    public n0 q() {
        z();
        return this.f13456I;
    }

    public void q0(boolean z10) {
        this.f13471d.x(z10);
    }

    @Override // a2.b0.d
    public void r(D1.o oVar) {
        this.f13489r.post(this.f13487p);
    }

    public void r0(long j10) {
        if (this.f13481l0 != j10) {
            this.f13481l0 = j10;
            for (d dVar : this.f13493v) {
                dVar.c0(j10);
            }
        }
    }

    public int s0(int i10, long j10) throws Throwable {
        if (R()) {
            return 0;
        }
        d dVar = this.f13493v[i10];
        int iH = dVar.H(j10, this.f13467Z);
        j jVar = (j) A.e(this.f13484n, null);
        if (jVar != null && !jVar.q()) {
            iH = Math.min(iH, jVar.m(i10) - dVar.F());
        }
        dVar.g0(iH);
        return iH;
    }

    public void t0(int i10) {
        z();
        AbstractC0853a.e(this.f13458P);
        int i11 = this.f13458P[i10];
        AbstractC0853a.g(this.f13461S[i11]);
        this.f13461S[i11] = false;
    }

    public void u(long j10, boolean z10) {
        if (!this.f13450C || R()) {
            return;
        }
        int length = this.f13493v.length;
        for (int i10 = 0; i10 < length; i10++) {
            this.f13493v[i10].r(j10, z10, this.f13461S[i10]);
        }
    }

    public final void u0(c0[] c0VarArr) {
        this.f13490s.clear();
        for (c0 c0Var : c0VarArr) {
            if (c0Var != null) {
                this.f13490s.add((n) c0Var);
            }
        }
    }

    public final void z() {
        AbstractC0853a.g(this.f13451D);
        AbstractC0853a.e(this.f13456I);
        AbstractC0853a.e(this.f13457J);
    }

    @Override // i2.r
    public void v(J j10) {
    }
}
