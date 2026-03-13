package g2;

import D1.K;
import G1.AbstractC0853a;
import G1.InterfaceC0860h;
import g2.s;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f35358a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s f35359b;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f35368k;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s.a f35360c = new s.a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final G1.G f35361d = new G1.G();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final G1.G f35362e = new G1.G();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final G1.v f35363f = new G1.v();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f35364g = -9223372036854775807L;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public K f35367j = K.f1618e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f35365h = -9223372036854775807L;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f35366i = -9223372036854775807L;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface a {
        void a();

        void b(long j10, long j11, boolean z10);

        void onVideoSizeChanged(K k10);
    }

    public v(a aVar, s sVar) {
        this.f35358a = aVar;
        this.f35359b = sVar;
    }

    public static Object c(G1.G g10) {
        AbstractC0853a.a(g10.k() > 0);
        while (g10.k() > 1) {
            g10.h();
        }
        return AbstractC0853a.e(g10.h());
    }

    public final void a() {
        this.f35363f.f();
        this.f35358a.a();
    }

    public void b() {
        this.f35363f.b();
        this.f35364g = -9223372036854775807L;
        this.f35365h = -9223372036854775807L;
        this.f35366i = -9223372036854775807L;
        if (this.f35362e.k() > 0) {
            this.f35368k = ((Long) c(this.f35362e)).longValue();
        }
        if (this.f35361d.k() > 0) {
            this.f35361d.a(0L, (K) c(this.f35361d));
        }
    }

    public boolean d() {
        long j10 = this.f35366i;
        return j10 != -9223372036854775807L && this.f35365h == j10;
    }

    public final boolean e(long j10) {
        Long l10 = (Long) this.f35362e.i(j10);
        if (l10 == null || l10.longValue() == this.f35368k) {
            return false;
        }
        this.f35368k = l10.longValue();
        return true;
    }

    public final boolean f(long j10) {
        K k10 = (K) this.f35361d.i(j10);
        if (k10 == null || k10.equals(K.f1618e) || k10.equals(this.f35367j)) {
            return false;
        }
        this.f35367j = k10;
        return true;
    }

    public void g(long j10) {
        this.f35363f.a(j10);
        this.f35364g = j10;
        this.f35366i = -9223372036854775807L;
    }

    public void h(int i10, long j10) {
        if (this.f35363f.e()) {
            this.f35359b.j(i10);
            this.f35368k = j10;
        } else {
            G1.G g10 = this.f35362e;
            long j11 = this.f35364g;
            g10.a(j11 == -9223372036854775807L ? -4611686018427387904L : j11 + 1, Long.valueOf(j10));
        }
    }

    public void i(int i10, int i11) {
        G1.G g10 = this.f35361d;
        long j10 = this.f35364g;
        g10.a(j10 == -9223372036854775807L ? 0L : j10 + 1, new K(i10, i11));
    }

    public void j(long j10, long j11) {
        while (!this.f35363f.e()) {
            long jD = this.f35363f.d();
            if (e(jD)) {
                this.f35359b.j(2);
            }
            int iC = this.f35359b.c(jD, j10, j11, this.f35368k, false, false, this.f35360c);
            if (iC == 0 || iC == 1) {
                this.f35365h = jD;
                k(iC == 0);
            } else if (iC == 2 || iC == 3) {
                this.f35365h = jD;
                a();
            } else {
                if (iC != 4) {
                    if (iC != 5) {
                        throw new IllegalStateException(String.valueOf(iC));
                    }
                    return;
                }
                this.f35365h = jD;
            }
        }
    }

    public final void k(boolean z10) {
        long jF = this.f35363f.f();
        if (f(jF)) {
            this.f35358a.onVideoSizeChanged(this.f35367j);
        }
        this.f35358a.b(z10 ? InterfaceC0860h.f4292a.b() : this.f35360c.g(), jF, this.f35359b.g());
    }

    public void l() {
        if (this.f35364g == -9223372036854775807L) {
            this.f35364g = Long.MIN_VALUE;
            this.f35365h = Long.MIN_VALUE;
        }
        this.f35366i = this.f35364g;
    }
}
