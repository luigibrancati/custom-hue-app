package K1;

import D1.r;
import android.os.SystemClock;

/* JADX INFO: renamed from: K1.l, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C1007l implements D0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f7223a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f7224b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f7225c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f7226d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f7227e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f7228f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f7229g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f7230h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f7231i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f7232j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f7233k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f7234l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f7235m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f7236n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f7237o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f7238p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f7239q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f7240r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f7241s;

    /* JADX INFO: renamed from: K1.l$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public float f7242a = 0.97f;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f7243b = 1.03f;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f7244c = 1000;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public float f7245d = 1.0E-7f;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f7246e = G1.M.M0(20);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public long f7247f = G1.M.M0(500);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public float f7248g = 0.999f;

        public C1007l a() {
            return new C1007l(this.f7242a, this.f7243b, this.f7244c, this.f7245d, this.f7246e, this.f7247f, this.f7248g);
        }
    }

    public static long h(long j10, long j11, float f10) {
        return (long) ((j10 * f10) + ((1.0f - f10) * j11));
    }

    @Override // K1.D0
    public float a(long j10, long j11) {
        if (this.f7230h == -9223372036854775807L) {
            return 1.0f;
        }
        i(j10, j11);
        if (this.f7239q != -9223372036854775807L && SystemClock.elapsedRealtime() - this.f7239q < this.f7225c) {
            return this.f7238p;
        }
        this.f7239q = SystemClock.elapsedRealtime();
        f(j10);
        long j12 = j10 - this.f7235m;
        if (Math.abs(j12) < this.f7227e) {
            this.f7238p = 1.0f;
        } else {
            this.f7238p = G1.M.n((this.f7226d * j12) + 1.0f, this.f7237o, this.f7236n);
        }
        return this.f7238p;
    }

    @Override // K1.D0
    public long b() {
        return this.f7235m;
    }

    @Override // K1.D0
    public void c() {
        long j10 = this.f7235m;
        if (j10 == -9223372036854775807L) {
            return;
        }
        long j11 = j10 + this.f7228f;
        this.f7235m = j11;
        long j12 = this.f7234l;
        if (j12 != -9223372036854775807L && j11 > j12) {
            this.f7235m = j12;
        }
        this.f7239q = -9223372036854775807L;
    }

    @Override // K1.D0
    public void d(r.g gVar) {
        this.f7230h = G1.M.M0(gVar.f1950a);
        this.f7233k = G1.M.M0(gVar.f1951b);
        this.f7234l = G1.M.M0(gVar.f1952c);
        float f10 = gVar.f1953d;
        if (f10 == -3.4028235E38f) {
            f10 = this.f7223a;
        }
        this.f7237o = f10;
        float f11 = gVar.f1954e;
        if (f11 == -3.4028235E38f) {
            f11 = this.f7224b;
        }
        this.f7236n = f11;
        if (f10 == 1.0f && f11 == 1.0f) {
            this.f7230h = -9223372036854775807L;
        }
        g();
    }

    @Override // K1.D0
    public void e(long j10) {
        this.f7231i = j10;
        g();
    }

    public final void f(long j10) {
        long j11 = this.f7240r + (this.f7241s * 3);
        if (this.f7235m > j11) {
            float fM0 = G1.M.M0(this.f7225c);
            this.f7235m = N7.i.d(j11, this.f7232j, this.f7235m - (((long) ((this.f7238p - 1.0f) * fM0)) + ((long) ((this.f7236n - 1.0f) * fM0))));
            return;
        }
        long jP = G1.M.p(j10 - ((long) (Math.max(0.0f, this.f7238p - 1.0f) / this.f7226d)), this.f7235m, j11);
        this.f7235m = jP;
        long j12 = this.f7234l;
        if (j12 == -9223372036854775807L || jP <= j12) {
            return;
        }
        this.f7235m = j12;
    }

    public final void g() {
        long j10;
        long j11 = this.f7230h;
        if (j11 != -9223372036854775807L) {
            j10 = this.f7231i;
            if (j10 == -9223372036854775807L) {
                long j12 = this.f7233k;
                if (j12 != -9223372036854775807L && j11 < j12) {
                    j11 = j12;
                }
                j10 = this.f7234l;
                if (j10 == -9223372036854775807L || j11 <= j10) {
                    j10 = j11;
                }
            }
        } else {
            j10 = -9223372036854775807L;
        }
        if (this.f7232j == j10) {
            return;
        }
        this.f7232j = j10;
        this.f7235m = j10;
        this.f7240r = -9223372036854775807L;
        this.f7241s = -9223372036854775807L;
        this.f7239q = -9223372036854775807L;
    }

    public final void i(long j10, long j11) {
        long j12 = j10 - j11;
        long j13 = this.f7240r;
        if (j13 == -9223372036854775807L) {
            this.f7240r = j12;
            this.f7241s = 0L;
        } else {
            long jMax = Math.max(j12, h(j13, j12, this.f7229g));
            this.f7240r = jMax;
            this.f7241s = h(this.f7241s, Math.abs(j12 - jMax), this.f7229g);
        }
    }

    public C1007l(float f10, float f11, long j10, float f12, long j11, long j12, float f13) {
        this.f7223a = f10;
        this.f7224b = f11;
        this.f7225c = j10;
        this.f7226d = f12;
        this.f7227e = j11;
        this.f7228f = j12;
        this.f7229g = f13;
        this.f7230h = -9223372036854775807L;
        this.f7231i = -9223372036854775807L;
        this.f7233k = -9223372036854775807L;
        this.f7234l = -9223372036854775807L;
        this.f7237o = f10;
        this.f7236n = f11;
        this.f7238p = 1.0f;
        this.f7239q = -9223372036854775807L;
        this.f7232j = -9223372036854775807L;
        this.f7235m = -9223372036854775807L;
        this.f7240r = -9223372036854775807L;
        this.f7241s = -9223372036854775807L;
    }
}
