package W1;

import G1.AbstractC0853a;
import G1.C;
import android.os.SystemClock;
import i2.I;
import i2.InterfaceC4336p;
import i2.InterfaceC4337q;
import i2.J;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class c implements InterfaceC4336p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final X1.k f17693a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f17696d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public i2.r f17699g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f17700h;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f17703k;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C f17694b = new C(65507);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C f17695c = new C();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f17697e = new Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final f f17698f = new f();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public volatile long f17701i = -9223372036854775807L;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public volatile int f17702j = -1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f17704l = -9223372036854775807L;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f17705m = -9223372036854775807L;

    public c(g gVar, int i10) {
        this.f17696d = i10;
        this.f17693a = (X1.k) AbstractC0853a.e(new X1.a().a(gVar));
    }

    public static long b(long j10) {
        return j10 - 30;
    }

    @Override // i2.InterfaceC4336p
    public void a(long j10, long j11) {
        synchronized (this.f17697e) {
            try {
                if (!this.f17703k) {
                    this.f17703k = true;
                }
                this.f17704l = j10;
                this.f17705m = j11;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // i2.InterfaceC4336p
    public void c(i2.r rVar) {
        this.f17693a.b(rVar, this.f17696d);
        rVar.n();
        rVar.v(new J.b(-9223372036854775807L));
        this.f17699g = rVar;
    }

    public boolean d() {
        return this.f17700h;
    }

    public void e() {
        synchronized (this.f17697e) {
            this.f17703k = true;
        }
    }

    public void g(int i10) {
        this.f17702j = i10;
    }

    public void h(long j10) {
        this.f17701i = j10;
    }

    @Override // i2.InterfaceC4336p
    public int i(InterfaceC4337q interfaceC4337q, I i10) {
        AbstractC0853a.e(this.f17699g);
        int i11 = interfaceC4337q.read(this.f17694b.f(), 0, 65507);
        if (i11 == -1) {
            return -1;
        }
        if (i11 == 0) {
            return 0;
        }
        this.f17694b.a0(0);
        this.f17694b.Z(i11);
        d dVarD = d.d(this.f17694b);
        if (dVarD == null) {
            return 0;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long jB = b(jElapsedRealtime);
        this.f17698f.d(dVarD, jElapsedRealtime);
        d dVarE = this.f17698f.e(jB);
        if (dVarE == null) {
            return 0;
        }
        if (!this.f17700h) {
            if (this.f17701i == -9223372036854775807L) {
                this.f17701i = dVarE.f17714h;
            }
            if (this.f17702j == -1) {
                this.f17702j = dVarE.f17713g;
            }
            this.f17693a.d(this.f17701i, this.f17702j);
            this.f17700h = true;
        }
        synchronized (this.f17697e) {
            try {
                if (!this.f17703k) {
                    do {
                        this.f17695c.X(dVarE.f17717k);
                        this.f17693a.c(this.f17695c, dVarE.f17714h, dVarE.f17713g, dVarE.f17711e);
                        dVarE = this.f17698f.e(jB);
                    } while (dVarE != null);
                } else if (this.f17704l != -9223372036854775807L && this.f17705m != -9223372036854775807L) {
                    this.f17698f.f();
                    this.f17693a.a(this.f17704l, this.f17705m);
                    this.f17703k = false;
                    this.f17704l = -9223372036854775807L;
                    this.f17705m = -9223372036854775807L;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return 0;
    }

    @Override // i2.InterfaceC4336p
    public boolean j(InterfaceC4337q interfaceC4337q) {
        throw new UnsupportedOperationException("RTP packets are transmitted in a packet stream do not support sniffing.");
    }

    @Override // i2.InterfaceC4336p
    public void release() {
    }
}
