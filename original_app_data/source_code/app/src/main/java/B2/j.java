package B2;

import G1.AbstractC0853a;
import G1.M;
import i2.F;
import i2.J;
import i2.K;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class j implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f614a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f615b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f616c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f617d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f618e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f619f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long[] f620g;

    public j(long j10, int i10, long j11, int i11, long j12, long[] jArr) {
        this.f614a = j10;
        this.f615b = i10;
        this.f616c = j11;
        this.f617d = i11;
        this.f618e = j12;
        this.f620g = jArr;
        this.f619f = j12 != -1 ? j10 + j12 : -1L;
    }

    public static j a(i iVar, long j10) {
        long jA = iVar.a();
        if (jA == -9223372036854775807L) {
            return null;
        }
        F.a aVar = iVar.f608a;
        return new j(j10, aVar.f36866c, jA, aVar.f36869f, iVar.f610c, iVar.f613f);
    }

    @Override // B2.g
    public long b(long j10) {
        long j11 = j10 - this.f614a;
        if (!h() || j11 <= this.f615b) {
            return 0L;
        }
        long[] jArr = (long[]) AbstractC0853a.i(this.f620g);
        double d10 = (j11 * 256.0d) / this.f618e;
        int iH = M.h(jArr, (long) d10, true, true);
        long jC = c(iH);
        long j12 = jArr[iH];
        int i10 = iH + 1;
        long jC2 = c(i10);
        return jC + Math.round((j12 == (iH == 99 ? 256L : jArr[i10]) ? 0.0d : (d10 - j12) / (r0 - j12)) * (jC2 - jC));
    }

    public final long c(int i10) {
        return (this.f616c * ((long) i10)) / 100;
    }

    @Override // B2.g
    public long d() {
        return this.f614a + ((long) this.f615b);
    }

    @Override // i2.J
    public J.a e(long j10) {
        if (!h()) {
            return new J.a(new K(0L, this.f614a + ((long) this.f615b)));
        }
        long jP = M.p(j10, 0L, this.f616c);
        double d10 = (jP * 100.0d) / this.f616c;
        double d11 = 0.0d;
        if (d10 > 0.0d) {
            if (d10 >= 100.0d) {
                d11 = 256.0d;
            } else {
                int i10 = (int) d10;
                double d12 = ((long[]) AbstractC0853a.i(this.f620g))[i10];
                d11 = d12 + ((d10 - ((double) i10)) * ((i10 == 99 ? 256.0d : r3[i10 + 1]) - d12));
            }
        }
        return new J.a(new K(jP, this.f614a + M.p(Math.round((d11 / 256.0d) * this.f618e), this.f615b, this.f618e - 1)));
    }

    @Override // B2.g
    public long g() {
        return this.f619f;
    }

    @Override // i2.J
    public boolean h() {
        return this.f620g != null;
    }

    @Override // B2.g
    public int l() {
        return this.f617d;
    }

    @Override // i2.J
    public long m() {
        return this.f616c;
    }
}
