package I9;

import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f5665a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f5666b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f5667c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final double f5668d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final double f5669e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final double f5670f;

    public a(double d10, double d11, double d12, double d13) {
        this.f5665a = d10;
        this.f5666b = d11;
        this.f5667c = d12;
        this.f5668d = d13;
        double d14 = d10 + d11;
        double d15 = 2;
        this.f5669e = d14 / d15;
        this.f5670f = (d12 + d13) / d15;
    }

    public final boolean a(double d10, double d11) {
        return this.f5665a <= d10 && d10 <= this.f5666b && this.f5667c <= d11 && d11 <= this.f5668d;
    }

    public final boolean b(a bounds) {
        AbstractC4862t.e(bounds, "bounds");
        return bounds.f5665a >= this.f5665a && bounds.f5666b <= this.f5666b && bounds.f5667c >= this.f5667c && bounds.f5668d <= this.f5668d;
    }

    public final boolean c(b point) {
        AbstractC4862t.e(point, "point");
        return a(point.f5671a, point.f5672b);
    }

    public final boolean d(double d10, double d11, double d12, double d13) {
        return d10 < this.f5666b && this.f5665a < d11 && d12 < this.f5668d && this.f5667c < d13;
    }

    public final boolean e(a bounds) {
        AbstractC4862t.e(bounds, "bounds");
        return d(bounds.f5665a, bounds.f5666b, bounds.f5667c, bounds.f5668d);
    }
}
