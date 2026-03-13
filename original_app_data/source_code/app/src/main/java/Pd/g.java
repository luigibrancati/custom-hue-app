package Pd;

import java.io.Serializable;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class g implements Comparable, Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f13301c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final g f13302d = new g(-31557014167219200L, 0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final g f13303e = new g(31556889864403199L, 999999999);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f13304a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f13305b;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public final g a(long j10, int i10) {
            return b(j10, i10);
        }

        public final g b(long j10, long j11) {
            long j12 = j11 / 1000000000;
            if ((j11 ^ 1000000000) < 0 && j12 * 1000000000 != j11) {
                j12--;
            }
            long j13 = j10 + j12;
            if ((j10 ^ j13) < 0 && (j12 ^ j10) >= 0) {
                return j10 > 0 ? g.f13301c.c() : g.f13301c.d();
            }
            if (j13 < -31557014167219200L) {
                return d();
            }
            if (j13 > 31556889864403199L) {
                return c();
            }
            long j14 = j11 % 1000000000;
            return new g(j13, (int) (j14 + ((((j14 ^ 1000000000) & ((-j14) | j14)) >> 63) & 1000000000)));
        }

        public final g c() {
            return g.f13303e;
        }

        public final g d() {
            return g.f13302d;
        }

        public final g e(CharSequence input) {
            AbstractC4862t.e(input, "input");
            return o.n(input).toInstant();
        }

        public a() {
        }
    }

    public g(long j10, int i10) {
        this.f13304a = j10;
        this.f13305b = i10;
        if (-31557014167219200L > j10 || j10 >= 31556889864403200L) {
            throw new IllegalArgumentException("Instant exceeds minimum or maximum instant");
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f13304a == gVar.f13304a && this.f13305b == gVar.f13305b;
    }

    public int hashCode() {
        return Long.hashCode(this.f13304a) + (this.f13305b * 51);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public int compareTo(g other) {
        AbstractC4862t.e(other, "other");
        int iG = AbstractC4862t.g(this.f13304a, other.f13304a);
        return iG != 0 ? iG : AbstractC4862t.f(this.f13305b, other.f13305b);
    }

    public final long p() {
        return this.f13304a;
    }

    public final int q() {
        return this.f13305b;
    }

    public String toString() {
        return o.j(this);
    }
}
