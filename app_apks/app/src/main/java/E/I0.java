package E;

import android.graphics.PointF;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class I0 extends AbstractC0814t0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f2791b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f2792c;

    public I0(float f10, float f11) {
        this.f2791b = f10;
        this.f2792c = f11;
    }

    @Override // E.AbstractC0814t0
    public PointF a(float f10, float f11) {
        return new PointF(f10 / this.f2791b, f11 / this.f2792c);
    }
}
