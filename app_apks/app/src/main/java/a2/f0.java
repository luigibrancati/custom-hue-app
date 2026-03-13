package a2;

import D1.D;
import D1.r;
import G1.AbstractC0853a;
import android.net.Uri;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class f0 extends D1.D {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final Object f20778r = new Object();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final D1.r f20779s = new r.c().c("SinglePeriodTimeline").g(Uri.EMPTY).a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f20780e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f20781f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f20782g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f20783h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f20784i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f20785j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f20786k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f20787l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f20788m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f20789n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Object f20790o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final D1.r f20791p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final r.g f20792q;

    public f0(long j10, boolean z10, boolean z11, boolean z12, Object obj, D1.r rVar) {
        this(j10, j10, 0L, 0L, z10, z11, z12, obj, rVar);
    }

    @Override // D1.D
    public int b(Object obj) {
        return f20778r.equals(obj) ? 0 : -1;
    }

    @Override // D1.D
    public D.b g(int i10, D.b bVar, boolean z10) {
        AbstractC0853a.c(i10, 0, 1);
        return bVar.s(null, z10 ? f20778r : null, 0, this.f20783h, -this.f20785j);
    }

    @Override // D1.D
    public int i() {
        return 1;
    }

    @Override // D1.D
    public Object m(int i10) {
        AbstractC0853a.c(i10, 0, 1);
        return f20778r;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002e A[PHI: r1
      0x002e: PHI (r1v2 long) = (r1v1 long), (r1v1 long), (r1v1 long), (r1v4 long) binds: [B:3:0x000d, B:5:0x0011, B:7:0x0017, B:12:0x002b] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // D1.D
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public D1.D.c o(int r25, D1.D.c r26, long r27) {
        /*
            r24 = this;
            r0 = r24
            r1 = 0
            r2 = 1
            r3 = r25
            G1.AbstractC0853a.c(r3, r1, r2)
            long r1 = r0.f20786k
            boolean r14 = r0.f20788m
            if (r14 == 0) goto L2e
            boolean r3 = r0.f20789n
            if (r3 != 0) goto L2e
            r3 = 0
            int r3 = (r27 > r3 ? 1 : (r27 == r3 ? 0 : -1))
            if (r3 == 0) goto L2e
            long r3 = r0.f20784i
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L27
        L24:
            r16 = r5
            goto L30
        L27:
            long r1 = r1 + r27
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 <= 0) goto L2e
            goto L24
        L2e:
            r16 = r1
        L30:
            java.lang.Object r4 = D1.D.c.f1463q
            D1.r r5 = r0.f20791p
            java.lang.Object r6 = r0.f20790o
            long r7 = r0.f20780e
            long r9 = r0.f20781f
            long r11 = r0.f20782g
            boolean r13 = r0.f20787l
            D1.r$g r15 = r0.f20792q
            long r1 = r0.f20784i
            r21 = 0
            r18 = r1
            long r0 = r0.f20785j
            r20 = 0
            r3 = r26
            r22 = r0
            D1.D$c r0 = r3.g(r4, r5, r6, r7, r9, r11, r13, r14, r15, r16, r18, r20, r21, r22)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: a2.f0.o(int, D1.D$c, long):D1.D$c");
    }

    @Override // D1.D
    public int p() {
        return 1;
    }

    public f0(long j10, long j11, long j12, long j13, boolean z10, boolean z11, boolean z12, Object obj, D1.r rVar) {
        this(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, j10, j11, j12, j13, z10, z11, false, obj, rVar, z12 ? rVar.f1875d : null);
    }

    public f0(long j10, long j11, long j12, long j13, long j14, long j15, long j16, boolean z10, boolean z11, boolean z12, Object obj, D1.r rVar, r.g gVar) {
        this.f20780e = j10;
        this.f20781f = j11;
        this.f20782g = j12;
        this.f20783h = j13;
        this.f20784i = j14;
        this.f20785j = j15;
        this.f20786k = j16;
        this.f20787l = z10;
        this.f20788m = z11;
        this.f20789n = z12;
        this.f20790o = obj;
        this.f20791p = (D1.r) AbstractC0853a.e(rVar);
        this.f20792q = gVar;
    }
}
