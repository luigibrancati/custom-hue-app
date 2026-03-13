package com.google.android.material.snackbar;

import Y0.E;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import c7.c;
import c7.e;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class SnackbarContentLayout extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public TextView f30793a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Button f30794b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f30795c;

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public static void a(View view, int i10, int i11) {
        if (E.N(view)) {
            E.r0(view, E.A(view), i10, E.z(view), i11);
        } else {
            view.setPadding(view.getPaddingLeft(), i10, view.getPaddingRight(), i11);
        }
    }

    public final boolean b(int i10, int i11, int i12) {
        boolean z10;
        if (i10 != getOrientation()) {
            setOrientation(i10);
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f30793a.getPaddingTop() == i11 && this.f30793a.getPaddingBottom() == i12) {
            return z10;
        }
        a(this.f30793a, i11, i12);
        return true;
    }

    public Button getActionView() {
        return this.f30794b;
    }

    public TextView getMessageView() {
        return this.f30793a;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f30793a = (TextView) findViewById(e.f25907F);
        this.f30794b = (Button) findViewById(e.f25906E);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (getOrientation() == 1) {
            return;
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(c.f25872d);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(c.f25871c);
        boolean z10 = this.f30793a.getLayout().getLineCount() > 1;
        if (!z10 || this.f30795c <= 0 || this.f30794b.getMeasuredWidth() <= this.f30795c) {
            if (!z10) {
                dimensionPixelSize = dimensionPixelSize2;
            }
            if (!b(0, dimensionPixelSize, dimensionPixelSize)) {
                return;
            }
        } else if (!b(1, dimensionPixelSize, dimensionPixelSize - dimensionPixelSize2)) {
            return;
        }
        super.onMeasure(i10, i11);
    }

    public void setMaxInlineActionWidth(int i10) {
        this.f30795c = i10;
    }
}
