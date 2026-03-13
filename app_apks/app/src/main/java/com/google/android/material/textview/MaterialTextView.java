package com.google.android.material.textview;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import c7.AbstractC3079a;
import c7.j;
import p.C5324C;
import p7.AbstractC5402c;
import p7.C5401b;
import u7.AbstractC5981a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class MaterialTextView extends C5324C {
    public MaterialTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    public static boolean t(Context context) {
        return C5401b.b(context, AbstractC3079a.f25845x, true);
    }

    public static int u(Resources.Theme theme, AttributeSet attributeSet, int i10, int i11) {
        TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, j.f26225g3, i10, i11);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(j.f26233h3, -1);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId;
    }

    public static int v(Context context, TypedArray typedArray, int... iArr) {
        int iC = -1;
        for (int i10 = 0; i10 < iArr.length && iC < 0; i10++) {
            iC = AbstractC5402c.c(context, typedArray, iArr[i10], -1);
        }
        return iC;
    }

    public static boolean w(Context context, Resources.Theme theme, AttributeSet attributeSet, int i10, int i11) {
        TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, j.f26225g3, i10, i11);
        int iV = v(context, typedArrayObtainStyledAttributes, j.f26241i3, j.f26249j3);
        typedArrayObtainStyledAttributes.recycle();
        return iV != -1;
    }

    public final void s(Resources.Theme theme, int i10) {
        TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(i10, j.f26193c3);
        int iV = v(getContext(), typedArrayObtainStyledAttributes, j.f26209e3, j.f26217f3);
        typedArrayObtainStyledAttributes.recycle();
        if (iV >= 0) {
            setLineHeight(iV);
        }
    }

    @Override // p.C5324C, android.widget.TextView
    public void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        if (t(context)) {
            s(context.getTheme(), i10);
        }
    }

    public MaterialTextView(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public MaterialTextView(Context context, AttributeSet attributeSet, int i10, int i11) {
        int iU;
        super(AbstractC5981a.c(context, attributeSet, i10, i11), attributeSet, i10);
        Context context2 = getContext();
        if (t(context2)) {
            Resources.Theme theme = context2.getTheme();
            if (w(context2, theme, attributeSet, i10, i11) || (iU = u(theme, attributeSet, i10, i11)) == -1) {
                return;
            }
            s(theme, iU);
        }
    }
}
