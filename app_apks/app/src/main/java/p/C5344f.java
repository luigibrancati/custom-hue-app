package p;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.CheckBox;
import h.AbstractC4262a;
import j.AbstractC4666a;

/* JADX INFO: renamed from: p.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class C5344f extends CheckBox {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C5347i f41924a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C5342d f41925b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C5323B f41926c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public C5351m f41927d;

    public C5344f(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC4262a.f35806o);
    }

    private C5351m getEmojiTextViewHelper() {
        if (this.f41927d == null) {
            this.f41927d = new C5351m(this);
        }
        return this.f41927d;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C5342d c5342d = this.f41925b;
        if (c5342d != null) {
            c5342d.b();
        }
        C5323B c5323b = this.f41926c;
        if (c5323b != null) {
            c5323b.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C5342d c5342d = this.f41925b;
        if (c5342d != null) {
            return c5342d.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C5342d c5342d = this.f41925b;
        if (c5342d != null) {
            return c5342d.d();
        }
        return null;
    }

    public ColorStateList getSupportButtonTintList() {
        C5347i c5347i = this.f41924a;
        if (c5347i != null) {
            return c5347i.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        C5347i c5347i = this.f41924a;
        if (c5347i != null) {
            return c5347i.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f41926c.j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f41926c.k();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        getEmojiTextViewHelper().d(z10);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C5342d c5342d = this.f41925b;
        if (c5342d != null) {
            c5342d.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        C5342d c5342d = this.f41925b;
        if (c5342d != null) {
            c5342d.g(i10);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        C5347i c5347i = this.f41924a;
        if (c5347i != null) {
            c5347i.e();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C5323B c5323b = this.f41926c;
        if (c5323b != null) {
            c5323b.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C5323B c5323b = this.f41926c;
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
        C5342d c5342d = this.f41925b;
        if (c5342d != null) {
            c5342d.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C5342d c5342d = this.f41925b;
        if (c5342d != null) {
            c5342d.j(mode);
        }
    }

    public void setSupportButtonTintList(ColorStateList colorStateList) {
        C5347i c5347i = this.f41924a;
        if (c5347i != null) {
            c5347i.f(colorStateList);
        }
    }

    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        C5347i c5347i = this.f41924a;
        if (c5347i != null) {
            c5347i.g(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f41926c.w(colorStateList);
        this.f41926c.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f41926c.x(mode);
        this.f41926c.b();
    }

    public C5344f(Context context, AttributeSet attributeSet, int i10) {
        super(T.b(context), attributeSet, i10);
        S.a(this, getContext());
        C5347i c5347i = new C5347i(this);
        this.f41924a = c5347i;
        c5347i.d(attributeSet, i10);
        C5342d c5342d = new C5342d(this);
        this.f41925b = c5342d;
        c5342d.e(attributeSet, i10);
        C5323B c5323b = new C5323B(this);
        this.f41926c = c5323b;
        c5323b.m(attributeSet, i10);
        getEmojiTextViewHelper().c(attributeSet, i10);
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i10) {
        setButtonDrawable(AbstractC4666a.b(getContext(), i10));
    }
}
