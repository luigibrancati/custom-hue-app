package ge;

import gc.C4204q;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: ge.v, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class C4257v {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f35751e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final long[] f35752f = new long[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ee.e f35753a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vc.p f35754b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f35755c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long[] f35756d;

    /* JADX INFO: renamed from: ge.v$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public a() {
        }
    }

    public C4257v(ee.e descriptor, vc.p readIfAbsent) {
        AbstractC4862t.e(descriptor, "descriptor");
        AbstractC4862t.e(readIfAbsent, "readIfAbsent");
        this.f35753a = descriptor;
        this.f35754b = readIfAbsent;
        int iD = descriptor.d();
        if (iD <= 64) {
            this.f35755c = iD != 64 ? (-1) << iD : 0L;
            this.f35756d = f35752f;
        } else {
            this.f35755c = 0L;
            this.f35756d = e(iD);
        }
    }

    public final void a(int i10) {
        if (i10 < 64) {
            this.f35755c |= 1 << i10;
        } else {
            b(i10);
        }
    }

    public final void b(int i10) {
        int i11 = (i10 >>> 6) - 1;
        long[] jArr = this.f35756d;
        jArr[i11] = jArr[i11] | (1 << (i10 & 63));
    }

    public final int c() {
        int length = this.f35756d.length;
        int i10 = 0;
        while (i10 < length) {
            int i11 = i10 + 1;
            int i12 = i11 * 64;
            long j10 = this.f35756d[i10];
            while (j10 != -1) {
                int iNumberOfTrailingZeros = Long.numberOfTrailingZeros(~j10);
                j10 |= 1 << iNumberOfTrailingZeros;
                int i13 = iNumberOfTrailingZeros + i12;
                if (((Boolean) this.f35754b.invoke(this.f35753a, Integer.valueOf(i13))).booleanValue()) {
                    this.f35756d[i10] = j10;
                    return i13;
                }
            }
            this.f35756d[i10] = j10;
            i10 = i11;
        }
        return -1;
    }

    public final int d() {
        int iNumberOfTrailingZeros;
        int iD = this.f35753a.d();
        do {
            long j10 = this.f35755c;
            if (j10 == -1) {
                if (iD > 64) {
                    return c();
                }
                return -1;
            }
            iNumberOfTrailingZeros = Long.numberOfTrailingZeros(~j10);
            this.f35755c |= 1 << iNumberOfTrailingZeros;
        } while (!((Boolean) this.f35754b.invoke(this.f35753a, Integer.valueOf(iNumberOfTrailingZeros))).booleanValue());
        return iNumberOfTrailingZeros;
    }

    public final long[] e(int i10) {
        long[] jArr = new long[(i10 - 1) >>> 6];
        if ((i10 & 63) != 0) {
            jArr[C4204q.Z(jArr)] = (-1) << i10;
        }
        return jArr;
    }
}
