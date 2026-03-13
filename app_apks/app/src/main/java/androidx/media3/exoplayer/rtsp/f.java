package androidx.media3.exoplayer.rtsp;

import D1.E;
import D1.o;
import G1.AbstractC0853a;
import G1.M;
import K1.C0;
import K1.F0;
import K1.k1;
import K7.AbstractC1081v;
import W1.n;
import W1.u;
import W1.v;
import a2.InterfaceC2610C;
import a2.b0;
import a2.c0;
import a2.n0;
import android.net.Uri;
import android.os.Handler;
import androidx.media3.exoplayer.rtsp.RtspMediaSource;
import androidx.media3.exoplayer.rtsp.a;
import androidx.media3.exoplayer.rtsp.b;
import androidx.media3.exoplayer.rtsp.d;
import androidx.media3.exoplayer.rtsp.f;
import androidx.media3.exoplayer.rtsp.g;
import e2.m;
import i2.J;
import i2.O;
import i2.r;
import java.io.IOException;
import java.net.BindException;
import java.util.ArrayList;
import java.util.List;
import javax.net.SocketFactory;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class f implements InterfaceC2610C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e2.b f23760a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f23761b = M.z();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f23762c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final androidx.media3.exoplayer.rtsp.d f23763d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f23764e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f23765f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final d f23766g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final a.InterfaceC0301a f23767h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public InterfaceC2610C.a f23768i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public AbstractC1081v f23769j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public IOException f23770k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public RtspMediaSource.c f23771l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f23772m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f23773n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f23774o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f23775p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f23776q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f23777r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f23778s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f23779t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f23780u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f23781v;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public final class b implements r {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final O f23782a;

        @Override // i2.r
        public O f(int i10, int i11) {
            return this.f23782a;
        }

        @Override // i2.r
        public void n() {
            Handler handler = f.this.f23761b;
            final f fVar = f.this;
            handler.post(new Runnable() { // from class: W1.k
                @Override // java.lang.Runnable
                public final void run() {
                    fVar.T();
                }
            });
        }

        public b(O o10) {
            this.f23782a = o10;
        }

        @Override // i2.r
        public void v(J j10) {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface d {
        void a();

        void b(u uVar);
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final n f23785a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final androidx.media3.exoplayer.rtsp.b f23786b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f23787c;

        public e(n nVar, int i10, O o10, a.InterfaceC0301a interfaceC0301a) {
            this.f23785a = nVar;
            this.f23786b = new androidx.media3.exoplayer.rtsp.b(i10, nVar, new b.a() { // from class: W1.m
                @Override // androidx.media3.exoplayer.rtsp.b.a
                public final void a(String str, androidx.media3.exoplayer.rtsp.a aVar) {
                    f.e.a(this.f17744a, str, aVar);
                }
            }, new b(o10), interfaceC0301a);
        }

        public static /* synthetic */ void a(e eVar, String str, androidx.media3.exoplayer.rtsp.a aVar) {
            eVar.f23787c = str;
            g.b bVarN = aVar.n();
            if (bVarN != null) {
                f.this.f23763d.f1(aVar.c(), bVarN);
                f.this.f23781v = true;
            }
            f.this.U();
        }

        public Uri c() {
            return this.f23786b.f23713b.f17746b;
        }

        public String d() {
            AbstractC0853a.i(this.f23787c);
            return this.f23787c;
        }

        public boolean e() {
            return this.f23787c != null;
        }
    }

    /* JADX INFO: renamed from: androidx.media3.exoplayer.rtsp.f$f, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public final class C0303f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final e f23789a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final e2.m f23790b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final b0 f23791c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f23792d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f23793e;

        public C0303f(n nVar, int i10, a.InterfaceC0301a interfaceC0301a) {
            this.f23790b = new e2.m("ExoPlayer:RtspMediaPeriod:RtspLoaderWrapper " + i10);
            b0 b0VarM = b0.m(f.this.f23760a);
            this.f23791c = b0VarM;
            this.f23789a = f.this.new e(nVar, i10, b0VarM, interfaceC0301a);
            b0VarM.f0(f.this.f23762c);
        }

        public void c() {
            if (this.f23792d) {
                return;
            }
            this.f23789a.f23786b.b();
            this.f23792d = true;
            f.this.b0();
        }

        public long d() {
            return this.f23791c.C();
        }

        public boolean e() {
            return this.f23791c.N(this.f23792d);
        }

        public int f(C0 c02, J1.f fVar, int i10) {
            return this.f23791c.U(c02, fVar, i10, this.f23792d);
        }

        public void g() {
            if (this.f23793e) {
                return;
            }
            this.f23790b.l();
            this.f23791c.V();
            this.f23793e = true;
        }

        public void h() {
            AbstractC0853a.g(this.f23792d);
            this.f23792d = false;
            f.this.b0();
            k();
        }

        public void i(long j10) {
            if (this.f23792d) {
                return;
            }
            this.f23789a.f23786b.c();
            this.f23791c.X();
            this.f23791c.d0(j10);
        }

        public int j(long j10) throws Throwable {
            int iH = this.f23791c.H(j10, this.f23792d);
            this.f23791c.g0(iH);
            return iH;
        }

        public void k() {
            this.f23790b.n(this.f23789a.f23786b, f.this.f23762c, 0);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public final class g implements c0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f23795a;

        public g(int i10) {
            this.f23795a = i10;
        }

        @Override // a2.c0
        public void a() throws RtspMediaSource.c {
            if (f.this.f23771l != null) {
                throw f.this.f23771l;
            }
        }

        @Override // a2.c0
        public int f(C0 c02, J1.f fVar, int i10) {
            return f.this.V(this.f23795a, c02, fVar, i10);
        }

        @Override // a2.c0
        public boolean isReady() {
            return f.this.R(this.f23795a);
        }

        @Override // a2.c0
        public int n(long j10) {
            return f.this.Z(this.f23795a, j10);
        }
    }

    public f(e2.b bVar, a.InterfaceC0301a interfaceC0301a, Uri uri, d dVar, String str, SocketFactory socketFactory, boolean z10) {
        this.f23760a = bVar;
        this.f23767h = interfaceC0301a;
        this.f23766g = dVar;
        c cVar = new c();
        this.f23762c = cVar;
        this.f23763d = new androidx.media3.exoplayer.rtsp.d(cVar, cVar, str, uri, socketFactory, z10);
        this.f23764e = new ArrayList();
        this.f23765f = new ArrayList();
        this.f23773n = -9223372036854775807L;
        this.f23772m = -9223372036854775807L;
        this.f23774o = -9223372036854775807L;
    }

    public static AbstractC1081v P(AbstractC1081v abstractC1081v) {
        AbstractC1081v.a aVar = new AbstractC1081v.a();
        for (int i10 = 0; i10 < abstractC1081v.size(); i10++) {
            aVar.a(new E(Integer.toString(i10), (o) AbstractC0853a.e(((C0303f) abstractC1081v.get(i10)).f23791c.I())));
        }
        return aVar.k();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void T() {
        if (this.f23777r || this.f23778s) {
            return;
        }
        for (int i10 = 0; i10 < this.f23764e.size(); i10++) {
            if (((C0303f) this.f23764e.get(i10)).f23791c.I() == null) {
                return;
            }
        }
        this.f23778s = true;
        this.f23769j = P(AbstractC1081v.v(this.f23764e));
        ((InterfaceC2610C.a) AbstractC0853a.e(this.f23768i)).n(this);
    }

    private boolean a0() {
        return this.f23776q;
    }

    public static /* synthetic */ int j(f fVar) {
        int i10 = fVar.f23780u;
        fVar.f23780u = i10 + 1;
        return i10;
    }

    public final androidx.media3.exoplayer.rtsp.b Q(Uri uri) {
        for (int i10 = 0; i10 < this.f23764e.size(); i10++) {
            if (!((C0303f) this.f23764e.get(i10)).f23792d) {
                e eVar = ((C0303f) this.f23764e.get(i10)).f23789a;
                if (eVar.c().equals(uri)) {
                    return eVar.f23786b;
                }
            }
        }
        return null;
    }

    public boolean R(int i10) {
        return !a0() && ((C0303f) this.f23764e.get(i10)).e();
    }

    public final boolean S() {
        return this.f23773n != -9223372036854775807L;
    }

    public final void U() {
        boolean zE = true;
        for (int i10 = 0; i10 < this.f23765f.size(); i10++) {
            zE &= ((e) this.f23765f.get(i10)).e();
        }
        if (zE && this.f23779t) {
            this.f23763d.j1(this.f23765f);
        }
    }

    public int V(int i10, C0 c02, J1.f fVar, int i11) {
        if (a0()) {
            return -3;
        }
        return ((C0303f) this.f23764e.get(i10)).f(c02, fVar, i11);
    }

    public void W() {
        for (int i10 = 0; i10 < this.f23764e.size(); i10++) {
            ((C0303f) this.f23764e.get(i10)).g();
        }
        M.m(this.f23763d);
        this.f23777r = true;
    }

    public final void X() {
        this.f23781v = true;
        this.f23763d.g1();
        a.InterfaceC0301a interfaceC0301aB = this.f23767h.b();
        if (interfaceC0301aB == null) {
            this.f23771l = new RtspMediaSource.c("No fallback data channel factory for TCP retry");
            return;
        }
        ArrayList arrayList = new ArrayList(this.f23764e.size());
        ArrayList arrayList2 = new ArrayList(this.f23765f.size());
        for (int i10 = 0; i10 < this.f23764e.size(); i10++) {
            C0303f c0303f = (C0303f) this.f23764e.get(i10);
            if (c0303f.f23792d) {
                arrayList.add(c0303f);
            } else {
                C0303f c0303f2 = new C0303f(c0303f.f23789a.f23785a, i10, interfaceC0301aB);
                arrayList.add(c0303f2);
                c0303f2.k();
                if (this.f23765f.contains(c0303f.f23789a)) {
                    arrayList2.add(c0303f2.f23789a);
                }
            }
        }
        AbstractC1081v abstractC1081vV = AbstractC1081v.v(this.f23764e);
        this.f23764e.clear();
        this.f23764e.addAll(arrayList);
        this.f23765f.clear();
        this.f23765f.addAll(arrayList2);
        for (int i11 = 0; i11 < abstractC1081vV.size(); i11++) {
            ((C0303f) abstractC1081vV.get(i11)).c();
        }
    }

    public final boolean Y(long j10) {
        for (int i10 = 0; i10 < this.f23764e.size(); i10++) {
            if (!((C0303f) this.f23764e.get(i10)).f23791c.b0(j10, this.f23775p)) {
                return false;
            }
        }
        return true;
    }

    public int Z(int i10, long j10) {
        if (a0()) {
            return -3;
        }
        return ((C0303f) this.f23764e.get(i10)).j(j10);
    }

    @Override // a2.InterfaceC2610C, a2.d0
    public long b() {
        return g();
    }

    public final void b0() {
        this.f23775p = true;
        for (int i10 = 0; i10 < this.f23764e.size(); i10++) {
            this.f23775p &= ((C0303f) this.f23764e.get(i10)).f23792d;
        }
    }

    @Override // a2.InterfaceC2610C, a2.d0
    public boolean d() {
        if (this.f23775p) {
            return false;
        }
        return this.f23763d.d1() == 2 || this.f23763d.d1() == 1;
    }

    @Override // a2.InterfaceC2610C, a2.d0
    public boolean e(F0 f02) {
        return d();
    }

    @Override // a2.InterfaceC2610C, a2.d0
    public long g() {
        if (this.f23775p || this.f23764e.isEmpty()) {
            return Long.MIN_VALUE;
        }
        long j10 = this.f23772m;
        if (j10 != -9223372036854775807L) {
            return j10;
        }
        boolean z10 = true;
        long jMin = Long.MAX_VALUE;
        for (int i10 = 0; i10 < this.f23764e.size(); i10++) {
            C0303f c0303f = (C0303f) this.f23764e.get(i10);
            if (!c0303f.f23792d) {
                jMin = Math.min(jMin, c0303f.d());
                z10 = false;
            }
        }
        if (z10 || jMin == Long.MIN_VALUE) {
            return 0L;
        }
        return jMin;
    }

    @Override // a2.InterfaceC2610C
    public long i(long j10) {
        if (g() == 0 && !this.f23781v) {
            this.f23774o = j10;
            return j10;
        }
        u(j10, false);
        this.f23772m = j10;
        if (S()) {
            int iD1 = this.f23763d.d1();
            if (iD1 != 1) {
                if (iD1 != 2) {
                    throw new IllegalStateException();
                }
                this.f23773n = j10;
                this.f23763d.h1(j10);
                return j10;
            }
        } else if (!Y(j10)) {
            this.f23773n = j10;
            if (this.f23775p) {
                for (int i10 = 0; i10 < this.f23764e.size(); i10++) {
                    ((C0303f) this.f23764e.get(i10)).h();
                }
                if (this.f23781v) {
                    this.f23763d.l1(M.o1(j10));
                } else {
                    this.f23763d.h1(j10);
                }
            } else {
                this.f23763d.h1(j10);
            }
            for (int i11 = 0; i11 < this.f23764e.size(); i11++) {
                ((C0303f) this.f23764e.get(i11)).i(j10);
            }
        }
        return j10;
    }

    @Override // a2.InterfaceC2610C
    public long k() {
        if (!this.f23776q) {
            return -9223372036854775807L;
        }
        this.f23776q = false;
        return 0L;
    }

    @Override // a2.InterfaceC2610C
    public long l(d2.r[] rVarArr, boolean[] zArr, c0[] c0VarArr, boolean[] zArr2, long j10) {
        for (int i10 = 0; i10 < rVarArr.length; i10++) {
            if (c0VarArr[i10] != null && (rVarArr[i10] == null || !zArr[i10])) {
                c0VarArr[i10] = null;
            }
        }
        this.f23765f.clear();
        for (int i11 = 0; i11 < rVarArr.length; i11++) {
            d2.r rVar = rVarArr[i11];
            if (rVar != null) {
                E eN = rVar.n();
                int iIndexOf = ((AbstractC1081v) AbstractC0853a.e(this.f23769j)).indexOf(eN);
                this.f23765f.add(((C0303f) AbstractC0853a.e((C0303f) this.f23764e.get(iIndexOf))).f23789a);
                if (this.f23769j.contains(eN) && c0VarArr[i11] == null) {
                    c0VarArr[i11] = new g(iIndexOf);
                    zArr2[i11] = true;
                }
            }
        }
        for (int i12 = 0; i12 < this.f23764e.size(); i12++) {
            C0303f c0303f = (C0303f) this.f23764e.get(i12);
            if (!this.f23765f.contains(c0303f.f23789a)) {
                c0303f.c();
            }
        }
        this.f23779t = true;
        if (j10 != 0) {
            this.f23772m = j10;
            this.f23773n = j10;
            this.f23774o = j10;
        }
        U();
        return j10;
    }

    @Override // a2.InterfaceC2610C
    public void m() throws IOException {
        IOException iOException = this.f23770k;
        if (iOException != null) {
            throw iOException;
        }
    }

    @Override // a2.InterfaceC2610C
    public void p(InterfaceC2610C.a aVar, long j10) {
        this.f23768i = aVar;
        try {
            this.f23763d.start();
        } catch (IOException e10) {
            this.f23770k = e10;
            M.m(this.f23763d);
        }
    }

    @Override // a2.InterfaceC2610C
    public n0 q() {
        AbstractC0853a.g(this.f23778s);
        return new n0((E[]) ((AbstractC1081v) AbstractC0853a.e(this.f23769j)).toArray(new E[0]));
    }

    @Override // a2.InterfaceC2610C
    public void u(long j10, boolean z10) {
        if (S()) {
            return;
        }
        for (int i10 = 0; i10 < this.f23764e.size(); i10++) {
            C0303f c0303f = (C0303f) this.f23764e.get(i10);
            if (!c0303f.f23792d) {
                c0303f.f23791c.r(j10, z10, true);
            }
        }
    }

    @Override // a2.InterfaceC2610C, a2.d0
    public void h(long j10) {
    }

    @Override // a2.InterfaceC2610C
    public long c(long j10, k1 k1Var) {
        return j10;
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public final class c implements m.b, b0.d, d.f, d.e {
        public c() {
        }

        @Override // androidx.media3.exoplayer.rtsp.d.e
        public void a(long j10, AbstractC1081v abstractC1081v) {
            ArrayList arrayList = new ArrayList(abstractC1081v.size());
            for (int i10 = 0; i10 < abstractC1081v.size(); i10++) {
                arrayList.add((String) AbstractC0853a.e(((v) abstractC1081v.get(i10)).f17769c.getPath()));
            }
            for (int i11 = 0; i11 < f.this.f23765f.size(); i11++) {
                if (!arrayList.contains(((e) f.this.f23765f.get(i11)).c().getPath())) {
                    f.this.f23766g.a();
                    if (f.this.S()) {
                        f.this.f23776q = true;
                        f.this.f23773n = -9223372036854775807L;
                        f.this.f23772m = -9223372036854775807L;
                        f.this.f23774o = -9223372036854775807L;
                    }
                }
            }
            for (int i12 = 0; i12 < abstractC1081v.size(); i12++) {
                v vVar = (v) abstractC1081v.get(i12);
                androidx.media3.exoplayer.rtsp.b bVarQ = f.this.Q(vVar.f17769c);
                if (bVarQ != null) {
                    bVarQ.f(vVar.f17767a);
                    bVarQ.e(vVar.f17768b);
                    if (f.this.S() && f.this.f23773n == f.this.f23772m) {
                        bVarQ.d(j10, vVar.f17767a);
                    }
                }
            }
            if (!f.this.S()) {
                if (f.this.f23774o == -9223372036854775807L || !f.this.f23781v) {
                    return;
                }
                f fVar = f.this;
                fVar.i(fVar.f23774o);
                f.this.f23774o = -9223372036854775807L;
                return;
            }
            if (f.this.f23773n == f.this.f23772m) {
                f.this.f23773n = -9223372036854775807L;
                f.this.f23772m = -9223372036854775807L;
            } else {
                f.this.f23773n = -9223372036854775807L;
                f fVar2 = f.this;
                fVar2.i(fVar2.f23772m);
            }
        }

        @Override // androidx.media3.exoplayer.rtsp.d.e
        public void b(RtspMediaSource.c cVar) {
            if (!(cVar instanceof RtspMediaSource.d) || f.this.f23781v) {
                f.this.f23771l = cVar;
            } else {
                f.this.X();
            }
        }

        @Override // androidx.media3.exoplayer.rtsp.d.f
        public void c(String str, Throwable th) {
            f.this.f23770k = th == null ? new IOException(str) : new IOException(str, th);
        }

        @Override // androidx.media3.exoplayer.rtsp.d.f
        public void d(u uVar, AbstractC1081v abstractC1081v) {
            for (int i10 = 0; i10 < abstractC1081v.size(); i10++) {
                n nVar = (n) abstractC1081v.get(i10);
                f fVar = f.this;
                C0303f c0303f = fVar.new C0303f(nVar, i10, fVar.f23767h);
                f.this.f23764e.add(c0303f);
                c0303f.k();
            }
            f.this.f23766g.b(uVar);
        }

        @Override // androidx.media3.exoplayer.rtsp.d.e
        public void e() {
            f.this.f23763d.l1(f.this.f23773n != -9223372036854775807L ? M.o1(f.this.f23773n) : f.this.f23774o != -9223372036854775807L ? M.o1(f.this.f23774o) : 0L);
        }

        @Override // e2.m.b
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public void w(androidx.media3.exoplayer.rtsp.b bVar, long j10, long j11) {
            if (f.this.g() == 0) {
                if (f.this.f23781v) {
                    return;
                }
                f.this.X();
                return;
            }
            int i10 = 0;
            while (true) {
                if (i10 >= f.this.f23764e.size()) {
                    break;
                }
                C0303f c0303f = (C0303f) f.this.f23764e.get(i10);
                if (c0303f.f23789a.f23786b == bVar) {
                    c0303f.c();
                    break;
                }
                i10++;
            }
            f.this.f23763d.k1();
        }

        @Override // e2.m.b
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public m.c o(androidx.media3.exoplayer.rtsp.b bVar, long j10, long j11, IOException iOException, int i10) {
            if (!f.this.f23778s) {
                f.this.f23770k = iOException;
            } else if (!(iOException.getCause() instanceof BindException)) {
                f.this.f23771l = new RtspMediaSource.c(bVar.f23713b.f17746b.toString(), iOException);
            } else if (f.j(f.this) < 3) {
                return e2.m.f33632d;
            }
            return e2.m.f33634f;
        }

        @Override // a2.b0.d
        public void r(o oVar) {
            Handler handler = f.this.f23761b;
            final f fVar = f.this;
            handler.post(new Runnable() { // from class: W1.l
                @Override // java.lang.Runnable
                public final void run() {
                    fVar.T();
                }
            });
        }

        @Override // e2.m.b
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public void t(androidx.media3.exoplayer.rtsp.b bVar, long j10, long j11, boolean z10) {
        }
    }
}
