package M9;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class a extends Drawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Drawable f9408a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Drawable f9409b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f9410c = -1;

    public a(Context context) {
        this.f9409b = L0.a.f(context, D9.a.f2320a);
        this.f9408a = L0.a.f(context, D9.a.f2321b);
    }

    public void a(int i10) {
        this.f9410c = i10;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.f9409b.draw(canvas);
        canvas.drawColor(this.f9410c, PorterDuff.Mode.SRC_IN);
        this.f9408a.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        return this.f9409b.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // android.graphics.drawable.Drawable
    public void setBounds(int i10, int i11, int i12, int i13) {
        this.f9409b.setBounds(i10, i11, i12, i13);
        this.f9408a.setBounds(i10, i11, i12, i13);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        throw new UnsupportedOperationException();
    }

    @Override // android.graphics.drawable.Drawable
    public void setBounds(Rect rect) {
        this.f9409b.setBounds(rect);
        this.f9408a.setBounds(rect);
    }
}
