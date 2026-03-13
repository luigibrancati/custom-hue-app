package androidx.swiperefreshlayout.widget;

import Y0.C2564s;
import Y0.E;
import Y0.InterfaceC2565t;
import Y0.u;
import Y0.v;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Transformation;
import android.widget.ListView;
import r3.C5528a;
import r3.C5529b;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class SwipeRefreshLayout extends ViewGroup implements u, InterfaceC2565t {

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public static final String f24618V = "SwipeRefreshLayout";

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public static final int[] f24619W = {R.attr.enabled};

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f24620A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public int f24621B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public C5529b f24622C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public Animation f24623D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public Animation f24624E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public Animation f24625F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public Animation f24626G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public Animation f24627H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public boolean f24628I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public int f24629J;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public boolean f24630P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public boolean f24631Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public Animation.AnimationListener f24632R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public final Animation f24633S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public final Animation f24634T;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public View f24635a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public j f24636b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f24637c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f24638d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f24639e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f24640f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final v f24641g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C2564s f24642h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int[] f24643i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int[] f24644j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int[] f24645k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f24646l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f24647m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f24648n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f24649o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f24650p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f24651q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f24652r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f24653s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f24654t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final DecelerateInterpolator f24655u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public C5528a f24656v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f24657w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f24658x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public float f24659y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f24660z;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class b extends Animation {
        public b() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f10, Transformation transformation) {
            SwipeRefreshLayout.this.setAnimationProgress(f10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class c extends Animation {
        public c() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f10, Transformation transformation) {
            SwipeRefreshLayout.this.setAnimationProgress(1.0f - f10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class d extends Animation {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f24664a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f24665b;

        public d(int i10, int i11) {
            this.f24664a = i10;
            this.f24665b = i11;
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f10, Transformation transformation) {
            SwipeRefreshLayout.this.f24622C.setAlpha((int) (this.f24664a + ((this.f24665b - r0) * f10)));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class f extends Animation {
        public f() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f10, Transformation transformation) {
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            int iAbs = !swipeRefreshLayout.f24630P ? swipeRefreshLayout.f24620A - Math.abs(swipeRefreshLayout.f24660z) : swipeRefreshLayout.f24620A;
            SwipeRefreshLayout swipeRefreshLayout2 = SwipeRefreshLayout.this;
            SwipeRefreshLayout.this.setTargetOffsetTopAndBottom((swipeRefreshLayout2.f24658x + ((int) ((iAbs - r1) * f10))) - swipeRefreshLayout2.f24656v.getTop());
            SwipeRefreshLayout.this.f24622C.e(1.0f - f10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class g extends Animation {
        public g() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f10, Transformation transformation) {
            SwipeRefreshLayout.this.p(f10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class h extends Animation {
        public h() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f10, Transformation transformation) {
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            float f11 = swipeRefreshLayout.f24659y;
            swipeRefreshLayout.setAnimationProgress(f11 + ((-f11) * f10));
            SwipeRefreshLayout.this.p(f10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface i {
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface j {
        void onRefresh();
    }

    public SwipeRefreshLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f24637c = false;
        this.f24639e = -1.0f;
        this.f24643i = new int[2];
        this.f24644j = new int[2];
        this.f24645k = new int[2];
        this.f24652r = -1;
        this.f24657w = -1;
        this.f24632R = new a();
        this.f24633S = new f();
        this.f24634T = new g();
        this.f24638d = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f24647m = getResources().getInteger(R.integer.config_mediumAnimTime);
        setWillNotDraw(false);
        this.f24655u = new DecelerateInterpolator(2.0f);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.f24629J = (int) (displayMetrics.density * 40.0f);
        d();
        setChildrenDrawingOrderEnabled(true);
        int i10 = (int) (displayMetrics.density * 64.0f);
        this.f24620A = i10;
        this.f24639e = i10;
        this.f24641g = new v(this);
        this.f24642h = new C2564s(this);
        setNestedScrollingEnabled(true);
        int i11 = -this.f24629J;
        this.f24648n = i11;
        this.f24660z = i11;
        p(1.0f);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f24619W);
        setEnabled(typedArrayObtainStyledAttributes.getBoolean(0, true));
        typedArrayObtainStyledAttributes.recycle();
    }

    private void q(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f24652r) {
            this.f24652r = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
        }
    }

    private void setColorViewAlpha(int i10) {
        this.f24656v.getBackground().setAlpha(i10);
        this.f24622C.setAlpha(i10);
    }

    public final void a(int i10, Animation.AnimationListener animationListener) {
        this.f24658x = i10;
        this.f24633S.reset();
        this.f24633S.setDuration(200L);
        this.f24633S.setInterpolator(this.f24655u);
        if (animationListener != null) {
            this.f24656v.b(animationListener);
        }
        this.f24656v.clearAnimation();
        this.f24656v.startAnimation(this.f24633S);
    }

    public final void b(int i10, Animation.AnimationListener animationListener) {
        if (this.f24653s) {
            y(i10, animationListener);
            return;
        }
        this.f24658x = i10;
        this.f24634T.reset();
        this.f24634T.setDuration(200L);
        this.f24634T.setInterpolator(this.f24655u);
        if (animationListener != null) {
            this.f24656v.b(animationListener);
        }
        this.f24656v.clearAnimation();
        this.f24656v.startAnimation(this.f24634T);
    }

    public boolean c() {
        View view = this.f24635a;
        return view instanceof ListView ? c1.g.a((ListView) view, -1) : view.canScrollVertically(-1);
    }

    public final void d() {
        this.f24656v = new C5528a(getContext());
        C5529b c5529b = new C5529b(getContext());
        this.f24622C = c5529b;
        c5529b.l(1);
        this.f24656v.setImageDrawable(this.f24622C);
        this.f24656v.setVisibility(8);
        addView(this.f24656v);
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f10, float f11, boolean z10) {
        return this.f24642h.a(f10, f11, z10);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f10, float f11) {
        return this.f24642h.b(f10, f11);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i10, int i11, int[] iArr, int[] iArr2) {
        return this.f24642h.c(i10, i11, iArr, iArr2);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i10, int i11, int i12, int i13, int[] iArr) {
        return this.f24642h.f(i10, i11, i12, i13, iArr);
    }

    public void e(int i10, int i11, int i12, int i13, int[] iArr, int i14, int[] iArr2) {
        if (i14 == 0) {
            this.f24642h.e(i10, i11, i12, i13, iArr, i14, iArr2);
        }
    }

    public final void f() {
        if (this.f24635a == null) {
            for (int i10 = 0; i10 < getChildCount(); i10++) {
                View childAt = getChildAt(i10);
                if (!childAt.equals(this.f24656v)) {
                    this.f24635a = childAt;
                    return;
                }
            }
        }
    }

    public final void g(float f10) {
        if (f10 > this.f24639e) {
            s(true, true);
            return;
        }
        this.f24637c = false;
        this.f24622C.j(0.0f, 0.0f);
        b(this.f24648n, !this.f24653s ? new e() : null);
        this.f24622C.d(false);
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i10, int i11) {
        int i12 = this.f24657w;
        return i12 < 0 ? i11 : i11 == i10 + (-1) ? i12 : i11 >= i12 ? i11 + 1 : i11;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.f24641g.a();
    }

    public int getProgressCircleDiameter() {
        return this.f24629J;
    }

    public int getProgressViewEndOffset() {
        return this.f24620A;
    }

    public int getProgressViewStartOffset() {
        return this.f24660z;
    }

    public final boolean h(Animation animation) {
        return (animation == null || !animation.hasStarted() || animation.hasEnded()) ? false : true;
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return this.f24642h.j();
    }

    @Override // Y0.InterfaceC2565t
    public void i(View view, View view2, int i10, int i11) {
        if (i11 == 0) {
            onNestedScrollAccepted(view, view2, i10);
        }
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return this.f24642h.l();
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

    public final void l(float f10) {
        this.f24622C.d(true);
        float fMin = Math.min(1.0f, Math.abs(f10 / this.f24639e));
        float fMax = (((float) Math.max(((double) fMin) - 0.4d, 0.0d)) * 5.0f) / 3.0f;
        float fAbs = Math.abs(f10) - this.f24639e;
        int i10 = this.f24621B;
        if (i10 <= 0) {
            i10 = this.f24630P ? this.f24620A - this.f24660z : this.f24620A;
        }
        float f11 = i10;
        double dMax = Math.max(0.0f, Math.min(fAbs, f11 * 2.0f) / f11) / 4.0f;
        float fPow = ((float) (dMax - Math.pow(dMax, 2.0d))) * 2.0f;
        int i11 = this.f24660z + ((int) ((f11 * fMin) + (f11 * fPow * 2.0f)));
        if (this.f24656v.getVisibility() != 0) {
            this.f24656v.setVisibility(0);
        }
        if (!this.f24653s) {
            this.f24656v.setScaleX(1.0f);
            this.f24656v.setScaleY(1.0f);
        }
        if (this.f24653s) {
            setAnimationProgress(Math.min(1.0f, f10 / this.f24639e));
        }
        if (f10 < this.f24639e) {
            if (this.f24622C.getAlpha() > 76 && !h(this.f24625F)) {
                w();
            }
        } else if (this.f24622C.getAlpha() < 255 && !h(this.f24626G)) {
            v();
        }
        this.f24622C.j(0.0f, Math.min(0.8f, fMax * 0.8f));
        this.f24622C.e(Math.min(1.0f, fMax));
        this.f24622C.g((((fMax * 0.4f) - 0.25f) + (fPow * 2.0f)) * 0.5f);
        setTargetOffsetTopAndBottom(i11 - this.f24648n);
    }

    @Override // Y0.u
    public void m(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        if (i14 != 0) {
            return;
        }
        int i15 = iArr[1];
        e(i10, i11, i12, i13, this.f24644j, i14, iArr);
        int i16 = i13 - (iArr[1] - i15);
        if ((i16 == 0 ? i13 + this.f24644j[1] : i16) >= 0 || c()) {
            return;
        }
        float fAbs = this.f24640f + Math.abs(r14);
        this.f24640f = fAbs;
        l(fAbs);
        iArr[1] = iArr[1] + i16;
    }

    @Override // Y0.InterfaceC2565t
    public void n(View view, int i10, int i11, int i12, int i13, int i14) {
        m(view, i10, i11, i12, i13, i14, this.f24645k);
    }

    @Override // Y0.InterfaceC2565t
    public boolean o(View view, View view2, int i10, int i11) {
        if (i11 == 0) {
            return onStartNestedScroll(view, view2, i10);
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        r();
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0058  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r5) {
        /*
            r4 = this;
            r4.f()
            int r0 = r5.getActionMasked()
            boolean r1 = r4.f24654t
            r2 = 0
            if (r1 == 0) goto L10
            if (r0 != 0) goto L10
            r4.f24654t = r2
        L10:
            boolean r1 = r4.isEnabled()
            if (r1 == 0) goto L81
            boolean r1 = r4.f24654t
            if (r1 != 0) goto L81
            boolean r1 = r4.c()
            if (r1 != 0) goto L81
            boolean r1 = r4.f24637c
            if (r1 != 0) goto L81
            boolean r1 = r4.f24646l
            if (r1 == 0) goto L29
            goto L81
        L29:
            if (r0 == 0) goto L5d
            r1 = 1
            r3 = -1
            if (r0 == r1) goto L58
            r1 = 2
            if (r0 == r1) goto L3d
            r1 = 3
            if (r0 == r1) goto L58
            r1 = 6
            if (r0 == r1) goto L39
            goto L7e
        L39:
            r4.q(r5)
            goto L7e
        L3d:
            int r0 = r4.f24652r
            if (r0 != r3) goto L49
            java.lang.String r4 = androidx.swiperefreshlayout.widget.SwipeRefreshLayout.f24618V
            java.lang.String r5 = "Got ACTION_MOVE event but don't have an active pointer id."
            android.util.Log.e(r4, r5)
            return r2
        L49:
            int r0 = r5.findPointerIndex(r0)
            if (r0 >= 0) goto L50
            return r2
        L50:
            float r5 = r5.getY(r0)
            r4.u(r5)
            goto L7e
        L58:
            r4.f24651q = r2
            r4.f24652r = r3
            goto L7e
        L5d:
            int r0 = r4.f24660z
            r3.a r1 = r4.f24656v
            int r1 = r1.getTop()
            int r0 = r0 - r1
            r4.setTargetOffsetTopAndBottom(r0)
            int r0 = r5.getPointerId(r2)
            r4.f24652r = r0
            r4.f24651q = r2
            int r0 = r5.findPointerIndex(r0)
            if (r0 >= 0) goto L78
            return r2
        L78:
            float r5 = r5.getY(r0)
            r4.f24650p = r5
        L7e:
            boolean r4 = r4.f24651q
            return r4
        L81:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.swiperefreshlayout.widget.SwipeRefreshLayout.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (getChildCount() == 0) {
            return;
        }
        if (this.f24635a == null) {
            f();
        }
        View view = this.f24635a;
        if (view == null) {
            return;
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        view.layout(paddingLeft, paddingTop, ((measuredWidth - getPaddingLeft()) - getPaddingRight()) + paddingLeft, ((measuredHeight - getPaddingTop()) - getPaddingBottom()) + paddingTop);
        int measuredWidth2 = this.f24656v.getMeasuredWidth();
        int measuredHeight2 = this.f24656v.getMeasuredHeight();
        int i14 = measuredWidth / 2;
        int i15 = measuredWidth2 / 2;
        int i16 = this.f24648n;
        this.f24656v.layout(i14 - i15, i16, i14 + i15, measuredHeight2 + i16);
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.f24635a == null) {
            f();
        }
        View view = this.f24635a;
        if (view == null) {
            return;
        }
        view.measure(View.MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), 1073741824));
        this.f24656v.measure(View.MeasureSpec.makeMeasureSpec(this.f24629J, 1073741824), View.MeasureSpec.makeMeasureSpec(this.f24629J, 1073741824));
        this.f24657w = -1;
        for (int i12 = 0; i12 < getChildCount(); i12++) {
            if (getChildAt(i12) == this.f24656v) {
                this.f24657w = i12;
                return;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f10, float f11, boolean z10) {
        return dispatchNestedFling(f10, f11, z10);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f10, float f11) {
        return dispatchNestedPreFling(f10, f11);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
        if (i11 > 0) {
            float f10 = this.f24640f;
            if (f10 > 0.0f) {
                float f11 = i11;
                if (f11 > f10) {
                    iArr[1] = (int) f10;
                    this.f24640f = 0.0f;
                } else {
                    this.f24640f = f10 - f11;
                    iArr[1] = i11;
                }
                l(this.f24640f);
            }
        }
        if (this.f24630P && i11 > 0 && this.f24640f == 0.0f && Math.abs(i11 - iArr[1]) > 0) {
            this.f24656v.setVisibility(8);
        }
        int[] iArr2 = this.f24643i;
        if (dispatchNestedPreScroll(i10 - iArr[0], i11 - iArr[1], iArr2, null)) {
            iArr[0] = iArr[0] + iArr2[0];
            iArr[1] = iArr[1] + iArr2[1];
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        m(view, i10, i11, i12, i13, 0, this.f24645k);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i10) {
        this.f24641g.b(view, view2, i10);
        startNestedScroll(i10 & 2);
        this.f24640f = 0.0f;
        this.f24646l = true;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        k kVar = (k) parcelable;
        super.onRestoreInstanceState(kVar.getSuperState());
        setRefreshing(kVar.f24671a);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        return new k(super.onSaveInstanceState(), this.f24637c);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i10) {
        return (!isEnabled() || this.f24654t || this.f24637c || (i10 & 2) == 0) ? false : true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        this.f24641g.d(view);
        this.f24646l = false;
        float f10 = this.f24640f;
        if (f10 > 0.0f) {
            g(f10);
            this.f24640f = 0.0f;
        }
        stopNestedScroll();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (this.f24654t && actionMasked == 0) {
            this.f24654t = false;
        }
        if (!isEnabled() || this.f24654t || c() || this.f24637c || this.f24646l) {
            return false;
        }
        if (actionMasked == 0) {
            this.f24652r = motionEvent.getPointerId(0);
            this.f24651q = false;
        } else {
            if (actionMasked == 1) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f24652r);
                if (iFindPointerIndex < 0) {
                    Log.e(f24618V, "Got ACTION_UP event but don't have an active pointer id.");
                    return false;
                }
                if (this.f24651q) {
                    float y10 = (motionEvent.getY(iFindPointerIndex) - this.f24649o) * 0.5f;
                    this.f24651q = false;
                    g(y10);
                }
                this.f24652r = -1;
                return false;
            }
            if (actionMasked == 2) {
                int iFindPointerIndex2 = motionEvent.findPointerIndex(this.f24652r);
                if (iFindPointerIndex2 < 0) {
                    Log.e(f24618V, "Got ACTION_MOVE event but have an invalid active pointer id.");
                    return false;
                }
                float y11 = motionEvent.getY(iFindPointerIndex2);
                u(y11);
                if (this.f24651q) {
                    float f10 = (y11 - this.f24649o) * 0.5f;
                    if (f10 <= 0.0f) {
                        return false;
                    }
                    getParent().requestDisallowInterceptTouchEvent(true);
                    l(f10);
                }
            } else {
                if (actionMasked == 3) {
                    return false;
                }
                if (actionMasked == 5) {
                    int actionIndex = motionEvent.getActionIndex();
                    if (actionIndex < 0) {
                        Log.e(f24618V, "Got ACTION_POINTER_DOWN event but have an invalid action index.");
                        return false;
                    }
                    this.f24652r = motionEvent.getPointerId(actionIndex);
                } else if (actionMasked == 6) {
                    q(motionEvent);
                }
            }
        }
        return true;
    }

    public void p(float f10) {
        setTargetOffsetTopAndBottom((this.f24658x + ((int) ((this.f24660z - r0) * f10))) - this.f24656v.getTop());
    }

    public void r() {
        this.f24656v.clearAnimation();
        this.f24622C.stop();
        this.f24656v.setVisibility(8);
        setColorViewAlpha(255);
        if (this.f24653s) {
            setAnimationProgress(0.0f);
        } else {
            setTargetOffsetTopAndBottom(this.f24660z - this.f24648n);
        }
        this.f24648n = this.f24656v.getTop();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z10) {
        ViewParent parent;
        View view = this.f24635a;
        if (view == null || E.M(view)) {
            super.requestDisallowInterceptTouchEvent(z10);
        } else {
            if (this.f24631Q || (parent = getParent()) == null) {
                return;
            }
            parent.requestDisallowInterceptTouchEvent(z10);
        }
    }

    public final void s(boolean z10, boolean z11) {
        if (this.f24637c != z10) {
            this.f24628I = z11;
            f();
            this.f24637c = z10;
            if (z10) {
                a(this.f24648n, this.f24632R);
            } else {
                x(this.f24632R);
            }
        }
    }

    public void setAnimationProgress(float f10) {
        this.f24656v.setScaleX(f10);
        this.f24656v.setScaleY(f10);
    }

    @Deprecated
    public void setColorScheme(int... iArr) {
        setColorSchemeResources(iArr);
    }

    public void setColorSchemeColors(int... iArr) {
        f();
        this.f24622C.f(iArr);
    }

    public void setColorSchemeResources(int... iArr) {
        Context context = getContext();
        int[] iArr2 = new int[iArr.length];
        for (int i10 = 0; i10 < iArr.length; i10++) {
            iArr2[i10] = L0.a.d(context, iArr[i10]);
        }
        setColorSchemeColors(iArr2);
    }

    public void setDistanceToTriggerSync(int i10) {
        this.f24639e = i10;
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        if (z10) {
            return;
        }
        r();
    }

    @Deprecated
    public void setLegacyRequestDisallowInterceptTouchEventEnabled(boolean z10) {
        this.f24631Q = z10;
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z10) {
        this.f24642h.m(z10);
    }

    public void setOnRefreshListener(j jVar) {
        this.f24636b = jVar;
    }

    @Deprecated
    public void setProgressBackgroundColor(int i10) {
        setProgressBackgroundColorSchemeResource(i10);
    }

    public void setProgressBackgroundColorSchemeColor(int i10) {
        this.f24656v.setBackgroundColor(i10);
    }

    public void setProgressBackgroundColorSchemeResource(int i10) {
        setProgressBackgroundColorSchemeColor(L0.a.d(getContext(), i10));
    }

    public void setRefreshing(boolean z10) {
        if (!z10 || this.f24637c == z10) {
            s(z10, false);
            return;
        }
        this.f24637c = z10;
        setTargetOffsetTopAndBottom((!this.f24630P ? this.f24620A + this.f24660z : this.f24620A) - this.f24648n);
        this.f24628I = false;
        z(this.f24632R);
    }

    public void setSize(int i10) {
        if (i10 == 0 || i10 == 1) {
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            if (i10 == 0) {
                this.f24629J = (int) (displayMetrics.density * 56.0f);
            } else {
                this.f24629J = (int) (displayMetrics.density * 40.0f);
            }
            this.f24656v.setImageDrawable(null);
            this.f24622C.l(i10);
            this.f24656v.setImageDrawable(this.f24622C);
        }
    }

    public void setSlingshotDistance(int i10) {
        this.f24621B = i10;
    }

    public void setTargetOffsetTopAndBottom(int i10) {
        this.f24656v.bringToFront();
        E.R(this.f24656v, i10);
        this.f24648n = this.f24656v.getTop();
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i10) {
        return this.f24642h.o(i10);
    }

    @Override // android.view.View
    public void stopNestedScroll() {
        this.f24642h.q();
    }

    public final Animation t(int i10, int i11) {
        d dVar = new d(i10, i11);
        dVar.setDuration(300L);
        this.f24656v.b(null);
        this.f24656v.clearAnimation();
        this.f24656v.startAnimation(dVar);
        return dVar;
    }

    public final void u(float f10) {
        float f11 = this.f24650p;
        float f12 = f10 - f11;
        int i10 = this.f24638d;
        if (f12 <= i10 || this.f24651q) {
            return;
        }
        this.f24649o = f11 + i10;
        this.f24651q = true;
        this.f24622C.setAlpha(76);
    }

    public final void v() {
        this.f24626G = t(this.f24622C.getAlpha(), 255);
    }

    public final void w() {
        this.f24625F = t(this.f24622C.getAlpha(), 76);
    }

    public void x(Animation.AnimationListener animationListener) {
        c cVar = new c();
        this.f24624E = cVar;
        cVar.setDuration(150L);
        this.f24656v.b(animationListener);
        this.f24656v.clearAnimation();
        this.f24656v.startAnimation(this.f24624E);
    }

    public final void y(int i10, Animation.AnimationListener animationListener) {
        this.f24658x = i10;
        this.f24659y = this.f24656v.getScaleX();
        h hVar = new h();
        this.f24627H = hVar;
        hVar.setDuration(150L);
        if (animationListener != null) {
            this.f24656v.b(animationListener);
        }
        this.f24656v.clearAnimation();
        this.f24656v.startAnimation(this.f24627H);
    }

    public final void z(Animation.AnimationListener animationListener) {
        this.f24656v.setVisibility(0);
        this.f24622C.setAlpha(255);
        b bVar = new b();
        this.f24623D = bVar;
        bVar.setDuration(this.f24647m);
        if (animationListener != null) {
            this.f24656v.b(animationListener);
        }
        this.f24656v.clearAnimation();
        this.f24656v.startAnimation(this.f24623D);
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class k extends View.BaseSavedState {
        public static final Parcelable.Creator<k> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f24671a;

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public k createFromParcel(Parcel parcel) {
                return new k(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public k[] newArray(int i10) {
                return new k[i10];
            }
        }

        public k(Parcelable parcelable, boolean z10) {
            super(parcelable);
            this.f24671a = z10;
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeByte(this.f24671a ? (byte) 1 : (byte) 0);
        }

        public k(Parcel parcel) {
            super(parcel);
            this.f24671a = parcel.readByte() != 0;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a implements Animation.AnimationListener {
        public a() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            j jVar;
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            if (!swipeRefreshLayout.f24637c) {
                swipeRefreshLayout.r();
                return;
            }
            swipeRefreshLayout.f24622C.setAlpha(255);
            SwipeRefreshLayout.this.f24622C.start();
            SwipeRefreshLayout swipeRefreshLayout2 = SwipeRefreshLayout.this;
            if (swipeRefreshLayout2.f24628I && (jVar = swipeRefreshLayout2.f24636b) != null) {
                jVar.onRefresh();
            }
            SwipeRefreshLayout swipeRefreshLayout3 = SwipeRefreshLayout.this;
            swipeRefreshLayout3.f24648n = swipeRefreshLayout3.f24656v.getTop();
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class e implements Animation.AnimationListener {
        public e() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            if (swipeRefreshLayout.f24653s) {
                return;
            }
            swipeRefreshLayout.x(null);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    public void setOnChildScrollUpCallback(i iVar) {
    }
}
