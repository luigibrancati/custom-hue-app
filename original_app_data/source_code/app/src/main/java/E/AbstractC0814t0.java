package E;

import android.graphics.PointF;
import android.util.Rational;

/* JADX INFO: renamed from: E.t0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0814t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Rational f3025a;

    public AbstractC0814t0() {
        this(null);
    }

    public static float d() {
        return 0.15f;
    }

    public abstract PointF a(float f10, float f11);

    public final C0812s0 b(float f10, float f11) {
        return c(f10, f11, d());
    }

    public final C0812s0 c(float f10, float f11, float f12) {
        PointF pointFA = a(f10, f11);
        return new C0812s0(pointFA.x, pointFA.y, f12, this.f3025a);
    }

    public AbstractC0814t0(Rational rational) {
        this.f3025a = rational;
    }
}
