package Pd;

import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class q {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f13314h = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f13315a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f13316b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f13317c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f13318d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f13319e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f13320f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f13321g;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public final q a(g instant) {
            long j10;
            long j11;
            AbstractC4862t.e(instant, "instant");
            long jP = instant.p();
            long j12 = jP / 86400;
            if ((jP ^ 86400) < 0 && j12 * 86400 != jP) {
                j12--;
            }
            long j13 = jP % 86400;
            int i10 = (int) (j13 + (86400 & (((j13 ^ 86400) & ((-j13) | j13)) >> 63)));
            long j14 = (j12 + ((long) 719528)) - ((long) 60);
            if (j14 < 0) {
                j10 = -1;
                long j15 = 146097;
                long j16 = ((j14 + 1) / j15) - 1;
                j11 = ((long) 400) * j16;
                j14 += (-j16) * j15;
            } else {
                j10 = -1;
                j11 = 0;
            }
            long j17 = 400;
            long j18 = ((j17 * j14) + ((long) 591)) / ((long) 146097);
            long j19 = 365;
            long j20 = 4;
            long j21 = 100;
            long j22 = j14 - ((((j19 * j18) + (j18 / j20)) - (j18 / j21)) + (j18 / j17));
            if (j22 < 0) {
                j18 += j10;
                j22 = j14 - ((((j19 * j18) + (j18 / j20)) - (j18 / j21)) + (j18 / j17));
            }
            int i11 = (int) j22;
            int i12 = ((i11 * 5) + 2) / 153;
            int i13 = i10 / 3600;
            int i14 = i10 - (i13 * 3600);
            int i15 = i14 / 60;
            return new q((int) (j18 + j11 + ((long) (i12 / 10))), ((i12 + 2) % 12) + 1, (i11 - (((i12 * 306) + 5) / 10)) + 1, i13, i15, i14 - (i15 * 60), instant.q());
        }

        public a() {
        }
    }

    public q(int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        this.f13315a = i10;
        this.f13316b = i11;
        this.f13317c = i12;
        this.f13318d = i13;
        this.f13319e = i14;
        this.f13320f = i15;
        this.f13321g = i16;
    }

    public final int a() {
        return this.f13317c;
    }

    public final int b() {
        return this.f13318d;
    }

    public final int c() {
        return this.f13319e;
    }

    public final int d() {
        return this.f13316b;
    }

    public final int e() {
        return this.f13321g;
    }

    public final int f() {
        return this.f13320f;
    }

    public final int g() {
        return this.f13315a;
    }

    public String toString() {
        return "UnboundLocalDateTime(" + this.f13315a + '-' + this.f13316b + '-' + this.f13317c + ' ' + this.f13318d + ':' + this.f13319e + ':' + this.f13320f + '.' + this.f13321g + ')';
    }
}
