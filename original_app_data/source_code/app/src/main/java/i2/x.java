package i2;

import G1.AbstractC0853a;
import i2.J;
import i2.y;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class x implements J {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y f37050a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f37051b;

    public x(y yVar, long j10) {
        this.f37050a = yVar;
        this.f37051b = j10;
    }

    public final K a(long j10, long j11) {
        return new K((j10 * 1000000) / ((long) this.f37050a.f37056e), this.f37051b + j11);
    }

    @Override // i2.J
    public J.a e(long j10) {
        AbstractC0853a.i(this.f37050a.f37062k);
        y yVar = this.f37050a;
        y.a aVar = yVar.f37062k;
        long[] jArr = aVar.f37064a;
        long[] jArr2 = aVar.f37065b;
        int iH = G1.M.h(jArr, yVar.i(j10), true, false);
        K kA = a(iH == -1 ? 0L : jArr[iH], iH != -1 ? jArr2[iH] : 0L);
        if (kA.f36877a == j10 || iH == jArr.length - 1) {
            return new J.a(kA);
        }
        int i10 = iH + 1;
        return new J.a(kA, a(jArr[i10], jArr2[i10]));
    }

    @Override // i2.J
    public boolean h() {
        return true;
    }

    @Override // i2.J
    public long m() {
        return this.f37050a.f();
    }
}
