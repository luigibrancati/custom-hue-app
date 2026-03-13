package D2;

import D1.o;
import G1.AbstractC0853a;
import G1.C;
import G1.M;
import i2.I;
import i2.InterfaceC4337q;
import i2.J;
import i2.O;
import i2.r;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public O f2188b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public r f2189c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public g f2190d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f2191e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f2192f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f2193g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f2194h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f2195i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f2197k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f2198l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f2199m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f2187a = new e();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public b f2196j = new b();

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public o f2200a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public g f2201b;
    }

    public final void a() {
        AbstractC0853a.i(this.f2188b);
        M.i(this.f2189c);
    }

    public long b(long j10) {
        return (j10 * 1000000) / ((long) this.f2195i);
    }

    public long c(long j10) {
        return (((long) this.f2195i) * j10) / 1000000;
    }

    public void d(r rVar, O o10) {
        this.f2189c = rVar;
        this.f2188b = o10;
        l(true);
    }

    public void e(long j10) {
        this.f2193g = j10;
    }

    public abstract long f(C c10);

    public final int g(InterfaceC4337q interfaceC4337q, I i10) {
        a();
        int i11 = this.f2194h;
        if (i11 == 0) {
            return j(interfaceC4337q);
        }
        if (i11 == 1) {
            interfaceC4337q.q((int) this.f2192f);
            this.f2194h = 2;
            return 0;
        }
        if (i11 == 2) {
            M.i(this.f2190d);
            return k(interfaceC4337q, i10);
        }
        if (i11 == 3) {
            return -1;
        }
        throw new IllegalStateException();
    }

    public abstract boolean h(C c10, long j10, b bVar);

    public final boolean i(InterfaceC4337q interfaceC4337q) {
        while (this.f2187a.d(interfaceC4337q)) {
            this.f2197k = interfaceC4337q.getPosition() - this.f2192f;
            if (!h(this.f2187a.c(), this.f2192f, this.f2196j)) {
                return true;
            }
            this.f2192f = interfaceC4337q.getPosition();
        }
        this.f2194h = 3;
        return false;
    }

    public final int j(InterfaceC4337q interfaceC4337q) {
        if (!i(interfaceC4337q)) {
            return -1;
        }
        o oVar = this.f2196j.f2200a;
        this.f2195i = oVar.f1781H;
        if (!this.f2199m) {
            this.f2188b.e(oVar);
            this.f2199m = true;
        }
        g gVar = this.f2196j.f2201b;
        if (gVar != null) {
            this.f2190d = gVar;
        } else if (interfaceC4337q.getLength() == -1) {
            this.f2190d = new c();
        } else {
            f fVarB = this.f2187a.b();
            this.f2190d = new D2.a(this, this.f2192f, interfaceC4337q.getLength(), fVarB.f2180h + fVarB.f2181i, fVarB.f2175c, (fVarB.f2174b & 4) != 0);
        }
        this.f2194h = 2;
        this.f2187a.f();
        return 0;
    }

    public final int k(InterfaceC4337q interfaceC4337q, I i10) {
        long jA = this.f2190d.a(interfaceC4337q);
        if (jA >= 0) {
            i10.f36871a = jA;
            return 1;
        }
        if (jA < -1) {
            e(-(jA + 2));
        }
        if (!this.f2198l) {
            J j10 = (J) AbstractC0853a.i(this.f2190d.b());
            this.f2189c.v(j10);
            this.f2188b.f(j10.m());
            this.f2198l = true;
        }
        if (this.f2197k <= 0 && !this.f2187a.d(interfaceC4337q)) {
            this.f2194h = 3;
            return -1;
        }
        this.f2197k = 0L;
        C c10 = this.f2187a.c();
        long jF = f(c10);
        if (jF >= 0) {
            long j11 = this.f2193g;
            if (j11 + jF >= this.f2191e) {
                long jB = b(j11);
                this.f2188b.b(c10, c10.j());
                this.f2188b.d(jB, 1, c10.j(), 0, null);
                this.f2191e = -1L;
            }
        }
        this.f2193g += jF;
        return 0;
    }

    public void l(boolean z10) {
        if (z10) {
            this.f2196j = new b();
            this.f2192f = 0L;
            this.f2194h = 0;
        } else {
            this.f2194h = 1;
        }
        this.f2191e = -1L;
        this.f2193g = 0L;
    }

    public final void m(long j10, long j11) {
        this.f2187a.e();
        if (j10 == 0) {
            l(!this.f2198l);
        } else if (this.f2194h != 0) {
            this.f2191e = c(j11);
            ((g) M.i(this.f2190d)).c(this.f2191e);
            this.f2194h = 2;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class c implements g {
        public c() {
        }

        @Override // D2.g
        public long a(InterfaceC4337q interfaceC4337q) {
            return -1L;
        }

        @Override // D2.g
        public J b() {
            return new J.b(-9223372036854775807L);
        }

        @Override // D2.g
        public void c(long j10) {
        }
    }
}
