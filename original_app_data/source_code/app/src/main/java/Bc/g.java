package Bc;

import gc.N;
import kotlin.jvm.internal.AbstractC4854k;
import pc.AbstractC5459c;
import wc.InterfaceC6184a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class g implements Iterable, InterfaceC6184a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f801d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f802a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f803b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f804c;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public final g a(long j10, long j11, long j12) {
            return new g(j10, j11, j12);
        }

        public a() {
        }
    }

    public g(long j10, long j11, long j12) {
        if (j12 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (j12 == Long.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Long.MIN_VALUE to avoid overflow on negation.");
        }
        this.f802a = j10;
        this.f803b = AbstractC5459c.d(j10, j11, j12);
        this.f804c = j12;
    }

    public final long c() {
        return this.f802a;
    }

    public final long d() {
        return this.f803b;
    }

    public final long e() {
        return this.f804c;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        if (isEmpty() && ((g) obj).isEmpty()) {
            return true;
        }
        g gVar = (g) obj;
        return this.f802a == gVar.f802a && this.f803b == gVar.f803b && this.f804c == gVar.f804c;
    }

    @Override // java.lang.Iterable
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public N iterator() {
        return new h(this.f802a, this.f803b, this.f804c);
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        long j10 = 31;
        long j11 = this.f802a;
        long j12 = this.f803b;
        long j13 = j10 * (((j11 ^ (j11 >>> 32)) * j10) + (j12 ^ (j12 >>> 32)));
        long j14 = this.f804c;
        return (int) (j13 + (j14 ^ (j14 >>> 32)));
    }

    public boolean isEmpty() {
        long j10 = this.f804c;
        long j11 = this.f802a;
        long j12 = this.f803b;
        return j10 > 0 ? j11 > j12 : j11 < j12;
    }

    public String toString() {
        StringBuilder sb2;
        long j10;
        if (this.f804c > 0) {
            sb2 = new StringBuilder();
            sb2.append(this.f802a);
            sb2.append("..");
            sb2.append(this.f803b);
            sb2.append(" step ");
            j10 = this.f804c;
        } else {
            sb2 = new StringBuilder();
            sb2.append(this.f802a);
            sb2.append(" downTo ");
            sb2.append(this.f803b);
            sb2.append(" step ");
            j10 = -this.f804c;
        }
        sb2.append(j10);
        return sb2.toString();
    }
}
