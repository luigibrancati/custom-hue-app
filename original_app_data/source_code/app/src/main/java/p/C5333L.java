package p;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import h.AbstractC4262a;
import o.InterfaceC5183f;

/* JADX INFO: renamed from: p.L, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class C5333L implements InterfaceC5183f {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public Runnable f41808A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final Handler f41809B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final Rect f41810C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public Rect f41811D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public boolean f41812E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public PopupWindow f41813F;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f41814a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ListAdapter f41815b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C5330I f41816c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f41817d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f41818e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f41819f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f41820g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f41821h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f41822i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f41823j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f41824k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f41825l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f41826m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f41827n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f41828o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public View f41829p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f41830q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public DataSetObserver f41831r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public View f41832s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Drawable f41833t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public AdapterView.OnItemClickListener f41834u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public AdapterView.OnItemSelectedListener f41835v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final i f41836w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final h f41837x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final g f41838y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final e f41839z;

    /* JADX INFO: renamed from: p.L$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            View viewS = C5333L.this.s();
            if (viewS == null || viewS.getWindowToken() == null) {
                return;
            }
            C5333L.this.show();
        }
    }

    /* JADX INFO: renamed from: p.L$c */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class c {
        public static int a(PopupWindow popupWindow, View view, int i10, boolean z10) {
            return popupWindow.getMaxAvailableHeight(view, i10, z10);
        }
    }

    /* JADX INFO: renamed from: p.L$d */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class d {
        public static void a(PopupWindow popupWindow, Rect rect) {
            popupWindow.setEpicenterBounds(rect);
        }

        public static void b(PopupWindow popupWindow, boolean z10) {
            popupWindow.setIsClippedToScreen(z10);
        }
    }

    /* JADX INFO: renamed from: p.L$e */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class e implements Runnable {
        public e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C5333L.this.q();
        }
    }

    /* JADX INFO: renamed from: p.L$f */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class f extends DataSetObserver {
        public f() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            if (C5333L.this.a()) {
                C5333L.this.show();
            }
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            C5333L.this.dismiss();
        }
    }

    /* JADX INFO: renamed from: p.L$h */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class h implements View.OnTouchListener {
        public h() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            PopupWindow popupWindow;
            int action = motionEvent.getAction();
            int x10 = (int) motionEvent.getX();
            int y10 = (int) motionEvent.getY();
            if (action == 0 && (popupWindow = C5333L.this.f41813F) != null && popupWindow.isShowing() && x10 >= 0 && x10 < C5333L.this.f41813F.getWidth() && y10 >= 0 && y10 < C5333L.this.f41813F.getHeight()) {
                C5333L c5333l = C5333L.this;
                c5333l.f41809B.postDelayed(c5333l.f41836w, 250L);
                return false;
            }
            if (action != 1) {
                return false;
            }
            C5333L c5333l2 = C5333L.this;
            c5333l2.f41809B.removeCallbacks(c5333l2.f41836w);
            return false;
        }
    }

    /* JADX INFO: renamed from: p.L$i */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class i implements Runnable {
        public i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C5330I c5330i = C5333L.this.f41816c;
            if (c5330i == null || !c5330i.isAttachedToWindow() || C5333L.this.f41816c.getCount() <= C5333L.this.f41816c.getChildCount()) {
                return;
            }
            int childCount = C5333L.this.f41816c.getChildCount();
            C5333L c5333l = C5333L.this;
            if (childCount <= c5333l.f41828o) {
                c5333l.f41813F.setInputMethodMode(2);
                C5333L.this.show();
            }
        }
    }

    public C5333L(Context context) {
        this(context, null, AbstractC4262a.f35783B);
    }

    public boolean A() {
        return this.f41812E;
    }

    public final void B() {
        View view = this.f41829p;
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f41829p);
            }
        }
    }

    public void C(View view) {
        this.f41832s = view;
    }

    public void D(int i10) {
        this.f41813F.setAnimationStyle(i10);
    }

    public void E(int i10) {
        Drawable background = this.f41813F.getBackground();
        if (background == null) {
            P(i10);
            return;
        }
        background.getPadding(this.f41810C);
        Rect rect = this.f41810C;
        this.f41818e = rect.left + rect.right + i10;
    }

    public void F(int i10) {
        this.f41825l = i10;
    }

    public void G(Rect rect) {
        this.f41811D = rect != null ? new Rect(rect) : null;
    }

    public void H(int i10) {
        this.f41813F.setInputMethodMode(i10);
    }

    public void I(boolean z10) {
        this.f41812E = z10;
        this.f41813F.setFocusable(z10);
    }

    public void J(PopupWindow.OnDismissListener onDismissListener) {
        this.f41813F.setOnDismissListener(onDismissListener);
    }

    public void K(AdapterView.OnItemClickListener onItemClickListener) {
        this.f41834u = onItemClickListener;
    }

    public void L(boolean z10) {
        this.f41824k = true;
        this.f41823j = z10;
    }

    public final void M(boolean z10) {
        d.b(this.f41813F, z10);
    }

    public void N(int i10) {
        this.f41830q = i10;
    }

    public void O(int i10) {
        C5330I c5330i = this.f41816c;
        if (!a() || c5330i == null) {
            return;
        }
        c5330i.setListSelectionHidden(false);
        c5330i.setSelection(i10);
        if (c5330i.getChoiceMode() != 0) {
            c5330i.setItemChecked(i10, true);
        }
    }

    public void P(int i10) {
        this.f41818e = i10;
    }

    @Override // o.InterfaceC5183f
    public boolean a() {
        return this.f41813F.isShowing();
    }

    public int b() {
        return this.f41819f;
    }

    public void d(int i10) {
        this.f41819f = i10;
    }

    @Override // o.InterfaceC5183f
    public void dismiss() {
        this.f41813F.dismiss();
        B();
        this.f41813F.setContentView(null);
        this.f41816c = null;
        this.f41809B.removeCallbacks(this.f41836w);
    }

    public Drawable f() {
        return this.f41813F.getBackground();
    }

    public void h(int i10) {
        this.f41820g = i10;
        this.f41822i = true;
    }

    public int k() {
        if (this.f41822i) {
            return this.f41820g;
        }
        return 0;
    }

    public void l(ListAdapter listAdapter) {
        DataSetObserver dataSetObserver = this.f41831r;
        if (dataSetObserver == null) {
            this.f41831r = new f();
        } else {
            ListAdapter listAdapter2 = this.f41815b;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f41815b = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f41831r);
        }
        C5330I c5330i = this.f41816c;
        if (c5330i != null) {
            c5330i.setAdapter(this.f41815b);
        }
    }

    @Override // o.InterfaceC5183f
    public ListView n() {
        return this.f41816c;
    }

    public void o(Drawable drawable) {
        this.f41813F.setBackgroundDrawable(drawable);
    }

    public final int p() {
        int measuredHeight;
        int i10;
        int iMakeMeasureSpec;
        View view;
        int i11;
        if (this.f41816c == null) {
            Context context = this.f41814a;
            this.f41808A = new a();
            C5330I c5330iR = r(context, !this.f41812E);
            this.f41816c = c5330iR;
            Drawable drawable = this.f41833t;
            if (drawable != null) {
                c5330iR.setSelector(drawable);
            }
            this.f41816c.setAdapter(this.f41815b);
            this.f41816c.setOnItemClickListener(this.f41834u);
            this.f41816c.setFocusable(true);
            this.f41816c.setFocusableInTouchMode(true);
            this.f41816c.setOnItemSelectedListener(new b());
            this.f41816c.setOnScrollListener(this.f41838y);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.f41835v;
            if (onItemSelectedListener != null) {
                this.f41816c.setOnItemSelectedListener(onItemSelectedListener);
            }
            C5330I c5330i = this.f41816c;
            View view2 = this.f41829p;
            if (view2 != null) {
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0, 1.0f);
                int i12 = this.f41830q;
                if (i12 == 0) {
                    linearLayout.addView(view2);
                    linearLayout.addView(c5330i, layoutParams);
                } else if (i12 != 1) {
                    Log.e("ListPopupWindow", "Invalid hint position " + this.f41830q);
                } else {
                    linearLayout.addView(c5330i, layoutParams);
                    linearLayout.addView(view2);
                }
                int i13 = this.f41818e;
                if (i13 >= 0) {
                    i11 = Integer.MIN_VALUE;
                } else {
                    i13 = 0;
                    i11 = 0;
                }
                view2.measure(View.MeasureSpec.makeMeasureSpec(i13, i11), 0);
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) view2.getLayoutParams();
                measuredHeight = view2.getMeasuredHeight() + layoutParams2.topMargin + layoutParams2.bottomMargin;
                view = linearLayout;
            } else {
                measuredHeight = 0;
                view = c5330i;
            }
            this.f41813F.setContentView(view);
        } else {
            View view3 = this.f41829p;
            if (view3 != null) {
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) view3.getLayoutParams();
                measuredHeight = view3.getMeasuredHeight() + layoutParams3.topMargin + layoutParams3.bottomMargin;
            } else {
                measuredHeight = 0;
            }
        }
        Drawable background = this.f41813F.getBackground();
        if (background != null) {
            background.getPadding(this.f41810C);
            Rect rect = this.f41810C;
            int i14 = rect.top;
            i10 = rect.bottom + i14;
            if (!this.f41822i) {
                this.f41820g = -i14;
            }
        } else {
            this.f41810C.setEmpty();
            i10 = 0;
        }
        int iT = t(s(), this.f41820g, this.f41813F.getInputMethodMode() == 2);
        if (this.f41826m || this.f41817d == -1) {
            return iT + i10;
        }
        int i15 = this.f41818e;
        if (i15 == -2) {
            int i16 = this.f41814a.getResources().getDisplayMetrics().widthPixels;
            Rect rect2 = this.f41810C;
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i16 - (rect2.left + rect2.right), Integer.MIN_VALUE);
        } else if (i15 != -1) {
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i15, 1073741824);
        } else {
            int i17 = this.f41814a.getResources().getDisplayMetrics().widthPixels;
            Rect rect3 = this.f41810C;
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i17 - (rect3.left + rect3.right), 1073741824);
        }
        int iD = this.f41816c.d(iMakeMeasureSpec, 0, -1, iT - measuredHeight, -1);
        if (iD > 0) {
            measuredHeight += i10 + this.f41816c.getPaddingTop() + this.f41816c.getPaddingBottom();
        }
        return iD + measuredHeight;
    }

    public void q() {
        C5330I c5330i = this.f41816c;
        if (c5330i != null) {
            c5330i.setListSelectionHidden(true);
            c5330i.requestLayout();
        }
    }

    public C5330I r(Context context, boolean z10) {
        return new C5330I(context, z10);
    }

    public View s() {
        return this.f41832s;
    }

    @Override // o.InterfaceC5183f
    public void show() {
        int iP = p();
        boolean z10 = z();
        c1.h.b(this.f41813F, this.f41821h);
        if (this.f41813F.isShowing()) {
            if (s().isAttachedToWindow()) {
                int width = this.f41818e;
                if (width == -1) {
                    width = -1;
                } else if (width == -2) {
                    width = s().getWidth();
                }
                int i10 = this.f41817d;
                if (i10 == -1) {
                    if (!z10) {
                        iP = -1;
                    }
                    if (z10) {
                        this.f41813F.setWidth(this.f41818e == -1 ? -1 : 0);
                        this.f41813F.setHeight(0);
                    } else {
                        this.f41813F.setWidth(this.f41818e == -1 ? -1 : 0);
                        this.f41813F.setHeight(-1);
                    }
                } else if (i10 != -2) {
                    iP = i10;
                }
                this.f41813F.setOutsideTouchable((this.f41827n || this.f41826m) ? false : true);
                this.f41813F.update(s(), this.f41819f, this.f41820g, width < 0 ? -1 : width, iP < 0 ? -1 : iP);
                return;
            }
            return;
        }
        int width2 = this.f41818e;
        if (width2 == -1) {
            width2 = -1;
        } else if (width2 == -2) {
            width2 = s().getWidth();
        }
        int i11 = this.f41817d;
        if (i11 == -1) {
            iP = -1;
        } else if (i11 != -2) {
            iP = i11;
        }
        this.f41813F.setWidth(width2);
        this.f41813F.setHeight(iP);
        M(true);
        this.f41813F.setOutsideTouchable((this.f41827n || this.f41826m) ? false : true);
        this.f41813F.setTouchInterceptor(this.f41837x);
        if (this.f41824k) {
            c1.h.a(this.f41813F, this.f41823j);
        }
        d.a(this.f41813F, this.f41811D);
        c1.h.c(this.f41813F, s(), this.f41819f, this.f41820g, this.f41825l);
        this.f41816c.setSelection(-1);
        if (!this.f41812E || this.f41816c.isInTouchMode()) {
            q();
        }
        if (this.f41812E) {
            return;
        }
        this.f41809B.post(this.f41839z);
    }

    public final int t(View view, int i10, boolean z10) {
        return c.a(this.f41813F, view, i10, z10);
    }

    public Object u() {
        if (a()) {
            return this.f41816c.getSelectedItem();
        }
        return null;
    }

    public long v() {
        if (a()) {
            return this.f41816c.getSelectedItemId();
        }
        return Long.MIN_VALUE;
    }

    public int w() {
        if (a()) {
            return this.f41816c.getSelectedItemPosition();
        }
        return -1;
    }

    public View x() {
        if (a()) {
            return this.f41816c.getSelectedView();
        }
        return null;
    }

    public int y() {
        return this.f41818e;
    }

    public boolean z() {
        return this.f41813F.getInputMethodMode() == 2;
    }

    public C5333L(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public C5333L(Context context, AttributeSet attributeSet, int i10, int i11) {
        this.f41817d = -2;
        this.f41818e = -2;
        this.f41821h = 1002;
        this.f41825l = 0;
        this.f41826m = false;
        this.f41827n = false;
        this.f41828o = Integer.MAX_VALUE;
        this.f41830q = 0;
        this.f41836w = new i();
        this.f41837x = new h();
        this.f41838y = new g();
        this.f41839z = new e();
        this.f41810C = new Rect();
        this.f41814a = context;
        this.f41809B = new Handler(context.getMainLooper());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, h.j.f36103l1, i10, i11);
        this.f41819f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(h.j.f36108m1, 0);
        int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(h.j.f36113n1, 0);
        this.f41820g = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f41822i = true;
        }
        typedArrayObtainStyledAttributes.recycle();
        C5357s c5357s = new C5357s(context, attributeSet, i10, i11);
        this.f41813F = c5357s;
        c5357s.setInputMethodMode(1);
    }

    /* JADX INFO: renamed from: p.L$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class b implements AdapterView.OnItemSelectedListener {
        public b() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView adapterView, View view, int i10, long j10) {
            C5330I c5330i;
            if (i10 == -1 || (c5330i = C5333L.this.f41816c) == null) {
                return;
            }
            c5330i.setListSelectionHidden(false);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    /* JADX INFO: renamed from: p.L$g */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class g implements AbsListView.OnScrollListener {
        public g() {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i10) {
            if (i10 != 1 || C5333L.this.z() || C5333L.this.f41813F.getContentView() == null) {
                return;
            }
            C5333L c5333l = C5333L.this;
            c5333l.f41809B.removeCallbacks(c5333l.f41836w);
            C5333L.this.f41836w.run();
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i10, int i11, int i12) {
        }
    }
}
