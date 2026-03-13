package com.google.android.material.transformation;

import Y0.E;
import android.content.Context;
import android.support.v4.media.session.a;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.List;
import m7.InterfaceC5025a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public abstract class ExpandableBehavior extends CoordinatorLayout.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f31018a;

    public ExpandableBehavior() {
        this.f31018a = 0;
    }

    public InterfaceC5025a E(CoordinatorLayout coordinatorLayout, View view) {
        List listQ = coordinatorLayout.q(view);
        int size = listQ.size();
        for (int i10 = 0; i10 < size; i10++) {
            View view2 = (View) listQ.get(i10);
            if (e(coordinatorLayout, view, view2)) {
                a.a(view2);
                return null;
            }
        }
        return null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public abstract boolean e(CoordinatorLayout coordinatorLayout, View view, View view2);

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
        a.a(view2);
        throw null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public boolean l(CoordinatorLayout coordinatorLayout, View view, int i10) {
        if (E.L(view)) {
            return false;
        }
        E(coordinatorLayout, view);
        return false;
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f31018a = 0;
    }
}
