package com.google.android.material.behavior;

import Y0.E;
import Z0.h;
import Z0.k;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.ar.core.ImageMetadata;
import e1.C3925c;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class SwipeDismissBehavior<V extends View> extends CoordinatorLayout.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C3925c f30398a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f30399b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f30401d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f30400c = 0.0f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f30402e = 2;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f30403f = 0.5f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f30404g = 0.0f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f30405h = 0.5f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final C3925c.AbstractC0418c f30406i = new a();

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a extends C3925c.AbstractC0418c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f30407a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f30408b = -1;

        public a() {
        }

        @Override // e1.C3925c.AbstractC0418c
        public int a(View view, int i10, int i11) {
            int width;
            int width2;
            int width3;
            boolean z10 = E.w(view) == 1;
            int i12 = SwipeDismissBehavior.this.f30402e;
            if (i12 == 0) {
                if (z10) {
                    width = this.f30407a - view.getWidth();
                    width2 = this.f30407a;
                } else {
                    width = this.f30407a;
                    width3 = view.getWidth();
                    width2 = width3 + width;
                }
            } else if (i12 != 1) {
                width = this.f30407a - view.getWidth();
                width2 = this.f30407a + view.getWidth();
            } else if (z10) {
                width = this.f30407a;
                width3 = view.getWidth();
                width2 = width3 + width;
            } else {
                width = this.f30407a - view.getWidth();
                width2 = this.f30407a;
            }
            return SwipeDismissBehavior.G(width, i10, width2);
        }

        @Override // e1.C3925c.AbstractC0418c
        public int b(View view, int i10, int i11) {
            return view.getTop();
        }

        @Override // e1.C3925c.AbstractC0418c
        public int d(View view) {
            return view.getWidth();
        }

        @Override // e1.C3925c.AbstractC0418c
        public void i(View view, int i10) {
            this.f30408b = i10;
            this.f30407a = view.getLeft();
            ViewParent parent = view.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }

        @Override // e1.C3925c.AbstractC0418c
        public void j(int i10) {
            SwipeDismissBehavior.this.getClass();
        }

        @Override // e1.C3925c.AbstractC0418c
        public void k(View view, int i10, int i11, int i12, int i13) {
            float width = this.f30407a + (view.getWidth() * SwipeDismissBehavior.this.f30404g);
            float width2 = this.f30407a + (view.getWidth() * SwipeDismissBehavior.this.f30405h);
            float f10 = i10;
            if (f10 <= width) {
                view.setAlpha(1.0f);
            } else if (f10 >= width2) {
                view.setAlpha(0.0f);
            } else {
                view.setAlpha(SwipeDismissBehavior.F(0.0f, 1.0f - SwipeDismissBehavior.I(width, width2, f10), 1.0f));
            }
        }

        @Override // e1.C3925c.AbstractC0418c
        public void l(View view, float f10, float f11) {
            int i10;
            boolean z10;
            this.f30408b = -1;
            int width = view.getWidth();
            if (n(view, f10)) {
                int left = view.getLeft();
                int i11 = this.f30407a;
                i10 = left < i11 ? i11 - width : i11 + width;
                z10 = true;
            } else {
                i10 = this.f30407a;
                z10 = false;
            }
            if (SwipeDismissBehavior.this.f30398a.F(i10, view.getTop())) {
                E.X(view, new c(view, z10));
            } else if (z10) {
                SwipeDismissBehavior.this.getClass();
            }
        }

        @Override // e1.C3925c.AbstractC0418c
        public boolean m(View view, int i10) {
            int i11 = this.f30408b;
            return (i11 == -1 || i11 == i10) && SwipeDismissBehavior.this.E(view);
        }

        public final boolean n(View view, float f10) {
            if (f10 == 0.0f) {
                return Math.abs(view.getLeft() - this.f30407a) >= Math.round(((float) view.getWidth()) * SwipeDismissBehavior.this.f30403f);
            }
            boolean z10 = E.w(view) == 1;
            int i10 = SwipeDismissBehavior.this.f30402e;
            if (i10 == 2) {
                return true;
            }
            if (i10 == 0) {
                return z10 ? f10 < 0.0f : f10 > 0.0f;
            }
            if (i10 == 1) {
                if (z10) {
                    return f10 > 0.0f;
                }
                if (f10 < 0.0f) {
                    return true;
                }
            }
            return false;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class b implements k {
        public b() {
        }

        @Override // Z0.k
        public boolean a(View view, k.a aVar) {
            if (!SwipeDismissBehavior.this.E(view)) {
                return false;
            }
            boolean z10 = E.w(view) == 1;
            int i10 = SwipeDismissBehavior.this.f30402e;
            E.Q(view, (!(i10 == 0 && z10) && (i10 != 1 || z10)) ? view.getWidth() : -view.getWidth());
            view.setAlpha(0.0f);
            SwipeDismissBehavior.this.getClass();
            return true;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f30411a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f30412b;

        public c(View view, boolean z10) {
            this.f30411a = view;
            this.f30412b = z10;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3925c c3925c = SwipeDismissBehavior.this.f30398a;
            if (c3925c != null && c3925c.k(true)) {
                E.X(this.f30411a, this);
            } else if (this.f30412b) {
                SwipeDismissBehavior.this.getClass();
            }
        }
    }

    public static float F(float f10, float f11, float f12) {
        return Math.min(Math.max(f10, f11), f12);
    }

    public static int G(int i10, int i11, int i12) {
        return Math.min(Math.max(i10, i11), i12);
    }

    public static float I(float f10, float f11, float f12) {
        return (f12 - f10) / (f11 - f10);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public boolean D(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        C3925c c3925c = this.f30398a;
        if (c3925c == null) {
            return false;
        }
        c3925c.z(motionEvent);
        return true;
    }

    public boolean E(View view) {
        return true;
    }

    public final void H(ViewGroup viewGroup) {
        if (this.f30398a == null) {
            this.f30398a = this.f30401d ? C3925c.l(viewGroup, this.f30400c, this.f30406i) : C3925c.m(viewGroup, this.f30406i);
        }
    }

    public void J(float f10) {
        this.f30405h = F(0.0f, f10, 1.0f);
    }

    public void K(float f10) {
        this.f30404g = F(0.0f, f10, 1.0f);
    }

    public void L(int i10) {
        this.f30402e = i10;
    }

    public final void M(View view) {
        E.Z(view, ImageMetadata.SHADING_MODE);
        if (E(view)) {
            E.b0(view, h.a.f20134y, null, new b());
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public boolean k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean z10 = this.f30399b;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            z10 = coordinatorLayout.z(view, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.f30399b = z10;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f30399b = false;
        }
        if (!z10) {
            return false;
        }
        H(coordinatorLayout);
        return this.f30398a.G(motionEvent);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public boolean l(CoordinatorLayout coordinatorLayout, View view, int i10) {
        boolean zL = super.l(coordinatorLayout, view, i10);
        if (E.u(view) == 0) {
            E.n0(view, 1);
            M(view);
        }
        return zL;
    }
}
