package P2;

import F2.s;
import G1.AbstractC0853a;
import P2.L;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import i2.InterfaceC4336p;
import i2.InterfaceC4337q;
import i2.J;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class K implements InterfaceC4336p {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final i2.u f12730v = new i2.u() { // from class: P2.J
        @Override // i2.u
        public final InterfaceC4336p[] f() {
            return K.b();
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f12731a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f12732b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f12733c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f12734d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final G1.C f12735e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final SparseIntArray f12736f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final L.c f12737g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final s.a f12738h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final SparseArray f12739i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final SparseBooleanArray f12740j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final SparseBooleanArray f12741k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final I f12742l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public H f12743m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public i2.r f12744n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f12745o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f12746p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f12747q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f12748r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public L f12749s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f12750t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f12751u;

    @Deprecated
    public K() {
        this(1, 1, s.a.f3686a, new G1.H(0L), new C1850j(0), 112800);
    }

    public static /* synthetic */ InterfaceC4336p[] b() {
        return new InterfaceC4336p[]{new K(1, s.a.f3686a)};
    }

    public static /* synthetic */ int m(K k10) {
        int i10 = k10.f12745o;
        k10.f12745o = i10 + 1;
        return i10;
    }

    private void y(long j10) {
        if (this.f12747q) {
            return;
        }
        this.f12747q = true;
        if (this.f12742l.b() == -9223372036854775807L) {
            this.f12744n.v(new J.b(this.f12742l.b()));
            return;
        }
        H h10 = new H(this.f12742l.c(), this.f12742l.b(), j10, this.f12751u, this.f12733c);
        this.f12743m = h10;
        this.f12744n.v(h10.b());
    }

    public final boolean A(int i10) {
        return this.f12731a == 2 || this.f12746p || !this.f12741k.get(i10, false);
    }

    @Override // i2.InterfaceC4336p
    public void a(long j10, long j11) {
        H h10;
        AbstractC0853a.g(this.f12731a != 2);
        int size = this.f12734d.size();
        for (int i10 = 0; i10 < size; i10++) {
            G1.H h11 = (G1.H) this.f12734d.get(i10);
            boolean z10 = h11.f() == -9223372036854775807L;
            if (!z10) {
                long jD = h11.d();
                z10 = (jD == -9223372036854775807L || jD == 0 || jD == j11) ? false : true;
            }
            if (z10) {
                h11.i(j11);
            }
        }
        if (j11 != 0 && (h10 = this.f12743m) != null) {
            h10.h(j11);
        }
        this.f12735e.W(0);
        this.f12736f.clear();
        for (int i11 = 0; i11 < this.f12739i.size(); i11++) {
            ((L) this.f12739i.valueAt(i11)).b();
        }
        this.f12750t = 0;
    }

    @Override // i2.InterfaceC4336p
    public void c(i2.r rVar) {
        if ((this.f12732b & 1) == 0) {
            rVar = new F2.t(rVar, this.f12738h);
        }
        this.f12744n = rVar;
    }

    @Override // i2.InterfaceC4336p
    public int i(InterfaceC4337q interfaceC4337q, i2.I i10) throws D1.w {
        int i11;
        long length = interfaceC4337q.getLength();
        boolean z10 = this.f12731a == 2;
        if (this.f12746p) {
            if (length != -1 && !z10 && !this.f12742l.d()) {
                return this.f12742l.e(interfaceC4337q, i10, this.f12751u);
            }
            y(length);
            if (this.f12748r) {
                this.f12748r = false;
                a(0L, 0L);
                if (interfaceC4337q.getPosition() != 0) {
                    i10.f36871a = 0L;
                    return 1;
                }
            }
            H h10 = this.f12743m;
            if (h10 != null && h10.d()) {
                return this.f12743m.c(interfaceC4337q, i10);
            }
        }
        if (!w(interfaceC4337q)) {
            for (int i12 = 0; i12 < this.f12739i.size(); i12++) {
                L l10 = (L) this.f12739i.valueAt(i12);
                if (l10 instanceof y) {
                    y yVar = (y) l10;
                    if (yVar.d(z10)) {
                        yVar.a(new G1.C(), 1);
                    }
                }
            }
            return -1;
        }
        int iX = x();
        int iJ = this.f12735e.j();
        if (iX > iJ) {
            return 0;
        }
        int iU = this.f12735e.u();
        if ((8388608 & iU) != 0) {
            this.f12735e.a0(iX);
            return 0;
        }
        int i13 = (4194304 & iU) != 0 ? 1 : 0;
        int i14 = (2096896 & iU) >> 8;
        boolean z11 = (iU & 32) != 0;
        L l11 = (iU & 16) != 0 ? (L) this.f12739i.get(i14) : null;
        if (l11 == null) {
            this.f12735e.a0(iX);
            return 0;
        }
        if (this.f12731a != 2) {
            int i15 = iU & 15;
            i11 = 0;
            int i16 = this.f12736f.get(i14, i15 - 1);
            this.f12736f.put(i14, i15);
            if (i16 == i15) {
                this.f12735e.a0(iX);
                return 0;
            }
            if (i15 != ((i16 + 1) & 15)) {
                l11.b();
            }
        } else {
            i11 = 0;
        }
        if (z11) {
            int iL = this.f12735e.L();
            i13 |= (this.f12735e.L() & 64) != 0 ? 2 : i11;
            this.f12735e.b0(iL - 1);
        }
        boolean z12 = this.f12746p;
        if (A(i14)) {
            this.f12735e.Z(iX);
            l11.a(this.f12735e, i13);
            this.f12735e.Z(iJ);
        }
        if (this.f12731a != 2 && !z12 && this.f12746p && length != -1) {
            this.f12748r = true;
        }
        this.f12735e.a0(iX);
        return i11;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001e, code lost:
    
        r0 = r0 + 1;
     */
    @Override // i2.InterfaceC4336p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean j(i2.InterfaceC4337q r6) {
        /*
            r5 = this;
            G1.C r5 = r5.f12735e
            byte[] r5 = r5.f()
            r0 = 940(0x3ac, float:1.317E-42)
            r1 = 0
            r6.s(r5, r1, r0)
            r0 = r1
        Ld:
            r2 = 188(0xbc, float:2.63E-43)
            if (r0 >= r2) goto L29
            r2 = r1
        L12:
            r3 = 5
            if (r2 >= r3) goto L24
            int r3 = r2 * 188
            int r3 = r3 + r0
            r3 = r5[r3]
            r4 = 71
            if (r3 == r4) goto L21
            int r0 = r0 + 1
            goto Ld
        L21:
            int r2 = r2 + 1
            goto L12
        L24:
            r6.q(r0)
            r5 = 1
            return r5
        L29:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: P2.K.j(i2.q):boolean");
    }

    public final boolean w(InterfaceC4337q interfaceC4337q) {
        byte[] bArrF = this.f12735e.f();
        if (9400 - this.f12735e.g() < 188) {
            int iA = this.f12735e.a();
            if (iA > 0) {
                System.arraycopy(bArrF, this.f12735e.g(), bArrF, 0, iA);
            }
            this.f12735e.Y(bArrF, iA);
        }
        while (this.f12735e.a() < 188) {
            int iJ = this.f12735e.j();
            int i10 = interfaceC4337q.read(bArrF, iJ, 9400 - iJ);
            if (i10 == -1) {
                return false;
            }
            this.f12735e.Z(iJ + i10);
        }
        return true;
    }

    public final int x() throws D1.w {
        int iG = this.f12735e.g();
        int iJ = this.f12735e.j();
        int iA = M.a(this.f12735e.f(), iG, iJ);
        this.f12735e.a0(iA);
        int i10 = iA + 188;
        if (i10 <= iJ) {
            this.f12750t = 0;
            return i10;
        }
        int i11 = this.f12750t + (iA - iG);
        this.f12750t = i11;
        if (this.f12731a != 2 || i11 <= 376) {
            return i10;
        }
        throw D1.w.a("Cannot find sync byte. Most likely not a Transport Stream.", null);
    }

    public final void z() {
        this.f12740j.clear();
        this.f12739i.clear();
        SparseArray sparseArrayB = this.f12737g.b();
        int size = sparseArrayB.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f12739i.put(sparseArrayB.keyAt(i10), (L) sparseArrayB.valueAt(i10));
        }
        this.f12739i.put(0, new E(new a()));
        this.f12749s = null;
    }

    public K(int i10, s.a aVar) {
        this(1, i10, aVar, new G1.H(0L), new C1850j(0), 112800);
    }

    public K(int i10, int i11, s.a aVar, G1.H h10, L.c cVar, int i12) {
        this.f12737g = (L.c) AbstractC0853a.e(cVar);
        this.f12733c = i12;
        this.f12731a = i10;
        this.f12732b = i11;
        this.f12738h = aVar;
        if (i10 != 1 && i10 != 2) {
            ArrayList arrayList = new ArrayList();
            this.f12734d = arrayList;
            arrayList.add(h10);
        } else {
            this.f12734d = Collections.singletonList(h10);
        }
        this.f12735e = new G1.C(new byte[9400], 0);
        this.f12740j = new SparseBooleanArray();
        this.f12741k = new SparseBooleanArray();
        this.f12739i = new SparseArray();
        this.f12736f = new SparseIntArray();
        this.f12742l = new I(i12);
        this.f12744n = i2.r.f37046i0;
        this.f12751u = -1;
        z();
    }

    @Override // i2.InterfaceC4336p
    public void release() {
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a implements D {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final G1.B f12752a = new G1.B(new byte[4]);

        public a() {
        }

        @Override // P2.D
        public void a(G1.C c10) {
            if (c10.L() == 0 && (c10.L() & 128) != 0) {
                c10.b0(6);
                int iA = c10.a() / 4;
                for (int i10 = 0; i10 < iA; i10++) {
                    c10.p(this.f12752a, 4);
                    int iH = this.f12752a.h(16);
                    this.f12752a.r(3);
                    if (iH == 0) {
                        this.f12752a.r(13);
                    } else {
                        int iH2 = this.f12752a.h(13);
                        if (K.this.f12739i.get(iH2) == null) {
                            K.this.f12739i.put(iH2, new E(K.this.new b(iH2)));
                            K.m(K.this);
                        }
                    }
                }
                if (K.this.f12731a != 2) {
                    K.this.f12739i.remove(0);
                }
            }
        }

        @Override // P2.D
        public void c(G1.H h10, i2.r rVar, L.d dVar) {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class b implements D {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final G1.B f12754a = new G1.B(new byte[5]);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final SparseArray f12755b = new SparseArray();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final SparseIntArray f12756c = new SparseIntArray();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f12757d;

        public b(int i10) {
            this.f12757d = i10;
        }

        @Override // P2.D
        public void a(G1.C c10) {
            G1.H h10;
            if (c10.L() != 2) {
                return;
            }
            if (K.this.f12731a == 1 || K.this.f12731a == 2 || K.this.f12745o == 1) {
                h10 = (G1.H) K.this.f12734d.get(0);
            } else {
                h10 = new G1.H(((G1.H) K.this.f12734d.get(0)).d());
                K.this.f12734d.add(h10);
            }
            if ((c10.L() & 128) == 0) {
                return;
            }
            c10.b0(1);
            int iT = c10.T();
            int i10 = 3;
            c10.b0(3);
            c10.p(this.f12754a, 2);
            this.f12754a.r(3);
            int i11 = 13;
            K.this.f12751u = this.f12754a.h(13);
            c10.p(this.f12754a, 2);
            int i12 = 4;
            this.f12754a.r(4);
            c10.b0(this.f12754a.h(12));
            if (K.this.f12731a == 2 && K.this.f12749s == null) {
                L.b bVar = new L.b(21, null, 0, null, G1.M.f4267f);
                K k10 = K.this;
                k10.f12749s = k10.f12737g.a(21, bVar);
                if (K.this.f12749s != null) {
                    K.this.f12749s.c(h10, K.this.f12744n, new L.d(iT, 21, 8192));
                }
            }
            this.f12755b.clear();
            this.f12756c.clear();
            int iA = c10.a();
            while (iA > 0) {
                c10.p(this.f12754a, 5);
                int iH = this.f12754a.h(8);
                this.f12754a.r(i10);
                int iH2 = this.f12754a.h(i11);
                this.f12754a.r(i12);
                int iH3 = this.f12754a.h(12);
                L.b bVarB = b(c10, iH3);
                if (iH == 6 || iH == 5) {
                    iH = bVarB.f12762a;
                }
                iA -= iH3 + 5;
                int i13 = K.this.f12731a == 2 ? iH : iH2;
                if (!K.this.f12740j.get(i13)) {
                    L lA = (K.this.f12731a == 2 && iH == 21) ? K.this.f12749s : K.this.f12737g.a(iH, bVarB);
                    if (K.this.f12731a != 2 || iH2 < this.f12756c.get(i13, 8192)) {
                        this.f12756c.put(i13, iH2);
                        this.f12755b.put(i13, lA);
                    }
                }
                i10 = 3;
                i12 = 4;
                i11 = 13;
            }
            int size = this.f12756c.size();
            for (int i14 = 0; i14 < size; i14++) {
                int iKeyAt = this.f12756c.keyAt(i14);
                int iValueAt = this.f12756c.valueAt(i14);
                K.this.f12740j.put(iKeyAt, true);
                K.this.f12741k.put(iValueAt, true);
                L l10 = (L) this.f12755b.valueAt(i14);
                if (l10 != null) {
                    if (l10 != K.this.f12749s) {
                        l10.c(h10, K.this.f12744n, new L.d(iT, iKeyAt, 8192));
                    }
                    K.this.f12739i.put(iValueAt, l10);
                }
            }
            if (K.this.f12731a == 2) {
                if (K.this.f12746p) {
                    return;
                }
                K.this.f12744n.n();
                K.this.f12745o = 0;
                K.this.f12746p = true;
                return;
            }
            K.this.f12739i.remove(this.f12757d);
            K k11 = K.this;
            k11.f12745o = k11.f12731a == 1 ? 0 : K.this.f12745o - 1;
            if (K.this.f12745o == 0) {
                K.this.f12744n.n();
                K.this.f12746p = true;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x0047  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0059  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0060  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final P2.L.b b(G1.C r14, int r15) {
            /*
                Method dump skipped, instruction units count: 232
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: P2.K.b.b(G1.C, int):P2.L$b");
        }

        @Override // P2.D
        public void c(G1.H h10, i2.r rVar, L.d dVar) {
        }
    }
}
