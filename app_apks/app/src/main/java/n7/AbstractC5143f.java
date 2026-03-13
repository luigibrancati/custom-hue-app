package n7;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;

/* JADX INFO: renamed from: n7.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5143f extends androidx.appcompat.widget.b {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Drawable f40703p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Rect f40704q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Rect f40705r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f40706s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f40707t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f40708u;

    public AbstractC5143f(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f40704q = new Rect();
        this.f40705r = new Rect();
        this.f40706s = 119;
        this.f40707t = true;
        this.f40708u = false;
        TypedArray typedArrayH = l.h(context, attributeSet, c7.j.f26358y1, i10, 0, new int[0]);
        this.f40706s = typedArrayH.getInt(c7.j.f25993A1, this.f40706s);
        Drawable drawable = typedArrayH.getDrawable(c7.j.f26365z1);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.f40707t = typedArrayH.getBoolean(c7.j.f26000B1, true);
        typedArrayH.recycle();
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.f40703p;
        if (drawable != null) {
            if (this.f40708u) {
                this.f40708u = false;
                Rect rect = this.f40704q;
                Rect rect2 = this.f40705r;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                if (this.f40707t) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                Gravity.apply(this.f40706s, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    @Override // android.view.View
    public void drawableHotspotChanged(float f10, float f11) {
        super.drawableHotspotChanged(f10, f11);
        Drawable drawable = this.f40703p;
        if (drawable != null) {
            drawable.setHotspot(f10, f11);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f40703p;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        this.f40703p.setState(getDrawableState());
    }

    @Override // android.view.View
    public Drawable getForeground() {
        return this.f40703p;
    }

    @Override // android.view.View
    public int getForegroundGravity() {
        return this.f40706s;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f40703p;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // androidx.appcompat.widget.b, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.f40708u = z10 | this.f40708u;
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.f40708u = true;
    }

    @Override // android.view.View
    public void setForeground(Drawable drawable) {
        Drawable drawable2 = this.f40703p;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
                unscheduleDrawable(this.f40703p);
            }
            this.f40703p = drawable;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.f40706s == 119) {
                    drawable.getPadding(new Rect());
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    @Override // android.view.View
    public void setForegroundGravity(int i10) {
        if (this.f40706s != i10) {
            if ((8388615 & i10) == 0) {
                i10 |= 8388611;
            }
            if ((i10 & 112) == 0) {
                i10 |= 48;
            }
            this.f40706s = i10;
            if (i10 == 119 && this.f40703p != null) {
                this.f40703p.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f40703p;
    }
}
