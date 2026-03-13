package p;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.ToggleButton;

/* JADX INFO: renamed from: p.E, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class C5326E extends ToggleButton {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C5342d f41771a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C5323B f41772b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C5351m f41773c;

    public C5326E(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.buttonStyleToggle);
    }

    private C5351m getEmojiTextViewHelper() {
        if (this.f41773c == null) {
            this.f41773c = new C5351m(this);
        }
        return this.f41773c;
    }

    @Override // android.widget.ToggleButton, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C5342d c5342d = this.f41771a;
        if (c5342d != null) {
            c5342d.b();
        }
        C5323B c5323b = this.f41772b;
        if (c5323b != null) {
            c5323b.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C5342d c5342d = this.f41771a;
        if (c5342d != null) {
            return c5342d.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C5342d c5342d = this.f41771a;
        if (c5342d != null) {
            return c5342d.d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f41772b.j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f41772b.k();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        getEmojiTextViewHelper().d(z10);
    }

    @Override // android.widget.ToggleButton, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C5342d c5342d = this.f41771a;
        if (c5342d != null) {
            c5342d.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        C5342d c5342d = this.f41771a;
        if (c5342d != null) {
            c5342d.g(i10);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C5323B c5323b = this.f41772b;
        if (c5323b != null) {
            c5323b.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C5323B c5323b = this.f41772b;
        if (c5323b != null) {
            c5323b.p();
        }
    }

    public void setEmojiCompatEnabled(boolean z10) {
        getEmojiTextViewHelper().e(z10);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C5342d c5342d = this.f41771a;
        if (c5342d != null) {
            c5342d.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C5342d c5342d = this.f41771a;
        if (c5342d != null) {
            c5342d.j(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f41772b.w(colorStateList);
        this.f41772b.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f41772b.x(mode);
        this.f41772b.b();
    }

    public C5326E(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        S.a(this, getContext());
        C5342d c5342d = new C5342d(this);
        this.f41771a = c5342d;
        c5342d.e(attributeSet, i10);
        C5323B c5323b = new C5323B(this);
        this.f41772b = c5323b;
        c5323b.m(attributeSet, i10);
        getEmojiTextViewHelper().c(attributeSet, i10);
    }
}
