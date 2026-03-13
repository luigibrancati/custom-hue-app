package androidx.coordinatorlayout.widget;

import Y0.AbstractC2554h;
import Y0.E;
import Y0.InterfaceC2565t;
import Y0.S;
import Y0.u;
import Y0.v;
import Y0.w;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import d1.AbstractC3806a;
import io.flutter.plugin.platform.PlatformPlugin;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class CoordinatorLayout extends ViewGroup implements InterfaceC2565t, u {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final String f22400u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final Class[] f22401v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final ThreadLocal f22402w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final Comparator f22403x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final X0.e f22404y;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f22405a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final J0.a f22406b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f22407c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f22408d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Paint f22409e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int[] f22410f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int[] f22411g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f22412h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f22413i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int[] f22414j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public View f22415k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public View f22416l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public f f22417m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f22418n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public S f22419o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f22420p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Drawable f22421q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public ViewGroup.OnHierarchyChangeListener f22422r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public w f22423s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final v f22424t;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a implements w {
        public a() {
        }

        @Override // Y0.w
        public S a(View view, S s10) {
            return CoordinatorLayout.this.U(s10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static abstract class b {
        public b() {
        }

        public boolean A(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i10, int i11) {
            if (i11 == 0) {
                return z(coordinatorLayout, view, view2, view3, i10);
            }
            return false;
        }

        public void C(CoordinatorLayout coordinatorLayout, View view, View view2, int i10) {
            if (i10 == 0) {
                B(coordinatorLayout, view, view2);
            }
        }

        public boolean D(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            return false;
        }

        public boolean a(CoordinatorLayout coordinatorLayout, View view) {
            return d(coordinatorLayout, view) > 0.0f;
        }

        public boolean b(CoordinatorLayout coordinatorLayout, View view, Rect rect) {
            return false;
        }

        public int c(CoordinatorLayout coordinatorLayout, View view) {
            return -16777216;
        }

        public float d(CoordinatorLayout coordinatorLayout, View view) {
            return 0.0f;
        }

        public boolean e(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return false;
        }

        public boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return false;
        }

        public boolean k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            return false;
        }

        public boolean l(CoordinatorLayout coordinatorLayout, View view, int i10) {
            return false;
        }

        public boolean m(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12, int i13) {
            return false;
        }

        public boolean n(CoordinatorLayout coordinatorLayout, View view, View view2, float f10, float f11, boolean z10) {
            return false;
        }

        public boolean o(CoordinatorLayout coordinatorLayout, View view, View view2, float f10, float f11) {
            return false;
        }

        public void q(CoordinatorLayout coordinatorLayout, View view, View view2, int i10, int i11, int[] iArr, int i12) {
            if (i12 == 0) {
                p(coordinatorLayout, view, view2, i10, i11, iArr);
            }
        }

        public void s(CoordinatorLayout coordinatorLayout, View view, View view2, int i10, int i11, int i12, int i13, int i14) {
            if (i14 == 0) {
                r(coordinatorLayout, view, view2, i10, i11, i12, i13);
            }
        }

        public void t(CoordinatorLayout coordinatorLayout, View view, View view2, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
            iArr[0] = iArr[0] + i12;
            iArr[1] = iArr[1] + i13;
            s(coordinatorLayout, view, view2, i10, i11, i12, i13, i14);
        }

        public void v(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i10, int i11) {
            if (i11 == 0) {
                u(coordinatorLayout, view, view2, view3, i10);
            }
        }

        public boolean w(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z10) {
            return false;
        }

        public Parcelable y(CoordinatorLayout coordinatorLayout, View view) {
            return View.BaseSavedState.EMPTY_STATE;
        }

        public boolean z(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i10) {
            return false;
        }

        public b(Context context, AttributeSet attributeSet) {
        }

        public void j() {
        }

        public void g(e eVar) {
        }

        public void B(CoordinatorLayout coordinatorLayout, View view, View view2) {
        }

        public S f(CoordinatorLayout coordinatorLayout, View view, S s10) {
            return s10;
        }

        public void i(CoordinatorLayout coordinatorLayout, View view, View view2) {
        }

        public void x(CoordinatorLayout coordinatorLayout, View view, Parcelable parcelable) {
        }

        public void u(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i10) {
        }

        public void p(CoordinatorLayout coordinatorLayout, View view, View view2, int i10, int i11, int[] iArr) {
        }

        public void r(CoordinatorLayout coordinatorLayout, View view, View view2, int i10, int i11, int i12, int i13) {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    @Retention(RetentionPolicy.RUNTIME)
    public @interface c {
        Class value();
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class d implements ViewGroup.OnHierarchyChangeListener {
        public d() {
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewAdded(View view, View view2) {
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.f22422r;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewRemoved(View view, View view2) {
            CoordinatorLayout.this.F(2);
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.f22422r;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class f implements ViewTreeObserver.OnPreDrawListener {
        public f() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            CoordinatorLayout.this.F(0);
            return true;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class h implements Comparator {
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(View view, View view2) {
            float fG = E.G(view);
            float fG2 = E.G(view2);
            if (fG > fG2) {
                return -1;
            }
            return fG < fG2 ? 1 : 0;
        }
    }

    static {
        Package r02 = CoordinatorLayout.class.getPackage();
        f22400u = r02 != null ? r02.getName() : null;
        f22403x = new h();
        f22401v = new Class[]{Context.class, AttributeSet.class};
        f22402w = new ThreadLocal();
        f22404y = new X0.g(12);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, I0.a.f5393a);
    }

    public static b I(Context context, AttributeSet attributeSet, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.startsWith(".")) {
            str = context.getPackageName() + str;
        } else if (str.indexOf(46) < 0) {
            String str2 = f22400u;
            if (!TextUtils.isEmpty(str2)) {
                str = str2 + '.' + str;
            }
        }
        try {
            ThreadLocal threadLocal = f22402w;
            Map map = (Map) threadLocal.get();
            if (map == null) {
                map = new HashMap();
                threadLocal.set(map);
            }
            Constructor<?> constructor = (Constructor) map.get(str);
            if (constructor == null) {
                constructor = Class.forName(str, false, context.getClassLoader()).getConstructor(f22401v);
                constructor.setAccessible(true);
                map.put(str, constructor);
            }
            return (b) constructor.newInstance(context, attributeSet);
        } catch (Exception e10) {
            throw new RuntimeException("Could not inflate Behavior subclass " + str, e10);
        }
    }

    public static void M(Rect rect) {
        rect.setEmpty();
        f22404y.a(rect);
    }

    public static int P(int i10) {
        if (i10 == 0) {
            return 17;
        }
        return i10;
    }

    public static int Q(int i10) {
        if ((i10 & 7) == 0) {
            i10 |= 8388611;
        }
        return (i10 & 112) == 0 ? i10 | 48 : i10;
    }

    public static int R(int i10) {
        if (i10 == 0) {
            return 8388661;
        }
        return i10;
    }

    public static Rect a() {
        Rect rect = (Rect) f22404y.b();
        return rect == null ? new Rect() : rect;
    }

    private static int c(int i10, int i11, int i12) {
        return i10 < i11 ? i11 : i10 > i12 ? i12 : i10;
    }

    public final void A(View view, int i10) {
        e eVar = (e) view.getLayoutParams();
        Rect rectA = a();
        rectA.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) eVar).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) eVar).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) eVar).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) eVar).bottomMargin);
        if (this.f22419o != null && E.t(this) && !E.t(view)) {
            rectA.left += this.f22419o.i();
            rectA.top += this.f22419o.k();
            rectA.right -= this.f22419o.j();
            rectA.bottom -= this.f22419o.h();
        }
        Rect rectA2 = a();
        AbstractC2554h.a(Q(eVar.f22429c), view.getMeasuredWidth(), view.getMeasuredHeight(), rectA, rectA2, i10);
        view.layout(rectA2.left, rectA2.top, rectA2.right, rectA2.bottom);
        M(rectA);
        M(rectA2);
    }

    public final void B(View view, View view2, int i10) {
        Rect rectA = a();
        Rect rectA2 = a();
        try {
            r(view2, rectA);
            s(view, i10, rectA, rectA2);
            view.layout(rectA2.left, rectA2.top, rectA2.right, rectA2.bottom);
        } finally {
            M(rectA);
            M(rectA2);
        }
    }

    public final void C(View view, int i10, int i11) {
        e eVar = (e) view.getLayoutParams();
        int iB = AbstractC2554h.b(R(eVar.f22429c), i11);
        int i12 = iB & 7;
        int i13 = iB & 112;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        if (i11 == 1) {
            i10 = width - i10;
        }
        int iU = u(i10) - measuredWidth;
        if (i12 == 1) {
            iU += measuredWidth / 2;
        } else if (i12 == 5) {
            iU += measuredWidth;
        }
        int i14 = i13 != 16 ? i13 != 80 ? 0 : measuredHeight : measuredHeight / 2;
        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) eVar).leftMargin, Math.min(iU, ((width - getPaddingRight()) - measuredWidth) - ((ViewGroup.MarginLayoutParams) eVar).rightMargin));
        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) eVar).topMargin, Math.min(i14, ((height - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) eVar).bottomMargin));
        view.layout(iMax, iMax2, measuredWidth + iMax, measuredHeight + iMax2);
    }

    public final void D(View view, Rect rect, int i10) {
        boolean z10;
        boolean z11;
        int width;
        int i11;
        int i12;
        int i13;
        int height;
        int i14;
        int i15;
        int i16;
        if (E.L(view) && view.getWidth() > 0 && view.getHeight() > 0) {
            e eVar = (e) view.getLayoutParams();
            b bVarE = eVar.e();
            Rect rectA = a();
            Rect rectA2 = a();
            rectA2.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            if (bVarE == null || !bVarE.b(this, view, rectA)) {
                rectA.set(rectA2);
            } else if (!rectA2.contains(rectA)) {
                throw new IllegalArgumentException("Rect should be within the child's bounds. Rect:" + rectA.toShortString() + " | Bounds:" + rectA2.toShortString());
            }
            M(rectA2);
            if (rectA.isEmpty()) {
                M(rectA);
                return;
            }
            int iB = AbstractC2554h.b(eVar.f22434h, i10);
            boolean z12 = true;
            if ((iB & 48) != 48 || (i15 = (rectA.top - ((ViewGroup.MarginLayoutParams) eVar).topMargin) - eVar.f22436j) >= (i16 = rect.top)) {
                z10 = false;
            } else {
                T(view, i16 - i15);
                z10 = true;
            }
            if ((iB & 80) == 80 && (height = ((getHeight() - rectA.bottom) - ((ViewGroup.MarginLayoutParams) eVar).bottomMargin) + eVar.f22436j) < (i14 = rect.bottom)) {
                T(view, height - i14);
                z10 = true;
            }
            if (!z10) {
                T(view, 0);
            }
            if ((iB & 3) != 3 || (i12 = (rectA.left - ((ViewGroup.MarginLayoutParams) eVar).leftMargin) - eVar.f22435i) >= (i13 = rect.left)) {
                z11 = false;
            } else {
                S(view, i13 - i12);
                z11 = true;
            }
            if ((iB & 5) != 5 || (width = ((getWidth() - rectA.right) - ((ViewGroup.MarginLayoutParams) eVar).rightMargin) + eVar.f22435i) >= (i11 = rect.right)) {
                z12 = z11;
            } else {
                S(view, width - i11);
            }
            if (!z12) {
                S(view, 0);
            }
            M(rectA);
        }
    }

    public void E(View view, int i10) {
        b bVarE;
        e eVar = (e) view.getLayoutParams();
        if (eVar.f22437k != null) {
            Rect rectA = a();
            Rect rectA2 = a();
            Rect rectA3 = a();
            r(eVar.f22437k, rectA);
            p(view, false, rectA2);
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            t(view, i10, rectA, rectA3, eVar, measuredWidth, measuredHeight);
            boolean z10 = (rectA3.left == rectA2.left && rectA3.top == rectA2.top) ? false : true;
            d(eVar, rectA3, measuredWidth, measuredHeight);
            int i11 = rectA3.left - rectA2.left;
            int i12 = rectA3.top - rectA2.top;
            if (i11 != 0) {
                E.Q(view, i11);
            }
            if (i12 != 0) {
                E.R(view, i12);
            }
            if (z10 && (bVarE = eVar.e()) != null) {
                bVarE.h(this, view, eVar.f22437k);
            }
            M(rectA);
            M(rectA2);
            M(rectA3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00ca  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void F(int r18) {
        /*
            Method dump skipped, instruction units count: 273
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.F(int):void");
    }

    public void G(View view, int i10) {
        e eVar = (e) view.getLayoutParams();
        if (eVar.a()) {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        }
        View view2 = eVar.f22437k;
        if (view2 != null) {
            B(view, view2, i10);
            return;
        }
        int i11 = eVar.f22431e;
        if (i11 >= 0) {
            C(view, i11, i10);
        } else {
            A(view, i10);
        }
    }

    public void H(View view, int i10, int i11, int i12, int i13) {
        measureChildWithMargins(view, i10, i11, i12, i13);
    }

    public final boolean J(MotionEvent motionEvent, int i10) {
        int actionMasked = motionEvent.getActionMasked();
        List list = this.f22407c;
        x(list);
        int size = list.size();
        MotionEvent motionEventObtain = null;
        boolean zK = false;
        boolean z10 = false;
        for (int i11 = 0; i11 < size; i11++) {
            View view = (View) list.get(i11);
            e eVar = (e) view.getLayoutParams();
            b bVarE = eVar.e();
            if (!(zK || z10) || actionMasked == 0) {
                if (!zK && bVarE != null) {
                    if (i10 == 0) {
                        zK = bVarE.k(this, view, motionEvent);
                    } else if (i10 == 1) {
                        zK = bVarE.D(this, view, motionEvent);
                    }
                    if (zK) {
                        this.f22415k = view;
                    }
                }
                boolean zC = eVar.c();
                boolean zH = eVar.h(this, view);
                z10 = zH && !zC;
                if (zH && !z10) {
                    break;
                }
            } else if (bVarE != null) {
                if (motionEventObtain == null) {
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                }
                if (i10 == 0) {
                    bVarE.k(this, view, motionEventObtain);
                } else if (i10 == 1) {
                    bVarE.D(this, view, motionEventObtain);
                }
            }
        }
        list.clear();
        return zK;
    }

    public final void K() {
        this.f22405a.clear();
        this.f22406b.c();
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            e eVarW = w(childAt);
            eVarW.d(this, childAt);
            this.f22406b.b(childAt);
            for (int i11 = 0; i11 < childCount; i11++) {
                if (i11 != i10) {
                    View childAt2 = getChildAt(i11);
                    if (eVarW.b(this, childAt, childAt2)) {
                        if (!this.f22406b.d(childAt2)) {
                            this.f22406b.b(childAt2);
                        }
                        this.f22406b.a(childAt2, childAt);
                    }
                }
            }
        }
        this.f22405a.addAll(this.f22406b.h());
        Collections.reverse(this.f22405a);
    }

    public void L(View view, Rect rect) {
        ((e) view.getLayoutParams()).p(rect);
    }

    public void N() {
        if (this.f22413i && this.f22417m != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f22417m);
        }
        this.f22418n = false;
    }

    public final void O(boolean z10) {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            b bVarE = ((e) childAt.getLayoutParams()).e();
            if (bVarE != null) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z10) {
                    bVarE.k(this, childAt, motionEventObtain);
                } else {
                    bVarE.D(this, childAt, motionEventObtain);
                }
                motionEventObtain.recycle();
            }
        }
        for (int i11 = 0; i11 < childCount; i11++) {
            ((e) getChildAt(i11).getLayoutParams()).l();
        }
        this.f22415k = null;
        this.f22412h = false;
    }

    public final void S(View view, int i10) {
        e eVar = (e) view.getLayoutParams();
        int i11 = eVar.f22435i;
        if (i11 != i10) {
            E.Q(view, i10 - i11);
            eVar.f22435i = i10;
        }
    }

    public final void T(View view, int i10) {
        e eVar = (e) view.getLayoutParams();
        int i11 = eVar.f22436j;
        if (i11 != i10) {
            E.R(view, i10 - i11);
            eVar.f22436j = i10;
        }
    }

    public final S U(S s10) {
        if (X0.c.a(this.f22419o, s10)) {
            return s10;
        }
        this.f22419o = s10;
        boolean z10 = false;
        boolean z11 = s10 != null && s10.k() > 0;
        this.f22420p = z11;
        if (!z11 && getBackground() == null) {
            z10 = true;
        }
        setWillNotDraw(z10);
        S sE = e(s10);
        requestLayout();
        return sE;
    }

    public final void V() {
        if (!E.t(this)) {
            E.q0(this, null);
            return;
        }
        if (this.f22423s == null) {
            this.f22423s = new a();
        }
        E.q0(this, this.f22423s);
        setSystemUiVisibility(PlatformPlugin.DEFAULT_SYSTEM_UI);
    }

    public void b() {
        if (this.f22413i) {
            if (this.f22417m == null) {
                this.f22417m = new f();
            }
            getViewTreeObserver().addOnPreDrawListener(this.f22417m);
        }
        this.f22418n = true;
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof e) && super.checkLayoutParams(layoutParams);
    }

    public final void d(e eVar, Rect rect, int i10, int i11) {
        int width = getWidth();
        int height = getHeight();
        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) eVar).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i10) - ((ViewGroup.MarginLayoutParams) eVar).rightMargin));
        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) eVar).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i11) - ((ViewGroup.MarginLayoutParams) eVar).bottomMargin));
        rect.set(iMax, iMax2, i10 + iMax, i11 + iMax2);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x008f  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean drawChild(android.graphics.Canvas r17, android.view.View r18, long r19) {
        /*
            r16 = this;
            r0 = r16
            r1 = r18
            android.view.ViewGroup$LayoutParams r2 = r1.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$e r2 = (androidx.coordinatorlayout.widget.CoordinatorLayout.e) r2
            androidx.coordinatorlayout.widget.CoordinatorLayout$b r3 = r2.f22427a
            if (r3 == 0) goto L8f
            float r3 = r3.d(r0, r1)
            r4 = 0
            int r4 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r4 <= 0) goto L8f
            android.graphics.Paint r4 = r0.f22409e
            if (r4 != 0) goto L22
            android.graphics.Paint r4 = new android.graphics.Paint
            r4.<init>()
            r0.f22409e = r4
        L22:
            android.graphics.Paint r4 = r0.f22409e
            androidx.coordinatorlayout.widget.CoordinatorLayout$b r2 = r2.f22427a
            int r2 = r2.c(r0, r1)
            r4.setColor(r2)
            android.graphics.Paint r2 = r0.f22409e
            r4 = 1132396544(0x437f0000, float:255.0)
            float r3 = r3 * r4
            int r3 = java.lang.Math.round(r3)
            r4 = 0
            r5 = 255(0xff, float:3.57E-43)
            int r3 = c(r3, r4, r5)
            r2.setAlpha(r3)
            int r2 = r17.save()
            boolean r3 = r1.isOpaque()
            if (r3 == 0) goto L65
            int r3 = r1.getLeft()
            float r5 = (float) r3
            int r3 = r1.getTop()
            float r6 = (float) r3
            int r3 = r1.getRight()
            float r7 = (float) r3
            int r3 = r1.getBottom()
            float r8 = (float) r3
            android.graphics.Region$Op r9 = android.graphics.Region.Op.DIFFERENCE
            r4 = r17
            r4.clipRect(r5, r6, r7, r8, r9)
        L65:
            int r3 = r0.getPaddingLeft()
            float r11 = (float) r3
            int r3 = r0.getPaddingTop()
            float r12 = (float) r3
            int r3 = r0.getWidth()
            int r4 = r0.getPaddingRight()
            int r3 = r3 - r4
            float r13 = (float) r3
            int r3 = r0.getHeight()
            int r4 = r0.getPaddingBottom()
            int r3 = r3 - r4
            float r14 = (float) r3
            android.graphics.Paint r15 = r0.f22409e
            r10 = r17
            r10.drawRect(r11, r12, r13, r14, r15)
            r4 = r10
            r4.restoreToCount(r2)
            goto L91
        L8f:
            r4 = r17
        L91:
            boolean r0 = super.drawChild(r17, r18, r19)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.drawChild(android.graphics.Canvas, android.view.View, long):boolean");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f22421q;
        if ((drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState)) {
            invalidate();
        }
    }

    public final S e(S s10) {
        b bVarE;
        if (s10.n()) {
            return s10;
        }
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (E.t(childAt) && (bVarE = ((e) childAt.getLayoutParams()).e()) != null) {
                s10 = bVarE.f(this, childAt, s10);
                if (s10.n()) {
                    return s10;
                }
            }
        }
        return s10;
    }

    public void f() {
        int childCount = getChildCount();
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (i10 >= childCount) {
                break;
            }
            if (y(getChildAt(i10))) {
                z10 = true;
                break;
            }
            i10++;
        }
        if (z10 != this.f22418n) {
            if (z10) {
                b();
            } else {
                N();
            }
        }
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public e generateDefaultLayoutParams() {
        return new e(-2, -2);
    }

    public final List<View> getDependencySortedChildren() {
        K();
        return Collections.unmodifiableList(this.f22405a);
    }

    public final S getLastWindowInsets() {
        return this.f22419o;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.f22424t.a();
    }

    public Drawable getStatusBarBackground() {
        return this.f22421q;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingTop() + getPaddingBottom());
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingLeft() + getPaddingRight());
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public e generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    @Override // Y0.InterfaceC2565t
    public void i(View view, View view2, int i10, int i11) {
        b bVarE;
        CoordinatorLayout coordinatorLayout;
        View view3;
        View view4;
        int i12;
        int i13;
        this.f22424t.c(view, view2, i10, i11);
        this.f22416l = view2;
        int childCount = getChildCount();
        int i14 = 0;
        while (i14 < childCount) {
            View childAt = this.getChildAt(i14);
            e eVar = (e) childAt.getLayoutParams();
            if (eVar.i(i11) && (bVarE = eVar.e()) != null) {
                coordinatorLayout = this;
                view3 = view;
                view4 = view2;
                i12 = i10;
                i13 = i11;
                bVarE.v(coordinatorLayout, childAt, view3, view4, i12, i13);
            } else {
                coordinatorLayout = this;
                view3 = view;
                view4 = view2;
                i12 = i10;
                i13 = i11;
            }
            i14++;
            this = coordinatorLayout;
            view = view3;
            view2 = view4;
            i10 = i12;
            i11 = i13;
        }
    }

    @Override // Y0.InterfaceC2565t
    public void j(View view, int i10) {
        this.f22424t.e(view, i10);
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            e eVar = (e) childAt.getLayoutParams();
            if (eVar.i(i10)) {
                b bVarE = eVar.e();
                if (bVarE != null) {
                    bVarE.C(this, childAt, view, i10);
                }
                eVar.k(i10);
                eVar.j();
            }
        }
        this.f22416l = null;
    }

    @Override // Y0.InterfaceC2565t
    public void k(View view, int i10, int i11, int[] iArr, int i12) {
        b bVarE;
        int childCount = getChildCount();
        boolean z10 = false;
        int iMax = 0;
        int iMax2 = 0;
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                if (eVar.i(i12) && (bVarE = eVar.e()) != null) {
                    int[] iArr2 = this.f22410f;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    bVarE.q(this, childAt, view, i10, i11, iArr2, i12);
                    int[] iArr3 = this.f22410f;
                    iMax = i10 > 0 ? Math.max(iMax, iArr3[0]) : Math.min(iMax, iArr3[0]);
                    int[] iArr4 = this.f22410f;
                    iMax2 = i11 > 0 ? Math.max(iMax2, iArr4[1]) : Math.min(iMax2, iArr4[1]);
                    z10 = true;
                }
            }
        }
        iArr[0] = iMax;
        iArr[1] = iMax2;
        if (z10) {
            F(1);
        }
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public e generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof e ? new e((e) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new e((ViewGroup.MarginLayoutParams) layoutParams) : new e(layoutParams);
    }

    @Override // Y0.u
    public void m(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        b bVarE;
        int childCount = getChildCount();
        boolean z10 = false;
        int iMax = 0;
        int iMax2 = 0;
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt = getChildAt(i15);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                if (eVar.i(i14) && (bVarE = eVar.e()) != null) {
                    int[] iArr2 = this.f22410f;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    bVarE.t(this, childAt, view, i10, i11, i12, i13, i14, iArr2);
                    int[] iArr3 = this.f22410f;
                    iMax = i12 > 0 ? Math.max(iMax, iArr3[0]) : Math.min(iMax, iArr3[0]);
                    int[] iArr4 = this.f22410f;
                    iMax2 = i13 > 0 ? Math.max(iMax2, iArr4[1]) : Math.min(iMax2, iArr4[1]);
                    z10 = true;
                }
            }
        }
        iArr[0] = iArr[0] + iMax;
        iArr[1] = iArr[1] + iMax2;
        if (z10) {
            F(1);
        }
    }

    @Override // Y0.InterfaceC2565t
    public void n(View view, int i10, int i11, int i12, int i13, int i14) {
        m(view, i10, i11, i12, i13, 0, this.f22411g);
    }

    @Override // Y0.InterfaceC2565t
    public boolean o(View view, View view2, int i10, int i11) {
        int childCount = getChildCount();
        boolean z10 = false;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                b bVarE = eVar.e();
                if (bVarE != null) {
                    boolean zA = bVarE.A(this, childAt, view, view2, i10, i11);
                    z10 |= zA;
                    eVar.q(i11, zA);
                } else {
                    eVar.q(i11, false);
                }
            }
        }
        return z10;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        O(false);
        if (this.f22418n) {
            if (this.f22417m == null) {
                this.f22417m = new f();
            }
            getViewTreeObserver().addOnPreDrawListener(this.f22417m);
        }
        if (this.f22419o == null && E.t(this)) {
            E.c0(this);
        }
        this.f22413i = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        O(false);
        if (this.f22418n && this.f22417m != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f22417m);
        }
        View view = this.f22416l;
        if (view != null) {
            onStopNestedScroll(view);
        }
        this.f22413i = false;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.f22420p || this.f22421q == null) {
            return;
        }
        S s10 = this.f22419o;
        int iK = s10 != null ? s10.k() : 0;
        if (iK > 0) {
            this.f22421q.setBounds(0, 0, getWidth(), iK);
            this.f22421q.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            O(true);
        }
        boolean zJ = J(motionEvent, 0);
        if (actionMasked != 1 && actionMasked != 3) {
            return zJ;
        }
        O(true);
        return zJ;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        b bVarE;
        int iW = E.w(this);
        int size = this.f22405a.size();
        for (int i14 = 0; i14 < size; i14++) {
            View view = (View) this.f22405a.get(i14);
            if (view.getVisibility() != 8 && ((bVarE = ((e) view.getLayoutParams()).e()) == null || !bVarE.l(this, view, iW))) {
                G(view, iW);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x012f  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMeasure(int r27, int r28) {
        /*
            Method dump skipped, instruction units count: 411
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onMeasure(int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0015  */
    @Override // android.view.ViewGroup, android.view.ViewParent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onNestedFling(android.view.View r12, float r13, float r14, boolean r15) {
        /*
            r11 = this;
            int r0 = r11.getChildCount()
            r1 = 0
            r2 = r1
            r3 = r2
        L7:
            if (r2 >= r0) goto L40
            android.view.View r6 = r11.getChildAt(r2)
            int r4 = r6.getVisibility()
            r5 = 8
            if (r4 != r5) goto L1b
        L15:
            r5 = r11
            r7 = r12
            r8 = r13
            r9 = r14
            r10 = r15
            goto L38
        L1b:
            android.view.ViewGroup$LayoutParams r4 = r6.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$e r4 = (androidx.coordinatorlayout.widget.CoordinatorLayout.e) r4
            boolean r5 = r4.i(r1)
            if (r5 != 0) goto L28
            goto L15
        L28:
            androidx.coordinatorlayout.widget.CoordinatorLayout$b r4 = r4.e()
            if (r4 == 0) goto L15
            r5 = r11
            r7 = r12
            r8 = r13
            r9 = r14
            r10 = r15
            boolean r11 = r4.n(r5, r6, r7, r8, r9, r10)
            r3 = r3 | r11
        L38:
            int r2 = r2 + 1
            r11 = r5
            r12 = r7
            r13 = r8
            r14 = r9
            r15 = r10
            goto L7
        L40:
            r5 = r11
            if (r3 == 0) goto L47
            r11 = 1
            r5.F(r11)
        L47:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onNestedFling(android.view.View, float, float, boolean):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0015  */
    @Override // android.view.ViewGroup, android.view.ViewParent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onNestedPreFling(android.view.View r11, float r12, float r13) {
        /*
            r10 = this;
            int r0 = r10.getChildCount()
            r1 = 0
            r2 = r1
            r3 = r2
        L7:
            if (r2 >= r0) goto L3d
            android.view.View r6 = r10.getChildAt(r2)
            int r4 = r6.getVisibility()
            r5 = 8
            if (r4 != r5) goto L1a
        L15:
            r5 = r10
            r7 = r11
            r8 = r12
            r9 = r13
            goto L36
        L1a:
            android.view.ViewGroup$LayoutParams r4 = r6.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$e r4 = (androidx.coordinatorlayout.widget.CoordinatorLayout.e) r4
            boolean r5 = r4.i(r1)
            if (r5 != 0) goto L27
            goto L15
        L27:
            androidx.coordinatorlayout.widget.CoordinatorLayout$b r4 = r4.e()
            if (r4 == 0) goto L15
            r5 = r10
            r7 = r11
            r8 = r12
            r9 = r13
            boolean r10 = r4.o(r5, r6, r7, r8, r9)
            r3 = r3 | r10
        L36:
            int r2 = r2 + 1
            r10 = r5
            r11 = r7
            r12 = r8
            r13 = r9
            goto L7
        L3d:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onNestedPreFling(android.view.View, float, float):boolean");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
        k(view, i10, i11, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        n(view, i10, i11, i12, i13, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i10) {
        i(view, view2, i10, 0);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof g)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        g gVar = (g) parcelable;
        super.onRestoreInstanceState(gVar.a());
        SparseArray sparseArray = gVar.f22446c;
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            int id2 = childAt.getId();
            b bVarE = w(childAt).e();
            if (id2 != -1 && bVarE != null && (parcelable2 = (Parcelable) sparseArray.get(id2)) != null) {
                bVarE.x(this, childAt, parcelable2);
            }
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        Parcelable parcelableY;
        g gVar = new g(super.onSaveInstanceState());
        SparseArray sparseArray = new SparseArray();
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            int id2 = childAt.getId();
            b bVarE = ((e) childAt.getLayoutParams()).e();
            if (id2 != -1 && bVarE != null && (parcelableY = bVarE.y(this, childAt)) != null) {
                sparseArray.append(id2, parcelableY);
            }
        }
        gVar.f22446c = sparseArray;
        return gVar;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i10) {
        return o(view, view2, i10, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        j(view, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015 A[PHI: r3
      0x0015: PHI (r3v4 boolean) = (r3v2 boolean), (r3v5 boolean) binds: [B:10:0x0024, B:5:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            int r2 = r1.getActionMasked()
            android.view.View r3 = r0.f22415k
            r4 = 1
            r5 = 0
            if (r3 != 0) goto L17
            boolean r3 = r0.J(r1, r4)
            if (r3 == 0) goto L15
            goto L18
        L15:
            r6 = r5
            goto L2c
        L17:
            r3 = r5
        L18:
            android.view.View r6 = r0.f22415k
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$e r6 = (androidx.coordinatorlayout.widget.CoordinatorLayout.e) r6
            androidx.coordinatorlayout.widget.CoordinatorLayout$b r6 = r6.e()
            if (r6 == 0) goto L15
            android.view.View r7 = r0.f22415k
            boolean r6 = r6.D(r0, r7, r1)
        L2c:
            android.view.View r7 = r0.f22415k
            r8 = 0
            if (r7 != 0) goto L37
            boolean r1 = super.onTouchEvent(r18)
            r6 = r6 | r1
            goto L4a
        L37:
            if (r3 == 0) goto L4a
            long r9 = android.os.SystemClock.uptimeMillis()
            r15 = 0
            r16 = 0
            r13 = 3
            r14 = 0
            r11 = r9
            android.view.MotionEvent r8 = android.view.MotionEvent.obtain(r9, r11, r13, r14, r15, r16)
            super.onTouchEvent(r8)
        L4a:
            if (r8 == 0) goto L4f
            r8.recycle()
        L4f:
            if (r2 == r4) goto L56
            r1 = 3
            if (r2 != r1) goto L55
            goto L56
        L55:
            return r6
        L56:
            r0.O(r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void p(View view, boolean z10, Rect rect) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z10) {
            r(view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    public List q(View view) {
        List listG = this.f22406b.g(view);
        this.f22408d.clear();
        if (listG != null) {
            this.f22408d.addAll(listG);
        }
        return this.f22408d;
    }

    public void r(View view, Rect rect) {
        J0.b.a(this, view, rect);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        b bVarE = ((e) view.getLayoutParams()).e();
        if (bVarE == null || !bVarE.w(this, view, rect, z10)) {
            return super.requestChildRectangleOnScreen(view, rect, z10);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z10) {
        super.requestDisallowInterceptTouchEvent(z10);
        if (!z10 || this.f22412h) {
            return;
        }
        O(false);
        this.f22412h = true;
    }

    public void s(View view, int i10, Rect rect, Rect rect2) {
        e eVar = (e) view.getLayoutParams();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        t(view, i10, rect, rect2, eVar, measuredWidth, measuredHeight);
        d(eVar, rect2, measuredWidth, measuredHeight);
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z10) {
        super.setFitsSystemWindows(z10);
        V();
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f22422r = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        Drawable drawable2 = this.f22421q;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.f22421q = drawableMutate;
            if (drawableMutate != null) {
                if (drawableMutate.isStateful()) {
                    this.f22421q.setState(getDrawableState());
                }
                P0.a.g(this.f22421q, E.w(this));
                this.f22421q.setVisible(getVisibility() == 0, false);
                this.f22421q.setCallback(this);
            }
            E.W(this);
        }
    }

    public void setStatusBarBackgroundColor(int i10) {
        setStatusBarBackground(new ColorDrawable(i10));
    }

    public void setStatusBarBackgroundResource(int i10) {
        setStatusBarBackground(i10 != 0 ? L0.a.f(getContext(), i10) : null);
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        boolean z10 = i10 == 0;
        Drawable drawable = this.f22421q;
        if (drawable == null || drawable.isVisible() == z10) {
            return;
        }
        this.f22421q.setVisible(z10, false);
    }

    public final void t(View view, int i10, Rect rect, Rect rect2, e eVar, int i11, int i12) {
        int iB = AbstractC2554h.b(P(eVar.f22429c), i10);
        int iB2 = AbstractC2554h.b(Q(eVar.f22430d), i10);
        int i13 = iB & 7;
        int i14 = iB & 112;
        int i15 = iB2 & 7;
        int i16 = iB2 & 112;
        int iWidth = i15 != 1 ? i15 != 5 ? rect.left : rect.right : rect.left + (rect.width() / 2);
        int iHeight = i16 != 16 ? i16 != 80 ? rect.top : rect.bottom : rect.top + (rect.height() / 2);
        if (i13 == 1) {
            iWidth -= i11 / 2;
        } else if (i13 != 5) {
            iWidth -= i11;
        }
        if (i14 == 16) {
            iHeight -= i12 / 2;
        } else if (i14 != 80) {
            iHeight -= i12;
        }
        rect2.set(iWidth, iHeight, i11 + iWidth, i12 + iHeight);
    }

    public final int u(int i10) {
        int[] iArr = this.f22414j;
        if (iArr == null) {
            Log.e("CoordinatorLayout", "No keylines defined for " + this + " - attempted index lookup " + i10);
            return 0;
        }
        if (i10 >= 0 && i10 < iArr.length) {
            return iArr[i10];
        }
        Log.e("CoordinatorLayout", "Keyline index " + i10 + " out of range for " + this);
        return 0;
    }

    public void v(View view, Rect rect) {
        rect.set(((e) view.getLayoutParams()).g());
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f22421q;
    }

    public e w(View view) {
        e eVar = (e) view.getLayoutParams();
        if (!eVar.f22428b) {
            c cVar = null;
            for (Class<?> superclass = view.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
                cVar = (c) superclass.getAnnotation(c.class);
                if (cVar != null) {
                    break;
                }
            }
            if (cVar != null) {
                try {
                    eVar.n((b) cVar.value().getDeclaredConstructor(null).newInstance(null));
                } catch (Exception e10) {
                    Log.e("CoordinatorLayout", "Default behavior class " + cVar.value().getName() + " could not be instantiated. Did you forget a default constructor?", e10);
                }
            }
            eVar.f22428b = true;
        }
        return eVar;
    }

    public final void x(List list) {
        list.clear();
        boolean zIsChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i10 = childCount - 1; i10 >= 0; i10--) {
            list.add(getChildAt(zIsChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i10) : i10));
        }
        Comparator comparator = f22403x;
        if (comparator != null) {
            Collections.sort(list, comparator);
        }
    }

    public final boolean y(View view) {
        return this.f22406b.i(view);
    }

    public boolean z(View view, int i10, int i11) {
        Rect rectA = a();
        r(view, rectA);
        try {
            return rectA.contains(i10, i11);
        } finally {
            M(rectA);
        }
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet, int i10) {
        CoordinatorLayout coordinatorLayout;
        Context context2;
        super(context, attributeSet, i10);
        this.f22405a = new ArrayList();
        this.f22406b = new J0.a();
        this.f22407c = new ArrayList();
        this.f22408d = new ArrayList();
        this.f22410f = new int[2];
        this.f22411g = new int[2];
        this.f22424t = new v(this);
        TypedArray typedArrayObtainStyledAttributes = i10 == 0 ? context.obtainStyledAttributes(attributeSet, I0.c.f5396b, 0, I0.b.f5394a) : context.obtainStyledAttributes(attributeSet, I0.c.f5396b, i10, 0);
        if (i10 == 0) {
            coordinatorLayout = this;
            context2 = context;
            coordinatorLayout.saveAttributeDataForStyleable(context2, I0.c.f5396b, attributeSet, typedArrayObtainStyledAttributes, 0, I0.b.f5394a);
        } else {
            coordinatorLayout = this;
            context2 = context;
            coordinatorLayout.saveAttributeDataForStyleable(context2, I0.c.f5396b, attributeSet, typedArrayObtainStyledAttributes, i10, 0);
        }
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(I0.c.f5397c, 0);
        if (resourceId != 0) {
            Resources resources = context2.getResources();
            coordinatorLayout.f22414j = resources.getIntArray(resourceId);
            float f10 = resources.getDisplayMetrics().density;
            int length = coordinatorLayout.f22414j.length;
            for (int i11 = 0; i11 < length; i11++) {
                coordinatorLayout.f22414j[i11] = (int) (r11[i11] * f10);
            }
        }
        coordinatorLayout.f22421q = typedArrayObtainStyledAttributes.getDrawable(I0.c.f5398d);
        typedArrayObtainStyledAttributes.recycle();
        coordinatorLayout.V();
        super.setOnHierarchyChangeListener(coordinatorLayout.new d());
        if (E.u(coordinatorLayout) == 0) {
            E.n0(coordinatorLayout, 1);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class g extends AbstractC3806a {
        public static final Parcelable.Creator<g> CREATOR = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public SparseArray f22446c;

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static class a implements Parcelable.ClassLoaderCreator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public g createFromParcel(Parcel parcel) {
                return new g(parcel, null);
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
            int i10 = parcel.readInt();
            int[] iArr = new int[i10];
            parcel.readIntArray(iArr);
            Parcelable[] parcelableArray = parcel.readParcelableArray(classLoader);
            this.f22446c = new SparseArray(i10);
            for (int i11 = 0; i11 < i10; i11++) {
                this.f22446c.append(iArr[i11], parcelableArray[i11]);
            }
        }

        @Override // d1.AbstractC3806a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            SparseArray sparseArray = this.f22446c;
            int size = sparseArray != null ? sparseArray.size() : 0;
            parcel.writeInt(size);
            int[] iArr = new int[size];
            Parcelable[] parcelableArr = new Parcelable[size];
            for (int i11 = 0; i11 < size; i11++) {
                iArr[i11] = this.f22446c.keyAt(i11);
                parcelableArr[i11] = (Parcelable) this.f22446c.valueAt(i11);
            }
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i10);
        }

        public g(Parcelable parcelable) {
            super(parcelable);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class e extends ViewGroup.MarginLayoutParams {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public b f22427a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f22428b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f22429c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f22430d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f22431e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f22432f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f22433g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f22434h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f22435i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f22436j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public View f22437k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public View f22438l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public boolean f22439m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public boolean f22440n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public boolean f22441o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public boolean f22442p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public final Rect f22443q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public Object f22444r;

        public e(int i10, int i11) {
            super(i10, i11);
            this.f22428b = false;
            this.f22429c = 0;
            this.f22430d = 0;
            this.f22431e = -1;
            this.f22432f = -1;
            this.f22433g = 0;
            this.f22434h = 0;
            this.f22443q = new Rect();
        }

        public boolean a() {
            return this.f22437k == null && this.f22432f != -1;
        }

        public boolean b(CoordinatorLayout coordinatorLayout, View view, View view2) {
            if (view2 == this.f22438l || r(view2, E.w(coordinatorLayout))) {
                return true;
            }
            b bVar = this.f22427a;
            return bVar != null && bVar.e(coordinatorLayout, view, view2);
        }

        public boolean c() {
            if (this.f22427a == null) {
                this.f22439m = false;
            }
            return this.f22439m;
        }

        public View d(CoordinatorLayout coordinatorLayout, View view) {
            if (this.f22432f == -1) {
                this.f22438l = null;
                this.f22437k = null;
                return null;
            }
            if (this.f22437k == null || !s(view, coordinatorLayout)) {
                m(view, coordinatorLayout);
            }
            return this.f22437k;
        }

        public b e() {
            return this.f22427a;
        }

        public boolean f() {
            return this.f22442p;
        }

        public Rect g() {
            return this.f22443q;
        }

        public boolean h(CoordinatorLayout coordinatorLayout, View view) {
            boolean z10 = this.f22439m;
            if (z10) {
                return true;
            }
            b bVar = this.f22427a;
            boolean zA = (bVar != null ? bVar.a(coordinatorLayout, view) : false) | z10;
            this.f22439m = zA;
            return zA;
        }

        public boolean i(int i10) {
            if (i10 == 0) {
                return this.f22440n;
            }
            if (i10 != 1) {
                return false;
            }
            return this.f22441o;
        }

        public void j() {
            this.f22442p = false;
        }

        public void k(int i10) {
            q(i10, false);
        }

        public void l() {
            this.f22439m = false;
        }

        public final void m(View view, CoordinatorLayout coordinatorLayout) {
            View viewFindViewById = coordinatorLayout.findViewById(this.f22432f);
            this.f22437k = viewFindViewById;
            if (viewFindViewById == null) {
                if (coordinatorLayout.isInEditMode()) {
                    this.f22438l = null;
                    this.f22437k = null;
                    return;
                }
                throw new IllegalStateException("Could not find CoordinatorLayout descendant view with id " + coordinatorLayout.getResources().getResourceName(this.f22432f) + " to anchor view " + view);
            }
            if (viewFindViewById == coordinatorLayout) {
                if (!coordinatorLayout.isInEditMode()) {
                    throw new IllegalStateException("View can not be anchored to the the parent CoordinatorLayout");
                }
                this.f22438l = null;
                this.f22437k = null;
                return;
            }
            for (ViewParent parent = viewFindViewById.getParent(); parent != coordinatorLayout && parent != null; parent = parent.getParent()) {
                if (parent == view) {
                    if (!coordinatorLayout.isInEditMode()) {
                        throw new IllegalStateException("Anchor must not be a descendant of the anchored view");
                    }
                    this.f22438l = null;
                    this.f22437k = null;
                    return;
                }
                if (parent instanceof View) {
                    viewFindViewById = parent;
                }
            }
            this.f22438l = viewFindViewById;
        }

        public void n(b bVar) {
            b bVar2 = this.f22427a;
            if (bVar2 != bVar) {
                if (bVar2 != null) {
                    bVar2.j();
                }
                this.f22427a = bVar;
                this.f22444r = null;
                this.f22428b = true;
                if (bVar != null) {
                    bVar.g(this);
                }
            }
        }

        public void o(boolean z10) {
            this.f22442p = z10;
        }

        public void p(Rect rect) {
            this.f22443q.set(rect);
        }

        public void q(int i10, boolean z10) {
            if (i10 == 0) {
                this.f22440n = z10;
            } else {
                if (i10 != 1) {
                    return;
                }
                this.f22441o = z10;
            }
        }

        public final boolean r(View view, int i10) {
            int iB = AbstractC2554h.b(((e) view.getLayoutParams()).f22433g, i10);
            return iB != 0 && (AbstractC2554h.b(this.f22434h, i10) & iB) == iB;
        }

        public final boolean s(View view, CoordinatorLayout coordinatorLayout) {
            if (this.f22437k.getId() != this.f22432f) {
                return false;
            }
            View view2 = this.f22437k;
            for (ViewParent parent = view2.getParent(); parent != coordinatorLayout; parent = parent.getParent()) {
                if (parent == null || parent == view) {
                    this.f22438l = null;
                    this.f22437k = null;
                    return false;
                }
                if (parent instanceof View) {
                    view2 = parent;
                }
            }
            this.f22438l = view2;
            return true;
        }

        public e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f22428b = false;
            this.f22429c = 0;
            this.f22430d = 0;
            this.f22431e = -1;
            this.f22432f = -1;
            this.f22433g = 0;
            this.f22434h = 0;
            this.f22443q = new Rect();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, I0.c.f5399e);
            this.f22429c = typedArrayObtainStyledAttributes.getInteger(I0.c.f5400f, 0);
            this.f22432f = typedArrayObtainStyledAttributes.getResourceId(I0.c.f5401g, -1);
            this.f22430d = typedArrayObtainStyledAttributes.getInteger(I0.c.f5402h, 0);
            this.f22431e = typedArrayObtainStyledAttributes.getInteger(I0.c.f5406l, -1);
            this.f22433g = typedArrayObtainStyledAttributes.getInt(I0.c.f5405k, 0);
            this.f22434h = typedArrayObtainStyledAttributes.getInt(I0.c.f5404j, 0);
            boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(I0.c.f5403i);
            this.f22428b = zHasValue;
            if (zHasValue) {
                this.f22427a = CoordinatorLayout.I(context, attributeSet, typedArrayObtainStyledAttributes.getString(I0.c.f5403i));
            }
            typedArrayObtainStyledAttributes.recycle();
            b bVar = this.f22427a;
            if (bVar != null) {
                bVar.g(this);
            }
        }

        public e(e eVar) {
            super((ViewGroup.MarginLayoutParams) eVar);
            this.f22428b = false;
            this.f22429c = 0;
            this.f22430d = 0;
            this.f22431e = -1;
            this.f22432f = -1;
            this.f22433g = 0;
            this.f22434h = 0;
            this.f22443q = new Rect();
        }

        public e(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f22428b = false;
            this.f22429c = 0;
            this.f22430d = 0;
            this.f22431e = -1;
            this.f22432f = -1;
            this.f22433g = 0;
            this.f22434h = 0;
            this.f22443q = new Rect();
        }

        public e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f22428b = false;
            this.f22429c = 0;
            this.f22430d = 0;
            this.f22431e = -1;
            this.f22432f = -1;
            this.f22433g = 0;
            this.f22434h = 0;
            this.f22443q = new Rect();
        }
    }
}
