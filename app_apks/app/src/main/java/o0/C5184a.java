package o0;

import android.graphics.Paint;

/* JADX INFO: renamed from: o0.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C5184a implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Paint f41040a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f41041b;

    public C5184a(Paint paint) {
        this.f41040a = paint;
        this.f41041b = AbstractC5186c.f41046a.a();
    }

    @Override // o0.m
    public void a(long j10) {
        AbstractC5185b.c(this.f41040a, j10);
    }

    @Override // o0.m
    public void b(int i10) {
        AbstractC5185b.e(this.f41040a, i10);
    }

    @Override // o0.m
    public void setStrokeWidth(float f10) {
        AbstractC5185b.d(this.f41040a, f10);
    }

    public C5184a() {
        this(AbstractC5185b.b());
    }
}
