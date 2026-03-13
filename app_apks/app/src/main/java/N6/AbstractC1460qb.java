package N6;

import android.graphics.Point;
import java.util.Iterator;

/* JADX INFO: renamed from: N6.qb, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1460qb {
    public static AbstractC1460qb g(Iterable iterable, int i10, int i11, float f10) {
        Iterator it = iterable.iterator();
        int iMax = 0;
        int iMin = i10;
        int iMin2 = i11;
        int iMax2 = 0;
        while (it.hasNext()) {
            Point point = (Point) it.next();
            iMin = Math.min(iMin, point.x);
            iMin2 = Math.min(iMin2, point.y);
            iMax = Math.max(iMax, point.x);
            iMax2 = Math.max(iMax2, point.y);
        }
        float f11 = i10;
        float f12 = i11;
        return new C1369jb((iMin + 0.0f) / f11, (iMin2 + 0.0f) / f12, (iMax + 0.0f) / f11, (iMax2 + 0.0f) / f12, 0.0f);
    }

    public abstract float a();

    public abstract float b();

    public abstract float c();

    public abstract float d();

    public abstract float e();

    public final float f() {
        if (h()) {
            return (b() - c()) * (d() - e());
        }
        return 0.0f;
    }

    public final boolean h() {
        return c() >= 0.0f && c() < b() && b() <= 1.0f && e() >= 0.0f && e() < d() && d() <= 1.0f;
    }
}
