package p;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import h.AbstractC4262a;

/* JADX INFO: renamed from: p.k, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class C5349k extends EditText implements Y0.x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C5342d f41953a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C5323B f41954b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C5322A f41955c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c1.j f41956d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C5350l f41957e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public a f41958f;

    /* JADX INFO: renamed from: p.k$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a {
        public a() {
        }

        public TextClassifier a() {
            return C5349k.super.getTextClassifier();
        }

        public void b(TextClassifier textClassifier) {
            C5349k.super.setTextClassifier(textClassifier);
        }
    }

    public C5349k(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC4262a.f35816y);
    }

    private a getSuperCaller() {
        if (this.f41958f == null) {
            this.f41958f = new a();
        }
        return this.f41958f;
    }

    public void c(C5350l c5350l) {
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
        C5342d c5342d = this.f41953a;
        if (c5342d != null) {
            c5342d.b();
        }
        C5323B c5323b = this.f41954b;
        if (c5323b != null) {
            c5323b.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return c1.i.p(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        C5342d c5342d = this.f41953a;
        if (c5342d != null) {
            return c5342d.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C5342d c5342d = this.f41953a;
        if (c5342d != null) {
            return c5342d.d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f41954b.j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f41954b.k();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        return getSuperCaller().a();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f41954b.r(this, inputConnectionOnCreateInputConnection, editorInfo);
        return this.f41957e.d(AbstractC5352n.a(inputConnectionOnCreateInputConnection, editorInfo, this), editorInfo);
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (Build.VERSION.SDK_INT < 33) {
            ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onDragEvent(DragEvent dragEvent) {
        if (AbstractC5361w.a(this, dragEvent)) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public boolean onTextContextMenuItem(int i10) {
        if (AbstractC5361w.b(this, i10)) {
            return true;
        }
        return super.onTextContextMenuItem(i10);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C5342d c5342d = this.f41953a;
        if (c5342d != null) {
            c5342d.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        C5342d c5342d = this.f41953a;
        if (c5342d != null) {
            c5342d.g(i10);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C5323B c5323b = this.f41954b;
        if (c5323b != null) {
            c5323b.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C5323B c5323b = this.f41954b;
        if (c5323b != null) {
            c5323b.p();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(c1.i.q(this, callback));
    }

    public void setEmojiCompatEnabled(boolean z10) {
        this.f41957e.e(z10);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f41957e.a(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C5342d c5342d = this.f41953a;
        if (c5342d != null) {
            c5342d.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C5342d c5342d = this.f41953a;
        if (c5342d != null) {
            c5342d.j(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f41954b.w(colorStateList);
        this.f41954b.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f41954b.x(mode);
        this.f41954b.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        C5323B c5323b = this.f41954b;
        if (c5323b != null) {
            c5323b.q(context, i10);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        getSuperCaller().b(textClassifier);
    }

    public C5349k(Context context, AttributeSet attributeSet, int i10) {
        super(T.b(context), attributeSet, i10);
        S.a(this, getContext());
        C5342d c5342d = new C5342d(this);
        this.f41953a = c5342d;
        c5342d.e(attributeSet, i10);
        C5323B c5323b = new C5323B(this);
        this.f41954b = c5323b;
        c5323b.m(attributeSet, i10);
        c5323b.b();
        this.f41955c = new C5322A(this);
        this.f41956d = new c1.j();
        C5350l c5350l = new C5350l(this);
        this.f41957e = c5350l;
        c5350l.c(attributeSet, i10);
        c(c5350l);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        return super.getText();
    }
}
