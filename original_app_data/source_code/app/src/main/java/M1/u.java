package M1;

import G1.AbstractC0853a;
import G1.InterfaceC0860h;
import G1.M;
import android.media.AudioTrack;
import io.flutter.embedding.android.KeyboardMap;
import io.sentry.TransactionOptions;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class u {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public long f9177A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public long f9178B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public long f9179C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public boolean f9180D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public long f9181E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public long f9182F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public boolean f9183G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public long f9184H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public InterfaceC0860h f9185I;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f9186a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long[] f9187b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public AudioTrack f9188c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f9189d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public t f9190e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f9191f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f9192g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f9193h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f9194i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f9195j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f9196k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f9197l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f9198m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f9199n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Method f9200o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f9201p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f9202q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f9203r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f9204s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f9205t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f9206u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f9207v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public long f9208w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f9209x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f9210y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public long f9211z;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface a {
        void a(int i10, long j10);

        void b(long j10);

        void c(long j10, long j11, long j12, long j13);

        void d(long j10);

        void e(long j10, long j11, long j12, long j13);
    }

    public u(a aVar) {
        this.f9186a = (a) AbstractC0853a.e(aVar);
        try {
            this.f9200o = AudioTrack.class.getMethod("getLatency", null);
        } catch (NoSuchMethodException unused) {
        }
        this.f9187b = new long[10];
        this.f9182F = -9223372036854775807L;
        this.f9181E = -9223372036854775807L;
        this.f9185I = InterfaceC0860h.f4292a;
    }

    public static boolean q(int i10) {
        return false;
    }

    public void a() {
        this.f9183G = true;
        t tVar = this.f9190e;
        if (tVar != null) {
            tVar.d();
        }
    }

    public final boolean b() {
        return this.f9192g && ((AudioTrack) AbstractC0853a.e(this.f9188c)).getPlayState() == 2 && d() == 0;
    }

    public long c() {
        AudioTrack audioTrack = (AudioTrack) AbstractC0853a.e(this.f9188c);
        if (audioTrack.getPlayState() == 3) {
            n();
        }
        long jB = this.f9185I.b() / 1000;
        t tVar = (t) AbstractC0853a.e(this.f9190e);
        boolean zF = tVar.f();
        long jE = zF ? tVar.e(jB, this.f9194i) : e(jB);
        int playState = audioTrack.getPlayState();
        if (playState != 3) {
            if (playState == 1) {
                o(jE);
            }
            return jE;
        }
        if (zF || !tVar.h()) {
            o(jE);
        }
        long j10 = this.f9182F;
        if (j10 != -9223372036854775807L) {
            long j11 = jE - this.f9181E;
            long jG0 = M.g0(jB - j10, this.f9194i);
            long j12 = this.f9181E + jG0;
            long jAbs = Math.abs(j12 - jE);
            if (j11 != 0 && jAbs < 1000000) {
                long j13 = (jG0 * 10) / 100;
                jE = M.p(jE, j12 - j13, j12 + j13);
            }
        }
        if (!this.f9180D && !this.f9195j) {
            long j14 = this.f9181E;
            if (j14 != -9223372036854775807L && jE > j14) {
                this.f9195j = true;
                this.f9186a.d(this.f9185I.a() - M.o1(M.m0(M.o1(jE - j14), this.f9194i)));
            }
        }
        this.f9182F = jB;
        this.f9181E = jE;
        return jE;
    }

    public final long d() {
        if (this.f9211z != -9223372036854775807L) {
            return Math.min(this.f9179C, g());
        }
        long jC = this.f9185I.c();
        if (jC - this.f9205t >= 5) {
            y(jC);
            this.f9205t = jC;
        }
        return this.f9206u + this.f9184H + (this.f9207v << 32);
    }

    public final long e(long j10) {
        long jMax = Math.max(0L, (this.f9210y == 0 ? this.f9211z != -9223372036854775807L ? M.Z0(g(), this.f9191f) : f() : M.g0(j10 + this.f9198m, this.f9194i)) - this.f9201p);
        return this.f9211z != -9223372036854775807L ? Math.min(M.Z0(this.f9179C, this.f9191f), jMax) : jMax;
    }

    public final long f() {
        return M.Z0(d(), this.f9191f);
    }

    public final long g() {
        if (((AudioTrack) AbstractC0853a.e(this.f9188c)).getPlayState() == 2) {
            return this.f9178B;
        }
        return this.f9178B + M.E(M.g0(M.M0(this.f9185I.c()) - this.f9211z, this.f9194i), this.f9191f);
    }

    public void h(long j10) {
        this.f9178B = d();
        this.f9211z = M.M0(this.f9185I.c());
        this.f9179C = j10;
    }

    public final boolean i() {
        int underrunCount = ((AudioTrack) AbstractC0853a.e(this.f9188c)).getUnderrunCount();
        boolean z10 = underrunCount > this.f9197l;
        this.f9197l = underrunCount;
        return z10;
    }

    public boolean j(long j10) {
        return j10 > M.E(c(), this.f9191f) || b();
    }

    public boolean k() {
        return ((AudioTrack) AbstractC0853a.e(this.f9188c)).getPlayState() == 3;
    }

    public boolean l(long j10) {
        return this.f9177A != -9223372036854775807L && j10 > 0 && this.f9185I.c() - this.f9177A >= 200;
    }

    public boolean m(long j10) {
        int playState = ((AudioTrack) AbstractC0853a.e(this.f9188c)).getPlayState();
        if (this.f9192g) {
            if (playState == 2) {
                this.f9202q = false;
                return false;
            }
            if (playState == 1 && d() == 0) {
                return false;
            }
        }
        if (i()) {
            this.f9186a.a(this.f9189d, M.o1(this.f9193h));
        }
        return true;
    }

    public final void n() {
        long jB = this.f9185I.b() / 1000;
        if (jB - this.f9199n >= TransactionOptions.DEFAULT_DEADLINE_TIMEOUT_AUTO_TRANSACTION) {
            long jF = f();
            if (jF != 0) {
                this.f9187b[this.f9209x] = M.m0(jF, this.f9194i) - jB;
                this.f9209x = (this.f9209x + 1) % 10;
                int i10 = this.f9210y;
                if (i10 < 10) {
                    this.f9210y = i10 + 1;
                }
                this.f9199n = jB;
                this.f9198m = 0L;
                int i11 = 0;
                while (true) {
                    int i12 = this.f9210y;
                    if (i11 >= i12) {
                        break;
                    }
                    this.f9198m += this.f9187b[i11] / ((long) i12);
                    i11++;
                }
            } else {
                return;
            }
        }
        if (this.f9192g) {
            return;
        }
        p(jB);
        ((t) AbstractC0853a.e(this.f9190e)).i(jB, this.f9194i, e(jB));
    }

    public final void o(long j10) {
        if (this.f9180D) {
            long j11 = this.f9196k;
            if (j11 == -9223372036854775807L || j10 < j11) {
                return;
            }
            long jA = this.f9185I.a() - M.o1(M.m0(j10 - j11, this.f9194i));
            this.f9196k = -9223372036854775807L;
            this.f9186a.d(jA);
        }
    }

    public final void p(long j10) {
        Method method;
        if (!this.f9203r || (method = this.f9200o) == null || j10 - this.f9204s < 500000) {
            return;
        }
        try {
            long jIntValue = (((long) ((Integer) M.i((Integer) method.invoke(AbstractC0853a.e(this.f9188c), null))).intValue()) * 1000) - this.f9193h;
            this.f9201p = jIntValue;
            long jMax = Math.max(jIntValue, 0L);
            this.f9201p = jMax;
            if (jMax > 5000000) {
                this.f9186a.b(jMax);
                this.f9201p = 0L;
            }
        } catch (Exception unused) {
            this.f9200o = null;
        }
        this.f9204s = j10;
    }

    public void r() {
        t();
        if (this.f9211z == -9223372036854775807L) {
            ((t) AbstractC0853a.e(this.f9190e)).j();
        }
        this.f9178B = d();
    }

    public void s() {
        t();
        this.f9188c = null;
        this.f9190e = null;
    }

    public final void t() {
        this.f9198m = 0L;
        this.f9210y = 0;
        this.f9209x = 0;
        this.f9199n = 0L;
        this.f9181E = -9223372036854775807L;
        this.f9182F = -9223372036854775807L;
        this.f9195j = false;
    }

    public void u(AudioTrack audioTrack, boolean z10, int i10, int i11, int i12, boolean z11) {
        this.f9188c = audioTrack;
        this.f9189d = i12;
        this.f9190e = new t(audioTrack, this.f9186a);
        this.f9191f = audioTrack.getSampleRate();
        this.f9192g = z10 && q(i10);
        boolean zD0 = M.D0(i10);
        this.f9203r = zD0;
        this.f9193h = zD0 ? M.Z0(i12 / i11, this.f9191f) : -9223372036854775807L;
        this.f9206u = 0L;
        this.f9207v = 0L;
        this.f9183G = false;
        this.f9184H = 0L;
        this.f9208w = 0L;
        this.f9202q = false;
        this.f9211z = -9223372036854775807L;
        this.f9177A = -9223372036854775807L;
        this.f9204s = 0L;
        this.f9201p = 0L;
        this.f9194i = 1.0f;
        this.f9197l = 0;
        this.f9196k = -9223372036854775807L;
        this.f9180D = z11;
    }

    public void v(float f10) {
        this.f9194i = f10;
        t tVar = this.f9190e;
        if (tVar != null) {
            tVar.j();
        }
        t();
    }

    public void w(InterfaceC0860h interfaceC0860h) {
        this.f9185I = interfaceC0860h;
    }

    public void x() {
        if (this.f9211z != -9223372036854775807L) {
            this.f9211z = M.M0(this.f9185I.c());
        }
        this.f9196k = f();
        ((t) AbstractC0853a.e(this.f9190e)).j();
    }

    public final void y(long j10) {
        AudioTrack audioTrack = (AudioTrack) AbstractC0853a.e(this.f9188c);
        int playState = audioTrack.getPlayState();
        if (playState == 1) {
            return;
        }
        long playbackHeadPosition = ((long) audioTrack.getPlaybackHeadPosition()) & KeyboardMap.kValueMask;
        if (this.f9192g) {
            if (playState == 2 && playbackHeadPosition == 0) {
                this.f9208w = this.f9206u;
            }
            playbackHeadPosition += this.f9208w;
        }
        long j11 = this.f9206u;
        if (j11 > playbackHeadPosition) {
            if (this.f9183G) {
                this.f9184H += j11;
                this.f9183G = false;
            } else {
                this.f9207v++;
            }
        }
        this.f9206u = playbackHeadPosition;
    }
}
