package com.google.android.material.appbar;

import P0.a;
import Y0.E;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import c7.AbstractC3079a;
import c7.i;
import c7.j;
import n7.l;
import n7.m;
import s7.g;
import s7.h;
import u7.AbstractC5981a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class MaterialToolbar extends Toolbar {

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static final int f30386r0 = i.f25990o;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static final ImageView.ScaleType[] f30387s0 = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public Integer f30388m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public boolean f30389n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public boolean f30390o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public ImageView.ScaleType f30391p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public Boolean f30392q0;

    public MaterialToolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC3079a.f25821A);
    }

    public final Pair R(TextView textView, TextView textView2) {
        int measuredWidth = getMeasuredWidth();
        int i10 = measuredWidth / 2;
        int paddingLeft = getPaddingLeft();
        int paddingRight = measuredWidth - getPaddingRight();
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8 && childAt != textView && childAt != textView2) {
                if (childAt.getRight() < i10 && childAt.getRight() > paddingLeft) {
                    paddingLeft = childAt.getRight();
                }
                if (childAt.getLeft() > i10 && childAt.getLeft() < paddingRight) {
                    paddingRight = childAt.getLeft();
                }
            }
        }
        return new Pair(Integer.valueOf(paddingLeft), Integer.valueOf(paddingRight));
    }

    public final void S(Context context) {
        Drawable background = getBackground();
        if (background == null || (background instanceof ColorDrawable)) {
            g gVar = new g();
            gVar.U(ColorStateList.valueOf(background != null ? ((ColorDrawable) background).getColor() : 0));
            gVar.K(context);
            gVar.T(E.s(this));
            E.j0(this, gVar);
        }
    }

    public final void T(View view, Pair pair) {
        int measuredWidth = getMeasuredWidth();
        int measuredWidth2 = view.getMeasuredWidth();
        int i10 = (measuredWidth / 2) - (measuredWidth2 / 2);
        int i11 = measuredWidth2 + i10;
        int iMax = Math.max(Math.max(((Integer) pair.first).intValue() - i10, 0), Math.max(i11 - ((Integer) pair.second).intValue(), 0));
        if (iMax > 0) {
            i10 += iMax;
            i11 -= iMax;
            view.measure(View.MeasureSpec.makeMeasureSpec(i11 - i10, 1073741824), view.getMeasuredHeightAndState());
        }
        view.layout(i10, view.getTop(), i11, view.getBottom());
    }

    public final void U() {
        if (this.f30389n0 || this.f30390o0) {
            TextView textViewE = m.e(this);
            TextView textViewC = m.c(this);
            if (textViewE == null && textViewC == null) {
                return;
            }
            Pair pairR = R(textViewE, textViewC);
            if (this.f30389n0 && textViewE != null) {
                T(textViewE, pairR);
            }
            if (!this.f30390o0 || textViewC == null) {
                return;
            }
            T(textViewC, pairR);
        }
    }

    public final Drawable V(Drawable drawable) {
        if (drawable == null || this.f30388m0 == null) {
            return drawable;
        }
        Drawable drawableL = a.l(drawable.mutate());
        a.h(drawableL, this.f30388m0.intValue());
        return drawableL;
    }

    public final void W() {
        ImageView imageViewB = m.b(this);
        if (imageViewB != null) {
            Boolean bool = this.f30392q0;
            if (bool != null) {
                imageViewB.setAdjustViewBounds(bool.booleanValue());
            }
            ImageView.ScaleType scaleType = this.f30391p0;
            if (scaleType != null) {
                imageViewB.setScaleType(scaleType);
            }
        }
    }

    public ImageView.ScaleType getLogoScaleType() {
        return this.f30391p0;
    }

    public Integer getNavigationIconTint() {
        return this.f30388m0;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        h.e(this);
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        U();
        W();
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        h.d(this, f10);
    }

    public void setLogoAdjustViewBounds(boolean z10) {
        Boolean bool = this.f30392q0;
        if (bool == null || bool.booleanValue() != z10) {
            this.f30392q0 = Boolean.valueOf(z10);
            requestLayout();
        }
    }

    public void setLogoScaleType(ImageView.ScaleType scaleType) {
        if (this.f30391p0 != scaleType) {
            this.f30391p0 = scaleType;
            requestLayout();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        super.setNavigationIcon(V(drawable));
    }

    public void setNavigationIconTint(int i10) {
        this.f30388m0 = Integer.valueOf(i10);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    public void setSubtitleCentered(boolean z10) {
        if (this.f30390o0 != z10) {
            this.f30390o0 = z10;
            requestLayout();
        }
    }

    public void setTitleCentered(boolean z10) {
        if (this.f30389n0 != z10) {
            this.f30389n0 = z10;
            requestLayout();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialToolbar(Context context, AttributeSet attributeSet, int i10) {
        int i11 = f30386r0;
        super(AbstractC5981a.c(context, attributeSet, i10, i11), attributeSet, i10);
        Context context2 = getContext();
        TypedArray typedArrayH = l.h(context2, attributeSet, j.f26265l3, i10, i11, new int[0]);
        if (typedArrayH.hasValue(j.f26289o3)) {
            setNavigationIconTint(typedArrayH.getColor(j.f26289o3, -1));
        }
        this.f30389n0 = typedArrayH.getBoolean(j.f26304q3, false);
        this.f30390o0 = typedArrayH.getBoolean(j.f26297p3, false);
        int i12 = typedArrayH.getInt(j.f26281n3, -1);
        if (i12 >= 0) {
            ImageView.ScaleType[] scaleTypeArr = f30387s0;
            if (i12 < scaleTypeArr.length) {
                this.f30391p0 = scaleTypeArr[i12];
            }
        }
        if (typedArrayH.hasValue(j.f26273m3)) {
            this.f30392q0 = Boolean.valueOf(typedArrayH.getBoolean(j.f26273m3, false));
        }
        typedArrayH.recycle();
        S(context2);
    }
}
