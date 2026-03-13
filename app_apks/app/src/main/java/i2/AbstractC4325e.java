package i2;

import G1.AbstractC0853a;
import i2.J;

/* JADX INFO: renamed from: i2.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4325e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f36963a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f36964b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public c f36965c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f36966d;

    /* JADX INFO: renamed from: i2.e$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class a implements J {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f36967a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f36968b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f36969c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long f36970d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final long f36971e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final long f36972f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final long f36973g;

        public a(d dVar, long j10, long j11, long j12, long j13, long j14, long j15) {
            this.f36967a = dVar;
            this.f36968b = j10;
            this.f36969c = j11;
            this.f36970d = j12;
            this.f36971e = j13;
            this.f36972f = j14;
            this.f36973g = j15;
        }

        @Override // i2.J
        public J.a e(long j10) {
            return new J.a(new K(j10, c.h(this.f36967a.a(j10), this.f36969c, this.f36970d, this.f36971e, this.f36972f, this.f36973g)));
        }

        @Override // i2.J
        public boolean h() {
            return true;
        }

        public long k(long j10) {
            return this.f36967a.a(j10);
        }

        @Override // i2.J
        public long m() {
            return this.f36968b;
        }
    }

    /* JADX INFO: renamed from: i2.e$c */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f36974a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f36975b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f36976c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f36977d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f36978e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public long f36979f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public long f36980g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public long f36981h;

        public c(long j10, long j11, long j12, long j13, long j14, long j15, long j16) {
            this.f36974a = j10;
            this.f36975b = j11;
            this.f36977d = j12;
            this.f36978e = j13;
            this.f36979f = j14;
            this.f36980g = j15;
            this.f36976c = j16;
            this.f36981h = h(j11, j12, j13, j14, j15, j16);
        }

        public static long h(long j10, long j11, long j12, long j13, long j14, long j15) {
            if (j13 + 1 >= j14 || j11 + 1 >= j12) {
                return j13;
            }
            long j16 = (long) ((j10 - j11) * ((j14 - j13) / (j12 - j11)));
            return G1.M.p(((j16 + j13) - j15) - (j16 / 20), j13, j14 - 1);
        }

        public final long i() {
            return this.f36980g;
        }

        public final long j() {
            return this.f36979f;
        }

        public final long k() {
            return this.f36981h;
        }

        public final long l() {
            return this.f36974a;
        }

        public final long m() {
            return this.f36975b;
        }

        public final void n() {
            this.f36981h = h(this.f36975b, this.f36977d, this.f36978e, this.f36979f, this.f36980g, this.f36976c);
        }

        public final void o(long j10, long j11) {
            this.f36978e = j10;
            this.f36980g = j11;
            n();
        }

        public final void p(long j10, long j11) {
            this.f36977d = j10;
            this.f36979f = j11;
            n();
        }
    }

    /* JADX INFO: renamed from: i2.e$d */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface d {
        long a(long j10);
    }

    /* JADX INFO: renamed from: i2.e$e, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class C0484e {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final C0484e f36982d = new C0484e(-3, -9223372036854775807L, -1);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f36983a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f36984b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f36985c;

        public C0484e(int i10, long j10, long j11) {
            this.f36983a = i10;
            this.f36984b = j10;
            this.f36985c = j11;
        }

        public static C0484e d(long j10, long j11) {
            return new C0484e(-1, j10, j11);
        }

        public static C0484e e(long j10) {
            return new C0484e(0, -9223372036854775807L, j10);
        }

        public static C0484e f(long j10, long j11) {
            return new C0484e(-2, j10, j11);
        }
    }

    public AbstractC4325e(d dVar, f fVar, long j10, long j11, long j12, long j13, long j14, long j15, int i10) {
        this.f36964b = fVar;
        this.f36966d = i10;
        this.f36963a = new a(dVar, j10, j11, j12, j13, j14, j15);
    }

    public c a(long j10) {
        return new c(j10, this.f36963a.k(j10), this.f36963a.f36969c, this.f36963a.f36970d, this.f36963a.f36971e, this.f36963a.f36972f, this.f36963a.f36973g);
    }

    public final J b() {
        return this.f36963a;
    }

    public int c(InterfaceC4337q interfaceC4337q, I i10) {
        while (true) {
            c cVar = (c) AbstractC0853a.i(this.f36965c);
            long j10 = cVar.j();
            long jI = cVar.i();
            long jK = cVar.k();
            if (jI - j10 <= this.f36966d) {
                e(false, j10);
                return g(interfaceC4337q, j10, i10);
            }
            if (!i(interfaceC4337q, jK)) {
                return g(interfaceC4337q, jK, i10);
            }
            interfaceC4337q.i();
            C0484e c0484eA = this.f36964b.a(interfaceC4337q, cVar.m());
            int i11 = c0484eA.f36983a;
            if (i11 == -3) {
                e(false, jK);
                return g(interfaceC4337q, jK, i10);
            }
            if (i11 == -2) {
                cVar.p(c0484eA.f36984b, c0484eA.f36985c);
            } else {
                if (i11 != -1) {
                    if (i11 != 0) {
                        throw new IllegalStateException("Invalid case");
                    }
                    i(interfaceC4337q, c0484eA.f36985c);
                    e(true, c0484eA.f36985c);
                    return g(interfaceC4337q, c0484eA.f36985c, i10);
                }
                cVar.o(c0484eA.f36984b, c0484eA.f36985c);
            }
        }
    }

    public final boolean d() {
        return this.f36965c != null;
    }

    public final void e(boolean z10, long j10) {
        this.f36965c = null;
        this.f36964b.b();
        f(z10, j10);
    }

    public final int g(InterfaceC4337q interfaceC4337q, long j10, I i10) {
        if (j10 == interfaceC4337q.getPosition()) {
            return 0;
        }
        i10.f36871a = j10;
        return 1;
    }

    public final void h(long j10) {
        c cVar = this.f36965c;
        if (cVar == null || cVar.l() != j10) {
            this.f36965c = a(j10);
        }
    }

    public final boolean i(InterfaceC4337q interfaceC4337q, long j10) {
        long position = j10 - interfaceC4337q.getPosition();
        if (position < 0 || position > 262144) {
            return false;
        }
        interfaceC4337q.q((int) position);
        return true;
    }

    /* JADX INFO: renamed from: i2.e$f */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface f {
        C0484e a(InterfaceC4337q interfaceC4337q, long j10);

        default void b() {
        }
    }

    /* JADX INFO: renamed from: i2.e$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b implements d {
        @Override // i2.AbstractC4325e.d
        public long a(long j10) {
            return j10;
        }
    }

    public void f(boolean z10, long j10) {
    }
}
