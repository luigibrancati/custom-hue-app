package com.google.android.material.bottomappbar;

import Y0.E;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import c7.i;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class BottomAppBar extends Toolbar {

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public static final int f30414m0 = i.f25981f;

    public static /* synthetic */ void R(BottomAppBar bottomAppBar) {
        throw null;
    }

    public static /* synthetic */ View S(BottomAppBar bottomAppBar) {
        throw null;
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class Behavior extends HideBottomViewOnScrollBehavior<BottomAppBar> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Rect f30415e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public WeakReference f30416f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f30417g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final View.OnLayoutChangeListener f30418h;

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public class a implements View.OnLayoutChangeListener {
            public a() {
            }

            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                android.support.v4.media.session.a.a(Behavior.this.f30416f.get());
                view.removeOnLayoutChangeListener(this);
            }
        }

        public Behavior() {
            this.f30418h = new a();
            this.f30415e = new Rect();
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.b
        public /* bridge */ /* synthetic */ boolean A(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i10, int i11) {
            android.support.v4.media.session.a.a(view);
            return O(coordinatorLayout, null, view2, view3, i10, i11);
        }

        public boolean N(CoordinatorLayout coordinatorLayout, BottomAppBar bottomAppBar, int i10) {
            this.f30416f = new WeakReference(bottomAppBar);
            View viewS = BottomAppBar.S(bottomAppBar);
            if (viewS != null && !E.L(viewS)) {
                CoordinatorLayout.e eVar = (CoordinatorLayout.e) viewS.getLayoutParams();
                eVar.f22430d = 49;
                this.f30417g = ((ViewGroup.MarginLayoutParams) eVar).bottomMargin;
                BottomAppBar.R(bottomAppBar);
            }
            coordinatorLayout.G(bottomAppBar, i10);
            return super.l(coordinatorLayout, bottomAppBar, i10);
        }

        public boolean O(CoordinatorLayout coordinatorLayout, BottomAppBar bottomAppBar, View view, View view2, int i10, int i11) {
            throw null;
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.b
        public /* bridge */ /* synthetic */ boolean l(CoordinatorLayout coordinatorLayout, View view, int i10) {
            android.support.v4.media.session.a.a(view);
            return N(coordinatorLayout, null, i10);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f30418h = new a();
            this.f30415e = new Rect();
        }
    }
}
