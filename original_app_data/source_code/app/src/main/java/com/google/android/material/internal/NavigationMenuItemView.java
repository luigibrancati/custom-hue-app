package com.google.android.material.internal;

import N0.f;
import Y0.C2547a;
import Y0.E;
import Z0.h;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.b;
import c1.i;
import c7.c;
import c7.d;
import c7.e;
import com.google.android.libraries.barhopper.RecognitionOptions;
import h.AbstractC4262a;
import n7.AbstractC5143f;
import p.a0;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class NavigationMenuItemView extends AbstractC5143f implements j.a {

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public static final int[] f30770F = {R.attr.state_checked};

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public g f30771A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public ColorStateList f30772B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public boolean f30773C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public Drawable f30774D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final C2547a f30775E;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f30776v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f30777w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f30778x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final CheckedTextView f30779y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public FrameLayout f30780z;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a extends C2547a {
        public a() {
        }

        @Override // Y0.C2547a
        public void g(View view, h hVar) {
            super.g(view, hVar);
            hVar.g0(NavigationMenuItemView.this.f30778x);
        }
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.f30780z == null) {
                this.f30780z = (FrameLayout) ((ViewStub) findViewById(e.f25918d)).inflate();
            }
            this.f30780z.removeAllViews();
            this.f30780z.addView(view);
        }
    }

    public final StateListDrawable A() {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(AbstractC4262a.f35811t, typedValue, true)) {
            return null;
        }
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(f30770F, new ColorDrawable(typedValue.data));
        stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
        return stateListDrawable;
    }

    public final boolean B() {
        return this.f30771A.getTitle() == null && this.f30771A.getIcon() == null && this.f30771A.getActionView() != null;
    }

    @Override // androidx.appcompat.view.menu.j.a
    public void c(g gVar, int i10) {
        this.f30771A = gVar;
        if (gVar.getItemId() > 0) {
            setId(gVar.getItemId());
        }
        setVisibility(gVar.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            E.j0(this, A());
        }
        setCheckable(gVar.isCheckable());
        setChecked(gVar.isChecked());
        setEnabled(gVar.isEnabled());
        setTitle(gVar.getTitle());
        setIcon(gVar.getIcon());
        setActionView(gVar.getActionView());
        setContentDescription(gVar.getContentDescription());
        a0.a(this, gVar.getTooltipText());
        z();
    }

    @Override // androidx.appcompat.view.menu.j.a
    public boolean d() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j.a
    public g getItemData() {
        return this.f30771A;
    }

    @Override // android.view.ViewGroup, android.view.View
    public int[] onCreateDrawableState(int i10) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i10 + 1);
        g gVar = this.f30771A;
        if (gVar != null && gVar.isCheckable() && this.f30771A.isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f30770F);
        }
        return iArrOnCreateDrawableState;
    }

    public void setCheckable(boolean z10) {
        refreshDrawableState();
        if (this.f30778x != z10) {
            this.f30778x = z10;
            this.f30775E.l(this.f30779y, RecognitionOptions.PDF417);
        }
    }

    public void setChecked(boolean z10) {
        refreshDrawableState();
        this.f30779y.setChecked(z10);
    }

    public void setHorizontalPadding(int i10) {
        setPadding(i10, getPaddingTop(), i10, getPaddingBottom());
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.f30773C) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = P0.a.l(drawable).mutate();
                P0.a.i(drawable, this.f30772B);
            }
            int i10 = this.f30776v;
            drawable.setBounds(0, 0, i10, i10);
        } else if (this.f30777w) {
            if (this.f30774D == null) {
                Drawable drawableE = f.e(getResources(), d.f25901g, getContext().getTheme());
                this.f30774D = drawableE;
                if (drawableE != null) {
                    int i11 = this.f30776v;
                    drawableE.setBounds(0, 0, i11, i11);
                }
            }
            drawable = this.f30774D;
        }
        i.h(this.f30779y, drawable, null, null, null);
    }

    public void setIconPadding(int i10) {
        this.f30779y.setCompoundDrawablePadding(i10);
    }

    public void setIconSize(int i10) {
        this.f30776v = i10;
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.f30772B = colorStateList;
        this.f30773C = colorStateList != null;
        g gVar = this.f30771A;
        if (gVar != null) {
            setIcon(gVar.getIcon());
        }
    }

    public void setMaxLines(int i10) {
        this.f30779y.setMaxLines(i10);
    }

    public void setNeedsEmptyIcon(boolean z10) {
        this.f30777w = z10;
    }

    public void setTextAppearance(int i10) {
        i.n(this.f30779y, i10);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.f30779y.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.f30779y.setText(charSequence);
    }

    public final void z() {
        if (B()) {
            this.f30779y.setVisibility(8);
            FrameLayout frameLayout = this.f30780z;
            if (frameLayout != null) {
                b.a aVar = (b.a) frameLayout.getLayoutParams();
                ((LinearLayout.LayoutParams) aVar).width = -1;
                this.f30780z.setLayoutParams(aVar);
                return;
            }
            return;
        }
        this.f30779y.setVisibility(0);
        FrameLayout frameLayout2 = this.f30780z;
        if (frameLayout2 != null) {
            b.a aVar2 = (b.a) frameLayout2.getLayoutParams();
            ((LinearLayout.LayoutParams) aVar2).width = -2;
            this.f30780z.setLayoutParams(aVar2);
        }
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        a aVar = new a();
        this.f30775E = aVar;
        setOrientation(0);
        LayoutInflater.from(context).inflate(c7.g.f25942a, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(c.f25870b));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(e.f25919e);
        this.f30779y = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        E.f0(checkedTextView, aVar);
    }
}
