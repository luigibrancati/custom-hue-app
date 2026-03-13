package a2;

import D1.D;
import G1.AbstractC0853a;
import a2.InterfaceC2611D;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: renamed from: a2.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C2620f extends p0 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final long f20753m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final long f20754n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f20755o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f20756p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f20757q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final boolean f20758r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ArrayList f20759s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final D.c f20760t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public c f20761u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public d f20762v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public long f20763w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public long f20764x;

    /* JADX INFO: renamed from: a2.f$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final InterfaceC2611D f20765a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f20766b;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f20769e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f20770f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f20771g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f20772h;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f20768d = true;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f20767c = Long.MIN_VALUE;

        public b(InterfaceC2611D interfaceC2611D) {
            this.f20765a = (InterfaceC2611D) AbstractC0853a.e(interfaceC2611D);
        }

        public C2620f h() {
            this.f20772h = true;
            return new C2620f(this);
        }

        public b i(boolean z10) {
            AbstractC0853a.g(!this.f20772h);
            this.f20769e = z10;
            return this;
        }

        public b j(boolean z10) {
            AbstractC0853a.g(!this.f20772h);
            this.f20771g = z10;
            return this;
        }

        public b k(boolean z10) {
            AbstractC0853a.g(!this.f20772h);
            this.f20768d = z10;
            return this;
        }

        public b l(long j10) {
            AbstractC0853a.g(!this.f20772h);
            this.f20767c = j10;
            return this;
        }

        public b m(boolean z10) {
            AbstractC0853a.g(!this.f20772h);
            this.f20770f = z10;
            return this;
        }

        public b n(long j10) {
            AbstractC0853a.a(j10 >= 0);
            AbstractC0853a.g(!this.f20772h);
            this.f20766b = j10;
            return this;
        }
    }

    /* JADX INFO: renamed from: a2.f$c */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class c extends AbstractC2636w {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final long f20773f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final long f20774g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final long f20775h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final boolean f20776i;

        public c(D1.D d10, long j10, long j11, boolean z10) throws d {
            super(d10);
            if (j11 != Long.MIN_VALUE && j11 < j10) {
                throw new d(2, j10, j11);
            }
            boolean z11 = false;
            if (d10.i() != 1) {
                throw new d(0);
            }
            D.c cVarN = d10.n(0, new D.c());
            long jMax = Math.max(0L, j10);
            if (!z10 && !cVarN.f1483k && jMax != 0 && !cVarN.f1480h) {
                throw new d(1);
            }
            long jMax2 = j11 == Long.MIN_VALUE ? cVarN.f1485m : Math.max(0L, j11);
            long j12 = cVarN.f1485m;
            if (j12 != -9223372036854775807L) {
                jMax2 = jMax2 > j12 ? j12 : jMax2;
                if (jMax > jMax2) {
                    jMax = jMax2;
                }
            }
            this.f20773f = jMax;
            this.f20774g = jMax2;
            this.f20775h = jMax2 == -9223372036854775807L ? -9223372036854775807L : jMax2 - jMax;
            if (cVarN.f1481i && (jMax2 == -9223372036854775807L || (j12 != -9223372036854775807L && jMax2 == j12))) {
                z11 = true;
            }
            this.f20776i = z11;
        }

        @Override // a2.AbstractC2636w, D1.D
        public D.b g(int i10, D.b bVar, boolean z10) {
            this.f20909e.g(0, bVar, z10);
            long jN = bVar.n() - this.f20773f;
            long j10 = this.f20775h;
            return bVar.s(bVar.f1450a, bVar.f1451b, 0, j10 != -9223372036854775807L ? j10 - jN : -9223372036854775807L, jN);
        }

        @Override // a2.AbstractC2636w, D1.D
        public D.c o(int i10, D.c cVar, long j10) {
            this.f20909e.o(0, cVar, 0L);
            long j11 = cVar.f1488p;
            long j12 = this.f20773f;
            cVar.f1488p = j11 + j12;
            cVar.f1485m = this.f20775h;
            cVar.f1481i = this.f20776i;
            long j13 = cVar.f1484l;
            if (j13 != -9223372036854775807L) {
                long jMax = Math.max(j13, j12);
                cVar.f1484l = jMax;
                long j14 = this.f20774g;
                if (j14 != -9223372036854775807L) {
                    jMax = Math.min(jMax, j14);
                }
                cVar.f1484l = jMax - this.f20773f;
            }
            long jO1 = G1.M.o1(this.f20773f);
            long j15 = cVar.f1477e;
            if (j15 != -9223372036854775807L) {
                cVar.f1477e = j15 + jO1;
            }
            long j16 = cVar.f1478f;
            if (j16 != -9223372036854775807L) {
                cVar.f1478f = j16 + jO1;
            }
            return cVar;
        }
    }

    /* JADX INFO: renamed from: a2.f$d */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class d extends IOException {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f20777a;

        public d(int i10) {
            this(i10, -9223372036854775807L, -9223372036854775807L);
        }

        public static String a(int i10, long j10, long j11) {
            if (i10 == 0) {
                return "invalid period count";
            }
            if (i10 == 1) {
                return "not seekable to start";
            }
            if (i10 != 2) {
                return "unknown";
            }
            AbstractC0853a.g((j10 == -9223372036854775807L || j11 == -9223372036854775807L) ? false : true);
            return "start exceeds end. Start time: " + j10 + ", End time: " + j11;
        }

        public d(int i10, long j10, long j11) {
            super("Illegal clipping: " + a(i10, j10, j11));
            this.f20777a = i10;
        }
    }

    @Override // a2.AbstractC2622h, a2.AbstractC2615a
    public void F() {
        super.F();
        this.f20762v = null;
        this.f20761u = null;
    }

    @Override // a2.p0
    public void S(D1.D d10) {
        if (this.f20762v != null) {
            return;
        }
        W(d10);
    }

    public final void W(D1.D d10) {
        long j10;
        d10.n(0, this.f20760t);
        long jE = this.f20760t.e();
        if (this.f20761u == null || this.f20759s.isEmpty() || this.f20756p) {
            j10 = this.f20753m;
            long j11 = this.f20754n;
            if (this.f20757q) {
                long jC = this.f20760t.c();
                j10 += jC;
                j11 += jC;
            }
            this.f20763w = jE + j10;
            this.f20764x = this.f20754n != Long.MIN_VALUE ? jE + j11 : Long.MIN_VALUE;
            int size = this.f20759s.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((C2619e) this.f20759s.get(i10)).x(this.f20763w, this.f20764x);
            }
            j = j11;
        } else {
            j10 = this.f20763w - jE;
            if (this.f20754n != Long.MIN_VALUE) {
                j = this.f20764x - jE;
            }
        }
        try {
            c cVar = new c(d10, j10, j, this.f20758r);
            this.f20761u = cVar;
            E(cVar);
        } catch (d e10) {
            this.f20762v = e10;
            for (int i11 = 0; i11 < this.f20759s.size(); i11++) {
                ((C2619e) this.f20759s.get(i11)).v(this.f20762v);
            }
        }
    }

    @Override // a2.InterfaceC2611D
    public void h(InterfaceC2610C interfaceC2610C) {
        AbstractC0853a.g(this.f20759s.remove(interfaceC2610C));
        this.f20872k.h(((C2619e) interfaceC2610C).f20740a);
        if (!this.f20759s.isEmpty() || this.f20756p) {
            return;
        }
        W(((c) AbstractC0853a.e(this.f20761u)).f20909e);
    }

    @Override // a2.InterfaceC2611D
    public InterfaceC2610C k(InterfaceC2611D.b bVar, e2.b bVar2, long j10) {
        C2619e c2619e = new C2619e(this.f20872k.k(bVar, bVar2, j10), this.f20755o, this.f20763w, this.f20764x);
        this.f20759s.add(c2619e);
        return c2619e;
    }

    @Override // a2.AbstractC2622h, a2.InterfaceC2611D
    public void n() throws d {
        d dVar = this.f20762v;
        if (dVar != null) {
            throw dVar;
        }
        super.n();
    }

    public C2620f(b bVar) {
        super(bVar.f20765a);
        this.f20753m = bVar.f20766b;
        this.f20754n = bVar.f20767c;
        this.f20755o = bVar.f20768d;
        this.f20756p = bVar.f20769e;
        this.f20757q = bVar.f20770f;
        this.f20758r = bVar.f20771g;
        this.f20759s = new ArrayList();
        this.f20760t = new D.c();
    }
}
