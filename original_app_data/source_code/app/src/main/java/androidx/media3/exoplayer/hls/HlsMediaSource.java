package androidx.media3.exoplayer.hls;

import D1.r;
import F2.s;
import G1.AbstractC0853a;
import I1.f;
import I1.x;
import P1.u;
import P1.w;
import Q1.c;
import Q1.d;
import Q1.g;
import Q1.h;
import Q1.i;
import Q1.m;
import R1.e;
import R1.f;
import R1.l;
import a2.AbstractC2615a;
import a2.C2625k;
import a2.InterfaceC2610C;
import a2.InterfaceC2611D;
import a2.InterfaceC2624j;
import a2.L;
import a2.M;
import a2.f0;
import android.os.Looper;
import e2.b;
import e2.j;
import e2.k;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class HlsMediaSource extends AbstractC2615a implements l.e {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final h f23664h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final g f23665i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final InterfaceC2624j f23666j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final u f23667k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final k f23668l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f23669m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f23670n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f23671o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final l f23672p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final long f23673q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final long f23674r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public r.g f23675s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public x f23676t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public r f23677u;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class Factory implements M {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final /* synthetic */ int f23678r = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final g f23679c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public h f23680d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public s.a f23681e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f23682f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f23683g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public R1.k f23684h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public l.a f23685i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public InterfaceC2624j f23686j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public w f23687k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public k f23688l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public boolean f23689m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f23690n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public boolean f23691o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public long f23692p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public long f23693q;

        public Factory(f.a aVar) {
            this(new c(aVar));
        }

        @Override // a2.InterfaceC2611D.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public HlsMediaSource f(r rVar) {
            AbstractC0853a.e(rVar.f1873b);
            if (this.f23680d == null) {
                this.f23680d = new d();
            }
            s.a aVar = this.f23681e;
            if (aVar != null) {
                this.f23680d.a(aVar);
            }
            this.f23680d.b(this.f23682f);
            this.f23680d.c(this.f23683g);
            h hVar = this.f23680d;
            R1.k eVar = this.f23684h;
            List list = rVar.f1873b.f1971d;
            if (!list.isEmpty()) {
                eVar = new e(eVar, list);
            }
            g gVar = this.f23679c;
            InterfaceC2624j interfaceC2624j = this.f23686j;
            u uVarA = this.f23687k.a(rVar);
            k kVar = this.f23688l;
            return new HlsMediaSource(rVar, gVar, hVar, interfaceC2624j, null, uVarA, kVar, this.f23685i.a(this.f23679c, kVar, eVar, null), this.f23692p, this.f23689m, this.f23690n, this.f23691o, this.f23693q);
        }

        @Override // a2.InterfaceC2611D.a
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public Factory b(boolean z10) {
            this.f23682f = z10;
            return this;
        }

        @Override // a2.InterfaceC2611D.a
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public Factory c(int i10) {
            this.f23683g = i10;
            return this;
        }

        @Override // a2.InterfaceC2611D.a
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public Factory d(w wVar) {
            this.f23687k = (w) AbstractC0853a.f(wVar, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior.");
            return this;
        }

        @Override // a2.InterfaceC2611D.a
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public Factory e(k kVar) {
            this.f23688l = (k) AbstractC0853a.f(kVar, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
            return this;
        }

        @Override // a2.InterfaceC2611D.a
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public Factory a(s.a aVar) {
            this.f23681e = aVar;
            return this;
        }

        public Factory(g gVar) {
            this.f23679c = (g) AbstractC0853a.e(gVar);
            this.f23687k = new P1.l();
            this.f23684h = new R1.a();
            this.f23685i = R1.c.f14285p;
            this.f23688l = new j();
            this.f23686j = new C2625k();
            this.f23690n = 1;
            this.f23692p = -9223372036854775807L;
            this.f23689m = true;
            b(true);
        }
    }

    static {
        D1.s.a("media3.exoplayer.hls");
    }

    public static f.d I(List list, long j10) {
        f.d dVar = null;
        for (int i10 = 0; i10 < list.size(); i10++) {
            f.d dVar2 = (f.d) list.get(i10);
            long j11 = dVar2.f14387e;
            if (j11 > j10 || !dVar2.f14376l) {
                if (j11 > j10) {
                    break;
                }
            } else {
                dVar = dVar2;
            }
        }
        return dVar;
    }

    public static f.C0178f J(List list, long j10) {
        return (f.C0178f) list.get(G1.M.f(list, Long.valueOf(j10), true, true));
    }

    public static long M(R1.f fVar, long j10) {
        long j11;
        f.h hVar = fVar.f14336v;
        long j12 = fVar.f14319e;
        if (j12 != -9223372036854775807L) {
            j11 = fVar.f14335u - j12;
        } else {
            long j13 = hVar.f14397d;
            if (j13 == -9223372036854775807L || fVar.f14328n == -9223372036854775807L) {
                long j14 = hVar.f14396c;
                j11 = j14 != -9223372036854775807L ? j14 : fVar.f14327m * 3;
            } else {
                j11 = j13;
            }
        }
        return j11 + j10;
    }

    @Override // a2.AbstractC2615a
    public void D(x xVar) {
        this.f23676t = xVar;
        this.f23667k.c((Looper) AbstractC0853a.e(Looper.myLooper()), B());
        this.f23667k.u();
        this.f23672p.l(((r.h) AbstractC0853a.e(f().f1873b)).f1968a, y(null), this);
    }

    @Override // a2.AbstractC2615a
    public void F() {
        this.f23672p.stop();
        this.f23667k.release();
    }

    public final f0 G(R1.f fVar, long j10, long j11, i iVar) {
        long jC = fVar.f14322h - this.f23672p.c();
        long j12 = fVar.f14329o ? jC + fVar.f14335u : -9223372036854775807L;
        long jK = K(fVar);
        long j13 = this.f23675s.f1950a;
        N(fVar, G1.M.p(j13 != -9223372036854775807L ? G1.M.M0(j13) : M(fVar, jK), jK, fVar.f14335u + jK));
        return new f0(j10, j11, -9223372036854775807L, j12, fVar.f14335u, jC, L(fVar, jK), true, !fVar.f14329o, fVar.f14318d == 2 && fVar.f14320f, iVar, f(), this.f23675s);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final a2.f0 H(R1.f r25, long r26, long r28, Q1.i r30) {
        /*
            r24 = this;
            r0 = r25
            long r1 = r0.f14319e
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L31
            java.util.List r1 = r0.f14332r
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L16
            goto L31
        L16:
            boolean r1 = r0.f14321g
            if (r1 != 0) goto L2e
            long r1 = r0.f14319e
            long r3 = r0.f14335u
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 != 0) goto L23
            goto L2e
        L23:
            java.util.List r3 = r0.f14332r
            R1.f$f r1 = J(r3, r1)
            long r1 = r1.f14387e
        L2b:
            r16 = r1
            goto L34
        L2e:
            long r1 = r0.f14319e
            goto L2b
        L31:
            r1 = 0
            goto L2b
        L34:
            a2.f0 r3 = new a2.f0
            long r10 = r0.f14335u
            D1.r r22 = r24.f()
            r23 = 0
            r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r14 = 0
            r18 = 1
            r19 = 0
            r20 = 1
            r12 = r10
            r4 = r26
            r6 = r28
            r21 = r30
            r3.<init>(r4, r6, r8, r10, r12, r14, r16, r18, r19, r20, r21, r22, r23)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.hls.HlsMediaSource.H(R1.f, long, long, Q1.i):a2.f0");
    }

    public final long K(R1.f fVar) {
        if (fVar.f14330p) {
            return G1.M.M0(G1.M.h0(this.f23673q)) - fVar.e();
        }
        return 0L;
    }

    public final long L(R1.f fVar, long j10) {
        long jM0 = fVar.f14319e;
        if (jM0 == -9223372036854775807L) {
            jM0 = (fVar.f14335u + j10) - G1.M.M0(this.f23675s.f1950a);
        }
        if (fVar.f14321g) {
            return jM0;
        }
        f.d dVarI = I(fVar.f14333s, jM0);
        if (dVarI != null) {
            return dVarI.f14387e;
        }
        if (fVar.f14332r.isEmpty()) {
            return 0L;
        }
        f.C0178f c0178fJ = J(fVar.f14332r, jM0);
        f.d dVarI2 = I(c0178fJ.f14382m, jM0);
        return dVarI2 != null ? dVarI2.f14387e : c0178fJ.f14387e;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void N(R1.f r5, long r6) {
        /*
            r4 = this;
            D1.r r0 = r4.f()
            D1.r$g r0 = r0.f1875d
            float r1 = r0.f1953d
            r2 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 != 0) goto L2a
            float r0 = r0.f1954e
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L2a
            R1.f$h r5 = r5.f14336v
            long r0 = r5.f14396c
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L2a
            long r0 = r5.f14397d
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 != 0) goto L2a
            r5 = 1
            goto L2b
        L2a:
            r5 = 0
        L2b:
            D1.r$g$a r0 = new D1.r$g$a
            r0.<init>()
            long r6 = G1.M.o1(r6)
            D1.r$g$a r6 = r0.k(r6)
            r7 = 1065353216(0x3f800000, float:1.0)
            if (r5 == 0) goto L3e
            r0 = r7
            goto L42
        L3e:
            D1.r$g r0 = r4.f23675s
            float r0 = r0.f1953d
        L42:
            D1.r$g$a r6 = r6.j(r0)
            if (r5 == 0) goto L49
            goto L4d
        L49:
            D1.r$g r5 = r4.f23675s
            float r7 = r5.f1954e
        L4d:
            D1.r$g$a r5 = r6.h(r7)
            D1.r$g r5 = r5.f()
            r4.f23675s = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.hls.HlsMediaSource.N(R1.f, long):void");
    }

    @Override // a2.InterfaceC2611D
    public synchronized void b(r rVar) {
        this.f23677u = rVar;
    }

    @Override // a2.InterfaceC2611D
    public synchronized r f() {
        return this.f23677u;
    }

    @Override // R1.l.e
    public void g(R1.f fVar) {
        HlsMediaSource hlsMediaSource;
        f0 f0VarH;
        long jO1 = fVar.f14330p ? G1.M.o1(fVar.f14322h) : -9223372036854775807L;
        int i10 = fVar.f14318d;
        long j10 = (i10 == 2 || i10 == 1) ? jO1 : -9223372036854775807L;
        i iVar = new i((R1.h) AbstractC0853a.e(this.f23672p.d()), fVar);
        if (this.f23672p.h()) {
            hlsMediaSource = this;
            f0VarH = hlsMediaSource.G(fVar, j10, jO1, iVar);
        } else {
            hlsMediaSource = this;
            f0VarH = hlsMediaSource.H(fVar, j10, jO1, iVar);
        }
        hlsMediaSource.E(f0VarH);
    }

    @Override // a2.InterfaceC2611D
    public void h(InterfaceC2610C interfaceC2610C) {
        ((m) interfaceC2610C).D();
    }

    @Override // a2.InterfaceC2611D
    public InterfaceC2610C k(InterfaceC2611D.b bVar, b bVar2, long j10) {
        L.a aVarY = y(bVar);
        return new m(this.f23664h, this.f23672p, this.f23665i, this.f23676t, null, this.f23667k, v(bVar), this.f23668l, aVarY, bVar2, this.f23666j, this.f23669m, this.f23670n, this.f23671o, B(), this.f23674r);
    }

    @Override // a2.InterfaceC2611D
    public void n() {
        this.f23672p.k();
    }

    public HlsMediaSource(r rVar, g gVar, h hVar, InterfaceC2624j interfaceC2624j, e2.e eVar, u uVar, k kVar, l lVar, long j10, boolean z10, int i10, boolean z11, long j11) {
        this.f23677u = rVar;
        this.f23675s = rVar.f1875d;
        this.f23665i = gVar;
        this.f23664h = hVar;
        this.f23666j = interfaceC2624j;
        this.f23667k = uVar;
        this.f23668l = kVar;
        this.f23672p = lVar;
        this.f23673q = j10;
        this.f23669m = z10;
        this.f23670n = i10;
        this.f23671o = z11;
        this.f23674r = j11;
    }
}
