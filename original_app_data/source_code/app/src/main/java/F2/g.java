package F2;

import G1.AbstractC0853a;
import K7.AbstractC1081v;
import K7.M;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class g implements k {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final M f3663c = M.d().f(new J7.f() { // from class: F2.f
        @Override // J7.f
        public final Object apply(Object obj) {
            return Long.valueOf(g.e(((e) obj).f3660b));
        }
    });

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC1081v f3664a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long[] f3665b;

    /* JADX WARN: Removed duplicated region for block: B:24:0x00b0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public g(java.util.List r15) {
        /*
            Method dump skipped, instruction units count: 218
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: F2.g.<init>(java.util.List):void");
    }

    public static long e(long j10) {
        if (j10 == -9223372036854775807L) {
            return 0L;
        }
        return j10;
    }

    @Override // F2.k
    public int a(long j10) {
        int iD = G1.M.d(this.f3665b, j10, false, false);
        if (iD < this.f3664a.size()) {
            return iD;
        }
        return -1;
    }

    @Override // F2.k
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public AbstractC1081v b(long j10) {
        int iH = G1.M.h(this.f3665b, j10, true, false);
        return iH == -1 ? AbstractC1081v.z() : (AbstractC1081v) this.f3664a.get(iH);
    }

    @Override // F2.k
    public long j(int i10) {
        AbstractC0853a.a(i10 < this.f3664a.size());
        return this.f3665b[i10];
    }

    @Override // F2.k
    public int p() {
        return this.f3664a.size();
    }
}
