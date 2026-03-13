package g2;

import G1.AbstractC0853a;
import android.util.Range;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f35329a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f35330b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public double f35331c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Range f35332d;

    public t(float f10) {
        AbstractC0853a.a(f10 > 0.0f);
        Range range = new Range(Double.valueOf(0.0d), Double.valueOf(1.0d / ((double) f10)));
        this.f35332d = range;
        this.f35331c = ((Double) range.getUpper()).doubleValue();
        this.f35329a = -9223372036854775807L;
        this.f35330b = -9223372036854775807L;
    }

    public final double a(long j10, long j11) {
        long j12 = this.f35329a;
        if (j12 != -9223372036854775807L) {
            if (this.f35330b != -9223372036854775807L && j10 != j12) {
                return (j11 - r4) / (j10 - j12);
            }
        }
        return ((Double) this.f35332d.getUpper()).doubleValue();
    }

    public void b(long j10, long j11) {
        AbstractC0853a.a(j10 != -9223372036854775807L);
        AbstractC0853a.a(j11 != -9223372036854775807L);
        f(((Double) this.f35332d.clamp(Double.valueOf(a(j10, j11)))).doubleValue());
        this.f35329a = j10;
        this.f35330b = j11;
    }

    public long c(long j10) {
        if (this.f35329a == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return (long) (this.f35330b + ((j10 - r0) * this.f35331c));
    }

    public void d() {
        this.f35331c = ((Double) this.f35332d.getUpper()).doubleValue();
        this.f35329a = -9223372036854775807L;
        this.f35330b = -9223372036854775807L;
    }

    public void e(float f10) {
        AbstractC0853a.a(f10 > 0.0f);
        this.f35332d = new Range(Double.valueOf(0.0d), Double.valueOf(1.0d / ((double) f10)));
        d();
    }

    public final void f(double d10) {
        this.f35331c = (this.f35331c * 0.800000011920929d) + (d10 * 0.20000000298023224d);
    }
}
