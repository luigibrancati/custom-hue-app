package p0;

import kotlin.jvm.internal.AbstractC4854k;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class G {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f42050a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f42051b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f42052c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final double f42053d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final double f42054e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final double f42055f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final double f42056g;

    public G(double d10, double d11, double d12, double d13, double d14, double d15, double d16) {
        this.f42050a = d10;
        this.f42051b = d11;
        this.f42052c = d12;
        this.f42053d = d13;
        this.f42054e = d14;
        this.f42055f = d15;
        this.f42056g = d16;
        if (Double.isNaN(d11) || Double.isNaN(d12) || Double.isNaN(d13) || Double.isNaN(d14) || Double.isNaN(d15) || Double.isNaN(d16) || Double.isNaN(d10)) {
            throw new IllegalArgumentException("Parameters cannot be NaN");
        }
        if (H.b(d10)) {
            return;
        }
        if (d14 < 0.0d || d14 > 1.0d) {
            throw new IllegalArgumentException("Parameter d must be in the range [0..1], was " + d14);
        }
        if (d14 == 0.0d && (d11 == 0.0d || d10 == 0.0d)) {
            throw new IllegalArgumentException("Parameter a or g is zero, the transfer function is constant");
        }
        if (d14 >= 1.0d && d13 == 0.0d) {
            throw new IllegalArgumentException("Parameter c is zero, the transfer function is constant");
        }
        if ((d11 == 0.0d || d10 == 0.0d) && d13 == 0.0d) {
            throw new IllegalArgumentException("Parameter a or g is zero, and c is zero, the transfer function is constant");
        }
        if (d13 < 0.0d) {
            throw new IllegalArgumentException("The transfer function must be increasing");
        }
        if (d11 < 0.0d || d10 < 0.0d) {
            throw new IllegalArgumentException("The transfer function must be positive or increasing");
        }
    }

    public final double a() {
        return this.f42051b;
    }

    public final double b() {
        return this.f42052c;
    }

    public final double c() {
        return this.f42053d;
    }

    public final double d() {
        return this.f42054e;
    }

    public final double e() {
        return this.f42055f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof G)) {
            return false;
        }
        G g10 = (G) obj;
        return Double.compare(this.f42050a, g10.f42050a) == 0 && Double.compare(this.f42051b, g10.f42051b) == 0 && Double.compare(this.f42052c, g10.f42052c) == 0 && Double.compare(this.f42053d, g10.f42053d) == 0 && Double.compare(this.f42054e, g10.f42054e) == 0 && Double.compare(this.f42055f, g10.f42055f) == 0 && Double.compare(this.f42056g, g10.f42056g) == 0;
    }

    public final double f() {
        return this.f42056g;
    }

    public final double g() {
        return this.f42050a;
    }

    public final boolean h() {
        return this.f42050a == -3.0d;
    }

    public int hashCode() {
        return (((((((((((Double.hashCode(this.f42050a) * 31) + Double.hashCode(this.f42051b)) * 31) + Double.hashCode(this.f42052c)) * 31) + Double.hashCode(this.f42053d)) * 31) + Double.hashCode(this.f42054e)) * 31) + Double.hashCode(this.f42055f)) * 31) + Double.hashCode(this.f42056g);
    }

    public final boolean i() {
        return this.f42050a == -2.0d;
    }

    public String toString() {
        return "TransferParameters(gamma=" + this.f42050a + ", a=" + this.f42051b + ", b=" + this.f42052c + ", c=" + this.f42053d + ", d=" + this.f42054e + ", e=" + this.f42055f + ", f=" + this.f42056g + ')';
    }

    public /* synthetic */ G(double d10, double d11, double d12, double d13, double d14, double d15, double d16, int i10, AbstractC4854k abstractC4854k) {
        this(d10, d11, d12, d13, d14, (i10 & 32) != 0 ? 0.0d : d15, (i10 & 64) != 0 ? 0.0d : d16);
    }
}
