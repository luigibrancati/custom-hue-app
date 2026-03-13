package com.google.android.material.floatingactionbutton;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.support.v4.media.session.a;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import c7.j;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.button.MaterialButton;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class ExtendedFloatingActionButton extends MaterialButton {

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class ExtendedFloatingActionButtonBehavior<T extends ExtendedFloatingActionButton> extends CoordinatorLayout.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f30760a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f30761b;

        public ExtendedFloatingActionButtonBehavior() {
            this.f30760a = false;
            this.f30761b = true;
        }

        public static boolean F(View view) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.e) {
                return ((CoordinatorLayout.e) layoutParams).e() instanceof BottomSheetBehavior;
            }
            return false;
        }

        public boolean E(CoordinatorLayout coordinatorLayout, ExtendedFloatingActionButton extendedFloatingActionButton, Rect rect) {
            return super.b(coordinatorLayout, extendedFloatingActionButton, rect);
        }

        public boolean G(CoordinatorLayout coordinatorLayout, ExtendedFloatingActionButton extendedFloatingActionButton, View view) {
            if (!F(view)) {
                return false;
            }
            J(view, extendedFloatingActionButton);
            return false;
        }

        public boolean H(CoordinatorLayout coordinatorLayout, ExtendedFloatingActionButton extendedFloatingActionButton, int i10) {
            List listQ = coordinatorLayout.q(extendedFloatingActionButton);
            int size = listQ.size();
            for (int i11 = 0; i11 < size; i11++) {
                View view = (View) listQ.get(i11);
                if (F(view) && J(view, extendedFloatingActionButton)) {
                    break;
                }
            }
            coordinatorLayout.G(extendedFloatingActionButton, i10);
            return true;
        }

        public final boolean I(View view, ExtendedFloatingActionButton extendedFloatingActionButton) {
            throw null;
        }

        public final boolean J(View view, ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (I(view, extendedFloatingActionButton)) {
                throw null;
            }
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
        public /* bridge */ /* synthetic */ boolean b(CoordinatorLayout coordinatorLayout, View view, Rect rect) {
            a.a(view);
            return E(coordinatorLayout, null, rect);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
        public void g(CoordinatorLayout.e eVar) {
            if (eVar.f22434h == 0) {
                eVar.f22434h = 80;
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
        public /* bridge */ /* synthetic */ boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
            a.a(view);
            return G(coordinatorLayout, null, view2);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
        public /* bridge */ /* synthetic */ boolean l(CoordinatorLayout coordinatorLayout, View view, int i10) {
            a.a(view);
            return H(coordinatorLayout, null, i10);
        }

        public ExtendedFloatingActionButtonBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.f26279n1);
            this.f30760a = typedArrayObtainStyledAttributes.getBoolean(j.f26287o1, false);
            this.f30761b = typedArrayObtainStyledAttributes.getBoolean(j.f26295p1, true);
            typedArrayObtainStyledAttributes.recycle();
        }
    }
}
