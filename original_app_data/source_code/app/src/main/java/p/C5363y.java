package p;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;

/* JADX INFO: renamed from: p.y, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class C5363y extends C5358t {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final SeekBar f41990d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Drawable f41991e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ColorStateList f41992f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public PorterDuff.Mode f41993g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f41994h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f41995i;

    public C5363y(SeekBar seekBar) {
        super(seekBar);
        this.f41992f = null;
        this.f41993g = null;
        this.f41994h = false;
        this.f41995i = false;
        this.f41990d = seekBar;
    }

    @Override // p.C5358t
    public void c(AttributeSet attributeSet, int i10) {
        super.c(attributeSet, i10);
        W wV = W.v(this.f41990d.getContext(), attributeSet, h.j.f36018T, i10, 0);
        SeekBar seekBar = this.f41990d;
        Y0.E.d0(seekBar, seekBar.getContext(), h.j.f36018T, attributeSet, wV.r(), i10, 0);
        Drawable drawableH = wV.h(h.j.f36022U);
        if (drawableH != null) {
            this.f41990d.setThumb(drawableH);
        }
        j(wV.g(h.j.f36026V));
        if (wV.s(h.j.f36034X)) {
            this.f41993g = AbstractC5329H.d(wV.k(h.j.f36034X, -1), this.f41993g);
            this.f41995i = true;
        }
        if (wV.s(h.j.f36030W)) {
            this.f41992f = wV.c(h.j.f36030W);
            this.f41994h = true;
        }
        wV.x();
        f();
    }

    public final void f() {
        Drawable drawable = this.f41991e;
        if (drawable != null) {
            if (this.f41994h || this.f41995i) {
                Drawable drawableL = P0.a.l(drawable.mutate());
                this.f41991e = drawableL;
                if (this.f41994h) {
                    P0.a.i(drawableL, this.f41992f);
                }
                if (this.f41995i) {
                    P0.a.j(this.f41991e, this.f41993g);
                }
                if (this.f41991e.isStateful()) {
                    this.f41991e.setState(this.f41990d.getDrawableState());
                }
            }
        }
    }

    public void g(Canvas canvas) {
        if (this.f41991e != null) {
            int max = this.f41990d.getMax();
            if (max > 1) {
                int intrinsicWidth = this.f41991e.getIntrinsicWidth();
                int intrinsicHeight = this.f41991e.getIntrinsicHeight();
                int i10 = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i11 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.f41991e.setBounds(-i10, -i11, i10, i11);
                float width = ((this.f41990d.getWidth() - this.f41990d.getPaddingLeft()) - this.f41990d.getPaddingRight()) / max;
                int iSave = canvas.save();
                canvas.translate(this.f41990d.getPaddingLeft(), this.f41990d.getHeight() / 2);
                for (int i12 = 0; i12 <= max; i12++) {
                    this.f41991e.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(iSave);
            }
        }
    }

    public void h() {
        Drawable drawable = this.f41991e;
        if (drawable != null && drawable.isStateful() && drawable.setState(this.f41990d.getDrawableState())) {
            this.f41990d.invalidateDrawable(drawable);
        }
    }

    public void i() {
        Drawable drawable = this.f41991e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    public void j(Drawable drawable) {
        Drawable drawable2 = this.f41991e;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f41991e = drawable;
        if (drawable != null) {
            drawable.setCallback(this.f41990d);
            P0.a.g(drawable, this.f41990d.getLayoutDirection());
            if (drawable.isStateful()) {
                drawable.setState(this.f41990d.getDrawableState());
            }
            f();
        }
        this.f41990d.invalidate();
    }
}
