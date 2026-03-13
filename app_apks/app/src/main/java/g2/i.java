package g2;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f35161c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f35162d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f35164f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a f35159a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a f35160b = new a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f35163e = -9223372036854775807L;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f35165a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f35166b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f35167c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f35168d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f35169e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public long f35170f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final boolean[] f35171g = new boolean[15];

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f35172h;

        public static int c(long j10) {
            return (int) (j10 % 15);
        }

        public long a() {
            long j10 = this.f35169e;
            if (j10 == 0) {
                return 0L;
            }
            return this.f35170f / j10;
        }

        public long b() {
            return this.f35170f;
        }

        public boolean d() {
            long j10 = this.f35168d;
            if (j10 == 0) {
                return false;
            }
            return this.f35171g[c(j10 - 1)];
        }

        public boolean e() {
            return this.f35168d > 15 && this.f35172h == 0;
        }

        public void f(long j10) {
            long j11 = this.f35168d;
            if (j11 == 0) {
                this.f35165a = j10;
            } else if (j11 == 1) {
                long j12 = j10 - this.f35165a;
                this.f35166b = j12;
                this.f35170f = j12;
                this.f35169e = 1L;
            } else {
                long j13 = j10 - this.f35167c;
                int iC = c(j11);
                if (Math.abs(j13 - this.f35166b) <= 1000000) {
                    this.f35169e++;
                    this.f35170f += j13;
                    boolean[] zArr = this.f35171g;
                    if (zArr[iC]) {
                        zArr[iC] = false;
                        this.f35172h--;
                    }
                } else {
                    boolean[] zArr2 = this.f35171g;
                    if (!zArr2[iC]) {
                        zArr2[iC] = true;
                        this.f35172h++;
                    }
                }
            }
            this.f35168d++;
            this.f35167c = j10;
        }

        public void g() {
            this.f35168d = 0L;
            this.f35169e = 0L;
            this.f35170f = 0L;
            this.f35172h = 0;
            Arrays.fill(this.f35171g, false);
        }
    }

    public long a() {
        if (e()) {
            return this.f35159a.a();
        }
        return -9223372036854775807L;
    }

    public float b() {
        if (e()) {
            return (float) (1.0E9d / this.f35159a.a());
        }
        return -1.0f;
    }

    public int c() {
        return this.f35164f;
    }

    public long d() {
        if (e()) {
            return this.f35159a.b();
        }
        return -9223372036854775807L;
    }

    public boolean e() {
        return this.f35159a.e();
    }

    public void f(long j10) {
        this.f35159a.f(j10);
        if (this.f35159a.e() && !this.f35162d) {
            this.f35161c = false;
        } else if (this.f35163e != -9223372036854775807L) {
            if (!this.f35161c || this.f35160b.d()) {
                this.f35160b.g();
                this.f35160b.f(this.f35163e);
            }
            this.f35161c = true;
            this.f35160b.f(j10);
        }
        if (this.f35161c && this.f35160b.e()) {
            a aVar = this.f35159a;
            this.f35159a = this.f35160b;
            this.f35160b = aVar;
            this.f35161c = false;
            this.f35162d = false;
        }
        this.f35163e = j10;
        this.f35164f = this.f35159a.e() ? 0 : this.f35164f + 1;
    }

    public void g() {
        this.f35159a.g();
        this.f35160b.g();
        this.f35161c = false;
        this.f35163e = -9223372036854775807L;
        this.f35164f = 0;
    }
}
