package K1;

import D1.D;
import G1.AbstractC0853a;
import K1.H0;
import K1.InterfaceC1032y;
import K7.AbstractC1081v;
import L1.InterfaceC1137a;
import a2.InterfaceC2610C;
import a2.InterfaceC2611D;
import android.util.Pair;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class K0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC1137a f6891c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final G1.p f6892d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final H0.a f6893e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f6894f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f6895g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f6896h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public InterfaceC1032y.c f6897i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public H0 f6898j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public H0 f6899k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public H0 f6900l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public H0 f6901m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public H0 f6902n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f6903o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Object f6904p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f6905q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final D.b f6889a = new D.b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final D.c f6890b = new D.c();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public List f6906r = new ArrayList();

    public K0(InterfaceC1137a interfaceC1137a, G1.p pVar, H0.a aVar, InterfaceC1032y.c cVar) {
        this.f6891c = interfaceC1137a;
        this.f6892d = pVar;
        this.f6893e = aVar;
        this.f6897i = cVar;
    }

    public static boolean H(D.b bVar) {
        int iC = bVar.c();
        if (iC != 0 && ((iC != 1 || !bVar.q(0)) && bVar.r(bVar.o()))) {
            long jI = 0;
            if (bVar.e(0L) == -1) {
                if (bVar.f1453d == 0) {
                    return true;
                }
                int i10 = iC - (bVar.q(iC + (-1)) ? 2 : 1);
                for (int i11 = 0; i11 <= i10; i11++) {
                    jI += bVar.i(i11);
                }
                if (bVar.f1453d <= jI) {
                    return true;
                }
            }
        }
        return false;
    }

    public static InterfaceC2611D.b P(D1.D d10, Object obj, long j10, long j11, D.c cVar, D.b bVar) {
        d10.h(obj, bVar);
        d10.n(bVar.f1452c, cVar);
        for (int iB = d10.b(obj); H(bVar) && iB <= cVar.f1487o; iB++) {
            d10.g(iB, bVar, true);
            obj = AbstractC0853a.e(bVar.f1451b);
        }
        d10.h(obj, bVar);
        int iE = bVar.e(j10);
        return iE == -1 ? new InterfaceC2611D.b(obj, j11, bVar.d(j10)) : new InterfaceC2611D.b(obj, iE, bVar.k(iE), j11);
    }

    public static boolean e(long j10, long j11) {
        return j10 == -9223372036854775807L || j10 == j11;
    }

    public final boolean A(Object obj, D1.D d10) {
        int iC = d10.h(obj, this.f6889a).c();
        int iO = this.f6889a.o();
        if (iC <= 0 || !this.f6889a.r(iO)) {
            return false;
        }
        return iC > 1 || this.f6889a.f(iO) != Long.MIN_VALUE;
    }

    public void B(D1.D d10) {
        H0 h02;
        K0 k02;
        if (this.f6897i.f7398a == -9223372036854775807L || (h02 = this.f6901m) == null) {
            M();
            return;
        }
        ArrayList arrayList = new ArrayList();
        Pair pairI = i(d10, h02.f6863h.f6874a.f20522a, 0L);
        if (pairI == null || d10.n(d10.h(pairI.first, this.f6889a).f1452c, this.f6890b).f()) {
            k02 = this;
        } else {
            long jS = S(pairI.first);
            if (jS == -1) {
                jS = this.f6894f;
                this.f6894f = 1 + jS;
            }
            k02 = this;
            I0 i0R = k02.r(d10, pairI.first, ((Long) pairI.second).longValue(), jS);
            H0 h0O = k02.O(i0R);
            if (h0O == null) {
                h0O = k02.f6893e.a(i0R, (h02.m() + h02.f6863h.f6878e) - i0R.f6875b);
            }
            arrayList.add(h0O);
        }
        k02.L(arrayList);
    }

    public final boolean C(InterfaceC2611D.b bVar) {
        return !bVar.b() && bVar.f20526e == -1;
    }

    public final boolean D(D1.D d10, InterfaceC2611D.b bVar, boolean z10) {
        int iB = d10.b(bVar.f20522a);
        return !d10.n(d10.f(iB, this.f6889a).f1452c, this.f6890b).f1481i && d10.r(iB, this.f6889a, this.f6890b, this.f6895g, this.f6896h) && z10;
    }

    public final boolean E(D1.D d10, InterfaceC2611D.b bVar) {
        if (C(bVar)) {
            return d10.n(d10.h(bVar.f20522a, this.f6889a).f1452c, this.f6890b).f1487o == d10.b(bVar.f20522a);
        }
        return false;
    }

    public boolean F(InterfaceC2610C interfaceC2610C) {
        H0 h02 = this.f6901m;
        return h02 != null && h02.f6856a == interfaceC2610C;
    }

    public boolean G(InterfaceC2610C interfaceC2610C) {
        H0 h02 = this.f6902n;
        return h02 != null && h02.f6856a == interfaceC2610C;
    }

    public void I() {
        H0 h02 = this.f6902n;
        if (h02 == null || h02.t()) {
            this.f6902n = null;
            for (int i10 = 0; i10 < this.f6906r.size(); i10++) {
                H0 h03 = (H0) this.f6906r.get(i10);
                if (!h03.t()) {
                    this.f6902n = h03;
                    return;
                }
            }
        }
    }

    public final void J() {
        final AbstractC1081v.a aVarR = AbstractC1081v.r();
        for (H0 h0K = this.f6898j; h0K != null; h0K = h0K.k()) {
            aVarR.a(h0K.f6863h.f6874a);
        }
        H0 h02 = this.f6899k;
        final InterfaceC2611D.b bVar = h02 == null ? null : h02.f6863h.f6874a;
        this.f6892d.i(new Runnable() { // from class: K1.J0
            @Override // java.lang.Runnable
            public final void run() {
                this.f6885a.f6891c.D(aVarR.k(), bVar);
            }
        });
    }

    public void K(long j10) {
        H0 h02 = this.f6901m;
        if (h02 != null) {
            h02.w(j10);
        }
    }

    public final void L(List list) {
        for (int i10 = 0; i10 < this.f6906r.size(); i10++) {
            ((H0) this.f6906r.get(i10)).x();
        }
        this.f6906r = list;
        this.f6902n = null;
        I();
    }

    public void M() {
        if (this.f6906r.isEmpty()) {
            return;
        }
        L(new ArrayList());
    }

    public int N(H0 h02) {
        AbstractC0853a.i(h02);
        int i10 = 0;
        if (h02.equals(this.f6901m)) {
            return 0;
        }
        this.f6901m = h02;
        while (h02.k() != null) {
            h02 = (H0) AbstractC0853a.e(h02.k());
            if (h02 == this.f6899k) {
                H0 h03 = this.f6898j;
                this.f6899k = h03;
                this.f6900l = h03;
                i10 = 3;
            }
            if (h02 == this.f6900l) {
                this.f6900l = this.f6899k;
                i10 |= 2;
            }
            h02.x();
            this.f6903o--;
        }
        ((H0) AbstractC0853a.e(this.f6901m)).A(null);
        J();
        return i10;
    }

    public final H0 O(I0 i02) {
        for (int i10 = 0; i10 < this.f6906r.size(); i10++) {
            if (((H0) this.f6906r.get(i10)).d(i02)) {
                return (H0) this.f6906r.remove(i10);
            }
        }
        return null;
    }

    public InterfaceC2611D.b Q(D1.D d10, Object obj, long j10) {
        long jR = R(d10, obj);
        d10.h(obj, this.f6889a);
        d10.n(this.f6889a.f1452c, this.f6890b);
        boolean z10 = false;
        for (int iB = d10.b(obj); iB >= this.f6890b.f1486n; iB--) {
            d10.g(iB, this.f6889a, true);
            boolean z11 = this.f6889a.c() > 0;
            z10 |= z11;
            D.b bVar = this.f6889a;
            if (bVar.e(bVar.f1453d) != -1) {
                obj = AbstractC0853a.e(this.f6889a.f1451b);
            }
            if (z10 && (!z11 || this.f6889a.f1453d != 0)) {
                break;
            }
        }
        return P(d10, obj, j10, jR, this.f6890b, this.f6889a);
    }

    public final long R(D1.D d10, Object obj) {
        int iB;
        int i10 = d10.h(obj, this.f6889a).f1452c;
        Object obj2 = this.f6904p;
        if (obj2 != null && (iB = d10.b(obj2)) != -1 && d10.f(iB, this.f6889a).f1452c == i10) {
            return this.f6905q;
        }
        for (H0 h0K = this.f6898j; h0K != null; h0K = h0K.k()) {
            if (h0K.f6857b.equals(obj)) {
                return h0K.f6863h.f6874a.f20525d;
            }
        }
        for (H0 h0K2 = this.f6898j; h0K2 != null; h0K2 = h0K2.k()) {
            int iB2 = d10.b(h0K2.f6857b);
            if (iB2 != -1 && d10.f(iB2, this.f6889a).f1452c == i10) {
                return h0K2.f6863h.f6874a.f20525d;
            }
        }
        long jS = S(obj);
        if (jS != -1) {
            return jS;
        }
        long j10 = this.f6894f;
        this.f6894f = 1 + j10;
        if (this.f6898j == null) {
            this.f6904p = obj;
            this.f6905q = j10;
        }
        return j10;
    }

    public final long S(Object obj) {
        for (int i10 = 0; i10 < this.f6906r.size(); i10++) {
            H0 h02 = (H0) this.f6906r.get(i10);
            if (h02.f6857b.equals(obj)) {
                return h02.f6863h.f6874a.f20525d;
            }
        }
        return -1L;
    }

    public boolean T() {
        H0 h02 = this.f6901m;
        if (h02 != null) {
            return !h02.f6863h.f6883j && h02.s() && this.f6901m.f6863h.f6878e != -9223372036854775807L && this.f6903o < 100;
        }
        return true;
    }

    public final int U(D1.D d10) {
        D1.D d11;
        H0 h0K = this.f6898j;
        if (h0K == null) {
            return 0;
        }
        int iB = d10.b(h0K.f6857b);
        while (true) {
            d11 = d10;
            iB = d11.d(iB, this.f6889a, this.f6890b, this.f6895g, this.f6896h);
            while (((H0) AbstractC0853a.e(h0K)).k() != null && !h0K.f6863h.f6881h) {
                h0K = h0K.k();
            }
            H0 h0K2 = h0K.k();
            if (iB == -1 || h0K2 == null || d11.b(h0K2.f6857b) != iB) {
                break;
            }
            h0K = h0K2;
            d10 = d11;
        }
        int iN = N(h0K);
        h0K.f6863h = z(d11, h0K.f6863h);
        return iN;
    }

    public void V(D1.D d10, InterfaceC1032y.c cVar) {
        this.f6897i = cVar;
        B(d10);
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0094  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int W(D1.D r18, long r19, long r21, long r23) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            K1.H0 r2 = r0.f6898j
            r3 = 0
        L7:
            if (r2 == 0) goto Lb6
            K1.I0 r5 = r2.f6863h
            if (r3 != 0) goto L14
            K1.I0 r3 = r0.z(r1, r5)
            r6 = r19
            goto L25
        L14:
            r6 = r19
            K1.I0 r8 = r0.l(r1, r3, r6)
            if (r8 == 0) goto Lb1
            boolean r9 = r0.f(r5, r8)
            if (r9 != 0) goto L24
            goto Lb1
        L24:
            r3 = r8
        L25:
            long r8 = r5.f6876c
            K1.I0 r8 = r3.a(r8)
            r2.f6863h = r8
            long r8 = r5.f6878e
            long r10 = r3.f6878e
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 == 0) goto La6
            r2.E()
            long r6 = r3.f6878e
            r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r1 != 0) goto L49
            r6 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            goto L4d
        L49:
            long r6 = r2.D(r6)
        L4d:
            K1.H0 r1 = r0.f6899k
            r10 = 1
            r11 = -9223372036854775808
            if (r2 != r1) goto L64
            K1.I0 r1 = r2.f6863h
            boolean r1 = r1.f6880g
            if (r1 != 0) goto L64
            int r1 = (r21 > r11 ? 1 : (r21 == r11 ? 0 : -1))
            if (r1 == 0) goto L62
            int r1 = (r21 > r6 ? 1 : (r21 == r6 ? 0 : -1))
            if (r1 < 0) goto L64
        L62:
            r1 = r10
            goto L65
        L64:
            r1 = 0
        L65:
            K1.H0 r13 = r0.f6900l
            if (r2 != r13) goto L73
            int r13 = (r23 > r11 ? 1 : (r23 == r11 ? 0 : -1))
            if (r13 == 0) goto L71
            int r6 = (r23 > r6 ? 1 : (r23 == r6 ? 0 : -1))
            if (r6 < 0) goto L73
        L71:
            r6 = r10
            goto L74
        L73:
            r6 = 0
        L74:
            int r0 = r0.N(r2)
            if (r0 == 0) goto L7b
            return r0
        L7b:
            long r13 = r5.f6878e
            int r0 = (r13 > r8 ? 1 : (r13 == r8 ? 0 : -1))
            r15 = 0
            if (r0 != 0) goto L94
            long r4 = r5.f6877d
            int r0 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r0 != 0) goto L94
            long r2 = r3.f6877d
            int r0 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r0 == 0) goto L94
            int r0 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r0 == 0) goto L94
            r0 = r10
            goto L95
        L94:
            r0 = r15
        L95:
            if (r1 == 0) goto L9f
            int r1 = (r13 > r8 ? 1 : (r13 == r8 ? 0 : -1))
            if (r1 != 0) goto L9d
            if (r0 == 0) goto L9f
        L9d:
            r4 = r10
            goto La0
        L9f:
            r4 = r15
        La0:
            if (r6 == 0) goto La5
            r0 = r4 | 2
            return r0
        La5:
            return r4
        La6:
            K1.H0 r3 = r2.k()
            r16 = r3
            r3 = r2
            r2 = r16
            goto L7
        Lb1:
            int r0 = r0.N(r3)
            return r0
        Lb6:
            r15 = 0
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: K1.K0.W(D1.D, long, long, long):int");
    }

    public int X(D1.D d10, int i10) {
        this.f6895g = i10;
        return U(d10);
    }

    public int Y(D1.D d10, boolean z10) {
        this.f6896h = z10;
        return U(d10);
    }

    public H0 b() {
        H0 h02 = this.f6898j;
        if (h02 == null) {
            return null;
        }
        if (h02 == this.f6899k) {
            this.f6899k = h02.k();
        }
        H0 h03 = this.f6898j;
        if (h03 == this.f6900l) {
            this.f6900l = h03.k();
        }
        this.f6898j.x();
        int i10 = this.f6903o - 1;
        this.f6903o = i10;
        if (i10 == 0) {
            this.f6901m = null;
            H0 h04 = this.f6898j;
            this.f6904p = h04.f6857b;
            this.f6905q = h04.f6863h.f6874a.f20525d;
        }
        this.f6898j = this.f6898j.k();
        J();
        return this.f6898j;
    }

    public H0 c() {
        this.f6900l = ((H0) AbstractC0853a.i(this.f6900l)).k();
        J();
        return (H0) AbstractC0853a.i(this.f6900l);
    }

    public H0 d() {
        H0 h02 = this.f6900l;
        H0 h03 = this.f6899k;
        if (h02 == h03) {
            this.f6900l = ((H0) AbstractC0853a.i(h03)).k();
        }
        this.f6899k = ((H0) AbstractC0853a.i(this.f6899k)).k();
        J();
        return (H0) AbstractC0853a.i(this.f6899k);
    }

    public final boolean f(I0 i02, I0 i03) {
        return i02.f6875b == i03.f6875b && i02.f6874a.equals(i03.f6874a);
    }

    public void g() {
        if (this.f6903o == 0) {
            return;
        }
        H0 h0K = (H0) AbstractC0853a.i(this.f6898j);
        this.f6904p = h0K.f6857b;
        this.f6905q = h0K.f6863h.f6874a.f20525d;
        while (h0K != null) {
            h0K.x();
            h0K = h0K.k();
        }
        this.f6898j = null;
        this.f6901m = null;
        this.f6899k = null;
        this.f6900l = null;
        this.f6903o = 0;
        J();
    }

    public H0 h(I0 i02) {
        H0 h02 = this.f6901m;
        long jM = h02 == null ? 1000000000000L : (h02.m() + this.f6901m.f6863h.f6878e) - i02.f6875b;
        H0 h0O = O(i02);
        if (h0O == null) {
            h0O = this.f6893e.a(i02, jM);
        } else {
            h0O.f6863h = i02;
            h0O.B(jM);
        }
        H0 h03 = this.f6901m;
        if (h03 != null) {
            h03.A(h0O);
        } else {
            this.f6898j = h0O;
            this.f6899k = h0O;
            this.f6900l = h0O;
        }
        this.f6904p = null;
        this.f6901m = h0O;
        this.f6903o++;
        J();
        return h0O;
    }

    public final Pair i(D1.D d10, Object obj, long j10) {
        int iE = d10.e(d10.h(obj, this.f6889a).f1452c, this.f6895g, this.f6896h);
        if (iE != -1) {
            return d10.k(this.f6890b, this.f6889a, iE, -9223372036854775807L, j10);
        }
        return null;
    }

    public final I0 j(C0986a1 c0986a1) {
        return o(c0986a1.f6989a, c0986a1.f6990b, c0986a1.f6991c, c0986a1.f7007s);
    }

    public final I0 k(D1.D d10, H0 h02, long j10) {
        Object obj;
        long j11;
        I0 i02 = h02.f6863h;
        int iD = d10.d(d10.b(i02.f6874a.f20522a), this.f6889a, this.f6890b, this.f6895g, this.f6896h);
        if (iD == -1) {
            return null;
        }
        int i10 = d10.g(iD, this.f6889a, true).f1452c;
        Object objE = AbstractC0853a.e(this.f6889a.f1451b);
        long j12 = i02.f6874a.f20525d;
        long j13 = 0;
        if (d10.n(i10, this.f6890b).f1486n == iD) {
            Pair pairK = d10.k(this.f6890b, this.f6889a, i10, -9223372036854775807L, Math.max(0L, j10));
            if (pairK == null) {
                return null;
            }
            Object obj2 = pairK.first;
            long jLongValue = ((Long) pairK.second).longValue();
            H0 h0K = h02.k();
            if (h0K == null || !h0K.f6857b.equals(obj2)) {
                long jS = S(obj2);
                if (jS == -1) {
                    jS = this.f6894f;
                    this.f6894f = 1 + jS;
                }
                j12 = jS;
            } else {
                j12 = h0K.f6863h.f6874a.f20525d;
            }
            obj = obj2;
            j11 = jLongValue;
            j13 = -9223372036854775807L;
        } else {
            obj = objE;
            j11 = 0;
        }
        InterfaceC2611D.b bVarP = P(d10, obj, j11, j12, this.f6890b, this.f6889a);
        if (j13 != -9223372036854775807L && i02.f6876c != -9223372036854775807L) {
            boolean zA = A(i02.f6874a.f20522a, d10);
            if (bVarP.b() && zA) {
                j13 = i02.f6876c;
            } else if (zA) {
                j11 = i02.f6876c;
            }
        }
        return o(d10, bVarP, j13, j11);
    }

    public final I0 l(D1.D d10, H0 h02, long j10) {
        I0 i02 = h02.f6863h;
        long jM = (h02.m() + i02.f6878e) - j10;
        return i02.f6881h ? k(d10, h02, jM) : m(d10, h02, jM);
    }

    public final I0 m(D1.D d10, H0 h02, long j10) {
        I0 i02 = h02.f6863h;
        InterfaceC2611D.b bVar = i02.f6874a;
        d10.h(bVar.f20522a, this.f6889a);
        boolean z10 = i02.f6880g;
        if (!bVar.b()) {
            int i10 = bVar.f20526e;
            if (i10 != -1 && this.f6889a.q(i10)) {
                return k(d10, h02, j10);
            }
            int iK = this.f6889a.k(bVar.f20526e);
            boolean z11 = this.f6889a.r(bVar.f20526e) && this.f6889a.h(bVar.f20526e, iK) == 3;
            if (iK == this.f6889a.a(bVar.f20526e) || z11) {
                return q(d10, bVar.f20522a, s(d10, bVar.f20522a, bVar.f20526e), i02.f6878e, bVar.f20525d, false);
            }
            return p(d10, bVar.f20522a, bVar.f20526e, iK, i02.f6878e, bVar.f20525d, z10);
        }
        int i11 = bVar.f20523b;
        int iA = this.f6889a.a(i11);
        if (iA == -1) {
            return null;
        }
        int iL = this.f6889a.l(i11, bVar.f20524c);
        if (iL < iA) {
            return p(d10, bVar.f20522a, i11, iL, i02.f6876c, bVar.f20525d, z10);
        }
        long jLongValue = i02.f6876c;
        if (jLongValue == -9223372036854775807L) {
            D.c cVar = this.f6890b;
            D.b bVar2 = this.f6889a;
            Pair pairK = d10.k(cVar, bVar2, bVar2.f1452c, -9223372036854775807L, Math.max(0L, j10));
            if (pairK == null) {
                return null;
            }
            jLongValue = ((Long) pairK.second).longValue();
        }
        return q(d10, bVar.f20522a, Math.max(s(d10, bVar.f20522a, bVar.f20523b), jLongValue), i02.f6876c, bVar.f20525d, z10);
    }

    public H0 n() {
        return this.f6901m;
    }

    public final I0 o(D1.D d10, InterfaceC2611D.b bVar, long j10, long j11) {
        d10.h(bVar.f20522a, this.f6889a);
        return bVar.b() ? p(d10, bVar.f20522a, bVar.f20523b, bVar.f20524c, j10, bVar.f20525d, false) : q(d10, bVar.f20522a, j11, j10, bVar.f20525d, false);
    }

    public final I0 p(D1.D d10, Object obj, int i10, int i11, long j10, long j11, boolean z10) {
        InterfaceC2611D.b bVar = new InterfaceC2611D.b(obj, i10, i11, j11);
        long jB = d10.h(bVar.f20522a, this.f6889a).b(bVar.f20523b, bVar.f20524c);
        long jG = i11 == this.f6889a.k(i10) ? this.f6889a.g() : 0L;
        boolean zR = this.f6889a.r(bVar.f20523b);
        if (jB != -9223372036854775807L && jG >= jB) {
            jG = Math.max(0L, jB - 1);
        }
        return new I0(bVar, jG, j10, -9223372036854775807L, jB, z10, zR, false, false, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final K1.I0 q(D1.D r26, java.lang.Object r27, long r28, long r30, long r32, boolean r34) {
        /*
            Method dump skipped, instruction units count: 226
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: K1.K0.q(D1.D, java.lang.Object, long, long, long, boolean):K1.I0");
    }

    public final I0 r(D1.D d10, Object obj, long j10, long j11) {
        InterfaceC2611D.b bVarP = P(d10, obj, j10, j11, this.f6890b, this.f6889a);
        return bVarP.b() ? p(d10, bVarP.f20522a, bVarP.f20523b, bVarP.f20524c, j10, bVarP.f20525d, false) : q(d10, bVarP.f20522a, j10, -9223372036854775807L, bVarP.f20525d, false);
    }

    public final long s(D1.D d10, Object obj, int i10) {
        d10.h(obj, this.f6889a);
        long jF = this.f6889a.f(i10);
        return jF == Long.MIN_VALUE ? this.f6889a.f1453d : jF + this.f6889a.i(i10);
    }

    public I0 t(long j10, C0986a1 c0986a1) {
        H0 h02 = this.f6901m;
        return h02 == null ? j(c0986a1) : l(c0986a1.f6989a, h02, j10);
    }

    public H0 u() {
        return this.f6898j;
    }

    public H0 v(InterfaceC2610C interfaceC2610C) {
        for (int i10 = 0; i10 < this.f6906r.size(); i10++) {
            H0 h02 = (H0) this.f6906r.get(i10);
            if (h02.f6856a == interfaceC2610C) {
                return h02;
            }
        }
        return null;
    }

    public H0 w() {
        return this.f6902n;
    }

    public H0 x() {
        return this.f6900l;
    }

    public H0 y() {
        return this.f6899k;
    }

    public I0 z(D1.D d10, I0 i02) {
        boolean zR;
        int i10;
        InterfaceC2611D.b bVar = i02.f6874a;
        boolean zC = C(bVar);
        boolean zE = E(d10, bVar);
        boolean zD = D(d10, bVar, zC);
        d10.h(i02.f6874a.f20522a, this.f6889a);
        long jF = (bVar.b() || (i10 = bVar.f20526e) == -1) ? -9223372036854775807L : this.f6889a.f(i10);
        long jB = bVar.b() ? this.f6889a.b(bVar.f20523b, bVar.f20524c) : (jF == -9223372036854775807L || jF == Long.MIN_VALUE) ? this.f6889a.j() : jF;
        if (bVar.b()) {
            zR = this.f6889a.r(bVar.f20523b);
        } else {
            int i11 = bVar.f20526e;
            zR = i11 != -1 && this.f6889a.r(i11);
        }
        return new I0(bVar, i02.f6875b, i02.f6876c, jF, jB, i02.f6879f, zR, zC, zE, zD);
    }
}
