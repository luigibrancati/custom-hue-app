package M1;

import G1.M;
import M1.u;
import android.media.AudioTimestamp;
import android.media.AudioTrack;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f9161a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f9162b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u.a f9163c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f9164d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f9165e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f9166f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f9167g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f9168h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f9169i;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AudioTrack f9170a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AudioTimestamp f9171b = new AudioTimestamp();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f9172c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f9173d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f9174e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f9175f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public long f9176g;

        public a(AudioTrack audioTrack) {
            this.f9170a = audioTrack;
        }

        public void a() {
            this.f9175f = true;
        }

        public long b() {
            return this.f9174e;
        }

        public long c() {
            return this.f9171b.nanoTime / 1000;
        }

        public boolean d() {
            boolean timestamp = this.f9170a.getTimestamp(this.f9171b);
            if (timestamp) {
                long j10 = this.f9171b.framePosition;
                long j11 = this.f9173d;
                if (j11 > j10) {
                    if (this.f9175f) {
                        this.f9176g += j11;
                        this.f9175f = false;
                    } else {
                        this.f9172c++;
                    }
                }
                this.f9173d = j10;
                this.f9174e = j10 + this.f9176g + (this.f9172c << 32);
            }
            return timestamp;
        }
    }

    public t(AudioTrack audioTrack, u.a aVar) {
        this.f9161a = new a(audioTrack);
        this.f9162b = audioTrack.getSampleRate();
        this.f9163c = aVar;
        j();
    }

    public final void a(long j10, float f10, long j11) {
        long jC = this.f9161a.c();
        long jB = b(j10, f10);
        if (Math.abs(jC - j10) > 5000000) {
            this.f9163c.e(this.f9161a.b(), jC, j10, j11);
            k(4);
        } else if (Math.abs(jB - j11) > 5000000) {
            this.f9163c.c(this.f9161a.b(), jC, j10, j11);
            k(4);
        } else if (this.f9164d == 4) {
            j();
        }
    }

    public final long b(long j10, float f10) {
        return c(this.f9161a.b(), this.f9161a.c(), j10, f10);
    }

    public final long c(long j10, long j11, long j12, float f10) {
        return M.Z0(j10, this.f9162b) + M.g0(j12 - j11, f10);
    }

    public void d() {
        this.f9161a.a();
    }

    public long e(long j10, float f10) {
        return b(j10, f10);
    }

    public boolean f() {
        return this.f9164d == 2;
    }

    public final boolean g(long j10, float f10) {
        long jB = this.f9161a.b();
        long j11 = this.f9168h;
        if (jB <= j11) {
            return false;
        }
        return Math.abs(b(j10, f10) - c(j11, this.f9169i, j10, f10)) < 1000;
    }

    public boolean h() {
        int i10 = this.f9164d;
        return i10 == 0 || i10 == 1;
    }

    public void i(long j10, float f10, long j11) {
        if (j10 - this.f9167g < this.f9166f) {
            return;
        }
        this.f9167g = j10;
        boolean zD = this.f9161a.d();
        if (zD) {
            a(j10, f10, j11);
        }
        int i10 = this.f9164d;
        if (i10 == 0) {
            if (!zD) {
                if (j10 - this.f9165e > 500000) {
                    k(3);
                    return;
                }
                return;
            } else {
                if (this.f9161a.c() >= this.f9165e) {
                    this.f9168h = this.f9161a.b();
                    this.f9169i = this.f9161a.c();
                    k(1);
                    return;
                }
                return;
            }
        }
        if (i10 == 1) {
            if (!zD) {
                j();
                return;
            }
            if (g(j10, f10)) {
                k(2);
                return;
            } else if (j10 - this.f9165e > 2000000) {
                k(3);
                return;
            } else {
                this.f9168h = this.f9161a.b();
                this.f9169i = this.f9161a.c();
                return;
            }
        }
        if (i10 == 2) {
            if (zD) {
                return;
            }
            j();
        } else if (i10 != 3) {
            if (i10 != 4) {
                throw new IllegalStateException();
            }
        } else if (zD) {
            j();
        }
    }

    public void j() {
        k(0);
    }

    public final void k(int i10) {
        this.f9164d = i10;
        if (i10 == 0) {
            this.f9167g = 0L;
            this.f9168h = -1L;
            this.f9169i = -9223372036854775807L;
            this.f9165e = System.nanoTime() / 1000;
            this.f9166f = 10000L;
            return;
        }
        if (i10 == 1) {
            this.f9166f = 10000L;
            return;
        }
        if (i10 == 2 || i10 == 3) {
            this.f9166f = 10000000L;
        } else {
            if (i10 != 4) {
                throw new IllegalStateException();
            }
            this.f9166f = 500000L;
        }
    }
}
