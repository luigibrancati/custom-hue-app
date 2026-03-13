package Wd;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.AbstractC4854k;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class r {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f17945e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f17946f = AtomicReferenceFieldUpdater.newUpdater(r.class, Object.class, "_next$volatile");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f17947g = AtomicLongFieldUpdater.newUpdater(r.class, "_state$volatile");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final E f17948h = new E("REMOVE_FROZEN");
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ long _state$volatile;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f17949a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f17950b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f17951c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AtomicReferenceArray f17952d;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public final int a(long j10) {
            return (j10 & 2305843009213693952L) != 0 ? 2 : 1;
        }

        public final long b(long j10, int i10) {
            return d(j10, 1073741823L) | ((long) i10);
        }

        public final long c(long j10, int i10) {
            return d(j10, 1152921503533105152L) | (((long) i10) << 30);
        }

        public final long d(long j10, long j11) {
            return j10 & (~j11);
        }

        public a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f17953a;

        public b(int i10) {
            this.f17953a = i10;
        }
    }

    public r(int i10, boolean z10) {
        this.f17949a = i10;
        this.f17950b = z10;
        int i11 = i10 - 1;
        this.f17951c = i11;
        this.f17952d = new AtomicReferenceArray(i10);
        if (i11 > 1073741823) {
            throw new IllegalStateException("Check failed.");
        }
        if ((i10 & i11) != 0) {
            throw new IllegalStateException("Check failed.");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0052, code lost:
    
        return 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int a(java.lang.Object r13) {
        /*
            r12 = this;
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = i()
        L4:
            long r3 = r0.get(r12)
            r1 = 3458764513820540928(0x3000000000000000, double:1.727233711018889E-77)
            long r1 = r1 & r3
            r7 = 0
            int r1 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r1 == 0) goto L18
            Wd.r$a r12 = Wd.r.f17945e
            int r12 = r12.a(r3)
            return r12
        L18:
            r1 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r1 = r1 & r3
            int r1 = (int) r1
            r5 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r5 = r5 & r3
            r2 = 30
            long r5 = r5 >> r2
            int r9 = (int) r5
            int r10 = r12.f17951c
            int r2 = r9 + 2
            r2 = r2 & r10
            r5 = r1 & r10
            r6 = 1
            if (r2 != r5) goto L32
            return r6
        L32:
            boolean r2 = r12.f17950b
            r5 = 1073741823(0x3fffffff, float:1.9999999)
            if (r2 != 0) goto L53
            java.util.concurrent.atomic.AtomicReferenceArray r2 = r12.f()
            r11 = r9 & r10
            java.lang.Object r2 = r2.get(r11)
            if (r2 == 0) goto L53
            int r2 = r12.f17949a
            r3 = 1024(0x400, float:1.435E-42)
            if (r2 < r3) goto L52
            int r9 = r9 - r1
            r1 = r9 & r5
            int r2 = r2 >> 1
            if (r1 <= r2) goto L4
        L52:
            return r6
        L53:
            int r1 = r9 + 1
            r1 = r1 & r5
            r2 = r1
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = i()
            Wd.r$a r5 = Wd.r.f17945e
            long r5 = r5.c(r3, r2)
            r2 = r12
            boolean r12 = r1.compareAndSet(r2, r3, r5)
            if (r12 == 0) goto L8d
            java.util.concurrent.atomic.AtomicReferenceArray r12 = r2.f()
            r0 = r9 & r10
            r12.set(r0, r13)
            r12 = r2
        L72:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = i()
            long r0 = r0.get(r12)
            r2 = 1152921504606846976(0x1000000000000000, double:1.2882297539194267E-231)
            long r0 = r0 & r2
            int r0 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r0 == 0) goto L8b
            Wd.r r12 = r12.l()
            Wd.r r12 = r12.e(r9, r13)
            if (r12 != 0) goto L72
        L8b:
            r12 = 0
            return r12
        L8d:
            r12 = r2
            goto L4
        */
        throw new UnsupportedOperationException("Method not decompiled: Wd.r.a(java.lang.Object):int");
    }

    public final r b(long j10) {
        r rVar = new r(this.f17949a * 2, this.f17950b);
        int i10 = (int) (1073741823 & j10);
        int i11 = (int) ((1152921503533105152L & j10) >> 30);
        while (true) {
            int i12 = this.f17951c;
            if ((i10 & i12) == (i12 & i11)) {
                f17947g.set(rVar, f17945e.d(j10, 1152921504606846976L));
                return rVar;
            }
            Object bVar = f().get(this.f17951c & i10);
            if (bVar == null) {
                bVar = new b(i10);
            }
            rVar.f().set(rVar.f17951c & i10, bVar);
            i10++;
        }
    }

    public final r c(long j10) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f17946f;
        while (true) {
            r rVar = (r) atomicReferenceFieldUpdater.get(this);
            if (rVar != null) {
                return rVar;
            }
            B0.b.a(f17946f, this, null, b(j10));
        }
    }

    public final boolean d() {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f17947g;
        while (true) {
            long j10 = atomicLongFieldUpdater.get(this);
            if ((j10 & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j10) != 0) {
                return false;
            }
            r rVar = this;
            if (atomicLongFieldUpdater.compareAndSet(rVar, j10, 2305843009213693952L | j10)) {
                return true;
            }
            this = rVar;
        }
    }

    public final r e(int i10, Object obj) {
        Object obj2 = f().get(this.f17951c & i10);
        if (!(obj2 instanceof b) || ((b) obj2).f17953a != i10) {
            return null;
        }
        f().set(i10 & this.f17951c, obj);
        return this;
    }

    public final /* synthetic */ AtomicReferenceArray f() {
        return this.f17952d;
    }

    public final int g() {
        long j10 = f17947g.get(this);
        return 1073741823 & (((int) ((j10 & 1152921503533105152L) >> 30)) - ((int) (1073741823 & j10)));
    }

    public final boolean j() {
        long j10 = f17947g.get(this);
        return ((int) (1073741823 & j10)) == ((int) ((j10 & 1152921503533105152L) >> 30));
    }

    public final long k() {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f17947g;
        while (true) {
            long j10 = atomicLongFieldUpdater.get(this);
            if ((j10 & 1152921504606846976L) != 0) {
                return j10;
            }
            long j11 = 1152921504606846976L | j10;
            r rVar = this;
            if (atomicLongFieldUpdater.compareAndSet(rVar, j10, j11)) {
                return j11;
            }
            this = rVar;
        }
    }

    public final r l() {
        return c(k());
    }

    public final Object m() {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f17947g;
        while (true) {
            long j10 = atomicLongFieldUpdater.get(this);
            if ((1152921504606846976L & j10) != 0) {
                return f17948h;
            }
            int i10 = (int) (1073741823 & j10);
            int i11 = this.f17951c;
            if ((((int) ((1152921503533105152L & j10) >> 30)) & i11) == (i11 & i10)) {
                return null;
            }
            Object obj = this.f().get(this.f17951c & i10);
            if (obj == null) {
                if (this.f17950b) {
                    return null;
                }
            } else {
                if (obj instanceof b) {
                    return null;
                }
                int i12 = (i10 + 1) & 1073741823;
                r rVar = this;
                if (f17947g.compareAndSet(rVar, j10, f17945e.b(j10, i12))) {
                    rVar.f().set(rVar.f17951c & i10, null);
                    return obj;
                }
                if (rVar.f17950b) {
                    r rVarN = rVar;
                    do {
                        rVarN = rVarN.n(i10, i12);
                    } while (rVarN != null);
                    return obj;
                }
                this = rVar;
            }
        }
    }

    public final r n(int i10, int i11) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f17947g;
        while (true) {
            long j10 = atomicLongFieldUpdater.get(this);
            int i12 = (int) (1073741823 & j10);
            if ((1152921504606846976L & j10) != 0) {
                return this.l();
            }
            r rVar = this;
            if (f17947g.compareAndSet(rVar, j10, f17945e.b(j10, i11))) {
                rVar.f().set(rVar.f17951c & i12, null);
                return null;
            }
            this = rVar;
        }
    }
}
