package com.google.android.material.timepicker;

import Y0.E;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import c7.e;
import c7.j;
import s7.g;
import s7.i;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class b extends ConstraintLayout {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public g f31007A;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Runnable f31008y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f31009z;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.x();
        }
    }

    public b(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        LayoutInflater.from(context).inflate(c7.g.f25947f, this);
        E.j0(this, t());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.f26058J3, i10, 0);
        this.f31009z = typedArrayObtainStyledAttributes.getDimensionPixelSize(j.f26065K3, 0);
        this.f31008y = new a();
        typedArrayObtainStyledAttributes.recycle();
    }

    public static boolean w(View view) {
        return "skip".equals(view.getTag());
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i10, layoutParams);
        if (view.getId() == -1) {
            view.setId(E.j());
        }
        y();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        x();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        y();
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        this.f31007A.U(ColorStateList.valueOf(i10));
    }

    public final Drawable t() {
        g gVar = new g();
        this.f31007A = gVar;
        gVar.S(new i(0.5f));
        this.f31007A.U(ColorStateList.valueOf(-1));
        return this.f31007A;
    }

    public int u() {
        return this.f31009z;
    }

    public void v(int i10) {
        this.f31009z = i10;
        x();
    }

    public void x() {
        int childCount = getChildCount();
        int i10 = 1;
        for (int i11 = 0; i11 < childCount; i11++) {
            if (w(getChildAt(i11))) {
                i10++;
            }
        }
        androidx.constraintlayout.widget.c cVar = new androidx.constraintlayout.widget.c();
        cVar.g(this);
        float f10 = 0.0f;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getId() != e.f25916b && !w(childAt)) {
                cVar.h(childAt.getId(), e.f25916b, this.f31009z, f10);
                f10 += 360.0f / (childCount - i10);
            }
        }
        cVar.c(this);
    }

    public final void y() {
        Handler handler = getHandler();
        if (handler != null) {
            handler.removeCallbacks(this.f31008y);
            handler.post(this.f31008y);
        }
    }
}
