package P2;

import i2.AbstractC4325e;
import i2.InterfaceC4337q;
import org.apache.tika.fork.ForkServer;
import org.apache.tika.pipes.PipesConfigBase;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class z extends AbstractC4325e {

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b implements AbstractC4325e.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final G1.H f13099a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final G1.C f13100b;

        public static void d(G1.C c10) {
            int iK;
            int iJ = c10.j();
            if (c10.a() < 10) {
                c10.a0(iJ);
                return;
            }
            c10.b0(9);
            int iL = c10.L() & 7;
            if (c10.a() < iL) {
                c10.a0(iJ);
                return;
            }
            c10.b0(iL);
            if (c10.a() < 4) {
                c10.a0(iJ);
                return;
            }
            if (z.k(c10.f(), c10.g()) == 443) {
                c10.b0(4);
                int iT = c10.T();
                if (c10.a() < iT) {
                    c10.a0(iJ);
                    return;
                }
                c10.b0(iT);
            }
            while (c10.a() >= 4 && (iK = z.k(c10.f(), c10.g())) != 442 && iK != 441 && (iK >>> 8) == 1) {
                c10.b0(4);
                if (c10.a() < 2) {
                    c10.a0(iJ);
                    return;
                }
                c10.a0(Math.min(c10.j(), c10.g() + c10.T()));
            }
        }

        @Override // i2.AbstractC4325e.f
        public AbstractC4325e.C0484e a(InterfaceC4337q interfaceC4337q, long j10) {
            long position = interfaceC4337q.getPosition();
            int iMin = (int) Math.min(20000L, interfaceC4337q.getLength() - position);
            this.f13100b.W(iMin);
            interfaceC4337q.s(this.f13100b.f(), 0, iMin);
            return c(this.f13100b, j10, position);
        }

        @Override // i2.AbstractC4325e.f
        public void b() {
            this.f13100b.X(G1.M.f4267f);
        }

        public final AbstractC4325e.C0484e c(G1.C c10, long j10, long j11) {
            int iG = -1;
            int iG2 = -1;
            long j12 = -9223372036854775807L;
            while (c10.a() >= 4) {
                if (z.k(c10.f(), c10.g()) != 442) {
                    c10.b0(1);
                } else {
                    c10.b0(4);
                    long jL = A.l(c10);
                    if (jL != -9223372036854775807L) {
                        long jB = this.f13099a.b(jL);
                        if (jB > j10) {
                            return j12 == -9223372036854775807L ? AbstractC4325e.C0484e.d(jB, j11) : AbstractC4325e.C0484e.e(j11 + ((long) iG2));
                        }
                        if (PipesConfigBase.DEFAULT_MAX_FOR_EMIT_BATCH + jB > j10) {
                            return AbstractC4325e.C0484e.e(j11 + ((long) c10.g()));
                        }
                        iG2 = c10.g();
                        j12 = jB;
                    }
                    d(c10);
                    iG = c10.g();
                }
            }
            return j12 != -9223372036854775807L ? AbstractC4325e.C0484e.f(j12, j11 + ((long) iG)) : AbstractC4325e.C0484e.f36982d;
        }

        public b(G1.H h10) {
            this.f13099a = h10;
            this.f13100b = new G1.C();
        }
    }

    public z(G1.H h10, long j10, long j11) {
        super(new AbstractC4325e.b(), new b(h10), j10, 0L, j10 + 1, 0L, j11, 188L, 1000);
    }

    public static int k(byte[] bArr, int i10) {
        return (bArr[i10 + 3] & ForkServer.ERROR) | ((bArr[i10] & ForkServer.ERROR) << 24) | ((bArr[i10 + 1] & ForkServer.ERROR) << 16) | ((bArr[i10 + 2] & ForkServer.ERROR) << 8);
    }
}
