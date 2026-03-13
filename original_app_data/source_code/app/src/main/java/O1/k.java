package O1;

import G1.M;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f10830a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f10831b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f10832c;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static abstract class a extends k {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long f10833d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final long f10834e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final List f10835f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final long f10836g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final long f10837h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final long f10838i;

        public a(i iVar, long j10, long j11, long j12, long j13, List list, long j14, long j15, long j16) {
            super(iVar, j10, j11);
            this.f10833d = j12;
            this.f10834e = j13;
            this.f10835f = list;
            this.f10838i = j14;
            this.f10836g = j15;
            this.f10837h = j16;
        }

        public long c(long j10, long j11) {
            long jG = g(j10);
            return jG != -1 ? jG : (int) (i((j11 - this.f10837h) + this.f10838i, j10) - d(j10, j11));
        }

        public long d(long j10, long j11) {
            if (g(j10) == -1) {
                long j12 = this.f10836g;
                if (j12 != -9223372036854775807L) {
                    return Math.max(e(), i((j11 - this.f10837h) - j12, j10));
                }
            }
            return e();
        }

        public long e() {
            return this.f10833d;
        }

        public long f(long j10, long j11) {
            if (this.f10835f != null) {
                return -9223372036854775807L;
            }
            long jD = d(j10, j11) + c(j10, j11);
            return (j(jD) + h(jD, j10)) - this.f10838i;
        }

        public abstract long g(long j10);

        public final long h(long j10, long j11) {
            List list = this.f10835f;
            if (list != null) {
                return (((d) list.get((int) (j10 - this.f10833d))).f10844b * 1000000) / this.f10831b;
            }
            long jG = g(j11);
            return (jG == -1 || j10 != (e() + jG) - 1) ? (this.f10834e * 1000000) / this.f10831b : j11 - j(j10);
        }

        public long i(long j10, long j11) {
            long jE = e();
            long jG = g(j11);
            if (jG != 0) {
                if (this.f10835f != null) {
                    long j12 = (jG + jE) - 1;
                    long j13 = jE;
                    while (j13 <= j12) {
                        long j14 = ((j12 - j13) / 2) + j13;
                        long j15 = j(j14);
                        if (j15 < j10) {
                            j13 = j14 + 1;
                        } else {
                            if (j15 <= j10) {
                                return j14;
                            }
                            j12 = j14 - 1;
                        }
                    }
                    return j13 == jE ? j13 : j12;
                }
                long j16 = this.f10833d + (j10 / ((this.f10834e * 1000000) / this.f10831b));
                if (j16 >= jE) {
                    return jG == -1 ? j16 : Math.min(j16, (jE + jG) - 1);
                }
            }
            return jE;
        }

        public final long j(long j10) {
            List list = this.f10835f;
            return M.a1(list != null ? ((d) list.get((int) (j10 - this.f10833d))).f10843a - this.f10832c : (j10 - this.f10833d) * this.f10834e, 1000000L, this.f10831b);
        }

        public abstract i k(j jVar, long j10);

        public boolean l() {
            return this.f10835f != null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends a {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final List f10839j;

        public b(i iVar, long j10, long j11, long j12, long j13, List list, long j14, List list2, long j15, long j16) {
            super(iVar, j10, j11, j12, j13, list, j14, j15, j16);
            this.f10839j = list2;
        }

        @Override // O1.k.a
        public long g(long j10) {
            return this.f10839j.size();
        }

        @Override // O1.k.a
        public i k(j jVar, long j10) {
            return (i) this.f10839j.get((int) (j10 - this.f10833d));
        }

        @Override // O1.k.a
        public boolean l() {
            return true;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class c extends a {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final n f10840j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final n f10841k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final long f10842l;

        public c(i iVar, long j10, long j11, long j12, long j13, long j14, List list, long j15, n nVar, n nVar2, long j16, long j17) {
            super(iVar, j10, j11, j12, j14, list, j15, j16, j17);
            this.f10840j = nVar;
            this.f10841k = nVar2;
            this.f10842l = j13;
        }

        @Override // O1.k
        public i a(j jVar) {
            n nVar = this.f10840j;
            if (nVar == null) {
                return super.a(jVar);
            }
            D1.o oVar = jVar.f10817b;
            return new i(nVar.a(oVar.f1791a, 0L, oVar.f1800j, 0L), 0L, -1L);
        }

        @Override // O1.k.a
        public long g(long j10) {
            if (this.f10835f != null) {
                return r0.size();
            }
            long j11 = this.f10842l;
            if (j11 != -1) {
                return (j11 - this.f10833d) + 1;
            }
            if (j10 != -9223372036854775807L) {
                return M7.a.a(BigInteger.valueOf(j10).multiply(BigInteger.valueOf(this.f10831b)), BigInteger.valueOf(this.f10834e).multiply(BigInteger.valueOf(1000000L)), RoundingMode.CEILING).longValue();
            }
            return -1L;
        }

        @Override // O1.k.a
        public i k(j jVar, long j10) {
            List list = this.f10835f;
            long j11 = list != null ? ((d) list.get((int) (j10 - this.f10833d))).f10843a : (j10 - this.f10833d) * this.f10834e;
            n nVar = this.f10841k;
            D1.o oVar = jVar.f10817b;
            return new i(nVar.a(oVar.f1791a, j10, oVar.f1800j, j11), 0L, -1L);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f10843a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f10844b;

        public d(long j10, long j11) {
            this.f10843a = j10;
            this.f10844b = j11;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && d.class == obj.getClass()) {
                d dVar = (d) obj;
                if (this.f10843a == dVar.f10843a && this.f10844b == dVar.f10844b) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (((int) this.f10843a) * 31) + ((int) this.f10844b);
        }
    }

    public k(i iVar, long j10, long j11) {
        this.f10830a = iVar;
        this.f10831b = j10;
        this.f10832c = j11;
    }

    public i a(j jVar) {
        return this.f10830a;
    }

    public long b() {
        return M.a1(this.f10832c, 1000000L, this.f10831b);
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class e extends k {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long f10845d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final long f10846e;

        public e(i iVar, long j10, long j11, long j12, long j13) {
            super(iVar, j10, j11);
            this.f10845d = j12;
            this.f10846e = j13;
        }

        public i c() {
            long j10 = this.f10846e;
            if (j10 <= 0) {
                return null;
            }
            return new i(null, this.f10845d, j10);
        }

        public e() {
            this(null, 1L, 0L, 0L, 0L);
        }
    }
}
