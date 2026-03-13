package com.google.android.material.chip;

import Y0.E;
import Z0.h;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import android.widget.TextView;
import c7.AbstractC3079a;
import c7.i;
import c7.j;
import com.google.android.material.chip.a;
import d7.C3836c;
import e1.AbstractC3923a;
import java.util.List;
import n7.InterfaceC5145h;
import n7.l;
import p.C5344f;
import p7.AbstractC5405f;
import p7.C5403d;
import q7.AbstractC5503b;
import s7.k;
import s7.n;
import u7.AbstractC5981a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class Chip extends C5344f implements a.InterfaceC0359a, n, InterfaceC5145h {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public com.google.android.material.chip.a f30537e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public InsetDrawable f30538f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public RippleDrawable f30539g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public View.OnClickListener f30540h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public CompoundButton.OnCheckedChangeListener f30541i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public InterfaceC5145h.a f30542j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f30543k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f30544l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f30545m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f30546n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f30547o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f30548p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f30549q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public CharSequence f30550r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final d f30551s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f30552t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Rect f30553u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final RectF f30554v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final AbstractC5405f f30555w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int f30534x = i.f25984i;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final Rect f30535y = new Rect();

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int[] f30536z = {R.attr.state_selected};

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final int[] f30533A = {R.attr.state_checkable};

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class b implements CompoundButton.OnCheckedChangeListener {
        public b() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
            if (Chip.this.f30542j != null) {
                Chip.this.f30542j.a(Chip.this, z10);
            }
            if (Chip.this.f30541i != null) {
                Chip.this.f30541i.onCheckedChanged(compoundButton, z10);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class c extends ViewOutlineProvider {
        public c() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            if (Chip.this.f30537e != null) {
                Chip.this.f30537e.getOutline(outline);
            } else {
                outline.setAlpha(0.0f);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class d extends AbstractC3923a {
        public d(Chip chip) {
            super(chip);
        }

        @Override // e1.AbstractC3923a
        public int B(float f10, float f11) {
            return (Chip.this.o() && Chip.this.getCloseIconTouchBounds().contains(f10, f11)) ? 1 : 0;
        }

        @Override // e1.AbstractC3923a
        public void C(List list) {
            list.add(0);
            if (Chip.this.o() && Chip.this.t() && Chip.this.f30540h != null) {
                list.add(1);
            }
        }

        @Override // e1.AbstractC3923a
        public boolean J(int i10, int i11, Bundle bundle) {
            if (i11 != 16) {
                return false;
            }
            if (i10 == 0) {
                return Chip.this.performClick();
            }
            if (i10 == 1) {
                return Chip.this.u();
            }
            return false;
        }

        @Override // e1.AbstractC3923a
        public void M(h hVar) {
            hVar.g0(Chip.this.s());
            hVar.j0(Chip.this.isClickable());
            hVar.i0(Chip.this.getAccessibilityClassName());
            hVar.E0(Chip.this.getText());
        }

        @Override // e1.AbstractC3923a
        public void N(int i10, h hVar) {
            if (i10 != 1) {
                hVar.m0("");
                hVar.e0(Chip.f30535y);
                return;
            }
            CharSequence closeIconContentDescription = Chip.this.getCloseIconContentDescription();
            if (closeIconContentDescription != null) {
                hVar.m0(closeIconContentDescription);
            } else {
                CharSequence text = Chip.this.getText();
                hVar.m0(Chip.this.getContext().getString(c7.h.f25967h, TextUtils.isEmpty(text) ? "" : text).trim());
            }
            hVar.e0(Chip.this.getCloseIconTouchBoundsInt());
            hVar.b(h.a.f20118i);
            hVar.n0(Chip.this.isEnabled());
        }

        @Override // e1.AbstractC3923a
        public void O(int i10, boolean z10) {
            if (i10 == 1) {
                Chip.this.f30546n = z10;
                Chip.this.refreshDrawableState();
            }
        }
    }

    public Chip(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC3079a.f25826e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public RectF getCloseIconTouchBounds() {
        this.f30554v.setEmpty();
        if (o() && this.f30540h != null) {
            this.f30537e.T0(this.f30554v);
        }
        return this.f30554v;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        this.f30553u.set((int) closeIconTouchBounds.left, (int) closeIconTouchBounds.top, (int) closeIconTouchBounds.right, (int) closeIconTouchBounds.bottom);
        return this.f30553u;
    }

    private C5403d getTextAppearance() {
        com.google.android.material.chip.a aVar = this.f30537e;
        if (aVar != null) {
            return aVar.d1();
        }
        return null;
    }

    private void setCloseIconHovered(boolean z10) {
        if (this.f30545m != z10) {
            this.f30545m = z10;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z10) {
        if (this.f30544l != z10) {
            this.f30544l = z10;
            refreshDrawableState();
        }
    }

    public final void A() {
        this.f30539g = new RippleDrawable(AbstractC5503b.a(this.f30537e.a1()), getBackgroundDrawable(), null);
        this.f30537e.F2(false);
        E.j0(this, this.f30539g);
        B();
    }

    public final void B() {
        com.google.android.material.chip.a aVar;
        if (TextUtils.isEmpty(getText()) || (aVar = this.f30537e) == null) {
            return;
        }
        int iE0 = (int) (aVar.E0() + this.f30537e.e1() + this.f30537e.l0());
        int iJ0 = (int) (this.f30537e.J0() + this.f30537e.f1() + this.f30537e.h0());
        if (this.f30538f != null) {
            Rect rect = new Rect();
            this.f30538f.getPadding(rect);
            iJ0 += rect.left;
            iE0 += rect.right;
        }
        E.r0(this, iJ0, getPaddingTop(), iE0, getPaddingBottom());
    }

    public final void C() {
        TextPaint paint = getPaint();
        com.google.android.material.chip.a aVar = this.f30537e;
        if (aVar != null) {
            paint.drawableState = aVar.getState();
        }
        C5403d textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.n(getContext(), paint, this.f30555w);
        }
    }

    public final void D(AttributeSet attributeSet) {
        if (attributeSet == null) {
            return;
        }
        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "background") != null) {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        }
        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableLeft") != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        }
        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableStart") != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableEnd") != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableRight") != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        if (!attributeSet.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", "singleLine", true) || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "lines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "minLines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLines", 1) != 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        if (attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 8388627) != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        }
    }

    @Override // com.google.android.material.chip.a.InterfaceC0359a
    public void a() {
        m(this.f30549q);
        requestLayout();
        invalidateOutline();
    }

    @Override // android.view.View
    public boolean dispatchHoverEvent(MotionEvent motionEvent) {
        return !this.f30552t ? super.dispatchHoverEvent(motionEvent) : this.f30551s.v(motionEvent) || super.dispatchHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.f30552t) {
            return super.dispatchKeyEvent(keyEvent);
        }
        if (!this.f30551s.w(keyEvent) || this.f30551s.A() == Integer.MIN_VALUE) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    @Override // p.C5344f, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        com.google.android.material.chip.a aVar = this.f30537e;
        if ((aVar == null || !aVar.k1()) ? false : this.f30537e.g2(l())) {
            invalidate();
        }
    }

    @Override // android.widget.CheckBox, android.widget.CompoundButton, android.widget.Button, android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        if (!TextUtils.isEmpty(this.f30550r)) {
            return this.f30550r;
        }
        if (!s()) {
            return isClickable() ? "android.widget.Button" : "android.view.View";
        }
        ViewParent parent = getParent();
        return ((parent instanceof ChipGroup) && ((ChipGroup) parent).h()) ? "android.widget.RadioButton" : "android.widget.CompoundButton";
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.f30538f;
        return insetDrawable == null ? this.f30537e : insetDrawable;
    }

    public Drawable getCheckedIcon() {
        com.google.android.material.chip.a aVar = this.f30537e;
        if (aVar != null) {
            return aVar.A0();
        }
        return null;
    }

    public ColorStateList getCheckedIconTint() {
        com.google.android.material.chip.a aVar = this.f30537e;
        if (aVar != null) {
            return aVar.B0();
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        com.google.android.material.chip.a aVar = this.f30537e;
        if (aVar != null) {
            return aVar.C0();
        }
        return null;
    }

    public float getChipCornerRadius() {
        com.google.android.material.chip.a aVar = this.f30537e;
        if (aVar != null) {
            return Math.max(0.0f, aVar.D0());
        }
        return 0.0f;
    }

    public Drawable getChipDrawable() {
        return this.f30537e;
    }

    public float getChipEndPadding() {
        com.google.android.material.chip.a aVar = this.f30537e;
        if (aVar != null) {
            return aVar.E0();
        }
        return 0.0f;
    }

    public Drawable getChipIcon() {
        com.google.android.material.chip.a aVar = this.f30537e;
        if (aVar != null) {
            return aVar.F0();
        }
        return null;
    }

    public float getChipIconSize() {
        com.google.android.material.chip.a aVar = this.f30537e;
        if (aVar != null) {
            return aVar.G0();
        }
        return 0.0f;
    }

    public ColorStateList getChipIconTint() {
        com.google.android.material.chip.a aVar = this.f30537e;
        if (aVar != null) {
            return aVar.H0();
        }
        return null;
    }

    public float getChipMinHeight() {
        com.google.android.material.chip.a aVar = this.f30537e;
        if (aVar != null) {
            return aVar.I0();
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        com.google.android.material.chip.a aVar = this.f30537e;
        if (aVar != null) {
            return aVar.J0();
        }
        return 0.0f;
    }

    public ColorStateList getChipStrokeColor() {
        com.google.android.material.chip.a aVar = this.f30537e;
        if (aVar != null) {
            return aVar.K0();
        }
        return null;
    }

    public float getChipStrokeWidth() {
        com.google.android.material.chip.a aVar = this.f30537e;
        if (aVar != null) {
            return aVar.L0();
        }
        return 0.0f;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    public Drawable getCloseIcon() {
        com.google.android.material.chip.a aVar = this.f30537e;
        if (aVar != null) {
            return aVar.M0();
        }
        return null;
    }

    public CharSequence getCloseIconContentDescription() {
        com.google.android.material.chip.a aVar = this.f30537e;
        if (aVar != null) {
            return aVar.N0();
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        com.google.android.material.chip.a aVar = this.f30537e;
        if (aVar != null) {
            return aVar.O0();
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        com.google.android.material.chip.a aVar = this.f30537e;
        if (aVar != null) {
            return aVar.P0();
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        com.google.android.material.chip.a aVar = this.f30537e;
        if (aVar != null) {
            return aVar.Q0();
        }
        return 0.0f;
    }

    public ColorStateList getCloseIconTint() {
        com.google.android.material.chip.a aVar = this.f30537e;
        if (aVar != null) {
            return aVar.S0();
        }
        return null;
    }

    @Override // android.widget.TextView
    public TextUtils.TruncateAt getEllipsize() {
        com.google.android.material.chip.a aVar = this.f30537e;
        if (aVar != null) {
            return aVar.W0();
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public void getFocusedRect(Rect rect) {
        if (this.f30552t && (this.f30551s.A() == 1 || this.f30551s.x() == 1)) {
            rect.set(getCloseIconTouchBoundsInt());
        } else {
            super.getFocusedRect(rect);
        }
    }

    public C3836c getHideMotionSpec() {
        com.google.android.material.chip.a aVar = this.f30537e;
        if (aVar != null) {
            return aVar.X0();
        }
        return null;
    }

    public float getIconEndPadding() {
        com.google.android.material.chip.a aVar = this.f30537e;
        if (aVar != null) {
            return aVar.Y0();
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        com.google.android.material.chip.a aVar = this.f30537e;
        if (aVar != null) {
            return aVar.Z0();
        }
        return 0.0f;
    }

    public ColorStateList getRippleColor() {
        com.google.android.material.chip.a aVar = this.f30537e;
        if (aVar != null) {
            return aVar.a1();
        }
        return null;
    }

    public k getShapeAppearanceModel() {
        return this.f30537e.B();
    }

    public C3836c getShowMotionSpec() {
        com.google.android.material.chip.a aVar = this.f30537e;
        if (aVar != null) {
            return aVar.b1();
        }
        return null;
    }

    public float getTextEndPadding() {
        com.google.android.material.chip.a aVar = this.f30537e;
        if (aVar != null) {
            return aVar.e1();
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        com.google.android.material.chip.a aVar = this.f30537e;
        if (aVar != null) {
            return aVar.f1();
        }
        return 0.0f;
    }

    public final void k(com.google.android.material.chip.a aVar) {
        aVar.k2(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [boolean, int] */
    public final int[] l() {
        ?? IsEnabled = isEnabled();
        int i10 = IsEnabled;
        if (this.f30546n) {
            i10 = IsEnabled + 1;
        }
        int i11 = i10;
        if (this.f30545m) {
            i11 = i10 + 1;
        }
        int i12 = i11;
        if (this.f30544l) {
            i12 = i11 + 1;
        }
        int i13 = i12;
        if (isChecked()) {
            i13 = i12 + 1;
        }
        int[] iArr = new int[i13];
        int i14 = 0;
        if (isEnabled()) {
            iArr[0] = 16842910;
            i14 = 1;
        }
        if (this.f30546n) {
            iArr[i14] = 16842908;
            i14++;
        }
        if (this.f30545m) {
            iArr[i14] = 16843623;
            i14++;
        }
        if (this.f30544l) {
            iArr[i14] = 16842919;
            i14++;
        }
        if (isChecked()) {
            iArr[i14] = 16842913;
        }
        return iArr;
    }

    public boolean m(int i10) {
        this.f30549q = i10;
        if (!w()) {
            if (this.f30538f != null) {
                v();
            } else {
                z();
            }
            return false;
        }
        int iMax = Math.max(0, i10 - this.f30537e.getIntrinsicHeight());
        int iMax2 = Math.max(0, i10 - this.f30537e.getIntrinsicWidth());
        if (iMax2 <= 0 && iMax <= 0) {
            if (this.f30538f != null) {
                v();
            } else {
                z();
            }
            return false;
        }
        int i11 = iMax2 > 0 ? iMax2 / 2 : 0;
        int i12 = iMax > 0 ? iMax / 2 : 0;
        if (this.f30538f != null) {
            Rect rect = new Rect();
            this.f30538f.getPadding(rect);
            if (rect.top == i12 && rect.bottom == i12 && rect.left == i11 && rect.right == i11) {
                z();
                return true;
            }
        }
        if (getMinHeight() != i10) {
            setMinHeight(i10);
        }
        if (getMinWidth() != i10) {
            setMinWidth(i10);
        }
        r(i11, i12, i11, i12);
        z();
        return true;
    }

    public final void n() {
        if (getBackgroundDrawable() == this.f30538f && this.f30537e.getCallback() == null) {
            this.f30537e.setCallback(this.f30538f);
        }
    }

    public final boolean o() {
        com.google.android.material.chip.a aVar = this.f30537e;
        return (aVar == null || aVar.M0() == null) ? false : true;
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        s7.h.f(this, this.f30537e);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public int[] onCreateDrawableState(int i10) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i10 + 2);
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f30536z);
        }
        if (s()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f30533A);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.TextView, android.view.View
    public void onFocusChanged(boolean z10, int i10, Rect rect) {
        super.onFocusChanged(z10, i10, rect);
        if (this.f30552t) {
            this.f30551s.I(z10, i10, rect);
        }
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 7) {
            setCloseIconHovered(getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()));
        } else if (actionMasked == 10) {
            setCloseIconHovered(false);
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getAccessibilityClassName());
        accessibilityNodeInfo.setCheckable(s());
        accessibilityNodeInfo.setClickable(isClickable());
        if (getParent() instanceof ChipGroup) {
            ChipGroup chipGroup = (ChipGroup) getParent();
            h.I0(accessibilityNodeInfo).l0(h.g.a(chipGroup.b(this), 1, chipGroup.c() ? chipGroup.g(this) : -1, 1, false, isChecked()));
        }
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    public PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i10) {
        if (getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) && isEnabled()) {
            return PointerIcon.getSystemIcon(getContext(), 1002);
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public void onRtlPropertiesChanged(int i10) {
        super.onRtlPropertiesChanged(i10);
        if (this.f30548p != i10) {
            this.f30548p = i10;
            B();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001e, code lost:
    
        if (r0 != 3) goto L22;
     */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            int r0 = r6.getActionMasked()
            android.graphics.RectF r1 = r5.getCloseIconTouchBounds()
            float r2 = r6.getX()
            float r3 = r6.getY()
            boolean r1 = r1.contains(r2, r3)
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L3a
            if (r0 == r2) goto L2c
            r4 = 2
            if (r0 == r4) goto L21
            r1 = 3
            if (r0 == r1) goto L35
            goto L40
        L21:
            boolean r0 = r5.f30544l
            if (r0 == 0) goto L40
            if (r1 != 0) goto L2a
            r5.setCloseIconPressed(r3)
        L2a:
            r0 = r2
            goto L41
        L2c:
            boolean r0 = r5.f30544l
            if (r0 == 0) goto L35
            r5.u()
            r0 = r2
            goto L36
        L35:
            r0 = r3
        L36:
            r5.setCloseIconPressed(r3)
            goto L41
        L3a:
            if (r1 == 0) goto L40
            r5.setCloseIconPressed(r2)
            goto L2a
        L40:
            r0 = r3
        L41:
            if (r0 != 0) goto L4b
            boolean r5 = super.onTouchEvent(r6)
            if (r5 == 0) goto L4a
            goto L4b
        L4a:
            return r3
        L4b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void p(Context context, AttributeSet attributeSet, int i10) {
        TypedArray typedArrayH = l.h(context, attributeSet, j.f26131U, i10, f30534x, new int[0]);
        this.f30547o = typedArrayH.getBoolean(j.f25992A0, false);
        this.f30549q = (int) Math.ceil(typedArrayH.getDimension(j.f26286o0, (float) Math.ceil(n7.n.b(getContext(), 48))));
        typedArrayH.recycle();
    }

    public final void q() {
        setOutlineProvider(new c());
    }

    public final void r(int i10, int i11, int i12, int i13) {
        this.f30538f = new InsetDrawable((Drawable) this.f30537e, i10, i11, i12, i13);
    }

    public boolean s() {
        com.google.android.material.chip.a aVar = this.f30537e;
        return aVar != null && aVar.j1();
    }

    public void setAccessibilityClassName(CharSequence charSequence) {
        this.f30550r = charSequence;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f30539g) {
            super.setBackground(drawable);
        } else {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        Log.w("Chip", "Do not set the background color; Chip manages its own background drawable.");
    }

    @Override // p.C5344f, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f30539g) {
            super.setBackgroundDrawable(drawable);
        } else {
            Log.w("Chip", "Do not set the background drawable; Chip manages its own background drawable.");
        }
    }

    @Override // p.C5344f, android.view.View
    public void setBackgroundResource(int i10) {
        Log.w("Chip", "Do not set the background resource; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        Log.w("Chip", "Do not set the background tint list; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        Log.w("Chip", "Do not set the background tint mode; Chip manages its own background drawable.");
    }

    public void setCheckable(boolean z10) {
        com.google.android.material.chip.a aVar = this.f30537e;
        if (aVar != null) {
            aVar.s1(z10);
        }
    }

    public void setCheckableResource(int i10) {
        com.google.android.material.chip.a aVar = this.f30537e;
        if (aVar != null) {
            aVar.t1(i10);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z10) {
        com.google.android.material.chip.a aVar = this.f30537e;
        if (aVar == null) {
            this.f30543k = z10;
        } else if (aVar.j1()) {
            super.setChecked(z10);
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        com.google.android.material.chip.a aVar = this.f30537e;
        if (aVar != null) {
            aVar.u1(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z10) {
        setCheckedIconVisible(z10);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i10) {
        setCheckedIconVisible(i10);
    }

    public void setCheckedIconResource(int i10) {
        com.google.android.material.chip.a aVar = this.f30537e;
        if (aVar != null) {
            aVar.v1(i10);
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f30537e;
        if (aVar != null) {
            aVar.w1(colorStateList);
        }
    }

    public void setCheckedIconTintResource(int i10) {
        com.google.android.material.chip.a aVar = this.f30537e;
        if (aVar != null) {
            aVar.x1(i10);
        }
    }

    public void setCheckedIconVisible(int i10) {
        com.google.android.material.chip.a aVar = this.f30537e;
        if (aVar != null) {
            aVar.y1(i10);
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f30537e;
        if (aVar != null) {
            aVar.A1(colorStateList);
        }
    }

    public void setChipBackgroundColorResource(int i10) {
        com.google.android.material.chip.a aVar = this.f30537e;
        if (aVar != null) {
            aVar.B1(i10);
        }
    }

    @Deprecated
    public void setChipCornerRadius(float f10) {
        com.google.android.material.chip.a aVar = this.f30537e;
        if (aVar != null) {
            aVar.C1(f10);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i10) {
        com.google.android.material.chip.a aVar = this.f30537e;
        if (aVar != null) {
            aVar.D1(i10);
        }
    }

    public void setChipDrawable(com.google.android.material.chip.a aVar) {
        com.google.android.material.chip.a aVar2 = this.f30537e;
        if (aVar2 != aVar) {
            x(aVar2);
            this.f30537e = aVar;
            aVar.v2(false);
            k(this.f30537e);
            m(this.f30549q);
        }
    }

    public void setChipEndPadding(float f10) {
        com.google.android.material.chip.a aVar = this.f30537e;
        if (aVar != null) {
            aVar.E1(f10);
        }
    }

    public void setChipEndPaddingResource(int i10) {
        com.google.android.material.chip.a aVar = this.f30537e;
        if (aVar != null) {
            aVar.F1(i10);
        }
    }

    public void setChipIcon(Drawable drawable) {
        com.google.android.material.chip.a aVar = this.f30537e;
        if (aVar != null) {
            aVar.G1(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z10) {
        setChipIconVisible(z10);
    }

    @Deprecated
    public void setChipIconEnabledResource(int i10) {
        setChipIconVisible(i10);
    }

    public void setChipIconResource(int i10) {
        com.google.android.material.chip.a aVar = this.f30537e;
        if (aVar != null) {
            aVar.H1(i10);
        }
    }

    public void setChipIconSize(float f10) {
        com.google.android.material.chip.a aVar = this.f30537e;
        if (aVar != null) {
            aVar.I1(f10);
        }
    }

    public void setChipIconSizeResource(int i10) {
        com.google.android.material.chip.a aVar = this.f30537e;
        if (aVar != null) {
            aVar.J1(i10);
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f30537e;
        if (aVar != null) {
            aVar.K1(colorStateList);
        }
    }

    public void setChipIconTintResource(int i10) {
        com.google.android.material.chip.a aVar = this.f30537e;
        if (aVar != null) {
            aVar.L1(i10);
        }
    }

    public void setChipIconVisible(int i10) {
        com.google.android.material.chip.a aVar = this.f30537e;
        if (aVar != null) {
            aVar.M1(i10);
        }
    }

    public void setChipMinHeight(float f10) {
        com.google.android.material.chip.a aVar = this.f30537e;
        if (aVar != null) {
            aVar.O1(f10);
        }
    }

    public void setChipMinHeightResource(int i10) {
        com.google.android.material.chip.a aVar = this.f30537e;
        if (aVar != null) {
            aVar.P1(i10);
        }
    }

    public void setChipStartPadding(float f10) {
        com.google.android.material.chip.a aVar = this.f30537e;
        if (aVar != null) {
            aVar.Q1(f10);
        }
    }

    public void setChipStartPaddingResource(int i10) {
        com.google.android.material.chip.a aVar = this.f30537e;
        if (aVar != null) {
            aVar.R1(i10);
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f30537e;
        if (aVar != null) {
            aVar.S1(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i10) {
        com.google.android.material.chip.a aVar = this.f30537e;
        if (aVar != null) {
            aVar.T1(i10);
        }
    }

    public void setChipStrokeWidth(float f10) {
        com.google.android.material.chip.a aVar = this.f30537e;
        if (aVar != null) {
            aVar.U1(f10);
        }
    }

    public void setChipStrokeWidthResource(int i10) {
        com.google.android.material.chip.a aVar = this.f30537e;
        if (aVar != null) {
            aVar.V1(i10);
        }
    }

    @Deprecated
    public void setChipText(CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(int i10) {
        setText(getResources().getString(i10));
    }

    public void setCloseIcon(Drawable drawable) {
        com.google.android.material.chip.a aVar = this.f30537e;
        if (aVar != null) {
            aVar.X1(drawable);
        }
        y();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        com.google.android.material.chip.a aVar = this.f30537e;
        if (aVar != null) {
            aVar.Y1(charSequence);
        }
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z10) {
        setCloseIconVisible(z10);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i10) {
        setCloseIconVisible(i10);
    }

    public void setCloseIconEndPadding(float f10) {
        com.google.android.material.chip.a aVar = this.f30537e;
        if (aVar != null) {
            aVar.Z1(f10);
        }
    }

    public void setCloseIconEndPaddingResource(int i10) {
        com.google.android.material.chip.a aVar = this.f30537e;
        if (aVar != null) {
            aVar.a2(i10);
        }
    }

    public void setCloseIconResource(int i10) {
        com.google.android.material.chip.a aVar = this.f30537e;
        if (aVar != null) {
            aVar.b2(i10);
        }
        y();
    }

    public void setCloseIconSize(float f10) {
        com.google.android.material.chip.a aVar = this.f30537e;
        if (aVar != null) {
            aVar.c2(f10);
        }
    }

    public void setCloseIconSizeResource(int i10) {
        com.google.android.material.chip.a aVar = this.f30537e;
        if (aVar != null) {
            aVar.d2(i10);
        }
    }

    public void setCloseIconStartPadding(float f10) {
        com.google.android.material.chip.a aVar = this.f30537e;
        if (aVar != null) {
            aVar.e2(f10);
        }
    }

    public void setCloseIconStartPaddingResource(int i10) {
        com.google.android.material.chip.a aVar = this.f30537e;
        if (aVar != null) {
            aVar.f2(i10);
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f30537e;
        if (aVar != null) {
            aVar.h2(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i10) {
        com.google.android.material.chip.a aVar = this.f30537e;
        if (aVar != null) {
            aVar.i2(i10);
        }
    }

    public void setCloseIconVisible(int i10) {
        setCloseIconVisible(getResources().getBoolean(i10));
    }

    @Override // p.C5344f, android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
    }

    @Override // p.C5344f, android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        if (i10 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i12 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(i10, i11, i12, i13);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        if (i10 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i12 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesWithIntrinsicBounds(i10, i11, i12, i13);
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        com.google.android.material.chip.a aVar = this.f30537e;
        if (aVar != null) {
            aVar.T(f10);
        }
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.f30537e == null) {
            return;
        }
        if (truncateAt == TextUtils.TruncateAt.MARQUEE) {
            throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
        }
        super.setEllipsize(truncateAt);
        com.google.android.material.chip.a aVar = this.f30537e;
        if (aVar != null) {
            aVar.l2(truncateAt);
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z10) {
        this.f30547o = z10;
        m(this.f30549q);
    }

    @Override // android.widget.TextView
    public void setGravity(int i10) {
        if (i10 != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        } else {
            super.setGravity(i10);
        }
    }

    public void setHideMotionSpec(C3836c c3836c) {
        com.google.android.material.chip.a aVar = this.f30537e;
        if (aVar != null) {
            aVar.m2(c3836c);
        }
    }

    public void setHideMotionSpecResource(int i10) {
        com.google.android.material.chip.a aVar = this.f30537e;
        if (aVar != null) {
            aVar.n2(i10);
        }
    }

    public void setIconEndPadding(float f10) {
        com.google.android.material.chip.a aVar = this.f30537e;
        if (aVar != null) {
            aVar.o2(f10);
        }
    }

    public void setIconEndPaddingResource(int i10) {
        com.google.android.material.chip.a aVar = this.f30537e;
        if (aVar != null) {
            aVar.p2(i10);
        }
    }

    public void setIconStartPadding(float f10) {
        com.google.android.material.chip.a aVar = this.f30537e;
        if (aVar != null) {
            aVar.q2(f10);
        }
    }

    public void setIconStartPaddingResource(int i10) {
        com.google.android.material.chip.a aVar = this.f30537e;
        if (aVar != null) {
            aVar.r2(i10);
        }
    }

    @Override // n7.InterfaceC5145h
    public void setInternalOnCheckedChangeListener(InterfaceC5145h.a aVar) {
        this.f30542j = aVar;
    }

    @Override // android.view.View
    public void setLayoutDirection(int i10) {
        if (this.f30537e == null) {
            return;
        }
        super.setLayoutDirection(i10);
    }

    @Override // android.widget.TextView
    public void setLines(int i10) {
        if (i10 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setLines(i10);
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i10) {
        if (i10 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMaxLines(i10);
    }

    @Override // android.widget.TextView
    public void setMaxWidth(int i10) {
        super.setMaxWidth(i10);
        com.google.android.material.chip.a aVar = this.f30537e;
        if (aVar != null) {
            aVar.s2(i10);
        }
    }

    @Override // android.widget.TextView
    public void setMinLines(int i10) {
        if (i10 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMinLines(i10);
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f30541i = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.f30540h = onClickListener;
        y();
    }

    public void setRippleColor(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f30537e;
        if (aVar != null) {
            aVar.t2(colorStateList);
        }
        if (this.f30537e.h1()) {
            return;
        }
        A();
    }

    public void setRippleColorResource(int i10) {
        com.google.android.material.chip.a aVar = this.f30537e;
        if (aVar != null) {
            aVar.u2(i10);
            if (this.f30537e.h1()) {
                return;
            }
            A();
        }
    }

    @Override // s7.n
    public void setShapeAppearanceModel(k kVar) {
        this.f30537e.setShapeAppearanceModel(kVar);
    }

    public void setShowMotionSpec(C3836c c3836c) {
        com.google.android.material.chip.a aVar = this.f30537e;
        if (aVar != null) {
            aVar.w2(c3836c);
        }
    }

    public void setShowMotionSpecResource(int i10) {
        com.google.android.material.chip.a aVar = this.f30537e;
        if (aVar != null) {
            aVar.x2(i10);
        }
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean z10) {
        if (!z10) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setSingleLine(z10);
    }

    @Override // android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        com.google.android.material.chip.a aVar = this.f30537e;
        if (aVar == null) {
            return;
        }
        if (charSequence == null) {
            charSequence = "";
        }
        super.setText(aVar.G2() ? null : charSequence, bufferType);
        com.google.android.material.chip.a aVar2 = this.f30537e;
        if (aVar2 != null) {
            aVar2.y2(charSequence);
        }
    }

    public void setTextAppearance(C5403d c5403d) {
        com.google.android.material.chip.a aVar = this.f30537e;
        if (aVar != null) {
            aVar.z2(c5403d);
        }
        C();
    }

    public void setTextAppearanceResource(int i10) {
        setTextAppearance(getContext(), i10);
    }

    public void setTextEndPadding(float f10) {
        com.google.android.material.chip.a aVar = this.f30537e;
        if (aVar != null) {
            aVar.B2(f10);
        }
    }

    public void setTextEndPaddingResource(int i10) {
        com.google.android.material.chip.a aVar = this.f30537e;
        if (aVar != null) {
            aVar.C2(i10);
        }
    }

    public void setTextStartPadding(float f10) {
        com.google.android.material.chip.a aVar = this.f30537e;
        if (aVar != null) {
            aVar.D2(f10);
        }
    }

    public void setTextStartPaddingResource(int i10) {
        com.google.android.material.chip.a aVar = this.f30537e;
        if (aVar != null) {
            aVar.E2(i10);
        }
    }

    public boolean t() {
        com.google.android.material.chip.a aVar = this.f30537e;
        return aVar != null && aVar.l1();
    }

    public boolean u() {
        boolean z10 = false;
        playSoundEffect(0);
        View.OnClickListener onClickListener = this.f30540h;
        if (onClickListener != null) {
            onClickListener.onClick(this);
            z10 = true;
        }
        if (this.f30552t) {
            this.f30551s.U(1, 1);
        }
        return z10;
    }

    public final void v() {
        if (this.f30538f != null) {
            this.f30538f = null;
            setMinWidth(0);
            setMinHeight((int) getChipMinHeight());
            z();
        }
    }

    public boolean w() {
        return this.f30547o;
    }

    public final void x(com.google.android.material.chip.a aVar) {
        if (aVar != null) {
            aVar.k2(null);
        }
    }

    public final void y() {
        if (o() && t() && this.f30540h != null) {
            E.f0(this, this.f30551s);
            this.f30552t = true;
        } else {
            E.f0(this, null);
            this.f30552t = false;
        }
    }

    public final void z() {
        if (AbstractC5503b.f43288a) {
            A();
            return;
        }
        this.f30537e.F2(true);
        E.j0(this, getBackgroundDrawable());
        B();
        n();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Chip(Context context, AttributeSet attributeSet, int i10) {
        int i11 = f30534x;
        super(AbstractC5981a.c(context, attributeSet, i10, i11), attributeSet, i10);
        this.f30553u = new Rect();
        this.f30554v = new RectF();
        this.f30555w = new a();
        Context context2 = getContext();
        D(attributeSet);
        com.google.android.material.chip.a aVarQ0 = com.google.android.material.chip.a.q0(context2, attributeSet, i10, i11);
        p(context2, attributeSet, i10);
        setChipDrawable(aVarQ0);
        aVarQ0.T(E.s(this));
        TypedArray typedArrayH = l.h(context2, attributeSet, j.f26131U, i10, i11, new int[0]);
        boolean zHasValue = typedArrayH.hasValue(j.f26027F0);
        typedArrayH.recycle();
        this.f30551s = new d(this);
        y();
        if (!zHasValue) {
            q();
        }
        setChecked(this.f30543k);
        setText(aVarQ0.c1());
        setEllipsize(aVarQ0.W0());
        C();
        if (!this.f30537e.G2()) {
            setLines(1);
            setHorizontallyScrolling(true);
        }
        setGravity(8388627);
        B();
        if (w()) {
            setMinHeight(this.f30549q);
        }
        this.f30548p = E.w(this);
        super.setOnCheckedChangeListener(new b());
    }

    public void setCloseIconVisible(boolean z10) {
        com.google.android.material.chip.a aVar = this.f30537e;
        if (aVar != null) {
            aVar.j2(z10);
        }
        y();
    }

    public void setCheckedIconVisible(boolean z10) {
        com.google.android.material.chip.a aVar = this.f30537e;
        if (aVar != null) {
            aVar.z1(z10);
        }
    }

    public void setChipIconVisible(boolean z10) {
        com.google.android.material.chip.a aVar = this.f30537e;
        if (aVar != null) {
            aVar.N1(z10);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        com.google.android.material.chip.a aVar = this.f30537e;
        if (aVar != null) {
            aVar.A2(i10);
        }
        C();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int i10) {
        super.setTextAppearance(i10);
        com.google.android.material.chip.a aVar = this.f30537e;
        if (aVar != null) {
            aVar.A2(i10);
        }
        C();
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a extends AbstractC5405f {
        public a() {
        }

        @Override // p7.AbstractC5405f
        public void b(Typeface typeface, boolean z10) {
            Chip chip = Chip.this;
            chip.setText(chip.f30537e.G2() ? Chip.this.f30537e.c1() : Chip.this.getText());
            Chip.this.requestLayout();
            Chip.this.invalidate();
        }

        @Override // p7.AbstractC5405f
        public void a(int i10) {
        }
    }
}
