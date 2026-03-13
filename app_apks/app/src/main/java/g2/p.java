package g2;

import D1.C0748f;
import D1.I;
import D1.InterfaceC0751i;
import D1.J;
import D1.o;
import G1.AbstractC0853a;
import G1.InterfaceC0860h;
import G1.M;
import G1.o;
import K7.AbstractC1081v;
import android.content.Context;
import android.os.Build;
import android.os.Looper;
import android.util.Pair;
import android.util.SparseArray;
import android.view.Surface;
import g2.H;
import g2.p;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class p implements J.b {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final Executor f35259A = new Executor() { // from class: g2.n
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            p.a(runnable);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f35260a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final J.a f35261b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SparseArray f35262c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f35263d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final H f35264e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final H.b f35265f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final InterfaceC0860h f35266g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final CopyOnWriteArraySet f35267h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public G1.G f35268i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public D1.o f35269j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public D1.H f35270k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public AbstractC1081v f35271l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public G1.p f35272m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public r f35273n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f35274o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f35275p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f35276q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f35277r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Pair f35278s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f35279t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f35280u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f35281v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public long f35282w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f35283x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f35284y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f35285z;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a implements H.b {
        public a() {
        }

        @Override // g2.H.b
        public void a(long j10) {
            p.v(p.this);
            android.support.v4.media.session.a.a(AbstractC0853a.i(null));
            throw null;
        }

        @Override // g2.H.b
        public void b() {
            p.v(p.this);
            android.support.v4.media.session.a.a(AbstractC0853a.i(null));
            throw null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f35287a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final s f35288b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public J.a f35289c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f35290d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public InterfaceC0860h f35291e = InterfaceC0860h.f4292a;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f35292f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f35293g;

        public b(Context context, s sVar) {
            this.f35287a = context.getApplicationContext();
            this.f35288b = sVar;
        }

        public p f() {
            AbstractC0853a.g(!this.f35292f);
            if (this.f35289c == null) {
                this.f35289c = new f(this.f35293g);
            }
            p pVar = new p(this, null);
            this.f35292f = true;
            return pVar;
        }

        public b g(InterfaceC0860h interfaceC0860h) {
            this.f35291e = interfaceC0860h;
            return this;
        }

        public b h(boolean z10) {
            this.f35290d = z10;
            return this;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public final class c implements H, d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f35294a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f35295b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public D1.o f35297d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f35298e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public long f35299f;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public boolean f35303j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public boolean f35304k;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public AbstractC1081v f35296c = AbstractC1081v.z();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public long f35300g = -9223372036854775807L;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public H.a f35301h = H.a.f35140a;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public Executor f35302i = p.f35259A;

        public c(Context context, int i10) {
            this.f35295b = i10;
            this.f35294a = M.f0(context);
        }

        @Override // g2.H
        public void T(float f10) {
            if (this.f35295b == 0) {
                p.this.P(f10);
            }
        }

        @Override // g2.H
        public void a(int i10, D1.o oVar, long j10, int i11, List list) {
            AbstractC0853a.g(isInitialized());
            this.f35296c = AbstractC1081v.v(list);
            this.f35298e = i10;
            this.f35297d = oVar;
            p.this.f35282w = -9223372036854775807L;
            p.this.f35283x = false;
            v(oVar);
            boolean z10 = this.f35300g == -9223372036854775807L;
            if (p.this.f35263d || (this.f35295b == 0 && z10)) {
                long j11 = z10 ? -4611686018427387904L : this.f35300g + 1;
                p.this.f35268i.a(j11, new g(this.f35299f + j10, i11, j11));
            }
        }

        @Override // g2.H
        public boolean b() {
            return isInitialized() && p.this.E();
        }

        @Override // g2.H
        public void c(H.a aVar, Executor executor) {
            this.f35301h = aVar;
            this.f35302i = executor;
        }

        @Override // g2.H
        public boolean d(long j10, H.b bVar) {
            AbstractC0853a.g(isInitialized());
            if (!p.this.S()) {
                return false;
            }
            p.v(p.this);
            android.support.v4.media.session.a.a(AbstractC0853a.e(null));
            throw null;
        }

        @Override // g2.H
        public void e(long j10) {
            this.f35299f = j10;
        }

        @Override // g2.H
        public void f() {
            p.this.f35282w = this.f35300g;
            if (p.this.f35281v >= p.this.f35282w) {
                p.this.T();
            }
        }

        @Override // g2.H
        public void g(long j10, long j11) {
            p.this.M(j10 + this.f35299f, j11);
        }

        @Override // g2.H
        public void h(Surface surface, G1.D d10) {
            p.this.O(surface, d10);
        }

        @Override // g2.H
        public void i(List list) {
            if (this.f35296c.equals(list)) {
                return;
            }
            this.f35296c = AbstractC1081v.v(list);
            D1.o oVar = this.f35297d;
            if (oVar != null) {
                v(oVar);
            }
        }

        @Override // g2.H
        public boolean isInitialized() {
            return this.f35304k;
        }

        @Override // g2.H
        public boolean j(boolean z10) {
            return p.this.G(z10 && isInitialized());
        }

        @Override // g2.H
        public void k() {
            if (isInitialized()) {
                long unused = p.this.f35281v;
                p.this.B(false);
                p.v(p.this);
                android.support.v4.media.session.a.a(AbstractC0853a.e(null));
                throw null;
            }
        }

        @Override // g2.H
        public void l() {
            if (p.this.f35268i.k() == 0) {
                p.this.z();
                return;
            }
            G1.G g10 = new G1.G();
            boolean z10 = true;
            while (p.this.f35268i.k() > 0) {
                g gVar = (g) AbstractC0853a.e((g) p.this.f35268i.h());
                if (z10) {
                    int i10 = gVar.f35310b;
                    if (i10 == 0 || i10 == 1) {
                        gVar = new g(gVar.f35309a, 0, gVar.f35311c);
                    } else {
                        p.this.z();
                    }
                    z10 = false;
                }
                g10.a(gVar.f35311c, gVar);
            }
            p.this.f35268i = g10;
        }

        @Override // g2.H
        public Surface m() {
            AbstractC0853a.g(isInitialized());
            p.v(p.this);
            android.support.v4.media.session.a.a(AbstractC0853a.e(null));
            throw null;
        }

        @Override // g2.H
        public void n() {
            if (p.this.f35263d) {
                p.this.V();
            }
        }

        @Override // g2.H
        public void o() {
            if (p.this.f35263d) {
                p.this.U();
            }
        }

        @Override // g2.H
        public void p(int i10) {
            if (this.f35295b == 0) {
                p.this.N(i10);
            }
        }

        @Override // g2.H
        public boolean q(D1.o oVar) throws H.c {
            AbstractC0853a.g(!isInitialized());
            boolean zK = p.this.K(oVar, this.f35295b);
            this.f35304k = zK;
            return zK;
        }

        @Override // g2.H
        public void r() {
            p.this.A();
        }

        @Override // g2.H
        public void release() {
            p.this.L();
        }

        @Override // g2.H
        public void s(boolean z10) {
            if (isInitialized()) {
                p.v(p.this);
                android.support.v4.media.session.a.a(AbstractC0853a.e(null));
                throw null;
            }
            this.f35300g = -9223372036854775807L;
            p.this.B(z10);
            this.f35303j = false;
        }

        @Override // g2.H
        public void t(boolean z10) {
            if (p.this.f35263d) {
                p.this.H(z10);
            }
        }

        @Override // g2.H
        public void u(r rVar) {
            if (this.f35295b == 0) {
                p.this.R(rVar);
            }
        }

        public final void v(D1.o oVar) {
            oVar.b().V(p.this.C(oVar.f1778E)).P();
            p.v(p.this);
            android.support.v4.media.session.a.a(AbstractC0853a.e(null));
            throw null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface d {
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class e implements I.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final J7.t f35306b = J7.u.a(new J7.t() { // from class: g2.q
            @Override // J7.t
            public final Object get() {
                return p.e.a();
            }
        });

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f35307a;

        public e(boolean z10) {
            this.f35307a = z10;
        }

        public static /* synthetic */ Class a() {
            try {
                return Class.forName("androidx.media3.effect.DefaultVideoFrameProcessor$Factory$Builder");
            } catch (Exception e10) {
                throw new IllegalStateException(e10);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class f implements J.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final I.b f35308a;

        public f(boolean z10) {
            this.f35308a = new e(z10);
        }

        @Override // D1.J.a
        public J a(Context context, C0748f c0748f, InterfaceC0751i interfaceC0751i, J.b bVar, Executor executor, long j10, boolean z10) {
            try {
                ((J.a) Class.forName("androidx.media3.effect.SingleInputVideoGraph$Factory").getConstructor(I.b.class).newInstance(this.f35308a)).a(context, c0748f, interfaceC0751i, bVar, executor, j10, z10);
                return null;
            } catch (Exception e10) {
                throw new IllegalStateException(e10);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f35309a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f35310b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f35311c;

        public g(long j10, int i10, long j11) {
            this.f35309a = j10;
            this.f35310b = i10;
            this.f35311c = j11;
        }
    }

    public /* synthetic */ p(b bVar, a aVar) {
        this(bVar);
    }

    public static /* synthetic */ void b(p pVar) {
        pVar.f35279t--;
    }

    public static /* synthetic */ J v(p pVar) {
        pVar.getClass();
        return null;
    }

    public void A() {
        G1.D d10 = G1.D.f4244c;
        I(null, d10.b(), d10.a());
        this.f35278s = null;
    }

    public final void B(boolean z10) {
        if (F()) {
            this.f35279t++;
            this.f35264e.s(z10);
            while (this.f35268i.k() > 1) {
                this.f35268i.h();
            }
            if (this.f35268i.k() == 1) {
                g gVar = (g) AbstractC0853a.e((g) this.f35268i.h());
                this.f35276q = gVar.f35309a;
                this.f35277r = gVar.f35310b;
                J();
            }
            this.f35281v = -9223372036854775807L;
            this.f35282w = -9223372036854775807L;
            this.f35283x = false;
            ((G1.p) AbstractC0853a.i(this.f35272m)).i(new Runnable() { // from class: g2.m
                @Override // java.lang.Runnable
                public final void run() {
                    p.b(this.f35257a);
                }
            });
        }
    }

    public final C0748f C(C0748f c0748f) {
        return (c0748f == null || !c0748f.g() || this.f35275p) ? C0748f.f1689h : c0748f;
    }

    public H D(int i10) {
        if (M.q(this.f35262c, i10)) {
            return (H) this.f35262c.get(i10);
        }
        c cVar = new c(this.f35260a, i10);
        if (i10 == 0) {
            y(cVar);
        }
        this.f35262c.put(i10, cVar);
        return cVar;
    }

    public final boolean E() {
        return this.f35279t == 0 && this.f35283x && this.f35264e.b();
    }

    public final boolean F() {
        return this.f35280u == 1;
    }

    public final boolean G(boolean z10) {
        return this.f35264e.j(z10 && this.f35279t == 0);
    }

    public final void H(boolean z10) {
        this.f35264e.t(z10);
    }

    public final void J() {
        this.f35264e.a(1, this.f35269j, this.f35276q, this.f35277r, AbstractC1081v.z());
    }

    public final boolean K(D1.o oVar, int i10) throws H.c {
        if (i10 != 0) {
            if (!F()) {
                return false;
            }
            android.support.v4.media.session.a.a(AbstractC0853a.e(null));
            throw null;
        }
        AbstractC0853a.g(this.f35280u == 0);
        C0748f c0748fC = C(oVar.f1778E);
        try {
            if (this.f35274o) {
                c0748fC = C0748f.f1689h;
            } else if (c0748fC.f1699c == 7 && Build.VERSION.SDK_INT < 34 && G1.o.e()) {
                c0748fC = c0748fC.a().e(6).a();
            } else if (!G1.o.f(c0748fC.f1699c)) {
                G1.t.h("PlaybackVidGraphWrapper", M.G("Color transfer %d is not supported. Falling back to OpenGl tone mapping.", Integer.valueOf(c0748fC.f1699c)));
                c0748fC = C0748f.f1689h;
            }
            C0748f c0748f = c0748fC;
            final G1.p pVarE = this.f35266g.e((Looper) AbstractC0853a.i(Looper.myLooper()), null);
            this.f35272m = pVarE;
            J.a aVar = this.f35261b;
            Context context = this.f35260a;
            InterfaceC0751i interfaceC0751i = InterfaceC0751i.f1710a;
            Objects.requireNonNull(pVarE);
            aVar.a(context, c0748f, interfaceC0751i, this, new Executor() { // from class: g2.o
                @Override // java.util.concurrent.Executor
                public final void execute(Runnable runnable) {
                    pVarE.i(runnable);
                }
            }, 0L, false);
            throw null;
        } catch (o.a e10) {
            throw new H.c(e10, oVar);
        }
    }

    public void L() {
        if (this.f35280u == 2) {
            return;
        }
        G1.p pVar = this.f35272m;
        if (pVar != null) {
            pVar.f(null);
        }
        this.f35278s = null;
        this.f35280u = 2;
    }

    public final void M(long j10, long j11) {
        this.f35264e.g(j10, j11);
    }

    public final void N(int i10) {
        this.f35264e.p(i10);
    }

    public void O(Surface surface, G1.D d10) {
        Pair pair = this.f35278s;
        if (pair != null && ((Surface) pair.first).equals(surface) && ((G1.D) this.f35278s.second).equals(d10)) {
            return;
        }
        this.f35278s = Pair.create(surface, d10);
        I(surface, d10.b(), d10.a());
    }

    public final void P(float f10) {
        this.f35264e.T(f10);
    }

    public void Q(int i10) {
        this.f35284y = i10;
    }

    public final void R(r rVar) {
        this.f35273n = rVar;
        this.f35264e.u(rVar);
    }

    public final boolean S() {
        int i10 = this.f35284y;
        return i10 != -1 && i10 == this.f35285z;
    }

    public final void T() {
        this.f35264e.f();
        this.f35283x = true;
    }

    public void U() {
        this.f35264e.o();
    }

    public void V() {
        this.f35264e.n();
    }

    public void y(d dVar) {
        this.f35267h.add(dVar);
    }

    public final void z() {
        this.f35264e.l();
    }

    public p(b bVar) {
        this.f35260a = bVar.f35287a;
        this.f35268i = new G1.G();
        this.f35261b = (J.a) AbstractC0853a.i(bVar.f35289c);
        this.f35262c = new SparseArray();
        this.f35271l = AbstractC1081v.z();
        this.f35270k = D1.H.f1616a;
        this.f35263d = bVar.f35290d;
        InterfaceC0860h interfaceC0860h = bVar.f35291e;
        this.f35266g = interfaceC0860h;
        this.f35264e = new C4127e(bVar.f35288b, interfaceC0860h);
        this.f35265f = new a();
        this.f35267h = new CopyOnWriteArraySet();
        this.f35269j = new o.b().P();
        this.f35276q = -9223372036854775807L;
        this.f35281v = -9223372036854775807L;
        this.f35282w = -9223372036854775807L;
        this.f35284y = -1;
        this.f35280u = 0;
    }

    public static /* synthetic */ void a(Runnable runnable) {
    }

    public final void I(Surface surface, int i10, int i11) {
    }
}
