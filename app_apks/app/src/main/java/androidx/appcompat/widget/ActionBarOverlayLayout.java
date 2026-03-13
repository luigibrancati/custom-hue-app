package androidx.appcompat.widget;

import Y0.E;
import Y0.InterfaceC2565t;
import Y0.S;
import Y0.u;
import Y0.v;
import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import androidx.appcompat.view.menu.i;
import h.AbstractC4262a;
import p.InterfaceC5327F;
import p.InterfaceC5328G;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"UnknownNullness"})
public class ActionBarOverlayLayout extends ViewGroup implements InterfaceC5327F, InterfaceC2565t, u {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static final int[] f21685G = {AbstractC4262a.f35793b, R.attr.windowContentOverlay};

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public static final S f21686H = new S.a().d(O0.b.b(0, 1, 0, 1)).a();

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public static final Rect f21687I = new Rect();

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public ViewPropertyAnimator f21688A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final AnimatorListenerAdapter f21689B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final Runnable f21690C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final Runnable f21691D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final v f21692E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final f f21693F;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f21694a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f21695b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ContentFrameLayout f21696c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ActionBarContainer f21697d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public InterfaceC5328G f21698e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Drawable f21699f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f21700g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f21701h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f21702i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f21703j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f21704k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f21705l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Rect f21706m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Rect f21707n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Rect f21708o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Rect f21709p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Rect f21710q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Rect f21711r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Rect f21712s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Rect f21713t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public S f21714u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public S f21715v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public S f21716w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public S f21717x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public d f21718y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public OverScroller f21719z;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f21688A = null;
            actionBarOverlayLayout.f21703j = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f21688A = null;
            actionBarOverlayLayout.f21703j = false;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionBarOverlayLayout.this.v();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f21688A = actionBarOverlayLayout.f21697d.animate().translationY(0.0f).setListener(ActionBarOverlayLayout.this.f21689B);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionBarOverlayLayout.this.v();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f21688A = actionBarOverlayLayout.f21697d.animate().translationY(-ActionBarOverlayLayout.this.f21697d.getHeight()).setListener(ActionBarOverlayLayout.this.f21689B);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface d {
        void a();

        void b();

        void c(boolean z10);

        void d();

        void e();

        void onWindowVisibilityChanged(int i10);
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class e extends ViewGroup.MarginLayoutParams {
        public e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public e(int i10, int i11) {
            super(i10, i11);
        }

        public e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class f extends View {
        public f(Context context) {
            super(context);
            setWillNotDraw(true);
        }

        @Override // android.view.View
        public int getWindowSystemUiVisibility() {
            return 0;
        }
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f21695b = 0;
        this.f21706m = new Rect();
        this.f21707n = new Rect();
        this.f21708o = new Rect();
        this.f21709p = new Rect();
        this.f21710q = new Rect();
        this.f21711r = new Rect();
        this.f21712s = new Rect();
        this.f21713t = new Rect();
        S s10 = S.f19609b;
        this.f21714u = s10;
        this.f21715v = s10;
        this.f21716w = s10;
        this.f21717x = s10;
        this.f21689B = new a();
        this.f21690C = new b();
        this.f21691D = new c();
        w(context);
        this.f21692E = new v(this);
        f fVar = new f(context);
        this.f21693F = fVar;
        addView(fVar);
    }

    public void A() {
        if (this.f21696c == null) {
            this.f21696c = (ContentFrameLayout) findViewById(h.f.f35883b);
            this.f21697d = (ActionBarContainer) findViewById(h.f.f35884c);
            this.f21698e = u(findViewById(h.f.f35882a));
        }
    }

    public final void B() {
        v();
        this.f21690C.run();
    }

    public final boolean C(float f10) {
        this.f21719z.fling(0, 0, 0, (int) f10, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        return this.f21719z.getFinalY() > this.f21697d.getHeight();
    }

    @Override // p.InterfaceC5327F
    public boolean a() {
        A();
        return this.f21698e.a();
    }

    @Override // p.InterfaceC5327F
    public boolean b() {
        A();
        return this.f21698e.b();
    }

    @Override // p.InterfaceC5327F
    public boolean c() {
        A();
        return this.f21698e.c();
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof e;
    }

    @Override // p.InterfaceC5327F
    public void d(Menu menu, i.a aVar) {
        A();
        this.f21698e.d(menu, aVar);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f21699f != null) {
            int bottom = this.f21697d.getVisibility() == 0 ? (int) (this.f21697d.getBottom() + this.f21697d.getTranslationY() + 0.5f) : 0;
            this.f21699f.setBounds(0, bottom, getWidth(), this.f21699f.getIntrinsicHeight() + bottom);
            this.f21699f.draw(canvas);
        }
    }

    @Override // p.InterfaceC5327F
    public boolean e() {
        A();
        return this.f21698e.e();
    }

    @Override // p.InterfaceC5327F
    public void f() {
        A();
        this.f21698e.f();
    }

    @Override // android.view.View
    public boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    @Override // p.InterfaceC5327F
    public boolean g() {
        A();
        return this.f21698e.g();
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f21697d;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.f21692E.a();
    }

    public CharSequence getTitle() {
        A();
        return this.f21698e.getTitle();
    }

    @Override // p.InterfaceC5327F
    public void h(int i10) {
        A();
        if (i10 == 2) {
            this.f21698e.m();
        } else if (i10 == 5) {
            this.f21698e.t();
        } else {
            if (i10 != 109) {
                return;
            }
            setOverlayMode(true);
        }
    }

    @Override // Y0.InterfaceC2565t
    public void i(View view, View view2, int i10, int i11) {
        if (i11 == 0) {
            onNestedScrollAccepted(view, view2, i10);
        }
    }

    @Override // Y0.InterfaceC2565t
    public void j(View view, int i10) {
        if (i10 == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // Y0.InterfaceC2565t
    public void k(View view, int i10, int i11, int[] iArr, int i12) {
        if (i12 == 0) {
            onNestedPreScroll(view, i10, i11, iArr);
        }
    }

    @Override // p.InterfaceC5327F
    public void l() {
        A();
        this.f21698e.o();
    }

    @Override // Y0.u
    public void m(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        n(view, i10, i11, i12, i13, i14);
    }

    @Override // Y0.InterfaceC2565t
    public void n(View view, int i10, int i11, int i12, int i13, int i14) {
        if (i14 == 0) {
            onNestedScroll(view, i10, i11, i12, i13);
        }
    }

    @Override // Y0.InterfaceC2565t
    public boolean o(View view, View view2, int i10, int i11) {
        return i11 == 0 && onStartNestedScroll(view, view2, i10);
    }

    @Override // android.view.View
    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        A();
        S sW = S.w(windowInsets, this);
        boolean zQ = q(this.f21697d, new Rect(sW.i(), sW.k(), sW.j(), sW.h()), true, true, false, true);
        E.f(this, sW, this.f21706m);
        Rect rect = this.f21706m;
        S sL = sW.l(rect.left, rect.top, rect.right, rect.bottom);
        this.f21714u = sL;
        boolean z10 = true;
        if (!this.f21715v.equals(sL)) {
            this.f21715v = this.f21714u;
            zQ = true;
        }
        if (this.f21707n.equals(this.f21706m)) {
            z10 = zQ;
        } else {
            this.f21707n.set(this.f21706m);
        }
        if (z10) {
            requestLayout();
        }
        return sW.a().c().b().u();
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        w(getContext());
        E.c0(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        v();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i15 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin + paddingLeft;
                int i16 = ((ViewGroup.MarginLayoutParams) eVar).topMargin + paddingTop;
                childAt.layout(i15, i16, measuredWidth + i15, measuredHeight + i16);
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        int measuredHeight;
        A();
        measureChildWithMargins(this.f21697d, i10, 0, i11, 0);
        e eVar = (e) this.f21697d.getLayoutParams();
        int iMax = Math.max(0, this.f21697d.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) eVar).leftMargin + ((ViewGroup.MarginLayoutParams) eVar).rightMargin);
        int iMax2 = Math.max(0, this.f21697d.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) eVar).topMargin + ((ViewGroup.MarginLayoutParams) eVar).bottomMargin);
        int iCombineMeasuredStates = View.combineMeasuredStates(0, this.f21697d.getMeasuredState());
        boolean z10 = (E.F(this) & 256) != 0;
        if (z10) {
            measuredHeight = this.f21694a;
            if (this.f21701h && this.f21697d.getTabContainer() != null) {
                measuredHeight += this.f21694a;
            }
        } else {
            measuredHeight = this.f21697d.getVisibility() != 8 ? this.f21697d.getMeasuredHeight() : 0;
        }
        this.f21708o.set(this.f21706m);
        this.f21716w = this.f21714u;
        if (this.f21700g || z10 || !r()) {
            this.f21716w = new S.a(this.f21716w).d(O0.b.b(this.f21716w.i(), this.f21716w.k() + measuredHeight, this.f21716w.j(), this.f21716w.h())).a();
        } else {
            Rect rect = this.f21708o;
            rect.top += measuredHeight;
            rect.bottom = rect.bottom;
            this.f21716w = this.f21716w.l(0, measuredHeight, 0, 0);
        }
        q(this.f21696c, this.f21708o, true, true, true, true);
        if (!this.f21717x.equals(this.f21716w)) {
            S s10 = this.f21716w;
            this.f21717x = s10;
            E.g(this.f21696c, s10);
        }
        measureChildWithMargins(this.f21696c, i10, 0, i11, 0);
        e eVar2 = (e) this.f21696c.getLayoutParams();
        int iMax3 = Math.max(iMax, this.f21696c.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) eVar2).leftMargin + ((ViewGroup.MarginLayoutParams) eVar2).rightMargin);
        int iMax4 = Math.max(iMax2, this.f21696c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) eVar2).topMargin + ((ViewGroup.MarginLayoutParams) eVar2).bottomMargin);
        int iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.f21696c.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(iMax3 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i10, iCombineMeasuredStates2), View.resolveSizeAndState(Math.max(iMax4 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i11, iCombineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f10, float f11, boolean z10) {
        if (!this.f21702i || !z10) {
            return false;
        }
        if (C(f11)) {
            p();
        } else {
            B();
        }
        this.f21703j = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f10, float f11) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        int i14 = this.f21704k + i11;
        this.f21704k = i14;
        setActionBarHideOffset(i14);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i10) {
        this.f21692E.b(view, view2, i10);
        this.f21704k = getActionBarHideOffset();
        v();
        d dVar = this.f21718y;
        if (dVar != null) {
            dVar.e();
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i10) {
        if ((i10 & 2) == 0 || this.f21697d.getVisibility() != 0) {
            return false;
        }
        return this.f21702i;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        if (this.f21702i && !this.f21703j) {
            if (this.f21704k <= this.f21697d.getHeight()) {
                z();
            } else {
                y();
            }
        }
        d dVar = this.f21718y;
        if (dVar != null) {
            dVar.b();
        }
    }

    @Override // android.view.View
    public void onWindowSystemUiVisibilityChanged(int i10) {
        super.onWindowSystemUiVisibilityChanged(i10);
        A();
        int i11 = this.f21705l ^ i10;
        this.f21705l = i10;
        boolean z10 = (i10 & 4) == 0;
        boolean z11 = (i10 & 256) != 0;
        d dVar = this.f21718y;
        if (dVar != null) {
            dVar.c(!z11);
            if (z10 || !z11) {
                this.f21718y.a();
            } else {
                this.f21718y.d();
            }
        }
        if ((i11 & 256) == 0 || this.f21718y == null) {
            return;
        }
        E.c0(this);
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i10) {
        super.onWindowVisibilityChanged(i10);
        this.f21695b = i10;
        d dVar = this.f21718y;
        if (dVar != null) {
            dVar.onWindowVisibilityChanged(i10);
        }
    }

    public final void p() {
        v();
        this.f21691D.run();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean q(android.view.View r2, android.graphics.Rect r3, boolean r4, boolean r5, boolean r6, boolean r7) {
        /*
            r1 = this;
            android.view.ViewGroup$LayoutParams r1 = r2.getLayoutParams()
            androidx.appcompat.widget.ActionBarOverlayLayout$e r1 = (androidx.appcompat.widget.ActionBarOverlayLayout.e) r1
            r2 = 1
            if (r4 == 0) goto L13
            int r4 = r1.leftMargin
            int r0 = r3.left
            if (r4 == r0) goto L13
            r1.leftMargin = r0
            r4 = r2
            goto L14
        L13:
            r4 = 0
        L14:
            if (r5 == 0) goto L1f
            int r5 = r1.topMargin
            int r0 = r3.top
            if (r5 == r0) goto L1f
            r1.topMargin = r0
            r4 = r2
        L1f:
            if (r7 == 0) goto L2a
            int r5 = r1.rightMargin
            int r7 = r3.right
            if (r5 == r7) goto L2a
            r1.rightMargin = r7
            r4 = r2
        L2a:
            if (r6 == 0) goto L35
            int r5 = r1.bottomMargin
            int r3 = r3.bottom
            if (r5 == r3) goto L35
            r1.bottomMargin = r3
            return r2
        L35:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarOverlayLayout.q(android.view.View, android.graphics.Rect, boolean, boolean, boolean, boolean):boolean");
    }

    public final boolean r() {
        E.f(this.f21693F, f21686H, this.f21709p);
        return !this.f21709p.equals(f21687I);
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public e generateDefaultLayoutParams() {
        return new e(-1, -1);
    }

    public void setActionBarHideOffset(int i10) {
        v();
        this.f21697d.setTranslationY(-Math.max(0, Math.min(i10, this.f21697d.getHeight())));
    }

    public void setActionBarVisibilityCallback(d dVar) {
        this.f21718y = dVar;
        if (getWindowToken() != null) {
            this.f21718y.onWindowVisibilityChanged(this.f21695b);
            int i10 = this.f21705l;
            if (i10 != 0) {
                onWindowSystemUiVisibilityChanged(i10);
                E.c0(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z10) {
        this.f21701h = z10;
    }

    public void setHideOnContentScrollEnabled(boolean z10) {
        if (z10 != this.f21702i) {
            this.f21702i = z10;
            if (z10) {
                return;
            }
            v();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i10) {
        A();
        this.f21698e.setIcon(i10);
    }

    public void setLogo(int i10) {
        A();
        this.f21698e.q(i10);
    }

    public void setOverlayMode(boolean z10) {
        this.f21700g = z10;
    }

    @Override // p.InterfaceC5327F
    public void setWindowCallback(Window.Callback callback) {
        A();
        this.f21698e.setWindowCallback(callback);
    }

    @Override // p.InterfaceC5327F
    public void setWindowTitle(CharSequence charSequence) {
        A();
        this.f21698e.setWindowTitle(charSequence);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public e generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final InterfaceC5328G u(View view) {
        if (view instanceof InterfaceC5328G) {
            return (InterfaceC5328G) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        throw new IllegalStateException("Can't make a decor toolbar out of " + view.getClass().getSimpleName());
    }

    public void v() {
        removeCallbacks(this.f21690C);
        removeCallbacks(this.f21691D);
        ViewPropertyAnimator viewPropertyAnimator = this.f21688A;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public final void w(Context context) {
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f21685G);
        this.f21694a = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(1);
        this.f21699f = drawable;
        setWillNotDraw(drawable == null);
        typedArrayObtainStyledAttributes.recycle();
        this.f21719z = new OverScroller(context);
    }

    public boolean x() {
        return this.f21700g;
    }

    public final void y() {
        v();
        postDelayed(this.f21691D, 600L);
    }

    public final void z() {
        v();
        postDelayed(this.f21690C, 600L);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new e(layoutParams);
    }

    public void setIcon(Drawable drawable) {
        A();
        this.f21698e.setIcon(drawable);
    }

    public void setShowingForActionMode(boolean z10) {
    }

    public void setUiOptions(int i10) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
    }
}
