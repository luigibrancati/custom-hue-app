package p;

import W0.b;
import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import j.AbstractC4666a;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* JADX INFO: renamed from: p.C, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class C5324C extends TextView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C5342d f41748a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C5323B f41749b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C5322A f41750c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public C5351m f41751d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f41752e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public a f41753f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Future f41754g;

    /* JADX INFO: renamed from: p.C$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface a {
        void a(int[] iArr, int i10);

        void b(int i10);

        int c();

        int d();

        void e(int i10, float f10);

        int[] f();

        TextClassifier g();

        int h();

        void i(TextClassifier textClassifier);

        void j(int i10, int i11, int i12, int i13);

        void k(int i10);

        int l();

        void m(int i10);
    }

    /* JADX INFO: renamed from: p.C$c */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class c extends b {
        public c() {
            super();
        }

        @Override // p.C5324C.a
        public void b(int i10) {
            C5324C.super.setLastBaselineToBottomHeight(i10);
        }

        @Override // p.C5324C.a
        public void k(int i10) {
            C5324C.super.setFirstBaselineToTopHeight(i10);
        }
    }

    /* JADX INFO: renamed from: p.C$d */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class d extends c {
        public d() {
            super();
        }

        @Override // p.C5324C.b, p.C5324C.a
        public void e(int i10, float f10) {
            C5324C.super.setLineHeight(i10, f10);
        }
    }

    public C5324C(Context context) {
        this(context, null);
    }

    private C5351m getEmojiTextViewHelper() {
        if (this.f41751d == null) {
            this.f41751d = new C5351m(this);
        }
        return this.f41751d;
    }

    @Override // android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C5342d c5342d = this.f41748a;
        if (c5342d != null) {
            c5342d.b();
        }
        C5323B c5323b = this.f41749b;
        if (c5323b != null) {
            c5323b.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (c0.f41914a) {
            return getSuperCaller().h();
        }
        C5323B c5323b = this.f41749b;
        if (c5323b != null) {
            return c5323b.e();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (c0.f41914a) {
            return getSuperCaller().d();
        }
        C5323B c5323b = this.f41749b;
        if (c5323b != null) {
            return c5323b.f();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (c0.f41914a) {
            return getSuperCaller().l();
        }
        C5323B c5323b = this.f41749b;
        if (c5323b != null) {
            return c5323b.g();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (c0.f41914a) {
            return getSuperCaller().f();
        }
        C5323B c5323b = this.f41749b;
        return c5323b != null ? c5323b.h() : new int[0];
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (c0.f41914a) {
            return getSuperCaller().c() == 1 ? 1 : 0;
        }
        C5323B c5323b = this.f41749b;
        if (c5323b != null) {
            return c5323b.i();
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return c1.i.p(super.getCustomSelectionActionModeCallback());
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return c1.i.b(this);
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return c1.i.c(this);
    }

    public a getSuperCaller() {
        if (this.f41753f == null) {
            if (Build.VERSION.SDK_INT >= 34) {
                this.f41753f = new d();
            } else {
                this.f41753f = new c();
            }
        }
        return this.f41753f;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C5342d c5342d = this.f41748a;
        if (c5342d != null) {
            return c5342d.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C5342d c5342d = this.f41748a;
        if (c5342d != null) {
            return c5342d.d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f41749b.j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f41749b.k();
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        r();
        return super.getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        return getSuperCaller().g();
    }

    public b.a getTextMetricsParamsCompat() {
        return c1.i.e(this);
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f41749b.r(this, inputConnectionOnCreateInputConnection, editorInfo);
        return AbstractC5352n.a(inputConnectionOnCreateInputConnection, editorInfo, this);
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (Build.VERSION.SDK_INT >= 33 || !onCheckIsTextEditor()) {
            return;
        }
        ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        C5323B c5323b = this.f41749b;
        if (c5323b != null) {
            c5323b.o(z10, i10, i11, i12, i13);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i10, int i11) {
        r();
        super.onMeasure(i10, i11);
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
        C5323B c5323b = this.f41749b;
        if (c5323b == null || c0.f41914a || !c5323b.l()) {
            return;
        }
        this.f41749b.c();
    }

    public final void r() {
        Future future = this.f41754g;
        if (future != null) {
            try {
                this.f41754g = null;
                android.support.v4.media.session.a.a(future.get());
                c1.i.m(this, null);
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        getEmojiTextViewHelper().d(z10);
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithConfiguration(int i10, int i11, int i12, int i13) {
        if (c0.f41914a) {
            getSuperCaller().j(i10, i11, i12, i13);
            return;
        }
        C5323B c5323b = this.f41749b;
        if (c5323b != null) {
            c5323b.t(i10, i11, i12, i13);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i10) {
        if (c0.f41914a) {
            getSuperCaller().a(iArr, i10);
            return;
        }
        C5323B c5323b = this.f41749b;
        if (c5323b != null) {
            c5323b.u(iArr, i10);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i10) {
        if (c0.f41914a) {
            getSuperCaller().m(i10);
            return;
        }
        C5323B c5323b = this.f41749b;
        if (c5323b != null) {
            c5323b.v(i10);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C5342d c5342d = this.f41748a;
        if (c5342d != null) {
            c5342d.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        C5342d c5342d = this.f41748a;
        if (c5342d != null) {
            c5342d.g(i10);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C5323B c5323b = this.f41749b;
        if (c5323b != null) {
            c5323b.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C5323B c5323b = this.f41749b;
        if (c5323b != null) {
            c5323b.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C5323B c5323b = this.f41749b;
        if (c5323b != null) {
            c5323b.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C5323B c5323b = this.f41749b;
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

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i10) {
        getSuperCaller().k(i10);
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i10) {
        getSuperCaller().b(i10);
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i10) {
        c1.i.k(this, i10);
    }

    public void setPrecomputedText(W0.b bVar) {
        c1.i.m(this, bVar);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C5342d c5342d = this.f41748a;
        if (c5342d != null) {
            c5342d.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C5342d c5342d = this.f41748a;
        if (c5342d != null) {
            c5342d.j(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f41749b.w(colorStateList);
        this.f41749b.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f41749b.x(mode);
        this.f41749b.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        C5323B c5323b = this.f41749b;
        if (c5323b != null) {
            c5323b.q(context, i10);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        getSuperCaller().i(textClassifier);
    }

    public void setTextFuture(Future<W0.b> future) {
        this.f41754g = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(b.a aVar) {
        c1.i.o(this, aVar);
    }

    @Override // android.widget.TextView
    public void setTextSize(int i10, float f10) {
        if (c0.f41914a) {
            super.setTextSize(i10, f10);
            return;
        }
        C5323B c5323b = this.f41749b;
        if (c5323b != null) {
            c5323b.A(i10, f10);
        }
    }

    @Override // android.widget.TextView
    public void setTypeface(Typeface typeface, int i10) {
        if (this.f41752e) {
            return;
        }
        Typeface typefaceA = (typeface == null || i10 <= 0) ? null : O0.d.a(getContext(), typeface, i10);
        this.f41752e = true;
        if (typefaceA != null) {
            typeface = typefaceA;
        }
        try {
            super.setTypeface(typeface, i10);
        } finally {
            this.f41752e = false;
        }
    }

    public C5324C(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i10, float f10) {
        if (Build.VERSION.SDK_INT >= 34) {
            getSuperCaller().e(i10, f10);
        } else {
            c1.i.l(this, i10, f10);
        }
    }

    public C5324C(Context context, AttributeSet attributeSet, int i10) {
        super(T.b(context), attributeSet, i10);
        this.f41752e = false;
        this.f41753f = null;
        S.a(this, getContext());
        C5342d c5342d = new C5342d(this);
        this.f41748a = c5342d;
        c5342d.e(attributeSet, i10);
        C5323B c5323b = new C5323B(this);
        this.f41749b = c5323b;
        c5323b.m(attributeSet, i10);
        c5323b.b();
        this.f41750c = new C5322A(this);
        getEmojiTextViewHelper().c(attributeSet, i10);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i10 != 0 ? AbstractC4666a.b(context, i10) : null, i11 != 0 ? AbstractC4666a.b(context, i11) : null, i12 != 0 ? AbstractC4666a.b(context, i12) : null, i13 != 0 ? AbstractC4666a.b(context, i13) : null);
        C5323B c5323b = this.f41749b;
        if (c5323b != null) {
            c5323b.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i10 != 0 ? AbstractC4666a.b(context, i10) : null, i11 != 0 ? AbstractC4666a.b(context, i11) : null, i12 != 0 ? AbstractC4666a.b(context, i12) : null, i13 != 0 ? AbstractC4666a.b(context, i13) : null);
        C5323B c5323b = this.f41749b;
        if (c5323b != null) {
            c5323b.p();
        }
    }

    /* JADX INFO: renamed from: p.C$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class b implements a {
        public b() {
        }

        @Override // p.C5324C.a
        public void a(int[] iArr, int i10) {
            C5324C.super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i10);
        }

        @Override // p.C5324C.a
        public int c() {
            return C5324C.super.getAutoSizeTextType();
        }

        @Override // p.C5324C.a
        public int d() {
            return C5324C.super.getAutoSizeMinTextSize();
        }

        @Override // p.C5324C.a
        public int[] f() {
            return C5324C.super.getAutoSizeTextAvailableSizes();
        }

        @Override // p.C5324C.a
        public TextClassifier g() {
            return C5324C.super.getTextClassifier();
        }

        @Override // p.C5324C.a
        public int h() {
            return C5324C.super.getAutoSizeMaxTextSize();
        }

        @Override // p.C5324C.a
        public void i(TextClassifier textClassifier) {
            C5324C.super.setTextClassifier(textClassifier);
        }

        @Override // p.C5324C.a
        public void j(int i10, int i11, int i12, int i13) {
            C5324C.super.setAutoSizeTextTypeUniformWithConfiguration(i10, i11, i12, i13);
        }

        @Override // p.C5324C.a
        public int l() {
            return C5324C.super.getAutoSizeStepGranularity();
        }

        @Override // p.C5324C.a
        public void m(int i10) {
            C5324C.super.setAutoSizeTextTypeWithDefaults(i10);
        }

        @Override // p.C5324C.a
        public void e(int i10, float f10) {
        }
    }
}
