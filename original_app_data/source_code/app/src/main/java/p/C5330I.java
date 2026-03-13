package p;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import h.AbstractC4262a;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import k.AbstractC4774a;

/* JADX INFO: renamed from: p.I, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class C5330I extends ListView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Rect f41777a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f41778b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f41779c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f41780d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f41781e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f41782f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public d f41783g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f41784h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f41785i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f41786j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Y0.M f41787k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public c1.f f41788l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public f f41789m;

    /* JADX INFO: renamed from: p.I$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class a {
        public static void a(View view, float f10, float f11) {
            view.drawableHotspotChanged(f10, f11);
        }
    }

    /* JADX INFO: renamed from: p.I$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static Method f41790a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static Method f41791b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static Method f41792c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static boolean f41793d;

        static {
            try {
                Class cls = Integer.TYPE;
                Class cls2 = Boolean.TYPE;
                Class cls3 = Float.TYPE;
                Method declaredMethod = AbsListView.class.getDeclaredMethod("positionSelector", cls, View.class, cls2, cls3, cls3);
                f41790a = declaredMethod;
                declaredMethod.setAccessible(true);
                Method declaredMethod2 = AdapterView.class.getDeclaredMethod("setSelectedPositionInt", cls);
                f41791b = declaredMethod2;
                declaredMethod2.setAccessible(true);
                Method declaredMethod3 = AdapterView.class.getDeclaredMethod("setNextSelectedPositionInt", cls);
                f41792c = declaredMethod3;
                declaredMethod3.setAccessible(true);
                f41793d = true;
            } catch (NoSuchMethodException e10) {
                e10.printStackTrace();
            }
        }

        public static boolean a() {
            return f41793d;
        }

        public static void b(C5330I c5330i, int i10, View view) {
            try {
                f41790a.invoke(c5330i, Integer.valueOf(i10), view, Boolean.FALSE, -1, -1);
                f41791b.invoke(c5330i, Integer.valueOf(i10));
                f41792c.invoke(c5330i, Integer.valueOf(i10));
            } catch (IllegalAccessException e10) {
                e10.printStackTrace();
            } catch (InvocationTargetException e11) {
                e11.printStackTrace();
            }
        }
    }

    /* JADX INFO: renamed from: p.I$c */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class c {
        public static boolean a(AbsListView absListView) {
            return absListView.isSelectedChildViewEnabled();
        }

        public static void b(AbsListView absListView, boolean z10) {
            absListView.setSelectedChildViewEnabled(z10);
        }
    }

    /* JADX INFO: renamed from: p.I$d */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class d extends AbstractC4774a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f41794b;

        public d(Drawable drawable) {
            super(drawable);
            this.f41794b = true;
        }

        public void b(boolean z10) {
            this.f41794b = z10;
        }

        @Override // k.AbstractC4774a, android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
            if (this.f41794b) {
                super.draw(canvas);
            }
        }

        @Override // k.AbstractC4774a, android.graphics.drawable.Drawable
        public void setHotspot(float f10, float f11) {
            if (this.f41794b) {
                super.setHotspot(f10, f11);
            }
        }

        @Override // k.AbstractC4774a, android.graphics.drawable.Drawable
        public void setHotspotBounds(int i10, int i11, int i12, int i13) {
            if (this.f41794b) {
                super.setHotspotBounds(i10, i11, i12, i13);
            }
        }

        @Override // k.AbstractC4774a, android.graphics.drawable.Drawable
        public boolean setState(int[] iArr) {
            if (this.f41794b) {
                return super.setState(iArr);
            }
            return false;
        }

        @Override // k.AbstractC4774a, android.graphics.drawable.Drawable
        public boolean setVisible(boolean z10, boolean z11) {
            if (this.f41794b) {
                return super.setVisible(z10, z11);
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: p.I$e */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Field f41795a;

        static {
            Field declaredField = null;
            try {
                declaredField = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e10) {
                e10.printStackTrace();
            }
            f41795a = declaredField;
        }

        public static boolean a(AbsListView absListView) {
            Field field = f41795a;
            if (field == null) {
                return false;
            }
            try {
                return field.getBoolean(absListView);
            } catch (IllegalAccessException e10) {
                e10.printStackTrace();
                return false;
            }
        }

        public static void b(AbsListView absListView, boolean z10) {
            Field field = f41795a;
            if (field != null) {
                try {
                    field.set(absListView, Boolean.valueOf(z10));
                } catch (IllegalAccessException e10) {
                    e10.printStackTrace();
                }
            }
        }
    }

    /* JADX INFO: renamed from: p.I$f */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class f implements Runnable {
        public f() {
        }

        public void a() {
            C5330I c5330i = C5330I.this;
            c5330i.f41789m = null;
            c5330i.removeCallbacks(this);
        }

        public void b() {
            C5330I.this.post(this);
        }

        @Override // java.lang.Runnable
        public void run() {
            C5330I c5330i = C5330I.this;
            c5330i.f41789m = null;
            c5330i.drawableStateChanged();
        }
    }

    public C5330I(Context context, boolean z10) {
        super(context, null, AbstractC4262a.f35815x);
        this.f41777a = new Rect();
        this.f41778b = 0;
        this.f41779c = 0;
        this.f41780d = 0;
        this.f41781e = 0;
        this.f41785i = z10;
        setCacheColorHint(0);
    }

    public final void a() {
        this.f41786j = false;
        setPressed(false);
        drawableStateChanged();
        View childAt = getChildAt(this.f41782f - getFirstVisiblePosition());
        if (childAt != null) {
            childAt.setPressed(false);
        }
        Y0.M m10 = this.f41787k;
        if (m10 != null) {
            m10.c();
            this.f41787k = null;
        }
    }

    public final void b(View view, int i10) {
        performItemClick(view, i10, getItemIdAtPosition(i10));
    }

    public final void c(Canvas canvas) {
        Drawable selector;
        if (this.f41777a.isEmpty() || (selector = getSelector()) == null) {
            return;
        }
        selector.setBounds(this.f41777a);
        selector.draw(canvas);
    }

    public int d(int i10, int i11, int i12, int i13, int i14) {
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        int measuredHeight = listPaddingTop + listPaddingBottom;
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        View view = null;
        while (i15 < count) {
            int itemViewType = adapter.getItemViewType(i15);
            if (itemViewType != i16) {
                view = null;
                i16 = itemViewType;
            }
            view = adapter.getView(i15, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i18 = layoutParams.height;
            view.measure(i10, i18 > 0 ? View.MeasureSpec.makeMeasureSpec(i18, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i15 > 0) {
                measuredHeight += dividerHeight;
            }
            measuredHeight += view.getMeasuredHeight();
            if (measuredHeight >= i13) {
                return (i14 < 0 || i15 <= i14 || i17 <= 0 || measuredHeight == i13) ? i13 : i17;
            }
            if (i14 >= 0 && i15 >= i14) {
                i17 = measuredHeight;
            }
            i15++;
        }
        return measuredHeight;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        c(canvas);
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        if (this.f41789m != null) {
            return;
        }
        super.drawableStateChanged();
        j(true);
        n();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0011  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean e(android.view.MotionEvent r8, int r9) {
        /*
            r7 = this;
            int r0 = r8.getActionMasked()
            r1 = 1
            r2 = 0
            if (r0 == r1) goto L16
            r3 = 2
            if (r0 == r3) goto L14
            r9 = 3
            if (r0 == r9) goto L11
        Le:
            r3 = r1
            r9 = r2
            goto L46
        L11:
            r9 = r2
            r3 = r9
            goto L46
        L14:
            r3 = r1
            goto L17
        L16:
            r3 = r2
        L17:
            int r9 = r8.findPointerIndex(r9)
            if (r9 >= 0) goto L1e
            goto L11
        L1e:
            float r4 = r8.getX(r9)
            int r4 = (int) r4
            float r9 = r8.getY(r9)
            int r9 = (int) r9
            int r5 = r7.pointToPosition(r4, r9)
            r6 = -1
            if (r5 != r6) goto L31
            r9 = r1
            goto L46
        L31:
            int r3 = r7.getFirstVisiblePosition()
            int r3 = r5 - r3
            android.view.View r3 = r7.getChildAt(r3)
            float r4 = (float) r4
            float r9 = (float) r9
            r7.i(r3, r5, r4, r9)
            if (r0 != r1) goto Le
            r7.b(r3, r5)
            goto Le
        L46:
            if (r3 == 0) goto L4a
            if (r9 == 0) goto L4d
        L4a:
            r7.a()
        L4d:
            if (r3 == 0) goto L65
            c1.f r9 = r7.f41788l
            if (r9 != 0) goto L5a
            c1.f r9 = new c1.f
            r9.<init>(r7)
            r7.f41788l = r9
        L5a:
            c1.f r9 = r7.f41788l
            r9.m(r1)
            c1.f r9 = r7.f41788l
            r9.onTouch(r7, r8)
            return r3
        L65:
            c1.f r7 = r7.f41788l
            if (r7 == 0) goto L6c
            r7.m(r2)
        L6c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p.C5330I.e(android.view.MotionEvent, int):boolean");
    }

    public final void f(int i10, View view) {
        Rect rect = this.f41777a;
        rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        rect.left -= this.f41778b;
        rect.top -= this.f41779c;
        rect.right += this.f41780d;
        rect.bottom += this.f41781e;
        boolean zK = k();
        if (view.isEnabled() != zK) {
            l(!zK);
            if (i10 != -1) {
                refreshDrawableState();
            }
        }
    }

    public final void g(int i10, View view) {
        Drawable selector = getSelector();
        boolean z10 = (selector == null || i10 == -1) ? false : true;
        if (z10) {
            selector.setVisible(false, false);
        }
        f(i10, view);
        if (z10) {
            Rect rect = this.f41777a;
            float fExactCenterX = rect.exactCenterX();
            float fExactCenterY = rect.exactCenterY();
            selector.setVisible(getVisibility() == 0, false);
            P0.a.e(selector, fExactCenterX, fExactCenterY);
        }
    }

    public final void h(int i10, View view, float f10, float f11) {
        g(i10, view);
        Drawable selector = getSelector();
        if (selector == null || i10 == -1) {
            return;
        }
        P0.a.e(selector, f10, f11);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean hasFocus() {
        return this.f41785i || super.hasFocus();
    }

    @Override // android.view.View
    public boolean hasWindowFocus() {
        return this.f41785i || super.hasWindowFocus();
    }

    public final void i(View view, int i10, float f10, float f11) {
        View childAt;
        this.f41786j = true;
        a.a(this, f10, f11);
        if (!isPressed()) {
            setPressed(true);
        }
        layoutChildren();
        int i11 = this.f41782f;
        if (i11 != -1 && (childAt = getChildAt(i11 - getFirstVisiblePosition())) != null && childAt != view && childAt.isPressed()) {
            childAt.setPressed(false);
        }
        this.f41782f = i10;
        a.a(view, f10 - view.getLeft(), f11 - view.getTop());
        if (!view.isPressed()) {
            view.setPressed(true);
        }
        h(i10, view, f10, f11);
        j(false);
        refreshDrawableState();
    }

    @Override // android.view.View
    public boolean isFocused() {
        return this.f41785i || super.isFocused();
    }

    @Override // android.view.View
    public boolean isInTouchMode() {
        return (this.f41785i && this.f41784h) || super.isInTouchMode();
    }

    public final void j(boolean z10) {
        d dVar = this.f41783g;
        if (dVar != null) {
            dVar.b(z10);
        }
    }

    public final boolean k() {
        return Build.VERSION.SDK_INT >= 33 ? c.a(this) : e.a(this);
    }

    public final void l(boolean z10) {
        if (Build.VERSION.SDK_INT >= 33) {
            c.b(this, z10);
        } else {
            e.b(this, z10);
        }
    }

    public final boolean m() {
        return this.f41786j;
    }

    public final void n() {
        Drawable selector = getSelector();
        if (selector != null && m() && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        this.f41789m = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f41789m == null) {
            f fVar = new f();
            this.f41789m = fVar;
            fVar.b();
        }
        boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked != 9 && actionMasked != 7) {
            setSelection(-1);
            return zOnHoverEvent;
        }
        int iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        if (iPointToPosition != -1 && iPointToPosition != getSelectedItemPosition()) {
            View childAt = getChildAt(iPointToPosition - getFirstVisiblePosition());
            if (childAt.isEnabled()) {
                requestFocus();
                if (b.a()) {
                    b.b(this, iPointToPosition, childAt);
                } else {
                    setSelectionFromTop(iPointToPosition, childAt.getTop() - getTop());
                }
            }
            n();
        }
        return zOnHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f41782f = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        f fVar = this.f41789m;
        if (fVar != null) {
            fVar.a();
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z10) {
        this.f41784h = z10;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        d dVar = drawable != null ? new d(drawable) : null;
        this.f41783g = dVar;
        super.setSelector(dVar);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f41778b = rect.left;
        this.f41779c = rect.top;
        this.f41780d = rect.right;
        this.f41781e = rect.bottom;
    }
}
