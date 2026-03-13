package B;

import E.C0812s0;
import L.X0;
import android.graphics.PointF;
import androidx.camera.camera2.internal.compat.quirk.AfRegionFlipHorizontallyQuirk;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final X0 f508a;

    public l(X0 x02) {
        this.f508a = x02;
    }

    public PointF a(C0812s0 c0812s0, int i10) {
        return (i10 == 1 && this.f508a.a(AfRegionFlipHorizontallyQuirk.class)) ? new PointF(1.0f - c0812s0.c(), c0812s0.d()) : new PointF(c0812s0.c(), c0812s0.d());
    }
}
