package p;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import h.AbstractC4262a;
import j.AbstractC4666a;

/* JADX INFO: renamed from: p.g, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class C5345g extends CheckedTextView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C5346h f41928a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C5342d f41929b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C5323B f41930c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public C5351m f41931d;

    public C5345g(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC4262a.f35807p);
    }

    private C5351m getEmojiTextViewHelper() {
        if (this.f41931d == null) {
            this.f41931d = new C5351m(this);
        }
        return this.f41931d;
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C5323B c5323b = this.f41930c;
        if (c5323b != null) {
            c5323b.b();
        }
        C5342d c5342d = this.f41929b;
        if (c5342d != null) {
            c5342d.b();
        }
        C5346h c5346h = this.f41928a;
        if (c5346h != null) {
            c5346h.a();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return c1.i.p(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        C5342d c5342d = this.f41929b;
        if (c5342d != null) {
            return c5342d.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C5342d c5342d = this.f41929b;
        if (c5342d != null) {
            return c5342d.d();
        }
        return null;
    }

    public ColorStateList getSupportCheckMarkTintList() {
        C5346h c5346h = this.f41928a;
        if (c5346h != null) {
            return c5346h.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportCheckMarkTintMode() {
        C5346h c5346h = this.f41928a;
        if (c5346h != null) {
            return c5346h.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f41930c.j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f41930c.k();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return AbstractC5352n.a(super.onCreateInputConnection(editorInfo), editorInfo, this);
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        getEmojiTextViewHelper().d(z10);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C5342d c5342d = this.f41929b;
        if (c5342d != null) {
            c5342d.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        C5342d c5342d = this.f41929b;
        if (c5342d != null) {
            c5342d.g(i10);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        C5346h c5346h = this.f41928a;
        if (c5346h != null) {
            c5346h.e();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C5323B c5323b = this.f41930c;
        if (c5323b != null) {
            c5323b.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C5323B c5323b = this.f41930c;
        if (c5323b != null) {
            c5323b.p();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(c1.i.q(this, callback));
    }

    public void setEmojiCompatEnabled(boolean z10) {
        getEmojiTextViewHelper().e(z10);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C5342d c5342d = this.f41929b;
        if (c5342d != null) {
            c5342d.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C5342d c5342d = this.f41929b;
        if (c5342d != null) {
            c5342d.j(mode);
        }
    }

    public void setSupportCheckMarkTintList(ColorStateList colorStateList) {
        C5346h c5346h = this.f41928a;
        if (c5346h != null) {
            c5346h.f(colorStateList);
        }
    }

    public void setSupportCheckMarkTintMode(PorterDuff.Mode mode) {
        C5346h c5346h = this.f41928a;
        if (c5346h != null) {
            c5346h.g(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f41930c.w(colorStateList);
        this.f41930c.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f41930c.x(mode);
        this.f41930c.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        C5323B c5323b = this.f41930c;
        if (c5323b != null) {
            c5323b.q(context, i10);
        }
    }

    public C5345g(Context context, AttributeSet attributeSet, int i10) {
        super(T.b(context), attributeSet, i10);
        S.a(this, getContext());
        C5323B c5323b = new C5323B(this);
        this.f41930c = c5323b;
        c5323b.m(attributeSet, i10);
        c5323b.b();
        C5342d c5342d = new C5342d(this);
        this.f41929b = c5342d;
        c5342d.e(attributeSet, i10);
        C5346h c5346h = new C5346h(this);
        this.f41928a = c5346h;
        c5346h.d(attributeSet, i10);
        getEmojiTextViewHelper().c(attributeSet, i10);
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i10) {
        setCheckMarkDrawable(AbstractC4666a.b(getContext(), i10));
    }
}
