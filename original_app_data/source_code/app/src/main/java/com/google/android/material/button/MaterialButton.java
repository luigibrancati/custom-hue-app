package com.google.android.material.button;

import Y0.E;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import c7.AbstractC3079a;
import c7.i;
import c7.j;
import d1.AbstractC3806a;
import f7.C3997a;
import j.AbstractC4666a;
import java.util.Iterator;
import java.util.LinkedHashSet;
import n7.l;
import p.C5343e;
import p7.AbstractC5402c;
import s7.h;
import s7.k;
import s7.n;
import u7.AbstractC5981a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class MaterialButton extends C5343e implements Checkable, n {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int[] f30496q = {R.attr.state_checkable};

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int[] f30497r = {R.attr.state_checked};

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f30498s = i.f25982g;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C3997a f30499d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final LinkedHashSet f30500e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public a f30501f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public PorterDuff.Mode f30502g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ColorStateList f30503h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Drawable f30504i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f30505j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f30506k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f30507l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f30508m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f30509n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f30510o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f30511p;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface a {
        void a(MaterialButton materialButton, boolean z10);
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class b extends AbstractC3806a {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f30512c;

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public class a implements Parcelable.ClassLoaderCreator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public b createFromParcel(Parcel parcel) {
                return new b(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public b createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new b(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public b[] newArray(int i10) {
                return new b[i10];
            }
        }

        public b(Parcelable parcelable) {
            super(parcelable);
        }

        public final void b(Parcel parcel) {
            this.f30512c = parcel.readInt() == 1;
        }

        @Override // d1.AbstractC3806a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f30512c ? 1 : 0);
        }

        public b(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            if (classLoader == null) {
                getClass().getClassLoader();
            }
            b(parcel);
        }
    }

    public MaterialButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC3079a.f25838q);
    }

    private String getA11yClassName() {
        return (a() ? CompoundButton.class : Button.class).getName();
    }

    private Layout.Alignment getActualTextAlignment() {
        int textAlignment = getTextAlignment();
        return textAlignment != 1 ? (textAlignment == 6 || textAlignment == 3) ? Layout.Alignment.ALIGN_OPPOSITE : textAlignment != 4 ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER : getGravityTextAlignment();
    }

    private Layout.Alignment getGravityTextAlignment() {
        int gravity = getGravity() & 8388615;
        return gravity != 1 ? (gravity == 5 || gravity == 8388613) ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER;
    }

    private int getTextHeight() {
        TextPaint paint = getPaint();
        String string = getText().toString();
        if (getTransformationMethod() != null) {
            string = getTransformationMethod().getTransformation(string, this).toString();
        }
        Rect rect = new Rect();
        paint.getTextBounds(string, 0, string.length(), rect);
        return Math.min(rect.height(), getLayout().getHeight());
    }

    private int getTextWidth() {
        TextPaint paint = getPaint();
        String string = getText().toString();
        if (getTransformationMethod() != null) {
            string = getTransformationMethod().getTransformation(string, this).toString();
        }
        return Math.min((int) paint.measureText(string), getLayout().getEllipsizedWidth());
    }

    public boolean a() {
        C3997a c3997a = this.f30499d;
        return c3997a != null && c3997a.p();
    }

    public final boolean b() {
        int i10 = this.f30511p;
        return i10 == 3 || i10 == 4;
    }

    public final boolean c() {
        int i10 = this.f30511p;
        return i10 == 1 || i10 == 2;
    }

    public final boolean d() {
        int i10 = this.f30511p;
        return i10 == 16 || i10 == 32;
    }

    public final boolean e() {
        return E.w(this) == 1;
    }

    public final boolean f() {
        C3997a c3997a = this.f30499d;
        return (c3997a == null || c3997a.o()) ? false : true;
    }

    public final void g() {
        if (c()) {
            c1.i.h(this, this.f30504i, null, null, null);
        } else if (b()) {
            c1.i.h(this, null, null, this.f30504i, null);
        } else if (d()) {
            c1.i.h(this, null, this.f30504i, null, null);
        }
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (f()) {
            return this.f30499d.b();
        }
        return 0;
    }

    public Drawable getIcon() {
        return this.f30504i;
    }

    public int getIconGravity() {
        return this.f30511p;
    }

    public int getIconPadding() {
        return this.f30508m;
    }

    public int getIconSize() {
        return this.f30505j;
    }

    public ColorStateList getIconTint() {
        return this.f30503h;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f30502g;
    }

    public int getInsetBottom() {
        return this.f30499d.c();
    }

    public int getInsetTop() {
        return this.f30499d.d();
    }

    public ColorStateList getRippleColor() {
        if (f()) {
            return this.f30499d.h();
        }
        return null;
    }

    public k getShapeAppearanceModel() {
        if (f()) {
            return this.f30499d.i();
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (f()) {
            return this.f30499d.j();
        }
        return null;
    }

    public int getStrokeWidth() {
        if (f()) {
            return this.f30499d.k();
        }
        return 0;
    }

    @Override // p.C5343e
    public ColorStateList getSupportBackgroundTintList() {
        return f() ? this.f30499d.l() : super.getSupportBackgroundTintList();
    }

    @Override // p.C5343e
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return f() ? this.f30499d.m() : super.getSupportBackgroundTintMode();
    }

    public final void h(boolean z10) {
        Drawable drawable = this.f30504i;
        if (drawable != null) {
            Drawable drawableMutate = P0.a.l(drawable).mutate();
            this.f30504i = drawableMutate;
            P0.a.i(drawableMutate, this.f30503h);
            PorterDuff.Mode mode = this.f30502g;
            if (mode != null) {
                P0.a.j(this.f30504i, mode);
            }
            int intrinsicWidth = this.f30505j;
            if (intrinsicWidth == 0) {
                intrinsicWidth = this.f30504i.getIntrinsicWidth();
            }
            int intrinsicHeight = this.f30505j;
            if (intrinsicHeight == 0) {
                intrinsicHeight = this.f30504i.getIntrinsicHeight();
            }
            Drawable drawable2 = this.f30504i;
            int i10 = this.f30506k;
            int i11 = this.f30507l;
            drawable2.setBounds(i10, i11, intrinsicWidth + i10, intrinsicHeight + i11);
            this.f30504i.setVisible(true, z10);
        }
        if (z10) {
            g();
            return;
        }
        Drawable[] drawableArrA = c1.i.a(this);
        Drawable drawable3 = drawableArrA[0];
        Drawable drawable4 = drawableArrA[1];
        Drawable drawable5 = drawableArrA[2];
        if ((!c() || drawable3 == this.f30504i) && ((!b() || drawable5 == this.f30504i) && (!d() || drawable4 == this.f30504i))) {
            return;
        }
        g();
    }

    public final void i(int i10, int i11) {
        if (this.f30504i == null || getLayout() == null) {
            return;
        }
        if (!c() && !b()) {
            if (d()) {
                this.f30506k = 0;
                if (this.f30511p == 16) {
                    this.f30507l = 0;
                    h(false);
                    return;
                }
                int intrinsicHeight = this.f30505j;
                if (intrinsicHeight == 0) {
                    intrinsicHeight = this.f30504i.getIntrinsicHeight();
                }
                int textHeight = (((((i11 - getTextHeight()) - getPaddingTop()) - intrinsicHeight) - this.f30508m) - getPaddingBottom()) / 2;
                if (this.f30507l != textHeight) {
                    this.f30507l = textHeight;
                    h(false);
                    return;
                }
                return;
            }
            return;
        }
        this.f30507l = 0;
        Layout.Alignment actualTextAlignment = getActualTextAlignment();
        int i12 = this.f30511p;
        if (i12 == 1 || i12 == 3 || ((i12 == 2 && actualTextAlignment == Layout.Alignment.ALIGN_NORMAL) || (i12 == 4 && actualTextAlignment == Layout.Alignment.ALIGN_OPPOSITE))) {
            this.f30506k = 0;
            h(false);
            return;
        }
        int intrinsicWidth = this.f30505j;
        if (intrinsicWidth == 0) {
            intrinsicWidth = this.f30504i.getIntrinsicWidth();
        }
        int textWidth = ((((i10 - getTextWidth()) - E.z(this)) - intrinsicWidth) - this.f30508m) - E.A(this);
        if (actualTextAlignment == Layout.Alignment.ALIGN_CENTER) {
            textWidth /= 2;
        }
        if (e() != (this.f30511p == 4)) {
            textWidth = -textWidth;
        }
        if (this.f30506k != textWidth) {
            this.f30506k = textWidth;
            h(false);
        }
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f30509n;
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (f()) {
            h.f(this, this.f30499d.f());
        }
    }

    @Override // android.widget.TextView, android.view.View
    public int[] onCreateDrawableState(int i10) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i10 + 2);
        if (a()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f30496q);
        }
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f30497r);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // p.C5343e, android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(isChecked());
    }

    @Override // p.C5343e, android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        accessibilityNodeInfo.setCheckable(a());
        accessibilityNodeInfo.setChecked(isChecked());
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // p.C5343e, android.widget.TextView, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        i(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        b bVar = (b) parcelable;
        super.onRestoreInstanceState(bVar.a());
        setChecked(bVar.f30512c);
    }

    @Override // android.widget.TextView, android.view.View
    public Parcelable onSaveInstanceState() {
        b bVar = new b(super.onSaveInstanceState());
        bVar.f30512c = this.f30509n;
        return bVar;
    }

    @Override // p.C5343e, android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
        i(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public boolean performClick() {
        toggle();
        return super.performClick();
    }

    @Override // android.view.View
    public void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.f30504i != null) {
            if (this.f30504i.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        if (f()) {
            this.f30499d.r(i10);
        } else {
            super.setBackgroundColor(i10);
        }
    }

    @Override // p.C5343e, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (!f()) {
            super.setBackgroundDrawable(drawable);
        } else {
            if (drawable == getBackground()) {
                getBackground().setState(drawable.getState());
                return;
            }
            Log.w("MaterialButton", "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
            this.f30499d.s();
            super.setBackgroundDrawable(drawable);
        }
    }

    @Override // p.C5343e, android.view.View
    public void setBackgroundResource(int i10) {
        setBackgroundDrawable(i10 != 0 ? AbstractC4666a.b(getContext(), i10) : null);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z10) {
        if (f()) {
            this.f30499d.t(z10);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z10) {
        if (a() && isEnabled() && this.f30509n != z10) {
            this.f30509n = z10;
            refreshDrawableState();
            if (getParent() instanceof MaterialButtonToggleGroup) {
                ((MaterialButtonToggleGroup) getParent()).m(this, this.f30509n);
            }
            if (this.f30510o) {
                return;
            }
            this.f30510o = true;
            Iterator it = this.f30500e.iterator();
            if (it.hasNext()) {
                android.support.v4.media.session.a.a(it.next());
                throw null;
            }
            this.f30510o = false;
        }
    }

    public void setCornerRadius(int i10) {
        if (f()) {
            this.f30499d.u(i10);
        }
    }

    public void setCornerRadiusResource(int i10) {
        if (f()) {
            setCornerRadius(getResources().getDimensionPixelSize(i10));
        }
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        if (f()) {
            this.f30499d.f().T(f10);
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.f30504i != drawable) {
            this.f30504i = drawable;
            h(true);
            i(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconGravity(int i10) {
        if (this.f30511p != i10) {
            this.f30511p = i10;
            i(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(int i10) {
        if (this.f30508m != i10) {
            this.f30508m = i10;
            setCompoundDrawablePadding(i10);
        }
    }

    public void setIconResource(int i10) {
        setIcon(i10 != 0 ? AbstractC4666a.b(getContext(), i10) : null);
    }

    public void setIconSize(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        }
        if (this.f30505j != i10) {
            this.f30505j = i10;
            h(true);
        }
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.f30503h != colorStateList) {
            this.f30503h = colorStateList;
            h(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.f30502g != mode) {
            this.f30502g = mode;
            h(false);
        }
    }

    public void setIconTintResource(int i10) {
        setIconTint(AbstractC4666a.a(getContext(), i10));
    }

    public void setInsetBottom(int i10) {
        this.f30499d.v(i10);
    }

    public void setInsetTop(int i10) {
        this.f30499d.w(i10);
    }

    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setOnPressedChangeListenerInternal(a aVar) {
        this.f30501f = aVar;
    }

    @Override // android.view.View
    public void setPressed(boolean z10) {
        a aVar = this.f30501f;
        if (aVar != null) {
            aVar.a(this, z10);
        }
        super.setPressed(z10);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (f()) {
            this.f30499d.x(colorStateList);
        }
    }

    public void setRippleColorResource(int i10) {
        if (f()) {
            setRippleColor(AbstractC4666a.a(getContext(), i10));
        }
    }

    @Override // s7.n
    public void setShapeAppearanceModel(k kVar) {
        if (!f()) {
            throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
        }
        this.f30499d.y(kVar);
    }

    public void setShouldDrawSurfaceColorStroke(boolean z10) {
        if (f()) {
            this.f30499d.z(z10);
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (f()) {
            this.f30499d.A(colorStateList);
        }
    }

    public void setStrokeColorResource(int i10) {
        if (f()) {
            setStrokeColor(AbstractC4666a.a(getContext(), i10));
        }
    }

    public void setStrokeWidth(int i10) {
        if (f()) {
            this.f30499d.B(i10);
        }
    }

    public void setStrokeWidthResource(int i10) {
        if (f()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i10));
        }
    }

    @Override // p.C5343e
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (f()) {
            this.f30499d.C(colorStateList);
        } else {
            super.setSupportBackgroundTintList(colorStateList);
        }
    }

    @Override // p.C5343e
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (f()) {
            this.f30499d.D(mode);
        } else {
            super.setSupportBackgroundTintMode(mode);
        }
    }

    @Override // android.view.View
    public void setTextAlignment(int i10) {
        super.setTextAlignment(i10);
        i(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!this.f30509n);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialButton(Context context, AttributeSet attributeSet, int i10) {
        int i11 = f30498s;
        super(AbstractC5981a.c(context, attributeSet, i10, i11), attributeSet, i10);
        this.f30500e = new LinkedHashSet();
        this.f30509n = false;
        this.f30510o = false;
        Context context2 = getContext();
        TypedArray typedArrayH = l.h(context2, attributeSet, j.f26161Y1, i10, i11, new int[0]);
        this.f30508m = typedArrayH.getDimensionPixelSize(j.f26264l2, 0);
        this.f30502g = n7.n.f(typedArrayH.getInt(j.f26288o2, -1), PorterDuff.Mode.SRC_IN);
        this.f30503h = AbstractC5402c.a(getContext(), typedArrayH, j.f26280n2);
        this.f30504i = AbstractC5402c.d(getContext(), typedArrayH, j.f26248j2);
        this.f30511p = typedArrayH.getInteger(j.f26256k2, 1);
        this.f30505j = typedArrayH.getDimensionPixelSize(j.f26272m2, 0);
        C3997a c3997a = new C3997a(this, k.e(context2, attributeSet, i10, i11).m());
        this.f30499d = c3997a;
        c3997a.q(typedArrayH);
        typedArrayH.recycle();
        setCompoundDrawablePadding(this.f30508m);
        h(this.f30504i != null);
    }
}
