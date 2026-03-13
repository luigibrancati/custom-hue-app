package androidx.appcompat.widget;

import Y0.AbstractC2554h;
import Y0.C2561o;
import Y0.E;
import Y0.InterfaceC2558l;
import Y0.InterfaceC2563q;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.i;
import androidx.appcompat.view.menu.l;
import androidx.appcompat.widget.ActionMenuView;
import d1.AbstractC3806a;
import h.AbstractC4262a;
import h.j;
import i.AbstractC4308a;
import j.AbstractC4666a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import n.C5062g;
import n.InterfaceC5058c;
import p.C5324C;
import p.C5338Q;
import p.C5353o;
import p.C5355q;
import p.InterfaceC5328G;
import p.W;
import p.a0;
import p.c0;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class Toolbar extends ViewGroup implements InterfaceC2558l {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public ColorStateList f21807A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public boolean f21808B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public boolean f21809C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final ArrayList f21810D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final ArrayList f21811E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final int[] f21812F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final C2561o f21813G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public ArrayList f21814H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final ActionMenuView.e f21815I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public androidx.appcompat.widget.d f21816J;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public androidx.appcompat.widget.a f21817P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public f f21818Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public i.a f21819R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public e.a f21820S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public boolean f21821T;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public OnBackInvokedCallback f21822V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public OnBackInvokedDispatcher f21823W;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ActionMenuView f21824a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TextView f21825b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TextView f21826c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ImageButton f21827d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ImageView f21828e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Drawable f21829f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public CharSequence f21830g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ImageButton f21831h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public View f21832i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Context f21833j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f21834k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public boolean f21835k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f21836l;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public final Runnable f21837l0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f21838m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f21839n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f21840o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f21841p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f21842q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f21843r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f21844s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public C5338Q f21845t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f21846u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f21847v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f21848w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public CharSequence f21849x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public CharSequence f21850y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public ColorStateList f21851z;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a implements ActionMenuView.e {
        public a() {
        }

        @Override // androidx.appcompat.widget.ActionMenuView.e
        public boolean onMenuItemClick(MenuItem menuItem) {
            if (Toolbar.this.f21813G.h(menuItem)) {
                return true;
            }
            Toolbar.this.getClass();
            return false;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Toolbar.this.P();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class c implements e.a {
        public c() {
        }

        @Override // androidx.appcompat.view.menu.e.a
        public boolean a(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
            e.a aVar = Toolbar.this.f21820S;
            return aVar != null && aVar.a(eVar, menuItem);
        }

        @Override // androidx.appcompat.view.menu.e.a
        public void b(androidx.appcompat.view.menu.e eVar) {
            if (!Toolbar.this.f21824a.H()) {
                Toolbar.this.f21813G.i(eVar);
            }
            e.a aVar = Toolbar.this.f21820S;
            if (aVar != null) {
                aVar.b(eVar);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Toolbar.this.e();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class e {
        public static OnBackInvokedDispatcher a(View view) {
            return view.findOnBackInvokedDispatcher();
        }

        public static OnBackInvokedCallback b(final Runnable runnable) {
            Objects.requireNonNull(runnable);
            return new OnBackInvokedCallback() { // from class: p.Z
                public final void onBackInvoked() {
                    runnable.run();
                }
            };
        }

        public static void c(Object obj, Object obj2) {
            ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(1000000, (OnBackInvokedCallback) obj2);
        }

        public static void d(Object obj, Object obj2) {
            ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface h {
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC4262a.f35791J);
    }

    private ArrayList<MenuItem> getCurrentMenuItems() {
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        Menu menu = getMenu();
        for (int i10 = 0; i10 < menu.size(); i10++) {
            arrayList.add(menu.getItem(i10));
        }
        return arrayList;
    }

    private MenuInflater getMenuInflater() {
        return new C5062g(getContext());
    }

    public boolean A() {
        ActionMenuView actionMenuView = this.f21824a;
        return actionMenuView != null && actionMenuView.G();
    }

    public boolean B() {
        ActionMenuView actionMenuView = this.f21824a;
        return actionMenuView != null && actionMenuView.H();
    }

    public final int C(View view, int i10, int[] iArr, int i11) {
        g gVar = (g) view.getLayoutParams();
        int i12 = ((ViewGroup.MarginLayoutParams) gVar).leftMargin - iArr[0];
        int iMax = i10 + Math.max(0, i12);
        iArr[0] = Math.max(0, -i12);
        int iQ = q(view, i11);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax, iQ, iMax + measuredWidth, view.getMeasuredHeight() + iQ);
        return iMax + measuredWidth + ((ViewGroup.MarginLayoutParams) gVar).rightMargin;
    }

    public final int D(View view, int i10, int[] iArr, int i11) {
        g gVar = (g) view.getLayoutParams();
        int i12 = ((ViewGroup.MarginLayoutParams) gVar).rightMargin - iArr[1];
        int iMax = i10 - Math.max(0, i12);
        iArr[1] = Math.max(0, -i12);
        int iQ = q(view, i11);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax - measuredWidth, iQ, iMax, view.getMeasuredHeight() + iQ);
        return iMax - (measuredWidth + ((ViewGroup.MarginLayoutParams) gVar).leftMargin);
    }

    public final int E(View view, int i10, int i11, int i12, int i13, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i14 = marginLayoutParams.leftMargin - iArr[0];
        int i15 = marginLayoutParams.rightMargin - iArr[1];
        int iMax = Math.max(0, i14) + Math.max(0, i15);
        iArr[0] = Math.max(0, -i14);
        iArr[1] = Math.max(0, -i15);
        view.measure(ViewGroup.getChildMeasureSpec(i10, getPaddingLeft() + getPaddingRight() + iMax + i11, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i12, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i13, marginLayoutParams.height));
        return view.getMeasuredWidth() + iMax;
    }

    public final void F(View view, int i10, int i11, int i12, int i13, int i14) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i10, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i11, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i12, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i13, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i14 >= 0) {
            if (mode != 0) {
                i14 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i14);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i14, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    public final void G() {
        Menu menu = getMenu();
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        this.f21813G.f(menu, getMenuInflater());
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.f21814H = currentMenuItems2;
    }

    public final void H() {
        removeCallbacks(this.f21837l0);
        post(this.f21837l0);
    }

    public void I() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (((g) childAt.getLayoutParams()).f21859b != 2 && childAt != this.f21824a) {
                removeViewAt(childCount);
                this.f21811E.add(childAt);
            }
        }
    }

    public void J(int i10, int i11) {
        h();
        this.f21845t.g(i10, i11);
    }

    public void K(androidx.appcompat.view.menu.e eVar, androidx.appcompat.widget.a aVar) {
        if (eVar == null && this.f21824a == null) {
            return;
        }
        k();
        androidx.appcompat.view.menu.e eVarL = this.f21824a.L();
        if (eVarL == eVar) {
            return;
        }
        if (eVarL != null) {
            eVarL.P(this.f21817P);
            eVarL.P(this.f21818Q);
        }
        if (this.f21818Q == null) {
            this.f21818Q = new f();
        }
        aVar.G(true);
        if (eVar != null) {
            eVar.c(aVar, this.f21833j);
            eVar.c(this.f21818Q, this.f21833j);
        } else {
            aVar.i(this.f21833j, null);
            this.f21818Q.i(this.f21833j, null);
            aVar.f(true);
            this.f21818Q.f(true);
        }
        this.f21824a.setPopupTheme(this.f21834k);
        this.f21824a.setPresenter(aVar);
        this.f21817P = aVar;
        Q();
    }

    public void L(Context context, int i10) {
        this.f21838m = i10;
        TextView textView = this.f21826c;
        if (textView != null) {
            textView.setTextAppearance(context, i10);
        }
    }

    public void M(Context context, int i10) {
        this.f21836l = i10;
        TextView textView = this.f21825b;
        if (textView != null) {
            textView.setTextAppearance(context, i10);
        }
    }

    public final boolean N() {
        if (!this.f21821T) {
            return false;
        }
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (O(childAt) && childAt.getMeasuredWidth() > 0 && childAt.getMeasuredHeight() > 0) {
                return false;
            }
        }
        return true;
    }

    public final boolean O(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    public boolean P() {
        ActionMenuView actionMenuView = this.f21824a;
        return actionMenuView != null && actionMenuView.N();
    }

    public void Q() {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher onBackInvokedDispatcherA = e.a(this);
            boolean z10 = v() && onBackInvokedDispatcherA != null && isAttachedToWindow() && this.f21835k0;
            if (z10 && this.f21823W == null) {
                if (this.f21822V == null) {
                    this.f21822V = e.b(new Runnable() { // from class: p.X
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f41893a.e();
                        }
                    });
                }
                e.c(onBackInvokedDispatcherA, this.f21822V);
                this.f21823W = onBackInvokedDispatcherA;
                return;
            }
            if (z10 || (onBackInvokedDispatcher = this.f21823W) == null) {
                return;
            }
            e.d(onBackInvokedDispatcher, this.f21822V);
            this.f21823W = null;
        }
    }

    public void a() {
        for (int size = this.f21811E.size() - 1; size >= 0; size--) {
            addView((View) this.f21811E.get(size));
        }
        this.f21811E.clear();
    }

    @Override // Y0.InterfaceC2558l
    public void addMenuProvider(InterfaceC2563q interfaceC2563q) {
        this.f21813G.c(interfaceC2563q);
    }

    public final void b(List list, int i10) {
        boolean z10 = getLayoutDirection() == 1;
        int childCount = getChildCount();
        int iB = AbstractC2554h.b(i10, getLayoutDirection());
        list.clear();
        if (!z10) {
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = getChildAt(i11);
                g gVar = (g) childAt.getLayoutParams();
                if (gVar.f21859b == 0 && O(childAt) && p(gVar.f36620a) == iB) {
                    list.add(childAt);
                }
            }
            return;
        }
        for (int i12 = childCount - 1; i12 >= 0; i12--) {
            View childAt2 = getChildAt(i12);
            g gVar2 = (g) childAt2.getLayoutParams();
            if (gVar2.f21859b == 0 && O(childAt2) && p(gVar2.f36620a) == iB) {
                list.add(childAt2);
            }
        }
    }

    public final void c(View view, boolean z10) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        g gVarGenerateDefaultLayoutParams = layoutParams == null ? generateDefaultLayoutParams() : !checkLayoutParams(layoutParams) ? generateLayoutParams(layoutParams) : (g) layoutParams;
        gVarGenerateDefaultLayoutParams.f21859b = 1;
        if (!z10 || this.f21832i == null) {
            addView(view, gVarGenerateDefaultLayoutParams);
        } else {
            view.setLayoutParams(gVarGenerateDefaultLayoutParams);
            this.f21811E.add(view);
        }
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof g);
    }

    public boolean d() {
        ActionMenuView actionMenuView;
        return getVisibility() == 0 && (actionMenuView = this.f21824a) != null && actionMenuView.I();
    }

    public void e() {
        f fVar = this.f21818Q;
        androidx.appcompat.view.menu.g gVar = fVar == null ? null : fVar.f21857b;
        if (gVar != null) {
            gVar.collapseActionView();
        }
    }

    public void f() {
        ActionMenuView actionMenuView = this.f21824a;
        if (actionMenuView != null) {
            actionMenuView.z();
        }
    }

    public void g() {
        if (this.f21831h == null) {
            C5353o c5353o = new C5353o(getContext(), null, AbstractC4262a.f35790I);
            this.f21831h = c5353o;
            c5353o.setImageDrawable(this.f21829f);
            this.f21831h.setContentDescription(this.f21830g);
            g gVarGenerateDefaultLayoutParams = generateDefaultLayoutParams();
            gVarGenerateDefaultLayoutParams.f36620a = (this.f21839n & 112) | 8388611;
            gVarGenerateDefaultLayoutParams.f21859b = 2;
            this.f21831h.setLayoutParams(gVarGenerateDefaultLayoutParams);
            this.f21831h.setOnClickListener(new d());
        }
    }

    public CharSequence getCollapseContentDescription() {
        ImageButton imageButton = this.f21831h;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        ImageButton imageButton = this.f21831h;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        C5338Q c5338q = this.f21845t;
        if (c5338q != null) {
            return c5338q.a();
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i10 = this.f21847v;
        return i10 != Integer.MIN_VALUE ? i10 : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        C5338Q c5338q = this.f21845t;
        if (c5338q != null) {
            return c5338q.b();
        }
        return 0;
    }

    public int getContentInsetRight() {
        C5338Q c5338q = this.f21845t;
        if (c5338q != null) {
            return c5338q.c();
        }
        return 0;
    }

    public int getContentInsetStart() {
        C5338Q c5338q = this.f21845t;
        if (c5338q != null) {
            return c5338q.d();
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i10 = this.f21846u;
        return i10 != Integer.MIN_VALUE ? i10 : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        androidx.appcompat.view.menu.e eVarL;
        ActionMenuView actionMenuView = this.f21824a;
        return (actionMenuView == null || (eVarL = actionMenuView.L()) == null || !eVarL.hasVisibleItems()) ? getContentInsetEnd() : Math.max(getContentInsetEnd(), Math.max(this.f21847v, 0));
    }

    public int getCurrentContentInsetLeft() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.f21846u, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        ImageView imageView = this.f21828e;
        if (imageView != null) {
            return imageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        ImageView imageView = this.f21828e;
        if (imageView != null) {
            return imageView.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        j();
        return this.f21824a.getMenu();
    }

    public View getNavButtonView() {
        return this.f21827d;
    }

    public CharSequence getNavigationContentDescription() {
        ImageButton imageButton = this.f21827d;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        ImageButton imageButton = this.f21827d;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public androidx.appcompat.widget.a getOuterActionMenuPresenter() {
        return this.f21817P;
    }

    public Drawable getOverflowIcon() {
        j();
        return this.f21824a.getOverflowIcon();
    }

    public Context getPopupContext() {
        return this.f21833j;
    }

    public int getPopupTheme() {
        return this.f21834k;
    }

    public CharSequence getSubtitle() {
        return this.f21850y;
    }

    public final TextView getSubtitleTextView() {
        return this.f21826c;
    }

    public CharSequence getTitle() {
        return this.f21849x;
    }

    public int getTitleMarginBottom() {
        return this.f21844s;
    }

    public int getTitleMarginEnd() {
        return this.f21842q;
    }

    public int getTitleMarginStart() {
        return this.f21841p;
    }

    public int getTitleMarginTop() {
        return this.f21843r;
    }

    public final TextView getTitleTextView() {
        return this.f21825b;
    }

    public InterfaceC5328G getWrapper() {
        if (this.f21816J == null) {
            this.f21816J = new androidx.appcompat.widget.d(this, true);
        }
        return this.f21816J;
    }

    public final void h() {
        if (this.f21845t == null) {
            this.f21845t = new C5338Q();
        }
    }

    public final void i() {
        if (this.f21828e == null) {
            this.f21828e = new C5355q(getContext());
        }
    }

    public final void j() {
        k();
        if (this.f21824a.L() == null) {
            androidx.appcompat.view.menu.e eVar = (androidx.appcompat.view.menu.e) this.f21824a.getMenu();
            if (this.f21818Q == null) {
                this.f21818Q = new f();
            }
            this.f21824a.setExpandedActionViewsExclusive(true);
            eVar.c(this.f21818Q, this.f21833j);
            Q();
        }
    }

    public final void k() {
        if (this.f21824a == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext());
            this.f21824a = actionMenuView;
            actionMenuView.setPopupTheme(this.f21834k);
            this.f21824a.setOnMenuItemClickListener(this.f21815I);
            this.f21824a.M(this.f21819R, new c());
            g gVarGenerateDefaultLayoutParams = generateDefaultLayoutParams();
            gVarGenerateDefaultLayoutParams.f36620a = (this.f21839n & 112) | 8388613;
            this.f21824a.setLayoutParams(gVarGenerateDefaultLayoutParams);
            c(this.f21824a, false);
        }
    }

    public final void l() {
        if (this.f21827d == null) {
            this.f21827d = new C5353o(getContext(), null, AbstractC4262a.f35790I);
            g gVarGenerateDefaultLayoutParams = generateDefaultLayoutParams();
            gVarGenerateDefaultLayoutParams.f36620a = (this.f21839n & 112) | 8388611;
            this.f21827d.setLayoutParams(gVarGenerateDefaultLayoutParams);
        }
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public g generateDefaultLayoutParams() {
        return new g(-2, -2);
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public g generateLayoutParams(AttributeSet attributeSet) {
        return new g(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public g generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof g ? new g((g) layoutParams) : layoutParams instanceof AbstractC4308a.C0477a ? new g((AbstractC4308a.C0477a) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new g((ViewGroup.MarginLayoutParams) layoutParams) : new g(layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Q();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f21837l0);
        Q();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f21809C = false;
        }
        if (!this.f21809C) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.f21809C = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f21809C = false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0297 A[LOOP:0: B:104:0x0295->B:105:0x0297, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02b5 A[LOOP:1: B:107:0x02b3->B:108:0x02b5, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02ec A[LOOP:2: B:116:0x02ea->B:117:0x02ec, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x021e  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onLayout(boolean r20, int r21, int r22, int r23, int r24) {
        /*
            Method dump skipped, instruction units count: 769
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        int measuredWidth;
        int iMax;
        int iCombineMeasuredStates;
        int measuredWidth2;
        int[] iArr;
        int iMax2;
        int iCombineMeasuredStates2;
        int measuredHeight;
        int[] iArr2 = this.f21812F;
        boolean zB = c0.b(this);
        int i12 = !zB ? 1 : 0;
        if (O(this.f21827d)) {
            F(this.f21827d, i10, 0, i11, 0, this.f21840o);
            measuredWidth = this.f21827d.getMeasuredWidth() + s(this.f21827d);
            iMax = Math.max(0, this.f21827d.getMeasuredHeight() + t(this.f21827d));
            iCombineMeasuredStates = View.combineMeasuredStates(0, this.f21827d.getMeasuredState());
        } else {
            measuredWidth = 0;
            iMax = 0;
            iCombineMeasuredStates = 0;
        }
        if (O(this.f21831h)) {
            F(this.f21831h, i10, 0, i11, 0, this.f21840o);
            measuredWidth = this.f21831h.getMeasuredWidth() + s(this.f21831h);
            iMax = Math.max(iMax, this.f21831h.getMeasuredHeight() + t(this.f21831h));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f21831h.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int iMax3 = Math.max(currentContentInsetStart, measuredWidth);
        iArr2[zB ? 1 : 0] = Math.max(0, currentContentInsetStart - measuredWidth);
        if (O(this.f21824a)) {
            F(this.f21824a, i10, iMax3, i11, 0, this.f21840o);
            measuredWidth2 = this.f21824a.getMeasuredWidth() + s(this.f21824a);
            iMax = Math.max(iMax, this.f21824a.getMeasuredHeight() + t(this.f21824a));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f21824a.getMeasuredState());
        } else {
            measuredWidth2 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int iMax4 = iMax3 + Math.max(currentContentInsetEnd, measuredWidth2);
        iArr2[i12] = Math.max(0, currentContentInsetEnd - measuredWidth2);
        if (O(this.f21832i)) {
            iArr = iArr2;
            iMax4 += E(this.f21832i, i10, iMax4, i11, 0, iArr);
            iMax = Math.max(iMax, this.f21832i.getMeasuredHeight() + t(this.f21832i));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f21832i.getMeasuredState());
        } else {
            iArr = iArr2;
        }
        if (O(this.f21828e)) {
            iMax4 += E(this.f21828e, i10, iMax4, i11, 0, iArr);
            iMax = Math.max(iMax, this.f21828e.getMeasuredHeight() + t(this.f21828e));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f21828e.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (((g) childAt.getLayoutParams()).f21859b == 0 && O(childAt)) {
                iMax4 += E(childAt, i10, iMax4, i11, 0, iArr);
                int iMax5 = Math.max(iMax, childAt.getMeasuredHeight() + t(childAt));
                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, childAt.getMeasuredState());
                iMax = iMax5;
            } else {
                iMax4 = iMax4;
            }
        }
        int i14 = iMax4;
        int i15 = this.f21843r + this.f21844s;
        int i16 = this.f21841p + this.f21842q;
        if (O(this.f21825b)) {
            E(this.f21825b, i10, i14 + i16, i11, i15, iArr);
            int measuredWidth3 = this.f21825b.getMeasuredWidth() + s(this.f21825b);
            int measuredHeight2 = this.f21825b.getMeasuredHeight() + t(this.f21825b);
            iMax2 = measuredWidth3;
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.f21825b.getMeasuredState());
            measuredHeight = measuredHeight2;
        } else {
            iMax2 = 0;
            iCombineMeasuredStates2 = iCombineMeasuredStates;
            measuredHeight = 0;
        }
        if (O(this.f21826c)) {
            iMax2 = Math.max(iMax2, E(this.f21826c, i10, i14 + i16, i11, i15 + measuredHeight, iArr));
            measuredHeight += this.f21826c.getMeasuredHeight() + t(this.f21826c);
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, this.f21826c.getMeasuredState());
        }
        setMeasuredDimension(View.resolveSizeAndState(Math.max(i14 + iMax2 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i10, (-16777216) & iCombineMeasuredStates2), N() ? 0 : View.resolveSizeAndState(Math.max(Math.max(iMax, measuredHeight) + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i11, iCombineMeasuredStates2 << 16));
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem menuItemFindItem;
        if (!(parcelable instanceof i)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        i iVar = (i) parcelable;
        super.onRestoreInstanceState(iVar.a());
        ActionMenuView actionMenuView = this.f21824a;
        androidx.appcompat.view.menu.e eVarL = actionMenuView != null ? actionMenuView.L() : null;
        int i10 = iVar.f21860c;
        if (i10 != 0 && this.f21818Q != null && eVarL != null && (menuItemFindItem = eVarL.findItem(i10)) != null) {
            menuItemFindItem.expandActionView();
        }
        if (iVar.f21861d) {
            H();
        }
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i10) {
        super.onRtlPropertiesChanged(i10);
        h();
        this.f21845t.f(i10 == 1);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        androidx.appcompat.view.menu.g gVar;
        i iVar = new i(super.onSaveInstanceState());
        f fVar = this.f21818Q;
        if (fVar != null && (gVar = fVar.f21857b) != null) {
            iVar.f21860c = gVar.getItemId();
        }
        iVar.f21861d = B();
        return iVar;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f21808B = false;
        }
        if (!this.f21808B) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.f21808B = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f21808B = false;
        }
        return true;
    }

    public final int p(int i10) {
        int layoutDirection = getLayoutDirection();
        int iB = AbstractC2554h.b(i10, layoutDirection) & 7;
        return (iB == 1 || iB == 3 || iB == 5) ? iB : layoutDirection == 1 ? 5 : 3;
    }

    public final int q(View view, int i10) {
        g gVar = (g) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i11 = i10 > 0 ? (measuredHeight - i10) / 2 : 0;
        int iR = r(gVar.f36620a);
        if (iR == 48) {
            return getPaddingTop() - i11;
        }
        if (iR == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) gVar).bottomMargin) - i11;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int iMax = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i12 = ((ViewGroup.MarginLayoutParams) gVar).topMargin;
        if (iMax < i12) {
            iMax = i12;
        } else {
            int i13 = (((height - paddingBottom) - measuredHeight) - iMax) - paddingTop;
            int i14 = ((ViewGroup.MarginLayoutParams) gVar).bottomMargin;
            if (i13 < i14) {
                iMax = Math.max(0, iMax - (i14 - i13));
            }
        }
        return paddingTop + iMax;
    }

    public final int r(int i10) {
        int i11 = i10 & 112;
        return (i11 == 16 || i11 == 48 || i11 == 80) ? i11 : this.f21848w & 112;
    }

    @Override // Y0.InterfaceC2558l
    public void removeMenuProvider(InterfaceC2563q interfaceC2563q) {
        this.f21813G.j(interfaceC2563q);
    }

    public final int s(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.getMarginStart() + marginLayoutParams.getMarginEnd();
    }

    public void setBackInvokedCallbackEnabled(boolean z10) {
        if (this.f21835k0 != z10) {
            this.f21835k0 = z10;
            Q();
        }
    }

    public void setCollapseContentDescription(int i10) {
        setCollapseContentDescription(i10 != 0 ? getContext().getText(i10) : null);
    }

    public void setCollapseIcon(int i10) {
        setCollapseIcon(AbstractC4666a.b(getContext(), i10));
    }

    public void setCollapsible(boolean z10) {
        this.f21821T = z10;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i10) {
        if (i10 < 0) {
            i10 = Integer.MIN_VALUE;
        }
        if (i10 != this.f21847v) {
            this.f21847v = i10;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i10) {
        if (i10 < 0) {
            i10 = Integer.MIN_VALUE;
        }
        if (i10 != this.f21846u) {
            this.f21846u = i10;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i10) {
        setLogo(AbstractC4666a.b(getContext(), i10));
    }

    public void setLogoDescription(int i10) {
        setLogoDescription(getContext().getText(i10));
    }

    public void setNavigationContentDescription(int i10) {
        setNavigationContentDescription(i10 != 0 ? getContext().getText(i10) : null);
    }

    public void setNavigationIcon(int i10) {
        setNavigationIcon(AbstractC4666a.b(getContext(), i10));
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        l();
        this.f21827d.setOnClickListener(onClickListener);
    }

    public void setOverflowIcon(Drawable drawable) {
        j();
        this.f21824a.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i10) {
        if (this.f21834k != i10) {
            this.f21834k = i10;
            if (i10 == 0) {
                this.f21833j = getContext();
            } else {
                this.f21833j = new ContextThemeWrapper(getContext(), i10);
            }
        }
    }

    public void setSubtitle(int i10) {
        setSubtitle(getContext().getText(i10));
    }

    public void setSubtitleTextColor(int i10) {
        setSubtitleTextColor(ColorStateList.valueOf(i10));
    }

    public void setTitle(int i10) {
        setTitle(getContext().getText(i10));
    }

    public void setTitleMarginBottom(int i10) {
        this.f21844s = i10;
        requestLayout();
    }

    public void setTitleMarginEnd(int i10) {
        this.f21842q = i10;
        requestLayout();
    }

    public void setTitleMarginStart(int i10) {
        this.f21841p = i10;
        requestLayout();
    }

    public void setTitleMarginTop(int i10) {
        this.f21843r = i10;
        requestLayout();
    }

    public void setTitleTextColor(int i10) {
        setTitleTextColor(ColorStateList.valueOf(i10));
    }

    public final int t(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    public final int u(List list, int[] iArr) {
        int i10 = iArr[0];
        int i11 = iArr[1];
        int size = list.size();
        int i12 = 0;
        int measuredWidth = 0;
        while (i12 < size) {
            View view = (View) list.get(i12);
            g gVar = (g) view.getLayoutParams();
            int i13 = ((ViewGroup.MarginLayoutParams) gVar).leftMargin - i10;
            int i14 = ((ViewGroup.MarginLayoutParams) gVar).rightMargin - i11;
            int iMax = Math.max(0, i13);
            int iMax2 = Math.max(0, i14);
            int iMax3 = Math.max(0, -i13);
            int iMax4 = Math.max(0, -i14);
            measuredWidth += iMax + view.getMeasuredWidth() + iMax2;
            i12++;
            i11 = iMax4;
            i10 = iMax3;
        }
        return measuredWidth;
    }

    public boolean v() {
        f fVar = this.f21818Q;
        return (fVar == null || fVar.f21857b == null) ? false : true;
    }

    public boolean w() {
        ActionMenuView actionMenuView = this.f21824a;
        return actionMenuView != null && actionMenuView.F();
    }

    public void x(int i10) {
        getMenuInflater().inflate(i10, getMenu());
    }

    public void y() {
        Iterator it = this.f21814H.iterator();
        while (it.hasNext()) {
            getMenu().removeItem(((MenuItem) it.next()).getItemId());
        }
        G();
    }

    public final boolean z(View view) {
        return view.getParent() == this || this.f21811E.contains(view);
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class g extends AbstractC4308a.C0477a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f21859b;

        public g(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f21859b = 0;
        }

        public void a(ViewGroup.MarginLayoutParams marginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) this).leftMargin = marginLayoutParams.leftMargin;
            ((ViewGroup.MarginLayoutParams) this).topMargin = marginLayoutParams.topMargin;
            ((ViewGroup.MarginLayoutParams) this).rightMargin = marginLayoutParams.rightMargin;
            ((ViewGroup.MarginLayoutParams) this).bottomMargin = marginLayoutParams.bottomMargin;
        }

        public g(int i10, int i11) {
            super(i10, i11);
            this.f21859b = 0;
            this.f36620a = 8388627;
        }

        public g(g gVar) {
            super((AbstractC4308a.C0477a) gVar);
            this.f21859b = 0;
            this.f21859b = gVar.f21859b;
        }

        public g(AbstractC4308a.C0477a c0477a) {
            super(c0477a);
            this.f21859b = 0;
        }

        public g(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f21859b = 0;
            a(marginLayoutParams);
        }

        public g(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f21859b = 0;
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f21848w = 8388627;
        this.f21810D = new ArrayList();
        this.f21811E = new ArrayList();
        this.f21812F = new int[2];
        this.f21813G = new C2561o(new Runnable() { // from class: p.Y
            @Override // java.lang.Runnable
            public final void run() {
                this.f41894a.y();
            }
        });
        this.f21814H = new ArrayList();
        this.f21815I = new a();
        this.f21837l0 = new b();
        W wV = W.v(getContext(), attributeSet, j.f35993M2, i10, 0);
        E.d0(this, context, j.f35993M2, attributeSet, wV.r(), i10, 0);
        this.f21836l = wV.n(j.f36120o3, 0);
        this.f21838m = wV.n(j.f36075f3, 0);
        this.f21848w = wV.l(j.f35997N2, this.f21848w);
        this.f21839n = wV.l(j.f36001O2, 48);
        int iE = wV.e(j.f36090i3, 0);
        iE = wV.s(j.f36115n3) ? wV.e(j.f36115n3, iE) : iE;
        this.f21844s = iE;
        this.f21843r = iE;
        this.f21842q = iE;
        this.f21841p = iE;
        int iE2 = wV.e(j.f36105l3, -1);
        if (iE2 >= 0) {
            this.f21841p = iE2;
        }
        int iE3 = wV.e(j.f36100k3, -1);
        if (iE3 >= 0) {
            this.f21842q = iE3;
        }
        int iE4 = wV.e(j.f36110m3, -1);
        if (iE4 >= 0) {
            this.f21843r = iE4;
        }
        int iE5 = wV.e(j.f36095j3, -1);
        if (iE5 >= 0) {
            this.f21844s = iE5;
        }
        this.f21840o = wV.f(j.f36045Z2, -1);
        int iE6 = wV.e(j.f36029V2, Integer.MIN_VALUE);
        int iE7 = wV.e(j.f36013R2, Integer.MIN_VALUE);
        int iF = wV.f(j.f36021T2, 0);
        int iF2 = wV.f(j.f36025U2, 0);
        h();
        this.f21845t.e(iF, iF2);
        if (iE6 != Integer.MIN_VALUE || iE7 != Integer.MIN_VALUE) {
            this.f21845t.g(iE6, iE7);
        }
        this.f21846u = wV.e(j.f36033W2, Integer.MIN_VALUE);
        this.f21847v = wV.e(j.f36017S2, Integer.MIN_VALUE);
        this.f21829f = wV.g(j.f36009Q2);
        this.f21830g = wV.p(j.f36005P2);
        CharSequence charSequenceP = wV.p(j.f36085h3);
        if (!TextUtils.isEmpty(charSequenceP)) {
            setTitle(charSequenceP);
        }
        CharSequence charSequenceP2 = wV.p(j.f36070e3);
        if (!TextUtils.isEmpty(charSequenceP2)) {
            setSubtitle(charSequenceP2);
        }
        this.f21833j = getContext();
        setPopupTheme(wV.n(j.f36065d3, 0));
        Drawable drawableG = wV.g(j.f36060c3);
        if (drawableG != null) {
            setNavigationIcon(drawableG);
        }
        CharSequence charSequenceP3 = wV.p(j.f36055b3);
        if (!TextUtils.isEmpty(charSequenceP3)) {
            setNavigationContentDescription(charSequenceP3);
        }
        Drawable drawableG2 = wV.g(j.f36037X2);
        if (drawableG2 != null) {
            setLogo(drawableG2);
        }
        CharSequence charSequenceP4 = wV.p(j.f36041Y2);
        if (!TextUtils.isEmpty(charSequenceP4)) {
            setLogoDescription(charSequenceP4);
        }
        if (wV.s(j.f36125p3)) {
            setTitleTextColor(wV.c(j.f36125p3));
        }
        if (wV.s(j.f36080g3)) {
            setSubtitleTextColor(wV.c(j.f36080g3));
        }
        if (wV.s(j.f36050a3)) {
            x(wV.n(j.f36050a3, 0));
        }
        wV.x();
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            g();
        }
        ImageButton imageButton = this.f21831h;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            g();
            this.f21831h.setImageDrawable(drawable);
        } else {
            ImageButton imageButton = this.f21831h;
            if (imageButton != null) {
                imageButton.setImageDrawable(this.f21829f);
            }
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            i();
            if (!z(this.f21828e)) {
                c(this.f21828e, true);
            }
        } else {
            ImageView imageView = this.f21828e;
            if (imageView != null && z(imageView)) {
                removeView(this.f21828e);
                this.f21811E.remove(this.f21828e);
            }
        }
        ImageView imageView2 = this.f21828e;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            i();
        }
        ImageView imageView = this.f21828e;
        if (imageView != null) {
            imageView.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            l();
        }
        ImageButton imageButton = this.f21827d;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
            a0.a(this.f21827d, charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            l();
            if (!z(this.f21827d)) {
                c(this.f21827d, true);
            }
        } else {
            ImageButton imageButton = this.f21827d;
            if (imageButton != null && z(imageButton)) {
                removeView(this.f21827d);
                this.f21811E.remove(this.f21827d);
            }
        }
        ImageButton imageButton2 = this.f21827d;
        if (imageButton2 != null) {
            imageButton2.setImageDrawable(drawable);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            TextView textView = this.f21826c;
            if (textView != null && z(textView)) {
                removeView(this.f21826c);
                this.f21811E.remove(this.f21826c);
            }
        } else {
            if (this.f21826c == null) {
                Context context = getContext();
                C5324C c5324c = new C5324C(context);
                this.f21826c = c5324c;
                c5324c.setSingleLine();
                this.f21826c.setEllipsize(TextUtils.TruncateAt.END);
                int i10 = this.f21838m;
                if (i10 != 0) {
                    this.f21826c.setTextAppearance(context, i10);
                }
                ColorStateList colorStateList = this.f21807A;
                if (colorStateList != null) {
                    this.f21826c.setTextColor(colorStateList);
                }
            }
            if (!z(this.f21826c)) {
                c(this.f21826c, true);
            }
        }
        TextView textView2 = this.f21826c;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.f21850y = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.f21807A = colorStateList;
        TextView textView = this.f21826c;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            TextView textView = this.f21825b;
            if (textView != null && z(textView)) {
                removeView(this.f21825b);
                this.f21811E.remove(this.f21825b);
            }
        } else {
            if (this.f21825b == null) {
                Context context = getContext();
                C5324C c5324c = new C5324C(context);
                this.f21825b = c5324c;
                c5324c.setSingleLine();
                this.f21825b.setEllipsize(TextUtils.TruncateAt.END);
                int i10 = this.f21836l;
                if (i10 != 0) {
                    this.f21825b.setTextAppearance(context, i10);
                }
                ColorStateList colorStateList = this.f21851z;
                if (colorStateList != null) {
                    this.f21825b.setTextColor(colorStateList);
                }
            }
            if (!z(this.f21825b)) {
                c(this.f21825b, true);
            }
        }
        TextView textView2 = this.f21825b;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.f21849x = charSequence;
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.f21851z = colorStateList;
        TextView textView = this.f21825b;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class i extends AbstractC3806a {
        public static final Parcelable.Creator<i> CREATOR = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f21860c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f21861d;

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public class a implements Parcelable.ClassLoaderCreator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public i createFromParcel(Parcel parcel) {
                return new i(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public i createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new i(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public i[] newArray(int i10) {
                return new i[i10];
            }
        }

        public i(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f21860c = parcel.readInt();
            this.f21861d = parcel.readInt() != 0;
        }

        @Override // d1.AbstractC3806a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f21860c);
            parcel.writeInt(this.f21861d ? 1 : 0);
        }

        public i(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public void setOnMenuItemClickListener(h hVar) {
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class f implements androidx.appcompat.view.menu.i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public androidx.appcompat.view.menu.e f21856a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public androidx.appcompat.view.menu.g f21857b;

        public f() {
        }

        @Override // androidx.appcompat.view.menu.i
        public boolean c(androidx.appcompat.view.menu.e eVar, androidx.appcompat.view.menu.g gVar) {
            Toolbar.this.g();
            ViewParent parent = Toolbar.this.f21831h.getParent();
            Toolbar toolbar = Toolbar.this;
            if (parent != toolbar) {
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(toolbar.f21831h);
                }
                Toolbar toolbar2 = Toolbar.this;
                toolbar2.addView(toolbar2.f21831h);
            }
            Toolbar.this.f21832i = gVar.getActionView();
            this.f21857b = gVar;
            ViewParent parent2 = Toolbar.this.f21832i.getParent();
            Toolbar toolbar3 = Toolbar.this;
            if (parent2 != toolbar3) {
                if (parent2 instanceof ViewGroup) {
                    ((ViewGroup) parent2).removeView(toolbar3.f21832i);
                }
                g gVarGenerateDefaultLayoutParams = Toolbar.this.generateDefaultLayoutParams();
                Toolbar toolbar4 = Toolbar.this;
                gVarGenerateDefaultLayoutParams.f36620a = (toolbar4.f21839n & 112) | 8388611;
                gVarGenerateDefaultLayoutParams.f21859b = 2;
                toolbar4.f21832i.setLayoutParams(gVarGenerateDefaultLayoutParams);
                Toolbar toolbar5 = Toolbar.this;
                toolbar5.addView(toolbar5.f21832i);
            }
            Toolbar.this.I();
            Toolbar.this.requestLayout();
            gVar.r(true);
            KeyEvent.Callback callback = Toolbar.this.f21832i;
            if (callback instanceof InterfaceC5058c) {
                ((InterfaceC5058c) callback).onActionViewExpanded();
            }
            Toolbar.this.Q();
            return true;
        }

        @Override // androidx.appcompat.view.menu.i
        public boolean e(l lVar) {
            return false;
        }

        @Override // androidx.appcompat.view.menu.i
        public void f(boolean z10) {
            if (this.f21857b != null) {
                androidx.appcompat.view.menu.e eVar = this.f21856a;
                if (eVar != null) {
                    int size = eVar.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        if (this.f21856a.getItem(i10) == this.f21857b) {
                            return;
                        }
                    }
                }
                h(this.f21856a, this.f21857b);
            }
        }

        @Override // androidx.appcompat.view.menu.i
        public boolean g() {
            return false;
        }

        @Override // androidx.appcompat.view.menu.i
        public boolean h(androidx.appcompat.view.menu.e eVar, androidx.appcompat.view.menu.g gVar) {
            KeyEvent.Callback callback = Toolbar.this.f21832i;
            if (callback instanceof InterfaceC5058c) {
                ((InterfaceC5058c) callback).onActionViewCollapsed();
            }
            Toolbar toolbar = Toolbar.this;
            toolbar.removeView(toolbar.f21832i);
            Toolbar toolbar2 = Toolbar.this;
            toolbar2.removeView(toolbar2.f21831h);
            Toolbar toolbar3 = Toolbar.this;
            toolbar3.f21832i = null;
            toolbar3.a();
            this.f21857b = null;
            Toolbar.this.requestLayout();
            gVar.r(false);
            Toolbar.this.Q();
            return true;
        }

        @Override // androidx.appcompat.view.menu.i
        public void i(Context context, androidx.appcompat.view.menu.e eVar) {
            androidx.appcompat.view.menu.g gVar;
            androidx.appcompat.view.menu.e eVar2 = this.f21856a;
            if (eVar2 != null && (gVar = this.f21857b) != null) {
                eVar2.f(gVar);
            }
            this.f21856a = eVar;
        }

        @Override // androidx.appcompat.view.menu.i
        public void b(androidx.appcompat.view.menu.e eVar, boolean z10) {
        }
    }
}
