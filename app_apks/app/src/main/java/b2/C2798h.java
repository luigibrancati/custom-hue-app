package b2;

import D1.v;
import G1.AbstractC0853a;
import G1.M;
import K1.C0;
import K1.F0;
import K1.k1;
import P1.t;
import P1.u;
import a2.C2609B;
import a2.C2638y;
import a2.L;
import a2.b0;
import a2.c0;
import a2.d0;
import e2.k;
import e2.m;
import f2.InterfaceExecutorC3986a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: b2.h, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class C2798h implements c0, d0, m.b, m.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f25005a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f25006b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final D1.o[] f25007c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean[] f25008d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final InterfaceC2799i f25009e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final d0.a f25010f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final L.a f25011g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e2.k f25012h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final e2.m f25013i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final C2797g f25014j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ArrayList f25015k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final List f25016l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final b0 f25017m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final b0[] f25018n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final C2793c f25019o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public AbstractC2795e f25020p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public D1.o f25021q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public b f25022r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f25023s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f25024t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f25025u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public AbstractC2791a f25026v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f25027w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f25028x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f25029y;

    /* JADX INFO: renamed from: b2.h$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface b {
        void a(C2798h c2798h);
    }

    public C2798h(int i10, int[] iArr, D1.o[] oVarArr, InterfaceC2799i interfaceC2799i, d0.a aVar, e2.b bVar, long j10, u uVar, t.a aVar2, e2.k kVar, L.a aVar3, boolean z10, InterfaceExecutorC3986a interfaceExecutorC3986a) {
        this.f25005a = i10;
        int i11 = 0;
        iArr = iArr == null ? new int[0] : iArr;
        this.f25006b = iArr;
        this.f25007c = oVarArr == null ? new D1.o[0] : oVarArr;
        this.f25009e = interfaceC2799i;
        this.f25010f = aVar;
        this.f25011g = aVar3;
        this.f25012h = kVar;
        this.f25027w = z10;
        this.f25013i = interfaceExecutorC3986a != null ? new e2.m(interfaceExecutorC3986a) : new e2.m("ChunkSampleStream");
        this.f25014j = new C2797g();
        ArrayList arrayList = new ArrayList();
        this.f25015k = arrayList;
        this.f25016l = Collections.unmodifiableList(arrayList);
        int length = iArr.length;
        this.f25018n = new b0[length];
        this.f25008d = new boolean[length];
        int i12 = length + 1;
        int[] iArr2 = new int[i12];
        b0[] b0VarArr = new b0[i12];
        b0 b0VarL = b0.l(bVar, uVar, aVar2);
        this.f25017m = b0VarL;
        iArr2[0] = i10;
        b0VarArr[0] = b0VarL;
        while (i11 < length) {
            b0 b0VarM = b0.m(bVar);
            this.f25018n[i11] = b0VarM;
            int i13 = i11 + 1;
            b0VarArr[i13] = b0VarM;
            iArr2[i13] = this.f25006b[i11];
            i11 = i13;
        }
        this.f25019o = new C2793c(iArr2, b0VarArr);
        this.f25023s = j10;
        this.f25024t = j10;
    }

    private void D(int i10) {
        AbstractC0853a.g(!this.f25013i.j());
        int size = this.f25015k.size();
        while (true) {
            if (i10 >= size) {
                i10 = -1;
                break;
            } else if (!I(i10)) {
                break;
            } else {
                i10++;
            }
        }
        if (i10 == -1) {
            return;
        }
        long j10 = H().f25001h;
        AbstractC2791a abstractC2791aE = E(i10);
        if (this.f25015k.isEmpty()) {
            this.f25023s = this.f25024t;
        }
        this.f25029y = false;
        this.f25011g.y(this.f25005a, abstractC2791aE.f25000g, j10);
    }

    private boolean J(AbstractC2795e abstractC2795e) {
        return abstractC2795e instanceof AbstractC2791a;
    }

    private void U() {
        this.f25017m.X();
        for (b0 b0Var : this.f25018n) {
            b0Var.X();
        }
    }

    public boolean B() {
        try {
            return this.f25028x;
        } finally {
            this.f25028x = false;
        }
    }

    public final void C(int i10) {
        int iMin = Math.min(R(i10, 0), this.f25025u);
        if (iMin > 0) {
            M.Y0(this.f25015k, 0, iMin);
            this.f25025u -= iMin;
        }
    }

    public final AbstractC2791a E(int i10) {
        AbstractC2791a abstractC2791a = (AbstractC2791a) this.f25015k.get(i10);
        ArrayList arrayList = this.f25015k;
        M.Y0(arrayList, i10, arrayList.size());
        this.f25025u = Math.max(this.f25025u, this.f25015k.size());
        int i11 = 0;
        this.f25017m.w(abstractC2791a.h(0));
        while (true) {
            b0[] b0VarArr = this.f25018n;
            if (i11 >= b0VarArr.length) {
                return abstractC2791a;
            }
            b0 b0Var = b0VarArr[i11];
            i11++;
            b0Var.w(abstractC2791a.h(i11));
        }
    }

    public void F(long j10) {
        AbstractC0853a.g(!this.f25013i.j());
        if (K() || j10 == -9223372036854775807L || this.f25015k.isEmpty()) {
            return;
        }
        AbstractC2791a abstractC2791aH = H();
        long j11 = abstractC2791aH.f24965l;
        if (j11 == -9223372036854775807L) {
            j11 = abstractC2791aH.f25001h;
        }
        if (j11 <= j10) {
            return;
        }
        long jC = this.f25017m.C();
        if (jC <= j10) {
            return;
        }
        this.f25017m.u(Math.max(j10, this.f25017m.D() + 1));
        for (b0 b0Var : this.f25018n) {
            b0Var.u(Math.max(j10, b0Var.D() + 1));
        }
        this.f25011g.y(this.f25005a, j10, jC);
    }

    public InterfaceC2799i G() {
        return this.f25009e;
    }

    public final AbstractC2791a H() {
        return (AbstractC2791a) this.f25015k.get(r1.size() - 1);
    }

    public final boolean I(int i10) {
        int iF;
        AbstractC2791a abstractC2791a = (AbstractC2791a) this.f25015k.get(i10);
        if (this.f25017m.F() > abstractC2791a.h(0)) {
            return true;
        }
        int i11 = 0;
        do {
            b0[] b0VarArr = this.f25018n;
            if (i11 >= b0VarArr.length) {
                return false;
            }
            iF = b0VarArr[i11].F();
            i11++;
        } while (iF <= abstractC2791a.h(i11));
        return true;
    }

    public boolean K() {
        return this.f25023s != -9223372036854775807L;
    }

    public final void L() {
        int iR = R(this.f25017m.F(), this.f25025u - 1);
        while (true) {
            int i10 = this.f25025u;
            if (i10 > iR) {
                return;
            }
            this.f25025u = i10 + 1;
            M(i10);
        }
    }

    public final void M(int i10) {
        AbstractC2791a abstractC2791a = (AbstractC2791a) this.f25015k.get(i10);
        D1.o oVar = abstractC2791a.f24997d;
        if (!oVar.equals(this.f25021q)) {
            this.f25011g.j(this.f25005a, oVar, abstractC2791a.f24998e, abstractC2791a.f24999f, abstractC2791a.f25000g);
        }
        this.f25021q = oVar;
    }

    @Override // e2.m.b
    /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
    public void t(AbstractC2795e abstractC2795e, long j10, long j11, boolean z10) {
        this.f25020p = null;
        this.f25026v = null;
        C2638y c2638y = new C2638y(abstractC2795e.f24994a, abstractC2795e.f24995b, abstractC2795e.e(), abstractC2795e.d(), j10, j11, abstractC2795e.a());
        this.f25012h.d(abstractC2795e.f24994a);
        this.f25011g.m(c2638y, abstractC2795e.f24996c, this.f25005a, abstractC2795e.f24997d, abstractC2795e.f24998e, abstractC2795e.f24999f, abstractC2795e.f25000g, abstractC2795e.f25001h);
        if (z10) {
            return;
        }
        if (K()) {
            U();
        } else if (J(abstractC2795e)) {
            E(this.f25015k.size() - 1);
            if (this.f25015k.isEmpty()) {
                this.f25023s = this.f25024t;
            }
        }
        this.f25010f.f(this);
    }

    @Override // e2.m.b
    /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
    public void w(AbstractC2795e abstractC2795e, long j10, long j11) {
        this.f25020p = null;
        this.f25009e.e(abstractC2795e);
        C2638y c2638y = new C2638y(abstractC2795e.f24994a, abstractC2795e.f24995b, abstractC2795e.e(), abstractC2795e.d(), j10, j11, abstractC2795e.a());
        this.f25012h.d(abstractC2795e.f24994a);
        this.f25011g.p(c2638y, abstractC2795e.f24996c, this.f25005a, abstractC2795e.f24997d, abstractC2795e.f24998e, abstractC2795e.f24999f, abstractC2795e.f25000g, abstractC2795e.f25001h);
        this.f25010f.f(this);
    }

    @Override // e2.m.b
    /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
    public m.c o(AbstractC2795e abstractC2795e, long j10, long j11, IOException iOException, int i10) {
        m.c cVarH;
        long jA = abstractC2795e.a();
        boolean zJ = J(abstractC2795e);
        int size = this.f25015k.size() - 1;
        boolean z10 = (jA != 0 && zJ && I(size)) ? false : true;
        C2638y c2638y = new C2638y(abstractC2795e.f24994a, abstractC2795e.f24995b, abstractC2795e.e(), abstractC2795e.d(), j10, j11, jA);
        k.c cVar = new k.c(c2638y, new C2609B(abstractC2795e.f24996c, this.f25005a, abstractC2795e.f24997d, abstractC2795e.f24998e, abstractC2795e.f24999f, M.o1(abstractC2795e.f25000g), M.o1(abstractC2795e.f25001h)), iOException, i10);
        if (!this.f25009e.i(abstractC2795e, z10, cVar, this.f25012h)) {
            cVarH = null;
        } else if (z10) {
            cVarH = e2.m.f33634f;
            if (zJ) {
                AbstractC0853a.g(E(size) == abstractC2795e);
                if (this.f25015k.isEmpty()) {
                    this.f25023s = this.f25024t;
                }
            }
        } else {
            G1.t.h("ChunkSampleStream", "Ignoring attempt to cancel non-cancelable load.");
            cVarH = null;
        }
        if (cVarH == null) {
            long jA2 = this.f25012h.a(cVar);
            cVarH = jA2 != -9223372036854775807L ? e2.m.h(false, jA2) : e2.m.f33635g;
        }
        boolean zC = cVarH.c();
        this.f25011g.r(c2638y, abstractC2795e.f24996c, this.f25005a, abstractC2795e.f24997d, abstractC2795e.f24998e, abstractC2795e.f24999f, abstractC2795e.f25000g, abstractC2795e.f25001h, iOException, !zC);
        if (!zC) {
            this.f25020p = null;
            this.f25012h.d(abstractC2795e.f24994a);
            this.f25010f.f(this);
        }
        return cVarH;
    }

    @Override // e2.m.b
    /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
    public void s(AbstractC2795e abstractC2795e, long j10, long j11, int i10) {
        this.f25011g.v(i10 == 0 ? new C2638y(abstractC2795e.f24994a, abstractC2795e.f24995b, j10) : new C2638y(abstractC2795e.f24994a, abstractC2795e.f24995b, abstractC2795e.e(), abstractC2795e.d(), j10, j11, abstractC2795e.a()), abstractC2795e.f24996c, this.f25005a, abstractC2795e.f24997d, abstractC2795e.f24998e, abstractC2795e.f24999f, abstractC2795e.f25000g, abstractC2795e.f25001h, i10);
    }

    public final int R(int i10, int i11) {
        do {
            i11++;
            if (i11 >= this.f25015k.size()) {
                return this.f25015k.size() - 1;
            }
        } while (((AbstractC2791a) this.f25015k.get(i11)).h(0) <= i10);
        return i11 - 1;
    }

    public void S() {
        T(null);
    }

    public void T(b bVar) {
        this.f25022r = bVar;
        this.f25017m.T();
        for (b0 b0Var : this.f25018n) {
            b0Var.T();
        }
        this.f25013i.m(this);
    }

    public void V(long j10) throws Throwable {
        AbstractC2791a abstractC2791a;
        boolean zB0;
        this.f25024t = j10;
        int i10 = 0;
        this.f25027w = false;
        if (K()) {
            this.f25023s = j10;
            return;
        }
        for (int i11 = 0; i11 < this.f25015k.size(); i11++) {
            abstractC2791a = (AbstractC2791a) this.f25015k.get(i11);
            long j11 = abstractC2791a.f25000g;
            if (j11 == j10 && abstractC2791a.f24964k == -9223372036854775807L) {
                break;
            } else {
                if (j11 > j10) {
                    break;
                }
            }
        }
        abstractC2791a = null;
        if (abstractC2791a != null) {
            zB0 = this.f25017m.a0(abstractC2791a.h(0));
        } else {
            long jB = b();
            zB0 = this.f25017m.b0(j10, jB == Long.MIN_VALUE || j10 < jB);
        }
        if (zB0) {
            this.f25025u = R(this.f25017m.F(), 0);
            b0[] b0VarArr = this.f25018n;
            int length = b0VarArr.length;
            while (i10 < length) {
                b0VarArr[i10].b0(j10, true);
                i10++;
            }
            return;
        }
        this.f25023s = j10;
        this.f25029y = false;
        this.f25015k.clear();
        this.f25025u = 0;
        if (!this.f25013i.j()) {
            this.f25013i.g();
            U();
            return;
        }
        this.f25017m.s();
        b0[] b0VarArr2 = this.f25018n;
        int length2 = b0VarArr2.length;
        while (i10 < length2) {
            b0VarArr2[i10].s();
            i10++;
        }
        this.f25013i.f();
    }

    public a W(long j10, int i10) throws Throwable {
        for (int i11 = 0; i11 < this.f25018n.length; i11++) {
            if (this.f25006b[i11] == i10) {
                AbstractC0853a.g(!this.f25008d[i11]);
                this.f25008d[i11] = true;
                this.f25018n[i11].b0(j10, true);
                return new a(this, this.f25018n[i11], i11);
            }
        }
        throw new IllegalStateException();
    }

    @Override // a2.c0
    public void a() throws IOException {
        this.f25013i.a();
        this.f25017m.P();
        if (this.f25013i.j()) {
            return;
        }
        this.f25009e.a();
    }

    @Override // a2.d0
    public long b() {
        if (K()) {
            return this.f25023s;
        }
        if (this.f25029y) {
            return Long.MIN_VALUE;
        }
        return H().f25001h;
    }

    public long c(long j10, k1 k1Var) {
        return this.f25009e.c(j10, k1Var);
    }

    @Override // a2.d0
    public boolean d() {
        return this.f25013i.j();
    }

    @Override // a2.d0
    public boolean e(F0 f02) {
        List list;
        long j10;
        if (this.f25029y || this.f25013i.j() || this.f25013i.i()) {
            return false;
        }
        boolean zK = K();
        if (zK) {
            list = Collections.EMPTY_LIST;
            j10 = this.f25023s;
        } else {
            list = this.f25016l;
            j10 = H().f25001h;
        }
        this.f25009e.f(f02, j10, list, this.f25014j);
        C2797g c2797g = this.f25014j;
        boolean z10 = c2797g.f25004b;
        AbstractC2795e abstractC2795e = c2797g.f25003a;
        c2797g.a();
        if (z10) {
            this.f25023s = -9223372036854775807L;
            this.f25029y = true;
            return true;
        }
        if (abstractC2795e == null) {
            return false;
        }
        this.f25020p = abstractC2795e;
        if (J(abstractC2795e)) {
            AbstractC2791a abstractC2791a = (AbstractC2791a) abstractC2795e;
            if (zK) {
                long j11 = abstractC2791a.f25000g;
                long j12 = this.f25023s;
                if (j11 < j12) {
                    this.f25017m.d0(j12);
                    for (b0 b0Var : this.f25018n) {
                        b0Var.d0(this.f25023s);
                    }
                    if (this.f25027w) {
                        D1.o oVar = abstractC2791a.f24997d;
                        this.f25028x = !v.a(oVar.f1805o, oVar.f1801k);
                    }
                }
                this.f25027w = false;
                this.f25023s = -9223372036854775807L;
            }
            abstractC2791a.j(this.f25019o);
            this.f25015k.add(abstractC2791a);
        } else if (abstractC2795e instanceof l) {
            ((l) abstractC2795e).f(this.f25019o);
        }
        this.f25013i.n(abstractC2795e, this, this.f25012h.b(abstractC2795e.f24996c));
        return true;
    }

    @Override // a2.c0
    public int f(C0 c02, J1.f fVar, int i10) {
        if (K()) {
            return -3;
        }
        AbstractC2791a abstractC2791a = this.f25026v;
        if (abstractC2791a != null && abstractC2791a.h(0) <= this.f25017m.F()) {
            return -3;
        }
        L();
        return this.f25017m.U(c02, fVar, i10, this.f25029y);
    }

    @Override // a2.d0
    public long g() {
        if (this.f25029y) {
            return Long.MIN_VALUE;
        }
        if (K()) {
            return this.f25023s;
        }
        long jMax = this.f25024t;
        AbstractC2791a abstractC2791aH = H();
        if (!abstractC2791aH.g()) {
            if (this.f25015k.size() > 1) {
                abstractC2791aH = (AbstractC2791a) this.f25015k.get(r2.size() - 2);
            } else {
                abstractC2791aH = null;
            }
        }
        if (abstractC2791aH != null) {
            jMax = Math.max(jMax, abstractC2791aH.f25001h);
        }
        return Math.max(jMax, this.f25017m.C());
    }

    @Override // a2.d0
    public void h(long j10) {
        if (this.f25013i.i() || K()) {
            return;
        }
        if (!this.f25013i.j()) {
            int iG = this.f25009e.g(j10, this.f25016l);
            if (iG < this.f25015k.size()) {
                D(iG);
                return;
            }
            return;
        }
        AbstractC2795e abstractC2795e = (AbstractC2795e) AbstractC0853a.e(this.f25020p);
        if (!(J(abstractC2795e) && I(this.f25015k.size() - 1)) && this.f25009e.d(j10, abstractC2795e, this.f25016l)) {
            this.f25013i.f();
            if (J(abstractC2795e)) {
                this.f25026v = (AbstractC2791a) abstractC2795e;
            }
        }
    }

    @Override // a2.c0
    public boolean isReady() {
        return !K() && this.f25017m.N(this.f25029y);
    }

    @Override // e2.m.f
    public void j() {
        this.f25017m.V();
        for (b0 b0Var : this.f25018n) {
            b0Var.V();
        }
        this.f25009e.release();
        b bVar = this.f25022r;
        if (bVar != null) {
            bVar.a(this);
        }
    }

    @Override // a2.c0
    public int n(long j10) throws Throwable {
        if (K()) {
            return 0;
        }
        int iH = this.f25017m.H(j10, this.f25029y);
        AbstractC2791a abstractC2791a = this.f25026v;
        if (abstractC2791a != null) {
            iH = Math.min(iH, abstractC2791a.h(0) - this.f25017m.F());
        }
        this.f25017m.g0(iH);
        L();
        return iH;
    }

    public void u(long j10, boolean z10) {
        if (K()) {
            return;
        }
        int iA = this.f25017m.A();
        this.f25017m.r(j10, z10, true);
        int iA2 = this.f25017m.A();
        if (iA2 > iA) {
            long jB = this.f25017m.B();
            int i10 = 0;
            while (true) {
                b0[] b0VarArr = this.f25018n;
                if (i10 >= b0VarArr.length) {
                    break;
                }
                b0VarArr[i10].r(jB, z10, this.f25008d[i10]);
                i10++;
            }
        }
        C(iA2);
    }

    /* JADX INFO: renamed from: b2.h$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public final class a implements c0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final C2798h f25030a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final b0 f25031b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f25032c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f25033d;

        public a(C2798h c2798h, b0 b0Var, int i10) {
            this.f25030a = c2798h;
            this.f25031b = b0Var;
            this.f25032c = i10;
        }

        private void b() {
            if (this.f25033d) {
                return;
            }
            C2798h.this.f25011g.j(C2798h.this.f25006b[this.f25032c], C2798h.this.f25007c[this.f25032c], 0, null, C2798h.this.f25024t);
            this.f25033d = true;
        }

        public void c() {
            AbstractC0853a.g(C2798h.this.f25008d[this.f25032c]);
            C2798h.this.f25008d[this.f25032c] = false;
        }

        @Override // a2.c0
        public int f(C0 c02, J1.f fVar, int i10) {
            if (C2798h.this.K()) {
                return -3;
            }
            if (C2798h.this.f25026v != null && C2798h.this.f25026v.h(this.f25032c + 1) <= this.f25031b.F()) {
                return -3;
            }
            b();
            return this.f25031b.U(c02, fVar, i10, C2798h.this.f25029y);
        }

        @Override // a2.c0
        public boolean isReady() {
            return !C2798h.this.K() && this.f25031b.N(C2798h.this.f25029y);
        }

        @Override // a2.c0
        public int n(long j10) throws Throwable {
            if (C2798h.this.K()) {
                return 0;
            }
            int iH = this.f25031b.H(j10, C2798h.this.f25029y);
            if (C2798h.this.f25026v != null) {
                iH = Math.min(iH, C2798h.this.f25026v.h(this.f25032c + 1) - this.f25031b.F());
            }
            this.f25031b.g0(iH);
            if (iH > 0) {
                b();
            }
            return iH;
        }

        @Override // a2.c0
        public void a() {
        }
    }
}
