package o0;

import android.graphics.Paint;

/* JADX INFO: renamed from: o0.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5185b {
    public static final m a() {
        return new C5184a();
    }

    public static final Paint b() {
        return new Paint(7);
    }

    public static final void c(Paint paint, long j10) {
        paint.setColor(AbstractC5189f.d(j10));
    }

    public static final void d(Paint paint, float f10) {
        paint.setStrokeWidth(f10);
    }

    public static final void e(Paint paint, int i10) {
        paint.setStyle(n.c(i10, n.f41093a.a()) ? Paint.Style.STROKE : Paint.Style.FILL);
    }
}
