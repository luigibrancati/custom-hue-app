package a2;

import D1.o;
import D1.r;
import F2.s;
import G1.AbstractC0853a;
import I1.f;
import I1.k;
import K7.AbstractC1081v;
import a2.C2620f;
import a2.C2635v;
import a2.InterfaceC2611D;
import a2.X;
import a2.h0;
import a2.r;
import android.content.Context;
import androidx.media3.exoplayer.dash.DashMediaSource;
import androidx.media3.exoplayer.hls.HlsMediaSource;
import androidx.media3.exoplayer.rtsp.RtspMediaSource;
import androidx.media3.exoplayer.smoothstreaming.SsMediaSource;
import i2.C4333m;
import i2.InterfaceC4336p;
import i2.InterfaceC4337q;
import i2.J;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class r implements M {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f20875c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public f.a f20876d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public s.a f20877e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public InterfaceC2611D.a f20878f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public e2.k f20879g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f20880h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f20881i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f20882j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f20883k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f20884l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f20885m;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final i2.u f20886a;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public f.a f20889d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public s.a f20891f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f20892g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public P1.w f20893h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public e2.k f20894i;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Map f20887b = new HashMap();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Map f20888c = new HashMap();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f20890e = true;

        public a(i2.u uVar, s.a aVar) {
            this.f20886a = uVar;
            this.f20891f = aVar;
        }

        public static /* synthetic */ InterfaceC2611D.a c(a aVar, f.a aVar2) {
            aVar.getClass();
            return new X.b(aVar2, aVar.f20886a);
        }

        public InterfaceC2611D.a f(int i10) {
            InterfaceC2611D.a aVar = (InterfaceC2611D.a) this.f20888c.get(Integer.valueOf(i10));
            if (aVar != null) {
                return aVar;
            }
            InterfaceC2611D.a aVar2 = (InterfaceC2611D.a) g(i10).get();
            P1.w wVar = this.f20893h;
            if (wVar != null) {
                aVar2.d(wVar);
            }
            e2.k kVar = this.f20894i;
            if (kVar != null) {
                aVar2.e(kVar);
            }
            aVar2.a(this.f20891f);
            aVar2.b(this.f20890e);
            aVar2.c(this.f20892g);
            this.f20888c.put(Integer.valueOf(i10), aVar2);
            return aVar2;
        }

        public final J7.t g(int i10) {
            J7.t tVar;
            J7.t tVar2;
            J7.t tVar3 = (J7.t) this.f20887b.get(Integer.valueOf(i10));
            if (tVar3 != null) {
                return tVar3;
            }
            final f.a aVar = (f.a) AbstractC0853a.e(this.f20889d);
            if (i10 == 0) {
                int i11 = DashMediaSource.Factory.f23560k;
                final Class clsAsSubclass = DashMediaSource.Factory.class.asSubclass(InterfaceC2611D.a.class);
                tVar = new J7.t() { // from class: a2.m
                    @Override // J7.t
                    public final Object get() {
                        return r.o(clsAsSubclass, aVar);
                    }
                };
            } else if (i10 == 1) {
                int i12 = SsMediaSource.Factory.f23858j;
                final Class clsAsSubclass2 = SsMediaSource.Factory.class.asSubclass(InterfaceC2611D.a.class);
                tVar = new J7.t() { // from class: a2.n
                    @Override // J7.t
                    public final Object get() {
                        return r.o(clsAsSubclass2, aVar);
                    }
                };
            } else {
                if (i10 != 2) {
                    if (i10 == 3) {
                        int i13 = RtspMediaSource.Factory.f23704h;
                        final Class clsAsSubclass3 = RtspMediaSource.Factory.class.asSubclass(InterfaceC2611D.a.class);
                        tVar2 = new J7.t() { // from class: a2.p
                            @Override // J7.t
                            public final Object get() {
                                return r.n(clsAsSubclass3);
                            }
                        };
                    } else {
                        if (i10 != 4) {
                            throw new IllegalArgumentException("Unrecognized contentType: " + i10);
                        }
                        tVar2 = new J7.t() { // from class: a2.q
                            @Override // J7.t
                            public final Object get() {
                                return r.a.c(this.f20873a, aVar);
                            }
                        };
                    }
                    this.f20887b.put(Integer.valueOf(i10), tVar2);
                    return tVar2;
                }
                int i14 = HlsMediaSource.Factory.f23678r;
                final Class clsAsSubclass4 = HlsMediaSource.Factory.class.asSubclass(InterfaceC2611D.a.class);
                tVar = new J7.t() { // from class: a2.o
                    @Override // J7.t
                    public final Object get() {
                        return r.o(clsAsSubclass4, aVar);
                    }
                };
            }
            tVar2 = tVar;
            this.f20887b.put(Integer.valueOf(i10), tVar2);
            return tVar2;
        }

        public void h(int i10) {
            this.f20892g = i10;
            this.f20886a.c(i10);
        }

        public void i(f.a aVar) {
            if (aVar != this.f20889d) {
                this.f20889d = aVar;
                this.f20887b.clear();
                this.f20888c.clear();
            }
        }

        public void j(P1.w wVar) {
            this.f20893h = wVar;
            Iterator it = this.f20888c.values().iterator();
            while (it.hasNext()) {
                ((InterfaceC2611D.a) it.next()).d(wVar);
            }
        }

        public void k(int i10) {
            i2.u uVar = this.f20886a;
            if (uVar instanceof C4333m) {
                ((C4333m) uVar).n(i10);
            }
        }

        public void l(e2.k kVar) {
            this.f20894i = kVar;
            Iterator it = this.f20888c.values().iterator();
            while (it.hasNext()) {
                ((InterfaceC2611D.a) it.next()).e(kVar);
            }
        }

        public void m(boolean z10) {
            this.f20890e = z10;
            this.f20886a.b(z10);
            Iterator it = this.f20888c.values().iterator();
            while (it.hasNext()) {
                ((InterfaceC2611D.a) it.next()).b(z10);
            }
        }

        public void n(s.a aVar) {
            this.f20891f = aVar;
            this.f20886a.a(aVar);
            Iterator it = this.f20888c.values().iterator();
            while (it.hasNext()) {
                ((InterfaceC2611D.a) it.next()).a(aVar);
            }
        }
    }

    public r(Context context) {
        this(new k.a(context));
    }

    public static /* synthetic */ InterfaceC4336p[] g(r rVar, D1.o oVar) {
        return new InterfaceC4336p[]{rVar.f20877e.a(oVar) ? new F2.o(rVar.f20877e.b(oVar), null) : new b(oVar)};
    }

    public static InterfaceC2611D l(D1.r rVar, InterfaceC2611D interfaceC2611D) {
        r.d dVar = rVar.f1877f;
        return (dVar.f1903b == 0 && dVar.f1905d == Long.MIN_VALUE && !dVar.f1907f) ? interfaceC2611D : new C2620f.b(interfaceC2611D).n(rVar.f1877f.f1903b).l(rVar.f1877f.f1905d).k(!rVar.f1877f.f1908g).i(rVar.f1877f.f1906e).m(rVar.f1877f.f1907f).j(rVar.f1877f.f1909h).h();
    }

    public static InterfaceC2611D.a n(Class cls) {
        try {
            return (InterfaceC2611D.a) cls.getConstructor(null).newInstance(null);
        } catch (Exception e10) {
            throw new IllegalStateException(e10);
        }
    }

    public static InterfaceC2611D.a o(Class cls, f.a aVar) {
        try {
            return (InterfaceC2611D.a) cls.getConstructor(f.a.class).newInstance(aVar);
        } catch (Exception e10) {
            throw new IllegalStateException(e10);
        }
    }

    @Override // a2.InterfaceC2611D.a
    public InterfaceC2611D f(D1.r rVar) {
        AbstractC0853a.e(rVar.f1873b);
        String scheme = rVar.f1873b.f1968a.getScheme();
        if (scheme != null && scheme.equals("ssai")) {
            return ((InterfaceC2611D.a) AbstractC0853a.e(this.f20878f)).f(rVar);
        }
        if (Objects.equals(rVar.f1873b.f1969b, "application/x-image-uri")) {
            long jM0 = G1.M.M0(rVar.f1873b.f1976i);
            android.support.v4.media.session.a.a(AbstractC0853a.e(null));
            return new C2635v.b(jM0, null).f(rVar);
        }
        r.h hVar = rVar.f1873b;
        int iX0 = G1.M.x0(hVar.f1968a, hVar.f1969b);
        if (rVar.f1873b.f1976i != -9223372036854775807L) {
            this.f20875c.k(1);
        }
        try {
            InterfaceC2611D.a aVarF = this.f20875c.f(iX0);
            r.g.a aVarA = rVar.f1875d.a();
            if (rVar.f1875d.f1950a == -9223372036854775807L) {
                aVarA.k(this.f20880h);
            }
            if (rVar.f1875d.f1953d == -3.4028235E38f) {
                aVarA.j(this.f20883k);
            }
            if (rVar.f1875d.f1954e == -3.4028235E38f) {
                aVarA.h(this.f20884l);
            }
            if (rVar.f1875d.f1951b == -9223372036854775807L) {
                aVarA.i(this.f20881i);
            }
            if (rVar.f1875d.f1952c == -9223372036854775807L) {
                aVarA.g(this.f20882j);
            }
            r.g gVarF = aVarA.f();
            if (!gVarF.equals(rVar.f1875d)) {
                rVar = rVar.a().b(gVarF).a();
            }
            InterfaceC2611D interfaceC2611DF = aVarF.f(rVar);
            AbstractC1081v abstractC1081v = ((r.h) G1.M.i(rVar.f1873b)).f1973f;
            if (!abstractC1081v.isEmpty()) {
                InterfaceC2611D[] interfaceC2611DArr = new InterfaceC2611D[abstractC1081v.size() + 1];
                interfaceC2611DArr[0] = interfaceC2611DF;
                for (int i10 = 0; i10 < abstractC1081v.size(); i10++) {
                    if (this.f20885m) {
                        final D1.o oVarP = new o.b().y0(((r.k) abstractC1081v.get(i10)).f1988b).n0(((r.k) abstractC1081v.get(i10)).f1989c).A0(((r.k) abstractC1081v.get(i10)).f1990d).w0(((r.k) abstractC1081v.get(i10)).f1991e).l0(((r.k) abstractC1081v.get(i10)).f1992f).j0(((r.k) abstractC1081v.get(i10)).f1993g).P();
                        X.b bVar = new X.b(this.f20876d, new i2.u() { // from class: a2.l
                            @Override // i2.u
                            public final InterfaceC4336p[] f() {
                                return r.g(this.f20854b, oVarP);
                            }
                        });
                        if (this.f20877e.a(oVarP)) {
                            oVarP = oVarP.b().y0("application/x-media3-cues").U(oVarP.f1805o).Y(this.f20877e.c(oVarP)).P();
                        }
                        X.b bVarI = bVar.i(0, oVarP);
                        e2.k kVar = this.f20879g;
                        if (kVar != null) {
                            bVarI.e(kVar);
                        }
                        interfaceC2611DArr[i10 + 1] = bVarI.f(D1.r.b(((r.k) abstractC1081v.get(i10)).f1987a.toString()));
                    } else {
                        h0.b bVar2 = new h0.b(this.f20876d);
                        e2.k kVar2 = this.f20879g;
                        if (kVar2 != null) {
                            bVar2.b(kVar2);
                        }
                        interfaceC2611DArr[i10 + 1] = bVar2.a((r.k) abstractC1081v.get(i10), -9223372036854775807L);
                    }
                }
                interfaceC2611DF = new P(interfaceC2611DArr);
            }
            return m(rVar, l(rVar, interfaceC2611DF));
        } catch (ClassNotFoundException e10) {
            throw new IllegalStateException(e10);
        }
    }

    @Override // a2.InterfaceC2611D.a
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public r b(boolean z10) {
        this.f20885m = z10;
        this.f20875c.m(z10);
        return this;
    }

    @Override // a2.InterfaceC2611D.a
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public r c(int i10) {
        this.f20875c.h(i10);
        return this;
    }

    public final InterfaceC2611D m(D1.r rVar, InterfaceC2611D interfaceC2611D) {
        AbstractC0853a.e(rVar.f1873b);
        rVar.f1873b.getClass();
        return interfaceC2611D;
    }

    public r p(f.a aVar) {
        this.f20876d = aVar;
        this.f20875c.i(aVar);
        return this;
    }

    @Override // a2.InterfaceC2611D.a
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public r d(P1.w wVar) {
        this.f20875c.j((P1.w) AbstractC0853a.f(wVar, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior."));
        return this;
    }

    @Override // a2.InterfaceC2611D.a
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public r e(e2.k kVar) {
        this.f20879g = (e2.k) AbstractC0853a.f(kVar, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
        this.f20875c.l(kVar);
        return this;
    }

    @Override // a2.InterfaceC2611D.a
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public r a(s.a aVar) {
        this.f20877e = (s.a) AbstractC0853a.e(aVar);
        this.f20875c.n(aVar);
        return this;
    }

    public r(Context context, i2.u uVar) {
        this(new k.a(context), uVar);
    }

    public r(f.a aVar) {
        this(aVar, new C4333m());
    }

    public r(f.a aVar, i2.u uVar) {
        this.f20876d = aVar;
        F2.h hVar = new F2.h();
        this.f20877e = hVar;
        a aVar2 = new a(uVar, hVar);
        this.f20875c = aVar2;
        aVar2.i(aVar);
        this.f20880h = -9223372036854775807L;
        this.f20881i = -9223372036854775807L;
        this.f20882j = -9223372036854775807L;
        this.f20883k = -3.4028235E38f;
        this.f20884l = -3.4028235E38f;
        this.f20885m = true;
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b implements InterfaceC4336p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final D1.o f20895a;

        public b(D1.o oVar) {
            this.f20895a = oVar;
        }

        @Override // i2.InterfaceC4336p
        public void c(i2.r rVar) {
            i2.O oF = rVar.f(0, 3);
            rVar.v(new J.b(-9223372036854775807L));
            rVar.n();
            oF.e(this.f20895a.b().y0("text/x-unknown").U(this.f20895a.f1805o).P());
        }

        @Override // i2.InterfaceC4336p
        public int i(InterfaceC4337q interfaceC4337q, i2.I i10) {
            return interfaceC4337q.a(Integer.MAX_VALUE) == -1 ? -1 : 0;
        }

        @Override // i2.InterfaceC4336p
        public boolean j(InterfaceC4337q interfaceC4337q) {
            return true;
        }

        @Override // i2.InterfaceC4336p
        public void release() {
        }

        @Override // i2.InterfaceC4336p
        public void a(long j10, long j11) {
        }
    }
}
