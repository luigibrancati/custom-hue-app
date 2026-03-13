package a2;

import G1.AbstractC0853a;
import I1.f;
import K1.C0;
import K1.F0;
import K1.k1;
import a2.InterfaceC2610C;
import a2.L;
import com.google.android.libraries.barhopper.RecognitionOptions;
import e2.k;
import e2.m;
import f2.InterfaceExecutorC3986a;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class g0 implements InterfaceC2610C, m.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final I1.j f20795a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f.a f20796b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final I1.x f20797c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e2.k f20798d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final L.a f20799e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final n0 f20800f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f20801g = new ArrayList();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f20802h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final e2.m f20803i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final D1.o f20804j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f20805k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f20806l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public byte[] f20807m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f20808n;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public final class b implements c0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f20809a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f20810b;

        public b() {
        }

        @Override // a2.c0
        public void a() throws IOException {
            g0 g0Var = g0.this;
            if (g0Var.f20805k) {
                return;
            }
            g0Var.f20803i.a();
        }

        public final void b() {
            if (this.f20810b) {
                return;
            }
            g0.this.f20799e.j(D1.v.k(g0.this.f20804j.f1805o), g0.this.f20804j, 0, null, 0L);
            this.f20810b = true;
        }

        public void c() {
            if (this.f20809a == 2) {
                this.f20809a = 1;
            }
        }

        @Override // a2.c0
        public int f(C0 c02, J1.f fVar, int i10) {
            b();
            g0 g0Var = g0.this;
            boolean z10 = g0Var.f20806l;
            if (z10 && g0Var.f20807m == null) {
                this.f20809a = 2;
            }
            int i11 = this.f20809a;
            if (i11 == 2) {
                fVar.q(4);
                return -4;
            }
            if ((i10 & 2) != 0 || i11 == 0) {
                c02.f6835b = g0Var.f20804j;
                this.f20809a = 1;
                return -5;
            }
            if (!z10) {
                return -3;
            }
            AbstractC0853a.e(g0Var.f20807m);
            fVar.q(1);
            fVar.f5880f = 0L;
            if ((i10 & 4) == 0) {
                fVar.D(g0.this.f20808n);
                ByteBuffer byteBuffer = fVar.f5878d;
                g0 g0Var2 = g0.this;
                byteBuffer.put(g0Var2.f20807m, 0, g0Var2.f20808n);
            }
            if ((i10 & 1) == 0) {
                this.f20809a = 2;
            }
            return -4;
        }

        @Override // a2.c0
        public boolean isReady() {
            return g0.this.f20806l;
        }

        @Override // a2.c0
        public int n(long j10) {
            b();
            if (j10 <= 0 || this.f20809a == 2) {
                return 0;
            }
            this.f20809a = 2;
            return 1;
        }
    }

    public g0(I1.j jVar, f.a aVar, I1.x xVar, D1.o oVar, long j10, e2.k kVar, L.a aVar2, boolean z10, InterfaceExecutorC3986a interfaceExecutorC3986a) {
        this.f20795a = jVar;
        this.f20796b = aVar;
        this.f20797c = xVar;
        this.f20804j = oVar;
        this.f20802h = j10;
        this.f20798d = kVar;
        this.f20799e = aVar2;
        this.f20805k = z10;
        this.f20800f = new n0(new D1.E(oVar));
        this.f20803i = interfaceExecutorC3986a != null ? new e2.m(interfaceExecutorC3986a) : new e2.m("SingleSampleMediaPeriod");
    }

    @Override // a2.InterfaceC2610C, a2.d0
    public long b() {
        return (this.f20806l || this.f20803i.j()) ? Long.MIN_VALUE : 0L;
    }

    @Override // a2.InterfaceC2610C, a2.d0
    public boolean d() {
        return this.f20803i.j();
    }

    @Override // a2.InterfaceC2610C, a2.d0
    public boolean e(F0 f02) {
        if (this.f20806l || this.f20803i.j() || this.f20803i.i()) {
            return false;
        }
        I1.f fVarA = this.f20796b.a();
        I1.x xVar = this.f20797c;
        if (xVar != null) {
            fVarA.h(xVar);
        }
        this.f20803i.n(new c(this.f20795a, fVarA), this, this.f20798d.b(1));
        return true;
    }

    @Override // e2.m.b
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void t(c cVar, long j10, long j11, boolean z10) {
        I1.w wVar = cVar.f20814c;
        C2638y c2638y = new C2638y(cVar.f20812a, cVar.f20813b, wVar.t(), wVar.u(), j10, j11, wVar.l());
        this.f20798d.d(cVar.f20812a);
        this.f20799e.m(c2638y, 1, -1, null, 0, null, 0L, this.f20802h);
    }

    @Override // a2.InterfaceC2610C, a2.d0
    public long g() {
        return this.f20806l ? Long.MIN_VALUE : 0L;
    }

    @Override // a2.InterfaceC2610C
    public long i(long j10) {
        for (int i10 = 0; i10 < this.f20801g.size(); i10++) {
            ((b) this.f20801g.get(i10)).c();
        }
        return j10;
    }

    @Override // e2.m.b
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public void w(c cVar, long j10, long j11) {
        this.f20808n = (int) cVar.f20814c.l();
        this.f20807m = (byte[]) AbstractC0853a.e(cVar.f20815d);
        this.f20806l = true;
        I1.w wVar = cVar.f20814c;
        C2638y c2638y = new C2638y(cVar.f20812a, cVar.f20813b, wVar.t(), wVar.u(), j10, j11, this.f20808n);
        this.f20798d.d(cVar.f20812a);
        this.f20799e.p(c2638y, 1, -1, this.f20804j, 0, null, 0L, this.f20802h);
    }

    @Override // a2.InterfaceC2610C
    public long k() {
        return -9223372036854775807L;
    }

    @Override // a2.InterfaceC2610C
    public long l(d2.r[] rVarArr, boolean[] zArr, c0[] c0VarArr, boolean[] zArr2, long j10) {
        for (int i10 = 0; i10 < rVarArr.length; i10++) {
            c0 c0Var = c0VarArr[i10];
            if (c0Var != null && (rVarArr[i10] == null || !zArr[i10])) {
                this.f20801g.remove(c0Var);
                c0VarArr[i10] = null;
            }
            if (c0VarArr[i10] == null && rVarArr[i10] != null) {
                b bVar = new b();
                this.f20801g.add(bVar);
                c0VarArr[i10] = bVar;
                zArr2[i10] = true;
            }
        }
        return j10;
    }

    @Override // e2.m.b
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public m.c o(c cVar, long j10, long j11, IOException iOException, int i10) {
        m.c cVarH;
        I1.w wVar = cVar.f20814c;
        C2638y c2638y = new C2638y(cVar.f20812a, cVar.f20813b, wVar.t(), wVar.u(), j10, j11, wVar.l());
        long jA = this.f20798d.a(new k.c(c2638y, new C2609B(1, -1, this.f20804j, 0, null, 0L, G1.M.o1(this.f20802h)), iOException, i10));
        boolean z10 = jA == -9223372036854775807L || i10 >= this.f20798d.b(1);
        if (this.f20805k && z10) {
            G1.t.i("SingleSampleMediaPeriod", "Loading failed, treating as end-of-stream.", iOException);
            this.f20806l = true;
            cVarH = e2.m.f33634f;
        } else {
            cVarH = jA != -9223372036854775807L ? e2.m.h(false, jA) : e2.m.f33635g;
        }
        m.c cVar2 = cVarH;
        boolean zC = cVar2.c();
        this.f20799e.r(c2638y, 1, -1, this.f20804j, 0, null, 0L, this.f20802h, iOException, !zC);
        if (!zC) {
            this.f20798d.d(cVar.f20812a);
        }
        return cVar2;
    }

    @Override // a2.InterfaceC2610C
    public void p(InterfaceC2610C.a aVar, long j10) {
        aVar.n(this);
    }

    @Override // a2.InterfaceC2610C
    public n0 q() {
        return this.f20800f;
    }

    @Override // e2.m.b
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public void s(c cVar, long j10, long j11, int i10) {
        I1.w wVar = cVar.f20814c;
        this.f20799e.v(i10 == 0 ? new C2638y(cVar.f20812a, cVar.f20813b, j10) : new C2638y(cVar.f20812a, cVar.f20813b, wVar.t(), wVar.u(), j10, j11, wVar.l()), 1, -1, this.f20804j, 0, null, 0L, this.f20802h, i10);
    }

    public void v() {
        this.f20803i.l();
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class c implements m.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f20812a = C2638y.a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final I1.j f20813b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final I1.w f20814c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public byte[] f20815d;

        public c(I1.j jVar, I1.f fVar) {
            this.f20813b = jVar;
            this.f20814c = new I1.w(fVar);
        }

        @Override // e2.m.e
        public void load() {
            this.f20814c.v();
            try {
                this.f20814c.f(this.f20813b);
                int i10 = 0;
                while (i10 != -1) {
                    int iL = (int) this.f20814c.l();
                    byte[] bArr = this.f20815d;
                    if (bArr == null) {
                        this.f20815d = new byte[RecognitionOptions.UPC_E];
                    } else if (iL == bArr.length) {
                        this.f20815d = Arrays.copyOf(bArr, bArr.length * 2);
                    }
                    I1.w wVar = this.f20814c;
                    byte[] bArr2 = this.f20815d;
                    i10 = wVar.read(bArr2, iL, bArr2.length - iL);
                }
                I1.i.a(this.f20814c);
            } catch (Throwable th) {
                I1.i.a(this.f20814c);
                throw th;
            }
        }

        @Override // e2.m.e
        public void b() {
        }
    }

    @Override // a2.InterfaceC2610C
    public void m() {
    }

    @Override // a2.InterfaceC2610C, a2.d0
    public void h(long j10) {
    }

    @Override // a2.InterfaceC2610C
    public long c(long j10, k1 k1Var) {
        return j10;
    }

    @Override // a2.InterfaceC2610C
    public void u(long j10, boolean z10) {
    }
}
