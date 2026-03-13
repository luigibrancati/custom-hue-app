package P2;

import i2.InterfaceC4337q;
import org.apache.tika.fork.ForkServer;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class A {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f12680c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f12681d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f12682e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final G1.H f12678a = new G1.H(0);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f12683f = -9223372036854775807L;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f12684g = -9223372036854775807L;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f12685h = -9223372036854775807L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final G1.C f12679b = new G1.C();

    public static boolean a(byte[] bArr) {
        return (bArr[0] & 196) == 68 && (bArr[2] & 4) == 4 && (bArr[4] & 4) == 4 && (bArr[5] & 1) == 1 && (bArr[8] & 3) == 3;
    }

    public static long l(G1.C c10) {
        int iG = c10.g();
        if (c10.a() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        c10.q(bArr, 0, 9);
        c10.a0(iG);
        if (a(bArr)) {
            return m(bArr);
        }
        return -9223372036854775807L;
    }

    public static long m(byte[] bArr) {
        byte b10 = bArr[0];
        long j10 = (((((long) b10) & 56) >> 3) << 30) | ((((long) b10) & 3) << 28) | ((((long) bArr[1]) & 255) << 20);
        byte b11 = bArr[2];
        return j10 | (((((long) b11) & 248) >> 3) << 15) | ((((long) b11) & 3) << 13) | ((((long) bArr[3]) & 255) << 5) | ((((long) bArr[4]) & 248) >> 3);
    }

    public final int b(InterfaceC4337q interfaceC4337q) {
        this.f12679b.X(G1.M.f4267f);
        this.f12680c = true;
        interfaceC4337q.i();
        return 0;
    }

    public long c() {
        return this.f12685h;
    }

    public G1.H d() {
        return this.f12678a;
    }

    public boolean e() {
        return this.f12680c;
    }

    public final int f(byte[] bArr, int i10) {
        return ((bArr[i10] & ForkServer.ERROR) << 24) | ((bArr[i10 + 1] & ForkServer.ERROR) << 16) | ((bArr[i10 + 2] & ForkServer.ERROR) << 8) | (bArr[i10 + 3] & ForkServer.ERROR);
    }

    public int g(InterfaceC4337q interfaceC4337q, i2.I i10) {
        if (!this.f12682e) {
            return j(interfaceC4337q, i10);
        }
        if (this.f12684g == -9223372036854775807L) {
            return b(interfaceC4337q);
        }
        if (!this.f12681d) {
            return h(interfaceC4337q, i10);
        }
        long j10 = this.f12683f;
        if (j10 == -9223372036854775807L) {
            return b(interfaceC4337q);
        }
        this.f12685h = this.f12678a.c(this.f12684g) - this.f12678a.b(j10);
        return b(interfaceC4337q);
    }

    public final int h(InterfaceC4337q interfaceC4337q, i2.I i10) {
        int iMin = (int) Math.min(20000L, interfaceC4337q.getLength());
        long j10 = 0;
        if (interfaceC4337q.getPosition() != j10) {
            i10.f36871a = j10;
            return 1;
        }
        this.f12679b.W(iMin);
        interfaceC4337q.i();
        interfaceC4337q.s(this.f12679b.f(), 0, iMin);
        this.f12683f = i(this.f12679b);
        this.f12681d = true;
        return 0;
    }

    public final long i(G1.C c10) {
        int iJ = c10.j();
        for (int iG = c10.g(); iG < iJ - 3; iG++) {
            if (f(c10.f(), iG) == 442) {
                c10.a0(iG + 4);
                long jL = l(c10);
                if (jL != -9223372036854775807L) {
                    return jL;
                }
            }
        }
        return -9223372036854775807L;
    }

    public final int j(InterfaceC4337q interfaceC4337q, i2.I i10) {
        long length = interfaceC4337q.getLength();
        int iMin = (int) Math.min(20000L, length);
        long j10 = length - ((long) iMin);
        if (interfaceC4337q.getPosition() != j10) {
            i10.f36871a = j10;
            return 1;
        }
        this.f12679b.W(iMin);
        interfaceC4337q.i();
        interfaceC4337q.s(this.f12679b.f(), 0, iMin);
        this.f12684g = k(this.f12679b);
        this.f12682e = true;
        return 0;
    }

    public final long k(G1.C c10) {
        int iG = c10.g();
        for (int iJ = c10.j() - 4; iJ >= iG; iJ--) {
            if (f(c10.f(), iJ) == 442) {
                c10.a0(iJ + 4);
                long jL = l(c10);
                if (jL != -9223372036854775807L) {
                    return jL;
                }
            }
        }
        return -9223372036854775807L;
    }
}
