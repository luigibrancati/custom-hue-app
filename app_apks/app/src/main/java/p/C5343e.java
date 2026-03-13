package p;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import h.AbstractC4262a;

/* JADX INFO: renamed from: p.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class C5343e extends Button {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C5342d f41921a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C5323B f41922b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C5351m f41923c;

    public C5343e(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC4262a.f35805n);
    }

    private C5351m getEmojiTextViewHelper() {
        if (this.f41923c == null) {
            this.f41923c = new C5351m(this);
        }
        return this.f41923c;
    }

    @Override // android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C5342d c5342d = this.f41921a;
        if (c5342d != null) {
            c5342d.b();
        }
        C5323B c5323b = this.f41922b;
        if (c5323b != null) {
            c5323b.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (c0.f41914a) {
            return super.getAutoSizeMaxTextSize();
        }
        C5323B c5323b = this.f41922b;
        if (c5323b != null) {
            return c5323b.e();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (c0.f41914a) {
            return super.getAutoSizeMinTextSize();
        }
        C5323B c5323b = this.f41922b;
        if (c5323b != null) {
            return c5323b.f();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (c0.f41914a) {
            return super.getAutoSizeStepGranularity();
        }
        C5323B c5323b = this.f41922b;
        if (c5323b != null) {
            return c5323b.g();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (c0.f41914a) {
            return super.getAutoSizeTextAvailableSizes();
        }
        C5323B c5323b = this.f41922b;
        return c5323b != null ? c5323b.h() : new int[0];
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (c0.f41914a) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        C5323B c5323b = this.f41922b;
        if (c5323b != null) {
            return c5323b.i();
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return c1.i.p(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        C5342d c5342d = this.f41921a;
        if (c5342d != null) {
            return c5342d.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C5342d c5342d = this.f41921a;
        if (c5342d != null) {
            return c5342d.d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f41922b.j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f41922b.k();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        C5323B c5323b = this.f41922b;
        if (c5323b != null) {
            c5323b.o(z10, i10, i11, i12, i13);
        }
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
        C5323B c5323b = this.f41922b;
        if (c5323b == null || c0.f41914a || !c5323b.l()) {
            return;
        }
        this.f41922b.c();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        getEmojiTextViewHelper().d(z10);
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithConfiguration(int i10, int i11, int i12, int i13) {
        if (c0.f41914a) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i10, i11, i12, i13);
            return;
        }
        C5323B c5323b = this.f41922b;
        if (c5323b != null) {
            c5323b.t(i10, i11, i12, i13);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i10) {
        if (c0.f41914a) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i10);
            return;
        }
        C5323B c5323b = this.f41922b;
        if (c5323b != null) {
            c5323b.u(iArr, i10);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i10) {
        if (c0.f41914a) {
            super.setAutoSizeTextTypeWithDefaults(i10);
            return;
        }
        C5323B c5323b = this.f41922b;
        if (c5323b != null) {
            c5323b.v(i10);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C5342d c5342d = this.f41921a;
        if (c5342d != null) {
            c5342d.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        C5342d c5342d = this.f41921a;
        if (c5342d != null) {
            c5342d.g(i10);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(c1.i.q(this, callback));
    }

    public void setEmojiCompatEnabled(boolean z10) {
        getEmojiTextViewHelper().e(z10);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setSupportAllCaps(boolean z10) {
        C5323B c5323b = this.f41922b;
        if (c5323b != null) {
            c5323b.s(z10);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C5342d c5342d = this.f41921a;
        if (c5342d != null) {
            c5342d.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C5342d c5342d = this.f41921a;
        if (c5342d != null) {
            c5342d.j(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f41922b.w(colorStateList);
        this.f41922b.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f41922b.x(mode);
        this.f41922b.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        C5323B c5323b = this.f41922b;
        if (c5323b != null) {
            c5323b.q(context, i10);
        }
    }

    @Override // android.widget.TextView
    public void setTextSize(int i10, float f10) {
        if (c0.f41914a) {
            super.setTextSize(i10, f10);
            return;
        }
        C5323B c5323b = this.f41922b;
        if (c5323b != null) {
            c5323b.A(i10, f10);
        }
    }

    public C5343e(Context context, AttributeSet attributeSet, int i10) {
        super(T.b(context), attributeSet, i10);
        S.a(this, getContext());
        C5342d c5342d = new C5342d(this);
        this.f41921a = c5342d;
        c5342d.e(attributeSet, i10);
        C5323B c5323b = new C5323B(this);
        this.f41922b = c5323b;
        c5323b.m(attributeSet, i10);
        c5323b.b();
        getEmojiTextViewHelper().c(attributeSet, i10);
    }
}
