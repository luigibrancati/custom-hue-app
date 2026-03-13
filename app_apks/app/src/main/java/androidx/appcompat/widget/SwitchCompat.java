package androidx.appcompat.widget;

import Y0.E;
import android.R;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.Property;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import androidx.emoji2.text.c;
import c1.i;
import h.AbstractC4262a;
import h.h;
import h.j;
import j.AbstractC4666a;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import m.C4998a;
import p.AbstractC5329H;
import p.C5323B;
import p.C5351m;
import p.S;
import p.W;
import p.c0;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class SwitchCompat extends CompoundButton {

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public static final Property f21760l0 = new a(Float.class, "thumbPos");

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public static final int[] f21761m0 = {R.attr.state_checked};

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f21762A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public int f21763B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public int f21764C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public int f21765D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public int f21766E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public int f21767F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public int f21768G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public boolean f21769H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final TextPaint f21770I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public ColorStateList f21771J;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public Layout f21772P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public Layout f21773Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public TransformationMethod f21774R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public ObjectAnimator f21775S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public final C5323B f21776T;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public C5351m f21777V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public b f21778W;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Drawable f21779a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ColorStateList f21780b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public PorterDuff.Mode f21781c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f21782d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f21783e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Drawable f21784f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ColorStateList f21785g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public PorterDuff.Mode f21786h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f21787i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f21788j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f21789k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final Rect f21790k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f21791l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f21792m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f21793n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public CharSequence f21794o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public CharSequence f21795p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public CharSequence f21796q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public CharSequence f21797r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f21798s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f21799t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f21800u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public float f21801v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public float f21802w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public VelocityTracker f21803x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f21804y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public float f21805z;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a extends Property {
        public a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(SwitchCompat switchCompat) {
            return Float.valueOf(switchCompat.f21805z);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(SwitchCompat switchCompat, Float f10) {
            switchCompat.setThumbPosition(f10.floatValue());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class b extends c.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Reference f21806a;

        public b(SwitchCompat switchCompat) {
            this.f21806a = new WeakReference(switchCompat);
        }

        @Override // androidx.emoji2.text.c.f
        public void a(Throwable th) {
            SwitchCompat switchCompat = (SwitchCompat) this.f21806a.get();
            if (switchCompat != null) {
                switchCompat.j();
            }
        }

        @Override // androidx.emoji2.text.c.f
        public void b() {
            SwitchCompat switchCompat = (SwitchCompat) this.f21806a.get();
            if (switchCompat != null) {
                switchCompat.j();
            }
        }
    }

    public SwitchCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC4262a.f35789H);
    }

    public static float f(float f10, float f11, float f12) {
        return f10 < f11 ? f11 : f10 > f12 ? f12 : f10;
    }

    private C5351m getEmojiTextViewHelper() {
        if (this.f21777V == null) {
            this.f21777V = new C5351m(this);
        }
        return this.f21777V;
    }

    private boolean getTargetCheckedState() {
        return this.f21805z > 0.5f;
    }

    private int getThumbOffset() {
        return (int) (((c0.b(this) ? 1.0f - this.f21805z : this.f21805z) * getThumbScrollRange()) + 0.5f);
    }

    private int getThumbScrollRange() {
        Drawable drawable = this.f21784f;
        if (drawable == null) {
            return 0;
        }
        Rect rect = this.f21790k0;
        drawable.getPadding(rect);
        Drawable drawable2 = this.f21779a;
        Rect rectC = drawable2 != null ? AbstractC5329H.c(drawable2) : AbstractC5329H.f41776c;
        return ((((this.f21762A - this.f21764C) - rect.left) - rect.right) - rectC.left) - rectC.right;
    }

    private void setTextOffInternal(CharSequence charSequence) {
        this.f21796q = charSequence;
        this.f21797r = g(charSequence);
        this.f21773Q = null;
        if (this.f21798s) {
            p();
        }
    }

    private void setTextOnInternal(CharSequence charSequence) {
        this.f21794o = charSequence;
        this.f21795p = g(charSequence);
        this.f21772P = null;
        if (this.f21798s) {
            p();
        }
    }

    public final void a(boolean z10) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, (Property<SwitchCompat, Float>) f21760l0, z10 ? 1.0f : 0.0f);
        this.f21775S = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setDuration(250L);
        this.f21775S.setAutoCancel(true);
        this.f21775S.start();
    }

    public final void b() {
        Drawable drawable = this.f21779a;
        if (drawable != null) {
            if (this.f21782d || this.f21783e) {
                Drawable drawableMutate = P0.a.l(drawable).mutate();
                this.f21779a = drawableMutate;
                if (this.f21782d) {
                    P0.a.i(drawableMutate, this.f21780b);
                }
                if (this.f21783e) {
                    P0.a.j(this.f21779a, this.f21781c);
                }
                if (this.f21779a.isStateful()) {
                    this.f21779a.setState(getDrawableState());
                }
            }
        }
    }

    public final void c() {
        Drawable drawable = this.f21784f;
        if (drawable != null) {
            if (this.f21787i || this.f21788j) {
                Drawable drawableMutate = P0.a.l(drawable).mutate();
                this.f21784f = drawableMutate;
                if (this.f21787i) {
                    P0.a.i(drawableMutate, this.f21785g);
                }
                if (this.f21788j) {
                    P0.a.j(this.f21784f, this.f21786h);
                }
                if (this.f21784f.isStateful()) {
                    this.f21784f.setState(getDrawableState());
                }
            }
        }
    }

    public final void d() {
        ObjectAnimator objectAnimator = this.f21775S;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int i10;
        int i11;
        Rect rect = this.f21790k0;
        int i12 = this.f21765D;
        int i13 = this.f21766E;
        int i14 = this.f21767F;
        int i15 = this.f21768G;
        int thumbOffset = getThumbOffset() + i12;
        Drawable drawable = this.f21779a;
        Rect rectC = drawable != null ? AbstractC5329H.c(drawable) : AbstractC5329H.f41776c;
        Drawable drawable2 = this.f21784f;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            int i16 = rect.left;
            thumbOffset += i16;
            if (rectC != null) {
                int i17 = rectC.left;
                if (i17 > i16) {
                    i12 += i17 - i16;
                }
                int i18 = rectC.top;
                int i19 = rect.top;
                i10 = i18 > i19 ? (i18 - i19) + i13 : i13;
                int i20 = rectC.right;
                int i21 = rect.right;
                if (i20 > i21) {
                    i14 -= i20 - i21;
                }
                int i22 = rectC.bottom;
                int i23 = rect.bottom;
                if (i22 > i23) {
                    i11 = i15 - (i22 - i23);
                }
                this.f21784f.setBounds(i12, i10, i14, i11);
            } else {
                i10 = i13;
            }
            i11 = i15;
            this.f21784f.setBounds(i12, i10, i14, i11);
        }
        Drawable drawable3 = this.f21779a;
        if (drawable3 != null) {
            drawable3.getPadding(rect);
            int i24 = thumbOffset - rect.left;
            int i25 = thumbOffset + this.f21764C + rect.right;
            this.f21779a.setBounds(i24, i13, i25, i15);
            Drawable background = getBackground();
            if (background != null) {
                P0.a.f(background, i24, i13, i25, i15);
            }
        }
        super.draw(canvas);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableHotspotChanged(float f10, float f11) {
        super.drawableHotspotChanged(f10, f11);
        Drawable drawable = this.f21779a;
        if (drawable != null) {
            P0.a.e(drawable, f10, f11);
        }
        Drawable drawable2 = this.f21784f;
        if (drawable2 != null) {
            P0.a.e(drawable2, f10, f11);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f21779a;
        boolean state = (drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState);
        Drawable drawable2 = this.f21784f;
        if (drawable2 != null && drawable2.isStateful()) {
            state |= drawable2.setState(drawableState);
        }
        if (state) {
            invalidate();
        }
    }

    public final void e(MotionEvent motionEvent) {
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        motionEventObtain.setAction(3);
        super.onTouchEvent(motionEventObtain);
        motionEventObtain.recycle();
    }

    public final CharSequence g(CharSequence charSequence) {
        TransformationMethod transformationMethodF = getEmojiTextViewHelper().f(this.f21774R);
        return transformationMethodF != null ? transformationMethodF.getTransformation(charSequence, this) : charSequence;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        if (!c0.b(this)) {
            return super.getCompoundPaddingLeft();
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.f21762A;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingLeft + this.f21792m : compoundPaddingLeft;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingRight() {
        if (c0.b(this)) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.f21762A;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingRight + this.f21792m : compoundPaddingRight;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return i.p(super.getCustomSelectionActionModeCallback());
    }

    public boolean getShowText() {
        return this.f21798s;
    }

    public boolean getSplitTrack() {
        return this.f21793n;
    }

    public int getSwitchMinWidth() {
        return this.f21791l;
    }

    public int getSwitchPadding() {
        return this.f21792m;
    }

    public CharSequence getTextOff() {
        return this.f21796q;
    }

    public CharSequence getTextOn() {
        return this.f21794o;
    }

    public Drawable getThumbDrawable() {
        return this.f21779a;
    }

    public final float getThumbPosition() {
        return this.f21805z;
    }

    public int getThumbTextPadding() {
        return this.f21789k;
    }

    public ColorStateList getThumbTintList() {
        return this.f21780b;
    }

    public PorterDuff.Mode getThumbTintMode() {
        return this.f21781c;
    }

    public Drawable getTrackDrawable() {
        return this.f21784f;
    }

    public ColorStateList getTrackTintList() {
        return this.f21785g;
    }

    public PorterDuff.Mode getTrackTintMode() {
        return this.f21786h;
    }

    public final boolean h(float f10, float f11) {
        if (this.f21779a == null) {
            return false;
        }
        int thumbOffset = getThumbOffset();
        this.f21779a.getPadding(this.f21790k0);
        int i10 = this.f21766E;
        int i11 = this.f21800u;
        int i12 = i10 - i11;
        int i13 = (this.f21765D + thumbOffset) - i11;
        int i14 = this.f21764C + i13;
        Rect rect = this.f21790k0;
        return f10 > ((float) i13) && f10 < ((float) (((i14 + rect.left) + rect.right) + i11)) && f11 > ((float) i12) && f11 < ((float) (this.f21768G + i11));
    }

    public final Layout i(CharSequence charSequence) {
        return new StaticLayout(charSequence, this.f21770I, charSequence != null ? (int) Math.ceil(Layout.getDesiredWidth(charSequence, r2)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
    }

    public void j() {
        setTextOnInternal(this.f21794o);
        setTextOffInternal(this.f21796q);
        requestLayout();
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f21779a;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f21784f;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.f21775S;
        if (objectAnimator == null || !objectAnimator.isStarted()) {
            return;
        }
        this.f21775S.end();
        this.f21775S = null;
    }

    public final void k() {
        CharSequence string = this.f21796q;
        if (string == null) {
            string = getResources().getString(h.f35926b);
        }
        E.t0(this, string);
    }

    public final void l() {
        CharSequence string = this.f21794o;
        if (string == null) {
            string = getResources().getString(h.f35927c);
        }
        E.t0(this, string);
    }

    public void m(Context context, int i10) {
        W wT = W.t(context, i10, j.f35949B2);
        ColorStateList colorStateListC = wT.c(j.f35965F2);
        if (colorStateListC != null) {
            this.f21771J = colorStateListC;
        } else {
            this.f21771J = getTextColors();
        }
        int iF = wT.f(j.f35953C2, 0);
        if (iF != 0) {
            float f10 = iF;
            if (f10 != this.f21770I.getTextSize()) {
                this.f21770I.setTextSize(f10);
                requestLayout();
            }
        }
        o(wT.k(j.f35957D2, -1), wT.k(j.f35961E2, -1));
        if (wT.a(j.f35985K2, false)) {
            this.f21774R = new C4998a(getContext());
        } else {
            this.f21774R = null;
        }
        setTextOnInternal(this.f21794o);
        setTextOffInternal(this.f21796q);
        wT.x();
    }

    public void n(Typeface typeface, int i10) {
        if (i10 <= 0) {
            this.f21770I.setFakeBoldText(false);
            this.f21770I.setTextSkewX(0.0f);
            setSwitchTypeface(typeface);
        } else {
            Typeface typefaceDefaultFromStyle = typeface == null ? Typeface.defaultFromStyle(i10) : Typeface.create(typeface, i10);
            setSwitchTypeface(typefaceDefaultFromStyle);
            int i11 = (~(typefaceDefaultFromStyle != null ? typefaceDefaultFromStyle.getStyle() : 0)) & i10;
            this.f21770I.setFakeBoldText((i11 & 1) != 0);
            this.f21770I.setTextSkewX((i11 & 2) != 0 ? -0.25f : 0.0f);
        }
    }

    public final void o(int i10, int i11) {
        n(i10 != 1 ? i10 != 2 ? i10 != 3 ? null : Typeface.MONOSPACE : Typeface.SERIF : Typeface.SANS_SERIF, i11);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public int[] onCreateDrawableState(int i10) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i10 + 1);
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f21761m0);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        int width;
        super.onDraw(canvas);
        Rect rect = this.f21790k0;
        Drawable drawable = this.f21784f;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i10 = this.f21766E;
        int i11 = this.f21768G;
        int i12 = i10 + rect.top;
        int i13 = i11 - rect.bottom;
        Drawable drawable2 = this.f21779a;
        if (drawable != null) {
            if (!this.f21793n || drawable2 == null) {
                drawable.draw(canvas);
            } else {
                Rect rectC = AbstractC5329H.c(drawable2);
                drawable2.copyBounds(rect);
                rect.left += rectC.left;
                rect.right -= rectC.right;
                int iSave = canvas.save();
                canvas.clipRect(rect, Region.Op.DIFFERENCE);
                drawable.draw(canvas);
                canvas.restoreToCount(iSave);
            }
        }
        int iSave2 = canvas.save();
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        Layout layout = getTargetCheckedState() ? this.f21772P : this.f21773Q;
        if (layout != null) {
            int[] drawableState = getDrawableState();
            ColorStateList colorStateList = this.f21771J;
            if (colorStateList != null) {
                this.f21770I.setColor(colorStateList.getColorForState(drawableState, 0));
            }
            this.f21770I.drawableState = drawableState;
            if (drawable2 != null) {
                Rect bounds = drawable2.getBounds();
                width = bounds.left + bounds.right;
            } else {
                width = getWidth();
            }
            canvas.translate((width / 2) - (layout.getWidth() / 2), ((i12 + i13) / 2) - (layout.getHeight() / 2));
            layout.draw(canvas);
        }
        canvas.restoreToCount(iSave2);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("android.widget.Switch");
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int iMax;
        int width;
        int paddingLeft;
        int i14;
        int paddingTop;
        int height;
        super.onLayout(z10, i10, i11, i12, i13);
        int iMax2 = 0;
        if (this.f21779a != null) {
            Rect rect = this.f21790k0;
            Drawable drawable = this.f21784f;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect rectC = AbstractC5329H.c(this.f21779a);
            iMax = Math.max(0, rectC.left - rect.left);
            iMax2 = Math.max(0, rectC.right - rect.right);
        } else {
            iMax = 0;
        }
        if (c0.b(this)) {
            paddingLeft = getPaddingLeft() + iMax;
            width = ((this.f21762A + paddingLeft) - iMax) - iMax2;
        } else {
            width = (getWidth() - getPaddingRight()) - iMax2;
            paddingLeft = (width - this.f21762A) + iMax + iMax2;
        }
        int gravity = getGravity() & 112;
        if (gravity == 16) {
            int paddingTop2 = ((getPaddingTop() + getHeight()) - getPaddingBottom()) / 2;
            i14 = this.f21763B;
            paddingTop = paddingTop2 - (i14 / 2);
        } else {
            if (gravity == 80) {
                height = getHeight() - getPaddingBottom();
                paddingTop = height - this.f21763B;
                this.f21765D = paddingLeft;
                this.f21766E = paddingTop;
                this.f21768G = height;
                this.f21767F = width;
            }
            paddingTop = getPaddingTop();
            i14 = this.f21763B;
        }
        height = i14 + paddingTop;
        this.f21765D = paddingLeft;
        this.f21766E = paddingTop;
        this.f21768G = height;
        this.f21767F = width;
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i10, int i11) {
        int intrinsicWidth;
        int intrinsicHeight;
        if (this.f21798s) {
            if (this.f21772P == null) {
                this.f21772P = i(this.f21795p);
            }
            if (this.f21773Q == null) {
                this.f21773Q = i(this.f21797r);
            }
        }
        Rect rect = this.f21790k0;
        Drawable drawable = this.f21779a;
        int intrinsicHeight2 = 0;
        if (drawable != null) {
            drawable.getPadding(rect);
            intrinsicWidth = (this.f21779a.getIntrinsicWidth() - rect.left) - rect.right;
            intrinsicHeight = this.f21779a.getIntrinsicHeight();
        } else {
            intrinsicWidth = 0;
            intrinsicHeight = 0;
        }
        this.f21764C = Math.max(this.f21798s ? Math.max(this.f21772P.getWidth(), this.f21773Q.getWidth()) + (this.f21789k * 2) : 0, intrinsicWidth);
        Drawable drawable2 = this.f21784f;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            intrinsicHeight2 = this.f21784f.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int iMax = rect.left;
        int iMax2 = rect.right;
        Drawable drawable3 = this.f21779a;
        if (drawable3 != null) {
            Rect rectC = AbstractC5329H.c(drawable3);
            iMax = Math.max(iMax, rectC.left);
            iMax2 = Math.max(iMax2, rectC.right);
        }
        int iMax3 = this.f21769H ? Math.max(this.f21791l, (this.f21764C * 2) + iMax + iMax2) : this.f21791l;
        int iMax4 = Math.max(intrinsicHeight2, intrinsicHeight);
        this.f21762A = iMax3;
        this.f21763B = iMax4;
        super.onMeasure(i10, i11);
        if (getMeasuredHeight() < iMax4) {
            setMeasuredDimension(getMeasuredWidthAndState(), iMax4);
        }
    }

    @Override // android.view.View
    public void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        CharSequence charSequence = isChecked() ? this.f21794o : this.f21796q;
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0089  */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            android.view.VelocityTracker r0 = r6.f21803x
            r0.addMovement(r7)
            int r0 = r7.getActionMasked()
            r1 = 1
            if (r0 == 0) goto L9d
            r2 = 2
            if (r0 == r1) goto L89
            if (r0 == r2) goto L16
            r3 = 3
            if (r0 == r3) goto L89
            goto Lb7
        L16:
            int r0 = r6.f21799t
            if (r0 == r1) goto L55
            if (r0 == r2) goto L1e
            goto Lb7
        L1e:
            float r7 = r7.getX()
            int r0 = r6.getThumbScrollRange()
            float r2 = r6.f21801v
            float r2 = r7 - r2
            r3 = 1065353216(0x3f800000, float:1.0)
            r4 = 0
            if (r0 == 0) goto L32
            float r0 = (float) r0
            float r2 = r2 / r0
            goto L3b
        L32:
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L38
            r2 = r3
            goto L3b
        L38:
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r2 = r0
        L3b:
            boolean r0 = p.c0.b(r6)
            if (r0 == 0) goto L42
            float r2 = -r2
        L42:
            float r0 = r6.f21805z
            float r0 = r0 + r2
            float r0 = f(r0, r4, r3)
            float r2 = r6.f21805z
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L54
            r6.f21801v = r7
            r6.setThumbPosition(r0)
        L54:
            return r1
        L55:
            float r0 = r7.getX()
            float r3 = r7.getY()
            float r4 = r6.f21801v
            float r4 = r0 - r4
            float r4 = java.lang.Math.abs(r4)
            int r5 = r6.f21800u
            float r5 = (float) r5
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 > 0) goto L7b
            float r4 = r6.f21802w
            float r4 = r3 - r4
            float r4 = java.lang.Math.abs(r4)
            int r5 = r6.f21800u
            float r5 = (float) r5
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto Lb7
        L7b:
            r6.f21799t = r2
            android.view.ViewParent r7 = r6.getParent()
            r7.requestDisallowInterceptTouchEvent(r1)
            r6.f21801v = r0
            r6.f21802w = r3
            return r1
        L89:
            int r0 = r6.f21799t
            if (r0 != r2) goto L94
            r6.q(r7)
            super.onTouchEvent(r7)
            return r1
        L94:
            r0 = 0
            r6.f21799t = r0
            android.view.VelocityTracker r0 = r6.f21803x
            r0.clear()
            goto Lb7
        L9d:
            float r0 = r7.getX()
            float r2 = r7.getY()
            boolean r3 = r6.isEnabled()
            if (r3 == 0) goto Lb7
            boolean r3 = r6.h(r0, r2)
            if (r3 == 0) goto Lb7
            r6.f21799t = r1
            r6.f21801v = r0
            r6.f21802w = r2
        Lb7:
            boolean r6 = super.onTouchEvent(r7)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SwitchCompat.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void p() {
        if (this.f21778W == null && this.f21777V.b() && androidx.emoji2.text.c.i()) {
            androidx.emoji2.text.c cVarC = androidx.emoji2.text.c.c();
            int iE = cVarC.e();
            if (iE == 3 || iE == 0) {
                b bVar = new b(this);
                this.f21778W = bVar;
                cVarC.t(bVar);
            }
        }
    }

    public final void q(MotionEvent motionEvent) {
        this.f21799t = 0;
        boolean targetCheckedState = true;
        boolean z10 = motionEvent.getAction() == 1 && isEnabled();
        boolean zIsChecked = isChecked();
        if (z10) {
            this.f21803x.computeCurrentVelocity(1000);
            float xVelocity = this.f21803x.getXVelocity();
            if (Math.abs(xVelocity) <= this.f21804y) {
                targetCheckedState = getTargetCheckedState();
            } else if (!c0.b(this) ? xVelocity <= 0.0f : xVelocity >= 0.0f) {
                targetCheckedState = false;
            }
        } else {
            targetCheckedState = zIsChecked;
        }
        if (targetCheckedState != zIsChecked) {
            playSoundEffect(0);
        }
        setChecked(targetCheckedState);
        e(motionEvent);
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        getEmojiTextViewHelper().d(z10);
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z10) {
        super.setChecked(z10);
        boolean zIsChecked = isChecked();
        if (zIsChecked) {
            l();
        } else {
            k();
        }
        if (getWindowToken() != null && isLaidOut()) {
            a(zIsChecked);
        } else {
            d();
            setThumbPosition(zIsChecked ? 1.0f : 0.0f);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(i.q(this, callback));
    }

    public void setEmojiCompatEnabled(boolean z10) {
        getEmojiTextViewHelper().e(z10);
        setTextOnInternal(this.f21794o);
        setTextOffInternal(this.f21796q);
        requestLayout();
    }

    public final void setEnforceSwitchWidth(boolean z10) {
        this.f21769H = z10;
        invalidate();
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setShowText(boolean z10) {
        if (this.f21798s != z10) {
            this.f21798s = z10;
            requestLayout();
            if (z10) {
                p();
            }
        }
    }

    public void setSplitTrack(boolean z10) {
        this.f21793n = z10;
        invalidate();
    }

    public void setSwitchMinWidth(int i10) {
        this.f21791l = i10;
        requestLayout();
    }

    public void setSwitchPadding(int i10) {
        this.f21792m = i10;
        requestLayout();
    }

    public void setSwitchTypeface(Typeface typeface) {
        if ((this.f21770I.getTypeface() == null || this.f21770I.getTypeface().equals(typeface)) && (this.f21770I.getTypeface() != null || typeface == null)) {
            return;
        }
        this.f21770I.setTypeface(typeface);
        requestLayout();
        invalidate();
    }

    public void setTextOff(CharSequence charSequence) {
        setTextOffInternal(charSequence);
        requestLayout();
        if (isChecked()) {
            return;
        }
        k();
    }

    public void setTextOn(CharSequence charSequence) {
        setTextOnInternal(charSequence);
        requestLayout();
        if (isChecked()) {
            l();
        }
    }

    public void setThumbDrawable(Drawable drawable) {
        Drawable drawable2 = this.f21779a;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f21779a = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setThumbPosition(float f10) {
        this.f21805z = f10;
        invalidate();
    }

    public void setThumbResource(int i10) {
        setThumbDrawable(AbstractC4666a.b(getContext(), i10));
    }

    public void setThumbTextPadding(int i10) {
        this.f21789k = i10;
        requestLayout();
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        this.f21780b = colorStateList;
        this.f21782d = true;
        b();
    }

    public void setThumbTintMode(PorterDuff.Mode mode) {
        this.f21781c = mode;
        this.f21783e = true;
        b();
    }

    public void setTrackDrawable(Drawable drawable) {
        Drawable drawable2 = this.f21784f;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f21784f = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setTrackResource(int i10) {
        setTrackDrawable(AbstractC4666a.b(getContext(), i10));
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        this.f21785g = colorStateList;
        this.f21787i = true;
        c();
    }

    public void setTrackTintMode(PorterDuff.Mode mode) {
        this.f21786h = mode;
        this.f21788j = true;
        c();
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void toggle() {
        setChecked(!isChecked());
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f21779a || drawable == this.f21784f;
    }

    public SwitchCompat(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f21780b = null;
        this.f21781c = null;
        this.f21782d = false;
        this.f21783e = false;
        this.f21785g = null;
        this.f21786h = null;
        this.f21787i = false;
        this.f21788j = false;
        this.f21803x = VelocityTracker.obtain();
        this.f21769H = true;
        this.f21790k0 = new Rect();
        S.a(this, getContext());
        TextPaint textPaint = new TextPaint(1);
        this.f21770I = textPaint;
        textPaint.density = getResources().getDisplayMetrics().density;
        W wV = W.v(context, attributeSet, j.f36109m2, i10, 0);
        E.d0(this, context, j.f36109m2, attributeSet, wV.r(), i10, 0);
        Drawable drawableG = wV.g(j.f36124p2);
        this.f21779a = drawableG;
        if (drawableG != null) {
            drawableG.setCallback(this);
        }
        Drawable drawableG2 = wV.g(j.f36169y2);
        this.f21784f = drawableG2;
        if (drawableG2 != null) {
            drawableG2.setCallback(this);
        }
        setTextOnInternal(wV.p(j.f36114n2));
        setTextOffInternal(wV.p(j.f36119o2));
        this.f21798s = wV.a(j.f36129q2, true);
        this.f21789k = wV.f(j.f36154v2, 0);
        this.f21791l = wV.f(j.f36139s2, 0);
        this.f21792m = wV.f(j.f36144t2, 0);
        this.f21793n = wV.a(j.f36134r2, false);
        ColorStateList colorStateListC = wV.c(j.f36159w2);
        if (colorStateListC != null) {
            this.f21780b = colorStateListC;
            this.f21782d = true;
        }
        PorterDuff.Mode modeD = AbstractC5329H.d(wV.k(j.f36164x2, -1), null);
        if (this.f21781c != modeD) {
            this.f21781c = modeD;
            this.f21783e = true;
        }
        if (this.f21782d || this.f21783e) {
            b();
        }
        ColorStateList colorStateListC2 = wV.c(j.f36174z2);
        if (colorStateListC2 != null) {
            this.f21785g = colorStateListC2;
            this.f21787i = true;
        }
        PorterDuff.Mode modeD2 = AbstractC5329H.d(wV.k(j.f35944A2, -1), null);
        if (this.f21786h != modeD2) {
            this.f21786h = modeD2;
            this.f21788j = true;
        }
        if (this.f21787i || this.f21788j) {
            c();
        }
        int iN = wV.n(j.f36149u2, 0);
        if (iN != 0) {
            m(context, iN);
        }
        C5323B c5323b = new C5323B(this);
        this.f21776T = c5323b;
        c5323b.m(attributeSet, i10);
        wV.x();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f21800u = viewConfiguration.getScaledTouchSlop();
        this.f21804y = viewConfiguration.getScaledMinimumFlingVelocity();
        getEmojiTextViewHelper().c(attributeSet, i10);
        refreshDrawableState();
        setChecked(isChecked());
    }
}
