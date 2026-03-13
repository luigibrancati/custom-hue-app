package B2;

import G1.M;
import android.util.Pair;
import i2.J;
import i2.K;
import w2.l;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class c implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long[] f576a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long[] f577b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f578c;

    public c(long[] jArr, long[] jArr2, long j10) {
        this.f576a = jArr;
        this.f577b = jArr2;
        this.f578c = j10 == -9223372036854775807L ? M.M0(jArr2[jArr2.length - 1]) : j10;
    }

    public static c a(long j10, l lVar, long j11) {
        int length = lVar.f46129e.length;
        int i10 = length + 1;
        long[] jArr = new long[i10];
        long[] jArr2 = new long[i10];
        jArr[0] = j10;
        long j12 = 0;
        jArr2[0] = 0;
        for (int i11 = 1; i11 <= length; i11++) {
            int i12 = i11 - 1;
            j10 += (long) (lVar.f46127c + lVar.f46129e[i12]);
            j12 += (long) (lVar.f46128d + lVar.f46130f[i12]);
            jArr[i11] = j10;
            jArr2[i11] = j12;
        }
        return new c(jArr, jArr2, j11);
    }

    public static Pair c(long j10, long[] jArr, long[] jArr2) {
        int iH = M.h(jArr, j10, true, true);
        long j11 = jArr[iH];
        long j12 = jArr2[iH];
        int i10 = iH + 1;
        if (i10 == jArr.length) {
            return Pair.create(Long.valueOf(j11), Long.valueOf(j12));
        }
        return Pair.create(Long.valueOf(j10), Long.valueOf(((long) ((jArr[i10] == j11 ? 0.0d : (j10 - j11) / (r6 - j11)) * (jArr2[i10] - j12))) + j12));
    }

    @Override // B2.g
    public long b(long j10) {
        return M.M0(((Long) c(j10, this.f576a, this.f577b).second).longValue());
    }

    @Override // B2.g
    public long d() {
        return 0L;
    }

    @Override // i2.J
    public J.a e(long j10) {
        Pair pairC = c(M.o1(M.p(j10, 0L, this.f578c)), this.f577b, this.f576a);
        return new J.a(new K(M.M0(((Long) pairC.first).longValue()), ((Long) pairC.second).longValue()));
    }

    @Override // B2.g
    public long g() {
        return -1L;
    }

    @Override // i2.J
    public boolean h() {
        return true;
    }

    @Override // B2.g
    public int l() {
        return -2147483647;
    }

    @Override // i2.J
    public long m() {
        return this.f578c;
    }
}
