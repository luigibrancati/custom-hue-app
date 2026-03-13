package com.google.android.material.transformation;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Rect f31019b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RectF f31020c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final RectF f31021d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int[] f31022e;

    public FabTransformationBehavior() {
        this.f31019b = new Rect();
        this.f31020c = new RectF();
        this.f31021d = new RectF();
        this.f31022e = new int[2];
    }

    @Override // com.google.android.material.transformation.ExpandableBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public boolean e(CoordinatorLayout coordinatorLayout, View view, View view2) {
        if (view.getVisibility() != 8) {
            return false;
        }
        throw new IllegalStateException("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public void g(CoordinatorLayout.e eVar) {
        if (eVar.f22434h == 0) {
            eVar.f22434h = 80;
        }
    }

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f31019b = new Rect();
        this.f31020c = new RectF();
        this.f31021d = new RectF();
        this.f31022e = new int[2];
    }
}
