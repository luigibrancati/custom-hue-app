package P2;

import i2.AbstractC4325e;
import i2.InterfaceC4337q;
import org.apache.tika.pipes.PipesConfigBase;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class H extends AbstractC4325e {

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a implements AbstractC4325e.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final G1.H f12717a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final G1.C f12718b = new G1.C();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f12719c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f12720d;

        public a(int i10, G1.H h10, int i11) {
            this.f12719c = i10;
            this.f12717a = h10;
            this.f12720d = i11;
        }

        @Override // i2.AbstractC4325e.f
        public AbstractC4325e.C0484e a(InterfaceC4337q interfaceC4337q, long j10) {
            long position = interfaceC4337q.getPosition();
            int iMin = (int) Math.min(this.f12720d, interfaceC4337q.getLength() - position);
            this.f12718b.W(iMin);
            interfaceC4337q.s(this.f12718b.f(), 0, iMin);
            return c(this.f12718b, j10, position);
        }

        @Override // i2.AbstractC4325e.f
        public void b() {
            this.f12718b.X(G1.M.f4267f);
        }

        public final AbstractC4325e.C0484e c(G1.C c10, long j10, long j11) {
            int iA;
            int iA2;
            int iJ = c10.j();
            long j12 = -1;
            long j13 = -1;
            long j14 = -9223372036854775807L;
            while (c10.a() >= 188 && (iA2 = (iA = M.a(c10.f(), c10.g(), iJ)) + 188) <= iJ) {
                long jC = M.c(c10, iA, this.f12719c);
                if (jC != -9223372036854775807L) {
                    long jB = this.f12717a.b(jC);
                    if (jB > j10) {
                        return j14 == -9223372036854775807L ? AbstractC4325e.C0484e.d(jB, j11) : AbstractC4325e.C0484e.e(j11 + j13);
                    }
                    if (PipesConfigBase.DEFAULT_MAX_FOR_EMIT_BATCH + jB > j10) {
                        return AbstractC4325e.C0484e.e(((long) iA) + j11);
                    }
                    j13 = iA;
                    j14 = jB;
                }
                c10.a0(iA2);
                j12 = iA2;
            }
            return j14 != -9223372036854775807L ? AbstractC4325e.C0484e.f(j14, j11 + j12) : AbstractC4325e.C0484e.f36982d;
        }
    }

    public H(G1.H h10, long j10, long j11, int i10, int i11) {
        super(new AbstractC4325e.b(), new a(i10, h10, i11), j10, 0L, j10 + 1, 0L, j11, 188L, 940);
    }
}
