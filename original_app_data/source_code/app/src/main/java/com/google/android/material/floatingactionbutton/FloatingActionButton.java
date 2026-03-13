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
import java.util.List;
import m7.InterfaceC5025a;
import n7.o;
import s7.n;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class FloatingActionButton extends o implements InterfaceC5025a, n {

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class Behavior extends BaseBehavior<FloatingActionButton> {
        public Behavior() {
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        public /* bridge */ /* synthetic */ boolean E(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, Rect rect) {
            return super.E(coordinatorLayout, floatingActionButton, rect);
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        public /* bridge */ /* synthetic */ boolean H(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, View view) {
            return super.H(coordinatorLayout, floatingActionButton, view);
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        public /* bridge */ /* synthetic */ boolean I(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, int i10) {
            return super.I(coordinatorLayout, floatingActionButton, i10);
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.b
        public /* bridge */ /* synthetic */ void g(CoordinatorLayout.e eVar) {
            super.g(eVar);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class BaseBehavior<T extends FloatingActionButton> extends CoordinatorLayout.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f30762a;

        public BaseBehavior() {
            this.f30762a = true;
        }

        private static boolean F(View view) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.e) {
                return ((CoordinatorLayout.e) layoutParams).e() instanceof BottomSheetBehavior;
            }
            return false;
        }

        public boolean E(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, Rect rect) {
            throw null;
        }

        public final void G(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton) {
            throw null;
        }

        public boolean H(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, View view) {
            if (!F(view)) {
                return false;
            }
            K(view, floatingActionButton);
            return false;
        }

        public boolean I(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, int i10) {
            List listQ = coordinatorLayout.q(floatingActionButton);
            int size = listQ.size();
            for (int i11 = 0; i11 < size; i11++) {
                View view = (View) listQ.get(i11);
                if (F(view) && K(view, floatingActionButton)) {
                    break;
                }
            }
            coordinatorLayout.G(floatingActionButton, i10);
            G(coordinatorLayout, floatingActionButton);
            return true;
        }

        public final boolean J(View view, FloatingActionButton floatingActionButton) {
            throw null;
        }

        public final boolean K(View view, FloatingActionButton floatingActionButton) {
            if (J(view, floatingActionButton)) {
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
            return H(coordinatorLayout, null, view2);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
        public /* bridge */ /* synthetic */ boolean l(CoordinatorLayout coordinatorLayout, View view, int i10) {
            a.a(view);
            return I(coordinatorLayout, null, i10);
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.f26309r1);
            this.f30762a = typedArrayObtainStyledAttributes.getBoolean(j.f26316s1, true);
            typedArrayObtainStyledAttributes.recycle();
        }
    }
}
