package g2;

import G1.AbstractC0853a;
import G1.InterfaceC0860h;
import G1.M;
import android.content.Context;
import android.view.Surface;
import io.sentry.TransactionOptions;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f35312a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u f35313b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f35314c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f35315d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f35318g;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f35321j;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f35324m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f35325n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f35326o;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f35316e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f35317f = -9223372036854775807L;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f35319h = -9223372036854775807L;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f35320i = -9223372036854775807L;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f35322k = 1.0f;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public InterfaceC0860h f35323l = InterfaceC0860h.f4292a;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f35327a = -9223372036854775807L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f35328b = -9223372036854775807L;

        public long f() {
            return this.f35327a;
        }

        public long g() {
            return this.f35328b;
        }

        public final void h() {
            this.f35327a = -9223372036854775807L;
            this.f35328b = -9223372036854775807L;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface b {
        boolean A(long j10, long j11);

        boolean C(long j10, long j11, long j12, boolean z10, boolean z11);

        boolean J(long j10, long j11, boolean z10);
    }

    public s(Context context, b bVar, long j10) {
        this.f35312a = bVar;
        this.f35314c = j10;
        this.f35313b = new u(context);
    }

    public void a() {
        if (this.f35316e == 0) {
            this.f35316e = 1;
        }
    }

    public final long b(long j10, long j11, long j12) {
        long j13 = (long) ((j12 - j10) / ((double) this.f35322k));
        return this.f35315d ? j13 - (M.M0(this.f35323l.c()) - j11) : j13;
    }

    public int c(long j10, long j11, long j12, long j13, boolean z10, boolean z11, a aVar) {
        aVar.h();
        if (this.f35315d && this.f35317f == -9223372036854775807L) {
            this.f35317f = j11;
        }
        if (this.f35319h != j10) {
            this.f35313b.h(j10);
            this.f35319h = j10;
        }
        aVar.f35327a = b(j11, j12, j10);
        if (z10 && !z11) {
            return 3;
        }
        if (!this.f35324m) {
            this.f35325n = true;
            if (this.f35312a.C(aVar.f35327a, j11, j12, z11, true)) {
                return 4;
            }
            return (!this.f35315d || aVar.f35327a >= TransactionOptions.DEFAULT_DEADLINE_TIMEOUT_AUTO_TRANSACTION) ? 5 : 3;
        }
        if (q(j11, aVar.f35327a, j13)) {
            return 0;
        }
        if (!this.f35315d || j11 == this.f35317f) {
            return 5;
        }
        long jB = this.f35323l.b();
        aVar.f35328b = this.f35313b.b((aVar.f35327a * 1000) + jB);
        aVar.f35327a = (aVar.f35328b - jB) / 1000;
        boolean z12 = (this.f35320i == -9223372036854775807L || this.f35321j) ? false : true;
        if (this.f35312a.C(aVar.f35327a, j11, j12, z11, z12)) {
            return 4;
        }
        return this.f35312a.J(aVar.f35327a, j12, z11) ? z12 ? 3 : 2 : aVar.f35327a > 50000 ? 5 : 1;
    }

    public boolean d(boolean z10) {
        if (z10 && (this.f35316e == 3 || (!this.f35324m && this.f35325n))) {
            this.f35320i = -9223372036854775807L;
            return true;
        }
        if (this.f35320i == -9223372036854775807L) {
            return false;
        }
        if (this.f35323l.c() < this.f35320i) {
            return true;
        }
        this.f35320i = -9223372036854775807L;
        return false;
    }

    public void e(boolean z10) {
        this.f35321j = z10;
        this.f35320i = this.f35314c > 0 ? this.f35323l.c() + this.f35314c : -9223372036854775807L;
    }

    public final void f(int i10) {
        this.f35316e = Math.min(this.f35316e, i10);
    }

    public boolean g() {
        boolean z10 = this.f35316e != 3;
        this.f35316e = 3;
        this.f35318g = M.M0(this.f35323l.c());
        return z10;
    }

    public void h() {
        this.f35315d = true;
        this.f35318g = M.M0(this.f35323l.c());
        this.f35313b.k();
    }

    public void i() {
        this.f35315d = false;
        this.f35320i = -9223372036854775807L;
        this.f35313b.l();
    }

    public void j(int i10) {
        if (i10 == 0) {
            this.f35316e = 1;
        } else if (i10 == 1) {
            this.f35316e = 0;
        } else {
            if (i10 != 2) {
                throw new IllegalStateException();
            }
            f(2);
        }
    }

    public void k() {
        this.f35313b.j();
        this.f35319h = -9223372036854775807L;
        this.f35317f = -9223372036854775807L;
        f(1);
        this.f35320i = -9223372036854775807L;
    }

    public void l(int i10) {
        this.f35313b.o(i10);
    }

    public void m(InterfaceC0860h interfaceC0860h) {
        this.f35323l = interfaceC0860h;
    }

    public void n(float f10) {
        this.f35313b.g(f10);
    }

    public void o(Surface surface) {
        this.f35324m = surface != null;
        this.f35325n = false;
        this.f35313b.m(surface);
        f(1);
    }

    public void p(float f10) {
        AbstractC0853a.a(f10 > 0.0f);
        if (f10 == this.f35322k) {
            return;
        }
        this.f35322k = f10;
        this.f35313b.i(f10);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean q(long r8, long r10, long r12) {
        /*
            r7 = this;
            long r0 = r7.f35320i
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r1 = 0
            if (r0 == 0) goto L11
            boolean r0 = r7.f35321j
            if (r0 != 0) goto L11
            return r1
        L11:
            int r0 = r7.f35316e
            if (r0 == 0) goto L54
            r4 = 1
            if (r0 == r4) goto L53
            r5 = 2
            if (r0 == r5) goto L4d
            r12 = 3
            if (r0 != r12) goto L47
            G1.h r12 = r7.f35323l
            long r12 = r12.c()
            long r12 = G1.M.M0(r12)
            long r5 = r7.f35318g
            long r12 = r12 - r5
            boolean r0 = r7.f35315d
            if (r0 == 0) goto L46
            boolean r0 = r7.f35326o
            if (r0 != 0) goto L3d
            long r5 = r7.f35317f
            int r0 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r0 == 0) goto L46
            int r8 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r8 == 0) goto L46
        L3d:
            g2.s$b r7 = r7.f35312a
            boolean r7 = r7.A(r10, r12)
            if (r7 == 0) goto L46
            return r4
        L46:
            return r1
        L47:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            r7.<init>()
            throw r7
        L4d:
            int r7 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r7 < 0) goto L52
            return r4
        L52:
            return r1
        L53:
            return r4
        L54:
            boolean r7 = r7.f35315d
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: g2.s.q(long, long, long):boolean");
    }
}
