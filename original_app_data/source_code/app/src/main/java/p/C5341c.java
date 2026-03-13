package p;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;
import h.AbstractC4262a;
import j.AbstractC4666a;

/* JADX INFO: renamed from: p.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class C5341c extends AutoCompleteTextView {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[] f41910d = {R.attr.popupBackground};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C5342d f41911a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C5323B f41912b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C5350l f41913c;

    public C5341c(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC4262a.f35804m);
    }

    public void a(C5350l c5350l) {
        KeyListener keyListener = getKeyListener();
        if (c5350l.b(keyListener)) {
            boolean zIsFocusable = super.isFocusable();
            boolean zIsClickable = super.isClickable();
            boolean zIsLongClickable = super.isLongClickable();
            int inputType = super.getInputType();
            KeyListener keyListenerA = c5350l.a(keyListener);
            if (keyListenerA == keyListener) {
                return;
            }
            super.setKeyListener(keyListenerA);
            super.setRawInputType(inputType);
            super.setFocusable(zIsFocusable);
            super.setClickable(zIsClickable);
            super.setLongClickable(zIsLongClickable);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C5342d c5342d = this.f41911a;
        if (c5342d != null) {
            c5342d.b();
        }
        C5323B c5323b = this.f41912b;
        if (c5323b != null) {
            c5323b.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return c1.i.p(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        C5342d c5342d = this.f41911a;
        if (c5342d != null) {
            return c5342d.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C5342d c5342d = this.f41911a;
        if (c5342d != null) {
            return c5342d.d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f41912b.j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f41912b.k();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return this.f41913c.d(AbstractC5352n.a(super.onCreateInputConnection(editorInfo), editorInfo, this), editorInfo);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C5342d c5342d = this.f41911a;
        if (c5342d != null) {
            c5342d.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        C5342d c5342d = this.f41911a;
        if (c5342d != null) {
            c5342d.g(i10);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C5323B c5323b = this.f41912b;
        if (c5323b != null) {
            c5323b.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C5323B c5323b = this.f41912b;
        if (c5323b != null) {
            c5323b.p();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(c1.i.q(this, callback));
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i10) {
        setDropDownBackgroundDrawable(AbstractC4666a.b(getContext(), i10));
    }

    public void setEmojiCompatEnabled(boolean z10) {
        this.f41913c.e(z10);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f41913c.a(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C5342d c5342d = this.f41911a;
        if (c5342d != null) {
            c5342d.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C5342d c5342d = this.f41911a;
        if (c5342d != null) {
            c5342d.j(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f41912b.w(colorStateList);
        this.f41912b.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f41912b.x(mode);
        this.f41912b.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        C5323B c5323b = this.f41912b;
        if (c5323b != null) {
            c5323b.q(context, i10);
        }
    }

    public C5341c(Context context, AttributeSet attributeSet, int i10) {
        super(T.b(context), attributeSet, i10);
        S.a(this, getContext());
        W wV = W.v(getContext(), attributeSet, f41910d, i10, 0);
        if (wV.s(0)) {
            setDropDownBackgroundDrawable(wV.g(0));
        }
        wV.x();
        C5342d c5342d = new C5342d(this);
        this.f41911a = c5342d;
        c5342d.e(attributeSet, i10);
        C5323B c5323b = new C5323B(this);
        this.f41912b = c5323b;
        c5323b.m(attributeSet, i10);
        c5323b.b();
        C5350l c5350l = new C5350l(this);
        this.f41913c = c5350l;
        c5350l.c(attributeSet, i10);
        a(c5350l);
    }
}
