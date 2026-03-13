package com.google.android.material.bottomsheet;

import Y0.E;
import Z0.h;
import Z0.k;
import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import c7.AbstractC3079a;
import c7.i;
import c7.j;
import com.google.ar.core.ImageMetadata;
import d1.AbstractC3806a;
import e1.C3925c;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import n7.n;
import p7.AbstractC5402c;
import s7.k;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class BottomSheetBehavior<V extends View> extends CoordinatorLayout.b {

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final int f30420d0 = i.f25978c;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public ValueAnimator f30421A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public int f30422B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public int f30423C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public int f30424D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public float f30425E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public int f30426F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public float f30427G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public boolean f30428H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public boolean f30429I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public boolean f30430J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public int f30431K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public int f30432L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public C3925c f30433M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public boolean f30434N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public int f30435O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public boolean f30436P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public int f30437Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public int f30438R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public int f30439S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public WeakReference f30440T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public WeakReference f30441U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public final ArrayList f30442V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public VelocityTracker f30443W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public int f30444X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public int f30445Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public boolean f30446Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f30447a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public Map f30448a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f30449b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public int f30450b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f30451c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public final C3925c.AbstractC0418c f30452c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f30453d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f30454e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f30455f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f30456g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f30457h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public s7.g f30458i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ColorStateList f30459j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f30460k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f30461l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f30462m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f30463n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f30464o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f30465p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f30466q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f30467r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f30468s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f30469t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f30470u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f30471v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f30472w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public k f30473x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f30474y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final h f30475z;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ View f30476a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f30477b;

        public a(View view, int i10) {
            this.f30476a = view;
            this.f30477b = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            BottomSheetBehavior.this.J0(this.f30476a, this.f30477b, false);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class b implements ValueAnimator.AnimatorUpdateListener {
        public b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            if (BottomSheetBehavior.this.f30458i != null) {
                BottomSheetBehavior.this.f30458i.V(fFloatValue);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class c implements n.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f30480a;

        public c(boolean z10) {
            this.f30480a = z10;
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0080  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00a3  */
        @Override // n7.n.d
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public Y0.S a(android.view.View r11, Y0.S r12, n7.n.e r13) {
            /*
                Method dump skipped, instruction units count: 207
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.c.a(android.view.View, Y0.S, n7.n$e):Y0.S");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class d extends C3925c.AbstractC0418c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f30482a;

        public d() {
        }

        @Override // e1.C3925c.AbstractC0418c
        public int a(View view, int i10, int i11) {
            return view.getLeft();
        }

        @Override // e1.C3925c.AbstractC0418c
        public int b(View view, int i10, int i11) {
            int iF0 = BottomSheetBehavior.this.f0();
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return S0.a.c(i10, iF0, bottomSheetBehavior.f30428H ? bottomSheetBehavior.f30439S : bottomSheetBehavior.f30426F);
        }

        @Override // e1.C3925c.AbstractC0418c
        public int e(View view) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return bottomSheetBehavior.f30428H ? bottomSheetBehavior.f30439S : bottomSheetBehavior.f30426F;
        }

        @Override // e1.C3925c.AbstractC0418c
        public void j(int i10) {
            if (i10 == 1 && BottomSheetBehavior.this.f30430J) {
                BottomSheetBehavior.this.C0(1);
            }
        }

        @Override // e1.C3925c.AbstractC0418c
        public void k(View view, int i10, int i11, int i12, int i13) {
            BottomSheetBehavior.this.c0(i11);
        }

        /* JADX WARN: Removed duplicated region for block: B:39:0x00a7  */
        /* JADX WARN: Removed duplicated region for block: B:6:0x0010  */
        @Override // e1.C3925c.AbstractC0418c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void l(android.view.View r8, float r9, float r10) {
            /*
                Method dump skipped, instruction units count: 302
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.d.l(android.view.View, float, float):void");
        }

        @Override // e1.C3925c.AbstractC0418c
        public boolean m(View view, int i10) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            int i11 = bottomSheetBehavior.f30431K;
            if (i11 == 1 || bottomSheetBehavior.f30446Z) {
                return false;
            }
            if (i11 == 3 && bottomSheetBehavior.f30444X == i10) {
                WeakReference weakReference = bottomSheetBehavior.f30441U;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && view2.canScrollVertically(-1)) {
                    return false;
                }
            }
            this.f30482a = System.currentTimeMillis();
            WeakReference weakReference2 = BottomSheetBehavior.this.f30440T;
            return weakReference2 != null && weakReference2.get() == view;
        }

        public final boolean n(View view) {
            int top = view.getTop();
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return top > (bottomSheetBehavior.f30439S + bottomSheetBehavior.f0()) / 2;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class e implements Z0.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f30484a;

        public e(int i10) {
            this.f30484a = i10;
        }

        @Override // Z0.k
        public boolean a(View view, k.a aVar) {
            BottomSheetBehavior.this.B0(this.f30484a);
            return true;
        }
    }

    public BottomSheetBehavior() {
        this.f30447a = 0;
        this.f30449b = true;
        this.f30451c = false;
        this.f30460k = -1;
        this.f30461l = -1;
        this.f30475z = new h(this, null);
        this.f30425E = 0.5f;
        this.f30427G = -1.0f;
        this.f30430J = true;
        this.f30431K = 4;
        this.f30432L = 4;
        this.f30442V = new ArrayList();
        this.f30450b0 = -1;
        this.f30452c0 = new d();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public boolean A(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i10, int i11) {
        this.f30435O = 0;
        this.f30436P = false;
        return (i10 & 2) != 0;
    }

    public void A0(boolean z10) {
        this.f30429I = z10;
    }

    public void B0(int i10) {
        if (i10 == 1 || i10 == 2) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("STATE_");
            sb2.append(i10 == 1 ? "DRAGGING" : "SETTLING");
            sb2.append(" should not be set externally.");
            throw new IllegalArgumentException(sb2.toString());
        }
        if (!this.f30428H && i10 == 5) {
            Log.w("BottomSheetBehavior", "Cannot set state: " + i10);
            return;
        }
        int i11 = (i10 == 6 && this.f30449b && g0(i10) <= this.f30423C) ? 3 : i10;
        WeakReference weakReference = this.f30440T;
        if (weakReference == null || weakReference.get() == null) {
            C0(i10);
        } else {
            View view = (View) this.f30440T.get();
            o0(view, new a(view, i11));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a9  */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void C(androidx.coordinatorlayout.widget.CoordinatorLayout r3, android.view.View r4, android.view.View r5, int r6) {
        /*
            r2 = this;
            int r3 = r4.getTop()
            int r6 = r2.f0()
            r0 = 3
            if (r3 != r6) goto Lf
            r2.C0(r0)
            return
        Lf:
            boolean r3 = r2.k0()
            if (r3 == 0) goto L24
            java.lang.ref.WeakReference r3 = r2.f30441U
            if (r3 == 0) goto L23
            java.lang.Object r3 = r3.get()
            if (r5 != r3) goto L23
            boolean r3 = r2.f30436P
            if (r3 != 0) goto L24
        L23:
            return
        L24:
            int r3 = r2.f30435O
            r5 = 6
            if (r3 <= 0) goto L39
            boolean r3 = r2.f30449b
            if (r3 == 0) goto L2f
            goto Laa
        L2f:
            int r3 = r4.getTop()
            int r6 = r2.f30424D
            if (r3 <= r6) goto Laa
            goto La9
        L39:
            boolean r3 = r2.f30428H
            if (r3 == 0) goto L49
            float r3 = r2.h0()
            boolean r3 = r2.G0(r4, r3)
            if (r3 == 0) goto L49
            r0 = 5
            goto Laa
        L49:
            int r3 = r2.f30435O
            r6 = 4
            if (r3 != 0) goto L8e
            int r3 = r4.getTop()
            boolean r1 = r2.f30449b
            if (r1 == 0) goto L68
            int r5 = r2.f30423C
            int r5 = r3 - r5
            int r5 = java.lang.Math.abs(r5)
            int r1 = r2.f30426F
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r5 >= r3) goto L92
            goto Laa
        L68:
            int r1 = r2.f30424D
            if (r3 >= r1) goto L7e
            int r1 = r2.f30426F
            int r1 = r3 - r1
            int r1 = java.lang.Math.abs(r1)
            if (r3 >= r1) goto L77
            goto Laa
        L77:
            boolean r3 = r2.H0()
            if (r3 == 0) goto La9
            goto L92
        L7e:
            int r0 = r3 - r1
            int r0 = java.lang.Math.abs(r0)
            int r1 = r2.f30426F
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r0 >= r3) goto L92
            goto La9
        L8e:
            boolean r3 = r2.f30449b
            if (r3 == 0) goto L94
        L92:
            r0 = r6
            goto Laa
        L94:
            int r3 = r4.getTop()
            int r0 = r2.f30424D
            int r0 = r3 - r0
            int r0 = java.lang.Math.abs(r0)
            int r1 = r2.f30426F
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r0 >= r3) goto L92
        La9:
            r0 = r5
        Laa:
            r3 = 0
            r2.J0(r4, r0, r3)
            r2.f30436P = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.C(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.View, int):void");
    }

    public void C0(int i10) {
        View view;
        if (this.f30431K == i10) {
            return;
        }
        this.f30431K = i10;
        if (i10 == 4 || i10 == 3 || i10 == 6 || (this.f30428H && i10 == 5)) {
            this.f30432L = i10;
        }
        WeakReference weakReference = this.f30440T;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        if (i10 == 3) {
            M0(true);
        } else if (i10 == 6 || i10 == 5 || i10 == 4) {
            M0(false);
        }
        L0(i10);
        for (int i11 = 0; i11 < this.f30442V.size(); i11++) {
            ((f) this.f30442V.get(i11)).c(view, i10);
        }
        K0();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public boolean D(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.f30431K == 1 && actionMasked == 0) {
            return true;
        }
        if (F0()) {
            this.f30433M.z(motionEvent);
        }
        if (actionMasked == 0) {
            m0();
        }
        if (this.f30443W == null) {
            this.f30443W = VelocityTracker.obtain();
        }
        this.f30443W.addMovement(motionEvent);
        if (F0() && actionMasked == 2 && !this.f30434N && Math.abs(this.f30445Y - motionEvent.getY()) > this.f30433M.u()) {
            this.f30433M.b(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        return !this.f30434N;
    }

    public final void D0(View view) {
        boolean z10 = (i0() || this.f30455f) ? false : true;
        if (this.f30464o || this.f30465p || this.f30466q || this.f30468s || this.f30469t || this.f30470u || z10) {
            n.a(view, new c(z10));
        }
    }

    public boolean E0(long j10, float f10) {
        return false;
    }

    public final boolean F0() {
        if (this.f30433M != null) {
            return this.f30430J || this.f30431K == 1;
        }
        return false;
    }

    public boolean G0(View view, float f10) {
        if (this.f30429I) {
            return true;
        }
        if (view.getTop() < this.f30426F) {
            return false;
        }
        return Math.abs((((float) view.getTop()) + (f10 * 0.1f)) - ((float) this.f30426F)) / ((float) Y()) > 0.5f;
    }

    public boolean H0() {
        return false;
    }

    public boolean I0() {
        return true;
    }

    public final void J0(View view, int i10, boolean z10) {
        int iG0 = g0(i10);
        C3925c c3925c = this.f30433M;
        if (c3925c == null || (!z10 ? c3925c.H(view, view.getLeft(), iG0) : c3925c.F(view.getLeft(), iG0))) {
            C0(i10);
            return;
        }
        C0(2);
        L0(i10);
        this.f30475z.c(i10);
    }

    public final void K0() {
        View view;
        WeakReference weakReference = this.f30440T;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        E.Z(view, ImageMetadata.LENS_APERTURE);
        E.Z(view, 262144);
        E.Z(view, ImageMetadata.SHADING_MODE);
        int i10 = this.f30450b0;
        if (i10 != -1) {
            E.Z(view, i10);
        }
        if (!this.f30449b && this.f30431K != 6) {
            this.f30450b0 = V(view, c7.h.f25960a, 6);
        }
        if (this.f30428H && this.f30431K != 5) {
            l0(view, h.a.f20134y, 5);
        }
        int i11 = this.f30431K;
        if (i11 == 3) {
            l0(view, h.a.f20133x, this.f30449b ? 4 : 6);
            return;
        }
        if (i11 == 4) {
            l0(view, h.a.f20132w, this.f30449b ? 3 : 6);
        } else {
            if (i11 != 6) {
                return;
            }
            l0(view, h.a.f20133x, 4);
            l0(view, h.a.f20132w, 3);
        }
    }

    public final void L0(int i10) {
        ValueAnimator valueAnimator;
        if (i10 == 2) {
            return;
        }
        boolean z10 = i10 == 3;
        if (this.f30474y != z10) {
            this.f30474y = z10;
            if (this.f30458i == null || (valueAnimator = this.f30421A) == null) {
                return;
            }
            if (valueAnimator.isRunning()) {
                this.f30421A.reverse();
                return;
            }
            float f10 = z10 ? 0.0f : 1.0f;
            this.f30421A.setFloatValues(1.0f - f10, f10);
            this.f30421A.start();
        }
    }

    public final void M0(boolean z10) {
        Map map;
        WeakReference weakReference = this.f30440T;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = ((View) weakReference.get()).getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z10) {
                if (this.f30448a0 != null) {
                    return;
                } else {
                    this.f30448a0 = new HashMap(childCount);
                }
            }
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = coordinatorLayout.getChildAt(i10);
                if (childAt != this.f30440T.get()) {
                    if (z10) {
                        this.f30448a0.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        if (this.f30451c) {
                            E.n0(childAt, 4);
                        }
                    } else if (this.f30451c && (map = this.f30448a0) != null && map.containsKey(childAt)) {
                        E.n0(childAt, ((Integer) this.f30448a0.get(childAt)).intValue());
                    }
                }
            }
            if (!z10) {
                this.f30448a0 = null;
            } else if (this.f30451c) {
                ((View) this.f30440T.get()).sendAccessibilityEvent(8);
            }
        }
    }

    public final void N0(boolean z10) {
        View view;
        if (this.f30440T != null) {
            W();
            if (this.f30431K != 4 || (view = (View) this.f30440T.get()) == null) {
                return;
            }
            if (z10) {
                B0(4);
            } else {
                view.requestLayout();
            }
        }
    }

    public final int V(View view, int i10, int i11) {
        return E.b(view, view.getResources().getString(i10), Z(i11));
    }

    public final void W() {
        int iY = Y();
        if (this.f30449b) {
            this.f30426F = Math.max(this.f30439S - iY, this.f30423C);
        } else {
            this.f30426F = this.f30439S - iY;
        }
    }

    public final void X() {
        this.f30424D = (int) (this.f30439S * (1.0f - this.f30425E));
    }

    public final int Y() {
        int iMin;
        int i10;
        int i11;
        if (this.f30455f) {
            iMin = Math.min(Math.max(this.f30456g, this.f30439S - ((this.f30438R * 9) / 16)), this.f30437Q);
            i10 = this.f30471v;
        } else {
            if (!this.f30463n && !this.f30464o && (i11 = this.f30462m) > 0) {
                return Math.max(this.f30454e, i11 + this.f30457h);
            }
            iMin = this.f30454e;
            i10 = this.f30471v;
        }
        return iMin + i10;
    }

    public final Z0.k Z(int i10) {
        return new e(i10);
    }

    public final void a0(Context context) {
        if (this.f30473x == null) {
            return;
        }
        s7.g gVar = new s7.g(this.f30473x);
        this.f30458i = gVar;
        gVar.K(context);
        ColorStateList colorStateList = this.f30459j;
        if (colorStateList != null) {
            this.f30458i.U(colorStateList);
            return;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.colorBackground, typedValue, true);
        this.f30458i.setTint(typedValue.data);
    }

    public final void b0() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f30421A = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(500L);
        this.f30421A.addUpdateListener(new b());
    }

    public void c0(int i10) {
        float f10;
        float fF0;
        View view = (View) this.f30440T.get();
        if (view == null || this.f30442V.isEmpty()) {
            return;
        }
        int i11 = this.f30426F;
        if (i10 > i11 || i11 == f0()) {
            int i12 = this.f30426F;
            f10 = i12 - i10;
            fF0 = this.f30439S - i12;
        } else {
            int i13 = this.f30426F;
            f10 = i13 - i10;
            fF0 = i13 - f0();
        }
        float f11 = f10 / fF0;
        for (int i14 = 0; i14 < this.f30442V.size(); i14++) {
            ((f) this.f30442V.get(i14)).b(view, f11);
        }
    }

    public View d0(View view) {
        if (E.M(view)) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View viewD0 = d0(viewGroup.getChildAt(i10));
            if (viewD0 != null) {
                return viewD0;
            }
        }
        return null;
    }

    public final int e0(int i10, int i11, int i12, int i13) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i10, i11, i13);
        if (i12 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.min(size, i12), 1073741824);
        }
        if (size != 0) {
            i12 = Math.min(size, i12);
        }
        return View.MeasureSpec.makeMeasureSpec(i12, Integer.MIN_VALUE);
    }

    public int f0() {
        if (this.f30449b) {
            return this.f30423C;
        }
        return Math.max(this.f30422B, this.f30467r ? 0 : this.f30472w);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public void g(CoordinatorLayout.e eVar) {
        super.g(eVar);
        this.f30440T = null;
        this.f30433M = null;
    }

    public final int g0(int i10) {
        if (i10 == 3) {
            return f0();
        }
        if (i10 == 4) {
            return this.f30426F;
        }
        if (i10 == 5) {
            return this.f30439S;
        }
        if (i10 == 6) {
            return this.f30424D;
        }
        throw new IllegalArgumentException("Invalid state to get top offset: " + i10);
    }

    public final float h0() {
        VelocityTracker velocityTracker = this.f30443W;
        if (velocityTracker == null) {
            return 0.0f;
        }
        velocityTracker.computeCurrentVelocity(1000, this.f30453d);
        return this.f30443W.getYVelocity(this.f30444X);
    }

    public boolean i0() {
        return this.f30463n;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public void j() {
        super.j();
        this.f30440T = null;
        this.f30433M = null;
    }

    public final boolean j0(View view) {
        ViewParent parent = view.getParent();
        return parent != null && parent.isLayoutRequested() && E.K(view);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public boolean k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        C3925c c3925c;
        if (!view.isShown() || !this.f30430J) {
            this.f30434N = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            m0();
        }
        if (this.f30443W == null) {
            this.f30443W = VelocityTracker.obtain();
        }
        this.f30443W.addMovement(motionEvent);
        if (actionMasked == 0) {
            int x10 = (int) motionEvent.getX();
            this.f30445Y = (int) motionEvent.getY();
            if (this.f30431K != 2) {
                WeakReference weakReference = this.f30441U;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && coordinatorLayout.z(view2, x10, this.f30445Y)) {
                    this.f30444X = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.f30446Z = true;
                }
            }
            this.f30434N = this.f30444X == -1 && !coordinatorLayout.z(view, x10, this.f30445Y);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f30446Z = false;
            this.f30444X = -1;
            if (this.f30434N) {
                this.f30434N = false;
                return false;
            }
        }
        if (!this.f30434N && (c3925c = this.f30433M) != null && c3925c.G(motionEvent)) {
            return true;
        }
        WeakReference weakReference2 = this.f30441U;
        View view3 = weakReference2 != null ? (View) weakReference2.get() : null;
        return (actionMasked != 2 || view3 == null || this.f30434N || this.f30431K == 1 || coordinatorLayout.z(view3, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.f30433M == null || Math.abs(((float) this.f30445Y) - motionEvent.getY()) <= ((float) this.f30433M.u())) ? false : true;
    }

    public boolean k0() {
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public boolean l(CoordinatorLayout coordinatorLayout, View view, int i10) {
        if (E.t(coordinatorLayout) && !E.t(view)) {
            view.setFitsSystemWindows(true);
        }
        if (this.f30440T == null) {
            this.f30456g = coordinatorLayout.getResources().getDimensionPixelSize(c7.c.f25869a);
            D0(view);
            this.f30440T = new WeakReference(view);
            s7.g gVar = this.f30458i;
            if (gVar != null) {
                E.j0(view, gVar);
                s7.g gVar2 = this.f30458i;
                float fS = this.f30427G;
                if (fS == -1.0f) {
                    fS = E.s(view);
                }
                gVar2.T(fS);
                boolean z10 = this.f30431K == 3;
                this.f30474y = z10;
                this.f30458i.V(z10 ? 0.0f : 1.0f);
            } else {
                ColorStateList colorStateList = this.f30459j;
                if (colorStateList != null) {
                    E.k0(view, colorStateList);
                }
            }
            K0();
            if (E.u(view) == 0) {
                E.n0(view, 1);
            }
        }
        if (this.f30433M == null) {
            this.f30433M = C3925c.m(coordinatorLayout, this.f30452c0);
        }
        int top = view.getTop();
        coordinatorLayout.G(view, i10);
        this.f30438R = coordinatorLayout.getWidth();
        this.f30439S = coordinatorLayout.getHeight();
        int height = view.getHeight();
        this.f30437Q = height;
        int i11 = this.f30439S;
        int i12 = i11 - height;
        int i13 = this.f30472w;
        if (i12 < i13) {
            if (this.f30467r) {
                this.f30437Q = i11;
            } else {
                this.f30437Q = i11 - i13;
            }
        }
        this.f30423C = Math.max(0, i11 - this.f30437Q);
        X();
        W();
        int i14 = this.f30431K;
        if (i14 == 3) {
            E.R(view, f0());
        } else if (i14 == 6) {
            E.R(view, this.f30424D);
        } else if (this.f30428H && i14 == 5) {
            E.R(view, this.f30439S);
        } else if (i14 == 4) {
            E.R(view, this.f30426F);
        } else if (i14 == 1 || i14 == 2) {
            E.R(view, top - view.getTop());
        }
        this.f30441U = new WeakReference(d0(view));
        for (int i15 = 0; i15 < this.f30442V.size(); i15++) {
            ((f) this.f30442V.get(i15)).a(view);
        }
        return true;
    }

    public final void l0(View view, h.a aVar, int i10) {
        E.b0(view, aVar, null, Z(i10));
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public boolean m(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12, int i13) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(e0(i10, coordinatorLayout.getPaddingLeft() + coordinatorLayout.getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i11, this.f30460k, marginLayoutParams.width), e0(i12, coordinatorLayout.getPaddingTop() + coordinatorLayout.getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i13, this.f30461l, marginLayoutParams.height));
        return true;
    }

    public final void m0() {
        this.f30444X = -1;
        VelocityTracker velocityTracker = this.f30443W;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f30443W = null;
        }
    }

    public final void n0(g gVar) {
        int i10 = this.f30447a;
        if (i10 == 0) {
            return;
        }
        if (i10 == -1 || (i10 & 1) == 1) {
            this.f30454e = gVar.f30487d;
        }
        if (i10 == -1 || (i10 & 2) == 2) {
            this.f30449b = gVar.f30488e;
        }
        if (i10 == -1 || (i10 & 4) == 4) {
            this.f30428H = gVar.f30489f;
        }
        if (i10 == -1 || (i10 & 8) == 8) {
            this.f30429I = gVar.f30490g;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public boolean o(CoordinatorLayout coordinatorLayout, View view, View view2, float f10, float f11) {
        WeakReference weakReference;
        return k0() && (weakReference = this.f30441U) != null && view2 == weakReference.get() && (this.f30431K != 3 || super.o(coordinatorLayout, view, view2, f10, f11));
    }

    public final void o0(View view, Runnable runnable) {
        if (j0(view)) {
            view.post(runnable);
        } else {
            runnable.run();
        }
    }

    public void p0(boolean z10) {
        this.f30430J = z10;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public void q(CoordinatorLayout coordinatorLayout, View view, View view2, int i10, int i11, int[] iArr, int i12) {
        if (i12 == 1) {
            return;
        }
        WeakReference weakReference = this.f30441U;
        View view3 = weakReference != null ? (View) weakReference.get() : null;
        if (!k0() || view2 == view3) {
            int top = view.getTop();
            int i13 = top - i11;
            if (i11 > 0) {
                if (i13 < f0()) {
                    int iF0 = top - f0();
                    iArr[1] = iF0;
                    E.R(view, -iF0);
                    C0(3);
                } else {
                    if (!this.f30430J) {
                        return;
                    }
                    iArr[1] = i11;
                    E.R(view, -i11);
                    C0(1);
                }
            } else if (i11 < 0 && !view2.canScrollVertically(-1)) {
                int i14 = this.f30426F;
                if (i13 > i14 && !this.f30428H) {
                    int i15 = top - i14;
                    iArr[1] = i15;
                    E.R(view, -i15);
                    C0(4);
                } else {
                    if (!this.f30430J) {
                        return;
                    }
                    iArr[1] = i11;
                    E.R(view, -i11);
                    C0(1);
                }
            }
            c0(view.getTop());
            this.f30435O = i11;
            this.f30436P = true;
        }
    }

    public void q0(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("offset must be greater than or equal to 0");
        }
        this.f30422B = i10;
    }

    public void r0(boolean z10) {
        if (this.f30449b == z10) {
            return;
        }
        this.f30449b = z10;
        if (this.f30440T != null) {
            W();
        }
        C0((this.f30449b && this.f30431K == 6) ? 3 : this.f30431K);
        K0();
    }

    public void s0(boolean z10) {
        this.f30463n = z10;
    }

    public void t0(float f10) {
        if (f10 <= 0.0f || f10 >= 1.0f) {
            throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
        }
        this.f30425E = f10;
        if (this.f30440T != null) {
            X();
        }
    }

    public void u0(boolean z10) {
        if (this.f30428H != z10) {
            this.f30428H = z10;
            if (!z10 && this.f30431K == 5) {
                B0(4);
            }
            K0();
        }
    }

    public void v0(int i10) {
        this.f30461l = i10;
    }

    public void w0(int i10) {
        this.f30460k = i10;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public void x(CoordinatorLayout coordinatorLayout, View view, Parcelable parcelable) {
        g gVar = (g) parcelable;
        super.x(coordinatorLayout, view, gVar.a());
        n0(gVar);
        int i10 = gVar.f30486c;
        if (i10 == 1 || i10 == 2) {
            this.f30431K = 4;
            this.f30432L = 4;
        } else {
            this.f30431K = i10;
            this.f30432L = i10;
        }
    }

    public void x0(int i10) {
        y0(i10, false);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public Parcelable y(CoordinatorLayout coordinatorLayout, View view) {
        return new g(super.y(coordinatorLayout, view), this);
    }

    public final void y0(int i10, boolean z10) {
        if (i10 == -1) {
            if (this.f30455f) {
                return;
            } else {
                this.f30455f = true;
            }
        } else {
            if (!this.f30455f && this.f30454e == i10) {
                return;
            }
            this.f30455f = false;
            this.f30454e = Math.max(0, i10);
        }
        N0(z10);
    }

    public void z0(int i10) {
        this.f30447a = i10;
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f30491a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f30492b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Runnable f30493c;

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                h.this.f30492b = false;
                C3925c c3925c = BottomSheetBehavior.this.f30433M;
                if (c3925c != null && c3925c.k(true)) {
                    h hVar = h.this;
                    hVar.c(hVar.f30491a);
                    return;
                }
                h hVar2 = h.this;
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                if (bottomSheetBehavior.f30431K == 2) {
                    bottomSheetBehavior.C0(hVar2.f30491a);
                }
            }
        }

        public h() {
            this.f30493c = new a();
        }

        public void c(int i10) {
            WeakReference weakReference = BottomSheetBehavior.this.f30440T;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            this.f30491a = i10;
            if (this.f30492b) {
                return;
            }
            E.X((View) BottomSheetBehavior.this.f30440T.get(), this.f30493c);
            this.f30492b = true;
        }

        public /* synthetic */ h(BottomSheetBehavior bottomSheetBehavior, a aVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class g extends AbstractC3806a {
        public static final Parcelable.Creator<g> CREATOR = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f30486c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f30487d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f30488e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f30489f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f30490g;

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public class a implements Parcelable.ClassLoaderCreator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public g createFromParcel(Parcel parcel) {
                return new g(parcel, (ClassLoader) null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public g createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new g(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public g[] newArray(int i10) {
                return new g[i10];
            }
        }

        public g(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f30486c = parcel.readInt();
            this.f30487d = parcel.readInt();
            this.f30488e = parcel.readInt() == 1;
            this.f30489f = parcel.readInt() == 1;
            this.f30490g = parcel.readInt() == 1;
        }

        @Override // d1.AbstractC3806a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f30486c);
            parcel.writeInt(this.f30487d);
            parcel.writeInt(this.f30488e ? 1 : 0);
            parcel.writeInt(this.f30489f ? 1 : 0);
            parcel.writeInt(this.f30490g ? 1 : 0);
        }

        public g(Parcelable parcelable, BottomSheetBehavior bottomSheetBehavior) {
            super(parcelable);
            this.f30486c = bottomSheetBehavior.f30431K;
            this.f30487d = bottomSheetBehavior.f30454e;
            this.f30488e = bottomSheetBehavior.f30449b;
            this.f30489f = bottomSheetBehavior.f30428H;
            this.f30490g = bottomSheetBehavior.f30429I;
        }
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        int i10;
        super(context, attributeSet);
        this.f30447a = 0;
        this.f30449b = true;
        this.f30451c = false;
        this.f30460k = -1;
        this.f30461l = -1;
        this.f30475z = new h(this, null);
        this.f30425E = 0.5f;
        this.f30427G = -1.0f;
        this.f30430J = true;
        this.f30431K = 4;
        this.f30432L = 4;
        this.f30442V = new ArrayList();
        this.f30450b0 = -1;
        this.f30452c0 = new d();
        this.f30457h = context.getResources().getDimensionPixelSize(c7.c.f25862I);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.f26342w);
        if (typedArrayObtainStyledAttributes.hasValue(j.f25991A)) {
            this.f30459j = AbstractC5402c.a(context, typedArrayObtainStyledAttributes, j.f25991A);
        }
        if (typedArrayObtainStyledAttributes.hasValue(j.f26110R)) {
            this.f30473x = s7.k.e(context, attributeSet, AbstractC3079a.f25823b, f30420d0).m();
        }
        a0(context);
        b0();
        this.f30427G = typedArrayObtainStyledAttributes.getDimension(j.f26363z, -1.0f);
        if (typedArrayObtainStyledAttributes.hasValue(j.f26349x)) {
            w0(typedArrayObtainStyledAttributes.getDimensionPixelSize(j.f26349x, -1));
        }
        if (typedArrayObtainStyledAttributes.hasValue(j.f26356y)) {
            v0(typedArrayObtainStyledAttributes.getDimensionPixelSize(j.f26356y, -1));
        }
        TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes.peekValue(j.f26033G);
        if (typedValuePeekValue != null && (i10 = typedValuePeekValue.data) == -1) {
            x0(i10);
        } else {
            x0(typedArrayObtainStyledAttributes.getDimensionPixelSize(j.f26033G, -1));
        }
        u0(typedArrayObtainStyledAttributes.getBoolean(j.f26026F, false));
        s0(typedArrayObtainStyledAttributes.getBoolean(j.f26054J, false));
        r0(typedArrayObtainStyledAttributes.getBoolean(j.f26012D, true));
        A0(typedArrayObtainStyledAttributes.getBoolean(j.f26047I, false));
        p0(typedArrayObtainStyledAttributes.getBoolean(j.f25998B, true));
        z0(typedArrayObtainStyledAttributes.getInt(j.f26040H, 0));
        t0(typedArrayObtainStyledAttributes.getFloat(j.f26019E, 0.5f));
        TypedValue typedValuePeekValue2 = typedArrayObtainStyledAttributes.peekValue(j.f26005C);
        if (typedValuePeekValue2 != null && typedValuePeekValue2.type == 16) {
            q0(typedValuePeekValue2.data);
        } else {
            q0(typedArrayObtainStyledAttributes.getDimensionPixelOffset(j.f26005C, 0));
        }
        this.f30464o = typedArrayObtainStyledAttributes.getBoolean(j.f26082N, false);
        this.f30465p = typedArrayObtainStyledAttributes.getBoolean(j.f26089O, false);
        this.f30466q = typedArrayObtainStyledAttributes.getBoolean(j.f26096P, false);
        this.f30467r = typedArrayObtainStyledAttributes.getBoolean(j.f26103Q, true);
        this.f30468s = typedArrayObtainStyledAttributes.getBoolean(j.f26061K, false);
        this.f30469t = typedArrayObtainStyledAttributes.getBoolean(j.f26068L, false);
        this.f30470u = typedArrayObtainStyledAttributes.getBoolean(j.f26075M, false);
        typedArrayObtainStyledAttributes.recycle();
        this.f30453d = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static abstract class f {
        public abstract void b(View view, float f10);

        public abstract void c(View view, int i10);

        public void a(View view) {
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public void t(CoordinatorLayout coordinatorLayout, View view, View view2, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
    }
}
