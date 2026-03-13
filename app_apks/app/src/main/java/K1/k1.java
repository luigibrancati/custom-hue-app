package K1;

import G1.AbstractC0853a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class k1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final k1 f7216c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final k1 f7217d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final k1 f7218e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final k1 f7219f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final k1 f7220g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f7221a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f7222b;

    static {
        k1 k1Var = new k1(0L, 0L);
        f7216c = k1Var;
        f7217d = new k1(Long.MAX_VALUE, Long.MAX_VALUE);
        f7218e = new k1(Long.MAX_VALUE, 0L);
        f7219f = new k1(0L, Long.MAX_VALUE);
        f7220g = k1Var;
    }

    public k1(long j10, long j11) {
        AbstractC0853a.a(j10 >= 0);
        AbstractC0853a.a(j11 >= 0);
        this.f7221a = j10;
        this.f7222b = j11;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0051 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long a(long r8, long r10, long r12) {
        /*
            r7 = this;
            long r2 = r7.f7221a
            r0 = 0
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 != 0) goto Lf
            long r4 = r7.f7222b
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 != 0) goto Lf
            return r8
        Lf:
            r4 = -9223372036854775808
            r0 = r8
            long r8 = G1.M.k1(r0, r2, r4)
            long r2 = r7.f7222b
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            long r2 = G1.M.c(r0, r2, r4)
            int r7 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            r4 = 0
            r5 = 1
            if (r7 > 0) goto L2d
            int r7 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r7 > 0) goto L2d
            r7 = r5
            goto L2e
        L2d:
            r7 = r4
        L2e:
            int r6 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r6 > 0) goto L37
            int r2 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r2 > 0) goto L37
            r4 = r5
        L37:
            if (r7 == 0) goto L4c
            if (r4 == 0) goto L4c
            long r7 = r10 - r0
            long r7 = java.lang.Math.abs(r7)
            long r0 = r12 - r0
            long r0 = java.lang.Math.abs(r0)
            int r7 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r7 > 0) goto L51
            goto L4e
        L4c:
            if (r7 == 0) goto L4f
        L4e:
            return r10
        L4f:
            if (r4 == 0) goto L52
        L51:
            return r12
        L52:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: K1.k1.a(long, long, long):long");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && k1.class == obj.getClass()) {
            k1 k1Var = (k1) obj;
            if (this.f7221a == k1Var.f7221a && this.f7222b == k1Var.f7222b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (((int) this.f7221a) * 31) + ((int) this.f7222b);
    }
}
